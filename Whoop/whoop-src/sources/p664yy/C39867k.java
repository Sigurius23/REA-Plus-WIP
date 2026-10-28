package p664yy;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: yy.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C39867k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172158E;

    /* JADX INFO: renamed from: w */
    public C39873n f172159w;

    /* JADX INFO: renamed from: x */
    public AnalyticsRequestV2 f172160x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172161y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39873n f172162z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39867k(C39873n c39873n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172162z = c39873n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172161y = obj;
        this.f172158E |= Integer.MIN_VALUE;
        return this.f172162z.m127940a(null, this);
    }
}
