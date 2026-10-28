package f53;

import io.sentry.internal.debugmeta.C20378c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f53.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C14124l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f50773w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20378c f50774x;

    /* JADX INFO: renamed from: y */
    public int f50775y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14124l(C20378c c20378c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f50774x = c20378c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f50773w = obj;
        this.f50775y |= Integer.MIN_VALUE;
        this.f50774x.m56578A(null, this);
        return EnumC31071a.f128113w;
    }
}
