package sr2;

import ae3.C0801i;
import android.app.Application;
import android.content.Context;
import b83.C2807c;
import bc3.AbstractC3006f0;
import bc3.C2999d1;
import bc3.InterfaceC2994c0;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.amplitude.android.engagement.AmplitudeInitOptions;
import com.amplitude.android.engagement.C4861a;
import com.iterable.iterableapi.C5317e;
import com.whoop.data.repositories.AnalyticsUserRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageChecker;
import com.whoop.data.repositories.UserRepository;
import cq0.C11059g;
import ei0.C13219b;
import ei0.InterfaceC13218a;
import fi0.C14519e;
import fi0.InterfaceC14515a;
import fi0.InterfaceC14517c;
import hc3.C17171d;
import i92.C18258c;
import in2.InterfaceC18736h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j92.InterfaceC21437e;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.C27847j;
import od1.C27858u;
import od1.C27861x;
import or2.C28162g;
import or2.InterfaceC28197r1;
import p005a3.C0237p;
import p007a6.InterfaceC0422g;
import p088dc.AbstractC11895b;
import p173gj.C15902c;
import p173gj.C15903d;
import p173gj.C15905f;
import p173gj.C15906g;
import p173gj.EnumC15904e;
import p197hj.EnumC17340w;
import p249jc.AbstractC21598x;
import p281kj.C22507b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q92.C30076h;
import qf3.C30330b;
import rf3.C31365d;
import rr2.AbstractC31774k;
import rr2.C31778o;
import rr2.InterfaceC31766c;
import rv1.C31842a;
import st0.InterfaceC32974r;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import uf3.C34911a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import we1.InterfaceC37229m;
import wf3.C37247a;
import xf3.C38266c;
import yb3.AbstractC39414r;
import z82.C40187a;
import z82.C40189c;
import z82.C40194h;
import z82.InterfaceC40188b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sr2.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ltf3/a;", "a", "Ltf3/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ltf3/a;", "buildTypeModule", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32938t {

    /* JADX INFO: renamed from: a */
    private static final C33768a f137227a;

    static {
        C33768a c33768a = new C33768a();
        m103907k(c33768a);
        f137227a = c33768a;
    }

    /* JADX INFO: renamed from: k */
    private static final C23454a0 m103907k(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C32931m c32931m = new C32931m(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c32931m, 1)), false);
        C32931m c32931m2 = new C32931m(25);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass2, null, c32931m2, 1);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c);
        C31365d c31365d = new C31365d(c30330b);
        module.m106774b(strM60669Y, c31365d, false);
        hashSet.add(c31365d);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31365d.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31365d, true);
        C32931m c32931m3 = new C32931m(26);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C40194h.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, null, c32931m3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false, "amplitude");
        C32931m c32931m4 = new C32931m(27);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C15906g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r, c32931m4, 1)), false);
        C32931m c32931m5 = new C32931m(28);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15903d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c32931m5, 1)), false);
        C32931m c32931m6 = new C32931m(29);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC14517c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c32931m6, 1)), false);
        C32936r c32936r = new C32936r(0);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C4861a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c32936r, 1)), false);
        C32936r c32936r2 = new C32936r(1);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC13218a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c32936r2, 1)), false);
        C32936r c32936r3 = new C32936r(2);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC21437e.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass9, null, c32936r3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC31766c m103908l(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC31774k.m98653a((InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C28162g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), (C31778o) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31778o.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC40188b m103909m(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C40189c c40189c = new C40189c(AbstractC37056f.m118959K(single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40194h.class), null), single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14517c.class), null)), (AnalyticsUserRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AnalyticsUserRepository.class), null), (C30076h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null));
        c40189c.mo41420b();
        return c40189c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C40194h m103910n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("LoggingAnalytics");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40194h(interfaceC34116nM107848a, (AnalyticsUserRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AnalyticsUserRepository.class), null), (C30076h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C15906g m103911o(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        if (AbstractC39414r.m125890i0("4483d4bb0e3f071613d0cc2546aacc65")) {
            throw new IllegalStateException("The AMPLITUDE_API_KEY environment variable is not set!");
        }
        Application applicationM88531h = AbstractC29125c.m88531h(single);
        C15905f c15905f = new C15905f();
        m103912p(c15905f);
        return new C15906g(applicationM88531h, AbstractC25265s.m74103I1(c15905f.f60150a));
    }

    /* JADX INFO: renamed from: p */
    private static final C23454a0 m103912p(C15905f autocaptureOptions) {
        AbstractC22676k.m65750j(autocaptureOptions, "$this$autocaptureOptions");
        EnumC15904e enumC15904e = autocaptureOptions.f60151b;
        AbstractC22676k.m65750j(enumC15904e, "<this>");
        autocaptureOptions.f60150a.add(enumC15904e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C15903d m103913q(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "amplitude");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C15906g configuration = (C15906g) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C15906g.class), c35953cM73387t);
        AbstractC22676k.m65750j(configuration, "configuration");
        C0237p c0237p = new C0237p(8);
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3006f0.m8710d());
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC22676k.m65749i(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        C2999d1 c2999d1 = new C2999d1(executorServiceNewCachedThreadPool);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        C2999d1 c2999d2 = new C2999d1(executorServiceNewSingleThreadExecutor);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor()");
        C15903d c15903d = new C15903d(configuration, c0237p, c17171dM8708b, c2999d1, c2999d2, new C2999d1(executorServiceNewSingleThreadExecutor2));
        Runtime.getRuntime().addShutdownHook(new C15902c(c15903d, 0));
        if (configuration.f60169r.contains(EnumC15904e.f60147x)) {
            Context context = configuration.f60153b;
            AbstractC22676k.m65748h(context, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) context;
            C5317e c5317e = c15903d.f60143p;
            if (c5317e == null) {
                AbstractC22676k.m65757q("activityLifecycleCallbacks");
                throw null;
            }
            application.registerActivityLifecycleCallbacks(c5317e);
        }
        if (((FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null)).isFeatureEnabled("android-enable-amplitude-survey-sdk")) {
            C4861a c4861a = (C4861a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C4861a.class), null);
            c4861a.getClass();
            c15903d.m44881a(new C22507b(c4861a));
        }
        return c15903d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC14517c m103914r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40187a((C27847j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null), (C11059g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C31842a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), (InterfaceC37229m) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37229m.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C27861x) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27861x.class), null), (UserRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UserRepository.class), null), (InterfaceC18736h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18736h.class), null), (C30076h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C15903d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15903d.class), null), (C14519e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C14519e.class), null), InterfaceC34116n.INSTANCE.m107848a("AmplitudeAnalyticsManager"), (C18258c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C18258c.class), null), (LanguageChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageChecker.class), null), (C28162g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), (InterfaceC28197r1) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null), (InterfaceC4368h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), (InterfaceC32974r) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null), (InterfaceC13218a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13218a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C4861a m103915s(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C4861a(AbstractC29125c.m88531h(single), ((C15906g) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15906g.class), new C35953c("amplitude"))).f60152a, new AmplitudeInitOptions((EnumC17340w) null, (String) null, (String) null, (String) null, (String) null, (AmplitudeInitOptions.Options) null, 63, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC13218a m103916t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13219b((C4861a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C4861a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC21437e m103917u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C32937s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C34850x0 m103918v(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        return c0801i.m1939b(c0801i.f2955e);
    }

    /* JADX INFO: renamed from: w */
    public static final C33768a m103919w() {
        return f137227a;
    }
}
