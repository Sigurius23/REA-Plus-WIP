package p646yd;

import p460rg.C31371f;
import p557vo.AbstractC36220b;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yd.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C39451b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f169729E;

    /* JADX INFO: renamed from: w */
    public AbstractC37056f f169730w;

    /* JADX INFO: renamed from: x */
    public C31371f f169731x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f169732y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC36220b f169733z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39451b(AbstractC36220b abstractC36220b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f169733z = abstractC36220b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f169732y = obj;
        this.f169729E |= Integer.MIN_VALUE;
        return this.f169733z.m115319p(null, this);
    }
}
