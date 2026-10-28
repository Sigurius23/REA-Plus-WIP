package c41;

import a11.C0129g;
import a11.C0134l;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import ly0.AbstractC24801e;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22961h;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import rz0.EnumC31927f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: c41.v5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0097\u0001\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly71/g;", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "currentStatText", "historicStatText", "arrowIcon", "Li2/x;", "arrowTint", "", "showCTA", "Lcom/whoop/util/TrendKey;", "trendKey", "Lrz0/f;", "style", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "content", "e", "(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4137v5 {
    /* JADX WARN: Code duplicated, block: B:102:0x013d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x020b  */
    /* JADX WARN: Code duplicated, block: B:170:0x024f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0265  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    /* JADX INFO: renamed from: e */
    public static final void m12842e(Modifier modifier, final C39274g c39274g, final TextResource title, final TextResource currentStatText, TextResource textResource, C39274g c39274g2, long j7, boolean z4, TrendKey trendKey, EnumC31927f enumC31927f, Function1 function1, final InterfaceC4351m content, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        TextResource textResource2;
        int i17;
        C39274g c39274g3;
        int i18;
        int i19;
        long j13;
        int i24;
        int i25;
        int i26;
        int i27;
        int iOrdinal;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        Function1 function2;
        int i37;
        int i38;
        boolean z13;
        C28655q c28655q;
        final Modifier modifier2;
        final boolean z14;
        final TrendKey trendKey2;
        final EnumC31927f enumC31927f2;
        final Function1 function3;
        final long j14;
        final C39274g c39274g4;
        final TextResource textResource3;
        C28677v1 c28677v1M87180u;
        final Modifier modifier3;
        final TextResource textResource4;
        int i39;
        final C39274g c39274g5;
        final long j15;
        final boolean z15;
        TrendKey trendKey3;
        EnumC31927f enumC31927f3;
        final Function1 function4;
        final FeatureFlagChecker featureFlagChecker;
        final boolean z16;
        Object objM87133R;
        int i44;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(797055129);
        int i45 = i15 & 1;
        if (i45 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(c39274g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87153g(title) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q2.m87153g(currentStatText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i46 = i15 & 16;
        if (i46 == 0) {
            if ((i13 & 24576) == 0) {
                textResource2 = textResource;
                i16 |= c28655q2.m87153g(textResource2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                c39274g3 = c39274g2;
            } else {
                c39274g3 = c39274g2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87153g(c39274g3)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                j13 = j7;
            } else {
                j13 = j7;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87151f(j13)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (trendKey == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = trendKey.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 512;
                if (i29 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87149e(enumC31927f != null ? enumC31927f.ordinal() : -1)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i16 |= i34;
                    }
                    i35 = i16;
                    i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i36 != 0) {
                        i37 = i14 | 6;
                        function2 = function1;
                    } else if ((i14 & 6) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i14 | i38;
                    } else {
                        function2 = function1;
                        i37 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(content)) {
                            i44 = 32;
                        } else {
                            i44 = 16;
                        }
                        i37 |= i44;
                    }
                    if ((i35 & 306783379) == 306783378 || (i37 & 19) != 18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q2.m87135U(i35 & 1, z13)) {
                        if (i45 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i46 != 0) {
                            textResource4 = null;
                        } else {
                            textResource4 = textResource2;
                        }
                        if (i17 != 0) {
                            c39274g5 = null;
                            i39 = i25;
                        } else {
                            i39 = i25;
                            c39274g5 = c39274g3;
                        }
                        if (i19 != 0) {
                            j15 = C17919x.f69636m;
                        } else {
                            j15 = j13;
                        }
                        if (i39 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i27 != 0) {
                            trendKey3 = TrendKey.NONE;
                        } else {
                            trendKey3 = trendKey;
                        }
                        if (i29 != 0) {
                            enumC31927f3 = EnumC31927f.DEFAULT;
                        } else {
                            enumC31927f3 = enumC31927f;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C0129g(20);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        } else {
                            function4 = function2;
                        }
                        featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                        if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        final TrendKey trendKey4 = trendKey3;
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: c41.t5
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4137v5.m12844g(trendKey4, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                            }
                        };
                        boolean z17 = z15;
                        textResource2 = textResource4;
                        long j16 = j15;
                        Modifier modifier4 = modifier3;
                        EnumC31927f enumC31927f4 = enumC31927f3;
                        AbstractC31926e.m99375j(null, enumC31927f4, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                        c39274g4 = c39274g5;
                        enumC31927f2 = enumC31927f4;
                        j14 = j16;
                        trendKey2 = trendKey4;
                        z14 = z17;
                        function3 = function4;
                        modifier2 = modifier4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        z14 = z4;
                        trendKey2 = trendKey;
                        enumC31927f2 = enumC31927f;
                        function3 = function2;
                        j14 = j13;
                        c39274g4 = c39274g3;
                    }
                    textResource3 = textResource2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 805306368;
                i35 = i16;
                i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i14 | 6;
                    function2 = function1;
                } else if ((i14 & 6) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i14 | i38;
                } else {
                    function2 = function1;
                    i37 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(content)) {
                        i44 = 32;
                    } else {
                        i44 = 16;
                    }
                    i37 |= i44;
                }
                if ((i35 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i35 & 1, z13)) {
                    if (i45 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i46 != 0) {
                        textResource4 = null;
                    } else {
                        textResource4 = textResource2;
                    }
                    if (i17 != 0) {
                        c39274g5 = null;
                        i39 = i25;
                    } else {
                        i39 = i25;
                        c39274g5 = c39274g3;
                    }
                    if (i19 != 0) {
                        j15 = C17919x.f69636m;
                    } else {
                        j15 = j13;
                    }
                    if (i39 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i27 != 0) {
                        trendKey3 = TrendKey.NONE;
                    } else {
                        trendKey3 = trendKey;
                    }
                    if (i29 != 0) {
                        enumC31927f3 = EnumC31927f.DEFAULT;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C0129g(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    final TrendKey trendKey5 = trendKey3;
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: c41.t5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12844g(trendKey5, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                        }
                    };
                    boolean z18 = z15;
                    textResource2 = textResource4;
                    long j17 = j15;
                    Modifier modifier5 = modifier3;
                    EnumC31927f enumC31927f5 = enumC31927f3;
                    AbstractC31926e.m99375j(null, enumC31927f5, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m2), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                    c39274g4 = c39274g5;
                    enumC31927f2 = enumC31927f5;
                    j14 = j17;
                    trendKey2 = trendKey5;
                    z14 = z18;
                    function3 = function4;
                    modifier2 = modifier5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z14 = z4;
                    trendKey2 = trendKey;
                    enumC31927f2 = enumC31927f;
                    function3 = function2;
                    j14 = j13;
                    c39274g4 = c39274g3;
                }
                textResource3 = textResource2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i27 = i27;
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87149e(enumC31927f != null ? enumC31927f.ordinal() : -1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i16;
                i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i14 | 6;
                    function2 = function1;
                } else if ((i14 & 6) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i14 | i38;
                } else {
                    function2 = function1;
                    i37 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(content)) {
                        i44 = 32;
                    } else {
                        i44 = 16;
                    }
                    i37 |= i44;
                }
                if ((i35 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i35 & 1, z13)) {
                    if (i45 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i46 != 0) {
                        textResource4 = null;
                    } else {
                        textResource4 = textResource2;
                    }
                    if (i17 != 0) {
                        c39274g5 = null;
                        i39 = i25;
                    } else {
                        i39 = i25;
                        c39274g5 = c39274g3;
                    }
                    if (i19 != 0) {
                        j15 = C17919x.f69636m;
                    } else {
                        j15 = j13;
                    }
                    if (i39 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i27 != 0) {
                        trendKey3 = TrendKey.NONE;
                    } else {
                        trendKey3 = trendKey;
                    }
                    if (i29 != 0) {
                        enumC31927f3 = EnumC31927f.DEFAULT;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C0129g(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    final TrendKey trendKey6 = trendKey3;
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: c41.t5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12844g(trendKey6, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                        }
                    };
                    boolean z19 = z15;
                    textResource2 = textResource4;
                    long j18 = j15;
                    Modifier modifier6 = modifier3;
                    EnumC31927f enumC31927f6 = enumC31927f3;
                    AbstractC31926e.m99375j(null, enumC31927f6, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m3), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                    c39274g4 = c39274g5;
                    enumC31927f2 = enumC31927f6;
                    j14 = j18;
                    trendKey2 = trendKey6;
                    z14 = z19;
                    function3 = function4;
                    modifier2 = modifier6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z14 = z4;
                    trendKey2 = trendKey;
                    enumC31927f2 = enumC31927f;
                    function3 = function2;
                    j14 = j13;
                    c39274g4 = c39274g3;
                }
                textResource3 = textResource2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            i35 = i16;
            i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i14 | 6;
                function2 = function1;
            } else if ((i14 & 6) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i14 | i38;
            } else {
                function2 = function1;
                i37 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(content)) {
                    i44 = 32;
                } else {
                    i44 = 16;
                }
                i37 |= i44;
            }
            if ((i35 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i35 & 1, z13)) {
                if (i45 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i46 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource2;
                }
                if (i17 != 0) {
                    c39274g5 = null;
                    i39 = i25;
                } else {
                    i39 = i25;
                    c39274g5 = c39274g3;
                }
                if (i19 != 0) {
                    j15 = C17919x.f69636m;
                } else {
                    j15 = j13;
                }
                if (i39 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                if (i27 != 0) {
                    trendKey3 = TrendKey.NONE;
                } else {
                    trendKey3 = trendKey;
                }
                if (i29 != 0) {
                    enumC31927f3 = EnumC31927f.DEFAULT;
                } else {
                    enumC31927f3 = enumC31927f;
                }
                if (i36 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                final TrendKey trendKey7 = trendKey3;
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: c41.t5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12844g(trendKey7, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                    }
                };
                boolean z110 = z15;
                textResource2 = textResource4;
                long j19 = j15;
                Modifier modifier7 = modifier3;
                EnumC31927f enumC31927f7 = enumC31927f3;
                AbstractC31926e.m99375j(null, enumC31927f7, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m4), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                c39274g4 = c39274g5;
                enumC31927f2 = enumC31927f7;
                j14 = j19;
                trendKey2 = trendKey7;
                z14 = z110;
                function3 = function4;
                modifier2 = modifier7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                z14 = z4;
                trendKey2 = trendKey;
                enumC31927f2 = enumC31927f;
                function3 = function2;
                j14 = j13;
                c39274g4 = c39274g3;
            }
            textResource3 = textResource2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        textResource2 = textResource;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c39274g3 = c39274g2;
        } else {
            c39274g3 = c39274g2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87153g(c39274g3)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            j13 = j7;
        } else {
            j13 = j7;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87151f(j13)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 128;
        if (i25 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q2.m87155h(z4)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i16 |= i26;
        }
        i27 = i15 & 256;
        if (i27 != 0) {
            if ((i13 & 100663296) == 0) {
                if (trendKey == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = trendKey.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87149e(enumC31927f != null ? enumC31927f.ordinal() : -1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i16;
                i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i14 | 6;
                    function2 = function1;
                } else if ((i14 & 6) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i14 | i38;
                } else {
                    function2 = function1;
                    i37 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(content)) {
                        i44 = 32;
                    } else {
                        i44 = 16;
                    }
                    i37 |= i44;
                }
                if ((i35 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i35 & 1, z13)) {
                    if (i45 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i46 != 0) {
                        textResource4 = null;
                    } else {
                        textResource4 = textResource2;
                    }
                    if (i17 != 0) {
                        c39274g5 = null;
                        i39 = i25;
                    } else {
                        i39 = i25;
                        c39274g5 = c39274g3;
                    }
                    if (i19 != 0) {
                        j15 = C17919x.f69636m;
                    } else {
                        j15 = j13;
                    }
                    if (i39 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i27 != 0) {
                        trendKey3 = TrendKey.NONE;
                    } else {
                        trendKey3 = trendKey;
                    }
                    if (i29 != 0) {
                        enumC31927f3 = EnumC31927f.DEFAULT;
                    } else {
                        enumC31927f3 = enumC31927f;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C0129g(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    final TrendKey trendKey8 = trendKey3;
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: c41.t5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12844g(trendKey8, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                        }
                    };
                    boolean z111 = z15;
                    textResource2 = textResource4;
                    long j110 = j15;
                    Modifier modifier8 = modifier3;
                    EnumC31927f enumC31927f8 = enumC31927f3;
                    AbstractC31926e.m99375j(null, enumC31927f8, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m5), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                    c39274g4 = c39274g5;
                    enumC31927f2 = enumC31927f8;
                    j14 = j110;
                    trendKey2 = trendKey8;
                    z14 = z111;
                    function3 = function4;
                    modifier2 = modifier8;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z14 = z4;
                    trendKey2 = trendKey;
                    enumC31927f2 = enumC31927f;
                    function3 = function2;
                    j14 = j13;
                    c39274g4 = c39274g3;
                }
                textResource3 = textResource2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            i35 = i16;
            i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i14 | 6;
                function2 = function1;
            } else if ((i14 & 6) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i14 | i38;
            } else {
                function2 = function1;
                i37 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(content)) {
                    i44 = 32;
                } else {
                    i44 = 16;
                }
                i37 |= i44;
            }
            if ((i35 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i35 & 1, z13)) {
                if (i45 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i46 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource2;
                }
                if (i17 != 0) {
                    c39274g5 = null;
                    i39 = i25;
                } else {
                    i39 = i25;
                    c39274g5 = c39274g3;
                }
                if (i19 != 0) {
                    j15 = C17919x.f69636m;
                } else {
                    j15 = j13;
                }
                if (i39 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                if (i27 != 0) {
                    trendKey3 = TrendKey.NONE;
                } else {
                    trendKey3 = trendKey;
                }
                if (i29 != 0) {
                    enumC31927f3 = EnumC31927f.DEFAULT;
                } else {
                    enumC31927f3 = enumC31927f;
                }
                if (i36 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                final TrendKey trendKey9 = trendKey3;
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: c41.t5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12844g(trendKey9, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                    }
                };
                boolean z112 = z15;
                textResource2 = textResource4;
                long j111 = j15;
                Modifier modifier9 = modifier3;
                EnumC31927f enumC31927f9 = enumC31927f3;
                AbstractC31926e.m99375j(null, enumC31927f9, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m6), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                c39274g4 = c39274g5;
                enumC31927f2 = enumC31927f9;
                j14 = j111;
                trendKey2 = trendKey9;
                z14 = z112;
                function3 = function4;
                modifier2 = modifier9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                z14 = z4;
                trendKey2 = trendKey;
                enumC31927f2 = enumC31927f;
                function3 = function2;
                j14 = j13;
                c39274g4 = c39274g3;
            }
            textResource3 = textResource2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        i27 = i27;
        i29 = i15 & 512;
        if (i29 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87149e(enumC31927f != null ? enumC31927f.ordinal() : -1)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i16 |= i34;
            }
            i35 = i16;
            i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i14 | 6;
                function2 = function1;
            } else if ((i14 & 6) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i14 | i38;
            } else {
                function2 = function1;
                i37 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(content)) {
                    i44 = 32;
                } else {
                    i44 = 16;
                }
                i37 |= i44;
            }
            if ((i35 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i35 & 1, z13)) {
                if (i45 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i46 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource2;
                }
                if (i17 != 0) {
                    c39274g5 = null;
                    i39 = i25;
                } else {
                    i39 = i25;
                    c39274g5 = c39274g3;
                }
                if (i19 != 0) {
                    j15 = C17919x.f69636m;
                } else {
                    j15 = j13;
                }
                if (i39 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                if (i27 != 0) {
                    trendKey3 = TrendKey.NONE;
                } else {
                    trendKey3 = trendKey;
                }
                if (i29 != 0) {
                    enumC31927f3 = EnumC31927f.DEFAULT;
                } else {
                    enumC31927f3 = enumC31927f;
                }
                if (i36 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                final TrendKey trendKey10 = trendKey3;
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: c41.t5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12844g(trendKey10, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                    }
                };
                boolean z113 = z15;
                textResource2 = textResource4;
                long j112 = j15;
                Modifier modifier10 = modifier3;
                EnumC31927f enumC31927f10 = enumC31927f3;
                AbstractC31926e.m99375j(null, enumC31927f10, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m7), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
                c39274g4 = c39274g5;
                enumC31927f2 = enumC31927f10;
                j14 = j112;
                trendKey2 = trendKey10;
                z14 = z113;
                function3 = function4;
                modifier2 = modifier10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                z14 = z4;
                trendKey2 = trendKey;
                enumC31927f2 = enumC31927f;
                function3 = function2;
                j14 = j13;
                c39274g4 = c39274g3;
            }
            textResource3 = textResource2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 805306368;
        i35 = i16;
        i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i36 != 0) {
            i37 = i14 | 6;
            function2 = function1;
        } else if ((i14 & 6) == 0) {
            function2 = function1;
            if (c28655q2.m87157i(function2)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i37 = i14 | i38;
        } else {
            function2 = function1;
            i37 = i14;
        }
        if ((i14 & 48) == 0) {
            if (c28655q2.m87157i(content)) {
                i44 = 32;
            } else {
                i44 = 16;
            }
            i37 |= i44;
        }
        if ((i35 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i35 & 1, z13)) {
            if (i45 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            if (i46 != 0) {
                textResource4 = null;
            } else {
                textResource4 = textResource2;
            }
            if (i17 != 0) {
                c39274g5 = null;
                i39 = i25;
            } else {
                i39 = i25;
                c39274g5 = c39274g3;
            }
            if (i19 != 0) {
                j15 = C17919x.f69636m;
            } else {
                j15 = j13;
            }
            if (i39 != 0) {
                z15 = false;
            } else {
                z15 = z4;
            }
            if (i27 != 0) {
                trendKey3 = TrendKey.NONE;
            } else {
                trendKey3 = trendKey;
            }
            if (i29 != 0) {
                enumC31927f3 = EnumC31927f.DEFAULT;
            } else {
                enumC31927f3 = enumC31927f;
            }
            if (i36 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C0129g(20);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z16 = true;
            } else {
                z16 = true;
            }
            final TrendKey trendKey11 = trendKey3;
            c28655q = c28655q2;
            InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: c41.t5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4137v5.m12844g(trendKey11, function4, modifier3, content, z16, z15, featureFlagChecker, currentStatText, textResource4, c39274g5, j15, c39274g, title, (Composer) obj, iIntValue);
                }
            };
            boolean z114 = z15;
            textResource2 = textResource4;
            long j113 = j15;
            Modifier modifier11 = modifier3;
            EnumC31927f enumC31927f11 = enumC31927f3;
            AbstractC31926e.m99375j(null, enumC31927f11, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1580233687, c28655q, interfaceC4351m8), c28655q, ((i35 >> 24) & 112) | 12582912, 125);
            c39274g4 = c39274g5;
            enumC31927f2 = enumC31927f11;
            j14 = j113;
            trendKey2 = trendKey11;
            z14 = z114;
            function3 = function4;
            modifier2 = modifier11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            z14 = z4;
            trendKey2 = trendKey;
            enumC31927f2 = enumC31927f;
            function3 = function2;
            j14 = j13;
            c39274g4 = c39274g3;
        }
        textResource3 = textResource2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.u5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4137v5.m12846i(modifier2, c39274g, title, currentStatText, textResource3, c39274g4, j14, z14, trendKey2, enumC31927f2, function3, content, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12843f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12844g(TrendKey trendKey, Function1 function1, Modifier modifier, InterfaceC4351m interfaceC4351m, boolean z4, boolean z13, FeatureFlagChecker featureFlagChecker, TextResource textResource, TextResource textResource2, C39274g c39274g, long j7, C39274g c39274g2, TextResource textResource3, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        float f13;
        float f14;
        float f15;
        boolean z14;
        C2886a h7;
        boolean z15;
        long jM73366B;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f16 = 8;
            float f17 = 1 * f16;
            C2314t c2314t = C2314t.f9131w;
            float f18 = 4;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3405b(AbstractC1099a.m3395q(c2314t, ((float) 1.5d) * f16, f17), 0.0f, 12 * f18, 1));
            boolean z16 = trendKey != TrendKey.NONE;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(trendKey.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0134l(10, function1, trendKey);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, z16, null, null, (InterfaceC4339a) objM87133R, 14);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f19 = 2;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f19, f18, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (c39274g2 == null) {
                c28655q.m87150e0(-2004659314);
                c28655q.m87173q(false);
                i14 = 0;
                f15 = f19;
                f13 = 0.0f;
                f14 = 1.0f;
            } else {
                c28655q.m87150e0(-2004659313);
                i14 = 0;
                f13 = 0.0f;
                f14 = 1.0f;
                f15 = f19;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g2.getIcon(), c28655q, 6), AbstractC8693b.m21274h(c39274g2.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p((z4 ? 5 : 6) * f18, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(textResource3, c28655q, i14);
            if (f14 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14 > Float.MAX_VALUE ? Float.MAX_VALUE : f14, true);
            if (z4) {
                c28655q.m87150e0(489541748);
                h7 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                z14 = false;
            } else {
                z14 = false;
                c28655q.m87150e0(489542739);
                h7 = C38072d.f163053a.m121952e(c28655q, 6).getH5();
            }
            c28655q.m87173q(z14);
            C2886a c2886a = h7;
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement2, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, 0, 196600);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3396r(modifier, f17, f13, 2));
            interfaceC4351m.invoke(c28655q2, 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3396r(modifier, f15 * f16, f13, 2));
            if ((z4 || !z13) && !(z13 && featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_IA_CARET))) {
                c28655q2.m87150e0(-2092328442);
                AbstractC24801e.m72687g(AbstractC1099a.m3396r(c2314t, ((float) 0.75d) * f16, f13, 2), textResource, null, textResource2, c39274g, j7, false, c28655q2, 6, 68);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-2092829123);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q2, 6);
                if (z4) {
                    jM73366B = AbstractC31061c.m95627c(c28655q2, 2010706292, c38072d, c28655q2, 6);
                    z15 = false;
                } else {
                    z15 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q2, 2010707287, c38072d, c28655q2, 6);
                }
                c28655q2.m87173q(z15);
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(5 * f18, c2314t), "right caret"), jM73366B, c28655q2, 432, 0);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3396r(modifier, ((float) 0.25d) * f16, f13, 2));
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12845h(Function1 function1, TrendKey trendKey) {
        function1.invoke(trendKey);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12846i(Modifier modifier, C39274g c39274g, TextResource textResource, TextResource textResource2, TextResource textResource3, C39274g c39274g2, long j7, boolean z4, TrendKey trendKey, EnumC31927f enumC31927f, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15, Composer composer, int i16) {
        m12842e(modifier, c39274g, textResource, textResource2, textResource3, c39274g2, j7, z4, trendKey, enumC31927f, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
