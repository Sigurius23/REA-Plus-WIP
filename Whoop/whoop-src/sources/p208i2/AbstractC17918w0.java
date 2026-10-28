package p208i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import e93.AbstractC12889b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.AbstractC2378g1;
import p079d2.AbstractC11480b;
import p181h2.C16618c;
import p181h2.C16619d;
import p240j2.AbstractC21221b;
import p240j2.AbstractC21222c;
import p240j2.C21223d;
import p240j2.C21231l;
import p240j2.C21232m;
import p240j2.C21235p;
import p240j2.C21236q;
import p240j2.C21237r;
import p270k2.C22134h;
import p270k2.InterfaceC22131e;
import p636y3.C39179k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17918w0 {

    /* JADX INFO: renamed from: a */
    public static final C17916v0 f69621a = new C17916v0();

    /* JADX INFO: renamed from: b */
    public static Method f69622b;

    /* JADX INFO: renamed from: c */
    public static Method f69623c;

    /* JADX INFO: renamed from: d */
    public static boolean f69624d;

    /* JADX INFO: renamed from: A */
    public static final void m51499A(Matrix matrix, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[12];
        float f27 = fArr[13];
        float f28 = fArr[15];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f26;
        fArr[3] = f14;
        fArr[4] = f18;
        fArr[5] = f27;
        fArr[6] = f16;
        fArr[7] = f24;
        fArr[8] = f28;
        matrix.setValues(fArr);
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[3] = f16;
        fArr[4] = f17;
        fArr[5] = f18;
        fArr[6] = f19;
        fArr[7] = f24;
        fArr[8] = f25;
    }

    /* JADX INFO: renamed from: B */
    public static final void m51500B(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        fArr[0] = f13;
        fArr[1] = f16;
        fArr[2] = 0.0f;
        fArr[3] = f19;
        fArr[4] = f14;
        fArr[5] = f17;
        fArr[6] = 0.0f;
        fArr[7] = f24;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f15;
        fArr[13] = f18;
        fArr[14] = 0.0f;
        fArr[15] = f25;
    }

    /* JADX INFO: renamed from: C */
    public static final long m51501C(C16618c c16618c) {
        float f13 = c16618c.f63941c - c16618c.f63939a;
        return (((long) Float.floatToRawIntBits(c16618c.f63942d - c16618c.f63940b)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: D */
    public static final Rect m51502D(C16618c c16618c) {
        return new Rect((int) c16618c.f63939a, (int) c16618c.f63940b, (int) c16618c.f63941c, (int) c16618c.f63942d);
    }

    /* JADX INFO: renamed from: E */
    public static final Rect m51503E(C39179k c39179k) {
        return new Rect(c39179k.f168418a, c39179k.f168419b, c39179k.f168420c, c39179k.f168421d);
    }

    /* JADX INFO: renamed from: F */
    public static final RectF m51504F(C16618c c16618c) {
        return new RectF(c16618c.f63939a, c16618c.f63940b, c16618c.f63941c, c16618c.f63942d);
    }

    /* JADX INFO: renamed from: G */
    public static final Shader.TileMode m51505G(int i13) {
        if (i13 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i13 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i13 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i13 == 3 && Build.VERSION.SDK_INT >= 31) {
            return AbstractC11480b.m30884j();
        }
        return Shader.TileMode.CLAMP;
    }

    /* JADX INFO: renamed from: H */
    public static final int m51506H(long j7) {
        float[] fArr = C21223d.f81019a;
        return (int) (C17919x.m51540b(j7, C21223d.f81023e) >>> 32);
    }

    /* JADX INFO: renamed from: I */
    public static final Bitmap.Config m51507I(int i13) {
        if (i13 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i13 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i13 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i13 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i13 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: J */
    public static final C16618c m51508J(Rect rect) {
        return new C16618c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: K */
    public static final C16618c m51509K(RectF rectF) {
        return new C16618c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: L */
    public static String m51510L(int i13) {
        if (i13 == 0) {
            return "Clamp";
        }
        if (i13 == 1) {
            return "Repeated";
        }
        if (i13 == 2) {
            return "Mirror";
        }
        return i13 == 3 ? "Decal" : "Unknown";
    }

    /* JADX INFO: renamed from: M */
    public static final void m51511M(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX INFO: renamed from: N */
    public static final int m51512N(float[] fArr, int i13, float f13) {
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (Math.abs(f14 - f13) > 1.05E-6f) {
            f14 = Float.NaN;
        }
        fArr[i13] = f14;
        return !Float.isNaN(f14) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static final C17873c m51513a(C17885g c17885g) {
        Canvas canvas = AbstractC17876d.f69560a;
        C17873c c17873c = new C17873c();
        c17873c.f69556a = new Canvas(m51527o(c17885g));
        return c17873c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    /* JADX INFO: renamed from: b */
    public static final long m51514b(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c) {
        int i13;
        int i14;
        int i15;
        float fMo59543b;
        float fMo59542a;
        int iFloatToRawIntBits;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        float fMo59543b2;
        float fMo59542a2;
        int iFloatToRawIntBits2;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        float f17;
        if (abstractC21222c.mo59544c()) {
            float f18 = f16 < 0.0f ? 0.0f : f16;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            int i44 = ((int) ((f18 * 255.0f) + 0.5f)) << 24;
            float f19 = f13 < 0.0f ? 0.0f : f13;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            int i45 = i44 | (((int) ((f19 * 255.0f) + 0.5f)) << 16);
            float f24 = f14 < 0.0f ? 0.0f : f14;
            if (f24 > 1.0f) {
                f24 = 1.0f;
            }
            int i46 = i45 | (((int) ((f24 * 255.0f) + 0.5f)) << 8);
            f17 = f15 >= 0.0f ? f15 : 0.0f;
            long j7 = ((long) (i46 | ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i47 = C17919x.f69638o;
            return j7;
        }
        long j13 = abstractC21222c.f81017b;
        int i48 = AbstractC21221b.f81015e;
        if (((int) (j13 >> 32)) != 3) {
            AbstractC17892j0.m51467a("Color only works with ColorSpaces with 3 components");
        }
        int i49 = abstractC21222c.f81018c;
        if (i49 == -1) {
            AbstractC17892j0.m51467a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i54 = 0;
        float fMo59543b3 = abstractC21222c.mo59543b(0);
        float fMo59542a3 = abstractC21222c.mo59542a(0);
        if (f13 >= fMo59543b3) {
            fMo59543b3 = f13;
        }
        if (fMo59543b3 <= fMo59542a3) {
            fMo59542a3 = fMo59543b3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo59542a3);
        int i55 = iFloatToRawIntBits3 >>> 31;
        int i56 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i57 = iFloatToRawIntBits3 & 8388607;
        if (i56 == 255) {
            i14 = i57 != 0 ? 512 : 0;
            i13 = 31;
        } else {
            i13 = i56 - 112;
            if (i13 >= 31) {
                i14 = 0;
                i13 = 49;
            } else {
                if (i13 > 0) {
                    int i58 = i57 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i15 = (((i13 << 10) | i58) + 1) | (i55 << 15);
                    } else {
                        i14 = i58;
                    }
                    short s13 = (short) i15;
                    fMo59543b = abstractC21222c.mo59543b(1);
                    fMo59542a = abstractC21222c.mo59542a(1);
                    if (f14 >= fMo59543b) {
                        fMo59543b = f14;
                    }
                    if (fMo59543b <= fMo59542a) {
                        fMo59542a = fMo59543b;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMo59542a);
                    i16 = iFloatToRawIntBits >>> 31;
                    i17 = (iFloatToRawIntBits >>> 23) & 255;
                    i18 = iFloatToRawIntBits & 8388607;
                    if (i17 == 255) {
                        if (i18 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i19 = 31;
                    } else {
                        i19 = i17 - 112;
                        if (i19 >= 31) {
                            i25 = 0;
                            i19 = 49;
                        } else {
                            if (i19 <= 0) {
                                i24 = i18 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i26 = (((i19 << 10) | i24) + 1) | (i16 << 15);
                                } else {
                                    i25 = i24;
                                }
                                short s14 = (short) i26;
                                fMo59543b2 = abstractC21222c.mo59543b(2);
                                fMo59542a2 = abstractC21222c.mo59542a(2);
                                if (f15 >= fMo59543b2) {
                                    fMo59543b2 = f15;
                                }
                                if (fMo59543b2 <= fMo59542a2) {
                                    fMo59542a2 = fMo59543b2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo59542a2);
                                i28 = iFloatToRawIntBits2 >>> 31;
                                i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i34 = 8388607 & iFloatToRawIntBits2;
                                if (i29 == 255) {
                                    i37 = i34 != 0 ? 512 : 0;
                                    i54 = 31;
                                } else {
                                    i35 = i29 - 112;
                                    if (i35 >= 31) {
                                        i37 = 0;
                                        i54 = 49;
                                    } else {
                                        if (i35 <= 0) {
                                            i36 = i34 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i38 = (((i35 << 10) | i36) + 1) | (i28 << 15);
                                            } else {
                                                i37 = i36;
                                                i54 = i35;
                                            }
                                            short s15 = (short) i38;
                                            f17 = f16 >= 0.0f ? f16 : 0.0f;
                                            long j14 = (((long) i49) & 63) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i59 = C17919x.f69638o;
                                            return j14;
                                        }
                                        if (i35 >= -10) {
                                            i39 = (i34 | 8388608) >> (1 - i35);
                                            if ((i39 & 4096) != 0) {
                                                i39 += DfuBaseService.ERROR_REMOTE_MASK;
                                            }
                                            i37 = i39 >> 13;
                                        } else {
                                            i37 = 0;
                                        }
                                    }
                                }
                                i38 = i37 | (i28 << 15) | (i54 << 10);
                                short s16 = (short) i38;
                                if (f16 >= 0.0f) {
                                }
                                long j15 = (((long) i49) & 63) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i510 = C17919x.f69638o;
                                return j15;
                            }
                            if (i19 >= -10) {
                                i27 = (i18 | 8388608) >> (1 - i19);
                                if ((i27 & 4096) != 0) {
                                    i27 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i25 = i27 >> 13;
                                i19 = 0;
                            } else {
                                i25 = 0;
                                i19 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i16 << 15) | (i19 << 10);
                    short s17 = (short) i26;
                    fMo59543b2 = abstractC21222c.mo59543b(2);
                    fMo59542a2 = abstractC21222c.mo59542a(2);
                    if (f15 >= fMo59543b2) {
                        fMo59543b2 = f15;
                    }
                    if (fMo59543b2 <= fMo59542a2) {
                        fMo59542a2 = fMo59543b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo59542a2);
                    i28 = iFloatToRawIntBits2 >>> 31;
                    i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i29 == 255) {
                        i37 = i34 != 0 ? 512 : 0;
                        i54 = 31;
                    } else {
                        i35 = i29 - 112;
                        if (i35 >= 31) {
                            i37 = 0;
                            i54 = 49;
                        } else {
                            if (i35 <= 0) {
                                i36 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i38 = (((i35 << 10) | i36) + 1) | (i28 << 15);
                                } else {
                                    i37 = i36;
                                    i54 = i35;
                                }
                                short s18 = (short) i38;
                                if (f16 >= 0.0f) {
                                }
                                long j16 = (((long) i49) & 63) | ((((long) s13) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s18)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i511 = C17919x.f69638o;
                                return j16;
                            }
                            if (i35 >= -10) {
                                i39 = (i34 | 8388608) >> (1 - i35);
                                if ((i39 & 4096) != 0) {
                                    i39 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i37 = i39 >> 13;
                            } else {
                                i37 = 0;
                            }
                        }
                    }
                    i38 = i37 | (i28 << 15) | (i54 << 10);
                    short s19 = (short) i38;
                    if (f16 >= 0.0f) {
                    }
                    long j17 = (((long) i49) & 63) | ((((long) s13) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i512 = C17919x.f69638o;
                    return j17;
                }
                if (i13 >= -10) {
                    int i64 = (i57 | 8388608) >> (1 - i13);
                    if ((i64 & 4096) != 0) {
                        i64 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i14 = i64 >> 13;
                    i13 = 0;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
            }
        }
        i15 = i14 | (i55 << 15) | (i13 << 10);
        short s110 = (short) i15;
        fMo59543b = abstractC21222c.mo59543b(1);
        fMo59542a = abstractC21222c.mo59542a(1);
        if (f14 >= fMo59543b) {
            fMo59543b = f14;
        }
        if (fMo59543b <= fMo59542a) {
            fMo59542a = fMo59543b;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMo59542a);
        i16 = iFloatToRawIntBits >>> 31;
        i17 = (iFloatToRawIntBits >>> 23) & 255;
        i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            if (i18 != 0) {
                i25 = 512;
            } else {
                i25 = 0;
            }
            i19 = 31;
        } else {
            i19 = i17 - 112;
            if (i19 >= 31) {
                i25 = 0;
                i19 = 49;
            } else {
                if (i19 <= 0) {
                    i24 = i18 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i26 = (((i19 << 10) | i24) + 1) | (i16 << 15);
                    } else {
                        i25 = i24;
                    }
                    short s111 = (short) i26;
                    fMo59543b2 = abstractC21222c.mo59543b(2);
                    fMo59542a2 = abstractC21222c.mo59542a(2);
                    if (f15 >= fMo59543b2) {
                        fMo59543b2 = f15;
                    }
                    if (fMo59543b2 <= fMo59542a2) {
                        fMo59542a2 = fMo59543b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo59542a2);
                    i28 = iFloatToRawIntBits2 >>> 31;
                    i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i29 == 255) {
                        i37 = i34 != 0 ? 512 : 0;
                        i54 = 31;
                    } else {
                        i35 = i29 - 112;
                        if (i35 >= 31) {
                            i37 = 0;
                            i54 = 49;
                        } else {
                            if (i35 <= 0) {
                                i36 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i38 = (((i35 << 10) | i36) + 1) | (i28 << 15);
                                } else {
                                    i37 = i36;
                                    i54 = i35;
                                }
                                short s112 = (short) i38;
                                if (f16 >= 0.0f) {
                                }
                                long j18 = (((long) i49) & 63) | ((((long) s110) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i513 = C17919x.f69638o;
                                return j18;
                            }
                            if (i35 >= -10) {
                                i39 = (i34 | 8388608) >> (1 - i35);
                                if ((i39 & 4096) != 0) {
                                    i39 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i37 = i39 >> 13;
                            } else {
                                i37 = 0;
                            }
                        }
                    }
                    i38 = i37 | (i28 << 15) | (i54 << 10);
                    short s113 = (short) i38;
                    if (f16 >= 0.0f) {
                    }
                    long j19 = (((long) i49) & 63) | ((((long) s110) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i514 = C17919x.f69638o;
                    return j19;
                }
                if (i19 >= -10) {
                    i27 = (i18 | 8388608) >> (1 - i19);
                    if ((i27 & 4096) != 0) {
                        i27 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i25 = i27 >> 13;
                    i19 = 0;
                } else {
                    i25 = 0;
                    i19 = 0;
                }
            }
        }
        i26 = i25 | (i16 << 15) | (i19 << 10);
        short s114 = (short) i26;
        fMo59543b2 = abstractC21222c.mo59543b(2);
        fMo59542a2 = abstractC21222c.mo59542a(2);
        if (f15 >= fMo59543b2) {
            fMo59543b2 = f15;
        }
        if (fMo59543b2 <= fMo59542a2) {
            fMo59542a2 = fMo59543b2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo59542a2);
        i28 = iFloatToRawIntBits2 >>> 31;
        i29 = (iFloatToRawIntBits2 >>> 23) & 255;
        i34 = 8388607 & iFloatToRawIntBits2;
        if (i29 == 255) {
            i37 = i34 != 0 ? 512 : 0;
            i54 = 31;
        } else {
            i35 = i29 - 112;
            if (i35 >= 31) {
                i37 = 0;
                i54 = 49;
            } else {
                if (i35 <= 0) {
                    i36 = i34 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i38 = (((i35 << 10) | i36) + 1) | (i28 << 15);
                    } else {
                        i37 = i36;
                        i54 = i35;
                    }
                    short s115 = (short) i38;
                    if (f16 >= 0.0f) {
                    }
                    long j110 = (((long) i49) & 63) | ((((long) s110) & 65535) << 48) | ((((long) s114) & 65535) << 32) | ((65535 & ((long) s115)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i515 = C17919x.f69638o;
                    return j110;
                }
                if (i35 >= -10) {
                    i39 = (i34 | 8388608) >> (1 - i35);
                    if ((i39 & 4096) != 0) {
                        i39 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i37 = i39 >> 13;
                } else {
                    i37 = 0;
                }
            }
        }
        i38 = i37 | (i28 << 15) | (i54 << 10);
        short s116 = (short) i38;
        if (f16 >= 0.0f) {
        }
        long j111 = (((long) i49) & 63) | ((((long) s110) & 65535) << 48) | ((((long) s114) & 65535) << 32) | ((65535 & ((long) s116)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i516 = C17919x.f69638o;
        return j111;
    }

    /* JADX INFO: renamed from: c */
    public static final long m51515c(int i13) {
        long j7 = ((long) i13) << 32;
        int i14 = C17919x.f69638o;
        return j7;
    }

    /* JADX INFO: renamed from: d */
    public static final long m51516d(int i13, int i14, int i15, int i16) {
        return m51515c(((i13 & 255) << 16) | ((i16 & 255) << 24) | ((i14 & 255) << 8) | (i15 & 255));
    }

    /* JADX INFO: renamed from: e */
    public static final long m51517e(long j7) {
        long j13 = j7 << 32;
        int i13 = C17919x.f69638o;
        return j13;
    }

    /* JADX INFO: renamed from: f */
    public static long m51518f(float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 8) != 0) {
            f16 = 1.0f;
        }
        return m51514b(f13, f14, f15, f16, C21223d.f81023e);
    }

    /* JADX INFO: renamed from: h */
    public static C17885g m51520h(int i13, int i14, int i15) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        C21236q c21236q = C21223d.f81023e;
        m51507I(i15);
        int i16 = Build.VERSION.SDK_INT;
        Bitmap.Config configM51507I = m51507I(i15);
        if (AbstractC22676k.m65745e(c21236q, c21236q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81035q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81036r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81033o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81028j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81027i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81038t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81037s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81029k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81030l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81025g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81026h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81024f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81031m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC22676k.m65745e(c21236q, C21223d.f81034p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC22676k.m65745e(c21236q, C21223d.f81032n)) {
                if (i16 >= 34 && (rgb = AbstractC2378g1.m7337l(c21236q)) != null) {
                    rgb = rgb;
                } else if (c21236q != null) {
                    String str = c21236q.f81016a;
                    float[] fArrM59561a = c21236q.f81071d.m59561a();
                    C21237r c21237r = c21236q.f81074g;
                    ColorSpace.Rgb.TransferParameters transferParameters = c21237r != null ? new ColorSpace.Rgb.TransferParameters(c21237r.f81086b, c21237r.f81087c, c21237r.f81088d, c21237r.f81089e, c21237r.f81090f, c21237r.f81091g, c21237r.f81085a) : null;
                    if (transferParameters != null) {
                        ColorSpace rgb2 = new ColorSpace.Rgb(str, c21236q.f81075h, fArrM59561a, transferParameters);
                        rgb = rgb2;
                    } else {
                        float[] fArr = c21236q.f81075h;
                        final C21235p c21235p = c21236q.f81079l;
                        final int i17 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: i2.b0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d3) {
                                switch (i17) {
                                    case 0:
                                        break;
                                }
                                return ((Number) c21235p.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        };
                        final C21235p c21235p2 = c21236q.f81082o;
                        final int i18 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrM59561a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: i2.b0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d3) {
                                switch (i18) {
                                    case 0:
                                        break;
                                }
                                return ((Number) c21235p2.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        }, c21236q.f81072e, c21236q.f81073f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C17885g(Bitmap.createBitmap((DisplayMetrics) null, i13, i14, configM51507I, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new C17885g(Bitmap.createBitmap((DisplayMetrics) null, i13, i14, configM51507I, true, rgb));
    }

    /* JADX INFO: renamed from: i */
    public static final LinearGradient m51521i(long j7, long j13, List list, List list2, int i13) {
        m51511M(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), m51537y(list), m51538z(list2, list), m51505G(i13));
    }

    /* JADX INFO: renamed from: j */
    public static final C17887h m51522j() {
        return new C17887h(new Paint(7));
    }

    /* JADX INFO: renamed from: k */
    public static final RadialGradient m51523k(long j7, float f13, List list, List list2, int i13) {
        m51511M(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f13, m51537y(list), m51538z(list2, list), m51505G(i13));
    }

    /* JADX INFO: renamed from: l */
    public static final long m51524l(float f13, float f14) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        int i13 = C17881e1.f69567c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX INFO: renamed from: m */
    public static final long m51525m(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c) {
        int i13;
        int i14;
        int i15;
        int iFloatToRawIntBits;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int iFloatToRawIntBits2;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        if (abstractC21222c.mo59544c()) {
            long j7 = ((long) ((((((int) ((f16 * 255.0f) + 0.5f)) << 24) | (((int) ((f13 * 255.0f) + 0.5f)) << 16)) | (((int) ((f14 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f15) + 0.5f)))) << 32;
            int i38 = C17919x.f69638o;
            return j7;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f13);
        int i39 = iFloatToRawIntBits3 >>> 31;
        int i44 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i45 = iFloatToRawIntBits3 & 8388607;
        int i46 = 49;
        int i47 = 0;
        if (i44 == 255) {
            i14 = i45 != 0 ? 512 : 0;
            i13 = 31;
        } else {
            i13 = i44 - 112;
            if (i13 >= 31) {
                i13 = 49;
                i14 = 0;
            } else {
                if (i13 > 0) {
                    int i48 = i45 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i15 = (((i13 << 10) | i48) + 1) | (i39 << 15);
                    } else {
                        i14 = i48;
                    }
                    short s13 = (short) i15;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f14);
                    i16 = iFloatToRawIntBits >>> 31;
                    i17 = (iFloatToRawIntBits >>> 23) & 255;
                    i18 = iFloatToRawIntBits & 8388607;
                    if (i17 == 255) {
                        if (i18 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i19 = 31;
                    } else {
                        i19 = i17 - 112;
                        if (i19 >= 31) {
                            i19 = 49;
                            i25 = 0;
                        } else {
                            if (i19 <= 0) {
                                i24 = i18 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i26 = (((i19 << 10) | i24) + 1) | (i16 << 15);
                                } else {
                                    i25 = i24;
                                }
                                short s14 = (short) i26;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                                i28 = iFloatToRawIntBits2 >>> 31;
                                i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i34 = 8388607 & iFloatToRawIntBits2;
                                if (i29 == 255) {
                                    i35 = i29 - 112;
                                    if (i35 < 31) {
                                        if (i35 <= 0) {
                                            i47 = i34 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i36 = (((i35 << 10) | i47) + 1) | (i28 << 15);
                                            } else {
                                                i46 = i35;
                                            }
                                        } else if (i35 >= -10) {
                                            i37 = (i34 | 8388608) >> (1 - i35);
                                            if ((i37 & 4096) != 0) {
                                                i37 += DfuBaseService.ERROR_REMOTE_MASK;
                                            }
                                            i46 = 0;
                                            i47 = i37 >> 13;
                                        } else {
                                            i46 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                                    int i49 = C17919x.f69638o;
                                    return jMax;
                                }
                                i47 = i34 == 0 ? 0 : 512;
                                i46 = 31;
                                i36 = (i28 << 15) | (i46 << 10) | i47;
                                long jMax2 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                                int i410 = C17919x.f69638o;
                                return jMax2;
                            }
                            if (i19 >= -10) {
                                i27 = (i18 | 8388608) >> (1 - i19);
                                if ((i27 & 4096) != 0) {
                                    i27 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i25 = i27 >> 13;
                                i19 = 0;
                            } else {
                                i25 = 0;
                                i19 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i16 << 15) | (i19 << 10);
                    short s15 = (short) i26;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                    i28 = iFloatToRawIntBits2 >>> 31;
                    i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i29 == 255) {
                        i35 = i29 - 112;
                        if (i35 < 31) {
                            if (i35 <= 0) {
                                i47 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i35 << 10) | i47) + 1) | (i28 << 15);
                                } else {
                                    i46 = i35;
                                }
                            } else if (i35 >= -10) {
                                i37 = (i34 | 8388608) >> (1 - i35);
                                if ((i37 & 4096) != 0) {
                                    i37 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i46 = 0;
                                i47 = i37 >> 13;
                            } else {
                                i46 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                        int i411 = C17919x.f69638o;
                        return jMax3;
                    }
                    i47 = i34 == 0 ? 0 : 512;
                    i46 = 31;
                    i36 = (i28 << 15) | (i46 << 10) | i47;
                    long jMax4 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                    int i412 = C17919x.f69638o;
                    return jMax4;
                }
                if (i13 >= -10) {
                    int i54 = (i45 | 8388608) >> (1 - i13);
                    if ((i54 & 4096) != 0) {
                        i54 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i14 = i54 >> 13;
                    i13 = 0;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
            }
        }
        i15 = i14 | (i39 << 15) | (i13 << 10);
        short s16 = (short) i15;
        iFloatToRawIntBits = Float.floatToRawIntBits(f14);
        i16 = iFloatToRawIntBits >>> 31;
        i17 = (iFloatToRawIntBits >>> 23) & 255;
        i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            if (i18 != 0) {
                i25 = 512;
            } else {
                i25 = 0;
            }
            i19 = 31;
        } else {
            i19 = i17 - 112;
            if (i19 >= 31) {
                i19 = 49;
                i25 = 0;
            } else {
                if (i19 <= 0) {
                    i24 = i18 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i26 = (((i19 << 10) | i24) + 1) | (i16 << 15);
                    } else {
                        i25 = i24;
                    }
                    short s17 = (short) i26;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                    i28 = iFloatToRawIntBits2 >>> 31;
                    i29 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i29 == 255) {
                        i35 = i29 - 112;
                        if (i35 < 31) {
                            if (i35 <= 0) {
                                i47 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i35 << 10) | i47) + 1) | (i28 << 15);
                                } else {
                                    i46 = i35;
                                }
                            } else if (i35 >= -10) {
                                i37 = (i34 | 8388608) >> (1 - i35);
                                if ((i37 & 4096) != 0) {
                                    i37 += DfuBaseService.ERROR_REMOTE_MASK;
                                }
                                i46 = 0;
                                i47 = i37 >> 13;
                            } else {
                                i46 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                        int i413 = C17919x.f69638o;
                        return jMax5;
                    }
                    i47 = i34 == 0 ? 0 : 512;
                    i46 = 31;
                    i36 = (i28 << 15) | (i46 << 10) | i47;
                    long jMax6 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
                    int i414 = C17919x.f69638o;
                    return jMax6;
                }
                if (i19 >= -10) {
                    i27 = (i18 | 8388608) >> (1 - i19);
                    if ((i27 & 4096) != 0) {
                        i27 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i25 = i27 >> 13;
                    i19 = 0;
                } else {
                    i25 = 0;
                    i19 = 0;
                }
            }
        }
        i26 = i25 | (i16 << 15) | (i19 << 10);
        short s18 = (short) i26;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
        i28 = iFloatToRawIntBits2 >>> 31;
        i29 = (iFloatToRawIntBits2 >>> 23) & 255;
        i34 = 8388607 & iFloatToRawIntBits2;
        if (i29 == 255) {
            i35 = i29 - 112;
            if (i35 < 31) {
                if (i35 <= 0) {
                    i47 = i34 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i36 = (((i35 << 10) | i47) + 1) | (i28 << 15);
                    } else {
                        i46 = i35;
                    }
                } else if (i35 >= -10) {
                    i37 = (i34 | 8388608) >> (1 - i35);
                    if ((i37 & 4096) != 0) {
                        i37 += DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i46 = 0;
                    i47 = i37 >> 13;
                } else {
                    i46 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s16) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
            int i415 = C17919x.f69638o;
            return jMax7;
        }
        i47 = i34 == 0 ? 0 : 512;
        i46 = 31;
        i36 = (i28 << 15) | (i46 << 10) | i47;
        long jMax8 = ((((long) ((short) i36)) & 65535) << 16) | ((((long) s16) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC21222c.f81018c) & 63);
        int i416 = C17919x.f69638o;
        return jMax8;
    }

    /* JADX INFO: renamed from: n */
    public static final void m51526n(C17891j c17891j, AbstractC17904p0 abstractC17904p0) {
        if (abstractC17904p0 instanceof C17900n0) {
            InterfaceC17910s0.m51495a(c17891j, ((C17900n0) abstractC17904p0).f69601a);
        } else if (abstractC17904p0 instanceof C17902o0) {
            InterfaceC17910s0.m51496b(c17891j, ((C17902o0) abstractC17904p0).f69602a);
        } else {
            if (!(abstractC17904p0 instanceof C17898m0)) {
                throw new NoWhenBranchMatchedException();
            }
            c17891j.m51457d(((C17898m0) abstractC17904p0).f69599a, 0L);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Bitmap m51527o(C17885g c17885g) {
        if (c17885g instanceof C17885g) {
            return c17885g.f69577a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: p */
    public static final long m51528p(long j7, long j13) {
        float f13;
        float f14;
        long jM51540b = C17919x.m51540b(j7, C17919x.m51545g(j13));
        float fM51543e = C17919x.m51543e(j13);
        float fM51543e2 = C17919x.m51543e(jM51540b);
        float f15 = 1.0f - fM51543e2;
        float f16 = (fM51543e * f15) + fM51543e2;
        float fM51547i = C17919x.m51547i(jM51540b);
        float fM51547i2 = C17919x.m51547i(j13);
        float f17 = 0.0f;
        if (f16 == 0.0f) {
            f13 = 0.0f;
        } else {
            f13 = (((fM51547i2 * fM51543e) * f15) + (fM51547i * fM51543e2)) / f16;
        }
        float fM51546h = C17919x.m51546h(jM51540b);
        float fM51546h2 = C17919x.m51546h(j13);
        if (f16 == 0.0f) {
            f14 = 0.0f;
        } else {
            f14 = (((fM51546h2 * fM51543e) * f15) + (fM51546h * fM51543e2)) / f16;
        }
        float fM51544f = C17919x.m51544f(jM51540b);
        float fM51544f2 = C17919x.m51544f(j13);
        if (f16 != 0.0f) {
            f17 = (((fM51544f2 * fM51543e) * f15) + (fM51544f * fM51543e2)) / f16;
        }
        return m51525m(f13, f14, f17, f16, C17919x.m51545g(j13));
    }

    /* JADX INFO: renamed from: q */
    public static void m51529q(InterfaceC22131e interfaceC22131e, AbstractC17904p0 abstractC17904p0, long j7) {
        if (abstractC17904p0 instanceof C17900n0) {
            C16618c c16618c = ((C17900n0) abstractC17904p0).f69601a;
            float f13 = c16618c.f63939a;
            interfaceC22131e.mo741n0(j7, (((long) Float.floatToRawIntBits(c16618c.f63940b)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), m51501C(c16618c), 1.0f, null, 3);
            return;
        }
        boolean z4 = abstractC17904p0 instanceof C17902o0;
        C22134h c22134h = C22134h.f85857a;
        if (!z4) {
            if (!(abstractC17904p0 instanceof C17898m0)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC22131e.mo723E0(((C17898m0) abstractC17904p0).f69599a, j7, 1.0f, c22134h);
            return;
        }
        C17902o0 c17902o0 = (C17902o0) abstractC17904p0;
        C17891j c17891j = c17902o0.f69603b;
        if (c17891j != null) {
            interfaceC22131e.mo723E0(c17891j, j7, 1.0f, c22134h);
            return;
        }
        C16619d c16619d = c17902o0.f69602a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c16619d.f63950h >> 32));
        float f14 = c16619d.f63943a;
        interfaceC22131e.mo749z0(j7, (((long) Float.floatToRawIntBits(c16619d.f63944b)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (((long) Float.floatToRawIntBits(c16619d.m47208b())) << 32) | (((long) Float.floatToRawIntBits(c16619d.m47207a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c22134h, 1.0f, 3);
    }

    /* JADX INFO: renamed from: r */
    public static void m51530r(Canvas canvas, boolean z4) {
        Method method;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            AbstractC17870b.m51406a(canvas, z4);
            return;
        }
        if (!f69624d) {
            try {
                if (i13 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f69622b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f69623c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f69622b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f69623c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f69622b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f69623c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f69624d = true;
        }
        if (z4) {
            try {
                Method method4 = f69622b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z4 || (method = f69623c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: s */
    public static long m51531s() {
        return C17919x.f69625b;
    }

    /* JADX INFO: renamed from: t */
    public static long m51532t() {
        return C17919x.f69636m;
    }

    /* JADX INFO: renamed from: u */
    public static long m51533u() {
        return C17919x.f69637n;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m51534v(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: w */
    public static final long m51535w(long j7, long j13, float f13) {
        C21231l c21231l = C21223d.f81042x;
        long jM51540b = C17919x.m51540b(j7, c21231l);
        long jM51540b2 = C17919x.m51540b(j13, c21231l);
        float fM51543e = C17919x.m51543e(jM51540b);
        float fM51547i = C17919x.m51547i(jM51540b);
        float fM51546h = C17919x.m51546h(jM51540b);
        float fM51544f = C17919x.m51544f(jM51540b);
        float fM51543e2 = C17919x.m51543e(jM51540b2);
        float fM51547i2 = C17919x.m51547i(jM51540b2);
        float fM51546h2 = C17919x.m51546h(jM51540b2);
        float fM51544f2 = C17919x.m51544f(jM51540b2);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return C17919x.m51540b(m51525m(AbstractC12889b.m36249O(fM51547i, fM51547i2, f13), AbstractC12889b.m36249O(fM51546h, fM51546h2, f13), AbstractC12889b.m36249O(fM51544f, fM51544f2, f13), AbstractC12889b.m36249O(fM51543e, fM51543e2, f13), c21231l), C17919x.m51545g(j13));
    }

    /* JADX INFO: renamed from: x */
    public static final float m51536x(long j7) {
        AbstractC21222c abstractC21222cM51545g = C17919x.m51545g(j7);
        if (!AbstractC21221b.m59540a(abstractC21222cM51545g.f81017b, AbstractC21221b.f81011a)) {
            AbstractC17892j0.m51467a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC21221b.m59541b(abstractC21222cM51545g.f81017b)));
        }
        C21232m c21232m = ((C21236q) abstractC21222cM51545g).f81083p;
        double dMo56647i = c21232m.mo56647i(C17919x.m51547i(j7));
        float fMo56647i = (float) ((c21232m.mo56647i(C17919x.m51544f(j7)) * 0.0722d) + (c21232m.mo56647i(C17919x.m51546h(j7)) * 0.7152d) + (dMo56647i * 0.2126d));
        if (fMo56647i < 0.0f) {
            fMo56647i = 0.0f;
        }
        if (fMo56647i > 1.0f) {
            return 1.0f;
        }
        return fMo56647i;
    }

    /* JADX INFO: renamed from: y */
    public static final int[] m51537y(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = m51506H(((C17919x) list.get(i13)).f69639a);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: z */
    public static final float[] m51538z(List list, List list2) {
        if (list != null) {
            return AbstractC25265s.m74089B1(list);
        }
        return null;
    }
}
