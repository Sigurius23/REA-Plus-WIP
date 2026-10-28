package se3;

import a33.C0352d;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0840p;
import af3.C0849y;
import cg3.C4576a;
import cg3.C4577b;
import cg3.EnumC4578c;
import cg3.InterfaceC4579d;
import dg3.C12012a;
import java.util.List;
import p000.AbstractC11266d;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: se3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C32427a extends AbstractC36259c {

    /* JADX INFO: renamed from: w */
    public int f134248w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32428b f134249x;

    public C32427a(C32428b c32428b) {
        this.f134249x = c32428b;
    }

    @Override // p558vp.AbstractC36259c, af3.InterfaceC0827c0
    /* JADX INFO: renamed from: j */
    public final void mo2046j(C0823a0 c0823a0) {
        if (this.f134248w == 0) {
            String str = c0823a0.f3019g;
            List listM2056e = c0823a0.m2056e();
            C0849y c0849y = listM2056e.size() == 1 ? (C0849y) listM2056e.get(0) : null;
            C0352d c0352d = this.f134249x.f134250a;
            c0352d.getClass();
            if (str == null) {
                throw new NullPointerException("input must not be null");
            }
            C4577b c4577b = new C4577b(str, new C4576a(c0352d, str));
            AbstractC0844t abstractC0844t = c0823a0;
            while (c4577b.hasNext()) {
                InterfaceC4579d interfaceC4579d = (InterfaceC4579d) c4577b.next();
                if (abstractC0844t == c0823a0 && !c4577b.hasNext() && !(interfaceC4579d instanceof C12012a)) {
                    return;
                }
                int beginIndex = interfaceC4579d.getBeginIndex();
                int endIndex = interfaceC4579d.getEndIndex();
                C0823a0 c0823a1 = new C0823a0(str.substring(beginIndex, endIndex));
                if (c0849y != null) {
                    c0823a1.m2054b(new C0849y(c0849y.f3049a, beginIndex, endIndex - beginIndex));
                }
                if (interfaceC4579d instanceof C12012a) {
                    String strM30461o = c0823a1.f3019g;
                    if (((C12012a) interfaceC4579d).f39742w == EnumC4578c.f18439x) {
                        strM30461o = AbstractC11266d.m30461o("mailto:", strM30461o);
                    }
                    C0840p c0840p = new C0840p(strM30461o, null);
                    c0840p.m2055c(c0823a1);
                    c0840p.m2058h(c0823a1.m2056e());
                    abstractC0844t.m2057f(c0840p);
                    abstractC0844t = c0840p;
                } else {
                    abstractC0844t.m2057f(c0823a1);
                    abstractC0844t = c0823a1;
                }
            }
            c0823a0.m2059j();
        }
    }

    @Override // p558vp.AbstractC36259c, af3.InterfaceC0827c0
    /* JADX INFO: renamed from: r */
    public final void mo2050r(C0840p c0840p) {
        this.f134248w++;
        m115715r0(c0840p);
        this.f134248w--;
    }
}
