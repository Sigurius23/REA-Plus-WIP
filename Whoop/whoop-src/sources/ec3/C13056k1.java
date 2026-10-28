package ec3;

import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13056k1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public InterfaceC13062m f45122E;

    /* JADX INFO: renamed from: F */
    public C22669g0 f45123F;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45124w;

    /* JADX INFO: renamed from: x */
    public int f45125x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13060l1 f45126y;

    /* JADX INFO: renamed from: z */
    public C13060l1 f45127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13056k1(C13060l1 c13060l1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45126y = c13060l1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45124w = obj;
        this.f45125x |= Integer.MIN_VALUE;
        return this.f45126y.collect(null, this);
    }
}
