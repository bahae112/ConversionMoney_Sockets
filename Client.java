import java.io.*;
import java.net.*;
import java.util.Scanner;

// public class Client {
//     public static void main(String[] args) {
//         String host = "localhost"; // Adresse du serveur
//         int port = 1234; // Même port que le serveur

//         try (Socket S = new Socket(host, port)) {
//             System.out.println("Connecté au serveur");

//             PrintWriter PW = new PrintWriter(S.getOutputStream());
//             PW.println("hello i am the client");
//             PW.flush();
//             BufferedReader BR = new BufferedReader(new InputStreamReader(S.getInputStream()));
//             System.out.println(BR.readLine());
//             BR.close();
//             PW.close();
//             S.close();

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


// public class Client {
//     public static void main(String[] args) {
//         // Coordonnées du serveur
//         int port = 1234;
//         String host = "localhost";

//         Scanner scanner = new Scanner(System.in);
//         int choix = 0;
//         double montant = 0.0;

//         // Demande du type de conversion
//         while (true) {
//             System.out.println("Choisissez la conversion : 'dollar vers mad' ou 'mad vers dollar'");
//             String conversionType = scanner.nextLine().trim().toLowerCase(); // Normalisation de l'entrée

//             switch (conversionType) {
//                 case "dollar vers mad":
//                     choix = 1;
//                     break;
//                 case "mad vers dollar":
//                     choix = 2;
//                     break;
//                 default:
//                     System.out.println("Entrée invalide, veuillez réessayer.");
//                     continue; // Recommence la boucle sans demander le montant
//             }

//             // Demande du montant après un choix valide
//             while (true) {
//                 try {
//                     System.out.print("Quel est votre budget : ");
//                     montant = Double.parseDouble(scanner.nextLine());
//                     break; // Sort de la boucle si la conversion réussit
//                 } catch (NumberFormatException e) {
//                     System.out.println("Montant invalide. Veuillez entrer un nombre valide.");
//                 }
//             }
//             try (Socket socket = new Socket(host, port);
//              PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
//              BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) { 

//             // Envoi du choix et du montant
//             writer.println(choix + " " + montant);
//             writer.flush();

//             // Lecture de la réponse du serveur
//             String response = reader.readLine();
//             System.out.println("Réponse du serveur : " + response);

        // } catch (IOException e) {
        //     System.err.println("Erreur lors de la communication avec le serveur : " + e.getMessage());
        //     e.printStackTrace();
        // }
//     }
//     }
// }



