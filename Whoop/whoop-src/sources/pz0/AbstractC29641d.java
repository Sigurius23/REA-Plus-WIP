package pz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import g40.C15423t0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15133r7;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.C18027i;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p90.C29000h;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: pz0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a_\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016\"\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "checked", "enabled", "Li2/x;", "background", "Lpz0/e;", "variant", "Li2/t;", "trackBrush", "Lkotlin/Function1;", "Ll83/a0;", "onCheckedChange", "e", "(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(Landroidx/compose/ui/Modifier;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "i", "(Landroidx/compose/ui/Modifier;ZZJLi2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "largeTrackWidth", "b", "largeTrackHeight", "c", "largeThumbDiameter", "d", "largeThumbPadding", "thumbOffsetX", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29641d {

    /* JADX INFO: renamed from: a */
    private static final float f121031a;

    /* JADX INFO: renamed from: b */
    private static final float f121032b;

    /* JADX INFO: renamed from: c */
    private static final float f121033c;

    /* JADX INFO: renamed from: d */
    private static final float f121034d;

    /* JADX INFO: renamed from: pz0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f121035a;

        static {
            int[] iArr = new int[EnumC29642e.values().length];
            try {
                iArr[EnumC29642e.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29642e.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121035a = iArr;
        }
    }

    static {
        float f13 = 4;
        f121031a = 12 * f13;
        f121032b = 7 * f13;
        f121033c = 6 * f13;
        f121034d = f13 * 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0164  */
    /* JADX WARN: Code duplicated, block: B:110:0x016d  */
    /* JADX WARN: Code duplicated, block: B:113:0x018c  */
    /* JADX WARN: Code duplicated, block: B:116:0x019c  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    /* JADX INFO: renamed from: e */
    public static final void m91043e(Modifier modifier, final boolean z4, boolean z13, long j7, EnumC29642e enumC29642e, AbstractC17911t abstractC17911t, final Function1 onCheckedChange, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        boolean z14;
        long brandBlack;
        int i16;
        int iOrdinal;
        int i17;
        int i18;
        AbstractC17911t abstractC17911t2;
        int i19;
        boolean z15;
        final Modifier modifier3;
        C28655q c28655q;
        final boolean z16;
        final long j13;
        final EnumC29642e enumC29642e2;
        final AbstractC17911t abstractC17911t3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        EnumC29642e enumC29642e3;
        EnumC29642e enumC29642e4;
        int i24;
        long j14;
        boolean z17;
        int i25;
        int i26;
        int i27;
        AbstractC22676k.m65750j(onCheckedChange, "onCheckedChange");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(901582325);
        int i28 = i14 & 1;
        if (i28 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z13;
                i15 |= c28655q2.m87155h(z14) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    brandBlack = j7;
                    if (c28655q2.m87151f(brandBlack)) {
                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i27;
                } else {
                    brandBlack = j7;
                }
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i27;
            } else {
                brandBlack = j7;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (enumC29642e == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC29642e.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    abstractC17911t2 = abstractC17911t;
                    if (c28655q2.m87153g(abstractC17911t2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q2.m87157i(onCheckedChange)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i29 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                        }
                        if (i16 != 0) {
                            enumC29642e3 = EnumC29642e.Default;
                        } else {
                            enumC29642e3 = enumC29642e;
                        }
                        if (i18 != 0) {
                            long j15 = brandBlack;
                            enumC29642e4 = enumC29642e3;
                            i24 = i15;
                            j14 = j15;
                            abstractC17911t2 = null;
                            z17 = z14;
                        } else {
                            long j16 = brandBlack;
                            enumC29642e4 = enumC29642e3;
                            i24 = i15;
                            j14 = j16;
                            z17 = z14;
                            abstractC17911t2 = abstractC17911t2;
                        }
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        modifier4 = modifier2;
                        i24 = i15;
                        z17 = z14;
                        j14 = brandBlack;
                        abstractC17911t2 = abstractC17911t2;
                        enumC29642e4 = enumC29642e;
                    }
                    c28655q2.m87175r();
                    i25 = a.f121035a[enumC29642e4.ordinal()];
                    if (i25 != 1) {
                        c28655q2.m87150e0(-1162767932);
                        m91044f(modifier4, z4, z17, j14, onCheckedChange, c28655q2, (i24 & 8190) | ((i24 >> 6) & 57344));
                        c28655q2.m87173q(false);
                    } else {
                        if (i25 == 2) {
                            throw AbstractC11895b.m32003v(-1162769352, c28655q2, false);
                        }
                        c28655q2.m87150e0(-1162760089);
                        int i34 = i24 & 8190;
                        int i35 = i24 >> 3;
                        m91047i(modifier4, z4, z17, j14, abstractC17911t2, onCheckedChange, c28655q2, i34 | (57344 & i35) | (i35 & 458752));
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier4;
                    j13 = j14;
                    c28655q = c28655q2;
                    enumC29642e2 = enumC29642e4;
                    z16 = z17;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    z16 = z14;
                    j13 = brandBlack;
                    enumC29642e2 = enumC29642e;
                }
                abstractC17911t3 = abstractC17911t2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: pz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC29641d.m91050l(modifier3, z4, z16, j13, enumC29642e2, abstractC17911t3, onCheckedChange, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            abstractC17911t2 = abstractC17911t;
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onCheckedChange)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    }
                    if (i16 != 0) {
                        enumC29642e3 = EnumC29642e.Default;
                    } else {
                        enumC29642e3 = enumC29642e;
                    }
                    if (i18 != 0) {
                        long j17 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j17;
                        abstractC17911t2 = null;
                        z17 = z14;
                    } else {
                        long j18 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j18;
                        z17 = z14;
                        abstractC17911t2 = abstractC17911t2;
                    }
                } else {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    }
                    if (i16 != 0) {
                        enumC29642e3 = EnumC29642e.Default;
                    } else {
                        enumC29642e3 = enumC29642e;
                    }
                    if (i18 != 0) {
                        long j19 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j19;
                        abstractC17911t2 = null;
                        z17 = z14;
                    } else {
                        long j110 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j110;
                        z17 = z14;
                        abstractC17911t2 = abstractC17911t2;
                    }
                }
                c28655q2.m87175r();
                i25 = a.f121035a[enumC29642e4.ordinal()];
                if (i25 != 1) {
                    c28655q2.m87150e0(-1162767932);
                    m91044f(modifier4, z4, z17, j14, onCheckedChange, c28655q2, (i24 & 8190) | ((i24 >> 6) & 57344));
                    c28655q2.m87173q(false);
                } else {
                    if (i25 == 2) {
                        throw AbstractC11895b.m32003v(-1162769352, c28655q2, false);
                    }
                    c28655q2.m87150e0(-1162760089);
                    int i36 = i24 & 8190;
                    int i37 = i24 >> 3;
                    m91047i(modifier4, z4, z17, j14, abstractC17911t2, onCheckedChange, c28655q2, i36 | (57344 & i37) | (i37 & 458752));
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier4;
                j13 = j14;
                c28655q = c28655q2;
                enumC29642e2 = enumC29642e4;
                z16 = z17;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                z16 = z14;
                j13 = brandBlack;
                enumC29642e2 = enumC29642e;
            }
            abstractC17911t3 = abstractC17911t2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: pz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC29641d.m91050l(modifier3, z4, z16, j13, enumC29642e2, abstractC17911t3, onCheckedChange, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        z14 = z13;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                brandBlack = j7;
                if (c28655q2.m87151f(brandBlack)) {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i27;
            } else {
                brandBlack = j7;
            }
            i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i27;
        } else {
            brandBlack = j7;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if (enumC29642e == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC29642e.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                abstractC17911t2 = abstractC17911t;
                if (c28655q2.m87153g(abstractC17911t2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onCheckedChange)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    }
                    if (i16 != 0) {
                        enumC29642e3 = EnumC29642e.Default;
                    } else {
                        enumC29642e3 = enumC29642e;
                    }
                    if (i18 != 0) {
                        long j111 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j111;
                        abstractC17911t2 = null;
                        z17 = z14;
                    } else {
                        long j112 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j112;
                        z17 = z14;
                        abstractC17911t2 = abstractC17911t2;
                    }
                } else {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    }
                    if (i16 != 0) {
                        enumC29642e3 = EnumC29642e.Default;
                    } else {
                        enumC29642e3 = enumC29642e;
                    }
                    if (i18 != 0) {
                        long j113 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j113;
                        abstractC17911t2 = null;
                        z17 = z14;
                    } else {
                        long j114 = brandBlack;
                        enumC29642e4 = enumC29642e3;
                        i24 = i15;
                        j14 = j114;
                        z17 = z14;
                        abstractC17911t2 = abstractC17911t2;
                    }
                }
                c28655q2.m87175r();
                i25 = a.f121035a[enumC29642e4.ordinal()];
                if (i25 != 1) {
                    c28655q2.m87150e0(-1162767932);
                    m91044f(modifier4, z4, z17, j14, onCheckedChange, c28655q2, (i24 & 8190) | ((i24 >> 6) & 57344));
                    c28655q2.m87173q(false);
                } else {
                    if (i25 == 2) {
                        throw AbstractC11895b.m32003v(-1162769352, c28655q2, false);
                    }
                    c28655q2.m87150e0(-1162760089);
                    int i38 = i24 & 8190;
                    int i39 = i24 >> 3;
                    m91047i(modifier4, z4, z17, j14, abstractC17911t2, onCheckedChange, c28655q2, i38 | (57344 & i39) | (i39 & 458752));
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier4;
                j13 = j14;
                c28655q = c28655q2;
                enumC29642e2 = enumC29642e4;
                z16 = z17;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                z16 = z14;
                j13 = brandBlack;
                enumC29642e2 = enumC29642e;
            }
            abstractC17911t3 = abstractC17911t2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: pz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC29641d.m91050l(modifier3, z4, z16, j13, enumC29642e2, abstractC17911t3, onCheckedChange, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        abstractC17911t2 = abstractC17911t;
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87157i(onCheckedChange)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        if ((599187 & i15) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i29 != 0) {
                    z14 = true;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                }
                if (i16 != 0) {
                    enumC29642e3 = EnumC29642e.Default;
                } else {
                    enumC29642e3 = enumC29642e;
                }
                if (i18 != 0) {
                    long j115 = brandBlack;
                    enumC29642e4 = enumC29642e3;
                    i24 = i15;
                    j14 = j115;
                    abstractC17911t2 = null;
                    z17 = z14;
                } else {
                    long j116 = brandBlack;
                    enumC29642e4 = enumC29642e3;
                    i24 = i15;
                    j14 = j116;
                    z17 = z14;
                    abstractC17911t2 = abstractC17911t2;
                }
            } else {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i29 != 0) {
                    z14 = true;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    brandBlack = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                }
                if (i16 != 0) {
                    enumC29642e3 = EnumC29642e.Default;
                } else {
                    enumC29642e3 = enumC29642e;
                }
                if (i18 != 0) {
                    long j117 = brandBlack;
                    enumC29642e4 = enumC29642e3;
                    i24 = i15;
                    j14 = j117;
                    abstractC17911t2 = null;
                    z17 = z14;
                } else {
                    long j118 = brandBlack;
                    enumC29642e4 = enumC29642e3;
                    i24 = i15;
                    j14 = j118;
                    z17 = z14;
                    abstractC17911t2 = abstractC17911t2;
                }
            }
            c28655q2.m87175r();
            i25 = a.f121035a[enumC29642e4.ordinal()];
            if (i25 != 1) {
                c28655q2.m87150e0(-1162767932);
                m91044f(modifier4, z4, z17, j14, onCheckedChange, c28655q2, (i24 & 8190) | ((i24 >> 6) & 57344));
                c28655q2.m87173q(false);
            } else {
                if (i25 == 2) {
                    throw AbstractC11895b.m32003v(-1162769352, c28655q2, false);
                }
                c28655q2.m87150e0(-1162760089);
                int i310 = i24 & 8190;
                int i311 = i24 >> 3;
                m91047i(modifier4, z4, z17, j14, abstractC17911t2, onCheckedChange, c28655q2, i310 | (57344 & i311) | (i311 & 458752));
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            modifier3 = modifier4;
            j13 = j14;
            c28655q = c28655q2;
            enumC29642e2 = enumC29642e4;
            z16 = z17;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            z16 = z14;
            j13 = brandBlack;
            enumC29642e2 = enumC29642e;
        }
        abstractC17911t3 = abstractC17911t2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: pz0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC29641d.m91050l(modifier3, z4, z16, j13, enumC29642e2, abstractC17911t3, onCheckedChange, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m91044f(Modifier modifier, boolean z4, boolean z13, long j7, Function1 function1, Composer composer, int i13) {
        Modifier modifier2;
        int i14;
        boolean z14;
        C28655q c28655q;
        long white30;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1686534394);
        if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i14 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            z14 = z13;
            i14 |= c28655q2.m87155h(z14) ? 256 : 128;
        } else {
            z14 = z13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            if (z4) {
                c28655q2.m87150e0(-1556875188);
                white30 = C38070b.f163049a.m121943a(c28655q2, 6).getActive();
            } else {
                c28655q2.m87150e0(-1556874227);
                white30 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite30();
            }
            c28655q2.m87173q(false);
            long j13 = white30;
            float f13 = z4 ? 1.0f : 0.2f;
            if (C17919x.m51542d(C38070b.f163049a.m121943a(c28655q2, 6).getActive(), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite())) {
                f13 = 0.3f;
            }
            boolean z15 = (57344 & i14) == 16384;
            Object objM87133R = c28655q2.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29000h(function1, 11);
                c28655q2.m87172p0(objM87133R);
            }
            int i15 = i14 >> 3;
            c28655q = c28655q2;
            AbstractC15133r7.m43183a(z4, (Function1) objM87133R, modifier2, z14, C29638a.f121014a.m91038a(j13, f13, j7, c28655q, (i15 & 896) | 3072), c28655q, (i15 & 14) | ((i14 << 6) & 896) | ((i14 << 3) & 7168), 16);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15423t0(modifier, z4, z13, j7, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91045g(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m91046h(Modifier modifier, boolean z4, boolean z13, long j7, Function1 function1, int i13, Composer composer, int i14) {
        m91044f(modifier, z4, z13, j7, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m91047i(final Modifier modifier, final boolean z4, final boolean z13, final long j7, final AbstractC17911t abstractC17911t, final Function1 function1, Composer composer, final int i13) {
        int i14;
        long white30;
        long jM51528p;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(696429842);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(abstractC17911t) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            if (z4) {
                c28655q.m87150e0(-745812456);
                white30 = C38070b.f163049a.m121943a(c28655q, 6).getActive();
            } else {
                c28655q.m87150e0(-745811495);
                white30 = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
            }
            c28655q.m87173q(false);
            long j13 = white30;
            float f13 = z4 ? 1.0f : 0.2f;
            if (z13) {
                c28655q.m87150e0(-1645230428);
                jM51528p = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1645179433);
                jM51528p = AbstractC17918w0.m51528p(AbstractC13673n.m38559f(C38072d.f163053a, c28655q, 6, 0.2f), j7);
                c28655q.m87173q(false);
            }
            float f14 = f13;
            long j14 = jM51528p;
            InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(z4 ? (f121031a - f121033c) - f121034d : f121034d, AbstractC11348f.m30574v(100, 0, null, 6), "WhoopSwitchLargeThumbOffset", c28655q, 432, 8);
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = (abstractC17911t == null || !z4) ? AbstractC1092a.m3358c(c2314t, C17919x.m51541c(f14, j13), c17916v0) : AbstractC1092a.m3357b(c2314t, abstractC17911t, null, 0.0f, 6);
            float f15 = f121031a;
            float f16 = f121032b;
            Modifier modifierM3448b = AbstractC1112d.m3448b(AbstractC37056f.m118994r(AbstractC1102d.m3421r(modifier, f15, f16), AbstractC33253j.m105489e(f16 / 2)).mo3471e(modifierM3358c), z4, z13, new C18027i(2), function1, 8);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3448b);
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
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f121033c, AbstractC1099a.m3392n(C1100b.f4583a.mo3400a(c2314t, C2299e.f9117z), m91048j(interfaceC28670t2M30587a), 0.0f, 2)), AbstractC33253j.f138651a), j14, c17916v0), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: pz0.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC29641d.m91049k(modifier, z4, z13, j7, abstractC17911t, function1, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: j */
    private static final float m91048j(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m91049k(Modifier modifier, boolean z4, boolean z13, long j7, AbstractC17911t abstractC17911t, Function1 function1, int i13, Composer composer, int i14) {
        m91047i(modifier, z4, z13, j7, abstractC17911t, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91050l(Modifier modifier, boolean z4, boolean z13, long j7, EnumC29642e enumC29642e, AbstractC17911t abstractC17911t, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91043e(modifier, z4, z13, j7, enumC29642e, abstractC17911t, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
