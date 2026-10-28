package p665yz;

import b10.C2222b;
import b20.C2321a;
import b20.C2326f;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bz.C3702a;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import com.stripe.android.core.exception.APIException;
import dz.AbstractC12462i;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p023ay.C2147u;
import p442qy.C30765d;
import p442qy.C30767f;
import p479s4.AbstractC32121b;
import p550vd.AbstractC35903f;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39899b {

    /* JADX INFO: renamed from: a */
    public final C39865j f172271a;

    /* JADX INFO: renamed from: b */
    public final C2222b f172272b;

    /* JADX INFO: renamed from: c */
    public final C2326f f172273c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f172274d;

    /* JADX INFO: renamed from: e */
    public final C30765d f172275e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3704c f172276f;

    public C39899b(C39865j analyticsRequestExecutor, C2222b paymentAnalyticsRequestFactory, C2326f errorReporter, InterfaceC30063j workContext, C30765d logger, InterfaceC3704c durationProvider) {
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(durationProvider, "durationProvider");
        this.f172271a = analyticsRequestExecutor;
        this.f172272b = paymentAnalyticsRequestFactory;
        this.f172273c = errorReporter;
        this.f172274d = workContext;
        this.f172275e = logger;
        this.f172276f = durationProvider;
    }

    /* JADX INFO: renamed from: a */
    public final void m128003a(AbstractC12462i abstractC12462i, Map map) {
        this.f172275e.m94511a("Link event: " + abstractC12462i.mo7174b() + " " + map);
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f172274d), null, null, new C2147u(this, abstractC12462i, map, null, 26), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m128004b(Throwable th3) {
        m128003a(C39900c.f172293x, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("error_message", AbstractC32121b.m100006k(th3)), C2321a.m7172a(th3)));
    }

    /* JADX INFO: renamed from: c */
    public final void m128005c(EnumC39903f enumC39903f) {
        String str;
        int iOrdinal = enumC39903f.ordinal();
        if (iOrdinal == 0) {
            str = "requiresSignUp";
        } else if (iOrdinal == 1) {
            str = "requiresVerification";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "verified";
        }
        Map mapM95645u = AbstractC31061c.m95645u("sessionState", str);
        AbstractC35903f.m113990H(this.f172273c, EnumC2325e.LINK_INVALID_SESSION_STATE, null, null, 6);
        m128003a(C39900c.f172286N, mapM95645u);
    }

    /* JADX INFO: renamed from: d */
    public final void m128006d() {
        Duration durationM11527a = ((C3702a) this.f172276f).m11527a(EnumC3703b.f15153y);
        m128003a(C39900c.f172284L, durationM11527a != null ? AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Float.valueOf((float) Duration.m134298toDoubleimpl(durationM11527a.getRawValue(), DurationUnit.SECONDS)))) : null);
    }

    /* JADX INFO: renamed from: e */
    public final void m128007e(Throwable th3) {
        C30767f c30767f;
        String str;
        Map mapM95645u = null;
        if ((th3 instanceof APIException) && (c30767f = ((APIException) th3).f22155w) != null && (str = c30767f.f126703x) != null) {
            mapM95645u = AbstractC31061c.m95645u("error_message", str);
        }
        if (mapM95645u == null) {
            mapM95645u = AbstractC31061c.m95645u("error_message", AbstractC32121b.m100006k(th3));
        }
        m128003a(C39900c.f172285M, AbstractC25247g0.m73995d0(mapM95645u, C2321a.m7172a(th3)));
    }
}
