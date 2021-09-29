package com.example.nayami.app;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.nayami.common.Category;
import com.example.nayami.common.Desire;
import com.example.nayami.entity.Contents;
import com.example.nayami.service.ContentsService;

@Controller
@RequestMapping("/contents")
public class ContentsController {

	private final ContentsService contentsService;

	@Autowired
	public ContentsController(ContentsService contentsService) {
		this.contentsService = contentsService;
	}

	final static Map<String, String> SELECT_ITEMS_CATEGORY = Collections.unmodifiableMap(new LinkedHashMap<String, String>() {
		private static final long serialVersionUID = 1L;

		{

			for (Category category : Category.values()) {
				put(category.name(), category.getString());
			}
		}
	});

	final static Map<String, String> SELECT_ITEMS_DESIRE = Collections.unmodifiableMap(new LinkedHashMap<String, String>() {
		private static final long serialVersionUID = 1L;

		{

			for (Desire desire : Desire.values()) {
				put(desire.name(), desire.getString());
			}
		}
	});

	
	@GetMapping
	public String index(Model model) {
		List<Contents> list = contentsService.getAll();

		model.addAttribute("contentsList", list);
		model.addAttribute("title", "一覧");

		return "contents/index_boot";

	}

	@GetMapping("/create")
	public String create(ContentsForm contentsForm, Model model) {
		model.addAttribute("title", "新規作成");
	    model.addAttribute("selectItemsCategory", SELECT_ITEMS_CATEGORY);
	    model.addAttribute("selectItemsDesire", SELECT_ITEMS_DESIRE);
		model.addAttribute("updateFlag", false);
		return "contents/create_boot";
	}
	
	@PostMapping("/complete")
	public String complete(@Validated ContentsForm contentsForm, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("title", "新規作成");
			model.addAttribute("selectItemsCategory", SELECT_ITEMS_CATEGORY);
			model.addAttribute("selectItemsDesire", SELECT_ITEMS_DESIRE);
			return "contents/create_boot";
		}		
		Contents contents = new Contents();

		contents.setContent(contentsForm.getContent());
		contents.setCause(contentsForm.getCause());
		contents.setCategory(contentsForm.getCategory());
		contents.setDesire(contentsForm.getDesire());
		contentsService.create(contents);
		return "redirect:/contents";
	}

	@PostMapping("/complete/{id}")
	public String complete(@Validated ContentsForm contentsForm, BindingResult result,
			Model model, @PathVariable int id) {
		if (result.hasErrors()) {
			model.addAttribute("title", "編集");
			model.addAttribute("selectItemsCategory", SELECT_ITEMS_CATEGORY);
			model.addAttribute("selectItemsDesire", SELECT_ITEMS_DESIRE);
			return "contents/edit_boot";
		}		
		Contents contents = new Contents();

		contents.setId(id);
		contents.setContent(contentsForm.getContent());
		contents.setCause(contentsForm.getCause());
		contents.setCategory(contentsForm.getCategory());
		contents.setDesire(contentsForm.getDesire());
		contentsService.update(contents);
		return "redirect:/contents";
	}

	
	@PostMapping("/edit")
	public String edit(@RequestParam int id, ContentsForm contentsForm, Model model) {
		Contents contents = contentsService.getById(id);
		contentsForm.setContent(contents.getContent());
		contentsForm.setCause(contents.getCause());
		contentsForm.setCategory(contents.getCategory());
		contentsForm.setDesire(contents.getDesire());
		model.addAttribute("title", "編集");
	    model.addAttribute("selectItemsCategory", SELECT_ITEMS_CATEGORY);
	    model.addAttribute("selectItemsDesire", SELECT_ITEMS_DESIRE);
	    model.addAttribute("id", id);
	    model.addAttribute("updateFlag", true);
		return "contents/edit_boot";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int id, Model model) {
		contentsService.delete(id);
		return "redirect:/contents";
	}
}
