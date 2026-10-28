package p180h0;

import p715kotlin.jvm.internal.C22663d0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C16395h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22663d0 f63033w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f63034x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16410k f63035y;

    /* JADX INFO: renamed from: z */
    public int f63036z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16395h(C16410k c16410k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63035y = c16410k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63034x = obj;
        this.f63036z |= Integer.MIN_VALUE;
        return C16410k.m46594j1(this.f63035y, 0.0f, this);
    }
}
