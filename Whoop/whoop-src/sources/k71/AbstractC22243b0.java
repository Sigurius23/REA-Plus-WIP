package k71;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import h32.C16829b;
import hy0.C17737e0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.EnumC22400l;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
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
import p720m91.AbstractC25303l;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r61.AbstractC30982e;
import r61.AbstractC30986i;
import v31.C35605a;
import v31.C35611g;
import v31.EnumC35606b;
import v31.EnumC35612h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: k71.b0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0002\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lk71/c0;", "a", "Lk71/c0;", "getGraphCardIaStressSample", "()Lk71/c0;", "graphCardIaStressSample", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22243b0 {

    /* JADX INFO: renamed from: a */
    private static final C22245c0 f86721a;

    /* JADX INFO: renamed from: k71.b0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f86722w = new a();

        /* JADX INFO: renamed from: a */
        public final long m63786a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63786a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: k71.b0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f86723w = new b();

        /* JADX INFO: renamed from: a */
        public final long m63787a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63787a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: k71.b0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f86724w = new c();

        /* JADX INFO: renamed from: a */
        public final long m63788a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63788a((C39336i) obj));
        }
    }

    static {
        String str = "Stress Graphing Card Clicked";
        InterfaceC39332e interfaceC39332e = null;
        float f13 = 0.0f;
        f86721a = new C22245c0(str, interfaceC39332e, AbstractC8693b.m21278l("STRESS MONITOR"), AbstractC8693b.m21278l("HIGH"), p745y81.Function1.m125323a(c.f86724w), AbstractC8693b.m21278l("2.6"), AbstractC8693b.m21278l("Last updated 3:05pm"), f13, AbstractC30986i.m95388e(), AbstractC8693b.m21278l("In the last hour, you were mostly in the high stress zone. Consider taking a reduce stress session."), false, null, EnumC22400l.STRESS_MONITOR, null, 130, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m63778f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1081860193);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            m63783k(c28655q, 0);
            m63780h(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m63779g(int i13, Composer composer, int i14) {
        m63778f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m63780h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2030831286);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("STRESS MONITOR");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("HIGH");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f86722w;
                c28655q.m87172p0(objM87133R);
            }
            C22245c0 c22245c0 = new C22245c0("Stress Graphing Card Clicked", null, textResourceM21278l, textResourceM21278l2, p745y81.Function1.m125323a((Function1) objM87133R), AbstractC8693b.m21278l("2.6"), null, 0.0f, AbstractC30982e.m95340j(), AbstractC8693b.m21278l("In the last hour, you were mostly in the high stress zone. Consider taking a reduce stress session."), true, null, null, AbstractC37056f.m118958J(new C35611g(AbstractC8693b.m21278l("Wear WHOOP to sleep for 4 nights to fully calibrate your Recovery Score."), new C35605a(EnumC35606b.DISCRETE, 7, 5, null), null, EnumC35612h.ONBOARDING)), 6338, null);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C16829b(context, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(c22245c0, null, null, (Function1) objM87133R2, c28655q, 0, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m63781i(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, (String) it, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m63782j(int i13, Composer composer, int i14) {
        m63780h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m63783k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1292961842);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("STRESS MONITOR");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("HIGH");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = b.f86723w;
                c28655q.m87172p0(objM87133R);
            }
            C22245c0 c22245c0 = new C22245c0("Stress Graphing Card Clicked", null, textResourceM21278l, textResourceM21278l2, p745y81.Function1.m125323a((Function1) objM87133R), AbstractC8693b.m21278l("2.6"), null, 0.0f, AbstractC30982e.m95340j(), AbstractC8693b.m21278l("In the last hour, you were mostly in the high stress zone. Consider taking a reduce stress session."), false, null, null, AbstractC37056f.m118958J(new C35611g(AbstractC8693b.m21278l("Wear WHOOP to sleep for 4 nights to fully calibrate your Recovery Score."), new C35605a(EnumC35606b.DISCRETE, 7, 5, null), null, EnumC35612h.ONBOARDING)), 6338, null);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C16829b(context, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(c22245c0, null, null, (Function1) objM87133R2, c28655q, 0, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m63784l(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, (String) it, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m63785m(int i13, Composer composer, int i14) {
        m63783k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
