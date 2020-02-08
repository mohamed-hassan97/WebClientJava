package example;

import mypackage.Event;
import mypackage.EventResponse;
import mypackage.HealthCareInteropService;
import mypackage.HealthCareInteropService_Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
  public static void main(String[] argv) {

    HealthCareInteropService_Service service = null;
    try {
      service = new HealthCareInteropService_Service(new URL("http://localhost/OpenExtrem2020/Server.php?wsdl"));
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    HealthCareInteropService client = service.getHealthCareInteropServicePort();


    String resultat = client.calculator("add",2,5);

    System.out.println(resultat);


    JFrame f = new JFrame("Création des formulaires en java");

    // Les zones de Textes
    JTextField txtNom = new JTextField(10);
    JTextField txtAdresse = new JTextField(10);
    JTextField txtVille = new JTextField(10);
    JTextField txtPays = new JTextField(10);

    // Création des labels avec mnémoniques
    JLabel lblNom = new JLabel("Nom ", JLabel.RIGHT);
    lblNom.setDisplayedMnemonic('N'); // Définir le mnémonique
    lblNom.setLabelFor(txtNom);       // Définir le composant qui es labelé

    JLabel lblAdresse = new JLabel("Prenom:", JLabel.RIGHT);
    lblAdresse.setDisplayedMnemonic('s');
    lblAdresse.setDisplayedMnemonicIndex(5);
    lblAdresse.setLabelFor(txtAdresse);

    JLabel lblVille = new JLabel("Date de naissance", JLabel.RIGHT);
    lblVille.setDisplayedMnemonic('V');
    lblVille.setLabelFor(txtVille);

    JLabel lblPays = new JLabel("Sexe", JLabel.RIGHT);
    lblPays.setDisplayedMnemonic('P');
    lblPays.setLabelFor(txtPays);

    JButton btn = new JButton("Valider");
    btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String nom;
        String prenom;
        String date;
        String sexe;
        nom = txtNom.getText();
        prenom =txtAdresse.getText();
        date =txtVille.getText();
        sexe =txtPays.getText();
        client.event("<?xml version=\"1.0\" encoding=\"utf-8\"?><evenementsPatients xmlns=\"http://www.hprim.org/hprimXML\" acquittementAttendu=\"oui\" ><enteteMessage><identifiantMessage>1</identifiantMessage><dateHeureProduction>2020-05-30T09:30:00</dateHeureProduction><emetteur><agents><agent categorie=\"application\"><code>univ90</code><libelle>Université La Rochelle</libelle></agent><agent categorie=\"système\"><code>univ90</code><libelle>Université La Rochelle</libelle></agent></agents></emetteur><destinataire><agents><agent categorie=\"application\"><code>Mediboard</code><libelle>Gestion des Etablissements de Santé</libelle></agent></agents></destinataire></enteteMessage><evenementPatient><enregistrementPatient action=\"création\"><patient confidentiel=\"oui\" ><identifiant><emetteur><valeur>921</valeur></emetteur><numeroIdentifiantSante><identifiant>921</identifiant></numeroIdentifiantSante></identifiant><personnePhysique sexe=\""+sexe+"\"><nomUsuel>"+nom+"</nomUsuel><prenoms><prenom>"+prenom+"</prenom></prenoms><dateNaissance><date>"+date+"</date></dateNaissance></personnePhysique></patient></enregistrementPatient></evenementPatient></evenementsPatients>");
        f.dispose();
        // .... do some operation on value ...
      }
    });
    JPanel p = new JPanel( );
    p.setLayout(new GridLayout(5, 4, 7, 7));
    p.add(lblNom);
    p.add(txtNom);
    p.add(lblAdresse);
    p.add(txtAdresse);
    p.add(lblVille);
    p.add(txtVille);
    p.add(lblPays);
    p.add(txtPays);
    p.add(btn);



    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setContentPane(p);
    f.pack( );
    f.setVisible(true);

  }
}

