package p292l1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i93.C18283i;
import i93.C18284j;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import l83.C23454a0;
import m83.AbstractC25243e0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.C22961h;
import p291l0.C22971k;
import p316m1.AbstractC24917o;
import p316m1.C24916n;
import p316m1.C24919q;
import p353o0.AbstractC27316a0;
import p353o0.C27317b;
import p353o0.C27323g;
import p353o0.C27334r;
import p353o0.C27341y;
import p353o0.InterfaceC27335s;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23086e1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23204y f91101E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f91102F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23142n3 f91103G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC24917o f91104w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f91105x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C18284j f91106y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f91107z;

    public C23086e1(AbstractC24917o abstractC24917o, long j7, C18284j c18284j, Modifier modifier, C23204y c23204y, Function1 function1, InterfaceC23142n3 interfaceC23142n3) {
        this.f91104w = abstractC24917o;
        this.f91105x = j7;
        this.f91106y = c18284j;
        this.f91107z = modifier;
        this.f91101E = c23204y;
        this.f91102F = function1;
        this.f91103G = interfaceC23142n3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC24917o abstractC24917o = this.f91104w;
            C24916n c24916nMo73019b = abstractC24917o.mo73019b();
            final int i13 = ((C24919q) abstractC24917o).m73022e(LocalDate.of(c24916nMo73019b.f97589w, c24916nMo73019b.f97590x, 1)).f97599a;
            final int i14 = abstractC24917o.mo73018a(this.f91105x).f97599a;
            C18284j c18284j = this.f91106y;
            C27341y c27341yM82466a = AbstractC27316a0.m82466a(Math.max(0, (i14 - c18284j.f71133w) - 3), c28655q, 2);
            C27317b c27317b = new C27317b(3);
            C23204y c23204y = this.f91101E;
            Modifier modifierM3358c = AbstractC1092a.m3358c(this.f91107z, c23204y.f91827a, AbstractC17918w0.f69621a);
            C22961h c22961h = AbstractC22977m.f90655f;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(AbstractC23092f1.f91173g);
            boolean zM87157i = c28655q.m87157i(abstractC24917o) | c28655q.m87157i(c18284j) | c28655q.m87149e(i14) | c28655q.m87149e(i13) | c28655q.m87153g(this.f91102F) | c28655q.m87153g(this.f91103G) | c28655q.m87153g(c23204y);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                final C18284j c18284j2 = this.f91106y;
                final AbstractC24917o abstractC24917o2 = this.f91104w;
                final Function1 function1 = this.f91102F;
                final InterfaceC23142n3 interfaceC23142n3 = this.f91103G;
                final C23204y c23204y2 = this.f91101E;
                Function1 function2 = new Function1() { // from class: l1.c1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int size;
                        InterfaceC27335s interfaceC27335s = (InterfaceC27335s) obj3;
                        C18284j c18284j3 = c18284j2;
                        AbstractC22676k.m65750j(c18284j3, "<this>");
                        if (c18284j3 instanceof Collection) {
                            size = ((Collection) c18284j3).size();
                        } else {
                            Iterator it = c18284j3.iterator();
                            int i15 = 0;
                            while (((C18283i) it).f71138y) {
                                ((AbstractC25243e0) it).next();
                                i15++;
                                if (i15 < 0) {
                                    AbstractC37056f.m118976c0();
                                    throw null;
                                }
                            }
                            size = i15;
                        }
                        C27323g c27323g = (C27323g) interfaceC27335s;
                        c27323g.m82467q(size, C27334r.f109476w, new C37816b(new C23080d1(c18284j3, abstractC24917o2, i14, i13, function1, interfaceC23142n3, c23204y2), true, 674613074));
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function2);
                objM87133R = function2;
            }
            AbstractC32417h.m101202k(c27317b, modifierM3358c, c27341yM82466a, null, c22971kM66746i, c22961h, null, false, null, (Function1) objM87133R, c28655q, 1769472, 920);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
