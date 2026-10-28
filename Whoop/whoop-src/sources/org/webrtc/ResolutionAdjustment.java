package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public enum ResolutionAdjustment {
    NONE(1),
    MULTIPLE_OF_2(2),
    MULTIPLE_OF_4(4),
    MULTIPLE_OF_8(8),
    MULTIPLE_OF_16(16);

    private final int value;

    ResolutionAdjustment(int i13) {
        this.value = i13;
    }

    public int getValue() {
        return this.value;
    }
}
