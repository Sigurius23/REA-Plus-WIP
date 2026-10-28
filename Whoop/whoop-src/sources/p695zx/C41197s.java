package p695zx;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bm.C3383g;
import com.stripe.android.view.CardNumberEditText;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p537ux.C35330f;
import p537ux.C35334h;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s40.C32139c0;
import t83.C33617b;
import y00.C38783b;
import y00.EnumC38853i;
import y00.EnumC38863j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: zx.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C41197s {

    /* JADX INFO: renamed from: a */
    public final C41192n f177730a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f177731b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f177732c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41202x f177733d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC35320a f177734e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC35322b f177735f;

    /* JADX INFO: renamed from: g */
    public final C29934u0 f177736g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2994c0 f177737h;

    /* JADX INFO: renamed from: i */
    public final boolean f177738i;

    /* JADX INFO: renamed from: j */
    public final C26318e f177739j;

    /* JADX INFO: renamed from: k */
    public C41179a f177740k;

    /* JADX INFO: renamed from: l */
    public final C13045h2 f177741l;

    /* JADX INFO: renamed from: m */
    public final C13045h2 f177742m;

    /* JADX INFO: renamed from: n */
    public final C3383g f177743n;

    /* JADX INFO: renamed from: o */
    public InterfaceC3027k1 f177744o;

    public C41197s(C41192n cardAccountRangeRepository, InterfaceC30063j uiContext, InterfaceC30063j workContext, InterfaceC41202x interfaceC41202x, InterfaceC35320a interfaceC35320a, InterfaceC35322b interfaceC35322b, C29934u0 c29934u0, C17171d c17171d, int i13) {
        interfaceC35320a = (i13 & 16) != 0 ? C35330f.f150532w : interfaceC35320a;
        interfaceC35322b = (i13 & 32) != 0 ? C35334h.f150537w : interfaceC35322b;
        c29934u0 = (i13 & 64) != 0 ? null : c29934u0;
        c17171d = (i13 & 128) != 0 ? AbstractC3006f0.m8708b(uiContext) : c17171d;
        AbstractC22676k.m65750j(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f177730a = cardAccountRangeRepository;
        this.f177731b = uiContext;
        this.f177732c = workContext;
        this.f177733d = interfaceC41202x;
        this.f177734e = interfaceC35320a;
        this.f177735f = interfaceC35322b;
        this.f177736g = c29934u0;
        this.f177737h = c17171d;
        C33617b c33617b = EnumC38863j.f167289H;
        boolean z4 = false;
        if (c33617b == null || !c33617b.isEmpty()) {
            Iterator it = c33617b.iterator();
            while (it.hasNext()) {
                if (!this.f177735f.mo112183F((EnumC38863j) it.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f177738i = z4;
        this.f177739j = this.f177730a.f177717e;
        C25271y c25271y = C25271y.f99162w;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C41182d(c25271y, c25271y));
        this.f177741l = c13045h2M36593c;
        this.f177742m = c13045h2M36593c;
        this.f177743n = new C3383g(new C3383g(c13045h2M36593c, 5), 6);
    }

    /* JADX INFO: renamed from: a */
    public final C38783b m133833a() {
        return (C38783b) AbstractC25265s.m74100H0(((InterfaceC41183e) this.f177742m.getValue()).mo133829a());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final void m133834b(C41185g c41185g, boolean z4) {
        List list = C25271y.f99162w;
        if (z4 && c41185g.f177697e < 8) {
            m133836d(list);
            return;
        }
        if (z4) {
            ?? r10 = AbstractC41188j.f177704a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r10.entrySet()) {
                if (AbstractC39421y.m125930O(c41185g.f177696d, (String) entry.getKey(), false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map.Entry entry2 = (Map.Entry) AbstractC25265s.m74144q1(linkedHashMap.entrySet());
            List list2 = entry2 != null ? (List) entry2.getValue() : null;
            if (list2 != null) {
                list = list2;
            }
        }
        if (!list.isEmpty()) {
            m133836d(list);
            return;
        }
        ArrayList arrayListM133837a = ((C41198t) this.f177733d).m133837a(c41185g);
        if (z4 || this.f177738i) {
            m133835c(c41185g);
            return;
        }
        if (!arrayListM133837a.isEmpty()) {
            C38783b c38783b = (C38783b) AbstractC25265s.m74100H0(arrayListM133837a);
            EnumC38853i enumC38853i = c38783b != null ? c38783b.f166934y.f166885x : null;
            int i13 = enumC38853i == null ? -1 : AbstractC41194p.f177723a[enumC38853i.ordinal()];
            if (i13 != 1 && i13 != 2) {
                m133836d(arrayListM133837a);
                return;
            }
        }
        m133835c(c41185g);
    }

    /* JADX INFO: renamed from: c */
    public final void m133835c(C41185g c41185g) {
        C41179a c41179a = c41185g.f177699g;
        C38783b c38783bM133833a = m133833a();
        boolean z4 = c38783bM133833a == null || c41179a == null || !c38783bM133833a.f166932w.m124344b(c41185g) || !c41179a.equals(this.f177740k);
        this.f177740k = c41179a;
        if (z4) {
            InterfaceC3027k1 interfaceC3027k1 = this.f177744o;
            InterfaceC30057d interfaceC30057d = null;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.f177744o = null;
            C13045h2 c13045h2 = this.f177741l;
            c13045h2.getClass();
            c13045h2.m36571k(null, C41181c.f177691a);
            this.f177744o = AbstractC3006f0.m8732z(this.f177737h, this.f177732c, null, new C32139c0(c41185g, this, interfaceC30057d, 28), 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m133836d(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (this.f177734e.mo112179o(((C38783b) obj).f166934y.f166885x)) {
                arrayList.add(obj);
            }
        }
        C41182d c41182d = new C41182d(arrayList, list);
        C13045h2 c13045h2 = this.f177741l;
        c13045h2.getClass();
        c13045h2.m36571k(null, c41182d);
        C29934u0 c29934u0 = this.f177736g;
        if (c29934u0 != null) {
            CardNumberEditText cardNumberEditText = (CardNumberEditText) c29934u0.f122249x;
            CardNumberEditText.m16908f(cardNumberEditText);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C38783b) it.next()).f166934y.f166885x);
            }
            List listM74159y0 = AbstractC25265s.m74159y0(arrayList2);
            EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74146r1(listM74159y0);
            if (enumC38853i == null) {
                enumC38853i = EnumC38853i.Unknown;
            }
            cardNumberEditText.setCardBrand$payments_core_release(enumC38853i);
            if (cardNumberEditText.f22521l0) {
                EnumC38853i enumC38853i2 = (EnumC38853i) AbstractC25265s.m74100H0(listM74159y0);
                if (enumC38853i2 == null) {
                    enumC38853i2 = EnumC38853i.Unknown;
                }
                cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(enumC38853i2);
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((C38783b) it3.next()).f166934y.f166885x);
                }
                cardNumberEditText.setPossibleCardBrands$payments_core_release(AbstractC25265s.m74159y0(arrayList3));
            }
        }
    }
}
