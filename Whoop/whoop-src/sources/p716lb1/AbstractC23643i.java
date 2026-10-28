package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionStyleModel;
import com.whoop.design.models.items.ContributorModel;
import com.whoop.design.models.items.ContributorSectionModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y41.C39215f;
import y41.C39216g;
import y41.C39217h;
import y41.C39218i;
import y41.EnumC39214e;

/* JADX INFO: renamed from: lb1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "aiWeeklyPlanSuggestionMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23643i {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93792a = Function1.m68251a(new C23587a(12));

    /* JADX INFO: renamed from: lb1.i$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93793a;

        static {
            int[] iArr = new int[AiWeeklyPlanSuggestionStyleModel.values().length];
            try {
                iArr[AiWeeklyPlanSuggestionStyleModel.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f93793a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93794w;

        public b(Function1 function1) {
            this.f93794w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93794w.invoke((AiWeeklyPlanSuggestionModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68858c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiWeeklyPlanSuggestionModel.class), new b(new C23587a(13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C39215f m68859d(AiWeeklyPlanSuggestionModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        String titleIcon = model.getTitleIcon();
        EnumC16313m0 enumC16313m2 = null;
        if (titleIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), titleIcon)) {
                    break;
                }
                i13++;
            }
            enumC16313m0 = enumC16313m1;
        } else {
            enumC16313m0 = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        List<ContributorSectionModel> contributorSections = model.getContributorSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(contributorSections, 10));
        for (ContributorSectionModel contributorSectionModel : contributorSections) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(contributorSectionModel.getContributorSectionTitle());
            List<ContributorModel> contributors = contributorSectionModel.getContributors();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(contributors, 10));
            for (ContributorModel contributorModel : contributors) {
                arrayList2.add(new C39217h(AbstractC8693b.m21278l(contributorModel.getTitle()), AbstractC8693b.m21278l(contributorModel.getSubtitle())));
            }
            arrayList.add(new C39216g(textResourceM21278l3, arrayList2));
        }
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getSecondaryActionButton().getText());
        String icon = model.getSecondaryActionButton().getIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.AI_SPARKLE;
        for (EnumC16313m0 enumC16313m4 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m4.name(), icon)) {
                enumC16313m2 = enumC16313m4;
                break;
            }
        }
        if (enumC16313m2 != null) {
            enumC16313m3 = enumC16313m2;
        }
        C39218i c39218i = new C39218i(textResourceM21278l4, enumC16313m3, model.getSecondaryActionButton().getAction());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(model.getExplanationTitle());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(model.getExplanation());
        AiWeeklyPlanSuggestionStyleModel style = model.getStyle();
        return new C39215f(enumC16313m0, textResourceM21278l, textResourceM21278l2, arrayList, c39218i, textResourceM21278l5, textResourceM21278l6, (style == null ? -1 : a.f93793a[style.ordinal()]) == 1 ? EnumC39214e.COMPACT : EnumC39214e.DEFAULT, false, 256, null);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68860e() {
        return f93792a;
    }
}
