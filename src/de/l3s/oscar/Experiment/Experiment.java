package de.l3s.oscar.Experiment;

public class Experiment {
    private String inFolder;
    private String outFolder;
    private String algorithmName;

    public Experiment(String inFolder, String algorithmName, String outFolder){
        this.inFolder = inFolder;
        this.outFolder = outFolder;
        this.algorithmName = algorithmName;
    }


    protected void run(){
        //create instance of selected algorithm

        //train
        //get input file
        //read each line and create a demand time series per stand

        //test

    }

    protected void train(){

    }

    protected void test(){
        
    }
}
