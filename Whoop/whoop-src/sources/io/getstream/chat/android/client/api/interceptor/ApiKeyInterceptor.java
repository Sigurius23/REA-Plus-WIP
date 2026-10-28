package io.getstream.chat.android.client.api.interceptor;

import ae3.C0801i;
import com.iterable.iterableapi.C5378v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;", "Lud3/g0;", "", "apiKey", "<init>", "(Ljava/lang/String;)V", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Ljava/lang/String;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ApiKeyInterceptor implements InterfaceC34816g0 {
    private static final String PARAM_API_KEY = "api_key";
    private final String apiKey;

    public ApiKeyInterceptor(String apiKey) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        C5378v c5378vM109878g = c34832o0.f146712a.m109878g();
        c5378vM109878g.m16525a(PARAM_API_KEY, this.apiKey);
        C34810e0 c34810e0M16526b = c5378vM109878g.m16526b();
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.f146687a = c34810e0M16526b;
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}
