package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.archmini.ArchMiniCalendarModel;
import com.whoop.design.models.calendar.archmini.CalendarContentModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import ib1.C18334a;
import ib1.EnumC18335b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "archMiniCalendarMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23676n {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93871a = Function1.m68251a(new C23670m(0));

    /* JADX INFO: renamed from: lb1.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93872w;

        public a(Function1 function1) {
            this.f93872w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93872w.invoke((ArchMiniCalendarModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69100c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArchMiniCalendarModel.class), new a(new C23670m(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C18334a m69101d(ArchMiniCalendarModel model) {
        EnumC18335b enumC18335b;
        AbstractC22676k.m65750j(model, "model");
        ApiRequest request = model.getRequest();
        CachePolicyModel cachePolicy = model.getCachePolicy();
        CalendarContentModel content = model.getContent();
        String selectedDate = model.getSelectedDate();
        int futureMonthsShown = model.getFutureMonthsShown();
        boolean showsDefaultDateSelector = model.getShowsDefaultDateSelector();
        Float pageHeightRatio = model.getPageHeightRatio();
        String heightConfiguration = model.getHeightConfiguration();
        if (heightConfiguration == null) {
            heightConfiguration = "";
        }
        EnumC18335b enumC18335b2 = EnumC18335b.FIXED;
        EnumC18335b[] enumC18335bArrValues = EnumC18335b.values();
        int length = enumC18335bArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC18335b = null;
                break;
            }
            enumC18335b = enumC18335bArrValues[i13];
            if (AbstractC22676k.m65745e(enumC18335b.name(), heightConfiguration)) {
                break;
            }
            i13++;
        }
        return new C18334a(request, cachePolicy, content, selectedDate, futureMonthsShown, showsDefaultDateSelector, pageHeightRatio, enumC18335b == null ? enumC18335b2 : enumC18335b);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69102e() {
        return f93871a;
    }
}
