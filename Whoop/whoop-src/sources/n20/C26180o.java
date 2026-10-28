package n20;

import a30.C0290f1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C26180o extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f103830E;

    /* JADX INFO: renamed from: w */
    public C26181p f103831w;

    /* JADX INFO: renamed from: x */
    public C0290f1 f103832x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f103833y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26181p f103834z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26180o(C26181p c26181p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103834z = c26181p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103833y = obj;
        this.f103830E |= Integer.MIN_VALUE;
        return this.f103834z.m77734c(null, null, this);
    }
}
