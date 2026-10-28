package le3;

import c93.InterfaceC4339a;
import java.io.Closeable;
import l83.C23454a0;
import p459rf.C31341l;
import p715kotlin.jvm.internal.C22669g0;
import ug.C34913b;
import ug.EnumC34931t;
import ve.C35920e;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: le3.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C23882c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94435w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f94436x;

    public /* synthetic */ C23882c(C22669g0 c22669g0, int i13) {
        this.f94435w = i13;
        this.f94436x = c22669g0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f94435w) {
            case 0:
                AbstractC37172f.m119117b((Closeable) this.f94436x.f89336w);
                return C23454a0.f92919a;
            case 1:
                return "HttpResponse: " + ((C31341l) this.f94436x.f89336w).f128964x.f159235a;
            default:
                StringBuilder sb4 = new StringBuilder("Obtained credentials from profile; expiration=");
                C34913b c34913bM114099a = ((C35920e) this.f94436x.f89336w).m114099a();
                sb4.append(c34913bM114099a != null ? c34913bM114099a.m110113b(EnumC34931t.f147048w) : null);
                return sb4.toString();
        }
    }
}
