package p027b3;

import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2457w0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f9596w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2462x0 f9597x;

    /* JADX INFO: renamed from: y */
    public int f9598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457w0(C2462x0 c2462x0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9597x = c2462x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9596w = obj;
        this.f9598y |= Integer.MIN_VALUE;
        this.f9597x.m7441a(null, this);
        return EnumC31071a.f128113w;
    }
}
