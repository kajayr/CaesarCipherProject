package com.leo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Encoding {
    private int mKey;
    private String mInputText;


    public Encoding(String inputText,int key) {
        mKey = key;
        mInputText = inputText;
    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey()
    {
        return mKey;
    }
    public boolean isValidInputText()
    {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEmpty()
    {
        return !mInputText.trim().isEmpty();
    }
    public boolean isValidKey()
    {
        return mKey >1 && mKey < 26;

    }

    public String encode() throws IOException {
        String encoded = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (mInputText.charAt(i) == ' ')
            {
                encoded += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int key = (mKey + charPosition) % 26;
                encoded += alphabet.charAt(key);
            }
        }
        File file = new File("C:\\Users\\kajay\\IdeaProjects\\CaesarCipherProject\\encrypt.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter("C:\\Users\\kajay\\IdeaProjects\\CaesarCipherProject\\encrypt.txt");
        fw.write(encoded);
        fw.close();
        return encoded;
    }
}
