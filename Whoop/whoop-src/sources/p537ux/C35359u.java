package p537ux;

import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import e93.AbstractC12889b;
import l83.C23465k;
import m30.C24991g;
import p663yx.C39838b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import v10.C35525a;

/* JADX INFO: renamed from: ux.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C35359u implements InterfaceC35361w {

    /* JADX INFO: renamed from: a */
    public final C32132a f150627a;

    /* JADX INFO: renamed from: b */
    public final C35525a f150628b;

    public C35359u(C32132a host, C35525a c35525a) {
        AbstractC22676k.m65750j(host, "host");
        this.f150627a = host;
        this.f150628b = c35525a;
    }

    @Override // s40.InterfaceC32135b
    /* JADX INFO: renamed from: b */
    public final void mo6700b(Object obj) {
        C39838b c39838b = (C39838b) obj;
        C32132a c32132a = this.f150627a;
        Integer num = c32132a.f133154b;
        String objectId = c39838b.f172026w;
        int i13 = c39838b.f172027x;
        String clientSecret = c39838b.f172028y;
        String url = c39838b.f172029z;
        String str = c39838b.f172015E;
        boolean z4 = c39838b.f172016F;
        C24991g c24991g = c39838b.f172017G;
        String str2 = c39838b.f172018H;
        boolean z13 = c39838b.f172019I;
        boolean z14 = c39838b.f172020J;
        String publishableKey = c39838b.f172022L;
        boolean z15 = c39838b.f172023M;
        String str3 = c39838b.f172024N;
        boolean z16 = c39838b.f172025O;
        AbstractC22676k.m65750j(objectId, "objectId");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        c32132a.m100080a((AbstractC22676k.m65745e(c39838b.f172015E, this.f150628b.m112681a()) || c39838b.f172023M) ? StripeBrowserLauncherActivity.class : PaymentAuthWebViewActivity.class, AbstractC12889b.m36273g(new C23465k("extra_args", new C39838b(objectId, i13, clientSecret, url, str, z4, c24991g, str2, z13, z14, num, publishableKey, z15, str3, z16))), c39838b.f172027x);
    }
}
