package p180h0;

import bc3.InterfaceC3027k1;
import p040c0.C3723a0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16385f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f62997E;

    /* JADX INFO: renamed from: w */
    public Object f62998w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3027k1 f62999x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63000y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3723a0 f63001z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16385f(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f63001z = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63000y = obj;
        this.f62997E |= Integer.MIN_VALUE;
        return this.f63001z.emit(null, this);
    }
}
