package l83;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C23472r implements Comparable {

    /* JADX INFO: renamed from: w */
    public final byte f92950w;

    /* JADX INFO: renamed from: a */
    public static String m68039a(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC22676k.m65751k(this.f92950w & 255, ((C23472r) obj).f92950w & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23472r) {
            return this.f92950w == ((C23472r) obj).f92950w;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f92950w);
    }

    public final String toString() {
        return m68039a(this.f92950w);
    }
}
