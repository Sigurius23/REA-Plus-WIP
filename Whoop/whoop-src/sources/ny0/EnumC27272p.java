package ny0;

import androidx.recyclerview.widget.AbstractC1707m0;
import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.models.DesignSystemEnum;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.C18250d;
import i91.C18252f;
import nm1.C26842g;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p294l3.C23285v0;
import p392p3.C28780r;
import p636y3.C39174f;
import p712j91.Function1;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BLUE_BACKGROUND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ny0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002Ba\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, m65681d2 = {"Lny0/p;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Li91/a;", "background", "pressedBackground", "Lb91/a;", "titleStyle", "Ly81/f;", "titleColor", "iconColor", "Lj91/b;", "borderColor", "Ll0/k1;", "paddingValues", "Ly3/f;", "cornerRadius", "<init>", "(Ljava/lang/String;ILi91/a;Li91/a;Lb91/a;Ly81/f;Ly81/f;Lj91/b;Ll0/k1;Ly3/f;)V", "Li91/a;", "getBackground", "()Li91/a;", "getPressedBackground", "Lb91/a;", "getTitleStyle", "()Lb91/a;", "Ly81/f;", "getTitleColor", "()Ly81/f;", "getIconColor", "Lj91/b;", "getBorderColor", "()Lj91/b;", "Ll0/k1;", "getPaddingValues", "()Ll0/k1;", "Ly3/f;", "getCornerRadius-lTKBWiU", "()Ly3/f;", "BLUE_BACKGROUND", "COACH", "DARK_BACKGROUND", "DEFAULT", "HIGHLIGHT", "LIGHT_BACKGROUND", "ONBOARDING", "QUICK_ACTION", "REFER_A_FRIEND", "FAMILY_PLAN", "SUCCESS", "TRANSPARENT_BACKGROUND", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC27272p implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC27272p[] $VALUES;
    public static final EnumC27272p BLUE_BACKGROUND;
    public static final EnumC27272p COACH;
    public static final EnumC27272p DARK_BACKGROUND;
    public static final EnumC27272p DEFAULT;
    public static final EnumC27272p FAMILY_PLAN;
    public static final EnumC27272p HIGHLIGHT;
    public static final EnumC27272p LIGHT_BACKGROUND;
    public static final EnumC27272p ONBOARDING;
    public static final EnumC27272p QUICK_ACTION;
    public static final EnumC27272p REFER_A_FRIEND;
    public static final EnumC27272p SUCCESS;
    public static final EnumC27272p TRANSPARENT_BACKGROUND;
    private final AbstractC18247a background;
    private final InterfaceC21430b borderColor;
    private final C39174f cornerRadius;
    private final EnumC39333f iconColor;
    private final InterfaceC22973k1 paddingValues;
    private final AbstractC18247a pressedBackground;
    private final EnumC39333f titleColor;
    private final C2886a titleStyle;

    private static final /* synthetic */ EnumC27272p[] $values() {
        return new EnumC27272p[]{BLUE_BACKGROUND, COACH, DARK_BACKGROUND, DEFAULT, HIGHLIGHT, LIGHT_BACKGROUND, ONBOARDING, QUICK_ACTION, REFER_A_FRIEND, FAMILY_PLAN, SUCCESS, TRANSPARENT_BACKGROUND};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC39333f enumC39333f = EnumC39333f.RECOVERY;
        C18252f c18252f = new C18252f(enumC39333f, null, 2, null);
        Float fValueOf = Float.valueOf(0.9f);
        C18252f c18252f2 = new C18252f(enumC39333f, fValueOf);
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
        BLUE_BACKGROUND = new EnumC27272p("BLUE_BACKGROUND", 0, c18252f, c18252f2, null, enumC39333f2, null, null, null, null, 244, null);
        C18250d c18250d = new C18250d(Function1.m60318a(AbstractC15673b0.m43972A()), 0.0f, 2, null);
        EnumC39333f enumC39333f3 = EnumC39333f.WHITE_90;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C2886a c2886a = null;
        EnumC39333f enumC39333f4 = null;
        InterfaceC21430b interfaceC21430b = null;
        InterfaceC22973k1 interfaceC22973k1 = null;
        C39174f c39174f = null;
        COACH = new EnumC27272p("COACH", 1, c18250d, new C18252f(enumC39333f3, null, 2, null), c2886a, enumC39333f2, enumC39333f4, interfaceC21430b, interfaceC22973k1, c39174f, 244, defaultConstructorMarker);
        C18252f c18252f3 = new C18252f(enumC39333f2, null, 2, null);
        C18252f c18252f4 = new C18252f(EnumC39333f.BLACK_90, null, 2, null);
        EnumC39333f enumC39333f5 = EnumC39333f.BRAND_WHITE;
        DARK_BACKGROUND = new EnumC27272p("DARK_BACKGROUND", 2, c18252f3, c18252f4, null, enumC39333f5, null, null, null, null, 244, null);
        DEFAULT = new EnumC27272p("DEFAULT", 3, new C18252f(EnumC39333f.WHITE_10, null, 2, null), null, c2886a, null, enumC39333f4, interfaceC21430b, interfaceC22973k1, c39174f, 254, defaultConstructorMarker);
        int i13 = 244;
        HIGHLIGHT = new EnumC27272p("HIGHLIGHT", 4, new C18252f(enumC39333f5, null, 2, null), new C18252f(enumC39333f3, null, 2, null), c2886a, enumC39333f2, enumC39333f4, interfaceC21430b, interfaceC22973k1, c39174f, i13, defaultConstructorMarker);
        LIGHT_BACKGROUND = new EnumC27272p("LIGHT_BACKGROUND", 5, new C18252f(enumC39333f5, null, 2, null), new C18252f(enumC39333f3, null, 2, null), c2886a, enumC39333f2, enumC39333f4, interfaceC21430b, interfaceC22973k1, c39174f, i13, defaultConstructorMarker);
        ONBOARDING = new EnumC27272p("ONBOARDING", 6, new C18250d(Function1.m60318a(AbstractC15673b0.m43985G0()), 0.1f), new C18252f(enumC39333f3, null, 2, null), c2886a, enumC39333f5, enumC39333f4, Function1.m60318a(AbstractC15673b0.m44000O()), interfaceC22973k1, c39174f, 212, defaultConstructorMarker);
        float f13 = 8;
        float f14 = ((float) 1.5d) * f13;
        QUICK_ACTION = new EnumC27272p("QUICK_ACTION", 7, new C18252f(enumC39333f, Float.valueOf(0.15f)), new C18252f(enumC39333f, fValueOf), new C2886a(C23285v0.m67364b(AbstractC2890e.m8450e().getB2().getStyle(), 0L, 0L, C28780r.f116542I, null, 0L, 0, 0L, null, null, 16777211), null, 2, null), enumC39333f5, enumC39333f, 0 == true ? 1 : 0, new C22976l1(f14, f14, 2 * f13, f14), new C39174f(3 * 4), 32, null);
        EnumC39333f enumC39333f6 = null;
        REFER_A_FRIEND = new EnumC27272p("REFER_A_FRIEND", 8, new C18250d(Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null), new C18252f(enumC39333f3, null, 2, null), c2886a, enumC39333f2, enumC39333f6, null, null, null, 244, null);
        C2886a c2886a2 = new C2886a(C23285v0.m67364b(AbstractC2890e.m8450e().getSh2().getStyle(), 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), null, 2, null);
        EnumC39333f enumC39333f7 = EnumC39333f.TRANSPARENT;
        C18252f c18252f5 = new C18252f(enumC39333f7, null, 2, null);
        int i14 = AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION;
        FAMILY_PLAN = new EnumC27272p("FAMILY_PLAN", 9, c18252f5, null, c2886a2, enumC39333f6, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, i14, null);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        SUCCESS = new EnumC27272p("SUCCESS", 10, new C18252f(EnumC39333f.BLACK_30, null, 2, null), null, 0 == true ? 1 : 0, enumC39333f5, EnumC39333f.ACCENT_ACTION, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 230, defaultConstructorMarker2);
        Object[] objArr = 0 == true ? 1 : 0;
        TRANSPARENT_BACKGROUND = new EnumC27272p("TRANSPARENT_BACKGROUND", 11, new C18252f(enumC39333f7, null, 2, null), new C18252f(enumC39333f3, null, 2, null), 0 == true ? 1 : 0, enumC39333f5, null, Function1.m60319b(new C26842g(3)), 0 == true ? 1 : 0, objArr, 212, defaultConstructorMarker2);
        EnumC27272p[] enumC27272pArr$values = $values();
        $VALUES = enumC27272pArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC27272pArr$values);
    }

    private EnumC27272p(String str, int i13, AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, C2886a c2886a, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, InterfaceC21430b interfaceC21430b, InterfaceC22973k1 interfaceC22973k1, C39174f c39174f) {
        super(str, i13);
        this.background = abstractC18247a;
        this.pressedBackground = abstractC18247a2;
        this.titleStyle = c2886a;
        this.titleColor = enumC39333f;
        this.iconColor = enumC39333f2;
        this.borderColor = interfaceC21430b;
        this.paddingValues = interfaceC22973k1;
        this.cornerRadius = c39174f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$0(C39336i whoopBrush) {
        AbstractC22676k.m65750j(whoopBrush, "$this$whoopBrush");
        return new C17875c1(whoopBrush.getWhite20());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC27272p valueOf(String str) {
        return (EnumC27272p) Enum.valueOf(EnumC27272p.class, str);
    }

    public static EnumC27272p[] values() {
        return (EnumC27272p[]) $VALUES.clone();
    }

    public final AbstractC18247a getBackground() {
        return this.background;
    }

    public final InterfaceC21430b getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: getCornerRadius-lTKBWiU, reason: not valid java name and from getter */
    public final C39174f getCornerRadius() {
        return this.cornerRadius;
    }

    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    public final InterfaceC22973k1 getPaddingValues() {
        return this.paddingValues;
    }

    public final AbstractC18247a getPressedBackground() {
        return this.pressedBackground;
    }

    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public final C2886a getTitleStyle() {
        return this.titleStyle;
    }

    public /* synthetic */ EnumC27272p(String str, int i13, AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, C2886a c2886a, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, InterfaceC21430b interfaceC21430b, InterfaceC22973k1 interfaceC22973k1, C39174f c39174f, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, abstractC18247a, (i14 & 2) != 0 ? new C18252f(EnumC39333f.WHITE_30, null, 2, null) : abstractC18247a2, (i14 & 4) != 0 ? null : c2886a, (i14 & 8) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i14 & 16) != 0 ? null : enumC39333f2, (i14 & 32) != 0 ? null : interfaceC21430b, (i14 & 64) != 0 ? null : interfaceC22973k1, (i14 & 128) != 0 ? null : c39174f);
    }
}
