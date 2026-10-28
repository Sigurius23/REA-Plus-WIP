package live.hms.video.signal.jsonrpc;

import l83.C23454a0;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.signal.HMSSignalMethod;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$join$res$1", m100430f = "JSONRpcSignal.kt", m100431l = {212}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/connection/models/HMSSessionDescription;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class JSONRpcSignal$join$res$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ HMSParams.Join $params;
    int label;
    final /* synthetic */ JSONRpcSignal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONRpcSignal$join$res$1(JSONRpcSignal jSONRpcSignal, HMSParams.Join join, InterfaceC30057d<? super JSONRpcSignal$join$res$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = jSONRpcSignal;
        this.$params = join;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new JSONRpcSignal$join$res$1(this.this$0, this.$params, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        JSONRpcSignal jSONRpcSignal = this.this$0;
        HMSSignalMethod hMSSignalMethod = HMSSignalMethod.JOIN;
        HMSParams.Join join = this.$params;
        this.label = 1;
        Object objCall = jSONRpcSignal.call(hMSSignalMethod, join, HMSSessionDescription.class, this);
        return objCall == enumC31071a ? enumC31071a : objCall;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d) {
        return ((JSONRpcSignal$join$res$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
