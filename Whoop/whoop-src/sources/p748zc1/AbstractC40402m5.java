package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i93.C18284j;
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
import p163g1.AbstractC15011f9;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p700bd1.AbstractC42782p;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;
import z21.AbstractC40020b;

/* JADX INFO: renamed from: zc1.m5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ll83/a0;", "y", "(Landroidx/compose/runtime/Composer;I)V", "m", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40402m5 {

    /* JADX INFO: renamed from: zc1.m5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ long f174355w;

        public a(long j7) {
            this.f174355w = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m130319a() {
            return this.f174355w;
        }

        @Override // c93.InterfaceC4339a
        public /* synthetic */ Object invoke() {
            return new C17919x(m130319a());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public static final void m130305m(Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1755186464);
        if (c28655q2.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(0);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC22399k.m64473c("Standard", c28655q2, 6);
            C18284j c18284j = new C18284j(0, 15, 1);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i = c28655q2.m87157i(context);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C40401m4(context, 3);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC40020b.m128260m(c18284j, null, zBooleanValue, null, (Function1) objM87133R3, c28655q2, 0, 10);
            C18284j c18284j2 = new C18284j(0, 7, 1);
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i2 = c28655q2.m87157i(context);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C40401m4(context, 4);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC40020b.m128260m(c18284j2, null, zBooleanValue2, null, (Function1) objM87133R4, c28655q2, 0, 10);
            List listM118959K = AbstractC37056f.m118959K(0, 2, 4, 6, 8);
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i3 = c28655q2.m87157i(context);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                objM87133R5 = new C40401m4(context, 5);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC40020b.m128258k(null, null, listM118959K, null, zBooleanValue3, null, null, null, (Function1) objM87133R5, c28655q2, 384, 235);
            AbstractC22399k.m64473c("Custom Number Color", c28655q2, 6);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, 0L, c38072d.m121949b(c28655q2, i14).getStrainZone1(), c38072d.m121949b(c28655q2, i14).getAccentAlert(), AbstractC37817c.m121344e(529951577, c28655q2, new C37888f1(12, interfaceC28601c1, context)), c28655q2, 24576, 3);
            AbstractC22399k.m64473c("Custom Number Color with titles", c28655q2, 6);
            long jM125401j0 = c38072d.m121949b(c28655q2, i14).getSleepRemSleep();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("title");
            List listM118959K2 = AbstractC37056f.m118959K(AbstractC8693b.m21278l("0 days"), AbstractC8693b.m21278l("3 days"), AbstractC8693b.m21278l("6 days"), AbstractC8693b.m21278l("9 days"));
            List listM118959K3 = AbstractC37056f.m118959K(0, 3, 6, 9);
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87151f = c28655q2.m87151f(jM125401j0);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87151f || objM87133R6 == c28676v0) {
                objM87133R6 = new a(jM125401j0);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
            boolean zM87157i4 = c28655q2.m87157i(context);
            Object objM87133R7 = c28655q2.m87133R();
            if (zM87157i4 || objM87133R7 == c28676v0) {
                objM87133R7 = new C40401m4(context, 6);
                c28655q2.m87172p0(objM87133R7);
            }
            int i15 = TextResource.$stable;
            AbstractC40020b.m128258k(textResourceM21278l, listM118959K2, listM118959K3, null, zBooleanValue4, null, null, interfaceC4339a, (Function1) objM87133R7, c28655q2, i15 | 384 | (i15 << 3), 104);
            AbstractC22399k.m64473c("Dynamic Range", c28655q2, 6);
            C18284j c18284j3 = new C18284j(0, ((Number) interfaceC28601c2.getValue()).intValue(), 1);
            boolean zBooleanValue5 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i5 = c28655q2.m87157i(context);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87157i5 || objM87133R8 == c28676v0) {
                objM87133R8 = new C40401m4(context, 7);
                c28655q2.m87172p0(objM87133R8);
            }
            AbstractC40020b.m128260m(c18284j3, null, zBooleanValue5, null, (Function1) objM87133R8, c28655q2, 0, 10);
            AbstractC22399k.m64473c("Max", c28655q2, 6);
            List listM118959K4 = AbstractC37056f.m118959K(0, 1, 2, 3, 4, 5, 6, 7, 8);
            boolean zBooleanValue6 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i6 = c28655q2.m87157i(context);
            Object objM87133R9 = c28655q2.m87133R();
            if (zM87157i6 || objM87133R9 == c28676v0) {
                objM87133R9 = new C40330g(context, interfaceC28601c2, 5);
                c28655q2.m87172p0(objM87133R9);
            }
            AbstractC40020b.m128258k(null, null, listM118959K4, 0, zBooleanValue6, null, null, null, (Function1) objM87133R9, c28655q2, 3456, 227);
            c28655q = c28655q2;
            AbstractC22399k.m64473c("Disable", c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-567296909, c28655q, new C12906g(13, interfaceC28601c1)), c28655q, 6);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130306n(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R = new C40408n0(27, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
            AbstractC15011f9.m43114b(((Boolean) interfaceC28601c2.getValue()).booleanValue() ? "Enabled" : "Disabled", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130307o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130308p(int i13, Composer composer, int i14) {
        m130305m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130309q(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130310r(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130311s(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m130312t(InterfaceC28601c1 interfaceC28601c1, Context context, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            List listM118959K = AbstractC37056f.m118959K(0, 3, 6, 9);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C40401m4(context, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40020b.m128258k(null, null, listM118959K, null, zBooleanValue, null, null, null, (Function1) objM87133R, c28655q, 384, 235);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m130313u(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m130314v(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m130315w(Context context, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m130316x(Context context, InterfaceC28601c1 interfaceC28601c1, int i13) {
        Toast.makeText(context, String.valueOf(i13), 0).show();
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m130317y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2064935556);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 4 * 8, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            m130305m(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m130318z(int i13, Composer composer, int i14) {
        m130317y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
