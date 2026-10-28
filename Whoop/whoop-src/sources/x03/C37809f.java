package x03;

import p715kotlin.jvm.internal.C22663d0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x03.f */
/* JADX INFO: loaded from: classes11.dex */
public final class C37809f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f161930E;

    /* JADX INFO: renamed from: w */
    public C37812i f161931w;

    /* JADX INFO: renamed from: x */
    public C22663d0 f161932x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f161933y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37812i f161934z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37809f(C37812i c37812i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161934z = c37812i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161933y = obj;
        this.f161930E |= Integer.MIN_VALUE;
        return this.f161934z.m121327e(null, null, 0, 0.0f, false, this);
    }
}
