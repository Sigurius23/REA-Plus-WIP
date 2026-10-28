package bs1;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bm2.C3434d1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C13762f;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import w71.AbstractC36877d;
import w71.C36873b;
import w71.C36906y;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bs1.d0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "Lw71/b;", "questions", "Lg2/i;", "focusManager", "Lkotlin/Function1;", "Lw71/d;", "Ll83/a0;", "onJournalQuestionClicked", "", "onViewEvent", "e", "(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbs1/h$b;", "journalQuestionGroup", "", "j", "(Lbs1/h$b;)Z", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3585d0 {
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m10924e(List<C36873b> questions, InterfaceC15237i focusManager, Function1 onJournalQuestionClicked, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        int i16;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(questions, "questions");
        AbstractC22676k.m65750j(focusManager, "focusManager");
        AbstractC22676k.m65750j(onJournalQuestionClicked, "onJournalQuestionClicked");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1136183143);
        int i17 = (i13 & 6) == 0 ? (c28655q.m87157i(questions) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87157i(focusManager) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i17 |= c28655q.m87157i(onJournalQuestionClicked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i17 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = 1;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            for (C36873b c36873b : questions) {
                List<InterfaceC25312u> listMo78412a = c36873b.mo78412a();
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC25312u interfaceC25312u : listMo78412a) {
                    if (interfaceC25312u instanceof C17736e) {
                        arrayList2.add(new AbstractC3589h.a((C17736e) interfaceC25312u));
                    } else if (interfaceC25312u instanceof C36906y) {
                        AbstractC3589h abstractC3589h = (AbstractC3589h) AbstractC25265s.m74114R0(arrayList2);
                        if (abstractC3589h instanceof AbstractC3589h.b) {
                            AbstractC3589h.b bVar = (AbstractC3589h.b) abstractC3589h;
                            if (bVar.getId() == ((C36906y) interfaceC25312u).getId()) {
                                bVar.m10950b().add(interfaceC25312u);
                            } else {
                                arrayList2.add(new AbstractC3589h.b(((C36906y) interfaceC25312u).getId(), c36873b.getTitle(), AbstractC37056f.m118964P(interfaceC25312u)));
                            }
                        } else {
                            arrayList2.add(new AbstractC3589h.b(((C36906y) interfaceC25312u).getId(), c36873b.getTitle(), AbstractC37056f.m118964P(interfaceC25312u)));
                        }
                    }
                }
                AbstractC25265s.m74141p0(arrayList, arrayList2);
            }
            boolean z15 = false;
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC3589h abstractC3589h2 = (AbstractC3589h) next;
                boolean z16 = abstractC3589h2 instanceof AbstractC3589h.a;
                C2314t c2314t = C2314t.f9131w;
                if (z16) {
                    c28655q.m87150e0(444304718);
                    AbstractC3589h.a aVar = (AbstractC3589h.a) abstractC3589h2;
                    if (AbstractC8693b.m21270d(aVar.getItem().getTitle())) {
                        c28655q.m87150e0(444367648);
                        if (i19 > 0) {
                            c28655q.m87150e0(444399423);
                            z14 = z15;
                            AbstractC25012a.m73388u(4, 8, c2314t, c28655q, z14);
                        } else {
                            z14 = z15;
                            c28655q.m87150e0(444490718);
                            c28655q.m87173q(z14);
                        }
                        z13 = z14;
                        i16 = 8;
                        AbstractC25303l.m74291r(aVar.getItem(), p720m91.Function1.m74307h(null, i18, null), null, null, c28655q, C17736e.f68939d | (C25307p.f99300b << 3), 12);
                        c28655q.m87173q(z13);
                    } else {
                        i16 = 8;
                        z13 = z15;
                        c28655q.m87150e0(444611742);
                        c28655q.m87173q(z13);
                    }
                    AbstractC25012a.m73388u(1, i16, c2314t, c28655q, z13);
                    i14 = i17;
                    i15 = 1;
                    z4 = z13;
                } else {
                    it = it;
                    Function1 function1 = null;
                    boolean z17 = z15;
                    if (!(abstractC3589h2 instanceof AbstractC3589h.b)) {
                        throw AbstractC11895b.m32003v(1953994294, c28655q, z17);
                    }
                    c28655q.m87150e0(444793836);
                    float f13 = 4;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), 3, f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a), ((float) 1.5d) * 8, 0.0f, 2);
                    boolean zM87153g = c28655q.m87153g(abstractC3589h2) | ((i17 & 7168) == 2048);
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C3603v((AbstractC3589h.b) abstractC3589h2, onViewEvent, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1092a.m3362g(modifierM3396r, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 3);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c28655q.m87150e0(1891720830);
                    AbstractC3589h.b bVar2 = (AbstractC3589h.b) abstractC3589h2;
                    int i25 = 0;
                    for (Object obj : bVar2.m10950b()) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C36906y c36906y = (C36906y) obj;
                        C25307p c25307pM74307h = p720m91.Function1.m74307h(function1, 1, function1);
                        C13762f c13762f = new C13762f(21);
                        int i27 = i17;
                        boolean zM87157i = ((i17 & 896) == 256) | c28655q.m87157i(focusManager);
                        Object objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C3601t(focusManager, onJournalQuestionClicked, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i28 = C36906y.f157885k;
                        int i29 = C25307p.f99300b << 3;
                        C28676v0 c28676v1 = c28676v0;
                        AbstractC25303l.m74291r(c36906y, c25307pM74307h, c13762f, (Function1) objM87133R2, c28655q, i28 | i29, 0);
                        if (m10929j(bVar2) && bVar2.m10950b().size() > 1 && i25 == 0) {
                            c28655q.m87150e0(-580707546);
                            float f14 = 1 * f13;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                            AbstractC25303l.m74291r(new C17736e(null, null, null, 7, null), p720m91.Function1.m74307h(null, 1, null), null, null, c28655q, C17736e.f68939d | i29, 12);
                            AbstractC30007c.m91851u(c2314t, f14, c28655q, false);
                        } else {
                            c28655q.m87150e0(-580444232);
                            c28655q.m87173q(false);
                        }
                        i25 = i26;
                        i17 = i27;
                        c28676v0 = c28676v1;
                        function1 = null;
                    }
                    i14 = i17;
                    i15 = 1;
                    z4 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
                it = it;
                i18 = i15;
                z15 = z4;
                i19 = i24;
                i17 = i14;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3434d1(questions, focusManager, onJournalQuestionClicked, onViewEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m10925f(AbstractC3589h abstractC3589h, Function1 function1) {
        C9598e c9598eM118510e;
        C36906y c36906y = (C36906y) AbstractC25265s.m74100H0(((AbstractC3589h.b) abstractC3589h).m10950b());
        if (c36906y != null && (c9598eM118510e = c36906y.getDestination()) != null) {
            function1.invoke(c9598eM118510e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m10926g(C36906y it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1511311051);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m10927h(InterfaceC15237i interfaceC15237i, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        ((C15240l) interfaceC15237i).m43339b(false);
        if (it instanceof AbstractC36877d) {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m10928i(List list, InterfaceC15237i interfaceC15237i, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m10924e(list, interfaceC15237i, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m10929j(AbstractC3589h.b bVar) {
        List<C36906y> listM10950b = bVar.m10950b();
        if ((listM10950b instanceof Collection) && listM10950b.isEmpty()) {
            return false;
        }
        Iterator<T> it = listM10950b.iterator();
        while (it.hasNext()) {
            if (((C36906y) it.next()).getIndicatorItemState() != null) {
                return true;
            }
        }
        return false;
    }
}
