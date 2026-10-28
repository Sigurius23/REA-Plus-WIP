package w71;

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
/* JADX INFO: renamed from: w71.a0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lw71/a0;", "", "Ly3/f;", "verticalPadding", "<init>", "(Ljava/lang/String;IF)V", "F", "getVerticalPadding-D9Ej5fM", "()F", "DEFAULT", "COMPACT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC36872a0 {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC36872a0[] $VALUES;
    public static final EnumC36872a0 COMPACT;
    public static final EnumC36872a0 DEFAULT;
    private final float verticalPadding;

    private static final /* synthetic */ EnumC36872a0[] $values() {
        return new EnumC36872a0[]{DEFAULT, COMPACT};
    }

    static {
        float f13 = 8;
        DEFAULT = new EnumC36872a0("DEFAULT", 0, ((float) 2.5d) * f13);
        COMPACT = new EnumC36872a0("COMPACT", 1, ((float) 1.5d) * f13);
        EnumC36872a0[] enumC36872a0Arr$values = $values();
        $VALUES = enumC36872a0Arr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC36872a0Arr$values);
    }

    private EnumC36872a0(String str, int i13, float f13) {
        super(str, i13);
        this.verticalPadding = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC36872a0 valueOf(String str) {
        return (EnumC36872a0) Enum.valueOf(EnumC36872a0.class, str);
    }

    public static EnumC36872a0[] values() {
        return (EnumC36872a0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }
}
