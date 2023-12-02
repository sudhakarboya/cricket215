// Write your code here

package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getAllPlayers();

    Player getPlayerById(int playerId);

    Player addPlayer(Player player);

    Player updatePlayerById(int playerId, Player player);

    void deletePlayerById(int payerId);

}
