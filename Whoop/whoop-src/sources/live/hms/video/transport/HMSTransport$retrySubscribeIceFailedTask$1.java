package live.hms.video.transport;

import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import hms.webrtc.PeerConnection;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import live.hms.video.connection.subscribe.HMSSubscribeConnection;
import live.hms.video.error.HMSAction;
import live.hms.video.transport.models.TransportCallbackTriple;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$retrySubscribeIceFailedTask$1", m100430f = "HMSTransport.kt", m100431l = {268}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$retrySubscribeIceFailedTask$1 extends AbstractC32275i implements Function1 {
    int I$0;
    int label;
    final /* synthetic */ HMSTransport this$0;

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$retrySubscribeIceFailedTask$1$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$retrySubscribeIceFailedTask$1$1", m100430f = "HMSTransport.kt", m100431l = {268}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243881 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC3055s $deferred;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243881(InterfaceC3055s interfaceC3055s, InterfaceC30057d<? super C243881> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$deferred = interfaceC3055s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C243881(this.$deferred, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C243881) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
            InterfaceC3055s interfaceC3055s = this.$deferred;
            this.label = 1;
            Object objM8817m = ((C3058t) interfaceC3055s).m8817m(this);
            return objM8817m == enumC31071a ? enumC31071a : objM8817m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSTransport$retrySubscribeIceFailedTask$1(HMSTransport hMSTransport, InterfaceC30057d<? super HMSTransport$retrySubscribeIceFailedTask$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = hMSTransport;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new HMSTransport$retrySubscribeIceFailedTask$1(this.this$0, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSLogger hMSLogger = HMSLogger.INSTANCE;
                StringBuilder sb4 = new StringBuilder("retrySubscribeIceFailedTask: Subscribe IceState=");
                HMSSubscribeConnection hMSSubscribeConnection = this.this$0.subscribeConnection;
                if (hMSSubscribeConnection == null) {
                    AbstractC22676k.m65757q("subscribeConnection");
                    throw null;
                }
                sb4.append(hMSSubscribeConnection.getIceConnectionState());
                hMSLogger.m71140v("HMSTransport", sb4.toString());
                HMSSubscribeConnection hMSSubscribeConnection2 = this.this$0.subscribeConnection;
                if (hMSSubscribeConnection2 == null) {
                    AbstractC22676k.m65757q("subscribeConnection");
                    throw null;
                }
                if (hMSSubscribeConnection2.getIceConnectionState() != PeerConnection.IceConnectionState.CONNECTED) {
                    C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                    this.this$0.callbacks.put(HMSConstantsKt.cSubscribeRenegotiationCallback, new TransportCallbackTriple(c3058tM8707a, HMSAction.RestartIce, null, 4, null));
                    C243881 c243881 = new C243881(c3058tM8707a, null);
                    this.I$0 = 1;
                    this.label = 1;
                    if (AbstractC3028k2.m8748b(60000L, c243881, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                i13 = 1;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                AbstractC34132o.m107864I(obj);
            }
        } catch (TimeoutCancellationException unused) {
            this.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
            i13 = 0;
        }
        return Boolean.valueOf(i13 != 0);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((HMSTransport$retrySubscribeIceFailedTask$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
