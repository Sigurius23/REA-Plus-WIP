package v11;

import ge3.AbstractC15751g;
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
/* JADX INFO: renamed from: v11.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lv11/a;", "", "Ly3/f;", "height", "horizontalPadding", "cornerRadius", "iconSize", "<init>", "(Ljava/lang/String;IFFFF)V", "F", "getHeight-D9Ej5fM", "()F", "getHorizontalPadding-D9Ej5fM", "getCornerRadius-D9Ej5fM", "getIconSize-D9Ej5fM", "COMPACT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC35543a {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC35543a[] $VALUES;
    public static final EnumC35543a COMPACT;
    private final float cornerRadius;
    private final float height;
    private final float horizontalPadding;
    private final float iconSize;

    private static final /* synthetic */ EnumC35543a[] $values() {
        return new EnumC35543a[]{COMPACT};
    }

    static {
        float f13 = 4;
        COMPACT = new EnumC35543a("COMPACT", 0, 10 * f13, 8 * ((float) 1.5d), 2 * f13, 6 * f13);
        EnumC35543a[] enumC35543aArr$values = $values();
        $VALUES = enumC35543aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC35543aArr$values);
    }

    private EnumC35543a(String str, int i13, float f13, float f14, float f15, float f16) {
        super(str, i13);
        this.height = f13;
        this.horizontalPadding = f14;
        this.cornerRadius = f15;
        this.iconSize = f16;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC35543a valueOf(String str) {
        return (EnumC35543a) Enum.valueOf(EnumC35543a.class, str);
    }

    public static EnumC35543a[] values() {
        return (EnumC35543a[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }
}
