package w71;

import ad3.AbstractC0770m;
import ad3.C0783z;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import kotlinx.serialization.json.JsonObject;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w71.j0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\r\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lw71/k0;", "", "answeredYes", "", "b", "(Lw71/k0;Z)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "e", "(Lw71/k0;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "", "magnitudeInputValue", "", "timeInputValue", "f", "(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "includeLabels", "Lkotlinx/serialization/json/JsonObject;", "c", "(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Z)Lkotlinx/serialization/json/JsonObject;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36890j0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Object m118361b(C36892k0 c36892k0, boolean z4) {
        if (z4) {
            return m118366g(c36892k0, Boolean.TRUE, null, null, 6, null);
        }
        Action deselectAction = c36892k0.getDeselectAction();
        return deselectAction == null ? m118364e(c36892k0) : deselectAction;
    }

    /* JADX INFO: renamed from: c */
    private static final JsonObject m118362c(C36892k0 c36892k0, Boolean bool, Double d3, Long l7, boolean z4) {
        C0783z c0783z = new C0783z(0);
        c0783z.m1876u("behavior_tracker_id", AbstractC0770m.m1840b(Integer.valueOf(c36892k0.getBehaviorTrackerId())));
        if (bool != null) {
            c0783z.m1876u("answered_yes", AbstractC0770m.m1839a(bool));
        }
        if (d3 != null) {
            c0783z.m1876u("magnitude_input_value", AbstractC0770m.m1840b(Double.valueOf(d3.doubleValue())));
        }
        if (l7 != null) {
            c0783z.m1876u("time_input_value", AbstractC0770m.m1840b(Long.valueOf(l7.longValue())));
        }
        if (z4) {
            String magnitudeInputLabel = c36892k0.getMagnitudeInputLabel();
            if (magnitudeInputLabel != null) {
                c0783z.m1876u("magnitude_input_label", AbstractC0770m.m1841c(magnitudeInputLabel));
            }
            String timeInputLabel = c36892k0.getTimeInputLabel();
            if (timeInputLabel != null) {
                c0783z.m1876u("time_input_label", AbstractC0770m.m1841c(timeInputLabel));
            }
        }
        c0783z.m1876u("is_suggested", AbstractC0770m.m1839a(Boolean.valueOf(c36892k0.getIsSuggested())));
        return c0783z.m1861e();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ JsonObject m118363d(C36892k0 c36892k0, Boolean bool, Double d3, Long l7, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = true;
        }
        return m118362c(c36892k0, bool, d3, l7, z4);
    }

    /* JADX INFO: renamed from: e */
    private static final StateUpdateAction m118364e(C36892k0 c36892k0) {
        boolean z4 = false;
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(c36892k0.getStateKey(), m118362c(c36892k0, null, null, null, false))), z4, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: f */
    private static final StateUpdateAction m118365f(C36892k0 c36892k0, Boolean bool, Double d3, Long l7) {
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(c36892k0.getStateKey(), m118363d(c36892k0, bool, d3, l7, false, 8, null))), false, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ StateUpdateAction m118366g(C36892k0 c36892k0, Boolean bool, Double d3, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = c36892k0.getAnsweredYes();
        }
        if ((i13 & 2) != 0) {
            d3 = c36892k0.getMagnitudeInputValue();
        }
        if ((i13 & 4) != 0) {
            l7 = c36892k0.getTimeInputValue();
        }
        return m118365f(c36892k0, bool, d3, l7);
    }
}
