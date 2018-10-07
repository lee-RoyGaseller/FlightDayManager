package com.example.lee_roy.flightdaymanager;

public class Gate {
    Character concourse;


    //Terminal terminal; Create a terminal variable in the Airport class containing all the gates.
    //Flight awaitingFlight;
    //Flight nextFlight;

    public Gate(char concourse /*Terminal terminal*/) {
        this.concourse = concourse;
    }

    private Character getConcourse() {
        return concourse;
    }

}
