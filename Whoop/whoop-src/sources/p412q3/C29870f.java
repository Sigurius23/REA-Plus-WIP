package p412q3;

import com.google.android.material.textfield.C5057p;
import p088dc.AbstractC11895b;
import p094dn.C12185e;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: q3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29870f implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final int f122090a;

    /* JADX INFO: renamed from: b */
    public final int f122091b;

    public C29870f(int i13, int i14) {
        this.f122090a = i13;
        this.f122091b = i14;
        if (i13 >= 0 && i14 >= 0) {
            return;
        }
        AbstractC30895a.m95015a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i14 + " respectively.");
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        int i13 = c12185e.f40625y;
        C5057p c5057p = (C5057p) c12185e.f40622F;
        int i14 = this.f122091b;
        int iM15860c = i13 + i14;
        if (((i13 ^ iM15860c) & (i14 ^ iM15860c)) < 0) {
            iM15860c = c5057p.m15860c();
        }
        c12185e.m33786e(c12185e.f40625y, Math.min(iM15860c, c5057p.m15860c()));
        int i15 = c12185e.f40624x;
        int i16 = this.f122090a;
        int i17 = i15 - i16;
        if (((i15 ^ i17) & (i16 ^ i15)) < 0) {
            i17 = 0;
        }
        c12185e.m33786e(Math.max(0, i17), c12185e.f40624x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29870f)) {
            return false;
        }
        C29870f c29870f = (C29870f) obj;
        return this.f122090a == c29870f.f122090a && this.f122091b == c29870f.f122091b;
    }

    public final int hashCode() {
        return (this.f122090a * 31) + this.f122091b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb4.append(this.f122090a);
        sb4.append(", lengthAfterCursor=");
        return AbstractC11895b.m31999r(sb4, this.f122091b, ')');
    }
}
