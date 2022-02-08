package by.burdina.arraytask.entity;

public class CustomArray {

    private int[] array;

    public CustomArray(){
    }

    public CustomArray(int... array){
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + array.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomArray other = (CustomArray) obj;
        if (!CustomArray.equals(array, other.array)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomArray " + array.toString();
    }

}
