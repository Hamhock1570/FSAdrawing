package sample;

import java.util.LinkedList;

/**
 * Created by Michael
 */
public class FSA {
    private boolean valid;// a flag to see if the FSA is incorrect
    private LinkedList<State> allStates;// list of all states in FSA
    private LinkedList<State> acceptingStates;// a list of all accepting states
    private State startState; // start state in FSA

    public FSA(){
        this.valid              = true;
        this.allStates          = null;
        this.acceptingStates    = null;
        this.startState         = null;
    }

    public void drawFSA(){
        if(this.valid){ // it's okay to draw.

        }
        else{
            //FSA is not valid. OUTPUT ERROR...
        }
    }

    public void printStates(){
        for(int i = 0 ; i < this.allStates.size() ; i++){
            this.allStates.get(i).getTransitions();
        }
    }




}// end of class FSA
