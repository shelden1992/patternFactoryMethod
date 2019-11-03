package org.courses;


public class Shape {
    protected int id;
    protected int[][] cardinal;

    public Shape(int id, int[][] cardinal) {
        this.id = id;
        this.cardinal = cardinal;
    }

    public void draw() {
        for (int i = 0; i < cardinal.length; i++) {
            System.out.println();
            for (int j = 0; j < cardinal[i].length; j++) {
                System.out.print(cardinal[i][j] + " ");
            }
        }
        System.out.println();
    }
}
