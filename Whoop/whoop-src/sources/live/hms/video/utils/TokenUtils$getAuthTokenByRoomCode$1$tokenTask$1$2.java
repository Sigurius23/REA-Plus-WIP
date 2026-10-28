package live.hms.video.utils;

import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.transport.models.TransportFailureCategory;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.utils.TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2", m100430f = "TokenUtils.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llive/hms/video/transport/models/TransportFailureCategory;", "it", "Lbc3/s;", "", "<anonymous>", "(Llive/hms/video/transport/models/TransportFailureCategory;)Lbc3/s;"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2 extends AbstractC32275i implements InterfaceC4351m {
    int label;

    public TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2(InterfaceC30057d<? super TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2> interfaceC30057d) {
        super(2, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2(interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return null;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
        return ((TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2) create(transportFailureCategory, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
