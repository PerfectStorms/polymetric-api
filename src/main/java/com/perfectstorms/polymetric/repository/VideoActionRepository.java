package com.perfectstorms.polymetric.repository;

import com.perfectstorms.polymetric.entity.VideoAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoActionRepository extends JpaRepository<VideoAction, Long> {
}
