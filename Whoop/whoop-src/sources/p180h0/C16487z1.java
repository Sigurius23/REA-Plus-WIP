package p180h0;

import d30.C11530f0;
import p715kotlin.jvm.internal.C22663d0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16487z1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11530f0 f63359E;

    /* JADX INFO: renamed from: F */
    public int f63360F;

    /* JADX INFO: renamed from: w */
    public C16372c3 f63361w;

    /* JADX INFO: renamed from: x */
    public C22663d0 f63362x;

    /* JADX INFO: renamed from: y */
    public float f63363y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f63364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16487z1(C11530f0 c11530f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63359E = c11530f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63364z = obj;
        this.f63360F |= Integer.MIN_VALUE;
        return C11530f0.m30977a(this.f63359E, null, null, 0.0f, 0.0f, this);
    }
}
