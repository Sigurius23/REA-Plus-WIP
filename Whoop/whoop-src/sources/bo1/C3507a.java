package bo1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bo1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lbo1/a;", "", "<init>", "()V", "Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;", "model", "Lbo1/b;", "a", "(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3507a {

    /* JADX INFO: renamed from: a */
    public static final C3507a f13973a = new C3507a();

    private C3507a() {
    }

    /* JADX INFO: renamed from: a */
    public final C3508b m10354a(FertilitySettingsToggleModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getDescription());
        boolean enabled = model.getEnabled();
        C9598e ctaDestination = model.getCtaDestination();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getCtaTextDisplay());
        String ctaIcon = model.getCtaIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), ctaIcon)) {
                break;
            }
            i13++;
        }
        return new C3508b(textResourceM21278l, textResourceM21278l2, enabled, ctaDestination, textResourceM21278l3, enumC16313m0 == null ? enumC16313m1 : enumC16313m0);
    }
}
