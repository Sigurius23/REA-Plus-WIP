package zy1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import py1.C29622a;

/* JADX INFO: renamed from: zy1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lzy1/f;", "Landroidx/lifecycle/w1;", "Lpy1/a;", "mfaAnalyticsHelper", "<init>", "(Lpy1/a;)V", "Lzy1/e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "g", "(Lzy1/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lpy1/a;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41224f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    public C41224f(C29622a mfaAnalyticsHelper) {
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
    }

    /* JADX INFO: renamed from: g */
    public final void m133913g(InterfaceC41223e event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof InterfaceC41223e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.mfaAnalyticsHelper.m91032w(((InterfaceC41223e.a) event).getSource());
    }
}
