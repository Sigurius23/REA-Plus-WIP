package p395p6;

import android.content.Context;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28934y0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f117066E;

    /* JADX INFO: renamed from: w */
    public Context f117067w;

    /* JADX INFO: renamed from: x */
    public int f117068x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f117069y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28918t f117070z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28934y0(C28918t c28918t, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f117070z = c28918t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f117069y = obj;
        this.f117066E |= Integer.MIN_VALUE;
        return this.f117070z.m87835d(null, 0, this);
    }
}
