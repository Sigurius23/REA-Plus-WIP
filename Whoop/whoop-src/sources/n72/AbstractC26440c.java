package n72;

import b72.AbstractC2785c;
import b72.C2787e;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.sage.design.sagemeter.SageGaugeModel;
import com.whoop.sage.domain.models.StudyInsightsMetricModel;
import com.whoop.sage.domain.models.StudyInsightsModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m72.C25211j;
import m72.C25212k;
import m83.AbstractC25267u;
import mx1.C26009o;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import y71.C39274g;

/* JADX INFO: renamed from: n72.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljb1/a;", "f", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljb1/a;", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26440c {

    /* JADX INFO: renamed from: n72.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f105020w;

        public a(Function1 function1) {
            this.f105020w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f105020w.invoke((StudyInsightsModel) it);
        }
    }

    /* JADX INFO: renamed from: n72.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f105021w;

        public b(Function1 function1) {
            this.f105021w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f105021w.invoke((SageGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C21535a m78271f(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        return AbstractC21537c.m60554d(new C26438a(0, featureFlagChecker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m78272g(FeatureFlagChecker featureFlagChecker, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C26009o(29));
        designItemReducer.m60547b(new C26438a(1, featureFlagChecker));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m78273h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(StudyInsightsModel.class), new a(new C26439b(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C25212k m78274i(StudyInsightsModel model) {
        Integer numM46376a;
        AbstractC22676k.m65750j(model, "model");
        String imageUrl = model.getImageUrl();
        String cardTitle = model.getCardTitle();
        String cardSubtitle = model.getCardSubtitle();
        List<StudyInsightsMetricModel> metricList = model.getMetricList();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(metricList, 10));
        Iterator<T> it = metricList.iterator();
        while (true) {
            EnumC16313m0 enumC16313m0 = null;
            if (!it.hasNext()) {
                break;
            }
            StudyInsightsMetricModel studyInsightsMetricModel = (StudyInsightsMetricModel) it.next();
            String icon = studyInsightsMetricModel.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.RHR;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            arrayList.add(new C25211j(enumC16313m1, studyInsightsMetricModel.getTitle(), studyInsightsMetricModel.getStatDisplay(), studyInsightsMetricModel.getStatUnitDisplay()));
        }
        TextResource text = model.getSecondaryButton().getText();
        C9598e action = model.getSecondaryButton().getAction();
        String icon2 = model.getSecondaryButton().getIcon();
        return new C25212k(imageUrl, cardTitle, cardSubtitle, arrayList, new C27273p0(text, action, null, (icon2 == null || (numM46376a = AbstractC16315n0.m46376a(icon2)) == null) ? null : new C39274g(numM46376a.intValue(), null, 2, null), null, null, false, null, null, null, null, false, null, false, 16372, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m78275j(FeatureFlagChecker featureFlagChecker, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SageGaugeModel.class), new b(new C26438a(2, featureFlagChecker)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C2787e m78276k(FeatureFlagChecker featureFlagChecker, SageGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC2785c.m7918a(model, featureFlagChecker.isFeatureEnabled("sage-non-beta"));
    }
}
