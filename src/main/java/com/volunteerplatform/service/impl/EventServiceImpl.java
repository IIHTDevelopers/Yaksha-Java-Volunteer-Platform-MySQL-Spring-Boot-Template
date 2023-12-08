package com.volunteerplatform.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.volunteerplatform.dto.EventDTO;
import com.volunteerplatform.service.EventService;

import javassist.NotFoundException;

@Service
public class EventServiceImpl implements EventService {

	@Override
	public EventDTO createEvent(EventDTO eventDTO) {
		return null;
	}

	@Override
	public EventDTO updateEvent(EventDTO eventDTO) throws NotFoundException {
		return null;
	}

	@Override
	public void cancelEvent(Long eventId) throws NotFoundException {
	}

	@Override
	public List<EventDTO> getAllUpcomingEvents() {
		return null;
	}

}
