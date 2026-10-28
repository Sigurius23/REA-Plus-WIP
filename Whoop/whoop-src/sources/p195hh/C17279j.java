package p195hh;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: hh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17279j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f66425E;

    /* JADX INFO: renamed from: w */
    public C17280k f66426w;

    /* JADX INFO: renamed from: x */
    public InterfaceC17278i f66427x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f66428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C17280k f66429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17279j(C17280k c17280k, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f66429z = c17280k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66428y = obj;
        this.f66425E |= Integer.MIN_VALUE;
        return this.f66429z.m48925b(null, this);
    }
}
