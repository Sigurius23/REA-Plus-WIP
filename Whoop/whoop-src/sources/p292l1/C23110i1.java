package p292l1;

import e93.AbstractC12889b;
import hm.C17417d;
import ih0.AbstractC18489d0;
import p294l3.C23254g;
import p316m1.C24922t;
import p412q3.C29869e0;
import p412q3.InterfaceC29873g0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: l1.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23110i1 implements InterfaceC29873g0 {

    /* JADX INFO: renamed from: a */
    public final C24922t f91295a;

    /* JADX INFO: renamed from: b */
    public final int f91296b;

    /* JADX INFO: renamed from: c */
    public final int f91297c;

    /* JADX INFO: renamed from: d */
    public final int f91298d;

    /* JADX INFO: renamed from: e */
    public final C17417d f91299e;

    public C23110i1(C24922t c24922t) {
        this.f91295a = c24922t;
        String str = c24922t.f97605a;
        char c3 = c24922t.f97606b;
        this.f91296b = AbstractC39414r.m125887f0(str, c3, 0, false, 6);
        this.f91297c = AbstractC39414r.m125892k0(str, c3, 0, 6);
        this.f91298d = c24922t.f97607c.length();
        this.f91299e = new C17417d(this, 28);
    }

    @Override // p412q3.InterfaceC29873g0
    /* JADX INFO: renamed from: a */
    public final C29869e0 mo43546a(C23254g c23254g) {
        String strM125857C0 = c23254g.f92135x;
        int length = strM125857C0.length();
        int i13 = 0;
        int i14 = this.f91298d;
        if (length > i14) {
            strM125857C0 = AbstractC39414r.m125857C0(strM125857C0, AbstractC12889b.m36278i0(0, i14));
        }
        String string = "";
        int i15 = 0;
        while (i13 < strM125857C0.length()) {
            int i16 = i15 + 1;
            string = string + strM125857C0.charAt(i13);
            if (i16 == this.f91296b || i15 + 2 == this.f91297c) {
                StringBuilder sbM53374o = AbstractC18489d0.m53374o(string);
                sbM53374o.append(this.f91295a.f97606b);
                string = sbM53374o.toString();
            }
            i13++;
            i15 = i16;
        }
        return new C29869e0(new C23254g(string), this.f91299e);
    }
}
