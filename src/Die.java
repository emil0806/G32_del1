public class Die {
private int dieValue;


public Die(){
}

public void setDieValue(int dieValue) {
    dieValue=(int)Math.floor(Math.random()*(6-1+1)+1);
}
public int getDieValue(){
    return dieValue;
}

}
