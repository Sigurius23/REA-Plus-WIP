package xq2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b03.C2206c;
import b61.AbstractC2756k;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rq2.AbstractC31752t0;
import rz0.AbstractC31926e;
import s51.AbstractC32215l;
import s51.C32212i;
import te0.AbstractC33745d;
import vl0.C36100c;
import w71.C36891k;
import wb3.AbstractC37056f;
import wq2.AbstractC37514c;
import x81.C38072d;
import xl0.C38448b;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: xq2.l0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxq2/m0;", "viewState", "Lm91/p;", "itemViewFactory", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "o", "(Lxq2/m0;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "image", "Ls51/i;", "scoreGaugeItemState", "q", "(Lkd1/o;Ls51/i;Landroidx/compose/runtime/Composer;I)V", "", "Lm91/u;", "cardItems", "t", "(Ljava/util/List;Lm91/p;Landroidx/compose/runtime/Composer;I)V", "A", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38576l0 {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    /* JADX INFO: renamed from: A */
    public static final void m123669A(Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        final String strM92103Y;
        final String strM92103Y2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g;
        Object objM87133R;
        Object objM87133R2;
        int i16;
        boolean z13;
        Object objM87133R3;
        boolean zM87153g2;
        Object objM87133R4;
        Object objM87133R5;
        boolean z14;
        Object objM87133R6;
        Object objM87133R7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-817200137);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
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
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C38448b(12);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170908a);
                strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170909b);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "YearInReviewCard Back Press"));
                if (0.3f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e = modifierM3406c.mo3471e(new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true));
                zM87153g = c28655q.m87153g(strM92103Y);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    final int i19 = 0;
                    objM87133R = new Function1() { // from class: xq2.k0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC38576l0.m123671C(strM92103Y, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC38576l0.m123673E(strM92103Y, (InterfaceC18044z) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, false, (Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C38557d1(function4, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28), c28655q, 0);
                Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "YearInReviewCard Forward Press"));
                if (0.7f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e2 = modifierM3406c2.mo3471e(new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
                zM87153g2 = c28655q.m87153g(strM92103Y2);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    final int i24 = 1;
                    objM87133R4 = new Function1() { // from class: xq2.k0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    return AbstractC38576l0.m123671C(strM92103Y2, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC38576l0.m123673E(strM92103Y2, (InterfaceC18044z) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3471e2, false, (Function1) objM87133R4);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R5;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z14 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C38557d1(function4, 2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R6, 28), c28655q, 0);
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 2);
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
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C38448b(12);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170908a);
            strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170909b);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3406c3 = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "YearInReviewCard Back Press"));
            if (0.3f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e3 = modifierM3406c3.mo3471e(new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true));
            zM87153g = c28655q.m87153g(strM92103Y);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                final int i110 = 0;
                objM87133R = new Function1() { // from class: xq2.k0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i110) {
                            case 0:
                                return AbstractC38576l0.m123671C(strM92103Y, (InterfaceC18044z) obj);
                            default:
                                return AbstractC38576l0.m123673E(strM92103Y, (InterfaceC18044z) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i111 = 0;
                objM87133R = new Function1() { // from class: xq2.k0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i111) {
                            case 0:
                                return AbstractC38576l0.m123671C(strM92103Y, (InterfaceC18044z) obj);
                            default:
                                return AbstractC38576l0.m123673E(strM92103Y, (InterfaceC18044z) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierMo3471e3, false, (Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R2;
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new C38557d1(function4, 3);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C38557d1(function4, 3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c3, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R3, 28), c28655q, 0);
            Modifier modifierM3406c4 = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "YearInReviewCard Forward Press"));
            if (0.7f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e4 = modifierM3406c4.mo3471e(new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
            zM87153g2 = c28655q.m87153g(strM92103Y2);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g2) {
                final int i25 = 1;
                objM87133R4 = new Function1() { // from class: xq2.k0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i25) {
                            case 0:
                                return AbstractC38576l0.m123671C(strM92103Y2, (InterfaceC18044z) obj);
                            default:
                                return AbstractC38576l0.m123673E(strM92103Y2, (InterfaceC18044z) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            } else {
                final int i26 = 1;
                objM87133R4 = new Function1() { // from class: xq2.k0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i26) {
                            case 0:
                                return AbstractC38576l0.m123671C(strM92103Y2, (InterfaceC18044z) obj);
                            default:
                                return AbstractC38576l0.m123673E(strM92103Y2, (InterfaceC18044z) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierMo3471e4, false, (Function1) objM87133R4);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R5;
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z14) {
                objM87133R6 = new C38557d1(function4, 2);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C38557d1(function4, 2);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c4, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R6, 28), c28655q, 0);
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m123670B(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m123671C(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m123672D(Function1 function1) {
        function1.invoke(AbstractC31752t0.a.f131481a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m123673E(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m123674F(Function1 function1) {
        function1.invoke(AbstractC31752t0.b.f131482a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m123675G(Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m123669A(modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m123690o(C38578m0 c38578m0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(730490500);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c38578m0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            float f13 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM123707b = c38578m0.getHeader();
            if (textResourceM123707b == null) {
                c28655q.m87150e0(722066846);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(722066847);
                String strM21274h = AbstractC8693b.m21274h(textResourceM123707b, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            TextResource textResourceM123711f = c38578m0.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM123711f, c28655q, i16);
            C38072d c38072d2 = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8419Q = c38072d2.m121952e(c28655q, i17).getT4();
            long jM125430y = c38072d2.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q2, 0, i18, 196602);
            c28655q = c28655q2;
            if (AbstractC8693b.m21270d(c38578m0.getSubtitle())) {
                c28655q.m87150e0(722532126);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c38578m0.getSubtitle(), c28655q, i16), null, c38072d2.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(722724760);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            m123692q(c38578m0.getImage(), c38578m0.getScoreGaugeDialItem(), c28655q, AbstractC22403o.f87638a | (C32212i.f133384m << 3));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38549b(c38578m0, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m123691p(C38578m0 c38578m0, int i13, Composer composer, int i14) {
        m123690o(c38578m0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m123692q(AbstractC22403o abstractC22403o, C32212i c32212i, Composer composer, int i13) {
        int i14;
        C32212i c32212i2;
        AbstractC22403o abstractC22403o2;
        boolean z4;
        C2314t c2314t;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-555226329);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c32212i) : c28655q.m87157i(c32212i) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (abstractC22403o == null) {
                c28655q.m87150e0(-828390837);
                c28655q.m87173q(false);
                i15 = 4;
                z4 = false;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(-828390836);
                z4 = false;
                c2314t = c2314t2;
                i15 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3419p(20 * 4, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(false);
            }
            if (c32212i == null) {
                c28655q.m87150e0(-828129972);
                c28655q.m87173q(z4);
                c32212i2 = c32212i;
                abstractC22403o2 = abstractC22403o;
            } else {
                c28655q.m87150e0(-828129971);
                Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 20) * i15, c2314t);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C38448b(10);
                    c28655q.m87172p0(objM87133R);
                }
                c32212i2 = c32212i;
                abstractC22403o2 = abstractC22403o;
                AbstractC32215l.m100230j(modifierM3419p, c32212i2, (Function1) objM87133R, c28655q, (C32212i.f133384m << 3) | 390, 0);
                c28655q.m87173q(z4);
            }
        } else {
            c32212i2 = c32212i;
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38572j0(abstractC22403o2, c32212i2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m123693r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m123694s(AbstractC22403o abstractC22403o, C32212i c32212i, int i13, Composer composer, int i14) {
        m123692q(abstractC22403o, c32212i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m123695t(List<? extends InterfaceC25312u> list, C25307p c25307p, Composer composer, int i13) {
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1568580388);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c25307p) : c28655q.m87157i(c25307p) ? 32 : 16;
        }
        int i15 = i14;
        int i16 = 1;
        boolean z13 = false;
        if (!c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87138X();
        } else if (list.isEmpty()) {
            c28655q.m87150e0(334803230);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(334297744);
            for (InterfaceC25312u interfaceC25312u : list) {
                if (interfaceC25312u instanceof C21395c) {
                    c28655q.m87150e0(698275279);
                    AbstractC2756k.m7799p(AbstractC1099a.m3384f(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, i16 * 8, 0.0f, 11), z13, 1.3333334f), (C21395c) interfaceC25312u, null, null, false, null, null, c28655q, 6, 124);
                    c28655q.m87173q(z13);
                    z4 = z13;
                } else {
                    c28655q.m87150e0(698513793);
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C38448b(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    z4 = z13;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307p, null, (Function1) objM87133R, c28655q, (C25307p.f99300b << 3) | 3072 | (i15 & 112), 4);
                    c28655q.m87173q(z4);
                }
                z13 = z4;
                i16 = i16;
            }
            c28655q.m87173q(z13);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38572j0(list, c25307p, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m123696u(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m123697v(List list, C25307p c25307p, int i13, Composer composer, int i14) {
        m123695t(list, c25307p, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[PHI: r0 r6
      0x00a2: PHI (r0v6 m91.p) = (r0v2 m91.p), (r0v0 m91.p) binds: [B:61:0x00b1, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r6v10 androidx.compose.ui.Modifier) = (r6v5 androidx.compose.ui.Modifier), (r6v3 androidx.compose.ui.Modifier) binds: [B:61:0x00b1, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:79:0x022b  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static final void m123698w(Modifier modifier, C38578m0 viewState, C25307p c25307p, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C25307p c25307p2;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        Object objM87133R;
        C25307p c25307p3;
        Modifier modifier4;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        C25307p c25307pM120293b = c25307p;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1008154403);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i17 = 128;
            } else {
                if ((i13 & 512) == 0 ? c28655q.m87153g(c25307pM120293b) : c28655q.m87157i(c25307pM120293b)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
            }
            i15 |= i17;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c25307pM120293b = AbstractC37514c.m120293b();
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C38448b(9);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function5 = (Function1) objM87133R;
                        c25307p3 = c25307pM120293b;
                        modifier4 = modifier2;
                        function4 = function5;
                    }
                    c28655q.m87175r();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), 2 * 8, 0.0f, 2);
                    C17909s c17909s = AbstractC17911t.f69612b;
                    float f13 = 3 * 4;
                    c28655q = c28655q;
                    AbstractC31926e.m99375j(AbstractC1092a.m3357b(modifierM3396r, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4286292411L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4281878869L)))), (((long) Float.floatToRawIntBits(88.25f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(264.75f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), 8), AbstractC33253j.m105489e(f13), 0.0f, 4), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC33253j.m105489e(f13), new C13825t(1, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4281878869L))), new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4286292411L)))), 0.0f, 0.0f, 14)), null, 0.0f, AbstractC37817c.m121344e(-1194047047, c28655q, new C36100c(function4, (Object) viewState, (Object) c25307p3, 8)), c28655q, 12607488, 98);
                    c28655q.m87173q(true);
                    function3 = function4;
                    c25307p2 = c25307p3;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                }
                c25307p3 = c25307pM120293b;
                modifier4 = modifier2;
                function4 = function2;
                c28655q.m87175r();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), 2 * 8, 0.0f, 2);
                C17909s c17909s2 = AbstractC17911t.f69612b;
                float f14 = 3 * 4;
                c28655q = c28655q;
                AbstractC31926e.m99375j(AbstractC1092a.m3357b(modifierM3396r2, C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4286292411L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4281878869L)))), (((long) Float.floatToRawIntBits(88.25f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(264.75f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), 8), AbstractC33253j.m105489e(f14), 0.0f, 4), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC33253j.m105489e(f14), new C13825t(1, C17909s.m51493k(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4281878869L))), new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4286292411L)))), 0.0f, 0.0f, 14)), null, 0.0f, AbstractC37817c.m121344e(-1194047047, c28655q, new C36100c(function4, (Object) viewState, (Object) c25307p3, 8)), c28655q, 12607488, 98);
                c28655q.m87173q(true);
                function3 = function4;
                c25307p2 = c25307p3;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                c25307p2 = c25307pM120293b;
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) c25307p2, (Object) function3, i13, i14, 9);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    c25307pM120293b = AbstractC37514c.m120293b();
                }
                if (i19 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C38448b(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function6 = (Function1) objM87133R;
                    c25307p3 = c25307pM120293b;
                    modifier4 = modifier2;
                    function4 = function6;
                } else {
                    c25307p3 = c25307pM120293b;
                    modifier4 = modifier2;
                    function4 = function2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    c25307pM120293b = AbstractC37514c.m120293b();
                }
                if (i19 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C38448b(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function7 = (Function1) objM87133R;
                    c25307p3 = c25307pM120293b;
                    modifier4 = modifier2;
                    function4 = function7;
                } else {
                    c25307p3 = c25307pM120293b;
                    modifier4 = modifier2;
                    function4 = function2;
                }
            }
            c28655q.m87175r();
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), 2 * 8, 0.0f, 2);
            C17909s c17909s3 = AbstractC17911t.f69612b;
            float f15 = 3 * 4;
            c28655q = c28655q;
            AbstractC31926e.m99375j(AbstractC1092a.m3357b(modifierM3396r3, C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4286292411L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4281878869L)))), (((long) Float.floatToRawIntBits(88.25f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(264.75f)) << 32) | (((long) Float.floatToRawIntBits(58.0f)) & 4294967295L), 8), AbstractC33253j.m105489e(f15), 0.0f, 4), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC33253j.m105489e(f15), new C13825t(1, C17909s.m51493k(c17909s3, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4281878869L))), new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4286292411L)))), 0.0f, 0.0f, 14)), null, 0.0f, AbstractC37817c.m121344e(-1194047047, c28655q, new C36100c(function4, (Object) viewState, (Object) c25307p3, 8)), c28655q, 12607488, 98);
            c28655q.m87173q(true);
            function3 = function4;
            c25307p2 = c25307p3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            c25307p2 = c25307pM120293b;
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) c25307p2, (Object) function3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m123699x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m123700y(InterfaceC23001u interfaceC23001u, Function1 function1, C38578m0 c38578m0, C25307p c25307p, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            float f14 = 1 * f13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
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
            m123690o(c38578m0, c28655q, 0);
            if (c38578m0.m123706a().isEmpty()) {
                c28655q.m87150e0(-1863174925);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, -1863419980, c2314t, f14, c28655q);
                m123695t(c38578m0.m123706a(), c25307p, c28655q, C25307p.f99300b << 3);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            m123669A(interfaceC23001u.mo3401b(c2314t), function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m123701z(Modifier modifier, C38578m0 c38578m0, C25307p c25307p, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m123698w(modifier, c38578m0, c25307p, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
