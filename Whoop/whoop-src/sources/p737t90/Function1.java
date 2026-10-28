package p737t90;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2276c;
import bc3.InterfaceC2994c0;
import c03.C3815c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import j80.InterfaceC21414b;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import m80.AbstractC25225g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qc1.C30217a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x60.AbstractC38021a;

/* JADX INFO: renamed from: t90.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\n\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkotlin/Function1;", "Ll80/o;", "Ll83/a0;", "onNavigationEvent", "Lc03/c;", "whoopStatusViewState", "Lh80/b;", "onAnalyticsEvent", "Lj80/b;", "onViewEvent", "g", "(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: t90.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.start.StartScreenKt$StartScreen$3$1", m100430f = "StartScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140477w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f140478x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p715kotlin.jvm.functions.Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140478x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f140478x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f140477w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f140478x.invoke(new InterfaceC17002b.j("start_screen", null, null, null, 14, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0282  */
    /* JADX WARN: Code duplicated, block: B:106:0x0286  */
    /* JADX WARN: Code duplicated, block: B:107:0x0288  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:113:0x0295  */
    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x02af  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x0305  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x021c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0220  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x023b  */
    /* JADX INFO: renamed from: g */
    public static final void m106314g(p715kotlin.jvm.functions.Function1 onNavigationEvent, C3815c whoopStatusViewState, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        p715kotlin.jvm.functions.Function1 function3;
        int i16;
        p715kotlin.jvm.functions.Function1 function4;
        int i17;
        boolean z4;
        p715kotlin.jvm.functions.Function1 function5;
        p715kotlin.jvm.functions.Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        p715kotlin.jvm.functions.Function1 function7;
        int i18;
        boolean z13;
        Object objM87133R;
        p715kotlin.jvm.functions.Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        p715kotlin.jvm.functions.Function1 function9;
        int iHashCode2;
        C0209i c0209i2;
        int iHashCode3;
        int i24;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        C28676v0 c28676v1;
        final p715kotlin.jvm.functions.Function1 function10;
        final p715kotlin.jvm.functions.Function1 function11;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(whoopStatusViewState, "whoopStatusViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-860988410);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(onNavigationEvent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(whoopStatusViewState) : c28655q.m87157i(whoopStatusViewState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C30217a(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function3 = (p715kotlin.jvm.functions.Function1) objM87133R6;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30217a(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (p715kotlin.jvm.functions.Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new a(function3, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    function8 = function3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i19 = i15;
                    } else {
                        i19 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                        function9 = function7;
                        AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                        float f13 = 8;
                        float f14 = ((float) 2.5d) * f13;
                        float f15 = 4;
                        AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t, f14, f15 * f13, f14, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C2307m c2307m = C2299e.f9105H;
                        C1100b c1100b = C1100b.f4583a;
                        Modifier modifierMo3400a = c1100b.mo3400a(modifierM3409f, c2307m);
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C2305k c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f14, 0.0f, 2);
                        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                        c28655q = c28655q;
                        AbstractC29125c.m88522c(abstractC26165aM88500I, null, modifierM3396r, null, null, 0.0f, null, c28655q, 48, 120);
                        AbstractC11266d.m30469w(15, f15, c2314t, c28655q);
                        i24 = i19 & 7168;
                        if (i24 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i18 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            c28676v1 = c28676v0;
                        } else {
                            c28676v1 = c28676v0;
                            if (objM87133R2 == c28676v1) {
                                function10 = function8;
                                function11 = function9;
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i18 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z19 || objM87133R3 == c28676v1) {
                                final int i26 = 1;
                                objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return Function1.m106317j(function11, function10);
                                            default:
                                                return Function1.m106318k(function11, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function0.m106305c(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t), C2299e.f9106I);
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v1) {
                                objM87133R4 = new C30217a(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC21478l0.m60421a(modifierMo3400a2, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                            c28655q.m87173q(true);
                            function5 = function10;
                            function6 = function11;
                        }
                        final int i27 = 0;
                        function10 = function8;
                        function11 = function9;
                        objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            final int i28 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i29 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m106305c(interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t), C2299e.f9106I);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v1) {
                            objM87133R4 = new C30217a(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC21478l0.m60421a(modifierMo3400a3, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                        c28655q.m87173q(true);
                        function5 = function10;
                        function6 = function11;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                    function9 = function7;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    float f16 = 8;
                    float f17 = ((float) 2.5d) * f16;
                    float f18 = 4;
                    AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t, f17, f18 * f16, f17, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C2307m c2307m2 = C2299e.f9105H;
                    C1100b c1100b2 = C1100b.f4583a;
                    Modifier modifierMo3400a4 = c1100b2.mo3400a(modifierM3409f2, c2307m2);
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9110M;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3400a4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f17, 0.0f, 2);
                    AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                    c28655q = c28655q;
                    AbstractC29125c.m88522c(abstractC26165aM88500I2, null, modifierM3396r2, null, null, 0.0f, null, c28655q, 48, 120);
                    AbstractC11266d.m30469w(15, f18, c2314t, c28655q);
                    i24 = i19 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function8;
                            function11 = function9;
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            final int i210 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i211 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m106305c(interfaceC4339a3, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        Modifier modifierMo3400a5 = c1100b2.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t), C2299e.f9106I);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v1) {
                            objM87133R4 = new C30217a(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC21478l0.m60421a(modifierMo3400a5, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                        c28655q.m87173q(true);
                        function5 = function10;
                        function6 = function11;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    final int i212 = 0;
                    function10 = function8;
                    function11 = function9;
                    objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i213 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i214 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a4, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a6 = c1100b2.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a6, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2276c(onNavigationEvent, whoopStatusViewState, function5, function6, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C30217a(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (p715kotlin.jvm.functions.Function1) objM87133R6;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30217a(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (p715kotlin.jvm.functions.Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new a(function3, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(function3, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function8 = function3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d2);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i19 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                    function9 = function7;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    float f19 = 8;
                    float f110 = ((float) 2.5d) * f19;
                    float f111 = 4;
                    AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t2, f110, f111 * f19, f110, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C2307m c2307m3 = C2299e.f9105H;
                    C1100b c1100b3 = C1100b.f4583a;
                    Modifier modifierMo3400a7 = c1100b3.mo3400a(modifierM3409f3, c2307m3);
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C2305k c2305k3 = C2299e.f9110M;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3400a7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N7);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N8);
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f110, 0.0f, 2);
                    AbstractC26165a abstractC26165aM88500I3 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                    c28655q = c28655q;
                    AbstractC29125c.m88522c(abstractC26165aM88500I3, null, modifierM3396r3, null, null, 0.0f, null, c28655q, 48, 120);
                    AbstractC11266d.m30469w(15, f111, c2314t2, c28655q);
                    i24 = i19 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function8;
                            function11 = function9;
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            final int i215 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i215) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i216 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m106305c(interfaceC4339a5, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        Modifier modifierMo3400a8 = c1100b3.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t2), C2299e.f9106I);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v1) {
                            objM87133R4 = new C30217a(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC21478l0.m60421a(modifierMo3400a8, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                        c28655q.m87173q(true);
                        function5 = function10;
                        function6 = function11;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    final int i217 = 0;
                    function10 = function8;
                    function11 = function9;
                    objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i217) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i218 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i218) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i219 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i219) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a6, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a9 = c1100b3.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t2), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a9, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    i19 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                function9 = function7;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                float f112 = 8;
                float f113 = ((float) 2.5d) * f112;
                float f114 = 4;
                AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t2, f113, f114 * f112, f113, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C2307m c2307m4 = C2299e.f9105H;
                C1100b c1100b4 = C1100b.f4583a;
                Modifier modifierMo3400a10 = c1100b4.mo3400a(modifierM3409f4, c2307m4);
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3400a10);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N10);
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f113, 0.0f, 2);
                AbstractC26165a abstractC26165aM88500I4 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                c28655q = c28655q;
                AbstractC29125c.m88522c(abstractC26165aM88500I4, null, modifierM3396r4, null, null, 0.0f, null, c28655q, 48, 120);
                AbstractC11266d.m30469w(15, f114, c2314t2, c28655q);
                i24 = i19 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function8;
                        function11 = function9;
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i2110 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2110) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i2111 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a7, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a11 = c1100b4.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t2), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a11, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    c28676v1 = c28676v0;
                }
                final int i2112 = 0;
                function10 = function8;
                function11 = function9;
                objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2112) {
                            case 0:
                                return Function1.m106317j(function11, function10);
                            default:
                                return Function1.m106318k(function11, function10);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                if (i24 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    final int i2113 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2113) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i2114 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2114) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m106305c(interfaceC4339a8, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierMo3400a12 = c1100b4.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t2), C2299e.f9106I);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C30217a(21);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC21478l0.m60421a(modifierMo3400a12, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                c28655q.m87173q(true);
                function5 = function10;
                function6 = function11;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(onNavigationEvent, whoopStatusViewState, function5, function6, i13, i14);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C30217a(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (p715kotlin.jvm.functions.Function1) objM87133R6;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30217a(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (p715kotlin.jvm.functions.Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new a(function3, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(function3, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function8 = function3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d3);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i19 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                    function9 = function7;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t3), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    float f115 = 8;
                    float f116 = ((float) 2.5d) * f115;
                    float f117 = 4;
                    AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t3, f116, f117 * f115, f116, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C2307m c2307m5 = C2299e.f9105H;
                    C1100b c1100b5 = C1100b.f4583a;
                    Modifier modifierMo3400a13 = c1100b5.mo3400a(modifierM3409f5, c2307m5);
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C2305k c2305k5 = C2299e.f9110M;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierMo3400a13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N13);
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f116, 0.0f, 2);
                    AbstractC26165a abstractC26165aM88500I5 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                    c28655q = c28655q;
                    AbstractC29125c.m88522c(abstractC26165aM88500I5, null, modifierM3396r5, null, null, 0.0f, null, c28655q, 48, 120);
                    AbstractC11266d.m30469w(15, f117, c2314t3, c28655q);
                    i24 = i19 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function8;
                            function11 = function9;
                        }
                        InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            final int i2115 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2115) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i2116 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2116) {
                                        case 0:
                                            return Function1.m106317j(function11, function10);
                                        default:
                                            return Function1.m106318k(function11, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m106305c(interfaceC4339a9, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        Modifier modifierMo3400a14 = c1100b5.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t3), C2299e.f9106I);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v1) {
                            objM87133R4 = new C30217a(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC21478l0.m60421a(modifierMo3400a14, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                        c28655q.m87173q(true);
                        function5 = function10;
                        function6 = function11;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    final int i2117 = 0;
                    function10 = function8;
                    function11 = function9;
                    objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2117) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i2118 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2118) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i2119 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2119) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a10, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a15 = c1100b5.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t3), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a15, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    i19 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N11);
                function9 = function7;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t3), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                float f118 = 8;
                float f119 = ((float) 2.5d) * f118;
                float f1110 = 4;
                AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t3, f119, f1110 * f118, f119, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C2307m c2307m6 = C2299e.f9105H;
                C1100b c1100b6 = C1100b.f4583a;
                Modifier modifierMo3400a16 = c1100b6.mo3400a(modifierM3409f6, c2307m6);
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C2305k c2305k6 = C2299e.f9110M;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierMo3400a16);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N14);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N15);
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f119, 0.0f, 2);
                AbstractC26165a abstractC26165aM88500I6 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                c28655q = c28655q;
                AbstractC29125c.m88522c(abstractC26165aM88500I6, null, modifierM3396r6, null, null, 0.0f, null, c28655q, 48, 120);
                AbstractC11266d.m30469w(15, f1110, c2314t3, c28655q);
                i24 = i19 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function8;
                        function11 = function9;
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i21110 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21110) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i21111 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a11, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a17 = c1100b6.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t3), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a17, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    c28676v1 = c28676v0;
                }
                final int i21112 = 0;
                function10 = function8;
                function11 = function9;
                objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21112) {
                            case 0:
                                return Function1.m106317j(function11, function10);
                            default:
                                return Function1.m106318k(function11, function10);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R2;
                if (i24 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    final int i21113 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21113) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i21114 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21114) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m106305c(interfaceC4339a12, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierMo3400a18 = c1100b6.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t3), C2299e.f9106I);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C30217a(21);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC21478l0.m60421a(modifierMo3400a18, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                c28655q.m87173q(true);
                function5 = function10;
                function6 = function11;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(onNavigationEvent, whoopStatusViewState, function5, function6, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C30217a(19);
                    c28655q.m87172p0(objM87133R6);
                }
                function3 = (p715kotlin.jvm.functions.Function1) objM87133R6;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30217a(20);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (p715kotlin.jvm.functions.Function1) objM87133R5;
            } else {
                function7 = function4;
            }
            i18 = i15 & 896;
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new a(function3, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(function3, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            function8 = function3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i15 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC39127r0M66763d4);
            C0209i c0209i16 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i19 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
                function9 = function7;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t4), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                float f1111 = 8;
                float f1112 = ((float) 2.5d) * f1111;
                float f1113 = 4;
                AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t4, f1112, f1113 * f1111, f1112, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C2307m c2307m7 = C2299e.f9105H;
                C1100b c1100b7 = C1100b.f4583a;
                Modifier modifierMo3400a19 = c1100b7.mo3400a(modifierM3409f7, c2307m7);
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C2305k c2305k7 = C2299e.f9110M;
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierMo3400a19);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N17);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N18);
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f1112, 0.0f, 2);
                AbstractC26165a abstractC26165aM88500I7 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
                c28655q = c28655q;
                AbstractC29125c.m88522c(abstractC26165aM88500I7, null, modifierM3396r7, null, null, 0.0f, null, c28655q, 48, 120);
                AbstractC11266d.m30469w(15, f1113, c2314t4, c28655q);
                i24 = i19 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function8;
                        function11 = function9;
                    }
                    InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        final int i21115 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21115) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i21116 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21116) {
                                    case 0:
                                        return Function1.m106317j(function11, function10);
                                    default:
                                        return Function1.m106318k(function11, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m106305c(interfaceC4339a13, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a110 = c1100b7.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t4), C2299e.f9106I);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C30217a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC21478l0.m60421a(modifierMo3400a110, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                    c28655q.m87173q(true);
                    function5 = function10;
                    function6 = function11;
                } else {
                    c28676v1 = c28676v0;
                }
                final int i21117 = 0;
                function10 = function8;
                function11 = function9;
                objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21117) {
                            case 0:
                                return Function1.m106317j(function11, function10);
                            default:
                                return Function1.m106318k(function11, function10);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R2;
                if (i24 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    final int i21118 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21118) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i21119 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21119) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m106305c(interfaceC4339a14, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierMo3400a111 = c1100b7.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t4), C2299e.f9106I);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C30217a(21);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC21478l0.m60421a(modifierMo3400a111, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                c28655q.m87173q(true);
                function5 = function10;
                function6 = function11;
            } else {
                i19 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i18 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N16);
            function9 = function7;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC38021a.f162858d, c28655q, 0), null, AbstractC34132o.m107879c(0.8f, c2314t4), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            float f1114 = 8;
            float f1115 = ((float) 2.5d) * f1114;
            float f1116 = 4;
            AbstractC25225g.m73941d(AbstractC1099a.m3398t(c2314t4, f1115, f1116 * f1114, f1115, 0.0f, 8), whoopStatusViewState, onNavigationEvent, c28655q, (C3815c.f15649d << 3) | (i19 & 112) | ((i19 << 6) & 896), 0);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C2307m c2307m8 = C2299e.f9105H;
            C1100b c1100b8 = C1100b.f4583a;
            Modifier modifierMo3400a112 = c1100b8.mo3400a(modifierM3409f8, c2307m8);
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C2305k c2305k8 = C2299e.f9110M;
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierMo3400a112);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N19);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, c2314t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N110);
            Modifier modifierM3396r8 = AbstractC1099a.m3396r(new HorizontalAlignElement(C2299e.f9111N), f1115, 0.0f, 2);
            AbstractC26165a abstractC26165aM88500I8 = AbstractC29125c.m88500I(AbstractC38021a.f162859e, c28655q, 0);
            c28655q = c28655q;
            AbstractC29125c.m88522c(abstractC26165aM88500I8, null, modifierM3396r8, null, null, 0.0f, null, c28655q, 48, 120);
            AbstractC11266d.m30469w(15, f1116, c2314t4, c28655q);
            i24 = i19 & 7168;
            if (i24 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i18 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    function10 = function8;
                    function11 = function9;
                }
                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R2;
                if (i24 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    final int i211110 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211110) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i211111 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211111) {
                                case 0:
                                    return Function1.m106317j(function11, function10);
                                default:
                                    return Function1.m106318k(function11, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m106305c(interfaceC4339a15, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierMo3400a113 = c1100b8.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t4), C2299e.f9106I);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C30217a(21);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC21478l0.m60421a(modifierMo3400a113, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
                c28655q.m87173q(true);
                function5 = function10;
                function6 = function11;
            } else {
                c28676v1 = c28676v0;
            }
            final int i211112 = 0;
            function10 = function8;
            function11 = function9;
            objM87133R2 = new InterfaceC4339a() { // from class: t90.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i211112) {
                        case 0:
                            return Function1.m106317j(function11, function10);
                        default:
                            return Function1.m106318k(function11, function10);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
            InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R2;
            if (i24 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i18 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objM87133R3 = c28655q.m87133R();
            if (z19) {
                final int i211113 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i211113) {
                            case 0:
                                return Function1.m106317j(function11, function10);
                            default:
                                return Function1.m106318k(function11, function10);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i211114 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: t90.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i211114) {
                            case 0:
                                return Function1.m106317j(function11, function10);
                            default:
                                return Function1.m106318k(function11, function10);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function0.m106305c(interfaceC4339a16, (InterfaceC4339a) objM87133R3, c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierMo3400a114 = c1100b8.mo3400a(AbstractC1102d.m3407d(1.0f, c2314t4), C2299e.f9106I);
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = new C30217a(21);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC21478l0.m60421a(modifierMo3400a114, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 48);
            c28655q.m87173q(true);
            function5 = function10;
            function6 = function11;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(onNavigationEvent, whoopStatusViewState, function5, function6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m106315h(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m106316i(InterfaceC21414b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m106317j(p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2) {
        function1.invoke(InterfaceC21413a.i0.f82114a);
        function2.invoke(new InterfaceC17002b.i("start_screen", null, null, "i_have_a_whoop_device", null, null, 54, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m106318k(p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2) {
        function1.invoke(InterfaceC21413a.j0.f82116a);
        function2.invoke(new InterfaceC17002b.i("start_screen", null, null, "i_do_not_have_a_whoop_device", null, null, 54, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m106319l(InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(2147521511L)), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(2154216703L))));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        InterfaceC22131e.m63385u(Canvas, C17909s.m51489g(c17909s, listM118959K, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 0.6f * Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)), 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m106320m(p715kotlin.jvm.functions.Function1 function1, C3815c c3815c, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, int i13, int i14, Composer composer, int i15) {
        m106314g(function1, c3815c, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
