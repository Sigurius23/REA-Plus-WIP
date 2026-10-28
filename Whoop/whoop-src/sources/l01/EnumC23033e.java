package l01;

import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.C18252f;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CHECKLIST' uses external variables
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
/* JADX INFO: renamed from: l01.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, m65681d2 = {"Ll01/e;", "", "Li91/a;", "cardBackground", "Ly81/f;", "titleTextColor", "featureTextColor", "", "showCheckListIcons", "Ly3/f;", "titleSpace", "innerPadding", "<init>", "(Ljava/lang/String;ILi91/a;Ly81/f;Ly81/f;ZFF)V", "Li91/a;", "getCardBackground", "()Li91/a;", "Ly81/f;", "getTitleTextColor", "()Ly81/f;", "getFeatureTextColor", "Z", "getShowCheckListIcons", "()Z", "F", "getTitleSpace-D9Ej5fM", "()F", "getInnerPadding-D9Ej5fM", "CHECKLIST", "INFO", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC23033e {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC23033e[] $VALUES;
    public static final EnumC23033e CHECKLIST;
    public static final EnumC23033e INFO;
    private final AbstractC18247a cardBackground;
    private final EnumC39333f featureTextColor;
    private final float innerPadding;
    private final boolean showCheckListIcons;
    private final float titleSpace;
    private final EnumC39333f titleTextColor;

    private static final /* synthetic */ EnumC23033e[] $values() {
        return new EnumC23033e[]{CHECKLIST, INFO};
    }

    static {
        C18252f c18252f = new C18252f(EnumC39333f.TRANSPARENT, null, 2, null);
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        float f13 = 4;
        float f14 = 8;
        CHECKLIST = new EnumC23033e("CHECKLIST", 0, c18252f, enumC39333f, EnumC39333f.BRAND_WHITE, true, f13 * f13, 0 * f14);
        INFO = new EnumC23033e("INFO", 1, new C18252f(EnumC39333f.NEUTRAL_15, null, 2, null), enumC39333f, EnumC39333f.RECOVERY, false, 5 * f13, 2 * f14);
        EnumC23033e[] enumC23033eArr$values = $values();
        $VALUES = enumC23033eArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC23033eArr$values);
    }

    private EnumC23033e(String str, int i13, AbstractC18247a abstractC18247a, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, float f13, float f14) {
        super(str, i13);
        this.cardBackground = abstractC18247a;
        this.titleTextColor = enumC39333f;
        this.featureTextColor = enumC39333f2;
        this.showCheckListIcons = z4;
        this.titleSpace = f13;
        this.innerPadding = f14;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC23033e valueOf(String str) {
        return (EnumC23033e) Enum.valueOf(EnumC23033e.class, str);
    }

    public static EnumC23033e[] values() {
        return (EnumC23033e[]) $VALUES.clone();
    }

    public final AbstractC18247a getCardBackground() {
        return this.cardBackground;
    }

    public final EnumC39333f getFeatureTextColor() {
        return this.featureTextColor;
    }

    /* JADX INFO: renamed from: getInnerPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getInnerPadding() {
        return this.innerPadding;
    }

    public final boolean getShowCheckListIcons() {
        return this.showCheckListIcons;
    }

    /* JADX INFO: renamed from: getTitleSpace-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTitleSpace() {
        return this.titleSpace;
    }

    public final EnumC39333f getTitleTextColor() {
        return this.titleTextColor;
    }
}
