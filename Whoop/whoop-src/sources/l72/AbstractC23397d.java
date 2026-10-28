package l72;

import a72.AbstractC0524a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g72.C15552f;
import ih0.AbstractC18489d0;
import j72.AbstractC21403h;
import j72.C21397b;
import j72.C21400e;
import j72.EnumC21402g;
import java.util.Iterator;
import js2.C21930h;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kw1.C22852c;
import l01.C23045q;
import l60.C23374a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p163g1.C15127r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj72/b;", "state", "Lkotlin/Function1;", "La72/a;", "Ll83/a0;", "onAnalyticsEvent", "Lj72/h;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isChecked", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23397d {

    /* JADX INFO: renamed from: l72.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.view.SageInfoCheckboxScreenKt$SageInfoCheckboxScreen$3$1", m100430f = "SageInfoCheckboxScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f92722w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f92723x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21397b f92724y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C21397b c21397b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f92723x = function1;
            this.f92724y = c21397b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f92723x, this.f92724y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f92722w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f92723x.invoke(new AbstractC0524a.v(this.f92724y.getScreenId().name()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d2 A[LOOP:0: B:100:0x02cc->B:102:0x02d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:109:0x03da  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x0419  */
    /* JADX WARN: Code duplicated, block: B:115:0x041d  */
    /* JADX WARN: Code duplicated, block: B:118:0x042a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0438  */
    /* JADX WARN: Code duplicated, block: B:123:0x0481  */
    /* JADX WARN: Code duplicated, block: B:125:0x0485  */
    /* JADX WARN: Code duplicated, block: B:128:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x049c  */
    /* JADX WARN: Code duplicated, block: B:134:0x04de  */
    /* JADX WARN: Code duplicated, block: B:136:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:139:0x055f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x056f  */
    /* JADX WARN: Code duplicated, block: B:147:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:84:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce  */
    /* JADX INFO: renamed from: f */
    public static final void m67745f(Modifier modifier, C21397b state, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        boolean z4;
        C21397b c21397b;
        Modifier modifier3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function7;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i19;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        Function1 function8;
        C0209i c0209i;
        int i24;
        Function1 function9;
        int iHashCode2;
        int i25;
        C28655q c28655q;
        Iterator it;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode4;
        C38072d c38072d;
        int i26;
        C28655q c28655q2;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R3;
        Function1 function10;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z15;
        long jM73370c;
        boolean z16;
        boolean z17;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-2093241343);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(state) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q3.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q3.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C23374a(8);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C23374a(9);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsChecked()));
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i19 = i18 & 896;
                    if (i19 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q3.m87157i(state);
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(function7, state, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, state);
                    float f15 = 3;
                    f13 = 8;
                    float f16 = f15 * f13;
                    f14 = 2 * f13;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, modifier2), f16, f14);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    Modifier modifier4 = modifier2;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3395q);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    function8 = function7;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        i24 = i19;
                    } else {
                        i24 = i19;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                        function9 = function4;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM92116f0);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
                        float f17 = 4;
                        i25 = i24;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f17, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f16, c2314t));
                        String title = state.getTitle();
                        C38072d c38072d2 = C38072d.f163053a;
                        int i29 = C38072d.f163054b;
                        C2886a t14 = c38072d2.m121952e(c28655q3, i29).getT2();
                        long brandWhite = c38072d2.m121949b(c28655q3, i29).getBrandWhite();
                        int i34 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(title, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q3, 0, i34, 196602);
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                        AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d2.m121949b(c28655q3, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i29).getB1(), null, c28655q3, 0, i34, 196602);
                        c28655q = c28655q3;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                        c28655q.m87150e0(1893556523);
                        for (it = state.m60112f().iterator(); it.hasNext(); it = it) {
                            C21400e c21400e = (C21400e) it.next();
                            String title2 = c21400e.getTitle();
                            C38072d c38072d3 = C38072d.f163053a;
                            int i35 = C38072d.f163054b;
                            C2886a b6 = c38072d3.m121952e(c28655q, i35).getB1();
                            long brandWhite2 = c38072d3.m121949b(c28655q, i35).getBrandWhite();
                            int i36 = C2886a.f11498d << 18;
                            C28655q c28655q4 = c28655q;
                            AbstractC30795n.m94707h(title2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, i36, 196602);
                            AbstractC30795n.m94707h(c21400e.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q4, i35).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, i35).getB1(), null, c28655q4, 48, i36, 196600);
                            c28655q = c28655q4;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                        }
                        c28655q.m87173q(false);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
                        Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f17, c2314t), f15, f17);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM53364e);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                        boolean zM67748i = m67748i(interfaceC28601c1);
                        c38072d = C38072d.f163053a;
                        i26 = C38072d.f163054b;
                        c28655q2 = c28655q;
                        C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                        if (i25 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i2 = c28655q2.m87157i(state) | z14;
                        objM87133R3 = c28655q2.m87133R();
                        if (!zM87157i2 || objM87133R3 == c28676v0) {
                            function10 = function8;
                            interfaceC28601c2 = interfaceC28601c1;
                            objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            function10 = function8;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        Function1 function11 = function10;
                        interfaceC28601c3 = interfaceC28601c2;
                        AbstractC14959b1.m43082a(zM67748i, (Function1) objM87133R3, modifierM3407d, false, c15127r1M34081r, c28655q2, 384, 24);
                        c28655q2.m87173q(true);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                        String checkboxText = state.getCheckboxText();
                        C2886a b8 = c38072d.m121952e(c28655q2, i26).getB2();
                        if (m67748i(interfaceC28601c3)) {
                            jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                            z15 = false;
                        } else {
                            z15 = false;
                            jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                        }
                        c28655q2.m87173q(z15);
                        z16 = z15;
                        c21397b = state;
                        AbstractC30795n.m94707h(checkboxText, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                        boolean zM67748i2 = m67748i(interfaceC28601c3);
                        boolean zM87157i3 = c28655q2.m87157i(c21397b);
                        if ((i18 & 7168) == 2048) {
                            z16 = true;
                        }
                        z17 = zM87157i3 | z16;
                        objM87133R4 = c28655q2.m87133R();
                        if (!z17 || objM87133R4 == c28676v0) {
                            function6 = function9;
                            objM87133R4 = new C23045q(3, c21397b, function6);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            function6 = function9;
                        }
                        AbstractC27292z.m82343j(modifierM3398t2, zM67748i2, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        function5 = function11;
                        modifier3 = modifier4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N);
                    function9 = function4;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM92116f1);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m5);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N5);
                    float f18 = 4;
                    i25 = i24;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f18, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f16, c2314t));
                    String title3 = state.getTitle();
                    C38072d c38072d4 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    C2886a t15 = c38072d4.m121952e(c28655q3, i210).getT2();
                    long brandWhite3 = c38072d4.m121949b(c28655q3, i210).getBrandWhite();
                    int i37 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(title3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q3, 0, i37, 196602);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                    AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d4.m121949b(c28655q3, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q3, i210).getB1(), null, c28655q3, 0, i37, 196602);
                    c28655q = c28655q3;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                    c28655q.m87150e0(1893556523);
                    while (it.hasNext()) {
                        C21400e c21400e2 = (C21400e) it.next();
                        String title4 = c21400e2.getTitle();
                        C38072d c38072d5 = C38072d.f163053a;
                        int i38 = C38072d.f163054b;
                        C2886a b14 = c38072d5.m121952e(c28655q, i38).getB1();
                        long brandWhite4 = c38072d5.m121949b(c28655q, i38).getBrandWhite();
                        int i39 = C2886a.f11498d << 18;
                        C28655q c28655q5 = c28655q;
                        AbstractC30795n.m94707h(title4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q5, 0, i39, 196602);
                        AbstractC30795n.m94707h(c21400e2.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d5.m121949b(c28655q5, i38).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q5, i38).getB1(), null, c28655q5, 48, i39, 196600);
                        c28655q = c28655q5;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a2);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m6);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N6);
                    Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f18, c2314t), f15, f18);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM53364e2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                    boolean zM67748i3 = m67748i(interfaceC28601c1);
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r2 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i2 = c28655q2.m87157i(state) | z14;
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function12 = function10;
                    interfaceC28601c3 = interfaceC28601c2;
                    AbstractC14959b1.m43082a(zM67748i3, (Function1) objM87133R3, modifierM3407d2, false, c15127r1M34081r2, c28655q2, 384, 24);
                    c28655q2.m87173q(true);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                    String checkboxText2 = state.getCheckboxText();
                    C2886a b15 = c38072d.m121952e(c28655q2, i26).getB2();
                    if (m67748i(interfaceC28601c3)) {
                        jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                        z15 = false;
                    } else {
                        z15 = false;
                        jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                    }
                    c28655q2.m87173q(z15);
                    z16 = z15;
                    c21397b = state;
                    AbstractC30795n.m94707h(checkboxText2, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                    boolean zM67748i4 = m67748i(interfaceC28601c3);
                    boolean zM87157i4 = c28655q2.m87157i(c21397b);
                    if ((i18 & 7168) == 2048) {
                        z16 = true;
                    }
                    z17 = zM87157i4 | z16;
                    objM87133R4 = c28655q2.m87133R();
                    if (z17) {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM3398t4, zM67748i4, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function5 = function12;
                    modifier3 = modifier4;
                } else {
                    c21397b = state;
                    c28655q3.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) c21397b, (Object) function5, (Object) function6, i13, i14, 3);
                }
            }
            i15 |= 3072;
            function4 = function2;
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C23374a(8);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C23374a(9);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsChecked()));
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i19 = i18 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q3.m87157i(state);
                objM87133R2 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(function7, state, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function7, state, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, state);
                float f19 = 3;
                f13 = 8;
                float f110 = f19 * f13;
                f14 = 2 * f13;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, modifier2), f110, f14);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                Modifier modifier5 = modifier2;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3395q2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                function8 = function7;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a4);
                C0209i c0209i14 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    i24 = i19;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N8);
                    function9 = function4;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM92116f2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m9);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N9);
                    float f111 = 4;
                    i25 = i24;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f111, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f110, c2314t));
                    String title5 = state.getTitle();
                    C38072d c38072d6 = C38072d.f163053a;
                    int i211 = C38072d.f163054b;
                    C2886a t16 = c38072d6.m121952e(c28655q3, i211).getT2();
                    long brandWhite5 = c38072d6.m121949b(c28655q3, i211).getBrandWhite();
                    int i310 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(title5, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t16, null, c28655q3, 0, i310, 196602);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                    AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d6.m121949b(c28655q3, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q3, i211).getB1(), null, c28655q3, 0, i310, 196602);
                    c28655q = c28655q3;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t));
                    c28655q.m87150e0(1893556523);
                    while (it.hasNext()) {
                        C21400e c21400e3 = (C21400e) it.next();
                        String title6 = c21400e3.getTitle();
                        C38072d c38072d7 = C38072d.f163053a;
                        int i311 = C38072d.f163054b;
                        C2886a b16 = c38072d7.m121952e(c28655q, i311).getB1();
                        long brandWhite6 = c38072d7.m121949b(c28655q, i311).getBrandWhite();
                        int i312 = C2886a.f11498d << 18;
                        C28655q c28655q6 = c28655q;
                        AbstractC30795n.m94707h(title6, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b16, null, c28655q6, 0, i312, 196602);
                        AbstractC30795n.m94707h(c21400e3.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d7.m121949b(c28655q6, i311).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q6, i311).getB1(), null, c28655q6, 48, i312, 196600);
                        c28655q = c28655q6;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i16 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a3);
                    C0209i c0209i17 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m10);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N10);
                    Modifier modifierM53364e3 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f111, c2314t), f19, f111);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM53364e3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N11);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                    boolean zM67748i5 = m67748i(interfaceC28601c1);
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r3 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i2 = c28655q2.m87157i(state) | z14;
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function13 = function10;
                    interfaceC28601c3 = interfaceC28601c2;
                    AbstractC14959b1.m43082a(zM67748i5, (Function1) objM87133R3, modifierM3407d3, false, c15127r1M34081r3, c28655q2, 384, 24);
                    c28655q2.m87173q(true);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                    String checkboxText3 = state.getCheckboxText();
                    C2886a b17 = c38072d.m121952e(c28655q2, i26).getB2();
                    if (m67748i(interfaceC28601c3)) {
                        jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                        z15 = false;
                    } else {
                        z15 = false;
                        jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                    }
                    c28655q2.m87173q(z15);
                    z16 = z15;
                    c21397b = state;
                    AbstractC30795n.m94707h(checkboxText3, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b17, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                    boolean zM67748i6 = m67748i(interfaceC28601c3);
                    boolean zM87157i5 = c28655q2.m87157i(c21397b);
                    if ((i18 & 7168) == 2048) {
                        z16 = true;
                    }
                    z17 = zM87157i5 | z16;
                    objM87133R4 = c28655q2.m87133R();
                    if (z17) {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM3398t6, zM67748i6, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function5 = function13;
                    modifier3 = modifier5;
                } else {
                    i24 = i19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i19, modifierM118962N8);
                function9 = function4;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM92116f3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m12);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i19, modifierM118962N12);
                float f112 = 4;
                i25 = i24;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f112, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f110, c2314t));
                String title7 = state.getTitle();
                C38072d c38072d8 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                C2886a t17 = c38072d8.m121952e(c28655q3, i212).getT2();
                long brandWhite7 = c38072d8.m121949b(c28655q3, i212).getBrandWhite();
                int i313 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(title7, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t17, null, c28655q3, 0, i313, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d8.m121949b(c28655q3, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q3, i212).getB1(), null, c28655q3, 0, i313, 196602);
                c28655q = c28655q3;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t));
                c28655q.m87150e0(1893556523);
                while (it.hasNext()) {
                    C21400e c21400e4 = (C21400e) it.next();
                    String title8 = c21400e4.getTitle();
                    C38072d c38072d9 = C38072d.f163053a;
                    int i314 = C38072d.f163054b;
                    C2886a b18 = c38072d9.m121952e(c28655q, i314).getB1();
                    long brandWhite8 = c38072d9.m121949b(c28655q, i314).getBrandWhite();
                    int i315 = C2886a.f11498d << 18;
                    C28655q c28655q7 = c28655q;
                    AbstractC30795n.m94707h(title8, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b18, null, c28655q7, 0, i315, 196602);
                    AbstractC30795n.m94707h(c21400e4.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d9.m121949b(c28655q7, i314).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q7, i314).getB1(), null, c28655q7, 48, i315, 196600);
                    c28655q = c28655q7;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                }
                c28655q.m87173q(false);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a4);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                Modifier modifierM53364e4 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f112, c2314t), f19, f112);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM53364e4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                boolean zM67748i7 = m67748i(interfaceC28601c1);
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r4 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                if (i25 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i2 = c28655q2.m87157i(state) | z14;
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function14 = function10;
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC14959b1.m43082a(zM67748i7, (Function1) objM87133R3, modifierM3407d4, false, c15127r1M34081r4, c28655q2, 384, 24);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                String checkboxText4 = state.getCheckboxText();
                C2886a b19 = c38072d.m121952e(c28655q2, i26).getB2();
                if (m67748i(interfaceC28601c3)) {
                    jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                    z15 = false;
                } else {
                    z15 = false;
                    jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                }
                c28655q2.m87173q(z15);
                z16 = z15;
                c21397b = state;
                AbstractC30795n.m94707h(checkboxText4, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b19, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                boolean zM67748i8 = m67748i(interfaceC28601c3);
                boolean zM87157i6 = c28655q2.m87157i(c21397b);
                if ((i18 & 7168) == 2048) {
                    z16 = true;
                }
                z17 = zM87157i6 | z16;
                objM87133R4 = c28655q2.m87133R();
                if (z17) {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82343j(modifierM3398t8, zM67748i8, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function5 = function14;
                modifier3 = modifier5;
            } else {
                c21397b = state;
                c28655q3.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) c21397b, (Object) function5, (Object) function6, i13, i14, 3);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q3.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C23374a(8);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C23374a(9);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsChecked()));
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i19 = i18 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q3.m87157i(state);
                objM87133R2 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(function7, state, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function7, state, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, state);
                float f113 = 3;
                f13 = 8;
                float f114 = f113 * f13;
                f14 = 2 * f13;
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, modifier2), f114, f14);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                Modifier modifier6 = modifier2;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM3395q3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                function8 = function7;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i113 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i113, c23010xM66775a7);
                C0209i c0209i114 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i114, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    i24 = i19;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i115, modifierM118962N15);
                    function9 = function4;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, modifierM92116f4);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i113, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, c0209i114, interfaceC28653p1M87165m16);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i115, modifierM118962N16);
                    float f115 = 4;
                    i25 = i24;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f115, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f114, c2314t));
                    String title9 = state.getTitle();
                    C38072d c38072d10 = C38072d.f163053a;
                    int i213 = C38072d.f163054b;
                    C2886a t18 = c38072d10.m121952e(c28655q3, i213).getT2();
                    long brandWhite9 = c38072d10.m121949b(c28655q3, i213).getBrandWhite();
                    int i316 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(title9, null, brandWhite9, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t18, null, c28655q3, 0, i316, 196602);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                    AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d10.m121949b(c28655q3, i213).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q3, i213).getB1(), null, c28655q3, 0, i316, 196602);
                    c28655q = c28655q3;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114, c2314t));
                    c28655q.m87150e0(1893556523);
                    while (it.hasNext()) {
                        C21400e c21400e5 = (C21400e) it.next();
                        String title10 = c21400e5.getTitle();
                        C38072d c38072d11 = C38072d.f163053a;
                        int i317 = C38072d.f163054b;
                        C2886a b110 = c38072d11.m121952e(c28655q, i317).getB1();
                        long brandWhite10 = c38072d11.m121949b(c28655q, i317).getBrandWhite();
                        int i318 = C2886a.f11498d << 18;
                        C28655q c28655q8 = c28655q;
                        AbstractC30795n.m94707h(title10, null, brandWhite10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b110, null, c28655q8, 0, i318, 196602);
                        AbstractC30795n.m94707h(c21400e5.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d11.m121949b(c28655q8, i317).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q8, i317).getB1(), null, c28655q8, 48, i318, 196600);
                        c28655q = c28655q8;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i116, c22994r1M66759a5);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m17);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    C0209i c0209i118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N17);
                    Modifier modifierM53364e5 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f115, c2314t), f113, f115);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM53364e5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N18);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                    boolean zM67748i9 = m67748i(interfaceC28601c1);
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r5 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i2 = c28655q2.m87157i(state) | z14;
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function10 = function8;
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function15 = function10;
                    interfaceC28601c3 = interfaceC28601c2;
                    AbstractC14959b1.m43082a(zM67748i9, (Function1) objM87133R3, modifierM3407d5, false, c15127r1M34081r5, c28655q2, 384, 24);
                    c28655q2.m87173q(true);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                    String checkboxText5 = state.getCheckboxText();
                    C2886a b111 = c38072d.m121952e(c28655q2, i26).getB2();
                    if (m67748i(interfaceC28601c3)) {
                        jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                        z15 = false;
                    } else {
                        z15 = false;
                        jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                    }
                    c28655q2.m87173q(z15);
                    z16 = z15;
                    c21397b = state;
                    AbstractC30795n.m94707h(checkboxText5, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b111, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                    boolean zM67748i10 = m67748i(interfaceC28601c3);
                    boolean zM87157i7 = c28655q2.m87157i(c21397b);
                    if ((i18 & 7168) == 2048) {
                        z16 = true;
                    }
                    z17 = zM87157i7 | z16;
                    objM87133R4 = c28655q2.m87133R();
                    if (z17) {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        function6 = function9;
                        objM87133R4 = new C23045q(3, c21397b, function6);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM3398t10, zM67748i10, false, null, null, null, textResourceM21278l5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function5 = function15;
                    modifier3 = modifier6;
                } else {
                    i24 = i19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i119, modifierM118962N15);
                function9 = function4;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q3.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q3, modifierM92116f5);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i113, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q3, c0209i114, interfaceC28653p1M87165m19);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i119, modifierM118962N19);
                float f116 = 4;
                i25 = i24;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f116, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f114, c2314t));
                String title11 = state.getTitle();
                C38072d c38072d12 = C38072d.f163053a;
                int i214 = C38072d.f163054b;
                C2886a t19 = c38072d12.m121952e(c28655q3, i214).getT2();
                long brandWhite11 = c38072d12.m121949b(c28655q3, i214).getBrandWhite();
                int i319 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(title11, null, brandWhite11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t19, null, c28655q3, 0, i319, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d12.m121949b(c28655q3, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q3, i214).getB1(), null, c28655q3, 0, i319, 196602);
                c28655q = c28655q3;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114, c2314t));
                c28655q.m87150e0(1893556523);
                while (it.hasNext()) {
                    C21400e c21400e6 = (C21400e) it.next();
                    String title12 = c21400e6.getTitle();
                    C38072d c38072d13 = C38072d.f163053a;
                    int i3110 = C38072d.f163054b;
                    C2886a b112 = c38072d13.m121952e(c28655q, i3110).getB1();
                    long brandWhite12 = c38072d13.m121949b(c28655q, i3110).getBrandWhite();
                    int i3111 = C2886a.f11498d << 18;
                    C28655q c28655q9 = c28655q;
                    AbstractC30795n.m94707h(title12, null, brandWhite12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b112, null, c28655q9, 0, i3111, 196602);
                    AbstractC30795n.m94707h(c21400e6.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d13.m121949b(c28655q9, i3110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q9, i3110).getB1(), null, c28655q9, 48, i3111, 196600);
                    c28655q = c28655q9;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                }
                c28655q.m87173q(false);
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1110, c22994r1M66759a6);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m110);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                C0209i c0209i1112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N110);
                Modifier modifierM53364e6 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f116, c2314t), f113, f116);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM53364e6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N111);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                boolean zM67748i11 = m67748i(interfaceC28601c1);
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r6 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                if (i25 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i2 = c28655q2.m87157i(state) | z14;
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function16 = function10;
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC14959b1.m43082a(zM67748i11, (Function1) objM87133R3, modifierM3407d6, false, c15127r1M34081r6, c28655q2, 384, 24);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                String checkboxText6 = state.getCheckboxText();
                C2886a b113 = c38072d.m121952e(c28655q2, i26).getB2();
                if (m67748i(interfaceC28601c3)) {
                    jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                    z15 = false;
                } else {
                    z15 = false;
                    jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                }
                c28655q2.m87173q(z15);
                z16 = z15;
                c21397b = state;
                AbstractC30795n.m94707h(checkboxText6, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b113, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                boolean zM67748i12 = m67748i(interfaceC28601c3);
                boolean zM87157i8 = c28655q2.m87157i(c21397b);
                if ((i18 & 7168) == 2048) {
                    z16 = true;
                }
                z17 = zM87157i8 | z16;
                objM87133R4 = c28655q2.m87133R();
                if (z17) {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82343j(modifierM3398t12, zM67748i12, false, null, null, null, textResourceM21278l6, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function5 = function16;
                modifier3 = modifier6;
            } else {
                c21397b = state;
                c28655q3.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) c21397b, (Object) function5, (Object) function6, i13, i14, 3);
            }
        }
        i15 |= 3072;
        function4 = function2;
        i18 = i15;
        if ((i18 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C23374a(8);
                    c28655q3.m87172p0(objM87133R6);
                }
                function7 = (Function1) objM87133R6;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C23374a(9);
                    c28655q3.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsChecked()));
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            i19 = i18 & 896;
            if (i19 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q3.m87157i(state);
            objM87133R2 = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(function7, state, null);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(function7, state, null);
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, state);
            float f117 = 3;
            f13 = 8;
            float f118 = f117 * f13;
            f14 = 2 * f13;
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, modifier2), f118, f14);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            Modifier modifier7 = modifier2;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM3395q4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            function8 = function7;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i1113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i1113, c23010xM66775a10);
            C0209i c0209i1114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i1114, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                i24 = i19;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i1115, modifierM118962N112);
                function9 = function4;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM92116f6);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1113, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q3, c0209i1114, interfaceC28653p1M87165m113);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1115, modifierM118962N113);
                float f119 = 4;
                i25 = i24;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f119, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f118, c2314t));
                String title13 = state.getTitle();
                C38072d c38072d14 = C38072d.f163053a;
                int i215 = C38072d.f163054b;
                C2886a t110 = c38072d14.m121952e(c28655q3, i215).getT2();
                long brandWhite13 = c38072d14.m121949b(c28655q3, i215).getBrandWhite();
                int i3112 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(title13, null, brandWhite13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t110, null, c28655q3, 0, i3112, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d14.m121949b(c28655q3, i215).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q3, i215).getB1(), null, c28655q3, 0, i3112, 196602);
                c28655q = c28655q3;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f118, c2314t));
                c28655q.m87150e0(1893556523);
                while (it.hasNext()) {
                    C21400e c21400e7 = (C21400e) it.next();
                    String title14 = c21400e7.getTitle();
                    C38072d c38072d15 = C38072d.f163053a;
                    int i3113 = C38072d.f163054b;
                    C2886a b114 = c38072d15.m121952e(c28655q, i3113).getB1();
                    long brandWhite14 = c38072d15.m121949b(c28655q, i3113).getBrandWhite();
                    int i3114 = C2886a.f11498d << 18;
                    C28655q c28655q10 = c28655q;
                    AbstractC30795n.m94707h(title14, null, brandWhite14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b114, null, c28655q10, 0, i3114, 196602);
                    AbstractC30795n.m94707h(c21400e7.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d15.m121949b(c28655q10, i3113).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q10, i3113).getB1(), null, c28655q10, 48, i3114, 196600);
                    c28655q = c28655q10;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                }
                c28655q.m87173q(false);
                Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3398t13);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1116, c22994r1M66759a7);
                C0209i c0209i1117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1117, interfaceC28653p1M87165m114);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                C0209i c0209i1118 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N114);
                Modifier modifierM53364e7 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f119, c2314t), f117, f119);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM53364e7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i1117, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N115);
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
                boolean zM67748i13 = m67748i(interfaceC28601c1);
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r7 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                if (i25 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i2 = c28655q2.m87157i(state) | z14;
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2) {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    function10 = function8;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function17 = function10;
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC14959b1.m43082a(zM67748i13, (Function1) objM87133R3, modifierM3407d7, false, c15127r1M34081r7, c28655q2, 384, 24);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
                String checkboxText7 = state.getCheckboxText();
                C2886a b115 = c38072d.m121952e(c28655q2, i26).getB2();
                if (m67748i(interfaceC28601c3)) {
                    jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                    z15 = false;
                } else {
                    z15 = false;
                    jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
                }
                c28655q2.m87173q(z15);
                z16 = z15;
                c21397b = state;
                AbstractC30795n.m94707h(checkboxText7, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b115, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
                boolean zM67748i14 = m67748i(interfaceC28601c3);
                boolean zM87157i9 = c28655q2.m87157i(c21397b);
                if ((i18 & 7168) == 2048) {
                    z16 = true;
                }
                z17 = zM87157i9 | z16;
                objM87133R4 = c28655q2.m87133R();
                if (z17) {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    function6 = function9;
                    objM87133R4 = new C23045q(3, c21397b, function6);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82343j(modifierM3398t14, zM67748i14, false, null, null, null, textResourceM21278l7, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function5 = function17;
                modifier3 = modifier7;
            } else {
                i24 = i19;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            C0209i c0209i1119 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i1119, modifierM118962N112);
            function9 = function4;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, modifierM92116f7);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1113, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q3, c0209i1114, interfaceC28653p1M87165m116);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1119, modifierM118962N116);
            float f1110 = 4;
            i25 = i24;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getImageUrl(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f1110, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f118, c2314t));
            String title15 = state.getTitle();
            C38072d c38072d16 = C38072d.f163053a;
            int i216 = C38072d.f163054b;
            C2886a t111 = c38072d16.m121952e(c28655q3, i216).getT2();
            long brandWhite15 = c38072d16.m121949b(c28655q3, i216).getBrandWhite();
            int i3115 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title15, null, brandWhite15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t111, null, c28655q3, 0, i3115, 196602);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d16.m121949b(c28655q3, i216).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q3, i216).getB1(), null, c28655q3, 0, i3115, 196602);
            c28655q = c28655q3;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f118, c2314t));
            c28655q.m87150e0(1893556523);
            while (it.hasNext()) {
                C21400e c21400e8 = (C21400e) it.next();
                String title16 = c21400e8.getTitle();
                C38072d c38072d17 = C38072d.f163053a;
                int i3116 = C38072d.f163054b;
                C2886a b116 = c38072d17.m121952e(c28655q, i3116).getB1();
                long brandWhite16 = c38072d17.m121949b(c28655q, i3116).getBrandWhite();
                int i3117 = C2886a.f11498d << 18;
                C28655q c28655q11 = c28655q;
                AbstractC30795n.m94707h(title16, null, brandWhite16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b116, null, c28655q11, 0, i3117, 196602);
                AbstractC30795n.m94707h(c21400e8.getSubtitle(), AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d17.m121949b(c28655q11, i3116).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d17.m121952e(c28655q11, i3116).getB1(), null, c28655q11, 48, i3117, 196600);
                c28655q = c28655q11;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            }
            c28655q.m87173q(false);
            Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 1.5d) * f13, 0.0f, f14, 5);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11110 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11110, c22994r1M66759a8);
            C0209i c0209i11111 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i11111, interfaceC28653p1M87165m117);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            C0209i c0209i11112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N117);
            Modifier modifierM53364e8 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f1110, c2314t), f117, f1110);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM53364e8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11110, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i11111, interfaceC28653p1M87165m118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N118);
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "SAGE_INFO_CHECKBOX"));
            boolean zM67748i15 = m67748i(interfaceC28601c1);
            c38072d = C38072d.f163053a;
            i26 = C38072d.f163054b;
            c28655q2 = c28655q;
            C15127r1 c15127r1M34081r8 = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandWhite(), c38072d.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
            if (i25 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i2 = c28655q2.m87157i(state) | z14;
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i2) {
                function10 = function8;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                c28655q2.m87172p0(objM87133R3);
            } else {
                function10 = function8;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C21930h(function10, state, interfaceC28601c2, 9);
                c28655q2.m87172p0(objM87133R3);
            }
            Function1 function18 = function10;
            interfaceC28601c3 = interfaceC28601c2;
            AbstractC14959b1.m43082a(zM67748i15, (Function1) objM87133R3, modifierM3407d8, false, c15127r1M34081r8, c28655q2, 384, 24);
            c28655q2.m87173q(true);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f13, c2314t));
            String checkboxText8 = state.getCheckboxText();
            C2886a b117 = c38072d.m121952e(c28655q2, i26).getB2();
            if (m67748i(interfaceC28601c3)) {
                jM73370c = AbstractC25012a.m73366B(c28655q2, -17860741, c38072d, c28655q2, i26);
                z15 = false;
            } else {
                z15 = false;
                jM73370c = AbstractC25012a.m73370c(c28655q2, -17859656, c38072d, c28655q2, i26);
            }
            c28655q2.m87173q(z15);
            z16 = z15;
            c21397b = state;
            AbstractC30795n.m94707h(checkboxText8, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b117, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f14, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(c21397b.getNextButtonText());
            boolean zM67748i16 = m67748i(interfaceC28601c3);
            boolean zM87157i10 = c28655q2.m87157i(c21397b);
            if ((i18 & 7168) == 2048) {
                z16 = true;
            }
            z17 = zM87157i10 | z16;
            objM87133R4 = c28655q2.m87133R();
            if (z17) {
                function6 = function9;
                objM87133R4 = new C23045q(3, c21397b, function6);
                c28655q2.m87172p0(objM87133R4);
            } else {
                function6 = function9;
                objM87133R4 = new C23045q(3, c21397b, function6);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC27292z.m82343j(modifierM3398t16, zM67748i16, false, null, null, null, textResourceM21278l8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
            c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            function5 = function18;
            modifier3 = modifier7;
        } else {
            c21397b = state;
            c28655q3.m87138X();
            modifier3 = modifier2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) c21397b, (Object) function5, (Object) function6, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m67746g(AbstractC0524a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m67747h(AbstractC21403h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m67748i(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m67749j(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m67750k(Function1 function1, C21397b c21397b, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m67749j(interfaceC28601c1, z4);
        if (m67748i(interfaceC28601c1)) {
            function1.invoke(new AbstractC0524a.i(c21397b.getScreenId().name(), "acknowledge"));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m67751l(C21397b c21397b, Function1 function1) {
        EnumC21402g buttonNextId = c21397b.getButtonNextId();
        if (buttonNextId != null) {
            function1.invoke(new AbstractC21403h.d(buttonNextId, new C15552f(null, null, AbstractC37056f.m118958J(c21397b.getScreenId()), 3, null)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m67752m(Modifier modifier, C21397b c21397b, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m67745f(modifier, c21397b, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
