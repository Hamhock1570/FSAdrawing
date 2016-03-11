package sample;

import java.util.LinkedList;

/**
 * Created by Michael
 */
public class State {
    private String stateName;
    private LinkedList<Transition> transitions;

    /**Constructor for a State
     * intitilizes a linked list of transitions to null
     */
    public State(){
        this.stateName  = null;
         this.transitions = null;
    }

    /**
     *
     * @param stateName
     */
    public void setStateName(String stateName){
        this.stateName = stateName;
    }

    /**
     *
     */
    public String getStateName(){
        return this.stateName;
    }

    /**
     *
     * @param t
     */
    public void addTransition(Transition t){
        this.transitions.add(t);
    }

    /**
     *
     * @return
     */
    public LinkedList<Transition> getTransitions(){
        return this.transitions;
    }
}
