package to1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsConfirmDialog;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import so1.C32824l;

/* JADX INFO: renamed from: to1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "Lso1/l;", "a", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lso1/l;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34010c {
    /* JADX INFO: renamed from: a */
    public static final C32824l m107501a(HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog) {
        AbstractC22676k.m65750j(hormonalInsightsConfirmDialog, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getMessage());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getPrimaryText());
        String secondaryText = hormonalInsightsConfirmDialog.getSecondaryText();
        return new C32824l(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, secondaryText != null ? AbstractC8693b.m21278l(secondaryText) : null);
    }
}
