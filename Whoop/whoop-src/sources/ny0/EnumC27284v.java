package ny0;

import b91.AbstractC2890e;
import b91.C2886a;
import ge3.AbstractC15751g;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TextSmall' uses external variables
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
/* JADX INFO: renamed from: ny0.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m65681d2 = {"Lny0/v;", "", "Lb91/a;", "style", "Ll0/k1;", "padding", "<init>", "(Ljava/lang/String;ILb91/a;Ll0/k1;)V", "Lb91/a;", "getStyle", "()Lb91/a;", "Ll0/k1;", "getPadding", "()Ll0/k1;", "TextSmall", "TextMedium", "TextLarge", "NumbersSmall", "NumbersMedium", "NumbersLarge", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC27284v {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC27284v[] $VALUES;
    public static final EnumC27284v NumbersLarge;
    public static final EnumC27284v NumbersMedium;
    public static final EnumC27284v NumbersSmall;
    public static final EnumC27284v TextLarge;
    public static final EnumC27284v TextMedium;
    public static final EnumC27284v TextSmall;
    private final InterfaceC22973k1 padding;
    private final C2886a style;

    private static final /* synthetic */ EnumC27284v[] $values() {
        return new EnumC27284v[]{TextSmall, TextMedium, TextLarge, NumbersSmall, NumbersMedium, NumbersLarge};
    }

    static {
        float f13 = 8;
        float f14 = ((float) 1.5d) * f13;
        float f15 = 1 * f13;
        TextSmall = new EnumC27284v("TextSmall", 0, AbstractC2890e.m8450e().getBtS(), new C22976l1(f14, f15, f14, f15));
        float f16 = 2 * f13;
        TextMedium = new EnumC27284v("TextMedium", 1, AbstractC2890e.m8450e().getBtM(), new C22976l1(f16, f14, f16, f14));
        float f17 = ((float) 2.5d) * f13;
        TextLarge = new EnumC27284v("TextLarge", 2, AbstractC2890e.m8450e().getBtL(), new C22976l1(f17, f16, f17, f16));
        NumbersSmall = new EnumC27284v("NumbersSmall", 3, AbstractC2890e.m8450e().getBnS(), new C22976l1(f16, f15, f16, ((float) 1.25d) * f13));
        NumbersMedium = new EnumC27284v("NumbersMedium", 4, AbstractC2890e.m8450e().getBnM(), new C22976l1(f17, f14, f17, ((float) 1.75d) * f13));
        float f18 = ((float) 3.5d) * f13;
        NumbersLarge = new EnumC27284v("NumbersLarge", 5, AbstractC2890e.m8450e().getBnL(), new C22976l1(f18, f14, f18, f16));
        EnumC27284v[] enumC27284vArr$values = $values();
        $VALUES = enumC27284vArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC27284vArr$values);
    }

    private EnumC27284v(String str, int i13, C2886a c2886a, InterfaceC22973k1 interfaceC22973k1) {
        super(str, i13);
        this.style = c2886a;
        this.padding = interfaceC22973k1;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC27284v valueOf(String str) {
        return (EnumC27284v) Enum.valueOf(EnumC27284v.class, str);
    }

    public static EnumC27284v[] values() {
        return (EnumC27284v[]) $VALUES.clone();
    }

    public final InterfaceC22973k1 getPadding() {
        return this.padding;
    }

    public final C2886a getStyle() {
        return this.style;
    }
}
