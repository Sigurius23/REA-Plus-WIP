package p581we;

import p499t9.C33652u;
import p647yf.C39498k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: we.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37175a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158964E;

    /* JADX INFO: renamed from: w */
    public C39498k f158965w;

    /* JADX INFO: renamed from: x */
    public long f158966x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158967y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33652u f158968z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37175a(C33652u c33652u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158968z = c33652u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158967y = obj;
        this.f158964E |= Integer.MIN_VALUE;
        return this.f158968z.mo106283b(null, 0L, this);
    }
}
