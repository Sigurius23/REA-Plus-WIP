package j92;

import ae3.C0801i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29219w;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j92.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj92/q;", "Lud3/g0;", "Ll83/h;", "Liy1/c;", "metricWriter", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Ll83/h;Lbc3/c0;Ltr2/n;)V", "Lud3/x0;", "response", "Lud3/o0;", "request", "Ll83/a0;", "e", "(Lud3/x0;Lud3/o0;)V", "", "d", "(Lud3/o0;)Ljava/lang/String;", "Lud3/f0;", "chain", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "x", "Lbc3/c0;", "y", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21449q implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j92.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.ResponseMetricsLoggerInterceptor$insertApiResponseToMetrics$1", m100430f = "ResponseMetricsLoggerInterceptor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C34832o0 f82399F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C34850x0 f82400G;

        /* JADX INFO: renamed from: w */
        Object f82401w;

        /* JADX INFO: renamed from: x */
        Object f82402x;

        /* JADX INFO: renamed from: y */
        int f82403y;

        /* JADX INFO: renamed from: z */
        int f82404z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34832o0 c34832o0, C34850x0 c34850x0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f82399F = c34832o0;
            this.f82400G = c34850x0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21449q.this.new a(this.f82399F, this.f82400G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82404z;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM60379d = C21449q.this.m60379d(this.f82399F);
                    if (strM60379d != null) {
                        C34850x0 c34850x0 = this.f82400G;
                        C21449q c21449q = C21449q.this;
                        C22047a c22047a = new C22047a(0, "whoop.api.status_code", null, AbstractC37056f.m118959K("http_status_code:" + c34850x0.f146792z, "http_method_name:".concat(strM60379d)), null, 17, null);
                        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) c21449q.metricWriter.getValue();
                        this.f82401w = null;
                        this.f82402x = null;
                        this.f82403y = 0;
                        this.f82404z = 1;
                        if (interfaceC21030c.mo58700a(c22047a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C21449q.this.logger.mo85230v("Failed to insert api metrics to db", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C21449q(InterfaceC23462h metricWriter, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.metricWriter = metricWriter;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final String m60379d(C34832o0 request) {
        C29219w c29219w = (C29219w) request.m109908c(C29219w.class);
        String name = c29219w != null ? c29219w.f118274c.getName() : null;
        return name != null ? name : (String) AbstractC25265s.m74100H0(request.f146714c.m109868j("X-Request-Tag"));
    }

    /* JADX INFO: renamed from: e */
    private final void m60380e(C34850x0 response, C34832o0 request) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(request, response, null), 3);
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        C34850x0 c34850x0M1939b = c0801i.m1939b(c34832o0);
        m60380e(c34850x0M1939b, c34832o0);
        return c34850x0M1939b;
    }
}
