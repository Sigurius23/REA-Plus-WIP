package live.hms.video.connection.subscribe;

import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.DataChannel;
import l83.C23454a0;
import live.hms.video.connection.HMSDataChannel;
import live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onDataChannel$1", m100430f = "HMSSubscribeConnection.kt", m100431l = {80, 106}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class HMSSubscribeConnection$nativeObserver$1$onDataChannel$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ DataChannel $dataChannel;
    final /* synthetic */ ISubscribeConnectionObserver $observer;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HMSSubscribeConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSSubscribeConnection$nativeObserver$1$onDataChannel$1(HMSSubscribeConnection hMSSubscribeConnection, DataChannel dataChannel, ISubscribeConnectionObserver iSubscribeConnectionObserver, InterfaceC30057d<? super HMSSubscribeConnection$nativeObserver$1$onDataChannel$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSSubscribeConnection;
        this.$dataChannel = dataChannel;
        this.$observer = iSubscribeConnectionObserver;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new HMSSubscribeConnection$nativeObserver$1$onDataChannel$1(this.this$0, this.$dataChannel, this.$observer, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((HMSSubscribeConnection$nativeObserver$1$onDataChannel$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        HMSDataChannel hMSDataChannel;
        HMSSubscribeConnection hMSSubscribeConnection;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 != 0) {
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMSSubscribeConnection = (HMSSubscribeConnection) this.L$1;
            hMSDataChannel = (HMSDataChannel) this.L$0;
            AbstractC34132o.m107864I(obj);
            hMSSubscribeConnection.api = hMSDataChannel;
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        if (this.this$0.getIsClose()) {
            Log.d("HMSSubscribeConnection", "Ignoring onDataChannel as connection is closed");
            return c23454a0;
        }
        if (AbstractC22676k.m65745e(this.$dataChannel.label(), HMSConstantsKt.cApiDataChannelLabel)) {
            HMSSubscribeConnection hMSSubscribeConnection2 = this.this$0;
            DataChannel dataChannel = this.$dataChannel;
            final HMSSubscribeConnection hMSSubscribeConnection3 = this.this$0;
            final ISubscribeConnectionObserver iSubscribeConnectionObserver = this.$observer;
            hMSDataChannel = new HMSDataChannel(dataChannel, new HMSDataChannel.Observer() { // from class: live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onDataChannel$1.1
                @Override // live.hms.video.connection.HMSDataChannel.Observer
                public void onMessage(String value) {
                    AbstractC22676k.m65750j(value, "value");
                    AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C24121xeabd19a5(hMSSubscribeConnection3, value, iSubscribeConnectionObserver, null), 3);
                }
            }, "role=" + this.this$0.getRole());
            DataChannelRequestManager dataChannelRequestManager = this.this$0.dataChannelRequestManager;
            this.L$0 = hMSDataChannel;
            this.L$1 = hMSSubscribeConnection2;
            this.label = 2;
            if (dataChannelRequestManager.updateDataChannel(hMSDataChannel, this) != enumC31071a) {
                hMSSubscribeConnection = hMSSubscribeConnection2;
                hMSSubscribeConnection.api = hMSDataChannel;
                return c23454a0;
            }
        } else {
            ISubscribeConnectionObserver iSubscribeConnectionObserver2 = this.$observer;
            DataChannel dataChannel2 = this.$dataChannel;
            this.label = 1;
            if (iSubscribeConnectionObserver2.onDataChannel(dataChannel2, this) != enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }
}
