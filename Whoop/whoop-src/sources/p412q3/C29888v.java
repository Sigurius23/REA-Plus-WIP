package p412q3;

import com.google.android.material.textfield.C5057p;
import e93.AbstractC12889b;
import p088dc.AbstractC11895b;
import p094dn.C12185e;

/* JADX INFO: renamed from: q3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C29888v implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final int f122118a;

    /* JADX INFO: renamed from: b */
    public final int f122119b;

    public C29888v(int i13, int i14) {
        this.f122118a = i13;
        this.f122119b = i14;
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        boolean z4 = c12185e.f40626z != -1;
        C5057p c5057p = (C5057p) c12185e.f40622F;
        if (z4) {
            c12185e.f40626z = -1;
            c12185e.f40621E = -1;
        }
        int iM36284n = AbstractC12889b.m36284n(this.f122118a, 0, c5057p.m15860c());
        int iM36284n2 = AbstractC12889b.m36284n(this.f122119b, 0, c5057p.m15860c());
        if (iM36284n != iM36284n2) {
            if (iM36284n < iM36284n2) {
                c12185e.m33791j(iM36284n, iM36284n2);
            } else {
                c12185e.m33791j(iM36284n2, iM36284n);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29888v)) {
            return false;
        }
        C29888v c29888v = (C29888v) obj;
        return this.f122118a == c29888v.f122118a && this.f122119b == c29888v.f122119b;
    }

    public final int hashCode() {
        return (this.f122118a * 31) + this.f122119b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetComposingRegionCommand(start=");
        sb4.append(this.f122118a);
        sb4.append(", end=");
        return AbstractC11895b.m31999r(sb4, this.f122119b, ')');
    }
}
