package p579wc;

import p645yc.C39422a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37075c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158610E;

    /* JADX INFO: renamed from: w */
    public C37126x f158611w;

    /* JADX INFO: renamed from: x */
    public C39422a f158612x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158613y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37084f0 f158614z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37075c0(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158614z = c37084f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158613y = obj;
        this.f158610E |= Integer.MIN_VALUE;
        return this.f158614z.m119010d(null, this);
    }
}
