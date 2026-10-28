package p485sf;

import a30.C0332w0;
import java.util.Iterator;
import p551vf.InterfaceC35936a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sf.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C32438j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C32433e f134299E;

    /* JADX INFO: renamed from: F */
    public C32433e f134300F;

    /* JADX INFO: renamed from: G */
    public int f134301G;

    /* JADX INFO: renamed from: H */
    public int f134302H;

    /* JADX INFO: renamed from: I */
    public int f134303I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f134304J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C0332w0 f134305K;

    /* JADX INFO: renamed from: L */
    public int f134306L;

    /* JADX INFO: renamed from: w */
    public InterfaceC35936a f134307w;

    /* JADX INFO: renamed from: x */
    public C32433e f134308x;

    /* JADX INFO: renamed from: y */
    public Iterator f134309y;

    /* JADX INFO: renamed from: z */
    public C32433e f134310z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32438j(C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134305K = c0332w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134304J = obj;
        this.f134306L |= Integer.MIN_VALUE;
        return this.f134305K.m868z(null, this);
    }
}
