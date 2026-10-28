package p110e7;

import java.util.List;
import m83.C25271y;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12780a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f43742E;

    /* JADX INFO: renamed from: w */
    public C25271y f43743w;

    /* JADX INFO: renamed from: x */
    public List f43744x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f43745y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12786g f43746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12780a(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43746z = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43745y = obj;
        this.f43742E |= Integer.MIN_VALUE;
        return this.f43746z.mo7842g(null, null, null, this);
    }
}
