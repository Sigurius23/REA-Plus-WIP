package live.hms.video.connection.publish;

import android.util.Log;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.CandidatePairChangeEvent;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: live.hms.video.connection.publish.HMSPublishConnection$nativeObserver$1$onSelectedCandidatePairChanged$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.publish.HMSPublishConnection$nativeObserver$1$onSelectedCandidatePairChanged$1", m100430f = "HMSPublishConnection.kt", m100431l = {76}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class C24119xa8e3b5a3 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ CandidatePairChangeEvent $event;
    final /* synthetic */ IPublishConnectionObserver $observer;
    int label;
    final /* synthetic */ HMSPublishConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24119xa8e3b5a3(HMSPublishConnection hMSPublishConnection, IPublishConnectionObserver iPublishConnectionObserver, CandidatePairChangeEvent candidatePairChangeEvent, InterfaceC30057d<? super C24119xa8e3b5a3> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSPublishConnection;
        this.$observer = iPublishConnectionObserver;
        this.$event = candidatePairChangeEvent;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C24119xa8e3b5a3(this.this$0, this.$observer, this.$event, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((C24119xa8e3b5a3) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.this$0.getIsClose()) {
                Log.d("HMSPublishConnection", "Ignoring onIceConnectionChange as connection is closed");
                return c23454a0;
            }
            IPublishConnectionObserver iPublishConnectionObserver = this.$observer;
            CandidatePairChangeEvent candidatePairChangeEvent = this.$event;
            this.label = 1;
            if (iPublishConnectionObserver.onSelectedCandidatePairChanged(candidatePairChangeEvent, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }
}
