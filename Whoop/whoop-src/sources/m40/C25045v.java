package m40;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C25045v extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f98125E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C25046w f98126F;

    /* JADX INFO: renamed from: G */
    public int f98127G;

    /* JADX INFO: renamed from: w */
    public C25046w f98128w;

    /* JADX INFO: renamed from: x */
    public String f98129x;

    /* JADX INFO: renamed from: y */
    public Object f98130y;

    /* JADX INFO: renamed from: z */
    public InterfaceC25435a f98131z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25045v(C25046w c25046w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98126F = c25046w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98125E = obj;
        this.f98127G |= Integer.MIN_VALUE;
        return C25046w.m73485e(this.f98126F, null, null, this);
    }
}
