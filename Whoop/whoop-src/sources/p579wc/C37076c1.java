package p579wc;

import p368og.InterfaceC27910g;
import p421qd.C30286a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37076c1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37079d1 f158615E;

    /* JADX INFO: renamed from: F */
    public int f158616F;

    /* JADX INFO: renamed from: w */
    public InterfaceC27910g f158617w;

    /* JADX INFO: renamed from: x */
    public C37079d1 f158618x;

    /* JADX INFO: renamed from: y */
    public C30286a f158619y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f158620z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37076c1(C37079d1 c37079d1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158615E = c37079d1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158620z = obj;
        this.f158616F |= Integer.MIN_VALUE;
        return this.f158615E.mo79294b(null, this);
    }
}
