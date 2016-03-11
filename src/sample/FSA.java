package sample;

import java.util.LinkedList;

/** This class Represents everything about and FSA.
 * Created by Michael
 */
public class FSA {
    private int numStates; // number of states in the FSA
    private boolean valid; // a flag to see if the FSA is incorrect
    private LinkedList<State> allStates;// list of all states in FSA
    private LinkedList<State> acceptingStates;// a list of all accepting states
    private State startState; // start state in FSA

    public FSA(){
        this.numStates = 0;
        this.valid              = true;
        this.allStates          = null;
        this.acceptingStates    = null;
        this.startState         = null;
    }


    //------------------------------------------------------------------------getter methods
    public int getNumStates(){
        return this.numStates;
    }

    public boolean getFSAValidity(){
        return this.valid;
    }

    public LinkedList<State> getAllStates(){
        return this.allStates;
    }

    public LinkedList<State> getAcceptingStates(){
        return this.acceptingStates;
    }

    public State getStartState() {
        return startState;
    }

    //------------------------------------------------------------------------setter methods

    /**
     *
     * @param numStates
     */
    public void setNumStates(int numStates) {
        this.numStates = numStates;
    }

    /**
     *
     */
    public void setValidTrue(){
        this.valid = true;
    }

    /**
     *
     *
     */
    public void setValidFalse(){
        this.valid = false;
    }

    /**
     *
     * @param startState
     */
    public void setStartState(State startState){
        this.startState = startState;
    }
    //------------------------------------------------------------------------loader methods
    /**
     *
     */
    public void printStates(){
        for(int i = 0 ; i < this.allStates.size() ; i++){
            this.allStates.get(i).getTransitions();
        }
    }



    /**
     *
     */
    public void draw(){
        if(this.valid){ // it's okay to draw.

        }
        else{
            //FSA is not valid. OUTPUT ERROR...
        }
    }

}// end of class FSA
