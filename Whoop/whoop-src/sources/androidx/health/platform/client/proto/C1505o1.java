package androidx.health.platform.client.proto;

import ih0.AbstractC18489d0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.o1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1505o1 implements InterfaceC1536u2 {

    /* JADX INFO: renamed from: n */
    public static final int[] f6083n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f6084o = AbstractC1502n3.m4728j();

    /* JADX INFO: renamed from: a */
    public final int[] f6085a;

    /* JADX INFO: renamed from: b */
    public final Object[] f6086b;

    /* JADX INFO: renamed from: c */
    public final int f6087c;

    /* JADX INFO: renamed from: d */
    public final int f6088d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1433a f6089e;

    /* JADX INFO: renamed from: f */
    public final boolean f6090f;

    /* JADX INFO: renamed from: g */
    public final int[] f6091g;

    /* JADX INFO: renamed from: h */
    public final int f6092h;

    /* JADX INFO: renamed from: i */
    public final int f6093i;

    /* JADX INFO: renamed from: j */
    public final C1515q1 f6094j;

    /* JADX INFO: renamed from: k */
    public final AbstractC1450d1 f6095k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1452d3 f6096l;

    /* JADX INFO: renamed from: m */
    public final C1485k1 f6097m;

    public C1505o1(int[] iArr, Object[] objArr, int i13, int i14, AbstractC1433a abstractC1433a, boolean z4, int[] iArr2, int i15, int i16, C1515q1 c1515q1, AbstractC1450d1 abstractC1450d1, AbstractC1452d3 abstractC1452d3, C1494m0 c1494m0, C1485k1 c1485k1) {
        this.f6085a = iArr;
        this.f6086b = objArr;
        this.f6087c = i13;
        this.f6088d = i14;
        this.f6090f = z4;
        this.f6091g = iArr2;
        this.f6092h = i15;
        this.f6093i = i16;
        this.f6094j = c1515q1;
        this.f6095k = abstractC1450d1;
        this.f6096l = abstractC1452d3;
        this.f6089e = abstractC1433a;
        this.f6097m = c1485k1;
    }

    /* JADX INFO: renamed from: A */
    public static C1505o1 m4740A(C1436a2 c1436a2, C1515q1 c1515q1, AbstractC1450d1 abstractC1450d1, AbstractC1452d3 abstractC1452d3, C1494m0 c1494m0, C1485k1 c1485k1) {
        if (c1436a2 instanceof C1436a2) {
            return m4741B(c1436a2, c1515q1, abstractC1450d1, abstractC1452d3, c1494m0, c1485k1);
        }
        c1436a2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0359  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b6  */
    /* JADX INFO: renamed from: B */
    public static C1505o1 m4741B(C1436a2 c1436a2, C1515q1 c1515q1, AbstractC1450d1 abstractC1450d1, AbstractC1452d3 abstractC1452d3, C1494m0 c1494m0, C1485k1 c1485k1) {
        int i13;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i24;
        char cCharAt4;
        int i25;
        char cCharAt5;
        int i26;
        char cCharAt6;
        int i27;
        char cCharAt7;
        int i28;
        char cCharAt8;
        int i29;
        int i34;
        int i35;
        int i36;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i37;
        int i38;
        int i39;
        int i44;
        Field fieldM4744J;
        int i45;
        char cCharAt9;
        int i46;
        Field fieldM4744J2;
        Field fieldM4744J3;
        int i47;
        char cCharAt10;
        int i48;
        char cCharAt11;
        int i49;
        int i54;
        char cCharAt12;
        int i55;
        char cCharAt13;
        int i56 = 0;
        boolean z4 = (c1436a2.f6017d & 1) != 1;
        String str = c1436a2.f6015b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i57 = 1;
            while (true) {
                i13 = i57 + 1;
                if (str.charAt(i57) < 55296) {
                    break;
                }
                i57 = i13;
            }
        } else {
            i13 = 1;
        }
        int i58 = i13 + 1;
        int iCharAt4 = str.charAt(i13);
        if (iCharAt4 >= 55296) {
            int i59 = iCharAt4 & 8191;
            int i64 = 13;
            while (true) {
                i55 = i58 + 1;
                cCharAt13 = str.charAt(i58);
                if (cCharAt13 < 55296) {
                    break;
                }
                i59 |= (cCharAt13 & 8191) << i64;
                i64 += 13;
                i58 = i55;
            }
            iCharAt4 = i59 | (cCharAt13 << i64);
            i58 = i55;
        }
        if (iCharAt4 == 0) {
            i16 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            iCharAt3 = 0;
            iArr = f6083n;
            i15 = 0;
        } else {
            int i65 = i58 + 1;
            int iCharAt5 = str.charAt(i58);
            if (iCharAt5 >= 55296) {
                int i66 = iCharAt5 & 8191;
                int i67 = 13;
                while (true) {
                    i28 = i65 + 1;
                    cCharAt8 = str.charAt(i65);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt8 & 8191) << i67;
                    i67 += 13;
                    i65 = i28;
                }
                iCharAt5 = i66 | (cCharAt8 << i67);
                i65 = i28;
            }
            int i68 = i65 + 1;
            int iCharAt6 = str.charAt(i65);
            if (iCharAt6 >= 55296) {
                int i69 = iCharAt6 & 8191;
                int i74 = 13;
                while (true) {
                    i27 = i68 + 1;
                    cCharAt7 = str.charAt(i68);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt7 & 8191) << i74;
                    i74 += 13;
                    i68 = i27;
                }
                iCharAt6 = i69 | (cCharAt7 << i74);
                i68 = i27;
            }
            int i75 = i68 + 1;
            int iCharAt7 = str.charAt(i68);
            if (iCharAt7 >= 55296) {
                int i76 = iCharAt7 & 8191;
                int i77 = 13;
                while (true) {
                    i26 = i75 + 1;
                    cCharAt6 = str.charAt(i75);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt6 & 8191) << i77;
                    i77 += 13;
                    i75 = i26;
                }
                iCharAt7 = i76 | (cCharAt6 << i77);
                i75 = i26;
            }
            int i78 = i75 + 1;
            int iCharAt8 = str.charAt(i75);
            if (iCharAt8 >= 55296) {
                int i79 = iCharAt8 & 8191;
                int i83 = 13;
                while (true) {
                    i25 = i78 + 1;
                    cCharAt5 = str.charAt(i78);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt5 & 8191) << i83;
                    i83 += 13;
                    i78 = i25;
                }
                iCharAt8 = i79 | (cCharAt5 << i83);
                i78 = i25;
            }
            int i84 = i78 + 1;
            iCharAt = str.charAt(i78);
            if (iCharAt >= 55296) {
                int i85 = iCharAt & 8191;
                int i86 = 13;
                while (true) {
                    i24 = i84 + 1;
                    cCharAt4 = str.charAt(i84);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt4 & 8191) << i86;
                    i86 += 13;
                    i84 = i24;
                }
                iCharAt = i85 | (cCharAt4 << i86);
                i84 = i24;
            }
            int i87 = i84 + 1;
            iCharAt2 = str.charAt(i84);
            if (iCharAt2 >= 55296) {
                int i88 = iCharAt2 & 8191;
                int i89 = 13;
                while (true) {
                    i19 = i87 + 1;
                    cCharAt3 = str.charAt(i87);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt3 & 8191) << i89;
                    i89 += 13;
                    i87 = i19;
                }
                iCharAt2 = i88 | (cCharAt3 << i89);
                i87 = i19;
            }
            int i94 = i87 + 1;
            int iCharAt9 = str.charAt(i87);
            if (iCharAt9 >= 55296) {
                int i95 = iCharAt9 & 8191;
                int i96 = 13;
                while (true) {
                    i18 = i94 + 1;
                    cCharAt2 = str.charAt(i94);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i95 |= (cCharAt2 & 8191) << i96;
                    i96 += 13;
                    i94 = i18;
                }
                iCharAt9 = i95 | (cCharAt2 << i96);
                i94 = i18;
            }
            int i97 = i94 + 1;
            iCharAt3 = str.charAt(i94);
            if (iCharAt3 >= 55296) {
                int i98 = iCharAt3 & 8191;
                int i99 = i97;
                int i100 = 13;
                while (true) {
                    i17 = i99 + 1;
                    cCharAt = str.charAt(i99);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i98 |= (cCharAt & 8191) << i100;
                    i100 += 13;
                    i99 = i17;
                }
                iCharAt3 = i98 | (cCharAt << i100);
                i97 = i17;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i14 = (iCharAt5 * 2) + iCharAt6;
            i15 = iCharAt7;
            i16 = iCharAt8;
            iArr = iArr2;
            i56 = iCharAt5;
            i58 = i97;
        }
        Unsafe unsafe = f6084o;
        Object[] objArr = c1436a2.f6016c;
        Class<?> cls = c1436a2.f6014a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i101 = iCharAt2 + iCharAt3;
        int i102 = i101;
        int i103 = iCharAt3;
        int i104 = 0;
        int i105 = 0;
        while (i58 < length) {
            int i106 = i58 + 1;
            int iCharAt10 = str.charAt(i58);
            int i107 = i56;
            if (iCharAt10 >= 55296) {
                int i108 = iCharAt10 & 8191;
                int i109 = i106;
                int i110 = 13;
                while (true) {
                    i54 = i109 + 1;
                    cCharAt12 = str.charAt(i109);
                    i29 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i108 |= (cCharAt12 & 8191) << i110;
                    i110 += 13;
                    i109 = i54;
                    length = i29;
                }
                iCharAt10 = i108 | (cCharAt12 << i110);
                i34 = i54;
            } else {
                i29 = length;
                i34 = i106;
            }
            int i111 = i34 + 1;
            int iCharAt11 = str.charAt(i34);
            if (iCharAt11 >= 55296) {
                int i112 = iCharAt11 & 8191;
                int i113 = i111;
                int i114 = 13;
                while (true) {
                    i48 = i113 + 1;
                    cCharAt11 = str.charAt(i113);
                    i49 = i112;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i112 = i49 | ((cCharAt11 & 8191) << i114);
                    i114 += 13;
                    i113 = i48;
                }
                iCharAt11 = i49 | (cCharAt11 << i114);
                i35 = i48;
            } else {
                i35 = i111;
            }
            int i115 = iCharAt10;
            int i116 = iCharAt11 & 255;
            int i117 = i15;
            if ((iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                iArr[i105] = i104;
                i105++;
            }
            int i118 = i16;
            if (i116 >= 51) {
                int i119 = i35 + 1;
                int iCharAt12 = str.charAt(i35);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i120 = iCharAt12 & 8191;
                    int i121 = 13;
                    while (true) {
                        i47 = i119 + 1;
                        cCharAt10 = str.charAt(i119);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i120 |= (cCharAt10 & 8191) << i121;
                        i121 += 13;
                        i119 = i47;
                        c3 = 55296;
                    }
                    iCharAt12 = i120 | (cCharAt10 << i121);
                    i119 = i47;
                }
                int i122 = i116 - 51;
                int i123 = iCharAt12;
                if (i122 == 9 || i122 == 17) {
                    objArr2[AbstractC11266d.m30449c(i104, 3, 2, 1)] = objArr[i14];
                    i14++;
                } else if (i122 == 12 && !z4) {
                    objArr2[AbstractC11266d.m30449c(i104, 3, 2, 1)] = objArr[i14];
                    i14++;
                }
                int i124 = i123 * 2;
                Object obj = objArr[i124];
                if (obj instanceof Field) {
                    fieldM4744J2 = (Field) obj;
                } else {
                    fieldM4744J2 = m4744J(cls, (String) obj);
                    objArr[i124] = fieldM4744J2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4744J2);
                int i125 = i124 + 1;
                Object obj2 = objArr[i125];
                if (obj2 instanceof Field) {
                    fieldM4744J3 = (Field) obj2;
                } else {
                    fieldM4744J3 = m4744J(cls, (String) obj2);
                    objArr[i125] = fieldM4744J3;
                }
                iArr = iArr;
                i37 = i119;
                i104 = i104;
                z4 = z4;
                objArr2 = objArr2;
                i39 = i14;
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4744J3);
                i44 = iObjectFieldOffset3;
                i38 = 0;
            } else {
                int i126 = i14 + 1;
                Field fieldM4744J4 = m4744J(cls, (String) objArr[i14]);
                if (i116 == 9 || i116 == 17) {
                    objArr2[AbstractC11266d.m30449c(i104, 3, 2, 1)] = fieldM4744J4.getType();
                } else {
                    if (i116 == 27 || i116 == 49) {
                        i46 = i14 + 2;
                        objArr2[AbstractC11266d.m30449c(i104, 3, 2, 1)] = objArr[i126];
                    } else if (i116 != 12 && i116 != 30 && i116 != 44) {
                        if (i116 == 50) {
                            int i127 = i103 + 1;
                            iArr[i103] = i104;
                            int i128 = (i104 / 3) * 2;
                            int i129 = i14 + 2;
                            objArr2[i128] = objArr[i126];
                            if ((iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                i36 = i14 + 3;
                                objArr2[i128 + 1] = objArr[i129];
                                z4 = z4;
                                iArr = iArr;
                                i103 = i127;
                            } else {
                                z4 = z4;
                                i36 = i129;
                                i103 = i127;
                                iArr = iArr;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4744J4);
                        if ((iCharAt11 & 4096) == 4096 || i116 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i37 = i35;
                            i38 = 0;
                        } else {
                            i37 = i35 + 1;
                            int iCharAt13 = str.charAt(i35);
                            if (iCharAt13 >= 55296) {
                                int i130 = iCharAt13 & 8191;
                                int i131 = 13;
                                while (true) {
                                    i45 = i37 + 1;
                                    cCharAt9 = str.charAt(i37);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i130 |= (cCharAt9 & 8191) << i131;
                                    i131 += 13;
                                    i37 = i45;
                                }
                                iCharAt13 = i130 | (cCharAt9 << i131);
                                i37 = i45;
                            }
                            int i132 = (iCharAt13 / 32) + (i107 * 2);
                            Object obj3 = objArr[i132];
                            if (obj3 instanceof Field) {
                                fieldM4744J = (Field) obj3;
                            } else {
                                fieldM4744J = m4744J(cls, (String) obj3);
                                objArr[i132] = fieldM4744J;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4744J);
                            i38 = iCharAt13 % 32;
                        }
                        if (i116 >= 18 && i116 <= 49) {
                            iArr[i102] = iObjectFieldOffset;
                            i102++;
                        }
                        i39 = i36;
                        i44 = iObjectFieldOffset;
                    } else if (!z4) {
                        i46 = i14 + 2;
                        objArr2[AbstractC11266d.m30449c(i104, 3, 2, 1)] = objArr[i126];
                    }
                    i36 = i46;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4744J4);
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i37 = i35;
                        i38 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i37 = i35;
                        i38 = 0;
                    }
                    if (i116 >= 18) {
                        iArr[i102] = iObjectFieldOffset;
                        i102++;
                    }
                    i39 = i36;
                    i44 = iObjectFieldOffset;
                }
                i36 = i126;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4744J4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i37 = i35;
                    i38 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i37 = i35;
                    i38 = 0;
                }
                if (i116 >= 18) {
                    iArr[i102] = iObjectFieldOffset;
                    i102++;
                }
                i39 = i36;
                i44 = iObjectFieldOffset;
            }
            int i133 = i104 + 1;
            iArr3[i104] = i115;
            int i134 = i104 + 2;
            int i135 = iObjectFieldOffset2;
            iArr3[i133] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i116 << 20) | i44;
            iArr3[i134] = (i38 << 20) | i135;
            int i136 = i39;
            i104 += 3;
            str = str;
            i14 = i136;
            objArr2 = objArr2;
            i58 = i37;
            z4 = z4;
            i56 = i107;
            i15 = i117;
            length = i29;
            iArr = iArr;
            i16 = i118;
        }
        return new C1505o1(iArr3, objArr2, i15, i16, c1436a2.f6014a, z4, iArr, iCharAt3, i101, c1515q1, abstractC1450d1, abstractC1452d3, c1494m0, c1485k1);
    }

    /* JADX INFO: renamed from: C */
    public static int m4742C(long j7, Object obj) {
        return ((Integer) AbstractC1502n3.f6075c.m4711i(j7, obj)).intValue();
    }

    /* JADX INFO: renamed from: D */
    public static long m4743D(long j7, Object obj) {
        return ((Long) AbstractC1502n3.f6075c.m4711i(j7, obj)).longValue();
    }

    /* JADX INFO: renamed from: J */
    public static Field m4744J(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Field ", str, " for ");
            AbstractC11266d.m30443A(cls, sbM53375p, " not found. Known fields are ");
            sbM53375p.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM53375p.toString());
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m4745O(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: S */
    public static void m4746S(int i13, Object obj, C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            c1465g1.m4624a(i13, (C1468h) obj);
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        c1483k.m4673O(i13, 2);
        c1483k.m4672N((String) obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m4747k(Object obj) {
        if (!m4750t(obj)) {
            throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m4748l(byte[] bArr, int i13, int i14, EnumC1542v3 enumC1542v3, Class cls, C1448d c1448d) throws InvalidProtocolBufferException {
        switch (enumC1542v3.ordinal()) {
            case 0:
                c1448d.f6027c = Double.valueOf(Double.longBitsToDouble(AbstractC1559z2.m4952c(i13, bArr)));
                return i13 + 8;
            case 1:
                c1448d.f6027c = Float.valueOf(Float.intBitsToFloat(AbstractC1559z2.m4951b(i13, bArr)));
                return i13 + 4;
            case 2:
            case 3:
                int iM4960l = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                c1448d.f6027c = Long.valueOf(c1448d.f6026b);
                return iM4960l;
            case 4:
            case 12:
            case 13:
                int iM4958j = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                c1448d.f6027c = Integer.valueOf(c1448d.f6025a);
                return iM4958j;
            case 5:
            case 15:
                c1448d.f6027c = Long.valueOf(AbstractC1559z2.m4952c(i13, bArr));
                return i13 + 8;
            case 6:
            case 14:
                c1448d.f6027c = Integer.valueOf(AbstractC1559z2.m4951b(i13, bArr));
                return i13 + 4;
            case 7:
                int iM4960l2 = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                c1448d.f6027c = Boolean.valueOf(c1448d.f6026b != 0);
                return iM4960l2;
            case 8:
                return AbstractC1559z2.m4955f(bArr, i13, c1448d);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC1536u2 interfaceC1536u2M4946a = C1554y1.f6164c.m4946a(cls);
                AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4946a.mo4767d();
                int iM4965s = AbstractC1559z2.m4965s(abstractC1534u0Mo4767d, interfaceC1536u2M4946a, bArr, i13, i14, c1448d);
                interfaceC1536u2M4946a.mo4765b(abstractC1534u0Mo4767d);
                c1448d.f6027c = abstractC1534u0Mo4767d;
                return iM4965s;
            case 11:
                return AbstractC1559z2.m4950a(bArr, i13, c1448d);
            case 16:
                int iM4958j2 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                c1448d.f6027c = Integer.valueOf(AbstractC1559z2.m4961m(c1448d.f6025a));
                return iM4958j2;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iM4960l3 = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                c1448d.f6027c = Long.valueOf(AbstractC1559z2.m4962n(c1448d.f6026b));
                return iM4960l3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static C1457e3 m4749p(Object obj) {
        AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) obj;
        C1457e3 c1457e3 = abstractC1534u0.unknownFields;
        if (c1457e3 != C1457e3.f6031f) {
            return c1457e3;
        }
        C1457e3 c1457e3M4602c = C1457e3.m4602c();
        abstractC1534u0.unknownFields = c1457e3M4602c;
        return c1457e3M4602c;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m4750t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1534u0) {
            return ((AbstractC1534u0) obj).m4871i();
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static List m4751v(AbstractC1534u0 abstractC1534u0, long j7) {
        return (List) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
    }

    /* JADX INFO: renamed from: E */
    public final int m4752E(Object obj, byte[] bArr, int i13, int i14, int i15, long j7, C1448d c1448d) throws InvalidProtocolBufferException {
        int iM4748l;
        Unsafe unsafe = f6084o;
        Object objM4775n = m4775n(i15);
        Object object = unsafe.getObject(obj, j7);
        this.f6097m.getClass();
        if (!((C1480j1) object).f6055w) {
            C1480j1 c1480j1M4652c = C1480j1.f6054x.m4652c();
            C1485k1.m4678b(c1480j1M4652c, object);
            unsafe.putObject(obj, j7, c1480j1M4652c);
            object = c1480j1M4652c;
        }
        C1470h1 c1470h1 = ((C1475i1) objM4775n).f6052a;
        C1480j1 c1480j1 = (C1480j1) object;
        int iM4958j = AbstractC1559z2.m4958j(bArr, i13, c1448d);
        int i16 = c1448d.f6025a;
        if (i16 < 0 || i16 > i14 - iM4958j) {
            throw InvalidProtocolBufferException.m4561d();
        }
        int i17 = iM4958j + i16;
        Object obj2 = c1470h1.f6050c;
        Object obj3 = "";
        Object obj4 = obj2;
        while (iM4958j < i17) {
            int iM4957i = iM4958j + 1;
            int i18 = bArr[iM4958j];
            if (i18 < 0) {
                iM4957i = AbstractC1559z2.m4957i(i18, bArr, iM4957i, c1448d);
                i18 = c1448d.f6025a;
            }
            int i19 = i18 >>> 3;
            int i24 = i18 & 7;
            if (i19 != 1) {
                if (i19 == 2) {
                    EnumC1542v3 enumC1542v3 = c1470h1.f6049b;
                    if (i24 == enumC1542v3.f6131x) {
                        iM4748l = m4748l(bArr, iM4957i, i14, enumC1542v3, obj2.getClass(), c1448d);
                        obj4 = c1448d.f6027c;
                        iM4958j = iM4748l;
                    }
                }
                iM4958j = AbstractC1559z2.m4966u(i18, bArr, iM4957i, i14, c1448d);
            } else {
                EnumC1542v3 enumC1542v4 = c1470h1.f6048a;
                if (i24 == enumC1542v4.f6131x) {
                    iM4748l = m4748l(bArr, iM4957i, i14, enumC1542v4, null, c1448d);
                    obj3 = c1448d.f6027c;
                    iM4958j = iM4748l;
                } else {
                    iM4958j = AbstractC1559z2.m4966u(i18, bArr, iM4957i, i14, c1448d);
                }
            }
        }
        if (iM4958j != i17) {
            throw InvalidProtocolBufferException.m4560c();
        }
        c1480j1.put(obj3, obj4);
        return i17;
    }

    /* JADX INFO: renamed from: F */
    public final int m4753F(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, int i24, C1448d c1448d) throws InvalidProtocolBufferException {
        EnumC1535u1 enumC1535u1;
        Unsafe unsafe = f6084o;
        long j13 = this.f6085a[i24 + 2] & 1048575;
        switch (i19) {
            case 51:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Double.valueOf(Double.longBitsToDouble(AbstractC1559z2.m4952c(i13, bArr))));
                int i25 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i25;
            case 52:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Float.valueOf(Float.intBitsToFloat(AbstractC1559z2.m4951b(i13, bArr))));
                int i26 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i26;
            case 53:
            case 54:
                if (i17 != 0) {
                    return i13;
                }
                int iM4960l = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Long.valueOf(c1448d.f6026b));
                unsafe.putInt(obj, j13, i16);
                return iM4960l;
            case 55:
            case 62:
                if (i17 != 0) {
                    return i13;
                }
                int iM4958j = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Integer.valueOf(c1448d.f6025a));
                unsafe.putInt(obj, j13, i16);
                return iM4958j;
            case 56:
            case 65:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Long.valueOf(AbstractC1559z2.m4952c(i13, bArr)));
                int i27 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i27;
            case 57:
            case 64:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Integer.valueOf(AbstractC1559z2.m4951b(i13, bArr)));
                int i28 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i28;
            case 58:
                if (i17 != 0) {
                    return i13;
                }
                int iM4960l2 = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Boolean.valueOf(c1448d.f6026b != 0));
                unsafe.putInt(obj, j13, i16);
                return iM4960l2;
            case 59:
                if (i17 != 2) {
                    return i13;
                }
                int iM4958j2 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                int i29 = c1448d.f6025a;
                if (i29 == 0) {
                    unsafe.putObject(obj, j7, "");
                } else {
                    if ((i18 & 536870912) != 0) {
                        if (!AbstractC1517q3.f6107a.m4967r(bArr, iM4958j2, iM4958j2 + i29)) {
                            throw InvalidProtocolBufferException.m4558a();
                        }
                    }
                    unsafe.putObject(obj, j7, new String(bArr, iM4958j2, i29, AbstractC1549x0.f6150a));
                    iM4958j2 += i29;
                }
                unsafe.putInt(obj, j13, i16);
                return iM4958j2;
            case 60:
                if (i17 != 2) {
                    return i13;
                }
                Object objM4784z = m4784z(i16, i24, obj);
                int iM4965s = AbstractC1559z2.m4965s(objM4784z, m4776o(i24), bArr, i13, i14, c1448d);
                m4760N(obj, i16, objM4784z, i24);
                return iM4965s;
            case 61:
                if (i17 != 2) {
                    return i13;
                }
                int iM4950a = AbstractC1559z2.m4950a(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, c1448d.f6027c);
                unsafe.putInt(obj, j13, i16);
                return iM4950a;
            case 63:
                if (i17 != 0) {
                    return i13;
                }
                int iM4958j3 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                int i34 = c1448d.f6025a;
                if (m4774m(i24) != null) {
                    if (i34 == 0) {
                        enumC1535u1 = EnumC1535u1.ACCESS_TYPE_UNKNOWN;
                    } else if (i34 != 1) {
                        enumC1535u1 = i34 != 2 ? null : EnumC1535u1.ACCESS_TYPE_WRITE;
                    } else {
                        enumC1535u1 = EnumC1535u1.ACCESS_TYPE_READ;
                    }
                    if (enumC1535u1 == null) {
                        m4749p(obj).m4605d(i15, Long.valueOf(i34));
                        return iM4958j3;
                    }
                }
                unsafe.putObject(obj, j7, Integer.valueOf(i34));
                unsafe.putInt(obj, j13, i16);
                return iM4958j3;
            case 66:
                if (i17 != 0) {
                    return i13;
                }
                int iM4958j4 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Integer.valueOf(AbstractC1559z2.m4961m(c1448d.f6025a)));
                unsafe.putInt(obj, j13, i16);
                return iM4958j4;
            case 67:
                if (i17 != 0) {
                    return i13;
                }
                int iM4960l3 = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Long.valueOf(AbstractC1559z2.m4962n(c1448d.f6026b)));
                unsafe.putInt(obj, j13, i16);
                return iM4960l3;
            case 68:
                if (i17 == 3) {
                    Object objM4784z2 = m4784z(i16, i24, obj);
                    int iM4754G = ((C1505o1) m4776o(i24)).m4754G(objM4784z2, bArr, i13, i14, (i15 & (-8)) | 4, c1448d);
                    c1448d.f6027c = objM4784z2;
                    m4760N(obj, i16, objM4784z2, i24);
                    return iM4754G;
                }
                break;
        }
        return i13;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: G */
    public final int m4754G(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, androidx.health.platform.client.proto.C1448d r41) throws androidx.health.platform.client.proto.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.C1505o1.m4754G(java.lang.Object, byte[], int, int, int, androidx.health.platform.client.proto.d):int");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: H */
    public final void m4755H(java.lang.Object r28, byte[] r29, int r30, int r31, androidx.health.platform.client.proto.C1448d r32) throws androidx.health.platform.client.proto.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.C1505o1.m4755H(java.lang.Object, byte[], int, int, androidx.health.platform.client.proto.d):void");
    }

    /* JADX INFO: renamed from: I */
    public final int m4756I(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, long j7, int i19, long j13, C1448d c1448d) throws InvalidProtocolBufferException {
        int i24;
        int i25;
        int iM4959k;
        EnumC1535u1 enumC1535u1;
        EnumC1535u1 enumC1535u2;
        Unsafe unsafe = f6084o;
        InterfaceC1544w0 interfaceC1544w0Mo4923i = (InterfaceC1544w0) unsafe.getObject(obj, j13);
        int i26 = 2;
        if (!((AbstractC1438b) interfaceC1544w0Mo4923i).f6021w) {
            int size = interfaceC1544w0Mo4923i.size();
            interfaceC1544w0Mo4923i = interfaceC1544w0Mo4923i.mo4923i(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j13, interfaceC1544w0Mo4923i);
        }
        InterfaceC1544w0 interfaceC1544w0 = interfaceC1544w0Mo4923i;
        char c3 = 3;
        int i27 = 0;
        int i28 = 1;
        switch (i19) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 35:
                if (i17 == 2) {
                    AbstractC1469h0 abstractC1469h0 = (AbstractC1469h0) interfaceC1544w0;
                    int iM4958j = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i29 = c1448d.f6025a + iM4958j;
                    while (iM4958j < i29) {
                        abstractC1469h0.m4632c(Double.longBitsToDouble(AbstractC1559z2.m4952c(iM4958j, bArr)));
                        iM4958j += 8;
                    }
                    if (iM4958j == i29) {
                        return iM4958j;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 1) {
                    return i13;
                }
                AbstractC1469h0 abstractC1469h1 = (AbstractC1469h0) interfaceC1544w0;
                abstractC1469h1.m4632c(Double.longBitsToDouble(AbstractC1559z2.m4952c(i13, bArr)));
                int i34 = i13 + 8;
                while (i34 < i14) {
                    int iM4958j2 = AbstractC1559z2.m4958j(bArr, i34, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return i34;
                    }
                    abstractC1469h1.m4632c(Double.longBitsToDouble(AbstractC1559z2.m4952c(iM4958j2, bArr)));
                    i34 = iM4958j2 + 8;
                }
                return i34;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 36:
                if (i17 == 2) {
                    AbstractC1514q0 abstractC1514q0 = (AbstractC1514q0) interfaceC1544w0;
                    int iM4958j3 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i35 = c1448d.f6025a + iM4958j3;
                    while (iM4958j3 < i35) {
                        abstractC1514q0.m4801c(Float.intBitsToFloat(AbstractC1559z2.m4951b(iM4958j3, bArr)));
                        iM4958j3 += 4;
                    }
                    if (iM4958j3 == i35) {
                        return iM4958j3;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 5) {
                    return i13;
                }
                AbstractC1514q0 abstractC1514q1 = (AbstractC1514q0) interfaceC1544w0;
                abstractC1514q1.m4801c(Float.intBitsToFloat(AbstractC1559z2.m4951b(i13, bArr)));
                int i36 = i13 + 4;
                while (i36 < i14) {
                    int iM4958j4 = AbstractC1559z2.m4958j(bArr, i36, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return i36;
                    }
                    abstractC1514q1.m4801c(Float.intBitsToFloat(AbstractC1559z2.m4951b(iM4958j4, bArr)));
                    i36 = iM4958j4 + 4;
                }
                return i36;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i17 == 2) {
                    AbstractC1455e1 abstractC1455e1 = (AbstractC1455e1) interfaceC1544w0;
                    int iM4958j5 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i37 = c1448d.f6025a + iM4958j5;
                    while (iM4958j5 < i37) {
                        iM4958j5 = AbstractC1559z2.m4960l(bArr, iM4958j5, c1448d);
                        abstractC1455e1.m4594c(c1448d.f6026b);
                    }
                    if (iM4958j5 == i37) {
                        return iM4958j5;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 0) {
                    return i13;
                }
                AbstractC1455e1 abstractC1455e2 = (AbstractC1455e1) interfaceC1544w0;
                int iM4960l = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                abstractC1455e2.m4594c(c1448d.f6026b);
                while (iM4960l < i14) {
                    int iM4958j6 = AbstractC1559z2.m4958j(bArr, iM4960l, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return iM4960l;
                    }
                    iM4960l = AbstractC1559z2.m4960l(bArr, iM4958j6, c1448d);
                    abstractC1455e2.m4594c(c1448d.f6026b);
                }
                return iM4960l;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i17 != 2) {
                    return i17 == 0 ? AbstractC1559z2.m4959k(i15, bArr, i13, i14, interfaceC1544w0, c1448d) : i13;
                }
                AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) interfaceC1544w0;
                int iM4958j7 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                int i38 = c1448d.f6025a + iM4958j7;
                while (iM4958j7 < i38) {
                    iM4958j7 = AbstractC1559z2.m4958j(bArr, iM4958j7, c1448d);
                    abstractC1539v0.m4875c(c1448d.f6025a);
                }
                if (iM4958j7 == i38) {
                    return iM4958j7;
                }
                throw InvalidProtocolBufferException.m4561d();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i17 == 2) {
                    AbstractC1455e1 abstractC1455e3 = (AbstractC1455e1) interfaceC1544w0;
                    int iM4958j8 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i39 = c1448d.f6025a + iM4958j8;
                    while (iM4958j8 < i39) {
                        abstractC1455e3.m4594c(AbstractC1559z2.m4952c(iM4958j8, bArr));
                        iM4958j8 += 8;
                    }
                    if (iM4958j8 == i39) {
                        return iM4958j8;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 1) {
                    return i13;
                }
                AbstractC1455e1 abstractC1455e4 = (AbstractC1455e1) interfaceC1544w0;
                abstractC1455e4.m4594c(AbstractC1559z2.m4952c(i13, bArr));
                int i44 = i13 + 8;
                while (i44 < i14) {
                    int iM4958j9 = AbstractC1559z2.m4958j(bArr, i44, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return i44;
                    }
                    abstractC1455e4.m4594c(AbstractC1559z2.m4952c(iM4958j9, bArr));
                    i44 = iM4958j9 + 8;
                }
                return i44;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i17 == 2) {
                    AbstractC1539v0 abstractC1539v1 = (AbstractC1539v0) interfaceC1544w0;
                    int iM4958j10 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i45 = c1448d.f6025a + iM4958j10;
                    while (iM4958j10 < i45) {
                        abstractC1539v1.m4875c(AbstractC1559z2.m4951b(iM4958j10, bArr));
                        iM4958j10 += 4;
                    }
                    if (iM4958j10 == i45) {
                        return iM4958j10;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 5) {
                    return i13;
                }
                AbstractC1539v0 abstractC1539v2 = (AbstractC1539v0) interfaceC1544w0;
                abstractC1539v2.m4875c(AbstractC1559z2.m4951b(i13, bArr));
                int i46 = i13 + 4;
                while (i46 < i14) {
                    int iM4958j11 = AbstractC1559z2.m4958j(bArr, i46, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return i46;
                    }
                    abstractC1539v2.m4875c(AbstractC1559z2.m4951b(iM4958j11, bArr));
                    i46 = iM4958j11 + 4;
                }
                return i46;
            case 25:
            case 42:
                if (i17 == 2) {
                    AbstractC1453e abstractC1453e = (AbstractC1453e) interfaceC1544w0;
                    int iM4958j12 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i47 = c1448d.f6025a + iM4958j12;
                    while (iM4958j12 < i47) {
                        iM4958j12 = AbstractC1559z2.m4960l(bArr, iM4958j12, c1448d);
                        abstractC1453e.m4586c(c1448d.f6026b != 0);
                    }
                    if (iM4958j12 == i47) {
                        return iM4958j12;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 != 0) {
                    return i13;
                }
                AbstractC1453e abstractC1453e2 = (AbstractC1453e) interfaceC1544w0;
                int iM4960l2 = AbstractC1559z2.m4960l(bArr, i13, c1448d);
                abstractC1453e2.m4586c(c1448d.f6026b != 0);
                while (iM4960l2 < i14) {
                    int iM4958j13 = AbstractC1559z2.m4958j(bArr, iM4960l2, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return iM4960l2;
                    }
                    iM4960l2 = AbstractC1559z2.m4960l(bArr, iM4958j13, c1448d);
                    abstractC1453e2.m4586c(c1448d.f6026b != 0);
                }
                return iM4960l2;
            case 26:
                if (i17 != 2) {
                    return i13;
                }
                if ((j7 & 536870912) == 0) {
                    int iM4958j14 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                    int i48 = c1448d.f6025a;
                    if (i48 < 0) {
                        throw InvalidProtocolBufferException.m4559b();
                    }
                    if (i48 == 0) {
                        interfaceC1544w0.add("");
                    } else {
                        interfaceC1544w0.add(new String(bArr, iM4958j14, i48, AbstractC1549x0.f6150a));
                        iM4958j14 += i48;
                    }
                    while (iM4958j14 < i14) {
                        int iM4958j15 = AbstractC1559z2.m4958j(bArr, iM4958j14, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM4958j14;
                        }
                        iM4958j14 = AbstractC1559z2.m4958j(bArr, iM4958j15, c1448d);
                        int i49 = c1448d.f6025a;
                        if (i49 < 0) {
                            throw InvalidProtocolBufferException.m4559b();
                        }
                        if (i49 == 0) {
                            interfaceC1544w0.add("");
                        } else {
                            interfaceC1544w0.add(new String(bArr, iM4958j14, i49, AbstractC1549x0.f6150a));
                            iM4958j14 += i49;
                        }
                    }
                    return iM4958j14;
                }
                int iM4958j16 = AbstractC1559z2.m4958j(bArr, i13, c1448d);
                int i54 = c1448d.f6025a;
                if (i54 < 0) {
                    throw InvalidProtocolBufferException.m4559b();
                }
                if (i54 == 0) {
                    interfaceC1544w0.add("");
                } else {
                    int i55 = iM4958j16 + i54;
                    if (!AbstractC1517q3.f6107a.m4967r(bArr, iM4958j16, i55)) {
                        throw InvalidProtocolBufferException.m4558a();
                    }
                    interfaceC1544w0.add(new String(bArr, iM4958j16, i54, AbstractC1549x0.f6150a));
                    iM4958j16 = i55;
                }
                while (iM4958j16 < i14) {
                    int iM4958j17 = AbstractC1559z2.m4958j(bArr, iM4958j16, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return iM4958j16;
                    }
                    iM4958j16 = AbstractC1559z2.m4958j(bArr, iM4958j17, c1448d);
                    int i56 = c1448d.f6025a;
                    if (i56 < 0) {
                        throw InvalidProtocolBufferException.m4559b();
                    }
                    if (i56 == 0) {
                        interfaceC1544w0.add("");
                    } else {
                        int i57 = iM4958j16 + i56;
                        if (!AbstractC1517q3.f6107a.m4967r(bArr, iM4958j16, i57)) {
                            throw InvalidProtocolBufferException.m4558a();
                        }
                        interfaceC1544w0.add(new String(bArr, iM4958j16, i56, AbstractC1549x0.f6150a));
                        iM4958j16 = i57;
                    }
                }
                return iM4958j16;
            case 27:
                i24 = i13;
                if (i17 == 2) {
                    return AbstractC1559z2.m4953d(m4776o(i18), i15, bArr, i24, i14, interfaceC1544w0, c1448d);
                }
                return i24;
            case 28:
                i24 = i13;
                if (i17 == 2) {
                    int iM4958j18 = AbstractC1559z2.m4958j(bArr, i24, c1448d);
                    int i58 = c1448d.f6025a;
                    if (i58 < 0) {
                        throw InvalidProtocolBufferException.m4559b();
                    }
                    if (i58 > bArr.length - iM4958j18) {
                        throw InvalidProtocolBufferException.m4561d();
                    }
                    if (i58 == 0) {
                        interfaceC1544w0.add(C1468h.f6044y);
                    } else {
                        interfaceC1544w0.add(C1468h.m4631d(bArr, iM4958j18, i58));
                        iM4958j18 += i58;
                    }
                    while (iM4958j18 < i14) {
                        int iM4958j19 = AbstractC1559z2.m4958j(bArr, iM4958j18, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM4958j18;
                        }
                        iM4958j18 = AbstractC1559z2.m4958j(bArr, iM4958j19, c1448d);
                        int i59 = c1448d.f6025a;
                        if (i59 < 0) {
                            throw InvalidProtocolBufferException.m4559b();
                        }
                        if (i59 > bArr.length - iM4958j18) {
                            throw InvalidProtocolBufferException.m4561d();
                        }
                        if (i59 == 0) {
                            interfaceC1544w0.add(C1468h.f6044y);
                        } else {
                            interfaceC1544w0.add(C1468h.m4631d(bArr, iM4958j18, i59));
                            iM4958j18 += i59;
                        }
                    }
                    return iM4958j18;
                }
                return i24;
            case 30:
            case 44:
                i25 = i13;
                if (i17 != 2) {
                    if (i17 == 0) {
                        iM4959k = AbstractC1559z2.m4959k(i15, bArr, i25, i14, interfaceC1544w0, c1448d);
                    }
                    return i25;
                }
                AbstractC1539v0 abstractC1539v3 = (AbstractC1539v0) interfaceC1544w0;
                iM4959k = AbstractC1559z2.m4958j(bArr, i25, c1448d);
                int i64 = c1448d.f6025a + iM4959k;
                while (iM4959k < i64) {
                    iM4959k = AbstractC1559z2.m4958j(bArr, iM4959k, c1448d);
                    abstractC1539v3.m4875c(c1448d.f6025a);
                }
                if (iM4959k != i64) {
                    throw InvalidProtocolBufferException.m4561d();
                }
                C1530t1 c1530t1M4774m = m4774m(i18);
                Class cls = AbstractC1541v2.f6122a;
                if (c1530t1M4774m != null) {
                    C1457e3 c1457e3 = C1457e3.f6031f;
                    EnumC1535u1 enumC1535u3 = EnumC1535u1.ACCESS_TYPE_UNKNOWN;
                    EnumC1535u1 enumC1535u4 = EnumC1535u1.ACCESS_TYPE_READ;
                    EnumC1535u1 enumC1535u5 = EnumC1535u1.ACCESS_TYPE_WRITE;
                    AbstractC1452d3 abstractC1452d3 = this.f6096l;
                    if (interfaceC1544w0 != null) {
                        int size2 = interfaceC1544w0.size();
                        int i65 = 0;
                        C1457e3 c1457e4 = null;
                        while (i27 < size2) {
                            Integer num = (Integer) interfaceC1544w0.get(i27);
                            char c7 = c3;
                            int iIntValue = num.intValue();
                            if (iIntValue == 0) {
                                enumC1535u2 = enumC1535u3;
                            } else if (iIntValue != i28) {
                                enumC1535u2 = iIntValue != i26 ? null : enumC1535u5;
                            } else {
                                enumC1535u2 = enumC1535u4;
                            }
                            if (enumC1535u2 != null) {
                                if (i27 != i65) {
                                    interfaceC1544w0.set(i65, num);
                                }
                                i65++;
                            } else {
                                if (c1457e4 == null) {
                                    ((C1462f3) abstractC1452d3).getClass();
                                    AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) obj;
                                    C1457e3 c1457e3M4602c = abstractC1534u0.unknownFields;
                                    if (c1457e3M4602c == c1457e3) {
                                        c1457e3M4602c = C1457e3.m4602c();
                                        abstractC1534u0.unknownFields = c1457e3M4602c;
                                    }
                                    c1457e4 = c1457e3M4602c;
                                }
                                C1457e3 c1457e5 = c1457e4;
                                ((C1462f3) abstractC1452d3).getClass();
                                c1457e5.m4605d(i16 << 3, Long.valueOf(iIntValue));
                                c1457e4 = c1457e5;
                            }
                            i27++;
                            c3 = c7;
                            i26 = 2;
                            i28 = 1;
                        }
                        if (i65 != size2) {
                            interfaceC1544w0.subList(i65, size2).clear();
                            return iM4959k;
                        }
                    } else {
                        Iterator it = interfaceC1544w0.iterator();
                        C1457e3 c1457e6 = null;
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (iIntValue2 == 0) {
                                enumC1535u1 = enumC1535u3;
                            } else if (iIntValue2 != 1) {
                                enumC1535u1 = iIntValue2 != 2 ? null : enumC1535u5;
                            } else {
                                enumC1535u1 = enumC1535u4;
                            }
                            if (enumC1535u1 == null) {
                                if (c1457e6 == null) {
                                    ((C1462f3) abstractC1452d3).getClass();
                                    AbstractC1534u0 abstractC1534u1 = (AbstractC1534u0) obj;
                                    C1457e3 c1457e3M4602c2 = abstractC1534u1.unknownFields;
                                    if (c1457e3M4602c2 == c1457e3) {
                                        c1457e3M4602c2 = C1457e3.m4602c();
                                        abstractC1534u1.unknownFields = c1457e3M4602c2;
                                    }
                                    c1457e6 = c1457e3M4602c2;
                                }
                                ((C1462f3) abstractC1452d3).getClass();
                                c1457e6.m4605d(i16 << 3, Long.valueOf(iIntValue2));
                                it.remove();
                            }
                        }
                    }
                }
                return iM4959k;
            case 33:
            case 47:
                i25 = i13;
                if (i17 == 2) {
                    AbstractC1539v0 abstractC1539v4 = (AbstractC1539v0) interfaceC1544w0;
                    int iM4958j20 = AbstractC1559z2.m4958j(bArr, i25, c1448d);
                    int i66 = c1448d.f6025a + iM4958j20;
                    while (iM4958j20 < i66) {
                        iM4958j20 = AbstractC1559z2.m4958j(bArr, iM4958j20, c1448d);
                        abstractC1539v4.m4875c(AbstractC1559z2.m4961m(c1448d.f6025a));
                    }
                    if (iM4958j20 == i66) {
                        return iM4958j20;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 == 0) {
                    AbstractC1539v0 abstractC1539v5 = (AbstractC1539v0) interfaceC1544w0;
                    int iM4958j21 = AbstractC1559z2.m4958j(bArr, i25, c1448d);
                    abstractC1539v5.m4875c(AbstractC1559z2.m4961m(c1448d.f6025a));
                    while (iM4958j21 < i14) {
                        int iM4958j22 = AbstractC1559z2.m4958j(bArr, iM4958j21, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM4958j21;
                        }
                        iM4958j21 = AbstractC1559z2.m4958j(bArr, iM4958j22, c1448d);
                        abstractC1539v5.m4875c(AbstractC1559z2.m4961m(c1448d.f6025a));
                    }
                    return iM4958j21;
                }
                return i25;
            case 34:
            case 48:
                i25 = i13;
                if (i17 == 2) {
                    AbstractC1455e1 abstractC1455e5 = (AbstractC1455e1) interfaceC1544w0;
                    int iM4958j23 = AbstractC1559z2.m4958j(bArr, i25, c1448d);
                    int i67 = c1448d.f6025a + iM4958j23;
                    while (iM4958j23 < i67) {
                        iM4958j23 = AbstractC1559z2.m4960l(bArr, iM4958j23, c1448d);
                        abstractC1455e5.m4594c(AbstractC1559z2.m4962n(c1448d.f6026b));
                    }
                    if (iM4958j23 == i67) {
                        return iM4958j23;
                    }
                    throw InvalidProtocolBufferException.m4561d();
                }
                if (i17 == 0) {
                    AbstractC1455e1 abstractC1455e6 = (AbstractC1455e1) interfaceC1544w0;
                    int iM4960l3 = AbstractC1559z2.m4960l(bArr, i25, c1448d);
                    abstractC1455e6.m4594c(AbstractC1559z2.m4962n(c1448d.f6026b));
                    while (iM4960l3 < i14) {
                        int iM4958j24 = AbstractC1559z2.m4958j(bArr, iM4960l3, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM4960l3;
                        }
                        iM4960l3 = AbstractC1559z2.m4960l(bArr, iM4958j24, c1448d);
                        abstractC1455e6.m4594c(AbstractC1559z2.m4962n(c1448d.f6026b));
                    }
                    return iM4960l3;
                }
                return i25;
            case 49:
                if (i17 == 3) {
                    InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i18);
                    int i68 = (i15 & (-8)) | 4;
                    AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4776o.mo4767d();
                    C1505o1 c1505o1 = (C1505o1) interfaceC1536u2M4776o;
                    int iM4754G = c1505o1.m4754G(abstractC1534u0Mo4767d, bArr, i13, i14, i68, c1448d);
                    c1448d.f6027c = abstractC1534u0Mo4767d;
                    interfaceC1536u2M4776o.mo4765b(abstractC1534u0Mo4767d);
                    c1448d.f6027c = abstractC1534u0Mo4767d;
                    interfaceC1544w0.add(abstractC1534u0Mo4767d);
                    while (iM4754G < i14) {
                        int iM4958j25 = AbstractC1559z2.m4958j(bArr, iM4754G, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM4754G;
                        }
                        AbstractC1534u0 abstractC1534u0Mo4767d2 = interfaceC1536u2M4776o.mo4767d();
                        iM4754G = c1505o1.m4754G(abstractC1534u0Mo4767d2, bArr, iM4958j25, i14, i68, c1448d);
                        c1448d.f6027c = abstractC1534u0Mo4767d2;
                        interfaceC1536u2M4776o.mo4765b(abstractC1534u0Mo4767d2);
                        c1448d.f6027c = abstractC1534u0Mo4767d2;
                        interfaceC1544w0.add(abstractC1534u0Mo4767d2);
                    }
                    return iM4754G;
                }
            default:
                return i13;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4757K(int i13, Object obj) {
        int i14 = this.f6085a[i13 + 2];
        long j7 = 1048575 & i14;
        if (j7 == 1048575) {
            return;
        }
        AbstractC1502n3.m4732n(j7, obj, (1 << (i14 >>> 20)) | AbstractC1502n3.f6075c.m4709g(j7, obj));
    }

    /* JADX INFO: renamed from: L */
    public final int m4758L(int i13, int i14) {
        int[] iArr = this.f6085a;
        int length = (iArr.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = iArr[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m4759M(int i13, Object obj, Object obj2) {
        f6084o.putObject(obj, m4761P(i13) & 1048575, obj2);
        m4757K(i13, obj);
    }

    /* JADX INFO: renamed from: N */
    public final void m4760N(Object obj, int i13, Object obj2, int i14) {
        f6084o.putObject(obj, m4761P(i14) & 1048575, obj2);
        AbstractC1502n3.m4732n(this.f6085a[i14 + 2] & 1048575, obj, i13);
    }

    /* JADX INFO: renamed from: P */
    public final int m4761P(int i13) {
        return this.f6085a[i13 + 1];
    }

    /* JADX INFO: renamed from: Q */
    public final void m4762Q(Object obj, C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f6085a;
        int length = iArr.length;
        Unsafe unsafe = f6084o;
        int i16 = 1048575;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18 = i15 + 3) {
            int iM4761P = m4761P(i18);
            int i19 = iArr[i18];
            int iM4745O = m4745O(iM4761P);
            if (iM4745O <= 17) {
                int i24 = iArr[i18 + 2];
                i13 = 1048575;
                int i25 = i24 & 1048575;
                if (i25 != i16) {
                    i17 = unsafe.getInt(obj, i25);
                    i16 = i25;
                }
                i14 = 1 << (i24 >>> 20);
            } else {
                i13 = 1048575;
                i14 = 0;
            }
            int i26 = i18;
            long j7 = iM4761P & i13;
            switch (iM4745O) {
                case 0:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        double dMo4688e = AbstractC1502n3.f6075c.mo4688e(j7, obj);
                        C1483k c1483k = (C1483k) c1465g1.f6042a;
                        c1483k.getClass();
                        c1483k.m4669K(i19, Double.doubleToRawLongBits(dMo4688e));
                        continue;
                    }
                    break;
                case 1:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        float fMo4689f = AbstractC1502n3.f6075c.mo4689f(j7, obj);
                        C1483k c1483k2 = (C1483k) c1465g1.f6042a;
                        c1483k2.getClass();
                        c1483k2.m4667I(i19, Float.floatToRawIntBits(fMo4689f));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        int i27 = unsafe.getInt(obj, j7);
                        C1483k c1483k3 = (C1483k) c1465g1.f6042a;
                        c1483k3.m4673O(i19, 0);
                        c1483k3.m4671M(i27);
                    }
                    break;
                case 5:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4669K(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 6:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4667I(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 7:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        boolean zMo4686c = AbstractC1502n3.f6075c.mo4686c(j7, obj);
                        C1483k c1483k4 = (C1483k) c1465g1.f6042a;
                        c1483k4.m4673O(i19, 0);
                        c1483k4.m4664F(zMo4686c ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        m4746S(i19, unsafe.getObject(obj, j7), c1465g1);
                    }
                    break;
                case 9:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        c1465g1.m4626c(i19, unsafe.getObject(obj, j7), m4776o(i15));
                    }
                    break;
                case 10:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        c1465g1.m4624a(i19, (C1468h) unsafe.getObject(obj, j7));
                    }
                    break;
                case 11:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        int i28 = unsafe.getInt(obj, j7);
                        C1483k c1483k5 = (C1483k) c1465g1.f6042a;
                        c1483k5.m4673O(i19, 0);
                        c1483k5.m4674P(i28);
                    }
                    break;
                case 12:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        int i29 = unsafe.getInt(obj, j7);
                        C1483k c1483k6 = (C1483k) c1465g1.f6042a;
                        c1483k6.m4673O(i19, 0);
                        c1483k6.m4671M(i29);
                    }
                    break;
                case 13:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4667I(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 14:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        ((C1483k) c1465g1.f6042a).m4669K(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 15:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        int i34 = unsafe.getInt(obj, j7);
                        C1483k c1483k7 = (C1483k) c1465g1.f6042a;
                        c1483k7.m4673O(i19, 0);
                        c1483k7.m4674P((i34 >> 31) ^ (i34 << 1));
                    }
                    break;
                case 16:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        long j13 = unsafe.getLong(obj, j7);
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, (j13 << 1) ^ (j13 >> 63));
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    i15 = i26;
                    if ((i14 & i17) != 0) {
                        c1465g1.m4625b(i19, unsafe.getObject(obj, j7), m4776o(i15));
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    i15 = i26;
                    AbstractC1541v2.m4877A(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i15 = i26;
                    AbstractC1541v2.m4881E(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 20:
                    i15 = i26;
                    AbstractC1541v2.m4884H(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 21:
                    i15 = i26;
                    AbstractC1541v2.m4892P(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    i15 = i26;
                    AbstractC1541v2.m4883G(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    i15 = i26;
                    AbstractC1541v2.m4880D(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 24:
                    i15 = i26;
                    AbstractC1541v2.m4879C(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 25:
                    i15 = i26;
                    AbstractC1541v2.m4917y(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 26:
                    i15 = i26;
                    AbstractC1541v2.m4890N(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1);
                    break;
                case 27:
                    i15 = i26;
                    AbstractC1541v2.m4885I(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, m4776o(i15));
                    break;
                case 28:
                    i15 = i26;
                    AbstractC1541v2.m4918z(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1);
                    break;
                case 29:
                    i15 = i26;
                    AbstractC1541v2.m4891O(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    break;
                case 30:
                    i15 = i26;
                    AbstractC1541v2.m4878B(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 31:
                    i15 = i26;
                    AbstractC1541v2.m4886J(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 32:
                    i15 = i26;
                    AbstractC1541v2.m4887K(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 33:
                    i15 = i26;
                    AbstractC1541v2.m4888L(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 34:
                    i15 = i26;
                    AbstractC1541v2.m4889M(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, false);
                    continue;
                    break;
                case 35:
                    i15 = i26;
                    AbstractC1541v2.m4877A(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 36:
                    i15 = i26;
                    AbstractC1541v2.m4881E(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 37:
                    i15 = i26;
                    AbstractC1541v2.m4884H(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 38:
                    i15 = i26;
                    AbstractC1541v2.m4892P(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 39:
                    i15 = i26;
                    AbstractC1541v2.m4883G(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 40:
                    i15 = i26;
                    AbstractC1541v2.m4880D(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 41:
                    i15 = i26;
                    AbstractC1541v2.m4879C(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 42:
                    i15 = i26;
                    AbstractC1541v2.m4917y(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 43:
                    i15 = i26;
                    AbstractC1541v2.m4891O(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 44:
                    i15 = i26;
                    AbstractC1541v2.m4878B(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 45:
                    i15 = i26;
                    AbstractC1541v2.m4886J(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 46:
                    i15 = i26;
                    AbstractC1541v2.m4887K(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 47:
                    i15 = i26;
                    AbstractC1541v2.m4888L(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 48:
                    i15 = i26;
                    AbstractC1541v2.m4889M(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, true);
                    break;
                case 49:
                    i15 = i26;
                    AbstractC1541v2.m4882F(iArr[i15], (List) unsafe.getObject(obj, j7), c1465g1, m4776o(i15));
                    break;
                case 50:
                    i15 = i26;
                    m4763R(c1465g1, i19, unsafe.getObject(obj, j7), i15);
                    break;
                case 51:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        double dDoubleValue = ((Double) AbstractC1502n3.f6075c.m4711i(j7, obj)).doubleValue();
                        C1483k c1483k8 = (C1483k) c1465g1.f6042a;
                        c1483k8.getClass();
                        c1483k8.m4669K(i19, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        float fFloatValue = ((Float) AbstractC1502n3.f6075c.m4711i(j7, obj)).floatValue();
                        C1483k c1483k9 = (C1483k) c1465g1.f6042a;
                        c1483k9.getClass();
                        c1483k9.m4667I(i19, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, m4743D(j7, obj));
                    }
                    break;
                case 54:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, m4743D(j7, obj));
                    }
                    break;
                case 55:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        int iM4742C = m4742C(j7, obj);
                        C1483k c1483k10 = (C1483k) c1465g1.f6042a;
                        c1483k10.m4673O(i19, 0);
                        c1483k10.m4671M(iM4742C);
                    }
                    break;
                case 56:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4669K(i19, m4743D(j7, obj));
                    }
                    break;
                case 57:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4667I(i19, m4742C(j7, obj));
                    }
                    break;
                case 58:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        boolean zBooleanValue = ((Boolean) AbstractC1502n3.f6075c.m4711i(j7, obj)).booleanValue();
                        C1483k c1483k11 = (C1483k) c1465g1.f6042a;
                        c1483k11.m4673O(i19, 0);
                        c1483k11.m4664F(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        m4746S(i19, unsafe.getObject(obj, j7), c1465g1);
                    }
                    break;
                case 60:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        c1465g1.m4626c(i19, unsafe.getObject(obj, j7), m4776o(i15));
                    }
                    break;
                case 61:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        c1465g1.m4624a(i19, (C1468h) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        int iM4742C2 = m4742C(j7, obj);
                        C1483k c1483k12 = (C1483k) c1465g1.f6042a;
                        c1483k12.m4673O(i19, 0);
                        c1483k12.m4674P(iM4742C2);
                    }
                    break;
                case 63:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        int iM4742C3 = m4742C(j7, obj);
                        C1483k c1483k13 = (C1483k) c1465g1.f6042a;
                        c1483k13.m4673O(i19, 0);
                        c1483k13.m4671M(iM4742C3);
                    }
                    break;
                case 64:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4667I(i19, m4742C(j7, obj));
                    }
                    break;
                case 65:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        ((C1483k) c1465g1.f6042a).m4669K(i19, m4743D(j7, obj));
                    }
                    break;
                case 66:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        int iM4742C4 = m4742C(j7, obj);
                        C1483k c1483k14 = (C1483k) c1465g1.f6042a;
                        c1483k14.m4673O(i19, 0);
                        c1483k14.m4674P((iM4742C4 >> 31) ^ (iM4742C4 << 1));
                    }
                    break;
                case 67:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        long jM4743D = m4743D(j7, obj);
                        ((C1483k) c1465g1.f6042a).m4675Q(i19, (jM4743D << 1) ^ (jM4743D >> 63));
                    }
                    break;
                case 68:
                    i15 = i26;
                    if (m4780u(i19, i15, obj)) {
                        c1465g1.m4625b(i19, unsafe.getObject(obj, j7), m4776o(i15));
                    }
                    break;
                default:
                    i15 = i26;
                    break;
            }
        }
        ((C1462f3) this.f6096l).getClass();
        ((AbstractC1534u0) obj).unknownFields.m4606e(c1465g1);
    }

    /* JADX INFO: renamed from: R */
    public final void m4763R(C1465g1 c1465g1, int i13, Object obj, int i14) throws CodedOutputStream$OutOfSpaceException {
        if (obj != null) {
            Object objM4775n = m4775n(i14);
            C1485k1 c1485k1 = this.f6097m;
            c1485k1.getClass();
            C1470h1 c1470h1 = ((C1475i1) objM4775n).f6052a;
            c1485k1.getClass();
            C1483k c1483k = (C1483k) c1465g1.f6042a;
            c1483k.getClass();
            for (Map.Entry entry : ((C1480j1) obj).entrySet()) {
                c1483k.m4673O(i13, 2);
                c1483k.m4674P(C1475i1.m4633a(c1470h1, entry.getKey(), entry.getValue()));
                C1475i1.m4634b(c1483k, c1470h1, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: a */
    public final void mo4764a(Object obj, Object obj2) {
        Object obj3;
        m4747k(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f6085a;
            if (i13 >= iArr.length) {
                AbstractC1541v2.m4915w(this.f6096l, obj, obj2);
                return;
            }
            int iM4761P = m4761P(i13);
            long j7 = iM4761P & 1048575;
            int i14 = iArr[i13];
            switch (m4745O(iM4761P)) {
                case 0:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m3 = AbstractC1502n3.f6075c;
                        abstractC1497m3.mo4692m(obj3, j7, abstractC1497m3.mo4688e(j7, obj2));
                        m4757K(i13, obj3);
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m4 = AbstractC1502n3.f6075c;
                        abstractC1497m4.mo4693n(obj3, j7, abstractC1497m4.mo4689f(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m5 = AbstractC1502n3.f6075c;
                        abstractC1497m5.m4714p(obj3, j7, abstractC1497m5.m4710h(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m6 = AbstractC1502n3.f6075c;
                        abstractC1497m6.m4714p(obj3, j7, abstractC1497m6.m4710h(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m7 = AbstractC1502n3.f6075c;
                        abstractC1497m7.m4714p(obj3, j7, abstractC1497m7.m4710h(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m8 = AbstractC1502n3.f6075c;
                        abstractC1497m8.mo4690k(obj3, j7, abstractC1497m8.mo4686c(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4733o(j7, obj3, AbstractC1502n3.f6075c.m4711i(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    m4781w(i13, obj3, obj2);
                    continue;
                    i13 += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4733o(j7, obj3, AbstractC1502n3.f6075c.m4711i(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m9 = AbstractC1502n3.f6075c;
                        abstractC1497m9.m4714p(obj3, j7, abstractC1497m9.m4710h(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (m4779s(i13, obj2)) {
                        AbstractC1502n3.m4732n(j7, obj3, AbstractC1502n3.f6075c.m4709g(j7, obj2));
                        m4757K(i13, obj3);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m4779s(i13, obj2)) {
                        AbstractC1497m3 abstractC1497m10 = AbstractC1502n3.f6075c;
                        obj3 = obj;
                        abstractC1497m10.m4714p(obj3, j7, abstractC1497m10.m4710h(j7, obj2));
                        m4757K(i13, obj3);
                    }
                    i13 += 3;
                    obj = obj3;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m4781w(i13, obj, obj2);
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f6095k.mo4577b(j7, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC1541v2.f6122a;
                    AbstractC1497m3 abstractC1497m11 = AbstractC1502n3.f6075c;
                    Object objM4711i = abstractC1497m11.m4711i(j7, obj);
                    Object objM4711i2 = abstractC1497m11.m4711i(j7, obj2);
                    this.f6097m.getClass();
                    AbstractC1502n3.m4733o(j7, obj, C1485k1.m4678b(objM4711i, objM4711i2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m4780u(i14, i13, obj2)) {
                        AbstractC1502n3.m4733o(j7, obj, AbstractC1502n3.f6075c.m4711i(j7, obj2));
                        AbstractC1502n3.m4732n(iArr[i13 + 2] & 1048575, obj, i14);
                    }
                    break;
                case 60:
                    m4782x(i13, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m4780u(i14, i13, obj2)) {
                        AbstractC1502n3.m4733o(j7, obj, AbstractC1502n3.f6075c.m4711i(j7, obj2));
                        AbstractC1502n3.m4732n(iArr[i13 + 2] & 1048575, obj, i14);
                    }
                    break;
                case 68:
                    m4782x(i13, obj, obj2);
                    break;
            }
            obj3 = obj;
            i13 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[SYNTHETIC] */
    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: b */
    public final void mo4765b(Object obj) {
        if (m4750t(obj)) {
            if (obj instanceof AbstractC1534u0) {
                AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) obj;
                abstractC1534u0.m4874o(Integer.MAX_VALUE);
                abstractC1534u0.memoizedHashCode = 0;
                abstractC1534u0.m4872j();
            }
            int length = this.f6085a.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iM4761P = m4761P(i13);
                long j7 = 1048575 & iM4761P;
                int iM4745O = m4745O(iM4761P);
                if (iM4745O != 9) {
                    switch (iM4745O) {
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            if (m4779s(i13, obj)) {
                                m4776o(i13).mo4765b(f6084o.getObject(obj, j7));
                            }
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f6095k.mo4576a(j7, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f6084o;
                            Object object = unsafe.getObject(obj, j7);
                            if (object != null) {
                                this.f6097m.getClass();
                                ((C1480j1) object).f6055w = false;
                                unsafe.putObject(obj, j7, object);
                            }
                            break;
                    }
                } else if (m4779s(i13, obj)) {
                    m4776o(i13).mo4765b(f6084o.getObject(obj, j7));
                }
            }
            ((C1462f3) this.f6096l).getClass();
            ((AbstractC1534u0) obj).unknownFields.f6036e = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x011f A[SYNTHETIC] */
    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: c */
    public final boolean mo4766c(Object obj) {
        int iM4745O;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            boolean zM4779s = true;
            if (i14 >= this.f6092h) {
                return true;
            }
            int i16 = this.f6091g[i14];
            int[] iArr = this.f6085a;
            int i17 = iArr[i16];
            int iM4761P = m4761P(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i24 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i15 = f6084o.getInt(obj, i19);
                }
                i13 = i19;
            }
            if ((268435456 & iM4761P) == 0) {
                iM4745O = m4745O(iM4761P);
                if (iM4745O != 9 || iM4745O == 17) {
                    if (i13 == 1048575) {
                        zM4779s = m4779s(i16, obj);
                    } else if ((i24 & i15) == 0) {
                        zM4779s = false;
                    }
                    if (zM4779s) {
                        continue;
                    } else if (!m4776o(i16).mo4766c(AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj))) {
                    }
                    i14++;
                } else {
                    if (iM4745O != 27) {
                        if (iM4745O == 60 || iM4745O == 68) {
                            if (!m4780u(i17, i16, obj)) {
                                continue;
                            } else if (!m4776o(i16).mo4766c(AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj))) {
                            }
                            i14++;
                        } else if (iM4745O != 49) {
                            if (iM4745O != 50) {
                                continue;
                            } else {
                                Object objM4711i = AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj);
                                this.f6097m.getClass();
                                C1480j1 c1480j1 = (C1480j1) objM4711i;
                                if (!c1480j1.isEmpty() && ((C1475i1) m4775n(i16)).f6052a.f6049b.f6130w == EnumC1547w3.MESSAGE) {
                                    InterfaceC1536u2 interfaceC1536u2M4946a = null;
                                    for (Object obj2 : c1480j1.values()) {
                                        if (interfaceC1536u2M4946a == null) {
                                            interfaceC1536u2M4946a = C1554y1.f6164c.m4946a(obj2.getClass());
                                        }
                                        if (!interfaceC1536u2M4946a.mo4766c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i14++;
                        }
                    }
                    List list = (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i16);
                        for (int i25 = 0; i25 < list.size(); i25++) {
                            if (interfaceC1536u2M4776o.mo4766c(list.get(i25))) {
                            }
                        }
                    }
                    i14++;
                }
            } else {
                if (i13 == 1048575 ? m4779s(i16, obj) : (i15 & i24) != 0) {
                    iM4745O = m4745O(iM4761P);
                    if (iM4745O != 9) {
                    }
                    if (i13 == 1048575) {
                        zM4779s = m4779s(i16, obj);
                    } else if ((i24 & i15) == 0) {
                        zM4779s = false;
                    }
                    if (zM4779s) {
                        continue;
                    } else if (!m4776o(i16).mo4766c(AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj))) {
                    }
                    i14++;
                }
            }
            return false;
        }
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: d */
    public final AbstractC1534u0 mo4767d() {
        this.f6094j.getClass();
        return ((AbstractC1534u0) this.f6089e).m4873l();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: e */
    public final void mo4768e(Object obj, byte[] bArr, int i13, int i14, C1448d c1448d) throws InvalidProtocolBufferException {
        if (this.f6090f) {
            m4755H(obj, bArr, i13, i14, c1448d);
        } else {
            m4754G(obj, bArr, i13, i14, 0, c1448d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: f */
    public final int mo4769f(AbstractC1534u0 abstractC1534u0) {
        int i13;
        int iM4935a;
        int i14;
        int[] iArr = this.f6085a;
        int length = iArr.length;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 += 3) {
            int iM4761P = m4761P(i16);
            int i17 = iArr[i16];
            long j7 = 1048575 & iM4761P;
            int i18 = 1237;
            int iHashCode = 37;
            switch (m4745O(iM4761P)) {
                case 0:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(Double.doubleToLongBits(AbstractC1502n3.f6075c.mo4688e(j7, abstractC1534u0)));
                    i15 = iM4935a + i13;
                    break;
                case 1:
                    i13 = i15 * 53;
                    iM4935a = Float.floatToIntBits(AbstractC1502n3.f6075c.mo4689f(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case 2:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case 3:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case 4:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 5:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case 6:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 7:
                    i14 = i15 * 53;
                    boolean zMo4686c = AbstractC1502n3.f6075c.mo4686c(j7, abstractC1534u0);
                    Charset charset = AbstractC1549x0.f6150a;
                    if (zMo4686c) {
                        i18 = 1231;
                    }
                    i15 = i18 + i14;
                    break;
                case 8:
                    i13 = i15 * 53;
                    iM4935a = ((String) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0)).hashCode();
                    i15 = iM4935a + i13;
                    break;
                case 9:
                    Object objM4711i = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                    if (objM4711i != null) {
                        iHashCode = objM4711i.hashCode();
                    }
                    i15 = (i15 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                    i15 = iM4935a + i13;
                    break;
                case 11:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 12:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 13:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 14:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case 15:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                    i15 = iM4935a + i13;
                    break;
                case 16:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1549x0.m4935a(AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0));
                    i15 = iM4935a + i13;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    Object objM4711i2 = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                    if (objM4711i2 != null) {
                        iHashCode = objM4711i2.hashCode();
                    }
                    i15 = (i15 * 53) + iHashCode;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                    i15 = iM4935a + i13;
                    break;
                case 50:
                    i13 = i15 * 53;
                    iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                    i15 = iM4935a + i13;
                    break;
                case 51:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(Double.doubleToLongBits(((Double) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0)).doubleValue()));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 52:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = Float.floatToIntBits(((Float) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0)).floatValue());
                        i15 = iM4935a + i13;
                    }
                    break;
                case 53:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(m4743D(j7, abstractC1534u0));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 54:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(m4743D(j7, abstractC1534u0));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 55:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 56:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(m4743D(j7, abstractC1534u0));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 57:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 58:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i14 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0)).booleanValue();
                        Charset charset2 = AbstractC1549x0.f6150a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i14;
                    }
                    break;
                case 59:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = ((String) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0)).hashCode();
                        i15 = iM4935a + i13;
                    }
                    break;
                case 60:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                        i15 = iM4935a + i13;
                    }
                    break;
                case 61:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                        i15 = iM4935a + i13;
                    }
                    break;
                case 62:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 63:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 64:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 65:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(m4743D(j7, abstractC1534u0));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 66:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = m4742C(j7, abstractC1534u0);
                        i15 = iM4935a + i13;
                    }
                    break;
                case 67:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1549x0.m4935a(m4743D(j7, abstractC1534u0));
                        i15 = iM4935a + i13;
                    }
                    break;
                case 68:
                    if (m4780u(i17, i16, abstractC1534u0)) {
                        i13 = i15 * 53;
                        iM4935a = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0).hashCode();
                        i15 = iM4935a + i13;
                    }
                    break;
            }
        }
        ((C1462f3) this.f6096l).getClass();
        return abstractC1534u0.unknownFields.hashCode() + (i15 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: g */
    public final boolean mo4770g(AbstractC1534u0 abstractC1534u0, AbstractC1534u0 abstractC1534u1) {
        int[] iArr = this.f6085a;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            boolean zM4916x = true;
            if (i13 < length) {
                int iM4761P = m4761P(i13);
                long j7 = iM4761P & 1048575;
                switch (m4745O(iM4761P)) {
                    case 0:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m3 = AbstractC1502n3.f6075c;
                            if (Double.doubleToLongBits(abstractC1497m3.mo4688e(j7, abstractC1534u0)) != Double.doubleToLongBits(abstractC1497m3.mo4688e(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m4 = AbstractC1502n3.f6075c;
                            if (Float.floatToIntBits(abstractC1497m4.mo4689f(j7, abstractC1534u0)) != Float.floatToIntBits(abstractC1497m4.mo4689f(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m5 = AbstractC1502n3.f6075c;
                            if (abstractC1497m5.m4710h(j7, abstractC1534u0) != abstractC1497m5.m4710h(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m6 = AbstractC1502n3.f6075c;
                            if (abstractC1497m6.m4710h(j7, abstractC1534u0) != abstractC1497m6.m4710h(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m7 = AbstractC1502n3.f6075c;
                            if (abstractC1497m7.m4709g(j7, abstractC1534u0) != abstractC1497m7.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m8 = AbstractC1502n3.f6075c;
                            if (abstractC1497m8.m4710h(j7, abstractC1534u0) != abstractC1497m8.m4710h(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m9 = AbstractC1502n3.f6075c;
                            if (abstractC1497m9.m4709g(j7, abstractC1534u0) != abstractC1497m9.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m10 = AbstractC1502n3.f6075c;
                            if (abstractC1497m10.mo4686c(j7, abstractC1534u0) != abstractC1497m10.mo4686c(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m11 = AbstractC1502n3.f6075c;
                            if (!AbstractC1541v2.m4916x(abstractC1497m11.m4711i(j7, abstractC1534u0), abstractC1497m11.m4711i(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m12 = AbstractC1502n3.f6075c;
                            if (!AbstractC1541v2.m4916x(abstractC1497m12.m4711i(j7, abstractC1534u0), abstractC1497m12.m4711i(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m13 = AbstractC1502n3.f6075c;
                            if (!AbstractC1541v2.m4916x(abstractC1497m13.m4711i(j7, abstractC1534u0), abstractC1497m13.m4711i(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m14 = AbstractC1502n3.f6075c;
                            if (abstractC1497m14.m4709g(j7, abstractC1534u0) != abstractC1497m14.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m15 = AbstractC1502n3.f6075c;
                            if (abstractC1497m15.m4709g(j7, abstractC1534u0) != abstractC1497m15.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m16 = AbstractC1502n3.f6075c;
                            if (abstractC1497m16.m4709g(j7, abstractC1534u0) != abstractC1497m16.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m17 = AbstractC1502n3.f6075c;
                            if (abstractC1497m17.m4710h(j7, abstractC1534u0) != abstractC1497m17.m4710h(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m18 = AbstractC1502n3.f6075c;
                            if (abstractC1497m18.m4709g(j7, abstractC1534u0) != abstractC1497m18.m4709g(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m19 = AbstractC1502n3.f6075c;
                            if (abstractC1497m19.m4710h(j7, abstractC1534u0) != abstractC1497m19.m4710h(j7, abstractC1534u1)) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        if (!m4773j(abstractC1534u0, abstractC1534u1, i13)) {
                            zM4916x = false;
                        } else {
                            AbstractC1497m3 abstractC1497m20 = AbstractC1502n3.f6075c;
                            if (!AbstractC1541v2.m4916x(abstractC1497m20.m4711i(j7, abstractC1534u0), abstractC1497m20.m4711i(j7, abstractC1534u1))) {
                                zM4916x = false;
                            }
                        }
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    case 20:
                    case 21:
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        AbstractC1497m3 abstractC1497m21 = AbstractC1502n3.f6075c;
                        zM4916x = AbstractC1541v2.m4916x(abstractC1497m21.m4711i(j7, abstractC1534u0), abstractC1497m21.m4711i(j7, abstractC1534u1));
                        break;
                    case 50:
                        AbstractC1497m3 abstractC1497m22 = AbstractC1502n3.f6075c;
                        zM4916x = AbstractC1541v2.m4916x(abstractC1497m22.m4711i(j7, abstractC1534u0), abstractC1497m22.m4711i(j7, abstractC1534u1));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j13 = iArr[i13 + 2] & 1048575;
                        AbstractC1497m3 abstractC1497m23 = AbstractC1502n3.f6075c;
                        if (abstractC1497m23.m4709g(j13, abstractC1534u0) != abstractC1497m23.m4709g(j13, abstractC1534u1) || !AbstractC1541v2.m4916x(abstractC1497m23.m4711i(j7, abstractC1534u0), abstractC1497m23.m4711i(j7, abstractC1534u1))) {
                            zM4916x = false;
                        }
                        break;
                }
                if (zM4916x) {
                    i13 += 3;
                }
            } else {
                C1462f3 c1462f3 = (C1462f3) this.f6096l;
                c1462f3.getClass();
                C1457e3 c1457e3 = abstractC1534u0.unknownFields;
                c1462f3.getClass();
                if (c1457e3.equals(abstractC1534u1.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: h */
    public final void mo4771h(Object obj, C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        c1465g1.getClass();
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!this.f6090f) {
            m4762Q(obj, c1465g1);
            return;
        }
        int[] iArr = this.f6085a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM4761P = m4761P(i13);
            int i14 = iArr[i13];
            switch (m4745O(iM4761P)) {
                case 0:
                    if (m4779s(i13, obj)) {
                        double dMo4688e = AbstractC1502n3.f6075c.mo4688e(iM4761P & 1048575, obj);
                        c1483k.getClass();
                        c1483k.m4669K(i14, Double.doubleToRawLongBits(dMo4688e));
                    }
                    break;
                case 1:
                    if (m4779s(i13, obj)) {
                        float fMo4689f = AbstractC1502n3.f6075c.mo4689f(iM4761P & 1048575, obj);
                        c1483k.getClass();
                        c1483k.m4667I(i14, Float.floatToRawIntBits(fMo4689f));
                    }
                    break;
                case 2:
                    if (m4779s(i13, obj)) {
                        c1483k.m4675Q(i14, AbstractC1502n3.f6075c.m4710h(iM4761P & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m4779s(i13, obj)) {
                        c1483k.m4675Q(i14, AbstractC1502n3.f6075c.m4710h(iM4761P & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m4779s(i13, obj)) {
                        int iM4709g = AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4671M(iM4709g);
                    }
                    break;
                case 5:
                    if (m4779s(i13, obj)) {
                        c1483k.m4669K(i14, AbstractC1502n3.f6075c.m4710h(iM4761P & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m4779s(i13, obj)) {
                        c1483k.m4667I(i14, AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m4779s(i13, obj)) {
                        boolean zMo4686c = AbstractC1502n3.f6075c.mo4686c(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4664F(zMo4686c ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (m4779s(i13, obj)) {
                        m4746S(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1);
                    }
                    break;
                case 9:
                    if (m4779s(i13, obj)) {
                        c1465g1.m4626c(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), m4776o(i13));
                    }
                    break;
                case 10:
                    if (m4779s(i13, obj)) {
                        c1465g1.m4624a(i14, (C1468h) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m4779s(i13, obj)) {
                        int iM4709g2 = AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4674P(iM4709g2);
                    }
                    break;
                case 12:
                    if (m4779s(i13, obj)) {
                        int iM4709g3 = AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4671M(iM4709g3);
                    }
                    break;
                case 13:
                    if (m4779s(i13, obj)) {
                        c1483k.m4667I(i14, AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m4779s(i13, obj)) {
                        c1483k.m4669K(i14, AbstractC1502n3.f6075c.m4710h(iM4761P & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m4779s(i13, obj)) {
                        int iM4709g4 = AbstractC1502n3.f6075c.m4709g(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4674P((iM4709g4 >> 31) ^ (iM4709g4 << 1));
                    }
                    break;
                case 16:
                    if (m4779s(i13, obj)) {
                        long jM4710h = AbstractC1502n3.f6075c.m4710h(iM4761P & 1048575, obj);
                        c1483k.m4675Q(i14, (jM4710h >> 63) ^ (jM4710h << 1));
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (m4779s(i13, obj)) {
                        c1465g1.m4625b(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), m4776o(i13));
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    AbstractC1541v2.m4877A(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC1541v2.m4881E(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 20:
                    AbstractC1541v2.m4884H(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 21:
                    AbstractC1541v2.m4892P(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    AbstractC1541v2.m4883G(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    AbstractC1541v2.m4880D(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 24:
                    AbstractC1541v2.m4879C(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 25:
                    AbstractC1541v2.m4917y(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 26:
                    AbstractC1541v2.m4890N(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1);
                    break;
                case 27:
                    AbstractC1541v2.m4885I(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, m4776o(i13));
                    break;
                case 28:
                    AbstractC1541v2.m4918z(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1);
                    break;
                case 29:
                    AbstractC1541v2.m4891O(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 30:
                    AbstractC1541v2.m4878B(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 31:
                    AbstractC1541v2.m4886J(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 32:
                    AbstractC1541v2.m4887K(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 33:
                    AbstractC1541v2.m4888L(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 34:
                    AbstractC1541v2.m4889M(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, false);
                    break;
                case 35:
                    AbstractC1541v2.m4877A(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 36:
                    AbstractC1541v2.m4881E(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 37:
                    AbstractC1541v2.m4884H(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 38:
                    AbstractC1541v2.m4892P(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 39:
                    AbstractC1541v2.m4883G(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 40:
                    AbstractC1541v2.m4880D(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 41:
                    AbstractC1541v2.m4879C(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 42:
                    AbstractC1541v2.m4917y(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 43:
                    AbstractC1541v2.m4891O(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 44:
                    AbstractC1541v2.m4878B(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 45:
                    AbstractC1541v2.m4886J(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 46:
                    AbstractC1541v2.m4887K(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 47:
                    AbstractC1541v2.m4888L(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 48:
                    AbstractC1541v2.m4889M(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, true);
                    break;
                case 49:
                    AbstractC1541v2.m4882F(iArr[i13], (List) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1, m4776o(i13));
                    break;
                case 50:
                    m4763R(c1465g1, i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), i13);
                    break;
                case 51:
                    if (m4780u(i14, i13, obj)) {
                        double dDoubleValue = ((Double) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj)).doubleValue();
                        c1483k.getClass();
                        c1483k.m4669K(i14, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (m4780u(i14, i13, obj)) {
                        float fFloatValue = ((Float) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj)).floatValue();
                        c1483k.getClass();
                        c1483k.m4667I(i14, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4675Q(i14, m4743D(iM4761P & 1048575, obj));
                    }
                    break;
                case 54:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4675Q(i14, m4743D(iM4761P & 1048575, obj));
                    }
                    break;
                case 55:
                    if (m4780u(i14, i13, obj)) {
                        int iM4742C = m4742C(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4671M(iM4742C);
                    }
                    break;
                case 56:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4669K(i14, m4743D(iM4761P & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4667I(i14, m4742C(iM4761P & 1048575, obj));
                    }
                    break;
                case 58:
                    if (m4780u(i14, i13, obj)) {
                        boolean zBooleanValue = ((Boolean) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj)).booleanValue();
                        c1483k.m4673O(i14, 0);
                        c1483k.m4664F(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (m4780u(i14, i13, obj)) {
                        m4746S(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), c1465g1);
                    }
                    break;
                case 60:
                    if (m4780u(i14, i13, obj)) {
                        c1465g1.m4626c(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), m4776o(i13));
                    }
                    break;
                case 61:
                    if (m4780u(i14, i13, obj)) {
                        c1465g1.m4624a(i14, (C1468h) AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m4780u(i14, i13, obj)) {
                        int iM4742C2 = m4742C(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4674P(iM4742C2);
                    }
                    break;
                case 63:
                    if (m4780u(i14, i13, obj)) {
                        int iM4742C3 = m4742C(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4671M(iM4742C3);
                    }
                    break;
                case 64:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4667I(i14, m4742C(iM4761P & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m4780u(i14, i13, obj)) {
                        c1483k.m4669K(i14, m4743D(iM4761P & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m4780u(i14, i13, obj)) {
                        int iM4742C4 = m4742C(iM4761P & 1048575, obj);
                        c1483k.m4673O(i14, 0);
                        c1483k.m4674P((iM4742C4 >> 31) ^ (iM4742C4 << 1));
                    }
                    break;
                case 67:
                    if (m4780u(i14, i13, obj)) {
                        long jM4743D = m4743D(iM4761P & 1048575, obj);
                        c1483k.m4675Q(i14, (jM4743D >> 63) ^ (jM4743D << 1));
                    }
                    break;
                case 68:
                    if (m4780u(i14, i13, obj)) {
                        c1465g1.m4625b(i14, AbstractC1502n3.f6075c.m4711i(iM4761P & 1048575, obj), m4776o(i13));
                    }
                    break;
            }
        }
        ((C1462f3) this.f6096l).getClass();
        ((AbstractC1534u0) obj).unknownFields.m4606e(c1465g1);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: i */
    public final int mo4772i(AbstractC1534u0 abstractC1534u0) {
        return this.f6090f ? m4778r(abstractC1534u0) : m4777q(abstractC1534u0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4773j(AbstractC1534u0 abstractC1534u0, AbstractC1534u0 abstractC1534u1, int i13) {
        return m4779s(i13, abstractC1534u0) == m4779s(i13, abstractC1534u1);
    }

    /* JADX INFO: renamed from: m */
    public final C1530t1 m4774m(int i13) {
        return (C1530t1) this.f6086b[AbstractC11266d.m30449c(i13, 3, 2, 1)];
    }

    /* JADX INFO: renamed from: n */
    public final Object m4775n(int i13) {
        return this.f6086b[(i13 / 3) * 2];
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC1536u2 m4776o(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f6086b;
        InterfaceC1536u2 interfaceC1536u2 = (InterfaceC1536u2) objArr[i14];
        if (interfaceC1536u2 != null) {
            return interfaceC1536u2;
        }
        InterfaceC1536u2 interfaceC1536u2M4946a = C1554y1.f6164c.m4946a((Class) objArr[i14 + 1]);
        objArr[i14] = interfaceC1536u2M4946a;
        return interfaceC1536u2M4946a;
    }

    /* JADX INFO: renamed from: q */
    public final int m4777q(AbstractC1534u0 abstractC1534u0) {
        int i13;
        int iM4656C;
        int iM4658E;
        int iM4656C2;
        int iM4654A;
        int iM4662y;
        int iM4656C3;
        int iM4655B;
        int iM94754c;
        int iM4663z;
        Unsafe unsafe = f6084o;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int iM94753b = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = this.f6085a;
            if (i16 >= iArr.length) {
                ((C1462f3) this.f6096l).getClass();
                return abstractC1534u0.unknownFields.m4604b() + iM94753b;
            }
            int iM4761P = m4761P(i16);
            int i18 = iArr[i16];
            int iM4745O = m4745O(iM4761P);
            if (iM4745O <= 17) {
                int i19 = iArr[i16 + 2];
                int i24 = i19 & i14;
                i13 = 1 << (i19 >>> 20);
                if (i24 != i15) {
                    i17 = unsafe.getInt(abstractC1534u0, i24);
                    i15 = i24;
                }
            } else {
                i13 = 0;
            }
            long j7 = iM4761P & i14;
            switch (iM4745O) {
                case 0:
                    if ((i17 & i13) != 0) {
                        iM94753b = AbstractC30802r.m94753b(i18, 8, iM94753b);
                    }
                    break;
                case 1:
                    if ((i17 & i13) != 0) {
                        iM94753b = AbstractC30802r.m94753b(i18, 4, iM94753b);
                    }
                    break;
                case 2:
                    if ((i13 & i17) != 0) {
                        long j13 = unsafe.getLong(abstractC1534u0, j7);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E(j13);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 3:
                    if ((i13 & i17) != 0) {
                        long j14 = unsafe.getLong(abstractC1534u0, j7);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E(j14);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 4:
                    if ((i13 & i17) != 0) {
                        int i25 = unsafe.getInt(abstractC1534u0, j7);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4654A(i25);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 5:
                    if ((i17 & i13) != 0) {
                        iM4662y = C1483k.m4662y(i18);
                        iM94753b += iM4662y;
                    }
                    break;
                case 6:
                    if ((i17 & i13) != 0) {
                        iM4662y = C1483k.m4661x(i18);
                        iM94753b += iM4662y;
                    }
                    break;
                case 7:
                    if ((i17 & i13) != 0) {
                        iM94753b = AbstractC30802r.m94753b(i18, 1, iM94753b);
                    }
                    break;
                case 8:
                    if ((i13 & i17) != 0) {
                        Object object = unsafe.getObject(abstractC1534u0, j7);
                        if (object instanceof C1468h) {
                            int iM4656C4 = C1483k.m4656C(i18);
                            int size = ((C1468h) object).size();
                            iM94754c = AbstractC30802r.m94754c(size, size, iM4656C4, iM94753b);
                        } else {
                            iM4656C3 = C1483k.m4656C(i18);
                            iM4655B = C1483k.m4655B((String) object);
                            iM94754c = iM4655B + iM4656C3 + iM94753b;
                        }
                        iM94753b = iM94754c;
                    }
                    break;
                case 9:
                    if ((i13 & i17) != 0) {
                        Object object2 = unsafe.getObject(abstractC1534u0, j7);
                        InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i16);
                        Class cls = AbstractC1541v2.f6122a;
                        int iM4656C5 = C1483k.m4656C(i18);
                        int iMo4563b = ((AbstractC1433a) object2).mo4563b(interfaceC1536u2M4776o);
                        iM94753b = AbstractC30802r.m94754c(iMo4563b, iMo4563b, iM4656C5, iM94753b);
                    }
                    break;
                case 10:
                    if ((i13 & i17) != 0) {
                        iM4662y = C1483k.m4659v(i18, (C1468h) unsafe.getObject(abstractC1534u0, j7));
                        iM94753b += iM4662y;
                    }
                    break;
                case 11:
                    if ((i13 & i17) != 0) {
                        int i26 = unsafe.getInt(abstractC1534u0, j7);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4657D(i26);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 12:
                    if ((i13 & i17) != 0) {
                        int i27 = unsafe.getInt(abstractC1534u0, j7);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4654A(i27);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 13:
                    if ((i17 & i13) != 0) {
                        iM94753b = AbstractC30802r.m94753b(i18, 4, iM94753b);
                    }
                    break;
                case 14:
                    if ((i17 & i13) != 0) {
                        iM94753b = AbstractC30802r.m94753b(i18, 8, iM94753b);
                    }
                    break;
                case 15:
                    if ((i13 & i17) != 0) {
                        int i28 = unsafe.getInt(abstractC1534u0, j7);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4657D((i28 >> 31) ^ (i28 << 1));
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 16:
                    if ((i13 & i17) != 0) {
                        long j15 = unsafe.getLong(abstractC1534u0, j7);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E((j15 >> 63) ^ (j15 << 1));
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if ((i13 & i17) != 0) {
                        iM4662y = C1483k.m4663z(i18, (AbstractC1433a) unsafe.getObject(abstractC1534u0, j7), m4776o(i16));
                        iM94753b += iM4662y;
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    iM4662y = AbstractC1541v2.m4898f(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    iM4662y = AbstractC1541v2.m4896d(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 20:
                    iM4662y = AbstractC1541v2.m4902j(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 21:
                    iM4662y = AbstractC1541v2.m4912t(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    iM4662y = AbstractC1541v2.m4900h(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    iM4662y = AbstractC1541v2.m4898f(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 24:
                    iM4662y = AbstractC1541v2.m4896d(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC1534u0, j7);
                    Class cls2 = AbstractC1541v2.f6122a;
                    int size2 = list.size();
                    iM94753b += size2 == 0 ? 0 : (C1483k.m4656C(i18) + 1) * size2;
                    break;
                case 26:
                    iM4662y = AbstractC1541v2.m4909q(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 27:
                    iM4662y = AbstractC1541v2.m4904l(i18, (List) unsafe.getObject(abstractC1534u0, j7), m4776o(i16));
                    iM94753b += iM4662y;
                    break;
                case 28:
                    iM4662y = AbstractC1541v2.m4893a(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 29:
                    iM4662y = AbstractC1541v2.m4910r(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 30:
                    iM4662y = AbstractC1541v2.m4894b(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 31:
                    iM4662y = AbstractC1541v2.m4896d(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 32:
                    iM4662y = AbstractC1541v2.m4898f(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 33:
                    iM4662y = AbstractC1541v2.m4905m(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 34:
                    iM4662y = AbstractC1541v2.m4907o(i18, (List) unsafe.getObject(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 35:
                    int iM4899g = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g, C1483k.m4656C(i18), iM4899g, iM94753b);
                    }
                    break;
                case 36:
                    int iM4897e = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e, C1483k.m4656C(i18), iM4897e, iM94753b);
                    }
                    break;
                case 37:
                    int iM4903k = AbstractC1541v2.m4903k((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4903k > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4903k, C1483k.m4656C(i18), iM4903k, iM94753b);
                    }
                    break;
                case 38:
                    int iM4913u = AbstractC1541v2.m4913u((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4913u > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4913u, C1483k.m4656C(i18), iM4913u, iM94753b);
                    }
                    break;
                case 39:
                    int iM4901i = AbstractC1541v2.m4901i((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4901i > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4901i, C1483k.m4656C(i18), iM4901i, iM94753b);
                    }
                    break;
                case 40:
                    int iM4899g2 = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g2 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g2, C1483k.m4656C(i18), iM4899g2, iM94753b);
                    }
                    break;
                case 41:
                    int iM4897e2 = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e2 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e2, C1483k.m4656C(i18), iM4897e2, iM94753b);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC1534u0, j7);
                    Class cls3 = AbstractC1541v2.f6122a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(size3, C1483k.m4656C(i18), size3, iM94753b);
                    }
                    break;
                case 43:
                    int iM4911s = AbstractC1541v2.m4911s((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4911s > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4911s, C1483k.m4656C(i18), iM4911s, iM94753b);
                    }
                    break;
                case 44:
                    int iM4895c = AbstractC1541v2.m4895c((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4895c > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4895c, C1483k.m4656C(i18), iM4895c, iM94753b);
                    }
                    break;
                case 45:
                    int iM4897e3 = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e3, C1483k.m4656C(i18), iM4897e3, iM94753b);
                    }
                    break;
                case 46:
                    int iM4899g3 = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g3, C1483k.m4656C(i18), iM4899g3, iM94753b);
                    }
                    break;
                case 47:
                    int iM4906n = AbstractC1541v2.m4906n((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4906n > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4906n, C1483k.m4656C(i18), iM4906n, iM94753b);
                    }
                    break;
                case 48:
                    int iM4908p = AbstractC1541v2.m4908p((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4908p > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4908p, C1483k.m4656C(i18), iM4908p, iM94753b);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC1534u0, j7);
                    InterfaceC1536u2 interfaceC1536u2M4776o2 = m4776o(i16);
                    Class cls4 = AbstractC1541v2.f6122a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iM4663z = 0;
                    } else {
                        iM4663z = 0;
                        for (int i29 = 0; i29 < size4; i29++) {
                            iM4663z += C1483k.m4663z(i18, (AbstractC1433a) list3.get(i29), interfaceC1536u2M4776o2);
                        }
                    }
                    iM94753b += iM4663z;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1534u0, j7);
                    Object objM4775n = m4775n(i16);
                    this.f6097m.getClass();
                    iM4662y = C1485k1.m4677a(i18, object3, objM4775n);
                    iM94753b += iM4662y;
                    break;
                case 51:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i18, 8, iM94753b);
                    }
                    break;
                case 52:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i18, 4, iM94753b);
                    }
                    break;
                case 53:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        long jM4743D = m4743D(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E(jM4743D);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 54:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        long jM4743D2 = m4743D(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E(jM4743D2);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 55:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        int iM4742C = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4654A(iM4742C);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 56:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM4662y = C1483k.m4662y(i18);
                        iM94753b += iM4662y;
                    }
                    break;
                case 57:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM4662y = C1483k.m4661x(i18);
                        iM94753b += iM4662y;
                    }
                    break;
                case 58:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i18, 1, iM94753b);
                    }
                    break;
                case 59:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        Object object4 = unsafe.getObject(abstractC1534u0, j7);
                        if (object4 instanceof C1468h) {
                            int iM4656C6 = C1483k.m4656C(i18);
                            int size5 = ((C1468h) object4).size();
                            iM94754c = AbstractC30802r.m94754c(size5, size5, iM4656C6, iM94753b);
                        } else {
                            iM4656C3 = C1483k.m4656C(i18);
                            iM4655B = C1483k.m4655B((String) object4);
                            iM94754c = iM4655B + iM4656C3 + iM94753b;
                        }
                        iM94753b = iM94754c;
                    }
                    break;
                case 60:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        Object object5 = unsafe.getObject(abstractC1534u0, j7);
                        InterfaceC1536u2 interfaceC1536u2M4776o3 = m4776o(i16);
                        Class cls5 = AbstractC1541v2.f6122a;
                        int iM4656C7 = C1483k.m4656C(i18);
                        int iMo4563b2 = ((AbstractC1433a) object5).mo4563b(interfaceC1536u2M4776o3);
                        iM94753b = AbstractC30802r.m94754c(iMo4563b2, iMo4563b2, iM4656C7, iM94753b);
                    }
                    break;
                case 61:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM4662y = C1483k.m4659v(i18, (C1468h) unsafe.getObject(abstractC1534u0, j7));
                        iM94753b += iM4662y;
                    }
                    break;
                case 62:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        int iM4742C2 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4657D(iM4742C2);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 63:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        int iM4742C3 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4654A(iM4742C3);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 64:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i18, 4, iM94753b);
                    }
                    break;
                case 65:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i18, 8, iM94753b);
                    }
                    break;
                case 66:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        int iM4742C4 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i18);
                        iM4654A = C1483k.m4657D((iM4742C4 >> 31) ^ (iM4742C4 << 1));
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 67:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        long jM4743D3 = m4743D(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i18);
                        iM4658E = C1483k.m4658E((jM4743D3 >> 63) ^ (jM4743D3 << 1));
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 68:
                    if (m4780u(i18, i16, abstractC1534u0)) {
                        iM4662y = C1483k.m4663z(i18, (AbstractC1433a) unsafe.getObject(abstractC1534u0, j7), m4776o(i16));
                        iM94753b += iM4662y;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m4778r(AbstractC1534u0 abstractC1534u0) {
        int iM4656C;
        int iM4658E;
        int iM4656C2;
        int iM4654A;
        int iM4662y;
        int iM4656C3;
        int iM4655B;
        int iM4656C4;
        int iM4658E2;
        int iM4663z;
        Unsafe unsafe = f6084o;
        int i13 = 0;
        int iM94753b = 0;
        while (true) {
            int[] iArr = this.f6085a;
            if (i13 >= iArr.length) {
                ((C1462f3) this.f6096l).getClass();
                return abstractC1534u0.unknownFields.m4604b() + iM94753b;
            }
            int iM4761P = m4761P(i13);
            int iM4745O = m4745O(iM4761P);
            int i14 = iArr[i13];
            long j7 = iM4761P & 1048575;
            if (iM4745O >= EnumC1509p0.f6100x.f6103w && iM4745O <= EnumC1509p0.f6101y.f6103w) {
                int i15 = iArr[i13 + 2];
            }
            switch (iM4745O) {
                case 0:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 8, iM94753b);
                    }
                    break;
                case 1:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 4, iM94753b);
                    }
                    break;
                case 2:
                    if (m4779s(i13, abstractC1534u0)) {
                        long jM4710h = AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i14);
                        iM4658E = C1483k.m4658E(jM4710h);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 3:
                    if (m4779s(i13, abstractC1534u0)) {
                        long jM4710h2 = AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i14);
                        iM4658E = C1483k.m4658E(jM4710h2);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 4:
                    if (m4779s(i13, abstractC1534u0)) {
                        int iM4709g = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4654A(iM4709g);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 5:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4662y(i14);
                        iM94753b += iM4662y;
                    }
                    break;
                case 6:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4661x(i14);
                        iM94753b += iM4662y;
                    }
                    break;
                case 7:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 1, iM94753b);
                    }
                    break;
                case 8:
                    if (m4779s(i13, abstractC1534u0)) {
                        Object objM4711i = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                        if (objM4711i instanceof C1468h) {
                            int iM4656C5 = C1483k.m4656C(i14);
                            int size = ((C1468h) objM4711i).size();
                            iM94753b = AbstractC30802r.m94754c(size, size, iM4656C5, iM94753b);
                        } else {
                            iM4656C3 = C1483k.m4656C(i14);
                            iM4655B = C1483k.m4655B((String) objM4711i);
                            iM94753b = iM4655B + iM4656C3 + iM94753b;
                        }
                    }
                    break;
                case 9:
                    if (m4779s(i13, abstractC1534u0)) {
                        Object objM4711i2 = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                        InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i13);
                        Class cls = AbstractC1541v2.f6122a;
                        int iM4656C6 = C1483k.m4656C(i14);
                        int iMo4563b = ((AbstractC1433a) objM4711i2).mo4563b(interfaceC1536u2M4776o);
                        iM94753b = AbstractC30802r.m94754c(iMo4563b, iMo4563b, iM4656C6, iM94753b);
                    }
                    break;
                case 10:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4659v(i14, (C1468h) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0));
                        iM94753b += iM4662y;
                    }
                    break;
                case 11:
                    if (m4779s(i13, abstractC1534u0)) {
                        int iM4709g2 = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4657D(iM4709g2);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 12:
                    if (m4779s(i13, abstractC1534u0)) {
                        int iM4709g3 = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4654A(iM4709g3);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 13:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 4, iM94753b);
                    }
                    break;
                case 14:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 8, iM94753b);
                    }
                    break;
                case 15:
                    if (m4779s(i13, abstractC1534u0)) {
                        int iM4709g4 = AbstractC1502n3.f6075c.m4709g(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4657D((iM4709g4 >> 31) ^ (iM4709g4 << 1));
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 16:
                    if (m4779s(i13, abstractC1534u0)) {
                        long jM4710h3 = AbstractC1502n3.f6075c.m4710h(j7, abstractC1534u0);
                        iM4656C4 = C1483k.m4656C(i14);
                        iM4658E2 = C1483k.m4658E((jM4710h3 >> 63) ^ (jM4710h3 << 1));
                        iM4662y = iM4658E2 + iM4656C4;
                        iM94753b += iM4662y;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (m4779s(i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4663z(i14, (AbstractC1433a) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0), m4776o(i13));
                        iM94753b += iM4662y;
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    iM4662y = AbstractC1541v2.m4898f(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    iM4662y = AbstractC1541v2.m4896d(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 20:
                    iM4662y = AbstractC1541v2.m4902j(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 21:
                    iM4662y = AbstractC1541v2.m4912t(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    iM4662y = AbstractC1541v2.m4900h(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    iM4662y = AbstractC1541v2.m4898f(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 24:
                    iM4662y = AbstractC1541v2.m4896d(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 25:
                    List listM4751v = m4751v(abstractC1534u0, j7);
                    Class cls2 = AbstractC1541v2.f6122a;
                    int size2 = listM4751v.size();
                    iM94753b += size2 == 0 ? 0 : (C1483k.m4656C(i14) + 1) * size2;
                    break;
                case 26:
                    iM4662y = AbstractC1541v2.m4909q(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 27:
                    iM4662y = AbstractC1541v2.m4904l(i14, m4751v(abstractC1534u0, j7), m4776o(i13));
                    iM94753b += iM4662y;
                    break;
                case 28:
                    iM4662y = AbstractC1541v2.m4893a(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 29:
                    iM4662y = AbstractC1541v2.m4910r(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 30:
                    iM4662y = AbstractC1541v2.m4894b(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 31:
                    iM4662y = AbstractC1541v2.m4896d(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 32:
                    iM4662y = AbstractC1541v2.m4898f(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 33:
                    iM4662y = AbstractC1541v2.m4905m(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 34:
                    iM4662y = AbstractC1541v2.m4907o(i14, m4751v(abstractC1534u0, j7));
                    iM94753b += iM4662y;
                    break;
                case 35:
                    int iM4899g = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g, C1483k.m4656C(i14), iM4899g, iM94753b);
                    }
                    break;
                case 36:
                    int iM4897e = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e, C1483k.m4656C(i14), iM4897e, iM94753b);
                    }
                    break;
                case 37:
                    int iM4903k = AbstractC1541v2.m4903k((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4903k > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4903k, C1483k.m4656C(i14), iM4903k, iM94753b);
                    }
                    break;
                case 38:
                    int iM4913u = AbstractC1541v2.m4913u((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4913u > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4913u, C1483k.m4656C(i14), iM4913u, iM94753b);
                    }
                    break;
                case 39:
                    int iM4901i = AbstractC1541v2.m4901i((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4901i > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4901i, C1483k.m4656C(i14), iM4901i, iM94753b);
                    }
                    break;
                case 40:
                    int iM4899g2 = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g2 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g2, C1483k.m4656C(i14), iM4899g2, iM94753b);
                    }
                    break;
                case 41:
                    int iM4897e2 = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e2 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e2, C1483k.m4656C(i14), iM4897e2, iM94753b);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(abstractC1534u0, j7);
                    Class cls3 = AbstractC1541v2.f6122a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(size3, C1483k.m4656C(i14), size3, iM94753b);
                    }
                    break;
                case 43:
                    int iM4911s = AbstractC1541v2.m4911s((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4911s > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4911s, C1483k.m4656C(i14), iM4911s, iM94753b);
                    }
                    break;
                case 44:
                    int iM4895c = AbstractC1541v2.m4895c((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4895c > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4895c, C1483k.m4656C(i14), iM4895c, iM94753b);
                    }
                    break;
                case 45:
                    int iM4897e3 = AbstractC1541v2.m4897e((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4897e3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4897e3, C1483k.m4656C(i14), iM4897e3, iM94753b);
                    }
                    break;
                case 46:
                    int iM4899g3 = AbstractC1541v2.m4899g((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4899g3 > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4899g3, C1483k.m4656C(i14), iM4899g3, iM94753b);
                    }
                    break;
                case 47:
                    int iM4906n = AbstractC1541v2.m4906n((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4906n > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4906n, C1483k.m4656C(i14), iM4906n, iM94753b);
                    }
                    break;
                case 48:
                    int iM4908p = AbstractC1541v2.m4908p((List) unsafe.getObject(abstractC1534u0, j7));
                    if (iM4908p > 0) {
                        iM94753b = AbstractC30802r.m94754c(iM4908p, C1483k.m4656C(i14), iM4908p, iM94753b);
                    }
                    break;
                case 49:
                    List listM4751v2 = m4751v(abstractC1534u0, j7);
                    InterfaceC1536u2 interfaceC1536u2M4776o2 = m4776o(i13);
                    Class cls4 = AbstractC1541v2.f6122a;
                    int size4 = listM4751v2.size();
                    if (size4 == 0) {
                        iM4663z = 0;
                    } else {
                        iM4663z = 0;
                        for (int i16 = 0; i16 < size4; i16++) {
                            iM4663z += C1483k.m4663z(i14, (AbstractC1433a) listM4751v2.get(i16), interfaceC1536u2M4776o2);
                        }
                    }
                    iM94753b += iM4663z;
                    break;
                case 50:
                    Object objM4711i3 = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                    Object objM4775n = m4775n(i13);
                    this.f6097m.getClass();
                    iM4662y = C1485k1.m4677a(i14, objM4711i3, objM4775n);
                    iM94753b += iM4662y;
                    break;
                case 51:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 8, iM94753b);
                    }
                    break;
                case 52:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 4, iM94753b);
                    }
                    break;
                case 53:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        long jM4743D = m4743D(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i14);
                        iM4658E = C1483k.m4658E(jM4743D);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 54:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        long jM4743D2 = m4743D(j7, abstractC1534u0);
                        iM4656C = C1483k.m4656C(i14);
                        iM4658E = C1483k.m4658E(jM4743D2);
                        iM4662y = iM4658E + iM4656C;
                        iM94753b += iM4662y;
                    }
                    break;
                case 55:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        int iM4742C = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4654A(iM4742C);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 56:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4662y(i14);
                        iM94753b += iM4662y;
                    }
                    break;
                case 57:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4661x(i14);
                        iM94753b += iM4662y;
                    }
                    break;
                case 58:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 1, iM94753b);
                    }
                    break;
                case 59:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        Object objM4711i4 = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                        if (objM4711i4 instanceof C1468h) {
                            int iM4656C7 = C1483k.m4656C(i14);
                            int size5 = ((C1468h) objM4711i4).size();
                            iM94753b = AbstractC30802r.m94754c(size5, size5, iM4656C7, iM94753b);
                        } else {
                            iM4656C3 = C1483k.m4656C(i14);
                            iM4655B = C1483k.m4655B((String) objM4711i4);
                            iM94753b = iM4655B + iM4656C3 + iM94753b;
                        }
                    }
                    break;
                case 60:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        Object objM4711i5 = AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0);
                        InterfaceC1536u2 interfaceC1536u2M4776o3 = m4776o(i13);
                        Class cls5 = AbstractC1541v2.f6122a;
                        int iM4656C8 = C1483k.m4656C(i14);
                        int iMo4563b2 = ((AbstractC1433a) objM4711i5).mo4563b(interfaceC1536u2M4776o3);
                        iM94753b = AbstractC30802r.m94754c(iMo4563b2, iMo4563b2, iM4656C8, iM94753b);
                    }
                    break;
                case 61:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4659v(i14, (C1468h) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0));
                        iM94753b += iM4662y;
                    }
                    break;
                case 62:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        int iM4742C2 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4657D(iM4742C2);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 63:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        int iM4742C3 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4654A(iM4742C3);
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 64:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 4, iM94753b);
                    }
                    break;
                case 65:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM94753b = AbstractC30802r.m94753b(i14, 8, iM94753b);
                    }
                    break;
                case 66:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        int iM4742C4 = m4742C(j7, abstractC1534u0);
                        iM4656C2 = C1483k.m4656C(i14);
                        iM4654A = C1483k.m4657D((iM4742C4 >> 31) ^ (iM4742C4 << 1));
                        iM4662y = iM4654A + iM4656C2;
                        iM94753b += iM4662y;
                    }
                    break;
                case 67:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        long jM4743D3 = m4743D(j7, abstractC1534u0);
                        iM4656C4 = C1483k.m4656C(i14);
                        iM4658E2 = C1483k.m4658E((jM4743D3 >> 63) ^ (jM4743D3 << 1));
                        iM4662y = iM4658E2 + iM4656C4;
                        iM94753b += iM4662y;
                    }
                    break;
                case 68:
                    if (m4780u(i14, i13, abstractC1534u0)) {
                        iM4662y = C1483k.m4663z(i14, (AbstractC1433a) AbstractC1502n3.f6075c.m4711i(j7, abstractC1534u0), m4776o(i13));
                        iM94753b += iM4662y;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4779s(int i13, Object obj) {
        int i14 = this.f6085a[i13 + 2];
        long j7 = i14 & 1048575;
        if (j7 == 1048575) {
            int iM4761P = m4761P(i13);
            long j13 = iM4761P & 1048575;
            switch (m4745O(iM4761P)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1502n3.f6075c.mo4688e(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1502n3.f6075c.mo4689f(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1502n3.f6075c.m4710h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1502n3.f6075c.m4710h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1502n3.f6075c.m4710h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1502n3.f6075c.mo4686c(j13, obj);
                case 8:
                    Object objM4711i = AbstractC1502n3.f6075c.m4711i(j13, obj);
                    if (objM4711i instanceof String) {
                        return !((String) objM4711i).isEmpty();
                    }
                    if (objM4711i instanceof C1468h) {
                        return !C1468h.f6044y.equals(objM4711i);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC1502n3.f6075c.m4711i(j13, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1468h.f6044y.equals(AbstractC1502n3.f6075c.m4711i(j13, obj));
                case 11:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1502n3.f6075c.m4710h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1502n3.f6075c.m4709g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1502n3.f6075c.m4710h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (AbstractC1502n3.f6075c.m4711i(j13, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i14 >>> 20)) & AbstractC1502n3.f6075c.m4709g(j7, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4780u(int i13, int i14, Object obj) {
        return AbstractC1502n3.f6075c.m4709g((long) (this.f6085a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX INFO: renamed from: w */
    public final void m4781w(int i13, Object obj, Object obj2) {
        if (m4779s(i13, obj2)) {
            long jM4761P = m4761P(i13) & 1048575;
            Unsafe unsafe = f6084o;
            Object object = unsafe.getObject(obj2, jM4761P);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6085a[i13] + " is present but null: " + obj2);
            }
            InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i13);
            if (!m4779s(i13, obj)) {
                if (m4750t(object)) {
                    AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4776o.mo4767d();
                    interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d, object);
                    unsafe.putObject(obj, jM4761P, abstractC1534u0Mo4767d);
                } else {
                    unsafe.putObject(obj, jM4761P, object);
                }
                m4757K(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4761P);
            if (!m4750t(object2)) {
                AbstractC1534u0 abstractC1534u0Mo4767d2 = interfaceC1536u2M4776o.mo4767d();
                interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d2, object2);
                unsafe.putObject(obj, jM4761P, abstractC1534u0Mo4767d2);
                object2 = abstractC1534u0Mo4767d2;
            }
            interfaceC1536u2M4776o.mo4764a(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4782x(int i13, Object obj, Object obj2) {
        int[] iArr = this.f6085a;
        int i14 = iArr[i13];
        if (m4780u(i14, i13, obj2)) {
            long jM4761P = m4761P(i13) & 1048575;
            Unsafe unsafe = f6084o;
            Object object = unsafe.getObject(obj2, jM4761P);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i13);
            if (!m4780u(i14, i13, obj)) {
                if (m4750t(object)) {
                    AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4776o.mo4767d();
                    interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d, object);
                    unsafe.putObject(obj, jM4761P, abstractC1534u0Mo4767d);
                } else {
                    unsafe.putObject(obj, jM4761P, object);
                }
                AbstractC1502n3.m4732n(iArr[i13 + 2] & 1048575, obj, i14);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4761P);
            if (!m4750t(object2)) {
                AbstractC1534u0 abstractC1534u0Mo4767d2 = interfaceC1536u2M4776o.mo4767d();
                interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d2, object2);
                unsafe.putObject(obj, jM4761P, abstractC1534u0Mo4767d2);
                object2 = abstractC1534u0Mo4767d2;
            }
            interfaceC1536u2M4776o.mo4764a(object2, object);
        }
    }

    /* JADX INFO: renamed from: y */
    public final Object m4783y(int i13, Object obj) {
        InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i13);
        long jM4761P = m4761P(i13) & 1048575;
        if (!m4779s(i13, obj)) {
            return interfaceC1536u2M4776o.mo4767d();
        }
        Object object = f6084o.getObject(obj, jM4761P);
        if (m4750t(object)) {
            return object;
        }
        AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4776o.mo4767d();
        if (object != null) {
            interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d, object);
        }
        return abstractC1534u0Mo4767d;
    }

    /* JADX INFO: renamed from: z */
    public final Object m4784z(int i13, int i14, Object obj) {
        InterfaceC1536u2 interfaceC1536u2M4776o = m4776o(i14);
        if (!m4780u(i13, i14, obj)) {
            return interfaceC1536u2M4776o.mo4767d();
        }
        Object object = f6084o.getObject(obj, m4761P(i14) & 1048575);
        if (m4750t(object)) {
            return object;
        }
        AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2M4776o.mo4767d();
        if (object != null) {
            interfaceC1536u2M4776o.mo4764a(abstractC1534u0Mo4767d, object);
        }
        return abstractC1534u0Mo4767d;
    }
}
