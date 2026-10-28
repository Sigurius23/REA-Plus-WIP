package up1;

import bo1.C3507a;
import bo1.C3508b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.DateSelectedTileModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsMenuItemModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsPrivacy;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsToggle;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell;
import gz0.EnumC16313m0;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import so1.C32816h;
import tp1.C34067g;
import tp1.C34069i;
import tp1.C34071k;
import tp1.C34072l;
import tp1.EnumC34068h;
import tp1.EnumC34078r;
import uk2.C35051a;

/* JADX INFO: renamed from: up1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "i", "()Ljb1/a;", "settingsTileReducer", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35153c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f149155a = AbstractC21537c.m60554d(new C35051a(5));

    /* JADX INFO: renamed from: up1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149156w;

        public a(Function1 function1) {
            this.f149156w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149156w.invoke((HormonalInsightsToggle) it);
        }
    }

    /* JADX INFO: renamed from: up1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149157w;

        public b(Function1 function1) {
            this.f149157w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149157w.invoke((HormonalInsightsMenuItemModel) it);
        }
    }

    /* JADX INFO: renamed from: up1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149158w;

        public c(Function1 function1) {
            this.f149158w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149158w.invoke((HormonalInsightsUpsell) it);
        }
    }

    /* JADX INFO: renamed from: up1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149159w;

        public d(Function1 function1) {
            this.f149159w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149159w.invoke((HormonalInsightsPrivacy) it);
        }
    }

    /* JADX INFO: renamed from: up1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149160w;

        public e(Function1 function1) {
            this.f149160w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149160w.invoke((FertilitySettingsToggleModel) it);
        }
    }

    /* JADX INFO: renamed from: up1.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f149161w;

        public f(Function1 function1) {
            this.f149161w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f149161w.invoke((DateSelectedTileModel) it);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m111212i() {
        return f149155a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m111213j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C35051a(6));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m111214k(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C35051a c35051a = new C35051a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HormonalInsightsToggle.class), new a(c35051a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HormonalInsightsMenuItemModel.class), new b(new C35051a(8)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HormonalInsightsUpsell.class), new c(new C35051a(9)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HormonalInsightsPrivacy.class), new d(new C35051a(10)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FertilitySettingsToggleModel.class), new e(new C35051a(11)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DateSelectedTileModel.class), new f(new C35051a(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX INFO: renamed from: l */
    public static final C34071k m111215l(HormonalInsightsToggle model) {
        EnumC34078r enumC34078r;
        EnumC34078r enumC34078r2;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getDescriptionDisplay());
        boolean enabled = model.getEnabled();
        String type = model.getType();
        if (type != null) {
            enumC34078r = EnumC34078r.HORMONAL_INSIGHTS;
            EnumC34078r[] enumC34078rArrValues = EnumC34078r.values();
            int length = enumC34078rArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC34078r2 = null;
                    break;
                }
                enumC34078r2 = enumC34078rArrValues[i13];
                if (AbstractC22676k.m65745e(enumC34078r2.name(), type)) {
                    break;
                }
                i13++;
            }
            if (enumC34078r2 != null) {
                enumC34078r = enumC34078r2;
            }
            if (enumC34078r == null) {
                enumC34078r = EnumC34078r.HORMONAL_INSIGHTS;
            }
        } else {
            enumC34078r = EnumC34078r.HORMONAL_INSIGHTS;
        }
        return new C34071k(textResourceM21278l, textResourceM21278l2, enabled, enumC34078r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C34067g m111216m(HormonalInsightsMenuItemModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String leftIcon = model.getLeftIcon();
        EnumC34068h enumC34068h = null;
        if (leftIcon == null) {
            enumC16313m0 = null;
            break;
        }
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i13++;
        }
        String rightIcon = model.getRightIcon();
        if (rightIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), rightIcon)) {
                    break;
                }
                i14++;
            }
            enumC16313m1 = enumC16313m2;
        } else {
            enumC16313m1 = null;
        }
        String type = model.getType();
        if (type != null) {
            for (EnumC34068h enumC34068h2 : EnumC34068h.values()) {
                if (AbstractC22676k.m65745e(enumC34068h2.name(), type)) {
                    enumC34068h = enumC34068h2;
                    break;
                }
            }
        }
        return new C34067g(textResourceM21278l, enumC16313m0, enumC16313m1, model.getDestination(), enumC34068h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C34072l m111217n(HormonalInsightsUpsell model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getDescriptionDisplay());
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_INFORMATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
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
        EnumC16313m0 enumC16313m3 = enumC16313m1 == null ? enumC16313m2 : enumC16313m1;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getCtaTextDisplay());
        String ctaIcon = model.getCtaIcon();
        if (ctaIcon != null) {
            EnumC16313m0 enumC16313m4 = EnumC16313m0.ARROW_FORWARD;
            for (EnumC16313m0 enumC16313m5 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m5.name(), ctaIcon)) {
                    enumC16313m0 = enumC16313m5;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m4;
            }
        }
        return new C34072l(textResourceM21278l, enumC16313m3, textResourceM21278l2, enumC16313m0, model.getCtaDestination(), model.getDismissable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C34069i m111218o(HormonalInsightsPrivacy model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getDescriptionDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getCtaTextDisplay());
        String ctaIcon = model.getCtaIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), ctaIcon)) {
                break;
            }
            i13++;
        }
        return new C34069i(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, enumC16313m0 == null ? enumC16313m1 : enumC16313m0, model.getCtaUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C3508b m111219p(FertilitySettingsToggleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return C3507a.f13973a.m10354a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C32816h m111220q(DateSelectedTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C32816h(AbstractC8693b.m21278l(model.getTitleDisplay()), AbstractC8693b.m21278l(model.getDueDateDisplay()));
    }
}
