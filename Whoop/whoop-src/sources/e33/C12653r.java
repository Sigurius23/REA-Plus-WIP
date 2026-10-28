package e33;

import java.util.Iterator;
import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C12653r extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C12659u f43230E;

    /* JADX INFO: renamed from: F */
    public int f43231F;

    /* JADX INFO: renamed from: w */
    public C12659u f43232w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25435a f43233x;

    /* JADX INFO: renamed from: y */
    public Iterator f43234y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f43235z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12653r(C12659u c12659u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43230E = c12659u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43235z = obj;
        this.f43231F |= Integer.MIN_VALUE;
        return this.f43230E.m35420j(this);
    }
}
