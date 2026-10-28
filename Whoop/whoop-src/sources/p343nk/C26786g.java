package p343nk;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nk.g */
/* JADX INFO: loaded from: classes.dex */
public final class C26786g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C26788i f106684E;

    /* JADX INFO: renamed from: F */
    public int f106685F;

    /* JADX INFO: renamed from: w */
    public C26788i f106686w;

    /* JADX INFO: renamed from: x */
    public String f106687x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25435a f106688y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f106689z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26786g(C26788i c26788i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f106684E = c26788i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f106689z = obj;
        this.f106685F |= Integer.MIN_VALUE;
        return this.f106684E.m79820i(null, this);
    }
}
