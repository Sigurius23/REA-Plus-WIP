package live.hms.video.utils;

import l83.C23454a0;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.signal.init.TokenRequestOptions;
import live.hms.video.signal.init.TokenResult;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.utils.TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1", m100430f = "TokenUtils.kt", m100431l = {39}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/signal/init/TokenResult;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ HMSAgentOs $agentOs;
    final /* synthetic */ TokenRequest $tokenRequest;
    final /* synthetic */ TokenRequestOptions $tokenRequestOptions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1(TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSAgentOs hMSAgentOs, InterfaceC30057d<? super TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.$tokenRequest = tokenRequest;
        this.$tokenRequestOptions = tokenRequestOptions;
        this.$agentOs = hMSAgentOs;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1(this.$tokenRequest, this.$tokenRequestOptions, this.$agentOs, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        TokenUtils tokenUtils = TokenUtils.INSTANCE;
        TokenRequest tokenRequest = this.$tokenRequest;
        TokenRequestOptions tokenRequestOptions = this.$tokenRequestOptions;
        HMSAgentOs hMSAgentOs = this.$agentOs;
        this.label = 1;
        Object token = tokenUtils.getToken(tokenRequest, tokenRequestOptions, hMSAgentOs, this);
        return token == enumC31071a ? enumC31071a : token;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super TokenResult> interfaceC30057d) {
        return ((TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
