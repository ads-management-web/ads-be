package com.adsmanagement.spaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceService {
    private final SpaceRepository spaceRepository;

    @Autowired
    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    public Iterable<Space> findAll() {
        return this.spaceRepository.findAll();
    }

}
