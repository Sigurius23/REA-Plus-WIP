package z22;

import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g32.C15307g;
import g32.C15312l;
import gb1.AbstractC15674c;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf0.C34905f;
import vv2.C36538d;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x22.C37864c;
import x22.InterfaceC37862a;
import x30.C37900j1;
import x81.C38072d;
import yk2.C39609i;
import yz1.C39913g;

/* JADX INFO: renamed from: z22.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lx22/c$d;", "viewState", "Lkotlin/Function1;", "Lx22/a;", "Ll83/a0;", "onEvent", "k", "(Lx22/c$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "s", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40029h {

    /* JADX INFO: renamed from: z22.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementScreenContentKt$PaymentMethodManagementScreenContent$2$1", m100430f = "PaymentMethodManagementScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172717w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f172718x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37864c.d f172719y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C37864c.d dVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172718x = function1;
            this.f172719y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f172718x, this.f172719y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f172717w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f172718x.invoke(new InterfaceC37862a.p(this.f172719y.m121443a()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0200  */
    /* JADX WARN: Code duplicated, block: B:84:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x023a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m128334k(C37864c.d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        int i16;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        TextResource textResourceM121446d;
        boolean z15;
        Object objM87133R3;
        Function1 function4;
        boolean z16;
        boolean z17;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1726562610);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39913g(6);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                } else {
                    function3 = function2;
                }
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(function3, viewState, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C39609i(function3, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
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
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                if (viewState.getDisplayRefreshingAnimation()) {
                    textResourceM121446d = AbstractC8693b.m21278l("");
                } else {
                    textResourceM121446d = viewState.getToolbarTitle();
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM121446d, null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, c2314t);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C39609i(function3, 10);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = function3;
                AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C40023b.f172704a.m128294c(), c28655q, 224640, 2);
                c28655q.m87173q(true);
                float f14 = 2 * f13;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null), f14, 0.0f, 2);
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f14, 1);
                C2305k c2305k = C2299e.f9111N;
                boolean zM87157i2 = c28655q.m87157i(viewState);
                if (i16 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i2 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C37900j1(18, viewState, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22674j.m65717c(modifierM3396r, null, c22976l1M3379a, null, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function2 = function4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(viewState, i13, function2, i14, 22);
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
            if (i17 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39913g(6);
                    c28655q.m87172p0(objM87133R5);
                }
                function3 = (Function1) objM87133R5;
            } else {
                function3 = function2;
            }
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q.m87157i(viewState);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new a(function3, viewState, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(function3, viewState, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C39609i(function3, 9);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39609i(function3, 9);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (viewState.getDisplayRefreshingAnimation()) {
                textResourceM121446d = AbstractC8693b.m21278l("");
            } else {
                textResourceM121446d = viewState.getToolbarTitle();
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM121446d, null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f15 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(1 * f15, c2314t2);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                objM87133R3 = new C39609i(function3, 10);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C39609i(function3, 10);
                c28655q.m87172p0(objM87133R3);
            }
            function4 = function3;
            AbstractC6719b.m20143d(modifierM3394p2, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C40023b.f172704a.m128294c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            float f16 = 2 * f15;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC15674c.m44085i(c2314t2, 0.0f, null, 3, null), f16, 0.0f, 2);
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(0.0f, f16, 1);
            C2305k c2305k2 = C2299e.f9111N;
            boolean zM87157i3 = c28655q.m87157i(viewState);
            if (i16 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i3 | z16;
            objM87133R4 = c28655q.m87133R();
            if (z17) {
                objM87133R4 = new C37900j1(18, viewState, function4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C37900j1(18, viewState, function4);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22674j.m65717c(modifierM3396r2, null, c22976l1M3379a2, null, c2305k2, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
            c28655q = c28655q;
            c28655q.m87173q(true);
            function2 = function4;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, function2, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128335l(InterfaceC37862a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m128336m(Function1 function1) {
        function1.invoke(InterfaceC37862a.o.f162099a);
        function1.invoke(InterfaceC37862a.k.f162095a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128337n(Function1 function1) {
        function1.invoke(InterfaceC37862a.o.f162099a);
        function1.invoke(InterfaceC37862a.k.f162095a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m128338o(C37864c.d dVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = dVar.m121445c().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36538d(17, (C37864c.a) it.next(), function1), true, 956671374), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128339p(C37864c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(238190814);
            Iterator<T> it = aVar.m121427a().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2314t = C2314t.f9131w;
                if (!zHasNext) {
                    break;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C34905f(function1, interfaceC25312u, 6);
                    c28655q.m87172p0(objM87133R);
                }
                m128342s(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                float f13 = 4;
                AbstractC11266d.m30469w(f13, f13, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getSectionType().getSpacing(), c2314t));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m128340q(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC37862a.m(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m128341r(C37864c.d dVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128334k(dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m128342s(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-757932856);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39913g(7);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39913g(8);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m128343t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m128344u(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15312l.class), new C15307g());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m128345v(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128342s(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
