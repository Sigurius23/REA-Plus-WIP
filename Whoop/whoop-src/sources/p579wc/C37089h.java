package p579wc;

import cg.C4560o;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C37089h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158666E;

    /* JADX INFO: renamed from: w */
    public String f158667w;

    /* JADX INFO: renamed from: x */
    public C4560o f158668x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158669y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37092i f158670z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37089h(C37092i c37092i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158670z = c37092i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158669y = obj;
        this.f158666E |= Integer.MIN_VALUE;
        return this.f158670z.m119016k(null, this);
    }
}
