package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.t6 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20550t6 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    EnumC20550t6(float f13, int i13, int i14) {
        this.sizeScale = f13;
        this.bitRate = i13;
        this.screenshotQuality = i14;
    }

    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
