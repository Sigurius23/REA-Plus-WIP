package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import androidx.health.platform.client.proto.C1448d;
import androidx.health.platform.client.proto.C1533u;
import ih0.AbstractC18489d0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import se.AbstractC32410a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5173r0 implements InterfaceC5124a1 {

    /* JADX INFO: renamed from: n */
    public static final int[] f21566n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f21567o = AbstractC5160m1.m16286j();

    /* JADX INFO: renamed from: a */
    public final int[] f21568a;

    /* JADX INFO: renamed from: b */
    public final Object[] f21569b;

    /* JADX INFO: renamed from: c */
    public final int f21570c;

    /* JADX INFO: renamed from: d */
    public final int f21571d;

    /* JADX INFO: renamed from: e */
    public final AbstractC5122a f21572e;

    /* JADX INFO: renamed from: f */
    public final boolean f21573f;

    /* JADX INFO: renamed from: g */
    public final int[] f21574g;

    /* JADX INFO: renamed from: h */
    public final int f21575h;

    /* JADX INFO: renamed from: i */
    public final int f21576i;

    /* JADX INFO: renamed from: j */
    public final C5177t0 f21577j;

    /* JADX INFO: renamed from: k */
    public final AbstractC5144h0 f21578k;

    /* JADX INFO: renamed from: l */
    public final AbstractC5130c1 f21579l;

    /* JADX INFO: renamed from: m */
    public final C5159m0 f21580m;

    public C5173r0(int[] iArr, Object[] objArr, int i13, int i14, AbstractC5122a abstractC5122a, int[] iArr2, int i15, int i16, C5177t0 c5177t0, AbstractC5144h0 abstractC5144h0, AbstractC5130c1 abstractC5130c1, C5170q c5170q, C5159m0 c5159m0) {
        this.f21568a = iArr;
        this.f21569b = objArr;
        this.f21570c = i13;
        this.f21571d = i14;
        this.f21573f = abstractC5122a instanceof AbstractC5184x;
        this.f21574g = iArr2;
        this.f21575h = i15;
        this.f21576i = i16;
        this.f21577j = c5177t0;
        this.f21578k = abstractC5144h0;
        this.f21579l = abstractC5130c1;
        this.f21572e = abstractC5122a;
        this.f21580m = c5159m0;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    /* JADX INFO: renamed from: A */
    public static C5173r0 m16309A(C5189z0 c5189z0, C5177t0 c5177t0, AbstractC5144h0 abstractC5144h0, AbstractC5130c1 abstractC5130c1, C5170q c5170q, C5159m0 c5159m0) {
        int i13;
        int iCharAt;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        int i24;
        char cCharAt;
        int i25;
        char cCharAt2;
        int i26;
        char cCharAt3;
        int i27;
        char cCharAt4;
        int i28;
        char cCharAt5;
        int i29;
        char cCharAt6;
        int i34;
        char cCharAt7;
        int i35;
        char cCharAt8;
        Object[] objArr;
        int i36;
        int i37;
        int i38;
        int i39;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i44;
        int i45;
        Field fieldM16313M;
        int i46;
        char cCharAt9;
        int i47;
        Field fieldM16313M2;
        Field fieldM16313M3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        int i55;
        char cCharAt12;
        int i56;
        char cCharAt13;
        String str = c5189z0.f21602b;
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
        int iCharAt2 = str.charAt(i13);
        if (iCharAt2 >= 55296) {
            int i59 = iCharAt2 & 8191;
            int i64 = 13;
            while (true) {
                i56 = i58 + 1;
                cCharAt13 = str.charAt(i58);
                if (cCharAt13 < 55296) {
                    break;
                }
                i59 |= (cCharAt13 & 8191) << i64;
                i64 += 13;
                i58 = i56;
            }
            iCharAt2 = i59 | (cCharAt13 << i64);
            i58 = i56;
        }
        if (iCharAt2 == 0) {
            i15 = 0;
            i18 = 0;
            iCharAt = 0;
            i14 = 0;
            i17 = 0;
            i19 = 0;
            iArr = f21566n;
            i16 = 0;
        } else {
            int i65 = i58 + 1;
            int iCharAt3 = str.charAt(i58);
            if (iCharAt3 >= 55296) {
                int i66 = iCharAt3 & 8191;
                int i67 = 13;
                while (true) {
                    i35 = i65 + 1;
                    cCharAt8 = str.charAt(i65);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt8 & 8191) << i67;
                    i67 += 13;
                    i65 = i35;
                }
                iCharAt3 = i66 | (cCharAt8 << i67);
                i65 = i35;
            }
            int i68 = i65 + 1;
            int iCharAt4 = str.charAt(i65);
            if (iCharAt4 >= 55296) {
                int i69 = iCharAt4 & 8191;
                int i74 = 13;
                while (true) {
                    i34 = i68 + 1;
                    cCharAt7 = str.charAt(i68);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt7 & 8191) << i74;
                    i74 += 13;
                    i68 = i34;
                }
                iCharAt4 = i69 | (cCharAt7 << i74);
                i68 = i34;
            }
            int i75 = i68 + 1;
            int iCharAt5 = str.charAt(i68);
            if (iCharAt5 >= 55296) {
                int i76 = iCharAt5 & 8191;
                int i77 = 13;
                while (true) {
                    i29 = i75 + 1;
                    cCharAt6 = str.charAt(i75);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt6 & 8191) << i77;
                    i77 += 13;
                    i75 = i29;
                }
                iCharAt5 = i76 | (cCharAt6 << i77);
                i75 = i29;
            }
            int i78 = i75 + 1;
            int iCharAt6 = str.charAt(i75);
            if (iCharAt6 >= 55296) {
                int i79 = iCharAt6 & 8191;
                int i83 = 13;
                while (true) {
                    i28 = i78 + 1;
                    cCharAt5 = str.charAt(i78);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt5 & 8191) << i83;
                    i83 += 13;
                    i78 = i28;
                }
                iCharAt6 = i79 | (cCharAt5 << i83);
                i78 = i28;
            }
            int i84 = i78 + 1;
            iCharAt = str.charAt(i78);
            if (iCharAt >= 55296) {
                int i85 = iCharAt & 8191;
                int i86 = 13;
                while (true) {
                    i27 = i84 + 1;
                    cCharAt4 = str.charAt(i84);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt4 & 8191) << i86;
                    i86 += 13;
                    i84 = i27;
                }
                iCharAt = i85 | (cCharAt4 << i86);
                i84 = i27;
            }
            int i87 = i84 + 1;
            int iCharAt7 = str.charAt(i84);
            if (iCharAt7 >= 55296) {
                int i88 = iCharAt7 & 8191;
                int i89 = 13;
                while (true) {
                    i26 = i87 + 1;
                    cCharAt3 = str.charAt(i87);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt3 & 8191) << i89;
                    i89 += 13;
                    i87 = i26;
                }
                iCharAt7 = i88 | (cCharAt3 << i89);
                i87 = i26;
            }
            int i94 = i87 + 1;
            int iCharAt8 = str.charAt(i87);
            if (iCharAt8 >= 55296) {
                int i95 = iCharAt8 & 8191;
                int i96 = 13;
                while (true) {
                    i25 = i94 + 1;
                    cCharAt2 = str.charAt(i94);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i95 |= (cCharAt2 & 8191) << i96;
                    i96 += 13;
                    i94 = i25;
                }
                iCharAt8 = i95 | (cCharAt2 << i96);
                i94 = i25;
            }
            int i97 = i94 + 1;
            int iCharAt9 = str.charAt(i94);
            if (iCharAt9 >= 55296) {
                int i98 = iCharAt9 & 8191;
                int i99 = 13;
                while (true) {
                    i24 = i97 + 1;
                    cCharAt = str.charAt(i97);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i98 |= (cCharAt & 8191) << i99;
                    i99 += 13;
                    i97 = i24;
                }
                iCharAt9 = i98 | (cCharAt << i99);
                i97 = i24;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i100 = (iCharAt3 * 2) + iCharAt4;
            int i101 = iCharAt7;
            i14 = iCharAt5;
            i15 = i101;
            i16 = iCharAt3;
            i58 = i97;
            iArr = iArr2;
            i17 = iCharAt6;
            i18 = i100;
            i19 = iCharAt9;
        }
        Unsafe unsafe = f21567o;
        Object[] objArr2 = c5189z0.f21603c;
        Class<?> cls = c5189z0.f21601a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i102 = i19 + i15;
        int i103 = i102;
        int i104 = i19;
        int i105 = 0;
        int i106 = 0;
        while (i58 < length) {
            int i107 = i58 + 1;
            int iCharAt10 = str.charAt(i58);
            int i108 = length;
            if (iCharAt10 >= 55296) {
                int i109 = iCharAt10 & 8191;
                int i110 = i107;
                int i111 = 13;
                while (true) {
                    i55 = i110 + 1;
                    cCharAt12 = str.charAt(i110);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i109 |= (cCharAt12 & 8191) << i111;
                    i111 += 13;
                    i110 = i55;
                    objArr2 = objArr;
                }
                iCharAt10 = i109 | (cCharAt12 << i111);
                i36 = i55;
            } else {
                objArr = objArr2;
                i36 = i107;
            }
            int i112 = i36 + 1;
            int iCharAt11 = str.charAt(i36);
            if (iCharAt11 >= 55296) {
                int i113 = iCharAt11 & 8191;
                int i114 = i112;
                int i115 = 13;
                while (true) {
                    i49 = i114 + 1;
                    cCharAt11 = str.charAt(i114);
                    i54 = i113;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i113 = i54 | ((cCharAt11 & 8191) << i115);
                    i115 += 13;
                    i114 = i49;
                }
                iCharAt11 = i54 | (cCharAt11 << i115);
                i37 = i49;
            } else {
                i37 = i112;
            }
            int i116 = iCharAt10;
            int i117 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                iArr[i106] = i105;
                i106++;
            }
            int i118 = i16;
            if (i117 >= 51) {
                int i119 = i37 + 1;
                int iCharAt12 = str.charAt(i37);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i120 = iCharAt12 & 8191;
                    int i121 = 13;
                    while (true) {
                        i48 = i119 + 1;
                        cCharAt10 = str.charAt(i119);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i120 |= (cCharAt10 & 8191) << i121;
                        i121 += 13;
                        i119 = i48;
                        c3 = 55296;
                    }
                    iCharAt12 = i120 | (cCharAt10 << i121);
                    i119 = i48;
                }
                int i122 = i117 - 51;
                int i123 = iCharAt12;
                if (i122 == 9 || i122 == 17) {
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i18];
                    i18++;
                } else if (i122 == 12 && (AbstractC12682p.m35483c(c5189z0.m16376a(), 1) || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0)) {
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i18];
                    i18++;
                }
                int i124 = i123 * 2;
                Object obj = objArr[i124];
                if (obj instanceof Field) {
                    fieldM16313M2 = (Field) obj;
                } else {
                    fieldM16313M2 = m16313M(cls, (String) obj);
                    objArr[i124] = fieldM16313M2;
                }
                int i125 = i102;
                i39 = i18;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM16313M2);
                int i126 = i124 + 1;
                Object obj2 = objArr[i126];
                if (obj2 instanceof Field) {
                    fieldM16313M3 = (Field) obj2;
                } else {
                    fieldM16313M3 = m16313M(cls, (String) obj2);
                    objArr[i126] = fieldM16313M3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM16313M3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i105 = i105;
                i44 = i119;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i38 = i125;
                i45 = 0;
            } else {
                i38 = i102;
                int i127 = i18 + 1;
                Field fieldM16313M4 = m16313M(cls, (String) objArr[i18]);
                if (i117 == 9 || i117 == 17) {
                    i38 = i38;
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = fieldM16313M4.getType();
                } else {
                    if (i117 == 27 || i117 == 49) {
                        i38 = i38;
                        i47 = i18 + 2;
                        objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                    } else if (i117 == 12 || i117 == 30 || i117 == 44) {
                        i38 = i38;
                        if (c5189z0.m16376a() == 1 || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            i47 = i18 + 2;
                            objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM16313M4);
                        if ((iCharAt11 & 4096) != 0 || i117 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i44 = i37;
                            i45 = 0;
                        } else {
                            i44 = i37 + 1;
                            int iCharAt13 = str.charAt(i37);
                            if (iCharAt13 >= 55296) {
                                int i128 = iCharAt13 & 8191;
                                int i129 = 13;
                                while (true) {
                                    i46 = i44 + 1;
                                    cCharAt9 = str.charAt(i44);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i128 |= (cCharAt9 & 8191) << i129;
                                    i129 += 13;
                                    i44 = i46;
                                }
                                iCharAt13 = i128 | (cCharAt9 << i129);
                                i44 = i46;
                            }
                            int i130 = (iCharAt13 / 32) + (i118 * 2);
                            Object obj3 = objArr[i130];
                            if (obj3 instanceof Field) {
                                fieldM16313M = (Field) obj3;
                            } else {
                                fieldM16313M = m16313M(cls, (String) obj3);
                                objArr[i130] = fieldM16313M;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM16313M);
                            i45 = iCharAt13 % 32;
                        }
                        if (i117 >= 18 && i117 <= 49) {
                            iArr[i103] = iObjectFieldOffset;
                            i103++;
                        }
                    } else {
                        if (i117 == 50) {
                            int i131 = i104 + 1;
                            iArr[i104] = i105;
                            int i132 = (i105 / 3) * 2;
                            int i133 = i18 + 2;
                            objArr3[i132] = objArr[i127];
                            i104 = i131;
                            if ((iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                i39 = i18 + 3;
                                objArr3[i132 + 1] = objArr[i133];
                            } else {
                                i39 = i133;
                            }
                        } else {
                            i38 = i38;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM16313M4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i44 = i37;
                            i45 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i44 = i37;
                            i45 = 0;
                        }
                        if (i117 >= 18) {
                            iArr[i103] = iObjectFieldOffset;
                            i103++;
                        }
                    }
                    i39 = i47;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM16313M4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i44 = i37;
                        i45 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i44 = i37;
                        i45 = 0;
                    }
                    if (i117 >= 18) {
                        iArr[i103] = iObjectFieldOffset;
                        i103++;
                    }
                }
                i39 = i127;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM16313M4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i44 = i37;
                    i45 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i44 = i37;
                    i45 = 0;
                }
                if (i117 >= 18) {
                    iArr[i103] = iObjectFieldOffset;
                    i103++;
                }
            }
            int i134 = i105 + 1;
            iArr4[i105] = i116;
            int i135 = i105 + 2;
            int i136 = i105;
            iArr4[i134] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? Integer.MIN_VALUE : 0) | (i117 << 20) | iObjectFieldOffset;
            i105 = i136 + 3;
            iArr4[i135] = (i45 << 20) | iObjectFieldOffset2;
            i58 = i44;
            length = i108;
            iArr3 = iArr4;
            objArr2 = objArr;
            i102 = i38;
            i18 = i39;
            i16 = i118;
            str = str;
        }
        return new C5173r0(iArr3, objArr3, i14, i17, c5189z0.f21601a, iArr, i19, i102, c5177t0, abstractC5144h0, abstractC5130c1, c5170q, c5159m0);
    }

    /* JADX INFO: renamed from: B */
    public static long m16310B(int i13) {
        return i13 & 1048575;
    }

    /* JADX INFO: renamed from: C */
    public static int m16311C(long j7, Object obj) {
        return ((Integer) AbstractC5160m1.f21551c.m16249i(j7, obj)).intValue();
    }

    /* JADX INFO: renamed from: D */
    public static long m16312D(long j7, Object obj) {
        return ((Long) AbstractC5160m1.f21551c.m16249i(j7, obj)).longValue();
    }

    /* JADX INFO: renamed from: M */
    public static Field m16313M(Class cls, String str) {
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

    /* JADX INFO: renamed from: S */
    public static int m16314S(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: l */
    public static void m16315l(Object obj) {
        if (!m16316s(obj)) {
            throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m16316s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5184x) {
            return ((AbstractC5184x) obj).m16364p();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static C5173r0 m16317z(C5189z0 c5189z0, C5177t0 c5177t0, AbstractC5144h0 abstractC5144h0, AbstractC5130c1 abstractC5130c1, C5170q c5170q, C5159m0 c5159m0) {
        if (c5189z0 instanceof C5189z0) {
            return m16309A(c5189z0, c5177t0, abstractC5144h0, abstractC5130c1, c5170q, c5159m0);
        }
        c5189z0.getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: E */
    public final void m16318E(long j7, Object obj, int i13) {
        Unsafe unsafe = f21567o;
        Object objM16336o = m16336o(i13);
        Object object = unsafe.getObject(obj, j7);
        this.f21580m.getClass();
        if (!((C5156l0) object).f21541w) {
            C5156l0 c5156l0M16244c = C5156l0.f21540x.m16244c();
            C5159m0.m16276a(c5156l0M16244c, object);
            unsafe.putObject(obj, j7, c5156l0M16244c);
        }
        AbstractC30802r.m94771t(objM16336o);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: F */
    public final int m16319F(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, androidx.health.platform.client.proto.C1448d r35) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5173r0.m16319F(java.lang.Object, byte[], int, int, int, androidx.health.platform.client.proto.d):int");
    }

    /* JADX INFO: renamed from: G */
    public final int m16320G(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, int i24, C1448d c1448d) throws InvalidProtocolBufferException {
        int i25;
        Unsafe unsafe = f21567o;
        long j13 = this.f21568a[i24 + 2] & 1048575;
        switch (i19) {
            case 51:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Double.valueOf(Double.longBitsToDouble(AbstractC32410a.m100994B(i13, bArr))));
                int i26 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i26;
            case 52:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Float.valueOf(Float.intBitsToFloat(AbstractC32410a.m100993A(i13, bArr))));
                int i27 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i27;
            case 53:
            case 54:
                if (i17 != 0) {
                    return i13;
                }
                int iM101000H = AbstractC32410a.m101000H(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Long.valueOf(c1448d.f6026b));
                unsafe.putInt(obj, j13, i16);
                return iM101000H;
            case 55:
            case 62:
                if (i17 != 0) {
                    return i13;
                }
                int iM100998F = AbstractC32410a.m100998F(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Integer.valueOf(c1448d.f6025a));
                unsafe.putInt(obj, j13, i16);
                return iM100998F;
            case 56:
            case 65:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Long.valueOf(AbstractC32410a.m100994B(i13, bArr)));
                int i28 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i28;
            case 57:
            case 64:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Integer.valueOf(AbstractC32410a.m100993A(i13, bArr)));
                int i29 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i29;
            case 58:
                if (i17 != 0) {
                    return i13;
                }
                int iM101000H2 = AbstractC32410a.m101000H(bArr, i13, c1448d);
                unsafe.putObject(obj, j7, Boolean.valueOf(c1448d.f6026b != 0));
                unsafe.putInt(obj, j13, i16);
                return iM101000H2;
            case 59:
                if (i17 != 2) {
                    return i13;
                }
                int iM100998F2 = AbstractC32410a.m100998F(bArr, i13, c1448d);
                int i34 = c1448d.f6025a;
                if (i34 == 0) {
                    unsafe.putObject(obj, j7, "");
                } else {
                    if ((i18 & 536870912) != 0) {
                        if (AbstractC5169p1.f21562a.mo16297W(bArr, iM100998F2, iM100998F2 + i34) != 0) {
                            throw InvalidProtocolBufferException.m16100b();
                        }
                    }
                    unsafe.putObject(obj, j7, new String(bArr, iM100998F2, i34, AbstractC5126b0.f21479a));
                    iM100998F2 += i34;
                }
                unsafe.putInt(obj, j13, i16);
                return iM100998F2;
            case 60:
                i25 = i13;
                if (i17 == 2) {
                    Object objM16345y = m16345y(i16, i24, obj);
                    int iM101010S = AbstractC32410a.m101010S(objM16345y, m16337p(i24), bArr, i25, i14, c1448d);
                    m16330R(obj, i16, objM16345y, i24);
                    return iM101010S;
                }
                break;
            case 61:
                i25 = i13;
                if (i17 == 2) {
                    int iM101056z = AbstractC32410a.m101056z(bArr, i25, c1448d);
                    unsafe.putObject(obj, j7, c1448d.f6027c);
                    unsafe.putInt(obj, j13, i16);
                    return iM101056z;
                }
                break;
            case 63:
                i25 = i13;
                if (i17 == 0) {
                    int iM100998F3 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    int i35 = c1448d.f6025a;
                    m16335n(i24);
                    unsafe.putObject(obj, j7, Integer.valueOf(i35));
                    unsafe.putInt(obj, j13, i16);
                    return iM100998F3;
                }
                break;
            case 66:
                i25 = i13;
                if (i17 == 0) {
                    int iM100998F4 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    unsafe.putObject(obj, j7, Integer.valueOf(AbstractC1230l.m3866b(c1448d.f6025a)));
                    unsafe.putInt(obj, j13, i16);
                    return iM100998F4;
                }
                break;
            case 67:
                i25 = i13;
                if (i17 == 0) {
                    int iM101000H3 = AbstractC32410a.m101000H(bArr, i25, c1448d);
                    unsafe.putObject(obj, j7, Long.valueOf(AbstractC1230l.m3867c(c1448d.f6026b)));
                    unsafe.putInt(obj, j13, i16);
                    return iM101000H3;
                }
                break;
            case 68:
                if (i17 == 3) {
                    Object objM16345y2 = m16345y(i16, i24, obj);
                    int iM16319F = ((C5173r0) m16337p(i24)).m16319F(objM16345y2, bArr, i13, i14, (i15 & (-8)) | 4, c1448d);
                    c1448d.f6027c = objM16345y2;
                    m16330R(obj, i16, objM16345y2, i24);
                    return iM16319F;
                }
            default:
                return i13;
        }
        return i25;
    }

    /* JADX INFO: renamed from: H */
    public final int m16321H(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, long j7, int i18, long j13, C1448d c1448d) throws InvalidProtocolBufferException {
        int i19;
        int i24;
        int i25;
        int i26;
        int iM100999G;
        Unsafe unsafe = f21567o;
        InterfaceC5123a0 interfaceC5123a0Mo16111i = (InterfaceC5123a0) unsafe.getObject(obj, j13);
        if (!((AbstractC5125b) interfaceC5123a0Mo16111i).f21478w) {
            int size = interfaceC5123a0Mo16111i.size();
            interfaceC5123a0Mo16111i = interfaceC5123a0Mo16111i.mo16111i(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j13, interfaceC5123a0Mo16111i);
        }
        InterfaceC5123a0 interfaceC5123a0 = interfaceC5123a0Mo16111i;
        switch (i18) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 35:
                int iM100998F = i13;
                if (i16 == 2) {
                    AbstractC5161n abstractC5161n = (AbstractC5161n) interfaceC5123a0;
                    int iM100998F2 = AbstractC32410a.m100998F(bArr, iM100998F, c1448d);
                    int i27 = c1448d.f6025a + iM100998F2;
                    while (iM100998F2 < i27) {
                        abstractC5161n.m16293c(Double.longBitsToDouble(AbstractC32410a.m100994B(iM100998F2, bArr)));
                        iM100998F2 += 8;
                    }
                    if (iM100998F2 == i27) {
                        return iM100998F2;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 != 1) {
                    return iM100998F;
                }
                AbstractC5161n abstractC5161n2 = (AbstractC5161n) interfaceC5123a0;
                abstractC5161n2.m16293c(Double.longBitsToDouble(AbstractC32410a.m100994B(iM100998F, bArr)));
                while (true) {
                    i19 = iM100998F + 8;
                    if (i19 < i14) {
                        iM100998F = AbstractC32410a.m100998F(bArr, i19, c1448d);
                        if (i15 == c1448d.f6025a) {
                            abstractC5161n2.m16293c(Double.longBitsToDouble(AbstractC32410a.m100994B(iM100998F, bArr)));
                        }
                    }
                }
                return i19;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 36:
                int iM100998F3 = i13;
                if (i16 == 2) {
                    AbstractC5176t abstractC5176t = (AbstractC5176t) interfaceC5123a0;
                    int iM100998F4 = AbstractC32410a.m100998F(bArr, iM100998F3, c1448d);
                    int i28 = c1448d.f6025a + iM100998F4;
                    while (iM100998F4 < i28) {
                        abstractC5176t.m16346c(Float.intBitsToFloat(AbstractC32410a.m100993A(iM100998F4, bArr)));
                        iM100998F4 += 4;
                    }
                    if (iM100998F4 == i28) {
                        return iM100998F4;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 != 5) {
                    return iM100998F3;
                }
                AbstractC5176t abstractC5176t2 = (AbstractC5176t) interfaceC5123a0;
                abstractC5176t2.m16346c(Float.intBitsToFloat(AbstractC32410a.m100993A(iM100998F3, bArr)));
                while (true) {
                    i24 = iM100998F3 + 4;
                    if (i24 < i14) {
                        iM100998F3 = AbstractC32410a.m100998F(bArr, i24, c1448d);
                        if (i15 == c1448d.f6025a) {
                            abstractC5176t2.m16346c(Float.intBitsToFloat(AbstractC32410a.m100993A(iM100998F3, bArr)));
                        }
                    }
                }
                return i24;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) interfaceC5123a0;
                    int iM100998F5 = AbstractC32410a.m100998F(bArr, i13, c1448d);
                    int i29 = c1448d.f6025a + iM100998F5;
                    while (iM100998F5 < i29) {
                        iM100998F5 = AbstractC32410a.m101000H(bArr, iM100998F5, c1448d);
                        abstractC5147i0.m16175c(c1448d.f6026b);
                    }
                    if (iM100998F5 == i29) {
                        return iM100998F5;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 != 0) {
                    return i13;
                }
                AbstractC5147i0 abstractC5147i1 = (AbstractC5147i0) interfaceC5123a0;
                int iM101000H = AbstractC32410a.m101000H(bArr, i13, c1448d);
                abstractC5147i1.m16175c(c1448d.f6026b);
                while (iM101000H < i14) {
                    int iM100998F6 = AbstractC32410a.m100998F(bArr, iM101000H, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return iM101000H;
                    }
                    iM101000H = AbstractC32410a.m101000H(bArr, iM100998F6, c1448d);
                    abstractC5147i1.m16175c(c1448d.f6026b);
                }
                return iM101000H;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                i25 = i13;
                if (i16 != 2) {
                    if (i16 == 0) {
                        return AbstractC32410a.m100999G(i15, bArr, i25, i14, interfaceC5123a0, c1448d);
                    }
                    return i25;
                }
                AbstractC5186y abstractC5186y = (AbstractC5186y) interfaceC5123a0;
                int iM100998F7 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                int i34 = c1448d.f6025a + iM100998F7;
                while (iM100998F7 < i34) {
                    iM100998F7 = AbstractC32410a.m100998F(bArr, iM100998F7, c1448d);
                    abstractC5186y.m16373c(c1448d.f6025a);
                }
                if (iM100998F7 == i34) {
                    return iM100998F7;
                }
                throw InvalidProtocolBufferException.m16104f();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 32:
            case 40:
            case 46:
                i25 = i13;
                if (i16 == 2) {
                    AbstractC5147i0 abstractC5147i2 = (AbstractC5147i0) interfaceC5123a0;
                    int iM100998F8 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    int i35 = c1448d.f6025a + iM100998F8;
                    while (iM100998F8 < i35) {
                        abstractC5147i2.m16175c(AbstractC32410a.m100994B(iM100998F8, bArr));
                        iM100998F8 += 8;
                    }
                    if (iM100998F8 == i35) {
                        return iM100998F8;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 == 1) {
                    AbstractC5147i0 abstractC5147i3 = (AbstractC5147i0) interfaceC5123a0;
                    abstractC5147i3.m16175c(AbstractC32410a.m100994B(i25, bArr));
                    int i36 = i25 + 8;
                    while (i36 < i14) {
                        int iM100998F9 = AbstractC32410a.m100998F(bArr, i36, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return i36;
                        }
                        abstractC5147i3.m16175c(AbstractC32410a.m100994B(iM100998F9, bArr));
                        i36 = iM100998F9 + 8;
                    }
                    return i36;
                }
                return i25;
            case 24:
            case 31:
            case 41:
            case 45:
                i25 = i13;
                if (i16 == 2) {
                    AbstractC5186y abstractC5186y2 = (AbstractC5186y) interfaceC5123a0;
                    int iM100998F10 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    int i37 = c1448d.f6025a + iM100998F10;
                    while (iM100998F10 < i37) {
                        abstractC5186y2.m16373c(AbstractC32410a.m100993A(iM100998F10, bArr));
                        iM100998F10 += 4;
                    }
                    if (iM100998F10 == i37) {
                        return iM100998F10;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 == 5) {
                    AbstractC5186y abstractC5186y3 = (AbstractC5186y) interfaceC5123a0;
                    abstractC5186y3.m16373c(AbstractC32410a.m100993A(i25, bArr));
                    int i38 = i25 + 4;
                    while (i38 < i14) {
                        int iM100998F11 = AbstractC32410a.m100998F(bArr, i38, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return i38;
                        }
                        abstractC5186y3.m16373c(AbstractC32410a.m100993A(iM100998F11, bArr));
                        i38 = iM100998F11 + 4;
                    }
                    return i38;
                }
                return i25;
            case 25:
            case 42:
                i25 = i13;
                if (i16 == 2) {
                    AbstractC5131d abstractC5131d = (AbstractC5131d) interfaceC5123a0;
                    int iM100998F12 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    int i39 = c1448d.f6025a + iM100998F12;
                    while (iM100998F12 < i39) {
                        iM100998F12 = AbstractC32410a.m101000H(bArr, iM100998F12, c1448d);
                        abstractC5131d.m16153c(c1448d.f6026b != 0);
                    }
                    if (iM100998F12 == i39) {
                        return iM100998F12;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 == 0) {
                    AbstractC5131d abstractC5131d2 = (AbstractC5131d) interfaceC5123a0;
                    int iM101000H2 = AbstractC32410a.m101000H(bArr, i25, c1448d);
                    abstractC5131d2.m16153c(c1448d.f6026b != 0);
                    while (iM101000H2 < i14) {
                        int iM100998F13 = AbstractC32410a.m100998F(bArr, iM101000H2, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM101000H2;
                        }
                        iM101000H2 = AbstractC32410a.m101000H(bArr, iM100998F13, c1448d);
                        abstractC5131d2.m16153c(c1448d.f6026b != 0);
                    }
                    return iM101000H2;
                }
                return i25;
            case 26:
                i25 = i13;
                if (i16 == 2) {
                    if ((j7 & 536870912) == 0) {
                        int iM100998F14 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                        int i44 = c1448d.f6025a;
                        if (i44 < 0) {
                            throw InvalidProtocolBufferException.m16102d();
                        }
                        if (i44 == 0) {
                            interfaceC5123a0.add("");
                        } else {
                            interfaceC5123a0.add(new String(bArr, iM100998F14, i44, AbstractC5126b0.f21479a));
                            iM100998F14 += i44;
                        }
                        while (iM100998F14 < i14) {
                            int iM100998F15 = AbstractC32410a.m100998F(bArr, iM100998F14, c1448d);
                            if (i15 != c1448d.f6025a) {
                                return iM100998F14;
                            }
                            iM100998F14 = AbstractC32410a.m100998F(bArr, iM100998F15, c1448d);
                            int i45 = c1448d.f6025a;
                            if (i45 < 0) {
                                throw InvalidProtocolBufferException.m16102d();
                            }
                            if (i45 == 0) {
                                interfaceC5123a0.add("");
                            } else {
                                interfaceC5123a0.add(new String(bArr, iM100998F14, i45, AbstractC5126b0.f21479a));
                                iM100998F14 += i45;
                            }
                        }
                        return iM100998F14;
                    }
                    int iM100998F16 = AbstractC32410a.m100998F(bArr, i25, c1448d);
                    int i46 = c1448d.f6025a;
                    if (i46 < 0) {
                        throw InvalidProtocolBufferException.m16102d();
                    }
                    if (i46 == 0) {
                        interfaceC5123a0.add("");
                    } else {
                        int i47 = iM100998F16 + i46;
                        if (AbstractC5169p1.f21562a.mo16297W(bArr, iM100998F16, i47) != 0) {
                            throw InvalidProtocolBufferException.m16100b();
                        }
                        interfaceC5123a0.add(new String(bArr, iM100998F16, i46, AbstractC5126b0.f21479a));
                        iM100998F16 = i47;
                    }
                    while (iM100998F16 < i14) {
                        int iM100998F17 = AbstractC32410a.m100998F(bArr, iM100998F16, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM100998F16;
                        }
                        iM100998F16 = AbstractC32410a.m100998F(bArr, iM100998F17, c1448d);
                        int i48 = c1448d.f6025a;
                        if (i48 < 0) {
                            throw InvalidProtocolBufferException.m16102d();
                        }
                        if (i48 == 0) {
                            interfaceC5123a0.add("");
                        } else {
                            int i49 = iM100998F16 + i48;
                            if (AbstractC5169p1.f21562a.mo16297W(bArr, iM100998F16, i49) != 0) {
                                throw InvalidProtocolBufferException.m16100b();
                            }
                            interfaceC5123a0.add(new String(bArr, iM100998F16, i48, AbstractC5126b0.f21479a));
                            iM100998F16 = i49;
                        }
                    }
                    return iM100998F16;
                }
                return i25;
            case 27:
                return i16 == 2 ? AbstractC32410a.m100995C(m16337p(i17), i15, bArr, i13, i14, interfaceC5123a0, c1448d) : i13;
            case 28:
                if (i16 != 2) {
                    return i13;
                }
                int iM100998F18 = AbstractC32410a.m100998F(bArr, i13, c1448d);
                int i54 = c1448d.f6025a;
                if (i54 < 0) {
                    throw InvalidProtocolBufferException.m16102d();
                }
                if (i54 > bArr.length - iM100998F18) {
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i54 == 0) {
                    interfaceC5123a0.add(AbstractC5146i.f21514x);
                } else {
                    interfaceC5123a0.add(AbstractC5146i.m16173d(bArr, iM100998F18, i54));
                    iM100998F18 += i54;
                }
                while (iM100998F18 < i14) {
                    int iM100998F19 = AbstractC32410a.m100998F(bArr, iM100998F18, c1448d);
                    if (i15 != c1448d.f6025a) {
                        return iM100998F18;
                    }
                    iM100998F18 = AbstractC32410a.m100998F(bArr, iM100998F19, c1448d);
                    int i55 = c1448d.f6025a;
                    if (i55 < 0) {
                        throw InvalidProtocolBufferException.m16102d();
                    }
                    if (i55 > bArr.length - iM100998F18) {
                        throw InvalidProtocolBufferException.m16104f();
                    }
                    if (i55 == 0) {
                        interfaceC5123a0.add(AbstractC5146i.f21514x);
                    } else {
                        interfaceC5123a0.add(AbstractC5146i.m16173d(bArr, iM100998F18, i55));
                        iM100998F18 += i55;
                    }
                }
                return iM100998F18;
            case 30:
            case 44:
                i26 = i13;
                if (i16 != 2) {
                    if (i16 == 0) {
                        iM100999G = AbstractC32410a.m100999G(i15, bArr, i26, i14, interfaceC5123a0, c1448d);
                    }
                    return i26;
                }
                AbstractC5186y abstractC5186y4 = (AbstractC5186y) interfaceC5123a0;
                iM100999G = AbstractC32410a.m100998F(bArr, i26, c1448d);
                int i56 = c1448d.f6025a + iM100999G;
                while (iM100999G < i56) {
                    iM100999G = AbstractC32410a.m100998F(bArr, iM100999G, c1448d);
                    abstractC5186y4.m16373c(c1448d.f6025a);
                }
                if (iM100999G != i56) {
                    throw InvalidProtocolBufferException.m16104f();
                }
                m16335n(i17);
                Class cls = AbstractC5127b1.f21481a;
                return iM100999G;
            case 33:
            case 47:
                i26 = i13;
                if (i16 == 2) {
                    AbstractC5186y abstractC5186y5 = (AbstractC5186y) interfaceC5123a0;
                    int iM100998F20 = AbstractC32410a.m100998F(bArr, i26, c1448d);
                    int i57 = c1448d.f6025a + iM100998F20;
                    while (iM100998F20 < i57) {
                        iM100998F20 = AbstractC32410a.m100998F(bArr, iM100998F20, c1448d);
                        abstractC5186y5.m16373c(AbstractC1230l.m3866b(c1448d.f6025a));
                    }
                    if (iM100998F20 == i57) {
                        return iM100998F20;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 == 0) {
                    AbstractC5186y abstractC5186y6 = (AbstractC5186y) interfaceC5123a0;
                    int iM100998F21 = AbstractC32410a.m100998F(bArr, i26, c1448d);
                    abstractC5186y6.m16373c(AbstractC1230l.m3866b(c1448d.f6025a));
                    while (iM100998F21 < i14) {
                        int iM100998F22 = AbstractC32410a.m100998F(bArr, iM100998F21, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM100998F21;
                        }
                        iM100998F21 = AbstractC32410a.m100998F(bArr, iM100998F22, c1448d);
                        abstractC5186y6.m16373c(AbstractC1230l.m3866b(c1448d.f6025a));
                    }
                    return iM100998F21;
                }
                return i26;
            case 34:
            case 48:
                i26 = i13;
                if (i16 == 2) {
                    AbstractC5147i0 abstractC5147i4 = (AbstractC5147i0) interfaceC5123a0;
                    int iM100998F23 = AbstractC32410a.m100998F(bArr, i26, c1448d);
                    int i58 = c1448d.f6025a + iM100998F23;
                    while (iM100998F23 < i58) {
                        iM100998F23 = AbstractC32410a.m101000H(bArr, iM100998F23, c1448d);
                        abstractC5147i4.m16175c(AbstractC1230l.m3867c(c1448d.f6026b));
                    }
                    if (iM100998F23 == i58) {
                        return iM100998F23;
                    }
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (i16 == 0) {
                    AbstractC5147i0 abstractC5147i5 = (AbstractC5147i0) interfaceC5123a0;
                    int iM101000H3 = AbstractC32410a.m101000H(bArr, i26, c1448d);
                    abstractC5147i5.m16175c(AbstractC1230l.m3867c(c1448d.f6026b));
                    while (iM101000H3 < i14) {
                        int iM100998F24 = AbstractC32410a.m100998F(bArr, iM101000H3, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM101000H3;
                        }
                        iM101000H3 = AbstractC32410a.m101000H(bArr, iM100998F24, c1448d);
                        abstractC5147i5.m16175c(AbstractC1230l.m3867c(c1448d.f6026b));
                    }
                    return iM101000H3;
                }
                return i26;
            case 49:
                if (i16 == 3) {
                    InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i17);
                    int i59 = (i15 & (-8)) | 4;
                    Object objMo16115d = interfaceC5124a1M16337p.mo16115d();
                    C5173r0 c5173r0 = (C5173r0) interfaceC5124a1M16337p;
                    int iM16319F = c5173r0.m16319F(objMo16115d, bArr, i13, i14, i59, c1448d);
                    c1448d.f6027c = objMo16115d;
                    interfaceC5124a1M16337p.mo16113b(objMo16115d);
                    c1448d.f6027c = objMo16115d;
                    interfaceC5123a0.add(objMo16115d);
                    while (iM16319F < i14) {
                        int iM100998F25 = AbstractC32410a.m100998F(bArr, iM16319F, c1448d);
                        if (i15 != c1448d.f6025a) {
                            return iM16319F;
                        }
                        Object objMo16115d2 = interfaceC5124a1M16337p.mo16115d();
                        iM16319F = c5173r0.m16319F(objMo16115d2, bArr, iM100998F25, i14, i59, c1448d);
                        c1448d.f6027c = objMo16115d2;
                        interfaceC5124a1M16337p.mo16113b(objMo16115d2);
                        c1448d.f6027c = objMo16115d2;
                        interfaceC5123a0.add(objMo16115d2);
                    }
                    return iM16319F;
                }
            default:
                return i13;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m16322I(Object obj, long j7, C5155l c5155l, InterfaceC5124a1 interfaceC5124a1, C5167p c5167p) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo3823D;
        List listMo16171c = this.f21578k.mo16171c(j7, obj);
        AbstractC1230l abstractC1230l = c5155l.f21536a;
        int i13 = c5155l.f21537b;
        if ((i13 & 7) != 3) {
            int i14 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            Object objMo16115d = interfaceC5124a1.mo16115d();
            c5155l.m16221c(objMo16115d, interfaceC5124a1, c5167p);
            interfaceC5124a1.mo16113b(objMo16115d);
            listMo16171c.add(objMo16115d);
            if (abstractC1230l.mo3836e() || c5155l.f21539d != 0) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == i13);
        c5155l.f21539d = iMo3823D;
    }

    /* JADX INFO: renamed from: J */
    public final void m16323J(Object obj, int i13, C5155l c5155l, InterfaceC5124a1 interfaceC5124a1, C5167p c5167p) throws InvalidProtocolBufferException {
        int iMo3823D;
        List listMo16171c = this.f21578k.mo16171c(i13 & 1048575, obj);
        AbstractC1230l abstractC1230l = c5155l.f21536a;
        int i14 = c5155l.f21537b;
        if ((i14 & 7) != 2) {
            int i15 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            Object objMo16115d = interfaceC5124a1.mo16115d();
            c5155l.m16222d(objMo16115d, interfaceC5124a1, c5167p);
            interfaceC5124a1.mo16113b(objMo16115d);
            listMo16171c.add(objMo16115d);
            if (abstractC1230l.mo3836e() || c5155l.f21539d != 0) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == i14);
        c5155l.f21539d = iMo3823D;
    }

    /* JADX INFO: renamed from: K */
    public final void m16324K(Object obj, int i13, C5155l c5155l) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i13) != 0) {
            c5155l.m16241w(2);
            AbstractC5160m1.m16292p(i13 & 1048575, obj, c5155l.f21536a.mo3822C());
        } else if (!this.f21573f) {
            AbstractC5160m1.m16292p(i13 & 1048575, obj, c5155l.m16224f());
        } else {
            c5155l.m16241w(2);
            AbstractC5160m1.m16292p(i13 & 1048575, obj, c5155l.f21536a.mo3821B());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m16325L(Object obj, int i13, C5155l c5155l) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i14 = 536870912 & i13;
        AbstractC5144h0 abstractC5144h0 = this.f21578k;
        if (i14 != 0) {
            c5155l.m16237s(abstractC5144h0.mo16171c(i13 & 1048575, obj), true);
        } else {
            c5155l.m16237s(abstractC5144h0.mo16171c(i13 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m16326N(int i13, Object obj) {
        int i14 = this.f21568a[i13 + 2];
        long j7 = 1048575 & i14;
        if (j7 == 1048575) {
            return;
        }
        AbstractC5160m1.m16290n(j7, obj, (1 << (i14 >>> 20)) | AbstractC5160m1.f21551c.m16247g(j7, obj));
    }

    /* JADX INFO: renamed from: O */
    public final void m16327O(int i13, int i14, Object obj) {
        AbstractC5160m1.m16290n(this.f21568a[i14 + 2] & 1048575, obj, i13);
    }

    /* JADX INFO: renamed from: P */
    public final int m16328P(int i13, int i14) {
        int[] iArr = this.f21568a;
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

    /* JADX INFO: renamed from: Q */
    public final void m16329Q(int i13, Object obj, Object obj2) {
        f21567o.putObject(obj, m16331T(i13) & 1048575, obj2);
        m16326N(i13, obj);
    }

    /* JADX INFO: renamed from: R */
    public final void m16330R(Object obj, int i13, Object obj2, int i14) {
        f21567o.putObject(obj, m16331T(i14) & 1048575, obj2);
        m16327O(i13, i14, obj);
    }

    /* JADX INFO: renamed from: T */
    public final int m16331T(int i13) {
        return this.f21568a[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[PHI: r4
      0x0064: PHI (r4v70 int) = 
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v59 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
     binds: [B:16:0x0061, B:244:0x0740, B:245:0x0742, B:219:0x0697, B:220:0x0699, B:72:0x01b5, B:46:0x0124, B:43:0x0111, B:44:0x0113, B:40:0x0100, B:41:0x0102, B:38:0x00ec, B:34:0x00d2, B:31:0x00c0, B:32:0x00c2, B:28:0x00ae, B:29:0x00b0, B:25:0x0093, B:26:0x0095, B:22:0x007d, B:23:0x007f, B:19:0x006b, B:20:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x06bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final void m16332U(Object obj, C5153k0 c5153k0) throws CodedOutputStream$OutOfSpaceException {
        char c3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        C5173r0 c5173r0 = this;
        int[] iArr = c5173r0.f21568a;
        int length = iArr.length;
        Unsafe unsafe = f21567o;
        int i25 = 1048575;
        int i26 = 1048575;
        int i27 = 0;
        int i28 = 0;
        while (i27 < length) {
            int iM16331T = c5173r0.m16331T(i27);
            int i29 = iArr[i27];
            int iM16314S = m16314S(iM16331T);
            if (iM16314S <= 17) {
                int i34 = iArr[i27 + 2];
                c3 = 1;
                int i35 = i34 & i25;
                if (i35 != i26) {
                    i28 = i35 == i25 ? 0 : unsafe.getInt(obj, i35);
                    i26 = i35;
                } else {
                    i25 = i25;
                }
                int i36 = i28;
                i13 = i26;
                i14 = i36;
                i15 = 1 << (i34 >>> 20);
            } else {
                i25 = i25;
                c3 = 1;
                int i37 = i28;
                i13 = i26;
                i14 = i37;
                i15 = 0;
            }
            long j7 = iM16331T & i25;
            int[] iArr2 = iArr;
            int i38 = 2;
            switch (iM16314S) {
                case 0:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        double dMo16188e = AbstractC5160m1.f21551c.mo16188e(j7, obj);
                        C5158m c5158m = (C5158m) c5153k0.f21535a;
                        c5158m.getClass();
                        c5158m.m16271v0(i29, Double.doubleToRawLongBits(dMo16188e));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 1:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        float fMo16189f = AbstractC5160m1.f21551c.mo16189f(j7, obj);
                        C5158m c5158m2 = (C5158m) c5153k0.f21535a;
                        c5158m2.getClass();
                        c5158m2.m16269t0(i29, Float.floatToRawIntBits(fMo16189f));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 2:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16213g(i29, unsafe.getLong(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 3:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        ((C5158m) c5153k0.f21535a).m16264A0(i29, unsafe.getLong(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 4:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        int i39 = unsafe.getInt(obj, j7);
                        C5158m c5158m3 = (C5158m) c5153k0.f21535a;
                        c5158m3.m16274y0(i29, 0);
                        c5158m3.m16273x0(i39);
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 5:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16211e(i29, unsafe.getLong(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 6:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16210d(i29, unsafe.getInt(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 7:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        boolean zMo16186c = AbstractC5160m1.f21551c.mo16186c(j7, obj);
                        C5158m c5158m4 = (C5158m) c5153k0.f21535a;
                        c5158m4.m16274y0(i29, 0);
                        c5158m4.m16267r0(zMo16186c ? (byte) 1 : (byte) 0);
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 8:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            String str = (String) object;
                            C5158m c5158m5 = (C5158m) c5153k0.f21535a;
                            c5158m5.m16274y0(i29, 2);
                            int i44 = c5158m5.f21547d;
                            byte[] bArr = c5158m5.f21546c;
                            int i45 = c5158m5.f21548e;
                            try {
                                int iM16260n0 = C5158m.m16260n0(str.length() * 3);
                                int iM16260n1 = C5158m.m16260n0(str.length());
                                if (iM16260n1 == iM16260n0) {
                                    int i46 = i45 + iM16260n1;
                                    c5158m5.f21548e = i46;
                                    int iMo16296H = AbstractC5169p1.f21562a.mo16296H(str, bArr, i46, i44 - i46);
                                    c5158m5.f21548e = i45;
                                    c5158m5.m16275z0((iMo16296H - i45) - iM16260n1);
                                    c5158m5.f21548e = iMo16296H;
                                } else {
                                    c5158m5.m16275z0(AbstractC5169p1.m16302c(str));
                                    int i47 = c5158m5.f21548e;
                                    c5158m5.f21548e = AbstractC5169p1.f21562a.mo16296H(str, bArr, i47, i44 - i47);
                                }
                            } catch (C5166o1 e5) {
                                c5158m5.f21548e = i45;
                                C5158m.f21543f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                                byte[] bytes = str.getBytes(AbstractC5126b0.f21479a);
                                try {
                                    c5158m5.m16275z0(bytes.length);
                                    c5158m5.m16268s0(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e13) {
                                    throw new CodedOutputStream$OutOfSpaceException(e13);
                                }
                                break;
                            } catch (IndexOutOfBoundsException e14) {
                                throw new CodedOutputStream$OutOfSpaceException(e14);
                            }
                        } else {
                            c5153k0.m16208b(i29, (AbstractC5146i) object);
                        }
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 9:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16214h(i29, unsafe.getObject(obj, j7), c5173r0.m16337p(i27));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 10:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16208b(i29, (AbstractC5146i) unsafe.getObject(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 11:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        int i48 = unsafe.getInt(obj, j7);
                        C5158m c5158m6 = (C5158m) c5153k0.f21535a;
                        c5158m6.m16274y0(i29, 0);
                        c5158m6.m16275z0(i48);
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 12:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        int i49 = unsafe.getInt(obj, j7);
                        C5158m c5158m7 = (C5158m) c5153k0.f21535a;
                        c5158m7.m16274y0(i29, 0);
                        c5158m7.m16273x0(i49);
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 13:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        ((C5158m) c5153k0.f21535a).m16269t0(i29, unsafe.getInt(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 14:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        ((C5158m) c5153k0.f21535a).m16271v0(i29, unsafe.getLong(obj, j7));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 15:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        int i54 = unsafe.getInt(obj, j7);
                        C5158m c5158m8 = (C5158m) c5153k0.f21535a;
                        c5158m8.m16274y0(i29, 0);
                        c5158m8.m16275z0((i54 >> 31) ^ (i54 << 1));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 16:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        long j13 = unsafe.getLong(obj, j7);
                        ((C5158m) c5153k0.f21535a).m16264A0(i29, (j13 >> 63) ^ (j13 << 1));
                    }
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c5173r0.m16339r(obj, i27, i13, i14, i15)) {
                        c5153k0.m16212f(i29, unsafe.getObject(obj, j7), c5173r0.m16337p(i27));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    AbstractC5127b1.m16137m(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC5127b1.m16141q(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 20:
                    AbstractC5127b1.m16143s(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 21:
                    AbstractC5127b1.m16149y(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    AbstractC5127b1.m16142r(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    AbstractC5127b1.m16140p(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 24:
                    AbstractC5127b1.m16139o(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 25:
                    AbstractC5127b1.m16136l(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    c5173r0 = this;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 26:
                    int i55 = i13;
                    int i56 = iArr2[i27];
                    List list = (List) unsafe.getObject(obj, j7);
                    Class cls = AbstractC5127b1.f21481a;
                    if (list == null || list.isEmpty()) {
                        i16 = i27;
                        i17 = i14;
                    } else {
                        C5158m c5158m9 = (C5158m) c5153k0.f21535a;
                        if (list instanceof InterfaceC5135e0) {
                            InterfaceC5135e0 interfaceC5135e0 = (InterfaceC5135e0) list;
                            int i57 = 0;
                            while (i57 < list.size()) {
                                Object objMo16157x = interfaceC5135e0.mo16157x(i57);
                                if (objMo16157x instanceof String) {
                                    String str2 = (String) objMo16157x;
                                    c5158m9.m16274y0(i56, i38);
                                    int i58 = c5158m9.f21547d;
                                    byte[] bArr2 = c5158m9.f21546c;
                                    int i59 = c5158m9.f21548e;
                                    try {
                                        try {
                                            int iM16260n2 = C5158m.m16260n0(str2.length() * 3);
                                            i18 = i27;
                                            try {
                                                int iM16260n3 = C5158m.m16260n0(str2.length());
                                                if (iM16260n3 == iM16260n2) {
                                                    int i64 = i59 + iM16260n3;
                                                    c5158m9.f21548e = i64;
                                                    i19 = i14;
                                                    try {
                                                        int iMo16296H2 = AbstractC5169p1.f21562a.mo16296H(str2, bArr2, i64, i58 - i64);
                                                        c5158m9.f21548e = i59;
                                                        c5158m9.m16275z0((iMo16296H2 - i59) - iM16260n3);
                                                        c5158m9.f21548e = iMo16296H2;
                                                    } catch (C5166o1 e15) {
                                                        e = e15;
                                                        c5158m9.f21548e = i59;
                                                        C5158m.f21543f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                                        byte[] bytes2 = str2.getBytes(AbstractC5126b0.f21479a);
                                                        try {
                                                            c5158m9.m16275z0(bytes2.length);
                                                            c5158m9.m16268s0(bytes2, 0, bytes2.length);
                                                        } catch (IndexOutOfBoundsException e16) {
                                                            throw new CodedOutputStream$OutOfSpaceException(e16);
                                                        }
                                                    }
                                                } else {
                                                    i19 = i14;
                                                    c5158m9.m16275z0(AbstractC5169p1.m16302c(str2));
                                                    int i65 = c5158m9.f21548e;
                                                    c5158m9.f21548e = AbstractC5169p1.f21562a.mo16296H(str2, bArr2, i65, i58 - i65);
                                                }
                                            } catch (C5166o1 e17) {
                                                e = e17;
                                                i19 = i14;
                                                c5158m9.f21548e = i59;
                                                C5158m.f21543f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                                byte[] bytes3 = str2.getBytes(AbstractC5126b0.f21479a);
                                                c5158m9.m16275z0(bytes3.length);
                                                c5158m9.m16268s0(bytes3, 0, bytes3.length);
                                                i57++;
                                                i27 = i18;
                                                i14 = i19;
                                                i38 = 2;
                                            }
                                        } catch (C5166o1 e18) {
                                            e = e18;
                                            i18 = i27;
                                        }
                                    } catch (IndexOutOfBoundsException e19) {
                                        throw new CodedOutputStream$OutOfSpaceException(e19);
                                    }
                                } else {
                                    i18 = i27;
                                    i19 = i14;
                                    AbstractC5146i abstractC5146i = (AbstractC5146i) objMo16157x;
                                    c5158m9.m16274y0(i56, 2);
                                    c5158m9.m16275z0(abstractC5146i.size());
                                    C5143h c5143h = (C5143h) abstractC5146i;
                                    c5158m9.m16268s0(c5143h.f21510z, c5143h.mo16167j(), c5143h.size());
                                }
                                i57++;
                                i27 = i18;
                                i14 = i19;
                                i38 = 2;
                            }
                            i16 = i27;
                            i17 = i14;
                        } else {
                            i16 = i27;
                            i17 = i14;
                            for (int i66 = 0; i66 < list.size(); i66++) {
                                String str3 = (String) list.get(i66);
                                c5158m9.m16274y0(i56, 2);
                                int i67 = c5158m9.f21547d;
                                byte[] bArr3 = c5158m9.f21546c;
                                int i68 = c5158m9.f21548e;
                                try {
                                    int iM16260n4 = C5158m.m16260n0(str3.length() * 3);
                                    int iM16260n5 = C5158m.m16260n0(str3.length());
                                    if (iM16260n5 == iM16260n4) {
                                        int i69 = i68 + iM16260n5;
                                        c5158m9.f21548e = i69;
                                        int iMo16296H3 = AbstractC5169p1.f21562a.mo16296H(str3, bArr3, i69, i67 - i69);
                                        c5158m9.f21548e = i68;
                                        c5158m9.m16275z0((iMo16296H3 - i68) - iM16260n5);
                                        c5158m9.f21548e = iMo16296H3;
                                    } else {
                                        c5158m9.m16275z0(AbstractC5169p1.m16302c(str3));
                                        int i74 = c5158m9.f21548e;
                                        c5158m9.f21548e = AbstractC5169p1.f21562a.mo16296H(str3, bArr3, i74, i67 - i74);
                                    }
                                } catch (C5166o1 e22) {
                                    c5158m9.f21548e = i68;
                                    C5158m.f21543f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e22);
                                    byte[] bytes4 = str3.getBytes(AbstractC5126b0.f21479a);
                                    try {
                                        c5158m9.m16275z0(bytes4.length);
                                        c5158m9.m16268s0(bytes4, 0, bytes4.length);
                                    } catch (IndexOutOfBoundsException e24) {
                                        throw new CodedOutputStream$OutOfSpaceException(e24);
                                    }
                                } catch (IndexOutOfBoundsException e25) {
                                    throw new CodedOutputStream$OutOfSpaceException(e25);
                                }
                            }
                        }
                    }
                    c5173r0 = this;
                    i13 = i55;
                    i27 = i16;
                    i14 = i17;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 27:
                    i24 = i13;
                    int i75 = iArr2[i27];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    InterfaceC5124a1 interfaceC5124a1M16337p = c5173r0.m16337p(i27);
                    Class cls2 = AbstractC5127b1.f21481a;
                    if (list2 != null && !list2.isEmpty()) {
                        c5153k0.getClass();
                        for (int i76 = 0; i76 < list2.size(); i76++) {
                            c5153k0.m16214h(i75, list2.get(i76), interfaceC5124a1M16337p);
                        }
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 28:
                    i24 = i13;
                    int i77 = iArr2[i27];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    Class cls3 = AbstractC5127b1.f21481a;
                    if (list3 != null && !list3.isEmpty()) {
                        c5153k0.getClass();
                        for (int i78 = 0; i78 < list3.size(); i78++) {
                            C5158m c5158m10 = (C5158m) c5153k0.f21535a;
                            AbstractC5146i abstractC5146i2 = (AbstractC5146i) list3.get(i78);
                            c5158m10.m16274y0(i77, 2);
                            c5158m10.m16275z0(abstractC5146i2.size());
                            C5143h c5143h2 = (C5143h) abstractC5146i2;
                            c5158m10.m16268s0(c5143h2.f21510z, c5143h2.mo16167j(), c5143h2.size());
                        }
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 29:
                    AbstractC5127b1.m16148x(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 30:
                    AbstractC5127b1.m16138n(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 31:
                    AbstractC5127b1.m16144t(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 32:
                    AbstractC5127b1.m16145u(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 33:
                    AbstractC5127b1.m16146v(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 34:
                    AbstractC5127b1.m16147w(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, false);
                    i13 = i13;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 35:
                    i24 = i13;
                    AbstractC5127b1.m16137m(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 36:
                    i24 = i13;
                    AbstractC5127b1.m16141q(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 37:
                    i24 = i13;
                    AbstractC5127b1.m16143s(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 38:
                    i24 = i13;
                    AbstractC5127b1.m16149y(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 39:
                    i24 = i13;
                    AbstractC5127b1.m16142r(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 40:
                    i24 = i13;
                    AbstractC5127b1.m16140p(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 41:
                    i24 = i13;
                    AbstractC5127b1.m16139o(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 42:
                    i24 = i13;
                    AbstractC5127b1.m16136l(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 43:
                    i24 = i13;
                    AbstractC5127b1.m16148x(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 44:
                    i24 = i13;
                    AbstractC5127b1.m16138n(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 45:
                    i24 = i13;
                    AbstractC5127b1.m16144t(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 46:
                    i24 = i13;
                    AbstractC5127b1.m16145u(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 47:
                    i24 = i13;
                    AbstractC5127b1.m16146v(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 48:
                    i24 = i13;
                    AbstractC5127b1.m16147w(iArr2[i27], (List) unsafe.getObject(obj, j7), c5153k0, c3);
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 49:
                    i24 = i13;
                    int i79 = iArr2[i27];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    InterfaceC5124a1 interfaceC5124a1M16337p2 = c5173r0.m16337p(i27);
                    Class cls4 = AbstractC5127b1.f21481a;
                    if (list4 != null && !list4.isEmpty()) {
                        c5153k0.getClass();
                        for (int i83 = 0; i83 < list4.size(); i83++) {
                            c5153k0.m16212f(i79, list4.get(i83), interfaceC5124a1M16337p2);
                        }
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 50:
                    i24 = i13;
                    if (unsafe.getObject(obj, j7) != null) {
                        Object objM16336o = c5173r0.m16336o(i27);
                        c5173r0.f21580m.getClass();
                        AbstractC30802r.m94771t(objM16336o);
                        throw null;
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 51:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        double dDoubleValue = ((Double) AbstractC5160m1.f21551c.m16249i(j7, obj)).doubleValue();
                        C5158m c5158m11 = (C5158m) c5153k0.f21535a;
                        c5158m11.getClass();
                        c5158m11.m16271v0(i29, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 52:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        float fFloatValue = ((Float) AbstractC5160m1.f21551c.m16249i(j7, obj)).floatValue();
                        C5158m c5158m12 = (C5158m) c5153k0.f21535a;
                        c5158m12.getClass();
                        c5158m12.m16269t0(i29, Float.floatToRawIntBits(fFloatValue));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 53:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16213g(i29, m16312D(j7, obj));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 54:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        ((C5158m) c5153k0.f21535a).m16264A0(i29, m16312D(j7, obj));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 55:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        int iM16311C = m16311C(j7, obj);
                        C5158m c5158m13 = (C5158m) c5153k0.f21535a;
                        c5158m13.m16274y0(i29, 0);
                        c5158m13.m16273x0(iM16311C);
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 56:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16211e(i29, m16312D(j7, obj));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 57:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16210d(i29, m16311C(j7, obj));
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 58:
                    i24 = i13;
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        boolean zBooleanValue = ((Boolean) AbstractC5160m1.f21551c.m16249i(j7, obj)).booleanValue();
                        C5158m c5158m14 = (C5158m) c5153k0.f21535a;
                        c5158m14.m16274y0(i29, 0);
                        c5158m14.m16267r0(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i13 = i24;
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 59:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof String) {
                            String str4 = (String) object2;
                            C5158m c5158m15 = (C5158m) c5153k0.f21535a;
                            c5158m15.m16274y0(i29, 2);
                            int i84 = c5158m15.f21547d;
                            byte[] bArr4 = c5158m15.f21546c;
                            int i85 = c5158m15.f21548e;
                            try {
                                try {
                                    int iM16260n6 = C5158m.m16260n0(str4.length() * 3);
                                    int iM16260n7 = C5158m.m16260n0(str4.length());
                                    if (iM16260n7 == iM16260n6) {
                                        int i86 = i85 + iM16260n7;
                                        c5158m15.f21548e = i86;
                                        i24 = i13;
                                        try {
                                            int iMo16296H4 = AbstractC5169p1.f21562a.mo16296H(str4, bArr4, i86, i84 - i86);
                                            c5158m15.f21548e = i85;
                                            c5158m15.m16275z0((iMo16296H4 - i85) - iM16260n7);
                                            c5158m15.f21548e = iMo16296H4;
                                        } catch (C5166o1 e26) {
                                            e = e26;
                                            c5158m15.f21548e = i85;
                                            C5158m.f21543f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                            byte[] bytes5 = str4.getBytes(AbstractC5126b0.f21479a);
                                            try {
                                                c5158m15.m16275z0(bytes5.length);
                                                c5158m15.m16268s0(bytes5, 0, bytes5.length);
                                            } catch (IndexOutOfBoundsException e27) {
                                                throw new CodedOutputStream$OutOfSpaceException(e27);
                                            }
                                        }
                                    } else {
                                        i24 = i13;
                                        c5158m15.m16275z0(AbstractC5169p1.m16302c(str4));
                                        int i87 = c5158m15.f21548e;
                                        c5158m15.f21548e = AbstractC5169p1.f21562a.mo16296H(str4, bArr4, i87, i84 - i87);
                                    }
                                } catch (C5166o1 e28) {
                                    e = e28;
                                    i24 = i13;
                                }
                            } catch (IndexOutOfBoundsException e29) {
                                throw new CodedOutputStream$OutOfSpaceException(e29);
                            }
                        } else {
                            i24 = i13;
                            c5153k0.m16208b(i29, (AbstractC5146i) object2);
                        }
                        i13 = i24;
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 60:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16214h(i29, unsafe.getObject(obj, j7), c5173r0.m16337p(i27));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 61:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16208b(i29, (AbstractC5146i) unsafe.getObject(obj, j7));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 62:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        int iM16311C2 = m16311C(j7, obj);
                        C5158m c5158m16 = (C5158m) c5153k0.f21535a;
                        c5158m16.m16274y0(i29, 0);
                        c5158m16.m16275z0(iM16311C2);
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 63:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        int iM16311C3 = m16311C(j7, obj);
                        C5158m c5158m17 = (C5158m) c5153k0.f21535a;
                        c5158m17.m16274y0(i29, 0);
                        c5158m17.m16273x0(iM16311C3);
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 64:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        ((C5158m) c5153k0.f21535a).m16269t0(i29, m16311C(j7, obj));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 65:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        ((C5158m) c5153k0.f21535a).m16271v0(i29, m16312D(j7, obj));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 66:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        int iM16311C4 = m16311C(j7, obj);
                        C5158m c5158m18 = (C5158m) c5153k0.f21535a;
                        c5158m18.m16274y0(i29, 0);
                        c5158m18.m16275z0((iM16311C4 >> 31) ^ (iM16311C4 << 1));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 67:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        long jM16312D = m16312D(j7, obj);
                        ((C5158m) c5153k0.f21535a).m16264A0(i29, (jM16312D >> 63) ^ (jM16312D << c3));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                case 68:
                    if (c5173r0.m16340t(i29, i27, obj)) {
                        c5153k0.m16212f(i29, unsafe.getObject(obj, j7), c5173r0.m16337p(i27));
                    }
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
                default:
                    i27 += 3;
                    i26 = i13;
                    i28 = i14;
                    i25 = i25;
                    iArr = iArr2;
                    break;
            }
        }
        ((C5136e1) c5173r0.f21579l).getClass();
        ((AbstractC5184x) obj).unknownFields.m16162e(c5153k0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: a */
    public final void mo16112a(Object obj, Object obj2) {
        Object obj3;
        m16315l(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f21568a;
            if (i13 >= iArr.length) {
                AbstractC5127b1.m16134j(this.f21579l, obj, obj2);
                return;
            }
            int iM16331T = m16331T(i13);
            long j7 = 1048575 & iM16331T;
            int i14 = iArr[i13];
            switch (m16314S(iM16331T)) {
                case 0:
                    if (!m16338q(i13, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC5157l1 abstractC5157l1 = AbstractC5160m1.f21551c;
                        obj3 = obj;
                        abstractC5157l1.mo16192m(obj3, j7, abstractC5157l1.mo16188e(j7, obj2));
                        m16326N(i13, obj3);
                    }
                    break;
                case 1:
                    if (m16338q(i13, obj2)) {
                        AbstractC5157l1 abstractC5157l2 = AbstractC5160m1.f21551c;
                        abstractC5157l2.mo16193n(obj, j7, abstractC5157l2.mo16189f(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16291o(obj, j7, AbstractC5160m1.f21551c.m16248h(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16291o(obj, j7, AbstractC5160m1.f21551c.m16248h(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16291o(obj, j7, AbstractC5160m1.f21551c.m16248h(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m16338q(i13, obj2)) {
                        AbstractC5157l1 abstractC5157l3 = AbstractC5160m1.f21551c;
                        abstractC5157l3.mo16190k(obj, j7, abstractC5157l3.mo16186c(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16292p(j7, obj, AbstractC5160m1.f21551c.m16249i(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m16342v(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16292p(j7, obj, AbstractC5160m1.f21551c.m16249i(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16291o(obj, j7, AbstractC5160m1.f21551c.m16248h(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16290n(j7, obj, AbstractC5160m1.f21551c.m16247g(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m16338q(i13, obj2)) {
                        AbstractC5160m1.m16291o(obj, j7, AbstractC5160m1.f21551c.m16248h(j7, obj2));
                        m16326N(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m16342v(i13, obj, obj2);
                    obj3 = obj;
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
                    this.f21578k.mo16170b(j7, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC5127b1.f21481a;
                    AbstractC5157l1 abstractC5157l4 = AbstractC5160m1.f21551c;
                    Object objM16249i = abstractC5157l4.m16249i(j7, obj);
                    Object objM16249i2 = abstractC5157l4.m16249i(j7, obj2);
                    this.f21580m.getClass();
                    AbstractC5160m1.m16292p(j7, obj, C5159m0.m16276a(objM16249i, objM16249i2));
                    obj3 = obj;
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
                    if (m16340t(i14, i13, obj2)) {
                        AbstractC5160m1.m16292p(j7, obj, AbstractC5160m1.f21551c.m16249i(j7, obj2));
                        m16327O(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m16343w(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m16340t(i14, i13, obj2)) {
                        AbstractC5160m1.m16292p(j7, obj, AbstractC5160m1.f21551c.m16249i(j7, obj2));
                        m16327O(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m16343w(i13, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i13 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: b */
    public final void mo16113b(Object obj) {
        if (m16316s(obj)) {
            if (obj instanceof AbstractC5184x) {
                AbstractC5184x abstractC5184x = (AbstractC5184x) obj;
                abstractC5184x.m16368x(Integer.MAX_VALUE);
                abstractC5184x.memoizedHashCode = 0;
                abstractC5184x.m16365q();
            }
            int[] iArr = this.f21568a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iM16331T = m16331T(i13);
                long j7 = 1048575 & iM16331T;
                int iM16314S = m16314S(iM16331T);
                if (iM16314S != 9) {
                    if (iM16314S != 60 && iM16314S != 68) {
                        switch (iM16314S) {
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                if (m16338q(i13, obj)) {
                                    m16337p(i13).mo16113b(f21567o.getObject(obj, j7));
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
                                this.f21578k.mo16169a(j7, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f21567o;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    this.f21580m.getClass();
                                    ((C5156l0) object).f21541w = false;
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (m16340t(iArr[i13], i13, obj)) {
                        m16337p(i13).mo16113b(f21567o.getObject(obj, j7));
                    }
                } else if (m16338q(i13, obj)) {
                    m16337p(i13).mo16113b(f21567o.getObject(obj, j7));
                }
            }
            ((C5136e1) this.f21579l).getClass();
            C5133d1 c5133d1 = ((AbstractC5184x) obj).unknownFields;
            if (c5133d1.f21504e) {
                c5133d1.f21504e = false;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: c */
    public final boolean mo16114c(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f21575h) {
            int i18 = this.f21574g[i17];
            int[] iArr = this.f21568a;
            int i19 = iArr[i18];
            int iM16331T = m16331T(i18);
            int i24 = iArr[i18 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i15) {
                if (i25 != 1048575) {
                    i16 = f21567o.getInt(obj, i25);
                }
                i14 = i16;
                i13 = i25;
            } else {
                int i27 = i16;
                i13 = i15;
                i14 = i27;
            }
            if ((268435456 & iM16331T) == 0 || m16339r(obj, i18, i13, i14, i26)) {
                int iM16314S = m16314S(iM16331T);
                if (iM16314S == 9 || iM16314S == 17) {
                    if (m16339r(obj, i18, i13, i14, i26)) {
                        if (!m16337p(i18).mo16114c(AbstractC5160m1.f21551c.m16249i(iM16331T & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i17++;
                    i15 = i13;
                    i16 = i14;
                } else {
                    if (iM16314S != 27) {
                        if (iM16314S == 60 || iM16314S == 68) {
                            if (m16340t(i19, i18, obj)) {
                                if (!m16337p(i18).mo16114c(AbstractC5160m1.f21551c.m16249i(iM16331T & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iM16314S != 49) {
                            if (iM16314S != 50) {
                                continue;
                            } else {
                                Object objM16249i = AbstractC5160m1.f21551c.m16249i(iM16331T & 1048575, obj);
                                this.f21580m.getClass();
                                if (!((C5156l0) objM16249i).isEmpty()) {
                                    AbstractC30802r.m94771t(m16336o(i18));
                                    throw null;
                                }
                            }
                        }
                        i17++;
                        i15 = i13;
                        i16 = i14;
                    }
                    List list = (List) AbstractC5160m1.f21551c.m16249i(iM16331T & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i18);
                        for (int i28 = 0; i28 < list.size(); i28++) {
                            if (interfaceC5124a1M16337p.mo16114c(list.get(i28))) {
                            }
                        }
                    }
                    i17++;
                    i15 = i13;
                    i16 = i14;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: d */
    public final Object mo16115d() {
        this.f21577j.getClass();
        return ((AbstractC5184x) this.f21572e).m16367s();
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0382  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: e */
    public final int mo16116e(AbstractC5184x abstractC5184x) {
        int i13;
        int iM16259m0;
        int iM16259m1;
        int iM16259m2;
        int iM16262p0;
        int iM16261o0;
        int iM16259m3;
        int iM16257k0;
        int iM16256j0;
        int iM16259m4;
        int iMo16105b;
        int iM16260n0;
        int iM16259m5;
        int iMo16105b2;
        int iM16127c;
        int iM16259m6;
        int size;
        int iM16133i;
        int iM16259m7;
        int iM16259m8;
        int size2;
        int iM16259m9;
        int iM16260n1;
        int iMo16105b3;
        int iM16259m10;
        int iM16259m11;
        int iM16262p1;
        int iM16259m12;
        int iM16257k1;
        int i14;
        C5173r0 c5173r0 = this;
        AbstractC5184x abstractC5184x2 = abstractC5184x;
        Unsafe unsafe = f21567o;
        int i15 = 0;
        int i16 = 0;
        int iM16258l0 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = c5173r0.f21568a;
            if (i15 >= iArr.length) {
                ((C5136e1) c5173r0.f21579l).getClass();
                return abstractC5184x2.unknownFields.m16160b() + iM16258l0;
            }
            int iM16331T = c5173r0.m16331T(i15);
            int iM16314S = m16314S(iM16331T);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i24 = i19 & 1048575;
            if (iM16314S <= 17) {
                if (i24 != i17) {
                    i16 = i24 == 1048575 ? 0 : unsafe.getInt(abstractC5184x2, i24);
                    i17 = i24;
                }
                i13 = 1 << (i19 >>> 20);
            } else {
                i13 = 0;
            }
            long j7 = iM16331T & 1048575;
            if (iM16314S >= EnumC5174s.f21582x.f21585w) {
                int i25 = EnumC5174s.f21583y.f21585w;
            }
            switch (iM16314S) {
                case 0:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16259m0 = C5158m.m16259m0(i18);
                        iM16127c = iM16259m0 + 8;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 1:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16259m1 = C5158m.m16259m0(i18);
                        iM16256j0 = iM16259m1 + 4;
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 2:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        long j13 = unsafe.getLong(abstractC5184x2, j7);
                        iM16259m2 = C5158m.m16259m0(i18);
                        iM16262p0 = C5158m.m16262p0(j13);
                        iM16258l0 += iM16262p0 + iM16259m2;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 3:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16261o0 = C5158m.m16261o0(i18, unsafe.getLong(abstractC5184x2, j7));
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 4:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        int i26 = unsafe.getInt(abstractC5184x2, j7);
                        iM16259m3 = C5158m.m16259m0(i18);
                        iM16257k0 = C5158m.m16257k0(i26);
                        iM16261o0 = iM16257k0 + iM16259m3;
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 5:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16256j0 = C5158m.m16256j0(i18);
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 6:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16256j0 = C5158m.m16255i0(i18);
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 7:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16256j0 = C5158m.m16259m0(i18) + 1;
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 8:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        Object object = unsafe.getObject(abstractC5184x2, j7);
                        if (object instanceof AbstractC5146i) {
                            int iM16259m13 = C5158m.m16259m0(i18);
                            int size3 = ((AbstractC5146i) object).size();
                            iM16258l0 = C5158m.m16260n0(size3) + size3 + iM16259m13 + iM16258l0;
                        } else {
                            iM16258l0 = C5158m.m16258l0((String) object) + C5158m.m16259m0(i18) + iM16258l0;
                        }
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 9:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        Object object2 = unsafe.getObject(abstractC5184x2, j7);
                        InterfaceC5124a1 interfaceC5124a1M16337p = c5173r0.m16337p(i15);
                        Class cls = AbstractC5127b1.f21481a;
                        iM16259m4 = C5158m.m16259m0(i18);
                        iMo16105b = ((AbstractC5122a) object2).mo16105b(interfaceC5124a1M16337p);
                        iM16260n0 = C5158m.m16260n0(iMo16105b);
                        i14 = iM16260n0 + iMo16105b + iM16259m4;
                        iM16258l0 += i14;
                    }
                    i15 += 3;
                    break;
                case 10:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16261o0 = C5158m.m16254h0(i18, (AbstractC5146i) unsafe.getObject(abstractC5184x2, j7));
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 11:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        int i27 = unsafe.getInt(abstractC5184x2, j7);
                        iM16259m3 = C5158m.m16259m0(i18);
                        iM16257k0 = C5158m.m16260n0(i27);
                        iM16261o0 = iM16257k0 + iM16259m3;
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 12:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        int i28 = unsafe.getInt(abstractC5184x2, j7);
                        iM16259m3 = C5158m.m16259m0(i18);
                        iM16257k0 = C5158m.m16257k0(i28);
                        iM16261o0 = iM16257k0 + iM16259m3;
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 13:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16259m1 = C5158m.m16259m0(i18);
                        iM16256j0 = iM16259m1 + 4;
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 14:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        iM16256j0 = C5158m.m16259m0(i18) + 8;
                        iM16258l0 += iM16256j0;
                    }
                    c5173r0 = this;
                    abstractC5184x2 = abstractC5184x;
                    i15 += 3;
                    break;
                case 15:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        int i29 = unsafe.getInt(abstractC5184x2, j7);
                        iM16259m3 = C5158m.m16259m0(i18);
                        iM16257k0 = C5158m.m16260n0((i29 >> 31) ^ (i29 << 1));
                        iM16261o0 = iM16257k0 + iM16259m3;
                        iM16258l0 += iM16261o0;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case 16:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        long j14 = unsafe.getLong(abstractC5184x2, j7);
                        iM16259m2 = C5158m.m16259m0(i18);
                        iM16262p0 = C5158m.m16262p0((j14 << 1) ^ (j14 >> 63));
                        iM16258l0 += iM16262p0 + iM16259m2;
                    }
                    c5173r0 = this;
                    i15 += 3;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c5173r0.m16339r(abstractC5184x2, i15, i17, i16, i13)) {
                        AbstractC5122a abstractC5122a = (AbstractC5122a) unsafe.getObject(abstractC5184x2, j7);
                        InterfaceC5124a1 interfaceC5124a1M16337p2 = c5173r0.m16337p(i15);
                        iM16259m5 = C5158m.m16259m0(i18) * 2;
                        iMo16105b2 = abstractC5122a.mo16105b(interfaceC5124a1M16337p2);
                        iM16127c = iMo16105b2 + iM16259m5;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    iM16127c = AbstractC5127b1.m16127c(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    iM16127c = AbstractC5127b1.m16126b(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls2 = AbstractC5127b1.f21481a;
                    if (list.size() == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16259m6 = (C5158m.m16259m0(i18) * list.size()) + AbstractC5127b1.m16129e(list);
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls3 = AbstractC5127b1.f21481a;
                    size = list2.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16133i(list2);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls4 = AbstractC5127b1.f21481a;
                    size = list3.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16128d(list3);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    iM16127c = AbstractC5127b1.m16127c(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case 24:
                    iM16127c = AbstractC5127b1.m16126b(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls5 = AbstractC5127b1.f21481a;
                    int size4 = list4.size();
                    iM16258l0 += size4 == 0 ? 0 : (C5158m.m16259m0(i18) + 1) * size4;
                    i15 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls6 = AbstractC5127b1.f21481a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16259m6 = C5158m.m16259m0(i18) * size5;
                        if (list5 instanceof InterfaceC5135e0) {
                            InterfaceC5135e0 interfaceC5135e0 = (InterfaceC5135e0) list5;
                            for (int i34 = 0; i34 < size5; i34++) {
                                Object objMo16157x = interfaceC5135e0.mo16157x(i34);
                                if (objMo16157x instanceof AbstractC5146i) {
                                    int size6 = ((AbstractC5146i) objMo16157x).size();
                                    iM16259m6 = C5158m.m16260n0(size6) + size6 + iM16259m6;
                                } else {
                                    iM16259m6 = C5158m.m16258l0((String) objMo16157x) + iM16259m6;
                                }
                            }
                        } else {
                            for (int i35 = 0; i35 < size5; i35++) {
                                Object obj = list5.get(i35);
                                if (obj instanceof AbstractC5146i) {
                                    int size7 = ((AbstractC5146i) obj).size();
                                    iM16259m6 = C5158m.m16260n0(size7) + size7 + iM16259m6;
                                } else {
                                    iM16259m6 = C5158m.m16258l0((String) obj) + iM16259m6;
                                }
                            }
                        }
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC5184x2, j7);
                    InterfaceC5124a1 interfaceC5124a1M16337p3 = c5173r0.m16337p(i15);
                    Class cls7 = AbstractC5127b1.f21481a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iM16259m8 = 0;
                    } else {
                        iM16259m8 = C5158m.m16259m0(i18) * size8;
                        for (int i36 = 0; i36 < size8; i36++) {
                            int iMo16105b4 = ((AbstractC5122a) list6.get(i36)).mo16105b(interfaceC5124a1M16337p3);
                            iM16259m8 += C5158m.m16260n0(iMo16105b4) + iMo16105b4;
                        }
                    }
                    iM16258l0 += iM16259m8;
                    i15 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls8 = AbstractC5127b1.f21481a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16259m6 = C5158m.m16259m0(i18) * size9;
                        for (int i37 = 0; i37 < list7.size(); i37++) {
                            int size10 = ((AbstractC5146i) list7.get(i37)).size();
                            iM16259m6 += C5158m.m16260n0(size10) + size10;
                        }
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls9 = AbstractC5127b1.f21481a;
                    size = list8.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16132h(list8);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls10 = AbstractC5127b1.f21481a;
                    size = list9.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16125a(list9);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 31:
                    iM16127c = AbstractC5127b1.m16126b(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case 32:
                    iM16127c = AbstractC5127b1.m16127c(i18, (List) unsafe.getObject(abstractC5184x2, j7));
                    iM16258l0 += iM16127c;
                    i15 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls11 = AbstractC5127b1.f21481a;
                    size = list10.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16130f(list10);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls12 = AbstractC5127b1.f21481a;
                    size = list11.size();
                    if (size == 0) {
                        iM16259m6 = 0;
                    } else {
                        iM16133i = AbstractC5127b1.m16131g(list11);
                        iM16259m7 = C5158m.m16259m0(i18);
                        iM16259m6 = (iM16259m7 * size) + iM16133i;
                    }
                    iM16258l0 += iM16259m6;
                    i15 += 3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls13 = AbstractC5127b1.f21481a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls14 = AbstractC5127b1.f21481a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 37:
                    size2 = AbstractC5127b1.m16129e((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 38:
                    size2 = AbstractC5127b1.m16133i((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 39:
                    size2 = AbstractC5127b1.m16128d((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls15 = AbstractC5127b1.f21481a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls16 = AbstractC5127b1.f21481a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls17 = AbstractC5127b1.f21481a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 43:
                    size2 = AbstractC5127b1.m16132h((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 44:
                    size2 = AbstractC5127b1.m16125a((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls18 = AbstractC5127b1.f21481a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC5184x2, j7);
                    Class cls19 = AbstractC5127b1.f21481a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 47:
                    size2 = AbstractC5127b1.m16130f((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 48:
                    size2 = AbstractC5127b1.m16131g((List) unsafe.getObject(abstractC5184x2, j7));
                    if (size2 > 0) {
                        iM16259m9 = C5158m.m16259m0(i18);
                        iM16260n1 = C5158m.m16260n0(size2);
                        iM16258l0 += iM16260n1 + iM16259m9 + size2;
                    }
                    i15 += 3;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC5184x2, j7);
                    InterfaceC5124a1 interfaceC5124a1M16337p4 = c5173r0.m16337p(i15);
                    Class cls20 = AbstractC5127b1.f21481a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iMo16105b3 = 0;
                    } else {
                        iMo16105b3 = 0;
                        for (int i38 = 0; i38 < size11; i38++) {
                            iMo16105b3 += ((AbstractC5122a) list19.get(i38)).mo16105b(interfaceC5124a1M16337p4) + (C5158m.m16259m0(i18) * 2);
                        }
                    }
                    iM16258l0 += iMo16105b3;
                    i15 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC5184x2, j7);
                    Object objM16336o = c5173r0.m16336o(i15);
                    c5173r0.f21580m.getClass();
                    C5156l0 c5156l0 = (C5156l0) object3;
                    if (objM16336o != null) {
                        throw new ClassCastException();
                    }
                    if (c5156l0.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c5156l0.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i15 += 3;
                    break;
                case 51:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16259m0 = C5158m.m16259m0(i18);
                        iM16127c = iM16259m0 + 8;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 52:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16259m10 = C5158m.m16259m0(i18);
                        iM16127c = iM16259m10 + 4;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 53:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        long jM16312D = m16312D(j7, abstractC5184x2);
                        iM16259m11 = C5158m.m16259m0(i18);
                        iM16262p1 = C5158m.m16262p0(jM16312D);
                        i14 = iM16262p1 + iM16259m11;
                        iM16258l0 += i14;
                    }
                    i15 += 3;
                    break;
                case 54:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16127c = C5158m.m16261o0(i18, m16312D(j7, abstractC5184x2));
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 55:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        int iM16311C = m16311C(j7, abstractC5184x2);
                        iM16259m12 = C5158m.m16259m0(i18);
                        iM16257k1 = C5158m.m16257k0(iM16311C);
                        iM16127c = iM16257k1 + iM16259m12;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 56:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16127c = C5158m.m16256j0(i18);
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 57:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16127c = C5158m.m16255i0(i18);
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 58:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16127c = C5158m.m16259m0(i18) + 1;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 59:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        Object object4 = unsafe.getObject(abstractC5184x2, j7);
                        if (object4 instanceof AbstractC5146i) {
                            int iM16259m14 = C5158m.m16259m0(i18);
                            int size12 = ((AbstractC5146i) object4).size();
                            iM16258l0 = C5158m.m16260n0(size12) + size12 + iM16259m14 + iM16258l0;
                        } else {
                            iM16258l0 = C5158m.m16258l0((String) object4) + C5158m.m16259m0(i18) + iM16258l0;
                        }
                    }
                    i15 += 3;
                    break;
                case 60:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        Object object5 = unsafe.getObject(abstractC5184x2, j7);
                        InterfaceC5124a1 interfaceC5124a1M16337p5 = c5173r0.m16337p(i15);
                        Class cls21 = AbstractC5127b1.f21481a;
                        iM16259m4 = C5158m.m16259m0(i18);
                        iMo16105b = ((AbstractC5122a) object5).mo16105b(interfaceC5124a1M16337p5);
                        iM16260n0 = C5158m.m16260n0(iMo16105b);
                        i14 = iM16260n0 + iMo16105b + iM16259m4;
                        iM16258l0 += i14;
                    }
                    i15 += 3;
                    break;
                case 61:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16127c = C5158m.m16254h0(i18, (AbstractC5146i) unsafe.getObject(abstractC5184x2, j7));
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 62:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        int iM16311C2 = m16311C(j7, abstractC5184x2);
                        iM16259m12 = C5158m.m16259m0(i18);
                        iM16257k1 = C5158m.m16260n0(iM16311C2);
                        iM16127c = iM16257k1 + iM16259m12;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 63:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        int iM16311C3 = m16311C(j7, abstractC5184x2);
                        iM16259m12 = C5158m.m16259m0(i18);
                        iM16257k1 = C5158m.m16257k0(iM16311C3);
                        iM16127c = iM16257k1 + iM16259m12;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 64:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16259m10 = C5158m.m16259m0(i18);
                        iM16127c = iM16259m10 + 4;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 65:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        iM16259m0 = C5158m.m16259m0(i18);
                        iM16127c = iM16259m0 + 8;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 66:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        int iM16311C4 = m16311C(j7, abstractC5184x2);
                        iM16259m12 = C5158m.m16259m0(i18);
                        iM16257k1 = C5158m.m16260n0((iM16311C4 >> 31) ^ (iM16311C4 << 1));
                        iM16127c = iM16257k1 + iM16259m12;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                case 67:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        long jM16312D2 = m16312D(j7, abstractC5184x2);
                        iM16259m11 = C5158m.m16259m0(i18);
                        iM16262p1 = C5158m.m16262p0((jM16312D2 << 1) ^ (jM16312D2 >> 63));
                        i14 = iM16262p1 + iM16259m11;
                        iM16258l0 += i14;
                    }
                    i15 += 3;
                    break;
                case 68:
                    if (c5173r0.m16340t(i18, i15, abstractC5184x2)) {
                        AbstractC5122a abstractC5122a2 = (AbstractC5122a) unsafe.getObject(abstractC5184x2, j7);
                        InterfaceC5124a1 interfaceC5124a1M16337p6 = c5173r0.m16337p(i15);
                        iM16259m5 = C5158m.m16259m0(i18) * 2;
                        iMo16105b2 = abstractC5122a2.mo16105b(interfaceC5124a1M16337p6);
                        iM16127c = iMo16105b2 + iM16259m5;
                        iM16258l0 += iM16127c;
                    }
                    i15 += 3;
                    break;
                default:
                    i15 += 3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x05d2 A[Catch: all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:145:0x05cd, B:147:0x05d2, B:148:0x05d7, B:117:0x0424, B:120:0x0433, B:121:0x044c, B:122:0x0466, B:123:0x0480, B:124:0x049c, B:125:0x04b5, B:126:0x04c9, B:127:0x04e3, B:128:0x04ef, B:129:0x050a, B:130:0x0524, B:131:0x053e, B:132:0x0557, B:133:0x0570, B:134:0x0589, B:135:0x05a4, B:139:0x05bf), top: B:168:0x05cd }] */
    /* JADX WARN: Code duplicated, block: B:152:0x05e0 A[LOOP:2: B:151:0x05de->B:152:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:159:0x05fa A[LOOP:3: B:158:0x05f8->B:159:0x05fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x0604  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[PHI: r13
      0x0044: PHI (r13v4 com.google.crypto.tink.shaded.protobuf.d1) = 
      (r13v1 com.google.crypto.tink.shaded.protobuf.d1)
      (r13v2 com.google.crypto.tink.shaded.protobuf.d1)
      (r13v12 com.google.crypto.tink.shaded.protobuf.d1)
     binds: [B:16:0x003f, B:30:0x006c, B:44:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x05dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: f */
    public final void mo16117f(Object obj, C5155l c5155l, C5167p c5167p) throws Throwable {
        C5173r0 c5173r0;
        int i13;
        int i14;
        C5155l c5155l2;
        int i15;
        C5173r0 c5173r1 = this;
        Object obj2 = obj;
        C5155l c5155l3 = c5155l;
        C5167p c5167p2 = c5167p;
        c5167p2.getClass();
        m16315l(obj2);
        AbstractC5130c1 abstractC5130c1 = c5173r1.f21579l;
        int[] iArr = c5173r1.f21574g;
        int i16 = c5173r1.f21576i;
        int i17 = c5173r1.f21575h;
        C5133d1 c5133d1Mo16151a = null;
        while (true) {
            try {
                int iM16220b = c5155l3.m16220b();
                int iM16328P = (iM16220b < c5173r1.f21570c || iM16220b > c5173r1.f21571d) ? -1 : c5173r1.m16328P(iM16220b, 0);
                if (iM16328P >= 0) {
                    int iM16331T = c5173r1.m16331T(iM16328P);
                    try {
                        int iM16314S = m16314S(iM16331T);
                        AbstractC5144h0 abstractC5144h0 = c5173r1.f21578k;
                        switch (iM16314S) {
                            case 0:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B = m16310B(iM16331T);
                                c5155l2.m16241w(1);
                                Object obj3 = obj2;
                                try {
                                    AbstractC5160m1.f21551c.mo16192m(obj3, jM16310B, c5155l2.f21536a.mo3841q());
                                    obj2 = obj3;
                                    c5173r0.m16326N(iM16328P, obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj2 = obj3;
                                    try {
                                        abstractC5130c1.getClass();
                                        if (c5133d1Mo16151a == null) {
                                            c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                        }
                                        if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                            for (i15 = i13; i15 < i16; i15++) {
                                                c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                            }
                                            if (c5133d1Mo16151a != null) {
                                                ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        for (i14 = i13; i14 < i16; i14++) {
                                            c5173r0.m16334m(iArr[i14], obj2, c5133d1Mo16151a);
                                        }
                                        if (c5133d1Mo16151a != null) {
                                            ((C5136e1) abstractC5130c1).getClass();
                                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj3;
                                    while (i14 < i16) {
                                        c5173r0.m16334m(iArr[i14], obj2, c5133d1Mo16151a);
                                    }
                                    if (c5133d1Mo16151a != null) {
                                        ((C5136e1) abstractC5130c1).getClass();
                                        ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                    }
                                    throw th;
                                }
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 1:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B2 = m16310B(iM16331T);
                                c5155l2.m16241w(5);
                                AbstractC5160m1.f21551c.mo16193n(obj2, jM16310B2, c5155l2.f21536a.mo3845u());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 2:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B3 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.m16291o(obj2, jM16310B3, c5155l2.f21536a.mo3847w());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 3:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B4 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.m16291o(obj2, jM16310B4, c5155l2.f21536a.mo3825F());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 4:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B5 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.m16290n(jM16310B5, obj2, c5155l2.f21536a.mo3846v());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 5:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B6 = m16310B(iM16331T);
                                c5155l2.m16241w(1);
                                AbstractC5160m1.m16291o(obj2, jM16310B6, c5155l2.f21536a.mo3844t());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 6:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B7 = m16310B(iM16331T);
                                c5155l2.m16241w(5);
                                AbstractC5160m1.m16290n(jM16310B7, obj2, c5155l2.f21536a.mo3843s());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 7:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B8 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.f21551c.mo16190k(obj2, jM16310B8, c5155l2.f21536a.mo3839m());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 8:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                c5173r0.m16324K(obj2, iM16331T, c5155l2);
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 9:
                                c5155l2 = c5155l3;
                                C5167p c5167p3 = c5167p2;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                AbstractC5122a abstractC5122a = (AbstractC5122a) c5173r0.m16344x(iM16328P, obj2);
                                InterfaceC5124a1 interfaceC5124a1M16337p = c5173r0.m16337p(iM16328P);
                                c5155l2.m16241w(2);
                                c5155l2.m16222d(abstractC5122a, interfaceC5124a1M16337p, c5167p3);
                                c5173r0.m16329Q(iM16328P, obj2, abstractC5122a);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 10:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                AbstractC5160m1.m16292p(m16310B(iM16331T), obj2, c5155l2.m16224f());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 11:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B9 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.m16290n(jM16310B9, obj2, c5155l2.f21536a.mo3824E());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 12:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                c5155l2.m16241w(0);
                                int iMo3842r = c5155l2.f21536a.mo3842r();
                                c5173r0.m16335n(iM16328P);
                                AbstractC5160m1.m16290n(m16310B(iM16331T), obj2, iMo3842r);
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 13:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B10 = m16310B(iM16331T);
                                c5155l2.m16241w(5);
                                AbstractC5160m1.m16290n(jM16310B10, obj2, c5155l2.f21536a.mo3848x());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 14:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B11 = m16310B(iM16331T);
                                c5155l2.m16241w(1);
                                AbstractC5160m1.m16291o(obj2, jM16310B11, c5155l2.f21536a.mo3849y());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 15:
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r0 = c5173r1;
                                long jM16310B12 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                AbstractC5160m1.m16290n(jM16310B12, obj2, c5155l2.f21536a.mo3850z());
                                c5173r0.m16326N(iM16328P, obj2);
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 16:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                long jM16310B13 = m16310B(iM16331T);
                                c5155l2.m16241w(0);
                                i13 = i17;
                                try {
                                    AbstractC5160m1.m16291o(obj2, jM16310B13, c5155l2.f21536a.mo3820A());
                                    c5173r0.m16326N(iM16328P, obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    abstractC5130c1.getClass();
                                    if (c5133d1Mo16151a == null) {
                                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                    }
                                    if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                        while (i15 < i16) {
                                            c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                        }
                                        if (c5133d1Mo16151a != null) {
                                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                c5155l2 = c5155l3;
                                C5167p c5167p4 = c5167p2;
                                c5173r0 = c5173r1;
                                AbstractC5122a abstractC5122a2 = (AbstractC5122a) c5173r0.m16344x(iM16328P, obj2);
                                InterfaceC5124a1 interfaceC5124a1M16337p2 = c5173r0.m16337p(iM16328P);
                                c5155l2.m16241w(3);
                                c5155l2.m16221c(abstractC5122a2, interfaceC5124a1M16337p2, c5167p4);
                                c5173r0.m16329Q(iM16328P, obj2, abstractC5122a2);
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16226h(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16230l(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 20:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16232n(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 21:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16239u(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16231m(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16229k(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 24:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16228j(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 25:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                c5155l2.m16223e(abstractC5144h0.mo16171c(m16310B(iM16331T), obj2));
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 26:
                                c5155l2 = c5155l3;
                                c5173r0 = c5173r1;
                                try {
                                    c5173r0.m16325L(obj2, iM16331T, c5155l2);
                                    i13 = i17;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    i13 = i17;
                                    abstractC5130c1.getClass();
                                    if (c5133d1Mo16151a == null) {
                                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                    }
                                    if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                        while (i15 < i16) {
                                            c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                        }
                                        if (c5133d1Mo16151a != null) {
                                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i13 = i17;
                                    while (i14 < i16) {
                                        c5173r0.m16334m(iArr[i14], obj2, c5133d1Mo16151a);
                                    }
                                    if (c5133d1Mo16151a != null) {
                                        ((C5136e1) abstractC5130c1).getClass();
                                        ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                    }
                                    throw th;
                                }
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 27:
                                try {
                                    try {
                                        c5173r1.m16323J(obj2, iM16331T, c5155l3, c5173r1.m16337p(iM16328P), c5167p);
                                        c5155l2 = c5155l3;
                                        c5173r0 = c5173r1;
                                        i13 = i17;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        c5155l2 = c5155l3;
                                        c5173r0 = c5173r1;
                                        i13 = i17;
                                        abstractC5130c1.getClass();
                                        if (c5133d1Mo16151a == null) {
                                            c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                        }
                                        if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                            while (i15 < i16) {
                                                c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                            }
                                            if (c5133d1Mo16151a != null) {
                                                ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                    c5173r0 = c5173r1;
                                    c5155l2 = c5155l3;
                                    i13 = i17;
                                    abstractC5130c1.getClass();
                                    if (c5133d1Mo16151a == null) {
                                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                    }
                                    if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                        while (i15 < i16) {
                                            c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                        }
                                        if (c5133d1Mo16151a != null) {
                                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                            return;
                                        }
                                        return;
                                    }
                                    c5173r1 = c5173r0;
                                    c5155l3 = c5155l2;
                                    i17 = i13;
                                    c5167p2 = c5167p;
                                    break;
                                }
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 28:
                                c5155l3.m16225g(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 29:
                                c5155l3.m16238t(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 30:
                                c5155l3.m16227i(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r1.m16335n(iM16328P);
                                Class cls = AbstractC5127b1.f21481a;
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 31:
                                c5155l3.m16233o(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 32:
                                c5155l3.m16234p(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 33:
                                c5155l3.m16235q(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 34:
                                c5155l3.m16236r(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 35:
                                c5155l3.m16226h(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 36:
                                c5155l3.m16230l(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 37:
                                c5155l3.m16232n(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 38:
                                c5155l3.m16239u(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 39:
                                c5155l3.m16231m(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 40:
                                c5155l3.m16229k(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 41:
                                c5155l3.m16228j(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 42:
                                c5155l3.m16223e(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 43:
                                c5155l3.m16238t(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 44:
                                c5155l3.m16227i(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r1.m16335n(iM16328P);
                                Class cls2 = AbstractC5127b1.f21481a;
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 45:
                                c5155l3.m16233o(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 46:
                                c5155l3.m16234p(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 47:
                                c5155l3.m16235q(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 48:
                                c5155l3.m16236r(abstractC5144h0.mo16171c(iM16331T & 1048575, obj2));
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 49:
                                C5155l c5155l4 = c5155l3;
                                try {
                                    c5173r1.m16322I(obj2, iM16331T & 1048575, c5155l4, c5173r1.m16337p(iM16328P), c5167p);
                                    c5155l3 = c5155l4;
                                    c5173r0 = c5173r1;
                                    c5155l2 = c5155l3;
                                    i13 = i17;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    c5173r0 = c5173r1;
                                    c5155l2 = c5155l4;
                                    i13 = i17;
                                    abstractC5130c1.getClass();
                                    if (c5133d1Mo16151a == null) {
                                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                    }
                                    if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                        while (i15 < i16) {
                                            c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                        }
                                        if (c5133d1Mo16151a != null) {
                                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 50:
                                c5173r1.m16341u(iM16328P, obj2, c5173r1.m16336o(iM16328P));
                                throw null;
                            case 51:
                                c5155l3.m16241w(1);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Double.valueOf(c5155l3.f21536a.mo3841q()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 52:
                                c5155l3.m16241w(5);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Float.valueOf(c5155l3.f21536a.mo3845u()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 53:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Long.valueOf(c5155l3.f21536a.mo3847w()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 54:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Long.valueOf(c5155l3.f21536a.mo3825F()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 55:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(c5155l3.f21536a.mo3846v()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 56:
                                c5155l3.m16241w(1);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Long.valueOf(c5155l3.f21536a.mo3844t()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 57:
                                c5155l3.m16241w(5);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(c5155l3.f21536a.mo3843s()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 58:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Boolean.valueOf(c5155l3.f21536a.mo3839m()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 59:
                                c5173r1.m16324K(obj2, iM16331T, c5155l3);
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 60:
                                AbstractC5122a abstractC5122a3 = (AbstractC5122a) c5173r1.m16345y(iM16220b, iM16328P, obj2);
                                InterfaceC5124a1 interfaceC5124a1M16337p3 = c5173r1.m16337p(iM16328P);
                                c5155l3.m16241w(2);
                                c5155l3.m16222d(abstractC5122a3, interfaceC5124a1M16337p3, c5167p2);
                                c5173r1.m16330R(obj2, iM16220b, abstractC5122a3, iM16328P);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 61:
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, c5155l3.m16224f());
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 62:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(c5155l3.f21536a.mo3824E()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 63:
                                c5155l3.m16241w(0);
                                int iMo3842r2 = c5155l3.f21536a.mo3842r();
                                c5173r1.m16335n(iM16328P);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(iMo3842r2));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 64:
                                c5155l3.m16241w(5);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(c5155l3.f21536a.mo3848x()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 65:
                                c5155l3.m16241w(1);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Long.valueOf(c5155l3.f21536a.mo3849y()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 66:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Integer.valueOf(c5155l3.f21536a.mo3850z()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 67:
                                c5155l3.m16241w(0);
                                AbstractC5160m1.m16292p(iM16331T & 1048575, obj2, Long.valueOf(c5155l3.f21536a.mo3820A()));
                                c5173r1.m16327O(iM16220b, iM16328P, obj2);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            case 68:
                                AbstractC5122a abstractC5122a4 = (AbstractC5122a) c5173r1.m16345y(iM16220b, iM16328P, obj2);
                                InterfaceC5124a1 interfaceC5124a1M16337p4 = c5173r1.m16337p(iM16328P);
                                c5155l3.m16241w(3);
                                c5155l3.m16221c(abstractC5122a4, interfaceC5124a1M16337p4, c5167p2);
                                c5173r1.m16330R(obj2, iM16220b, abstractC5122a4, iM16328P);
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                            default:
                                if (c5133d1Mo16151a == null) {
                                    try {
                                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        c5173r0 = c5173r1;
                                        c5155l2 = c5155l3;
                                        i13 = i17;
                                        abstractC5130c1.getClass();
                                        if (c5133d1Mo16151a == null) {
                                            c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                                        }
                                        if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l2)) {
                                            while (i15 < i16) {
                                                c5173r0.m16334m(iArr[i15], obj2, c5133d1Mo16151a);
                                            }
                                            if (c5133d1Mo16151a != null) {
                                                ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l3)) {
                                    while (i17 < i16) {
                                        c5173r1.m16334m(iArr[i17], obj2, c5133d1Mo16151a);
                                        i17++;
                                    }
                                    if (c5133d1Mo16151a != null) {
                                        ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                                    }
                                }
                                c5173r0 = c5173r1;
                                c5155l2 = c5155l3;
                                i13 = i17;
                                c5173r1 = c5173r0;
                                c5155l3 = c5155l2;
                                i17 = i13;
                                c5167p2 = c5167p;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                        c5173r0 = c5173r1;
                        c5155l2 = c5155l3;
                        i13 = i17;
                    }
                } else if (iM16220b == Integer.MAX_VALUE) {
                    while (i17 < i16) {
                        c5173r1.m16334m(iArr[i17], obj2, c5133d1Mo16151a);
                        i17++;
                    }
                    if (c5133d1Mo16151a != null) {
                        ((C5136e1) abstractC5130c1).getClass();
                        ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                    }
                } else {
                    abstractC5130c1.getClass();
                    if (c5133d1Mo16151a == null) {
                        c5133d1Mo16151a = abstractC5130c1.mo16151a(obj2);
                    }
                    if (!abstractC5130c1.m16152b(c5133d1Mo16151a, c5155l3)) {
                        while (i17 < i16) {
                            c5173r1.m16334m(iArr[i17], obj2, c5133d1Mo16151a);
                            i17++;
                        }
                        if (c5133d1Mo16151a != null) {
                            ((AbstractC5184x) obj2).unknownFields = c5133d1Mo16151a;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                c5173r0 = c5173r1;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: g */
    public final void mo16118g(Object obj, byte[] bArr, int i13, int i14, C1448d c1448d) throws InvalidProtocolBufferException {
        m16319F(obj, bArr, i13, i14, 0, c1448d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: h */
    public final void mo16119h(Object obj, C5153k0 c5153k0) throws CodedOutputStream$OutOfSpaceException {
        c5153k0.getClass();
        m16332U(obj, c5153k0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: i */
    public final boolean mo16120i(AbstractC5184x abstractC5184x, AbstractC5184x abstractC5184x2) {
        int[] iArr = this.f21568a;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            boolean zM16135k = true;
            if (i13 < length) {
                int iM16331T = m16331T(i13);
                long j7 = iM16331T & 1048575;
                switch (m16314S(iM16331T)) {
                    case 0:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l1 = AbstractC5160m1.f21551c;
                            if (Double.doubleToLongBits(abstractC5157l1.mo16188e(j7, abstractC5184x)) != Double.doubleToLongBits(abstractC5157l1.mo16188e(j7, abstractC5184x2))) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l2 = AbstractC5160m1.f21551c;
                            if (Float.floatToIntBits(abstractC5157l2.mo16189f(j7, abstractC5184x)) != Float.floatToIntBits(abstractC5157l2.mo16189f(j7, abstractC5184x2))) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l3 = AbstractC5160m1.f21551c;
                            if (abstractC5157l3.m16248h(j7, abstractC5184x) != abstractC5157l3.m16248h(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l4 = AbstractC5160m1.f21551c;
                            if (abstractC5157l4.m16248h(j7, abstractC5184x) != abstractC5157l4.m16248h(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l5 = AbstractC5160m1.f21551c;
                            if (abstractC5157l5.m16247g(j7, abstractC5184x) != abstractC5157l5.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l6 = AbstractC5160m1.f21551c;
                            if (abstractC5157l6.m16248h(j7, abstractC5184x) != abstractC5157l6.m16248h(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l7 = AbstractC5160m1.f21551c;
                            if (abstractC5157l7.m16247g(j7, abstractC5184x) != abstractC5157l7.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l8 = AbstractC5160m1.f21551c;
                            if (abstractC5157l8.mo16186c(j7, abstractC5184x) != abstractC5157l8.mo16186c(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l9 = AbstractC5160m1.f21551c;
                            if (!AbstractC5127b1.m16135k(abstractC5157l9.m16249i(j7, abstractC5184x), abstractC5157l9.m16249i(j7, abstractC5184x2))) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l10 = AbstractC5160m1.f21551c;
                            if (!AbstractC5127b1.m16135k(abstractC5157l10.m16249i(j7, abstractC5184x), abstractC5157l10.m16249i(j7, abstractC5184x2))) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l11 = AbstractC5160m1.f21551c;
                            if (!AbstractC5127b1.m16135k(abstractC5157l11.m16249i(j7, abstractC5184x), abstractC5157l11.m16249i(j7, abstractC5184x2))) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l12 = AbstractC5160m1.f21551c;
                            if (abstractC5157l12.m16247g(j7, abstractC5184x) != abstractC5157l12.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l13 = AbstractC5160m1.f21551c;
                            if (abstractC5157l13.m16247g(j7, abstractC5184x) != abstractC5157l13.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l14 = AbstractC5160m1.f21551c;
                            if (abstractC5157l14.m16247g(j7, abstractC5184x) != abstractC5157l14.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l15 = AbstractC5160m1.f21551c;
                            if (abstractC5157l15.m16248h(j7, abstractC5184x) != abstractC5157l15.m16248h(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l16 = AbstractC5160m1.f21551c;
                            if (abstractC5157l16.m16247g(j7, abstractC5184x) != abstractC5157l16.m16247g(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l17 = AbstractC5160m1.f21551c;
                            if (abstractC5157l17.m16248h(j7, abstractC5184x) != abstractC5157l17.m16248h(j7, abstractC5184x2)) {
                                zM16135k = false;
                            }
                        }
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        if (!m16333k(abstractC5184x, abstractC5184x2, i13)) {
                            zM16135k = false;
                        } else {
                            AbstractC5157l1 abstractC5157l18 = AbstractC5160m1.f21551c;
                            if (!AbstractC5127b1.m16135k(abstractC5157l18.m16249i(j7, abstractC5184x), abstractC5157l18.m16249i(j7, abstractC5184x2))) {
                                zM16135k = false;
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
                        AbstractC5157l1 abstractC5157l19 = AbstractC5160m1.f21551c;
                        zM16135k = AbstractC5127b1.m16135k(abstractC5157l19.m16249i(j7, abstractC5184x), abstractC5157l19.m16249i(j7, abstractC5184x2));
                        break;
                    case 50:
                        AbstractC5157l1 abstractC5157l20 = AbstractC5160m1.f21551c;
                        zM16135k = AbstractC5127b1.m16135k(abstractC5157l20.m16249i(j7, abstractC5184x), abstractC5157l20.m16249i(j7, abstractC5184x2));
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
                        AbstractC5157l1 abstractC5157l21 = AbstractC5160m1.f21551c;
                        if (abstractC5157l21.m16247g(j13, abstractC5184x) != abstractC5157l21.m16247g(j13, abstractC5184x2) || !AbstractC5127b1.m16135k(abstractC5157l21.m16249i(j7, abstractC5184x), abstractC5157l21.m16249i(j7, abstractC5184x2))) {
                            zM16135k = false;
                        }
                        break;
                }
                if (zM16135k) {
                    i13 += 3;
                }
            } else {
                C5136e1 c5136e1 = (C5136e1) this.f21579l;
                c5136e1.getClass();
                C5133d1 c5133d1 = abstractC5184x.unknownFields;
                c5136e1.getClass();
                if (c5133d1.equals(abstractC5184x2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: j */
    public final int mo16121j(AbstractC5184x abstractC5184x) {
        int i13;
        int iM16124b;
        int i14;
        int[] iArr = this.f21568a;
        int length = iArr.length;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 += 3) {
            int iM16331T = m16331T(i16);
            int i17 = iArr[i16];
            long j7 = 1048575 & iM16331T;
            int i18 = 1237;
            int iHashCode = 37;
            switch (m16314S(iM16331T)) {
                case 0:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(Double.doubleToLongBits(AbstractC5160m1.f21551c.mo16188e(j7, abstractC5184x)));
                    i15 = iM16124b + i13;
                    break;
                case 1:
                    i13 = i15 * 53;
                    iM16124b = Float.floatToIntBits(AbstractC5160m1.f21551c.mo16189f(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case 2:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(AbstractC5160m1.f21551c.m16248h(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case 3:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(AbstractC5160m1.f21551c.m16248h(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case 4:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 5:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(AbstractC5160m1.f21551c.m16248h(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case 6:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 7:
                    i14 = i15 * 53;
                    boolean zMo16186c = AbstractC5160m1.f21551c.mo16186c(j7, abstractC5184x);
                    Charset charset = AbstractC5126b0.f21479a;
                    if (zMo16186c) {
                        i18 = 1231;
                    }
                    i15 = i18 + i14;
                    break;
                case 8:
                    i13 = i15 * 53;
                    iM16124b = ((String) AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x)).hashCode();
                    i15 = iM16124b + i13;
                    break;
                case 9:
                    Object objM16249i = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x);
                    if (objM16249i != null) {
                        iHashCode = objM16249i.hashCode();
                    }
                    i15 = (i15 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                    i15 = iM16124b + i13;
                    break;
                case 11:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 12:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 13:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 14:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(AbstractC5160m1.f21551c.m16248h(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case 15:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16247g(j7, abstractC5184x);
                    i15 = iM16124b + i13;
                    break;
                case 16:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5126b0.m16124b(AbstractC5160m1.f21551c.m16248h(j7, abstractC5184x));
                    i15 = iM16124b + i13;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    Object objM16249i2 = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x);
                    if (objM16249i2 != null) {
                        iHashCode = objM16249i2.hashCode();
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
                    iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                    i15 = iM16124b + i13;
                    break;
                case 50:
                    i13 = i15 * 53;
                    iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                    i15 = iM16124b + i13;
                    break;
                case 51:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(Double.doubleToLongBits(((Double) AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x)).doubleValue()));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 52:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = Float.floatToIntBits(((Float) AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x)).floatValue());
                        i15 = iM16124b + i13;
                    }
                    break;
                case 53:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(m16312D(j7, abstractC5184x));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 54:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(m16312D(j7, abstractC5184x));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 55:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 56:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(m16312D(j7, abstractC5184x));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 57:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 58:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i14 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x)).booleanValue();
                        Charset charset2 = AbstractC5126b0.f21479a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i14;
                    }
                    break;
                case 59:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = ((String) AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x)).hashCode();
                        i15 = iM16124b + i13;
                    }
                    break;
                case 60:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                        i15 = iM16124b + i13;
                    }
                    break;
                case 61:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                        i15 = iM16124b + i13;
                    }
                    break;
                case 62:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 63:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 64:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 65:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(m16312D(j7, abstractC5184x));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 66:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = m16311C(j7, abstractC5184x);
                        i15 = iM16124b + i13;
                    }
                    break;
                case 67:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5126b0.m16124b(m16312D(j7, abstractC5184x));
                        i15 = iM16124b + i13;
                    }
                    break;
                case 68:
                    if (m16340t(i17, i16, abstractC5184x)) {
                        i13 = i15 * 53;
                        iM16124b = AbstractC5160m1.f21551c.m16249i(j7, abstractC5184x).hashCode();
                        i15 = iM16124b + i13;
                    }
                    break;
            }
        }
        ((C5136e1) this.f21579l).getClass();
        return abstractC5184x.unknownFields.hashCode() + (i15 * 53);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16333k(AbstractC5184x abstractC5184x, AbstractC5184x abstractC5184x2, int i13) {
        return m16338q(i13, abstractC5184x) == m16338q(i13, abstractC5184x2);
    }

    /* JADX INFO: renamed from: m */
    public final void m16334m(int i13, Object obj, Object obj2) {
        int i14 = this.f21568a[i13];
        if (AbstractC5160m1.f21551c.m16249i(m16331T(i13) & 1048575, obj) == null) {
            return;
        }
        m16335n(i13);
    }

    /* JADX INFO: renamed from: n */
    public final void m16335n(int i13) {
        if (this.f21569b[AbstractC11266d.m30449c(i13, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m16336o(int i13) {
        return this.f21569b[(i13 / 3) * 2];
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC5124a1 m16337p(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f21569b;
        InterfaceC5124a1 interfaceC5124a1 = (InterfaceC5124a1) objArr[i14];
        if (interfaceC5124a1 != null) {
            return interfaceC5124a1;
        }
        InterfaceC5124a1 interfaceC5124a1M16371b = C5185x0.f21595c.m16371b((Class) objArr[i14 + 1]);
        objArr[i14] = interfaceC5124a1M16371b;
        return interfaceC5124a1M16371b;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16338q(int i13, Object obj) {
        int i14 = this.f21568a[i13 + 2];
        long j7 = i14 & 1048575;
        if (j7 == 1048575) {
            int iM16331T = m16331T(i13);
            long j13 = iM16331T & 1048575;
            switch (m16314S(iM16331T)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC5160m1.f21551c.mo16188e(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC5160m1.f21551c.mo16189f(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC5160m1.f21551c.m16248h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC5160m1.f21551c.m16248h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC5160m1.f21551c.m16248h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC5160m1.f21551c.mo16186c(j13, obj);
                case 8:
                    Object objM16249i = AbstractC5160m1.f21551c.m16249i(j13, obj);
                    if (objM16249i instanceof String) {
                        return !((String) objM16249i).isEmpty();
                    }
                    if (objM16249i instanceof AbstractC5146i) {
                        return !AbstractC5146i.f21514x.equals(objM16249i);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC5160m1.f21551c.m16249i(j13, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC5146i.f21514x.equals(AbstractC5160m1.f21551c.m16249i(j13, obj));
                case 11:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC5160m1.f21551c.m16248h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC5160m1.f21551c.m16247g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC5160m1.f21551c.m16248h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (AbstractC5160m1.f21551c.m16249i(j13, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i14 >>> 20)) & AbstractC5160m1.f21551c.m16247g(j7, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16339r(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return m16338q(i13, obj);
        }
        return (i15 & i16) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16340t(int i13, int i14, Object obj) {
        return AbstractC5160m1.f21551c.m16247g((long) (this.f21568a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX INFO: renamed from: u */
    public final void m16341u(int i13, Object obj, Object obj2) {
        long jM16331T = m16331T(i13) & 1048575;
        Object objM16249i = AbstractC5160m1.f21551c.m16249i(jM16331T, obj);
        C5159m0 c5159m0 = this.f21580m;
        if (objM16249i != null) {
            c5159m0.getClass();
            if (!((C5156l0) objM16249i).f21541w) {
                C5156l0 c5156l0M16244c = C5156l0.f21540x.m16244c();
                C5159m0.m16276a(c5156l0M16244c, objM16249i);
                AbstractC5160m1.m16292p(jM16331T, obj, c5156l0M16244c);
                objM16249i = c5156l0M16244c;
            }
        } else {
            c5159m0.getClass();
            objM16249i = C5156l0.f21540x.m16244c();
            AbstractC5160m1.m16292p(jM16331T, obj, objM16249i);
        }
        c5159m0.getClass();
        AbstractC30802r.m94771t(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final void m16342v(int i13, Object obj, Object obj2) {
        if (m16338q(i13, obj2)) {
            long jM16331T = m16331T(i13) & 1048575;
            Unsafe unsafe = f21567o;
            Object object = unsafe.getObject(obj2, jM16331T);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f21568a[i13] + " is present but null: " + obj2);
            }
            InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i13);
            if (!m16338q(i13, obj)) {
                if (m16316s(object)) {
                    Object objMo16115d = interfaceC5124a1M16337p.mo16115d();
                    interfaceC5124a1M16337p.mo16112a(objMo16115d, object);
                    unsafe.putObject(obj, jM16331T, objMo16115d);
                } else {
                    unsafe.putObject(obj, jM16331T, object);
                }
                m16326N(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM16331T);
            if (!m16316s(object2)) {
                Object objMo16115d2 = interfaceC5124a1M16337p.mo16115d();
                interfaceC5124a1M16337p.mo16112a(objMo16115d2, object2);
                unsafe.putObject(obj, jM16331T, objMo16115d2);
                object2 = objMo16115d2;
            }
            interfaceC5124a1M16337p.mo16112a(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16343w(int i13, Object obj, Object obj2) {
        int[] iArr = this.f21568a;
        int i14 = iArr[i13];
        if (m16340t(i14, i13, obj2)) {
            long jM16331T = m16331T(i13) & 1048575;
            Unsafe unsafe = f21567o;
            Object object = unsafe.getObject(obj2, jM16331T);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i13);
            if (!m16340t(i14, i13, obj)) {
                if (m16316s(object)) {
                    Object objMo16115d = interfaceC5124a1M16337p.mo16115d();
                    interfaceC5124a1M16337p.mo16112a(objMo16115d, object);
                    unsafe.putObject(obj, jM16331T, objMo16115d);
                } else {
                    unsafe.putObject(obj, jM16331T, object);
                }
                m16327O(i14, i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM16331T);
            if (!m16316s(object2)) {
                Object objMo16115d2 = interfaceC5124a1M16337p.mo16115d();
                interfaceC5124a1M16337p.mo16112a(objMo16115d2, object2);
                unsafe.putObject(obj, jM16331T, objMo16115d2);
                object2 = objMo16115d2;
            }
            interfaceC5124a1M16337p.mo16112a(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m16344x(int i13, Object obj) {
        InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i13);
        long jM16331T = m16331T(i13) & 1048575;
        if (!m16338q(i13, obj)) {
            return interfaceC5124a1M16337p.mo16115d();
        }
        Object object = f21567o.getObject(obj, jM16331T);
        if (m16316s(object)) {
            return object;
        }
        Object objMo16115d = interfaceC5124a1M16337p.mo16115d();
        if (object != null) {
            interfaceC5124a1M16337p.mo16112a(objMo16115d, object);
        }
        return objMo16115d;
    }

    /* JADX INFO: renamed from: y */
    public final Object m16345y(int i13, int i14, Object obj) {
        InterfaceC5124a1 interfaceC5124a1M16337p = m16337p(i14);
        if (!m16340t(i13, i14, obj)) {
            return interfaceC5124a1M16337p.mo16115d();
        }
        Object object = f21567o.getObject(obj, m16331T(i14) & 1048575);
        if (m16316s(object)) {
            return object;
        }
        Object objMo16115d = interfaceC5124a1M16337p.mo16115d();
        if (object != null) {
            interfaceC5124a1M16337p.mo16112a(objMo16115d, object);
        }
        return objMo16115d;
    }
}
