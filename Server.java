import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 1234; // Port d'écoute
        String message = "Hello, I am the server. Vous voulez faire la conversion : ";

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serveur en attente de connexion sur le port " + port);

            while (true) { // Permet de gérer plusieurs connexions
                try (Socket socket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) { 

                    System.out.println("Client connecté.");
                    
                    // Lire le message du client
                    String clientMessage = reader.readLine();
                    String [] data = clientMessage.split(" ");
                    String choix = data[0];
                    double montant = Double.parseDouble(data[1]);
                    double montantfinal = 0;
                    switch(choix){
                        case "1":
                            montant = (montant * 9.95 ) ;
                            montantfinal = montant - 99.5;
                            break;
                        case "2":
                            montant = ( montant / 9.95 ) ;
                            montantfinal = montant - 99.5;
                            break;
                    }
                    System.out.println("Message reçu du client : " + clientMessage);

                    // Envoyer la réponse au client
                    writer.println(message + clientMessage + " " + montant + " " + montantfinal);

                } catch (IOException e) {
                    System.err.println("Erreur avec un client : " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Erreur lors du démarrage du serveur : " + e.getMessage());
        }
    }
}

