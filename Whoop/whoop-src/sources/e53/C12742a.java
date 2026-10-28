package e53;

import io.sentry.internal.debugmeta.C20378c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12742a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C20378c f43618w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43619x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C20378c f43620y;

    /* JADX INFO: renamed from: z */
    public int f43621z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12742a(C20378c c20378c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43620y = c20378c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43619x = obj;
        this.f43621z |= Integer.MIN_VALUE;
        return this.f43620y.mo31821e(this);
    }
}
