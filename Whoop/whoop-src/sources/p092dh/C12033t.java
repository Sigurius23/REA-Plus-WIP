package p092dh;

import p715kotlin.jvm.internal.C22659b0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dh.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12033t extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f39793E;

    /* JADX INFO: renamed from: w */
    public Object f39794w;

    /* JADX INFO: renamed from: x */
    public C22659b0 f39795x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f39796y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12036w f39797z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12033t(C12036w c12036w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f39797z = c12036w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f39796y = obj;
        this.f39793E |= Integer.MIN_VALUE;
        return this.f39797z.mo33148a(this);
    }
}
