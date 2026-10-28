package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2624t0;
import c93.InterfaceC4353o;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f31.AbstractC14046c;
import f31.C14044a;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.AbstractC25265s;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
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
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.p6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "j", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40434p6 {
    /* JADX INFO: renamed from: j */
    public static final void m130613j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-890343140);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            final Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R);
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R2);
            }
            final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            final List listM118959K = AbstractC37056f.m118959K("First", "Second", "Third");
            final List listM118959K2 = AbstractC37056f.m118959K("10.9", "11.9", "12.9");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC22399k.m64473c("Text", c28655q, 6);
            List list = listM118959K;
            final int i14 = 0;
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(list)), interfaceC28601c1.getValue(), null, null, null, AbstractC37817c.m121344e(195349298, c28655q, new InterfaceC4353o() { // from class: zc1.n6
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i14) {
                        case 0:
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130614k(listM118959K, context, interfaceC28601c1, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        case 1:
                            int iIntValue2 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130616m(listM118959K, context, interfaceC28601c1, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130618o(listM118959K, context, interfaceC28601c1, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue3);
                    }
                }
            }), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 28);
            AbstractC22399k.m64473c("Text - Colorized", c28655q, 6);
            final int i15 = 1;
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(list)), interfaceC28601c2.getValue(), null, null, null, AbstractC37817c.m121344e(236946139, c28655q, new InterfaceC4353o() { // from class: zc1.n6
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i15) {
                        case 0:
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130614k(listM118959K, context, interfaceC28601c2, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        case 1:
                            int iIntValue2 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130616m(listM118959K, context, interfaceC28601c2, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130618o(listM118959K, context, interfaceC28601c2, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue3);
                    }
                }
            }), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 28);
            AbstractC22399k.m64473c("Numeric", c28655q, 6);
            List list2 = listM118959K2;
            final int i16 = 2;
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(list2)), interfaceC28601c3.getValue(), null, null, null, AbstractC37817c.m121344e(1184113082, c28655q, new InterfaceC4353o() { // from class: zc1.n6
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i16) {
                        case 0:
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130614k(listM118959K2, context, interfaceC28601c3, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        case 1:
                            int iIntValue2 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130616m(listM118959K2, context, interfaceC28601c3, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj5).intValue();
                            return AbstractC40434p6.m130618o(listM118959K2, context, interfaceC28601c3, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue3);
                    }
                }
            }), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 28);
            AbstractC22399k.m64473c("Numeric - Disabled", c28655q, 6);
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(list2)), 0, null, null, null, AbstractC37817c.m121344e(2131280025, c28655q, new C2624t0(listM118959K2, 5)), c28655q, 196656, 28);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m130614k(List list, Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) list.get(i13));
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            boolean zM39960c = state.getIsSelected();
            boolean zM87157i = c28655q.m87157i(context) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C40424o6(interfaceC28601c1, i13, context, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, 0L, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 384, 233);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m130615l(InterfaceC28601c1 interfaceC28601c1, int i13, Context context, boolean z4) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, "Text: " + interfaceC28601c1.getValue(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130616m(List list, Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) list.get(i13));
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            boolean zM39960c = state.getIsSelected();
            long jM125405l0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getStrainZone1();
            boolean zM87157i = c28655q.m87157i(context) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C40424o6(interfaceC28601c1, i13, context, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, jM125405l0, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 384, 225);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130617n(InterfaceC28601c1 interfaceC28601c1, int i13, Context context, boolean z4) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, "Colorized: " + interfaceC28601c1.getValue(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130618o(List list, Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) list.get(i13));
            EnumC27250e0 enumC27250e0 = EnumC27250e0.NUMERIC;
            boolean zM39960c = state.getIsSelected();
            boolean zM87157i = c28655q.m87157i(context) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C40424o6(interfaceC28601c1, i13, context, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, 0L, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 384, 233);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130619p(InterfaceC28601c1 interfaceC28601c1, int i13, Context context, boolean z4) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, "Numeric: " + interfaceC28601c1.getValue(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130620q(List list, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) list.get(i13));
            EnumC27250e0 enumC27250e0 = EnumC27250e0.NUMERIC;
            boolean zM39960c = state.getIsSelected();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40473t5(3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, 0L, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 100860288, 201);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130621r(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130622s(int i13, Composer composer, int i14) {
        m130613j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
