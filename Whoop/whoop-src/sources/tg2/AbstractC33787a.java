package tg2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.BottomSheetHeight;
import com.whoop.design.models.modal.Modal;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal;", "a", "(Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/modal/AnyModal;", "", NotificationCompat.CATEGORY_EVENT, "", "b", "(Ljava/lang/Object;)Z", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33787a {
    /* JADX INFO: renamed from: a */
    public static final AnyModal m106852a(AnyModal anyModal) {
        AbstractC22676k.m65750j(anyModal, "<this>");
        Modal modal = anyModal.getModal();
        BottomSheet bottomSheet = modal instanceof BottomSheet ? (BottomSheet) modal : null;
        if (bottomSheet != null && AbstractC22676k.m65745e(bottomSheet.getId(), "start-activity-picker-modal")) {
            BottomSheetHeight height = bottomSheet.getHeight();
            BottomSheetHeight bottomSheetHeight = BottomSheetHeight.PARTIAL;
            if (height != bottomSheetHeight) {
                return AnyModal.copy$default(anyModal, BottomSheet.copy$default(bottomSheet, null, null, null, bottomSheetHeight, null, null, 55, null), null, null, 6, null);
            }
        }
        return anyModal;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m106853b(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof DesignItemInteraction)) {
            return event instanceof C9598e;
        }
        Object actionArgument = ((DesignItemInteraction) event).getActionArgument();
        if (actionArgument instanceof DismissModalAction) {
            return true;
        }
        if (actionArgument instanceof StateUpdateAction) {
            return ((StateUpdateAction) actionArgument).getDismissModal();
        }
        return false;
    }
}
