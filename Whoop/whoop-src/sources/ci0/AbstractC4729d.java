package ci0;

import ai0.AbstractC0906a;
import ai0.AbstractC0908c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bf0.C3189a;
import c41.C4007d1;
import c51.AbstractC4234k;
import c51.C4237n;
import c51.C4242s;
import c62.C4273a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d51.AbstractC11717e;
import hy0.AbstractC17763k2;
import i93.C18279e;
import ih0.AbstractC18489d0;
import iy0.AbstractC21027b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
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
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zh0.AbstractC40638a;

/* JADX INFO: renamed from: ci0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\r\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aC\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lai0/c;", "viewState", "Lkotlin/Function1;", "Lai0/a;", "Ll83/a0;", "onViewEvent", "Lzh0/a;", "onNavigationEvent", "l", "(Lai0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lai0/c$c;", "u", "(Lkotlin/jvm/functions/Function1;Lai0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "value", "", "title", "prefix", "suffix", "onValueChange", "s", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "paceOfAgingSliderProgress", "yearsDifferenceSliderProgress", "amoeba_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4729d {

    /* JADX INFO: renamed from: ci0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.amoeba.debug.view.AmoebaDebugScreenKt$SuccessScreen$1$1", m100430f = "AmoebaDebugScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19329w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC0908c.c f19330x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f19331y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f19332z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0908c.c cVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19330x = cVar;
            this.f19331y = interfaceC28601c1;
            this.f19332z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f19330x, this.f19331y, this.f19332z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f19329w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC4729d.m14805w(this.f19331y, this.f19330x.getPaceOfAgingSliderProgress());
            AbstractC4729d.m14807y(this.f19332z, this.f19330x.getYearsDifferenceSliderProgress());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m14777A(Function1 function1) {
        function1.invoke(new AbstractC0906a.d());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m14778B(Function1 function1, InterfaceC28601c1 interfaceC28601c1, float f13) {
        m14807y(interfaceC28601c1, f13);
        function1.invoke(new AbstractC0906a.e(AbstractC11717e.m31313b(new C18279e(-10.0f, 10.0f), f13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m14779C(Function1 function1, InterfaceC28601c1 interfaceC28601c1, float f13) {
        m14805w(interfaceC28601c1, f13);
        function1.invoke(new AbstractC0906a.c(AbstractC11717e.m31313b(C4237n.INSTANCE.m13214b(), f13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m14780D(Function1 function1, AbstractC0908c.c cVar, Function1 function2, int i13, Composer composer, int i14) {
        m14803u(function1, cVar, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0206  */
    /* JADX WARN: Code duplicated, block: B:84:0x0213  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m14794l(AbstractC0908c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        boolean z13;
        C2314t c2314t;
        Function1 function8;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        Object objM87133R;
        Object objM87133R2;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(314822333);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q3.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q3.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(28);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(29);
                            c28655q3.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function4;
                    }
                    if (viewState instanceof AbstractC0908c.c) {
                        c28655q3.m87150e0(-1336202571);
                        int i19 = (i15 >> 6) & 14;
                        int i24 = i15 << 3;
                        m14803u(function7, (AbstractC0908c.c) viewState, function6, c28655q3, (i24 & 896) | i19 | (i24 & 112));
                        c28655q3.m87173q(false);
                        Function1 function10 = function6;
                        c28655q2 = c28655q3;
                        function8 = function10;
                        function9 = function7;
                    } else {
                        z13 = viewState instanceof AbstractC0908c.a;
                        c2314t = C2314t.f9131w;
                        if (z13) {
                            c28655q3.m87150e0(-1336070387);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i2 = C0217k.f732j;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                            function9 = function7;
                            function8 = function6;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l("Request Failed"), false, null, 6, null), AbstractC8693b.m21278l("Account does not have access"), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3), 0, 4092);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        } else {
                            function8 = function6;
                            function9 = function7;
                            if (viewState instanceof AbstractC0908c.b) {
                                throw AbstractC11895b.m32003v(1896558284, c28655q3, false);
                            }
                            c28655q3.m87150e0(-1335593576);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                            iHashCode = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i = C0217k.f732j;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                    }
                    function3 = function8;
                    c28655q = c28655q2;
                    function5 = function9;
                } else {
                    c28655q3.m87138X();
                    c28655q = c28655q3;
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(i13, i14, 10, viewState, function5, function3);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(28);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4273a(29);
                        c28655q3.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function4;
                }
                if (viewState instanceof AbstractC0908c.c) {
                    c28655q3.m87150e0(-1336202571);
                    int i110 = (i15 >> 6) & 14;
                    int i25 = i15 << 3;
                    m14803u(function7, (AbstractC0908c.c) viewState, function6, c28655q3, (i25 & 896) | i110 | (i25 & 112));
                    c28655q3.m87173q(false);
                    Function1 function11 = function6;
                    c28655q2 = c28655q3;
                    function8 = function11;
                    function9 = function7;
                } else {
                    z13 = viewState instanceof AbstractC0908c.a;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q3.m87150e0(-1336070387);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                        function9 = function7;
                        function8 = function6;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l("Request Failed"), false, null, 6, null), AbstractC8693b.m21278l("Account does not have access"), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3), 0, 4092);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        function8 = function6;
                        function9 = function7;
                        if (viewState instanceof AbstractC0908c.b) {
                            throw AbstractC11895b.m32003v(1896558284, c28655q3, false);
                        }
                        c28655q3.m87150e0(-1335593576);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                }
                function3 = function8;
                c28655q = c28655q2;
                function5 = function9;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 10, viewState, function5, function3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q3.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(28);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4273a(29);
                        c28655q3.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function4;
                }
                if (viewState instanceof AbstractC0908c.c) {
                    c28655q3.m87150e0(-1336202571);
                    int i111 = (i15 >> 6) & 14;
                    int i26 = i15 << 3;
                    m14803u(function7, (AbstractC0908c.c) viewState, function6, c28655q3, (i26 & 896) | i111 | (i26 & 112));
                    c28655q3.m87173q(false);
                    Function1 function12 = function6;
                    c28655q2 = c28655q3;
                    function8 = function12;
                    function9 = function7;
                } else {
                    z13 = viewState instanceof AbstractC0908c.a;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q3.m87150e0(-1336070387);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                        function9 = function7;
                        function8 = function6;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l("Request Failed"), false, null, 6, null), AbstractC8693b.m21278l("Account does not have access"), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3), 0, 4092);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        function8 = function6;
                        function9 = function7;
                        if (viewState instanceof AbstractC0908c.b) {
                            throw AbstractC11895b.m32003v(1896558284, c28655q3, false);
                        }
                        c28655q3.m87150e0(-1335593576);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N6);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                }
                function3 = function8;
                c28655q = c28655q2;
                function5 = function9;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 10, viewState, function5, function3);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4273a(28);
                    c28655q3.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C4273a(29);
                    c28655q3.m87172p0(objM87133R);
                }
                function7 = (Function1) objM87133R;
            } else {
                function7 = function4;
            }
            if (viewState instanceof AbstractC0908c.c) {
                c28655q3.m87150e0(-1336202571);
                int i112 = (i15 >> 6) & 14;
                int i27 = i15 << 3;
                m14803u(function7, (AbstractC0908c.c) viewState, function6, c28655q3, (i27 & 896) | i112 | (i27 & 112));
                c28655q3.m87173q(false);
                Function1 function13 = function6;
                c28655q2 = c28655q3;
                function8 = function13;
                function9 = function7;
            } else {
                z13 = viewState instanceof AbstractC0908c.a;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q3.m87150e0(-1336070387);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                    function9 = function7;
                    function8 = function6;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21278l("Request Failed"), false, null, 6, null), AbstractC8693b.m21278l("Account does not have access"), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3), 0, 4092);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                } else {
                    function8 = function6;
                    function9 = function7;
                    if (viewState instanceof AbstractC0908c.b) {
                        throw AbstractC11895b.m32003v(1896558284, c28655q3, false);
                    }
                    c28655q3.m87150e0(-1335593576);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q3, 54);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N8);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
            }
            function3 = function8;
            c28655q = c28655q2;
            function5 = function9;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 10, viewState, function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m14795m(AbstractC0906a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m14796n(AbstractC40638a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m14797o(AbstractC0908c abstractC0908c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m14794l(abstractC0908c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m14798p(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(479595169);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Amoeba"));
            AbstractC6721d.a aVarM20156a = aVarM20173a.m20156a((32763 & 1) != 0 ? aVarM20173a.title : null, (32763 & 2) != 0 ? aVarM20173a.subtitle : null, (32763 & 4) != 0 ? aVarM20173a.leftIcon : new C39274g(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), (32763 & 8) != 0 ? aVarM20173a.rightIcon : null, (32763 & 16) != 0 ? aVarM20173a.leftIconButtonType : null, (32763 & 32) != 0 ? aVarM20173a.rightIconButtonType : null, (32763 & 64) != 0 ? aVarM20173a.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVarM20173a.rightIconView : null, (32763 & 256) != 0 ? aVarM20173a.rightIconColor : null, (32763 & 512) != 0 ? aVarM20173a.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVarM20173a.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVarM20173a.subtitleColor : null, (32763 & 4096) != 0 ? aVarM20173a.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVarM20173a.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVarM20173a.leftIconAutomationTag : null);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20156a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m14799q(Function1 function1) {
        function1.invoke(AbstractC40638a.a.f175392a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m14800r(Function1 function1, int i13, Composer composer, int i14) {
        m14798p(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0205  */
    /* JADX INFO: renamed from: s */
    private static final void m14801s(float f13, String str, String str2, String str3, Function1 function1, Composer composer, int i13) {
        int i14;
        String str4;
        int i15;
        int iHashCode;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-535153968);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str4 = str;
            i14 |= c28655q.m87153g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(5, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8436q = c38072d.m121952e(c28655q, i16).getH3();
                int i17 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str4, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, (i15 >> 3) & 14, i17, 196602);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f14 = 40;
                Modifier modifierM3424u = AbstractC1102d.m3424u(f14, c2314t);
                C2306l c2306l = C2299e.f9108K;
                AbstractC30795n.m94707h(str2, modifierM3424u.mo3471e(new VerticalAlignElement(c2306l)), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH4(), null, c28655q, (i15 >> 6) & 14, i17, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC17763k2.m50956d(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, f13, null, 0, null, function1, c28655q, (i15 << 6) & 3670912, 58);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(20, c2314t));
                AbstractC30795n.m94707h(str3, AbstractC1102d.m3424u(f14, c2314t).mo3471e(new VerticalAlignElement(c2306l)), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH4(), null, c28655q, (i15 >> 9) & 14, i17, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q, i18).getH3();
            int i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str4, null, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q, (i15 >> 3) & 14, i19, 196602);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            float f15 = 40;
            Modifier modifierM3424u2 = AbstractC1102d.m3424u(f15, c2314t);
            C2306l c2306l2 = C2299e.f9108K;
            AbstractC30795n.m94707h(str2, modifierM3424u2.mo3471e(new VerticalAlignElement(c2306l2)), c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getH4(), null, c28655q, (i15 >> 6) & 14, i19, 196600);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC17763k2.m50956d(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, f13, null, 0, null, function1, c28655q, (i15 << 6) & 3670912, 58);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(20, c2314t));
            AbstractC30795n.m94707h(str3, AbstractC1102d.m3424u(f15, c2314t).mo3471e(new VerticalAlignElement(c2306l2)), c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getH4(), null, c28655q, (i15 >> 9) & 14, i19, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4728c(f13, str, str2, str3, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m14802t(float f13, String str, String str2, String str3, Function1 function1, int i13, Composer composer, int i14) {
        m14801s(f13, str, str2, str3, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m14803u(Function1 function1, AbstractC0908c.c cVar, Function1 function2, Composer composer, int i13) {
        int i14;
        Function1 function3;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1150705587);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(cVar) : c28655q2.m87157i(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Double.valueOf(cVar.getAmoeba().getPaceOfAgingAnimationScore()));
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Double.valueOf(cVar.getAmoeba().getYearsDifferenceAnimationScore()));
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Float fValueOf = Float.valueOf(cVar.getYearsDifferenceSliderProgress());
            Float fValueOf2 = Float.valueOf(cVar.getPaceOfAgingSliderProgress());
            boolean z4 = (i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q2.m87157i(cVar));
            Object objM87133R3 = c28655q2.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new a(cVar, interfaceC28601c1, interfaceC28601c2, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87254h(fValueOf, fValueOf2, (InterfaceC4351m) objM87133R3, c28655q2);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(AbstractC1099a.m3396r(c2314t, 20, 0.0f, 2), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack5(), AbstractC17918w0.f69621a));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
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
            m14798p(function1, c28655q2, i14 & 14);
            c28655q = c28655q2;
            int i15 = i14;
            AbstractC4234k.m13178q(null, null, null, null, null, null, cVar.getAmoeba(), c28655q, C4242s.f17232p << 18, 63);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("New Healthspan");
            int i16 = i15 & 896;
            boolean z13 = i16 == 256;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                function3 = function2;
                objM87133R4 = new C3189a(function3, 18);
                c28655q.m87172p0(objM87133R4);
            } else {
                function3 = function2;
            }
            int i17 = TextResource.$stable;
            AbstractC21027b.m58696c(textResourceM21278l, null, (InterfaceC4339a) objM87133R4, c28655q, i17, 2);
            float f13 = 15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Start Onboarding");
            boolean z14 = i16 == 256;
            Object objM87133R5 = c28655q.m87133R();
            if (z14 || objM87133R5 == c28676v0) {
                objM87133R5 = new C3189a(function3, 19);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC21027b.m58696c(textResourceM21278l2, null, (InterfaceC4339a) objM87133R5, c28655q, i17, 2);
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f13, c28655q);
            float fM14806x = (float) m14806x(interfaceC28601c2);
            boolean z15 = i16 == 256;
            Object objM87133R6 = c28655q.m87133R();
            if (z15 || objM87133R6 == c28676v0) {
                objM87133R6 = new C2609r(function3, interfaceC28601c2, 6);
                c28655q.m87172p0(objM87133R6);
            }
            m14801s(fM14806x, "Years Difference", "-10", "10", (Function1) objM87133R6, c28655q, 3504);
            float fM14804v = (float) m14804v(interfaceC28601c1);
            boolean z16 = i16 == 256;
            Object objM87133R7 = c28655q.m87133R();
            if (z16 || objM87133R7 == c28676v0) {
                objM87133R7 = new C2609r(function3, interfaceC28601c1, 7);
                c28655q.m87172p0(objM87133R7);
            }
            m14801s(fM14804v, "Pace of Aging", "-1x", "3x", (Function1) objM87133R7, c28655q, 3504);
            c28655q.m87173q(true);
        } else {
            function3 = function2;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(function1, cVar, function3, i13, 25);
        }
    }

    /* JADX INFO: renamed from: v */
    private static final double m14804v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m14805w(InterfaceC28601c1 interfaceC28601c1, double d3) {
        interfaceC28601c1.setValue(Double.valueOf(d3));
    }

    /* JADX INFO: renamed from: x */
    private static final double m14806x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m14807y(InterfaceC28601c1 interfaceC28601c1, double d3) {
        interfaceC28601c1.setValue(Double.valueOf(d3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m14808z(Function1 function1) {
        function1.invoke(new AbstractC0906a.b());
        return C23454a0.f92919a;
    }
}
