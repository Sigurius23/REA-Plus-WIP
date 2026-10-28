package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import com.whoop.service.network.model.UserSessionDto;
import java.util.List;
import kd1.AbstractC22399k;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33165b;
import p736sz0.C33168c;
import q31.AbstractC29946d;
import q31.C29943a;
import q31.C29948f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.b7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "Lsz0/c;", "a", "Lsz0/c;", "getSampleMedicalDisclaimerBothFeatures", "()Lsz0/c;", "sampleMedicalDisclaimerBothFeatures", "b", "getSampleMedicalDisclaimerECG", "sampleMedicalDisclaimerECG", "c", "getSampleMedicalDisclaimerIHRN", "sampleMedicalDisclaimerIHRN", "", "Lq31/a;", "d", "Ljava/util/List;", "getSampleSegment5ContentList", "()Ljava/util/List;", "sampleSegment5ContentList", "e", "getSampleSegment3ContentList", "sampleSegment3ContentList", "getSampleSegment2ContentList", "sampleSegment2ContentList", "g", "getSampleSegment3ContentWithSubTextList", "sampleSegment3ContentWithSubTextList", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40283b7 {

    /* JADX INFO: renamed from: a */
    private static final C33168c f174202a;

    /* JADX INFO: renamed from: b */
    private static final C33168c f174203b;

    /* JADX INFO: renamed from: c */
    private static final C33168c f174204c;

    /* JADX INFO: renamed from: d */
    private static final List<C29943a> f174205d;

    /* JADX INFO: renamed from: e */
    private static final List<C29943a> f174206e;

    /* JADX INFO: renamed from: f */
    private static final List<C29943a> f174207f;

    /* JADX INFO: renamed from: g */
    private static final List<C29943a> f174208g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C33168c c33168c = new C33168c(AbstractC33165b.m105046d(), false);
        f174202a = c33168c;
        C33168c c33168c2 = new C33168c(AbstractC33165b.m105047e(), false);
        f174203b = c33168c2;
        C33168c c33168c3 = new C33168c(AbstractC33165b.m105048f(), false);
        f174204c = c33168c3;
        C29943a c29943a = new C29943a("Tab 1", "Tab 1", null, AbstractC37056f.m118958J(c33168c), null, null, 48, null);
        Object[] objArr = 0 == true ? 1 : 0;
        C29943a c29943a2 = new C29943a("Tab 2", "Tab 2", null, AbstractC37056f.m118958J(c33168c2), objArr, null, 48, null);
        Object[] objArr2 = 0 == true ? 1 : 0;
        C29943a c29943a3 = new C29943a("Tab 3", "Tab 3", null, AbstractC37056f.m118958J(c33168c3), objArr2, null, 48, null);
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        f174205d = AbstractC37056f.m118959K(c29943a, c29943a2, c29943a3, new C29943a("Tab 4", "Tab 4", null, AbstractC37056f.m118958J(c33168c3), objArr3, null, 48, null), new C29943a("Tab 5", "Tab 5", null, AbstractC37056f.m118958J(c33168c3), objArr4, null, 48, null));
        C29943a c29943a4 = new C29943a("GOOD", "GOOD", null, AbstractC37056f.m118958J(c33168c), null, null, 48, null);
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        f174206e = AbstractC37056f.m118959K(c29943a4, new C29943a("NEUTRAL", "NEUTRAL", null, AbstractC37056f.m118958J(c33168c2), objArr6, null, 48, objArr5), new C29943a("POOR", "POOR", null, AbstractC37056f.m118958J(c33168c3), objArr8, null, 48, objArr7));
        Object[] objArr9 = 0 == true ? 1 : 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr10 = 0 == true ? 1 : 0;
        f174207f = AbstractC37056f.m118959K(new C29943a("GOOD", "GOOD", null, AbstractC37056f.m118958J(c33168c), objArr9, null, 48, 0 == true ? 1 : 0), new C29943a("POOR", "POOR", null, AbstractC37056f.m118958J(c33168c3), objArr10, null, 48, defaultConstructorMarker));
        C29943a c29943a5 = new C29943a("GOOD", "GOOD", "Sub Text 1", AbstractC37056f.m118958J(c33168c), null, 0 == true ? 1 : 0, 48, null);
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        f174208g = AbstractC37056f.m118959K(c29943a5, new C29943a("NEUTRAL", "NEUTRAL", "Sub Text 2", AbstractC37056f.m118958J(c33168c2), objArr11, null, 48, defaultConstructorMarker), new C29943a("POOR", "POOR", "Sub Text 3", AbstractC37056f.m118958J(c33168c3), objArr13, null, 48, objArr12));
    }

    /* JADX INFO: renamed from: f */
    public static final void m129380f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1990505880);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C29948f c29948f = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 0, f174206e, false, 18, null);
                c28655q.m87172p0(c29948f);
                objM87133R = c29948f;
            }
            C29948f c29948f2 = (C29948f) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                C29948f c29948f3 = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 1, f174207f, false, 18, null);
                c28655q.m87172p0(c29948f3);
                objM87133R2 = c29948f3;
            }
            C29948f c29948f4 = (C29948f) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                C29948f c29948f5 = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 1, f174205d, false, 18, null);
                c28655q.m87172p0(c29948f5);
                objM87133R3 = c29948f5;
            }
            C29948f c29948f6 = (C29948f) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                C29948f c29948f7 = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 1, f174208g, false, 18, null);
                c28655q.m87172p0(c29948f7);
                objM87133R4 = c29948f7;
            }
            C29948f c29948f8 = (C29948f) objM87133R4;
            AbstractC22399k.m64475e("Segmented Content 5 tabs - Interactive", c28655q, 6);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C40401m4(context, 10);
                c28655q.m87172p0(objM87133R5);
            }
            int i14 = C29948f.f122292f << 3;
            AbstractC29946d.m91597h(null, c29948f6, (Function1) objM87133R5, c28655q, i14, 1);
            AbstractC22399k.m64475e("Segmented Content 3 tabs - Interactive", c28655q, 6);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i2 || objM87133R6 == c28676v0) {
                objM87133R6 = new C40401m4(context, 11);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC29946d.m91597h(null, c29948f2, (Function1) objM87133R6, c28655q, i14, 1);
            AbstractC22399k.m64475e("Segmented Content 2 tabs - Interactive", c28655q, 6);
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i3 || objM87133R7 == c28676v0) {
                objM87133R7 = new C40401m4(context, 12);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC29946d.m91597h(null, c29948f4, (Function1) objM87133R7, c28655q, i14, 1);
            AbstractC22399k.m64475e("Segmented Content 3 tabs With sub text - Interactive", c28655q, 6);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i4 || objM87133R8 == c28676v0) {
                objM87133R8 = new C40401m4(context, 13);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC29946d.m91597h(null, c29948f8, (Function1) objM87133R8, c28655q, i14, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129381g(Context context, Object event) {
        AbstractC22676k.m65750j(event, "event");
        Toast.makeText(context, "Event from Item: " + event, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129382h(Context context, Object event) {
        AbstractC22676k.m65750j(event, "event");
        Toast.makeText(context, "Event from Item: " + event, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129383i(Context context, Object event) {
        AbstractC22676k.m65750j(event, "event");
        Toast.makeText(context, "Event from Item: " + event, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129384j(Context context, Object event) {
        AbstractC22676k.m65750j(event, "event");
        Toast.makeText(context, "Event from Item: " + event, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129385k(int i13, Composer composer, int i14) {
        m129380f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
