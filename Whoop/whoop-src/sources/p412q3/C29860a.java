package p412q3;

import com.google.android.material.textfield.C5057p;
import e93.AbstractC12889b;
import p088dc.AbstractC11895b;
import p094dn.C12185e;
import p294l3.C23254g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C29860a implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final C23254g f122038a;

    /* JADX INFO: renamed from: b */
    public final int f122039b;

    public C29860a(C23254g c23254g, int i13) {
        this.f122038a = c23254g;
        this.f122039b = i13;
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        int i13 = c12185e.f40626z;
        C23254g c23254g = this.f122038a;
        if (i13 != -1) {
            c12185e.m33790i(i13, c12185e.f40621E, c23254g.f92135x);
        } else {
            c12185e.m33790i(c12185e.f40624x, c12185e.f40625y, c23254g.f92135x);
        }
        int i14 = c12185e.f40624x;
        int i15 = c12185e.f40625y;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f122039b;
        int iM36284n = AbstractC12889b.m36284n(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - c23254g.f92135x.length(), 0, ((C5057p) c12185e.f40622F).m15860c());
        c12185e.m33792k(iM36284n, iM36284n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29860a)) {
            return false;
        }
        C29860a c29860a = (C29860a) obj;
        return AbstractC22676k.m65745e(this.f122038a.f92135x, c29860a.f122038a.f92135x) && this.f122039b == c29860a.f122039b;
    }

    public final int hashCode() {
        return (this.f122038a.f92135x.hashCode() * 31) + this.f122039b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CommitTextCommand(text='");
        sb4.append(this.f122038a.f92135x);
        sb4.append("', newCursorPosition=");
        return AbstractC11895b.m31999r(sb4, this.f122039b, ')');
    }

    public C29860a(String str, int i13) {
        this(new C23254g(str), i13);
    }
}
