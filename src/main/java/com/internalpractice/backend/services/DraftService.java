package com.internalpractice.backend.services;

import com.internalpractice.backend.entities.Draft;
import com.internalpractice.backend.repositories.DraftRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class DraftService {

    @Inject
    private DraftRepository draftRepository;

    public List<Draft> getAllDrafts(){
        return draftRepository.findAll();
    }

    public Draft getDraftById(Long idDraft){
        return draftRepository.findById(idDraft).get();
    }

    public void storeDraft(Draft draft){
        draftRepository.save(draft);
    }

    public void deleteDraft(Long idDraft){
        draftRepository.deleteById(idDraft);
    }
}
