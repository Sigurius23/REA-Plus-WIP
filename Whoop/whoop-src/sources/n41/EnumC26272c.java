package n41;

import b91.EnumC2888c;
import ge3.AbstractC15751g;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INLINE_SMALL' uses external variables
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
/* JADX INFO: renamed from: n41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Ln41/c;", "", "Ln41/g;", "style", "<init>", "(Ljava/lang/String;ILn41/g;)V", "Ln41/g;", "getStyle", "()Ln41/g;", "INLINE_SMALL", "INLINE_LARGE", "SEGMENTED_SMALL", "FALL_BACK", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC26272c {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC26272c[] $VALUES;
    public static final EnumC26272c FALL_BACK;
    public static final EnumC26272c INLINE_LARGE;
    public static final EnumC26272c INLINE_SMALL;
    public static final EnumC26272c SEGMENTED_SMALL;
    private final C26276g style;

    private static final /* synthetic */ EnumC26272c[] $values() {
        return new EnumC26272c[]{INLINE_SMALL, INLINE_LARGE, SEGMENTED_SMALL, FALL_BACK};
    }

    static {
        long j7 = C17919x.f69629f;
        EnumC2888c enumC2888c = EnumC2888c.B1;
        INLINE_SMALL = new EnumC26272c("INLINE_SMALL", 0, new C26276g(j7, AbstractC17918w0.m51517e(4279901473L), AbstractC17918w0.m51517e(4281481537L), C17919x.m51541c(0.85f, j7), 10, enumC2888c, enumC2888c, enumC2888c, 8, null));
        long jM51517e = AbstractC17918w0.m51517e(4279901473L);
        long jM51517e2 = AbstractC17918w0.m51517e(4281481537L);
        long jM51541c = C17919x.m51541c(0.85f, j7);
        float f13 = 12;
        EnumC2888c enumC2888c2 = EnumC2888c.N5_5;
        EnumC2888c enumC2888c3 = EnumC2888c.N8;
        INLINE_LARGE = new EnumC26272c("INLINE_LARGE", 1, new C26276g(j7, jM51517e, jM51517e2, jM51541c, f13, enumC2888c2, enumC2888c2, enumC2888c3, f13, null));
        SEGMENTED_SMALL = new EnumC26272c("SEGMENTED_SMALL", 2, new C26276g(j7, AbstractC17918w0.m51517e(4279901473L), AbstractC17918w0.m51517e(4281481537L), C17919x.m51541c(0.85f, j7), f13, enumC2888c3, enumC2888c3, enumC2888c3, f13, null));
        FALL_BACK = new EnumC26272c("FALL_BACK", 3, null);
        EnumC26272c[] enumC26272cArr$values = $values();
        $VALUES = enumC26272cArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC26272cArr$values);
    }

    private EnumC26272c(String str, int i13, C26276g c26276g) {
        super(str, i13);
        this.style = c26276g;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC26272c valueOf(String str) {
        return (EnumC26272c) Enum.valueOf(EnumC26272c.class, str);
    }

    public static EnumC26272c[] values() {
        return (EnumC26272c[]) $VALUES.clone();
    }

    public final C26276g getStyle() {
        return this.style;
    }
}
