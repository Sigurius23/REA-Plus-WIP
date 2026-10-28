package qy0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL' uses external variables
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
/* JADX INFO: renamed from: qy0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lqy0/g;", "", "Ly3/f;", "startPadding", "endPadding", "", "startRadius", "endRadius", "<init>", "(Ljava/lang/String;IFFII)V", "F", "getStartPadding-D9Ej5fM", "()F", "getEndPadding-D9Ej5fM", "I", "getStartRadius", "()I", "getEndRadius", "ALL", "LEFT", "RIGHT", "NONE", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC30774g {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC30774g[] $VALUES;
    public static final EnumC30774g ALL;
    public static final EnumC30774g LEFT;
    public static final EnumC30774g NONE;
    public static final EnumC30774g RIGHT;
    private final float endPadding;
    private final int endRadius;
    private final float startPadding;
    private final int startRadius;

    private static final /* synthetic */ EnumC30774g[] $values() {
        return new EnumC30774g[]{ALL, LEFT, RIGHT, NONE};
    }

    static {
        float f13 = 11;
        ALL = new EnumC30774g("ALL", 0, f13, f13, 50, 50);
        float f14 = 0;
        LEFT = new EnumC30774g("LEFT", 1, f13, f14, 50, 0);
        RIGHT = new EnumC30774g("RIGHT", 2, f14, f13, 0, 50);
        NONE = new EnumC30774g("NONE", 3, f14, f14, 0, 0);
        EnumC30774g[] enumC30774gArr$values = $values();
        $VALUES = enumC30774gArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC30774gArr$values);
    }

    private EnumC30774g(String str, int i13, float f13, float f14, int i14, int i15) {
        super(str, i13);
        this.startPadding = f13;
        this.endPadding = f14;
        this.startRadius = i14;
        this.endRadius = i15;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC30774g valueOf(String str) {
        return (EnumC30774g) Enum.valueOf(EnumC30774g.class, str);
    }

    public static EnumC30774g[] values() {
        return (EnumC30774g[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getEndPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndPadding() {
        return this.endPadding;
    }

    public final int getEndRadius() {
        return this.endRadius;
    }

    /* JADX INFO: renamed from: getStartPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartPadding() {
        return this.startPadding;
    }

    public final int getStartRadius() {
        return this.startRadius;
    }
}
