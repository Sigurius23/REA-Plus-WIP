package f21;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p026b2.C2299e;
import p026b2.InterfaceC2301g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'COMPACT' uses external variables
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
/* JADX INFO: renamed from: f21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lf21/a;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Ly3/f;", "iconSize", "spacing", "Lb2/g;", "verticalAlignment", "<init>", "(Ljava/lang/String;IFFLb2/g;)V", "F", "getIconSize-D9Ej5fM", "()F", "getSpacing-D9Ej5fM", "Lb2/g;", "getVerticalAlignment", "()Lb2/g;", "COMPACT", "PROMINENT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC14025a implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC14025a[] $VALUES;
    public static final EnumC14025a COMPACT;
    public static final EnumC14025a PROMINENT;
    private final float iconSize;
    private final float spacing;
    private final InterfaceC2301g verticalAlignment;

    private static final /* synthetic */ EnumC14025a[] $values() {
        return new EnumC14025a[]{COMPACT, PROMINENT};
    }

    static {
        float f13 = 4;
        float f14 = 8;
        COMPACT = new EnumC14025a("COMPACT", 0, f13 * f13, 1 * f14, C2299e.f9108K);
        PROMINENT = new EnumC14025a("PROMINENT", 1, 5 * f13, ((float) 1.5d) * f14, C2299e.f9107J);
        EnumC14025a[] enumC14025aArr$values = $values();
        $VALUES = enumC14025aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC14025aArr$values);
    }

    private EnumC14025a(String str, int i13, float f13, float f14, InterfaceC2301g interfaceC2301g) {
        super(str, i13);
        this.iconSize = f13;
        this.spacing = f14;
        this.verticalAlignment = interfaceC2301g;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC14025a valueOf(String str) {
        return (EnumC14025a) Enum.valueOf(EnumC14025a.class, str);
    }

    public static EnumC14025a[] values() {
        return (EnumC14025a[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    public final InterfaceC2301g getVerticalAlignment() {
        return this.verticalAlignment;
    }
}
