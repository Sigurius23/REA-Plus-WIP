package e33;

import org.webrtc.IceCandidate;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C12647o extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f43203E;

    /* JADX INFO: renamed from: w */
    public C12659u f43204w;

    /* JADX INFO: renamed from: x */
    public IceCandidate f43205x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f43206y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12659u f43207z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12647o(C12659u c12659u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43207z = c12659u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43206y = obj;
        this.f43203E |= Integer.MIN_VALUE;
        return this.f43207z.m35412a(null, this);
    }
}
