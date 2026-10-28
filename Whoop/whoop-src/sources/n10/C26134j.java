package n10;

import s83.AbstractC32269c;
import y00.C38840g6;

/* JADX INFO: renamed from: n10.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C26134j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f103536E;

    /* JADX INFO: renamed from: w */
    public C38840g6 f103537w;

    /* JADX INFO: renamed from: x */
    public C26136k f103538x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f103539y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26136k f103540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26134j(C26136k c26136k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103540z = c26136k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103539y = obj;
        this.f103536E |= Integer.MIN_VALUE;
        return this.f103540z.mo77681b(null, null, null, this);
    }
}
