package b72;

import com.whoop.sage.design.sagemeter.SageGaugeModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b72.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/sage/design/sagemeter/SageGaugeModel;", "model", "", "isContinuousDial", "Lb72/e;", "a", "(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Z)Lb72/e;", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2785c {
    /* JADX INFO: renamed from: a */
    public static final C2787e m7918a(SageGaugeModel model, boolean z4) {
        EnumC2788f enumC2788f;
        AbstractC22676k.m65750j(model, "model");
        String gaugeLastUpdatedDisplay = model.getGaugeLastUpdatedDisplay();
        String gaugeSubtextDisplay = model.getGaugeSubtextDisplay();
        String gaugeLastUpdatedDisplayStyle = model.getGaugeLastUpdatedDisplayStyle();
        EnumC2788f enumC2788f2 = EnumC2788f.DATA_PRESENT;
        EnumC2788f[] enumC2788fArrValues = EnumC2788f.values();
        int length = enumC2788fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC2788f = null;
                break;
            }
            enumC2788f = enumC2788fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC2788f.name(), gaugeLastUpdatedDisplayStyle)) {
                break;
            }
            i13++;
        }
        return new C2787e(gaugeLastUpdatedDisplay, gaugeSubtextDisplay, enumC2788f == null ? enumC2788f2 : enumC2788f, new C2786d(model.getGaugeLeftSubtext().getSubtextTitleDisplay(), model.getGaugeLeftSubtext().getSubtextValueDisplay(), model.getGaugeLeftSubtext().getSubtextUnitsDisplay()), new C2786d(model.getGaugeRightSubtext().getSubtextTitleDisplay(), model.getGaugeRightSubtext().getSubtextValueDisplay(), model.getGaugeRightSubtext().getSubtextUnitsDisplay()), model.getGaugeFillPercentage(), false, null, z4, 192, null);
    }
}
