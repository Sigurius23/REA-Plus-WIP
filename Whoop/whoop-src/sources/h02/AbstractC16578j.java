package h02;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import ao2.C1877b;
import b02.C2197a;
import b02.C2200d;
import b02.InterfaceC2199c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import d30.C11558r;
import ge0.C15728c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import n81.AbstractC26452e;
import n81.C26453f;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15079m3;
import p178gz.C16283a;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
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
import p745y81.EnumC39333f;
import uz1.AbstractC35423a;
import uz1.EnumC35424b;
import v71.AbstractC35769j;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lb02/a;", "data", "Lao2/b;", "cartIndicator", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "k", "(Lb02/a;Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lny0/h;", "buttons", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "item", "s", "(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)V", "itemViewState", "r", "(Lm91/u;)Landroidx/compose/ui/Modifier;", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16578j {

    /* JADX INFO: renamed from: h02.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f63812w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f63813x;

        /* JADX INFO: renamed from: h02.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41679a implements Function3 {

            /* JADX INFO: renamed from: w */
            public static final C41679a f63814w = new C41679a();

            /* JADX INFO: renamed from: a */
            public final Modifier m47022a(InterfaceC25312u it, Composer composer, int i13) {
                AbstractC22676k.m65750j(it, "it");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1512327371);
                Modifier modifierM47019r = AbstractC16578j.m47019r(it);
                c28655q.m87173q(false);
                return modifierM47019r;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m47022a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX INFO: renamed from: h02.j$a$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC25312u f63815w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f63816x;

            public b(InterfaceC25312u interfaceC25312u, Function1 function1) {
                this.f63815w = interfaceC25312u;
                this.f63816x = function1;
            }

            /* JADX INFO: renamed from: a */
            public final void m47023a(Object event) {
                AbstractC22676k.m65750j(event, "event");
                AbstractC16578j.m47020s(event, this.f63815w, this.f63816x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m47023a(obj);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC25312u interfaceC25312u, Function1 function1) {
            this.f63812w = interfaceC25312u;
            this.f63813x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m47021a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            C25307p c25307pM46942b = AbstractC16568e.m46942b();
            InterfaceC25312u interfaceC25312u = this.f63812w;
            C41679a c41679a = C41679a.f63814w;
            boolean zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f63813x);
            InterfaceC25312u interfaceC25312u2 = this.f63812w;
            Function1 function1 = this.f63813x;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new b(interfaceC25312u2, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM46942b, c41679a, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m47021a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h02.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f63817w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h02.j$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f63818w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f63819x;

        public c(Function1 function1, List list) {
            this.f63818w = function1;
            this.f63819x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m47025a(int i13) {
            return this.f63818w.invoke(this.f63819x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m47025a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h02.j$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f63820w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f63821x;

        public d(List list, Function1 function1) {
            this.f63820w = list;
            this.f63821x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m47026a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f63820w.get(i13);
            c28655q.m87150e0(-248791014);
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC16568e.m46942b()), AbstractC37817c.m121344e(-1183141317, c28655q, new a(interfaceC25312u, this.f63821x)), c28655q, 56);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m47026a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m47009h(List<C27256h> list, CartAddIntent cartAddIntent, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(673856071);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(cartAddIntent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 8;
            float f14 = f13 * 1.5f;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2.5f * f13, 0.0f, 2), 0.0f, 2 * f13, 0.0f, f14, 5);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1929707547);
            for (C27256h c27256h : list) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(c27256h) | c28655q.m87157i(cartAddIntent);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C11558r(function1, c27256h, cartAddIntent, 22);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27249e.m82121d(layoutWeightElement, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, C27256h.f109055z << 3, 4);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(list, cartAddIntent, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47010i(Function1 function1, C27256h c27256h, CartAddIntent cartAddIntent) {
        function1.invoke(new InterfaceC2199c.f(c27256h.getDestination(), cartAddIntent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47011j(List list, CartAddIntent cartAddIntent, Function1 function1, int i13, Composer composer, int i14) {
        m47009h(list, cartAddIntent, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0209  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x0256  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m47012k(C2197a data, C1877b cartIndicator, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C2197a c2197a;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i16;
        boolean z13;
        Object objM87133R;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1890058219);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(data) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(cartIndicator) : c28655q.m87157i(cartIndicator) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C38072d c38072d = C38072d.f163053a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                modifier3 = modifier4;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                int i18 = i15;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                int iM46486a = c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward();
                String strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(data.getNavigationBarText());
                EnumC39333f enumC39333f = EnumC39333f.BRAND_BLACK;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, Integer.valueOf(iM46486a), strM21273g, null, null, null, null, false, AbstractC37817c.m121344e(-1135072139, c28655q, new C16572g(cartIndicator, onViewEvent, 0)), null, enumC39333f, enumC39333f, null, null, null, 58866, null);
                i16 = i18 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C16283a(onViewEvent, 5);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f);
                float f13 = 8;
                C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f13, 7);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 1.5f);
                c2197a = data;
                boolean zM87157i = c28655q.m87157i(c2197a);
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i | z15;
                objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C16574h(0, c2197a, onViewEvent);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24960, 490);
                c28655q = c28655q;
                if (c2197a.m6949c().isEmpty()) {
                    c28655q.m87150e0(1444936859);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1444735049);
                    m47009h(c2197a.m6949c(), c2197a.getAddIntent(), onViewEvent, c28655q, i16);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c2197a = data;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(c2197a, cartIndicator, onViewEvent, modifier3, i13, i14, 7);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
            C38072d c38072d2 = C38072d.f163053a;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3409f3, c38072d2.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
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
            Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
            modifier3 = modifier4;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int i19 = i15;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66723l2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            int iM46486a2 = c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward();
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(data.getNavigationBarText());
            EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l2, null, Integer.valueOf(iM46486a2), strM21273g2, null, null, null, null, false, AbstractC37817c.m121344e(-1135072139, c28655q, new C16572g(cartIndicator, onViewEvent, 0)), null, enumC39333f2, enumC39333f2, null, null, null, 58866, null);
            i16 = i19 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C16283a(onViewEvent, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C16283a(onViewEvent, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f4, true, 1.0f);
            float f14 = 8;
            C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f14, 7);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14 * 1.5f);
            c2197a = data;
            boolean zM87157i2 = c28655q.m87157i(c2197a);
            if (i16 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i2 | z15;
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                objM87133R2 = new C16574h(0, c2197a, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C16574h(0, c2197a, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM31988g2, null, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R2, c28655q, 24960, 490);
            c28655q = c28655q;
            if (c2197a.m6949c().isEmpty()) {
                c28655q.m87150e0(1444735049);
                m47009h(c2197a.m6949c(), c2197a.getAddIntent(), onViewEvent, c28655q, i16);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1444936859);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c2197a = data;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(c2197a, cartIndicator, onViewEvent, modifier3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47013l(C1877b c1877b, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            int iM5656b = c1877b.getCount();
            C9598e c9598eM5657c = c1877b.getDestination();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35423a.m112398c(iM5656b, c9598eM5657c, (Function1) objM87133R, null, EnumC35424b.LIGHT, c28655q, (C9598e.f28134d << 3) | 24576, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47014m(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC2199c.e((C9598e) it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47015n(Function1 function1) {
        function1.invoke(InterfaceC2199c.b.f8745a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47016o(C2197a c2197a, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = c2197a.m6952f().iterator();
        while (it.hasNext()) {
            List<InterfaceC25312u> listM6999c = ((C2200d) it.next()).m6999c();
            b bVar = b.f63817w;
            ((C26053f) LazyColumn).m77529r(listM6999c.size(), null, new c(bVar, listM6999c), new C37816b(new d(listM6999c, function1), true, 802480018));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m47017p(C2197a c2197a, C1877b c1877b, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47012k(c2197a, c1877b, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m47019r(InterfaceC25312u interfaceC25312u) {
        boolean z4 = interfaceC25312u instanceof C16565c0;
        C2314t c2314t = C2314t.f9131w;
        if (z4) {
            return c2314t;
        }
        if (interfaceC25312u instanceof C16600x) {
            float f13 = 8;
            float f14 = 2 * f13;
            return AbstractC1099a.m3397s(c2314t, f14, f14, f14, 1 * f13);
        }
        if (!(interfaceC25312u instanceof C16564c)) {
            return interfaceC25312u instanceof C26453f ? c2314t : AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2);
        }
        float f15 = 2 * 8;
        return AbstractC1099a.m3398t(c2314t, f15, f15, f15, 0.0f, 8);
    }

    /* JADX INFO: renamed from: s */
    public static final void m47020s(Object event, InterfaceC25312u item, Function1 onViewEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        if (event instanceof C16579j0) {
            C16579j0 c16579j0 = (C16579j0) event;
            onViewEvent.invoke(new InterfaceC2199c.k(c16579j0.getLevel(), c16579j0.getOptionKey(), c16579j0.getVariantSelectorIndex(), c16579j0.getPackItemId(), c16579j0.getPackItemProductKey()));
            return;
        }
        if (event instanceof C16566d) {
            onViewEvent.invoke(((C16566d) event).getDestination());
            return;
        }
        if (event instanceof AbstractC26452e.b) {
            onViewEvent.invoke(new InterfaceC2199c.l(((AbstractC26452e.b) event).getTag()));
            return;
        }
        if (event instanceof AbstractC26452e.a) {
            m47020s(((AbstractC26452e.a) event).getAny(), item, onViewEvent);
            return;
        }
        if (event instanceof AbstractC35769j.a) {
            m47020s(((AbstractC35769j.a) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), item, onViewEvent);
            return;
        }
        if (!(event instanceof DesignItemInteraction)) {
            onViewEvent.invoke(new InterfaceC2199c.h(event, item));
            return;
        }
        Object actionArgument = ((DesignItemInteraction) event).getActionArgument();
        if (actionArgument instanceof AbstractC26452e.b) {
            onViewEvent.invoke(new InterfaceC2199c.l(((AbstractC26452e.b) actionArgument).getTag()));
        } else {
            onViewEvent.invoke(new InterfaceC2199c.h(event, item));
        }
    }
}
