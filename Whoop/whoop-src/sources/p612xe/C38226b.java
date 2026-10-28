package p612xe;

import p085d9.C11799p;
import p647yf.C39498k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xe.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38226b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f163857E;

    /* JADX INFO: renamed from: w */
    public C39498k f163858w;

    /* JADX INFO: renamed from: x */
    public C11799p f163859x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f163860y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11799p f163861z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38226b(C11799p c11799p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f163861z = c11799p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f163860y = obj;
        this.f163857E |= Integer.MIN_VALUE;
        return this.f163861z.m31619c(this);
    }
}
