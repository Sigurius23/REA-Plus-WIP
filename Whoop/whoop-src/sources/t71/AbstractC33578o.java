package t71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import i21.AbstractC17999i;
import i21.C17991a;
import i21.C18000j;
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
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sg2.C32469t;
import t01.C33259e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: t71.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt71/p;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33578o {
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0205  */
    /* JADX WARN: Code duplicated, block: B:72:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x0272  */
    /* JADX WARN: Code duplicated, block: B:92:0x027c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
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
    /* JADX INFO: renamed from: d */
    public static final void m106055d(Modifier modifier, C33579p state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        C2314t c2314t2;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        int i16;
        int i17;
        ?? r18;
        int i18;
        Function1 function6;
        Object obj;
        Object objM87133R;
        Object obj2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1358209739);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
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
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        obj2 = objM87133R;
                        C33572i c33572i = new C33572i(2);
                        c28655q.m87172p0(c33572i);
                        obj2 = c33572i;
                    }
                    obj2 = objM87133R;
                    function4 = (Function1) obj2;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (AbstractC8693b.m21270d(state.getHeaderText())) {
                    c28655q.m87150e0(-1860034865);
                    String strM21274h = AbstractC8693b.m21274h(state.getHeaderText(), c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    r15 = 1;
                    c2314t2 = c2314t;
                    function5 = function4;
                    AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
                    C28655q c28655q2 = c28655q;
                    r14 = 0;
                    AbstractC31061c.m95650z(1, 8, c2314t2, c28655q2, false);
                    r16 = c28655q2;
                } else {
                    function5 = function4;
                    c2314t2 = c2314t;
                    r14 = 0;
                    r15 = 1;
                    c28655q.m87150e0(-1859781161);
                    c28655q.m87173q(false);
                    r16 = c28655q;
                }
                if (AbstractC8693b.m21270d(state.getSubText())) {
                    r16.m87150e0(-1859731437);
                    String strM21274h2 = AbstractC8693b.m21274h(state.getSubText(), r16, r14);
                    ?? r19 = C38072d.f163053a;
                    ?? r27 = r16;
                    AbstractC30795n.m94707h(strM21274h2, null, r19.m121949b(r16, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r19.m121952e(r16, 6).getB1(), null, r27, 0, 0, 196602);
                    ?? r24 = r27;
                    AbstractC31061c.m95650z((float) 2.5d, 8, c2314t2, r24, false);
                    r17 = r24;
                } else {
                    r16.m87150e0(-1859481577);
                    r16.m87173q(r14);
                    r17 = r16;
                }
                r17.m87150e0(-337076534);
                i16 = 0;
                for (Object obj3 : state.m106065h()) {
                    i17 = i16 + 1;
                    if (i16 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C18000j c18000j = (C18000j) obj3;
                    if ((i15 & 896) == 256) {
                        r18 = r15;
                    } else {
                        r18 = 0;
                    }
                    i18 = r18 | (r17.m87157i(state) ? 1 : 0);
                    Object objM87133R2 = r17.m87133R();
                    if (i18 == 0 || objM87133R2 == c28676v0) {
                        function6 = function5;
                        C32469t c32469t = new C32469t(16, function6, state);
                        r17.m87172p0(c32469t);
                        obj = c32469t;
                    } else {
                        function6 = function5;
                        obj = objM87133R2;
                    }
                    AbstractC17999i.m51632i(null, c18000j, (Function1) obj, r17, 0, 1);
                    if (state.m106065h().size() > r15 || AbstractC37056f.m118951C(state.m106065h()) == i16) {
                        r17.m87150e0(1440404043);
                        r17.m87173q(false);
                    } else {
                        r17.m87150e0(1440330046);
                        AbstractC31061c.m95650z((float) r15, 8, c2314t2, r17, false);
                    }
                    i16 = i17;
                    function5 = function6;
                }
                r17.m87173q(false);
                r17.m87173q(r15);
                modifier2 = modifier2;
                function3 = function5;
                r10 = r17;
            } else {
                c28655q.m87138X();
                function3 = function2;
                r10 = c28655q;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(modifier2, state, function3, i13, i14, 4);
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
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    obj2 = objM87133R;
                    C33572i c33572i2 = new C33572i(2);
                    c28655q.m87172p0(c33572i2);
                    obj2 = c33572i2;
                }
                obj2 = objM87133R;
                function4 = (Function1) obj2;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (AbstractC8693b.m21270d(state.getHeaderText())) {
                c28655q.m87150e0(-1860034865);
                String strM21274h3 = AbstractC8693b.m21274h(state.getHeaderText(), c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                r15 = 1;
                c2314t2 = c2314t;
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h3, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
                C28655q c28655q3 = c28655q;
                r14 = 0;
                AbstractC31061c.m95650z(1, 8, c2314t2, c28655q3, false);
                r16 = c28655q3;
            } else {
                function5 = function4;
                c2314t2 = c2314t;
                r14 = 0;
                r15 = 1;
                c28655q.m87150e0(-1859781161);
                c28655q.m87173q(false);
                r16 = c28655q;
            }
            if (AbstractC8693b.m21270d(state.getSubText())) {
                r16.m87150e0(-1859731437);
                String strM21274h4 = AbstractC8693b.m21274h(state.getSubText(), r16, r14);
                ?? r110 = C38072d.f163053a;
                ?? r28 = r16;
                AbstractC30795n.m94707h(strM21274h4, null, r110.m121949b(r16, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r110.m121952e(r16, 6).getB1(), null, r28, 0, 0, 196602);
                ?? r25 = r28;
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t2, r25, false);
                r17 = r25;
            } else {
                r16.m87150e0(-1859481577);
                r16.m87173q(r14);
                r17 = r16;
            }
            r17.m87150e0(-337076534);
            i16 = 0;
            while (r11.hasNext()) {
                i17 = i16 + 1;
                if (i16 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C18000j c18000j2 = (C18000j) obj3;
                if ((i15 & 896) == 256) {
                    r18 = r15;
                } else {
                    r18 = 0;
                }
                i18 = r18 | (r17.m87157i(state) ? 1 : 0);
                Object objM87133R3 = r17.m87133R();
                if (i18 == 0) {
                    function6 = function5;
                    C32469t c32469t2 = new C32469t(16, function6, state);
                    r17.m87172p0(c32469t2);
                    obj = c32469t2;
                } else {
                    function6 = function5;
                    C32469t c32469t3 = new C32469t(16, function6, state);
                    r17.m87172p0(c32469t3);
                    obj = c32469t3;
                }
                AbstractC17999i.m51632i(null, c18000j2, (Function1) obj, r17, 0, 1);
                if (state.m106065h().size() > r15) {
                    r17.m87150e0(1440404043);
                    r17.m87173q(false);
                } else {
                    r17.m87150e0(1440404043);
                    r17.m87173q(false);
                }
                i16 = i17;
                function5 = function6;
            }
            r17.m87173q(false);
            r17.m87173q(r15);
            modifier2 = modifier2;
            function3 = function5;
            r10 = r17;
        } else {
            c28655q.m87138X();
            function3 = function2;
            r10 = c28655q;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier2, state, function3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m106056e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m106057f(Function1 function1, C33579p c33579p, C17991a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c33579p.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().invoke(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m106058g(Modifier modifier, C33579p c33579p, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106055d(modifier, c33579p, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
