package qrcoding;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.json.JSONObject;

public class qr extends javax.swing.JFrame {

    // Constructor to initialize the components
    public qr() {
        initComponents();
    }

    // Method to initialize the GUI components
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        imageLink = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        body = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        videoLink = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QR CODE GENERATOR");

        jLabel2.setText("ID:");
        jLabel3.setText("Image Link:");
        jLabel4.setText("Title:");
        jLabel5.setText("Body:");
        jLabel6.setText("URL:");
        jLabel7.setText("Video Link:");

        jButton1.setText("Generate QR Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Setting the layout of the components
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(169, 169, 169)
                                                        .addComponent(jLabel1))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(38, 38, 38)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(imageLink))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(title))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(body))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(url))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(videoLink))))))
                                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(imageLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(videoLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }

    // Action listener for the "Generate QR Code" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Gather user input from the text fields
            String jsonID = id.getText();
            String jsonImageLink = imageLink.getText();
            String jsonTitle = title.getText();
            String jsonBody = body.getText();
            String jsonURL = url.getText();
            String jsonVideoLink = videoLink.getText();

            // Construct JSON object with the gathered data
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ID", jsonID);
            jsonObject.put("ImageLink", jsonImageLink);
            jsonObject.put("Title", jsonTitle);
            jsonObject.put("Body", jsonBody);
            jsonObject.put("URL", jsonURL);
            jsonObject.put("VideoLink", jsonVideoLink);

            // Convert the JSON object to string
            String QrCodeData = jsonObject.toString();
            // File path to save the QR code image
            String filePath = "C:\\Users\\dell\\Documents\\NetBeansProjects\\QRCODING\\Qr.png";
            String charset = "UTF-8";
            // Setting the QR code error correction level
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

            // Encode the string into a QR code
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(QrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, 200, 200, hintMap);

            // Write the QR code to a file
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
            System.out.println("QR code has been generated at the location " + filePath);

            // Display the QR code in a new JFrame
            JFrame frame = new JFrame();
            ImageIcon icon = new ImageIcon(filePath);
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Main method to run the application
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qr().setVisible(true);
            }
        });
    }

    // Variable declarations
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField body;
    private javax.swing.JTextField id;
    private javax.swing.JTextField imageLink;
    private javax.swing.JTextField title;
    private javax.swing.JTextField url;
    private javax.swing.JTextField videoLink;
}