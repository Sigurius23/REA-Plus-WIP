package s33;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: s33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C32116a {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C32116a);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + AbstractC2875y.m8289b(Long.hashCode(30000L) * 31, 31, true);
    }

    public final String toString() {
        return "ClosedCaptionDeduplicationConfig(duplicateCleanupFrequencyMs=30000, autoRemoveDuplicateCaptions=true, captionSplitFactor=2)";
    }
}
