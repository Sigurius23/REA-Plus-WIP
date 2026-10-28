package p710im1;

import a11.C0137o;
import a11.C0140r;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4004c5;
import f61.C14139a;
import fm1.C14597a;
import fm1.C14600d;
import fm1.C14602f;
import hb3.AbstractC17104a0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0467z0;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import wm1.C37380b;

/* JADX INFO: renamed from: im1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lfm1/f;", "pillarContent", "", "isScrolling", "Lim1/d0;", "itemViewEventHelper", "Lfm1/d;", "homeMetaData", "addTopPadding", "Ll83/a0;", "f", "(Lfm1/f;ZLim1/d0;Lfm1/d;ZLandroidx/compose/runtime/Composer;II)V", "", "Lfm1/a;", "connectivityTiles", "i", "(Ljava/util/List;Lim1/d0;Lfm1/d;Landroidx/compose/runtime/Composer;I)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18658b {
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m54121f(C14602f pillarContent, boolean z4, final C18665d0 itemViewEventHelper, final C14600d homeMetaData, boolean z13, Composer composer, int i13, int i14) {
        boolean z14;
        boolean z15;
        boolean z16;
        C28677v1 c28677v1M87180u;
        final boolean z17;
        final ArrayList arrayList;
        AbstractC22676k.m65750j(pillarContent, "pillarContent");
        AbstractC22676k.m65750j(itemViewEventHelper, "itemViewEventHelper");
        AbstractC22676k.m65750j(homeMetaData, "homeMetaData");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(482002226);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(pillarContent) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(itemViewEventHelper) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(homeMetaData) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                z14 = z13;
                i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                List<C14597a> listM41787a = pillarContent.m41787a();
                arrayList = new ArrayList();
                for (Object obj : listM41787a) {
                    if (((C14597a) obj).getItemViewState() instanceof C0140r) {
                        arrayList.add(obj);
                    }
                }
                C37380b.Companion aVar = C37380b.INSTANCE;
                AbstractC1090b.m3351f(!z4, null, aVar.m119677b().m11562a(aVar.m119676a()), aVar.m119678c().m11563a(aVar.m119681f()), null, AbstractC37817c.m121344e(-1614783478, c28655q, new Function3() { // from class: im1.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC18658b.m54122g(z17, arrayList, itemViewEventHelper, homeMetaData, (InterfaceC3747i0) obj2, (Composer) obj3, iIntValue);
                    }
                }), c28655q, 200064, 18);
                z16 = z17;
            } else {
                c28655q.m87138X();
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14139a(pillarContent, z4, itemViewEventHelper, homeMetaData, z16, i13, i14);
            }
        }
        i15 |= 24576;
        z14 = z13;
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            if (i16 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            List<C14597a> listM41787a2 = pillarContent.m41787a();
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                if (((C14597a) obj).getItemViewState() instanceof C0140r) {
                    arrayList.add(obj);
                }
            }
            C37380b.Companion aVar2 = C37380b.INSTANCE;
            AbstractC1090b.m3351f(!z4, null, aVar2.m119677b().m11562a(aVar2.m119676a()), aVar2.m119678c().m11563a(aVar2.m119681f()), null, AbstractC37817c.m121344e(-1614783478, c28655q, new Function3() { // from class: im1.a
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC18658b.m54122g(z17, arrayList, itemViewEventHelper, homeMetaData, (InterfaceC3747i0) obj2, (Composer) obj3, iIntValue);
                }
            }), c28655q, 200064, 18);
            z16 = z17;
        } else {
            c28655q.m87138X();
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14139a(pillarContent, z4, itemViewEventHelper, homeMetaData, z16, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m54122g(boolean z4, List list, C18665d0 c18665d0, C14600d c14600d, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        if (z4) {
            c28655q.m87150e0(-2117822861);
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(2 * 8, c2314t));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-2117746942);
            c28655q.m87173q(false);
        }
        m54124i(list, c18665d0, c14600d, composer, 0);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(2 * 8, c2314t));
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m54123h(C14602f c14602f, boolean z4, C18665d0 c18665d0, C14600d c14600d, boolean z13, int i13, int i14, Composer composer, int i15) {
        m54121f(c14602f, z4, c18665d0, c14600d, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m54124i(List<C14597a> list, C18665d0 c18665d0, C14600d c14600d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(518766210);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c18665d0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c14600d) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            for (C14597a c14597a : list) {
                InterfaceC25312u itemViewState = c14597a.getItemViewState();
                C25307p c25307pM54175b = AbstractC18667e0.m54175b();
                C4004c5 c4004c5 = new C4004c5(2);
                boolean zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(c14597a) | c28655q.m87157i(c14600d);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0467z0(c18665d0, c14597a, c14600d, 3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(itemViewState, c25307pM54175b, c4004c5, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(list, c18665d0, c14600d, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m54125j(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1420987385);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m54126k(C18665d0 c18665d0, C14597a c14597a, C14600d c14600d, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c18665d0.m54172j(c14597a.getItemViewState(), c14600d, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m54127l(List list, C18665d0 c18665d0, C14600d c14600d, int i13, Composer composer, int i14) {
        m54124i(list, c18665d0, c14600d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
