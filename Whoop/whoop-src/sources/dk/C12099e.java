package dk;

import p255jk.C21743a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dk.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12099e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f40285E;

    /* JADX INFO: renamed from: w */
    public C12100f f40286w;

    /* JADX INFO: renamed from: x */
    public C21743a f40287x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f40288y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12100f f40289z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12099e(C12100f c12100f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f40289z = c12100f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f40288y = obj;
        this.f40285E |= Integer.MIN_VALUE;
        return this.f40289z.mo33428e(null, this);
    }
}
