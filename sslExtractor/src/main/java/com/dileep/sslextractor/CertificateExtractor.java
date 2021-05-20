package com.dileep.sslextractor;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by fabiomsr on 3/7/16.
 */
public class CertificateExtractor {

    /**
     * Get peer certificate(Public key to sha256 to base64)
     * @param certificate Crt or der or pem file with a valid certificate
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String extract(File certificate){

        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream(certificate);
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509")
                    .generateCertificate(inputStream);

            byte[] publicKeyEncoded = x509Certificate.getPublicKey().getEncoded();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] publicKeySha256 = messageDigest.digest(publicKeyEncoded);
            byte[] publicKeyShaBase64 = Base64.getEncoder().encode(publicKeySha256);

           return "sha256/" + new String(publicKeyShaBase64);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "";
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String extract(InputStream fileInputStream){

        FileInputStream inputStream = null;

        try{
//            inputStream = new FileInputStream(certificate);
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509")
                    .generateCertificate(fileInputStream);

            byte[] publicKeyEncoded = x509Certificate.getPublicKey().getEncoded();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] publicKeySha256 = messageDigest.digest(publicKeyEncoded);
            byte[] publicKeyShaBase64 = Base64.getEncoder().encode(publicKeySha256);

            return "sha256/" + new String(publicKeyShaBase64);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "";
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String extract(FileInputStream fileInputStream){

        FileInputStream inputStream = null;

        try{
//            inputStream = new FileInputStream(certificate);
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509")
                    .generateCertificate(fileInputStream);

            byte[] publicKeyEncoded = x509Certificate.getPublicKey().getEncoded();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] publicKeySha256 = messageDigest.digest(publicKeyEncoded);
            byte[] publicKeyShaBase64 = Base64.getEncoder().encode(publicKeySha256);

            return "sha256/" + new String(publicKeyShaBase64);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "";
    }
}
