package androidx.glance.appwidget.protobuf;

import androidx.health.platform.client.proto.C1533u;
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
import p088dc.AbstractC11894a;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1418s0 implements InterfaceC1372b1 {

    /* JADX INFO: renamed from: n */
    public static final int[] f5962n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f5963o = AbstractC1399k1.m4417j();

    /* JADX INFO: renamed from: a */
    public final int[] f5964a;

    /* JADX INFO: renamed from: b */
    public final Object[] f5965b;

    /* JADX INFO: renamed from: c */
    public final int f5966c;

    /* JADX INFO: renamed from: d */
    public final int f5967d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1367a f5968e;

    /* JADX INFO: renamed from: f */
    public final boolean f5969f;

    /* JADX INFO: renamed from: g */
    public final int[] f5970g;

    /* JADX INFO: renamed from: h */
    public final int f5971h;

    /* JADX INFO: renamed from: i */
    public final int f5972i;

    /* JADX INFO: renamed from: j */
    public final C1422u0 f5973j;

    /* JADX INFO: renamed from: k */
    public final C1392i0 f5974k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1378d1 f5975l;

    /* JADX INFO: renamed from: m */
    public final C1410o0 f5976m;

    public C1418s0(int[] iArr, Object[] objArr, int i13, int i14, AbstractC1367a abstractC1367a, int[] iArr2, int i15, int i16, C1422u0 c1422u0, C1392i0 c1392i0, AbstractC1378d1 abstractC1378d1, C1419t c1419t, C1410o0 c1410o0) {
        this.f5964a = iArr;
        this.f5965b = objArr;
        this.f5966c = i13;
        this.f5967d = i14;
        this.f5969f = abstractC1367a instanceof AbstractC1368a0;
        this.f5970g = iArr2;
        this.f5971h = i15;
        this.f5972i = i16;
        this.f5973j = c1422u0;
        this.f5974k = c1392i0;
        this.f5975l = abstractC1378d1;
        this.f5968e = abstractC1367a;
        this.f5976m = c1410o0;
    }

    /* JADX INFO: renamed from: A */
    public static long m4513A(int i13) {
        return i13 & 1048575;
    }

    /* JADX INFO: renamed from: B */
    public static int m4514B(long j7, Object obj) {
        return ((Integer) AbstractC1399k1.f5928c.m4389i(j7, obj)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static long m4515C(long j7, Object obj) {
        return ((Long) AbstractC1399k1.f5928c.m4389i(j7, obj)).longValue();
    }

    /* JADX INFO: renamed from: L */
    public static Field m4516L(Class cls, String str) {
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

    /* JADX INFO: renamed from: R */
    public static int m4517R(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: l */
    public static void m4518l(Object obj) {
        if (!m4519s(obj)) {
            throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4519s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1368a0) {
            return ((AbstractC1368a0) obj).m4276h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    /* JADX INFO: renamed from: z */
    public static C1418s0 m4520z(C1369a1 c1369a1, C1422u0 c1422u0, C1392i0 c1392i0, AbstractC1378d1 abstractC1378d1, C1419t c1419t, C1410o0 c1410o0) {
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
        Field fieldM4516L;
        int i46;
        char cCharAt9;
        int i47;
        Field fieldM4516L2;
        Field fieldM4516L3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        int i55;
        char cCharAt12;
        int i56;
        char cCharAt13;
        String str = c1369a1.f5864b;
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
            iArr = f5962n;
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
        Unsafe unsafe = f5963o;
        Object[] objArr2 = c1369a1.f5865c;
        Class<?> cls = c1369a1.f5863a.getClass();
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
                } else if (i122 == 12 && (AbstractC12682p.m35483c(c1369a1.m4281a(), 1) || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0)) {
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i18];
                    i18++;
                }
                int i124 = i123 * 2;
                Object obj = objArr[i124];
                if (obj instanceof Field) {
                    fieldM4516L2 = (Field) obj;
                } else {
                    fieldM4516L2 = m4516L(cls, (String) obj);
                    objArr[i124] = fieldM4516L2;
                }
                int i125 = i102;
                i39 = i18;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4516L2);
                int i126 = i124 + 1;
                Object obj2 = objArr[i126];
                if (obj2 instanceof Field) {
                    fieldM4516L3 = (Field) obj2;
                } else {
                    fieldM4516L3 = m4516L(cls, (String) obj2);
                    objArr[i126] = fieldM4516L3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM4516L3);
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
                Field fieldM4516L4 = m4516L(cls, (String) objArr[i18]);
                if (i117 == 9 || i117 == 17) {
                    i38 = i38;
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = fieldM4516L4.getType();
                } else {
                    if (i117 == 27 || i117 == 49) {
                        i38 = i38;
                        i47 = i18 + 2;
                        objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                    } else if (i117 == 12 || i117 == 30 || i117 == 44) {
                        i38 = i38;
                        if (c1369a1.m4281a() == 1 || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            i47 = i18 + 2;
                            objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4516L4);
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
                                fieldM4516L = (Field) obj3;
                            } else {
                                fieldM4516L = m4516L(cls, (String) obj3);
                                objArr[i130] = fieldM4516L;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4516L);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4516L4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4516L4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4516L4);
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
        return new C1418s0(iArr3, objArr3, i14, i17, c1369a1.f5863a, iArr, i19, i102, c1422u0, c1392i0, abstractC1378d1, c1419t, c1410o0);
    }

    /* JADX INFO: renamed from: D */
    public final void m4521D(long j7, Object obj, int i13) {
        Unsafe unsafe = f5963o;
        Object objM4539o = m4539o(i13);
        Object object = unsafe.getObject(obj, j7);
        this.f5976m.getClass();
        if (!((C1407n0) object).f5947w) {
            C1407n0 c1407n0M4485c = C1407n0.f5946x.m4485c();
            C1410o0.m4498a(c1407n0M4485c, object);
            unsafe.putObject(obj, j7, c1407n0M4485c);
        }
        AbstractC30802r.m94771t(objM4539o);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: E */
    public final int m4522E(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, androidx.glance.appwidget.protobuf.C1376d r35) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.C1418s0.m4522E(java.lang.Object, byte[], int, int, int, androidx.glance.appwidget.protobuf.d):int");
    }

    /* JADX INFO: renamed from: F */
    public final int m4523F(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, int i24, C1376d c1376d) throws InvalidProtocolBufferException {
        int i25;
        Unsafe unsafe = f5963o;
        long j13 = this.f5964a[i24 + 2] & 1048575;
        switch (i19) {
            case 51:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Double.valueOf(Double.longBitsToDouble(AbstractC11894a.m31968q(i13, bArr))));
                int i26 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i26;
            case 52:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Float.valueOf(Float.intBitsToFloat(AbstractC11894a.m31967p(i13, bArr))));
                int i27 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i27;
            case 53:
            case 54:
                if (i17 != 0) {
                    return i13;
                }
                int iM31974w = AbstractC11894a.m31974w(bArr, i13, c1376d);
                unsafe.putObject(obj, j7, Long.valueOf(c1376d.f5877b));
                unsafe.putInt(obj, j13, i16);
                return iM31974w;
            case 55:
            case 62:
                if (i17 != 0) {
                    return i13;
                }
                int iM31972u = AbstractC11894a.m31972u(bArr, i13, c1376d);
                unsafe.putObject(obj, j7, Integer.valueOf(c1376d.f5876a));
                unsafe.putInt(obj, j13, i16);
                return iM31972u;
            case 56:
            case 65:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Long.valueOf(AbstractC11894a.m31968q(i13, bArr)));
                int i28 = i13 + 8;
                unsafe.putInt(obj, j13, i16);
                return i28;
            case 57:
            case 64:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j7, Integer.valueOf(AbstractC11894a.m31967p(i13, bArr)));
                int i29 = i13 + 4;
                unsafe.putInt(obj, j13, i16);
                return i29;
            case 58:
                if (i17 != 0) {
                    return i13;
                }
                int iM31974w2 = AbstractC11894a.m31974w(bArr, i13, c1376d);
                unsafe.putObject(obj, j7, Boolean.valueOf(c1376d.f5877b != 0));
                unsafe.putInt(obj, j13, i16);
                return iM31974w2;
            case 59:
                if (i17 != 2) {
                    return i13;
                }
                int iM31972u2 = AbstractC11894a.m31972u(bArr, i13, c1376d);
                int i34 = c1376d.f5876a;
                if (i34 == 0) {
                    unsafe.putObject(obj, j7, "");
                } else {
                    if ((i18 & 536870912) != 0) {
                        if (AbstractC1408n1.f5948a.mo4437J(bArr, iM31972u2, iM31972u2 + i34) != 0) {
                            throw InvalidProtocolBufferException.m4262b();
                        }
                    }
                    unsafe.putObject(obj, j7, new String(bArr, iM31972u2, i34, AbstractC1383f0.f5887a));
                    iM31972u2 += i34;
                }
                unsafe.putInt(obj, j13, i16);
                return iM31972u2;
            case 60:
                i25 = i13;
                if (i17 == 2) {
                    Object objM4548y = m4548y(i16, i24, obj);
                    int iM31942J = AbstractC11894a.m31942J(objM4548y, m4540p(i24), bArr, i25, i14, c1376d);
                    m4533Q(obj, i16, objM4548y, i24);
                    return iM31942J;
                }
                break;
            case 61:
                i25 = i13;
                if (i17 == 2) {
                    int iM31966o = AbstractC11894a.m31966o(bArr, i25, c1376d);
                    unsafe.putObject(obj, j7, c1376d.f5878c);
                    unsafe.putInt(obj, j13, i16);
                    return iM31966o;
                }
                break;
            case 63:
                i25 = i13;
                if (i17 == 0) {
                    int iM31972u3 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    int i35 = c1376d.f5876a;
                    m4538n(i24);
                    unsafe.putObject(obj, j7, Integer.valueOf(i35));
                    unsafe.putInt(obj, j13, i16);
                    return iM31972u3;
                }
                break;
            case 66:
                i25 = i13;
                if (i17 == 0) {
                    int iM31972u4 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    unsafe.putObject(obj, j7, Integer.valueOf(AbstractC1400l.m4424g(c1376d.f5876a)));
                    unsafe.putInt(obj, j13, i16);
                    return iM31972u4;
                }
                break;
            case 67:
                i25 = i13;
                if (i17 == 0) {
                    int iM31974w3 = AbstractC11894a.m31974w(bArr, i25, c1376d);
                    unsafe.putObject(obj, j7, Long.valueOf(AbstractC1400l.m4425h(c1376d.f5877b)));
                    unsafe.putInt(obj, j13, i16);
                    return iM31974w3;
                }
                break;
            case 68:
                if (i17 == 3) {
                    Object objM4548y2 = m4548y(i16, i24, obj);
                    int iM31941I = AbstractC11894a.m31941I(objM4548y2, m4540p(i24), bArr, i13, i14, (i15 & (-8)) | 4, c1376d);
                    m4533Q(obj, i16, objM4548y2, i24);
                    return iM31941I;
                }
            default:
                return i13;
        }
        return i25;
    }

    /* JADX INFO: renamed from: G */
    public final int m4524G(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, long j7, int i18, long j13, C1376d c1376d) throws InvalidProtocolBufferException {
        int i19;
        int i24;
        int i25;
        int i26;
        int iM31973v;
        Unsafe unsafe = f5963o;
        InterfaceC1380e0 interfaceC1380e0Mo4286i = (InterfaceC1380e0) unsafe.getObject(obj, j13);
        if (!((AbstractC1370b) interfaceC1380e0Mo4286i).f5867w) {
            int size = interfaceC1380e0Mo4286i.size();
            interfaceC1380e0Mo4286i = interfaceC1380e0Mo4286i.mo4286i(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j13, interfaceC1380e0Mo4286i);
        }
        InterfaceC1380e0 interfaceC1380e0 = interfaceC1380e0Mo4286i;
        switch (i18) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 35:
                int iM31972u = i13;
                if (i16 == 2) {
                    AbstractC1413q abstractC1413q = (AbstractC1413q) interfaceC1380e0;
                    int iM31972u2 = AbstractC11894a.m31972u(bArr, iM31972u, c1376d);
                    int i27 = c1376d.f5876a + iM31972u2;
                    while (iM31972u2 < i27) {
                        abstractC1413q.m4507c(Double.longBitsToDouble(AbstractC11894a.m31968q(iM31972u2, bArr)));
                        iM31972u2 += 8;
                    }
                    if (iM31972u2 == i27) {
                        return iM31972u2;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 != 1) {
                    return iM31972u;
                }
                AbstractC1413q abstractC1413q2 = (AbstractC1413q) interfaceC1380e0;
                abstractC1413q2.m4507c(Double.longBitsToDouble(AbstractC11894a.m31968q(iM31972u, bArr)));
                while (true) {
                    i19 = iM31972u + 8;
                    if (i19 < i14) {
                        iM31972u = AbstractC11894a.m31972u(bArr, i19, c1376d);
                        if (i15 == c1376d.f5876a) {
                            abstractC1413q2.m4507c(Double.longBitsToDouble(AbstractC11894a.m31968q(iM31972u, bArr)));
                        }
                    }
                }
                return i19;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 36:
                int iM31972u3 = i13;
                if (i16 == 2) {
                    AbstractC1425w abstractC1425w = (AbstractC1425w) interfaceC1380e0;
                    int iM31972u4 = AbstractC11894a.m31972u(bArr, iM31972u3, c1376d);
                    int i28 = c1376d.f5876a + iM31972u4;
                    while (iM31972u4 < i28) {
                        abstractC1425w.m4549c(Float.intBitsToFloat(AbstractC11894a.m31967p(iM31972u4, bArr)));
                        iM31972u4 += 4;
                    }
                    if (iM31972u4 == i28) {
                        return iM31972u4;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 != 5) {
                    return iM31972u3;
                }
                AbstractC1425w abstractC1425w2 = (AbstractC1425w) interfaceC1380e0;
                abstractC1425w2.m4549c(Float.intBitsToFloat(AbstractC11894a.m31967p(iM31972u3, bArr)));
                while (true) {
                    i24 = iM31972u3 + 4;
                    if (i24 < i14) {
                        iM31972u3 = AbstractC11894a.m31972u(bArr, i24, c1376d);
                        if (i15 == c1376d.f5876a) {
                            abstractC1425w2.m4549c(Float.intBitsToFloat(AbstractC11894a.m31967p(iM31972u3, bArr)));
                        }
                    }
                }
                return i24;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
                    int iM31972u5 = AbstractC11894a.m31972u(bArr, i13, c1376d);
                    int i29 = c1376d.f5876a + iM31972u5;
                    while (iM31972u5 < i29) {
                        iM31972u5 = AbstractC11894a.m31974w(bArr, iM31972u5, c1376d);
                        abstractC1398k0.m4406c(c1376d.f5877b);
                    }
                    if (iM31972u5 == i29) {
                        return iM31972u5;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 != 0) {
                    return i13;
                }
                AbstractC1398k0 abstractC1398k1 = (AbstractC1398k0) interfaceC1380e0;
                int iM31974w = AbstractC11894a.m31974w(bArr, i13, c1376d);
                abstractC1398k1.m4406c(c1376d.f5877b);
                while (iM31974w < i14) {
                    int iM31972u6 = AbstractC11894a.m31972u(bArr, iM31974w, c1376d);
                    if (i15 != c1376d.f5876a) {
                        return iM31974w;
                    }
                    iM31974w = AbstractC11894a.m31974w(bArr, iM31972u6, c1376d);
                    abstractC1398k1.m4406c(c1376d.f5877b);
                }
                return iM31974w;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                i25 = i13;
                if (i16 != 2) {
                    if (i16 == 0) {
                        return AbstractC11894a.m31973v(i15, bArr, i25, i14, interfaceC1380e0, c1376d);
                    }
                    return i25;
                }
                C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
                int iM31972u7 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                int i34 = c1376d.f5876a + iM31972u7;
                while (iM31972u7 < i34) {
                    iM31972u7 = AbstractC11894a.m31972u(bArr, iM31972u7, c1376d);
                    c1371b0.m4283c(c1376d.f5876a);
                }
                if (iM31972u7 == i34) {
                    return iM31972u7;
                }
                throw InvalidProtocolBufferException.m4267g();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 32:
            case 40:
            case 46:
                i25 = i13;
                if (i16 == 2) {
                    AbstractC1398k0 abstractC1398k2 = (AbstractC1398k0) interfaceC1380e0;
                    int iM31972u8 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    int i35 = c1376d.f5876a + iM31972u8;
                    while (iM31972u8 < i35) {
                        abstractC1398k2.m4406c(AbstractC11894a.m31968q(iM31972u8, bArr));
                        iM31972u8 += 8;
                    }
                    if (iM31972u8 == i35) {
                        return iM31972u8;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 == 1) {
                    AbstractC1398k0 abstractC1398k3 = (AbstractC1398k0) interfaceC1380e0;
                    abstractC1398k3.m4406c(AbstractC11894a.m31968q(i25, bArr));
                    int i36 = i25 + 8;
                    while (i36 < i14) {
                        int iM31972u9 = AbstractC11894a.m31972u(bArr, i36, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return i36;
                        }
                        abstractC1398k3.m4406c(AbstractC11894a.m31968q(iM31972u9, bArr));
                        i36 = iM31972u9 + 8;
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
                    C1371b0 c1371b1 = (C1371b0) interfaceC1380e0;
                    int iM31972u10 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    int i37 = c1376d.f5876a + iM31972u10;
                    while (iM31972u10 < i37) {
                        c1371b1.m4283c(AbstractC11894a.m31967p(iM31972u10, bArr));
                        iM31972u10 += 4;
                    }
                    if (iM31972u10 == i37) {
                        return iM31972u10;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 == 5) {
                    C1371b0 c1371b2 = (C1371b0) interfaceC1380e0;
                    c1371b2.m4283c(AbstractC11894a.m31967p(i25, bArr));
                    int i38 = i25 + 4;
                    while (i38 < i14) {
                        int iM31972u11 = AbstractC11894a.m31972u(bArr, i38, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return i38;
                        }
                        c1371b2.m4283c(AbstractC11894a.m31967p(iM31972u11, bArr));
                        i38 = iM31972u11 + 4;
                    }
                    return i38;
                }
                return i25;
            case 25:
            case 42:
                i25 = i13;
                if (i16 == 2) {
                    AbstractC1379e abstractC1379e = (AbstractC1379e) interfaceC1380e0;
                    int iM31972u12 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    int i39 = c1376d.f5876a + iM31972u12;
                    while (iM31972u12 < i39) {
                        iM31972u12 = AbstractC11894a.m31974w(bArr, iM31972u12, c1376d);
                        abstractC1379e.m4326c(c1376d.f5877b != 0);
                    }
                    if (iM31972u12 == i39) {
                        return iM31972u12;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 == 0) {
                    AbstractC1379e abstractC1379e2 = (AbstractC1379e) interfaceC1380e0;
                    int iM31974w2 = AbstractC11894a.m31974w(bArr, i25, c1376d);
                    abstractC1379e2.m4326c(c1376d.f5877b != 0);
                    while (iM31974w2 < i14) {
                        int iM31972u13 = AbstractC11894a.m31972u(bArr, iM31974w2, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return iM31974w2;
                        }
                        iM31974w2 = AbstractC11894a.m31974w(bArr, iM31972u13, c1376d);
                        abstractC1379e2.m4326c(c1376d.f5877b != 0);
                    }
                    return iM31974w2;
                }
                return i25;
            case 26:
                i25 = i13;
                if (i16 == 2) {
                    if ((j7 & 536870912) == 0) {
                        int iM31972u14 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                        int i44 = c1376d.f5876a;
                        if (i44 < 0) {
                            throw InvalidProtocolBufferException.m4265e();
                        }
                        if (i44 == 0) {
                            interfaceC1380e0.add("");
                        } else {
                            interfaceC1380e0.add(new String(bArr, iM31972u14, i44, AbstractC1383f0.f5887a));
                            iM31972u14 += i44;
                        }
                        while (iM31972u14 < i14) {
                            int iM31972u15 = AbstractC11894a.m31972u(bArr, iM31972u14, c1376d);
                            if (i15 != c1376d.f5876a) {
                                return iM31972u14;
                            }
                            iM31972u14 = AbstractC11894a.m31972u(bArr, iM31972u15, c1376d);
                            int i45 = c1376d.f5876a;
                            if (i45 < 0) {
                                throw InvalidProtocolBufferException.m4265e();
                            }
                            if (i45 == 0) {
                                interfaceC1380e0.add("");
                            } else {
                                interfaceC1380e0.add(new String(bArr, iM31972u14, i45, AbstractC1383f0.f5887a));
                                iM31972u14 += i45;
                            }
                        }
                        return iM31972u14;
                    }
                    int iM31972u16 = AbstractC11894a.m31972u(bArr, i25, c1376d);
                    int i46 = c1376d.f5876a;
                    if (i46 < 0) {
                        throw InvalidProtocolBufferException.m4265e();
                    }
                    if (i46 == 0) {
                        interfaceC1380e0.add("");
                    } else {
                        int i47 = iM31972u16 + i46;
                        if (AbstractC1408n1.f5948a.mo4437J(bArr, iM31972u16, i47) != 0) {
                            throw InvalidProtocolBufferException.m4262b();
                        }
                        interfaceC1380e0.add(new String(bArr, iM31972u16, i46, AbstractC1383f0.f5887a));
                        iM31972u16 = i47;
                    }
                    while (iM31972u16 < i14) {
                        int iM31972u17 = AbstractC11894a.m31972u(bArr, iM31972u16, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return iM31972u16;
                        }
                        iM31972u16 = AbstractC11894a.m31972u(bArr, iM31972u17, c1376d);
                        int i48 = c1376d.f5876a;
                        if (i48 < 0) {
                            throw InvalidProtocolBufferException.m4265e();
                        }
                        if (i48 == 0) {
                            interfaceC1380e0.add("");
                        } else {
                            int i49 = iM31972u16 + i48;
                            if (AbstractC1408n1.f5948a.mo4437J(bArr, iM31972u16, i49) != 0) {
                                throw InvalidProtocolBufferException.m4262b();
                            }
                            interfaceC1380e0.add(new String(bArr, iM31972u16, i48, AbstractC1383f0.f5887a));
                            iM31972u16 = i49;
                        }
                    }
                    return iM31972u16;
                }
                return i25;
            case 27:
                return i16 == 2 ? AbstractC11894a.m31969r(m4540p(i17), i15, bArr, i13, i14, interfaceC1380e0, c1376d) : i13;
            case 28:
                if (i16 != 2) {
                    return i13;
                }
                int iM31972u18 = AbstractC11894a.m31972u(bArr, i13, c1376d);
                int i54 = c1376d.f5876a;
                if (i54 < 0) {
                    throw InvalidProtocolBufferException.m4265e();
                }
                if (i54 > bArr.length - iM31972u18) {
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i54 == 0) {
                    interfaceC1380e0.add(AbstractC1391i.f5905x);
                } else {
                    interfaceC1380e0.add(AbstractC1391i.m4353d(bArr, iM31972u18, i54));
                    iM31972u18 += i54;
                }
                while (iM31972u18 < i14) {
                    int iM31972u19 = AbstractC11894a.m31972u(bArr, iM31972u18, c1376d);
                    if (i15 != c1376d.f5876a) {
                        return iM31972u18;
                    }
                    iM31972u18 = AbstractC11894a.m31972u(bArr, iM31972u19, c1376d);
                    int i55 = c1376d.f5876a;
                    if (i55 < 0) {
                        throw InvalidProtocolBufferException.m4265e();
                    }
                    if (i55 > bArr.length - iM31972u18) {
                        throw InvalidProtocolBufferException.m4267g();
                    }
                    if (i55 == 0) {
                        interfaceC1380e0.add(AbstractC1391i.f5905x);
                    } else {
                        interfaceC1380e0.add(AbstractC1391i.m4353d(bArr, iM31972u18, i55));
                        iM31972u18 += i55;
                    }
                }
                return iM31972u18;
            case 30:
            case 44:
                i26 = i13;
                if (i16 != 2) {
                    if (i16 == 0) {
                        iM31973v = AbstractC11894a.m31973v(i15, bArr, i26, i14, interfaceC1380e0, c1376d);
                    }
                    return i26;
                }
                C1371b0 c1371b3 = (C1371b0) interfaceC1380e0;
                iM31973v = AbstractC11894a.m31972u(bArr, i26, c1376d);
                int i56 = c1376d.f5876a + iM31973v;
                while (iM31973v < i56) {
                    iM31973v = AbstractC11894a.m31972u(bArr, iM31973v, c1376d);
                    c1371b3.m4283c(c1376d.f5876a);
                }
                if (iM31973v != i56) {
                    throw InvalidProtocolBufferException.m4267g();
                }
                m4538n(i17);
                Class cls = AbstractC1375c1.f5873a;
                return iM31973v;
            case 33:
            case 47:
                i26 = i13;
                if (i16 == 2) {
                    C1371b0 c1371b4 = (C1371b0) interfaceC1380e0;
                    int iM31972u20 = AbstractC11894a.m31972u(bArr, i26, c1376d);
                    int i57 = c1376d.f5876a + iM31972u20;
                    while (iM31972u20 < i57) {
                        iM31972u20 = AbstractC11894a.m31972u(bArr, iM31972u20, c1376d);
                        c1371b4.m4283c(AbstractC1400l.m4424g(c1376d.f5876a));
                    }
                    if (iM31972u20 == i57) {
                        return iM31972u20;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 == 0) {
                    C1371b0 c1371b5 = (C1371b0) interfaceC1380e0;
                    int iM31972u21 = AbstractC11894a.m31972u(bArr, i26, c1376d);
                    c1371b5.m4283c(AbstractC1400l.m4424g(c1376d.f5876a));
                    while (iM31972u21 < i14) {
                        int iM31972u22 = AbstractC11894a.m31972u(bArr, iM31972u21, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return iM31972u21;
                        }
                        iM31972u21 = AbstractC11894a.m31972u(bArr, iM31972u22, c1376d);
                        c1371b5.m4283c(AbstractC1400l.m4424g(c1376d.f5876a));
                    }
                    return iM31972u21;
                }
                return i26;
            case 34:
            case 48:
                i26 = i13;
                if (i16 == 2) {
                    AbstractC1398k0 abstractC1398k4 = (AbstractC1398k0) interfaceC1380e0;
                    int iM31972u23 = AbstractC11894a.m31972u(bArr, i26, c1376d);
                    int i58 = c1376d.f5876a + iM31972u23;
                    while (iM31972u23 < i58) {
                        iM31972u23 = AbstractC11894a.m31974w(bArr, iM31972u23, c1376d);
                        abstractC1398k4.m4406c(AbstractC1400l.m4425h(c1376d.f5877b));
                    }
                    if (iM31972u23 == i58) {
                        return iM31972u23;
                    }
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (i16 == 0) {
                    AbstractC1398k0 abstractC1398k5 = (AbstractC1398k0) interfaceC1380e0;
                    int iM31974w3 = AbstractC11894a.m31974w(bArr, i26, c1376d);
                    abstractC1398k5.m4406c(AbstractC1400l.m4425h(c1376d.f5877b));
                    while (iM31974w3 < i14) {
                        int iM31972u24 = AbstractC11894a.m31972u(bArr, iM31974w3, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return iM31974w3;
                        }
                        iM31974w3 = AbstractC11894a.m31974w(bArr, iM31972u24, c1376d);
                        abstractC1398k5.m4406c(AbstractC1400l.m4425h(c1376d.f5877b));
                    }
                    return iM31974w3;
                }
                return i26;
            case 49:
                if (i16 == 3) {
                    InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i17);
                    int i59 = (i15 & (-8)) | 4;
                    AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1M4540p.mo4290d();
                    int iM31941I = AbstractC11894a.m31941I(abstractC1368a0Mo4290d, interfaceC1372b1M4540p, bArr, i13, i14, i59, c1376d);
                    InterfaceC1372b1 interfaceC1372b1 = interfaceC1372b1M4540p;
                    byte[] bArr2 = bArr;
                    interfaceC1372b1.mo4288b(abstractC1368a0Mo4290d);
                    c1376d.f5878c = abstractC1368a0Mo4290d;
                    interfaceC1380e0.add(abstractC1368a0Mo4290d);
                    while (iM31941I < i14) {
                        int iM31972u25 = AbstractC11894a.m31972u(bArr2, iM31941I, c1376d);
                        if (i15 != c1376d.f5876a) {
                            return iM31941I;
                        }
                        AbstractC1368a0 abstractC1368a0Mo4290d2 = interfaceC1372b1.mo4290d();
                        byte[] bArr3 = bArr2;
                        InterfaceC1372b1 interfaceC1372b2 = interfaceC1372b1;
                        iM31941I = AbstractC11894a.m31941I(abstractC1368a0Mo4290d2, interfaceC1372b2, bArr3, iM31972u25, i14, i59, c1376d);
                        interfaceC1372b2.mo4288b(abstractC1368a0Mo4290d2);
                        c1376d.f5878c = abstractC1368a0Mo4290d2;
                        interfaceC1380e0.add(abstractC1368a0Mo4290d2);
                        interfaceC1372b1 = interfaceC1372b2;
                        bArr2 = bArr3;
                    }
                    return iM31941I;
                }
            default:
                return i13;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4525H(Object obj, long j7, C1403m c1403m, InterfaceC1372b1 interfaceC1372b1, C1417s c1417s) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo4363H;
        this.f5974k.getClass();
        InterfaceC1380e0 interfaceC1380e0M4354a = C1392i0.m4354a(j7, obj);
        AbstractC1400l abstractC1400l = c1403m.f5937a;
        int i13 = c1403m.f5938b;
        if ((i13 & 7) != 3) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1.mo4290d();
            c1403m.m4443b(abstractC1368a0Mo4290d, interfaceC1372b1, c1417s);
            interfaceC1372b1.mo4288b(abstractC1368a0Mo4290d);
            interfaceC1380e0M4354a.add(abstractC1368a0Mo4290d);
            if (abstractC1400l.mo4374k() || c1403m.f5940d != 0) {
                return;
            } else {
                iMo4363H = abstractC1400l.mo4363H();
            }
        } while (iMo4363H == i13);
        c1403m.f5940d = iMo4363H;
    }

    /* JADX INFO: renamed from: I */
    public final void m4526I(Object obj, int i13, C1403m c1403m, InterfaceC1372b1 interfaceC1372b1, C1417s c1417s) throws InvalidProtocolBufferException {
        int iMo4363H;
        this.f5974k.getClass();
        InterfaceC1380e0 interfaceC1380e0M4354a = C1392i0.m4354a(i13 & 1048575, obj);
        AbstractC1400l abstractC1400l = c1403m.f5937a;
        int i14 = c1403m.f5938b;
        if ((i14 & 7) != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1.mo4290d();
            c1403m.m4444c(abstractC1368a0Mo4290d, interfaceC1372b1, c1417s);
            interfaceC1372b1.mo4288b(abstractC1368a0Mo4290d);
            interfaceC1380e0M4354a.add(abstractC1368a0Mo4290d);
            if (abstractC1400l.mo4374k() || c1403m.f5940d != 0) {
                return;
            } else {
                iMo4363H = abstractC1400l.mo4363H();
            }
        } while (iMo4363H == i14);
        c1403m.f5940d = iMo4363H;
    }

    /* JADX INFO: renamed from: J */
    public final void m4527J(int i13, C1403m c1403m, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i13) != 0) {
            c1403m.m4463v(2);
            AbstractC1399k1.m4423p(i13 & 1048575, obj, c1403m.f5937a.mo4362G());
        } else if (!this.f5969f) {
            AbstractC1399k1.m4423p(i13 & 1048575, obj, c1403m.m4446e());
        } else {
            c1403m.m4463v(2);
            AbstractC1399k1.m4423p(i13 & 1048575, obj, c1403m.f5937a.mo4361F());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4528K(int i13, C1403m c1403m, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i14 = 536870912 & i13;
        C1392i0 c1392i0 = this.f5974k;
        if (i14 != 0) {
            c1392i0.getClass();
            c1403m.m4459r(C1392i0.m4354a(i13 & 1048575, obj), true);
        } else {
            c1392i0.getClass();
            c1403m.m4459r(C1392i0.m4354a(i13 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4529M(int i13, Object obj) {
        int i14 = this.f5964a[i13 + 2];
        long j7 = 1048575 & i14;
        if (j7 == 1048575) {
            return;
        }
        AbstractC1399k1.m4421n(j7, obj, (1 << (i14 >>> 20)) | AbstractC1399k1.f5928c.m4387g(j7, obj));
    }

    /* JADX INFO: renamed from: N */
    public final void m4530N(int i13, int i14, Object obj) {
        AbstractC1399k1.m4421n(this.f5964a[i14 + 2] & 1048575, obj, i13);
    }

    /* JADX INFO: renamed from: O */
    public final int m4531O(int i13, int i14) {
        int[] iArr = this.f5964a;
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

    /* JADX INFO: renamed from: P */
    public final void m4532P(int i13, Object obj, Object obj2) {
        f5963o.putObject(obj, m4534S(i13) & 1048575, obj2);
        m4529M(i13, obj);
    }

    /* JADX INFO: renamed from: Q */
    public final void m4533Q(Object obj, int i13, Object obj2, int i14) {
        f5963o.putObject(obj, m4534S(i14) & 1048575, obj2);
        m4530N(i13, i14, obj);
    }

    /* JADX INFO: renamed from: S */
    public final int m4534S(int i13) {
        return this.f5964a[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: T */
    public final void m4535T(Object obj, C1404m0 c1404m0) {
        int i13;
        boolean z4;
        C1418s0 c1418s0 = this;
        int[] iArr = c1418s0.f5964a;
        int length = iArr.length;
        Unsafe unsafe = f5963o;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int iM4534S = c1418s0.m4534S(i16);
            int i18 = iArr[i16];
            int iM4517R = m4517R(iM4534S);
            if (iM4517R <= 17) {
                int i19 = iArr[i16 + 2];
                int i24 = i19 & i14;
                if (i24 != i15) {
                    i17 = i24 == i14 ? 0 : unsafe.getInt(obj, i24);
                    i15 = i24;
                }
                i13 = 1 << (i19 >>> 20);
            } else {
                i13 = 0;
            }
            long j7 = iM4534S & i14;
            switch (iM4517R) {
                case 0:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        double dMo4345e = AbstractC1399k1.f5928c.mo4345e(j7, obj);
                        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
                        abstractC1411p.getClass();
                        abstractC1411p.mo4474r0(i18, Double.doubleToRawLongBits(dMo4345e));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 1:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        float fMo4346f = AbstractC1399k1.f5928c.mo4346f(j7, obj);
                        AbstractC1411p abstractC1411p2 = (AbstractC1411p) c1404m0.f5942a;
                        abstractC1411p2.getClass();
                        abstractC1411p2.mo4472p0(i18, Float.floatToRawIntBits(fMo4346f));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 2:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, unsafe.getLong(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 3:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, unsafe.getLong(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 4:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4476t0(i18, unsafe.getInt(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 5:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4474r0(i18, unsafe.getLong(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 6:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4472p0(i18, unsafe.getInt(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 7:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4470n0(i18, AbstractC1399k1.f5928c.mo4343c(j7, obj));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 8:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            ((AbstractC1411p) c1404m0.f5942a).mo4479w0(i18, (String) object);
                        } else {
                            ((AbstractC1411p) c1404m0.f5942a).mo4471o0(i18, (AbstractC1391i) object);
                        }
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 9:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4478v0(i18, (AbstractC1367a) unsafe.getObject(obj, j7), c1418s0.m4540p(i16));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 10:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4471o0(i18, (AbstractC1391i) unsafe.getObject(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 11:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4481y0(i18, unsafe.getInt(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 12:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4476t0(i18, unsafe.getInt(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 13:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4472p0(i18, unsafe.getInt(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 14:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4474r0(i18, unsafe.getLong(obj, j7));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 15:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        int i25 = unsafe.getInt(obj, j7);
                        ((AbstractC1411p) c1404m0.f5942a).mo4481y0(i18, (i25 >> 31) ^ (i25 << 1));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 16:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        long j13 = unsafe.getLong(obj, j7);
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, (j13 >> 63) ^ (j13 << 1));
                    }
                    c1418s0 = this;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c1418s0.m4542r(obj, i16, i15, i17, i13)) {
                        c1404m0.m4464a(i18, unsafe.getObject(obj, j7), c1418s0.m4540p(i16));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    AbstractC1375c1.m4311n(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC1375c1.m4315r(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 20:
                    AbstractC1375c1.m4317t(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 21:
                    AbstractC1375c1.m4323z(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    AbstractC1375c1.m4316s(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    AbstractC1375c1.m4314q(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 24:
                    AbstractC1375c1.m4313p(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 25:
                    AbstractC1375c1.m4310m(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 26:
                    int i26 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j7);
                    Class cls = AbstractC1375c1.f5873a;
                    if (list != null && !list.isEmpty()) {
                        AbstractC1411p abstractC1411p3 = (AbstractC1411p) c1404m0.f5942a;
                        if (list instanceof InterfaceC1389h0) {
                            InterfaceC1389h0 interfaceC1389h0 = (InterfaceC1389h0) list;
                            for (int i27 = 0; i27 < list.size(); i27++) {
                                Object objM4341h = interfaceC1389h0.m4341h();
                                if (objM4341h instanceof String) {
                                    abstractC1411p3.mo4479w0(i26, (String) objM4341h);
                                } else {
                                    abstractC1411p3.mo4471o0(i26, (AbstractC1391i) objM4341h);
                                }
                            }
                        } else {
                            for (int i28 = 0; i28 < list.size(); i28++) {
                                abstractC1411p3.mo4479w0(i26, (String) list.get(i28));
                            }
                        }
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 27:
                    int i29 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1372b1 interfaceC1372b1M4540p = c1418s0.m4540p(i16);
                    Class cls2 = AbstractC1375c1.f5873a;
                    if (list2 != null && !list2.isEmpty()) {
                        c1404m0.getClass();
                        for (int i34 = 0; i34 < list2.size(); i34++) {
                            ((AbstractC1411p) c1404m0.f5942a).mo4478v0(i29, (AbstractC1367a) list2.get(i34), interfaceC1372b1M4540p);
                        }
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 28:
                    int i35 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    Class cls3 = AbstractC1375c1.f5873a;
                    if (list3 != null && !list3.isEmpty()) {
                        c1404m0.getClass();
                        for (int i36 = 0; i36 < list3.size(); i36++) {
                            ((AbstractC1411p) c1404m0.f5942a).mo4471o0(i35, (AbstractC1391i) list3.get(i36));
                        }
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 29:
                    z4 = false;
                    AbstractC1375c1.m4322y(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 30:
                    z4 = false;
                    AbstractC1375c1.m4312o(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 31:
                    z4 = false;
                    AbstractC1375c1.m4318u(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 32:
                    z4 = false;
                    AbstractC1375c1.m4319v(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 33:
                    z4 = false;
                    AbstractC1375c1.m4320w(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 34:
                    z4 = false;
                    AbstractC1375c1.m4321x(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, false);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 35:
                    AbstractC1375c1.m4311n(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 36:
                    AbstractC1375c1.m4315r(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 37:
                    AbstractC1375c1.m4317t(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 38:
                    AbstractC1375c1.m4323z(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 39:
                    AbstractC1375c1.m4316s(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 40:
                    AbstractC1375c1.m4314q(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 41:
                    AbstractC1375c1.m4313p(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 42:
                    AbstractC1375c1.m4310m(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 43:
                    AbstractC1375c1.m4322y(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 44:
                    AbstractC1375c1.m4312o(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 45:
                    AbstractC1375c1.m4318u(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 46:
                    AbstractC1375c1.m4319v(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 47:
                    AbstractC1375c1.m4320w(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 48:
                    AbstractC1375c1.m4321x(iArr[i16], (List) unsafe.getObject(obj, j7), c1404m0, true);
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 49:
                    int i37 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1372b1 interfaceC1372b1M4540p2 = c1418s0.m4540p(i16);
                    Class cls4 = AbstractC1375c1.f5873a;
                    if (list4 != null && !list4.isEmpty()) {
                        c1404m0.getClass();
                        for (int i38 = 0; i38 < list4.size(); i38++) {
                            c1404m0.m4464a(i37, list4.get(i38), interfaceC1372b1M4540p2);
                        }
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        Object objM4539o = c1418s0.m4539o(i16);
                        c1418s0.f5976m.getClass();
                        AbstractC30802r.m94771t(objM4539o);
                        throw null;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 51:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        double dDoubleValue = ((Double) AbstractC1399k1.f5928c.m4389i(j7, obj)).doubleValue();
                        AbstractC1411p abstractC1411p4 = (AbstractC1411p) c1404m0.f5942a;
                        abstractC1411p4.getClass();
                        abstractC1411p4.mo4474r0(i18, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 52:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        float fFloatValue = ((Float) AbstractC1399k1.f5928c.m4389i(j7, obj)).floatValue();
                        AbstractC1411p abstractC1411p5 = (AbstractC1411p) c1404m0.f5942a;
                        abstractC1411p5.getClass();
                        abstractC1411p5.mo4472p0(i18, Float.floatToRawIntBits(fFloatValue));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 53:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, m4515C(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 54:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, m4515C(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 55:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4476t0(i18, m4514B(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 56:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4474r0(i18, m4515C(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 57:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4472p0(i18, m4514B(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 58:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4470n0(i18, ((Boolean) AbstractC1399k1.f5928c.m4389i(j7, obj)).booleanValue());
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 59:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof String) {
                            ((AbstractC1411p) c1404m0.f5942a).mo4479w0(i18, (String) object2);
                        } else {
                            ((AbstractC1411p) c1404m0.f5942a).mo4471o0(i18, (AbstractC1391i) object2);
                        }
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 60:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4478v0(i18, (AbstractC1367a) unsafe.getObject(obj, j7), c1418s0.m4540p(i16));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 61:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4471o0(i18, (AbstractC1391i) unsafe.getObject(obj, j7));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 62:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4481y0(i18, m4514B(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 63:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4476t0(i18, m4514B(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 64:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4472p0(i18, m4514B(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 65:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        ((AbstractC1411p) c1404m0.f5942a).mo4474r0(i18, m4515C(j7, obj));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 66:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        int iM4514B = m4514B(j7, obj);
                        ((AbstractC1411p) c1404m0.f5942a).mo4481y0(i18, (iM4514B >> 31) ^ (iM4514B << 1));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 67:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        long jM4515C = m4515C(j7, obj);
                        ((AbstractC1411p) c1404m0.f5942a).mo4465A0(i18, (jM4515C << 1) ^ (jM4515C >> 63));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 68:
                    if (c1418s0.m4543t(i18, i16, obj)) {
                        c1404m0.m4464a(i18, unsafe.getObject(obj, j7), c1418s0.m4540p(i16));
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                default:
                    i16 += 3;
                    i14 = 1048575;
                    break;
            }
        }
        ((C1384f1) c1418s0.f5975l).getClass();
        ((AbstractC1368a0) obj).unknownFields.m4332e(c1404m0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: a */
    public final void mo4287a(Object obj, Object obj2) {
        Object obj3;
        m4518l(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f5964a;
            if (i13 >= iArr.length) {
                AbstractC1375c1.m4308k(this.f5975l, obj, obj2);
                return;
            }
            int iM4534S = m4534S(i13);
            long j7 = 1048575 & iM4534S;
            int i14 = iArr[i13];
            switch (m4517R(iM4534S)) {
                case 0:
                    if (!m4541q(i13, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC1396j1 abstractC1396j1 = AbstractC1399k1.f5928c;
                        obj3 = obj;
                        abstractC1396j1.mo4349m(obj3, j7, abstractC1396j1.mo4345e(j7, obj2));
                        m4529M(i13, obj3);
                    }
                    break;
                case 1:
                    if (m4541q(i13, obj2)) {
                        AbstractC1396j1 abstractC1396j2 = AbstractC1399k1.f5928c;
                        abstractC1396j2.mo4350n(obj, j7, abstractC1396j2.mo4346f(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4422o(obj, j7, AbstractC1399k1.f5928c.m4388h(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4422o(obj, j7, AbstractC1399k1.f5928c.m4388h(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4422o(obj, j7, AbstractC1399k1.f5928c.m4388h(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m4541q(i13, obj2)) {
                        AbstractC1396j1 abstractC1396j3 = AbstractC1399k1.f5928c;
                        abstractC1396j3.mo4347k(obj, j7, abstractC1396j3.mo4343c(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4423p(j7, obj, AbstractC1399k1.f5928c.m4389i(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m4545v(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4423p(j7, obj, AbstractC1399k1.f5928c.m4389i(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4422o(obj, j7, AbstractC1399k1.f5928c.m4388h(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4421n(j7, obj, AbstractC1399k1.f5928c.m4387g(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m4541q(i13, obj2)) {
                        AbstractC1399k1.m4422o(obj, j7, AbstractC1399k1.f5928c.m4388h(j7, obj2));
                        m4529M(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m4545v(i13, obj, obj2);
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
                    this.f5974k.getClass();
                    AbstractC1396j1 abstractC1396j4 = AbstractC1399k1.f5928c;
                    InterfaceC1380e0 interfaceC1380e0Mo4286i = (InterfaceC1380e0) abstractC1396j4.m4389i(j7, obj);
                    InterfaceC1380e0 interfaceC1380e0 = (InterfaceC1380e0) abstractC1396j4.m4389i(j7, obj2);
                    int size = interfaceC1380e0Mo4286i.size();
                    int size2 = interfaceC1380e0.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1370b) interfaceC1380e0Mo4286i).f5867w) {
                            interfaceC1380e0Mo4286i = interfaceC1380e0Mo4286i.mo4286i(size2 + size);
                        }
                        interfaceC1380e0Mo4286i.addAll(interfaceC1380e0);
                    }
                    if (size > 0) {
                        interfaceC1380e0 = interfaceC1380e0Mo4286i;
                    }
                    AbstractC1399k1.m4423p(j7, obj, interfaceC1380e0);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC1375c1.f5873a;
                    AbstractC1396j1 abstractC1396j5 = AbstractC1399k1.f5928c;
                    Object objM4389i = abstractC1396j5.m4389i(j7, obj);
                    Object objM4389i2 = abstractC1396j5.m4389i(j7, obj2);
                    this.f5976m.getClass();
                    AbstractC1399k1.m4423p(j7, obj, C1410o0.m4498a(objM4389i, objM4389i2));
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
                    if (m4543t(i14, i13, obj2)) {
                        AbstractC1399k1.m4423p(j7, obj, AbstractC1399k1.f5928c.m4389i(j7, obj2));
                        m4530N(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m4546w(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m4543t(i14, i13, obj2)) {
                        AbstractC1399k1.m4423p(j7, obj, AbstractC1399k1.f5928c.m4389i(j7, obj2));
                        m4530N(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m4546w(i13, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: b */
    public final void mo4288b(Object obj) {
        if (m4519s(obj)) {
            if (obj instanceof AbstractC1368a0) {
                AbstractC1368a0 abstractC1368a0 = (AbstractC1368a0) obj;
                abstractC1368a0.m4279l(Integer.MAX_VALUE);
                abstractC1368a0.memoizedHashCode = 0;
                abstractC1368a0.m4277i();
            }
            int[] iArr = this.f5964a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iM4534S = m4534S(i13);
                long j7 = 1048575 & iM4534S;
                int iM4517R = m4517R(iM4534S);
                if (iM4517R != 9) {
                    if (iM4517R != 60 && iM4517R != 68) {
                        switch (iM4517R) {
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                if (m4541q(i13, obj)) {
                                    m4540p(i13).mo4288b(f5963o.getObject(obj, j7));
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
                                this.f5974k.getClass();
                                AbstractC1370b abstractC1370b = (AbstractC1370b) ((InterfaceC1380e0) AbstractC1399k1.f5928c.m4389i(j7, obj));
                                if (abstractC1370b.f5867w) {
                                    abstractC1370b.f5867w = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f5963o;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    this.f5976m.getClass();
                                    ((C1407n0) object).f5947w = false;
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (m4543t(iArr[i13], i13, obj)) {
                        m4540p(i13).mo4288b(f5963o.getObject(obj, j7));
                    }
                } else if (m4541q(i13, obj)) {
                    m4540p(i13).mo4288b(f5963o.getObject(obj, j7));
                }
            }
            ((C1384f1) this.f5975l).getClass();
            C1381e1 c1381e1 = ((AbstractC1368a0) obj).unknownFields;
            if (c1381e1.f5885e) {
                c1381e1.f5885e = false;
            }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: c */
    public final boolean mo4289c(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f5971h) {
            int i18 = this.f5970g[i17];
            int[] iArr = this.f5964a;
            int i19 = iArr[i18];
            int iM4534S = m4534S(i18);
            int i24 = iArr[i18 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i15) {
                if (i25 != 1048575) {
                    i16 = f5963o.getInt(obj, i25);
                }
                i14 = i16;
                i13 = i25;
            } else {
                int i27 = i16;
                i13 = i15;
                i14 = i27;
            }
            if ((268435456 & iM4534S) == 0 || m4542r(obj, i18, i13, i14, i26)) {
                int iM4517R = m4517R(iM4534S);
                if (iM4517R == 9 || iM4517R == 17) {
                    if (m4542r(obj, i18, i13, i14, i26)) {
                        if (!m4540p(i18).mo4289c(AbstractC1399k1.f5928c.m4389i(iM4534S & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i17++;
                    i15 = i13;
                    i16 = i14;
                } else {
                    if (iM4517R != 27) {
                        if (iM4517R == 60 || iM4517R == 68) {
                            if (m4543t(i19, i18, obj)) {
                                if (!m4540p(i18).mo4289c(AbstractC1399k1.f5928c.m4389i(iM4534S & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iM4517R != 49) {
                            if (iM4517R != 50) {
                                continue;
                            } else {
                                Object objM4389i = AbstractC1399k1.f5928c.m4389i(iM4534S & 1048575, obj);
                                this.f5976m.getClass();
                                if (!((C1407n0) objM4389i).isEmpty()) {
                                    AbstractC30802r.m94771t(m4539o(i18));
                                    throw null;
                                }
                            }
                        }
                        i17++;
                        i15 = i13;
                        i16 = i14;
                    }
                    List list = (List) AbstractC1399k1.f5928c.m4389i(iM4534S & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i18);
                        for (int i28 = 0; i28 < list.size(); i28++) {
                            if (interfaceC1372b1M4540p.mo4289c(list.get(i28))) {
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

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: d */
    public final AbstractC1368a0 mo4290d() {
        this.f5973j.getClass();
        return ((AbstractC1368a0) this.f5968e).m4278j();
    }

    /* JADX WARN: Code duplicated, block: B:151:0x06d8 A[Catch: all -> 0x0441, TryCatch #2 {all -> 0x0441, blocks: (B:149:0x06d3, B:151:0x06d8, B:152:0x06dd, B:111:0x043c, B:114:0x0444, B:115:0x0459, B:116:0x046e, B:117:0x0483, B:118:0x0498, B:119:0x04ad, B:120:0x04c2, B:121:0x04d7, B:122:0x04ec, B:123:0x0506, B:124:0x0520, B:125:0x053b, B:126:0x0556, B:127:0x0571, B:128:0x058f, B:129:0x05aa, B:130:0x05bf, B:131:0x05da, B:132:0x05e7, B:133:0x0604, B:134:0x061f, B:135:0x063a, B:136:0x0655, B:137:0x0670, B:138:0x068b, B:139:0x06a7, B:143:0x06c3), top: B:173:0x06d3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x06e8 A[LOOP:2: B:155:0x06e6->B:156:0x06e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:163:0x0704 A[LOOP:3: B:162:0x0702->B:163:0x0704, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x070e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[PHI: r13
      0x0044: PHI (r13v5 androidx.glance.appwidget.protobuf.e1) = 
      (r13v1 androidx.glance.appwidget.protobuf.e1)
      (r13v3 androidx.glance.appwidget.protobuf.e1)
      (r13v16 androidx.glance.appwidget.protobuf.e1)
     binds: [B:16:0x003f, B:29:0x006d, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:197:0x06e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: e */
    public final void mo4291e(Object obj, C1403m c1403m, C1417s c1417s) throws Throwable {
        int i13;
        int i14;
        C1403m c1403m2;
        int i15;
        C1418s0 c1418s0 = this;
        Object obj2 = obj;
        C1403m c1403m3 = c1403m;
        C1417s c1417s2 = c1417s;
        c1417s2.getClass();
        m4518l(obj2);
        AbstractC1378d1 abstractC1378d1 = c1418s0.f5975l;
        int[] iArr = c1418s0.f5970g;
        int i16 = c1418s0.f5972i;
        int i17 = c1418s0.f5971h;
        C1381e1 c1381e1Mo4324a = null;
        while (true) {
            try {
                int iM4442a = c1403m3.m4442a();
                int iM4531O = (iM4442a < c1418s0.f5966c || iM4442a > c1418s0.f5967d) ? -1 : c1418s0.m4531O(iM4442a, 0);
                if (iM4531O >= 0) {
                    int iM4534S = c1418s0.m4534S(iM4531O);
                    try {
                        int iM4517R = m4517R(iM4534S);
                        C1392i0 c1392i0 = c1418s0.f5974k;
                        switch (iM4517R) {
                            case 0:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A = m4513A(iM4534S);
                                c1403m2.m4463v(1);
                                Object obj3 = obj2;
                                try {
                                    AbstractC1399k1.f5928c.mo4349m(obj3, jM4513A, c1403m2.f5937a.mo4379u());
                                    obj2 = obj3;
                                    c1418s0.m4529M(iM4531O, obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj2 = obj3;
                                    try {
                                        abstractC1378d1.getClass();
                                        if (c1381e1Mo4324a == null) {
                                            c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                        }
                                        if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                            for (i15 = i13; i15 < i16; i15++) {
                                                c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                            }
                                            if (c1381e1Mo4324a != null) {
                                                ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        for (i14 = i13; i14 < i16; i14++) {
                                            c1418s0.m4537m(iArr[i14], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((C1384f1) abstractC1378d1).getClass();
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj3;
                                    while (i14 < i16) {
                                        c1418s0.m4537m(iArr[i14], obj2, c1381e1Mo4324a);
                                    }
                                    if (c1381e1Mo4324a != null) {
                                        ((C1384f1) abstractC1378d1).getClass();
                                        ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                    }
                                    throw th;
                                }
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 1:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A2 = m4513A(iM4534S);
                                c1403m2.m4463v(5);
                                AbstractC1399k1.f5928c.mo4350n(obj2, jM4513A2, c1403m2.f5937a.mo4383y());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 2:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A3 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4422o(obj2, jM4513A3, c1403m2.f5937a.mo4356A());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 3:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A4 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4422o(obj2, jM4513A4, c1403m2.f5937a.mo4365J());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 4:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A5 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4421n(jM4513A5, obj2, c1403m2.f5937a.mo4384z());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 5:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A6 = m4513A(iM4534S);
                                c1403m2.m4463v(1);
                                AbstractC1399k1.m4422o(obj2, jM4513A6, c1403m2.f5937a.mo4382x());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 6:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A7 = m4513A(iM4534S);
                                c1403m2.m4463v(5);
                                AbstractC1399k1.m4421n(jM4513A7, obj2, c1403m2.f5937a.mo4381w());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 7:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A8 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.f5928c.mo4347k(obj2, jM4513A8, c1403m2.f5937a.mo4377s());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 8:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                c1418s0.m4527J(iM4534S, c1403m2, obj2);
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 9:
                                C1417s c1417s3 = c1417s2;
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                AbstractC1367a abstractC1367a = (AbstractC1367a) c1418s0.m4547x(iM4531O, obj2);
                                InterfaceC1372b1 interfaceC1372b1M4540p = c1418s0.m4540p(iM4531O);
                                c1403m2.m4463v(2);
                                c1403m2.m4444c(abstractC1367a, interfaceC1372b1M4540p, c1417s3);
                                c1418s0.m4532P(iM4531O, obj2, abstractC1367a);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 10:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                AbstractC1399k1.m4423p(m4513A(iM4534S), obj2, c1403m2.m4446e());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 11:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A9 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4421n(jM4513A9, obj2, c1403m2.f5937a.mo4364I());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 12:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                c1403m2.m4463v(0);
                                int iMo4380v = c1403m2.f5937a.mo4380v();
                                c1418s0.m4538n(iM4531O);
                                AbstractC1399k1.m4421n(m4513A(iM4534S), obj2, iMo4380v);
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 13:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A10 = m4513A(iM4534S);
                                c1403m2.m4463v(5);
                                AbstractC1399k1.m4421n(jM4513A10, obj2, c1403m2.f5937a.mo4357B());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 14:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A11 = m4513A(iM4534S);
                                c1403m2.m4463v(1);
                                AbstractC1399k1.m4422o(obj2, jM4513A11, c1403m2.f5937a.mo4358C());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 15:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A12 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4421n(jM4513A12, obj2, c1403m2.f5937a.mo4359D());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 16:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A13 = m4513A(iM4534S);
                                c1403m2.m4463v(0);
                                AbstractC1399k1.m4422o(obj2, jM4513A13, c1403m2.f5937a.mo4360E());
                                c1418s0.m4529M(iM4531O, obj2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                C1417s c1417s4 = c1417s2;
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                AbstractC1367a abstractC1367a2 = (AbstractC1367a) c1418s0.m4547x(iM4531O, obj2);
                                InterfaceC1372b1 interfaceC1372b1M4540p2 = c1418s0.m4540p(iM4531O);
                                c1403m2.m4463v(3);
                                c1403m2.m4443b(abstractC1367a2, interfaceC1372b1M4540p2, c1417s4);
                                c1418s0.m4532P(iM4531O, obj2, abstractC1367a2);
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A14 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4448g(C1392i0.m4354a(jM4513A14, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A15 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4452k(C1392i0.m4354a(jM4513A15, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 20:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A16 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4454m(C1392i0.m4354a(jM4513A16, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 21:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A17 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4461t(C1392i0.m4354a(jM4513A17, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A18 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4453l(C1392i0.m4354a(jM4513A18, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A19 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4451j(C1392i0.m4354a(jM4513A19, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 24:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A20 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4450i(C1392i0.m4354a(jM4513A20, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 25:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                long jM4513A21 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m2.m4445d(C1392i0.m4354a(jM4513A21, obj2));
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 26:
                                i13 = i17;
                                c1418s0 = c1418s0;
                                c1403m2 = c1403m3;
                                try {
                                    c1418s0.m4528K(iM4534S, c1403m2, obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    abstractC1378d1.getClass();
                                    if (c1381e1Mo4324a == null) {
                                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                    }
                                    if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                        while (i15 < i16) {
                                            c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 27:
                                i13 = i17;
                                try {
                                    try {
                                        c1418s0.m4526I(obj2, iM4534S, c1403m3, c1418s0.m4540p(iM4531O), c1417s);
                                        c1403m2 = c1403m3;
                                        c1418s0 = c1418s0;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        c1403m2 = c1403m3;
                                        c1418s0 = c1418s0;
                                        abstractC1378d1.getClass();
                                        if (c1381e1Mo4324a == null) {
                                            c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                        }
                                        if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                            while (i15 < i16) {
                                                c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                            }
                                            if (c1381e1Mo4324a != null) {
                                                ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    c1403m2 = c1403m3;
                                    abstractC1378d1.getClass();
                                    if (c1381e1Mo4324a == null) {
                                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                    }
                                    if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                        while (i15 < i16) {
                                            c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 28:
                                i13 = i17;
                                long jM4513A22 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4447f(C1392i0.m4354a(jM4513A22, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 29:
                                i13 = i17;
                                long jM4513A23 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4460s(C1392i0.m4354a(jM4513A23, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 30:
                                i13 = i17;
                                long jM4513A24 = m4513A(iM4534S);
                                c1392i0.getClass();
                                InterfaceC1380e0 interfaceC1380e0M4354a = C1392i0.m4354a(jM4513A24, obj2);
                                c1403m3.m4449h(interfaceC1380e0M4354a);
                                c1418s0.m4538n(iM4531O);
                                AbstractC1375c1.m4307j(obj2, iM4442a, interfaceC1380e0M4354a, c1381e1Mo4324a, abstractC1378d1);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 31:
                                i13 = i17;
                                long jM4513A25 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4455n(C1392i0.m4354a(jM4513A25, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 32:
                                i13 = i17;
                                long jM4513A26 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4456o(C1392i0.m4354a(jM4513A26, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 33:
                                i13 = i17;
                                long jM4513A27 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4457p(C1392i0.m4354a(jM4513A27, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 34:
                                i13 = i17;
                                long jM4513A28 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4458q(C1392i0.m4354a(jM4513A28, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 35:
                                i13 = i17;
                                long jM4513A29 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4448g(C1392i0.m4354a(jM4513A29, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 36:
                                i13 = i17;
                                long jM4513A30 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4452k(C1392i0.m4354a(jM4513A30, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 37:
                                i13 = i17;
                                long jM4513A31 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4454m(C1392i0.m4354a(jM4513A31, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 38:
                                i13 = i17;
                                long jM4513A32 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4461t(C1392i0.m4354a(jM4513A32, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 39:
                                i13 = i17;
                                long jM4513A33 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4453l(C1392i0.m4354a(jM4513A33, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 40:
                                i13 = i17;
                                long jM4513A34 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4451j(C1392i0.m4354a(jM4513A34, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 41:
                                i13 = i17;
                                long jM4513A35 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4450i(C1392i0.m4354a(jM4513A35, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 42:
                                i13 = i17;
                                long jM4513A36 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4445d(C1392i0.m4354a(jM4513A36, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 43:
                                i13 = i17;
                                long jM4513A37 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4460s(C1392i0.m4354a(jM4513A37, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 44:
                                i13 = i17;
                                long jM4513A38 = m4513A(iM4534S);
                                c1392i0.getClass();
                                InterfaceC1380e0 interfaceC1380e0M4354a2 = C1392i0.m4354a(jM4513A38, obj2);
                                c1403m3.m4449h(interfaceC1380e0M4354a2);
                                c1418s0.m4538n(iM4531O);
                                AbstractC1375c1.m4307j(obj2, iM4442a, interfaceC1380e0M4354a2, c1381e1Mo4324a, abstractC1378d1);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 45:
                                i13 = i17;
                                long jM4513A39 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4455n(C1392i0.m4354a(jM4513A39, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 46:
                                i13 = i17;
                                long jM4513A40 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4456o(C1392i0.m4354a(jM4513A40, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 47:
                                i13 = i17;
                                long jM4513A41 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4457p(C1392i0.m4354a(jM4513A41, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 48:
                                i13 = i17;
                                long jM4513A42 = m4513A(iM4534S);
                                c1392i0.getClass();
                                c1403m3.m4458q(C1392i0.m4354a(jM4513A42, obj2));
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 49:
                                i13 = i17;
                                try {
                                    try {
                                        c1418s0.m4525H(obj2, m4513A(iM4534S), c1403m, c1418s0.m4540p(iM4531O), c1417s);
                                        c1403m3 = c1403m;
                                        c1403m2 = c1403m3;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        c1418s0 = c1418s0;
                                        c1403m2 = c1403m;
                                        abstractC1378d1.getClass();
                                        if (c1381e1Mo4324a == null) {
                                            c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                        }
                                        if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                            while (i15 < i16) {
                                                c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                            }
                                            if (c1381e1Mo4324a != null) {
                                                ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    c1403m2 = c1403m;
                                    c1418s0 = c1418s0;
                                    abstractC1378d1.getClass();
                                    if (c1381e1Mo4324a == null) {
                                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                    }
                                    if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                        while (i15 < i16) {
                                            c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                            return;
                                        }
                                        return;
                                    }
                                    c1418s0 = c1418s0;
                                    c1403m3 = c1403m2;
                                    i17 = i13;
                                    c1417s2 = c1417s;
                                    break;
                                }
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 50:
                                i13 = i17;
                                c1418s0.m4544u(iM4531O, obj2, c1418s0.m4539o(iM4531O));
                                throw null;
                            case 51:
                                i13 = i17;
                                long jM4513A43 = m4513A(iM4534S);
                                c1403m3.m4463v(1);
                                AbstractC1399k1.m4423p(jM4513A43, obj2, Double.valueOf(c1403m3.f5937a.mo4379u()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 52:
                                i13 = i17;
                                long jM4513A44 = m4513A(iM4534S);
                                c1403m3.m4463v(5);
                                AbstractC1399k1.m4423p(jM4513A44, obj2, Float.valueOf(c1403m3.f5937a.mo4383y()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 53:
                                i13 = i17;
                                long jM4513A45 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A45, obj2, Long.valueOf(c1403m3.f5937a.mo4356A()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 54:
                                i13 = i17;
                                long jM4513A46 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A46, obj2, Long.valueOf(c1403m3.f5937a.mo4365J()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 55:
                                i13 = i17;
                                long jM4513A47 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A47, obj2, Integer.valueOf(c1403m3.f5937a.mo4384z()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 56:
                                i13 = i17;
                                long jM4513A48 = m4513A(iM4534S);
                                c1403m3.m4463v(1);
                                AbstractC1399k1.m4423p(jM4513A48, obj2, Long.valueOf(c1403m3.f5937a.mo4382x()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 57:
                                i13 = i17;
                                long jM4513A49 = m4513A(iM4534S);
                                c1403m3.m4463v(5);
                                AbstractC1399k1.m4423p(jM4513A49, obj2, Integer.valueOf(c1403m3.f5937a.mo4381w()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 58:
                                i13 = i17;
                                long jM4513A50 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A50, obj2, Boolean.valueOf(c1403m3.f5937a.mo4377s()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 59:
                                i13 = i17;
                                c1418s0.m4527J(iM4534S, c1403m3, obj2);
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 60:
                                i13 = i17;
                                AbstractC1367a abstractC1367a3 = (AbstractC1367a) c1418s0.m4548y(iM4442a, iM4531O, obj2);
                                InterfaceC1372b1 interfaceC1372b1M4540p3 = c1418s0.m4540p(iM4531O);
                                c1403m3.m4463v(2);
                                c1403m3.m4444c(abstractC1367a3, interfaceC1372b1M4540p3, c1417s2);
                                c1418s0.m4533Q(obj2, iM4442a, abstractC1367a3, iM4531O);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 61:
                                i13 = i17;
                                AbstractC1399k1.m4423p(m4513A(iM4534S), obj2, c1403m3.m4446e());
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 62:
                                i13 = i17;
                                long jM4513A51 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A51, obj2, Integer.valueOf(c1403m3.f5937a.mo4364I()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 63:
                                i13 = i17;
                                c1403m3.m4463v(0);
                                int iMo4380v2 = c1403m3.f5937a.mo4380v();
                                c1418s0.m4538n(iM4531O);
                                AbstractC1399k1.m4423p(m4513A(iM4534S), obj2, Integer.valueOf(iMo4380v2));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 64:
                                i13 = i17;
                                long jM4513A52 = m4513A(iM4534S);
                                c1403m3.m4463v(5);
                                AbstractC1399k1.m4423p(jM4513A52, obj2, Integer.valueOf(c1403m3.f5937a.mo4357B()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 65:
                                i13 = i17;
                                long jM4513A53 = m4513A(iM4534S);
                                c1403m3.m4463v(1);
                                AbstractC1399k1.m4423p(jM4513A53, obj2, Long.valueOf(c1403m3.f5937a.mo4358C()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 66:
                                i13 = i17;
                                long jM4513A54 = m4513A(iM4534S);
                                c1403m3.m4463v(0);
                                AbstractC1399k1.m4423p(jM4513A54, obj2, Integer.valueOf(c1403m3.f5937a.mo4359D()));
                                c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 67:
                                i13 = i17;
                                try {
                                    try {
                                        long jM4513A55 = m4513A(iM4534S);
                                        c1403m3.m4463v(0);
                                        AbstractC1399k1.m4423p(jM4513A55, obj2, Long.valueOf(c1403m3.f5937a.mo4360E()));
                                        c1418s0.m4530N(iM4442a, iM4531O, obj2);
                                        c1403m2 = c1403m3;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c1418s0 = c1418s0;
                                        while (i14 < i16) {
                                            c1418s0.m4537m(iArr[i14], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((C1384f1) abstractC1378d1).getClass();
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    c1403m2 = c1403m3;
                                    abstractC1378d1.getClass();
                                    if (c1381e1Mo4324a == null) {
                                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                    }
                                    if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                        while (i15 < i16) {
                                            c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                        }
                                        if (c1381e1Mo4324a != null) {
                                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            case 68:
                                AbstractC1367a abstractC1367a4 = (AbstractC1367a) c1418s0.m4548y(iM4442a, iM4531O, obj2);
                                InterfaceC1372b1 interfaceC1372b1M4540p4 = c1418s0.m4540p(iM4531O);
                                c1403m3.m4463v(3);
                                c1403m3.m4443b(abstractC1367a4, interfaceC1372b1M4540p4, c1417s2);
                                c1418s0.m4533Q(obj2, iM4442a, abstractC1367a4, iM4531O);
                                i13 = i17;
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                            default:
                                if (c1381e1Mo4324a == null) {
                                    try {
                                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        i13 = i17;
                                        c1403m2 = c1403m3;
                                        abstractC1378d1.getClass();
                                        if (c1381e1Mo4324a == null) {
                                            c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                                        }
                                        if (!abstractC1378d1.m4325b(0, c1403m2, c1381e1Mo4324a)) {
                                            while (i15 < i16) {
                                                c1418s0.m4537m(iArr[i15], obj2, c1381e1Mo4324a);
                                            }
                                            if (c1381e1Mo4324a != null) {
                                                ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (!abstractC1378d1.m4325b(0, c1403m3, c1381e1Mo4324a)) {
                                    while (i17 < i16) {
                                        c1418s0.m4537m(iArr[i17], obj2, c1381e1Mo4324a);
                                        i17++;
                                    }
                                    if (c1381e1Mo4324a != null) {
                                        ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                                    }
                                }
                                i13 = i17;
                                c1403m2 = c1403m3;
                                c1418s0 = c1418s0;
                                c1403m3 = c1403m2;
                                i17 = i13;
                                c1417s2 = c1417s;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                        i13 = i17;
                    }
                } else if (iM4442a == Integer.MAX_VALUE) {
                    while (i17 < i16) {
                        c1418s0.m4537m(iArr[i17], obj2, c1381e1Mo4324a);
                        i17++;
                    }
                    if (c1381e1Mo4324a != null) {
                        ((C1384f1) abstractC1378d1).getClass();
                        ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                    }
                } else {
                    abstractC1378d1.getClass();
                    if (c1381e1Mo4324a == null) {
                        c1381e1Mo4324a = abstractC1378d1.mo4324a(obj2);
                    }
                    if (!abstractC1378d1.m4325b(0, c1403m3, c1381e1Mo4324a)) {
                        while (i17 < i16) {
                            c1418s0.m4537m(iArr[i17], obj2, c1381e1Mo4324a);
                            i17++;
                        }
                        if (c1381e1Mo4324a != null) {
                            ((AbstractC1368a0) obj2).unknownFields = c1381e1Mo4324a;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                c1418s0 = c1418s0;
                i13 = i17;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: f */
    public final int mo4292f(AbstractC1368a0 abstractC1368a0) {
        int i13;
        int iM4334b;
        int i14;
        int[] iArr = this.f5964a;
        int length = iArr.length;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 += 3) {
            int iM4534S = m4534S(i16);
            int i17 = iArr[i16];
            long j7 = 1048575 & iM4534S;
            int i18 = 1237;
            int iHashCode = 37;
            switch (m4517R(iM4534S)) {
                case 0:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(Double.doubleToLongBits(AbstractC1399k1.f5928c.mo4345e(j7, abstractC1368a0)));
                    i15 = iM4334b + i13;
                    break;
                case 1:
                    i13 = i15 * 53;
                    iM4334b = Float.floatToIntBits(AbstractC1399k1.f5928c.mo4346f(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case 2:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(AbstractC1399k1.f5928c.m4388h(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case 3:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(AbstractC1399k1.f5928c.m4388h(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case 4:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 5:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(AbstractC1399k1.f5928c.m4388h(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case 6:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 7:
                    i14 = i15 * 53;
                    boolean zMo4343c = AbstractC1399k1.f5928c.mo4343c(j7, abstractC1368a0);
                    Charset charset = AbstractC1383f0.f5887a;
                    if (zMo4343c) {
                        i18 = 1231;
                    }
                    i15 = i18 + i14;
                    break;
                case 8:
                    i13 = i15 * 53;
                    iM4334b = ((String) AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0)).hashCode();
                    i15 = iM4334b + i13;
                    break;
                case 9:
                    Object objM4389i = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0);
                    if (objM4389i != null) {
                        iHashCode = objM4389i.hashCode();
                    }
                    i15 = (i15 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                    i15 = iM4334b + i13;
                    break;
                case 11:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 12:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 13:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 14:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(AbstractC1399k1.f5928c.m4388h(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case 15:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4387g(j7, abstractC1368a0);
                    i15 = iM4334b + i13;
                    break;
                case 16:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1383f0.m4334b(AbstractC1399k1.f5928c.m4388h(j7, abstractC1368a0));
                    i15 = iM4334b + i13;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    Object objM4389i2 = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0);
                    if (objM4389i2 != null) {
                        iHashCode = objM4389i2.hashCode();
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
                    iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                    i15 = iM4334b + i13;
                    break;
                case 50:
                    i13 = i15 * 53;
                    iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                    i15 = iM4334b + i13;
                    break;
                case 51:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(Double.doubleToLongBits(((Double) AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0)).doubleValue()));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 52:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = Float.floatToIntBits(((Float) AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0)).floatValue());
                        i15 = iM4334b + i13;
                    }
                    break;
                case 53:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(m4515C(j7, abstractC1368a0));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 54:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(m4515C(j7, abstractC1368a0));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 55:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 56:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(m4515C(j7, abstractC1368a0));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 57:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 58:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i14 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0)).booleanValue();
                        Charset charset2 = AbstractC1383f0.f5887a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i14;
                    }
                    break;
                case 59:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = ((String) AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0)).hashCode();
                        i15 = iM4334b + i13;
                    }
                    break;
                case 60:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                        i15 = iM4334b + i13;
                    }
                    break;
                case 61:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                        i15 = iM4334b + i13;
                    }
                    break;
                case 62:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 63:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 64:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 65:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(m4515C(j7, abstractC1368a0));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 66:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = m4514B(j7, abstractC1368a0);
                        i15 = iM4334b + i13;
                    }
                    break;
                case 67:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1383f0.m4334b(m4515C(j7, abstractC1368a0));
                        i15 = iM4334b + i13;
                    }
                    break;
                case 68:
                    if (m4543t(i17, i16, abstractC1368a0)) {
                        i13 = i15 * 53;
                        iM4334b = AbstractC1399k1.f5928c.m4389i(j7, abstractC1368a0).hashCode();
                        i15 = iM4334b + i13;
                    }
                    break;
            }
        }
        ((C1384f1) this.f5975l).getClass();
        return abstractC1368a0.unknownFields.hashCode() + (i15 * 53);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: g */
    public final void mo4293g(Object obj, byte[] bArr, int i13, int i14, C1376d c1376d) {
        m4522E(obj, bArr, i13, i14, 0, c1376d);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x036e  */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: h */
    public final int mo4294h(AbstractC1368a0 abstractC1368a0) {
        int i13;
        int iM4503i0;
        int iM4503i1;
        int iM4503i2;
        int iM4505k0;
        int iM4503i3;
        int iM4505k1;
        int iM4503i4;
        int iM4503i5;
        int iM4503i6;
        int iMo4269b;
        int iM4504j0;
        int iM4499e0;
        int iM4503i7;
        int iMo4269b2;
        int iM4300c;
        int iM4503i8;
        int size;
        int iM4306i;
        int iM4503i9;
        int iM4503i10;
        int size2;
        int iM4503i11;
        int iM4504j1;
        int iMo4269b3;
        int iM4503i12;
        int iM4503i13;
        int iM4505k2;
        int iM4503i14;
        int iM4505k3;
        int i14;
        C1418s0 c1418s0 = this;
        AbstractC1368a0 abstractC1368a1 = abstractC1368a0;
        Unsafe unsafe = f5963o;
        int i15 = 0;
        int i16 = 0;
        int iM4499e1 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = c1418s0.f5964a;
            if (i15 >= iArr.length) {
                ((C1384f1) c1418s0.f5975l).getClass();
                return abstractC1368a1.unknownFields.m4330b() + iM4499e1;
            }
            int iM4534S = c1418s0.m4534S(i15);
            int iM4517R = m4517R(iM4534S);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i24 = i19 & 1048575;
            if (iM4517R <= 17) {
                if (i24 != i17) {
                    i16 = i24 == 1048575 ? 0 : unsafe.getInt(abstractC1368a1, i24);
                    i17 = i24;
                }
                i13 = 1 << (i19 >>> 20);
            } else {
                i13 = 0;
            }
            long j7 = iM4534S & 1048575;
            if (iM4517R >= EnumC1423v.f5983x.f5986w) {
                int i25 = EnumC1423v.f5984y.f5986w;
            }
            switch (iM4517R) {
                case 0:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i0 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i0 + 8;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 1:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i1 = AbstractC1411p.m4503i0(i18);
                        iM4503i5 = iM4503i1 + 4;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 2:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        long j13 = unsafe.getLong(abstractC1368a1, j7);
                        iM4503i2 = AbstractC1411p.m4503i0(i18);
                        iM4505k0 = AbstractC1411p.m4505k0(j13);
                        iM4499e1 += iM4505k0 + iM4503i2;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 3:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        long j14 = unsafe.getLong(abstractC1368a1, j7);
                        iM4503i2 = AbstractC1411p.m4503i0(i18);
                        iM4505k0 = AbstractC1411p.m4505k0(j14);
                        iM4499e1 += iM4505k0 + iM4503i2;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 4:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        int i26 = unsafe.getInt(abstractC1368a1, j7);
                        iM4503i3 = AbstractC1411p.m4503i0(i18);
                        iM4505k1 = AbstractC1411p.m4505k0(i26);
                        iM4499e0 = iM4505k1 + iM4503i3;
                        iM4499e1 += iM4499e0;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 5:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i4 = AbstractC1411p.m4503i0(i18);
                        iM4503i5 = iM4503i4 + 8;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 6:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i1 = AbstractC1411p.m4503i0(i18);
                        iM4503i5 = iM4503i1 + 4;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 7:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i5 = AbstractC1411p.m4503i0(i18) + 1;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 8:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        Object object = unsafe.getObject(abstractC1368a1, j7);
                        iM4499e1 = (object instanceof AbstractC1391i ? AbstractC1411p.m4499e0(i18, (AbstractC1391i) object) : AbstractC1411p.m4502h0((String) object) + AbstractC1411p.m4503i0(i18)) + iM4499e1;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 9:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        Object object2 = unsafe.getObject(abstractC1368a1, j7);
                        InterfaceC1372b1 interfaceC1372b1M4540p = c1418s0.m4540p(i15);
                        Class cls = AbstractC1375c1.f5873a;
                        iM4503i6 = AbstractC1411p.m4503i0(i18);
                        iMo4269b = ((AbstractC1367a) object2).mo4269b(interfaceC1372b1M4540p);
                        iM4504j0 = AbstractC1411p.m4504j0(iMo4269b);
                        i14 = iM4504j0 + iMo4269b + iM4503i6;
                        iM4499e1 += i14;
                    }
                    i15 += 3;
                    break;
                case 10:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4499e0 = AbstractC1411p.m4499e0(i18, (AbstractC1391i) unsafe.getObject(abstractC1368a1, j7));
                        iM4499e1 += iM4499e0;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 11:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        int i27 = unsafe.getInt(abstractC1368a1, j7);
                        iM4503i3 = AbstractC1411p.m4503i0(i18);
                        iM4505k1 = AbstractC1411p.m4504j0(i27);
                        iM4499e0 = iM4505k1 + iM4503i3;
                        iM4499e1 += iM4499e0;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 12:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        int i28 = unsafe.getInt(abstractC1368a1, j7);
                        iM4503i3 = AbstractC1411p.m4503i0(i18);
                        iM4505k1 = AbstractC1411p.m4505k0(i28);
                        iM4499e0 = iM4505k1 + iM4503i3;
                        iM4499e1 += iM4499e0;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 13:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i1 = AbstractC1411p.m4503i0(i18);
                        iM4503i5 = iM4503i1 + 4;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 14:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        iM4503i4 = AbstractC1411p.m4503i0(i18);
                        iM4503i5 = iM4503i4 + 8;
                        iM4499e1 += iM4503i5;
                    }
                    c1418s0 = this;
                    abstractC1368a1 = abstractC1368a0;
                    i15 += 3;
                    break;
                case 15:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        int i29 = unsafe.getInt(abstractC1368a1, j7);
                        iM4503i3 = AbstractC1411p.m4503i0(i18);
                        iM4505k1 = AbstractC1411p.m4500f0(i29);
                        iM4499e0 = iM4505k1 + iM4503i3;
                        iM4499e1 += iM4499e0;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case 16:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        long j15 = unsafe.getLong(abstractC1368a1, j7);
                        iM4503i2 = AbstractC1411p.m4503i0(i18);
                        iM4505k0 = AbstractC1411p.m4501g0(j15);
                        iM4499e1 += iM4505k0 + iM4503i2;
                    }
                    c1418s0 = this;
                    i15 += 3;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c1418s0.m4542r(abstractC1368a1, i15, i17, i16, i13)) {
                        AbstractC1367a abstractC1367a = (AbstractC1367a) unsafe.getObject(abstractC1368a1, j7);
                        InterfaceC1372b1 interfaceC1372b1M4540p2 = c1418s0.m4540p(i15);
                        iM4503i7 = AbstractC1411p.m4503i0(i18) * 2;
                        iMo4269b2 = abstractC1367a.mo4269b(interfaceC1372b1M4540p2);
                        iM4300c = iMo4269b2 + iM4503i7;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    iM4300c = AbstractC1375c1.m4300c(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    iM4300c = AbstractC1375c1.m4299b(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls2 = AbstractC1375c1.f5873a;
                    if (list.size() == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4503i8 = (AbstractC1411p.m4503i0(i18) * list.size()) + AbstractC1375c1.m4302e(list);
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls3 = AbstractC1375c1.f5873a;
                    size = list2.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4306i(list2);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls4 = AbstractC1375c1.f5873a;
                    size = list3.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4301d(list3);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    iM4300c = AbstractC1375c1.m4300c(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case 24:
                    iM4300c = AbstractC1375c1.m4299b(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls5 = AbstractC1375c1.f5873a;
                    int size3 = list4.size();
                    iM4499e1 += size3 == 0 ? 0 : (AbstractC1411p.m4503i0(i18) + 1) * size3;
                    i15 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls6 = AbstractC1375c1.f5873a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4503i8 = AbstractC1411p.m4503i0(i18) * size4;
                        if (list5 instanceof InterfaceC1389h0) {
                            InterfaceC1389h0 interfaceC1389h0 = (InterfaceC1389h0) list5;
                            for (int i34 = 0; i34 < size4; i34++) {
                                Object objM4341h = interfaceC1389h0.m4341h();
                                if (objM4341h instanceof AbstractC1391i) {
                                    int size5 = ((AbstractC1391i) objM4341h).size();
                                    iM4503i8 = AbstractC1411p.m4504j0(size5) + size5 + iM4503i8;
                                } else {
                                    iM4503i8 = AbstractC1411p.m4502h0((String) objM4341h) + iM4503i8;
                                }
                            }
                        } else {
                            for (int i35 = 0; i35 < size4; i35++) {
                                Object obj = list5.get(i35);
                                if (obj instanceof AbstractC1391i) {
                                    int size6 = ((AbstractC1391i) obj).size();
                                    iM4503i8 = AbstractC1411p.m4504j0(size6) + size6 + iM4503i8;
                                } else {
                                    iM4503i8 = AbstractC1411p.m4502h0((String) obj) + iM4503i8;
                                }
                            }
                        }
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC1368a1, j7);
                    InterfaceC1372b1 interfaceC1372b1M4540p3 = c1418s0.m4540p(i15);
                    Class cls7 = AbstractC1375c1.f5873a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iM4503i10 = 0;
                    } else {
                        iM4503i10 = AbstractC1411p.m4503i0(i18) * size7;
                        for (int i36 = 0; i36 < size7; i36++) {
                            int iMo4269b4 = ((AbstractC1367a) list6.get(i36)).mo4269b(interfaceC1372b1M4540p3);
                            iM4503i10 += AbstractC1411p.m4504j0(iMo4269b4) + iMo4269b4;
                        }
                    }
                    iM4499e1 += iM4503i10;
                    i15 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls8 = AbstractC1375c1.f5873a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4503i8 = AbstractC1411p.m4503i0(i18) * size8;
                        for (int i37 = 0; i37 < list7.size(); i37++) {
                            int size9 = ((AbstractC1391i) list7.get(i37)).size();
                            iM4503i8 += AbstractC1411p.m4504j0(size9) + size9;
                        }
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls9 = AbstractC1375c1.f5873a;
                    size = list8.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4305h(list8);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls10 = AbstractC1375c1.f5873a;
                    size = list9.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4298a(list9);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 31:
                    iM4300c = AbstractC1375c1.m4299b(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case 32:
                    iM4300c = AbstractC1375c1.m4300c(i18, (List) unsafe.getObject(abstractC1368a1, j7));
                    iM4499e1 += iM4300c;
                    i15 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls11 = AbstractC1375c1.f5873a;
                    size = list10.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4303f(list10);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls12 = AbstractC1375c1.f5873a;
                    size = list11.size();
                    if (size == 0) {
                        iM4503i8 = 0;
                    } else {
                        iM4306i = AbstractC1375c1.m4304g(list11);
                        iM4503i9 = AbstractC1411p.m4503i0(i18);
                        iM4503i8 = (iM4503i9 * size) + iM4306i;
                    }
                    iM4499e1 += iM4503i8;
                    i15 += 3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls13 = AbstractC1375c1.f5873a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls14 = AbstractC1375c1.f5873a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 37:
                    size2 = AbstractC1375c1.m4302e((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 38:
                    size2 = AbstractC1375c1.m4306i((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 39:
                    size2 = AbstractC1375c1.m4301d((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls15 = AbstractC1375c1.f5873a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls16 = AbstractC1375c1.f5873a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls17 = AbstractC1375c1.f5873a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 43:
                    size2 = AbstractC1375c1.m4305h((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 44:
                    size2 = AbstractC1375c1.m4298a((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls18 = AbstractC1375c1.f5873a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC1368a1, j7);
                    Class cls19 = AbstractC1375c1.f5873a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 47:
                    size2 = AbstractC1375c1.m4303f((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 48:
                    size2 = AbstractC1375c1.m4304g((List) unsafe.getObject(abstractC1368a1, j7));
                    if (size2 > 0) {
                        iM4503i11 = AbstractC1411p.m4503i0(i18);
                        iM4504j1 = AbstractC1411p.m4504j0(size2);
                        iM4499e1 += iM4504j1 + iM4503i11 + size2;
                    }
                    i15 += 3;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC1368a1, j7);
                    InterfaceC1372b1 interfaceC1372b1M4540p4 = c1418s0.m4540p(i15);
                    Class cls20 = AbstractC1375c1.f5873a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iMo4269b3 = 0;
                    } else {
                        iMo4269b3 = 0;
                        for (int i38 = 0; i38 < size10; i38++) {
                            iMo4269b3 += ((AbstractC1367a) list19.get(i38)).mo4269b(interfaceC1372b1M4540p4) + (AbstractC1411p.m4503i0(i18) * 2);
                        }
                    }
                    iM4499e1 += iMo4269b3;
                    i15 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1368a1, j7);
                    Object objM4539o = c1418s0.m4539o(i15);
                    c1418s0.f5976m.getClass();
                    C1407n0 c1407n0 = (C1407n0) object3;
                    if (objM4539o != null) {
                        throw new ClassCastException();
                    }
                    if (c1407n0.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c1407n0.entrySet().iterator();
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
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i0 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i0 + 8;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 52:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i12 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i12 + 4;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 53:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        long jM4515C = m4515C(j7, abstractC1368a1);
                        iM4503i13 = AbstractC1411p.m4503i0(i18);
                        iM4505k2 = AbstractC1411p.m4505k0(jM4515C);
                        i14 = iM4505k2 + iM4503i13;
                        iM4499e1 += i14;
                    }
                    i15 += 3;
                    break;
                case 54:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        long jM4515C2 = m4515C(j7, abstractC1368a1);
                        iM4503i13 = AbstractC1411p.m4503i0(i18);
                        iM4505k2 = AbstractC1411p.m4505k0(jM4515C2);
                        i14 = iM4505k2 + iM4503i13;
                        iM4499e1 += i14;
                    }
                    i15 += 3;
                    break;
                case 55:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        int iM4514B = m4514B(j7, abstractC1368a1);
                        iM4503i14 = AbstractC1411p.m4503i0(i18);
                        iM4505k3 = AbstractC1411p.m4505k0(iM4514B);
                        iM4300c = iM4505k3 + iM4503i14;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 56:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i0 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i0 + 8;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 57:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i12 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i12 + 4;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 58:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4300c = AbstractC1411p.m4503i0(i18) + 1;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 59:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        Object object4 = unsafe.getObject(abstractC1368a1, j7);
                        iM4499e1 = (object4 instanceof AbstractC1391i ? AbstractC1411p.m4499e0(i18, (AbstractC1391i) object4) : AbstractC1411p.m4502h0((String) object4) + AbstractC1411p.m4503i0(i18)) + iM4499e1;
                    }
                    i15 += 3;
                    break;
                case 60:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        Object object5 = unsafe.getObject(abstractC1368a1, j7);
                        InterfaceC1372b1 interfaceC1372b1M4540p5 = c1418s0.m4540p(i15);
                        Class cls21 = AbstractC1375c1.f5873a;
                        iM4503i6 = AbstractC1411p.m4503i0(i18);
                        iMo4269b = ((AbstractC1367a) object5).mo4269b(interfaceC1372b1M4540p5);
                        iM4504j0 = AbstractC1411p.m4504j0(iMo4269b);
                        i14 = iM4504j0 + iMo4269b + iM4503i6;
                        iM4499e1 += i14;
                    }
                    i15 += 3;
                    break;
                case 61:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4300c = AbstractC1411p.m4499e0(i18, (AbstractC1391i) unsafe.getObject(abstractC1368a1, j7));
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 62:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        int iM4514B2 = m4514B(j7, abstractC1368a1);
                        iM4503i14 = AbstractC1411p.m4503i0(i18);
                        iM4505k3 = AbstractC1411p.m4504j0(iM4514B2);
                        iM4300c = iM4505k3 + iM4503i14;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 63:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        int iM4514B3 = m4514B(j7, abstractC1368a1);
                        iM4503i14 = AbstractC1411p.m4503i0(i18);
                        iM4505k3 = AbstractC1411p.m4505k0(iM4514B3);
                        iM4300c = iM4505k3 + iM4503i14;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 64:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i12 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i12 + 4;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 65:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        iM4503i0 = AbstractC1411p.m4503i0(i18);
                        iM4300c = iM4503i0 + 8;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 66:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        int iM4514B4 = m4514B(j7, abstractC1368a1);
                        iM4503i14 = AbstractC1411p.m4503i0(i18);
                        iM4505k3 = AbstractC1411p.m4500f0(iM4514B4);
                        iM4300c = iM4505k3 + iM4503i14;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                case 67:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        long jM4515C3 = m4515C(j7, abstractC1368a1);
                        iM4503i13 = AbstractC1411p.m4503i0(i18);
                        iM4505k2 = AbstractC1411p.m4501g0(jM4515C3);
                        i14 = iM4505k2 + iM4503i13;
                        iM4499e1 += i14;
                    }
                    i15 += 3;
                    break;
                case 68:
                    if (c1418s0.m4543t(i18, i15, abstractC1368a1)) {
                        AbstractC1367a abstractC1367a2 = (AbstractC1367a) unsafe.getObject(abstractC1368a1, j7);
                        InterfaceC1372b1 interfaceC1372b1M4540p6 = c1418s0.m4540p(i15);
                        iM4503i7 = AbstractC1411p.m4503i0(i18) * 2;
                        iMo4269b2 = abstractC1367a2.mo4269b(interfaceC1372b1M4540p6);
                        iM4300c = iMo4269b2 + iM4503i7;
                        iM4499e1 += iM4300c;
                    }
                    i15 += 3;
                    break;
                default:
                    i15 += 3;
                    break;
            }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: i */
    public final void mo4295i(Object obj, C1404m0 c1404m0) {
        c1404m0.getClass();
        m4535T(obj, c1404m0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: j */
    public final boolean mo4296j(AbstractC1368a0 abstractC1368a0, AbstractC1368a0 abstractC1368a1) {
        int[] iArr = this.f5964a;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            boolean zM4309l = true;
            if (i13 < length) {
                int iM4534S = m4534S(i13);
                long j7 = iM4534S & 1048575;
                switch (m4517R(iM4534S)) {
                    case 0:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j1 = AbstractC1399k1.f5928c;
                            if (Double.doubleToLongBits(abstractC1396j1.mo4345e(j7, abstractC1368a0)) != Double.doubleToLongBits(abstractC1396j1.mo4345e(j7, abstractC1368a1))) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j2 = AbstractC1399k1.f5928c;
                            if (Float.floatToIntBits(abstractC1396j2.mo4346f(j7, abstractC1368a0)) != Float.floatToIntBits(abstractC1396j2.mo4346f(j7, abstractC1368a1))) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j3 = AbstractC1399k1.f5928c;
                            if (abstractC1396j3.m4388h(j7, abstractC1368a0) != abstractC1396j3.m4388h(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j4 = AbstractC1399k1.f5928c;
                            if (abstractC1396j4.m4388h(j7, abstractC1368a0) != abstractC1396j4.m4388h(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j5 = AbstractC1399k1.f5928c;
                            if (abstractC1396j5.m4387g(j7, abstractC1368a0) != abstractC1396j5.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j6 = AbstractC1399k1.f5928c;
                            if (abstractC1396j6.m4388h(j7, abstractC1368a0) != abstractC1396j6.m4388h(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j7 = AbstractC1399k1.f5928c;
                            if (abstractC1396j7.m4387g(j7, abstractC1368a0) != abstractC1396j7.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j8 = AbstractC1399k1.f5928c;
                            if (abstractC1396j8.mo4343c(j7, abstractC1368a0) != abstractC1396j8.mo4343c(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j9 = AbstractC1399k1.f5928c;
                            if (!AbstractC1375c1.m4309l(abstractC1396j9.m4389i(j7, abstractC1368a0), abstractC1396j9.m4389i(j7, abstractC1368a1))) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j10 = AbstractC1399k1.f5928c;
                            if (!AbstractC1375c1.m4309l(abstractC1396j10.m4389i(j7, abstractC1368a0), abstractC1396j10.m4389i(j7, abstractC1368a1))) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j11 = AbstractC1399k1.f5928c;
                            if (!AbstractC1375c1.m4309l(abstractC1396j11.m4389i(j7, abstractC1368a0), abstractC1396j11.m4389i(j7, abstractC1368a1))) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j12 = AbstractC1399k1.f5928c;
                            if (abstractC1396j12.m4387g(j7, abstractC1368a0) != abstractC1396j12.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j13 = AbstractC1399k1.f5928c;
                            if (abstractC1396j13.m4387g(j7, abstractC1368a0) != abstractC1396j13.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j14 = AbstractC1399k1.f5928c;
                            if (abstractC1396j14.m4387g(j7, abstractC1368a0) != abstractC1396j14.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j15 = AbstractC1399k1.f5928c;
                            if (abstractC1396j15.m4388h(j7, abstractC1368a0) != abstractC1396j15.m4388h(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j16 = AbstractC1399k1.f5928c;
                            if (abstractC1396j16.m4387g(j7, abstractC1368a0) != abstractC1396j16.m4387g(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j17 = AbstractC1399k1.f5928c;
                            if (abstractC1396j17.m4388h(j7, abstractC1368a0) != abstractC1396j17.m4388h(j7, abstractC1368a1)) {
                                zM4309l = false;
                            }
                        }
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        if (!m4536k(abstractC1368a0, abstractC1368a1, i13)) {
                            zM4309l = false;
                        } else {
                            AbstractC1396j1 abstractC1396j18 = AbstractC1399k1.f5928c;
                            if (!AbstractC1375c1.m4309l(abstractC1396j18.m4389i(j7, abstractC1368a0), abstractC1396j18.m4389i(j7, abstractC1368a1))) {
                                zM4309l = false;
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
                        AbstractC1396j1 abstractC1396j19 = AbstractC1399k1.f5928c;
                        zM4309l = AbstractC1375c1.m4309l(abstractC1396j19.m4389i(j7, abstractC1368a0), abstractC1396j19.m4389i(j7, abstractC1368a1));
                        break;
                    case 50:
                        AbstractC1396j1 abstractC1396j20 = AbstractC1399k1.f5928c;
                        zM4309l = AbstractC1375c1.m4309l(abstractC1396j20.m4389i(j7, abstractC1368a0), abstractC1396j20.m4389i(j7, abstractC1368a1));
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
                        AbstractC1396j1 abstractC1396j21 = AbstractC1399k1.f5928c;
                        if (abstractC1396j21.m4387g(j13, abstractC1368a0) != abstractC1396j21.m4387g(j13, abstractC1368a1) || !AbstractC1375c1.m4309l(abstractC1396j21.m4389i(j7, abstractC1368a0), abstractC1396j21.m4389i(j7, abstractC1368a1))) {
                            zM4309l = false;
                        }
                        break;
                }
                if (zM4309l) {
                    i13 += 3;
                }
            } else {
                C1384f1 c1384f1 = (C1384f1) this.f5975l;
                c1384f1.getClass();
                C1381e1 c1381e1 = abstractC1368a0.unknownFields;
                c1384f1.getClass();
                if (c1381e1.equals(abstractC1368a1.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4536k(AbstractC1368a0 abstractC1368a0, AbstractC1368a0 abstractC1368a1, int i13) {
        return m4541q(i13, abstractC1368a0) == m4541q(i13, abstractC1368a1);
    }

    /* JADX INFO: renamed from: m */
    public final void m4537m(int i13, Object obj, Object obj2) {
        int i14 = this.f5964a[i13];
        if (AbstractC1399k1.f5928c.m4389i(m4534S(i13) & 1048575, obj) == null) {
            return;
        }
        m4538n(i13);
    }

    /* JADX INFO: renamed from: n */
    public final void m4538n(int i13) {
        if (this.f5965b[AbstractC11266d.m30449c(i13, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m4539o(int i13) {
        return this.f5965b[(i13 / 3) * 2];
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC1372b1 m4540p(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f5965b;
        InterfaceC1372b1 interfaceC1372b1 = (InterfaceC1372b1) objArr[i14];
        if (interfaceC1372b1 != null) {
            return interfaceC1372b1;
        }
        InterfaceC1372b1 interfaceC1372b1M4555a = C1430y0.f5993c.m4555a((Class) objArr[i14 + 1]);
        objArr[i14] = interfaceC1372b1M4555a;
        return interfaceC1372b1M4555a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4541q(int i13, Object obj) {
        int i14 = this.f5964a[i13 + 2];
        long j7 = i14 & 1048575;
        if (j7 == 1048575) {
            int iM4534S = m4534S(i13);
            long j13 = iM4534S & 1048575;
            switch (m4517R(iM4534S)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1399k1.f5928c.mo4345e(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1399k1.f5928c.mo4346f(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1399k1.f5928c.m4388h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1399k1.f5928c.m4388h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1399k1.f5928c.m4388h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1399k1.f5928c.mo4343c(j13, obj);
                case 8:
                    Object objM4389i = AbstractC1399k1.f5928c.m4389i(j13, obj);
                    if (objM4389i instanceof String) {
                        return !((String) objM4389i).isEmpty();
                    }
                    if (objM4389i instanceof AbstractC1391i) {
                        return !AbstractC1391i.f5905x.equals(objM4389i);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC1399k1.f5928c.m4389i(j13, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1391i.f5905x.equals(AbstractC1399k1.f5928c.m4389i(j13, obj));
                case 11:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1399k1.f5928c.m4388h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1399k1.f5928c.m4387g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1399k1.f5928c.m4388h(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (AbstractC1399k1.f5928c.m4389i(j13, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i14 >>> 20)) & AbstractC1399k1.f5928c.m4387g(j7, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4542r(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return m4541q(i13, obj);
        }
        return (i15 & i16) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4543t(int i13, int i14, Object obj) {
        return AbstractC1399k1.f5928c.m4387g((long) (this.f5964a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX INFO: renamed from: u */
    public final void m4544u(int i13, Object obj, Object obj2) {
        long jM4534S = m4534S(i13) & 1048575;
        Object objM4389i = AbstractC1399k1.f5928c.m4389i(jM4534S, obj);
        C1410o0 c1410o0 = this.f5976m;
        if (objM4389i != null) {
            c1410o0.getClass();
            if (!((C1407n0) objM4389i).f5947w) {
                C1407n0 c1407n0M4485c = C1407n0.f5946x.m4485c();
                C1410o0.m4498a(c1407n0M4485c, objM4389i);
                AbstractC1399k1.m4423p(jM4534S, obj, c1407n0M4485c);
                objM4389i = c1407n0M4485c;
            }
        } else {
            c1410o0.getClass();
            objM4389i = C1407n0.f5946x.m4485c();
            AbstractC1399k1.m4423p(jM4534S, obj, objM4389i);
        }
        c1410o0.getClass();
        AbstractC30802r.m94771t(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final void m4545v(int i13, Object obj, Object obj2) {
        if (m4541q(i13, obj2)) {
            long jM4534S = m4534S(i13) & 1048575;
            Unsafe unsafe = f5963o;
            Object object = unsafe.getObject(obj2, jM4534S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5964a[i13] + " is present but null: " + obj2);
            }
            InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i13);
            if (!m4541q(i13, obj)) {
                if (m4519s(object)) {
                    AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1M4540p.mo4290d();
                    interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d, object);
                    unsafe.putObject(obj, jM4534S, abstractC1368a0Mo4290d);
                } else {
                    unsafe.putObject(obj, jM4534S, object);
                }
                m4529M(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4534S);
            if (!m4519s(object2)) {
                AbstractC1368a0 abstractC1368a0Mo4290d2 = interfaceC1372b1M4540p.mo4290d();
                interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d2, object2);
                unsafe.putObject(obj, jM4534S, abstractC1368a0Mo4290d2);
                object2 = abstractC1368a0Mo4290d2;
            }
            interfaceC1372b1M4540p.mo4287a(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4546w(int i13, Object obj, Object obj2) {
        int[] iArr = this.f5964a;
        int i14 = iArr[i13];
        if (m4543t(i14, i13, obj2)) {
            long jM4534S = m4534S(i13) & 1048575;
            Unsafe unsafe = f5963o;
            Object object = unsafe.getObject(obj2, jM4534S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i13);
            if (!m4543t(i14, i13, obj)) {
                if (m4519s(object)) {
                    AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1M4540p.mo4290d();
                    interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d, object);
                    unsafe.putObject(obj, jM4534S, abstractC1368a0Mo4290d);
                } else {
                    unsafe.putObject(obj, jM4534S, object);
                }
                m4530N(i14, i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4534S);
            if (!m4519s(object2)) {
                AbstractC1368a0 abstractC1368a0Mo4290d2 = interfaceC1372b1M4540p.mo4290d();
                interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d2, object2);
                unsafe.putObject(obj, jM4534S, abstractC1368a0Mo4290d2);
                object2 = abstractC1368a0Mo4290d2;
            }
            interfaceC1372b1M4540p.mo4287a(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m4547x(int i13, Object obj) {
        InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i13);
        long jM4534S = m4534S(i13) & 1048575;
        if (!m4541q(i13, obj)) {
            return interfaceC1372b1M4540p.mo4290d();
        }
        Object object = f5963o.getObject(obj, jM4534S);
        if (m4519s(object)) {
            return object;
        }
        AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1M4540p.mo4290d();
        if (object != null) {
            interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d, object);
        }
        return abstractC1368a0Mo4290d;
    }

    /* JADX INFO: renamed from: y */
    public final Object m4548y(int i13, int i14, Object obj) {
        InterfaceC1372b1 interfaceC1372b1M4540p = m4540p(i14);
        if (!m4543t(i13, i14, obj)) {
            return interfaceC1372b1M4540p.mo4290d();
        }
        Object object = f5963o.getObject(obj, m4534S(i14) & 1048575);
        if (m4519s(object)) {
            return object;
        }
        AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1M4540p.mo4290d();
        if (object != null) {
            interfaceC1372b1M4540p.mo4287a(abstractC1368a0Mo4290d, object);
        }
        return abstractC1368a0Mo4290d;
    }
}
