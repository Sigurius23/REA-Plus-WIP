package p079d2;

import dc3.C11918c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11481c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11918c f36895w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36896x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC11482d f36897y;

    /* JADX INFO: renamed from: z */
    public int f36898z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11481c(ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36897y = viewOnAttachStateChangeListenerC11482d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36896x = obj;
        this.f36898z |= Integer.MIN_VALUE;
        return this.f36897y.m30896a(this);
    }
}
