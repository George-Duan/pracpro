package com.leshion.interpreter;

/**
 * 距离解释：终结符表达式
 */
public class DistanceNode extends AbstractNode{

    private String distance;

    public DistanceNode(String distance){
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}
