package d43;

/* JADX INFO: renamed from: d43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11702b {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C11702b);
    }

    public final int hashCode() {
        return Long.hashCode(5000L) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "ModerationWarningConfig(enable=true, displayTime=5000)";
    }
}
