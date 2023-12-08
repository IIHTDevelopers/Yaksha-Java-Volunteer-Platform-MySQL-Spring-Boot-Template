package com.volunteerplatform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volunteerplatform.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

	private final EventService eventService = null;

}
