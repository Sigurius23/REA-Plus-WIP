package p463rj;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rj.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C31485p {

    /* JADX INFO: renamed from: a */
    public final String f129728a;

    /* JADX INFO: renamed from: b */
    public final boolean f129729b;

    /* JADX INFO: renamed from: c */
    public final String f129730c;

    public C31485p(String label, boolean z4, String str) {
        AbstractC22676k.m65750j(label, "label");
        this.f129728a = label;
        this.f129729b = z4;
        this.f129730c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31485p)) {
            return false;
        }
        C31485p c31485p = (C31485p) obj;
        return AbstractC22676k.m65745e(this.f129728a, c31485p.f129728a) && this.f129729b == c31485p.f129729b && AbstractC22676k.m65745e(this.f129730c, c31485p.f129730c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f129728a.hashCode() * 31;
        boolean z4 = this.f129729b;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iHashCode + r10) * 31;
        String str = this.f129730c;
        return i13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SurveyListOption(label=");
        sb4.append(this.f129728a);
        sb4.append(", isOther=");
        sb4.append(this.f129729b);
        sb4.append(", otherPlaceholder=");
        return AbstractC25012a.m73377j(sb4, this.f129730c, ')');
    }
}
