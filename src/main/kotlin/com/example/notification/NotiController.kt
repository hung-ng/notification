package com.example.notification

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
class NotiController(private val NotiService: NotiService) {

    @GetMapping("/notiForm")
    fun showForm(model: Model): String {
        model.addAttribute("noti", NotiModel())
        return "notiForm"
    }

    @GetMapping("/notiRead")
    fun showUserList(model: Model): String {
        model.addAttribute("NotiModel", NotiService.sortByUserId())
        return "notiRead"
    }

    @PostMapping("/notiForm")
    fun greetingSubmit(@ModelAttribute noti: NotiModel): String {
        NotiService.createNoti(noti)
        return "redirect:/notiRead/"
    }
}