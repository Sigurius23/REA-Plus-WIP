package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i13) {
        double d3 = this.targetFramerateFps;
        if (d3 == 0.0d) {
            return;
        }
        int i14 = this.targetBitrateBps;
        double d14 = (((double) i13) - ((((double) i14) / BITS_PER_BYTE) / d3)) + this.deviationBytes;
        this.deviationBytes = d14;
        this.timeSinceLastAdjustmentMs = (1000.0d / d3) + this.timeSinceLastAdjustmentMs;
        double d15 = ((double) i14) / BITS_PER_BYTE;
        double d16 = BITRATE_ADJUSTMENT_SEC * d15;
        double dMin = Math.min(d14, d16);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d16);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d15) {
            int i15 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d15) + 0.5d));
            this.bitrateAdjustmentScaleExp = i15;
            this.bitrateAdjustmentScaleExp = Math.max(i15, -20);
            this.deviationBytes = d15;
        } else {
            double d17 = -d15;
            if (dMax < d17) {
                int i16 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d15) + 0.5d));
                this.bitrateAdjustmentScaleExp = i16;
                this.bitrateAdjustmentScaleExp = Math.min(i16, 20);
                this.deviationBytes = d17;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i13, double d3) {
        int i14 = this.targetBitrateBps;
        if (i14 > 0 && i13 < i14) {
            this.deviationBytes = (this.deviationBytes * ((double) i13)) / ((double) i14);
        }
        super.setTargets(i13, d3);
    }
}
