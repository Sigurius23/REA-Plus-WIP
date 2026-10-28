package live.hms.video.connection;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.C3060t1;
import bc3.InterfaceC3055s;
import hms.webrtc.DataChannel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import live.hms.video.utils.HMSLogger;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m65681d2 = {"Llive/hms/video/connection/HMSDataChannel;", "", "Lhms/webrtc/DataChannel;", "nativeChannel", "Llive/hms/video/connection/HMSDataChannel$Observer;", "observer", "", "metadata", "<init>", "(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V", "message", "", "send", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "close", "()V", "toString", "()Ljava/lang/String;", "Lhms/webrtc/DataChannel;", "Llive/hms/video/connection/HMSDataChannel$Observer;", "Ljava/lang/String;", "Lbc3/s;", "channelOpenDeferred", "Lbc3/s;", "label", "getLabel", "", "id", "I", "getId", "()I", "Companion", "Observer", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSDataChannel {
    private static final String TAG = "HMSDataChannel";
    private final InterfaceC3055s channelOpenDeferred;
    private final int id;
    private final String label;
    private final String metadata;
    private final DataChannel nativeChannel;
    private final Observer observer;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/connection/HMSDataChannel$Observer;", "", "", "value", "Ll83/a0;", "onMessage", "(Ljava/lang/String;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public interface Observer {
        void onMessage(String value);
    }

    /* JADX INFO: renamed from: live.hms.video.connection.HMSDataChannel$send$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.connection.HMSDataChannel", m100430f = "HMSDataChannel.kt", m100431l = {73}, m100432m = "send")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241151 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C241151(InterfaceC30057d<? super C241151> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSDataChannel.this.send(null, this);
        }
    }

    public HMSDataChannel(DataChannel nativeChannel, Observer observer, String metadata) {
        AbstractC22676k.m65750j(nativeChannel, "nativeChannel");
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.nativeChannel = nativeChannel;
        this.observer = observer;
        this.metadata = metadata;
        C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        this.channelOpenDeferred = c3058tM8707a;
        String strLabel = nativeChannel.label();
        AbstractC22676k.m65749i(strLabel, "label(...)");
        this.label = strLabel;
        this.id = nativeChannel.m49548id();
        HMSLogger.INSTANCE.m71139i(TAG, "Created data channel " + this);
        if (nativeChannel.state() == DataChannel.State.OPEN) {
            c3058tM8707a.m8807L(Boolean.TRUE);
        }
        nativeChannel.registerObserver(new DataChannel.Observer() { // from class: live.hms.video.connection.HMSDataChannel.1
            @Override // hms.webrtc.DataChannel.Observer
            public void onBufferedAmountChange(long previousAmount) {
                HMSLogger.m71136d(HMSDataChannel.TAG, "[" + HMSDataChannel.this.metadata + "] onBufferedAmountChange: previousAmount=" + previousAmount);
            }

            @Override // hms.webrtc.DataChannel.Observer
            public void onMessage(DataChannel.Buffer buffer) {
                AbstractC22676k.m65750j(buffer, "buffer");
                String string = StandardCharsets.UTF_8.decode(buffer.data).toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                HMSLogger.m71136d(HMSDataChannel.TAG, "[" + HMSDataChannel.this.metadata + "] onMessage: label=" + HMSDataChannel.this.getLabel() + ", [size=" + string.length() + "] message=" + string);
                HMSDataChannel.this.observer.onMessage(string);
            }

            @Override // hms.webrtc.DataChannel.Observer
            public void onStateChange() {
                DataChannel.State state = HMSDataChannel.this.nativeChannel.state();
                HMSLogger.m71136d(HMSDataChannel.TAG, "[" + HMSDataChannel.this.metadata + "] onStateChanged: state=" + state);
                if (state == DataChannel.State.OPEN) {
                    ((C3058t) HMSDataChannel.this.channelOpenDeferred).m8807L(Boolean.TRUE);
                }
            }
        });
    }

    public final void close() {
        HMSLogger.m71136d(TAG, "Closing " + this + " START");
        try {
            this.nativeChannel.unregisterObserver();
            this.nativeChannel.close();
            this.nativeChannel.dispose();
        } catch (IllegalStateException e5) {
            HMSLogger.INSTANCE.m71142w(TAG, "[" + this.metadata + "] Could not close " + this + " cleanly", e5);
        }
        HMSLogger.m71136d(TAG, "Closing " + this + " DONE");
    }

    public final int getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object send(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C241151 c241151;
        HMSDataChannel hMSDataChannel;
        if (interfaceC30057d instanceof C241151) {
            c241151 = (C241151) interfaceC30057d;
            int i13 = c241151.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241151.label = i13 - Integer.MIN_VALUE;
            } else {
                c241151 = new C241151(interfaceC30057d);
            }
        } else {
            c241151 = new C241151(interfaceC30057d);
        }
        Object obj = c241151.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c241151.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!((C3060t1) this.channelOpenDeferred).isCompleted()) {
                InterfaceC3055s interfaceC3055s = this.channelOpenDeferred;
                c241151.L$0 = this;
                c241151.L$1 = str;
                c241151.label = 1;
                if (((C3058t) interfaceC3055s).m8817m(c241151) == enumC31071a) {
                    return enumC31071a;
                }
            }
            hMSDataChannel = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c241151.L$1;
            hMSDataChannel = (HMSDataChannel) c241151.L$0;
            AbstractC34132o.m107864I(obj);
        }
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC22676k.m65749i(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        HMSLogger.m71136d(TAG, "[" + hMSDataChannel.metadata + "] Sending [size=" + str.length() + "] message=" + str);
        boolean zSend = false;
        try {
            zSend = hMSDataChannel.nativeChannel.send(new DataChannel.Buffer(byteBufferWrap, false));
        } catch (IllegalStateException unused) {
            HMSLogger.m71137e(TAG, "Cannot send msg via data as it has been disposed");
        }
        return Boolean.valueOf(zSend);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSDataChannel{id=");
        sb4.append(this.id);
        sb4.append(", label=");
        sb4.append(this.label);
        sb4.append(", metadata=[");
        return AbstractC25012a.m73376i(this.metadata, "]}", sb4);
    }

    public /* synthetic */ HMSDataChannel(DataChannel dataChannel, Observer observer, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataChannel, observer, (i13 & 4) != 0 ? "" : str);
    }
}
