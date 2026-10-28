package zy0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
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
/* JADX INFO: renamed from: zy0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lzy0/d;", "", "Ly3/f;", "startCornerPadding", "endCornerPadding", "<init>", "(Ljava/lang/String;IFF)V", "F", "getStartCornerPadding-D9Ej5fM", "()F", "getEndCornerPadding-D9Ej5fM", "DEFAULT", "LEFT", "RIGHT", "CENTER", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC41216d {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC41216d[] $VALUES;
    public static final EnumC41216d CENTER;
    public static final EnumC41216d DEFAULT;
    public static final EnumC41216d LEFT;
    public static final EnumC41216d RIGHT;
    private final float endCornerPadding;
    private final float startCornerPadding;

    private static final /* synthetic */ EnumC41216d[] $values() {
        return new EnumC41216d[]{DEFAULT, LEFT, RIGHT, CENTER};
    }

    static {
        float f13 = 4;
        float f14 = 1 * f13;
        DEFAULT = new EnumC41216d("DEFAULT", 0, f14, f14);
        float f15 = 0 * f13;
        LEFT = new EnumC41216d("LEFT", 1, f14, f15);
        RIGHT = new EnumC41216d("RIGHT", 2, f15, f14);
        CENTER = new EnumC41216d("CENTER", 3, f15, f15);
        EnumC41216d[] enumC41216dArr$values = $values();
        $VALUES = enumC41216dArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC41216dArr$values);
    }

    private EnumC41216d(String str, int i13, float f13, float f14) {
        super(str, i13);
        this.startCornerPadding = f13;
        this.endCornerPadding = f14;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC41216d valueOf(String str) {
        return (EnumC41216d) Enum.valueOf(EnumC41216d.class, str);
    }

    public static EnumC41216d[] values() {
        return (EnumC41216d[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getEndCornerPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndCornerPadding() {
        return this.endCornerPadding;
    }

    /* JADX INFO: renamed from: getStartCornerPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartCornerPadding() {
        return this.startCornerPadding;
    }
}
