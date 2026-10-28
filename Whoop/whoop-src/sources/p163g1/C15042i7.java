package p163g1;

import ec3.C13036f1;
import java.util.Map;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.i7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15042i7 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Map f56309w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f56310x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13036f1 f56311y;

    /* JADX INFO: renamed from: z */
    public int f56312z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15042i7(C13036f1 c13036f1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f56311y = c13036f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56310x = obj;
        this.f56312z |= Integer.MIN_VALUE;
        return this.f56311y.m36560b(null, this);
    }
}
