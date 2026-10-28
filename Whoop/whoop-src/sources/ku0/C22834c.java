package ku0;

import l83.C23454a0;
import p329n0.C26048a;
import p329n0.C26068u;
import p389p0.C28529i0;
import p500tb.InterfaceC33687a;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import yt0.C39767f;

/* JADX INFO: renamed from: ku0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22834c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f90003x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f90004y;

    public /* synthetic */ C22834c(Object obj, int i13, int i14) {
        this.f90002w = i14;
        this.f90004y = obj;
        this.f90003x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90002w) {
            case 0:
                return ((C22835d) this.f90004y).m66215i(this.f90003x, (InterfaceC33687a) obj);
            case 1:
                C28529i0 c28529i0 = (C28529i0) obj;
                C26048a c26048a = ((C26068u) this.f90004y).f103218a;
                AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                C39615a.m126591g(abstractC39957fM126587c, C39615a.m126589e(abstractC39957fM126587c), abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null);
                c26048a.getClass();
                int iM86829a = c28529i0.m86829a() == -1 ? 2 : c28529i0.m86829a();
                for (int i13 = 0; i13 < iM86829a; i13++) {
                    c28529i0.m86830b(this.f90003x + i13);
                }
                return C23454a0.f92919a;
            default:
                return ((C39767f) this.f90004y).m127311t(this.f90003x, (InterfaceC33687a) obj);
        }
    }
}
