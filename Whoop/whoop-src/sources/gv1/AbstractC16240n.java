package gv1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b91.C2886a;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g11.C15218b;
import hy0.AbstractC17722a1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gv1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "description", "", "isConfirmEnabled", "Lkotlin/Function1;", "Lgv1/l;", "Ll83/a0;", "onConfirm", "content", "e", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "selectedType", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16240n {
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
    /* JADX INFO: renamed from: e */
    public static final void m46014e(String description, boolean z4, Function1 onConfirm, Function3 function3, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C28655q c28655q;
        Function3 function4;
        InterfaceC28601c1 interfaceC28601c1;
        Function3 content = function3;
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(onConfirm, "onConfirm");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1417939600);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(description) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onConfirm) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(content) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(EnumC16238l.LOTTIE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            float f15 = 4;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3409f, f15, f15, c38072d.m121949b(c28655q2, i15).getBlack30());
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM95629e);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z13 = m46015f(interfaceC28601c2) == EnumC16238l.LOTTIE;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C15218b(13, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC17722a1.m50718d(layoutWeightElement, "Lottie", null, z13, (InterfaceC4339a) objM87133R2, c28655q2, 24624, 4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z14 = m46015f(interfaceC28601c2) == EnumC16238l.IMAGE;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R3 = new C15218b(14, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
            }
            AbstractC17722a1.m50718d(layoutWeightElement2, "Image", null, z14, (InterfaceC4339a) objM87133R3, c28655q2, 24624, 4);
            c28655q2.m87173q(true);
            InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c1;
            AbstractC30795n.m94707h(description, null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, i16 & 14, C2886a.f11498d << 18, 196602);
            Function3 function5 = function3;
            function5.invoke(m46015f(interfaceC28601c3), c28655q2, Integer.valueOf((i16 >> 6) & 112));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("CONFIRM");
            boolean z15 = (i16 & 896) == 256;
            Object objM87133R4 = c28655q2.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                function1 = onConfirm;
                objM87133R4 = new C3590i(function1, interfaceC28601c3, 17);
                c28655q2.m87172p0(objM87133R4);
            } else {
                function1 = onConfirm;
            }
            AbstractC27292z.m82343j(modifierM3409f2, z4, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (i16 & 112) | 6 | (TextResource.$stable << 18), 0, 8124);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            function4 = function5;
            c28655q = c28655q3;
        } else {
            function1 = onConfirm;
            c28655q2.m87138X();
            function4 = content;
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(description, z4, function1, function4, i13, 13);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final EnumC16238l m46015f(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC16238l) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m46016g(InterfaceC28601c1 interfaceC28601c1, EnumC16238l enumC16238l) {
        interfaceC28601c1.setValue(enumC16238l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m46017h(InterfaceC28601c1 interfaceC28601c1) {
        m46016g(interfaceC28601c1, EnumC16238l.LOTTIE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m46018i(InterfaceC28601c1 interfaceC28601c1) {
        m46016g(interfaceC28601c1, EnumC16238l.IMAGE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46019j(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m46015f(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m46020k(String str, boolean z4, Function1 function1, Function3 function3, int i13, Composer composer, int i14) {
        m46014e(str, z4, function1, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
