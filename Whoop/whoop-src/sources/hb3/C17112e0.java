package hb3;

import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31126h;
import r93.InterfaceC31163w0;
import sa3.InterfaceC32332f;
import va3.C35845c;

/* JADX INFO: renamed from: hb3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17112e0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65718w;

    /* JADX INFO: renamed from: x */
    public final C17118h0 f65719x;

    public /* synthetic */ C17112e0(C17118h0 c17118h0, int i13) {
        this.f65718w = i13;
        this.f65719x = c17118h0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65718w;
        int iIntValue = ((Number) obj).intValue();
        switch (i13) {
            case 0:
                C17122k c17122k = this.f65719x.f65728a;
                InterfaceC32332f interfaceC32332f = c17122k.f65761b;
                C17119i c17119i = c17122k.f65760a;
                C35845c c35845cM36239E = AbstractC12889b.m36239E(interfaceC32332f, iIntValue);
                return c35845cM36239E.f152611c ? c17119i.m48364b(c35845cM36239E) : AbstractC17269i.m48866M(c17119i.f65736b, c35845cM36239E);
            default:
                C17122k c17122k2 = this.f65719x.f65728a;
                C35845c c35845cM36239E2 = AbstractC12889b.m36239E(c17122k2.f65761b, iIntValue);
                if (!c35845cM36239E2.f152611c) {
                    InterfaceC31109b0 interfaceC31109b0 = c17122k2.f65760a.f65736b;
                    AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
                    InterfaceC31126h interfaceC31126hM48866M = AbstractC17269i.m48866M(interfaceC31109b0, c35845cM36239E2);
                    if (interfaceC31126hM48866M instanceof InterfaceC31163w0) {
                        return (InterfaceC31163w0) interfaceC31126hM48866M;
                    }
                }
                return null;
        }
    }
}
