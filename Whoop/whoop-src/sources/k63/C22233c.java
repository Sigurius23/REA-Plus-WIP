package k63;

import ec3.InterfaceC13062m;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: k63.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C22233c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f86639w;

    /* JADX INFO: renamed from: x */
    public int f86640x;

    /* JADX INFO: renamed from: y */
    public InterfaceC13062m f86641y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22234d f86642z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22233c(C22234d c22234d, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f86642z = c22234d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f86639w = obj;
        this.f86640x |= Integer.MIN_VALUE;
        return this.f86642z.emit(null, this);
    }
}
