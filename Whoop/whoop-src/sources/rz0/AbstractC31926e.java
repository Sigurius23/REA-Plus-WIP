package rz0;

import android.graphics.DashPathEffect;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bp0.C3520h;
import c93.InterfaceC4351m;
import e61.C12769l;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import j93.AbstractC21478l0;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import oq1.C28119c;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p134f2.C14015d;
import p134f2.C14018g;
import p180h0.C16367b4;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17893k;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rz0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001ai\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a%\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lrz0/f;", "style", "Li2/x;", "backgroundColor", "Lt0/i;", "shape", "Lf0/t;", "border", "Lrz0/a;", "dashedEffect", "Ly3/f;", "elevation", "Lkotlin/Function0;", "Ll83/a0;", "cardContent", "j", "(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V", "m", "(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;)Landroidx/compose/ui/Modifier;", "s", "(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;", "o", "n", "(Landroidx/compose/ui/Modifier;Lrz0/a;J)Landroidx/compose/ui/Modifier;", "strokeWidth", "color", "cornerRadiusDp", "u", "(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;", "a", "F", "LEADING_ACCENT_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31926e {

    /* JADX INFO: renamed from: a */
    private static final float f132596a = ((float) 0.5d) * 4;

    /* JADX WARN: Code duplicated, block: B:106:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0134  */
    /* JADX WARN: Code duplicated, block: B:112:0x0137  */
    /* JADX WARN: Code duplicated, block: B:115:0x013d  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x015f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX INFO: renamed from: j */
    public static final void m99375j(Modifier modifier, EnumC31927f enumC31927f, long j7, C33252i c33252i, C13825t c13825t, C31922a c31922a, float f13, final InterfaceC4351m cardContent, Composer composer, final int i13, final int i14) {
        int i15;
        long white10;
        C33252i c33252iM64090c;
        C13825t c13825t2;
        int i16;
        C31922a c31922a2;
        int i17;
        int i18;
        float f14;
        int i19;
        boolean z4;
        C28655q c28655q;
        final Modifier modifier2;
        final EnumC31927f enumC31927f2;
        final long j13;
        final C33252i c33252i2;
        final C13825t c13825t3;
        final C31922a c31922a3;
        final float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        EnumC31927f enumC31927f3;
        float f16;
        C13825t c13825t4;
        Modifier modifier4;
        int i24;
        int i25;
        AbstractC22676k.m65750j(cardContent, "cardContent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1600889149);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87149e(enumC31927f == null ? -1 : enumC31927f.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                white10 = j7;
                int i28 = c28655q2.m87151f(white10) ? 256 : 128;
                i15 |= i28;
            } else {
                white10 = j7;
            }
            i15 |= i28;
        } else {
            white10 = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c33252iM64090c = c33252i;
                if (c28655q2.m87153g(c33252iM64090c)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i25;
            } else {
                c33252iM64090c = c33252i;
            }
            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i25;
        } else {
            c33252iM64090c = c33252i;
        }
        int i29 = i14 & 16;
        if (i29 == 0) {
            if ((i13 & 24576) == 0) {
                c13825t2 = c13825t;
                i15 |= c28655q2.m87153g(c13825t2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    c31922a2 = c31922a;
                    if (c28655q2.m87153g(c31922a2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    if ((1572864 & i13) == 0) {
                        f14 = f13;
                        if (c28655q2.m87147d(f14)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(cardContent)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i15 |= i24;
                    }
                    if ((i15 & 4793491) != 4793490) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                            if (i26 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i27 != 0) {
                                enumC31927f3 = null;
                            } else {
                                enumC31927f3 = enumC31927f;
                            }
                            if ((i14 & 4) != 0) {
                                white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                                i15 &= -897;
                            }
                            if ((i14 & 8) != 0) {
                                c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                                i15 &= -7169;
                            }
                            if (i29 != 0) {
                                c13825t2 = null;
                            }
                            if (i16 != 0) {
                                c31922a2 = null;
                            }
                            if (i18 != 0) {
                                f16 = 0;
                            } else {
                                f16 = f14;
                            }
                            c13825t4 = c13825t2;
                            modifier4 = modifier3;
                        } else {
                            c28655q2.m87138X();
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            enumC31927f3 = enumC31927f;
                            c33252iM64090c = c33252iM64090c;
                            f16 = f14;
                            c13825t4 = c13825t2;
                            modifier4 = modifier;
                        }
                        c28655q2.m87175r();
                        final C31922a c31922a4 = c31922a2;
                        final long j14 = white10;
                        final C33252i c33252i3 = c33252iM64090c;
                        final EnumC31927f enumC31927f4 = enumC31927f3;
                        c28655q = c28655q2;
                        float f17 = f16;
                        AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f17, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC31926e.m99376k(enumC31927f4, j14, c33252i3, c31922a4, cardContent, (Composer) obj, iIntValue);
                            }
                        }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                        enumC31927f2 = enumC31927f4;
                        c31922a3 = c31922a4;
                        j13 = white10;
                        modifier2 = modifier4;
                        c33252i2 = c33252iM64090c;
                        c13825t3 = c13825t4;
                        f15 = f17;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        enumC31927f2 = enumC31927f;
                        j13 = white10;
                        c33252i2 = c33252iM64090c;
                        c13825t3 = c13825t2;
                        c31922a3 = c31922a2;
                        f15 = f14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 1572864;
                f14 = f13;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(cardContent)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i15 |= i24;
                }
                if ((i15 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    } else {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    }
                    c28655q2.m87175r();
                    final C31922a c31922a5 = c31922a2;
                    final long j15 = white10;
                    final C33252i c33252i4 = c33252iM64090c;
                    final EnumC31927f enumC31927f5 = enumC31927f3;
                    c28655q = c28655q2;
                    float f18 = f16;
                    AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f18, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99376k(enumC31927f5, j15, c33252i4, c31922a5, cardContent, (Composer) obj, iIntValue);
                        }
                    }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                    enumC31927f2 = enumC31927f5;
                    c31922a3 = c31922a5;
                    j13 = white10;
                    modifier2 = modifier4;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t4;
                    f15 = f18;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC31927f2 = enumC31927f;
                    j13 = white10;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t2;
                    c31922a3 = c31922a2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c31922a2 = c31922a;
            i18 = i14 & 64;
            if (i18 != 0) {
                if ((1572864 & i13) == 0) {
                    f14 = f13;
                    if (c28655q2.m87147d(f14)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(cardContent)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i15 |= i24;
                }
                if ((i15 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    } else {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    }
                    c28655q2.m87175r();
                    final C31922a c31922a6 = c31922a2;
                    final long j16 = white10;
                    final C33252i c33252i5 = c33252iM64090c;
                    final EnumC31927f enumC31927f6 = enumC31927f3;
                    c28655q = c28655q2;
                    float f19 = f16;
                    AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f19, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99376k(enumC31927f6, j16, c33252i5, c31922a6, cardContent, (Composer) obj, iIntValue);
                        }
                    }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                    enumC31927f2 = enumC31927f6;
                    c31922a3 = c31922a6;
                    j13 = white10;
                    modifier2 = modifier4;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t4;
                    f15 = f19;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC31927f2 = enumC31927f;
                    j13 = white10;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t2;
                    c31922a3 = c31922a2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 1572864;
            f14 = f13;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(cardContent)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                } else {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                }
                c28655q2.m87175r();
                final C31922a c31922a7 = c31922a2;
                final long j17 = white10;
                final C33252i c33252i6 = c33252iM64090c;
                final EnumC31927f enumC31927f7 = enumC31927f3;
                c28655q = c28655q2;
                float f110 = f16;
                AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f110, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99376k(enumC31927f7, j17, c33252i6, c31922a7, cardContent, (Composer) obj, iIntValue);
                    }
                }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                enumC31927f2 = enumC31927f7;
                c31922a3 = c31922a7;
                j13 = white10;
                modifier2 = modifier4;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t4;
                f15 = f110;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC31927f2 = enumC31927f;
                j13 = white10;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t2;
                c31922a3 = c31922a2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        c13825t2 = c13825t;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                c31922a2 = c31922a;
                if (c28655q2.m87153g(c31922a2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                if ((1572864 & i13) == 0) {
                    f14 = f13;
                    if (c28655q2.m87147d(f14)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(cardContent)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i15 |= i24;
                }
                if ((i15 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    } else {
                        if (i26 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC31927f3 = null;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if ((i14 & 4) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            c13825t2 = null;
                        }
                        if (i16 != 0) {
                            c31922a2 = null;
                        }
                        if (i18 != 0) {
                            f16 = 0;
                        } else {
                            f16 = f14;
                        }
                        c13825t4 = c13825t2;
                        modifier4 = modifier3;
                    }
                    c28655q2.m87175r();
                    final C31922a c31922a8 = c31922a2;
                    final long j18 = white10;
                    final C33252i c33252i7 = c33252iM64090c;
                    final EnumC31927f enumC31927f8 = enumC31927f3;
                    c28655q = c28655q2;
                    float f111 = f16;
                    AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f111, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99376k(enumC31927f8, j18, c33252i7, c31922a8, cardContent, (Composer) obj, iIntValue);
                        }
                    }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                    enumC31927f2 = enumC31927f8;
                    c31922a3 = c31922a8;
                    j13 = white10;
                    modifier2 = modifier4;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t4;
                    f15 = f111;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC31927f2 = enumC31927f;
                    j13 = white10;
                    c33252i2 = c33252iM64090c;
                    c13825t3 = c13825t2;
                    c31922a3 = c31922a2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 1572864;
            f14 = f13;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(cardContent)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                } else {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                }
                c28655q2.m87175r();
                final C31922a c31922a9 = c31922a2;
                final long j19 = white10;
                final C33252i c33252i8 = c33252iM64090c;
                final EnumC31927f enumC31927f9 = enumC31927f3;
                c28655q = c28655q2;
                float f112 = f16;
                AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f112, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99376k(enumC31927f9, j19, c33252i8, c31922a9, cardContent, (Composer) obj, iIntValue);
                    }
                }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                enumC31927f2 = enumC31927f9;
                c31922a3 = c31922a9;
                j13 = white10;
                modifier2 = modifier4;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t4;
                f15 = f112;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC31927f2 = enumC31927f;
                j13 = white10;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t2;
                c31922a3 = c31922a2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c31922a2 = c31922a;
        i18 = i14 & 64;
        if (i18 != 0) {
            if ((1572864 & i13) == 0) {
                f14 = f13;
                if (c28655q2.m87147d(f14)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(cardContent)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                } else {
                    if (i26 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC31927f3 = null;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if ((i14 & 4) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        c13825t2 = null;
                    }
                    if (i16 != 0) {
                        c31922a2 = null;
                    }
                    if (i18 != 0) {
                        f16 = 0;
                    } else {
                        f16 = f14;
                    }
                    c13825t4 = c13825t2;
                    modifier4 = modifier3;
                }
                c28655q2.m87175r();
                final C31922a c31922a10 = c31922a2;
                final long j110 = white10;
                final C33252i c33252i9 = c33252iM64090c;
                final EnumC31927f enumC31927f10 = enumC31927f3;
                c28655q = c28655q2;
                float f113 = f16;
                AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f113, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99376k(enumC31927f10, j110, c33252i9, c31922a10, cardContent, (Composer) obj, iIntValue);
                    }
                }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
                enumC31927f2 = enumC31927f10;
                c31922a3 = c31922a10;
                j13 = white10;
                modifier2 = modifier4;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t4;
                f15 = f113;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC31927f2 = enumC31927f;
                j13 = white10;
                c33252i2 = c33252iM64090c;
                c13825t3 = c13825t2;
                c31922a3 = c31922a2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 1572864;
        f14 = f13;
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(cardContent)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i15 |= i24;
        }
        if ((i15 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i26 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC31927f3 = null;
                } else {
                    enumC31927f3 = enumC31927f;
                }
                if ((i14 & 4) != 0) {
                    white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                    i15 &= -7169;
                }
                if (i29 != 0) {
                    c13825t2 = null;
                }
                if (i16 != 0) {
                    c31922a2 = null;
                }
                if (i18 != 0) {
                    f16 = 0;
                } else {
                    f16 = f14;
                }
                c13825t4 = c13825t2;
                modifier4 = modifier3;
            } else {
                if (i26 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC31927f3 = null;
                } else {
                    enumC31927f3 = enumC31927f;
                }
                if ((i14 & 4) != 0) {
                    white10 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                    i15 &= -7169;
                }
                if (i29 != 0) {
                    c13825t2 = null;
                }
                if (i16 != 0) {
                    c31922a2 = null;
                }
                if (i18 != 0) {
                    f16 = 0;
                } else {
                    f16 = f14;
                }
                c13825t4 = c13825t2;
                modifier4 = modifier3;
            }
            c28655q2.m87175r();
            final C31922a c31922a11 = c31922a2;
            final long j111 = white10;
            final C33252i c33252i10 = c33252iM64090c;
            final EnumC31927f enumC31927f11 = enumC31927f3;
            c28655q = c28655q2;
            float f114 = f16;
            AbstractC12889b.m36263b(modifier4, c33252iM64090c, C17919x.f69636m, c13825t4, f114, AbstractC37817c.m121344e(-557157018, c28655q2, new InterfaceC4351m() { // from class: rz0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC31926e.m99376k(enumC31927f11, j111, c33252i10, c31922a11, cardContent, (Composer) obj, iIntValue);
                }
            }), c28655q, (i15 & 14) | 1573248 | ((i15 >> 6) & 112) | (57344 & i15) | ((i15 >> 3) & 458752), 8);
            enumC31927f2 = enumC31927f11;
            c31922a3 = c31922a11;
            j13 = white10;
            modifier2 = modifier4;
            c33252i2 = c33252iM64090c;
            c13825t3 = c13825t4;
            f15 = f114;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            enumC31927f2 = enumC31927f;
            j13 = white10;
            c33252i2 = c33252iM64090c;
            c13825t3 = c13825t2;
            c31922a3 = c31922a2;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rz0.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC31926e.m99377l(modifier2, enumC31927f2, j13, c33252i2, c13825t3, c31922a3, f15, cardContent, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99376k(EnumC31927f enumC31927f, long j7, C33252i c33252i, C31922a c31922a, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM99380o = m99380o(m99379n(m99384s(m99378m(C2314t.f9131w, enumC31927f, j7, c33252i), enumC31927f, c33252i), c31922a, j7), enumC31927f, c33252i);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM99380o);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC11895b.m32007z(0, interfaceC4351m, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m99377l(Modifier modifier, EnumC31927f enumC31927f, long j7, C33252i c33252i, C13825t c13825t, C31922a c31922a, float f13, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m99375j(modifier, enumC31927f, j7, c33252i, c13825t, c31922a, f13, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final Modifier m99378m(Modifier modifier, EnumC31927f enumC31927f, long j7, C33252i c33252i) {
        AbstractC18247a abstractC18247aM52577o;
        if (enumC31927f == null || (abstractC18247aM52577o = enumC31927f.getBackground()) == null) {
            abstractC18247aM52577o = AbstractC18249c.m52577o(j7);
        }
        return AbstractC18249c.m52567e(modifier, abstractC18247aM52577o, c33252i, null, 4, null);
    }

    /* JADX INFO: renamed from: n */
    private static final Modifier m99379n(Modifier modifier, C31922a c31922a, long j7) {
        Modifier modifierM99386u;
        if (c31922a != null) {
            modifierM99386u = m99386u(C2314t.f9131w, c31922a.getStrokeWidth(), C17919x.m51541c(1.0f, j7), c31922a.getCornerRadiusDp());
        } else {
            modifierM99386u = null;
        }
        return AbstractC15676d.m44103f(modifier, modifierM99386u);
    }

    /* JADX INFO: renamed from: o */
    private static final Modifier m99380o(Modifier modifier, EnumC31927f enumC31927f, C33252i c33252i) {
        return AbstractC37056f.m118997u(modifier, new C28119c(13, enumC31927f, c33252i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m99381p(EnumC31927f enumC31927f, C33252i c33252i, Modifier composed, Composer composer, int i13) {
        AbstractC17911t abstractC17911tMo60316a;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1577688724);
        Modifier modifierM3479b = null;
        InterfaceC21430b leadingAccentBrush = enumC31927f != null ? enumC31927f.getLeadingAccentBrush() : null;
        if (leadingAccentBrush == null) {
            c28655q.m87150e0(-1097601406);
            c28655q.m87173q(false);
            abstractC17911tMo60316a = null;
        } else {
            c28655q.m87150e0(-35406497);
            abstractC17911tMo60316a = leadingAccentBrush.mo60316a(c28655q, 0);
            c28655q.m87173q(false);
        }
        if (abstractC17911tMo60316a == null) {
            c28655q.m87150e0(-1097550783);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1097550782);
            boolean zM87153g = c28655q.m87153g(c33252i) | c28655q.m87153g(abstractC17911tMo60316a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C29793c(23, c33252i, abstractC17911tMo60316a);
                c28655q.m87172p0(objM87133R);
            }
            modifierM3479b = AbstractC1125a.m3479b(C2314t.f9131w, (Function1) objM87133R);
            c28655q.m87173q(false);
        }
        Modifier modifierM44103f = AbstractC15676d.m44103f(composed, modifierM3479b);
        c28655q.m87173q(false);
        return modifierM44103f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C14018g m99382q(C33252i c33252i, AbstractC17911t abstractC17911t, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        float fMo105483a = c33252i.m105482i().mo105483a(drawWithCache.f50036w.mo468d(), drawWithCache);
        float density = drawWithCache.getDensity() * f132596a;
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51465l(1);
        InterfaceC17910s0.m51496b(c17891jM51478a, AbstractC21478l0.m60427d((((long) Float.floatToRawIntBits(fMo105483a)) & 4294967295L) | (Float.floatToRawIntBits(fMo105483a) << 32), 0.0f, 0.0f, Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)), Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L))));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L));
        float f13 = fMo105483a - density;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        InterfaceC17910s0.m51496b(c17891jM51478a, AbstractC21478l0.m60427d((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), density, 0.0f, fIntBitsToFloat, fIntBitsToFloat2));
        return drawWithCache.m39910a(new C16367b4(fMo105483a, c17891jM51478a, abstractC17911t, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m99383r(float f13, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        C0238p0 c0238p0 = (C0238p0) onDrawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C0237p c0237p = c22128b.f85852x;
        long jM670A = c0237p.m670A();
        c0237p.m716w().mo51426q();
        try {
            ((C0929d) c0237p.f812x).m2346d(0.0f, 0.0f, f13, fIntBitsToFloat, 1);
            InterfaceC22131e.m63378L(onDrawWithContent, interfaceC17910s0, abstractC17911t, 0.0f, null, 60);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237p, jM670A);
        }
    }

    /* JADX INFO: renamed from: s */
    private static final Modifier m99384s(Modifier modifier, EnumC31927f enumC31927f, C33252i c33252i) {
        return AbstractC37056f.m118997u(modifier, new C3520h(2, enumC31927f, c33252i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Modifier m99385t(EnumC31927f enumC31927f, C33252i c33252i, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1618164737);
        Modifier modifierM44456i = null;
        InterfaceC21430b borderBrush = enumC31927f != null ? enumC31927f.getBorderBrush() : null;
        if (borderBrush == null) {
            c28655q.m87150e0(-32694823);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-32694822);
            modifierM44456i = AbstractC15751g.m44456i((float) 1.5d, C2314t.f9131w, borderBrush.mo60316a(c28655q, 0), c33252i);
            c28655q.m87173q(false);
        }
        Modifier modifierM44103f = AbstractC15676d.m44103f(composed, modifierM44456i);
        c28655q.m87173q(false);
        return modifierM44103f;
    }

    /* JADX INFO: renamed from: u */
    private static final Modifier m99386u(Modifier modifier, final float f13, final long j7, final float f14) {
        return AbstractC37056f.m118997u(modifier, new Function3() { // from class: rz0.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC31926e.m99387v(j7, f13, f14, (Modifier) obj, (Composer) obj2, iIntValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Modifier m99387v(long j7, float f13, float f14, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(160615882);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        float fMo743q0 = interfaceC39171c.mo743q0(f13);
        float fMo743q1 = interfaceC39171c.mo743q0(f14);
        boolean zM87147d = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87151f(j7);
        Object objM87133R = c28655q.m87133R();
        if (zM87147d || objM87133R == C28635l.f115821a) {
            C12769l c12769l = new C12769l(fMo743q0, fMo743q1, j7, 8);
            c28655q.m87172p0(c12769l);
            objM87133R = c12769l;
        }
        Modifier modifierMo3471e = composed.mo3471e(AbstractC1125a.m3479b(C2314t.f9131w, (Function1) objM87133R));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C14018g m99388w(float f13, float f14, long j7, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C0006a1(new C12769l(f13, f14, j7, 9), 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m99389x(float f13, float f14, long j7, InterfaceC22131e onDrawBehind) {
        AbstractC22676k.m65750j(onDrawBehind, "$this$onDrawBehind");
        InterfaceC22131e.m63374D(onDrawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), new C22135i(f13, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14), 0.0f, 230);
        return C23454a0.f92919a;
    }
}
