package ud2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import j11.AbstractC21211n;
import kd2.AbstractC22415a;
import l83.C23454a0;
import ld2.C23866a;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import oq1.C28119c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32458i;
import sg2.C32469t;
import so2.C32848f;
import t01.C33259e;
import td2.C33710a;
import td2.C33711b;
import td2.C33717h;
import td2.InterfaceC33715f;
import td2.InterfaceC33718i;
import u71.C34569c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xd2.C38206b;

/* JADX INFO: renamed from: ud2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ltd2/h;", "viewModel", "Lld2/a;", "analytics", "Lkotlin/Function1;", "Ltd2/f$f;", "Ll83/a0;", "onNavEvent", "F", "(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltd2/i;", "viewState", "Ltd2/f;", "onEvent", "G", "(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltd2/i$b;", "A", "(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "q", "(Ltd2/i$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ltd2/i$a;", "v", "(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34796e {

    /* JADX INFO: renamed from: ud2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.view.ShepherdHistoryDetailScreenKt$FullScreenModalScreen$1$4$1", m100430f = "ShepherdHistoryDetailScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC33718i.a f146508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f146509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC33718i.a aVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146508x = aVar;
            this.f146509y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f146508x, this.f146509y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f146507w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC33715f interfaceC33715fM106567h = this.f146508x.getFollowUpEvent();
            if (interfaceC33715fM106567h != null) {
                this.f146509y.invoke(interfaceC33715fM106567h);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ud2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.view.ShepherdHistoryDetailScreenKt$ShepherdHistoryDetailScreen$2$1", m100430f = "ShepherdHistoryDetailScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33717h f146511x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C33717h c33717h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146511x = c33717h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f146511x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f146510w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f146511x.m106559p(InterfaceC33715f.e.f140969a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x022d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0242  */
    /* JADX WARN: Code duplicated, block: B:59:0x0255  */
    /* JADX WARN: Code duplicated, block: B:60:0x0257  */
    /* JADX WARN: Code duplicated, block: B:63:0x025f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0264  */
    /* JADX WARN: Code duplicated, block: B:67:0x0267  */
    /* JADX WARN: Code duplicated, block: B:73:0x0290  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0333  */
    /* JADX WARN: Code duplicated, block: B:89:0x0336  */
    /* JADX WARN: Code duplicated, block: B:93:0x033f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0364  */
    /* JADX WARN: Code duplicated, block: B:98:0x036e  */
    /* JADX INFO: renamed from: A */
    private static final void m109819A(InterfaceC33718i.b bVar, C23866a c23866a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C23866a c23866a2;
        boolean z4;
        C23866a c23866a3;
        C28677v1 c28677v1M87180u;
        C23866a c23866a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        C23866a c23866a5;
        C33710a c33710aM106585g;
        C23866a c23866a6;
        int i17;
        int i18;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        C28676v0 c28676v1;
        Function1 function2;
        int iHashCode2;
        boolean z16;
        Object objM87133R3;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(133770609);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                c23866a2 = c23866a;
                i15 |= c28655q.m87157i(c23866a2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i15 |= i19;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i24 != 0) {
                    c23866a4 = null;
                } else {
                    c23866a4 = c23866a2;
                }
                m109847q(bVar, function1, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
                AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C32458i(function1, 29);
                    c28655q.m87172p0(objM87133R);
                }
                c23866a5 = c23866a4;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f13 = 8;
                float f14 = 2 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                C33711b c33711bM106587i = bVar.getPossibleShepherdTile();
                int i25 = TextResource.$stable;
                AbstractC34793b.m109804c(c33711bM106587i, c28655q, i25);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                String strM21274h = AbstractC8693b.m21274h(bVar.getDescription(), c28655q, i25);
                C38072d c38072d = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                long jM125385c1 = c38072d.m121949b(c28655q, i26).getWhite70();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i26).getB1();
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i27, 196600);
                float f15 = 3 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getAdvise(), c28655q, i25), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 48, i27, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                c33710aM106585g = bVar.getLabradorItemInfo();
                if (c33710aM106585g == null) {
                    c28655q.m87150e0(641463845);
                    c28655q.m87173q(false);
                    function2 = function1;
                    i17 = i16;
                    c23866a6 = c23866a5;
                    c28676v1 = c28676v0;
                    i18 = 256;
                } else {
                    c28655q.m87150e0(641463846);
                    c23866a6 = c23866a5;
                    boolean zM87157i = c28655q.m87157i(c23866a6);
                    i17 = i16;
                    i18 = 256;
                    if (i17 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function2 = function1;
                        }
                        AbstractC34792a.m109798d(c33710aM106585g, (Function1) objM87133R2, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    function2 = function1;
                    objM87133R2 = new C32469t(25, c23866a6, function2);
                    c28655q.m87172p0(objM87133R2);
                    AbstractC34792a.m109798d(c33710aM106585g, (Function1) objM87133R2, c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                C23866a c23866a7 = c23866a6;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f14, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
                AbstractC34794c.m109812f(bVar.getHistoryDetailBox(), c28655q, 0);
                c28655q.m87173q(true);
                float f16 = 4 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30007c.m91835e(c2314t, f14, c28655q, c2314t, 1.0f), f16, 0.0f, f16, 5 * f13, 2);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(bVar.getClearButton().getLabel(), c28655q, i25);
                long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                if (i17 == i18) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v1) {
                    objM87133R3 = new C32458i(function2, 27);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27282u.m82292h(modifierM3398t, enumC27284v, strM21274h2, false, jM125430y, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c23866a3 = c23866a7;
            } else {
                c28655q.m87138X();
                c23866a3 = c23866a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(bVar, c23866a3, function1, i13, i14, 16);
            }
        }
        i15 |= 48;
        c23866a2 = c23866a;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(function1)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i24 != 0) {
                c23866a4 = null;
            } else {
                c23866a4 = c23866a2;
            }
            m109847q(bVar, function1, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM94757f2 = AbstractC30802r.m94757f(c2314t2, 1.0f);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM94757f2);
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
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i16 = i15 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C32458i(function1, 29);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32458i(function1, 29);
                c28655q.m87172p0(objM87133R);
            }
            c23866a5 = c23866a4;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f17 = 8;
            float f18 = 2 * f17;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t2));
            C33711b c33711bM106587i2 = bVar.getPossibleShepherdTile();
            int i28 = TextResource.$stable;
            AbstractC34793b.m109804c(c33711bM106587i2, c28655q, i28);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t2));
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
            String strM21274h3 = AbstractC8693b.m21274h(bVar.getDescription(), c28655q, i28);
            C38072d c38072d2 = C38072d.f163053a;
            int i29 = C38072d.f163054b;
            long jM125385c2 = c38072d2.m121949b(c28655q, i29).getWhite70();
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i29).getB1();
            int i210 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h3, modifierM3396r3, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 48, i210, 196600);
            float f19 = 3 * f17;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getAdvise(), c28655q, i28), AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), c38072d2.m121949b(c28655q, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i29).getB1(), null, c28655q, 48, i210, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t2));
            c33710aM106585g = bVar.getLabradorItemInfo();
            if (c33710aM106585g == null) {
                c28655q.m87150e0(641463845);
                c28655q.m87173q(false);
                function2 = function1;
                i17 = i16;
                c23866a6 = c23866a5;
                c28676v1 = c28676v0;
                i18 = 256;
            } else {
                c28655q.m87150e0(641463846);
                c23866a6 = c23866a5;
                boolean zM87157i2 = c28655q.m87157i(c23866a6);
                i17 = i16;
                i18 = 256;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function2 = function1;
                    }
                    AbstractC34792a.m109798d(c33710aM106585g, (Function1) objM87133R2, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                function2 = function1;
                objM87133R2 = new C32469t(25, c23866a6, function2);
                c28655q.m87172p0(objM87133R2);
                AbstractC34792a.m109798d(c33710aM106585g, (Function1) objM87133R2, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t2));
            C23866a c23866a8 = c23866a6;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f18, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
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
            AbstractC34794c.m109812f(bVar.getHistoryDetailBox(), c28655q, 0);
            c28655q.m87173q(true);
            float f110 = 4 * f17;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30007c.m91835e(c2314t2, f18, c28655q, c2314t2, 1.0f), f110, 0.0f, f110, 5 * f17, 2);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21274h4 = AbstractC8693b.m21274h(bVar.getClearButton().getLabel(), c28655q, i28);
            long jM125430y2 = c38072d2.m121949b(c28655q, i29).getBrandWhite();
            if (i17 == i18) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                objM87133R3 = new C32458i(function2, 27);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32458i(function2, 27);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27282u.m82292h(modifierM3398t2, enumC27284v2, strM21274h4, false, jM125430y2, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c23866a3 = c23866a8;
        } else {
            c28655q.m87138X();
            c23866a3 = c23866a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(bVar, c23866a3, function1, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m109820B(Function1 function1) {
        function1.invoke(InterfaceC33715f.c.f140967a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m109821C(C23866a c23866a, Function1 function1, C9598e navAction) {
        AbstractC22676k.m65750j(navAction, "navAction");
        if (c23866a != null) {
            c23866a.m70120a();
        }
        function1.invoke(new InterfaceC33715f.h(navAction));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m109822D(Function1 function1) {
        function1.invoke(InterfaceC33715f.d.f140968a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m109823E(InterfaceC33718i.b bVar, C23866a c23866a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109819A(bVar, c23866a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public static final void m109824F(C33717h viewModel, C23866a c23866a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C23866a c23866a2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        C23866a c23866a3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1931214345);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                c23866a2 = c23866a;
                i15 |= c28655q.m87157i(c23866a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        c23866a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C34569c(15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC33718i.a.INSTANCE.m106577d(), null, c28655q, 0, 2);
                    zM87157i = c28655q.m87157i(viewModel);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new b(viewModel, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                    InterfaceC33718i interfaceC33718iM109827I = m109827I(interfaceC28601c1M87260n);
                    zM87157i2 = c28655q.m87157i(viewModel) | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C32469t(24, function4, viewModel);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C23866a c23866a4 = c23866a2;
                    m109825G(interfaceC33718iM109827I, c23866a4, (Function1) objM87133R2, c28655q, i15 & 112, 0);
                    c23866a3 = c23866a4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    c23866a3 = c23866a2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33259e(viewModel, c23866a3, function3, i13, i14, 17);
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
                if (i18 != 0) {
                    c23866a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C34569c(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC33718i.a.INSTANCE.m106577d(), null, c28655q, 0, 2);
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new b(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new b(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                InterfaceC33718i interfaceC33718iM109827I2 = m109827I(interfaceC28601c1M87260n2);
                zM87157i2 = c28655q.m87157i(viewModel) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R2 = new C32469t(24, function4, viewModel);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32469t(24, function4, viewModel);
                    c28655q.m87172p0(objM87133R2);
                }
                C23866a c23866a5 = c23866a2;
                m109825G(interfaceC33718iM109827I2, c23866a5, (Function1) objM87133R2, c28655q, i15 & 112, 0);
                c23866a3 = c23866a5;
                function3 = function4;
            } else {
                c28655q.m87138X();
                c23866a3 = c23866a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(viewModel, c23866a3, function3, i13, i14, 17);
            }
        }
        i15 |= 48;
        c23866a2 = c23866a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    c23866a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C34569c(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC33718i.a.INSTANCE.m106577d(), null, c28655q, 0, 2);
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new b(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new b(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                InterfaceC33718i interfaceC33718iM109827I3 = m109827I(interfaceC28601c1M87260n3);
                zM87157i2 = c28655q.m87157i(viewModel) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R2 = new C32469t(24, function4, viewModel);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32469t(24, function4, viewModel);
                    c28655q.m87172p0(objM87133R2);
                }
                C23866a c23866a6 = c23866a2;
                m109825G(interfaceC33718iM109827I3, c23866a6, (Function1) objM87133R2, c28655q, i15 & 112, 0);
                c23866a3 = c23866a6;
                function3 = function4;
            } else {
                c28655q.m87138X();
                c23866a3 = c23866a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(viewModel, c23866a3, function3, i13, i14, 17);
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
            if (i18 != 0) {
                c23866a2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C34569c(15);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            InterfaceC28601c1 interfaceC28601c1M87260n4 = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC33718i.a.INSTANCE.m106577d(), null, c28655q, 0, 2);
            zM87157i = c28655q.m87157i(viewModel);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new b(viewModel, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new b(viewModel, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
            InterfaceC33718i interfaceC33718iM109827I4 = m109827I(interfaceC28601c1M87260n4);
            zM87157i2 = c28655q.m87157i(viewModel) | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R2 = new C32469t(24, function4, viewModel);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32469t(24, function4, viewModel);
                c28655q.m87172p0(objM87133R2);
            }
            C23866a c23866a7 = c23866a2;
            m109825G(interfaceC33718iM109827I4, c23866a7, (Function1) objM87133R2, c28655q, i15 & 112, 0);
            c23866a3 = c23866a7;
            function3 = function4;
        } else {
            c28655q.m87138X();
            c23866a3 = c23866a2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(viewModel, c23866a3, function3, i13, i14, 17);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m109825G(InterfaceC33718i viewState, C23866a c23866a, Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        C23866a c23866a2;
        C23866a c23866a3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1393912177);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c23866a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C23866a c23866a4 = i16 != 0 ? null : c23866a;
            if (viewState instanceof InterfaceC33718i.a) {
                c28655q.m87150e0(-480185702);
                m109852v((InterfaceC33718i.a) viewState, onEvent, c28655q, ((i15 >> 3) & 112) | (i15 & 14));
                c28655q.m87173q(false);
                c23866a3 = c23866a4;
            } else {
                if (!(viewState instanceof InterfaceC33718i.b)) {
                    throw AbstractC11895b.m32003v(-480188073, c28655q, false);
                }
                c28655q.m87150e0(-480182685);
                c23866a3 = c23866a4;
                m109819A((InterfaceC33718i.b) viewState, c23866a3, onEvent, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            }
            c23866a2 = c23866a3;
        } else {
            c28655q.m87138X();
            c23866a2 = c23866a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(viewState, c23866a2, onEvent, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m109826H(InterfaceC33715f.f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final InterfaceC33718i m109827I(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC33718i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m109828J(Function1 function1, C33717h c33717h, InterfaceC33715f event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC33715f.f) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC33715f.j)) {
                throw new NoWhenBranchMatchedException();
            }
            c33717h.m106559p((InterfaceC33715f.j) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m109829K(C33717h c33717h, C23866a c23866a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109824F(c33717h, c23866a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m109830L(InterfaceC33718i interfaceC33718i, C23866a c23866a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109825G(interfaceC33718i, c23866a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m109847q(InterfaceC33718i.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-887503332);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC29125c.m88520b(Boolean.valueOf(bVar.getClearHistoryDialog() != null), null, null, "", AbstractC37817c.m121344e(-1710393347, c28655q, new C28119c(23, bVar, function1)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(bVar, function1, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m109848r(InterfaceC33718i.b bVar, Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || bVar.getClearHistoryDialog() == null || bVar.getHistoryDetailBox().getHistoryDetailByDate() == null) {
            c28655q.m87150e0(1164601797);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1163956966);
            C38206b c38206bM106581c = bVar.getClearHistoryDialog();
            TextResource textResourceM122413b = c38206bM106581c.getPageTitle();
            TextResource textResourceM122416e = c38206bM106581c.getWarningMessage();
            TextResource textResourceM122414c = c38206bM106581c.getPrimaryButtonText();
            TextResource textResourceM122415d = c38206bM106581c.getSecondaryButtonText();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C32458i(function1, 28);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(bVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32209f(function1, bVar, 27);
                c28655q.m87172p0(objM87133R2);
            }
            int i15 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM122413b, textResourceM122416e, textResourceM122414c, false, null, null, null, null, textResourceM122415d, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, 0, 247459313);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m109849s(Function1 function1) {
        function1.invoke(InterfaceC33715f.b.f140966a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m109850t(Function1 function1, InterfaceC33718i.b bVar) {
        function1.invoke(new InterfaceC33715f.g(bVar.getHistoryDetailBox().getHistoryDetailByDate().getRecordDate()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m109851u(InterfaceC33718i.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m109847q(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m109852v(final InterfaceC33718i.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1603125944);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-156219345);
                TextResource title = aVar.getType().getTitle();
                boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: ud2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC34796e.m109853w(aVar, function1);
                                case 1:
                                    return AbstractC34796e.m109854x(aVar, function1);
                                default:
                                    return AbstractC34796e.m109855y(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), aVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-155868952);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M106573n = aVar.getType();
                TextResource textResourceM106572m = aVar.getSupportText();
                TextResource textResourceM106569j = aVar.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i2 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: ud2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC34796e.m109853w(aVar, function1);
                                case 1:
                                    return AbstractC34796e.m109854x(aVar, function1);
                                default:
                                    return AbstractC34796e.m109855y(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM106571l = aVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i19 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: ud2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC34796e.m109853w(aVar, function1);
                                case 1:
                                    return AbstractC34796e.m109854x(aVar, function1);
                                default:
                                    return AbstractC34796e.m109855y(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i24 = 196608 | AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M106573n, textResourceM106572m, null, textResourceM106569j, interfaceC4339a, true, false, textResourceM106571l, interfaceC4339a2, null, false, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                InterfaceC33715f interfaceC33715fM106567h = aVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new a(aVar, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC33715fM106567h);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(aVar, function2, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m109853w(InterfaceC33718i.a aVar, Function1 function1) {
        InterfaceC33715f interfaceC33715fM106567h = aVar.getFollowUpEvent();
        if (interfaceC33715fM106567h != null) {
            function1.invoke(interfaceC33715fM106567h);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m109854x(InterfaceC33718i.a aVar, Function1 function1) {
        InterfaceC33715f interfaceC33715fM106568i = aVar.getPrimaryButtonClickEvent();
        if (interfaceC33715fM106568i != null) {
            function1.invoke(interfaceC33715fM106568i);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m109855y(InterfaceC33718i.a aVar, Function1 function1) {
        InterfaceC33715f interfaceC33715fM106570k = aVar.getSecondaryButtonClickEvent();
        if (interfaceC33715fM106570k != null) {
            function1.invoke(interfaceC33715fM106570k);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m109856z(InterfaceC33718i.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m109852v(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
