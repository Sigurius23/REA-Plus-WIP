package p105e1;

import hg3.AbstractC17269i;
import p249jc.AbstractC21598x;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.C39172d;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12515b {

    /* JADX INFO: renamed from: h */
    public static C12515b f42722h;

    /* JADX INFO: renamed from: a */
    public final EnumC39181m f42723a;

    /* JADX INFO: renamed from: b */
    public final C23285v0 f42724b;

    /* JADX INFO: renamed from: c */
    public final C39172d f42725c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC28770h f42726d;

    /* JADX INFO: renamed from: e */
    public final C23285v0 f42727e;

    /* JADX INFO: renamed from: f */
    public float f42728f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f42729g = Float.NaN;

    public C12515b(EnumC39181m enumC39181m, C23285v0 c23285v0, C39172d c39172d, InterfaceC28770h interfaceC28770h) {
        this.f42723a = enumC39181m;
        this.f42724b = c23285v0;
        this.f42725c = c39172d;
        this.f42726d = interfaceC28770h;
        this.f42727e = AbstractC21598x.m60695p0(c23285v0, enumC39181m);
    }

    /* JADX INFO: renamed from: a */
    public final long m35164a(int i13, long j7) {
        int iM124766j;
        float f13 = this.f42729g;
        float f14 = this.f42728f;
        if (Float.isNaN(f13) || Float.isNaN(f14)) {
            String str = AbstractC12516c.f42730a;
            long jM124770b = AbstractC39170b.m124770b(0, 0, 15);
            C23285v0 c23285v0 = this.f42727e;
            C39172d c39172d = this.f42725c;
            float fM67290b = AbstractC17269i.m48892g(str, c23285v0, jM124770b, c39172d, this.f42726d, 1, 96).m67290b();
            float fM67290b2 = AbstractC17269i.m48892g(AbstractC12516c.f42731b, this.f42727e, AbstractC39170b.m124770b(0, 0, 15), c39172d, this.f42726d, 2, 96).m67290b() - fM67290b;
            this.f42729g = fM67290b;
            this.f42728f = fM67290b2;
            f14 = fM67290b2;
            f13 = fM67290b;
        }
        if (i13 != 1) {
            int iRound = Math.round((f14 * (i13 - 1)) + f13);
            iM124766j = iRound >= 0 ? iRound : 0;
            int iM124764h = C39169a.m124764h(j7);
            if (iM124766j > iM124764h) {
                iM124766j = iM124764h;
            }
        } else {
            iM124766j = C39169a.m124766j(j7);
        }
        return AbstractC39170b.m124769a(C39169a.m124767k(j7), C39169a.m124765i(j7), iM124766j, C39169a.m124764h(j7));
    }
}
