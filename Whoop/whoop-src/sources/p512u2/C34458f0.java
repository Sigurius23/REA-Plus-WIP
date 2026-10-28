package p512u2;

import s83.AbstractC32267a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: u2.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34458f0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f144764w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34460g0 f144765x;

    /* JADX INFO: renamed from: y */
    public int f144766y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34458f0(C34460g0 c34460g0, AbstractC32267a abstractC32267a) {
        super(abstractC32267a);
        this.f144765x = c34460g0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f144764w = obj;
        this.f144766y |= Integer.MIN_VALUE;
        return this.f144765x.m108932o(0L, null, this);
    }
}
