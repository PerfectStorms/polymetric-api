package com.perfectstorms.polymetric.controller;

import com.perfectstorms.polymetric.entity.VideoAction;
import com.perfectstorms.polymetric.entity.VideoActionType;
import com.perfectstorms.polymetric.model.VideoActionModel;
import com.perfectstorms.polymetric.repository.VideoActionRepository;
import com.perfectstorms.polymetric.repository.VideoActionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActionController {

    private VideoActionRepository videoActionRepository;
    private VideoActionTypeRepository videoActionTypeRepository;

    @Autowired
    public ActionController(VideoActionRepository videoActionRepository, VideoActionTypeRepository videoActionTypeRepository) {
        this.videoActionRepository = videoActionRepository;
        this.videoActionTypeRepository = videoActionTypeRepository;
    }

    /**
     * Get all video actions
     *
     * @return List of VideoAction objects
     */
    @GetMapping("/api/actions/video")
    public List<VideoAction> getAllVideoActions() {
        return videoActionRepository.findAll();
    }

    /**
     * Get one VideoAction object
     *
     * @param id VideoAction object id
     * @return optional VideoAction object
     */
    @GetMapping("/api/actions/video/{id}")
    public Optional<VideoAction> getOneVideoAction(@PathVariable("id") String id ) {
        return videoActionRepository.findById(Long.parseLong(id));
    }

    @GetMapping("/api/actions/video/types")
    public List<VideoActionType> getAllVideoActionTypes() {
        return videoActionTypeRepository.findAll();
    }

    /**
     * Add video action
     *
     * @param videoActionModel VideoAction Model
     * @return ResponseEntity
     */
    @RequestMapping(value = "/api/actions/video/add", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<VideoAction> addVideoAction(@RequestBody VideoActionModel videoActionModel) {
        videoActionRepository.save(

                new VideoAction(videoActionModel.getUsername(), videoActionModel.getType(), videoActionModel.getTime())
        );
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
