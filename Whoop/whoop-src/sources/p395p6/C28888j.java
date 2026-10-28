package p395p6;

import java.util.List;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C28888j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f116932E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f116933F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C28894l f116934G;

    /* JADX INFO: renamed from: H */
    public int f116935H;

    /* JADX INFO: renamed from: w */
    public C28894l f116936w;

    /* JADX INFO: renamed from: x */
    public C28894l f116937x;

    /* JADX INFO: renamed from: y */
    public List f116938y;

    /* JADX INFO: renamed from: z */
    public int f116939z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28888j(C28894l c28894l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116934G = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116933F = obj;
        this.f116935H |= Integer.MIN_VALUE;
        return C28894l.m87814d(this.f116934G, null, this);
    }
}
