package com.kestrelroutesync;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
