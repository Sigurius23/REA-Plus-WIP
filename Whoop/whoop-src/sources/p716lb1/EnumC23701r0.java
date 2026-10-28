package p716lb1;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'HIGHER_POSITIVE' uses external variables
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
/* JADX INFO: renamed from: lb1.r0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m65681d2 = {"Llb1/r0;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Ly81/f;", "statusColor", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getStatusColor", "()Ly81/f;", "HIGHER_POSITIVE", "HIGHER_NEUTRAL", "HIGHER_NEGATIVE", "EQUAL", "LOWER_POSITIVE", "LOWER_NEUTRAL", "LOWER_NEGATIVE", "NO_DATA", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC23701r0 implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC23701r0[] $VALUES;
    public static final EnumC23701r0 EQUAL;
    public static final EnumC23701r0 HIGHER_NEGATIVE;
    public static final EnumC23701r0 HIGHER_NEUTRAL;
    public static final EnumC23701r0 HIGHER_POSITIVE;
    public static final EnumC23701r0 LOWER_NEGATIVE;
    public static final EnumC23701r0 LOWER_NEUTRAL;
    public static final EnumC23701r0 LOWER_POSITIVE;
    public static final EnumC23701r0 NO_DATA;
    private final EnumC39333f statusColor;

    private static final /* synthetic */ EnumC23701r0[] $values() {
        return new EnumC23701r0[]{HIGHER_POSITIVE, HIGHER_NEUTRAL, HIGHER_NEGATIVE, EQUAL, LOWER_POSITIVE, LOWER_NEUTRAL, LOWER_NEGATIVE, NO_DATA};
    }

    static {
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        HIGHER_POSITIVE = new EnumC23701r0("HIGHER_POSITIVE", 0, enumC39333f);
        HIGHER_NEUTRAL = new EnumC23701r0("HIGHER_NEUTRAL", 1, null, 1, null);
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        HIGHER_NEGATIVE = new EnumC23701r0("HIGHER_NEGATIVE", 2, enumC39333f2);
        int i13 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        EnumC39333f enumC39333f3 = null;
        EQUAL = new EnumC23701r0("EQUAL", 3, enumC39333f3, i13, defaultConstructorMarker);
        LOWER_POSITIVE = new EnumC23701r0("LOWER_POSITIVE", 4, enumC39333f);
        LOWER_NEUTRAL = new EnumC23701r0("LOWER_NEUTRAL", 5, enumC39333f3, i13, defaultConstructorMarker);
        LOWER_NEGATIVE = new EnumC23701r0("LOWER_NEGATIVE", 6, enumC39333f2);
        NO_DATA = new EnumC23701r0("NO_DATA", 7, EnumC39333f.WHITE_70);
        EnumC23701r0[] enumC23701r0Arr$values = $values();
        $VALUES = enumC23701r0Arr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC23701r0Arr$values);
    }

    private EnumC23701r0(String str, int i13, EnumC39333f enumC39333f) {
        super(str, i13);
        this.statusColor = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC23701r0 valueOf(String str) {
        return (EnumC23701r0) Enum.valueOf(EnumC23701r0.class, str);
    }

    public static EnumC23701r0[] values() {
        return (EnumC23701r0[]) $VALUES.clone();
    }

    public final EnumC39333f getStatusColor() {
        return this.statusColor;
    }

    public /* synthetic */ EnumC23701r0(String str, int i13, EnumC39333f enumC39333f, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? EnumC39333f.WHITE_50 : enumC39333f);
    }
}
