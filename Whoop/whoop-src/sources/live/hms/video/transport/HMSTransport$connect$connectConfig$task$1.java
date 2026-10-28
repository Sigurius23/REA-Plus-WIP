package live.hms.video.transport;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$connect$connectConfig$task$1", m100430f = "HMSTransport.kt", m100431l = {942}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$connect$connectConfig$task$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ C22669g0 $configClosure;
    final /* synthetic */ String $endpoint;
    final /* synthetic */ Function1 $initSdkStoreFlags;
    final /* synthetic */ String $peerId;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ HMSTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSTransport$connect$connectConfig$task$1(C22669g0 c22669g0, HMSTransport hMSTransport, String str, String str2, String str3, Function1 function1, InterfaceC30057d<? super HMSTransport$connect$connectConfig$task$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.$configClosure = c22669g0;
        this.this$0 = hMSTransport;
        this.$token = str;
        this.$endpoint = str2;
        this.$peerId = str3;
        this.$initSdkStoreFlags = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new HMSTransport$connect$connectConfig$task$1(this.$configClosure, this.this$0, this.$token, this.$endpoint, this.$peerId, this.$initSdkStoreFlags, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Exception {
        C22669g0 c22669g0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C22669g0 c22669g1 = this.$configClosure;
            HMSTransport hMSTransport = this.this$0;
            String str = this.$token;
            String str2 = this.$endpoint;
            String str3 = this.$peerId;
            Function1 function1 = this.$initSdkStoreFlags;
            this.L$0 = c22669g1;
            this.label = 1;
            Object objInternalConnect = hMSTransport.internalConnect(str, str2, str3, function1, this);
            if (objInternalConnect == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g1;
            obj = objInternalConnect;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) this.L$0;
            AbstractC34132o.m107864I(obj);
        }
        c22669g0.f89336w = obj;
        return Boolean.TRUE;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((HMSTransport$connect$connectConfig$task$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
