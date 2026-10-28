package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import bm2.C3466p;
import bz0.C3713c;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.io.IOException;
import kd1.EnumC22400l;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: c41.l0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ak\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a7\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lc41/n0;", "type", "Lkd1/l;", "navType", "Lcom/whoop/navigation/e;", "destination", "", "dismissalId", "Lkotlin/Function1;", "", "Ll83/a0;", "onClick", "i", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "leftIcon", "Li2/x;", "color", "q", "(IJLandroidx/compose/runtime/Composer;I)V", "s", "(Landroidx/compose/runtime/Composer;I)V", "id", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4062l0 {
    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0165  */
    /* JADX WARN: Code duplicated, block: B:107:0x016a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0194  */
    /* JADX WARN: Code duplicated, block: B:111:0x0198  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0207  */
    /* JADX WARN: Code duplicated, block: B:139:0x0263  */
    /* JADX WARN: Code duplicated, block: B:142:0x0276  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[PHI: r17
      0x009a: PHI (r17v11 int) = (r17v0 int), (r17v5 int), (r17v6 int) binds: [B:46:0x0098, B:56:0x00b3, B:55:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX INFO: renamed from: i */
    public static final void m12421i(Modifier modifier, TextResource title, TextResource textResource, AbstractC4076n0 type, EnumC22400l navType, C9598e c9598e, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        String str2;
        int i19;
        int i24;
        int i25;
        boolean z4;
        C28655q c28655q;
        TextResource textResource2;
        C9598e c9598e2;
        Function1 function2;
        Modifier modifier3;
        String str3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        TextResource textResource3;
        C9598e c9598e3;
        String str4;
        C28676v0 c28676v0;
        Function1 function3;
        Modifier modifierM44456i;
        Modifier modifierMo3471e;
        int iHashCode;
        C0213j c0213j;
        int i26;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        int i27;
        int i28;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(navType, "navType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1930164539);
        int i29 = i14 & 1;
        if (i29 != 0) {
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
            i15 |= c28655q2.m87153g(title) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q2.m87153g(textResource) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87153g(type)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i28;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87149e(navType.ordinal())) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i16 = i14 & 32;
            i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q2.m87153g(c9598e);
                } else {
                    zM87157i = c28655q2.m87157i(c9598e);
                }
                if (zM87157i) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                str2 = str;
            } else {
                str2 = str;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i34 != 0) {
                    textResource3 = null;
                } else {
                    textResource3 = textResource;
                }
                c9598e3 = i16 == 0 ? c9598e : null;
                if (i18 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(7);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                modifierM44456i = AbstractC15751g.m44456i(1, c2314t, AbstractC15673b0.m43983F0(), AbstractC33253j.m105489e(4 * 3));
                FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (type.equals(AbstractC4076n0.b.f16557d)) {
                    modifierMo3471e = modifier4.mo3471e(modifierM44456i);
                } else {
                    modifierMo3471e = modifier4;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                Modifier modifier5 = modifier4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                TextResource textResource4 = textResource3;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                i26 = i15;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "AlertTileTag");
                if ((i26 & 458752) != 131072 || ((i26 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && c28655q2.m87157i(c9598e3))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i26 & 29360128) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z13 | z14;
                if ((i26 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z17 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16 || objM87133R == c28676v0) {
                    objM87133R = new C3718c(c9598e3, function3, navType, 24);
                    c28655q2.m87172p0(objM87133R);
                }
                C9598e c9598e4 = c9598e3;
                String str5 = str4;
                modifier3 = modifier5;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack(), null, null, null, 0.0f, AbstractC37817c.m121344e(-1064719269, c28655q2, new C3466p(type, str5, function3, navType, c9598e4, title, textResource4, featureFlagChecker)), c28655q2, 12582912, 122);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                function2 = function3;
                c9598e2 = c9598e4;
                textResource2 = textResource4;
                str3 = str5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                textResource2 = textResource;
                c9598e2 = c9598e;
                function2 = function1;
                modifier3 = modifier2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) modifier3, (Object) title, (Object) textResource2, (Object) type, (Object) navType, (Object) c9598e2, (Object) str3, function2, i13, i14, 3);
            }
        }
        i15 |= 384;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87153g(type)) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i28;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87149e(navType.ordinal())) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        i16 = i14 & 32;
        i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i = c28655q2.m87153g(c9598e);
            } else {
                zM87157i = c28655q2.m87157i(c9598e);
            }
            if (zM87157i) {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i17;
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            str2 = str;
        } else {
            str2 = str;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(function1)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        if ((i15 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i34 != 0) {
                textResource3 = null;
            } else {
                textResource3 = textResource;
            }
            if (i16 == 0) {
            }
            if (i18 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3929m(7);
                    c28655q2.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            modifierM44456i = AbstractC15751g.m44456i(1, c2314t, AbstractC15673b0.m43983F0(), AbstractC33253j.m105489e(4 * 3));
            FeatureFlagChecker featureFlagChecker2 = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            if (type.equals(AbstractC4076n0.b.f16557d)) {
                modifierMo3471e = modifier4.mo3471e(modifierM44456i);
            } else {
                modifierMo3471e = modifier4;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            Modifier modifier6 = modifier4;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            TextResource textResource5 = textResource3;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            i26 = i15;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "AlertTileTag");
            if ((i26 & 458752) != 131072) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i26 & 29360128) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z18 = z13 | z14;
            if ((i26 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z18 | z15;
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C3718c(c9598e3, function3, navType, 24);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3718c(c9598e3, function3, navType, 24);
                c28655q2.m87172p0(objM87133R);
            }
            C9598e c9598e5 = c9598e3;
            String str6 = str4;
            modifier3 = modifier6;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack(), null, null, null, 0.0f, AbstractC37817c.m121344e(-1064719269, c28655q2, new C3466p(type, str6, function3, navType, c9598e5, title, textResource5, featureFlagChecker2)), c28655q2, 12582912, 122);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            function2 = function3;
            c9598e2 = c9598e5;
            textResource2 = textResource5;
            str3 = str6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            textResource2 = textResource;
            c9598e2 = c9598e;
            function2 = function1;
            modifier3 = modifier2;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b((Object) modifier3, (Object) title, (Object) textResource2, (Object) type, (Object) navType, (Object) c9598e2, (Object) str3, function2, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12422j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12423k(C9598e c9598e, Function1 function1, EnumC22400l enumC22400l) {
        if (c9598e != null) {
            function1.invoke(c9598e);
        } else {
            function1.invoke(enumC22400l);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12424l(AbstractC4076n0 abstractC4076n0, String str, Function1 function1, EnumC22400l enumC22400l, C9598e c9598e, TextResource textResource, TextResource textResource2, FeatureFlagChecker featureFlagChecker, Composer composer, int i13) throws XmlPullParserException, IOException {
        C0209i c0209i;
        C17919x c17919xM31989h;
        long jMo134584toComposableColorWaAFU9c;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (AbstractC22676k.m65745e(abstractC4076n0, AbstractC4076n0.b.f16557d)) {
                c28655q.m87150e0(-1127488544);
                c0209i = c0209i3;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(abstractC4076n0.getIcon(), c28655q, 6), null, AbstractC1099a.m3394p(1 * f13, c2314t), abstractC4076n0.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c0209i = c0209i3;
                c28655q.m87150e0(-1127168779);
                m12429q(abstractC4076n0.getIcon(), abstractC4076n0.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8438s = c38072d.m121952e(c28655q, 6).getH5();
            EnumC39333f enumC39333fM12516c = abstractC4076n0.getTitleTint();
            if (enumC39333fM12516c == null) {
                c28655q.m87150e0(2099088889);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-763571448);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM12516c.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(-763570360);
                jMo134584toComposableColorWaAFU9c = abstractC4076n0.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-763571910);
                c28655q.m87173q(false);
                jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
            }
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            if (textResource2 == null) {
                c28655q2.m87150e0(2099218996);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2099218997);
                if (featureFlagChecker.isFeatureEnabled("use-markdown-in-alert-tile-android")) {
                    c28655q2.m87150e0(1791477316);
                    AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResource2, c28655q2, 0), null, false, C21053l.f79834a.m58880a(c38072d.m121952e(c28655q2, 6).getB3().getStyle(), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, 0, 0, 0, false, c28655q2, 0, 502);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1791916989);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB3(), null, c28655q2, 0, 0, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (str != null && str.length() != 0) {
                c28655q2.m87150e0(-1125708121);
                m12426n(null, str, function1, c28655q2, 0, 1);
                c28655q2.m87173q(false);
            } else if (enumC22400l == EnumC22400l.UNKNOWN && c9598e == null) {
                c28655q2.m87150e0(-1125504637);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1125553648);
                m12431s(c28655q2, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12425m(Modifier modifier, TextResource textResource, TextResource textResource2, AbstractC4076n0 abstractC4076n0, EnumC22400l enumC22400l, C9598e c9598e, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12421i(modifier, textResource, textResource2, abstractC4076n0, enumC22400l, c9598e, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m12426n(Modifier modifier, String str, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(47719699);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            if (str == null || str.length() == 0) {
                c28655q.m87150e0(-16141937);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-16479248);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.CROSS.toWhoopIcon(), c28655q, 6);
                Modifier modifierM3411h = AbstractC1102d.m3411h(3 * 4, modifier4);
                boolean z4 = ((i15 & 896) == 256) | ((i15 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4048j0(function1, str, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1092a.m3362g(modifierM3411h, false, null, null, (InterfaceC4339a) objM87133R, 15), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4055k0(modifier3, str, function1, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12427o(Function1 function1, String str) {
        function1.invoke(new InterfaceC4027g0.a(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m12428p(Modifier modifier, String str, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m12426n(modifier, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m12429q(int i13, long j7, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(492964647);
        if ((i14 & 6) == 0) {
            i15 = i14 | (c28655q.m87149e(i13) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            float f14 = 1;
            Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(6 * f13, c2314t), f14, f13, C17919x.m51541c(0.15f, j7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 << 3) & 112) | 6), null, AbstractC1099a.m3394p(f14 * 8, c2314t), j7, c28655q, ((i15 << 6) & 7168) | 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4041i0(i13, i14, j7, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m12430r(int i13, long j7, int i14, Composer composer, int i15) {
        m12429q(i13, j7, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m12431s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1603735854);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getForwardArrow(), c28655q, 6), null, AbstractC1102d.m3411h(3 * 4, C2314t.f9131w), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m12432t(int i13, Composer composer, int i14) {
        m12431s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
