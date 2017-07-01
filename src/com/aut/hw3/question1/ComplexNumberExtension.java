package com.aut.hw3.question1;

import java.util.ArrayList;

public class ComplexNumberExtension {
    public String[] getComplexArray() {
        return complexArray;
    }

    public void setComplexArray(String[] complexArray) {
        this.complexArray = complexArray;
    }

    public ArrayList<String> getComplexList() {
        return complexList;
    }

    private String[] complexArray;
    private ArrayList<String> complexList;

    /**
     * The addArrayList method gets a String.
     * It adds the String to the first index of ArrayList and then goes ahead in the ArrayList
     *
     * @param complexNum
     */
    private void addArrayList(String complexNum) {

        int i = 0;
        complexList.add(i, complexNum);
        i++;
    }

    /**
     * The addArray method gets a String
     * It adds the String to the first index of Array and then goes ahead in the array
     *
     * @param complexNum2
     */

    private void addArray(String complexNum2) {
        int j = 0;
        complexArray[j] = complexNum2;
        j++;
    }

    ComplexNumber complexNumber = new ComplexNumber();

    public void setComplexNumber(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    /**
     * The deleteByNumber method gets a integer as a parameter.
     * The integer refers to the index of String that we want to delete.
     * Thus,it deletes the value that exists in that index in both Array and ArrayList.
     *
     * @param number
     */
    private void deleteByNumber(int number) {
        complexList.remove(number);
        complexArray[number] = "";
    }

    /**
     * The deleteByObject method gets an object from ComplexNumber class.
     * If this object is available in the ArrayList ,deleteByObject deletes that.
     *
     * @param complexNumber
     */
    private void deleteByObject(ComplexNumber complexNumber) {

        if (complexList.equals(complexNumber)) {
            int k = complexList.indexOf(complexNumber);
            complexList.remove(k);
        }
    }

    /**
     * The displayArray method just shows the list of complexNumbers that exist in the Array.
     */
    private void displayArray() {
        for (int h = 0; h <= complexArray.length; h++) {
            System.out.println(complexArray[h]);
        }
    }

    /**
     * Name of the method is search.
     * It gets a String as a parameter then searches in the ArrayList.
     * if the String was available the method returns the index of that String.In the otherwise,it returns -1;
     *
     * @param theComplexNumber
     * @return
     */
    private int search(String theComplexNumber) {
        if (complexList.equals(theComplexNumber)) {
            return complexList.indexOf(complexList);
        } else return -1;
    }

    /**
     * Name of the method is displayArrayList.
     * It just shows the ArrayList.
     */
    private void displayArrayList() {
        for (int h = 0; h <= complexList.lastIndexOf(complexList)) {
            System.out.println(complexList);
        }
    }

    public static void main(String[] args) {
        // write your code here
    }

    public void setComplexList(ArrayList<String> complexList) {
        this.complexList = complexList;
    }
}
