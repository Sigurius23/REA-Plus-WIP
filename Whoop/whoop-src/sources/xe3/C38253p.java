package xe3;

import aa3.C0656u0;
import af3.AbstractC0822a;
import af3.C0847w;
import af3.C0849y;
import bf3.C3205d;
import cf3.AbstractC4545a;
import java.util.ArrayList;
import p012ab.C0690l0;
import p047c9.C4320k;
import p108e4.AbstractC12682p;
import p188ha.C17039h;
import p477s2.AbstractC32076h;
import ze3.AbstractC40598b;

/* JADX INFO: renamed from: xe3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C38253p extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final C0847w f164019a = new C0847w();

    /* JADX INFO: renamed from: b */
    public final C38249l f164020b = new C38249l();

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public final void mo14221a(C3205d c3205d) {
        String str;
        C38249l c38249l = this.f164020b;
        ArrayList arrayList = c38249l.f164003b;
        arrayList.add(c3205d);
        if (c38249l.f164002a == 6) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c3205d);
        C0690l0 c0690l0 = new C0690l0(arrayList2);
        while (c0690l0.m1735e()) {
            int iM35485e = AbstractC12682p.m35485e(c38249l.f164002a);
            if (iM35485e == 0) {
                c0690l0.m1745o();
                if (!c0690l0.m1740j('[')) {
                    c38249l.f164002a = 6;
                    return;
                }
                c38249l.f164002a = 2;
                c38249l.f164006e = new StringBuilder();
                if (!c0690l0.m1735e()) {
                    c38249l.f164006e.append('\n');
                }
            } else {
                if (iM35485e == 1) {
                    C4320k c4320kM1743m = c0690l0.m1743m();
                    if (AbstractC32076h.m99780n(c0690l0)) {
                        c38249l.f164006e.append(c0690l0.m1734d(c4320kM1743m, c0690l0.m1743m()).m1644m());
                        if (!c0690l0.m1735e()) {
                            c38249l.f164006e.append('\n');
                        } else if (c0690l0.m1740j(']') && c0690l0.m1740j(':') && c38249l.f164006e.length() <= 999 && !AbstractC40598b.m131676a(c38249l.f164006e.toString()).isEmpty()) {
                            c38249l.f164002a = 3;
                            c0690l0.m1745o();
                        }
                    }
                    c38249l.f164002a = 6;
                    return;
                }
                if (iM35485e == 2) {
                    c0690l0.m1745o();
                    C4320k c4320kM1743m2 = c0690l0.m1743m();
                    if (AbstractC32076h.m99779l(c0690l0)) {
                        String strM1644m = c0690l0.m1734d(c4320kM1743m2, c0690l0.m1743m()).m1644m();
                        if (strM1644m.startsWith("<")) {
                            strM1644m = strM1644m.substring(1, strM1644m.length() - 1);
                        }
                        c38249l.f164007f = strM1644m;
                        int iM1745o = c0690l0.m1745o();
                        if (!c0690l0.m1735e()) {
                            c38249l.f164010i = true;
                            arrayList.clear();
                        } else if (iM1745o == 0) {
                        }
                        c38249l.f164002a = 4;
                    }
                    c38249l.f164002a = 6;
                    return;
                }
                if (iM35485e != 3) {
                    if (iM35485e == 4) {
                        C4320k c4320kM1743m3 = c0690l0.m1743m();
                        if (AbstractC32076h.m99781o(c0690l0, c38249l.f164008g)) {
                            c38249l.f164009h.append(c0690l0.m1734d(c4320kM1743m3, c0690l0.m1743m()).m1644m());
                            if (c0690l0.m1735e()) {
                                c0690l0.m1739i();
                                c0690l0.m1745o();
                                if (!c0690l0.m1735e()) {
                                    c38249l.f164010i = true;
                                    c38249l.m122591a();
                                    arrayList.clear();
                                    c38249l.f164002a = 1;
                                }
                            } else {
                                c38249l.f164009h.append('\n');
                            }
                        }
                        c38249l.f164002a = 6;
                        return;
                    }
                    switch (c38249l.f164002a) {
                        case 1:
                            str = "START_DEFINITION";
                            break;
                        case 2:
                            str = "LABEL";
                            break;
                        case 3:
                            str = "DESTINATION";
                            break;
                        case 4:
                            str = "START_TITLE";
                            break;
                        case 5:
                            str = "TITLE";
                            break;
                        case 6:
                            str = "PARAGRAPH";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalStateException("Unknown parsing state: ".concat(str));
                }
                c0690l0.m1745o();
                if (c0690l0.m1735e()) {
                    c38249l.f164008g = (char) 0;
                    char cM1742l = c0690l0.m1742l();
                    if (cM1742l == '\"' || cM1742l == '\'') {
                        c38249l.f164008g = cM1742l;
                    } else if (cM1742l == '(') {
                        c38249l.f164008g = ')';
                    }
                    if (c38249l.f164008g != 0) {
                        c38249l.f164002a = 5;
                        c38249l.f164009h = new StringBuilder();
                        c0690l0.m1739i();
                        if (!c0690l0.m1735e()) {
                            c38249l.f164009h.append('\n');
                        }
                    } else {
                        c38249l.m122591a();
                        c38249l.f164002a = 1;
                    }
                } else {
                    c38249l.f164002a = 1;
                }
            }
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: b */
    public final void mo14222b(C0849y c0849y) {
        this.f164020b.f164005d.add(c0849y);
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: e */
    public final void mo14225e() {
        C38249l c38249l = this.f164020b;
        ArrayList arrayList = c38249l.f164003b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        boolean zIsEmpty = arrayList2.isEmpty();
        C0847w c0847w = this.f164019a;
        if (zIsEmpty) {
            c0847w.m2059j();
        } else {
            c0847w.m2058h(c38249l.f164005d);
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f164019a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: h */
    public final void mo14228h(C38248k c38248k) {
        ArrayList arrayList = this.f164020b.f164003b;
        C0656u0 c0656u0 = new C0656u0(2);
        ArrayList arrayList2 = c0656u0.f2286a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        c38248k.m122587e(c0656u0, this.f164019a);
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        if (c38244g.f163973i) {
            return null;
        }
        return C17039h.m48099a(c38244g.f163967c);
    }
}
