package jr1;

import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import b30.C2633u2;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import fr1.InterfaceC14714c;
import gb1.AbstractC15673b0;
import gr1.C16097d;
import gr1.C16110q;
import gr1.InterfaceC16107n;
import hr1.AbstractC17575a;
import java.util.List;
import jp1.C21860l;
import jp1.C21862n;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jr1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001ag\u0010\u001a\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lfr1/c;", "onNavigationEvent", "q", "(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "heroImageUrl", "Lcom/whoop/design/util/TextResource;", "title", "description", "", "Lm91/u;", "designItems", "i", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "footerDisclaimer", "", "connectionUrlBase", "connectionButtonText", "integrationId", "secondaryButton", "l", "(Lm91/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21898f {
    /* JADX INFO: renamed from: i */
    private static final void m62264i(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, List<? extends InterfaceC25312u> list, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1209483309);
        int i14 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(list) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            AbstractC15005f3.m43107a(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC1102d.m3419p(24 * 4, c2314t), C17919x.f69637n, c28655q, 3504, 0);
            float f13 = 8;
            AbstractC11266d.m30469w(3, f13, c2314t, c28655q);
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, ((i15 >> 3) & 14) | i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i17).getT1();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i18, 196602);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i16 | ((i15 >> 6) & 14)), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            for (InterfaceC25312u interfaceC25312u : list) {
                boolean z4 = (i15 & 57344) == 16384;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C21862n(function1, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(abstractC22403o, textResource, textResource2, list, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m62265j(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            if (c9598eM50040l != null) {
                function1.invoke(new InterfaceC14714c.g(c9598eM50040l));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m62266k(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, List list, Function1 function1, int i13, Composer composer, int i14) {
        m62264i(abstractC22403o, textResource, textResource2, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m62267l(InterfaceC25312u interfaceC25312u, String str, String str2, String str3, InterfaceC25312u interfaceC25312u2, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        int i15;
        int i16;
        C28655q c28655q;
        boolean z4;
        boolean z13;
        Function1 function3;
        float f13;
        C2314t c2314t;
        boolean z14;
        C28655q c28655q2;
        int i17;
        C28655q c28655q3;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1499428777);
        if ((i13 & 6) == 0) {
            i14 = (c28655q4.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q4.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q4.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q4.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q4.m87157i(interfaceC25312u2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q4.m87157i(function1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q4.m87157i(function2) ? 1048576 : 524288;
        }
        if (c28655q4.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 8;
            float f15 = f14 * 2.5f;
            float f16 = f14 * 2;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t2)), f15, f16);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 48);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
            C28676v0 c28676v0 = C28635l.f115821a;
            if (interfaceC25312u == null) {
                c28655q4.m87150e0(-1306307607);
                c28655q4.m87173q(false);
                z4 = false;
                i15 = i14;
                c28655q = c28655q4;
                i16 = 1048576;
            } else {
                c28655q4.m87150e0(-1306307606);
                boolean z15 = (i14 & 3670016) == 1048576;
                Object objM87133R = c28655q4.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C21862n(function2, 5);
                    c28655q4.m87172p0(objM87133R);
                }
                i15 = i14;
                i16 = 1048576;
                AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q4, 0, 6);
                c28655q = c28655q4;
                z4 = false;
                AbstractC30007c.m91851u(c2314t2, f16, c28655q, false);
            }
            if (str == null || str2 == null) {
                z13 = z4;
                function3 = function2;
                f13 = f16;
                c2314t = c2314t2;
                z14 = true;
                c28655q2 = c28655q;
                i17 = i15;
                c28655q2.m87150e0(-1305249917);
                c28655q2.m87173q(z13);
            } else {
                c28655q.m87150e0(-1305794804);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(str2);
                boolean z16 = ((458752 & i15) == 131072 ? true : z4) | ((i15 & 7168) == 2048 ? true : z4) | ((i15 & 3670016) == i16 ? true : z4) | ((i15 & 112) == 32 ? true : z4);
                Object objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    c28655q3 = c28655q;
                    C1012d c1012d = new C1012d((Object) function1, str3, (Object) function2, (Object) str, 21);
                    function3 = function2;
                    c28655q3.m87172p0(c1012d);
                    objM87133R2 = c1012d;
                } else {
                    function3 = function2;
                    c28655q3 = c28655q;
                }
                f13 = f16;
                C28655q c28655q5 = c28655q3;
                z14 = true;
                c2314t = c2314t2;
                i17 = i15;
                z13 = z4;
                AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q5, (TextResource.$stable << 18) | 6, 0, 8126);
                c28655q2 = c28655q5;
                c28655q2.m87173q(z13);
            }
            if (interfaceC25312u2 == null) {
                c28655q2.m87150e0(-1305210455);
                c28655q2.m87173q(z13);
                c28655q4 = c28655q2;
            } else {
                AbstractC33745d.m106667z(c28655q2, -1305210454, c2314t, f13, c28655q2);
                boolean z17 = (i17 & 3670016) == i16 ? z14 : z13;
                Object objM87133R3 = c28655q2.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C21862n(function3, 6);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q4 = c28655q2;
                AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) objM87133R3, c28655q4, 0, 6);
                c28655q4.m87173q(z13);
            }
            c28655q4.m87173q(z14);
        } else {
            c28655q4.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q4.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(interfaceC25312u, str, str2, str3, interfaceC25312u2, function1, function2, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m62268m(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            if (c9598eM50040l != null) {
                function1.invoke(new InterfaceC14714c.g(c9598eM50040l));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62269n(Function1 function1, String str, Function1 function2, String str2) {
        function1.invoke(new InterfaceC16107n.a(str));
        function2.invoke(new InterfaceC14714c.h(str2, str, str, false, 8, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m62270o(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            if (c9598eM50040l != null) {
                function1.invoke(new InterfaceC14714c.g(c9598eM50040l));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m62271p(InterfaceC25312u interfaceC25312u, String str, String str2, String str3, InterfaceC25312u interfaceC25312u2, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62267l(interfaceC25312u, str, str2, str3, interfaceC25312u2, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m62272q(C16110q c16110q, Function1 function1, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        int i15;
        C16110q viewState = c16110q;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1771973395);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C16097d c16097dM45635e = viewState.getDisclaimerScreen();
            if (c16097dM45635e == null) {
                c28655q.m87150e0(1793423587);
                c28655q.m87173q(false);
                i15 = i14;
                z4 = true;
            } else {
                c28655q.m87150e0(1793423588);
                AbstractC6721d.c cVar = new AbstractC6721d.c(null, null, null, AbstractC13673n.m38561h(C38072d.f163053a), "Back button", null, null, null, null, null, null, null, null, 8167, null);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C21860l(onNavigationEvent, 8);
                    c28655q.m87172p0(objM87133R);
                }
                z4 = true;
                i15 = i14;
                AbstractC6719b.m20143d(modifierM66723l, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.c.f25657p << 3, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q, 1), 14), 2.5f * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4 * f13, 7);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22403o abstractC22403oM45558h = c16097dM45635e.getHeroImageUrl();
                TextResource textResourceM45561k = c16097dM45635e.getTitle();
                TextResource textResourceM45555e = c16097dM45635e.getDescription();
                List<InterfaceC25312u> listM45556f = c16097dM45635e.m45556f();
                int i16 = AbstractC22403o.f87638a;
                int i17 = TextResource.$stable;
                m62264i(abstractC22403oM45558h, textResourceM45561k, textResourceM45555e, listM45556f, onNavigationEvent, c28655q, i16 | (i17 << 3) | (i17 << 6) | ((i15 << 6) & 57344));
                c28655q.m87173q(true);
                m62267l(c16097dM45635e.getFooterDisclaimer(), c16097dM45635e.getConnectionUrlBase(), c16097dM45635e.getConnectionButtonText(), c16097dM45635e.getIntegrationId(), c16097dM45635e.getSecondaryButton(), function1, onNavigationEvent, c28655q, (i15 << 12) & 4128768);
                onViewEvent = function1;
                c28655q.m87173q(false);
            }
            viewState = c16110q;
            AbstractC21894b.m62170c(viewState, onViewEvent, c28655q, i15 & 126);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21895c(viewState, onViewEvent, onNavigationEvent, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62273r(Function1 function1) {
        function1.invoke(new InterfaceC14714c.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m62274s(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62272q(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
