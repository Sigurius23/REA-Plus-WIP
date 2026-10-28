package cp1;

import com.whoop.metrics.common.ScreenState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cp1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcp1/k;", "Lcom/whoop/metrics/common/ScreenState;", "a", "(Lcp1/k;)Lcom/whoop/metrics/common/ScreenState;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11025l {
    /* JADX INFO: renamed from: a */
    public static final ScreenState m29647a(AbstractC11024k abstractC11024k) {
        AbstractC22676k.m65750j(abstractC11024k, "<this>");
        if (abstractC11024k.equals(AbstractC11024k.i.f34586a)) {
            return ScreenState.LOADING;
        }
        if (abstractC11024k.equals(AbstractC11024k.p.f34595a) || (abstractC11024k instanceof AbstractC11024k.d) || (abstractC11024k instanceof AbstractC11024k.o) || (abstractC11024k instanceof AbstractC11024k.b)) {
            return ScreenState.ERROR;
        }
        if ((abstractC11024k instanceof AbstractC11024k.g) || (abstractC11024k instanceof AbstractC11024k.t) || (abstractC11024k instanceof AbstractC11024k.q) || (abstractC11024k instanceof AbstractC11024k.m) || (abstractC11024k instanceof AbstractC11024k.k) || (abstractC11024k instanceof AbstractC11024k.h) || (abstractC11024k instanceof AbstractC11024k.j) || (abstractC11024k instanceof AbstractC11024k.f) || (abstractC11024k instanceof AbstractC11024k.l) || (abstractC11024k instanceof AbstractC11024k.c)) {
            return ScreenState.SUCCESS;
        }
        if (abstractC11024k.equals(AbstractC11024k.s.f34599a) || abstractC11024k.equals(AbstractC11024k.r.f34598a) || abstractC11024k.equals(AbstractC11024k.a.f34570a)) {
            return ScreenState.OTHER;
        }
        if (abstractC11024k.equals(AbstractC11024k.n.f34593a) || abstractC11024k.equals(AbstractC11024k.e.f34579a)) {
            return ScreenState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
