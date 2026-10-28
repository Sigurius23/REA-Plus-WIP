package p579wc;

import gf.InterfaceC15761b;
import p368og.InterfaceC27910g;
import p421qd.C30286a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37088g1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public String f158657E;

    /* JADX INFO: renamed from: F */
    public C30286a f158658F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f158659G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C37091h1 f158660H;

    /* JADX INFO: renamed from: I */
    public int f158661I;

    /* JADX INFO: renamed from: w */
    public InterfaceC15761b f158662w;

    /* JADX INFO: renamed from: x */
    public InterfaceC27910g f158663x;

    /* JADX INFO: renamed from: y */
    public C37091h1 f158664y;

    /* JADX INFO: renamed from: z */
    public C37071b f158665z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37088g1(C37091h1 c37091h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158660H = c37091h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158659G = obj;
        this.f158661I |= Integer.MIN_VALUE;
        return this.f158660H.mo79294b(null, this);
    }
}
