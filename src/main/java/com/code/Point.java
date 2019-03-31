package com.code;

public class Point {
    private float x_ = 0.0f;
    private float y_ = 0.0f;
    private float[] xy_ = new float[2];
    public Point() {
    }

    public Point(float x_, float y_) {
        this.x_ = x_;
        this.y_ = y_;
        xy_[0] = x_;
        xy_[1] = y_;
    }

    public float getX_() {
        return x_;
    }

    public void setX_(float x_) {
        this.x_ = x_;
    }

    public float getY_() {
        return y_;
    }

    public void setY_(float y_) {
        this.y_ = y_;
    }

    public float[] getXY_() {
        return xy_;
    }

    public void setXY_(float x_,float y_) {
        xy_[0] = x_;
        xy_[1] = y_;
    }

    @Override
    public String toString() {
        return "(x,y) = ("+getXY_()[0]+", "+getXY_()[1]+")";
    }
}
