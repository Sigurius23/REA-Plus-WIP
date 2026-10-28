package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override // hms.webrtc.BaseBitrateAdjuster, hms.webrtc.BitrateAdjuster
    public void setTargets(int i13, double d3) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) (((double) (i13 * 30)) / d3);
    }
}
