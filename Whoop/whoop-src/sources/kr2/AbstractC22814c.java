package kr2;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: kr2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "pxHeight", "", "systemDensityValue", "a", "(IF)F", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22814c {
    /* JADX INFO: renamed from: a */
    public static final float m66099a(int i13, float f13) {
        if (i13 <= 2000) {
            return Math.min(f13, 2.6f);
        }
        if (i13 <= 2300) {
            return Math.min(f13, 2.7f);
        }
        if (i13 <= 2700) {
            return Math.min(f13, 2.8f);
        }
        return i13 <= 3000 ? Math.min(f13, 3.2f) : f13;
    }
}
