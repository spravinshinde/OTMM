/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.computergodzilla.tfidf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class TfIdfMain {
    
    /**
     * Main method
     * @param args
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        DocumentParser dp = new DocumentParser();
//        dp.parseFiles("D:\\folderToIndex");
        dp.parseFiles("C:\\Users\\om\\IdeaProjects\\OTMM");
        dp.tfIdfCalculator(); //calculates tfidf
        dp.getCosineSimilarity(); //calculated cosine similarity
    }
}
