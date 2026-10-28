package ms0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ns0.InterfaceC27102c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ms0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lms0/c;", "Landroidx/lifecycle/w1;", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "j", "()V", "Lns0/c;", NotificationCompat.CATEGORY_EVENT, "g", "(Lns0/c;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lfi0/a;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25928c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: x */
    public static final int f102393x = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C25928c(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: j */
    private final void m76692j() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", "retry", null, "Pairing: CTA", null, AbstractC31061c.m95645u("source", "wake up your whoop screen"), 20, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m76693g(InterfaceC27102c event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof InterfaceC27102c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m76692j();
    }
}
