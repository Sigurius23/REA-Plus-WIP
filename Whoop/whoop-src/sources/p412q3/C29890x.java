package p412q3;

import com.google.android.material.textfield.C5057p;
import e93.AbstractC12889b;
import p088dc.AbstractC11895b;
import p094dn.C12185e;

/* JADX INFO: renamed from: q3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C29890x implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final int f122122a;

    /* JADX INFO: renamed from: b */
    public final int f122123b;

    public C29890x(int i13, int i14) {
        this.f122122a = i13;
        this.f122123b = i14;
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        int iM36284n = AbstractC12889b.m36284n(this.f122122a, 0, ((C5057p) c12185e.f40622F).m15860c());
        int iM36284n2 = AbstractC12889b.m36284n(this.f122123b, 0, ((C5057p) c12185e.f40622F).m15860c());
        if (iM36284n < iM36284n2) {
            c12185e.m33792k(iM36284n, iM36284n2);
        } else {
            c12185e.m33792k(iM36284n2, iM36284n);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29890x)) {
            return false;
        }
        C29890x c29890x = (C29890x) obj;
        return this.f122122a == c29890x.f122122a && this.f122123b == c29890x.f122123b;
    }

    public final int hashCode() {
        return (this.f122122a * 31) + this.f122123b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetSelectionCommand(start=");
        sb4.append(this.f122122a);
        sb4.append(", end=");
        return AbstractC11895b.m31999r(sb4, this.f122123b, ')');
    }
}
