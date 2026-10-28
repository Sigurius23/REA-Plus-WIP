package s33;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: s33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C32119d {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C32119d);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + AbstractC2875y.m8289b(Long.hashCode(2700L) * 31, 31, true);
    }

    public final String toString() {
        return "ClosedCaptionsSettings(visibilityDurationMs=2700, autoDismissCaptions=true, maxVisibleCaptions=2)";
    }
}
