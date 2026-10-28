package bh;

import android.graphics.Bitmap;
import mh.C25533a;
import mh.C25542j;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3244g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Bitmap f12710E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f12711F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3247j f12712G;

    /* JADX INFO: renamed from: H */
    public int f12713H;

    /* JADX INFO: renamed from: w */
    public C3247j f12714w;

    /* JADX INFO: renamed from: x */
    public C25533a f12715x;

    /* JADX INFO: renamed from: y */
    public C25542j f12716y;

    /* JADX INFO: renamed from: z */
    public C3240c f12717z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3244g(C3247j c3247j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12712G = c3247j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12711F = obj;
        this.f12713H |= Integer.MIN_VALUE;
        return C3247j.m9384a(this.f12712G, null, 0, this);
    }
}
