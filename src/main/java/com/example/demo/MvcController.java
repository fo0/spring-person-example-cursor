package com.example.demo;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MvcController {

    private final PersonService personService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("person", new Person());
        List<Person> all = personService.getAll().stream().sorted(Comparator.comparing(Person::getId).reversed())
                .toList();
        model.addAttribute("people", all);
        return "index";
    }

    @PostMapping("/save")
    public String savePerson(@ModelAttribute("person") Person person, Model model) {
        personService.save(person);
        List<Person> all = personService.getAll().stream().sorted(Comparator.comparing(Person::getId).reversed())
                .toList();
        model.addAttribute("people", all);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String editPerson(@PathVariable Long id, Model model) {
        Person person = personService.getById(id);
        model.addAttribute("person", person);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id, Model model) {
        personService.deleteById(id);
        
        model.addAttribute("person", new Person());
        List<Person> all = personService.getAll().stream().sorted(Comparator.comparing(Person::getId).reversed())
                .toList();
        model.addAttribute("people", all);
        return "index";
    }
}
