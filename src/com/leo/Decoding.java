package com.leo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Decoding {
    private int mKey;
    private String mInputText;


    public Decoding(int key) throws IOException {
        String temp;
        temp = Files.readString(Paths.get("C:\\Users\\kajay\\IdeaProjects\\CaesarCipherProject\\encrypt.txt"));

        mKey = key;
        mInputText = temp;
    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey() {
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
    public boolean isValidKey()
    {
        return mKey >1 && mKey < 26;
    }

    public String decode() throws IOException {
        String decodedValue = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i<encodedArray.length;i++)
        {
            if (mInputText.charAt(i) == ' ')
            {
                decodedValue += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int keyVal = (charPosition - mKey) % 26;

                if (keyVal < 0)
                {
                    keyVal = alphabet.length() + keyVal;
                }

                char replaceValue = alphabet.charAt(keyVal);
                decodedValue += replaceValue;
            }
        }
        return decodedValue;
    }
}