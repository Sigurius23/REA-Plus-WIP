package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ComparisonTableCell;
import com.whoop.design.models.items.ComparisonTableModel;
import com.whoop.design.models.items.MembershipComparisonTableModel;
import com.whoop.design.models.items.MembershipPlan;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.StrainBreakDownModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.C27256h;
import ny0.C27273p0;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import q21.AbstractC29845d;
import q21.C29846e;
import q21.C29850i;
import wb3.AbstractC37056f;
import y01.C39020c;
import y71.C39274g;
import yb3.AbstractC39414r;
import z01.C39943d;

/* JADX INFO: renamed from: lb1.n0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableCell;", "Lz01/d$a;", "q", "(Lcom/whoop/design/models/items/ComparisonTableCell;)Lz01/d$a;", "Llb1/y0;", "a", "Llb1/y0;", "p", "()Llb1/y0;", "comparisonMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23677n0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93873a = Function1.m68251a(new C23644i0(11));

    /* JADX INFO: renamed from: lb1.n0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93874a;

        static {
            int[] iArr = new int[ComparisonTableCell.CellType.values().length];
            try {
                iArr[ComparisonTableCell.CellType.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComparisonTableCell.CellType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComparisonTableCell.CellType.NUMBER_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComparisonTableCell.CellType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComparisonTableCell.CellType.ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93874a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.n0$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f93875w = new b();

        /* JADX INFO: renamed from: a */
        public final long m69121a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69121a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.n0$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f93876w = new c();

        /* JADX INFO: renamed from: a */
        public final long m69122a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69122a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.n0$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f93877w = new d();

        /* JADX INFO: renamed from: a */
        public final long m69123a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69123a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.n0$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f93878w = new e();

        /* JADX INFO: renamed from: a */
        public final long m69124a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69124a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.n0$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93879w;

        public f(Function1 function1) {
            this.f93879w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93879w.invoke((StrainBreakDownModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.n0$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93880w;

        public g(Function1 function1) {
            this.f93880w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93880w.invoke((MembershipComparisonTableModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.n0$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93881w;

        public h(Function1 function1) {
            this.f93881w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93881w.invoke((ComparisonTableModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69109f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23644i0 c23644i0 = new C23644i0(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StrainBreakDownModel.class), new f(c23644i0));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipComparisonTableModel.class), new g(new C23644i0(13)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ComparisonTableModel.class), new h(new C23644i0(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C39020c m69110g(StrainBreakDownModel model) {
        AbstractC22676k.m65750j(model, "model");
        double d3 = 100;
        double cardioTotalPercent = model.getCardioTotalPercent() * d3;
        return new C39020c(new C23465k(Float.valueOf((float) cardioTotalPercent), Float.valueOf((float) (d3 - cardioTotalPercent))), model.getCardioTitleDisplay(), model.getMskTitleDisplay(), model.getCardioPercentDisplay(), model.getMskPercentDisplay(), null, 0.0f, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C29850i m69111h(MembershipComparisonTableModel membershipComparisonTableModel) {
        C27256h c27256h;
        C27273p0 c27273p0;
        Integer numM46376a;
        Object objM69113j;
        MembershipComparisonTableModel model = membershipComparisonTableModel;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(9));
        Iterator<MembershipPlan> it = model.getPlans().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (it.next().isHighlighted()) {
                break;
            }
            i13++;
        }
        C29846e c29846eM91380a = C29846e.INSTANCE.m91380a(model.getPlans().get(i13).getStyle());
        List listM118958J = AbstractC37056f.m118958J(AbstractC29845d.a.f121968a);
        List<MembershipPlan> plans = model.getPlans();
        int i14 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(plans, 10));
        Iterator<T> it3 = plans.iterator();
        while (it3.hasNext()) {
            String header = ((MembershipPlan) it3.next()).getHeader();
            arrayList.add(header != null ? new AbstractC29845d.g(header) : AbstractC29845d.a.f121968a);
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(listM118958J, arrayList);
        List listM118958J2 = AbstractC37056f.m118958J(AbstractC29845d.a.f121968a);
        List<MembershipPlan> plans2 = model.getPlans();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(plans2, 10));
        Iterator<T> it4 = plans2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(m69115l((MembershipPlan) it4.next()));
        }
        ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(listM118958J2, arrayList2);
        List listM118958J3 = AbstractC37056f.m118958J(new AbstractC29845d.f(model.getPriceLabel()));
        List<MembershipPlan> plans3 = model.getPlans();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(plans3, 10));
        for (MembershipPlan membershipPlan : plans3) {
            arrayList3.add(new AbstractC29845d.e(membershipPlan.getPrice(), m69116m(membershipPlan)));
        }
        ArrayList arrayListM74129g3 = AbstractC25265s.m74129g1(listM118958J3, arrayList3);
        List<String> features = model.getFeatures();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(features, 10));
        int i15 = 0;
        for (Object obj : features) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            List listM118958J4 = AbstractC37056f.m118958J(new AbstractC29845d.f((String) obj));
            List<MembershipPlan> plans4 = model.getPlans();
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(plans4, i14));
            int i17 = 0;
            for (Object obj2 : plans4) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                MembershipPlan membershipPlan2 = (MembershipPlan) obj2;
                boolean z4 = i17 == i13;
                if (i15 == 0 && i17 == 0) {
                    objM69113j = m69113j(membershipPlan2, z4);
                } else if (i17 == 0) {
                    objM69113j = m69117n(membershipPlan2) ? m69114k(membershipPlan2) : new AbstractC29845d.f("-");
                } else {
                    objM69113j = m69113j(membershipPlan2, z4);
                }
                arrayList5.add(objM69113j);
                i17 = i18;
            }
            arrayList4.add(AbstractC25265s.m74129g1(listM118958J4, arrayList5));
            i14 = 10;
            model = membershipComparisonTableModel;
            i15 = i16;
        }
        int i19 = i13 + 1;
        ArrayList arrayListM74129g4 = AbstractC25265s.m74129g1(AbstractC37056f.m118959K(arrayListM74129g1, arrayListM74129g2, arrayListM74129g3), arrayList4);
        AbstractC17911t highlightedBackgroundColor = c29846eM91380a.getHighlightedBackgroundColor();
        CardButtonModel button = membershipComparisonTableModel.getButton();
        if (button != null) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h(button);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h = (C27256h) interfaceC25312uM60541h;
        } else {
            c27256h = null;
        }
        SecondaryButtonModel secondaryButton = membershipComparisonTableModel.getSecondaryButton();
        if (secondaryButton != null) {
            TextResource text = secondaryButton.getText();
            C9598e action = secondaryButton.getAction();
            String icon = secondaryButton.getIcon();
            c27273p0 = new C27273p0(text, action, null, (icon == null || (numM46376a = AbstractC16315n0.m46376a(icon)) == null) ? null : new C39274g(numM46376a.intValue(), null, 2, null), null, null, false, null, null, null, null, false, null, false, 16372, null);
        } else {
            c27273p0 = null;
        }
        return new C29850i(i19, arrayListM74129g4, highlightedBackgroundColor, c27256h, c27273p0, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69112i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final AbstractC29845d m69113j(MembershipPlan membershipPlan, boolean z4) {
        C29846e c29846eM69116m = m69116m(membershipPlan);
        if (AbstractC22676k.m65745e(membershipPlan.getStyle(), "ADVANCED_LABS") && !z4) {
            c29846eM69116m = C29846e.m91369b(c29846eM69116m, p745y81.Function1.m125323a(b.f93875w), null, null, null, null, p745y81.Function1.m125323a(c.f93876w), null, 94, null);
        }
        return new AbstractC29845d.c(EnumC16313m0.TINY_CHECKMARK, c29846eM69116m);
    }

    /* JADX INFO: renamed from: k */
    private static final AbstractC29845d m69114k(MembershipPlan membershipPlan) {
        return new AbstractC29845d.c(EnumC16313m0.CROSS, C29846e.m91369b(m69116m(membershipPlan), p745y81.Function1.m125323a(d.f93877w), null, null, null, null, p745y81.Function1.m125323a(e.f93878w), null, 94, null));
    }

    /* JADX INFO: renamed from: l */
    private static final AbstractC29845d m69115l(MembershipPlan membershipPlan) {
        String iconUrl = membershipPlan.getIconUrl();
        if (iconUrl != null && !AbstractC39414r.m125890i0(iconUrl)) {
            return new AbstractC29845d.d(new AbstractC22403o.c(membershipPlan.getIconUrl(), 0, 0, 0, 14, null));
        }
        String planText = membershipPlan.getPlanText();
        return (planText == null || AbstractC39414r.m125890i0(planText)) ? AbstractC29845d.a.f121968a : new AbstractC29845d.b(AbstractC8693b.m21278l(membershipPlan.getPlanText()));
    }

    /* JADX INFO: renamed from: m */
    private static final C29846e m69116m(MembershipPlan membershipPlan) {
        return C29846e.INSTANCE.m91380a(membershipPlan.getStyle());
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m69117n(MembershipPlan membershipPlan) {
        return AbstractC22676k.m65745e(membershipPlan.getStyle(), "ADVANCED_LABS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C39943d m69118o(ComparisonTableModel model) {
        Integer num;
        AbstractC22676k.m65750j(model, "model");
        List<List<ComparisonTableCell>> rows = model.getRows();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(m69120q((ComparisonTableCell) it3.next()));
            }
            arrayList.add(new C39943d.b(arrayList2));
        }
        Set<Integer> highlightedColumns = model.getHighlightedColumns();
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            Integer numValueOf = Integer.valueOf(((C39943d.b) it4.next()).m128120a().size());
            while (it4.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((C39943d.b) it4.next()).m128120a().size());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        boolean z4 = false;
        int iIntValue = num != null ? num.intValue() : 0;
        if (arrayList.size() > 1 && (AbstractC25265s.m74100H0(((C39943d.b) AbstractC25265s.m74096F0(arrayList)).m128120a()) instanceof C39943d.a.C42720a)) {
            z4 = true;
        }
        return new C39943d(highlightedColumns, arrayList, iIntValue, z4);
    }

    /* JADX INFO: renamed from: p */
    public static final C23743y0 m69119p() {
        return f93873a;
    }

    /* JADX INFO: renamed from: q */
    private static final C39943d.a m69120q(ComparisonTableCell comparisonTableCell) {
        EnumC16313m0 enumC16313m0M46377b;
        int i13 = a.f93874a[comparisonTableCell.getCellType().ordinal()];
        if (i13 == 1) {
            return C39943d.a.C42720a.f172399a;
        }
        if (i13 == 2) {
            String content = comparisonTableCell.getContent();
            return new C39943d.a.e(content != null ? content : "");
        }
        if (i13 == 3) {
            String content2 = comparisonTableCell.getContent();
            return new C39943d.a.d(content2 != null ? content2 : "");
        }
        if (i13 == 4) {
            String content3 = comparisonTableCell.getContent();
            return new C39943d.a.c(new AbstractC22403o.c(content3 == null ? "" : content3, 0, 0, 0, 14, null));
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String content4 = comparisonTableCell.getContent();
        return (content4 == null || (enumC16313m0M46377b = AbstractC16315n0.m46377b(content4)) == null) ? C39943d.a.C42720a.f172399a : new C39943d.a.b(enumC16313m0M46377b);
    }
}
