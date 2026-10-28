package live.hms.video.signal.jsonrpc;

import l83.C23454a0;
import live.hms.video.signal.HMSSignalMethod;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import org.json.JSONObject;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$stopRtmpAndRecording$result$1", m100430f = "JSONRpcSignal.kt", m100431l = {349}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class JSONRpcSignal$stopRtmpAndRecording$result$1 extends AbstractC32275i implements Function1 {
    int label;
    final /* synthetic */ JSONRpcSignal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONRpcSignal$stopRtmpAndRecording$result$1(JSONRpcSignal jSONRpcSignal, InterfaceC30057d<? super JSONRpcSignal$stopRtmpAndRecording$result$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = jSONRpcSignal;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new JSONRpcSignal$stopRtmpAndRecording$result$1(this.this$0, interfaceC30057d);
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
        HMSSignalMethod hMSSignalMethod = HMSSignalMethod.RTMP_STOP;
        HMSParams.RtmpStop rtmpStop = new HMSParams.RtmpStop(null, 1, null);
        this.label = 1;
        Object objCall = jSONRpcSignal.call(hMSSignalMethod, rtmpStop, JSONObject.class, this);
        return objCall == enumC31071a ? enumC31071a : objCall;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
        return ((JSONRpcSignal$stopRtmpAndRecording$result$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
