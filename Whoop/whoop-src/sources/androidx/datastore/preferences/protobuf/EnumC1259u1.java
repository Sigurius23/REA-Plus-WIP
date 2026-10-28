package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u1 */
/* JADX INFO: loaded from: classes.dex */
public class EnumC1259u1 {

    /* JADX INFO: renamed from: E */
    public static final C1253s1 f5483E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC1259u1[] f5484F;

    /* JADX INFO: renamed from: y */
    public static final C1247q1 f5485y;

    /* JADX INFO: renamed from: z */
    public static final C1250r1 f5486z;

    /* JADX INFO: renamed from: w */
    public final EnumC1262v1 f5487w;

    /* JADX INFO: renamed from: x */
    public final int f5488x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1259u1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1259u1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1259u1 EF2;

    static {
        EnumC1259u1 enumC1259u1 = new EnumC1259u1("DOUBLE", 0, EnumC1262v1.DOUBLE, 1);
        EnumC1259u1 enumC1259u2 = new EnumC1259u1("FLOAT", 1, EnumC1262v1.FLOAT, 5);
        EnumC1262v1 enumC1262v1 = EnumC1262v1.LONG;
        EnumC1259u1 enumC1259u3 = new EnumC1259u1("INT64", 2, enumC1262v1, 0);
        EnumC1259u1 enumC1259u4 = new EnumC1259u1("UINT64", 3, enumC1262v1, 0);
        EnumC1262v1 enumC1262v2 = EnumC1262v1.INT;
        EnumC1259u1 enumC1259u5 = new EnumC1259u1("INT32", 4, enumC1262v2, 0);
        EnumC1259u1 enumC1259u6 = new EnumC1259u1("FIXED64", 5, enumC1262v1, 1);
        EnumC1259u1 enumC1259u7 = new EnumC1259u1("FIXED32", 6, enumC1262v2, 5);
        EnumC1259u1 enumC1259u8 = new EnumC1259u1("BOOL", 7, EnumC1262v1.BOOLEAN, 0);
        C1247q1 c1247q1 = new C1247q1("STRING", 8, EnumC1262v1.STRING, 2);
        f5485y = c1247q1;
        EnumC1262v1 enumC1262v3 = EnumC1262v1.MESSAGE;
        C1250r1 c1250r1 = new C1250r1("GROUP", 9, enumC1262v3, 3);
        f5486z = c1250r1;
        C1253s1 c1253s1 = new C1253s1("MESSAGE", 10, enumC1262v3, 2);
        f5483E = c1253s1;
        f5484F = new EnumC1259u1[]{enumC1259u1, enumC1259u2, enumC1259u3, enumC1259u4, enumC1259u5, enumC1259u6, enumC1259u7, enumC1259u8, c1247q1, c1250r1, c1253s1, new C1256t1("BYTES", 11, EnumC1262v1.BYTE_STRING, 2), new EnumC1259u1("UINT32", 12, enumC1262v2, 0), new EnumC1259u1("ENUM", 13, EnumC1262v1.ENUM, 0), new EnumC1259u1("SFIXED32", 14, enumC1262v2, 5), new EnumC1259u1("SFIXED64", 15, enumC1262v1, 1), new EnumC1259u1("SINT32", 16, enumC1262v2, 0), new EnumC1259u1("SINT64", 17, enumC1262v1, 0)};
    }

    public EnumC1259u1(String str, int i13, EnumC1262v1 enumC1262v1, int i14) {
        super(str, i13);
        this.f5487w = enumC1262v1;
        this.f5488x = i14;
    }

    public static EnumC1259u1 valueOf(String str) {
        return (EnumC1259u1) Enum.valueOf(EnumC1259u1.class, str);
    }

    public static EnumC1259u1[] values() {
        return (EnumC1259u1[]) f5484F.clone();
    }
}
