package ng2;

import ad3.AbstractC0770m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ng2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"", "selectedActivityInternalName", "", "isGpsTrackingEnabled", "dismissModal", "Lcom/whoop/design/item/DesignItemInteraction;", "b", "(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;", "internalName", "a", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26685d {
    /* JADX INFO: renamed from: a */
    public static final DesignItemInteraction m79374a(String internalName, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(internalName, "internalName");
        return new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73990Y(new C23465k("$selected_activity_internal_name", AbstractC0770m.m1841c(internalName)), new C23465k("$gps_tracking_enabled", AbstractC0770m.m1839a(Boolean.valueOf(z4)))), z13), null);
    }

    /* JADX INFO: renamed from: b */
    public static final DesignItemInteraction m79375b(String selectedActivityInternalName, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        return m79374a(selectedActivityInternalName, z4, z13);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DesignItemInteraction m79376c(String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return m79375b(str, z4, z13);
    }
}
