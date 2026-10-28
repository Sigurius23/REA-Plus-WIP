package ny0;

import b91.AbstractC2890e;
import b91.C2886a;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STANDARD' uses external variables
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
/* JADX INFO: renamed from: ny0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BK\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, m65681d2 = {"Lny0/g;", "", "Ly3/f;", "verticalPadding", "cornerRadius", "Lb91/a;", "textStyle", "horizontalPadding", "Lny0/f;", "shape", "Lny0/i;", "widthScaleMode", "", "maxLines", "<init>", "(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;I)V", "F", "getVerticalPadding-D9Ej5fM", "()F", "getCornerRadius-D9Ej5fM", "Lb91/a;", "getTextStyle", "()Lb91/a;", "getHorizontalPadding-D9Ej5fM", "Lny0/f;", "getShape", "()Lny0/f;", "Lny0/i;", "getWidthScaleMode", "()Lny0/i;", "I", "getMaxLines", "()I", "STANDARD", "COMPACT", "CHIP", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC27254g {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC27254g[] $VALUES;
    public static final EnumC27254g CHIP;
    public static final EnumC27254g COMPACT;
    public static final EnumC27254g STANDARD;
    private final float cornerRadius;
    private final float horizontalPadding;
    private final int maxLines;
    private final EnumC27252f shape;
    private final C2886a textStyle;
    private final float verticalPadding;
    private final EnumC27258i widthScaleMode;

    private static final /* synthetic */ EnumC27254g[] $values() {
        return new EnumC27254g[]{STANDARD, COMPACT, CHIP};
    }

    static {
        float f13 = 8;
        float f14 = 4;
        float f15 = f14 * f14;
        STANDARD = new EnumC27254g("STANDARD", 0, ((float) 2.0d) * f13, f15, AbstractC2890e.m8450e().getBtL(), 0.0f, null, null, 0, 120, null);
        float f16 = 2;
        COMPACT = new EnumC27254g("COMPACT", 1, ((float) 1.5d) * f13, f16 * f14, null, 0.0f, null, null, 0, 124, null);
        CHIP = new EnumC27254g("CHIP", 2, 1 * f13, f15, AbstractC2890e.m8450e().getB2(), f16 * f13, EnumC27252f.PILL, EnumC27258i.HUG, 1);
        EnumC27254g[] enumC27254gArr$values = $values();
        $VALUES = enumC27254gArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC27254gArr$values);
    }

    private EnumC27254g(String str, int i13, float f13, float f14, C2886a c2886a, float f15, EnumC27252f enumC27252f, EnumC27258i enumC27258i, int i14) {
        super(str, i13);
        this.verticalPadding = f13;
        this.cornerRadius = f14;
        this.textStyle = c2886a;
        this.horizontalPadding = f15;
        this.shape = enumC27252f;
        this.widthScaleMode = enumC27258i;
        this.maxLines = i14;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC27254g valueOf(String str) {
        return (EnumC27254g) Enum.valueOf(EnumC27254g.class, str);
    }

    public static EnumC27254g[] values() {
        return (EnumC27254g[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final EnumC27252f getShape() {
        return this.shape;
    }

    public final C2886a getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }

    public final EnumC27258i getWidthScaleMode() {
        return this.widthScaleMode;
    }

    public EnumC27254g(String str, int i13, float f13, float f14, C2886a c2886a, float f15, EnumC27252f enumC27252f, EnumC27258i enumC27258i, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f13, f14, (i15 & 4) != 0 ? AbstractC2890e.m8450e().getH5() : c2886a, (i15 & 8) != 0 ? 1 * 8 : f15, (i15 & 16) != 0 ? EnumC27252f.ROUNDED : enumC27252f, (i15 & 32) != 0 ? EnumC27258i.FLEXIBLE : enumC27258i, (i15 & 64) != 0 ? 2 : i14);
    }
}
