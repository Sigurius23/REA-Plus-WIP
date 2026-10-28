package sx0;

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
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25267u;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15133r7;
import p163g1.C15187x1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p507tx.AbstractC34235f;
import p571w3.C36775k;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32618h3;
import q81.C30048f;
import qz0.AbstractC30795n;
import s01.C32049e;
import sg2.C32451b;
import sg2.C32458i;
import sg2.C32469t;
import so2.C32848f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sx0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsx0/f;", "viewState", "Lkotlin/Function1;", "Lsx0/b;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackClick", "i", "(Lsx0/f;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lsx0/d;", "item", "Lkotlin/Function2;", "", "", "onToggle", "q", "(Lsx0/d;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "o", "(Landroidx/compose/runtime/Composer;I)V", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33059a {

    /* JADX INFO: renamed from: sx0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f137852w;

        public a(Function1 function1) {
            this.f137852w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m104692a(String name, boolean z4) {
            AbstractC22676k.m65750j(name, "name");
            this.f137852w.invoke(new AbstractC33060b.c(name, z4));
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m104692a((String) obj, ((Boolean) obj2).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sx0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f137853w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C33062d c33062d) {
            return null;
        }
    }

    /* JADX INFO: renamed from: sx0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f137854w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f137855x;

        public c(Function1 function1, List list) {
            this.f137854w = function1;
            this.f137855x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m104694a(int i13) {
            return this.f137854w.invoke(this.f137855x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m104694a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: sx0.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f137856w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f137857x;

        public d(Function1 function1, List list) {
            this.f137856w = function1;
            this.f137857x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m104695a(int i13) {
            return this.f137856w.invoke(this.f137857x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m104695a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: sx0.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f137858w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f137859x;

        public e(List list, Function1 function1) {
            this.f137858w = list;
            this.f137859x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m104696a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C33062d c33062d = (C33062d) this.f137858w.get(i13);
            c28655q.m87150e0(973907294);
            boolean zM87153g = c28655q.m87153g(this.f137859x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f137859x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33059a.m104689q(c33062d, (InterfaceC4351m) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m104696a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0273  */
    /* JADX WARN: Code duplicated, block: B:78:0x027f  */
    /* JADX INFO: renamed from: i */
    public static final void m104681i(C33064f viewState, Function1 onViewEvent, InterfaceC4339a onBackClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28676v0 c28676v0;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1296453890);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onBackClick) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            List<C33062d> listM104713c = viewState.m104713c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104713c, 10));
            Iterator<T> it = listM104713c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C33062d) it.next()).getServiceName());
            }
            AbstractC17795v0.m51138u(arrayList, c26068uM77569a, c28655q2, 0);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (viewState.getHasOverrides()) {
                c28655q2.m87150e0(-905302925);
                m104687o(c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-905246226);
                c28655q2.m87173q(false);
            }
            boolean z4 = false;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Local Service Overrides")), null, onBackClick, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i15 << 3) & 7168), 53);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getSearchQuery());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Search services...");
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
            int i16 = i15 & 112;
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13 || objM87133R2 == c28676v1) {
                objM87133R2 = new C32451b(onViewEvent, 6);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = TextResource.$stable;
            AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, textResourceM21278l2, null, 0L, 0, false, null, 0L, false, c26068uM77569a, false, false, null, (Function1) objM87133R2, c28655q2, (i17 << 3) | 6 | (i17 << 6), 0, 15352);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f14, 0.0f, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
            boolean zM87157i = c28655q2.m87157i(viewState) | (i16 == 32);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R3 == c28676v0) {
                }
                C28676v0 c28676v2 = c28676v0;
                AbstractC22674j.m65717c(modifierM3396r, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q2, 24576, 492);
                boolean zM104711a = viewState.getHasOverrides();
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Reset All to QA");
                float f15 = 3 * f13;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, f14, 0.0f, f15, 5);
                if (i16 == 32) {
                    z4 = true;
                }
                objM87133R = c28655q2.m87133R();
                if (z4 || objM87133R == c28676v2) {
                    objM87133R = new C32458i(onViewEvent, 12);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3398t2, zM104711a, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, (i17 << 18) | 6, 0, 8124);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            }
            objM87133R3 = new C32469t(9, viewState, onViewEvent);
            c28655q2.m87172p0(objM87133R3);
            C28676v0 c28676v3 = c28676v0;
            AbstractC22674j.m65717c(modifierM3396r, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q2, 24576, 492);
            boolean zM104711a2 = viewState.getHasOverrides();
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Reset All to QA");
            float f16 = 3 * f13;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2), 0.0f, f14, 0.0f, f16, 5);
            if (i16 == 32) {
                z4 = true;
            }
            objM87133R = c28655q2.m87133R();
            if (z4) {
                objM87133R = new C32458i(onViewEvent, 12);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C32458i(onViewEvent, 12);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3398t3, zM104711a2, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, (i17 << 18) | 6, 0, 8124);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onViewEvent, (InterfaceC23459e) onBackClick, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m104682j(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC17801x0.c) {
            function1.invoke(new AbstractC33060b.d(((AbstractC17801x0.c) it).getNewText()));
        } else if (it instanceof AbstractC17801x0.a) {
            function1.invoke(AbstractC33060b.a.f137860a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m104683k(C33064f c33064f, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C33062d> listM104713c = c33064f.m104713c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM104713c.size(), new c(new C32618h3(26), listM104713c), new d(b.f137853w, listM104713c), new C37816b(new e(listM104713c, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Object m104684l(C33062d it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getServiceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m104685m(Function1 function1) {
        function1.invoke(AbstractC33060b.b.f137861a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m104686n(C33064f c33064f, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m104681i(c33064f, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m104687o(Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1268930845);
        if (c28655q2.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h("⚠ Routing to localhost:8080 — run: adb reverse tcp:8080 tcp:8080", AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, c38072d.m121949b(c28655q2, i14).getAccentAlert(), AbstractC17918w0.f69621a))), c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB2(), null, c28655q, 6, C2886a.f11498d << 18, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m104688p(int i13, Composer composer, int i14) {
        m104687o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m104689q(C33062d item, InterfaceC4351m onToggle, Composer composer, int i13) {
        int i14;
        C33062d c33062d;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-531340710);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(item) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onToggle) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125370W0 = c38072d.m121949b(c28655q, i15).getWhite10();
            float f13 = 4;
            float f14 = 1 * f13;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, jM125370W0, c33252iM105489e);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(3 * f13, c2314t));
            String strM104706a = item.getServiceName();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = i14;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM104706a, new LayoutWeightElement(1.0f, true), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            boolean zM104707b = item.getIsEnabled();
            C15187x1 c15187x1M108196A = AbstractC34235f.m108196A(c38072d.m121949b(c28655q, i15).getAccentAlert(), c38072d.m121949b(c28655q, i15).getAccentAlert(), 0.3f, c38072d.m121949b(c28655q, i15).getGreyL2(), 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q, MessageListItemViewType.GIPHY);
            c28655q = c28655q;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14);
            boolean z4 = ((i16 & 112) == 32) | ((i16 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                c33062d = item;
                objM87133R = new C32469t(10, onToggle, c33062d);
                c28655q.m87172p0(objM87133R);
            } else {
                c33062d = item;
            }
            AbstractC15133r7.m43183a(zM104707b, (Function1) objM87133R, modifierM3398t, false, c15187x1M108196A, c28655q, 384, 24);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            c28655q.m87173q(true);
        } else {
            c33062d = item;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c33062d, onToggle, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m104690r(InterfaceC4351m interfaceC4351m, C33062d c33062d, boolean z4) {
        interfaceC4351m.invoke(c33062d.getServiceName(), Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m104691s(C33062d c33062d, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m104689q(c33062d, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
