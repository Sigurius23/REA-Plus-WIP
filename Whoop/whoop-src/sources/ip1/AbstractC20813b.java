package ip1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalDateInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.MultiSelectOption;
import cp1.AbstractC11015b;
import cp1.EnumC11017d;
import d13.AbstractC11478a;
import gz0.EnumC16313m0;
import hp1.C17542b;
import hp1.C17543c;
import hp1.C17544d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ip1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "result", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "screenId", "Lcp1/d;", "hormonalOnboardingFlowType", "Lhp1/d;", "b", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/d;)Lhp1/d;", "Lhp1/b;", "a", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/b;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20813b {
    /* JADX INFO: renamed from: a */
    public static final C17542b m57398a(HormonalScreen result) throws ParseException {
        AbstractC22676k.m65750j(result, "result");
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalDateInputScreen");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(((HormonalDateInputScreen) result.getContent()).getStartDate());
        Date date2 = simpleDateFormat.parse(((HormonalDateInputScreen) result.getContent()).getMinDate());
        Date date3 = simpleDateFormat.parse(((HormonalDateInputScreen) result.getContent()).getMaxDate());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((HormonalDateInputScreen) result.getContent()).getTitle());
        AbstractC22676k.m65747g(date);
        AbstractC22676k.m65747g(date2);
        AbstractC22676k.m65747g(date3);
        return new C17542b(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, date2, date3, date, AbstractC8693b.m21278l(((HormonalDateInputScreen) result.getContent()).getButtonTitle()), AbstractC8693b.m21278l(((HormonalDateInputScreen) result.getContent()).getSkipTitle()), ((HormonalDateInputScreen) result.getContent()).getSkipNextId(), ((HormonalDateInputScreen) result.getContent()).getNextId());
    }

    /* JADX INFO: renamed from: b */
    public static final C17544d m57399b(HormonalScreen result, HormonalScreenId screenId, EnumC11017d enumC11017d) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC11017d hormonalOnboardingFlowType = enumC11017d;
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(hormonalOnboardingFlowType, "hormonalOnboardingFlowType");
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getButtonTitle());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getSkipTitle());
        HormonalScreenId skipNextId = ((HormonalMultiSelectScreen) result.getContent()).getSkipNextId();
        List<MultiSelectOption> options = ((HormonalMultiSelectScreen) result.getContent()).getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (MultiSelectOption multiSelectOption : options) {
            TextResource textResourceM21278l6 = hormonalOnboardingFlowType == EnumC11017d.POSTPARTUM ? AbstractC8693b.m21278l(multiSelectOption.getTitle()) : AbstractC11478a.m30853e(Locale.ROOT, multiSelectOption.getTitle(), "toUpperCase(...)");
            String subtitle = multiSelectOption.getSubtitle();
            TextResource textResourceM21278l7 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
            String value = multiSelectOption.getValue();
            HormonalScreenId nextId = multiSelectOption.getNextId();
            Double nextCount = multiSelectOption.getNextCount();
            Integer numValueOf = nextCount != null ? Integer.valueOf((int) nextCount.doubleValue()) : null;
            String icon = multiSelectOption.getIcon();
            if (icon != null) {
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m1 = null;
                        break;
                    }
                    EnumC16313m0 enumC16313m2 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                        enumC16313m1 = enumC16313m2;
                        break;
                    }
                    i13++;
                }
                enumC16313m0 = enumC16313m1;
            } else {
                enumC16313m0 = null;
            }
            arrayList.add(new C17543c(textResourceM21278l6, value, textResourceM21278l7, enumC16313m0, nextId, numValueOf));
            hormonalOnboardingFlowType = enumC11017d;
        }
        String descriptionDisplay = ((HormonalMultiSelectScreen) result.getContent()).getDescriptionDisplay();
        return new C17544d(textResourceM21278l, textResourceM21278l2, screenId, textResourceM21278l3, descriptionDisplay != null ? AbstractC8693b.m21278l(descriptionDisplay) : null, textResourceM21278l4, arrayList, textResourceM21278l5, skipNextId, AbstractC11015b.m29571a(((HormonalMultiSelectScreen) result.getContent()).getProgress()));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C17544d m57400c(HormonalScreen hormonalScreen, HormonalScreenId hormonalScreenId, EnumC11017d enumC11017d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            enumC11017d = EnumC11017d.POSTPARTUM;
        }
        return m57399b(hormonalScreen, hormonalScreenId, enumC11017d);
    }
}
