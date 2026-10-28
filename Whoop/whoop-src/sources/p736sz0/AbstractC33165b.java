package p736sz0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qk2.C30453i;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/c;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "sampleMedicalDisclaimerBothFeaturesText", "e", "sampleMedicalDisclaimerECGText", "c", "f", "sampleMedicalDisclaimerIHRNText", "Lsz0/c;", "getSampleMedicalDisclaimerBothFeatures", "()Lsz0/c;", "sampleMedicalDisclaimerBothFeatures", "getSampleMedicalDisclaimerECG", "sampleMedicalDisclaimerECG", "getSampleMedicalDisclaimerIHRN", "sampleMedicalDisclaimerIHRN", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "sampleMedicalDisclaimerStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33165b {

    /* JADX INFO: renamed from: a */
    private static final String f138302a;

    /* JADX INFO: renamed from: b */
    private static final String f138303b;

    /* JADX INFO: renamed from: c */
    private static final String f138304c;

    /* JADX INFO: renamed from: d */
    private static final C33168c f138305d;

    /* JADX INFO: renamed from: e */
    private static final C33168c f138306e;

    /* JADX INFO: renamed from: f */
    private static final C33168c f138307f;

    /* JADX INFO: renamed from: g */
    private static final List<C33168c> f138308g;

    static {
        String strM30461o = AbstractC11266d.m30461o("**The Heart Screener features - ECG and IHRN - are medically regulated features.** ", "Healthspan, Health Monitor, Blood Pressure Monitor, and Stress Monitor are not medical devices and cannot diagnose or manage medical conditions. These features do not provide medical advice. Always consult your doctor for health concerns and never delay or modify medical care based on these features.");
        f138302a = strM30461o;
        String strM30461o2 = AbstractC11266d.m30461o("**The Heart Screener feature - ECG - is a medically regulated feature.** ", "Healthspan, Health Monitor, Blood Pressure Monitor, and Stress Monitor are not medical devices and cannot diagnose or manage medical conditions. These features do not provide medical advice. Always consult your doctor for health concerns and never delay or modify medical care based on these features.");
        f138303b = strM30461o2;
        String strM30461o3 = AbstractC11266d.m30461o("**The Heart Screener feature - IHRN - is a medically regulated feature.** ", "Healthspan, Health Monitor, Blood Pressure Monitor, and Stress Monitor are not medical devices and cannot diagnose or manage medical conditions. These features do not provide medical advice. Always consult your doctor for health concerns and never delay or modify medical care based on these features.");
        f138304c = strM30461o3;
        C33168c c33168c = new C33168c(strM30461o, true);
        f138305d = c33168c;
        C33168c c33168c2 = new C33168c(strM30461o2, true);
        f138306e = c33168c2;
        C33168c c33168c3 = new C33168c(strM30461o3, true);
        f138307f = c33168c3;
        f138308g = AbstractC37056f.m118959K(c33168c, c33168c2, c33168c3, new C33168c("Healthspan, Health Monitor, Blood Pressure Monitor, and Stress Monitor are not medical devices and cannot diagnose or manage medical conditions. These features do not provide medical advice. Always consult your doctor for health concerns and never delay or modify medical care based on these features.", true));
    }

    /* JADX INFO: renamed from: b */
    public static final void m105044b(Modifier modifier, C33168c state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        int i16;
        C28655q c28655q2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-632766820);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q3.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(state) ? 32 : 16;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            float f13 = 8;
            Modifier modifier5 = modifier4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(modifier4, 0.0f, 2 * f13, 0.0f, 0.0f, 13), ((float) 0.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (state.getShowDivider()) {
                c28655q3.m87150e0(872294425);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                i16 = 0;
                c28655q2 = c28655q3;
                AbstractC17755i2.m50938j(modifierM3398t, null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                c28655q2.m87173q(false);
            } else {
                i16 = 0;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(872378032);
                c28655q2.m87173q(false);
            }
            String strM21275i = AbstractC8693b.m21275i(state.getText(), c28655q2, i16);
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            C28655q c28655q4 = c28655q2;
            AbstractC21048g.m58807M(strM21275i, null, false, c21053l.m58880a(AbstractC18489d0.m53377r(c38072d, c28655q2, 6), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q4, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, 0, 0, 0, false, c28655q4, 0, 502);
            c28655q = c28655q4;
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(modifier3, state, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m105045c(Modifier modifier, C33168c c33168c, int i13, int i14, Composer composer, int i15) {
        m105044b(modifier, c33168c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final String m105046d() {
        return f138302a;
    }

    /* JADX INFO: renamed from: e */
    public static final String m105047e() {
        return f138303b;
    }

    /* JADX INFO: renamed from: f */
    public static final String m105048f() {
        return f138304c;
    }

    /* JADX INFO: renamed from: g */
    public static final List<C33168c> m105049g() {
        return f138308g;
    }
}
