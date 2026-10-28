package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e31.AbstractC12610b;
import e31.C12609a;
import e31.C12611c;
import gy0.AbstractC16272a;
import i91.AbstractC18249c;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;
import z91.C40204a;

/* JADX INFO: renamed from: zc1.c5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "o", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40292c5 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m129435A(Context context) {
        Toast.makeText(context, "Primary Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m129436B(Context context) {
        Toast.makeText(context, "Secondary Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m129437C(int i13, Composer composer, int i14) {
        m129452o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static final void m129452o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2014164316);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            Modifier modifierM52565c = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd()));
            AbstractC22399k.m64473c("Saving", c28655q, 6);
            AbstractC33208p0.f fVar = AbstractC33208p0.f.f138478e;
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Savings Support Text");
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            Object obj = objM87133R;
            if (zM87157i || objM87133R == c28676v0) {
                C40387l1 c40387l1 = new C40387l1(context, 4);
                c28655q.m87172p0(c40387l1);
                obj = c40387l1;
            }
            C12611c c12611c = new C12611c(modifierM52565c, fVar, textResourceM21278l, null, null, (InterfaceC4339a) obj, 24, null);
            int i14 = C12611c.f43049g;
            AbstractC12610b.m35349f(c12611c, null, null, c28655q, i14, 6);
            AbstractC22399k.m64473c("Loading..", c28655q, 6);
            AbstractC33208p0.c cVar = AbstractC33208p0.c.f138471e;
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C40387l1 c40387l2 = new C40387l1(context, 12);
                c28655q.m87172p0(c40387l2);
                obj2 = c40387l2;
            }
            TextResource textResource = null;
            DefaultConstructorMarker defaultConstructorMarker = null;
            AbstractC12610b.m35349f(new C12611c(modifierM52565c, cVar, textResource, null, null, (InterfaceC4339a) obj2, 28, defaultConstructorMarker), null, null, c28655q, i14, 6);
            AbstractC22399k.m64473c("Saved..", c28655q, 6);
            AbstractC33208p0.h hVar = new AbstractC33208p0.h(textResource, 0L, null, 7, defaultConstructorMarker);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Success support text");
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i3 || objM87133R3 == c28676v0) {
                C40387l1 c40387l3 = new C40387l1(context, 13);
                c28655q.m87172p0(c40387l3);
                obj3 = c40387l3;
            }
            AbstractC12610b.m35349f(new C12611c(modifierM52565c, hVar, textResourceM21278l2, null, null, (InterfaceC4339a) obj3, 24, null), null, null, c28655q, i14, 6);
            AbstractC22399k.m64473c("SuccessAutoDismiss..", c28655q, 6);
            Object objM87133R4 = c28655q.m87133R();
            Object obj4 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C40204a c40204a = new C40204a(21);
                c28655q.m87172p0(c40204a);
                obj4 = c40204a;
            }
            AbstractC33208p0.h hVar2 = new AbstractC33208p0.h(null, 2000L, (InterfaceC4339a) obj4, 1, null);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Success support text");
            Object objM87133R5 = c28655q.m87133R();
            Object obj5 = objM87133R5;
            if (objM87133R5 == c28676v0) {
                C40204a c40204a2 = new C40204a(22);
                c28655q.m87172p0(c40204a2);
                obj5 = c40204a2;
            }
            AbstractC12610b.m35349f(new C12611c(modifierM52565c, hVar2, textResourceM21278l3, null, null, (InterfaceC4339a) obj5, 24, null), null, null, c28655q, i14, 6);
            AbstractC22399k.m64473c("Error..", c28655q, 6);
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l("Error Title"), false, false ? 1 : 0, 6, null);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Error support text");
            C12609a c12609a = new C12609a(AbstractC8693b.m21278l("Error primary action"), null, null, 6, null);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R6 = c28655q.m87133R();
            Object obj6 = objM87133R6;
            if (zM87157i4 || objM87133R6 == c28676v0) {
                C40387l1 c40387l4 = new C40387l1(context, 14);
                c28655q.m87172p0(c40387l4);
                obj6 = c40387l4;
            }
            C12611c c12611c2 = new C12611c(modifierM52565c, bVar, textResourceM21278l4, c12609a, null, (InterfaceC4339a) obj6, 16, null);
            boolean zM87157i5 = c28655q.m87157i(context);
            Object objM87133R7 = c28655q.m87133R();
            Object obj7 = objM87133R7;
            if (zM87157i5 || objM87133R7 == c28676v0) {
                C40387l1 c40387l5 = new C40387l1(context, 5);
                c28655q.m87172p0(c40387l5);
                obj7 = c40387l5;
            }
            AbstractC12610b.m35349f(c12611c2, (InterfaceC4339a) obj7, null, c28655q, i14, 4);
            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l("Error Title"), false, null, 6, null);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Error support text");
            int i15 = 6;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            Integer num = null;
            Integer num2 = null;
            C12609a c12609a2 = new C12609a(AbstractC8693b.m21278l("Error primary action"), num, num2, i15, defaultConstructorMarker2);
            C12609a c12609a3 = new C12609a(AbstractC8693b.m21278l("Error secondary action"), num, num2, i15, defaultConstructorMarker2);
            boolean zM87157i6 = c28655q.m87157i(context);
            Object objM87133R8 = c28655q.m87133R();
            Object obj8 = objM87133R8;
            if (zM87157i6 || objM87133R8 == c28676v0) {
                C40387l1 c40387l6 = new C40387l1(context, 6);
                c28655q.m87172p0(c40387l6);
                obj8 = c40387l6;
            }
            C12611c c12611c3 = new C12611c(modifierM52565c, bVar2, textResourceM21278l5, c12609a2, c12609a3, (InterfaceC4339a) obj8);
            boolean zM87157i7 = c28655q.m87157i(context);
            Object objM87133R9 = c28655q.m87133R();
            Object obj9 = objM87133R9;
            if (zM87157i7 || objM87133R9 == c28676v0) {
                C40387l1 c40387l7 = new C40387l1(context, 7);
                c28655q.m87172p0(c40387l7);
                obj9 = c40387l7;
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj9;
            boolean zM87157i8 = c28655q.m87157i(context);
            Object objM87133R10 = c28655q.m87133R();
            Object obj10 = objM87133R10;
            if (zM87157i8 || objM87133R10 == c28676v0) {
                C40387l1 c40387l8 = new C40387l1(context, 8);
                c28655q.m87172p0(c40387l8);
                obj10 = c40387l8;
            }
            AbstractC12610b.m35349f(c12611c3, interfaceC4339a, (InterfaceC4339a) obj10, c28655q, i14, 0);
            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l("Error Title"), true, null, 4, null);
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Error support text");
            C12609a c12609a4 = new C12609a(AbstractC8693b.m21278l("Error primary action"), null, null, 6, null);
            C12609a c12609a5 = new C12609a(AbstractC8693b.m21278l("Error secondary action"), false ? 1 : 0, null, 6, null);
            boolean zM87157i9 = c28655q.m87157i(context);
            Object objM87133R11 = c28655q.m87133R();
            Object obj11 = objM87133R11;
            if (zM87157i9 || objM87133R11 == c28676v0) {
                C40387l1 c40387l9 = new C40387l1(context, 9);
                c28655q.m87172p0(c40387l9);
                obj11 = c40387l9;
            }
            C12611c c12611c4 = new C12611c(modifierM52565c, bVar3, textResourceM21278l6, c12609a4, c12609a5, (InterfaceC4339a) obj11);
            boolean zM87157i10 = c28655q.m87157i(context);
            Object objM87133R12 = c28655q.m87133R();
            Object obj12 = objM87133R12;
            if (zM87157i10 || objM87133R12 == c28676v0) {
                C40387l1 c40387l10 = new C40387l1(context, 10);
                c28655q.m87172p0(c40387l10);
                obj12 = c40387l10;
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj12;
            boolean zM87157i11 = c28655q.m87157i(context);
            Object objM87133R13 = c28655q.m87133R();
            Object obj13 = objM87133R13;
            if (zM87157i11 || objM87133R13 == c28676v0) {
                C40387l1 c40387l11 = new C40387l1(context, 11);
                c28655q.m87172p0(c40387l11);
                obj13 = c40387l11;
            }
            AbstractC12610b.m35349f(c12611c4, interfaceC4339a2, (InterfaceC4339a) obj13, c28655q, i14, 0);
            AbstractC22399k.m64473c("Secondary Action Error Retry", c28655q, 6);
            AbstractC12610b.m35349f(new C12611c(modifierM52565c, new AbstractC33208p0.b(AbstractC8693b.m21267a(), true, new AbstractC22403o.a(AbstractC16272a.f62158t)), AbstractC8693b.m21278l("Couldn't load data."), null, new C12609a(AbstractC8693b.m21278l("RELOAD"), null, Integer.valueOf(new AbstractC22403o.a(AbstractC16272a.f61920F2).getId()), 2, null), false ? 1 : 0, 40, null), null, null, c28655q, i14, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m129453p(Context context) {
        Toast.makeText(context, "Saving", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m129454q(Context context) {
        Toast.makeText(context, "Loading", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m129455r(Context context) {
        Toast.makeText(context, "Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m129456s(Context context) {
        Toast.makeText(context, "Primary Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m129457t(Context context) {
        Toast.makeText(context, "Secondary Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m129458u(Context context) {
        Toast.makeText(context, "Saved", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m129459v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m129460w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m129461x(Context context) {
        Toast.makeText(context, "Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m129462y(Context context) {
        Toast.makeText(context, "Primary Error", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m129463z(Context context) {
        Toast.makeText(context, "Error", 0).show();
        return C23454a0.f92919a;
    }
}
