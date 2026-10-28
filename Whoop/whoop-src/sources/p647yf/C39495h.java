package p647yf;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: yf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C39495h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C39496i f169896E;

    /* JADX INFO: renamed from: F */
    public int f169897F;

    /* JADX INFO: renamed from: w */
    public C39498k f169898w;

    /* JADX INFO: renamed from: x */
    public C39496i f169899x;

    /* JADX INFO: renamed from: y */
    public long f169900y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f169901z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39495h(C39496i c39496i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f169896E = c39496i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f169901z = obj;
        this.f169897F |= Integer.MIN_VALUE;
        return this.f169896E.mo106283b(null, 0L, this);
    }
}
