package yn2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import cp0.C10999t0;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hy0.C17736e;
import io2.C20762h;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import ln2.AbstractC24541a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import v41.C35658c;
import vv2.C36538d;
import wb3.AbstractC37056f;
import wn2.AbstractC37428f;
import wn2.C37429g;
import wn2.InterfaceC37427e;
import wn2.InterfaceC37431i;
import wr0.C37526f;
import wr0.C37550r;
import x30.C37900j1;
import x81.C38072d;
import xn2.AbstractC38483b;
import xn2.AbstractC38487f;
import y71.C39274g;
import y71.C39282o;
import yb0.C39382e;
import yk2.C39609i;

/* JADX INFO: renamed from: yn2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lwn2/i;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onViewEvent", "m", "(Lwn2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "t", "(Lwn2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "k", "(Landroidx/compose/runtime/Composer;I)V", "Lt0/i;", "a", "Lt0/i;", "BUY_NOW_SHEET_SHAPE", "Lwn2/i$c;", "b", "Lwn2/i$c;", "getBuyNowLoadedPreviewViewState", "()Lwn2/i$c;", "buyNowLoadedPreviewViewState", "", "isDismissible", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39675b {

    /* JADX INFO: renamed from: a */
    private static final C33252i f170784a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC37431i.c f170785b;

    /* JADX INFO: renamed from: yn2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f170786w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: yn2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170787w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f170788x;

        public b(Function1 function1, List list) {
            this.f170787w = function1;
            this.f170788x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m126902a(int i13) {
            return this.f170787w.invoke(this.f170788x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m126902a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yn2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f170789w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f170790x;

        public c(List list, Function1 function1) {
            this.f170789w = list;
            this.f170790x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m126903a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f170789w.get(i13);
            c28655q.m87150e0(-709308374);
            AbstractC25303l.m74291r(interfaceC25312u, AbstractC37428f.m119821c(), null, this.f170790x, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m126903a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f13 = 4;
        float f14 = f13 * f13;
        f170784a = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
        C37429g c37429g = new C37429g("BUY_NOW_ITEMS", "COMPACT", AbstractC37056f.m118958J(AbstractC38487f.m123315d()));
        C37429g c37429g2 = new C37429g("divider_1", "COMPACT", AbstractC37056f.m118958J(new C17736e(null, null, null, 7, null)));
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("ADD A NEW SHIPPING ADDRESS");
        int i13 = 2;
        C39274g c39274g = new C39274g(EnumC16313m0.LOCATION_PIN.toWhoopIcon(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_RIGHT;
        f170785b = new InterfaceC37431i.c("Buy Now", AbstractC37056f.m118959K(c37429g, c37429g2, new C37429g("menu_items", "COMPACT", AbstractC37056f.m118959K(C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, null, null, c39274g, null, new C39274g(enumC16313m0.toWhoopIcon(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388446, null), C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l("****4242"), null, null, AbstractC8693b.m21278l("Payment details"), null, new C39274g(EnumC16313m0.CREDIT_CARD.toWhoopIcon(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, new C39274g(enumC16313m0.toWhoopIcon(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388438, null))), new C37429g("divider_2", "COMPACT", AbstractC37056f.m118958J(new C17736e(null, null, 0 == true ? 1 : 0, 7, null))), new C37429g("BUY_NOW_CHECKOUT_INFO", "LARGE", AbstractC37056f.m118958J(AbstractC38483b.m123303f()))), AbstractC37056f.m118958J(new C20762h(AbstractC8693b.m21278l("By placing an order, you agree to the [WHOOP Terms of Sale](https://www.whoop.com/termsofuse)."), AbstractC8693b.m21278l("PLACE ORDER"), "/commerce-service/v2/mobile/payments/buy-now", "cart-123", true, false)), "$49.00", new C9598e(AppScreen.C9321h1.f27641w, null, null, 6, null), "card_123");
    }

    /* JADX INFO: renamed from: k */
    private static final void m126887k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1382454383);
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
            c28677v1M87180u.f115982d = new C35658c(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126888l(int i13, Composer composer, int i14) {
        m126887k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: m */
    public static final void m126889m(final InterfaceC37431i viewState, final InterfaceC4339a onDismiss, final Function1 onViewEvent, Composer composer, final int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1393466298);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            if ((viewState instanceof InterfaceC37431i.d) || (viewState instanceof InterfaceC37431i.a)) {
                c28655q.m87150e0(1895786988);
                AbstractC39677d.m126905b(null, c28655q, 0, 1);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i15 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: yn2.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i15) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC39675b.m126890n(viewState, onDismiss, onViewEvent, i13, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC39675b.m126895s(viewState, onDismiss, onViewEvent, i13, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                c28655q.m87150e0(1895844648);
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(((viewState instanceof InterfaceC37431i.f) || (viewState instanceof InterfaceC37431i.e)) ? false : true), c28655q);
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C10999t0(onDismiss, interfaceC28601c1M87238F, 7);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C39382e(6, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R2);
                }
                C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, (Function1) objM87133R2, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                AbstractC23141n2.m67119a(interfaceC4339a, null, c23196w3M67125g, 0.0f, false, null, c38072d.m121949b(c28655q, i16).getBackgroundDarkStd(), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0.0f, c38072d.m121949b(c28655q, i16).getBlack70(), null, null, null, AbstractC37817c.m121344e(1810237336, c28655q, new C36538d(13, viewState, onViewEvent)), c28655q, 0, 3078, 6458);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i17 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: yn2.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC39675b.m126890n(viewState, onDismiss, onViewEvent, i13, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC39675b.m126895s(viewState, onDismiss, onViewEvent, i13, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m126890n(InterfaceC37431i interfaceC37431i, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m126889m(interfaceC37431i, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m126891o(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m126892p(InterfaceC4339a interfaceC4339a, InterfaceC28670t2 interfaceC28670t2) {
        if (m126891o(interfaceC28670t2)) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m126893q(InterfaceC28670t2 interfaceC28670t2, EnumC23202x3 it) {
        AbstractC22676k.m65750j(it, "it");
        return it != EnumC23202x3.f91820w || m126891o(interfaceC28670t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m126894r(InterfaceC37431i interfaceC37431i, Function1 function1, InterfaceC23013y ModalBottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(ModalBottomSheet, "$this$ModalBottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m126896t(interfaceC37431i, function1, null, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m126895s(InterfaceC37431i interfaceC37431i, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m126889m(interfaceC37431i, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:112:0x0286  */
    /* JADX WARN: Code duplicated, block: B:116:0x0290  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:129:0x0321  */
    /* JADX WARN: Code duplicated, block: B:131:0x0325  */
    /* JADX WARN: Code duplicated, block: B:132:0x0362  */
    /* JADX WARN: Code duplicated, block: B:141:0x0386  */
    /* JADX WARN: Code duplicated, block: B:144:0x0393  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef A[LOOP:0: B:81:0x01e9->B:83:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x0227  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final void m126896t(InterfaceC37431i viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Function1 function1;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        List list;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int i16;
        String strM119831c;
        TextResource c8688b;
        String strM119829a;
        TextResource textResourceM21267a;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        int i18;
        boolean z18;
        InterfaceC37431i interfaceC37431i;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R3;
        Iterator<T> it;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-422457602);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                list = null;
                objArr7 = 0;
                objArr6 = 0;
                objArr5 = 0;
                objArr4 = 0;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), f170784a), AbstractC15673b0.m44030c0(), null, 0.0f, 6));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
                m126887k(c28655q, 0);
                z13 = viewState instanceof InterfaceC37431i.c;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-1831784282);
                    InterfaceC37431i.c cVar = (InterfaceC37431i.c) viewState;
                    String strM119836e = cVar.getTitle();
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    float f13 = 8 * 2;
                    modifier3 = modifier4;
                    i18 = i15;
                    AbstractC30795n.m94707h(strM119836e, AbstractC1099a.m3395q(c2314t, f13, f13), c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    if (1.0f > 0.0d) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                    C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f13, 0.0f, 2);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                    if ((i18 & 14) != 4) {
                        if ((i18 & 8) != 0) {
                            interfaceC37431i = viewState;
                            if (c28655q.m87157i(interfaceC37431i)) {
                            }
                            if ((i18 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC22674j.m65717c(layoutWeightElement, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                            it = cVar.m119833b().iterator();
                            while (it.hasNext()) {
                                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                            }
                            function1 = onViewEvent;
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC37431i = viewState;
                        }
                        z19 = false;
                        if ((i18 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22674j.m65717c(layoutWeightElement, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                        it = cVar.m119833b().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                        }
                        function1 = onViewEvent;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC37431i = viewState;
                    }
                    z19 = true;
                    if ((i18 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R3 = c28655q.m87133R();
                    if (z25) {
                        objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22674j.m65717c(layoutWeightElement, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                    it = cVar.m119833b().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                    }
                    function1 = onViewEvent;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    i16 = i15;
                    modifier3 = modifier4;
                    function1 = onViewEvent;
                    if (viewState instanceof InterfaceC37431i.b) {
                        c28655q.m87150e0(-1830699840);
                        InterfaceC37431i.b bVar = (InterfaceC37431i.b) viewState;
                        strM119831c = bVar.getTitle();
                        if (strM119831c != null || (c8688b = AbstractC8693b.m21278l(strM119831c)) == null) {
                            c8688b = new TextResource.C8688b(AbstractC35283c.f150170H, objArr4 == true ? 1 : 0, 2, objArr5 == true ? 1 : 0);
                        }
                        AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(c8688b, false, null, 6, null);
                        strM119829a = bVar.getMessage();
                        if (strM119829a != null || (textResourceM21267a = AbstractC8693b.m21278l(strM119829a)) == null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, list, 2, objArr == true ? 1 : 0);
                        i17 = i16 & 112;
                        if (i17 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z16 || objM87133R == c28676v0) {
                            objM87133R = new C37550r(function1, viewState, 28);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC16277f.f62253K, objArr2 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
                        if (i17 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C39609i(function1, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i25 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                        int i26 = TextResource.C8688b.f25889c;
                        AbstractC33199m0.m105214F(bVar2, textResourceM21267a, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, true, false, c28655q, i25 | (i26 << 9) | (i26 << 21), 6, 2628);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(InterfaceC37431i.f.f160239a)) {
                        c28655q.m87150e0(-474673947);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof InterfaceC37431i.e) {
                        c28655q.m87150e0(-474666739);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC24541a.f95774f, objArr6 == true ? 1 : 0, 2, objArr7 == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(InterfaceC37431i.d.f160237a) && !(viewState instanceof InterfaceC37431i.a)) {
                            throw AbstractC11895b.m32003v(-474732370, c28655q, false);
                        }
                        c28655q.m87150e0(-474657608);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
            } else {
                function1 = onViewEvent;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(viewState, function1, modifier3, i13, i14, 27);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            list = null;
            objArr7 = 0;
            objArr6 = 0;
            objArr5 = 0;
            objArr4 = 0;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), f170784a), AbstractC15673b0.m44030c0(), null, 0.0f, 6));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
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
            m126887k(c28655q, 0);
            z13 = viewState instanceof InterfaceC37431i.c;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(-1831784282);
                InterfaceC37431i.c cVar2 = (InterfaceC37431i.c) viewState;
                String strM119836e2 = cVar2.getTitle();
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                float f14 = 8 * 2;
                modifier3 = modifier4;
                i18 = i15;
                AbstractC30795n.m94707h(strM119836e2, AbstractC1099a.m3395q(c2314t, f14, f14), c38072d2.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                if (1.0f > 0.0d) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, false);
                C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(f14, 0.0f, 2);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                if ((i18 & 14) != 4) {
                    if ((i18 & 8) != 0) {
                        interfaceC37431i = viewState;
                        if (c28655q.m87157i(interfaceC37431i)) {
                        }
                        if ((i18 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22674j.m65717c(layoutWeightElement2, null, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                        it = cVar2.m119833b().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                        }
                        function1 = onViewEvent;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC37431i = viewState;
                    }
                    z19 = false;
                    if ((i18 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R3 = c28655q.m87133R();
                    if (z25) {
                        objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22674j.m65717c(layoutWeightElement2, null, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                    it = cVar2.m119833b().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                    }
                    function1 = onViewEvent;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    interfaceC37431i = viewState;
                }
                z19 = true;
                if ((i18 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19;
                objM87133R3 = c28655q.m87133R();
                if (z25) {
                    objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37900j1(13, interfaceC37431i, onViewEvent);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22674j.m65717c(layoutWeightElement2, null, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 490);
                it = cVar2.m119833b().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC37428f.m119821c(), null, onViewEvent, c28655q, (C25307p.f99300b << 3) | ((i18 << 6) & 7168), 4);
                }
                function1 = onViewEvent;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                i16 = i15;
                modifier3 = modifier4;
                function1 = onViewEvent;
                if (viewState instanceof InterfaceC37431i.b) {
                    c28655q.m87150e0(-1830699840);
                    InterfaceC37431i.b bVar3 = (InterfaceC37431i.b) viewState;
                    strM119831c = bVar3.getTitle();
                    if (strM119831c != null) {
                        c8688b = new TextResource.C8688b(AbstractC35283c.f150170H, objArr4 == true ? 1 : 0, 2, objArr5 == true ? 1 : 0);
                    } else {
                        c8688b = new TextResource.C8688b(AbstractC35283c.f150170H, objArr4 == true ? 1 : 0, 2, objArr5 == true ? 1 : 0);
                    }
                    AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(c8688b, false, null, 6, null);
                    strM119829a = bVar3.getMessage();
                    if (strM119829a != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150176N, list, 2, objArr == true ? 1 : 0);
                    i17 = i16 & 112;
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i16 & 14) != 4) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z15 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C37550r(function1, viewState, 28);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37550r(function1, viewState, 28);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC16277f.f62253K, objArr2 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
                    if (i17 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C39609i(function1, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function1, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i28 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                    int i29 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar4, textResourceM21267a, null, c8688b4, interfaceC4339a2, true, false, c8688b5, (InterfaceC4339a) objM87133R2, null, true, false, c28655q, i28 | (i29 << 9) | (i29 << 21), 6, 2628);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState.equals(InterfaceC37431i.f.f160239a)) {
                    c28655q.m87150e0(-474673947);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof InterfaceC37431i.e) {
                    c28655q.m87150e0(-474666739);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC24541a.f95774f, objArr6 == true ? 1 : 0, 2, objArr7 == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState.equals(InterfaceC37431i.d.f160237a)) {
                    }
                    c28655q.m87150e0(-474657608);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(viewState, function1, modifier3, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m126897u(InterfaceC37431i interfaceC37431i, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = ((InterfaceC37431i.c) interfaceC37431i).m119835d().iterator();
        while (it.hasNext()) {
            List<InterfaceC25312u> listM119822a = ((C37429g) it.next()).m119822a();
            a aVar = a.f170786w;
            ((C26053f) LazyColumn).m77529r(listM119822a.size(), null, new b(aVar, listM119822a), new C37816b(new c(listM119822a, function1), true, 802480018));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m126898v(Function1 function1, InterfaceC37431i interfaceC37431i) {
        function1.invoke(((InterfaceC37431i.b) interfaceC37431i).getRetry());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m126899w(Function1 function1) {
        function1.invoke(InterfaceC37427e.a.f160177a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m126900x(InterfaceC37431i interfaceC37431i, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m126896t(interfaceC37431i, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
