package x03;

import p180h0.InterfaceC16413k2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x03.e */
/* JADX INFO: loaded from: classes11.dex */
public final class C37808e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f161923E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C37812i f161924F;

    /* JADX INFO: renamed from: G */
    public int f161925G;

    /* JADX INFO: renamed from: w */
    public C37812i f161926w;

    /* JADX INFO: renamed from: x */
    public InterfaceC16413k2 f161927x;

    /* JADX INFO: renamed from: y */
    public int f161928y;

    /* JADX INFO: renamed from: z */
    public float f161929z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37808e(C37812i c37812i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161924F = c37812i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161923E = obj;
        this.f161925G |= Integer.MIN_VALUE;
        return this.f161924F.m121326d(null, 0, 0.0f, this);
    }
}
