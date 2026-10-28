package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import com.whoop.profile.view.edit.C9772c;
import g21.AbstractC15280b;
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
import vl0.C36100c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.u3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ll83/a0;", "s", "(Landroidx/compose/runtime/Composer;I)V", "j", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40481u3 {
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
    /* JADX INFO: renamed from: j */
    private static final void m130922j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-139455784);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(0);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            AbstractC22399k.m64473c("Standard", c28655q, 6);
            Integer num = (Integer) interfaceC28601c2.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C40330g(interfaceC28601c2, context, 2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC15280b.m43374d(null, num, zBooleanValue, null, (Function1) objM87133R5, c28655q, 0, 9);
            AbstractC22399k.m64473c("CustomColor", c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, 0L, c38072d.m121949b(c28655q, i14).getStrainZone1(), c38072d.m121949b(c28655q, i14).getAccentAlert(), AbstractC37817c.m121344e(394734161, c28655q, new C36100c(interfaceC28601c3, interfaceC28601c1, context, 11)), c28655q, 24576, 3);
            c28655q = c28655q;
            AbstractC22399k.m64473c("Group of 3", c28655q, 6);
            List listM118959K = AbstractC37056f.m118959K(Integer.valueOf(c38072d.m121951d().getAction().getRemove()), Integer.valueOf(c38072d.m121951d().getAction().getAdd()), Integer.valueOf(c38072d.m121951d().getLogo().getWhoop()));
            Integer num2 = (Integer) interfaceC28601c4.getValue();
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i2 || objM87133R6 == c28676v0) {
                objM87133R6 = new C40330g(interfaceC28601c4, context, 3);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC15280b.m43374d(listM118959K, num2, zBooleanValue2, null, (Function1) objM87133R6, c28655q, 0, 8);
            AbstractC22399k.m64473c("Disable", c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-142491669, c28655q, new C12906g(11, interfaceC28601c1)), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m130923k(InterfaceC28601c1 interfaceC28601c1, Context context, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m130924l(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Context context, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Integer num = (Integer) interfaceC28601c1.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C40330g(interfaceC28601c1, context, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15280b.m43374d(null, num, zBooleanValue, null, (Function1) objM87133R, c28655q, 0, 9);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130925m(InterfaceC28601c1 interfaceC28601c1, Context context, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130926n(InterfaceC28601c1 interfaceC28601c1, Context context, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        Toast.makeText(context, String.valueOf(i13), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130927o(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i14).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(212760210, c28655q, new C9772c(10, interfaceC28601c1)), c28655q, 24576, 13);
            AbstractC15011f9.m43114b(((Boolean) interfaceC28601c1.getValue()).booleanValue() ? "Enabled" : "Disabled", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130928p(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40408n0(16, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130929q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130930r(int i13, Composer composer, int i14) {
        m130922j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m130931s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1492507964);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m130922j(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m130932t(int i13, Composer composer, int i14) {
        m130931s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
