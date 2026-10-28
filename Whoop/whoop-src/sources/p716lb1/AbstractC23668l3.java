package p716lb1;

import c41.C4084o1;
import c41.C4140w1;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.ActionCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.EntryPointAnalyticEventsModel;
import com.whoop.design.models.items.EntryPointModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import f01.C13851d;
import f01.EnumC13892q1;
import f01.EnumC13893r;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h01.C16534a0;
import h01.C16550q;
import h01.C16553t;
import h01.EnumC16533a;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.l3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lh01/a;", "cardType", "", "backgroundStyle", "k", "(Lh01/a;Ljava/lang/String;)Lh01/a;", "Llb1/y0;", "a", "Llb1/y0;", "j", "()Llb1/y0;", "notificationCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23668l3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93850a = Function1.m68251a(new C23654j3(2));

    /* JADX INFO: renamed from: lb1.l3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93851w;

        public a(Function1 function1) {
            this.f93851w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93851w.invoke((TextWithIllustrationCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.l3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93852w;

        public b(Function1 function1) {
            this.f93852w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93852w.invoke((TextWithDesignItemCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.l3$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93853w;

        public c(Function1 function1) {
            this.f93853w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93853w.invoke((TextOnlyCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.l3$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93854w;

        public d(Function1 function1) {
            this.f93854w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93854w.invoke((TextAndImageCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.l3$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93855w;

        public e(Function1 function1) {
            this.f93855w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93855w.invoke((ActionCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.l3$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93856w;

        public f(Function1 function1) {
            this.f93856w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93856w.invoke((EntryPointModel) it);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C23743y0 m69039j() {
        return f93850a;
    }

    /* JADX INFO: renamed from: k */
    private static final EnumC16533a m69040k(EnumC16533a enumC16533a, String str) {
        EnumC13892q1 enumC13892q1;
        if (str == null) {
            return enumC16533a;
        }
        EnumC13892q1 enumC13892q2 = EnumC13892q1.NONE;
        EnumC13892q1[] enumC13892q1ArrValues = EnumC13892q1.values();
        int length = enumC13892q1ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC13892q1 = null;
                break;
            }
            enumC13892q1 = enumC13892q1ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC13892q1.name(), str)) {
                break;
            }
            i13++;
        }
        if (enumC13892q1 != null) {
            enumC13892q2 = enumC13892q1;
        }
        return (enumC13892q2 == EnumC13892q1.ONBOARDING && enumC16533a == EnumC16533a.ONBOARDING) ? EnumC16533a.ONBOARDING_BG_GRADIENT : enumC16533a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m69041l(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23654j3 c23654j3 = new C23654j3(3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TextWithIllustrationCardModel.class), new a(c23654j3));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TextWithDesignItemCardModel.class), new b(new C23654j3(4)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TextOnlyCardModel.class), new c(new C23654j3(5)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TextAndImageCardModel.class), new d(new C23654j3(6)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ActionCardModel.class), new e(new C23654j3(7)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(EntryPointModel.class), new f(new C23654j3(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C16550q m69042m(TextWithIllustrationCardModel model) {
        String upperCase;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String appNotificationType = model.getAppNotificationType();
        String templateName = model.getTemplateName();
        EnumC22400l cta = model.getCta();
        if (cta == null) {
            cta = EnumC22400l.NONE;
        }
        EnumC22400l enumC22400l = cta;
        String ctaText = model.getCtaText();
        if (ctaText != null) {
            upperCase = ctaText.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(upperCase);
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBody());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getTitle());
        EnumC16533a enumC16533aM69040k = m69040k(model.getCardType(), model.getBackgroundStyle());
        boolean showHighlight = model.getShowHighlight();
        C9598e navigation = model.getNavigation();
        String ctaText2 = model.getCtaText();
        boolean z4 = (ctaText2 != null ? ctaText2.length() : 0) > 20;
        String titleIconUrl = model.getTitleIconUrl();
        return new C16550q(id4, textResourceM21278l2, appNotificationType, templateName, false, null, enumC16533aM69040k, enumC22400l, textResourceM21278l, cVar, textResourceM21278l3, false, showHighlight, false, false, navigation, z4, AbstractC16315n0.m46377b(model.getEndIcon()), titleIconUrl != null ? new AbstractC22403o.c(titleIconUrl, 0, 0, 0, 14, null) : null, null, null, 1599536, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C16550q m69043n(TextWithDesignItemCardModel model) {
        String upperCase;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(3));
        String id4 = model.getId();
        String appNotificationType = model.getAppNotificationType();
        String templateName = model.getTemplateName();
        EnumC22400l cta = model.getCta();
        if (cta == null) {
            cta = EnumC22400l.NONE;
        }
        EnumC22400l enumC22400l = cta;
        String ctaText = model.getCtaText();
        if (ctaText != null) {
            upperCase = ctaText.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(upperCase);
        String imageUrl = model.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBody());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getTitle());
        EnumC16533a enumC16533aM69040k = m69040k(model.getCardType(), model.getBackgroundStyle());
        boolean showHighlight = model.getShowHighlight();
        C9598e navigation = model.getNavigation();
        String ctaText2 = model.getCtaText();
        boolean z4 = (ctaText2 != null ? ctaText2.length() : 0) > 20;
        String titleIconUrl = model.getTitleIconUrl();
        AbstractC22403o.c cVar2 = titleIconUrl != null ? new AbstractC22403o.c(titleIconUrl, 0, 0, 0, 14, null) : null;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getEndIcon());
        DesignSystemModel rightItem = model.getRightItem();
        return new C16550q(id4, textResourceM21278l2, appNotificationType, templateName, false, null, enumC16533aM69040k, enumC22400l, textResourceM21278l, cVar, textResourceM21278l3, false, showHighlight, false, false, navigation, z4, enumC16313m0M46377b, cVar2, null, rightItem != null ? c21535aM60554d.m60541h(rightItem) : null, 550960, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m69044o(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C16534a0 m69045p(TextOnlyCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String appNotificationType = model.getAppNotificationType();
        String templateName = model.getTemplateName();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBody());
        EnumC16533a enumC16533aM69040k = m69040k(model.getCardType(), model.getBackgroundStyle());
        boolean showHighlight = model.getShowHighlight();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getEndIcon());
        String titleIconUrl = model.getTitleIconUrl();
        return new C16534a0(id4, textResourceM21278l2, appNotificationType, templateName, false, null, enumC16533aM69040k, textResourceM21278l, showHighlight, enumC16313m0M46377b, titleIconUrl != null ? new AbstractC22403o.c(titleIconUrl, 0, 0, 0, 14, null) : null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C16553t m69046q(TextAndImageCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String appNotificationType = model.getAppNotificationType();
        String templateName = model.getTemplateName();
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        EnumC16533a enumC16533aM69040k = m69040k(model.getCardType(), model.getBackgroundStyle());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBody());
        boolean showHighlight = model.getShowHighlight();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getEndIcon());
        String titleIconUrl = model.getTitleIconUrl();
        return new C16553t(id4, textResourceM21278l2, appNotificationType, templateName, false, null, enumC16533aM69040k, cVar, textResourceM21278l, false, showHighlight, enumC16313m0M46377b, titleIconUrl != null ? new AbstractC22403o.c(titleIconUrl, 0, 0, 0, 14, null) : null, 560, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C13851d m69047r(ActionCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBody());
        String ctaText = model.getCtaText();
        return new C13851d(id4, textResourceM21278l, textResourceM21278l2, ctaText != null ? AbstractC8693b.m21278l(ctaText) : null, AbstractC16315n0.m46377b(model.getCtaIcon()), AbstractC22676k.m65745e(model.getAction(), "SLEEP_PROCESS_NOW") ? EnumC13893r.SLEEP_PROCESS_NOW : null, new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), EnumC16533a.DEFAULT, model.getShowHighlight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: s */
    public static final C4140w1 m69048s(EntryPointModel model) {
        EnumC16533a enumC16533a;
        EnumC13892q1 enumC13892q1;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(4));
        String style = model.getCallToAction().getStyle();
        EnumC16533a enumC16533a2 = EnumC16533a.DEFAULT;
        EnumC16533a[] enumC16533aArrValues = EnumC16533a.values();
        int length = enumC16533aArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16533a = null;
                break;
            }
            enumC16533a = enumC16533aArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16533a.name(), style)) {
                break;
            }
            i14++;
        }
        if (enumC16533a != null) {
            enumC16533a2 = enumC16533a;
        }
        if (enumC16533a2 == EnumC16533a.PROMO_LINEAR && !AbstractC22676k.m65745e(model.getBackgroundStyle(), "PROMO_LINEAR")) {
            enumC16533a2 = EnumC16533a.PROMO_LINEAR_TRANSPARENCY;
        }
        String id4 = model.getId();
        TextResource title = model.getTitle();
        TextResource body = model.getBody();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getEndIcon());
        TextResource text = model.getCallToAction().getText();
        EnumC16313m0 enumC16313m0M46377b2 = AbstractC16315n0.m46377b(model.getCallToAction().getButtonIcon());
        String backgroundStyle = model.getBackgroundStyle();
        EnumC13892q1 enumC13892q2 = EnumC13892q1.NONE;
        EnumC13892q1[] enumC13892q1ArrValues = EnumC13892q1.values();
        int length2 = enumC13892q1ArrValues.length;
        while (true) {
            if (i13 >= length2) {
                enumC13892q1 = null;
                break;
            }
            enumC13892q1 = enumC13892q1ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC13892q1.name(), backgroundStyle)) {
                break;
            }
            i13++;
        }
        EnumC13892q1 enumC13892q3 = enumC13892q1 == null ? enumC13892q2 : enumC13892q1;
        String backgroundStyle2 = model.getBackgroundStyle();
        switch (backgroundStyle2.hashCode()) {
            case -1104367997:
                if (backgroundStyle2.equals("ADVANCED_LABS")) {
                    enumC16533a2 = EnumC16533a.ADVANCED_LABS;
                }
                break;
            case -590765663:
                if (backgroundStyle2.equals("ONBOARDING_WITH_BORDER")) {
                    enumC16533a2 = EnumC16533a.ONBOARDING_BG_GRADIENT;
                }
                break;
            case 71283:
                if (backgroundStyle2.equals("HAL")) {
                    enumC16533a2 = EnumC16533a.HAL;
                }
                break;
            case 782485418:
                if (backgroundStyle2.equals("ELEVATED")) {
                    enumC16533a2 = EnumC16533a.ELEVATED;
                }
                break;
        }
        EnumC16533a enumC16533a3 = enumC16533a2;
        AbstractC22403o.c cVar = model.getImageUrl() != null ? new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null) : null;
        C9598e destination = model.getDestination();
        TagModel navigationTag = model.getNavigationTag();
        InterfaceC25312u interfaceC25312uM60541h = navigationTag != null ? c21535aM60554d.m60541h(navigationTag) : null;
        Action dismissAction = model.getDismissAction();
        GenericInteraction genericInteraction = model.getGenericInteraction();
        EntryPointAnalyticEventsModel analyticEvents = model.getAnalyticEvents();
        return new C4140w1(id4, title, enumC16313m0M46377b, body, cVar, enumC13892q3, text, enumC16313m0M46377b2, enumC16533a3, destination, interfaceC25312uM60541h, dismissAction, genericInteraction, analyticEvents != null ? new C4084o1(analyticEvents.getView(), analyticEvents.getCta(), analyticEvents.getDismiss()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m69049t(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
