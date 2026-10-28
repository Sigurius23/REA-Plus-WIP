package mf0;

import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.advancedlabs.domain.models.TestInputScreenResponse;
import com.whoop.design.models.items.TagModel;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import md0.AbstractC25448c;
import ny0.C27238a0;
import or2.C28204u;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import ze0.AbstractC40584c;
import zr2.AbstractC41071b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: mf0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "Lzr2/a;", "dateAndTimeProvider", "Lmf0/g;", "b", "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzr2/a;)Lmf0/g;", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "Lze0/c$d;", "a", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25507f {
    /* JADX INFO: renamed from: a */
    private static final AbstractC40584c.d m74982a(NavigationBarModel navigationBarModel) {
        String navigationTitle = navigationBarModel.getNavigationTitle();
        TagModel tag = navigationBarModel.getTag();
        InterfaceC25312u interfaceC25312uM60541h = tag != null ? AbstractC25448c.m74762z0().m60541h(tag) : null;
        return new AbstractC40584c.d(navigationTitle, interfaceC25312uM60541h instanceof C17750h1 ? (C17750h1) interfaceC25312uM60541h : null);
    }

    /* JADX INFO: renamed from: b */
    public static final C25508g m74983b(TestInputScreenResponse testInputScreenResponse, InterfaceC41070a dateAndTimeProvider) {
        DateTime dateTimeMo133364c;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(testInputScreenResponse, "<this>");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        String dateTimeValue = testInputScreenResponse.getDateTimeValue();
        if (dateTimeValue == null || (dateTimeMo133364c = DateTime.parse(dateTimeValue, C28204u.INSTANCE.m85363f())) == null) {
            dateTimeMo133364c = dateAndTimeProvider.mo133364c();
        }
        LocalDateTime localDateTimeM133371d = AbstractC41071b.m133371d(dateAndTimeProvider, dateTimeMo133364c);
        AbstractC40584c.d dVarM74982a = m74982a(testInputScreenResponse.getNavigationBar());
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(testInputScreenResponse.getImageUrl());
        String title = testInputScreenResponse.getTitle();
        String subtitle = testInputScreenResponse.getSubtitle();
        String nameLabel = testInputScreenResponse.getNameLabel();
        String nameValue = testInputScreenResponse.getNameValue();
        String dateLabel = testInputScreenResponse.getDateLabel();
        String dateIcon = testInputScreenResponse.getDateIcon();
        if (dateIcon == null) {
            enumC16313m0 = null;
            break;
        }
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            EnumC16313m0 enumC16313m1 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), dateIcon)) {
                enumC16313m0 = enumC16313m1;
                break;
            }
            i13++;
        }
        return new C25508g(dVarM74982a, abstractC22403oM64503l, title, subtitle, nameLabel, nameValue, dateLabel, enumC16313m0, testInputScreenResponse.getTimeLabel(), localDateTimeM133371d, new C27238a0(testInputScreenResponse.getButton().getTextDisplay(), null, null, null, 0.0f, null, null, null, false, false, 1022, null), testInputScreenResponse.getDateTimeValue() != null);
    }
}
