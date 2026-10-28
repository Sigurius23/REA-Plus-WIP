package p206i0;

import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C17825c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Function1 f69313w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f69314x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17829g f69315y;

    /* JADX INFO: renamed from: z */
    public int f69316z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17825c(C17829g c17829g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f69315y = c17829g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f69314x = obj;
        this.f69316z |= Integer.MIN_VALUE;
        return this.f69315y.m51262c(null, 0.0f, null, this);
    }
}
