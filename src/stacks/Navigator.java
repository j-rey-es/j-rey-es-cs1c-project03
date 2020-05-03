package stacks;

public class Navigator {
    private String currentLink;
    private StackList<String> backLinks;
    private StackList<String> forwardLinks;

    /**
     * Default Constructor for Navigator
     */

    public Navigator ()
    {
        currentLink = new String(" ");
        backLinks = new StackList<String>("Back");
        forwardLinks = new StackList<String>("Forward");
    }
    /**
     * Accessor method for Current Link
     * @return String of current Link in Navigator
     */
    public String getCurrentLink() {
        return currentLink;
    }

    /** Accessor for BackLinks
     * @return StackList<String> of backLinks
     **/
    public StackList<String> getBackLinks() {
        return backLinks;
    }

    /** Accessor for ForwardLinks
     * @return StackList<String> of ForwardLinks
     **/
    public StackList<String> getForwardLinks() {
        return forwardLinks;
    }

    /**
     * Sets the current link of Navigator browser depending on current state of Navigator
     * @param cLink String of current link
     */
    public void setCurrentLink (String cLink)
    {
        if (forwardLinks.isEmpty())
        {
            backLinks.push(currentLink);
            currentLink = cLink;
        }
        else
        {
            backLinks.push(cLink);
            currentLink = cLink;
            forwardLinks.clear();
        }

    }

    /**
     * Pushes the current link into the forwardLinks and retrieves a link from the backLinks
     */
    public void goBack()
    {
        forwardLinks.push(currentLink);
        currentLink = backLinks.pop();
    }

    /**
     * Pushes the current link into the backLinks and retrieves a link from the forwardLinks
     */
    public void goForward()
    {
        backLinks.push(currentLink);
        currentLink = forwardLinks.pop();
    }

}
