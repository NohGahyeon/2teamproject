package team2mall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/product/detailpage")
    public String detailPage() {
        return "detailPage";
    }

    @GetMapping("/collections/outer")
    public String outerPage() {
        return "product-category";
    }
    @GetMapping("/collections/top")
    public String topPage() {
        return "product-category";
    }
    @GetMapping("/collections/bottom")
    public String bottomPage() {
        return "product-category";
    }
    @GetMapping("/collections/headwear")
    public String headwearPage() {
        return "product-category";
    }
    @GetMapping("/collections/acc")
    public String accPage() {
        return "product-category";
    }

}
