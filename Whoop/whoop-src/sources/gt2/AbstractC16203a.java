package gt2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.hometile.domain.api.PlanItem;
import com.whoop.weeklyplan.hometile.domain.api.ProgressPercentage;
import com.whoop.weeklyplan.hometile.domain.api.ProgressSteps;
import com.whoop.weeklyplan.hometile.domain.api.TextDisplayStyle;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometile;
import gm1.C15992b;
import ht2.C17629a;
import ht2.C17635g;
import ht2.C17637i;
import ht2.EnumC17636h;
import ht2.EnumC17638j;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.C27256h;
import p01.C28582b;
import p01.EnumC28588h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gt2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "stepStyle", "percentStyle", "Lht2/j;", "d", "(Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lht2/j;", "Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "weeklyPlanHomeTileDesignItemReducer", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16203a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f61536a = AbstractC21537c.m60554d(new C15992b(5));

    /* JADX INFO: renamed from: gt2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f61537w;

        public a(Function1 function1) {
            this.f61537w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f61537w.invoke((WeeklyPlanHometile) it);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final EnumC17638j m45866d(TextDisplayStyle textDisplayStyle, TextDisplayStyle textDisplayStyle2) {
        TextDisplayStyle textDisplayStyle3 = TextDisplayStyle.WEEKLY_PLAN_IN_PROGRESS;
        return (textDisplayStyle == textDisplayStyle3 || textDisplayStyle2 == textDisplayStyle3) ? EnumC17638j.IN_PROGRESS : EnumC17638j.COMPLETE;
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m45867e() {
        return f61536a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m45868f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C15992b(6));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m45869g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WeeklyPlanHometile.class), new a(new C15992b(7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C17629a m45870h(WeeklyPlanHometile model) {
        C27256h c27256h;
        C28582b c28582b;
        AbstractC22676k.m65750j(model, "model");
        EnumC17636h enumC17636h = EnumC17636h.LOADING;
        String title = model.getTitle();
        String daysLeftDisplay = model.getDaysLeftDisplay();
        C17635g c17635g = new C17635g(AbstractC39414r.m125900s0(model.getProgressBar().getPercentString(), "%"), model.getProgressBar().getPercentSubtitle(), model.getProgressBar().getPercentValue());
        List<PlanItem> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (PlanItem planItem : items) {
            String title2 = planItem.getTitle();
            if (planItem.getCircularProgressIndicator().getCurrentProgressSteps() != null) {
                c28582b = new C28582b(planItem.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps(), planItem.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep(), 0.0f, planItem.getCircularProgressIndicator().getCurrentProgressSteps().getTextDisplay(), null, null, Boolean.valueOf(planItem.getCircularProgressIndicator().getCurrentProgressSteps().getStyle() == TextDisplayStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048500, null);
            } else {
                ProgressPercentage currentProgressPercentage = planItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                String textDisplay = currentProgressPercentage != null ? currentProgressPercentage.getTextDisplay() : null;
                ProgressPercentage currentProgressPercentage2 = planItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                float percentage = (currentProgressPercentage2 != null ? (float) currentProgressPercentage2.getPercentage() : 100.0f) / 100;
                ProgressPercentage currentProgressPercentage3 = planItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                c28582b = new C28582b(0, 0, percentage, textDisplay, null, null, Boolean.valueOf((currentProgressPercentage3 != null ? currentProgressPercentage3.getStyle() : null) == TextDisplayStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.PERCENTAGE, null, 786355, null);
            }
            C28582b c28582b2 = c28582b;
            ProgressSteps currentProgressSteps = planItem.getCircularProgressIndicator().getCurrentProgressSteps();
            TextDisplayStyle style = currentProgressSteps != null ? currentProgressSteps.getStyle() : null;
            ProgressPercentage currentProgressPercentage4 = planItem.getCircularProgressIndicator().getCurrentProgressPercentage();
            arrayList.add(new C17637i(title2, c28582b2, m45866d(style, currentProgressPercentage4 != null ? currentProgressPercentage4.getStyle() : null), planItem.getDestination(), planItem.getId()));
        }
        CardButtonModel cardButton = model.getCardButton();
        if (cardButton != null) {
            TextResource title3 = model.getCardButton().getTitle();
            String id4 = cardButton.getId();
            C9598e destination = model.getCardButton().getDestination();
            c27256h = new C27256h(title3, null, null, null, null, null, null, destination == null ? new C9598e(null, null, null, 7, null) : destination, null, null, null, null, null, false, false, id4, false, false, null, null, null, null, null, null, null, 33521534, null);
        } else {
            c27256h = null;
        }
        return new C17629a(enumC17636h, false, title, daysLeftDisplay, c17635g, arrayList, c27256h);
    }
}
