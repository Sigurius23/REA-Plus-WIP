package j21;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MEDIUM' uses external variables
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
/* JADX INFO: renamed from: j21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lj21/c;", "", "Ly3/f;", "iconSize", "<init>", "(Ljava/lang/String;IF)V", "F", "getIconSize-D9Ej5fM", "()F", "MEDIUM", "SMALL", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC21244c {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC21244c[] $VALUES;
    public static final EnumC21244c MEDIUM;
    public static final EnumC21244c SMALL;
    private final float iconSize;

    private static final /* synthetic */ EnumC21244c[] $values() {
        return new EnumC21244c[]{MEDIUM, SMALL};
    }

    static {
        float f13 = 4;
        MEDIUM = new EnumC21244c("MEDIUM", 0, 3 * f13);
        SMALL = new EnumC21244c("SMALL", 1, 2 * f13);
        EnumC21244c[] enumC21244cArr$values = $values();
        $VALUES = enumC21244cArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC21244cArr$values);
    }

    private EnumC21244c(String str, int i13, float f13) {
        super(str, i13);
        this.iconSize = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC21244c valueOf(String str) {
        return (EnumC21244c) Enum.valueOf(EnumC21244c.class, str);
    }

    public static EnumC21244c[] values() {
        return (EnumC21244c[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }
}
