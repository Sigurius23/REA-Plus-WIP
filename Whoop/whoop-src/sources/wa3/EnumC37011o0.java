package wa3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: wa3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public class EnumC37011o0 {

    /* JADX INFO: renamed from: E */
    public static final C37005l0 f158365E;

    /* JADX INFO: renamed from: F */
    public static final C37007m0 f158366F;

    /* JADX INFO: renamed from: G */
    public static final EnumC37011o0 f158367G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ EnumC37011o0[] f158368H;

    /* JADX INFO: renamed from: y */
    public static final EnumC37011o0 f158369y;

    /* JADX INFO: renamed from: z */
    public static final EnumC37011o0 f158370z;

    /* JADX INFO: renamed from: w */
    public final EnumC37013p0 f158371w;

    /* JADX INFO: renamed from: x */
    public final int f158372x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC37011o0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC37011o0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC37011o0 EF2;

    static {
        EnumC37011o0 enumC37011o0 = new EnumC37011o0("DOUBLE", 0, EnumC37013p0.DOUBLE, 1);
        EnumC37011o0 enumC37011o1 = new EnumC37011o0("FLOAT", 1, EnumC37013p0.FLOAT, 5);
        EnumC37013p0 enumC37013p0 = EnumC37013p0.LONG;
        EnumC37011o0 enumC37011o2 = new EnumC37011o0("INT64", 2, enumC37013p0, 0);
        EnumC37011o0 enumC37011o3 = new EnumC37011o0("UINT64", 3, enumC37013p0, 0);
        EnumC37013p0 enumC37013p1 = EnumC37013p0.INT;
        EnumC37011o0 enumC37011o4 = new EnumC37011o0("INT32", 4, enumC37013p1, 0);
        f158369y = enumC37011o4;
        EnumC37011o0 enumC37011o5 = new EnumC37011o0("FIXED64", 5, enumC37013p0, 1);
        EnumC37011o0 enumC37011o6 = new EnumC37011o0("FIXED32", 6, enumC37013p1, 5);
        EnumC37011o0 enumC37011o7 = new EnumC37011o0("BOOL", 7, EnumC37013p0.BOOLEAN, 0);
        f158370z = enumC37011o7;
        C37003k0 c37003k0 = new C37003k0("STRING", 8, EnumC37013p0.STRING, 2);
        EnumC37013p0 enumC37013p2 = EnumC37013p0.MESSAGE;
        C37005l0 c37005l0 = new C37005l0("GROUP", 9, enumC37013p2, 3);
        f158365E = c37005l0;
        C37007m0 c37007m0 = new C37007m0("MESSAGE", 10, enumC37013p2, 2);
        f158366F = c37007m0;
        C37009n0 c37009n0 = new C37009n0("BYTES", 11, EnumC37013p0.BYTE_STRING, 2);
        EnumC37011o0 enumC37011o8 = new EnumC37011o0("UINT32", 12, enumC37013p1, 0);
        EnumC37011o0 enumC37011o9 = new EnumC37011o0("ENUM", 13, EnumC37013p0.ENUM, 0);
        f158367G = enumC37011o9;
        f158368H = new EnumC37011o0[]{enumC37011o0, enumC37011o1, enumC37011o2, enumC37011o3, enumC37011o4, enumC37011o5, enumC37011o6, enumC37011o7, c37003k0, c37005l0, c37007m0, c37009n0, enumC37011o8, enumC37011o9, new EnumC37011o0("SFIXED32", 14, enumC37013p1, 5), new EnumC37011o0("SFIXED64", 15, enumC37013p0, 1), new EnumC37011o0("SINT32", 16, enumC37013p1, 0), new EnumC37011o0("SINT64", 17, enumC37013p0, 0)};
    }

    public EnumC37011o0(String str, int i13, EnumC37013p0 enumC37013p0, int i14) {
        super(str, i13);
        this.f158371w = enumC37013p0;
        this.f158372x = i14;
    }

    public static EnumC37011o0 valueOf(String str) {
        return (EnumC37011o0) Enum.valueOf(EnumC37011o0.class, str);
    }

    public static EnumC37011o0[] values() {
        return (EnumC37011o0[]) f158368H.clone();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo118817a() {
        return !(this instanceof C37003k0);
    }
}
