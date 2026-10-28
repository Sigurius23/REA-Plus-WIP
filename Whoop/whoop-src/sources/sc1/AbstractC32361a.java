package sc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.targetrecommendation.TargetRecommendationWidgetModel;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButton;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonStyle;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonType;
import com.whoop.design.models.items.targetrecommendation.WidgetStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import s32.C32112d;
import s51.C32219p;
import z31.C40046c;
import z31.C40048e;
import z31.EnumC40044a;
import z31.EnumC40045b;
import z31.EnumC40047d;

/* JADX INFO: renamed from: sc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0017\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;", "Lz31/d;", "displayStatus", "Ljb1/a;", "reducer", "Lz31/e;", "l", "(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;)Lz31/e;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;", "Lz31/b;", "k", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;)Lz31/b;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;", "Lz31/a;", "j", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;)Lz31/a;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", "i", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;)Lz31/d;", "a", "Ll83/h;", "d", "()Ljb1/a;", "targetRecommendationNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "e", "()Llb1/y0;", "targetRecommendationWidgetMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32361a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f133950a = AbstractC30060g.m92088H(new C32219p(19));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f133951b = Function1.m68251a(new C32112d(28));

    /* JADX INFO: renamed from: sc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133952a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f133953b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f133954c;

        static {
            int[] iArr = new int[WidgetFooterButtonType.values().length];
            try {
                iArr[WidgetFooterButtonType.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetFooterButtonType.START_WORKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetFooterButtonType.UPDATE_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetFooterButtonType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f133952a = iArr;
            int[] iArr2 = new int[WidgetFooterButtonStyle.values().length];
            try {
                iArr2[WidgetFooterButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WidgetFooterButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f133953b = iArr2;
            int[] iArr3 = new int[WidgetStatus.values().length];
            try {
                iArr3[WidgetStatus.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[WidgetStatus.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[WidgetStatus.EDITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f133954c = iArr3;
        }
    }

    /* JADX INFO: renamed from: sc1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f133955w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f133955w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f133955w.invoke((TargetRecommendationWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final C21535a m100783d() {
        return (C21535a) f133950a.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m100784e() {
        return f133951b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21535a m100785f() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m100786g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TargetRecommendationWidgetModel.class), new b(new C32112d(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C40048e m100787h(TargetRecommendationWidgetModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m100792m(model, null, null, 3, null);
    }

    /* JADX INFO: renamed from: i */
    private static final EnumC40047d m100788i(WidgetStatus widgetStatus) {
        int i13 = a.f133954c[widgetStatus.ordinal()];
        if (i13 == 1) {
            return EnumC40047d.ENABLED;
        }
        if (i13 == 2) {
            return EnumC40047d.DISABLED;
        }
        if (i13 == 3) {
            return EnumC40047d.EDITED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    private static final EnumC40044a m100789j(WidgetFooterButtonStyle widgetFooterButtonStyle) {
        int i13 = a.f133953b[widgetFooterButtonStyle.ordinal()];
        if (i13 == 1) {
            return EnumC40044a.PRIMARY;
        }
        if (i13 == 2) {
            return EnumC40044a.SECONDARY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private static final EnumC40045b m100790k(WidgetFooterButtonType widgetFooterButtonType) {
        int i13 = a.f133952a[widgetFooterButtonType.ordinal()];
        if (i13 == 1) {
            return EnumC40045b.RESET;
        }
        if (i13 == 2) {
            return EnumC40045b.START_WORKOUT;
        }
        if (i13 == 3) {
            return EnumC40045b.UPDATE_TARGET;
        }
        if (i13 == 4) {
            return EnumC40045b.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final C40048e m100791l(TargetRecommendationWidgetModel targetRecommendationWidgetModel, EnumC40047d enumC40047d, C21535a reducer) {
        AbstractC22676k.m65750j(targetRecommendationWidgetModel, "<this>");
        AbstractC22676k.m65750j(reducer, "reducer");
        if (enumC40047d == null) {
            enumC40047d = m100788i(targetRecommendationWidgetModel.getStatus());
        }
        List<DesignSystemModel> body = targetRecommendationWidgetModel.getBody();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = body.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60544l = reducer.m60544l((DesignSystemModel) it.next());
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        List<WidgetFooterButton> footerButtons = targetRecommendationWidgetModel.getFooterButtons();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(footerButtons, 10));
        for (WidgetFooterButton widgetFooterButton : footerButtons) {
            arrayList2.add(new C40046c(m100790k(widgetFooterButton.getType()), widgetFooterButton.getTitle(), m100789j(widgetFooterButton.getStyle()), widgetFooterButton.getInteraction()));
        }
        return new C40048e(enumC40047d, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C40048e m100792m(TargetRecommendationWidgetModel targetRecommendationWidgetModel, EnumC40047d enumC40047d, C21535a c21535a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC40047d = null;
        }
        if ((i13 & 2) != 0) {
            c21535a = m100783d();
        }
        return m100791l(targetRecommendationWidgetModel, enumC40047d, c21535a);
    }
}
