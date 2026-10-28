package androidx.health.platform.client.proto;

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
/* JADX INFO: renamed from: androidx.health.platform.client.proto.v3 */
/* JADX INFO: loaded from: classes5.dex */
public class EnumC1542v3 {

    /* JADX INFO: renamed from: E */
    public static final C1532t3 f6126E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC1542v3[] f6127F;

    /* JADX INFO: renamed from: y */
    public static final C1522r3 f6128y;

    /* JADX INFO: renamed from: z */
    public static final C1527s3 f6129z;

    /* JADX INFO: renamed from: w */
    public final EnumC1547w3 f6130w;

    /* JADX INFO: renamed from: x */
    public final int f6131x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1542v3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1542v3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1542v3 EF2;

    static {
        EnumC1542v3 enumC1542v3 = new EnumC1542v3("DOUBLE", 0, EnumC1547w3.DOUBLE, 1);
        EnumC1542v3 enumC1542v4 = new EnumC1542v3("FLOAT", 1, EnumC1547w3.FLOAT, 5);
        EnumC1547w3 enumC1547w3 = EnumC1547w3.LONG;
        EnumC1542v3 enumC1542v5 = new EnumC1542v3("INT64", 2, enumC1547w3, 0);
        EnumC1542v3 enumC1542v6 = new EnumC1542v3("UINT64", 3, enumC1547w3, 0);
        EnumC1547w3 enumC1547w4 = EnumC1547w3.INT;
        EnumC1542v3 enumC1542v7 = new EnumC1542v3("INT32", 4, enumC1547w4, 0);
        EnumC1542v3 enumC1542v8 = new EnumC1542v3("FIXED64", 5, enumC1547w3, 1);
        EnumC1542v3 enumC1542v9 = new EnumC1542v3("FIXED32", 6, enumC1547w4, 5);
        EnumC1542v3 enumC1542v10 = new EnumC1542v3("BOOL", 7, EnumC1547w3.BOOLEAN, 0);
        C1522r3 c1522r3 = new C1522r3("STRING", 8, EnumC1547w3.STRING, 2);
        f6128y = c1522r3;
        EnumC1547w3 enumC1547w5 = EnumC1547w3.MESSAGE;
        C1527s3 c1527s3 = new C1527s3("GROUP", 9, enumC1547w5, 3);
        f6129z = c1527s3;
        C1532t3 c1532t3 = new C1532t3("MESSAGE", 10, enumC1547w5, 2);
        f6126E = c1532t3;
        f6127F = new EnumC1542v3[]{enumC1542v3, enumC1542v4, enumC1542v5, enumC1542v6, enumC1542v7, enumC1542v8, enumC1542v9, enumC1542v10, c1522r3, c1527s3, c1532t3, new C1537u3("BYTES", 11, EnumC1547w3.BYTE_STRING, 2), new EnumC1542v3("UINT32", 12, enumC1547w4, 0), new EnumC1542v3("ENUM", 13, EnumC1547w3.ENUM, 0), new EnumC1542v3("SFIXED32", 14, enumC1547w4, 5), new EnumC1542v3("SFIXED64", 15, enumC1547w3, 1), new EnumC1542v3("SINT32", 16, enumC1547w4, 0), new EnumC1542v3("SINT64", 17, enumC1547w3, 0)};
    }

    public EnumC1542v3(String str, int i13, EnumC1547w3 enumC1547w3, int i14) {
        super(str, i13);
        this.f6130w = enumC1547w3;
        this.f6131x = i14;
    }

    public static EnumC1542v3 valueOf(String str) {
        return (EnumC1542v3) Enum.valueOf(EnumC1542v3.class, str);
    }

    public static EnumC1542v3[] values() {
        return (EnumC1542v3[]) f6127F.clone();
    }
}
