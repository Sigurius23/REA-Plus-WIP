package io.getstream.chat.android.client.api.interceptor;

import ae3.C0801i;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.errors.ChatRequestError;
import io.getstream.chat.android.client.parser.ChatParser;
import io.getstream.chat.android.client.token.TokenManager;
import n23.C26200c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;", "Lud3/g0;", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "Lkotlin/Function0;", "", "isAnonymous", "<init>", "(Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/parser/ChatParser;Lc93/a;)V", "Lud3/o0;", "request", "addTokenHeader", "(Lud3/o0;)Lud3/o0;", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Lio/getstream/chat/android/client/token/TokenManager;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lc93/a;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TokenAuthInterceptor implements InterfaceC34816g0 {
    public static final String AUTH_HEADER = "Authorization";
    private final InterfaceC4339a isAnonymous;
    private final ChatParser parser;
    private final TokenManager tokenManager;

    public TokenAuthInterceptor(TokenManager tokenManager, ChatParser parser, InterfaceC4339a isAnonymous) {
        AbstractC22676k.m65750j(tokenManager, "tokenManager");
        AbstractC22676k.m65750j(parser, "parser");
        AbstractC22676k.m65750j(isAnonymous, "isAnonymous");
        this.tokenManager = tokenManager;
        this.parser = parser;
        this.isAnonymous = isAnonymous;
    }

    private final C34832o0 addTokenHeader(C34832o0 request) throws ChatRequestError {
        String token = this.tokenManager.getToken();
        try {
            C34830n0 c34830n0M109907b = request.m109907b();
            c34830n0M109907b.m109902c(AUTH_HEADER, token);
            return new C34832o0(c34830n0M109907b);
        } catch (IllegalArgumentException e5) {
            ChatErrorCode chatErrorCode = ChatErrorCode.INVALID_TOKEN;
            throw new ChatRequestError(AbstractC11895b.m31997p(chatErrorCode.getDescription(), ": '", token, "'"), chatErrorCode.getCode(), -1, e5);
        }
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws ChatRequestError {
        AbstractC22676k.m65750j(chain, "chain");
        if (((Boolean) this.isAnonymous.invoke()).booleanValue()) {
            C0801i c0801i = (C0801i) chain;
            return c0801i.m1939b(c0801i.f2955e);
        }
        if (!this.tokenManager.hasTokenProvider()) {
            ChatErrorCode chatErrorCode = ChatErrorCode.UNDEFINED_TOKEN;
            throw new ChatRequestError(chatErrorCode.getDescription(), chatErrorCode.getCode(), -1, null, 8, null);
        }
        this.tokenManager.ensureTokenLoaded();
        C0801i c0801i2 = (C0801i) chain;
        C34832o0 c34832o0 = c0801i2.f2955e;
        C34850x0 c34850x0M1939b = c0801i2.m1939b(addTokenHeader(c34832o0));
        if (c34850x0M1939b.f146788Q) {
            return c34850x0M1939b;
        }
        C26200c error = this.parser.toError(c34850x0M1939b);
        if (error.m77810d() != ChatErrorCode.TOKEN_EXPIRED.getCode()) {
            throw new ChatRequestError(error.mo77807a(), error.m77810d(), error.m77811e(), error.m77809c());
        }
        this.tokenManager.expireToken();
        this.tokenManager.loadSync();
        c34850x0M1939b.close();
        return c0801i2.m1939b(addTokenHeader(c34832o0));
    }
}
