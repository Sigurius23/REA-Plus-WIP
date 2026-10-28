package live.hms.video.transport;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$signalObserver$1", m100430f = "HMSTransport.kt", m100431l = {296, 314, 326}, m100432m = "onOffer")
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$signalObserver$1$onOffer$1 extends AbstractC32269c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HMSTransport$signalObserver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSTransport$signalObserver$1$onOffer$1(HMSTransport$signalObserver$1 hMSTransport$signalObserver$1, InterfaceC30057d<? super HMSTransport$signalObserver$1$onOffer$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = hMSTransport$signalObserver$1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onOffer(null, this);
    }
}
