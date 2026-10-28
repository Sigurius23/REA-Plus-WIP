package io.getstream.chat.android.client.api.interceptor;

import ae3.C0801i;
import io.getstream.chat.android.client.api.models.ProgressRequestBody;
import io.getstream.chat.android.client.utils.ProgressCallback;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/ProgressInterceptor;", "Lud3/g0;", "<init>", "()V", "Lud3/o0;", "request", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "progressCallback", "wrapRequest", "(Lud3/o0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lud3/o0;", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ProgressInterceptor implements InterfaceC34816g0 {
    private final C34832o0 wrapRequest(C34832o0 request, ProgressCallback progressCallback) {
        C34830n0 c34830n0M109907b = request.m109907b();
        AbstractC34846v0 abstractC34846v0 = request.f146715d;
        AbstractC22676k.m65747g(abstractC34846v0);
        c34830n0M109907b.m109904e("POST", new ProgressRequestBody(abstractC34846v0, progressCallback));
        return new C34832o0(c34830n0M109907b);
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        ProgressCallback progressCallback = (ProgressCallback) c34832o0.m109908c(ProgressCallback.class);
        return progressCallback != null ? c0801i.m1939b(wrapRequest(c34832o0, progressCallback)) : c0801i.m1939b(c34832o0);
    }
}
