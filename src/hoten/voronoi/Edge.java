/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoten.voronoi;

import hoten.geom.Point;

/**
 * Edge.java Function Date Jun 5, 2013
 *
 * @author Connor
 */
public class Edge {

    public int index;
    public Center d0, d1;  // Delaunay edge
    public Corner v0, v1;  // Voronoi edge
    public Point midpoint;  // halfway between v0,v1
    
    public int river;

    public void setVornoi(Corner v0, Corner v1) {
        this.v0 = v0;
        this.v1 = v1;
        midpoint = new Point((v0.loc.x + v1.loc.x) / 2, (v0.loc.y + v1.loc.y) / 2);
    }
}