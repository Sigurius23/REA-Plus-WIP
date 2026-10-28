package live.hms.video.signal.init;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.io.IOException;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSAgentOs;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSLogger;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12682p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ud3.AbstractC34799a1;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/InitService;", "", "<init>", "()V", "", "endpoint", "token", "region", "Llive/hms/video/utils/HMSAgentOs;", "hmsAgentOs", "Lud3/o0;", "makeInitRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;", "Llive/hms/video/signal/init/InitConfig;", "fetchInitConfig", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class InitService {
    public static final InitService INSTANCE = new InitService();
    private static final String TAG = "InitService";

    private InitService() {
    }

    public static /* synthetic */ Object fetchInitConfig$default(InitService initService, String str, String str2, HMSAgentOs hMSAgentOs, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            str3 = HMSConstantsKt.cDefaultInitEndpoint;
        }
        return initService.fetchInitConfig(str, str4, hMSAgentOs, str3, interfaceC30057d);
    }

    private final C34832o0 makeInitRequest(String endpoint, String token, String region, HMSAgentOs hmsAgentOs) {
        String strM31992k = AbstractC11895b.m31992k('?', endpoint, hmsAgentOs.getUserAgentUrlEncoded());
        if (AbstractC39414r.m125869O0(region).toString().length() > 0) {
            StringBuilder sbM35484d = AbstractC12682p.m35484d(strM31992k, "&region=");
            sbM35484d.append(AbstractC39414r.m125869O0(region).toString());
            strM31992k = sbM35484d.toString();
        }
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(strM31992k);
        c34830n0.m109900a(TokenAuthInterceptor.AUTH_HEADER, "Bearer " + token);
        c34830n0.m109900a("Accept-Type", "application/json");
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        HMSLogger.m71136d(TAG, "makeInitRequest: request=" + c34832o0);
        return c34832o0;
    }

    public static /* synthetic */ C34832o0 makeInitRequest$default(InitService initService, String str, String str2, String str3, HMSAgentOs hMSAgentOs, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        return initService.makeInitRequest(str, str2, str3, hMSAgentOs);
    }

    public final Object fetchInitConfig(String str, String str2, HMSAgentOs hMSAgentOs, String str3, InterfaceC30057d<? super InitConfig> interfaceC30057d) {
        C34832o0 c34832o0MakeInitRequest = makeInitRequest(str3, str, str2, hMSAgentOs);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        OkHttpFactory.INSTANCE.getClient().m109898b(c34832o0MakeInitRequest).m131548d(new InterfaceC34823k() { // from class: live.hms.video.signal.init.InitService.fetchInitConfig.2
            @Override // ud3.InterfaceC34823k
            public void onFailure(InterfaceC34821j call, IOException e5) {
                AbstractC22676k.m65750j(call, "call");
                AbstractC22676k.m65750j(e5, "e");
                HMSLogger.INSTANCE.m71138e(InitService.TAG, "fetchInitConfig: " + e5.getMessage(), e5);
                ErrorFactory.APIErrors aPIErrors = ErrorFactory.APIErrors.INSTANCE;
                ErrorFactory.Action action = ErrorFactory.Action.INIT;
                String message = e5.getMessage();
                if (message == null) {
                    message = "";
                }
                ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.APIErrors.EndpointUnreachable$default(aPIErrors, action, message, e5, null, 8, null));
            }

            @Override // ud3.InterfaceC34823k
            public void onResponse(InterfaceC34821j call, C34850x0 response) {
                String strM109860m;
                AbstractC22676k.m65750j(call, "call");
                AbstractC22676k.m65750j(response, "response");
                HMSLogger.m71136d(InitService.TAG, "fetchInitConfig: response=" + response);
                int i13 = response.f146792z;
                if (i13 != 200) {
                    ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.APIErrors.HTTPError$default(ErrorFactory.APIErrors.INSTANCE, i13, ErrorFactory.Action.INIT, "Received " + response.f146791y, null, null, 24, null));
                    return;
                }
                AbstractC34799a1 abstractC34799a1 = response.f146778G;
                String str4 = (abstractC34799a1 == null || (strM109860m = abstractC34799a1.m109860m()) == null) ? "" : strM109860m;
                try {
                    InitConfig initConfig = (InitConfig) GsonUtils.INSTANCE.getGson().fromJson(str4, InitConfig.class);
                    HMSLogger.m71136d(InitService.TAG, "fetchInitConfig: config=" + initConfig);
                    InterfaceC3055s interfaceC3055s = c3058tM8707a;
                    AbstractC22676k.m65747g(initConfig);
                    ((C3058t) interfaceC3055s).m8807L(initConfig);
                } catch (Exception e5) {
                    ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
                    ErrorFactory.Action action = ErrorFactory.Action.INIT;
                    String message = e5.getMessage();
                    HMSException hMSExceptionJsonParsingFailed$default = ErrorFactory.GenericErrors.JsonParsingFailed$default(genericErrors, action, str4, message == null ? "" : message, e5, null, 16, null);
                    HMSLogger.INSTANCE.m71138e(InitService.TAG, "fetchInitConfig: " + hMSExceptionJsonParsingFailed$default.getMessage(), hMSExceptionJsonParsingFailed$default);
                    ((C3058t) c3058tM8707a).completeExceptionally(hMSExceptionJsonParsingFailed$default);
                }
            }
        });
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }
}
