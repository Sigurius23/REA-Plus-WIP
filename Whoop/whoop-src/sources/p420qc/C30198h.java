package p420qc;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.h */
/* JADX INFO: loaded from: classes.dex */
public final class C30198h {

    /* JADX INFO: renamed from: a */
    public final String f123598a;

    /* JADX INFO: renamed from: b */
    public final int f123599b;

    /* JADX INFO: renamed from: c */
    public final int f123600c;

    public C30198h(String workSpecId, int i13, int i14) {
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        this.f123598a = workSpecId;
        this.f123599b = i13;
        this.f123600c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30198h)) {
            return false;
        }
        C30198h c30198h = (C30198h) obj;
        return AbstractC22676k.m65745e(this.f123598a, c30198h.f123598a) && this.f123599b == c30198h.f123599b && this.f123600c == c30198h.f123600c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123600c) + AbstractC11266d.m30448b(this.f123599b, this.f123598a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb4.append(this.f123598a);
        sb4.append(", generation=");
        sb4.append(this.f123599b);
        sb4.append(", systemId=");
        return AbstractC11895b.m31999r(sb4, this.f123600c, ')');
    }
}
