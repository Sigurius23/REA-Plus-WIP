package e33;

import io.getstream.video.android.core.model.IceCandidate;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C12651q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f43221E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C12659u f43222F;

    /* JADX INFO: renamed from: G */
    public int f43223G;

    /* JADX INFO: renamed from: w */
    public Object f43224w;

    /* JADX INFO: renamed from: x */
    public IceCandidate f43225x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25435a f43226y;

    /* JADX INFO: renamed from: z */
    public C25437c f43227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12651q(C12659u c12659u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43222F = c12659u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43221E = obj;
        this.f43223G |= Integer.MIN_VALUE;
        return this.f43222F.m35418g(null, this);
    }
}
