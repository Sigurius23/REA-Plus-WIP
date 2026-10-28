package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // hms.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // hms.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // hms.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i13) {
    }

    @Override // hms.webrtc.BitrateAdjuster
    public void setTargets(int i13, double d3) {
        this.targetBitrateBps = i13;
        this.targetFramerateFps = d3;
    }
}
