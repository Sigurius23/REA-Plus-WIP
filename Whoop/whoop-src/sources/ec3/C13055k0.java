package ec3;

import p040c0.C3723a0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13055k0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f45117E;

    /* JADX INFO: renamed from: w */
    public C3723a0 f45118w;

    /* JADX INFO: renamed from: x */
    public Object f45119x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45120y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3723a0 f45121z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13055k0(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45121z = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45120y = obj;
        this.f45117E |= Integer.MIN_VALUE;
        return this.f45121z.emit(null, this);
    }
}
