package lg3;

import p012ab.C0682h0;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: lg3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C24050l implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public final String f95048w;

    public C24050l(String str) {
        this.f95048w = str;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        if (i13 > charSequence.length() || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.f95048w;
        return !c24055q.m70975l(charSequence, i13, str, 0, str.length()) ? ~i13 : str.length() + i13;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        sb4.append(this.f95048w);
        return true;
    }

    public final String toString() {
        return AbstractC11895b.m31996o("'", this.f95048w.replace("'", "''"), "'");
    }
}
