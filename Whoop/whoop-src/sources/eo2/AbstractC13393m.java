package eo2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9790n;
import com.whoop.profile.view.edit.preview.C9809a;
import cy1.C11186b;
import e11.C12582b;
import fo2.C14666d;
import fo2.C14670h;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io2.C20768k;
import j02.C21166s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33167b1;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: eo2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006&"}, m65681d2 = {"Leo2/g;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onViewEvent", "o", "(Leo2/g;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "r", "(Leo2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "i", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "k", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lm91/u;)Lm91/u;", "", "buttons", "m", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lt0/i;", "a", "Lt0/i;", "CART_SHEET_SHAPE", "b", "Leo2/g;", "previewSingleItemViewState", "c", "previewEmptyViewState", "d", "previewErrorViewState", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13393m {

    /* JADX INFO: renamed from: a */
    private static final C33252i f46907a;

    /* JADX INFO: renamed from: b */
    private static final C13387g f46908b;

    /* JADX INFO: renamed from: c */
    private static final C13387g f46909c;

    /* JADX INFO: renamed from: d */
    private static final C13387g f46910d;

    /* JADX INFO: renamed from: eo2.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f46911w;

        public a(Modifier modifier) {
            this.f46911w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final Modifier m37819a(InterfaceC25312u it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(456466193);
            Modifier modifier = this.f46911w;
            c28655q.m87173q(false);
            return modifier;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m37819a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: eo2.m$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f46912w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: eo2.m$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f46913w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f46914x;

        public c(Function1 function1, List list) {
            this.f46913w = function1;
            this.f46914x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m37821a(int i13) {
            return this.f46913w.invoke(this.f46914x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m37821a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: eo2.m$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f46915w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f46916x;

        public d(List list, Function1 function1) {
            this.f46915w = list;
            this.f46916x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m37822a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f46915w.get(i13);
            c28655q.m87150e0(1319328776);
            InterfaceC25312u interfaceC25312uM37818w = AbstractC13393m.m37818w(interfaceC25312u);
            boolean z4 = interfaceC25312uM37818w instanceof C20768k;
            Modifier modifierM3396r = C2314t.f9131w;
            if (z4 || (interfaceC25312uM37818w instanceof C33167b1)) {
                modifierM3396r = AbstractC1099a.m3396r(modifierM3396r, 2 * 8, 0.0f, 2);
            }
            AbstractC25303l.m74291r(interfaceC25312uM37818w, AbstractC13384d.m37782c(), new a(modifierM3396r), this.f46916x, c28655q, C25307p.f99300b << 3, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m37822a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f13 = 4;
        float f14 = f13 * f13;
        f46907a = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
        List listM118958J = AbstractC37056f.m118958J(new C13385e("items", "ITEMS", AbstractC37056f.m118958J(new C14666d(AbstractC8693b.m21278l("MG SportFlex Band"), AbstractC8693b.m21278l("CR7 Away"), null, null, AbstractC8693b.m21278l("$49"), AbstractC8693b.m21278l("$59"), 2, 0, 10, false, false, "line-1", null, false, 13960, null))));
        boolean z4 = false;
        boolean z13 = false;
        AbstractC18247a abstractC18247a = null;
        C21166s c21166s = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        f46908b = new C13387g(z14, z15, new C13381a("Cart", listM118958J, AbstractC37056f.m118959K(new C27256h(AbstractC8693b.m21278l("CHECKOUT"), objArr, null, null, null, null, EnumC27272p.HIGHLIGHT, null, null, null, objArr2, null, null, false, z4, null, false, z13, null, abstractC18247a, c21166s, null, null, null, null, 33554366, null), new C27256h(AbstractC8693b.m21278l("KEEP SHOPPING"), objArr4, objArr5, objArr6, objArr7, null, EnumC27272p.TRANSPARENT_BACKGROUND, objArr8, objArr9, objArr3, objArr10, objArr11, null, z4, false, null, z13, false, abstractC18247a, c21166s, objArr12, objArr13, objArr14, objArr15, null, 33554366, null)), null, null, 24, 0 == true ? 1 : 0), z16, objArr17, objArr18, 59, objArr16);
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        boolean z17 = false;
        Object[] objArr22 = 0 == true ? 1 : 0;
        f46909c = new C13387g(false, z17, new C13381a("Cart", AbstractC37056f.m118958J(new C13385e("empty", "EMPTY", AbstractC37056f.m118958J(new C14670h(EnumC16313m0.SHOPPING_CART, AbstractC8693b.m21278l("Your cart is empty"))))), objArr20, objArr21, null, 28, objArr19), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 59, objArr22);
        Object[] objArr23 = 0 == true ? 1 : 0;
        f46910d = new C13387g(z17, true, null, false, 0 == true ? 1 : 0, null, 61, objArr23);
    }

    /* JADX INFO: renamed from: i */
    private static final void m37804i(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-187245014);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 8 * 1.5f, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(AbstractC16272a.f62068e, c28655q, 6), null, null, null, c28655q, 48, 124);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37805j(int i13, Composer composer, int i14) {
        m37804i(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private static final void m37806k(String str, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1580390469);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                float f13 = 2 * 8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3395q(modifier3, f13, f13), c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getT3(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196600);
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13392l(str, modifier2, i13, i14, 0);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            float f14 = 2 * 8;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, AbstractC1099a.m3395q(modifier3, f14, f14), c38072d2.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i18).getT3(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196600);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13392l(str, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37807l(String str, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m37806k(str, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m37808m(List<? extends InterfaceC25312u> list, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-510670347);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f14, 0.0f, 2), 0.0f, 1 * f13, 0.0f, f14, 5);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, 1.5f, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1592488818);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r(m37818w((InterfaceC25312u) it.next()), AbstractC13384d.m37782c(), null, function1, c28655q, ((i15 << 6) & 7168) | (C25307p.f99300b << 3), 4);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13391k(i13, 0, list, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m37809n(List list, Function1 function1, int i13, Composer composer, int i14) {
        m37808m(list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m37810o(C13387g viewState, InterfaceC4339a onDismiss, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1240214277);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onDismiss) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC23141n2.m67119a(onDismiss, null, c23196w3M67125g, 0.0f, false, null, c38072d.m121949b(c28655q2, i15).getBackgroundDarkStd(), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0.0f, c38072d.m121949b(c28655q2, i15).getBlack70(), null, null, null, AbstractC37817c.m121344e(1656985315, c28655q2, new C22931l(18, viewState, onViewEvent)), c28655q, (i14 >> 3) & 14, 3078, 6458);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 7, viewState, onDismiss, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m37811p(C13387g c13387g, Function1 function1, InterfaceC23013y ModalBottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(ModalBottomSheet, "$this$ModalBottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m37813r(c13387g, function1, null, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m37812q(C13387g c13387g, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m37810o(c13387g, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0296  */
    /* JADX WARN: Code duplicated, block: B:106:0x029f  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x0300  */
    /* JADX WARN: Code duplicated, block: B:121:0x0313  */
    /* JADX WARN: Code duplicated, block: B:124:0x0322  */
    /* JADX WARN: Code duplicated, block: B:126:0x032b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0358  */
    /* JADX WARN: Code duplicated, block: B:135:0x036c  */
    /* JADX WARN: Code duplicated, block: B:136:0x036e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0377  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x03df  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[LOOP:1: B:60:0x012a->B:152:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105 A[LOOP:0: B:51:0x00ff->B:53:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x020f  */
    /* JADX WARN: Code duplicated, block: B:94:0x022b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0247 A[LOOP:3: B:95:0x0241->B:97:0x0247, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final void m37813r(C13387g viewState, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C13381a c13381aM37789a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        String strM37791c;
        TextResource textResourceM21267a;
        boolean z13;
        Object objM87133R;
        ArrayList arrayList;
        Iterator<T> it;
        float f13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int i16;
        boolean z16;
        C13381a c13381a;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode3;
        Iterator<T> it3;
        Iterator it4;
        Function1 onViewEvent = function1;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(331730729);
        int i17 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i17 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i15 = i17;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c13381aM37789a = viewState.getData();
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3406c(0.8f, AbstractC1102d.m3409f(1.0f, modifier4)), f46907a), AbstractC15673b0.m44030c0(), null, 0.0f, 6);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3357b);
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
                m37804i(c28655q, 0);
                C28676v0 c28676v0 = C28635l.f115821a;
                if (c13381aM37789a != null) {
                    c28655q.m87150e0(-781114146);
                    List<C13385e> listM37744c = c13381aM37789a.m37744c();
                    arrayList = new ArrayList();
                    it = listM37744c.iterator();
                    while (it.hasNext()) {
                        AbstractC25265s.m74141p0(arrayList, ((C13385e) it.next()).m37783a());
                    }
                    if (arrayList.isEmpty()) {
                        c28655q.m87150e0(-779899566);
                        m37806k(c13381aM37789a.getTitle(), null, c28655q, 0, 2);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        Modifier modifierMo3471e = modifierM3409f.mo3471e(new LayoutWeightElement(f13, true));
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(8 * 1.5f);
                        boolean zM87157i = c28655q.m87157i(c13381aM37789a);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z15 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                            c28655q.m87172p0(objM87133R2);
                        }
                        i16 = i15;
                        z16 = false;
                        c13381a = c13381aM37789a;
                        modifier5 = modifier4;
                        AbstractC22674j.m65717c(modifierMo3471e, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
                        c28655q.m87173q(false);
                    } else {
                        if (!arrayList.isEmpty()) {
                            it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (!(((InterfaceC25312u) it4.next()) instanceof C14670h)) {
                                        c28655q.m87150e0(-779899566);
                                        m37806k(c13381aM37789a.getTitle(), null, c28655q, 0, 2);
                                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                                        if (1.0f <= 0.0d) {
                                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                        }
                                        if (1.0f > Float.MAX_VALUE) {
                                            f13 = Float.MAX_VALUE;
                                        } else {
                                            f13 = 1.0f;
                                        }
                                        Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(new LayoutWeightElement(f13, true));
                                        C22971k c22971kM66746i2 = AbstractC22977m.m66746i(8 * 1.5f);
                                        boolean zM87157i2 = c28655q.m87157i(c13381aM37789a);
                                        if ((i15 & 112) == 32) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z15 = zM87157i2 | z14;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        i16 = i15;
                                        z16 = false;
                                        c13381a = c13381aM37789a;
                                        modifier5 = modifier4;
                                        AbstractC22674j.m65717c(modifierMo3471e2, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
                                        c28655q.m87173q(false);
                                    }
                                }
                            }
                        }
                        c28655q.m87150e0(-780952822);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierMo3471e3 = modifierM3409f3.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                        C2307m c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i3 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
                        C0209i c0209i4 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                        String strM37745d = c13381aM37789a.getTitle();
                        C1100b c1100b = C1100b.f4583a;
                        m37806k(strM37745d, c1100b.mo3400a(c2314t, c2307m), c28655q, 0, 0);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, C2299e.f9102E));
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                        c28655q.m87150e0(-906053586);
                        for (C13385e c13385e : c13381aM37789a.m37744c()) {
                            c28655q.m87150e0(-906051539);
                            it3 = c13385e.m37783a().iterator();
                            while (it3.hasNext()) {
                                AbstractC25303l.m74291r(m37818w((InterfaceC25312u) it3.next()), AbstractC13384d.m37782c(), null, function1, c28655q, (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
                                onViewEvent = function1;
                            }
                            c28655q.m87173q(false);
                        }
                        AbstractC2875y.m8286B(c28655q, false, true, true, false);
                        z16 = false;
                        modifier5 = modifier4;
                        c13381a = c13381aM37789a;
                        i16 = i15;
                    }
                    if (c13381a.m37743b().isEmpty()) {
                        c28655q.m87150e0(-778447805);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(-778622707);
                        m37808m(c13381a.m37743b(), onViewEvent, c28655q, i16 & 112);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z16);
                } else {
                    modifier5 = modifier4;
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(-778369096);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        strM37791c = viewState.getErrorSupportText();
                        if (strM37791c != null || (textResourceM21267a = AbstractC8693b.m21278l(strM37791c)) == null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        TextResource textResource = textResourceM21267a;
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150176N, null, 2, 0 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C13390j(onViewEvent, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC33199m0.m105214F(bVar, textResource, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 6, 3044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-777917054);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(viewState, onViewEvent, modifier3, i13, i14);
            }
        }
        i17 |= 384;
        modifier2 = modifier;
        i15 = i17;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c13381aM37789a = viewState.getData();
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3406c(0.8f, AbstractC1102d.m3409f(1.0f, modifier4)), f46907a), AbstractC15673b0.m44030c0(), null, 0.0f, 6);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3357b2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            m37804i(c28655q, 0);
            C28676v0 c28676v1 = C28635l.f115821a;
            if (c13381aM37789a != null) {
                c28655q.m87150e0(-781114146);
                List<C13385e> listM37744c2 = c13381aM37789a.m37744c();
                arrayList = new ArrayList();
                it = listM37744c2.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList, ((C13385e) it.next()).m37783a());
                }
                if (arrayList.isEmpty()) {
                    c28655q.m87150e0(-779899566);
                    m37806k(c13381aM37789a.getTitle(), null, c28655q, 0, 2);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierMo3471e4 = modifierM3409f5.mo3471e(new LayoutWeightElement(f13, true));
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(8 * 1.5f);
                    boolean zM87157i3 = c28655q.m87157i(c13381aM37789a);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i3 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i16 = i15;
                    z16 = false;
                    c13381a = c13381aM37789a;
                    modifier5 = modifier4;
                    AbstractC22674j.m65717c(modifierMo3471e4, null, null, c22971kM66746i3, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
                    c28655q.m87173q(false);
                } else {
                    if (!arrayList.isEmpty()) {
                        it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!(((InterfaceC25312u) it4.next()) instanceof C14670h)) {
                                    c28655q.m87150e0(-779899566);
                                    m37806k(c13381aM37789a.getTitle(), null, c28655q, 0, 2);
                                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    Modifier modifierMo3471e5 = modifierM3409f6.mo3471e(new LayoutWeightElement(f13, true));
                                    C22971k c22971kM66746i4 = AbstractC22977m.m66746i(8 * 1.5f);
                                    boolean zM87157i4 = c28655q.m87157i(c13381aM37789a);
                                    if ((i15 & 112) == 32) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = zM87157i4 | z14;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new C9790n(17, c13381aM37789a, onViewEvent);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    i16 = i15;
                                    z16 = false;
                                    c13381a = c13381aM37789a;
                                    modifier5 = modifier4;
                                    AbstractC22674j.m65717c(modifierMo3471e5, null, null, c22971kM66746i4, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
                                    c28655q.m87173q(false);
                                }
                            }
                        }
                    }
                    c28655q.m87150e0(-780952822);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierMo3471e6 = modifierM3409f7.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    C2307m c2307m2 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    String strM37745d2 = c13381aM37789a.getTitle();
                    C1100b c1100b2 = C1100b.f4583a;
                    m37806k(strM37745d2, c1100b2.mo3400a(c2314t, c2307m2), c28655q, 0, 0);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c1100b2.mo3400a(c2314t, C2299e.f9102E));
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                    c28655q.m87150e0(-906053586);
                    while (r0.hasNext()) {
                        c28655q.m87150e0(-906051539);
                        it3 = c13385e.m37783a().iterator();
                        while (it3.hasNext()) {
                            AbstractC25303l.m74291r(m37818w((InterfaceC25312u) it3.next()), AbstractC13384d.m37782c(), null, function1, c28655q, (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
                            onViewEvent = function1;
                        }
                        c28655q.m87173q(false);
                    }
                    AbstractC2875y.m8286B(c28655q, false, true, true, false);
                    z16 = false;
                    modifier5 = modifier4;
                    c13381a = c13381aM37789a;
                    i16 = i15;
                }
                if (c13381a.m37743b().isEmpty()) {
                    c28655q.m87150e0(-778622707);
                    m37808m(c13381a.m37743b(), onViewEvent, c28655q, i16 & 112);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(-778447805);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z16);
            } else {
                modifier5 = modifier4;
                if (viewState.getIsError()) {
                    c28655q.m87150e0(-778369096);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                    strM37791c = viewState.getErrorSupportText();
                    if (strM37791c != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource2 = textResourceM21267a;
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, null, 2, 0 == true ? 1 : 0);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C13390j(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C13390j(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC33199m0.m105214F(bVar2, textResource2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 6, 3044);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-777917054);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(viewState, onViewEvent, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m37814s(C13381a c13381a, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = c13381a.m37744c().iterator();
        while (it.hasNext()) {
            List<InterfaceC25312u> listM37783a = ((C13385e) it.next()).m37783a();
            b bVar = b.f46912w;
            ((C26053f) LazyColumn).m77529r(listM37783a.size(), null, new c(bVar, listM37783a), new C37816b(new d(listM37783a, function1), true, 802480018));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m37815t(Function1 function1) {
        function1.invoke(new InterfaceC13383c.e(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m37816u(C13387g c13387g, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m37813r(c13387g, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC25312u m37818w(InterfaceC25312u interfaceC25312u) {
        return interfaceC25312u instanceof C27256h ? C27256h.m82144b((C27256h) interfaceC25312u, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null) : interfaceC25312u;
    }
}
