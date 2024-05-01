package org.example.aws_server_test.test;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // 에러 페이지로 이동할 뷰 이름을 반환합니다. 이에 맞게 템플릿 파일을 생성해야 합니다.
        return "error";
    }


    public String getErrorPath() {
        return "/error";
    }
}
