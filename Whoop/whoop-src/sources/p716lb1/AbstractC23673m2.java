package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ItemsCardFooterAlignment;
import com.whoop.design.models.items.ItemsCardFooterModel;
import com.whoop.design.models.items.ItemsCardHeaderModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import java.util.List;
import jb1.C21535a;
import m83.C25271y;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22965i;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import v71.C35762c;
import v71.C35764e;
import v71.C35768i;
import v71.EnumC35760a;

/* JADX INFO: renamed from: lb1.m2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardModel;", "model", "Ljb1/a;", "reducer", "Lv71/i;", "d", "(Lcom/whoop/design/models/items/ItemsCardModel;Ljb1/a;)Lv71/i;", "Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "Lv71/e;", "c", "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;)Lv71/e;", "Lcom/whoop/design/models/items/ItemsCardFooterModel;", "Lv71/c;", "b", "(Lcom/whoop/design/models/items/ItemsCardFooterModel;)Lv71/c;", "Lcom/whoop/design/models/items/ItemsCardFooterAlignment;", "alignment", "Ll0/i;", "a", "(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;)Ll0/i;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23673m2 {

    /* JADX INFO: renamed from: lb1.m2$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93865a;

        static {
            int[] iArr = new int[ItemsCardFooterAlignment.values().length];
            try {
                iArr[ItemsCardFooterAlignment.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemsCardFooterAlignment.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93865a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC22965i m69080a(ItemsCardFooterAlignment alignment) {
        AbstractC22676k.m65750j(alignment, "alignment");
        int i13 = a.f93865a[alignment.ordinal()];
        if (i13 == 1) {
            return AbstractC22977m.f90651b;
        }
        if (i13 == 2) {
            return AbstractC22977m.f90650a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final C35762c m69081b(ItemsCardFooterModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        InterfaceC22965i interfaceC22965iM69080a = m69080a(model.getAlignment());
        C9598e ctaDestination = model.getCtaDestination();
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
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C35762c(interfaceC22965iM69080a, ctaDestination, enumC16313m1.toWhoopIcon(), model.getCtaTitle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C35764e m69082c(ItemsCardHeaderModel model) {
        Object objValueOf;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        C9598e ctaDestination = model.getCtaDestination();
        GenericInteraction ctaInteraction = model.getCtaInteraction();
        String ctaIcon = model.getCtaIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_EXPAND;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            objValueOf = null;
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
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        int whoopIcon = enumC16313m1.toWhoopIcon();
        String title = model.getTitle();
        String titleIcon = model.getTitleIcon();
        if (titleIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.HEART_RATE;
            for (EnumC16313m0 enumC16313m3 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m3.name(), titleIcon)) {
                    objValueOf = enumC16313m3;
                    break;
                }
            }
            if (objValueOf != null) {
                enumC16313m2 = objValueOf;
            }
            objValueOf = Integer.valueOf(enumC16313m2.toWhoopIcon());
        }
        Integer num = objValueOf;
        List<String> androidCtaFeatureFlags = model.getAndroidCtaFeatureFlags();
        if (androidCtaFeatureFlags == null) {
            androidCtaFeatureFlags = C25271y.f99162w;
        }
        return new C35764e(ctaDestination, ctaInteraction, whoopIcon, title, num, androidCtaFeatureFlags);
    }

    /* JADX INFO: renamed from: d */
    public static final C35768i m69083d(ItemsCardModel model, C21535a reducer) {
        List<InterfaceC25312u> listM60540g;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(reducer, "reducer");
        ItemsCardHeaderModel header = model.getHeader();
        C35764e c35764eM69082c = header != null ? m69082c(header) : null;
        ItemsCardFooterModel footer = model.getFooter();
        C35762c c35762cM69081b = footer != null ? m69081b(footer) : null;
        EnumC35760a backgroundStyle = model.getBackgroundStyle();
        if (backgroundStyle == null) {
            backgroundStyle = EnumC35760a.STANDARD;
        }
        EnumC35760a enumC35760a = backgroundStyle;
        List<InterfaceC25312u> listM60540g2 = reducer.m60540g(model.getItems());
        List<DesignSystemModel> footerItems = model.getFooterItems();
        if (footerItems == null || (listM60540g = reducer.m60540g(footerItems)) == null) {
            listM60540g = C25271y.f99162w;
        }
        return new C35768i(c35764eM69082c, c35762cM69081b, enumC35760a, listM60540g2, listM60540g, null, 32, null);
    }
}
