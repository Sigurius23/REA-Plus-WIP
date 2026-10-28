package l50;

import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.access.circumference.models.CircumferencePickerModel;
import com.whoop.access.circumference.models.SegmentedControlDisplayModel;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import d21.C11503a;
import i93.C18284j;
import java.util.List;
import m50.C25078d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l50.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lcom/whoop/access/circumference/models/CircumferenceModel;", "Lm50/d;", "c", "(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;", "Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "Li93/j;", "b", "(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;", "a", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23350a {
    /* JADX INFO: renamed from: a */
    private static final C18284j m67597a(CircumferencePickerModel circumferencePickerModel) {
        return new C18284j(Math.min(circumferencePickerModel.getCmMin(), circumferencePickerModel.getCmMax()), Math.max(circumferencePickerModel.getCmMin(), circumferencePickerModel.getCmMax()), 1);
    }

    /* JADX INFO: renamed from: b */
    private static final C18284j m67598b(CircumferencePickerModel circumferencePickerModel) {
        return new C18284j(Math.min(circumferencePickerModel.getInMin(), circumferencePickerModel.getInMax()), Math.max(circumferencePickerModel.getInMin(), circumferencePickerModel.getInMax()), 1);
    }

    /* JADX INFO: renamed from: c */
    public static final C25078d m67599c(CircumferenceModel circumferenceModel) {
        AbstractC22676k.m65750j(circumferenceModel, "<this>");
        CircumferencePickerModel circumferencePicker = circumferenceModel.getCircumferencePicker();
        String unitType = circumferenceModel.getUnitType();
        if (unitType == null) {
            unitType = circumferencePicker.getUnitType();
        }
        UnitSystem unitSystemUnitSystemFromStringOrDefault$default = UnitSystemExtKt.unitSystemFromStringOrDefault$default(unitType, null, 2, null);
        int iM30921j = UnitSystemExtKt.isImperial(unitSystemUnitSystemFromStringOrDefault$default) ? C11503a.f37005a.m30921j(circumferencePicker.getDefaultIn()) : circumferencePicker.getDefaultCm();
        List<SegmentedControlDisplayModel> segmentedControlLabels = circumferenceModel.getSegmentedControlLabels();
        String label = circumferencePicker.getLabel();
        C18284j c18284jM67598b = m67598b(circumferencePicker);
        C18284j c18284jM67597a = m67597a(circumferencePicker);
        String inLabel = circumferencePicker.getInLabel();
        String cmLabel = circumferencePicker.getCmLabel();
        String stateUpdateValueKey = circumferencePicker.getStateUpdateValueKey();
        if (stateUpdateValueKey == null) {
            stateUpdateValueKey = "$waist";
        }
        return new C25078d(segmentedControlLabels, label, iM30921j, c18284jM67598b, c18284jM67597a, inLabel, cmLabel, unitSystemUnitSystemFromStringOrDefault$default, stateUpdateValueKey, circumferenceModel.getStateUpdateUnitKey(), circumferenceModel.getForeignMeasurements());
    }
}
