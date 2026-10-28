package p180h0;

import p715kotlin.jvm.internal.C22667f0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16483y2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22667f0 f63345w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f63346x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16372c3 f63347y;

    /* JADX INFO: renamed from: z */
    public int f63348z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16483y2(C16372c3 c16372c3, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63347y = c16372c3;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63346x = obj;
        this.f63348z |= Integer.MIN_VALUE;
        return this.f63347y.m46568a(0L, this);
    }
}
