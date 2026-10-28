package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13019b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public InterfaceC13062m f45009E;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45010w;

    /* JADX INFO: renamed from: x */
    public int f45011x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13015a0 f45012y;

    /* JADX INFO: renamed from: z */
    public C13015a0 f45013z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13019b0(C13015a0 c13015a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45012y = c13015a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45010w = obj;
        this.f45011x |= Integer.MIN_VALUE;
        return this.f45012y.collect(null, this);
    }
}
