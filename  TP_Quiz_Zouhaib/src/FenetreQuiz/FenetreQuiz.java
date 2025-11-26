/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FenetreQuiz;

import java.util.ArrayList;

/**
 *
 * @author zouhaib mahamoud
 */
public class FenetreQuiz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());

    private ArrayList<Question> questions;         
    private int indexQuestionCourante = 0;    
    private int scoreValue = 0;               
    private boolean questionEnCours = true;   
    /**
     * Creates new form FenetreQuiz
     */
    public FenetreQuiz() {
        initComponents();          
        initialiserQuestions();    
        afficherQuestionCourante();
    }

    
    private void initialiserQuestions() {
        questions = new ArrayList<>();

        // 5 questions de culture générale
        questions.add(new Question(
                "Quelle est la capitale de l'Allemagne ?",
                "Berlin",
                "Munich",
                "Francfort",
                "Hambourg",
                1
        ));

        questions.add(new Question(
                "Qui a peint la Joconde ?",
                "Pablo Picasso",
                "Claude Monet",
                "Léonard de Vinci",
                "Vincent Van Gogh",
                3
        ));

        questions.add(new Question(
                "Quel est le plus grand océan de la planète ?",
                "Océan Atlantique",
                "Océan Indien",
                "Océan Arctique",
                "Océan Pacifique",
                4
        ));

        questions.add(new Question(
                "Combien y a-t-il de continents sur Terre (au sens classique) ?",
                "5",
                "6",
                "7",
                "4",
                3
        ));

        questions.add(new Question(
                "Quel est l'élément chimique dont le symbole est 'Fe' ?",
                "Fluor",
                "Fer",
                "Phosphore",
                "Francium",
                2
        ));
    }

 
    private void afficherQuestionCourante() {
        if (indexQuestionCourante >= questions.size()) {
            // Plus de questions : quiz terminé (Étape 6)
            lblQuestion.setText("Quiz terminé !");
            Feedback.setText("Score final : " + scoreValue + " / " + questions.size());
            Score.setText("Score : " + scoreValue + " / " + questions.size());
            desactiverBoutonsReponse();
            Suivant.setEnabled(false);
            return;
        }

        Question q = questions.get(indexQuestionCourante);

       
        lblQuestion.setText(q.getIntitule());
        Rep1.setText(q.getProposition1());
        Rep2.setText(q.getProposition2());
        Rep3.setText(q.getProposition3());
        Rep4.setText(q.getProposition4());

        Feedback.setText(" ");
        Score.setText("Score : " + scoreValue + " / " + questions.size());

        activerBoutonsReponse();   // setEnabled(true) (Étape 3 & 4)
        Suivant.setEnabled(false);
        questionEnCours = true;
    }

    
    private void verifierReponse(int indexChoisi) {
        if (!questionEnCours) {
            return; 
        }

        Question q = questions.get(indexQuestionCourante);
        int indexBonneReponse = q.getIndexBonneReponse();

        if (indexChoisi == indexBonneReponse) {
            scoreValue++;
            Feedback.setText("Bonne réponse");    // setText(...) (Étape 5)
        } else {
            String bonneProposition = getPropositionParIndex(q, indexBonneReponse);
            Feedback.setText("Mauvaise réponse. Bonne réponse : " + bonneProposition);
        }

        Score.setText("Score : " + scoreValue + " / " + questions.size());

        // Désactiver les 4 boutons après la réponse (Étape 5)
        desactiverBoutonsReponse();
        questionEnCours = false;

        // Activer "Question suivante" si ce n'est pas la dernière (Étape 6)
        if (indexQuestionCourante < questions.size() - 1) {
            Suivant.setEnabled(true);
        } else {
            Suivant.setEnabled(false);
            Feedback.setText(Feedback.getText() + "  - Quiz terminé !");
        }
    }

    private String getPropositionParIndex(Question q, int index) {
        return switch (index) {
            case 1 -> q.getProposition1();
            case 2 -> q.getProposition2();
            case 3 -> q.getProposition3();
            case 4 -> q.getProposition4();
            default -> "";
        };
    }

   
    private void passerQuestionSuivante() {
        indexQuestionCourante++;
        afficherQuestionCourante();
    }

   
    private void activerBoutonsReponse() {
        Rep1.setEnabled(true);
        Rep2.setEnabled(true);
        Rep3.setEnabled(true);
        Rep4.setEnabled(true);
    }

    private void desactiverBoutonsReponse() {
        Rep1.setEnabled(false);
        Rep2.setEnabled(false);
        Rep3.setEnabled(false);
        Rep4.setEnabled(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestion = new javax.swing.JLabel();
        Rep1 = new javax.swing.JButton();
        Rep2 = new javax.swing.JButton();
        Rep3 = new javax.swing.JButton();
        Rep4 = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        Feedback = new javax.swing.JLabel();
        Suivant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuestion.setText("Question1");

        Rep1.setText("Rep1");

        Rep2.setText("Rep2");
        Rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep2ActionPerformed(evt);
            }
        });

        Rep3.setText("Rep3");

        Rep4.setText("Rep4");

        Score.setText("score");

        Feedback.setText("Feedback");

        Suivant.setText("Suivant");
        Suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuivantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Suivant))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Rep4)
                            .addComponent(Rep3)
                            .addComponent(Rep2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(lblQuestion))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(159, 159, 159)
                                    .addComponent(Rep1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Feedback)
                            .addComponent(Score))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Score)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuestion)
                    .addComponent(Feedback))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Rep1)
                        .addGap(27, 27, 27)
                        .addComponent(Rep2)
                        .addGap(29, 29, 29)
                        .addComponent(Rep3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Rep4)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Suivant))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep2ActionPerformed
        verifierReponse(2);
    }
    private void Rep1ActionPerformed(java.awt.event.ActionEvent evt)   {                                
        verifierReponse(1);   
    }                                    
                                 

    private void Rep3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        verifierReponse(3);   
    }                                    

    private void Rep4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        verifierReponse(4);   

    }//GEN-LAST:event_Rep2ActionPerformed
 
    private void SuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuivantActionPerformed
        passerQuestionSuivante();
    }//GEN-LAST:event_SuivantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {    

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info :
        javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
            }
        }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Feedback;
    private javax.swing.JButton Rep1;
    private javax.swing.JButton Rep2;
    private javax.swing.JButton Rep3;
    private javax.swing.JButton Rep4;
    private javax.swing.JLabel Score;
    private javax.swing.JButton Suivant;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables

}