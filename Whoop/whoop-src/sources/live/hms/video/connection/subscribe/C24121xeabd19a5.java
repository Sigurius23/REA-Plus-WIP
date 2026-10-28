package live.hms.video.connection.subscribe;

import android.util.Log;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.gson.JsonObject;
import l83.C23454a0;
import live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1$onMessage$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1$onMessage$1", m100430f = "HMSSubscribeConnection.kt", m100431l = {98, 101}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class C24121xeabd19a5 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ ISubscribeConnectionObserver $observer;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ HMSSubscribeConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24121xeabd19a5(HMSSubscribeConnection hMSSubscribeConnection, String str, ISubscribeConnectionObserver iSubscribeConnectionObserver, InterfaceC30057d<? super C24121xeabd19a5> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSSubscribeConnection;
        this.$value = str;
        this.$observer = iSubscribeConnectionObserver;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C24121xeabd19a5(this.this$0, this.$value, this.$observer, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((C24121xeabd19a5) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[RETURN] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.this$0.getIsClose()) {
                Log.d("HMSSubscribeConnection", "Ignoring onDataChannel as connection is closed");
                return c23454a0;
            }
            JsonObject jsonObject = (JsonObject) GsonUtils.INSTANCE.getGson().fromJson(this.$value, JsonObject.class);
            HMSLogger.m71136d("HMSSubscribeConnection", "Incoming data channel message :: " + jsonObject);
            if (jsonObject.has("method")) {
                ISubscribeConnectionObserver iSubscribeConnectionObserver = this.$observer;
                this.label = 1;
                if (iSubscribeConnectionObserver.onApiChannelMessage(jsonObject, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                DataChannelRequestManager dataChannelRequestManager = this.this$0.dataChannelRequestManager;
                this.label = 2;
                if (dataChannelRequestManager.onResponse(jsonObject, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }
}
