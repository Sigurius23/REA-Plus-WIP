package com.whoop.settings;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import aq1.C1910d;
import b91.C2886a;
import bs1.C3605x;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import hb3.AbstractC17104a0;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p668z1.C39970s;
import p701ce2.C4494b;
import p702ch0.C4614e;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.settings.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "Lcom/whoop/settings/b;", "categorizedItems", "Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "l", "(Ljava/util/List;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "categoryName", "", "itemCount", "", "isExpanded", "onClick", "j", "(Ljava/lang/String;IZLc93/a;Landroidx/compose/runtime/Composer;I)V", "searchQuery", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10104h {
    /* JADX INFO: renamed from: j */
    private static final void m25403j(String str, int i13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-882810717);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, c2314t), false, null, null, interfaceC4339a2, 15), 8, 12);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" (");
            String strM53371l = AbstractC18489d0.m53371l(sb4, i13, ")");
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM53371l, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown(), c28655q, 6), z4 ? "Collapse" : "Expand", AbstractC1772c1.m5375L(z4 ? 0.0f : -90.0f, AbstractC1102d.m3419p(16, c2314t)), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3605x(str, i13, z4, interfaceC4339a, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m25404k(String str, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m25403j(str, i13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m25405l(List<C10093b> list, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q;
        ArrayList arrayList;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(849747670);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C39970s();
                c28655q2.m87172p0(objM87133R2);
            }
            C39970s c39970s = (C39970s) objM87133R2;
            boolean zM87153g = c28655q2.m87153g(m25406m(interfaceC28601c1)) | c28655q2.m87153g(list);
            Object objM87133R3 = c28655q2.m87133R();
            Object obj2 = objM87133R3;
            if (zM87153g || objM87133R3 == obj) {
                if (m25406m(interfaceC28601c1).length() == 0) {
                    arrayList = list;
                } else {
                    arrayList = new ArrayList();
                    for (C10093b c10093b : list) {
                        List<C23465k> listM25338c = c10093b.m25338c();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listM25338c) {
                            if (AbstractC39414r.m125876U((String) ((C23465k) obj3).f92937w, m25406m(interfaceC28601c1), true)) {
                                arrayList2.add(obj3);
                            }
                        }
                        C10093b c10093bM25336b = arrayList2.isEmpty() ? null : C10093b.m25336b(c10093b, null, arrayList2, 1, null);
                        if (c10093bM25336b != null) {
                            arrayList.add(c10093bM25336b);
                        }
                    }
                }
                c28655q2.m87172p0(arrayList);
                obj2 = arrayList;
            }
            Object obj4 = (List) obj2;
            boolean z4 = m25406m(interfaceC28601c1).length() > 0;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a2);
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
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("DEBUG MENU"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i14 << 6) & 7168), 53);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(m25406m(interfaceC28601c1));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Search debug options...");
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == obj) {
                objM87133R4 = new C1910d(25, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R4);
            }
            int i15 = TextResource.$stable;
            boolean z13 = z4;
            AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, textResourceM21278l2, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R4, c28655q2, (i15 << 3) | 6 | (i15 << 6), 24576, 16376);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            float f15 = 1 * f13;
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f15, 0.0f, f15, 100, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
            boolean zM87157i = c28655q2.m87157i(obj4) | c28655q2.m87155h(z13);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i || objM87133R5 == obj) {
                Object c4614e = new C4614e(obj4, z13, (Object) c39970s, interfaceC28601c1, 4);
                c28655q2.m87172p0(c4614e);
                objM87133R5 = c4614e;
            }
            AbstractC22674j.m65717c(modifierM3407d, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R5, c28655q2, 24966, 490);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            C28655q c28655q4 = c28655q2;
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(list, interfaceC4339a, i13, 19);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final String m25406m(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m25407n(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m25408o(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC17801x0.c) {
            m25407n(interfaceC28601c1, ((AbstractC17801x0.c) it).getNewText());
        } else if (it instanceof AbstractC17801x0.a) {
            m25407n(interfaceC28601c1, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m25409p(List list, final boolean z4, final C39970s c39970s, final InterfaceC23013y interfaceC23013y, InterfaceC28601c1 interfaceC28601c1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (true) {
            final boolean z13 = false;
            if (!it.hasNext()) {
                break;
            }
            final C10093b c10093b = (C10093b) it.next();
            if (z4) {
                z13 = true;
            } else {
                Boolean bool = (Boolean) c39970s.get(c10093b.getName());
                if (bool != null ? bool.booleanValue() : false) {
                    z13 = true;
                }
            }
            InterfaceC26064q.m77556b(LazyColumn, AbstractC11266d.m30461o("header_", c10093b.getName()), new C37816b(new Function3() { // from class: com.whoop.settings.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC10104h.m25410q(c10093b, z13, z4, c39970s, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
                }
            }, true, -349658949), 2);
            InterfaceC26064q.m77556b(LazyColumn, AbstractC11266d.m30461o("items_", c10093b.getName()), new C37816b(new Function3() { // from class: com.whoop.settings.e
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC10104h.m25412s(interfaceC23013y, z13, c10093b, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
                }
            }, true, -596400974), 2);
        }
        if ((m25406m(interfaceC28601c1).length() > 0) && list.isEmpty()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C12906g(0, interfaceC28601c1), true, -51724420), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m25410q(final C10093b c10093b, final boolean z4, final boolean z13, final C39970s c39970s, InterfaceC1103a item, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String name = c10093b.getName();
            int size = c10093b.m25338c().size();
            boolean zM87155h = c28655q.m87155h(z13) | c28655q.m87157i(c10093b) | c28655q.m87155h(z4);
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = new InterfaceC4339a() { // from class: com.whoop.settings.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC10104h.m25411r(z13, c39970s, c10093b, z4);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            m25403j(name, size, z4, (InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m25411r(boolean z4, C39970s c39970s, C10093b c10093b, boolean z13) {
        if (!z4) {
            c39970s.put(c10093b.getName(), Boolean.valueOf(!z13));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m25412s(InterfaceC23013y interfaceC23013y, boolean z4, final C10093b c10093b, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC1090b.m3350e(interfaceC23013y, z4, null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(422820746, c28655q, new Function3() { // from class: com.whoop.settings.f
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC10104h.m25413t(c10093b, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 1600512, 18);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m25413t(C10093b c10093b, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        Composer composer2 = composer;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        float f13 = 8;
        C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 2 * f13, 0.0f, 0.0f, 0.0f, 14);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, C2299e.f9110M, composer2, 6);
        C28655q c28655q = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3398t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
        c28655q.m87150e0(1695709523);
        for (C23465k c23465k : c10093b.m25338c()) {
            String str = (String) c23465k.f92937w;
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c23465k.f92938x;
            C39282o.Companion companion = C39282o.INSTANCE;
            Locale US = Locale.US;
            AbstractC22676k.m65749i(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC39281n.m125207c(null, C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l(upperCase), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388606, null), interfaceC4339a, composer2, C39282o.f168987q << 3, 1);
            composer2 = composer;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m25414u(InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(32, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC30795n.m94707h(AbstractC11895b.m31996o("No debug options found matching \"", m25406m(interfaceC28601c1), "\""), null, AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.6f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m25415v(List list, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m25405l(list, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
