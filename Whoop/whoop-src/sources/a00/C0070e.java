package a00;

import p599wz.AbstractC37760u0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0070e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0072g f208E;

    /* JADX INFO: renamed from: F */
    public int f209F;

    /* JADX INFO: renamed from: w */
    public Object f210w;

    /* JADX INFO: renamed from: x */
    public AbstractC37760u0 f211x;

    /* JADX INFO: renamed from: y */
    public boolean f212y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f213z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070e(C0072g c0072g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f208E = c0072g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f213z = obj;
        this.f209F |= Integer.MIN_VALUE;
        return this.f208E.m191i(null, null, null, this);
    }
}
