class Solution {
    public double angleClock(int hour, int minutes) {

        double h=(hour%12)*30+minutes*0.5;
        double min=minutes*6;
        double ans=Math.abs(h-min);
        return Math.min(ans,360-ans);

    }
}