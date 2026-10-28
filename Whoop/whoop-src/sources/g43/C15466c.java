package g43;

import android.support.v4.media.session.C1082p;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15466c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C1082p f58084w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f58085x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15468e f58086y;

    /* JADX INFO: renamed from: z */
    public int f58087z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15466c(C15468e c15468e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f58086y = c15468e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f58085x = obj;
        this.f58087z |= Integer.MIN_VALUE;
        return C15468e.m43661c(this.f58086y, null, null, null, this);
    }
}
