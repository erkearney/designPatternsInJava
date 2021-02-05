abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component c) {
        component = c;
    }

    public void makeHouse() {
        if(component != null) {
            component.makeHouse();
        }
    } 
}
