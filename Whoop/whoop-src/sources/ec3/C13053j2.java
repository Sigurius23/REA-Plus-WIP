package ec3;

import fc3.C14389t;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.j2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13053j2 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f45111E;

    /* JADX INFO: renamed from: w */
    public C13057k2 f45112w;

    /* JADX INFO: renamed from: x */
    public C14389t f45113x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45114y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13057k2 f45115z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13053j2(C13057k2 c13057k2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45115z = c13057k2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45114y = obj;
        this.f45111E |= Integer.MIN_VALUE;
        return this.f45115z.m36574b(this);
    }
}
