package p412q3;

import com.google.android.material.textfield.C5057p;
import e93.AbstractC12889b;
import p088dc.AbstractC11895b;
import p094dn.C12185e;
import p294l3.C23254g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C29889w implements InterfaceC29874h {

    /* JADX INFO: renamed from: a */
    public final C23254g f122120a;

    /* JADX INFO: renamed from: b */
    public final int f122121b;

    public C29889w(String str, int i13) {
        this.f122120a = new C23254g(str);
        this.f122121b = i13;
    }

    @Override // p412q3.InterfaceC29874h
    /* JADX INFO: renamed from: a */
    public final void mo30730a(C12185e c12185e) {
        int i13 = c12185e.f40626z;
        C23254g c23254g = this.f122120a;
        if (i13 != -1) {
            int i14 = c12185e.f40621E;
            String str = c23254g.f92135x;
            String str2 = c23254g.f92135x;
            c12185e.m33790i(i13, i14, str);
            if (str2.length() > 0) {
                c12185e.m33791j(i13, str2.length() + i13);
            }
        } else {
            int i15 = c12185e.f40624x;
            int i16 = c12185e.f40625y;
            String str3 = c23254g.f92135x;
            String str4 = c23254g.f92135x;
            c12185e.m33790i(i15, i16, str3);
            if (str4.length() > 0) {
                c12185e.m33791j(i15, str4.length() + i15);
            }
        }
        int i17 = c12185e.f40624x;
        int i18 = c12185e.f40625y;
        int i19 = i17 == i18 ? i18 : -1;
        int i24 = this.f122121b;
        int iM36284n = AbstractC12889b.m36284n(i24 > 0 ? (i19 + i24) - 1 : (i19 + i24) - c23254g.f92135x.length(), 0, ((C5057p) c12185e.f40622F).m15860c());
        c12185e.m33792k(iM36284n, iM36284n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29889w)) {
            return false;
        }
        C29889w c29889w = (C29889w) obj;
        return AbstractC22676k.m65745e(this.f122120a.f92135x, c29889w.f122120a.f92135x) && this.f122121b == c29889w.f122121b;
    }

    public final int hashCode() {
        return (this.f122120a.f92135x.hashCode() * 31) + this.f122121b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetComposingTextCommand(text='");
        sb4.append(this.f122120a.f92135x);
        sb4.append("', newCursorPosition=");
        return AbstractC11895b.m31999r(sb4, this.f122121b, ')');
    }
}
