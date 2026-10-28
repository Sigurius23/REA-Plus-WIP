package a30;

import a00.C0072g;
import android.content.Context;
import b10.C2222b;
import b20.C2326f;
import bz.InterfaceC3704c;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import h10.C16605a;
import i10.C17851a;
import java.util.Set;
import l20.C23236a;
import n20.C26168c;
import p012ab.C0684i0;
import p023ay.C2151y;
import p352ny.C27232d;
import p352ny.C27236h;
import p442qy.C30765d;
import p499t9.C33647p;
import p599wz.C37734l1;
import p599wz.C37751r0;
import p631xz.C38721f0;
import p631xz.C38737n0;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p664yy.C39873n;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30063j;
import tz.C34274a;
import u00.C34377e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: a30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0279c implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f979w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f980x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f981y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f982z;

    public /* synthetic */ C0279c(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, int i13) {
        this.f979w = i13;
        this.f980x = interfaceC35521h;
        this.f981y = interfaceC35521h2;
        this.f982z = interfaceC35521h3;
    }

    /* JADX INFO: renamed from: a */
    public static C27236h m817a(C27232d isStripeTerminalSdkAvailable, C27232d terminalWrapper, C2326f errorReporter, Context applicationContext, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(isStripeTerminalSdkAvailable, "isStripeTerminalSdkAvailable");
        AbstractC22676k.m65750j(terminalWrapper, "terminalWrapper");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(workContext, "workContext");
        return new C27236h();
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f979w) {
            case 0:
                return new C0072g((C23236a) this.f980x.get(), (EventReporter$Mode) this.f981y.get(), this.f982z, new C34377e(11));
            case 1:
                return new C0288f((C0291g) this.f980x.get(), (C0286e0) this.f981y.get(), (C38737n0) this.f982z.get(), new C34377e(11), new C33647p(8));
            case 2:
                return new C2222b((Context) this.f980x.get(), (Set) this.f982z.get(), (InterfaceC4339a) this.f981y.get());
            case 3:
                Context application = (Context) this.f980x.get();
                InterfaceC30063j coroutineContext = (InterfaceC30063j) this.f981y.get();
                C30765d logger = (C30765d) this.f982z.get();
                AbstractC22676k.m65750j(application, "application");
                AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
                AbstractC22676k.m65750j(logger, "logger");
                return new C39873n(application, new C0684i0(coroutineContext, logger, 14), logger, new C29938w0(application));
            case 4:
                return new C16605a((C2326f) this.f980x.get(), new C2151y(), (InterfaceC4339a) this.f981y.get(), (Set) this.f982z.get());
            case 5:
                return m817a(new C27232d(), new C27232d(), (C2326f) this.f980x.get(), (Context) this.f981y.get(), (InterfaceC30063j) this.f982z.get());
            case 6:
                return new C17851a((C37751r0) this.f980x.get(), (C38737n0) this.f981y.get(), (C38721f0) this.f982z.get());
            case 7:
                C38737n0 linkStore = (C38737n0) this.f980x.get();
                C37734l1 linkConfigurationCoordinator = (C37734l1) this.f981y.get();
                C26168c linkAnalyticsComponentFactory = (C26168c) this.f982z.get();
                AbstractC22676k.m65750j(linkStore, "linkStore");
                AbstractC22676k.m65750j(linkConfigurationCoordinator, "linkConfigurationCoordinator");
                AbstractC22676k.m65750j(linkAnalyticsComponentFactory, "linkAnalyticsComponentFactory");
                return new C17851a(linkConfigurationCoordinator, linkAnalyticsComponentFactory.m77713a().m77687a(), linkStore);
            case 8:
                return new C34274a((Context) this.f980x.get(), (C30765d) this.f981y.get(), (C2326f) this.f982z.get());
            default:
                C39865j analyticsRequestExecutor = (C39865j) this.f980x.get();
                AbstractC39851c analyticsRequestFactory = (AbstractC39851c) this.f981y.get();
                InterfaceC3704c durationProvider = (InterfaceC3704c) this.f982z.get();
                AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
                AbstractC22676k.m65750j(analyticsRequestFactory, "analyticsRequestFactory");
                AbstractC22676k.m65750j(durationProvider, "durationProvider");
                return new C29938w0(analyticsRequestExecutor, analyticsRequestFactory, durationProvider);
        }
    }
}
