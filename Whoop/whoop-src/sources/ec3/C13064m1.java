package ec3;

import p040c0.C3723a0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13064m1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f45144E;

    /* JADX INFO: renamed from: w */
    public C3723a0 f45145w;

    /* JADX INFO: renamed from: x */
    public C22669g0 f45146x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45147y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3723a0 f45148z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13064m1(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45148z = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45147y = obj;
        this.f45144E |= Integer.MIN_VALUE;
        return this.f45148z.emit(null, this);
    }
}
