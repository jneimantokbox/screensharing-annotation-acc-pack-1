package com.tokbox.android.accpack.annotations;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;

import java.util.UUID;

public class AnnotationsPath extends Path {

    private UUID id;
  //  private Point mStartPoint;
  //  private Point mEndPoint;

    private PointF currentPoint;
    private boolean isStartPoint = false; //related to the currentPoint
    private boolean isEndPoint = false; //related to the currentPoint
    private boolean incoming = false;
    private PointF lastPoint;

    public PointF getLastPointF() {
        return lastPoint;
    }

    public void setLastPointF(PointF lastPoint) {
        this.lastPoint = lastPoint;
    }

    public AnnotationsPath(boolean incoming) {
        this.id = UUID.randomUUID();
        this.incoming = incoming;
    }

    public boolean isStartPoint() {
        return isStartPoint;
    }

    public boolean isEndPoint() {
        return isEndPoint;
    }

    public void setStartPoint(boolean startPoint) {
        isStartPoint = startPoint;
    }

    public void setEndPoint(boolean endPoint) {
        isEndPoint = endPoint;
    }

    public void setCurrentPoint(PointF point){
        currentPoint = point;
    }

    public PointF getCurrentPoint() {
        return currentPoint;
    }

    public UUID getId() {
        return id;
    }
}
