package com.whoop.design.models.modal;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import java.util.Map;
import jy1.C22047a;
import kotlinx.serialization.json.JsonElement;
import n83.C26463f;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.AbstractC34647h;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalType;", "modalType", "", "modalId", "Liy1/c;", "metricWriter", "Ll83/a0;", "trackModalPresentedMetric", "(Lcom/whoop/design/models/modal/ModalType;Ljava/lang/String;Liy1/c;)V", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lfi0/a;", "analyticsWriter", "trackModalViewed", "(Lcom/whoop/design/models/modal/AnyModal;Lfi0/a;)V", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "modalAnalyticEvents", "trackModalDismissed", "(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;)V", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "trackDialogButtonClicked", "(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V", NotificationCompat.CATEGORY_EVENT, "trackAnalyticEvent", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ModalTrackingKt {
    private static final void trackAnalyticEvent(AnalyticEventModel analyticEventModel, InterfaceC14515a interfaceC14515a) {
        Object objM109488c;
        C26463f c26463f = new C26463f();
        String source = analyticEventModel.getSource();
        if (source != null) {
            c26463f.put("source", source);
        }
        for (Map.Entry<String, JsonElement> entry : analyticEventModel.getProperties().entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value != null && (objM109488c = AbstractC34647h.m109488c(value)) != null) {
                c26463f.put(key, objM109488c);
            }
        }
        C26463f c26463fM78380b = c26463f.m78380b();
        if (interfaceC14515a != null) {
            interfaceC14515a.mo41422d(analyticEventModel.getCategory(), analyticEventModel.getAction(), analyticEventModel.getLabel(), analyticEventModel.getName(), analyticEventModel.getValue(), c26463fM78380b);
        }
    }

    public static final void trackDialogButtonClicked(AnalyticEventModel analyticEventModel, InterfaceC14515a interfaceC14515a) {
        if (analyticEventModel != null) {
            trackAnalyticEvent(analyticEventModel, interfaceC14515a);
        }
    }

    public static final void trackModalDismissed(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a) {
        AnalyticEventModel modalDismissed;
        if (modalAnalyticEventModel == null || (modalDismissed = modalAnalyticEventModel.getModalDismissed()) == null) {
            return;
        }
        trackAnalyticEvent(modalDismissed, interfaceC14515a);
    }

    public static final void trackModalPresentedMetric(ModalType modalType, String modalId, InterfaceC21030c interfaceC21030c) {
        AbstractC22676k.m65750j(modalType, "modalType");
        AbstractC22676k.m65750j(modalId, "modalId");
        if (interfaceC21030c != null) {
            interfaceC21030c.mo58701b(new C22047a(0, "mobile.whoop.modal_presented", null, AbstractC37056f.m118959K("id:".concat(modalId), AbstractC11266d.m30461o("type:", modalType.getValue())), null, 17, null));
        }
    }

    public static final void trackModalViewed(AnyModal modal, InterfaceC14515a interfaceC14515a) {
        AnalyticEventModel modalViewed;
        AbstractC22676k.m65750j(modal, "modal");
        ModalAnalyticEventModel analyticEvents = modal.getAnalyticEvents();
        if (analyticEvents == null || (modalViewed = analyticEvents.getModalViewed()) == null) {
            return;
        }
        trackAnalyticEvent(modalViewed, interfaceC14515a);
    }
}
