package p612xe;

import p085d9.C11799p;
import p508ty.C34249c;
import p647yf.C39498k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xe.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C38230f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11799p f163873E;

    /* JADX INFO: renamed from: F */
    public int f163874F;

    /* JADX INFO: renamed from: w */
    public C34249c f163875w;

    /* JADX INFO: renamed from: x */
    public C39498k f163876x;

    /* JADX INFO: renamed from: y */
    public long f163877y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f163878z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38230f(C11799p c11799p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f163873E = c11799p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f163878z = obj;
        this.f163874F |= Integer.MIN_VALUE;
        return this.f163873E.m31624h(null, this);
    }
}
