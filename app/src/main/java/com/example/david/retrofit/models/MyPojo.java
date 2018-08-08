package com.example.david.retrofit.models;

import java.util.ArrayList;
import java.util.List;

public class MyPojo
{
    private Results[] results;

    public Results[] getResults ()
    {
        return results;
    }

    public String getXResult(int position){

        return "Conteudo : " + results[position].toString();
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }


   @Override
    public String toString(){

        return "Conteudo : " + results[1].toString();
   }
}

