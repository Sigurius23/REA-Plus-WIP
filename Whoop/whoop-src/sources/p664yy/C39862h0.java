package p664yy;

import com.stripe.android.core.networking.SendAnalyticsRequestV2Worker;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: yy.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39862h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172145E;

    /* JADX INFO: renamed from: w */
    public SendAnalyticsRequestV2Worker f172146w;

    /* JADX INFO: renamed from: x */
    public SendAnalyticsRequestV2Worker f172147x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172148y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ SendAnalyticsRequestV2Worker f172149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39862h0(SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172149z = sendAnalyticsRequestV2Worker;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172148y = obj;
        this.f172145E |= Integer.MIN_VALUE;
        return this.f172149z.doWork(this);
    }
}
