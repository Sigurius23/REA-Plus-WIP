package p579wc;

import p368og.InterfaceC27910g;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C37086g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158650E;

    /* JADX INFO: renamed from: w */
    public InterfaceC27910g f158651w;

    /* JADX INFO: renamed from: x */
    public String f158652x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158653y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37092i f158654z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37086g(C37092i c37092i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158654z = c37092i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158653y = obj;
        this.f158650E |= Integer.MIN_VALUE;
        return this.f158654z.mo79294b(null, this);
    }
}
