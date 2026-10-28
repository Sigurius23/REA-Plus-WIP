package p742vw1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonElementType;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonRowElement;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonTableModel;
import com.whoop.membership.familyPlan.domain.model.items.DividedCardButtons;
import com.whoop.membership.familyPlan.domain.model.items.SendEmailInviteModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.AbstractC23624f1;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import q21.AbstractC29845d;
import q21.C29846e;
import q21.C29850i;
import uw1.C35308a;
import uw1.C35315h;
import v41.C35657b0;
import vs2.C36478d;

/* JADX INFO: renamed from: vw1.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkotlin/Function1;", "Ljb1/b;", "Ll83/a0;", "block", "Ljb1/a;", "g", "(Lkotlin/jvm/functions/Function1;)Ljb1/a;", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: vw1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f156463a;

        static {
            int[] iArr = new int[ComparisonElementType.values().length];
            try {
                iArr[ComparisonElementType.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComparisonElementType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComparisonElementType.NUMBER_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComparisonElementType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComparisonElementType.ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f156463a = iArr;
        }
    }

    /* JADX INFO: renamed from: vw1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f156464w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f156464w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f156464w.invoke((DividedCardButtons) it);
        }
    }

    /* JADX INFO: renamed from: vw1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f156465w;

        public c(p715kotlin.jvm.functions.Function1 function1) {
            this.f156465w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f156465w.invoke((SendEmailInviteModel) it);
        }
    }

    /* JADX INFO: renamed from: vw1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f156466w;

        public d(p715kotlin.jvm.functions.Function1 function1) {
            this.f156466w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f156466w.invoke((ComparisonTableModel) it);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C21535a m117147g(p715kotlin.jvm.functions.Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        return AbstractC21537c.m60554d(new C35657b0(block, 13));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C21535a m117148h(p715kotlin.jvm.functions.Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C36478d(10);
        }
        return m117147g(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m117149i(C21536b c21536b) {
        AbstractC22676k.m65750j(c21536b, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m117150j(p715kotlin.jvm.functions.Function1 function1, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C36478d(11));
        function1.invoke(designItemReducer);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m117151k(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C36478d c36478d = new C36478d(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DividedCardButtons.class), new b(c36478d));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SendEmailInviteModel.class), new c(new C36478d(13)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ComparisonTableModel.class), new d(new C36478d(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C35308a m117152l(DividedCardButtons model) {
        AbstractC22676k.m65750j(model, "model");
        return new C35308a(AbstractC23613d4.m68662l(model.getTopButton(), null, 1, null), AbstractC23624f1.m68742e(model.getDivider()), AbstractC23613d4.m68662l(model.getBottomButton(), null, 1, null), AbstractC8693b.m21278l(model.getDisclaimerText()), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C35315h m117153m(SendEmailInviteModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C35315h(AbstractC8693b.m21278l(model.getTextFieldLabel()), null, null, false, AbstractC23613d4.m68662l(model.getCardButton(), null, 1, null), AbstractC8693b.m21278l(model.getDisclaimer()), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C29850i m117154n(ComparisonTableModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<List<ComparisonRowElement>> rows = model.getRows();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(m117155o((ComparisonRowElement) it3.next()));
            }
            arrayList.add(arrayList2);
        }
        C29846e.Companion companion = C29846e.INSTANCE;
        AbstractC17911t highlightedBackgroundColor = companion.m91380a("DOWNGRADE").getHighlightedBackgroundColor();
        Integer num = (Integer) AbstractC25265s.m74100H0(model.getHighlightedColumns());
        return new C29850i(num != null ? num.intValue() : 0, arrayList, highlightedBackgroundColor, null, null, companion.m91380a("FAMILY_PLAN"));
    }

    /* JADX INFO: renamed from: o */
    private static final AbstractC29845d m117155o(ComparisonRowElement comparisonRowElement) {
        AbstractC29845d fVar;
        String content = comparisonRowElement.getContent();
        if (content != null) {
            int i13 = a.f156463a[comparisonRowElement.getCellType().ordinal()];
            if (i13 == 1) {
                fVar = AbstractC29845d.a.f121968a;
            } else if (i13 == 2) {
                fVar = new AbstractC29845d.f(content);
            } else if (i13 == 3) {
                fVar = new AbstractC29845d.e(content, C29846e.INSTANCE.m91380a("FAMILY_PLAN"));
            } else if (i13 == 4) {
                fVar = new AbstractC29845d.d(new AbstractC22403o.c(content, 0, 0, 0, 14, null));
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(content);
                if (enumC16313m0M46377b == null) {
                    enumC16313m0M46377b = EnumC16313m0.WHOOP_LOGO;
                }
                fVar = new AbstractC29845d.c(enumC16313m0M46377b, C29846e.INSTANCE.m91380a("FAMILY_PLAN"));
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return AbstractC29845d.a.f121968a;
    }
}
