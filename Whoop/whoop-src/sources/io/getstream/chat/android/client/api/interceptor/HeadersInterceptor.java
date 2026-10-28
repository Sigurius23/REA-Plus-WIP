package io.getstream.chat.android.client.api.interceptor;

import ae3.C0801i;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.utils.HeadersUtil;
import l83.InterfaceC23462h;
import p007a6.C0438l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;", "Lud3/g0;", "Lkotlin/Function0;", "", "isAnonymous", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "headersUtil", "<init>", "(Lc93/a;Lio/getstream/chat/android/client/utils/HeadersUtil;)V", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Lc93/a;", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "", "userAgent$delegate", "Ll83/h;", "getUserAgent", "()Ljava/lang/String;", "userAgent", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HeadersInterceptor implements InterfaceC34816g0 {
    private final HeadersUtil headersUtil;
    private final InterfaceC4339a isAnonymous;

    /* JADX INFO: renamed from: userAgent$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAgent;

    public HeadersInterceptor(InterfaceC4339a isAnonymous, HeadersUtil headersUtil) {
        AbstractC22676k.m65750j(isAnonymous, "isAnonymous");
        AbstractC22676k.m65750j(headersUtil, "headersUtil");
        this.isAnonymous = isAnonymous;
        this.headersUtil = headersUtil;
        this.userAgent = AbstractC30060g.m92088H(new C0438l0(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public static String m54540a(HeadersInterceptor headersInterceptor) {
        return headersInterceptor.headersUtil.buildUserAgent();
    }

    private final String getUserAgent() {
        return (String) this.userAgent.getValue();
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        String str = ((Boolean) this.isAnonymous.invoke()).booleanValue() ? CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS : "jwt";
        C0801i c0801i = (C0801i) chain;
        C34830n0 c34830n0M109907b = c0801i.f2955e.m109907b();
        c34830n0M109907b.m109900a("User-Agent", getUserAgent());
        c34830n0M109907b.m109900a("Content-Type", "application/json");
        c34830n0M109907b.m109900a("stream-auth-type", str);
        c34830n0M109907b.m109900a("X-Stream-Client", this.headersUtil.buildSdkTrackingHeaders$stream_chat_android_client_release());
        c34830n0M109907b.m109900a("Cache-Control", "no-cache");
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}
