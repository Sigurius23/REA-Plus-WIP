package yq1;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FlavorConstantsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.C20634y3;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C20466a;
import l83.C23454a0;
import nf3.C26669a;
import of3.InterfaceC27903a;
import or2.AbstractC28165h;
import or2.EnumC28168i;
import p037bu.C3633d;
import p505ts.AbstractC34132o;
import p624xs.C38632a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.C31773j;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vd1.C35909c;
import yb3.AbstractC39414r;
import yu0.C39785b;

/* JADX INFO: renamed from: yq1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lyq1/a;", "Lof3/a;", "", "buildFlavor", "Lor2/i;", "buildDistribution", "Lyq1/b;", "sentryInitializerWrapper", "<init>", "(Ljava/lang/String;Lor2/i;Lyq1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lor2/i;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Ll83/a0;", "d", "(Landroid/content/Context;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "x", "Lor2/i;", "y", "Lyq1/b;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39711a implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String buildFlavor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final EnumC28168i buildDistribution;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C39712b sentryInitializerWrapper;

    /* JADX INFO: renamed from: yq1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.initializer.SentryInitializerHelper$initialize$1$2$1", m100430f = "SentryInitializerHelper.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170951w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20321e5 f170953y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20321e5 c20321e5, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170953y = c20321e5;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39711a.this.new a(this.f170953y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170951w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39785b c39785b = (C39785b) C39711a.this.getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39785b.class), null);
                C20466a c20466aMo56538d = this.f170953y.f76884x.mo56538d();
                Boolean bool = c20466aMo56538d != null ? c20466aMo56538d.f76602K : null;
                this.f170951w = 1;
                if (c39785b.m127496c(bool, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C39711a(String buildFlavor, EnumC28168i buildDistribution, C39712b sentryInitializerWrapper) {
        AbstractC22676k.m65750j(buildFlavor, "buildFlavor");
        AbstractC22676k.m65750j(buildDistribution, "buildDistribution");
        AbstractC22676k.m65750j(sentryInitializerWrapper, "sentryInitializerWrapper");
        this.buildFlavor = buildFlavor;
        this.buildDistribution = buildDistribution;
        this.sentryInitializerWrapper = sentryInitializerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m127083e(Context context, C39711a c39711a, SentryAndroidOptions options) {
        AbstractC22676k.m65750j(options, "options");
        options.setTracesSampler(new C38632a(22));
        options.setCacheDirPath(context.getCacheDir().getPath());
        options.setEnvironment(c39711a.m127086h(c39711a.buildFlavor, c39711a.buildDistribution));
        options.setBeforeSend(new C35909c(c39711a, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Double m127084f(C20634y3 context) {
        AbstractC22676k.m65750j(context, "context");
        return Double.valueOf(C31773j.f131576w.m98651a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C20321e5 m127085g(C39711a c39711a, C20321e5 event, C20337g0 c20337g0) throws Throwable {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(c20337g0, "<unused var>");
        if (event.m56482f() != null) {
            AbstractC3006f0.m8699E(C30064k.f122676w, c39711a.new a(event, null));
        }
        return event;
    }

    /* JADX INFO: renamed from: h */
    private final String m127086h(String buildFlavor, EnumC28168i buildDistribution) {
        if (AbstractC39414r.m125876U(buildFlavor, FlavorConstantsKt.FLAVOR_PROD, true)) {
            return buildDistribution == EnumC28168i.PLAY_PROD_MEMBER ? "production" : "enterprise";
        }
        return "dev";
    }

    /* JADX INFO: renamed from: d */
    public final void m127087d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.sentryInitializerWrapper.m127088a(context, new C3633d(8, context, this));
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    public /* synthetic */ C39711a(String str, EnumC28168i enumC28168i, C39712b c39712b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "prodStandard" : str, (i13 & 2) != 0 ? AbstractC28165h.m85267c("play_prod_member") : enumC28168i, (i13 & 4) != 0 ? new C39712b() : c39712b);
    }
}
