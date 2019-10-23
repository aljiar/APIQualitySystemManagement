package com.internalpractice.backend.controllers;

import com.internalpractice.backend.entities.Draft;
import com.internalpractice.backend.services.DraftService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/drafts")
public class DraftController {

    @Inject
    private DraftService draftService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDraft(@RequestBody Draft draft){
        draftService.storeDraft(draft);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Draft> getDrafts(){
        return draftService.getAllDrafts();
    }

    @GetMapping("/{draftId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Draft getDraft(@PathVariable Long draftId){
        return draftService.getDraftById(draftId);
    }

    @DeleteMapping("/{draftId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDraft(@PathVariable Long draftId){
        draftService.deleteDraft(draftId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateDraft(@RequestBody Draft draft){
        draftService.storeDraft(draft);
    }

}
