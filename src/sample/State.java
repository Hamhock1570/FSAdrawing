package sample;

import java.util.LinkedList;

/**Represents a state and activities of a state
 * Created by Michael
 */
public class State {
    private String stateName;
    private LinkedList<Transition> transitions;

    /**Constructor for a State
     * initializes a linked list of transitions to null
     */
    public State(String stateName){
        this.stateName  = stateName;
         this.transitions = null;
    }

    /**
     * Setter method for the state name
     * @param stateName the name of the state
     */
    public void setStateName(String stateName){
        this.stateName = stateName;
    }

    /** Accessor method for the state's name
     *  @return the name of the state
     */
    public String getStateName(){
        return this.stateName;
    }

    /**
     * Adds a transition into the state's list of transitions
     * @param t the transition object to add into the list
     */
    public void addTransition(Transition t){
        this.transitions.add(t);
    }

    /**
     *accessor method for a state's list of transitions
     * @return the linked list of transitions
     */
    public LinkedList<Transition> getTransitions(){
        return this.transitions;
    }
}
