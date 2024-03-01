package wating.store.controller;



@RequestMapping("/store")
@Controller

public class StoreController {


    @GetMapping("/storeList")
    public String storeList(Model model) {
        model.addAttribute("storeList",)
    }

}