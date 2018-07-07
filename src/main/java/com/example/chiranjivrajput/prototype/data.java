package com.example.chiranjivrajput.prototype;
public class data {
    private String resource,format,link;
    public String topic[]=new String[9];
    private boolean beginner,intermediate,advanced;
    data(String f,String r,boolean b,boolean it,boolean a,String[] t,String l)
    {
        resource=r;
        System.arraycopy(t, 0, topic, 0, t.length);
        beginner=b;
        intermediate=it;
        advanced=a;
        format=f;
        link=l;
    }
    public String getResource(){return resource;}
    public boolean getBeginner(){
        return beginner;
    }
    public boolean getIntermediate()
    {
        return intermediate;
    }
    public boolean getadvanced()
    {
        return advanced;
    }
    public String getFormat(){
        return format;
    }

    public String getLink() {
        return link;
    }
}
