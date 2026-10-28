package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import b91.C2886a;
import b91.EnumC2888c;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6493d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import ky0.C22889a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.i2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aS\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001aS\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\u001a#\u0010\u0019\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhy0/g;", "dividerType", "Lhy0/f;", "dividerTextPosition", "Lcom/whoop/design/util/TextResource;", "title", "", "maxFontScaling", "Li2/x;", "textColor", "dividerColor", "Lb91/c;", "titleTypography", "Ll83/a0;", "j", "(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V", "Lb91/a;", "titleTextStyle", "m", "(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;Landroidx/compose/runtime/Composer;II)V", "o", "k", "Ll0/s1;", "g", "(Ll0/s1;Lhy0/g;JLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17755i2 {

    /* JADX INFO: renamed from: hy0.i2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69048a;

        static {
            int[] iArr = new int[EnumC17740f.values().length];
            try {
                iArr[EnumC17740f.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17740f.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17740f.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69048a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m50935g(InterfaceC22997s1 interfaceC22997s1, EnumC17744g enumC17744g, long j7, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1043828566);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC17744g.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            long j13 = enumC17744g == EnumC17744g.SOLID ? j7 : C17919x.f69636m;
            boolean z4 = false;
            float f13 = 1;
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(interfaceC22997s1.mo66771a(C2314t.f9131w, C2299e.f9108K), true, 1.0f);
            boolean z13 = enumC17744g == EnumC17744g.DOTTED;
            if ((i14 & 896) == 256) {
                z4 = true;
            }
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C6493d(j7, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15751g.m44449b(AbstractC15676d.m44099b(modifierMo66772c, z13, (Function1) objM87133R), j13, f13, 0.0f, c28655q, 384, 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22889a(interfaceC22997s1, enumC17744g, j7, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m50936h(long j7, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1092a.m3358c(C2314t.f9131w, j7, new C17748h(8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m50937i(InterfaceC22997s1 interfaceC22997s1, EnumC17744g enumC17744g, long j7, int i13, Composer composer, int i14) {
        m50935g(interfaceC22997s1, enumC17744g, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:103:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:122:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:129:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:138:0x0195  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:155:0x0209  */
    /* JADX WARN: Code duplicated, block: B:157:0x0212  */
    /* JADX WARN: Code duplicated, block: B:158:0x0233  */
    /* JADX WARN: Code duplicated, block: B:160:0x025f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0274  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    /* JADX INFO: renamed from: j */
    public static final void m50938j(Modifier modifier, EnumC17744g enumC17744g, EnumC17740f enumC17740f, TextResource textResource, Float f13, long j7, long j13, EnumC2888c enumC2888c, Composer composer, final int i13, final int i14) {
        int i15;
        TextResource c8691e;
        Float f14;
        long white70;
        int i16;
        long white10;
        int i17;
        int iOrdinal;
        int i18;
        boolean z4;
        final Modifier modifier2;
        final EnumC17744g enumC17744g2;
        final EnumC17740f enumC17740f2;
        final TextResource textResource2;
        final Float f15;
        final EnumC2888c enumC2888c2;
        final long j14;
        final long j15;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        EnumC17744g enumC17744g3;
        EnumC17740f enumC17740f3;
        EnumC2888c enumC2888c3;
        Modifier modifier4;
        EnumC17744g enumC17744g4;
        EnumC17740f enumC17740f4;
        int i19;
        TextResource textResource3;
        C2886a h7;
        C2886a c2886a;
        int i24;
        int i25;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1743024693);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC17744g == null ? -1 : enumC17744g.ordinal()) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC17740f == null ? -1 : enumC17740f.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c8691e = textResource;
                if (c28655q.m87153g(c8691e)) {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i26;
            } else {
                c8691e = textResource;
            }
            i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i26;
        } else {
            c8691e = textResource;
        }
        int i34 = i14 & 16;
        if (i34 == 0) {
            if ((i13 & 24576) == 0) {
                f14 = f13;
                i15 |= c28655q.m87153g(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    white70 = j7;
                    if (c28655q.m87151f(white70)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i15 |= i25;
                } else {
                    white70 = j7;
                }
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i15 |= i25;
            } else {
                white70 = j7;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    i16 = i29;
                    white10 = j13;
                    int i35 = c28655q.m87151f(white10) ? 1048576 : 524288;
                    i15 |= i35;
                } else {
                    i16 = i29;
                    white10 = j13;
                }
                i15 |= i35;
            } else {
                i16 = i29;
                white10 = j13;
            }
            i17 = i14 & 128;
            if (i17 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (enumC2888c == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC2888c.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i15 |= i18;
                }
                if ((4793491 & i15) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            enumC17744g3 = EnumC17744g.SOLID;
                        } else {
                            enumC17744g3 = enumC17744g;
                        }
                        if (i16 != 0) {
                            enumC17740f3 = EnumC17740f.LEFT;
                        } else {
                            enumC17740f3 = enumC17740f;
                        }
                        if ((i14 & 8) != 0) {
                            c8691e = new TextResource.C8691e("");
                            i15 &= -7169;
                        }
                        if (i34 != 0) {
                            f14 = null;
                        }
                        if ((i14 & 32) != 0) {
                            white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                            i15 &= -3670017;
                        }
                        if (i17 != 0) {
                            enumC2888c3 = null;
                        } else {
                            enumC2888c3 = enumC2888c;
                        }
                        modifier4 = modifier3;
                        enumC17744g4 = enumC17744g3;
                        enumC17740f4 = enumC17740f3;
                        i19 = 2;
                        textResource3 = c8691e;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        if ((i14 & 32) != 0) {
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        enumC17740f4 = enumC17740f;
                        enumC2888c3 = enumC2888c;
                        white10 = white10;
                        textResource3 = c8691e;
                        f14 = f14;
                        white70 = white70;
                        i19 = 2;
                        modifier4 = modifier;
                        enumC17744g4 = enumC17744g;
                    }
                    c28655q.m87175r();
                    if (enumC2888c3 != null || (h7 = EnumC2888c.INSTANCE.m8402a(enumC2888c3)) == null) {
                        h7 = AbstractC2890e.m8450e().getH5();
                    }
                    c2886a = h7;
                    i24 = a.f69048a[enumC17740f4.ordinal()];
                    if (i24 != 1) {
                        c28655q.m87150e0(-9465414);
                        int i36 = i15 & 126;
                        int i37 = i15 >> 3;
                        m50941m(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i36 | (i37 & 896) | (i37 & 7168) | (i37 & 57344) | (i37 & 458752), 0);
                        c28655q.m87173q(false);
                    } else if (i24 != i19) {
                        c28655q.m87150e0(-9460645);
                        int i38 = i15 & 126;
                        int i39 = i15 >> 3;
                        m50943o(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i38 | (i39 & 896) | (i39 & 7168) | (i39 & 57344) | (i39 & 458752), 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i24 == 3) {
                            throw AbstractC11895b.m32003v(-9467119, c28655q, false);
                        }
                        c28655q.m87150e0(-9455748);
                        int i44 = i15 & 126;
                        int i45 = i15 >> 3;
                        m50939k(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i44 | (i45 & 896) | (i45 & 7168) | (i45 & 57344) | (i45 & 458752), 0);
                        c28655q.m87173q(false);
                    }
                    enumC17740f2 = enumC17740f4;
                    enumC2888c2 = enumC2888c3;
                    modifier2 = modifier4;
                    enumC17744g2 = enumC17744g4;
                    textResource2 = textResource3;
                    f15 = f14;
                    j15 = white70;
                    j14 = white10;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC17744g2 = enumC17744g;
                    enumC17740f2 = enumC17740f;
                    textResource2 = c8691e;
                    f15 = f14;
                    enumC2888c2 = enumC2888c;
                    j14 = white10;
                    j15 = white70;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.f2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC17755i2.m50945q(modifier2, enumC17744g2, enumC17740f2, textResource2, f15, j15, j14, enumC2888c2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 12582912;
            i27 = i27;
            if ((4793491 & i15) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if (i16 != 0) {
                        enumC17740f3 = EnumC17740f.LEFT;
                    } else {
                        enumC17740f3 = enumC17740f;
                    }
                    if ((i14 & 8) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -7169;
                    }
                    if (i34 != 0) {
                        f14 = null;
                    }
                    if ((i14 & 32) != 0) {
                        white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -3670017;
                    }
                    if (i17 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    modifier4 = modifier3;
                    enumC17744g4 = enumC17744g3;
                    enumC17740f4 = enumC17740f3;
                    i19 = 2;
                    textResource3 = c8691e;
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if (i16 != 0) {
                        enumC17740f3 = EnumC17740f.LEFT;
                    } else {
                        enumC17740f3 = enumC17740f;
                    }
                    if ((i14 & 8) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -7169;
                    }
                    if (i34 != 0) {
                        f14 = null;
                    }
                    if ((i14 & 32) != 0) {
                        white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -3670017;
                    }
                    if (i17 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    modifier4 = modifier3;
                    enumC17744g4 = enumC17744g3;
                    enumC17740f4 = enumC17740f3;
                    i19 = 2;
                    textResource3 = c8691e;
                }
                c28655q.m87175r();
                if (enumC2888c3 != null) {
                    h7 = AbstractC2890e.m8450e().getH5();
                } else {
                    h7 = AbstractC2890e.m8450e().getH5();
                }
                c2886a = h7;
                i24 = a.f69048a[enumC17740f4.ordinal()];
                if (i24 != 1) {
                    c28655q.m87150e0(-9465414);
                    int i310 = i15 & 126;
                    int i311 = i15 >> 3;
                    m50941m(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i310 | (i311 & 896) | (i311 & 7168) | (i311 & 57344) | (i311 & 458752), 0);
                    c28655q.m87173q(false);
                } else if (i24 != i19) {
                    c28655q.m87150e0(-9460645);
                    int i312 = i15 & 126;
                    int i313 = i15 >> 3;
                    m50943o(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i312 | (i313 & 896) | (i313 & 7168) | (i313 & 57344) | (i313 & 458752), 0);
                    c28655q.m87173q(false);
                } else {
                    if (i24 == 3) {
                        throw AbstractC11895b.m32003v(-9467119, c28655q, false);
                    }
                    c28655q.m87150e0(-9455748);
                    int i46 = i15 & 126;
                    int i47 = i15 >> 3;
                    m50939k(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i46 | (i47 & 896) | (i47 & 7168) | (i47 & 57344) | (i47 & 458752), 0);
                    c28655q.m87173q(false);
                }
                enumC17740f2 = enumC17740f4;
                enumC2888c2 = enumC2888c3;
                modifier2 = modifier4;
                enumC17744g2 = enumC17744g4;
                textResource2 = textResource3;
                f15 = f14;
                j15 = white70;
                j14 = white10;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                enumC17744g2 = enumC17744g;
                enumC17740f2 = enumC17740f;
                textResource2 = c8691e;
                f15 = f14;
                enumC2888c2 = enumC2888c;
                j14 = white10;
                j15 = white70;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.f2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC17755i2.m50945q(modifier2, enumC17744g2, enumC17740f2, textResource2, f15, j15, j14, enumC2888c2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 24576;
        f14 = f13;
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                white70 = j7;
                if (c28655q.m87151f(white70)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i25;
            } else {
                white70 = j7;
            }
            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i25;
        } else {
            white70 = j7;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                i16 = i29;
                white10 = j13;
                if (c28655q.m87151f(white10)) {
                }
                i15 |= i35;
            } else {
                i16 = i29;
                white10 = j13;
            }
            i15 |= i35;
        } else {
            i16 = i29;
            white10 = j13;
        }
        i17 = i14 & 128;
        if (i17 != 0) {
            if ((i13 & 12582912) == 0) {
                if (enumC2888c == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC2888c.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
            if ((4793491 & i15) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if (i16 != 0) {
                        enumC17740f3 = EnumC17740f.LEFT;
                    } else {
                        enumC17740f3 = enumC17740f;
                    }
                    if ((i14 & 8) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -7169;
                    }
                    if (i34 != 0) {
                        f14 = null;
                    }
                    if ((i14 & 32) != 0) {
                        white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -3670017;
                    }
                    if (i17 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    modifier4 = modifier3;
                    enumC17744g4 = enumC17744g3;
                    enumC17740f4 = enumC17740f3;
                    i19 = 2;
                    textResource3 = c8691e;
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if (i16 != 0) {
                        enumC17740f3 = EnumC17740f.LEFT;
                    } else {
                        enumC17740f3 = enumC17740f;
                    }
                    if ((i14 & 8) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -7169;
                    }
                    if (i34 != 0) {
                        f14 = null;
                    }
                    if ((i14 & 32) != 0) {
                        white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -3670017;
                    }
                    if (i17 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    modifier4 = modifier3;
                    enumC17744g4 = enumC17744g3;
                    enumC17740f4 = enumC17740f3;
                    i19 = 2;
                    textResource3 = c8691e;
                }
                c28655q.m87175r();
                if (enumC2888c3 != null) {
                    h7 = AbstractC2890e.m8450e().getH5();
                } else {
                    h7 = AbstractC2890e.m8450e().getH5();
                }
                c2886a = h7;
                i24 = a.f69048a[enumC17740f4.ordinal()];
                if (i24 != 1) {
                    c28655q.m87150e0(-9465414);
                    int i314 = i15 & 126;
                    int i315 = i15 >> 3;
                    m50941m(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i314 | (i315 & 896) | (i315 & 7168) | (i315 & 57344) | (i315 & 458752), 0);
                    c28655q.m87173q(false);
                } else if (i24 != i19) {
                    c28655q.m87150e0(-9460645);
                    int i316 = i15 & 126;
                    int i317 = i15 >> 3;
                    m50943o(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i316 | (i317 & 896) | (i317 & 7168) | (i317 & 57344) | (i317 & 458752), 0);
                    c28655q.m87173q(false);
                } else {
                    if (i24 == 3) {
                        throw AbstractC11895b.m32003v(-9467119, c28655q, false);
                    }
                    c28655q.m87150e0(-9455748);
                    int i48 = i15 & 126;
                    int i49 = i15 >> 3;
                    m50939k(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i48 | (i49 & 896) | (i49 & 7168) | (i49 & 57344) | (i49 & 458752), 0);
                    c28655q.m87173q(false);
                }
                enumC17740f2 = enumC17740f4;
                enumC2888c2 = enumC2888c3;
                modifier2 = modifier4;
                enumC17744g2 = enumC17744g4;
                textResource2 = textResource3;
                f15 = f14;
                j15 = white70;
                j14 = white10;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                enumC17744g2 = enumC17744g;
                enumC17740f2 = enumC17740f;
                textResource2 = c8691e;
                f15 = f14;
                enumC2888c2 = enumC2888c;
                j14 = white10;
                j15 = white70;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.f2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC17755i2.m50945q(modifier2, enumC17744g2, enumC17740f2, textResource2, f15, j15, j14, enumC2888c2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 12582912;
        i27 = i27;
        if ((4793491 & i15) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if (i16 != 0) {
                    enumC17740f3 = EnumC17740f.LEFT;
                } else {
                    enumC17740f3 = enumC17740f;
                }
                if ((i14 & 8) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -7169;
                }
                if (i34 != 0) {
                    f14 = null;
                }
                if ((i14 & 32) != 0) {
                    white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                    i15 &= -3670017;
                }
                if (i17 != 0) {
                    enumC2888c3 = null;
                } else {
                    enumC2888c3 = enumC2888c;
                }
                modifier4 = modifier3;
                enumC17744g4 = enumC17744g3;
                enumC17740f4 = enumC17740f3;
                i19 = 2;
                textResource3 = c8691e;
            } else {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if (i16 != 0) {
                    enumC17740f3 = EnumC17740f.LEFT;
                } else {
                    enumC17740f3 = enumC17740f;
                }
                if ((i14 & 8) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -7169;
                }
                if (i34 != 0) {
                    f14 = null;
                }
                if ((i14 & 32) != 0) {
                    white70 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                    i15 &= -3670017;
                }
                if (i17 != 0) {
                    enumC2888c3 = null;
                } else {
                    enumC2888c3 = enumC2888c;
                }
                modifier4 = modifier3;
                enumC17744g4 = enumC17744g3;
                enumC17740f4 = enumC17740f3;
                i19 = 2;
                textResource3 = c8691e;
            }
            c28655q.m87175r();
            if (enumC2888c3 != null) {
                h7 = AbstractC2890e.m8450e().getH5();
            } else {
                h7 = AbstractC2890e.m8450e().getH5();
            }
            c2886a = h7;
            i24 = a.f69048a[enumC17740f4.ordinal()];
            if (i24 != 1) {
                c28655q.m87150e0(-9465414);
                int i318 = i15 & 126;
                int i319 = i15 >> 3;
                m50941m(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i318 | (i319 & 896) | (i319 & 7168) | (i319 & 57344) | (i319 & 458752), 0);
                c28655q.m87173q(false);
            } else if (i24 != i19) {
                c28655q.m87150e0(-9460645);
                int i3110 = i15 & 126;
                int i3111 = i15 >> 3;
                m50943o(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i3110 | (i3111 & 896) | (i3111 & 7168) | (i3111 & 57344) | (i3111 & 458752), 0);
                c28655q.m87173q(false);
            } else {
                if (i24 == 3) {
                    throw AbstractC11895b.m32003v(-9467119, c28655q, false);
                }
                c28655q.m87150e0(-9455748);
                int i410 = i15 & 126;
                int i411 = i15 >> 3;
                m50939k(modifier4, enumC17744g4, textResource3, f14, white70, white10, c2886a, c28655q, i410 | (i411 & 896) | (i411 & 7168) | (i411 & 57344) | (i411 & 458752), 0);
                c28655q.m87173q(false);
            }
            enumC17740f2 = enumC17740f4;
            enumC2888c2 = enumC2888c3;
            modifier2 = modifier4;
            enumC17744g2 = enumC17744g4;
            textResource2 = textResource3;
            f15 = f14;
            j15 = white70;
            j14 = white10;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            enumC17744g2 = enumC17744g;
            enumC17740f2 = enumC17740f;
            textResource2 = c8691e;
            f15 = f14;
            enumC2888c2 = enumC2888c;
            j14 = white10;
            j15 = white70;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.f2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC17755i2.m50945q(modifier2, enumC17744g2, enumC17740f2, textResource2, f15, j15, j14, enumC2888c2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x0188  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x020a  */
    /* JADX WARN: Code duplicated, block: B:125:0x022b  */
    /* JADX WARN: Code duplicated, block: B:128:0x023d  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX INFO: renamed from: k */
    private static final void m50939k(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Float f14;
        boolean z4;
        TextResource textResource2;
        C2886a c2886a2;
        Modifier modifier3;
        Float f15;
        EnumC17744g enumC17744g2;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        EnumC17744g enumC17744g3;
        TextResource c8691e;
        Float f16;
        C2886a c2886a3;
        int i17;
        TextResource textResource3;
        Float f17;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        boolean z13;
        boolean z14;
        int i24;
        boolean zM87157i;
        int i25;
        int i26;
        C2886a h7 = c2886a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1742438186);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC17744g == null ? -1 : enumC17744g.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87153g(textResource)) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                i15 |= c28655q.m87153g(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87151f(j7)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87151f(j13)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) != 0) {
                    i24 = 524288;
                } else {
                    if ((2097152 & i13) == 0) {
                        zM87157i = c28655q.m87153g(h7);
                    } else {
                        zM87157i = c28655q.m87157i(h7);
                    }
                    if (zM87157i) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if ((i14 & 4) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -897;
                    } else {
                        c8691e = textResource;
                    }
                    if (i29 != 0) {
                        f16 = null;
                    } else {
                        f16 = f14;
                    }
                    if ((i14 & 64) != 0) {
                        h7 = AbstractC2890e.m8450e().getH5();
                        i15 &= -3670017;
                    }
                    c2886a3 = h7;
                    i17 = i15;
                    textResource3 = c8691e;
                    f17 = f16;
                    modifier4 = modifier2;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i14 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    enumC17744g3 = enumC17744g;
                    c2886a3 = h7;
                    modifier4 = modifier2;
                    i17 = i15;
                    f17 = f14;
                    textResource3 = textResource;
                }
                c28655q.m87175r();
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                int i34 = (i17 & 112) | 6 | ((i17 >> 9) & 896);
                C23000t1 c23000t1 = C23000t1.f90727a;
                m50935g(c23000t1, enumC17744g3, j13, c28655q, i34);
                c28655q.m87150e0(274231537);
                i18 = i17 >> 6;
                i19 = i18 & 14;
                if (AbstractC8693b.m21274h(textResource3, c28655q, i19).length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(-1248005858);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, i19), AbstractC1099a.m3396r(c2314t, 2 * 4, 0.0f, 2), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1247706553);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                m50935g(c23000t1, enumC17744g3, j13, c28655q, i34);
                c28655q.m87173q(true);
                enumC17744g2 = enumC17744g3;
                textResource2 = textResource3;
                modifier3 = modifier4;
                c2886a2 = c2886a3;
                f15 = f17;
            } else {
                c28655q.m87138X();
                textResource2 = textResource;
                c2886a2 = h7;
                modifier3 = modifier2;
                f15 = f14;
                enumC17744g2 = enumC17744g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17751h2(modifier3, enumC17744g2, textResource2, f15, j7, j13, c2886a2, i13, i14, 1);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87151f(j7)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i26;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87151f(j13)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i24 = 524288;
            } else {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q.m87153g(h7);
                } else {
                    zM87157i = c28655q.m87157i(h7);
                }
                if (zM87157i) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
            }
            i15 |= i24;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource;
                }
                if (i29 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    h7 = AbstractC2890e.m8450e().getH5();
                    i15 &= -3670017;
                }
                c2886a3 = h7;
                i17 = i15;
                textResource3 = c8691e;
                f17 = f16;
                modifier4 = modifier2;
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource;
                }
                if (i29 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    h7 = AbstractC2890e.m8450e().getH5();
                    i15 &= -3670017;
                }
                c2886a3 = h7;
                i17 = i15;
                textResource3 = c8691e;
                f17 = f16;
                modifier4 = modifier2;
            }
            c28655q.m87175r();
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            int i35 = (i17 & 112) | 6 | ((i17 >> 9) & 896);
            C23000t1 c23000t2 = C23000t1.f90727a;
            m50935g(c23000t2, enumC17744g3, j13, c28655q, i35);
            c28655q.m87150e0(274231537);
            i18 = i17 >> 6;
            i19 = i18 & 14;
            if (AbstractC8693b.m21274h(textResource3, c28655q, i19).length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                c28655q.m87150e0(-1248005858);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, i19), AbstractC1099a.m3396r(c2314t, 2 * 4, 0.0f, 2), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                z14 = false;
                c28655q.m87173q(false);
            } else {
                z14 = false;
                c28655q.m87150e0(-1247706553);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            m50935g(c23000t2, enumC17744g3, j13, c28655q, i35);
            c28655q.m87173q(true);
            enumC17744g2 = enumC17744g3;
            textResource2 = textResource3;
            modifier3 = modifier4;
            c2886a2 = c2886a3;
            f15 = f17;
        } else {
            c28655q.m87138X();
            textResource2 = textResource;
            c2886a2 = h7;
            modifier3 = modifier2;
            f15 = f14;
            enumC17744g2 = enumC17744g;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17751h2(modifier3, enumC17744g2, textResource2, f15, j7, j13, c2886a2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m50940l(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, int i13, int i14, Composer composer, int i15) {
        m50939k(modifier, enumC17744g, textResource, f13, j7, j13, c2886a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:120:0x01af  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:123:0x0203  */
    /* JADX WARN: Code duplicated, block: B:125:0x022c  */
    /* JADX WARN: Code duplicated, block: B:128:0x023e  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX INFO: renamed from: m */
    private static final void m50941m(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, final long j7, final long j13, C2886a c2886a, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource2;
        Float f14;
        boolean z4;
        final EnumC17744g enumC17744g2;
        final C2886a c2886a2;
        final Modifier modifier3;
        final TextResource textResource3;
        final Float f15;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        EnumC17744g enumC17744g3;
        TextResource c8691e;
        Float f16;
        Modifier modifier4;
        int i17;
        C2886a h7;
        Float f17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        boolean z13;
        boolean z14;
        int i24;
        boolean zM87157i;
        int i25;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1512462236);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC17744g == null ? -1 : enumC17744g.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                textResource2 = textResource;
                int i29 = c28655q.m87153g(textResource2) ? 256 : 128;
                i15 |= i29;
            } else {
                textResource2 = textResource;
            }
            i15 |= i29;
        } else {
            textResource2 = textResource;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                i15 |= c28655q.m87153g(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87151f(j7)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87151f(j13)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) != 0) {
                    i24 = 524288;
                } else {
                    if ((2097152 & i13) == 0) {
                        zM87157i = c28655q.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if ((i14 & 4) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -897;
                    } else {
                        c8691e = textResource2;
                    }
                    if (i34 != 0) {
                        f16 = null;
                    } else {
                        f16 = f14;
                    }
                    if ((i14 & 64) != 0) {
                        int i35 = i15 & (-3670017);
                        modifier4 = modifier2;
                        i17 = i35;
                        f17 = f16;
                        h7 = AbstractC2890e.m8450e().getH5();
                    } else {
                        int i36 = i15;
                        modifier4 = modifier2;
                        i17 = i36;
                        h7 = c2886a;
                        f17 = f16;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i14 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    int i37 = i15;
                    modifier4 = modifier2;
                    i17 = i37;
                    enumC17744g3 = enumC17744g;
                    h7 = c2886a;
                    c8691e = textResource2;
                    f17 = f14;
                }
                c28655q.m87175r();
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(-2041239585);
                i18 = i17 >> 6;
                i19 = i18 & 14;
                if (AbstractC8693b.m21274h(c8691e, c28655q, i19).length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(1328133552);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c8691e, c28655q, i19), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 2 * 4, 0.0f, 11), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(1328402105);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                m50935g(C23000t1.f90727a, enumC17744g3, j13, c28655q, ((i17 >> 9) & 896) | (i17 & 112) | 6);
                c28655q.m87173q(true);
                enumC17744g2 = enumC17744g3;
                modifier3 = modifier4;
                textResource3 = c8691e;
                c2886a2 = h7;
                f15 = f17;
            } else {
                c28655q.m87138X();
                enumC17744g2 = enumC17744g;
                c2886a2 = c2886a;
                modifier3 = modifier2;
                textResource3 = textResource2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.g2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17755i2.m50942n(modifier3, enumC17744g2, textResource3, f15, j7, j13, c2886a2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87151f(j7)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i26;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87151f(j13)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i24 = 524288;
            } else {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q.m87153g(c2886a);
                } else {
                    zM87157i = c28655q.m87157i(c2886a);
                }
                if (zM87157i) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
            }
            i15 |= i24;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource2;
                }
                if (i34 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    int i38 = i15 & (-3670017);
                    modifier4 = modifier2;
                    i17 = i38;
                    f17 = f16;
                    h7 = AbstractC2890e.m8450e().getH5();
                } else {
                    int i39 = i15;
                    modifier4 = modifier2;
                    i17 = i39;
                    h7 = c2886a;
                    f17 = f16;
                }
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource2;
                }
                if (i34 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    int i310 = i15 & (-3670017);
                    modifier4 = modifier2;
                    i17 = i310;
                    f17 = f16;
                    h7 = AbstractC2890e.m8450e().getH5();
                } else {
                    int i311 = i15;
                    modifier4 = modifier2;
                    i17 = i311;
                    h7 = c2886a;
                    f17 = f16;
                }
            }
            c28655q.m87175r();
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(-2041239585);
            i18 = i17 >> 6;
            i19 = i18 & 14;
            if (AbstractC8693b.m21274h(c8691e, c28655q, i19).length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                c28655q.m87150e0(1328133552);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c8691e, c28655q, i19), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 2 * 4, 0.0f, 11), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                z14 = false;
                c28655q.m87173q(false);
            } else {
                z14 = false;
                c28655q.m87150e0(1328402105);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            m50935g(C23000t1.f90727a, enumC17744g3, j13, c28655q, ((i17 >> 9) & 896) | (i17 & 112) | 6);
            c28655q.m87173q(true);
            enumC17744g2 = enumC17744g3;
            modifier3 = modifier4;
            textResource3 = c8691e;
            c2886a2 = h7;
            f15 = f17;
        } else {
            c28655q.m87138X();
            enumC17744g2 = enumC17744g;
            c2886a2 = c2886a;
            modifier3 = modifier2;
            textResource3 = textResource2;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.g2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC17755i2.m50942n(modifier3, enumC17744g2, textResource3, f15, j7, j13, c2886a2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m50942n(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, int i13, int i14, Composer composer, int i15) {
        m50941m(modifier, enumC17744g, textResource, f13, j7, j13, c2886a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x0188  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0224  */
    /* JADX WARN: Code duplicated, block: B:128:0x0236  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX INFO: renamed from: o */
    private static final void m50943o(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Float f14;
        boolean z4;
        TextResource textResource2;
        C2886a c2886a2;
        Modifier modifier3;
        Float f15;
        EnumC17744g enumC17744g2;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        EnumC17744g enumC17744g3;
        TextResource c8691e;
        Float f16;
        C2886a c2886a3;
        int i17;
        TextResource textResource3;
        Float f17;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        boolean z13;
        boolean z14;
        int i24;
        boolean zM87157i;
        int i25;
        int i26;
        C2886a h7 = c2886a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-289855745);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC17744g == null ? -1 : enumC17744g.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87153g(textResource)) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                i15 |= c28655q.m87153g(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87151f(j7)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87151f(j13)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) != 0) {
                    i24 = 524288;
                } else {
                    if ((2097152 & i13) == 0) {
                        zM87157i = c28655q.m87153g(h7);
                    } else {
                        zM87157i = c28655q.m87157i(h7);
                    }
                    if (zM87157i) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        enumC17744g3 = EnumC17744g.SOLID;
                    } else {
                        enumC17744g3 = enumC17744g;
                    }
                    if ((i14 & 4) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -897;
                    } else {
                        c8691e = textResource;
                    }
                    if (i29 != 0) {
                        f16 = null;
                    } else {
                        f16 = f14;
                    }
                    if ((i14 & 64) != 0) {
                        h7 = AbstractC2890e.m8450e().getH5();
                        i15 &= -3670017;
                    }
                    c2886a3 = h7;
                    i17 = i15;
                    textResource3 = c8691e;
                    f17 = f16;
                    modifier4 = modifier2;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i14 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    enumC17744g3 = enumC17744g;
                    c2886a3 = h7;
                    modifier4 = modifier2;
                    i17 = i15;
                    f17 = f14;
                    textResource3 = textResource;
                }
                c28655q.m87175r();
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                m50935g(C23000t1.f90727a, enumC17744g3, j13, c28655q, (i17 & 112) | 6 | ((i17 >> 9) & 896));
                c28655q.m87150e0(1028120466);
                i18 = i17 >> 6;
                i19 = i18 & 14;
                if (AbstractC8693b.m21274h(textResource3, c28655q, i19).length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(-1140016385);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, i19), AbstractC1099a.m3396r(c2314t, 2 * 4, 0.0f, 2), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1139717080);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(true);
                enumC17744g2 = enumC17744g3;
                textResource2 = textResource3;
                modifier3 = modifier4;
                c2886a2 = c2886a3;
                f15 = f17;
            } else {
                c28655q.m87138X();
                textResource2 = textResource;
                c2886a2 = h7;
                modifier3 = modifier2;
                f15 = f14;
                enumC17744g2 = enumC17744g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17751h2(modifier3, enumC17744g2, textResource2, f15, j7, j13, c2886a2, i13, i14, 0);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87151f(j7)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i26;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87151f(j13)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i24 = 524288;
            } else {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q.m87153g(h7);
                } else {
                    zM87157i = c28655q.m87157i(h7);
                }
                if (zM87157i) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
            }
            i15 |= i24;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource;
                }
                if (i29 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    h7 = AbstractC2890e.m8450e().getH5();
                    i15 &= -3670017;
                }
                c2886a3 = h7;
                i17 = i15;
                textResource3 = c8691e;
                f17 = f16;
                modifier4 = modifier2;
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    enumC17744g3 = EnumC17744g.SOLID;
                } else {
                    enumC17744g3 = enumC17744g;
                }
                if ((i14 & 4) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -897;
                } else {
                    c8691e = textResource;
                }
                if (i29 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if ((i14 & 64) != 0) {
                    h7 = AbstractC2890e.m8450e().getH5();
                    i15 &= -3670017;
                }
                c2886a3 = h7;
                i17 = i15;
                textResource3 = c8691e;
                f17 = f16;
                modifier4 = modifier2;
            }
            c28655q.m87175r();
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            m50935g(C23000t1.f90727a, enumC17744g3, j13, c28655q, (i17 & 112) | 6 | ((i17 >> 9) & 896));
            c28655q.m87150e0(1028120466);
            i18 = i17 >> 6;
            i19 = i18 & 14;
            if (AbstractC8693b.m21274h(textResource3, c28655q, i19).length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                c28655q.m87150e0(-1140016385);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, i19), AbstractC1099a.m3396r(c2314t, 2 * 4, 0.0f, 2), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, f17, c28655q, (i18 & 896) | 48, (3670016 & i17) | ((i17 << 12) & 29360128), 65528);
                z14 = false;
                c28655q.m87173q(false);
            } else {
                z14 = false;
                c28655q.m87150e0(-1139717080);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(true);
            enumC17744g2 = enumC17744g3;
            textResource2 = textResource3;
            modifier3 = modifier4;
            c2886a2 = c2886a3;
            f15 = f17;
        } else {
            c28655q.m87138X();
            textResource2 = textResource;
            c2886a2 = h7;
            modifier3 = modifier2;
            f15 = f14;
            enumC17744g2 = enumC17744g;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17751h2(modifier3, enumC17744g2, textResource2, f15, j7, j13, c2886a2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m50944p(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, int i13, int i14, Composer composer, int i15) {
        m50943o(modifier, enumC17744g, textResource, f13, j7, j13, c2886a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m50945q(Modifier modifier, EnumC17744g enumC17744g, EnumC17740f enumC17740f, TextResource textResource, Float f13, long j7, long j13, EnumC2888c enumC2888c, int i13, int i14, Composer composer, int i15) {
        m50938j(modifier, enumC17744g, enumC17740f, textResource, f13, j7, j13, enumC2888c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
