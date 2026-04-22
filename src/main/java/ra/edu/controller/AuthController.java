package ra.edu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @PostMapping("/login")
    public String login(){
        return "Đăng nhập thành công";
    }
}
