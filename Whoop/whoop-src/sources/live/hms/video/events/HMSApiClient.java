package live.hms.video.events;

import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.signal.init.ShortCodeInput;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSAgentOs;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34842t0;
import ud3.C34844u0;
import ud3.C34850x0;
import va3.AbstractC35854l;
import yb3.C39412p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/events/HMSApiClient;", "", "<init>", "()V", "Llive/hms/video/database/entity/AnalyticsEntityModel;", "analyticsEntityModel", "", "token", "Llive/hms/video/utils/HMSAgentOs;", "hmsAgentOs", "Lud3/o0;", "makeEventRequest", "(Llive/hms/video/database/entity/AnalyticsEntityModel;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;", "Llive/hms/video/signal/init/TokenRequest;", "tokenRequest", "baseUrl", "makeTokenRequest$lib_release", "(Llive/hms/video/signal/init/TokenRequest;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;", "makeTokenRequest", "makeLayoutRequest$lib_release", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;", "makeLayoutRequest", "", "reportAnalyticsEvent", "(Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSApiClient {
    public static final HMSApiClient INSTANCE = new HMSApiClient();
    private static final String TAG = "HMSApiClient";

    private HMSApiClient() {
    }

    private final C34832o0 makeEventRequest(AnalyticsEntityModel analyticsEntityModel, String token, HMSAgentOs hmsAgentOs) {
        String userAgent = hmsAgentOs.getUserAgent();
        String str = analyticsEntityModel.isQa() ? HMSConstantsKt.EVENT_NON_PROD_URL : HMSConstantsKt.EVENT_PROD_URL;
        C39412p c39412p = C34818h0.f146589e;
        C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("application/json; charset=utf-8");
        String json = GsonUtils.INSTANCE.getGson().toJson(analyticsEntityModel);
        C34844u0 c34844u0 = AbstractC34846v0.Companion;
        AbstractC22676k.m65747g(json);
        c34844u0.getClass();
        C34842t0 c34842t0M109925b = C34844u0.m109925b(json, c34818h0M5373J);
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(str);
        c34830n0.m109900a(hmsAgentOs.getUSER_AGENT_V2_NAME(), userAgent);
        c34830n0.m109900a(TokenAuthInterceptor.AUTH_HEADER, "Bearer " + token);
        c34830n0.m109900a("Accept-Type", "application/json");
        c34830n0.m109904e("POST", c34842t0M109925b);
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        HMSLogger.m71136d(TAG, "makeEventRequest: request=" + c34832o0);
        return c34832o0;
    }

    public final C34832o0 makeLayoutRequest$lib_release(String token, String baseUrl, HMSAgentOs hmsAgentOs) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(hmsAgentOs, "hmsAgentOs");
        String userAgent = hmsAgentOs.getUserAgent();
        C39412p c39412p = C34818h0.f146589e;
        AbstractC1772c1.m5373J("application/json; charset=utf-8");
        if (baseUrl == null || baseUrl.length() == 0) {
            baseUrl = HMSConstantsKt.LAYOUT_URL;
        }
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(baseUrl.concat("/v2/layouts/ui"));
        c34830n0.m109900a(hmsAgentOs.getUSER_AGENT_V2_NAME(), userAgent);
        c34830n0.m109900a(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(token));
        c34830n0.m109900a("Accept-Type", "application/json");
        return new C34832o0(c34830n0);
    }

    public final C34832o0 makeTokenRequest$lib_release(TokenRequest tokenRequest, String baseUrl, HMSAgentOs hmsAgentOs) {
        AbstractC22676k.m65750j(tokenRequest, "tokenRequest");
        AbstractC22676k.m65750j(hmsAgentOs, "hmsAgentOs");
        String userAgent = hmsAgentOs.getUserAgent();
        C39412p c39412p = C34818h0.f146589e;
        C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("application/json; charset=utf-8");
        String json = GsonUtils.INSTANCE.getGson().toJson(new ShortCodeInput(tokenRequest.getRoomCode(), tokenRequest.getUserId()));
        C34844u0 c34844u0 = AbstractC34846v0.Companion;
        AbstractC22676k.m65747g(json);
        c34844u0.getClass();
        C34842t0 c34842t0M109925b = C34844u0.m109925b(json, c34818h0M5373J);
        if (baseUrl == null || baseUrl.length() == 0) {
            baseUrl = HMSConstantsKt.TOKEN_URL;
        }
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(baseUrl.concat("/v2/token"));
        c34830n0.m109900a(hmsAgentOs.getUSER_AGENT_V2_NAME(), userAgent);
        c34830n0.m109904e("POST", c34842t0M109925b);
        return new C34832o0(c34830n0);
    }

    public final Object reportAnalyticsEvent(AnalyticsEntityModel analyticsEntityModel, HMSAgentOs hMSAgentOs, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C34832o0 c34832o0MakeEventRequest = makeEventRequest(analyticsEntityModel, analyticsEntityModel.getToken(), hMSAgentOs);
        C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        try {
            C34850x0 c34850x0M131549e = OkHttpFactory.INSTANCE.getClient().m109898b(c34832o0MakeEventRequest).m131549e();
            try {
                if (c34850x0M131549e.f146788Q) {
                    c3058tM8707a.m8807L(Boolean.TRUE);
                } else {
                    c3058tM8707a.m8807L(Boolean.FALSE);
                }
                c34850x0M131549e.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(c34850x0M131549e, th3);
                    throw th4;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            HMSLogger.m71137e(TAG, "kotlin.Unit");
            c3058tM8707a.m8807L(Boolean.FALSE);
        }
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }
}
