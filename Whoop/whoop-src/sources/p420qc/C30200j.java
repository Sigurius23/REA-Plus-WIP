package p420qc;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.j */
/* JADX INFO: loaded from: classes.dex */
public final class C30200j {

    /* JADX INFO: renamed from: a */
    public final String f123603a;

    /* JADX INFO: renamed from: b */
    public final int f123604b;

    public C30200j(String workSpecId, int i13) {
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        this.f123603a = workSpecId;
        this.f123604b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30200j)) {
            return false;
        }
        C30200j c30200j = (C30200j) obj;
        return AbstractC22676k.m65745e(this.f123603a, c30200j.f123603a) && this.f123604b == c30200j.f123604b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123604b) + (this.f123603a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb4.append(this.f123603a);
        sb4.append(", generation=");
        return AbstractC11895b.m31999r(sb4, this.f123604b, ')');
    }
}
