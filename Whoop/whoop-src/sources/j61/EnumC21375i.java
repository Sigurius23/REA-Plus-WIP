package j61;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BIOMARKER_NEGATIVE' uses external variables
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
/* JADX INFO: renamed from: j61.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lj61/i;", "", "Ly81/f;", "color", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getColor", "()Ly81/f;", "BIOMARKER_NEGATIVE", "BIOMARKER_POSITIVE", "DEFAULT", "SAGE_LOW", "SAGE_HIGH", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC21375i {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC21375i[] $VALUES;
    public static final EnumC21375i BIOMARKER_NEGATIVE;
    public static final EnumC21375i BIOMARKER_POSITIVE;
    public static final EnumC21375i DEFAULT;
    public static final EnumC21375i SAGE_HIGH;
    public static final EnumC21375i SAGE_LOW;
    private final EnumC39333f color;

    private static final /* synthetic */ EnumC21375i[] $values() {
        return new EnumC21375i[]{BIOMARKER_NEGATIVE, BIOMARKER_POSITIVE, DEFAULT, SAGE_LOW, SAGE_HIGH};
    }

    static {
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
        BIOMARKER_NEGATIVE = new EnumC21375i("BIOMARKER_NEGATIVE", 0, enumC39333f);
        BIOMARKER_POSITIVE = new EnumC21375i("BIOMARKER_POSITIVE", 1, EnumC39333f.ACCENT_POSITIVE_TREND);
        DEFAULT = new EnumC21375i("DEFAULT", 2, EnumC39333f.WHITE_50);
        SAGE_LOW = new EnumC21375i("SAGE_LOW", 3, EnumC39333f.ACCENT_ACTION);
        SAGE_HIGH = new EnumC21375i("SAGE_HIGH", 4, enumC39333f);
        EnumC21375i[] enumC21375iArr$values = $values();
        $VALUES = enumC21375iArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC21375iArr$values);
    }

    private EnumC21375i(String str, int i13, EnumC39333f enumC39333f) {
        super(str, i13);
        this.color = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC21375i valueOf(String str) {
        return (EnumC21375i) Enum.valueOf(EnumC21375i.class, str);
    }

    public static EnumC21375i[] values() {
        return (EnumC21375i[]) $VALUES.clone();
    }

    public final EnumC39333f getColor() {
        return this.color;
    }
}
