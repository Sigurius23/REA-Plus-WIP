package k03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2665z;
import c93.InterfaceC4351m;
import cw2.C11162c;
import d03.AbstractC11446a;
import d03.AbstractC11447b;
import ih0.C18514x;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o03.AbstractC27356a;
import o73.C27648a;
import p008a7.C0510a;
import p008a7.C0512c;
import p008a7.C0515f;
import p208i2.C17919x;
import p335n6.AbstractC26391h;
import p335n6.C26384a;
import p335n6.C26386c;
import p335n6.C26387d;
import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p463rj.AbstractC31484o;
import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32076h;
import p545v6.C35714c;
import p545v6.C35719h;
import p545v6.C35725n;
import p545v6.C35731t;
import p545v6.C35733v;
import p545v6.InterfaceC35718g;
import p545v6.InterfaceC35730s;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39183o;
import p672z6.C40119b;
import p672z6.C40120c;
import p672z6.C40123f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs.AbstractC31780b;
import v63.AbstractC35745c;
import x81.C38072d;

/* JADX INFO: renamed from: k03.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aG\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aG\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u000e\u001a9\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u000e\u001a7\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010#\u001a\u00020\f2\b\b\u0001\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0001¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"", "recoveryPercentage", "", "sleepText", "strainText", "batteryText", "", "batteryIcon", "Li2/x;", "batteryColor", "", "isCalibrating", "Ll83/a0;", "z", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)V", "Ln6/o;", "modifier", "icon", "score", "label", "color", "Lz6/c;", "textAlign", "A", "(Ln6/o;ILjava/lang/String;Ljava/lang/String;JILandroidx/compose/runtime/Composer;II)V", "y", "S", "(Ln6/o;Ljava/lang/String;Ljava/lang/String;JILandroidx/compose/runtime/Composer;II)V", "I", "text", "F", "(Ln6/o;IJLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "logo", "batteryImage", "logoModifier", "u", "(ILjava/lang/String;JILn6/o;Landroidx/compose/runtime/Composer;II)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22109n {
    /* JADX INFO: renamed from: A */
    private static final void m63264A(InterfaceC26398o interfaceC26398o, final int i13, final String str, final String str2, final long j7, final int i14, Composer composer, final int i15, final int i16) {
        final InterfaceC26398o interfaceC26398o2;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(517265042);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            interfaceC26398o2 = interfaceC26398o;
        } else if ((i15 & 6) == 0) {
            interfaceC26398o2 = interfaceC26398o;
            i17 = (c28655q.m87153g(interfaceC26398o2) ? 4 : 2) | i15;
        } else {
            interfaceC26398o2 = interfaceC26398o;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= c28655q.m87149e(i14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i17 & 1, (74899 & i17) != 74898)) {
            InterfaceC26398o interfaceC26398o3 = i18 != 0 ? C26396m.f104850a : interfaceC26398o2;
            AbstractC32069a.m99667e(interfaceC26398o3, 0, 1, AbstractC37817c.m121344e(-757139538, c28655q, new C22104i(i13, str, str2, j7, i14)), c28655q, (i17 & 14) | 3072, 2);
            interfaceC26398o2 = interfaceC26398o3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k03.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22109n.m63266C(interfaceC26398o2, i13, str, str2, j7, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m63265B(int i13, String str, String str2, long j7, int i14, InterfaceC35730s Row, Composer composer, int i15) {
        AbstractC22676k.m65750j(Row, "$this$Row");
        C27648a.m83581d(new C26384a(i13), null, AbstractC32072d.m99710t(5 * 4), 0, composer, 48, 24);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(16), composer, 0);
        m63282S(C26396m.f104850a, str, str2, j7, i14, composer, 6, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m63266C(InterfaceC26398o interfaceC26398o, int i13, String str, String str2, long j7, int i14, int i15, int i16, Composer composer, int i17) {
        m63264A(interfaceC26398o, i13, str, str2, j7, i14, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m63267D(String str, long j7, int i13, float f13, boolean z4, String str2, String str3, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        m63308u(AbstractC11446a.f36716o, str, j7, i13, null, composer, 0, 16);
        C35719h c35719h = (C35719h) Column;
        C26396m c26396m = C26396m.f104850a;
        InterfaceC26398o interfaceC26398oM113187a = c35719h.m113187a(c26396m);
        int i15 = AbstractC11446a.f36709h;
        C28674u2 c28674u2 = AbstractC26391h.f104841b;
        C28655q c28655q = (C28655q) composer;
        String strM82542i = AbstractC27356a.m82542i((Context) c28655q.m87161k(c28674u2), f13);
        String string = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36721d);
        AbstractC22676k.m65749i(string, "getString(...)");
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        m63264A(interfaceC26398oM113187a, i15, strM82542i, upperCase, AbstractC27356a.m82543j(f13, z4), 4, c28655q, 0, 0);
        InterfaceC26398o interfaceC26398oM113187a2 = c35719h.m113187a(c26396m);
        int i16 = AbstractC11446a.f36713l;
        String string2 = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36723f);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String upperCase2 = string2.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        C38072d c38072d = C38072d.f163053a;
        int i17 = C38072d.f163054b;
        m63264A(interfaceC26398oM113187a2, i16, str2, upperCase2, c38072d.m121949b(c28655q, i17).getStrain(), 4, c28655q, 0, 0);
        InterfaceC26398o interfaceC26398oM113187a3 = c35719h.m113187a(c26396m);
        int i18 = AbstractC11446a.f36710i;
        String string3 = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36722e);
        AbstractC22676k.m65749i(string3, "getString(...)");
        String upperCase3 = string3.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
        m63264A(interfaceC26398oM113187a3, i18, str3, upperCase3, c38072d.m121949b(c28655q, i17).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 4, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m63268E(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, int i14, Composer composer, int i15) {
        m63313z(f13, str, str2, str3, i13, j7, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m63269F(InterfaceC26398o interfaceC26398o, int i13, long j7, String str, String str2, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1590390460);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            AbstractC31834n.m98892a(interfaceC26398o, 1, 1, AbstractC37817c.m121344e(-1221160134, c28655q, new C22107l(i13, str, j7, str2)), c28655q, (i15 & 14) | 3072, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(interfaceC26398o, i13, j7, str, str2, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m63270G(int i13, String str, long j7, String str2, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        float f13 = 4;
        C27648a.m83581d(new C26384a(i13), null, AbstractC32072d.m99710t(5 * f13), 0, composer, 48, 24);
        float f14 = f13 * 1;
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(f14), composer, 0);
        int i15 = 700;
        AbstractC31484o.m96953e(str, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(24)), new C40119b(i15), null, 120), 0, composer, 0, 10);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(f14), composer, 0);
        AbstractC31484o.m96953e(str2, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(10)), new C40119b(i15), null, 120), 0, composer, 0, 10);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m63271H(InterfaceC26398o interfaceC26398o, int i13, long j7, String str, String str2, int i14, Composer composer, int i15) {
        m63269F(interfaceC26398o, i13, j7, str, str2, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m63272I(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, Composer composer, int i14) {
        int i15;
        String str4;
        String str5;
        String str6;
        long j13;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(209418035);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str4 = str;
            i15 |= c28655q.m87153g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i14 & 384) == 0) {
            str5 = str2;
            i15 |= c28655q.m87153g(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i14 & 3072) == 0) {
            str6 = str3;
            i15 |= c28655q.m87153g(str6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str6 = str3;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            j13 = j7;
            i15 |= c28655q.m87151f(j13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            j13 = j7;
        }
        if ((1572864 & i14) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? 1048576 : 524288;
        } else {
            z13 = z4;
        }
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            AbstractC31834n.m98892a(AbstractC32004s.m99552u(AbstractC32072d.m99702k(new C26387d(new C26384a(AbstractC11446a.f36717p))), 16), 0, 0, AbstractC37817c.m121344e(1137144957, c28655q, new C22102g(f13, i13, 0, j13, str6, str5, str4, z13)), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22103h(f13, str, str2, str3, i13, j7, z4, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m63273J(String str, long j7, int i13, float f13, boolean z4, String str2, String str3, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        m63308u(AbstractC11446a.f36715n, str, j7, i13, null, composer, 0, 16);
        AbstractC32069a.m99667e(((C35719h) Column).m113187a(AbstractC32072d.m99703l(C26396m.f104850a)), 0, 1, AbstractC37817c.m121344e(-843025767, composer, new C22099d(f13, z4, str2, str3)), composer, 3072, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m63274K(float f13, boolean z4, String str, String str2, InterfaceC35730s Row, Composer composer, int i13) {
        AbstractC22676k.m65750j(Row, "$this$Row");
        C26396m c26396m = C26396m.f104850a;
        C35731t c35731t = (C35731t) Row;
        InterfaceC26398o interfaceC26398oM113190a = c35731t.m113190a(AbstractC32072d.m99702k(c26396m));
        int i14 = AbstractC11446a.f36709h;
        long jM82543j = AbstractC27356a.m82543j(f13, z4);
        C28674u2 c28674u2 = AbstractC26391h.f104841b;
        C28655q c28655q = (C28655q) composer;
        String strM82542i = AbstractC27356a.m82542i((Context) c28655q.m87161k(c28674u2), f13);
        String string = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36721d);
        AbstractC22676k.m65749i(string, "getString(...)");
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        m63269F(interfaceC26398oM113190a, i14, jM82543j, strM82542i, upperCase, c28655q, 0);
        InterfaceC26398o interfaceC26398oM113190a2 = c35731t.m113190a(AbstractC32072d.m99702k(c26396m));
        int i15 = AbstractC11446a.f36713l;
        C38072d c38072d = C38072d.f163053a;
        int i16 = C38072d.f163054b;
        long jM125403k0 = c38072d.m121949b(c28655q, i16).getStrain();
        String string2 = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36723f);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String upperCase2 = string2.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        m63269F(interfaceC26398oM113190a2, i15, jM125403k0, str, upperCase2, c28655q, 0);
        InterfaceC26398o interfaceC26398oM113190a3 = c35731t.m113190a(AbstractC32072d.m99702k(c26396m));
        int i17 = AbstractC11446a.f36710i;
        long jM125393f0 = c38072d.m121949b(c28655q, i16).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        String string3 = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36722e);
        AbstractC22676k.m65749i(string3, "getString(...)");
        String upperCase3 = string3.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
        m63269F(interfaceC26398oM113190a3, i17, jM125393f0, str2, upperCase3, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m63275L(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, int i14, Composer composer, int i15) {
        m63272I(f13, str, str2, str3, i13, j7, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m63276M(String str, long j7, int i13, String str2, float f13, boolean z4, String str3, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        m63308u(AbstractC11446a.f36715n, str, j7, i13, null, composer, 0, 16);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(8), composer, 0);
        AbstractC32069a.m99667e(((C35719h) Column).m113187a(AbstractC32072d.m99702k(C26396m.f104850a)), 1, 1, AbstractC37817c.m121344e(-632040294, composer, new C22099d(str2, f13, z4, str3)), composer, 3072, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m63277N(String str, final float f13, final boolean z4, final String str2, InterfaceC35730s Row, Composer composer, int i13) {
        AbstractC22676k.m65750j(Row, "$this$Row");
        C26396m c26396m = C26396m.f104850a;
        C35731t c35731t = (C35731t) Row;
        AbstractC31834n.m98892a(c35731t.m113190a(AbstractC32072d.m99702k(c26396m)), 1, 0, AbstractC37817c.m121344e(595321744, composer, new Function3() { // from class: k03.f
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC22109n.m63278O(f13, z4, str2, (InterfaceC35718g) obj, (Composer) obj2, iIntValue);
            }
        }), composer, 3072, 4);
        float f14 = 8;
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(f14), composer, 0);
        AbstractC31780b.m98680a(new C35733v(new C0510a(1)).mo78107d(new C35725n(C0512c.f1721a)).mo78107d(new C26386c(new C0515f(C17919x.m51541c(0.2f, C17919x.f69629f)))), null, C22096a.f85704a.m63249c(), composer, 384, 2);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(f14), composer, 0);
        InterfaceC26398o interfaceC26398oM113190a = c35731t.m113190a(c26396m);
        C28655q c28655q = (C28655q) composer;
        String string = ((Context) c28655q.m87161k(AbstractC26391h.f104841b)).getString(AbstractC11447b.f36722e);
        AbstractC22676k.m65749i(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        m63282S(interfaceC26398oM113190a, str, upperCase, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 3, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m63278O(float f13, boolean z4, String str, InterfaceC35718g Column, Composer composer, int i13) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        C35719h c35719h = (C35719h) Column;
        C26396m c26396m = C26396m.f104850a;
        InterfaceC26398o interfaceC26398oM113187a = c35719h.m113187a(c26396m);
        C37816b c37816bM121344e = AbstractC37817c.m121344e(-1742760594, composer, new C18514x(f13, 1, z4));
        C35714c c35714c = C35714c.f151948d;
        AbstractC31780b.m98680a(interfaceC26398oM113187a, c35714c, c37816bM121344e, composer, 384, 0);
        AbstractC31780b.m98680a(c35719h.m113187a(c26396m), c35714c, AbstractC37817c.m121344e(1680276197, composer, new C2665z(str, 5, (byte) 0)), composer, 384, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m63279P(float f13, boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C28674u2 c28674u2 = AbstractC26391h.f104841b;
            String strM82542i = AbstractC27356a.m82542i((Context) c28655q.m87161k(c28674u2), f13);
            String string = ((Context) c28655q.m87161k(c28674u2)).getString(AbstractC11447b.f36721d);
            AbstractC22676k.m65749i(string, "getString(...)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            m63282S(null, strM82542i, upperCase, AbstractC27356a.m82543j(f13, z4), 3, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m63280Q(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String string = ((Context) c28655q.m87161k(AbstractC26391h.f104841b)).getString(AbstractC11447b.f36723f);
            AbstractC22676k.m65749i(string, "getString(...)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            m63282S(null, str, upperCase, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getStrain(), 3, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m63281R(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, int i14, Composer composer, int i15) {
        m63312y(f13, str, str2, str3, i13, j7, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final void m63282S(InterfaceC26398o interfaceC26398o, final String str, final String str2, final long j7, final int i13, Composer composer, final int i14, final int i15) {
        int i16;
        final InterfaceC26398o interfaceC26398o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1043114267);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 9363) != 9362)) {
            if (i17 != 0) {
                interfaceC26398o = C26396m.f104850a;
            }
            InterfaceC26398o interfaceC26398o3 = interfaceC26398o;
            AbstractC31834n.m98892a(interfaceC26398o3, 0, 0, AbstractC37817c.m121344e(1813091247, c28655q, new C22107l(j7, i13, str, str2)), c28655q, (i16 & 14) | 3072, 6);
            interfaceC26398o2 = interfaceC26398o3;
        } else {
            c28655q.m87138X();
            interfaceC26398o2 = interfaceC26398o;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k03.m
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22109n.m63284U(interfaceC26398o2, str, str2, j7, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m63283T(long j7, int i13, String str, String str2, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        C26396m c26396m = C26396m.f104850a;
        int i15 = 700;
        AbstractC31484o.m96953e(str, AbstractC32072d.m99703l(c26396m), new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(24)), new C40119b(i15), new C40120c(i13), 104), 0, composer, 0, 8);
        AbstractC31484o.m96953e(str2, AbstractC32072d.m99703l(c26396m), new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(10)), new C40119b(i15), new C40120c(i13), 104), 0, composer, 0, 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m63284U(InterfaceC26398o interfaceC26398o, String str, String str2, long j7, int i13, int i14, int i15, Composer composer, int i16) {
        m63282S(interfaceC26398o, str, str2, j7, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m63308u(final int i13, final String batteryText, final long j7, final int i14, InterfaceC26398o interfaceC26398o, Composer composer, final int i15, final int i16) {
        int i17;
        final InterfaceC26398o interfaceC26398o2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C26396m c26396m;
        InterfaceC26398o interfaceC26398o3;
        AbstractC22676k.m65750j(batteryText, "batteryText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-939162146);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87153g(batteryText) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87149e(i14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i16 & 16;
        if (i18 == 0) {
            if ((i15 & 24576) == 0) {
                interfaceC26398o2 = interfaceC26398o;
                i17 |= c28655q.m87153g(interfaceC26398o2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i17 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                c26396m = C26396m.f104850a;
                if (i18 != 0) {
                    interfaceC26398o3 = c26396m;
                } else {
                    interfaceC26398o3 = interfaceC26398o2;
                }
                AbstractC32069a.m99667e(AbstractC32072d.m99703l(c26396m), 1, 0, AbstractC37817c.m121344e(-446106118, c28655q, new C22104i(i13, interfaceC26398o3, batteryText, j7, i14)), c28655q, 3072, 4);
                interfaceC26398o2 = interfaceC26398o3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k03.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22109n.m63311x(i13, batteryText, j7, i14, interfaceC26398o2, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 24576;
        interfaceC26398o2 = interfaceC26398o;
        if ((i17 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i17 & 1, z4)) {
            c26396m = C26396m.f104850a;
            if (i18 != 0) {
                interfaceC26398o3 = c26396m;
            } else {
                interfaceC26398o3 = interfaceC26398o2;
            }
            AbstractC32069a.m99667e(AbstractC32072d.m99703l(c26396m), 1, 0, AbstractC37817c.m121344e(-446106118, c28655q, new C22104i(i13, interfaceC26398o3, batteryText, j7, i14)), c28655q, 3072, 4);
            interfaceC26398o2 = interfaceC26398o3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k03.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22109n.m63311x(i13, batteryText, j7, i14, interfaceC26398o2, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m63309v(int i13, InterfaceC26398o interfaceC26398o, final String str, final long j7, final int i14, InterfaceC35730s Row, Composer composer, int i15) {
        AbstractC22676k.m65750j(Row, "$this$Row");
        C27648a.m83581d(new C26384a(i13), "", interfaceC26398o, 0, composer, 48, 24);
        AbstractC32069a.m99667e(AbstractC32072d.m99703l(C26396m.f104850a), 2, 1, AbstractC37817c.m121344e(1470403862, composer, new Function3() { // from class: k03.e
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC22109n.m63310w(str, j7, i14, (InterfaceC35730s) obj, (Composer) obj2, iIntValue);
            }
        }), composer, 3072, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m63310w(String str, long j7, int i13, InterfaceC35730s Row, Composer composer, int i14) {
        AbstractC22676k.m65750j(Row, "$this$Row");
        AbstractC31484o.m96953e(str, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(11)), new C40119b(700), null, 120), 0, composer, 0, 10);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(4), composer, 0);
        C27648a.m83581d(new C26384a(i13), "", null, 0, composer, 48, 28);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m63311x(int i13, String str, long j7, int i14, InterfaceC26398o interfaceC26398o, int i15, int i16, Composer composer, int i17) {
        m63308u(i13, str, j7, i14, interfaceC26398o, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m63312y(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, Composer composer, int i14) {
        int i15;
        String str4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(123393984);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str4 = str2;
            i15 |= c28655q.m87153g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87151f(j7) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i15 |= c28655q.m87155h(z4) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            AbstractC31834n.m98892a(AbstractC32004s.m99552u(AbstractC32072d.m99702k(new C26387d(new C26384a(AbstractC11446a.f36717p))), 16), 0, 0, AbstractC37817c.m121344e(-1528548298, c28655q, new C22102g(str3, j7, i13, str, f13, z4, str4)), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22103h(f13, str, str2, str3, i13, j7, z4, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m63313z(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, Composer composer, int i14) {
        int i15;
        String str4;
        String str5;
        String str6;
        long j13;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-785459573);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str4 = str;
            i15 |= c28655q.m87153g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i14 & 384) == 0) {
            str5 = str2;
            i15 |= c28655q.m87153g(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i14 & 3072) == 0) {
            str6 = str3;
            i15 |= c28655q.m87153g(str6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str6 = str3;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            j13 = j7;
            i15 |= c28655q.m87151f(j13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            j13 = j7;
        }
        if ((1572864 & i14) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? 1048576 : 524288;
        } else {
            z13 = z4;
        }
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            AbstractC31834n.m98892a(AbstractC32004s.m99552u(AbstractC32072d.m99702k(new C26387d(new C26384a(AbstractC11446a.f36717p))), 16), 0, 0, AbstractC37817c.m121344e(1701882197, c28655q, new C22102g(f13, i13, 1, j13, str6, str5, str4, z13)), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22103h(f13, str, str2, str3, i13, j7, z4, i14, 1);
        }
    }
}
