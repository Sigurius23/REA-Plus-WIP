package live.hms.video.sdk;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$transportObserver$1", m100430f = "SDKDelegate.kt", m100431l = {162, 163, 286}, m100432m = "onNotification")
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SDKDelegate$transportObserver$1$onNotification$1 extends AbstractC32269c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SDKDelegate$transportObserver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKDelegate$transportObserver$1$onNotification$1(SDKDelegate$transportObserver$1 sDKDelegate$transportObserver$1, InterfaceC30057d<? super SDKDelegate$transportObserver$1$onNotification$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = sDKDelegate$transportObserver$1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onNotification(null, this);
    }
}
