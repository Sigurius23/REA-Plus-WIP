package androidx.datastore.preferences.protobuf;

import androidx.health.platform.client.proto.C1533u;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1246q0 implements InterfaceC1270z0 {

    /* JADX INFO: renamed from: n */
    public static final int[] f5453n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f5454o = AbstractC1235m1.m3923i();

    /* JADX INFO: renamed from: a */
    public final int[] f5455a;

    /* JADX INFO: renamed from: b */
    public final Object[] f5456b;

    /* JADX INFO: renamed from: c */
    public final int f5457c;

    /* JADX INFO: renamed from: d */
    public final int f5458d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1197a f5459e;

    /* JADX INFO: renamed from: f */
    public final boolean f5460f;

    /* JADX INFO: renamed from: g */
    public final int[] f5461g;

    /* JADX INFO: renamed from: h */
    public final int f5462h;

    /* JADX INFO: renamed from: i */
    public final int f5463i;

    /* JADX INFO: renamed from: j */
    public final C1252s0 f5464j;

    /* JADX INFO: renamed from: k */
    public final C1213f0 f5465k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1211e1 f5466l;

    /* JADX INFO: renamed from: m */
    public final C1234m0 f5467m;

    public C1246q0(int[] iArr, Object[] objArr, int i13, int i14, AbstractC1197a abstractC1197a, int[] iArr2, int i15, int i16, C1252s0 c1252s0, C1213f0 c1213f0, AbstractC1211e1 abstractC1211e1, C1248r c1248r, C1234m0 c1234m0) {
        this.f5455a = iArr;
        this.f5456b = objArr;
        this.f5457c = i13;
        this.f5458d = i14;
        this.f5460f = abstractC1197a instanceof AbstractC1269z;
        this.f5461g = iArr2;
        this.f5462h = i15;
        this.f5463i = i16;
        this.f5464j = c1252s0;
        this.f5465k = c1213f0;
        this.f5466l = abstractC1211e1;
        this.f5459e = abstractC1197a;
        this.f5467m = c1234m0;
    }

    /* JADX INFO: renamed from: F */
    public static Field m3970F(Class cls, String str) {
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

    /* JADX INFO: renamed from: K */
    public static int m3971K(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3972p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1269z) {
            return ((AbstractC1269z) obj).m4025g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    /* JADX INFO: renamed from: w */
    public static C1246q0 m3973w(C1268y0 c1268y0, C1252s0 c1252s0, C1213f0 c1213f0, AbstractC1211e1 abstractC1211e1, C1248r c1248r, C1234m0 c1234m0) {
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
        Field fieldM3970F;
        int i46;
        char cCharAt9;
        int i47;
        Field fieldM3970F2;
        Field fieldM3970F3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        int i55;
        char cCharAt12;
        int i56;
        char cCharAt13;
        String str = c1268y0.f5511b;
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
            iArr = f5453n;
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
        Unsafe unsafe = f5454o;
        Object[] objArr2 = c1268y0.f5512c;
        Class<?> cls = c1268y0.f5510a.getClass();
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
                } else if (i122 == 12 && (AbstractC12682p.m35483c(c1268y0.m4019a(), 1) || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0)) {
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i18];
                    i18++;
                }
                int i124 = i123 * 2;
                Object obj = objArr[i124];
                if (obj instanceof Field) {
                    fieldM3970F2 = (Field) obj;
                } else {
                    fieldM3970F2 = m3970F(cls, (String) obj);
                    objArr[i124] = fieldM3970F2;
                }
                int i125 = i102;
                i39 = i18;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM3970F2);
                int i126 = i124 + 1;
                Object obj2 = objArr[i126];
                if (obj2 instanceof Field) {
                    fieldM3970F3 = (Field) obj2;
                } else {
                    fieldM3970F3 = m3970F(cls, (String) obj2);
                    objArr[i126] = fieldM3970F3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM3970F3);
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
                Field fieldM3970F4 = m3970F(cls, (String) objArr[i18]);
                if (i117 == 9 || i117 == 17) {
                    i38 = i38;
                    objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = fieldM3970F4.getType();
                } else {
                    if (i117 == 27 || i117 == 49) {
                        i38 = i38;
                        i47 = i18 + 2;
                        objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                    } else if (i117 == 12 || i117 == 30 || i117 == 44) {
                        i38 = i38;
                        if (c1268y0.m4019a() == 1 || (iCharAt11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            i47 = i18 + 2;
                            objArr3[AbstractC11266d.m30449c(i105, 3, 2, 1)] = objArr[i127];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3970F4);
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
                                fieldM3970F = (Field) obj3;
                            } else {
                                fieldM3970F = m3970F(cls, (String) obj3);
                                objArr[i130] = fieldM3970F;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3970F);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3970F4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3970F4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3970F4);
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
        return new C1246q0(iArr3, objArr3, i14, i17, c1268y0.f5510a, iArr, i19, i102, c1252s0, c1213f0, abstractC1211e1, c1248r, c1234m0);
    }

    /* JADX INFO: renamed from: x */
    public static long m3974x(int i13) {
        return i13 & 1048575;
    }

    /* JADX INFO: renamed from: y */
    public static int m3975y(long j7, Object obj) {
        return ((Integer) AbstractC1235m1.f5433c.m3883h(j7, obj)).intValue();
    }

    /* JADX INFO: renamed from: z */
    public static long m3976z(long j7, Object obj) {
        return ((Long) AbstractC1235m1.f5433c.m3883h(j7, obj)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m3977A(int i13) {
        if (i13 >= this.f5457c && i13 <= this.f5458d) {
            int[] iArr = this.f5455a;
            int length = (iArr.length / 3) - 1;
            int i14 = 0;
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
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public final void m3978B(Object obj, long j7, C1233m c1233m, InterfaceC1270z0 interfaceC1270z0, C1245q c1245q) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo3823D;
        this.f5465k.getClass();
        AbstractC1200b abstractC1200bM3801a = C1213f0.m3801a(j7, obj);
        AbstractC1230l abstractC1230l = c1233m.f5427a;
        int i13 = c1233m.f5428b;
        if ((i13 & 7) != 3) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0.mo3991d();
            c1233m.m3891b(abstractC1269zMo3991d, interfaceC1270z0, c1245q);
            interfaceC1270z0.mo3989b(abstractC1269zMo3991d);
            ((C1266x0) abstractC1200bM3801a).add(abstractC1269zMo3991d);
            if (abstractC1230l.mo3836e() || c1233m.f5430d != 0) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == i13);
        c1233m.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: C */
    public final void m3979C(Object obj, int i13, C1233m c1233m, InterfaceC1270z0 interfaceC1270z0, C1245q c1245q) throws InvalidProtocolBufferException {
        int iMo3823D;
        this.f5465k.getClass();
        AbstractC1200b abstractC1200bM3801a = C1213f0.m3801a(i13 & 1048575, obj);
        AbstractC1230l abstractC1230l = c1233m.f5427a;
        int i14 = c1233m.f5428b;
        if ((i14 & 7) != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0.mo3991d();
            c1233m.m3892c(abstractC1269zMo3991d, interfaceC1270z0, c1245q);
            interfaceC1270z0.mo3989b(abstractC1269zMo3991d);
            ((C1266x0) abstractC1200bM3801a).add(abstractC1269zMo3991d);
            if (abstractC1230l.mo3836e() || c1233m.f5430d != 0) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == i14);
        c1233m.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: D */
    public final void m3980D(int i13, C1233m c1233m, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i13) != 0) {
            c1233m.m3912w(2);
            AbstractC1235m1.m3929o(i13 & 1048575, obj, c1233m.f5427a.mo3822C());
        } else if (!this.f5460f) {
            AbstractC1235m1.m3929o(i13 & 1048575, obj, c1233m.m3894e());
        } else {
            c1233m.m3912w(2);
            AbstractC1235m1.m3929o(i13 & 1048575, obj, c1233m.f5427a.mo3821B());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3981E(int i13, C1233m c1233m, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i14 = 536870912 & i13;
        C1213f0 c1213f0 = this.f5465k;
        if (i14 != 0) {
            c1213f0.getClass();
            c1233m.m3908s(C1213f0.m3801a(i13 & 1048575, obj), true);
        } else {
            c1213f0.getClass();
            c1233m.m3908s(C1213f0.m3801a(i13 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3982G(int i13, Object obj) {
        int i14 = this.f5455a[i13 + 2];
        long j7 = 1048575 & i14;
        if (j7 == 1048575) {
            return;
        }
        AbstractC1235m1.m3927m(j7, obj, (1 << (i14 >>> 20)) | AbstractC1235m1.f5433c.m3881f(j7, obj));
    }

    /* JADX INFO: renamed from: H */
    public final void m3983H(int i13, int i14, Object obj) {
        AbstractC1235m1.m3927m(this.f5455a[i14 + 2] & 1048575, obj, i13);
    }

    /* JADX INFO: renamed from: I */
    public final void m3984I(Object obj, int i13, AbstractC1197a abstractC1197a) {
        f5454o.putObject(obj, m3986L(i13) & 1048575, abstractC1197a);
        m3982G(i13, obj);
    }

    /* JADX INFO: renamed from: J */
    public final void m3985J(Object obj, int i13, int i14, AbstractC1197a abstractC1197a) {
        f5454o.putObject(obj, m3986L(i14) & 1048575, abstractC1197a);
        m3983H(i13, i14, obj);
    }

    /* JADX INFO: renamed from: L */
    public final int m3986L(int i13) {
        return this.f5455a[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: M */
    public final void m3987M(Object obj, C1225j0 c1225j0) throws IOException {
        int i13;
        int i14;
        boolean z4;
        C1246q0 c1246q0 = this;
        int[] iArr = c1246q0.f5455a;
        int length = iArr.length;
        Unsafe unsafe = f5454o;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int iM3986L = c1246q0.m3986L(i17);
            int i19 = iArr[i17];
            int iM3971K = m3971K(iM3986L);
            if (iM3971K <= 17) {
                int i24 = iArr[i17 + 2];
                int i25 = i24 & i15;
                if (i25 != i16) {
                    i18 = i25 == i15 ? 0 : unsafe.getInt(obj, i25);
                    i16 = i25;
                }
                i13 = 1 << (i24 >>> 20);
            } else {
                i13 = 0;
            }
            long j7 = iM3986L & i15;
            switch (iM3971K) {
                case 0:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        double dMo3813d = AbstractC1235m1.f5433c.mo3813d(j7, obj);
                        C1236n c1236n = (C1236n) c1225j0.f5411a;
                        c1236n.getClass();
                        c1236n.m3939E0(i19, Double.doubleToRawLongBits(dMo3813d));
                    }
                    break;
                case 1:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        float fMo3814e = AbstractC1235m1.f5433c.mo3814e(j7, obj);
                        C1236n c1236n2 = (C1236n) c1225j0.f5411a;
                        c1236n2.getClass();
                        c1236n2.m3937C0(i19, Float.floatToRawIntBits(fMo3814e));
                    }
                    c1246q0 = this;
                    break;
                case 2:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, unsafe.getLong(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 3:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, unsafe.getLong(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 4:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3941G0(i19, unsafe.getInt(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 5:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3939E0(i19, unsafe.getLong(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 6:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3937C0(i19, unsafe.getInt(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 7:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3961z0(i19, AbstractC1235m1.f5433c.mo3812c(j7, obj));
                    }
                    c1246q0 = this;
                    break;
                case 8:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            ((C1236n) c1225j0.f5411a).m3944J0(i19, (String) object);
                        } else {
                            ((C1236n) c1225j0.f5411a).m3935A0(i19, (C1218h) object);
                        }
                    }
                    c1246q0 = this;
                    break;
                case 9:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3943I0(i19, (AbstractC1197a) unsafe.getObject(obj, j7), c1246q0.m4000m(i17));
                    }
                    break;
                case 10:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3935A0(i19, (C1218h) unsafe.getObject(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 11:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3947M0(i19, unsafe.getInt(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 12:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3941G0(i19, unsafe.getInt(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 13:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3937C0(i19, unsafe.getInt(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 14:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        ((C1236n) c1225j0.f5411a).m3939E0(i19, unsafe.getLong(obj, j7));
                    }
                    c1246q0 = this;
                    break;
                case 15:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        int i26 = unsafe.getInt(obj, j7);
                        ((C1236n) c1225j0.f5411a).m3947M0(i19, (i26 >> 31) ^ (i26 << 1));
                    }
                    c1246q0 = this;
                    break;
                case 16:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        long j13 = unsafe.getLong(obj, j7);
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, (j13 >> 63) ^ (j13 << 1));
                    }
                    c1246q0 = this;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c1246q0.m4002o(obj, i17, i16, i18, i13)) {
                        c1225j0.m3851a(i19, unsafe.getObject(obj, j7), c1246q0.m4000m(i17));
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    i16 = i16;
                    AbstractC1199a1.m3763n(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i16 = i16;
                    AbstractC1199a1.m3767r(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 20:
                    i16 = i16;
                    AbstractC1199a1.m3769t(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 21:
                    i16 = i16;
                    AbstractC1199a1.m3775z(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    i16 = i16;
                    AbstractC1199a1.m3768s(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    i16 = i16;
                    AbstractC1199a1.m3766q(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 24:
                    i16 = i16;
                    AbstractC1199a1.m3765p(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 25:
                    i16 = i16;
                    AbstractC1199a1.m3762m(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 26:
                    i14 = i16;
                    int i27 = iArr[i17];
                    List list = (List) unsafe.getObject(obj, j7);
                    Class cls = AbstractC1199a1.f5350a;
                    if (list != null && !list.isEmpty()) {
                        C1236n c1236n3 = (C1236n) c1225j0.f5411a;
                        if (list instanceof InterfaceC1210e0) {
                            InterfaceC1210e0 interfaceC1210e0 = (InterfaceC1210e0) list;
                            for (int i28 = 0; i28 < list.size(); i28++) {
                                Object objM3794h = interfaceC1210e0.m3794h();
                                if (objM3794h instanceof String) {
                                    c1236n3.m3944J0(i27, (String) objM3794h);
                                } else {
                                    c1236n3.m3935A0(i27, (C1218h) objM3794h);
                                }
                            }
                        } else {
                            for (int i29 = 0; i29 < list.size(); i29++) {
                                c1236n3.m3944J0(i27, (String) list.get(i29));
                            }
                        }
                    }
                    i16 = i14;
                    break;
                case 27:
                    i14 = i16;
                    int i34 = iArr[i17];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1270z0 interfaceC1270z0M4000m = c1246q0.m4000m(i17);
                    Class cls2 = AbstractC1199a1.f5350a;
                    if (list2 != null && !list2.isEmpty()) {
                        c1225j0.getClass();
                        for (int i35 = 0; i35 < list2.size(); i35++) {
                            ((C1236n) c1225j0.f5411a).m3943I0(i34, (AbstractC1197a) list2.get(i35), interfaceC1270z0M4000m);
                        }
                    }
                    i16 = i14;
                    break;
                case 28:
                    i14 = i16;
                    int i36 = iArr[i17];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    Class cls3 = AbstractC1199a1.f5350a;
                    if (list3 != null && !list3.isEmpty()) {
                        c1225j0.getClass();
                        for (int i37 = 0; i37 < list3.size(); i37++) {
                            ((C1236n) c1225j0.f5411a).m3935A0(i36, (C1218h) list3.get(i37));
                        }
                    }
                    i16 = i14;
                    break;
                case 29:
                    z4 = false;
                    AbstractC1199a1.m3774y(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 30:
                    z4 = false;
                    AbstractC1199a1.m3764o(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 31:
                    z4 = false;
                    AbstractC1199a1.m3770u(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 32:
                    z4 = false;
                    AbstractC1199a1.m3771v(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 33:
                    z4 = false;
                    AbstractC1199a1.m3772w(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 34:
                    z4 = false;
                    AbstractC1199a1.m3773x(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, false);
                    i16 = i16;
                    break;
                case 35:
                    i14 = i16;
                    AbstractC1199a1.m3763n(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 36:
                    i14 = i16;
                    AbstractC1199a1.m3767r(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 37:
                    i14 = i16;
                    AbstractC1199a1.m3769t(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 38:
                    i14 = i16;
                    AbstractC1199a1.m3775z(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 39:
                    i14 = i16;
                    AbstractC1199a1.m3768s(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 40:
                    i14 = i16;
                    AbstractC1199a1.m3766q(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 41:
                    i14 = i16;
                    AbstractC1199a1.m3765p(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 42:
                    i14 = i16;
                    AbstractC1199a1.m3762m(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 43:
                    i14 = i16;
                    AbstractC1199a1.m3774y(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 44:
                    i14 = i16;
                    AbstractC1199a1.m3764o(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 45:
                    i14 = i16;
                    AbstractC1199a1.m3770u(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 46:
                    i14 = i16;
                    AbstractC1199a1.m3771v(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 47:
                    i14 = i16;
                    AbstractC1199a1.m3772w(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 48:
                    i14 = i16;
                    AbstractC1199a1.m3773x(iArr[i17], (List) unsafe.getObject(obj, j7), c1225j0, true);
                    i16 = i14;
                    break;
                case 49:
                    i14 = i16;
                    int i38 = iArr[i17];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1270z0 interfaceC1270z0M4000m2 = c1246q0.m4000m(i17);
                    Class cls4 = AbstractC1199a1.f5350a;
                    if (list4 != null && !list4.isEmpty()) {
                        c1225j0.getClass();
                        for (int i39 = 0; i39 < list4.size(); i39++) {
                            c1225j0.m3851a(i38, list4.get(i39), interfaceC1270z0M4000m2);
                        }
                    }
                    i16 = i14;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j7);
                    if (object2 != null) {
                        int i44 = 2;
                        Object obj2 = c1246q0.f5456b[(i17 / 3) * 2];
                        c1246q0.f5467m.getClass();
                        C0237p c0237p = ((C1228k0) obj2).f5420a;
                        C1236n c1236n4 = (C1236n) c1225j0.f5411a;
                        c1236n4.getClass();
                        for (Map.Entry entry : ((C1231l0) object2).entrySet()) {
                            c1236n4.m3946L0(i19, i44);
                            c1236n4.m3948N0(C1228k0.m3864a(c0237p, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C1254t.m4010b(c1236n4, (EnumC1259u1) c0237p.f812x, 1, key);
                            i44 = 2;
                            C1254t.m4010b(c1236n4, (EnumC1259u1) c0237p.f813y, 2, value);
                            i16 = i16;
                        }
                    }
                    i14 = i16;
                    i16 = i14;
                    break;
                case 51:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        double dDoubleValue = ((Double) AbstractC1235m1.f5433c.m3883h(j7, obj)).doubleValue();
                        C1236n c1236n5 = (C1236n) c1225j0.f5411a;
                        c1236n5.getClass();
                        c1236n5.m3939E0(i19, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        float fFloatValue = ((Float) AbstractC1235m1.f5433c.m3883h(j7, obj)).floatValue();
                        C1236n c1236n6 = (C1236n) c1225j0.f5411a;
                        c1236n6.getClass();
                        c1236n6.m3937C0(i19, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, m3976z(j7, obj));
                    }
                    break;
                case 54:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, m3976z(j7, obj));
                    }
                    break;
                case 55:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3941G0(i19, m3975y(j7, obj));
                    }
                    break;
                case 56:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3939E0(i19, m3976z(j7, obj));
                    }
                    break;
                case 57:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3937C0(i19, m3975y(j7, obj));
                    }
                    break;
                case 58:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3961z0(i19, ((Boolean) AbstractC1235m1.f5433c.m3883h(j7, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        Object object3 = unsafe.getObject(obj, j7);
                        if (object3 instanceof String) {
                            ((C1236n) c1225j0.f5411a).m3944J0(i19, (String) object3);
                        } else {
                            ((C1236n) c1225j0.f5411a).m3935A0(i19, (C1218h) object3);
                        }
                    }
                    break;
                case 60:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3943I0(i19, (AbstractC1197a) unsafe.getObject(obj, j7), c1246q0.m4000m(i17));
                    }
                    break;
                case 61:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3935A0(i19, (C1218h) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3947M0(i19, m3975y(j7, obj));
                    }
                    break;
                case 63:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3941G0(i19, m3975y(j7, obj));
                    }
                    break;
                case 64:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3937C0(i19, m3975y(j7, obj));
                    }
                    break;
                case 65:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        ((C1236n) c1225j0.f5411a).m3939E0(i19, m3976z(j7, obj));
                    }
                    break;
                case 66:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        int iM3975y = m3975y(j7, obj);
                        ((C1236n) c1225j0.f5411a).m3947M0(i19, (iM3975y >> 31) ^ (iM3975y << 1));
                    }
                    break;
                case 67:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        long jM3976z = m3976z(j7, obj);
                        ((C1236n) c1225j0.f5411a).m3949O0(i19, (jM3976z << 1) ^ (jM3976z >> 63));
                    }
                    break;
                case 68:
                    if (c1246q0.m4003q(i19, i17, obj)) {
                        c1225j0.m3851a(i19, unsafe.getObject(obj, j7), c1246q0.m4000m(i17));
                    }
                    break;
                default:
                    break;
            }
            i17 += 3;
            i15 = 1048575;
        }
        ((C1217g1) c1246q0.f5466l).getClass();
        ((AbstractC1269z) obj).unknownFields.m3805d(c1225j0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: a */
    public final void mo3988a(Object obj, Object obj2) {
        Object obj3;
        if (!m3972p(obj)) {
            throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f5455a;
            if (i13 >= iArr.length) {
                AbstractC1199a1.m3760k(this.f5466l, obj, obj2);
                return;
            }
            int iM3986L = m3986L(i13);
            long j7 = 1048575 & iM3986L;
            int i14 = iArr[i13];
            switch (m3971K(iM3986L)) {
                case 0:
                    if (!m4001n(i13, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC1232l1 abstractC1232l1 = AbstractC1235m1.f5433c;
                        obj3 = obj;
                        abstractC1232l1.mo3817l(obj3, j7, abstractC1232l1.mo3813d(j7, obj2));
                        m3982G(i13, obj3);
                    }
                    break;
                case 1:
                    if (m4001n(i13, obj2)) {
                        AbstractC1232l1 abstractC1232l2 = AbstractC1235m1.f5433c;
                        abstractC1232l2.mo3818m(obj, j7, abstractC1232l2.mo3814e(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3928n(obj, j7, AbstractC1235m1.f5433c.m3882g(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3928n(obj, j7, AbstractC1235m1.f5433c.m3882g(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3928n(obj, j7, AbstractC1235m1.f5433c.m3882g(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m4001n(i13, obj2)) {
                        AbstractC1232l1 abstractC1232l3 = AbstractC1235m1.f5433c;
                        abstractC1232l3.mo3815j(obj, j7, abstractC1232l3.mo3812c(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3929o(j7, obj, AbstractC1235m1.f5433c.m3883h(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m4005s(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3929o(j7, obj, AbstractC1235m1.f5433c.m3883h(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3928n(obj, j7, AbstractC1235m1.f5433c.m3882g(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3927m(j7, obj, AbstractC1235m1.f5433c.m3881f(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m4001n(i13, obj2)) {
                        AbstractC1235m1.m3928n(obj, j7, AbstractC1235m1.f5433c.m3882g(j7, obj2));
                        m3982G(i13, obj);
                    }
                    obj3 = obj;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m4005s(i13, obj, obj2);
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
                    this.f5465k.getClass();
                    AbstractC1232l1 abstractC1232l4 = AbstractC1235m1.f5433c;
                    InterfaceC1201b0 interfaceC1201b0M4018g = (InterfaceC1201b0) abstractC1232l4.m3883h(j7, obj);
                    InterfaceC1201b0 interfaceC1201b0 = (InterfaceC1201b0) abstractC1232l4.m3883h(j7, obj2);
                    int size = interfaceC1201b0M4018g.size();
                    int size2 = interfaceC1201b0.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1200b) interfaceC1201b0M4018g).m3777c()) {
                            interfaceC1201b0M4018g = ((C1266x0) interfaceC1201b0M4018g).m4018g(size2 + size);
                        }
                        interfaceC1201b0M4018g.addAll(interfaceC1201b0);
                    }
                    if (size > 0) {
                        interfaceC1201b0 = interfaceC1201b0M4018g;
                    }
                    AbstractC1235m1.m3929o(j7, obj, interfaceC1201b0);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC1199a1.f5350a;
                    AbstractC1232l1 abstractC1232l5 = AbstractC1235m1.f5433c;
                    Object objM3883h = abstractC1232l5.m3883h(j7, obj);
                    Object objM3883h2 = abstractC1232l5.m3883h(j7, obj2);
                    this.f5467m.getClass();
                    AbstractC1235m1.m3929o(j7, obj, C1234m0.m3914a(objM3883h, objM3883h2));
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
                    if (m4003q(i14, i13, obj2)) {
                        AbstractC1235m1.m3929o(j7, obj, AbstractC1235m1.f5433c.m3883h(j7, obj2));
                        m3983H(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m4006t(i13, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m4003q(i14, i13, obj2)) {
                        AbstractC1235m1.m3929o(j7, obj, AbstractC1235m1.f5433c.m3883h(j7, obj2));
                        m3983H(i14, i13, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m4006t(i13, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: b */
    public final void mo3989b(Object obj) {
        if (m3972p(obj)) {
            if (obj instanceof AbstractC1269z) {
                AbstractC1269z abstractC1269z = (AbstractC1269z) obj;
                abstractC1269z.m4028k(Integer.MAX_VALUE);
                abstractC1269z.memoizedHashCode = 0;
                abstractC1269z.m4026h();
            }
            int[] iArr = this.f5455a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iM3986L = m3986L(i13);
                long j7 = 1048575 & iM3986L;
                int iM3971K = m3971K(iM3986L);
                if (iM3971K != 9) {
                    if (iM3971K != 60 && iM3971K != 68) {
                        switch (iM3971K) {
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                if (m4001n(i13, obj)) {
                                    m4000m(i13).mo3989b(f5454o.getObject(obj, j7));
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
                                this.f5465k.getClass();
                                ((AbstractC1200b) ((InterfaceC1201b0) AbstractC1235m1.f5433c.m3883h(j7, obj))).m3778d();
                                break;
                            case 50:
                                Unsafe unsafe = f5454o;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    this.f5467m.getClass();
                                    ((C1231l0) object).f5425w = false;
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (m4003q(iArr[i13], i13, obj)) {
                        m4000m(i13).mo3989b(f5454o.getObject(obj, j7));
                    }
                } else if (m4001n(i13, obj)) {
                    m4000m(i13).mo3989b(f5454o.getObject(obj, j7));
                }
            }
            ((C1217g1) this.f5466l).getClass();
            C1214f1 c1214f1 = ((AbstractC1269z) obj).unknownFields;
            if (c1214f1.f5395e) {
                c1214f1.f5395e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: c */
    public final boolean mo3990c(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f5462h) {
            int i18 = this.f5461g[i17];
            int[] iArr = this.f5455a;
            int i19 = iArr[i18];
            int iM3986L = m3986L(i18);
            int i24 = iArr[i18 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i15) {
                if (i25 != 1048575) {
                    i16 = f5454o.getInt(obj, i25);
                }
                i14 = i16;
                i13 = i25;
            } else {
                int i27 = i16;
                i13 = i15;
                i14 = i27;
            }
            if ((268435456 & iM3986L) == 0 || m4002o(obj, i18, i13, i14, i26)) {
                int iM3971K = m3971K(iM3986L);
                if (iM3971K == 9 || iM3971K == 17) {
                    if (m4002o(obj, i18, i13, i14, i26)) {
                        if (!m4000m(i18).mo3990c(AbstractC1235m1.f5433c.m3883h(iM3986L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i17++;
                    i15 = i13;
                    i16 = i14;
                } else {
                    if (iM3971K != 27) {
                        if (iM3971K == 60 || iM3971K == 68) {
                            if (m4003q(i19, i18, obj)) {
                                if (!m4000m(i18).mo3990c(AbstractC1235m1.f5433c.m3883h(iM3986L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i17++;
                            i15 = i13;
                            i16 = i14;
                        } else if (iM3971K != 49) {
                            if (iM3971K != 50) {
                                continue;
                            } else {
                                Object objM3883h = AbstractC1235m1.f5433c.m3883h(iM3986L & 1048575, obj);
                                this.f5467m.getClass();
                                C1231l0 c1231l0 = (C1231l0) objM3883h;
                                if (c1231l0.isEmpty()) {
                                    continue;
                                } else {
                                    if (((EnumC1259u1) ((C1228k0) this.f5456b[(i18 / 3) * 2]).f5420a.f813y).f5487w != EnumC1262v1.MESSAGE) {
                                        continue;
                                    } else {
                                        InterfaceC1270z0 interfaceC1270z0M4012a = null;
                                        for (Object obj2 : c1231l0.values()) {
                                            if (interfaceC1270z0M4012a == null) {
                                                interfaceC1270z0M4012a = C1264w0.f5502c.m4012a(obj2.getClass());
                                            }
                                            if (!interfaceC1270z0M4012a.mo3990c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i17++;
                            i15 = i13;
                            i16 = i14;
                        }
                    }
                    List list = (List) AbstractC1235m1.f5433c.m3883h(iM3986L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1270z0 interfaceC1270z0M4000m = m4000m(i18);
                        for (int i28 = 0; i28 < list.size(); i28++) {
                            if (interfaceC1270z0M4000m.mo3990c(list.get(i28))) {
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

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: d */
    public final AbstractC1269z mo3991d() {
        this.f5464j.getClass();
        return ((AbstractC1269z) this.f5459e).m4027i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: e */
    public final void mo3992e(Object obj, C1225j0 c1225j0) throws IOException {
        c1225j0.getClass();
        m3987M(obj, c1225j0);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: f */
    public final void mo3993f(java.lang.Object r19, androidx.datastore.preferences.protobuf.C1233m r20, androidx.datastore.preferences.protobuf.C1245q r21) {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1246q0.mo3993f(java.lang.Object, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.q):void");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: g */
    public final int mo3994g(AbstractC1269z abstractC1269z) {
        int i13;
        int iM3932s0;
        int iM3932s1;
        int iM3932s2;
        int iM3934u0;
        int iM3932s3;
        int iM3934u1;
        int iM3932s4;
        int iM3932s5;
        int iM3930q0;
        int iM3932s6;
        int iMo3748a;
        int iM3752c;
        int iM3932s7;
        int size;
        int iM3758i;
        int iM3932s8;
        int iM3932s9;
        int size2;
        int iM3932s10;
        int iM3933t0;
        int iM3934u2;
        int iMo3748a2;
        int iM3932s11;
        int iM3933t1;
        C1246q0 c1246q0 = this;
        AbstractC1269z abstractC1269z2 = abstractC1269z;
        Unsafe unsafe = f5454o;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int iM3930q1 = 0;
        while (true) {
            int[] iArr = c1246q0.f5455a;
            if (i15 >= iArr.length) {
                ((C1217g1) c1246q0.f5466l).getClass();
                return abstractC1269z2.unknownFields.m3803b() + iM3930q1;
            }
            int iM3986L = c1246q0.m3986L(i15);
            int iM3971K = m3971K(iM3986L);
            int i17 = iArr[i15];
            int i18 = iArr[i15 + 2];
            int i19 = i18 & 1048575;
            if (iM3971K <= 17) {
                if (i19 != i14) {
                    i16 = i19 == 1048575 ? 0 : unsafe.getInt(abstractC1269z2, i19);
                    i14 = i19;
                }
                i13 = 1 << (i18 >>> 20);
            } else {
                i13 = 0;
            }
            long j7 = iM3986L & 1048575;
            if (iM3971K >= EnumC1257u.f5479x.f5482w) {
                int i24 = EnumC1257u.f5480y.f5482w;
            }
            switch (iM3971K) {
                case 0:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s0 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s0 + 8;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 1:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s1 = C1236n.m3932s0(i17);
                        iM3932s5 = iM3932s1 + 4;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 2:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        long j13 = unsafe.getLong(abstractC1269z2, j7);
                        iM3932s2 = C1236n.m3932s0(i17);
                        iM3934u0 = C1236n.m3934u0(j13);
                        iM3930q1 += iM3934u0 + iM3932s2;
                    }
                    c1246q0 = this;
                    break;
                case 3:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        long j14 = unsafe.getLong(abstractC1269z2, j7);
                        iM3932s2 = C1236n.m3932s0(i17);
                        iM3934u0 = C1236n.m3934u0(j14);
                        iM3930q1 += iM3934u0 + iM3932s2;
                    }
                    c1246q0 = this;
                    break;
                case 4:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        int i25 = unsafe.getInt(abstractC1269z2, j7);
                        iM3932s3 = C1236n.m3932s0(i17);
                        iM3934u1 = C1236n.m3934u0(i25);
                        iM3930q0 = iM3934u1 + iM3932s3;
                        iM3930q1 += iM3930q0;
                    }
                    c1246q0 = this;
                    break;
                case 5:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s4 = C1236n.m3932s0(i17);
                        iM3932s5 = iM3932s4 + 8;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 6:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s1 = C1236n.m3932s0(i17);
                        iM3932s5 = iM3932s1 + 4;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 7:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s5 = C1236n.m3932s0(i17) + 1;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 8:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        Object object = unsafe.getObject(abstractC1269z2, j7);
                        iM3930q1 = (object instanceof C1218h ? C1236n.m3930q0(i17, (C1218h) object) : C1236n.m3931r0((String) object) + C1236n.m3932s0(i17)) + iM3930q1;
                    }
                    c1246q0 = this;
                    break;
                case 9:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        Object object2 = unsafe.getObject(abstractC1269z2, j7);
                        InterfaceC1270z0 interfaceC1270z0M4000m = c1246q0.m4000m(i15);
                        Class cls = AbstractC1199a1.f5350a;
                        int iM3932s12 = C1236n.m3932s0(i17);
                        int iMo3748a3 = ((AbstractC1197a) object2).mo3748a(interfaceC1270z0M4000m);
                        iM3930q1 += C1236n.m3933t0(iMo3748a3) + iMo3748a3 + iM3932s12;
                    }
                    break;
                case 10:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3930q0 = C1236n.m3930q0(i17, (C1218h) unsafe.getObject(abstractC1269z2, j7));
                        iM3930q1 += iM3930q0;
                    }
                    c1246q0 = this;
                    break;
                case 11:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        int i26 = unsafe.getInt(abstractC1269z2, j7);
                        iM3932s3 = C1236n.m3932s0(i17);
                        iM3934u1 = C1236n.m3933t0(i26);
                        iM3930q0 = iM3934u1 + iM3932s3;
                        iM3930q1 += iM3930q0;
                    }
                    c1246q0 = this;
                    break;
                case 12:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        int i27 = unsafe.getInt(abstractC1269z2, j7);
                        iM3932s3 = C1236n.m3932s0(i17);
                        iM3934u1 = C1236n.m3934u0(i27);
                        iM3930q0 = iM3934u1 + iM3932s3;
                        iM3930q1 += iM3930q0;
                    }
                    c1246q0 = this;
                    break;
                case 13:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s1 = C1236n.m3932s0(i17);
                        iM3932s5 = iM3932s1 + 4;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 14:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        iM3932s4 = C1236n.m3932s0(i17);
                        iM3932s5 = iM3932s4 + 8;
                        iM3930q1 += iM3932s5;
                    }
                    c1246q0 = this;
                    abstractC1269z2 = abstractC1269z;
                    break;
                case 15:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        int i28 = unsafe.getInt(abstractC1269z2, j7);
                        iM3932s3 = C1236n.m3932s0(i17);
                        iM3934u1 = C1236n.m3933t0((i28 >> 31) ^ (i28 << 1));
                        iM3930q0 = iM3934u1 + iM3932s3;
                        iM3930q1 += iM3930q0;
                    }
                    c1246q0 = this;
                    break;
                case 16:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        long j15 = unsafe.getLong(abstractC1269z2, j7);
                        iM3932s2 = C1236n.m3932s0(i17);
                        iM3934u0 = C1236n.m3934u0((j15 << 1) ^ (j15 >> 63));
                        iM3930q1 += iM3934u0 + iM3932s2;
                    }
                    c1246q0 = this;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (c1246q0.m4002o(abstractC1269z2, i15, i14, i16, i13)) {
                        AbstractC1197a abstractC1197a = (AbstractC1197a) unsafe.getObject(abstractC1269z2, j7);
                        InterfaceC1270z0 interfaceC1270z0M4000m2 = c1246q0.m4000m(i15);
                        iM3932s6 = C1236n.m3932s0(i17) * 2;
                        iMo3748a = abstractC1197a.mo3748a(interfaceC1270z0M4000m2);
                        iM3752c = iMo3748a + iM3932s6;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    iM3752c = AbstractC1199a1.m3752c(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    iM3752c = AbstractC1199a1.m3751b(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls2 = AbstractC1199a1.f5350a;
                    if (list.size() == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3932s7 = (C1236n.m3932s0(i17) * list.size()) + AbstractC1199a1.m3754e(list);
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls3 = AbstractC1199a1.f5350a;
                    size = list2.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3758i(list2);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls4 = AbstractC1199a1.f5350a;
                    size = list3.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3753d(list3);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    iM3752c = AbstractC1199a1.m3752c(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case 24:
                    iM3752c = AbstractC1199a1.m3751b(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls5 = AbstractC1199a1.f5350a;
                    int size3 = list4.size();
                    iM3930q1 += size3 == 0 ? 0 : (C1236n.m3932s0(i17) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls6 = AbstractC1199a1.f5350a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3932s7 = C1236n.m3932s0(i17) * size4;
                        if (list5 instanceof InterfaceC1210e0) {
                            InterfaceC1210e0 interfaceC1210e0 = (InterfaceC1210e0) list5;
                            for (int i29 = 0; i29 < size4; i29++) {
                                Object objM3794h = interfaceC1210e0.m3794h();
                                if (objM3794h instanceof C1218h) {
                                    int size5 = ((C1218h) objM3794h).size();
                                    iM3932s7 = C1236n.m3933t0(size5) + size5 + iM3932s7;
                                } else {
                                    iM3932s7 = C1236n.m3931r0((String) objM3794h) + iM3932s7;
                                }
                            }
                        } else {
                            for (int i34 = 0; i34 < size4; i34++) {
                                Object obj = list5.get(i34);
                                if (obj instanceof C1218h) {
                                    int size6 = ((C1218h) obj).size();
                                    iM3932s7 = C1236n.m3933t0(size6) + size6 + iM3932s7;
                                } else {
                                    iM3932s7 = C1236n.m3931r0((String) obj) + iM3932s7;
                                }
                            }
                        }
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC1269z2, j7);
                    InterfaceC1270z0 interfaceC1270z0M4000m3 = c1246q0.m4000m(i15);
                    Class cls7 = AbstractC1199a1.f5350a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iM3932s9 = 0;
                    } else {
                        iM3932s9 = C1236n.m3932s0(i17) * size7;
                        for (int i35 = 0; i35 < size7; i35++) {
                            int iMo3748a4 = ((AbstractC1197a) list6.get(i35)).mo3748a(interfaceC1270z0M4000m3);
                            iM3932s9 += C1236n.m3933t0(iMo3748a4) + iMo3748a4;
                        }
                    }
                    iM3930q1 += iM3932s9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls8 = AbstractC1199a1.f5350a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3932s7 = C1236n.m3932s0(i17) * size8;
                        for (int i36 = 0; i36 < list7.size(); i36++) {
                            int size9 = ((C1218h) list7.get(i36)).size();
                            iM3932s7 += C1236n.m3933t0(size9) + size9;
                        }
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls9 = AbstractC1199a1.f5350a;
                    size = list8.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3757h(list8);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls10 = AbstractC1199a1.f5350a;
                    size = list9.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3750a(list9);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 31:
                    iM3752c = AbstractC1199a1.m3751b(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case 32:
                    iM3752c = AbstractC1199a1.m3752c(i17, (List) unsafe.getObject(abstractC1269z2, j7));
                    iM3930q1 += iM3752c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls11 = AbstractC1199a1.f5350a;
                    size = list10.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3755f(list10);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls12 = AbstractC1199a1.f5350a;
                    size = list11.size();
                    if (size == 0) {
                        iM3932s7 = 0;
                    } else {
                        iM3758i = AbstractC1199a1.m3756g(list11);
                        iM3932s8 = C1236n.m3932s0(i17);
                        iM3932s7 = (iM3932s8 * size) + iM3758i;
                    }
                    iM3930q1 += iM3932s7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls13 = AbstractC1199a1.f5350a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls14 = AbstractC1199a1.f5350a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 37:
                    size2 = AbstractC1199a1.m3754e((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 38:
                    size2 = AbstractC1199a1.m3758i((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 39:
                    size2 = AbstractC1199a1.m3753d((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls15 = AbstractC1199a1.f5350a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls16 = AbstractC1199a1.f5350a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls17 = AbstractC1199a1.f5350a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 43:
                    size2 = AbstractC1199a1.m3757h((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 44:
                    size2 = AbstractC1199a1.m3750a((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls18 = AbstractC1199a1.f5350a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC1269z2, j7);
                    Class cls19 = AbstractC1199a1.f5350a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 47:
                    size2 = AbstractC1199a1.m3755f((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 48:
                    size2 = AbstractC1199a1.m3756g((List) unsafe.getObject(abstractC1269z2, j7));
                    if (size2 > 0) {
                        iM3932s10 = C1236n.m3932s0(i17);
                        iM3933t0 = C1236n.m3933t0(size2);
                        iM3934u2 = iM3933t0 + iM3932s10;
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC1269z2, j7);
                    InterfaceC1270z0 interfaceC1270z0M4000m4 = c1246q0.m4000m(i15);
                    Class cls20 = AbstractC1199a1.f5350a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iMo3748a2 = 0;
                    } else {
                        iMo3748a2 = 0;
                        for (int i37 = 0; i37 < size10; i37++) {
                            iMo3748a2 += ((AbstractC1197a) list19.get(i37)).mo3748a(interfaceC1270z0M4000m4) + (C1236n.m3932s0(i17) * 2);
                        }
                    }
                    iM3930q1 += iMo3748a2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1269z2, j7);
                    Object obj2 = c1246q0.f5456b[(i15 / 3) * 2];
                    c1246q0.f5467m.getClass();
                    C1231l0 c1231l0 = (C1231l0) object3;
                    C1228k0 c1228k0 = (C1228k0) obj2;
                    if (c1231l0.isEmpty()) {
                        iM3932s9 = 0;
                    } else {
                        iM3932s9 = 0;
                        for (Map.Entry entry : c1231l0.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c1228k0.getClass();
                            int iM3932s13 = C1236n.m3932s0(i17);
                            int iM3864a = C1228k0.m3864a(c1228k0.f5420a, key, value);
                            iM3932s9 += C1236n.m3933t0(iM3864a) + iM3864a + iM3932s13;
                        }
                    }
                    iM3930q1 += iM3932s9;
                    break;
                case 51:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s0 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s0 + 8;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 52:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s11 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s11 + 4;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 53:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        long jM3976z = m3976z(j7, abstractC1269z2);
                        size2 = C1236n.m3932s0(i17);
                        iM3934u2 = C1236n.m3934u0(jM3976z);
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 54:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        long jM3976z2 = m3976z(j7, abstractC1269z2);
                        size2 = C1236n.m3932s0(i17);
                        iM3934u2 = C1236n.m3934u0(jM3976z2);
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 55:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        int iM3975y = m3975y(j7, abstractC1269z2);
                        iM3932s6 = C1236n.m3932s0(i17);
                        iMo3748a = C1236n.m3934u0(iM3975y);
                        iM3752c = iMo3748a + iM3932s6;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 56:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s0 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s0 + 8;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 57:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s11 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s11 + 4;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 58:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3752c = C1236n.m3932s0(i17) + 1;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 59:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        Object object4 = unsafe.getObject(abstractC1269z2, j7);
                        iM3930q1 = (object4 instanceof C1218h ? C1236n.m3930q0(i17, (C1218h) object4) : C1236n.m3931r0((String) object4) + C1236n.m3932s0(i17)) + iM3930q1;
                    }
                    break;
                case 60:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        Object object5 = unsafe.getObject(abstractC1269z2, j7);
                        InterfaceC1270z0 interfaceC1270z0M4000m5 = c1246q0.m4000m(i15);
                        Class cls21 = AbstractC1199a1.f5350a;
                        int iM3932s14 = C1236n.m3932s0(i17);
                        int iMo3748a5 = ((AbstractC1197a) object5).mo3748a(interfaceC1270z0M4000m5);
                        iM3933t1 = C1236n.m3933t0(iMo3748a5) + iMo3748a5 + iM3932s14;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 61:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3752c = C1236n.m3930q0(i17, (C1218h) unsafe.getObject(abstractC1269z2, j7));
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 62:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        int iM3975y2 = m3975y(j7, abstractC1269z2);
                        iM3932s6 = C1236n.m3932s0(i17);
                        iMo3748a = C1236n.m3933t0(iM3975y2);
                        iM3752c = iMo3748a + iM3932s6;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 63:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        int iM3975y3 = m3975y(j7, abstractC1269z2);
                        iM3932s6 = C1236n.m3932s0(i17);
                        iMo3748a = C1236n.m3934u0(iM3975y3);
                        iM3752c = iMo3748a + iM3932s6;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 64:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s11 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s11 + 4;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 65:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3932s0 = C1236n.m3932s0(i17);
                        iM3752c = iM3932s0 + 8;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 66:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        int iM3975y4 = m3975y(j7, abstractC1269z2);
                        iM3932s6 = C1236n.m3932s0(i17);
                        iMo3748a = C1236n.m3933t0((iM3975y4 >> 31) ^ (iM3975y4 << 1));
                        iM3752c = iMo3748a + iM3932s6;
                        iM3930q1 += iM3752c;
                    }
                    break;
                case 67:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        long jM3976z3 = m3976z(j7, abstractC1269z2);
                        size2 = C1236n.m3932s0(i17);
                        iM3934u2 = C1236n.m3934u0((jM3976z3 << 1) ^ (jM3976z3 >> 63));
                        iM3933t1 = iM3934u2 + size2;
                        iM3930q1 += iM3933t1;
                    }
                    break;
                case 68:
                    if (c1246q0.m4003q(i17, i15, abstractC1269z2)) {
                        iM3752c = ((AbstractC1197a) unsafe.getObject(abstractC1269z2, j7)).mo3748a(c1246q0.m4000m(i15)) + (C1236n.m3932s0(i17) * 2);
                        iM3930q1 += iM3752c;
                    }
                    break;
            }
            i15 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: h */
    public final int mo3995h(AbstractC1269z abstractC1269z) {
        int i13;
        int iM3789b;
        int i14;
        int[] iArr = this.f5455a;
        int length = iArr.length;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 += 3) {
            int iM3986L = m3986L(i16);
            int i17 = iArr[i16];
            long j7 = 1048575 & iM3986L;
            int i18 = 1237;
            int iHashCode = 37;
            switch (m3971K(iM3986L)) {
                case 0:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(Double.doubleToLongBits(AbstractC1235m1.f5433c.mo3813d(j7, abstractC1269z)));
                    i15 = iM3789b + i13;
                    break;
                case 1:
                    i13 = i15 * 53;
                    iM3789b = Float.floatToIntBits(AbstractC1235m1.f5433c.mo3814e(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case 2:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(AbstractC1235m1.f5433c.m3882g(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case 3:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(AbstractC1235m1.f5433c.m3882g(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case 4:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 5:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(AbstractC1235m1.f5433c.m3882g(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case 6:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 7:
                    i14 = i15 * 53;
                    boolean zMo3812c = AbstractC1235m1.f5433c.mo3812c(j7, abstractC1269z);
                    Charset charset = AbstractC1204c0.f5362a;
                    if (zMo3812c) {
                        i18 = 1231;
                    }
                    i15 = i18 + i14;
                    break;
                case 8:
                    i13 = i15 * 53;
                    iM3789b = ((String) AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z)).hashCode();
                    i15 = iM3789b + i13;
                    break;
                case 9:
                    Object objM3883h = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z);
                    if (objM3883h != null) {
                        iHashCode = objM3883h.hashCode();
                    }
                    i15 = (i15 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                    i15 = iM3789b + i13;
                    break;
                case 11:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 12:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 13:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 14:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(AbstractC1235m1.f5433c.m3882g(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case 15:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3881f(j7, abstractC1269z);
                    i15 = iM3789b + i13;
                    break;
                case 16:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1204c0.m3789b(AbstractC1235m1.f5433c.m3882g(j7, abstractC1269z));
                    i15 = iM3789b + i13;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    Object objM3883h2 = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z);
                    if (objM3883h2 != null) {
                        iHashCode = objM3883h2.hashCode();
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
                    iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                    i15 = iM3789b + i13;
                    break;
                case 50:
                    i13 = i15 * 53;
                    iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                    i15 = iM3789b + i13;
                    break;
                case 51:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(Double.doubleToLongBits(((Double) AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z)).doubleValue()));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 52:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = Float.floatToIntBits(((Float) AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z)).floatValue());
                        i15 = iM3789b + i13;
                    }
                    break;
                case 53:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(m3976z(j7, abstractC1269z));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 54:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(m3976z(j7, abstractC1269z));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 55:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 56:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(m3976z(j7, abstractC1269z));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 57:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 58:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i14 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z)).booleanValue();
                        Charset charset2 = AbstractC1204c0.f5362a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i14;
                    }
                    break;
                case 59:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = ((String) AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z)).hashCode();
                        i15 = iM3789b + i13;
                    }
                    break;
                case 60:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                        i15 = iM3789b + i13;
                    }
                    break;
                case 61:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                        i15 = iM3789b + i13;
                    }
                    break;
                case 62:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 63:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 64:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 65:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(m3976z(j7, abstractC1269z));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 66:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = m3975y(j7, abstractC1269z);
                        i15 = iM3789b + i13;
                    }
                    break;
                case 67:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1204c0.m3789b(m3976z(j7, abstractC1269z));
                        i15 = iM3789b + i13;
                    }
                    break;
                case 68:
                    if (m4003q(i17, i16, abstractC1269z)) {
                        i13 = i15 * 53;
                        iM3789b = AbstractC1235m1.f5433c.m3883h(j7, abstractC1269z).hashCode();
                        i15 = iM3789b + i13;
                    }
                    break;
            }
        }
        ((C1217g1) this.f5466l).getClass();
        return abstractC1269z.unknownFields.hashCode() + (i15 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: i */
    public final boolean mo3996i(AbstractC1269z abstractC1269z, AbstractC1269z abstractC1269z2) {
        int[] iArr = this.f5455a;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            boolean zM3761l = true;
            if (i13 < length) {
                int iM3986L = m3986L(i13);
                long j7 = iM3986L & 1048575;
                switch (m3971K(iM3986L)) {
                    case 0:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l1 = AbstractC1235m1.f5433c;
                            if (Double.doubleToLongBits(abstractC1232l1.mo3813d(j7, abstractC1269z)) != Double.doubleToLongBits(abstractC1232l1.mo3813d(j7, abstractC1269z2))) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l2 = AbstractC1235m1.f5433c;
                            if (Float.floatToIntBits(abstractC1232l2.mo3814e(j7, abstractC1269z)) != Float.floatToIntBits(abstractC1232l2.mo3814e(j7, abstractC1269z2))) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l3 = AbstractC1235m1.f5433c;
                            if (abstractC1232l3.m3882g(j7, abstractC1269z) != abstractC1232l3.m3882g(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l4 = AbstractC1235m1.f5433c;
                            if (abstractC1232l4.m3882g(j7, abstractC1269z) != abstractC1232l4.m3882g(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l5 = AbstractC1235m1.f5433c;
                            if (abstractC1232l5.m3881f(j7, abstractC1269z) != abstractC1232l5.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l6 = AbstractC1235m1.f5433c;
                            if (abstractC1232l6.m3882g(j7, abstractC1269z) != abstractC1232l6.m3882g(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l7 = AbstractC1235m1.f5433c;
                            if (abstractC1232l7.m3881f(j7, abstractC1269z) != abstractC1232l7.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l8 = AbstractC1235m1.f5433c;
                            if (abstractC1232l8.mo3812c(j7, abstractC1269z) != abstractC1232l8.mo3812c(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l9 = AbstractC1235m1.f5433c;
                            if (!AbstractC1199a1.m3761l(abstractC1232l9.m3883h(j7, abstractC1269z), abstractC1232l9.m3883h(j7, abstractC1269z2))) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l10 = AbstractC1235m1.f5433c;
                            if (!AbstractC1199a1.m3761l(abstractC1232l10.m3883h(j7, abstractC1269z), abstractC1232l10.m3883h(j7, abstractC1269z2))) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l11 = AbstractC1235m1.f5433c;
                            if (!AbstractC1199a1.m3761l(abstractC1232l11.m3883h(j7, abstractC1269z), abstractC1232l11.m3883h(j7, abstractC1269z2))) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l12 = AbstractC1235m1.f5433c;
                            if (abstractC1232l12.m3881f(j7, abstractC1269z) != abstractC1232l12.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l13 = AbstractC1235m1.f5433c;
                            if (abstractC1232l13.m3881f(j7, abstractC1269z) != abstractC1232l13.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l14 = AbstractC1235m1.f5433c;
                            if (abstractC1232l14.m3881f(j7, abstractC1269z) != abstractC1232l14.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l15 = AbstractC1235m1.f5433c;
                            if (abstractC1232l15.m3882g(j7, abstractC1269z) != abstractC1232l15.m3882g(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l16 = AbstractC1235m1.f5433c;
                            if (abstractC1232l16.m3881f(j7, abstractC1269z) != abstractC1232l16.m3881f(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l17 = AbstractC1235m1.f5433c;
                            if (abstractC1232l17.m3882g(j7, abstractC1269z) != abstractC1232l17.m3882g(j7, abstractC1269z2)) {
                                zM3761l = false;
                            }
                        }
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        if (!m3997j(abstractC1269z, abstractC1269z2, i13)) {
                            zM3761l = false;
                        } else {
                            AbstractC1232l1 abstractC1232l18 = AbstractC1235m1.f5433c;
                            if (!AbstractC1199a1.m3761l(abstractC1232l18.m3883h(j7, abstractC1269z), abstractC1232l18.m3883h(j7, abstractC1269z2))) {
                                zM3761l = false;
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
                        AbstractC1232l1 abstractC1232l19 = AbstractC1235m1.f5433c;
                        zM3761l = AbstractC1199a1.m3761l(abstractC1232l19.m3883h(j7, abstractC1269z), abstractC1232l19.m3883h(j7, abstractC1269z2));
                        break;
                    case 50:
                        AbstractC1232l1 abstractC1232l20 = AbstractC1235m1.f5433c;
                        zM3761l = AbstractC1199a1.m3761l(abstractC1232l20.m3883h(j7, abstractC1269z), abstractC1232l20.m3883h(j7, abstractC1269z2));
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
                        AbstractC1232l1 abstractC1232l21 = AbstractC1235m1.f5433c;
                        if (abstractC1232l21.m3881f(j13, abstractC1269z) != abstractC1232l21.m3881f(j13, abstractC1269z2) || !AbstractC1199a1.m3761l(abstractC1232l21.m3883h(j7, abstractC1269z), abstractC1232l21.m3883h(j7, abstractC1269z2))) {
                            zM3761l = false;
                        }
                        break;
                }
                if (zM3761l) {
                    i13 += 3;
                }
            } else {
                C1217g1 c1217g1 = (C1217g1) this.f5466l;
                c1217g1.getClass();
                C1214f1 c1214f1 = abstractC1269z.unknownFields;
                c1217g1.getClass();
                if (c1214f1.equals(abstractC1269z2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3997j(AbstractC1269z abstractC1269z, AbstractC1269z abstractC1269z2, int i13) {
        return m4001n(i13, abstractC1269z) == m4001n(i13, abstractC1269z2);
    }

    /* JADX INFO: renamed from: k */
    public final void m3998k(int i13, Object obj, Object obj2) {
        int i14 = this.f5455a[i13];
        if (AbstractC1235m1.f5433c.m3883h(m3986L(i13) & 1048575, obj) == null) {
            return;
        }
        m3999l(i13);
    }

    /* JADX INFO: renamed from: l */
    public final void m3999l(int i13) {
        if (this.f5456b[AbstractC11266d.m30449c(i13, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC1270z0 m4000m(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f5456b;
        InterfaceC1270z0 interfaceC1270z0 = (InterfaceC1270z0) objArr[i14];
        if (interfaceC1270z0 != null) {
            return interfaceC1270z0;
        }
        InterfaceC1270z0 interfaceC1270z0M4012a = C1264w0.f5502c.m4012a((Class) objArr[i14 + 1]);
        objArr[i14] = interfaceC1270z0M4012a;
        return interfaceC1270z0M4012a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4001n(int i13, Object obj) {
        int i14 = this.f5455a[i13 + 2];
        long j7 = i14 & 1048575;
        if (j7 == 1048575) {
            int iM3986L = m3986L(i13);
            long j13 = iM3986L & 1048575;
            switch (m3971K(iM3986L)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1235m1.f5433c.mo3813d(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1235m1.f5433c.mo3814e(j13, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1235m1.f5433c.m3882g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1235m1.f5433c.m3882g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1235m1.f5433c.m3882g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1235m1.f5433c.mo3812c(j13, obj);
                case 8:
                    Object objM3883h = AbstractC1235m1.f5433c.m3883h(j13, obj);
                    if (objM3883h instanceof String) {
                        return !((String) objM3883h).isEmpty();
                    }
                    if (objM3883h instanceof C1218h) {
                        return !C1218h.f5398y.equals(objM3883h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC1235m1.f5433c.m3883h(j13, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1218h.f5398y.equals(AbstractC1235m1.f5433c.m3883h(j13, obj));
                case 11:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1235m1.f5433c.m3882g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1235m1.f5433c.m3881f(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1235m1.f5433c.m3882g(j13, obj) == 0) {
                        return false;
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    if (AbstractC1235m1.f5433c.m3883h(j13, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i14 >>> 20)) & AbstractC1235m1.f5433c.m3881f(j7, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4002o(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return m4001n(i13, obj);
        }
        return (i15 & i16) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4003q(int i13, int i14, Object obj) {
        return AbstractC1235m1.f5433c.m3881f((long) (this.f5455a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX INFO: renamed from: r */
    public final void m4004r(Object obj, int i13, Object obj2, C1245q c1245q, C1233m c1233m) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jM3986L = m3986L(i13) & 1048575;
        Object objM3883h = AbstractC1235m1.f5433c.m3883h(jM3986L, obj);
        C1234m0 c1234m0 = this.f5467m;
        if (objM3883h == null) {
            c1234m0.getClass();
            objM3883h = C1231l0.f5424x.m3878b();
            AbstractC1235m1.m3929o(jM3986L, obj, objM3883h);
        } else {
            c1234m0.getClass();
            if (!((C1231l0) objM3883h).f5425w) {
                C1231l0 c1231l0M3878b = C1231l0.f5424x.m3878b();
                C1234m0.m3914a(c1231l0M3878b, objM3883h);
                AbstractC1235m1.m3929o(jM3986L, obj, c1231l0M3878b);
                objM3883h = c1231l0M3878b;
            }
        }
        c1234m0.getClass();
        C1231l0 c1231l0 = (C1231l0) objM3883h;
        C0237p c0237p = ((C1228k0) obj2).f5420a;
        c1233m.m3912w(2);
        AbstractC1230l abstractC1230l = c1233m.f5427a;
        int iMo3838l = abstractC1230l.mo3838l(abstractC1230l.mo3824E());
        Object obj3 = c0237p.f814z;
        Object objM3898i = "";
        Object objM3898i2 = obj3;
        while (true) {
            try {
                int iM3890a = c1233m.m3890a();
                if (iM3890a == Integer.MAX_VALUE || abstractC1230l.mo3836e()) {
                    break;
                }
                if (iM3890a == 1) {
                    objM3898i = c1233m.m3898i((EnumC1259u1) c0237p.f812x, null, null);
                } else if (iM3890a != 2) {
                    try {
                        if (!c1233m.m3913x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!c1233m.m3913x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM3898i2 = c1233m.m3898i((EnumC1259u1) c0237p.f813y, obj3.getClass(), c1245q);
                }
            } catch (Throwable th3) {
                abstractC1230l.mo3837k(iMo3838l);
                throw th3;
            }
        }
        c1231l0.put(objM3898i, objM3898i2);
        abstractC1230l.mo3837k(iMo3838l);
    }

    /* JADX INFO: renamed from: s */
    public final void m4005s(int i13, Object obj, Object obj2) {
        if (m4001n(i13, obj2)) {
            long jM3986L = m3986L(i13) & 1048575;
            Unsafe unsafe = f5454o;
            Object object = unsafe.getObject(obj2, jM3986L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5455a[i13] + " is present but null: " + obj2);
            }
            InterfaceC1270z0 interfaceC1270z0M4000m = m4000m(i13);
            if (!m4001n(i13, obj)) {
                if (m3972p(object)) {
                    AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0M4000m.mo3991d();
                    interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d, object);
                    unsafe.putObject(obj, jM3986L, abstractC1269zMo3991d);
                } else {
                    unsafe.putObject(obj, jM3986L, object);
                }
                m3982G(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM3986L);
            if (!m3972p(object2)) {
                AbstractC1269z abstractC1269zMo3991d2 = interfaceC1270z0M4000m.mo3991d();
                interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d2, object2);
                unsafe.putObject(obj, jM3986L, abstractC1269zMo3991d2);
                object2 = abstractC1269zMo3991d2;
            }
            interfaceC1270z0M4000m.mo3988a(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4006t(int i13, Object obj, Object obj2) {
        int[] iArr = this.f5455a;
        int i14 = iArr[i13];
        if (m4003q(i14, i13, obj2)) {
            long jM3986L = m3986L(i13) & 1048575;
            Unsafe unsafe = f5454o;
            Object object = unsafe.getObject(obj2, jM3986L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            InterfaceC1270z0 interfaceC1270z0M4000m = m4000m(i13);
            if (!m4003q(i14, i13, obj)) {
                if (m3972p(object)) {
                    AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0M4000m.mo3991d();
                    interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d, object);
                    unsafe.putObject(obj, jM3986L, abstractC1269zMo3991d);
                } else {
                    unsafe.putObject(obj, jM3986L, object);
                }
                m3983H(i14, i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM3986L);
            if (!m3972p(object2)) {
                AbstractC1269z abstractC1269zMo3991d2 = interfaceC1270z0M4000m.mo3991d();
                interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d2, object2);
                unsafe.putObject(obj, jM3986L, abstractC1269zMo3991d2);
                object2 = abstractC1269zMo3991d2;
            }
            interfaceC1270z0M4000m.mo3988a(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m4007u(int i13, Object obj) {
        InterfaceC1270z0 interfaceC1270z0M4000m = m4000m(i13);
        long jM3986L = m3986L(i13) & 1048575;
        if (!m4001n(i13, obj)) {
            return interfaceC1270z0M4000m.mo3991d();
        }
        Object object = f5454o.getObject(obj, jM3986L);
        if (m3972p(object)) {
            return object;
        }
        AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0M4000m.mo3991d();
        if (object != null) {
            interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d, object);
        }
        return abstractC1269zMo3991d;
    }

    /* JADX INFO: renamed from: v */
    public final Object m4008v(int i13, int i14, Object obj) {
        InterfaceC1270z0 interfaceC1270z0M4000m = m4000m(i14);
        if (!m4003q(i13, i14, obj)) {
            return interfaceC1270z0M4000m.mo3991d();
        }
        Object object = f5454o.getObject(obj, m3986L(i14) & 1048575);
        if (m3972p(object)) {
            return object;
        }
        AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0M4000m.mo3991d();
        if (object != null) {
            interfaceC1270z0M4000m.mo3988a(abstractC1269zMo3991d, object);
        }
        return abstractC1269zMo3991d;
    }
}
