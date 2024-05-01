package org.example.aws_server_test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "Super Me 메인페이지입니당"; // HTML 파일의 이름을 반환 (확장자는 생략)
    }
}
