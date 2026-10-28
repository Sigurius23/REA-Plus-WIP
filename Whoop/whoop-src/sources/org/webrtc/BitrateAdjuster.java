package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i13);

    void setTargets(int i13, double d3);
}
