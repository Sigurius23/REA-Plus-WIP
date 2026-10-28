package tp1;

import com.whoop.metrics.common.ScreenState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tp1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltp1/o;", "Lcom/whoop/metrics/common/ScreenState;", "a", "(Ltp1/o;)Lcom/whoop/metrics/common/ScreenState;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34076p {
    /* JADX INFO: renamed from: a */
    public static final ScreenState m107730a(AbstractC34075o abstractC34075o) {
        AbstractC22676k.m65750j(abstractC34075o, "<this>");
        if (abstractC34075o.equals(AbstractC34075o.b.f142909a)) {
            return ScreenState.LOADING;
        }
        if (abstractC34075o.equals(AbstractC34075o.a.f142908a) || abstractC34075o.equals(AbstractC34075o.c.f142910a)) {
            return ScreenState.ERROR;
        }
        if (abstractC34075o instanceof AbstractC34075o.f) {
            return ScreenState.SUCCESS;
        }
        if (abstractC34075o.equals(AbstractC34075o.e.f142912a) || abstractC34075o.equals(AbstractC34075o.d.f142911a)) {
            return ScreenState.OTHER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
