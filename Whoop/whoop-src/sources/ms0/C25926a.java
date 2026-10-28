package ms0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ns0.InterfaceC27100a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ms0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lms0/a;", "Landroidx/lifecycle/w1;", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "j", "()V", "l", "Lns0/a;", NotificationCompat.CATEGORY_EVENT, "g", "(Lns0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lfi0/a;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25926a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C25926a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: j */
    private final void m76686j() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", "need help?", null, "Pairing: Open KB Article", null, AbstractC31061c.m95645u("source", "take off whoop screen"), 20, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m76687l() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", "next", null, "Pairing: CTA", null, AbstractC31061c.m95645u("source", "take off whoop screen"), 20, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m76688g(InterfaceC27100a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27100a.a) {
            m76686j();
        } else {
            if (!(event instanceof InterfaceC27100a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m76687l();
        }
    }
}
