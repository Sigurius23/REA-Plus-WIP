package p485sf;

import a30.C0332w0;
import java.util.Iterator;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sf.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C32439k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f134311E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C0332w0 f134312F;

    /* JADX INFO: renamed from: G */
    public int f134313G;

    /* JADX INFO: renamed from: w */
    public C32431c f134314w;

    /* JADX INFO: renamed from: x */
    public Iterator f134315x;

    /* JADX INFO: renamed from: y */
    public C32431c f134316y;

    /* JADX INFO: renamed from: z */
    public int f134317z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32439k(C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134312F = c0332w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134311E = obj;
        this.f134313G |= Integer.MIN_VALUE;
        return this.f134312F.m838A(null, this);
    }
}
