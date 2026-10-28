package io.getstream.chat.android.client.api.interceptor;

import ae3.C0801i;
import io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.io.IOException;
import l83.C23465k;
import m83.AbstractC25247g0;
import ne3.C26616h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;", "Lud3/g0;", "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;", "requestsAnalyser", "<init>", "(Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;)V", "Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;", "stringOutputStream", "Lne3/h;", "buffer", "Ll83/a0;", "writeRequestBody", "(Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;Lne3/h;)V", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ApiRequestAnalyserInterceptor implements InterfaceC34816g0 {
    private final ApiRequestsAnalyser requestsAnalyser;

    public ApiRequestAnalyserInterceptor(ApiRequestsAnalyser requestsAnalyser) {
        AbstractC22676k.m65750j(requestsAnalyser, "requestsAnalyser");
        this.requestsAnalyser = requestsAnalyser;
    }

    @StreamHandsOff(reason = "Request body shouldn't be written entirely as it might produce OutOfMemory exceptions when sending big files. The output will be limited to 1048576 bytes.")
    private final void writeRequestBody(StringOutputStream stringOutputStream, C26616h buffer) throws IOException {
        buffer.m79230s1(stringOutputStream, Math.min(buffer.f105866x, 1048576L));
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws IOException {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        C26616h c26616h = new C26616h();
        StringOutputStream stringOutputStream = new StringOutputStream();
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        if (abstractC34846v0 != null) {
            abstractC34846v0.writeTo(c26616h);
        }
        writeRequestBody(stringOutputStream, c26616h);
        this.requestsAnalyser.registerRequest(c34832o0.f146712a.f146570i, AbstractC25247g0.m73989X(new C23465k("body", stringOutputStream.toString())));
        return c0801i.m1939b(c34832o0);
    }
}
