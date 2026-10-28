package si;

import java.util.List;
import p426qi.C30402w;
import p502ti.AbstractC33821d;
import p502ti.InterfaceC33818a;
import p649yi.C39556k;
import p649yi.C39557l;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.q */
/* JADX INFO: loaded from: classes.dex */
public final class C32531q implements InterfaceC33818a, InterfaceC32517c {

    /* JADX INFO: renamed from: a */
    public final C30402w f134819a;

    /* JADX INFO: renamed from: b */
    public final AbstractC33821d f134820b;

    /* JADX INFO: renamed from: c */
    public C39557l f134821c;

    public C32531q(C30402w c30402w, AbstractC40652b abstractC40652b, C39556k c39556k) {
        this.f134819a = c30402w;
        AbstractC33821d abstractC33821dMo84473k0 = c39556k.m126328b().mo84473k0();
        this.f134820b = abstractC33821dMo84473k0;
        abstractC40652b.m131926f(abstractC33821dMo84473k0);
        abstractC33821dMo84473k0.m106977a(this);
    }

    /* JADX INFO: renamed from: d */
    public static int m101543d(int i13, int i14) {
        int i15 = i13 / i14;
        if ((i13 ^ i14) < 0 && i15 * i14 != i13) {
            i15--;
        }
        return i13 - (i15 * i14);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134819a.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
    }
}
