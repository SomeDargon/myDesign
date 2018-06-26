package com.design;

public class Summoner {

    private String name;
    private String type;
    private String innate;

    public static class InnerSummoner{

        public String name;
        public String type;
        public String innate;

        public InnerSummoner setName(String name) {
            this.name = name;
            return this;
        }

        public InnerSummoner setType(String type) {
            this.type = type;
            return this;
        }

        public InnerSummoner setInnate(String innate) {
            this.innate = innate;
            return this;
        }

        public Summoner build() {
            Summoner s = new Summoner();
            s.innate = this.innate;
            s.name   = this.name;
            s.type = this.type;
            return s;
        }
    }



    public static void main(String[] args) {
        Summoner s = new Summoner.InnerSummoner().setInnate("123").setName("12").setType("333").build();
        System.out.println(s.toString());
    }
}
