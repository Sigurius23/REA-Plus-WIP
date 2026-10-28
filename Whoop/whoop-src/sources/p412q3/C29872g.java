package p412q3;

import com.google.android.material.textfield.C5057p;
import p088dc.AbstractC11895b;
import p094dn.C12185e;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: q3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C29872g implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final int f122093a;

    /* JADX INFO: renamed from: b */
    public final int f122094b;

    public C29872g(int i13, int i14) {
        this.f122093a = i13;
        this.f122094b = i14;
        if (i13 >= 0 && i14 >= 0) {
            return;
        }
        AbstractC30895a.m95015a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i14 + " respectively.");
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        int i13 = 0;
        for (int i14 = 0; i14 < this.f122093a; i14++) {
            int i15 = i13 + 1;
            int i16 = c12185e.f40624x;
            if (i16 <= i15) {
                i13 = i16;
                break;
            }
            i13 = (Character.isHighSurrogate(c12185e.m33787f((i16 - i15) + (-1))) && Character.isLowSurrogate(c12185e.m33787f(c12185e.f40624x - i15))) ? i13 + 2 : i15;
        }
        int iM15860c = 0;
        for (int i17 = 0; i17 < this.f122094b; i17++) {
            int i18 = iM15860c + 1;
            int i19 = c12185e.f40625y;
            C5057p c5057p = (C5057p) c12185e.f40622F;
            if (i19 + i18 >= c5057p.m15860c()) {
                iM15860c = c5057p.m15860c() - c12185e.f40625y;
                break;
            }
            iM15860c = (Character.isHighSurrogate(c12185e.m33787f((c12185e.f40625y + i18) + (-1))) && Character.isLowSurrogate(c12185e.m33787f(c12185e.f40625y + i18))) ? iM15860c + 2 : i18;
        }
        int i24 = c12185e.f40625y;
        c12185e.m33786e(i24, iM15860c + i24);
        int i25 = c12185e.f40624x;
        c12185e.m33786e(i25 - i13, i25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29872g)) {
            return false;
        }
        C29872g c29872g = (C29872g) obj;
        return this.f122093a == c29872g.f122093a && this.f122094b == c29872g.f122094b;
    }

    public final int hashCode() {
        return (this.f122093a * 31) + this.f122094b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb4.append(this.f122093a);
        sb4.append(", lengthAfterCursor=");
        return AbstractC11895b.m31999r(sb4, this.f122094b, ')');
    }
}
