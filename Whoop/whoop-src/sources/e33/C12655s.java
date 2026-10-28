package e33;

import mc3.InterfaceC25435a;
import org.webrtc.SessionDescription;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C12655s extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C12659u f43238E;

    /* JADX INFO: renamed from: F */
    public int f43239F;

    /* JADX INFO: renamed from: w */
    public C12659u f43240w;

    /* JADX INFO: renamed from: x */
    public SessionDescription f43241x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25435a f43242y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f43243z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12655s(C12659u c12659u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43238E = c12659u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43243z = obj;
        this.f43239F |= Integer.MIN_VALUE;
        return this.f43238E.m35421k(null, this);
    }
}
