package d40;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: d40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C11658c {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11658c) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC2875y.m8289b(AbstractC11266d.m30447a(0.0f, Float.hashCode(1.0f) * 31, 31), 31, true);
    }

    public final String toString() {
        return "EmbeddedFlatStyle(separatorThickness=1.0, separatorInsets=0.0, topSeparatorEnabled=true, bottomSeparatorEnabled=true)";
    }
}
