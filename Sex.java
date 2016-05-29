package facebook;

/**
 * Created by Ky on 07.05.2016.
 */
public enum  Sex {
    Male(2), Female(1);

    int index;

    Sex(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
