package jk1;

import c11.C3842i;
import c11.C3844k;
import c11.C3845l;
import c11.C3849p;
import c11.EnumC3846m;
import c11.EnumC3847n;
import c11.EnumC3848o;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.healthspan.domain.models.ContributorRangeDivision;
import com.whoop.healthspan.domain.models.ContributorRangeValue;
import com.whoop.healthspan.domain.models.ContributorsContainerResponse;
import com.whoop.healthspan.domain.models.HealthspanVowModel;
import com.whoop.healthspan.domain.models.LabsImpactCardModel;
import com.whoop.healthspan.domain.models.SingleContributorContainer;
import com.whoop.healthspan.domain.models.SingleContributorContainerContent;
import com.whoop.healthspan.domain.models.TileSectionModel;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import e81.C12827f0;
import fk1.C14553a;
import gz0.EnumC16313m0;
import hk1.AbstractC17387a;
import ik1.C18608e;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k71.C22256m;
import l83.C23454a0;
import lk1.AbstractC24493c;
import m83.AbstractC25267u;
import mk1.C25633e;
import mk1.EnumC25632d;
import nk1.C26798d;
import ny0.C27273p0;
import ok1.C27994a;
import p251jg.C21650c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.AbstractC23632g2;
import p716lb1.AbstractC23698q3;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: jk1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lfk1/a;", "drawerIdProvider", "Ljb1/a;", "u", "(Lfk1/a;)Ljb1/a;", "y", "Llb1/z0;", "Ll83/a0;", "m", "(Llb1/z0;Lfk1/a;)V", "k", "(Llb1/z0;)V", "Lcom/whoop/healthspan/domain/models/SingleContributorContainer;", "model", "Lc11/p;", "s", "(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lfk1/a;)Lc11/p;", "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "Lc11/i;", "t", "(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;)Lc11/i;", "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "Lc11/l;", "r", "(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;)Lc11/l;", "a", "Ljb1/a;", "getContributorContainerDependentReducer", "()Ljb1/a;", "contributorContainerDependentReducer", "healthspan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21757b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f83672a = AbstractC21537c.m60554d(new C21650c(9));

    /* JADX INFO: renamed from: jk1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f83673w;

        public a(Function1 function1) {
            this.f83673w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f83673w.invoke((HealthspanVowModel) it);
        }
    }

    /* JADX INFO: renamed from: jk1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f83674w;

        public b(Function1 function1) {
            this.f83674w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f83674w.invoke((ContributorsContainerResponse) it);
        }
    }

    /* JADX INFO: renamed from: jk1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f83675w;

        public c(Function1 function1) {
            this.f83675w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f83675w.invoke((LabsImpactCardModel) it);
        }
    }

    /* JADX INFO: renamed from: jk1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C22256m.m63894b((C22256m) it, null, null, null, null, null, null, null, null, EnumC39333f.WHITE_10, false, false, false, null, EnumC16313m0.CARET_FORWARD, null, null, null, null, null, null, null, null, null, 8380159, null);
        }
    }

    /* JADX INFO: renamed from: jk1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C11474i c11474i = (C11474i) it;
            C9598e navigationAction = c11474i.getNavigationAction();
            return C11474i.m30808f(c11474i, navigationAction != null ? new AbstractC17387a.b(navigationAction) : C23454a0.f92919a, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870910, null);
        }
    }

    /* JADX INFO: renamed from: jk1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f83676w;

        public f(Function1 function1) {
            this.f83676w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f83676w.invoke((TileSectionModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m61392A(C14553a c14553a, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m61405m(addModelMapper, c14553a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m61403k(C23749z0 c23749z0) {
        c23749z0.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HealthspanVowModel.class), new a(new C21650c(11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C25633e m61404l(HealthspanVowModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitleDisplay());
        String ctaTextDisplay = model.getCtaTextDisplay();
        EnumC25632d enumC25632d = null;
        TextResource textResourceM21278l3 = ctaTextDisplay != null ? AbstractC8693b.m21278l(ctaTextDisplay) : null;
        C9598e destination = model.getDestination();
        String style = model.getStyle();
        EnumC25632d enumC25632d2 = EnumC25632d.CARD;
        for (EnumC25632d enumC25632d3 : EnumC25632d.values()) {
            if (AbstractC22676k.m65745e(enumC25632d3.name(), style)) {
                enumC25632d = enumC25632d3;
                break;
            }
        }
        return new C25633e(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, destination, enumC25632d == null ? enumC25632d2 : enumC25632d);
    }

    /* JADX INFO: renamed from: m */
    private static final void m61405m(C23749z0 c23749z0, C14553a c14553a) {
        m61403k(c23749z0);
        C21756a c21756a = new C21756a(c14553a, 3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ContributorsContainerResponse.class), new b(c21756a));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(LabsImpactCardModel.class), new c(new C21756a(c14553a, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C18608e m61406n(C14553a c14553a, ContributorsContainerResponse model) {
        AbstractC22676k.m65750j(model, "model");
        List<SingleContributorContainer> contributors = model.getContributors();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(contributors, 10));
        Iterator<T> it = contributors.iterator();
        while (it.hasNext()) {
            arrayList.add(m61411s((SingleContributorContainer) it.next(), c14553a));
        }
        return new C18608e(arrayList, AbstractC24493c.m71286b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C26798d m61407o(C14553a c14553a, LabsImpactCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String strM41573a = c14553a.m41573a(model.getTitle());
        String title = model.getTitle();
        List<ImpactModel> trends = model.getTrends();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(trends, 10));
        Iterator<T> it = trends.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC23632g2.m68791d((ImpactModel) it.next()));
        }
        C27273p0 c27273p0M68666p = AbstractC23613d4.m68666p(model.getButton());
        PieChartModel pieChart = model.getPieChart();
        C12827f0 c12827f0M69309f = pieChart != null ? AbstractC23698q3.m69309f(pieChart) : null;
        String count = model.getCount();
        String category = model.getCategory();
        if (category == null) {
            category = "";
        }
        return new C26798d(strM41573a, title, arrayList, c27273p0M68666p, c12827f0M69309f, count, true, category);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61408p(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C21650c(10));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61409q(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m61403k(addModelMapper);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final C3845l m61410r(ContributorRangeValue contributorRangeValue) {
        EnumC3848o enumC3848o;
        String valueDisplay = contributorRangeValue.getValueDisplay();
        TextResource textResourceM21278l = valueDisplay != null ? AbstractC8693b.m21278l(valueDisplay) : null;
        String valueUnitDisplay = contributorRangeValue.getValueUnitDisplay();
        TextResource textResourceM21278l2 = valueUnitDisplay != null ? AbstractC8693b.m21278l(valueUnitDisplay) : null;
        double valueRangePercentage = contributorRangeValue.getValueRangePercentage();
        String style = contributorRangeValue.getStyle();
        EnumC3848o enumC3848o2 = EnumC3848o.ENABLED;
        EnumC3848o[] enumC3848oArrValues = EnumC3848o.values();
        int length = enumC3848oArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC3848o = null;
                break;
            }
            enumC3848o = enumC3848oArrValues[i13];
            if (AbstractC22676k.m65745e(enumC3848o.name(), style)) {
                break;
            }
            i13++;
        }
        EnumC3848o enumC3848o3 = enumC3848o == null ? enumC3848o2 : enumC3848o;
        String expandedValueLabelDisplay = contributorRangeValue.getExpandedValueLabelDisplay();
        return new C3845l(textResourceM21278l, textResourceM21278l2, valueRangePercentage, enumC3848o3, expandedValueLabelDisplay != null ? AbstractC8693b.m21278l(expandedValueLabelDisplay) : null);
    }

    /* JADX INFO: renamed from: s */
    private static final C3849p m61411s(SingleContributorContainer singleContributorContainer, C14553a c14553a) {
        String strM41573a = c14553a.m41573a(singleContributorContainer.getTitleDisplay());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(singleContributorContainer.getTitleDisplay());
        boolean zIsEnabled = singleContributorContainer.isEnabled();
        C3842i c3842iM61412t = m61412t(singleContributorContainer.getContent());
        Boolean boolIsOpen = singleContributorContainer.isOpen();
        return new C3849p(strM41573a, textResourceM21278l, zIsEnabled, c3842iM61412t, boolIsOpen != null ? boolIsOpen.booleanValue() : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private static final C3842i m61412t(SingleContributorContainerContent singleContributorContainerContent) {
        Object obj;
        int i13;
        EnumC3846m enumC3846m;
        EnumC3846m enumC3846m2;
        List<ContributorRangeDivision> rangeDivisions = singleContributorContainerContent.getRangeDivisions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rangeDivisions, 10));
        Iterator<T> it = rangeDivisions.iterator();
        while (true) {
            obj = null;
            i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            String style = ((ContributorRangeDivision) it.next()).getStyle();
            EnumC3846m enumC3846m3 = EnumC3846m.NEUTRAL;
            EnumC3846m[] enumC3846mArrValues = EnumC3846m.values();
            int length = enumC3846mArrValues.length;
            while (i13 < length) {
                EnumC3846m enumC3846m4 = enumC3846mArrValues[i13];
                if (AbstractC22676k.m65745e(enumC3846m4.name(), style)) {
                    obj = enumC3846m4;
                    break;
                }
                i13++;
            }
            if (obj != null) {
                enumC3846m3 = obj;
            }
            arrayList.add(new C3844k(enumC3846m3));
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(singleContributorContainerContent.getRangeLeftLabelDisplay());
        String rangeLeftLabelStyle = singleContributorContainerContent.getRangeLeftLabelStyle();
        EnumC3846m enumC3846m5 = EnumC3846m.NEUTRAL;
        EnumC3846m[] enumC3846mArrValues2 = EnumC3846m.values();
        int length2 = enumC3846mArrValues2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC3846m = null;
                break;
            }
            enumC3846m = enumC3846mArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC3846m.name(), rangeLeftLabelStyle)) {
                break;
            }
            i14++;
        }
        if (enumC3846m != null) {
            enumC3846m5 = enumC3846m;
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(singleContributorContainerContent.getRangeRightLabelDisplay());
        String rangeRightLabelStyle = singleContributorContainerContent.getRangeRightLabelStyle();
        EnumC3846m enumC3846m6 = EnumC3846m.NEUTRAL;
        EnumC3846m[] enumC3846mArrValues3 = EnumC3846m.values();
        int length3 = enumC3846mArrValues3.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length3) {
                enumC3846m2 = null;
                break;
            }
            enumC3846m2 = enumC3846mArrValues3[i15];
            if (AbstractC22676k.m65745e(enumC3846m2.name(), rangeRightLabelStyle)) {
                break;
            }
            i15++;
        }
        EnumC3846m enumC3846m7 = enumC3846m2 == null ? enumC3846m6 : enumC3846m2;
        C3845l c3845lM61410r = m61410r(singleContributorContainerContent.getTopRangeValue());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(singleContributorContainerContent.getImpactValueDisplay());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(singleContributorContainerContent.getImpactValueLabelDisplay());
        String impactValueStyle = singleContributorContainerContent.getImpactValueStyle();
        EnumC3847n enumC3847n = EnumC3847n.NEUTRAL;
        EnumC3847n[] enumC3847nArrValues = EnumC3847n.values();
        int length4 = enumC3847nArrValues.length;
        while (i13 < length4) {
            EnumC3847n enumC3847n2 = enumC3847nArrValues[i13];
            if (AbstractC22676k.m65745e(enumC3847n2.name(), impactValueStyle)) {
                obj = enumC3847n2;
                break;
            }
            i13++;
        }
        return new C3842i(arrayList, textResourceM21278l, enumC3846m5, textResourceM21278l2, enumC3846m7, c3845lM61410r, textResourceM21278l3, textResourceM21278l4, obj == null ? enumC3847n : obj, m61410r(singleContributorContainerContent.getExpandedBottomRangeValue()), f83672a.m60540g(singleContributorContainerContent.getExpandedItems()), AbstractC24493c.m71286b());
    }

    /* JADX INFO: renamed from: u */
    public static final C21535a m61413u(C14553a drawerIdProvider) {
        AbstractC22676k.m65750j(drawerIdProvider, "drawerIdProvider");
        return AbstractC21537c.m60554d(new C21756a(drawerIdProvider, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m61414v(C14553a c14553a, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C19223a(29, c14553a, designItemReducer));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m61415w(C14553a c14553a, C21536b c21536b, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m61405m(addModelMapper, c14553a);
        C21756a c21756a = new C21756a(c14553a, 1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TileSectionModel.class), new f(c21756a));
        c21536b.m60546a(c22673i0.getOrCreateKotlinClass(C22256m.class), new d());
        c21536b.m60546a(c22673i0.getOrCreateKotlinClass(C11474i.class), new e());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C27994a m61416x(C14553a c14553a, TileSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        String titleDisplay = model.getTitleDisplay();
        String primaryDescriptionDisplay = model.getPrimaryDescriptionDisplay();
        String secondaryDescriptionDisplay = model.getSecondaryDescriptionDisplay();
        List<DesignSystemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m61417y(c14553a).m60541h((DesignSystemModel) it.next()));
        }
        return new C27994a(titleDisplay, primaryDescriptionDisplay, secondaryDescriptionDisplay, arrayList);
    }

    /* JADX INFO: renamed from: y */
    public static final C21535a m61417y(C14553a drawerIdProvider) {
        AbstractC22676k.m65750j(drawerIdProvider, "drawerIdProvider");
        return AbstractC21537c.m60554d(new C21756a(drawerIdProvider, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m61418z(C14553a c14553a, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C21756a(c14553a, 5));
        return C23454a0.f92919a;
    }
}
