package sample;

/** Represents a transition
 * Created by Michael
 */
public class Transition {
    private State state1;// the state you're in
    private State state2; // the state that you're transitioning to

    // might need to change this to state names (what if the states don't exist yet)
    public Transition(State state1, State state2){
        this.state1 = state1;
        this.state2 = state2;
    }

    /**
     * Accessor method for state1 of Transition.
     * returns a reference to the state1
     * @return state1 of a transition
     */
    public State getState1(){
        return  this.state1;
    }

    /**
     * Accessor method for state2 of Transition.
     * returns a reference to the state2
     * @return state2 of a transition
     */
    public State getState2(){
       return this.state2;
    }

    /**
     * This function is used in testing to offer some visualization on a transition object
     * @return a string representation of the transition
     */
    public String toString() {
        return "Transition from State:( " + this.state1.getStateName()+" ) to State:( "+this.state2.getStateName() +" ) ";
    }
}
