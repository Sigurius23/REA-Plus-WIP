package or2;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m65681d2 = {"Lor2/t;", "Landroidx/lifecycle/w1;", "Landroidx/lifecycle/k1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/k1;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/k1;", "", "value", "g", "()Ljava/lang/Integer;", "j", "(Ljava/lang/Integer;)V", "savedCurrentDestinationId", "x", "a", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28201t extends AbstractC1637w1 {

    /* JADX INFO: renamed from: y */
    public static final int f113949y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C1601k1 savedStateHandle;

    public C28201t(C1601k1 savedStateHandle) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m85348g() {
        return (Integer) this.savedStateHandle.m5001b("current_destination_holding_store_current_destination_id_state");
    }

    /* JADX INFO: renamed from: j */
    public final void m85349j(Integer num) {
        this.savedStateHandle.m5004e(num, "current_destination_holding_store_current_destination_id_state");
    }
}
