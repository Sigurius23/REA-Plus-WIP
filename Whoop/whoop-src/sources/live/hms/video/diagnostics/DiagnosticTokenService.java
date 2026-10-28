package live.hms.video.diagnostics;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import java.io.IOException;
import live.hms.video.diagnostics.models.DiagnosticTokenResponse;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSLogger;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/diagnostics/DiagnosticTokenService;", "", "<init>", "()V", "", "region", "userId", "Lud3/o0;", "makeDiagnosticTokenRequest", "(Ljava/lang/String;Ljava/lang/String;)Lud3/o0;", "Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;", "getDiagnosticRoomToken", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DiagnosticTokenService {
    public static final DiagnosticTokenService INSTANCE = new DiagnosticTokenService();
    private static final String TAG = "GetDiagnosticTokenService";

    private DiagnosticTokenService() {
    }

    private final C34832o0 makeDiagnosticTokenRequest(String region, String userId) {
        String strConcat = (region == null || region.length() == 0) ? HMSConstantsKt.cDefaultDiagnosticEndpoint : "https://api.100ms.live/v2/diagnostics/token?region=".concat(region);
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(strConcat);
        c34830n0.m109900a("Accept-Type", "application/json");
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        HMSLogger.m71136d(TAG, "Request to get diagnostic token: " + c34832o0);
        return c34832o0;
    }

    public final Object getDiagnosticRoomToken(String str, String str2, InterfaceC30057d<? super DiagnosticTokenResponse> interfaceC30057d) {
        C34832o0 c34832o0MakeDiagnosticTokenRequest = makeDiagnosticTokenRequest(str, str2);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        OkHttpFactory.INSTANCE.getClient().m109898b(c34832o0MakeDiagnosticTokenRequest).m131548d(new InterfaceC34823k() { // from class: live.hms.video.diagnostics.DiagnosticTokenService.getDiagnosticRoomToken.2
            @Override // ud3.InterfaceC34823k
            public void onFailure(InterfaceC34821j call, IOException e5) {
                AbstractC22676k.m65750j(call, "call");
                AbstractC22676k.m65750j(e5, "e");
                HMSLogger.INSTANCE.m71138e(DiagnosticTokenService.TAG, String.valueOf(e5.getMessage()), e5);
                ErrorFactory.APIErrors aPIErrors = ErrorFactory.APIErrors.INSTANCE;
                ErrorFactory.Action action = ErrorFactory.Action.DIAGNOSTICS;
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
                HMSLogger.m71136d(DiagnosticTokenService.TAG, "response=" + response);
                int i13 = response.f146792z;
                if (i13 != 200) {
                    ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.APIErrors.HTTPError$default(ErrorFactory.APIErrors.INSTANCE, i13, ErrorFactory.Action.DIAGNOSTICS, "Received " + response.f146791y, null, null, 24, null));
                    return;
                }
                AbstractC34799a1 abstractC34799a1 = response.f146778G;
                String str3 = (abstractC34799a1 == null || (strM109860m = abstractC34799a1.m109860m()) == null) ? "" : strM109860m;
                try {
                    DiagnosticTokenResponse diagnosticTokenResponse = (DiagnosticTokenResponse) GsonUtils.INSTANCE.getGson().fromJson(str3, DiagnosticTokenResponse.class);
                    HMSLogger.m71136d(DiagnosticTokenService.TAG, "Response :: " + diagnosticTokenResponse);
                    InterfaceC3055s interfaceC3055s = c3058tM8707a;
                    AbstractC22676k.m65747g(diagnosticTokenResponse);
                    ((C3058t) interfaceC3055s).m8807L(diagnosticTokenResponse);
                } catch (Exception e5) {
                    ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
                    ErrorFactory.Action action = ErrorFactory.Action.DIAGNOSTICS;
                    String message = e5.getMessage();
                    HMSException hMSExceptionJsonParsingFailed$default = ErrorFactory.GenericErrors.JsonParsingFailed$default(genericErrors, action, str3, message == null ? "" : message, e5, null, 16, null);
                    HMSLogger.INSTANCE.m71138e(DiagnosticTokenService.TAG, "Diagnostic token Service: " + hMSExceptionJsonParsingFailed$default.getMessage(), hMSExceptionJsonParsingFailed$default);
                    ((C3058t) c3058tM8707a).completeExceptionally(hMSExceptionJsonParsingFailed$default);
                }
            }
        });
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }
}
