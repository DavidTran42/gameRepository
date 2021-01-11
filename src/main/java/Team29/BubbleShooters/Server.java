package Team29.BubbleShooters;

import org.jspace.*;
/*
 * Server checks that the name is valid (not empty, unique and not too long) 
 * and creates a new room, if the roomID doesn't exist already (Lobby/butler method)
 * 
 * user.(name, roomID) -> server.credentials(name, roomID)
 * server.("roomURI", name, roomID, roomURI) -> user.response("roomURI", name, roomID, roomURI)
 *  
 *  User puts movement/controls into repo. -> 
 *  Server gets user controls and updated positions etc. ->
 *  Server puts updated player/ball/arrow positions and collision info. -> 
 *  User gets position and collision info.
 *   
 */ 
public class Server
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    }
}
