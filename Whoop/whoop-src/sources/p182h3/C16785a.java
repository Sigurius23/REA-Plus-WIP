package p182h3;

import p636y3.C39179k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C16785a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f64520E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ ScrollCaptureCallbackC16787c f64521F;

    /* JADX INFO: renamed from: G */
    public int f64522G;

    /* JADX INFO: renamed from: w */
    public Object f64523w;

    /* JADX INFO: renamed from: x */
    public C39179k f64524x;

    /* JADX INFO: renamed from: y */
    public int f64525y;

    /* JADX INFO: renamed from: z */
    public int f64526z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16785a(ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64521F = scrollCaptureCallbackC16787c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64520E = obj;
        this.f64522G |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC16787c.m47335a(this.f64521F, null, null, this);
    }
}
