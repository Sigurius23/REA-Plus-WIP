package r21;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p712j91.Function1;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT' uses external variables
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
/* JADX INFO: renamed from: r21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m65681d2 = {"Lr21/a;", "", "Ly81/f;", "titleColor", "contentColor", "backgroundColor", "iconColor", "Lj91/b;", "backgroundGradient", "", "backgroundGradientAlpha", "<init>", "(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;F)V", "Ly81/f;", "getTitleColor", "()Ly81/f;", "getContentColor", "getBackgroundColor", "getIconColor", "Lj91/b;", "getBackgroundGradient", "()Lj91/b;", "F", "getBackgroundGradientAlpha", "()F", "DEFAULT", "RECOMMENDATION", "JUMPSTART", "TIP", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC30883a {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC30883a[] $VALUES;
    public static final EnumC30883a DEFAULT;
    public static final EnumC30883a JUMPSTART;
    public static final EnumC30883a RECOMMENDATION;
    public static final EnumC30883a TIP;
    private final EnumC39333f backgroundColor;
    private final InterfaceC21430b backgroundGradient;
    private final float backgroundGradientAlpha;
    private final EnumC39333f contentColor;
    private final EnumC39333f iconColor;
    private final EnumC39333f titleColor;

    private static final /* synthetic */ EnumC30883a[] $values() {
        return new EnumC30883a[]{DEFAULT, RECOMMENDATION, JUMPSTART, TIP};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        EnumC39333f enumC39333f2 = EnumC39333f.WHITE_70;
        DEFAULT = new EnumC30883a("DEFAULT", 0, enumC39333f, enumC39333f2, EnumC39333f.WHITE_5, null, null, 0.0f, 56, null);
        EnumC39333f enumC39333f3 = EnumC39333f.RECOVERY;
        int i13 = 56;
        DefaultConstructorMarker defaultConstructorMarker = null;
        InterfaceC21430b interfaceC21430b = null;
        float f13 = 0.0f;
        RECOMMENDATION = new EnumC30883a("RECOMMENDATION", 1, enumC39333f3, enumC39333f, EnumC39333f.NEUTRAL_15, 0 == true ? 1 : 0, interfaceC21430b, f13, i13, defaultConstructorMarker);
        JUMPSTART = new EnumC30883a("JUMPSTART", 2, enumC39333f3, enumC39333f, EnumC39333f.RECOVERY_10, 0 == true ? 1 : 0, interfaceC21430b, f13, i13, defaultConstructorMarker);
        TIP = new EnumC30883a("TIP", 3, enumC39333f, enumC39333f2, EnumC39333f.TRANSPARENT, EnumC39333f.WHITE_50, Function1.m60318a(C17909s.m51486d(AbstractC17911t.f69612b, AbstractC15673b0.m44049m(), 0L, 0L, 14)), 0.15f);
        EnumC30883a[] enumC30883aArr$values = $values();
        $VALUES = enumC30883aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC30883aArr$values);
    }

    private EnumC30883a(String str, int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, InterfaceC21430b interfaceC21430b, float f13) {
        super(str, i13);
        this.titleColor = enumC39333f;
        this.contentColor = enumC39333f2;
        this.backgroundColor = enumC39333f3;
        this.iconColor = enumC39333f4;
        this.backgroundGradient = interfaceC21430b;
        this.backgroundGradientAlpha = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC30883a valueOf(String str) {
        return (EnumC30883a) Enum.valueOf(EnumC30883a.class, str);
    }

    public static EnumC30883a[] values() {
        return (EnumC30883a[]) $VALUES.clone();
    }

    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    public final InterfaceC21430b getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final float getBackgroundGradientAlpha() {
        return this.backgroundGradientAlpha;
    }

    public final EnumC39333f getContentColor() {
        return this.contentColor;
    }

    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public /* synthetic */ EnumC30883a(String str, int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, InterfaceC21430b interfaceC21430b, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, enumC39333f, enumC39333f2, enumC39333f3, (i14 & 8) != 0 ? null : enumC39333f4, (i14 & 16) != 0 ? null : interfaceC21430b, (i14 & 32) != 0 ? 1.0f : f13);
    }
}
