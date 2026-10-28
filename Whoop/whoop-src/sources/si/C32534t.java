package si;

import java.util.ArrayList;
import java.util.List;
import p502ti.C33825h;
import p502ti.InterfaceC33818a;
import p649yi.C39562q;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.t */
/* JADX INFO: loaded from: classes.dex */
public final class C32534t implements InterfaceC32517c, InterfaceC33818a {

    /* JADX INFO: renamed from: a */
    public final boolean f134834a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f134835b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f134836c;

    /* JADX INFO: renamed from: d */
    public final C33825h f134837d;

    /* JADX INFO: renamed from: e */
    public final C33825h f134838e;

    /* JADX INFO: renamed from: f */
    public final C33825h f134839f;

    public C32534t(AbstractC40652b abstractC40652b, C39562q c39562q) {
        this.f134834a = c39562q.f170213e;
        this.f134836c = c39562q.f170209a;
        C33825h c33825hMo84473k0 = c39562q.f170210b.mo84473k0();
        this.f134837d = c33825hMo84473k0;
        C33825h c33825hMo84473k1 = c39562q.f170211c.mo84473k0();
        this.f134838e = c33825hMo84473k1;
        C33825h c33825hMo84473k2 = c39562q.f170212d.mo84473k0();
        this.f134839f = c33825hMo84473k2;
        abstractC40652b.m131926f(c33825hMo84473k0);
        abstractC40652b.m131926f(c33825hMo84473k1);
        abstractC40652b.m131926f(c33825hMo84473k2);
        c33825hMo84473k0.m106977a(this);
        c33825hMo84473k1.m106977a(this);
        c33825hMo84473k2.m106977a(this);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f134835b;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((InterfaceC33818a) arrayList.get(i13)).mo101529a();
            i13++;
        }
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
    }

    /* JADX INFO: renamed from: d */
    public final void m101544d(InterfaceC33818a interfaceC33818a) {
        this.f134835b.add(interfaceC33818a);
    }
}
