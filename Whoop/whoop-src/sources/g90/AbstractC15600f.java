package g90;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fc0.C14361e;
import g40.C15449y1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j80.InterfaceC21413a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
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
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: g90.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lg90/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lg90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "learnMore", "f", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15600f {

    /* JADX INFO: renamed from: g90.f$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"g90/f$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f58561a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f58562b;

        public a(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f58561a = interfaceC1585g0;
            this.f58562b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f58561a.getLifecycle().mo4988d(this.f58562b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
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
    /* JADX INFO: renamed from: f */
    private static final void m43904f(TextResource textResource, TextResource textResource2, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r10;
        C2314t c2314t;
        C28655q c28655q2;
        C28655q c28655q3;
        C28655q c28655q4;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-1680990188);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q5.m87153g(textResource) : c28655q5.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q5.m87153g(textResource2) : c28655q5.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q5.m87153g(str) ? 256 : 128;
        }
        if (c28655q5.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, 10 * f13, 7);
            float f14 = ((float) 0.5d) * f13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q5, 6);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N);
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q5, (i14 & 14) | i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q5, i16).getT2();
            long jM125430y = c38072d.m121949b(c28655q5, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q5, 0, i17, 196602);
            C28655q c28655q6 = c28655q5;
            if (textResource2 == null) {
                c28655q6.m87150e0(562288221);
                c28655q6.m87173q(false);
                c2314t = c2314t2;
                r10 = 1;
            } else {
                c28655q6.m87150e0(562288222);
                AbstractC11266d.m30469w(1, 4, c2314t2, c28655q6);
                r10 = 1;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q6, i15), null, c38072d.m121949b(c28655q6, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q6, i16).getB1(), null, c28655q6, 0, i17, 196602);
                c28655q2.m87173q(false);
            }
            if (str == null) {
                c28655q2 = c28655q6;
                c28655q3 = c28655q2;
                c28655q3 = c28655q6;
                c28655q3.m87150e0(562563718);
                c28655q3.m87173q(false);
                c28655q4 = c28655q3;
            } else {
                c28655q2 = c28655q6;
                c28655q3 = c28655q2;
                c28655q3 = c28655q6;
                c28655q3.m87150e0(562563719);
                C2314t c2314t3 = c2314t;
                AbstractC11266d.m30469w((float) r10, 4, c2314t3, c28655q3);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t3, 0.0f, f14, 0.0f, 0.0f, 13);
                C21053l c21053l = C21053l.f79834a;
                C23285v0 style = r36.m121952e(c28655q3, i16).getBtS().getStyle();
                long jM125430y2 = r36.m121949b(c28655q3, i16).getBrandWhite();
                C28655q c28655q7 = c28655q3;
                C28655q c28655q8 = c28655q7;
                AbstractC21048g.m58807M(str, modifierM3398t2, false, c21053l.m58880a(style, c38072d.m121949b(c28655q3, i16).getWhite70(), 0L, 0L, null, jM125430y2, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q7, 0, C21053l.f79835b << 15, 32732), null, 0, 0, 0, false, c28655q8, (C21054m.f79836p << 9) | 48, 500);
                c28655q8.m87173q(false);
                c28655q4 = c28655q8;
            }
            c28655q4.m87173q(r10);
            c28655q = c28655q4;
        } else {
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15597c(textResource, textResource2, str, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m43905g(TextResource textResource, TextResource textResource2, String str, int i13, Composer composer, int i14) {
        m43904f(textResource, textResource2, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m43906h(C15601g viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC1585g0 interfaceC1585g0;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z14;
        int iHashCode2;
        AbstractC22403o abstractC22403oM43911a;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(690999389);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C15449y1(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(interfaceC1585g0);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C15599e(interfaceC1585g0, function4, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q);
                c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f14, 3 * f13, f14, 0.0f, 8);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, f14, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                Function1 function5 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                abstractC22403oM43911a = viewState.getImage();
                if (abstractC22403oM43911a == null) {
                    c28655q.m87150e0(2044553119);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2044553120);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM43911a, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                TextResource textResourceM43913c = viewState.getTitle();
                TextResource textResourceM43914d = viewState.getSubtitle();
                String strM43912b = viewState.getLearnMore();
                int i17 = TextResource.$stable;
                m43904f(textResourceM43913c, textResourceM43914d, strM43912b, c28655q, i17 | (i17 << 3));
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 6);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C15449y1(16);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q.m87157i(interfaceC1585g0);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C15599e(interfaceC1585g0, function4, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C15599e(interfaceC1585g0, function4, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q);
            c2314t = C2314t.f9131w;
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f16, 3 * f15, f16, 0.0f, 8);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, f16, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            Function1 function6 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            abstractC22403oM43911a = viewState.getImage();
            if (abstractC22403oM43911a == null) {
                c28655q.m87150e0(2044553119);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2044553120);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM43911a, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            TextResource textResourceM43913c2 = viewState.getTitle();
            TextResource textResourceM43914d2 = viewState.getSubtitle();
            String strM43912b2 = viewState.getLearnMore();
            int i18 = TextResource.$stable;
            m43904f(textResourceM43913c2, textResourceM43914d2, strM43912b2, c28655q, i18 | (i18 << 3));
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m43907i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC28620h0 m43908j(InterfaceC1585g0 interfaceC1585g0, Function1 function1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C15598d c15598d = new C15598d(function1, 0);
        interfaceC1585g0.getLifecycle().mo4986a(c15598d);
        return new a(interfaceC1585g0, c15598d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m43909k(Function1 function1, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_RESUME) {
            function1.invoke(InterfaceC21413a.b.f82096a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m43910l(C15601g c15601g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m43906h(c15601g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
