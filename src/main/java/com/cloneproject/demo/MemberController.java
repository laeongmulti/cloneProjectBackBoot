package com.cloneproject.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {
  
  private final MemberRepository memberRepository;

  @GetMapping("/api/members")
  public List<Member> getMembers(
      @RequestParam(required = false) String name,
      @RequestParam(required = false) String email) {
    
    if (name != null && email != null) {
      return memberRepository.findByNameAndEmail(name, email);
    } else if (name != null) {
      return memberRepository.findByName(name);
    } else if (email != null) {
      return memberRepository.findByEmail(email);
    }
    
    return memberRepository.findAll();
  }
}