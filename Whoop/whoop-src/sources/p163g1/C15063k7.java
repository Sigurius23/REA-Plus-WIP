package p163g1;

import java.util.Map;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.k7 */
/* JADX INFO: loaded from: classes.dex */
public final class C15063k7 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f56401E;

    /* JADX INFO: renamed from: w */
    public Map f56402w;

    /* JADX INFO: renamed from: x */
    public float f56403x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56404y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15093n7 f56405z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15063k7(C15093n7 c15093n7, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f56405z = c15093n7;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56404y = obj;
        this.f56401E |= Integer.MIN_VALUE;
        return this.f56405z.m43163b(null, null, this);
    }
}
