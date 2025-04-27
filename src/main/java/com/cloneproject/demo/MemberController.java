package com.cloneproject.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {
  
  private final ItemRepository itemRepository;

  @GetMapping("/list")  //router와 같은 기능
  String list(Model model) {
    List<Item> result = itemRepository.findAll();
    System.out.println(result);
    model.addAttribute("items",result);
    return "list.html";
  }

}