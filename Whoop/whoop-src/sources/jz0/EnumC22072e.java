package jz0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Enabled' uses external variables
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
/* JADX INFO: renamed from: jz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Ljz0/e;", "", "Ly3/f;", "sizeDp", "<init>", "(Ljava/lang/String;IF)V", "F", "getSizeDp-D9Ej5fM", "()F", "Enabled", "Fading6", "Fading4", "Hidden", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC22072e {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC22072e[] $VALUES;
    public static final EnumC22072e Enabled;
    public static final EnumC22072e Fading4;
    public static final EnumC22072e Fading6;
    public static final EnumC22072e Hidden;
    private final float sizeDp;

    private static final /* synthetic */ EnumC22072e[] $values() {
        return new EnumC22072e[]{Enabled, Fading6, Fading4, Hidden};
    }

    static {
        float f13 = 4;
        Enabled = new EnumC22072e("Enabled", 0, 2 * f13);
        Fading6 = new EnumC22072e("Fading6", 1, ((float) 1.5d) * f13);
        Fading4 = new EnumC22072e("Fading4", 2, 1 * f13);
        Hidden = new EnumC22072e("Hidden", 3, 0 * f13);
        EnumC22072e[] enumC22072eArr$values = $values();
        $VALUES = enumC22072eArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC22072eArr$values);
    }

    private EnumC22072e(String str, int i13, float f13) {
        super(str, i13);
        this.sizeDp = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC22072e valueOf(String str) {
        return (EnumC22072e) Enum.valueOf(EnumC22072e.class, str);
    }

    public static EnumC22072e[] values() {
        return (EnumC22072e[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getSizeDp-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSizeDp() {
        return this.sizeDp;
    }
}
