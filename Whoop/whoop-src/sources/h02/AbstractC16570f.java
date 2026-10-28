package h02;

import a01.C0086f;
import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ao2.C1877b;
import aw0.C2103c;
import az1.C2165f;
import b02.C2201e;
import b02.InterfaceC2199c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import mz1.AbstractC26039b;
import mz1.AbstractC26041d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p178gz.C16283a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import uv0.AbstractC35283c;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: h02.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lb02/e;", "viewState", "", "slug", "sku", "source", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Lb02/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isUpsellShop", "l", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16570f {
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m46950f(C2201e viewState, String slug, String str, String str2, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(slug, "slug");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1188804678);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(slug) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(20011896);
                    m46956l(AbstractC26041d.m77465c(str2, (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())), modifier2, c28655q, (i15 >> 12) & 112, 0);
                    c28655q.m87173q(false);
                } else if (viewState.getData() != null) {
                    c28655q.m87150e0(20016109);
                    modifier3 = modifier2;
                    int i17 = i15 >> 6;
                    AbstractC16578j.m47012k(viewState.getData(), viewState.getCartIndicator(), onViewEvent, modifier3, c28655q, (C1877b.f7412d << 3) | (i17 & 896) | (i17 & 7168), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(20022299);
                    m46952h(slug, str, str2, onViewEvent, modifier2, c28655q, (i15 >> 3) & 65534, 0);
                    modifier3 = modifier2;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(viewState, slug, str, str2, onViewEvent, modifier3, i13, i14);
                }
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(viewState, slug, str, str2, onViewEvent, modifier3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(20011896);
                m46956l(AbstractC26041d.m77465c(str2, (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())), modifier2, c28655q, (i15 >> 12) & 112, 0);
                c28655q.m87173q(false);
            } else if (viewState.getData() != null) {
                c28655q.m87150e0(20016109);
                modifier3 = modifier2;
                int i18 = i15 >> 6;
                AbstractC16578j.m47012k(viewState.getData(), viewState.getCartIndicator(), onViewEvent, modifier3, c28655q, (C1877b.f7412d << 3) | (i18 & 896) | (i18 & 7168), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(20022299);
                m46952h(slug, str, str2, onViewEvent, modifier2, c28655q, (i15 >> 3) & 65534, 0);
                modifier3 = modifier2;
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(viewState, slug, str, str2, onViewEvent, modifier3, i13, i14);
            }
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(viewState, slug, str, str2, onViewEvent, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m46951g(C2201e c2201e, String str, String str2, String str3, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46950f(c2201e, str, str2, str3, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private static final void m46952h(String str, String str2, String str3, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        boolean z4;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1147041138);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                i15 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, i17, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                Modifier modifier4 = modifier3;
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150176N, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z25 = z14 | z13;
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z26 = z25 | z15;
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z26 | z16;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (!z17 || objM87133R == c28676v0) {
                    z18 = true;
                    C1012d c1012d = new C1012d((Object) function1, str, (Object) str2, (Object) str3, 12);
                    c28655q.m87172p0(c1012d);
                    objM87133R = c1012d;
                } else {
                    z18 = true;
                }
                z19 = z18;
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                c28655q = c28655q;
                AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(c2314t);
                if (i16 == 2048) {
                    z24 = z19;
                } else {
                    z24 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z24 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C16283a(function1, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC6719b.m20143d(modifierM66723l2, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                c28655q.m87173q(z19);
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(str, str2, str3, function1, modifier2, i13, i14);
            }
        }
        i15 |= 24576;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, i17, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            Modifier modifier5 = modifier3;
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
            Modifier modifierM66723l3 = AbstractC22953f.m66723l(c2314t);
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z27 = z14 | z13;
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z28 = z27 | z15;
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z28 | z16;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z17) {
                z18 = true;
                C1012d c1012d2 = new C1012d((Object) function1, str, (Object) str2, (Object) str3, 12);
                c28655q.m87172p0(c1012d2);
                objM87133R = c1012d2;
            } else {
                z18 = true;
                C1012d c1012d3 = new C1012d((Object) function1, str, (Object) str2, (Object) str3, 12);
                c28655q.m87172p0(c1012d3);
                objM87133R = c1012d3;
            }
            z19 = z18;
            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l3, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
            c28655q = c28655q;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
            Modifier modifierM66723l4 = AbstractC22953f.m66723l(c2314t);
            if (i16 == 2048) {
                z24 = z19;
            } else {
                z24 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z24) {
                objM87133R2 = new C16283a(function1, 4);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C16283a(function1, 4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(modifierM66723l4, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            c28655q.m87173q(z19);
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(str, str2, str3, function1, modifier2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m46953i(Function1 function1, String str, String str2, String str3) {
        function1.invoke(new InterfaceC2199c.j(str, str2, str3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46954j(Function1 function1) {
        function1.invoke(InterfaceC2199c.b.f8745a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m46955k(String str, String str2, String str3, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46952h(str, str2, str3, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private static final void m46956l(boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        TextResource c8688b;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(457229836);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87155h(z4) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC33208p0.c cVar = AbstractC33208p0.c.f138471e;
                if (z4) {
                    c8688b = AbstractC8693b.m21267a();
                } else {
                    c8688b = new TextResource.C8688b(AbstractC26039b.f103021d, null, i16, 0 == true ? 1 : 0);
                }
                c28655q = c28655q2;
                AbstractC33199m0.m105214F(cVar, c8688b, null, null, null, false, false, null, null, AbstractC22953f.m66723l(modifier3), false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2103c(i13, i14, 2, modifier2, z4);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            AbstractC33208p0.c cVar2 = AbstractC33208p0.c.f138471e;
            if (z4) {
                c8688b = AbstractC8693b.m21267a();
            } else {
                c8688b = new TextResource.C8688b(AbstractC26039b.f103021d, null, i16, 0 == true ? 1 : 0);
            }
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(cVar2, c8688b, null, null, null, false, false, null, null, AbstractC22953f.m66723l(modifier3), false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2103c(i13, i14, 2, modifier2, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m46957m(boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46956l(z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
