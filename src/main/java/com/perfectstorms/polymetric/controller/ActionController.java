package com.perfectstorms.polymetric.controller;

import com.perfectstorms.polymetric.entity.VideoActionType;
import com.perfectstorms.polymetric.model.VideoAction;
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
     * @return list of VideoAction objects
     */
    @GetMapping("/actions/video")
    public List<com.perfectstorms.polymetric.entity.VideoAction> getAllVideoActions() {
        return videoActionRepository.findAll();
    }

    /**
     * Get one video action by id
     *
     * @param id video action id
     * @return optional video action object
     */
    @GetMapping("/actions/video/{id}")
    public Optional<com.perfectstorms.polymetric.entity.VideoAction> getOneVideoActionById(@PathVariable("id") String id ) {
        return videoActionRepository.findById(Long.parseLong(id));
    }

    /**
     * Get all action types
     *
     * @return list of type actions
     */
    @GetMapping("/actions/video/types")
    public List<VideoActionType> getAllVideoActionTypes() {
        return videoActionTypeRepository.findAll();
    }

    /**
     * Get One video action type by id
     *
     * @param id id of the video action type
     * @return video action type object
     */
    @GetMapping("/actions/video/types/{id}")
    public Optional<VideoActionType> getOneVideoActionTypeById(@PathVariable String id) {
        return videoActionTypeRepository.findById(Long.parseLong(id));
    }

    /**
     * Add video action
     *
     * @param videoAction video action Model
     * @return status of http
     */
    @RequestMapping(value = "/actions/video/add", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<com.perfectstorms.polymetric.entity.VideoAction> addVideoAction(@RequestBody VideoAction videoAction) {
        videoActionRepository.save(new com.perfectstorms.polymetric.entity.VideoAction(videoAction.getUsername(),
                videoAction.getTypeId(), videoAction.getTime(), videoAction.getDate(), videoAction.getVideoId(),
                videoAction.getVideoPosition(), videoAction.getRePosition()));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
