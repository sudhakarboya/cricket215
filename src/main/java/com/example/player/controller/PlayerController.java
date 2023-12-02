/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

package com.example.player.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

//import com.example.player.service.PlayerH2Service;
import com.example.player.service.PlayerH2Service;
import com.example.player.model.Player;

@RestController
public class PlayerController {
    @Autowired
    private PlayerH2Service playerService;

    @GetMapping("/players")
    public ArrayList<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerById(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayerById(playerId, player);
    }

    @DeleteMapping("players/{playerId}")
    public void deletePlayerById(@PathVariable("playerId") int playerId) {
        playerService.deletePlayerById(playerId);
    }

}
