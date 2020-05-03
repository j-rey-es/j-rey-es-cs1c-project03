package stacks;

public class Navigator {
    private String currentLink;
    private StackList<String> backLinks;
    private StackList<String> forwardLinks;

    public Navigator (String clink, StackList<String> bLinks, StackList<String> fLinks)
    {
        currentLink = clink;
        backLinks = bLinks;
        forwardLinks = fLinks;
    }

    public String getCurrentLink() {
        return currentLink;
    }

    public StackList<String> getBackLinks() {
        return backLinks;
    }

    public StackList<String> getForwardLinks() {
        return forwardLinks;
    }

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

    public void goBack()
    {
        forwardLinks.push(currentLink);
        currentLink = backLinks.pop();
    }
    public void goForward()
    {
        backLinks.push(currentLink);
        currentLink = forwardLinks.pop();
    }

}
