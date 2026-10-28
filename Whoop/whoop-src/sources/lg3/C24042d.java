package lg3;

import p012ab.C0682h0;

/* JADX INFO: renamed from: lg3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C24042d implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public final char f95026w;

    public C24042d(char c3) {
        this.f95026w = c3;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        if (i13 == charSequence.length()) {
            return ~i13;
        }
        return !c24055q.m70967a(this.f95026w, charSequence.charAt(i13)) ? ~i13 : i13 + 1;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        sb4.append(this.f95026w);
        return true;
    }

    public final String toString() {
        char c3 = this.f95026w;
        if (c3 == '\'') {
            return "''";
        }
        return "'" + c3 + "'";
    }
}
