package mo0;

import com.whoop.clinicianintheloop.domain.models.AppointmentButtonModel;
import lo0.C24568a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mo0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;", "Llo0/a;", "a", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;)Llo0/a;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25738a {
    /* JADX INFO: renamed from: a */
    public static final C24568a m75878a(AppointmentButtonModel appointmentButtonModel) {
        AbstractC22676k.m65750j(appointmentButtonModel, "<this>");
        return new C24568a(appointmentButtonModel.getId(), appointmentButtonModel.getText(), appointmentButtonModel.isSelected(), appointmentButtonModel.getSelectedColor(), appointmentButtonModel.getSelectedBorderColor(), appointmentButtonModel.getInteraction());
    }
}
