package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardBodyModel;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardFooterModel;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkWidthStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import f01.C13859f1;
import f01.C13862g1;
import f01.C13877l1;
import f11.C14005e;
import gz0.EnumC16313m0;
import j02.AbstractC21170u;
import l83.C23454a0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.y2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;", "model", "Lf01/l1;", "g", "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;", "body", "Lf01/f1;", "d", "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;)Lf01/f1;", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;", "footer", "Lf01/g1;", "e", "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;)Lf01/g1;", "Lcom/whoop/design/models/items/CardButtonModel;", "logButton", "Lny0/h;", "f", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "menstrualCycleInsightsCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23745y2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94074a = Function1.m68251a(new C23715t2(11));

    /* JADX INFO: renamed from: lb1.y2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94075w;

        public a(Function1 function1) {
            this.f94075w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94075w.invoke((MenstrualCycleInsightsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69704c() {
        return f94074a;
    }

    /* JADX INFO: renamed from: d */
    private static final C13859f1 m69705d(MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel) {
        CyclePhaseStyle cyclePhaseStyle;
        EnumC16313m0 enumC16313m0;
        String title = menstrualCycleInsightsCardBodyModel.getTitle();
        String supertitle = menstrualCycleInsightsCardBodyModel.getSupertitle();
        String metricTitle = menstrualCycleInsightsCardBodyModel.getMetricTitle();
        String icon = menstrualCycleInsightsCardBodyModel.getIcon();
        if (icon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13++;
            }
            cyclePhaseStyle = null;
        } else {
            cyclePhaseStyle = null;
            enumC16313m0 = null;
        }
        String statusText = menstrualCycleInsightsCardBodyModel.getStatusText();
        String status = menstrualCycleInsightsCardBodyModel.getStatus();
        for (CyclePhaseStyle cyclePhaseStyle2 : CyclePhaseStyle.values()) {
            if (AbstractC22676k.m65745e(cyclePhaseStyle2.name(), status)) {
                cyclePhaseStyle = cyclePhaseStyle2;
                break;
            }
        }
        return new C13859f1(title, supertitle, metricTitle, enumC16313m0, statusText, AbstractC23707s0.m69376a(cyclePhaseStyle));
    }

    /* JADX INFO: renamed from: e */
    private static final C13862g1 m69706e(MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel) {
        EnumC16313m0 enumC16313m0;
        String icon = menstrualCycleInsightsCardFooterModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.MENSTRUAL_CYCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C13862g1(enumC16313m1, menstrualCycleInsightsCardFooterModel.getTitle());
    }

    /* JADX INFO: renamed from: f */
    private static final C27256h m69707f(CardButtonModel cardButtonModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        TextResource title = cardButtonModel.getTitle();
        String icon = cardButtonModel.getIcon();
        if (icon != null) {
            enumC16313m0 = EnumC16313m0.ADD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        C9598e destination = cardButtonModel.getDestination();
        C9598e c9598e = destination == null ? new C9598e(null, null, null, 7, null) : destination;
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        return new C27256h(title, enumC16313m0, null, null, null, null, null, c9598e, null, null, null, null, null, false, true, null, zBooleanValue, false, null, null, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, cardButtonModel.getGenericInteraction(), null, null, 28221308, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C13877l1 m69708g(MenstrualCycleInsightsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        EnumC16313m0 enumC16313m0ValueOf = EnumC16313m0.valueOf(model.getEndIcon());
        C13859f1 c13859f1M69705d = m69705d(model.getBody());
        C14005e c14005eM69422a = AbstractC23713t0.m69422a(DailyTickMarkPlotModel.copy$default(model.getGraph(), null, null, true, null, null, DailyTickMarkWidthStyle.HEALTH_TAB, null, null, 219, null));
        MenstrualCycleInsightsCardFooterModel footer = model.getFooter();
        C13862g1 c13862g1M69706e = footer != null ? m69706e(footer) : null;
        C9598e destination = model.getDestination();
        CardButtonModel logButton = model.getLogButton();
        return new C13877l1(title, enumC16313m0ValueOf, c13859f1M69705d, c14005eM69422a, c13862g1M69706e, logButton != null ? m69707f(logButton) : null, destination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m69709h(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MenstrualCycleInsightsCardModel.class), new a(new C23715t2(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C13877l1 m69710i(MenstrualCycleInsightsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69708g(model);
    }
}
