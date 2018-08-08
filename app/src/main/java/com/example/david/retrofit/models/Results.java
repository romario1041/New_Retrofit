package com.example.david.retrofit.models;


public class Results
{
    private String title;

    private Ids ids;

    private String year;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Ids getIds ()
    {
        return ids;
    }

    public void setIds (Ids ids)
    {
        this.ids = ids;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", ids = "+ids.toString() +", year = "+year+"]";
    }
}
