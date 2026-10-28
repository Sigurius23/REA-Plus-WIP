package uz;

import ec3.InterfaceC13062m;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C35397k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150815w;

    /* JADX INFO: renamed from: x */
    public int f150816x;

    /* JADX INFO: renamed from: y */
    public InterfaceC13062m f150817y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C35398l f150818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35397k(C35398l c35398l, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f150818z = c35398l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150815w = obj;
        this.f150816x |= Integer.MIN_VALUE;
        return this.f150818z.emit(null, this);
    }
}
