package op1;

import ad3.AbstractC0757c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternType;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsGraphModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsHeaderButton;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import o72.C27644e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23713t0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import so1.C32808d;
import so1.C32810e;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: op1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lad3/c;", "json", "Ljb1/a;", "i", "(Lad3/c;)Ljb1/a;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "response", "", "trimesterId", "trendId", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "g", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/WhoopCoachVowModel;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "Ly71/o;", "n", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)Ly71/o;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28099d {

    /* JADX INFO: renamed from: op1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f113650w;

        public a(Function1 function1) {
            this.f113650w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f113650w.invoke((CyclePatternTileModel) it);
        }
    }

    /* JADX INFO: renamed from: op1.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f113651w = new b();

        /* JADX INFO: renamed from: a */
        public final long m84916a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m84916a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final PregnancyInsightsGraphModel m84907g(PregnancyInsightsResponse pregnancyInsightsResponse, String str, String str2) {
        if (AbstractC22676k.m65745e(str, "OVERVIEW")) {
            return pregnancyInsightsResponse.getOverviewGraphs().get(str2);
        }
        if (AbstractC22676k.m65745e(str, "CURRENT")) {
            return pregnancyInsightsResponse.getCurrentTrimesterGraphs().get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final WhoopCoachVowModel m84908h(PregnancyInsightsResponse pregnancyInsightsResponse, String str, String str2) {
        Map<String, WhoopCoachVowModel> currentTrimesterVows;
        if (AbstractC22676k.m65745e(str, "OVERVIEW")) {
            Map<String, WhoopCoachVowModel> overviewVows = pregnancyInsightsResponse.getOverviewVows();
            if (overviewVows != null) {
                return overviewVows.get(str2);
            }
            return null;
        }
        if (!AbstractC22676k.m65745e(str, "CURRENT") || (currentTrimesterVows = pregnancyInsightsResponse.getCurrentTrimesterVows()) == null) {
            return null;
        }
        return currentTrimesterVows.get(str2);
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m84909i(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        return AbstractC21537c.m60554d(new C28098c(json, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m84910j(AbstractC0757c abstractC0757c, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C28098c(abstractC0757c, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m84911k(AbstractC0757c abstractC0757c, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CyclePatternTileModel.class), new a(new C28098c(abstractC0757c, 2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C32810e m84912l(AbstractC0757c abstractC0757c, CyclePatternTileModel model) {
        CyclePatternType cyclePatternType;
        C32808d c32808d;
        AnalyticEventModel analyticEventModel;
        InterfaceC25312u interfaceC25312uM60544l;
        DecodedGenericInteraction decodedGenericInteraction;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        String type = model.getType();
        CyclePatternType cyclePatternType2 = CyclePatternType.YOUR_CYCLES;
        CyclePatternType[] cyclePatternTypeArrValues = CyclePatternType.values();
        int length = cyclePatternTypeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cyclePatternType = null;
                break;
            }
            cyclePatternType = cyclePatternTypeArrValues[i13];
            if (AbstractC22676k.m65745e(cyclePatternType.name(), type)) {
                break;
            }
            i13++;
        }
        CyclePatternType cyclePatternType3 = cyclePatternType == null ? cyclePatternType2 : cyclePatternType;
        List<DailyTickMarkPlotModel> cycles = model.getCycles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cycles, 10));
        Iterator<T> it = cycles.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC23713t0.m69422a((DailyTickMarkPlotModel) it.next()));
        }
        boolean showDividers = model.getShowDividers();
        int i14 = 0;
        Integer todayIndex = model.getTodayIndex();
        CyclePatternButtonModel button = model.getButton();
        if (button != null) {
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(button.getButtonTitle());
            String buttonIcon = button.getButtonIcon();
            if (buttonIcon == null) {
                enumC16313m0 = null;
                break;
            }
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), buttonIcon)) {
                    break;
                }
                i14++;
            }
            c32808d = new C32808d(textResourceM21278l2, enumC16313m0, button.getButtonDestination(), button.getAnalyticEvent());
        } else {
            c32808d = null;
        }
        DesignSystemModel emptyState = model.getEmptyState();
        if (emptyState != null) {
            interfaceC25312uM60544l = AbstractC21537c.m60554d(new C27644e(18)).m60544l(emptyState);
            analyticEventModel = null;
        } else {
            analyticEventModel = null;
            interfaceC25312uM60544l = null;
        }
        C32808d c32808d2 = c32808d;
        GenericInteraction genericInteraction = model.getGenericInteraction();
        GenericInteraction genericInteraction2 = model.getGenericInteraction();
        return new C32810e(textResourceM21278l, cyclePatternType3, arrayList, todayIndex, showDividers, c32808d2, interfaceC25312uM60544l, genericInteraction, (genericInteraction2 == null || (decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction2, abstractC0757c)) == null) ? analyticEventModel : decodedGenericInteraction.getAnalyticEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m84913m(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final C39282o m84914n(PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton) {
        C39274g c39274g;
        AbstractC22676k.m65750j(pregnancyInsightsHeaderButton, "<this>");
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(pregnancyInsightsHeaderButton.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(pregnancyInsightsHeaderButton.getSubtitle());
        String rightIcon = pregnancyInsightsHeaderButton.getRightIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (rightIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), rightIcon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(""));
        } else {
            c39274g = null;
        }
        return C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, textResourceM21278l2, null, null, null, c39274g, p745y81.Function1.m125323a(b.f113651w), null, null, null, null, null, false, false, pregnancyInsightsHeaderButton.getDestination(), false, null, null, null, false, null, 8322678, null);
    }
}
