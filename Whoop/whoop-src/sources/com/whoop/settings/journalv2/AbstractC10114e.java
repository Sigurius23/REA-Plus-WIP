package com.whoop.settings.journalv2;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2633u2;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import hg3.AbstractC17269i;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p705ea2.AbstractC12922s;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import sg2.C32451b;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import u71.C34569c;
import ub2.AbstractC34745d;
import ub2.C34742a;
import ub2.C34746e;
import uw0.AbstractC35304n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/settings/journalv2/h;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onToolbarLeftClick", "Lkotlin/Function1;", "", "onJournalChecked", "onMccItemClicked", "Lkotlin/Function2;", "", "Lcom/whoop/journal/model/CurrentCycle;", "onViewJournalClicked", "onDismissDialogChecked", "onRefresh", "q", "(Lcom/whoop/settings/journalv2/h;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/settings/journalv2/h$e;", "n", "(Lcom/whoop/settings/journalv2/h$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onCheck", "k", "showBottomSheet", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10114e {

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4339a f30425w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f30426x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f30427y;

        public a(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1) {
            this.f30425w = interfaceC4339a;
            this.f30426x = interfaceC4351m;
            this.f30427y = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m25477a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            if (it instanceof AbstractC10112c.a) {
                AbstractC10114e.m25469s(this.f30427y, true);
            } else if (it instanceof AbstractC10112c.b) {
                AbstractC10112c.b bVar = (AbstractC10112c.b) it;
                this.f30426x.invoke(Long.valueOf(bVar.getCycleId()), bVar.getCurrentCycle());
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m25477a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f30428w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f30429w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f30430x;

        public c(Function1 function1, List list) {
            this.f30429w = function1;
            this.f30430x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m25479a(int i13) {
            return this.f30429w.invoke(this.f30430x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m25479a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f30431w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f30432x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4351m f30433y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f30434z;

        public d(List list, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1) {
            this.f30431w = list;
            this.f30432x = interfaceC4339a;
            this.f30433y = interfaceC4351m;
            this.f30434z = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m25480a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f30431w.get(i13);
            c28655q.m87150e0(-849375192);
            C25307p c25307pM109744b = AbstractC34745d.m109744b();
            boolean zM87153g = c28655q.m87153g(this.f30432x) | c28655q.m87153g(this.f30433y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f30432x, this.f30433y, this.f30434z);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM109744b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m25480a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private static final void m25461k(InterfaceC10117h.e eVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1178943346);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(eVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC12922s.f44612k, null, i15, 0 == true ? 1 : 0);
            int i16 = i14;
            AbstractC33088k.g gVar = new AbstractC33088k.g(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            boolean zM25490b = eVar.getIsDismissChecked();
            boolean zM25491c = eVar.getIsJournalEnabled();
            boolean z4 = (i16 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(function1, 23);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC33087j.m104824f(c8688b, gVar, zM25490b, zM25491c, 0, 0L, null, null, false, 0L, (Function1) objM87133R, c28655q, TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 0, MessageListItemViewType.GIPHY);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34746e(eVar, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m25462l(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m25463m(InterfaceC10117h.e eVar, Function1 function1, int i13, Composer composer, int i14) {
        m25461k(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m25464n(InterfaceC10117h.e eVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-756258384);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(eVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 7 * 4, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 2.5d) * 8, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC12922s.f44554B);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i17, 196602);
            boolean zM25491c = eVar.getIsJournalEnabled();
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(function1, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zM25491c, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC12922s.f44556C), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34746e(eVar, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m25465o(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m25466p(InterfaceC10117h.e eVar, Function1 function1, int i13, Composer composer, int i14) {
        m25464n(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0244  */
    /* JADX WARN: Code duplicated, block: B:102:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x024e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0252  */
    /* JADX WARN: Code duplicated, block: B:108:0x0255  */
    /* JADX WARN: Code duplicated, block: B:109:0x025d A[PHI: r46
      0x025d: PHI (r46v1 p1.v0) = (r46v0 p1.v0), (r46v2 p1.v0) binds: [B:104:0x024c, B:107:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x030f  */
    /* JADX WARN: Code duplicated, block: B:121:0x033f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0347  */
    /* JADX WARN: Code duplicated, block: B:124:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0422  */
    /* JADX WARN: Code duplicated, block: B:132:0x0426  */
    /* JADX WARN: Code duplicated, block: B:134:0x0471  */
    /* JADX WARN: Code duplicated, block: B:77:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Code duplicated, block: B:98:0x023a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
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
    /* JADX INFO: renamed from: q */
    public static final void m25467q(InterfaceC10117h viewState, InterfaceC4339a onToolbarLeftClick, Function1 onJournalChecked, InterfaceC4339a onMccItemClicked, InterfaceC4351m onViewJournalClicked, Function1 onDismissDialogChecked, InterfaceC4339a onRefresh, Composer composer, int i13) {
        int i14;
        Object obj;
        int i15;
        C0209i c0209i;
        int i16;
        List list;
        boolean z4;
        int iHashCode;
        C28676v0 c28676v0;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C28676v0 c28676v1;
        ?? r10;
        Object objM87133R2;
        C28676v0 c28676v2;
        Object obj2;
        Object objM87133R3;
        Object obj3;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        AbstractC22676k.m65750j(onJournalChecked, "onJournalChecked");
        AbstractC22676k.m65750j(onMccItemClicked, "onMccItemClicked");
        AbstractC22676k.m65750j(onViewJournalClicked, "onViewJournalClicked");
        AbstractC22676k.m65750j(onDismissDialogChecked, "onDismissDialogChecked");
        AbstractC22676k.m65750j(onRefresh, "onRefresh");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-668552920);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onToolbarLeftClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onJournalChecked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onMccItemClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onViewJournalClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onDismissDialogChecked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onRefresh) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (objM87133R4 == c28676v3) {
                obj = objM87133R4;
                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(c28633k1M87272z);
                obj = c28633k1M87272z;
            }
            obj = objM87133R4;
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
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
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (viewState instanceof InterfaceC10117h.e) {
                    c28655q.m87150e0(-1775162894);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC12922s.f44554B);
                    Locale locale = Locale.getDefault();
                    AbstractC22676k.m65749i(locale, "getDefault(...)");
                    String upperCase = strM92103Y.toUpperCase(locale);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    c28676v0 = c28676v3;
                    i17 = i15;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8691e(upperCase), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), "Back", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, onToolbarLeftClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
                    InterfaceC10117h.e eVar = (InterfaceC10117h.e) viewState;
                    i18 = i17 & 14;
                    m25464n(eVar, onJournalChecked, c28655q, ((i17 >> 3) & 112) | i18);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 7 * 4, 0.0f, 2);
                    if (i18 != 4 || ((i17 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i17 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z36 = z14 | z13;
                    if ((57344 & i17) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z36 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c1 = interfaceC28601c2;
                        c28676v1 = c28676v0;
                        z4 = true;
                        C31915d c31915d = new C31915d(viewState, onMccItemClicked, onViewJournalClicked, interfaceC28601c1, 11);
                        c28655q.m87172p0(c31915d);
                        objM87133R = c31915d;
                    } else if (objM87133R == c28676v0) {
                        c28676v0 = c28676v0;
                        interfaceC28601c1 = interfaceC28601c2;
                        c28676v1 = c28676v0;
                        z4 = true;
                        C31915d c31915d2 = new C31915d(viewState, onMccItemClicked, onViewJournalClicked, interfaceC28601c1, 11);
                        c28655q.m87172p0(c31915d2);
                        objM87133R = c31915d2;
                    } else {
                        c28676v1 = c28676v0;
                        interfaceC28601c1 = interfaceC28601c2;
                        z4 = true;
                    }
                    AbstractC22674j.m65717c(modifierM3396r, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 510);
                    m25461k(eVar, onDismissDialogChecked, c28655q, i18 | ((i17 >> 12) & 112));
                    c28655q.m87173q(z4);
                    if (m25468r(interfaceC28601c1)) {
                        c28655q.m87150e0(-1773813123);
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, c2314t), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, C34742a.f146389a.m109742b(), c28655q, 1572870, 58);
                        r10 = 0;
                        c28655q.m87173q(false);
                    } else {
                        r10 = 0;
                        c28655q.m87150e0(-1773687232);
                        c28655q.m87173q(false);
                    }
                    boolean zM25468r = m25468r(interfaceC28601c1);
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(300, r10, null, 6);
                    objM87133R2 = c28655q.m87133R();
                    c28676v2 = c28676v1;
                    obj2 = objM87133R2;
                    if (objM87133R2 == c28676v2) {
                        C34569c c34569c = new C34569c(9);
                        c28655q.m87172p0(c34569c);
                        obj2 = c34569c;
                    }
                    C3733d1 c3733d1M11587o = AbstractC3788w0.m11587o(c11347e2M30574v, (Function1) obj2);
                    C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(300, r10, null, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj3 = objM87133R3;
                    if (objM87133R3 == c28676v2) {
                        C34569c c34569c2 = new C34569c(10);
                        c28655q.m87172p0(c34569c2);
                        obj3 = c34569c2;
                    }
                    AbstractC1090b.m3351f(zM25468r, null, c3733d1M11587o, AbstractC3788w0.m11591s(c11347e2M30574v2, (Function1) obj3), null, AbstractC37817c.m121344e(-1002602350, c28655q, new C12906g(5, interfaceC28601c1)), c28655q, 200064, 18);
                    c28655q.m87173q(r10);
                } else {
                    i16 = 2;
                    list = null;
                    z35 = false;
                    z34 = false;
                    z29 = false;
                    z28 = false;
                    z27 = false;
                    z26 = false;
                    z25 = false;
                    z24 = false;
                    z19 = false;
                    z18 = false;
                    z17 = false;
                    z4 = true;
                    if (viewState instanceof InterfaceC10117h.a) {
                        c28655q.m87150e0(-1773209584);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44558D, list, i16, z17 ? 1 : 0), false, null, 6, null);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC12922s.f44560E, z18 ? 1 : 0, i16, z19 ? 1 : 0);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC12922s.f44562F, z24 ? 1 : 0, i16, z25 ? 1 : 0);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC16277f.f62253K, z26 ? 1 : 0, i16, z27 ? 1 : 0);
                        int i19 = AbstractC33208p0.b.f138467h;
                        int i24 = TextResource.C8688b.f25889c;
                        AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, null, false, false, c8688b3, null, null, false, false, c28655q, i19 | (i24 << 3) | (i24 << 9) | (i24 << 21), 0, 3956);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof InterfaceC10117h.b) {
                        c28655q.m87150e0(-1772706764);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof InterfaceC10117h.d) {
                        c28655q.m87150e0(-1772484370);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, new TextResource.C8688b(AbstractC12922s.f44566H, z28 ? 1 : 0, i16, z29 ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof InterfaceC10117h.c) {
                            throw AbstractC11895b.m32003v(-888548175, c28655q, false);
                        }
                        c28655q.m87150e0(-1772225272);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), new TextResource.C8688b(AbstractC12922s.f44564G, z34 ? 1 : 0, i16, z35 ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.C8688b.f25889c << 3), 0, 4092);
                        onRefresh.invoke();
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z4);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (viewState instanceof InterfaceC10117h.e) {
                c28655q.m87150e0(-1775162894);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC12922s.f44554B);
                Locale locale2 = Locale.getDefault();
                AbstractC22676k.m65749i(locale2, "getDefault(...)");
                String upperCase2 = strM92103Y2.toUpperCase(locale2);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                c28676v0 = c28676v3;
                i17 = i15;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8691e(upperCase2), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), "Back", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, onToolbarLeftClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
                InterfaceC10117h.e eVar2 = (InterfaceC10117h.e) viewState;
                i18 = i17 & 14;
                m25464n(eVar2, onJournalChecked, c28655q, ((i17 >> 3) & 112) | i18);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 7 * 4, 0.0f, 2);
                if (i18 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if ((i17 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z37 = z14 | z13;
                if ((57344 & i17) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z37 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c1 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    z4 = true;
                    C31915d c31915d3 = new C31915d(viewState, onMccItemClicked, onViewJournalClicked, interfaceC28601c1, 11);
                    c28655q.m87172p0(c31915d3);
                    objM87133R = c31915d3;
                } else if (objM87133R == c28676v0) {
                    c28676v0 = c28676v0;
                    interfaceC28601c1 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    z4 = true;
                    C31915d c31915d4 = new C31915d(viewState, onMccItemClicked, onViewJournalClicked, interfaceC28601c1, 11);
                    c28655q.m87172p0(c31915d4);
                    objM87133R = c31915d4;
                } else {
                    c28676v1 = c28676v0;
                    interfaceC28601c1 = interfaceC28601c2;
                    z4 = true;
                }
                AbstractC22674j.m65717c(modifierM3396r2, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 510);
                m25461k(eVar2, onDismissDialogChecked, c28655q, i18 | ((i17 >> 12) & 112));
                c28655q.m87173q(z4);
                if (m25468r(interfaceC28601c1)) {
                    c28655q.m87150e0(-1773813123);
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, c2314t), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack50(), 0L, null, 0.0f, C34742a.f146389a.m109742b(), c28655q, 1572870, 58);
                    r10 = 0;
                    c28655q.m87173q(false);
                } else {
                    r10 = 0;
                    c28655q.m87150e0(-1773687232);
                    c28655q.m87173q(false);
                }
                boolean zM25468r2 = m25468r(interfaceC28601c1);
                C11347e2 c11347e2M30574v3 = AbstractC11348f.m30574v(300, r10, null, 6);
                objM87133R2 = c28655q.m87133R();
                c28676v2 = c28676v1;
                obj2 = objM87133R2;
                if (objM87133R2 == c28676v2) {
                    C34569c c34569c3 = new C34569c(9);
                    c28655q.m87172p0(c34569c3);
                    obj2 = c34569c3;
                }
                C3733d1 c3733d1M11587o2 = AbstractC3788w0.m11587o(c11347e2M30574v3, (Function1) obj2);
                C11347e2 c11347e2M30574v4 = AbstractC11348f.m30574v(300, r10, null, 6);
                objM87133R3 = c28655q.m87133R();
                obj3 = objM87133R3;
                if (objM87133R3 == c28676v2) {
                    C34569c c34569c4 = new C34569c(10);
                    c28655q.m87172p0(c34569c4);
                    obj3 = c34569c4;
                }
                AbstractC1090b.m3351f(zM25468r2, null, c3733d1M11587o2, AbstractC3788w0.m11591s(c11347e2M30574v4, (Function1) obj3), null, AbstractC37817c.m121344e(-1002602350, c28655q, new C12906g(5, interfaceC28601c1)), c28655q, 200064, 18);
                c28655q.m87173q(r10);
            } else {
                i16 = 2;
                list = null;
                z35 = false;
                z34 = false;
                z29 = false;
                z28 = false;
                z27 = false;
                z26 = false;
                z25 = false;
                z24 = false;
                z19 = false;
                z18 = false;
                z17 = false;
                z4 = true;
                if (viewState instanceof InterfaceC10117h.a) {
                    c28655q.m87150e0(-1773209584);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44558D, list, i16, z17 ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC12922s.f44560E, z18 ? 1 : 0, i16, z19 ? 1 : 0);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC12922s.f44562F, z24 ? 1 : 0, i16, z25 ? 1 : 0);
                    TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC16277f.f62253K, z26 ? 1 : 0, i16, z27 ? 1 : 0);
                    int i110 = AbstractC33208p0.b.f138467h;
                    int i25 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, c8688b4, null, c8688b5, null, false, false, c8688b6, null, null, false, false, c28655q, i110 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3956);
                    c28655q.m87173q(false);
                } else if (viewState instanceof InterfaceC10117h.b) {
                    c28655q.m87150e0(-1772706764);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else if (viewState instanceof InterfaceC10117h.d) {
                    c28655q.m87150e0(-1772484370);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, new TextResource.C8688b(AbstractC12922s.f44566H, z28 ? 1 : 0, i16, z29 ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof InterfaceC10117h.c) {
                        throw AbstractC11895b.m32003v(-888548175, c28655q, false);
                    }
                    c28655q.m87150e0(-1772225272);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), new TextResource.C8688b(AbstractC12922s.f44564G, z34 ? 1 : 0, i16, z35 ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.C8688b.f25889c << 3), 0, 4092);
                    onRefresh.invoke();
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(viewState, onToolbarLeftClick, onJournalChecked, onMccItemClicked, onViewJournalClicked, onDismissDialogChecked, onRefresh, i13, 12);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m25468r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m25469s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m25470t(InterfaceC10117h interfaceC10117h, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM25489a = ((InterfaceC10117h.e) interfaceC10117h).m25489a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM25489a.size(), null, new c(b.f30428w, listM25489a), new C37816b(new d(listM25489a, interfaceC4339a, interfaceC4351m, interfaceC28601c1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final int m25471u(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final int m25472v(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m25473w(InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C27325i(28, interfaceC28601c1);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC35304n.m112067r(null, (InterfaceC4339a) objM87133R, c28655q, 48, 1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m25474x(InterfaceC28601c1 interfaceC28601c1) {
        m25469s(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m25475y(InterfaceC10117h interfaceC10117h, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m25467q(interfaceC10117h, interfaceC4339a, function1, interfaceC4339a2, interfaceC4351m, function2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
