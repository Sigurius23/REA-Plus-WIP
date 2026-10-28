package j72;

import com.whoop.metrics.common.ScreenState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j72.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj72/j;", "Lcom/whoop/metrics/common/ScreenState;", "a", "(Lj72/j;)Lcom/whoop/metrics/common/ScreenState;", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21406k {
    /* JADX INFO: renamed from: a */
    public static final ScreenState m60156a(AbstractC21405j abstractC21405j) {
        AbstractC22676k.m65750j(abstractC21405j, "<this>");
        if (abstractC21405j.equals(AbstractC21405j.f.f82062a)) {
            return ScreenState.LOADING;
        }
        if (abstractC21405j.equals(AbstractC21405j.a.f82056a) || (abstractC21405j instanceof AbstractC21405j.i)) {
            return ScreenState.ERROR;
        }
        if (abstractC21405j.equals(AbstractC21405j.j.f82067a) || (abstractC21405j instanceof AbstractC21405j.l) || (abstractC21405j instanceof AbstractC21405j.e) || (abstractC21405j instanceof AbstractC21405j.d) || (abstractC21405j instanceof AbstractC21405j.g) || (abstractC21405j instanceof AbstractC21405j.c)) {
            return ScreenState.SUCCESS;
        }
        if (abstractC21405j.equals(AbstractC21405j.k.f82068a) || (abstractC21405j instanceof AbstractC21405j.m)) {
            return ScreenState.OTHER;
        }
        if (abstractC21405j.equals(AbstractC21405j.b.f82057a) || abstractC21405j.equals(AbstractC21405j.h.f82064a)) {
            return ScreenState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
