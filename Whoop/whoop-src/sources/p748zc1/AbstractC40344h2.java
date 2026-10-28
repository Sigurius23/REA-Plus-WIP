package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h32.C16829b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
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
import vy0.AbstractC36568c0;
import vy0.AbstractC36596x;
import vy0.AbstractC36597y;
import vy0.C36570d0;
import vy0.C36598z;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: zc1.h2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40344h2 {
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: h */
    public static final void m129858h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-894760868);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i14).getBrandBlack(), AbstractC17918w0.f69621a);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC22399k.m64473c("Standard FAB", c28655q, 6);
            C39274g c39274g = new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), null, 2, 0 == true ? 1 : 0);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C16829b(context, 21);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = C39274g.f168929c << 3;
            AbstractC36596x.m117529s(null, c39274g, 0L, 0L, false, null, (Function1) objM87133R, c28655q, i15, 61);
            AbstractC22399k.m64473c("Custom Color FAB", c28655q, 6);
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            C39274g c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAction().getJournal(), null, 2, 0 == true ? 1 : 0);
            long jM125377a = c38072d.m121949b(c28655q, i14).getAccentAction();
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16829b(context, 22);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36596x.m117529s(null, c39274g2, jM125377a, 0L, false, null, (Function1) objM87133R2, c28655q, i15, 57);
            AbstractC22399k.m64473c("Descriptive FAB", c28655q, 6);
            C39274g c39274g3 = new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("ADD ACTIVITY");
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C40387l1(context, 1);
                c28655q.m87172p0(objM87133R3);
            }
            int i16 = TextResource.$stable << 6;
            AbstractC36596x.m117521k(null, c39274g3, textResourceM21278l, 0L, 0L, false, 1.0f, 0.0f, (InterfaceC4339a) objM87133R3, c28655q, 1572864 | i15 | i16, 185);
            AbstractC22399k.m64473c("Glowing FAB", c28655q, 6);
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C39274g c39274g4 = new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), null, 2, 0 == true ? 1 : 0);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C16829b(context, 23);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC36596x.m117529s(null, c39274g4, 0L, 0L, true, null, (Function1) objM87133R4, c28655q, i15 | 24576, 45);
            C39274g c39274g5 = new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), objArr4 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("ADD ACTIVITY");
            boolean zM87157i5 = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C40387l1(context, 2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC36596x.m117521k(null, c39274g5, textResourceM21278l2, 0L, 0L, true, 1.0f, 0.0f, (InterfaceC4339a) objM87133R5, c28655q, i15 | 1769472 | i16, 153);
            c28655q = c28655q;
            AbstractC22399k.m64473c("FAB Menu", c28655q, 6);
            EnumC16313m0 enumC16313m0 = EnumC16313m0.ADD;
            int i17 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            C36570d0 c36570d0 = new C36570d0(AbstractC37056f.m118959K(new C36598z("Add Period", null, enumC16313m0, 2, null), new C36598z("Add Ovulation", null, enumC16313m0, i17, defaultConstructorMarker), new C36598z("Add Symptoms & Behaviors", null, enumC16313m0, i17, defaultConstructorMarker)));
            boolean zM87157i6 = c28655q.m87157i(context);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new C16829b(context, 24);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC36568c0.m117308m(c36570d0, null, (Function1) objM87133R6, c28655q, C36570d0.f156622b, 2);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129859i(Context context, boolean z4) {
        Toast.makeText(context, "Standard Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129860j(Context context, boolean z4) {
        Toast.makeText(context, "Custom Color Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129861k(Context context) {
        Toast.makeText(context, "Descriptive Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m129862l(Context context, boolean z4) {
        Toast.makeText(context, "Glowing Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m129863m(Context context) {
        Toast.makeText(context, "Glowing Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m129864n(Context context, AbstractC36597y event) {
        AbstractC22676k.m65750j(event, "event");
        Toast.makeText(context, "Clicked: " + event, 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m129865o(int i13, Composer composer, int i14) {
        m129858h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
