package n10;

import android.os.Parcelable;
import h20.C16744u2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C26148q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C16744u2 f103586E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f103587F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C26150r f103588G;

    /* JADX INFO: renamed from: H */
    public int f103589H;

    /* JADX INFO: renamed from: w */
    public Object f103590w;

    /* JADX INFO: renamed from: x */
    public Object f103591x;

    /* JADX INFO: renamed from: y */
    public Parcelable f103592y;

    /* JADX INFO: renamed from: z */
    public C26130h f103593z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26148q(C26150r c26150r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103588G = c26150r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103587F = obj;
        this.f103589H |= Integer.MIN_VALUE;
        return this.f103588G.mo77685a(null, null, null, null, this);
    }
}
