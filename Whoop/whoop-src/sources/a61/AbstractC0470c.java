package a61;

import a01.C0085e;
import a20.C0167g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k71.AbstractC22253j;
import k71.C22259p;
import k71.EnumC22244c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C13762f;
import p000.C17820i;
import p000.C28503p;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x11.C37829c;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: a61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "La61/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onBodyItemClicked", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "p", "(Landroidx/compose/runtime/Composer;I)Z", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0470c {
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m1137h(Modifier modifier, C0472e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        long jMo134584toComposableColorWaAFU9c;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(740665582);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C28503p(7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C17820i(6, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2);
                if (m1145p(c28655q, 0)) {
                    c28655q.m87150e0(-1184935659);
                    jMo134584toComposableColorWaAFU9c = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1184934399);
                    jMo134584toComposableColorWaAFU9c = viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                }
                AbstractC31926e.m99375j(modifierMo3471e, null, jMo134584toComposableColorWaAFU9c, C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(-1392741250, c28655q, new C0003a0(1, viewState, function4)), c28655q, 12582912, 114);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(modifier2, viewState, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C28503p(7);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C17820i(6, function4, viewState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C17820i(6, function4, viewState);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierMo3471e2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2);
            if (m1145p(c28655q, 0)) {
                c28655q.m87150e0(-1184935659);
                jMo134584toComposableColorWaAFU9c = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1184934399);
                jMo134584toComposableColorWaAFU9c = viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC31926e.m99375j(modifierMo3471e2, null, jMo134584toComposableColorWaAFU9c, C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(-1392741250, c28655q, new C0003a0(1, viewState, function4)), c28655q, 12582912, 114);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier2, viewState, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m1138i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m1139j(Function1 function1, C0472e c0472e) {
        function1.invoke(c0472e.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r12v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v15, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v16, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v18, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v19, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v21, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v22, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v24, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v25, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r21v7, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r9v20, types: [x81.d] */
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
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m1140k(C0472e c0472e, Function1 function1, Composer composer, int i13) {
        C0213j c0213j;
        ?? r10;
        C28655q c28655q;
        ?? r14;
        C2314t c2314t;
        C23454a0 c23454a0;
        C2314t c2314t2;
        ?? r15;
        ?? r16;
        Object obj;
        ?? r17;
        C2314t c2314t3;
        float f13;
        C28676v0 c28676v0;
        ?? r18;
        boolean z4;
        ?? r19;
        AbstractC26165a abstractC26165a;
        ?? r110;
        ?? r24;
        ?? r111;
        float f14;
        ?? r25;
        ?? r112;
        Object obj2;
        ?? r26;
        C23454a0 c23454a1;
        ?? r113;
        boolean z13;
        long jM95627c;
        ?? r27;
        ?? r114;
        boolean z14;
        C28655q c28655q2;
        C2306l c2306l = C2299e.f9108K;
        C28655q c28655q3 = (C28655q) composer;
        boolean zM87135U = c28655q3.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a2 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q3.m87138X();
            return c23454a2;
        }
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
        int iHashCode = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
        C2314t c2314t4 = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t4);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        c28655q3.m87158i0();
        if (c28655q3.f115903S) {
            c28655q3.m87163l(c0213j2);
        } else {
            c28655q3.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
        float f15 = 2;
        float f16 = 8;
        float f17 = f15 * f16;
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t4, f17, f17, f17, 0.0f, 8);
        C2314t c2314t5 = c2314t4;
        float f18 = f17;
        float f19 = ((float) 1.5d) * f16;
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f19, c2305k), c2306l, c28655q3, 54);
        int iHashCode2 = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
        c28655q3.m87158i0();
        C2305k c2305k2 = c2305k;
        if (c28655q3.f115903S) {
            c0213j = c0213j2;
            c28655q3.m87163l(c0213j);
        } else {
            c0213j = c0213j2;
            c28655q3.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
        int i14 = 6;
        if (c0472e.getCircularProgress() == null) {
            c28655q3.m87150e0(942801699);
            EnumC22244c checkmarkStyle = c0472e.getCheckmarkStyle();
            if (checkmarkStyle == null) {
                c28655q3.m87150e0(-837918402);
                c28655q3.m87173q(false);
                z14 = false;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-837918401);
                C38072d c38072d = C38072d.f163053a;
                AbstractC22253j.m63847q(c38072d.m121949b(c28655q3, 6).getBrandBlack(), c38072d.m121949b(c28655q3, 6).getAccentAction(), AbstractC2875y.m8290c(c38072d), checkmarkStyle == EnumC22244c.ENABLED, c28655q3, 0);
                C28655q c28655q4 = c28655q3;
                z14 = false;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            c28655q2.m87173q(z14);
            r10 = z14;
            c28655q = c28655q2;
        } else {
            c2314t5 = c2314t5;
            c0213j = c0213j;
            c0209i2 = c0209i2;
            f15 = f15;
            c0209i3 = c0209i3;
            f19 = f19;
            c2305k2 = c2305k2;
            f18 = f18;
            r10 = 0;
            c28655q3.m87150e0(-837520950);
            c28655q3.m87173q(false);
            c28655q = c28655q3;
        }
        String strM21274h = AbstractC8693b.m21274h(c0472e.getTitle(), c28655q, r10);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
        ?? r115 = C38072d.f163053a;
        C28655q c28655q5 = c28655q;
        AbstractC30795n.m94707h(strM21274h, layoutWeightElement, r115.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r115.m121952e(c28655q, 6).getB1(), null, c28655q5, 0, 0, 196600);
        ?? r116 = c28655q5;
        C28582b circularProgress = c0472e.getCircularProgress();
        if (circularProgress == null) {
            r116.m87150e0(-837207293);
            r14 = 0;
            r116.m87173q(false);
            c23454a0 = null;
            c2314t = c2314t5;
        } else {
            r14 = 0;
            r116.m87150e0(-837207292);
            c2314t = c2314t5;
            AbstractC28586f.m86944i(AbstractC15676d.m44101d(c2314t, "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(c0472e.getTitle(), r116, 0), " ", "_", false))), circularProgress, r116, 0, 0);
            r116.m87173q(false);
            c23454a0 = c23454a2;
        }
        if (c23454a0 == null) {
            r116.m87150e0(-836877235);
            TextResource subText = c0472e.getSubText();
            if (subText == null) {
                r116.m87150e0(-286433893);
                r116.m87173q(r14);
                r27 = r14;
                c2314t2 = c2314t;
                r114 = r116;
            } else {
                r116.m87150e0(-286433892);
                String strM21274h2 = AbstractC8693b.m21274h(subText, r116, r14);
                C2886a n13 = r115.m121952e(r116, 6).getN8();
                if (c0472e.getCheckmarkStyle() == EnumC22244c.ENABLED) {
                    r116.m87150e0(1415960736);
                    jM95627c = r115.m121949b(r116, 6).getAccentAction();
                } else {
                    jM95627c = AbstractC31061c.m95627c(r116, 1415961883, r115, r116, 6);
                }
                r116.m87173q(r14);
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM21274h2, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, r116, 0, 0, 196602);
                ?? r117 = r116;
                r27 = 0;
                r117.m87173q(false);
                r114 = r117;
            }
            r114.m87173q(r27);
            r16 = r27;
            r15 = r114;
        } else {
            ?? r28 = r14;
            c2314t2 = c2314t;
            r116.m87150e0(942824187);
            r116.m87173q(r28);
            r16 = r28;
            r15 = r116;
        }
        r15.m87173q(true);
        C22259p planProgressStatusState = c0472e.getPlanProgressStatusState();
        C28676v0 c28676v1 = C28635l.f115821a;
        if (planProgressStatusState == null) {
            r15.m87150e0(-1531338721);
            r15.m87173q(r16);
            r17 = r16;
        } else {
            r15.m87150e0(-1531338720);
            InterfaceC25312u interfaceC25312uM63924a = planProgressStatusState.getProgressBreakdown();
            C13762f c13762f = new C13762f(1);
            Object objM87133R = r15.m87133R();
            if (objM87133R == c28676v1) {
                obj = objM87133R;
                C28503p c28503p = new C28503p(8);
                r15.m87172p0(c28503p);
                obj = c28503p;
            }
            obj = objM87133R;
            AbstractC25303l.m74291r(interfaceC25312uM63924a, null, c13762f, (Function1) obj, r15, 3072, 2);
            r17 = 0;
            r15.m87173q(false);
        }
        List<C0473f> listM1186j = c0472e.m1186j();
        if (listM1186j == null) {
            r15.m87150e0(-1531115273);
            r15.m87173q(r17);
            c2314t3 = c2314t2;
            c28676v0 = c28676v1;
            f13 = f18;
            r18 = r17;
            r111 = r15;
        } else {
            r15.m87150e0(-1531115272);
            float f24 = f18;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f24, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k2, r15, r17 == true ? 1 : 0);
            int iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM3396r);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m3);
            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N3);
            r15.m87150e0(-1616008069);
            ?? r118 = r15;
            for (C0473f c0473f : listM1186j) {
                float f25 = 4;
                C2314t c2314t6 = c2314t2;
                C28676v0 c28676v2 = c28676v1;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t6, 0.0f, f15 * f25, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f19), c2306l, r118, 54);
                int iHashCode4 = Long.hashCode(r118.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r118.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r118, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                r118.m87158i0();
                if (r118.f115903S) {
                    r118.m87163l(c0213j3);
                } else {
                    r118.m87178s0();
                }
                AbstractC28683x.m87239G(r118, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(r118, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i5 = C0217k.f732j;
                if (r118.f115903S || !AbstractC22676k.m65745e(r118.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, r118, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r118, C0217k.f726d, modifierM118962N4);
                String strM21274h3 = AbstractC8693b.m21274h(c0473f.getValue(), r118, 0);
                ?? r29 = C38072d.f163053a;
                ?? r33 = r118;
                float f26 = f24;
                C2306l c2306l2 = c2306l;
                AbstractC30795n.m94707h(strM21274h3, null, c0473f.getColor().mo134584toComposableColorWaAFU9c(r118, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r29.m121952e(r118, i14).getN7(), null, r33, 0, 0, 196602);
                ?? r119 = r33;
                AbstractC22403o abstractC22403oM1190b = c0473f.getIcon();
                if (abstractC22403oM1190b == null) {
                    r119.m87150e0(-1840426533);
                    z4 = false;
                    r119.m87173q(false);
                    abstractC26165a = null;
                } else {
                    z4 = false;
                    r119.m87150e0(-197915930);
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM1190b, null, null, r119, 0, 3);
                    r19.m87173q(false);
                    abstractC26165a = abstractC26165aM64500i;
                }
                if (abstractC26165a == null) {
                    r19 = r119;
                    r110 = r19;
                    r110 = r119;
                    r110.m87150e0(-1840391968);
                    r110.m87173q(z4);
                    r24 = z4;
                } else {
                    r19 = r119;
                    r110 = r19;
                    r110 = r119;
                    ?? r34 = r110;
                    r24 = z4;
                    AbstractC15005f3.m43107a(abstractC26165a, null, AbstractC18489d0.m53365f(r110, -1840391967, f25, f25, c2314t6), r29.m121949b(r110, 6).getWhite50(), r34, 432, 0);
                    r110 = r34;
                    r110.m87173q(r24);
                }
                ?? r35 = r110;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c0473f.getName(), r110, r24), null, r29.m121949b(r110, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r29.m121952e(r110, 6).getH5(), null, r35, 0, 0, 196602);
                ?? r120 = r35;
                r120.m87173q(true);
                c28676v1 = c28676v2;
                f24 = f26;
                c2314t2 = c2314t6;
                c2306l = c2306l2;
                i14 = 6;
                r118 = r120;
            }
            c2314t3 = c2314t2;
            f13 = f24;
            c28676v0 = c28676v1;
            r18 = 0;
            AbstractC25012a.m73392y(r118, false, true, false);
            r111 = r118;
        }
        TextResource footerText = c0472e.getFooterText();
        if (footerText == null) {
            r111.m87150e0(-1529662923);
            r111.m87173q(r18);
            f14 = 1.0f;
            r25 = r18;
            r112 = r111;
        } else {
            r111.m87150e0(-1529662922);
            String strM21274h4 = AbstractC8693b.m21274h(footerText, r111, r18 == true ? 1 : 0);
            ?? r36 = C38072d.f163053a;
            long white50 = r36.m121949b(r111, 6).getWhite50();
            C2886a b6 = r36.m121952e(r111, 6).getB2();
            f14 = 1.0f;
            ?? r37 = r111;
            AbstractC30795n.m94707h(strM21274h4, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t3), f13, f19), white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, r37, 48, 0, 196600);
            ?? r121 = r37;
            r25 = 0;
            r121.m87173q(false);
            r112 = r121;
        }
        C37829c cardCtaState = c0472e.getCardCtaState();
        TextResource textResourceM121370a = cardCtaState != null ? cardCtaState.getButtonLabel() : null;
        if (textResourceM121370a == null) {
            r112.m87150e0(-1529236580);
            r112.m87173q(r25);
            c23454a1 = null;
        } else {
            r112.m87150e0(-1529236579);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null);
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f14, c2314t3), 1 * f16, 0.0f, 0.0f, f13, 6);
            boolean zM87153g = r112.m87153g(function1) | r112.m87157i(c0472e);
            Object objM87133R2 = r112.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                obj2 = objM87133R2;
                C0167g c0167g = new C0167g(1, function1, c0472e);
                r112.m87172p0(c0167g);
                obj2 = c0167g;
            }
            ?? r210 = r112;
            AbstractC27265l0.m82217i(modifierM3398t3, enumC27269n0, textResourceM121370a, null, c39274g, false, null, null, false, false, null, null, (Function1) obj2, r210, 54, 0, 4072);
            ?? r122 = r210;
            r26 = 0;
            r122.m87173q(false);
            c23454a1 = c23454a2;
            r113 = r122;
        }
        if (c23454a1 == null) {
            r26 = r25;
            r113 = r112;
            r113.m87150e0(-1528783235);
            z13 = true;
            AbstractC31061c.m95650z(1, f16, c2314t3, r113, r26);
        } else {
            r26 = r25;
            r113 = r112;
            z13 = true;
            r113.m87150e0(1336142047);
            r113.m87173q(r26);
        }
        r113.m87173q(z13);
        return c23454a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m1141l(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-103471288);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m1142m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m1143n(Function1 function1, C0472e c0472e, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c0472e.getCardCtaState().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m1144o(Modifier modifier, C0472e c0472e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m1137h(modifier, c0472e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m1145p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
            c28655q.m87150e0(40468715);
            c28655q.m87173q(false);
            return true;
        }
        c28655q.m87150e0(1386780709);
        boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
        c28655q.m87173q(false);
        return zIsFeatureEnabled;
    }
}
