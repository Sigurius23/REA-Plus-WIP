package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13080r0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C13083s0 f45196w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45197x;

    /* JADX INFO: renamed from: y */
    public int f45198y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13083s0 f45199z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13080r0(C13083s0 c13083s0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45199z = c13083s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45197x = obj;
        this.f45198y |= Integer.MIN_VALUE;
        return this.f45199z.emit(null, this);
    }
}
