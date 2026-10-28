package m61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js2.C21930h;
import k61.C22228a;
import k61.C22230c;
import kl2.C22571f;
import l61.C23379d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import p026b2.C2314t;
import p181h2.C16617b;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s61.AbstractC32234e;

/* JADX INFO: renamed from: m61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll61/d;", "segmentState", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Ll61/d;Landroidx/compose/runtime/Composer;I)V", "Lk2/e;", "drawScope", "Li91/h;", "composedBackground", "Li2/s0;", "path", "Lk2/i;", "stroke", "f", "(Lk2/e;Li91/h;Li2/s0;Lk2/i;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25109b {
    /* JADX INFO: renamed from: c */
    public static final void m73618c(Modifier modifier, C23379d segmentState, Composer composer, int i13) {
        int i14;
        AbstractC18254h abstractC18254hM52584a;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(segmentState, "segmentState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(311152441);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(segmentState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22228a fillState = segmentState.getFillState();
            AbstractC18254h abstractC18254hM52584a2 = null;
            AbstractC18247a background = fillState != null ? fillState.getBackground() : null;
            if (background == null) {
                c28655q.m87150e0(1003076287);
                c28655q.m87173q(false);
                abstractC18254hM52584a = null;
            } else {
                c28655q.m87150e0(-1630210686);
                abstractC18254hM52584a = AbstractC18255i.m52584a(background, c28655q, 0);
                c28655q.m87173q(false);
            }
            C22230c strokeState = segmentState.getStrokeState();
            AbstractC18247a background2 = strokeState != null ? strokeState.getBackground() : null;
            if (background2 == null) {
                c28655q.m87150e0(1003145727);
            } else {
                c28655q.m87150e0(-1630208446);
                abstractC18254hM52584a2 = AbstractC18255i.m52584a(background2, c28655q, 0);
            }
            c28655q.m87173q(false);
            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, C2314t.f9131w).mo3471e(modifier);
            boolean zM87157i = c28655q.m87157i(segmentState) | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87153g(abstractC18254hM52584a2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21930h(segmentState, abstractC18254hM52584a, abstractC18254hM52584a2, 16);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierMo3471e, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(modifier, segmentState, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m73619d(C23379d c23379d, AbstractC18254h abstractC18254h, AbstractC18254h abstractC18254h2, InterfaceC22131e Canvas) {
        InterfaceC22131e interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C25108a c25108a = new C25108a(c23379d.getStrokeState(), Canvas);
        List<C23465k> listM73615b = c25108a.m73615b(c23379d, Canvas.mo731d());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73615b, 10));
        Iterator<T> it = listM73615b.iterator();
        while (it.hasNext()) {
            arrayList.add(new C16617b(((C16617b) ((C23465k) it.next()).f92937w).f63937a));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM73615b, 10));
        Iterator<T> it3 = listM73615b.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new C16617b(((C16617b) ((C23465k) it3.next()).f92938x).f63937a));
        }
        C22135i c22135iM73614a = c25108a.getStroke();
        if (abstractC18254h != null) {
            InterfaceC17910s0 interfaceC17910s0M100279a = AbstractC32234e.m100279a(arrayList, arrayList2);
            if (abstractC18254h instanceof C18251e) {
                interfaceC22131e = Canvas;
                InterfaceC22131e.m63378L(interfaceC22131e, interfaceC17910s0M100279a, ((C18251e) abstractC18254h).getBrush(), 0.0f, null, 60);
            } else {
                interfaceC22131e = Canvas;
                if (!(abstractC18254h instanceof C18253g)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC22131e.m63386z(interfaceC22131e, interfaceC17910s0M100279a, ((C18253g) abstractC18254h).getColor(), 0.0f, null, 60);
            }
        } else {
            interfaceC22131e = Canvas;
        }
        if (abstractC18254h2 != null) {
            if (c22135iM73614a == null) {
                throw new IllegalArgumentException("stroke was null when strokecolor was non null");
            }
            m73621f(interfaceC22131e, abstractC18254h2, AbstractC32234e.m100280b(arrayList), c22135iM73614a);
            m73621f(interfaceC22131e, abstractC18254h2, AbstractC32234e.m100280b(arrayList2), c22135iM73614a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m73620e(Modifier modifier, C23379d c23379d, int i13, Composer composer, int i14) {
        m73618c(modifier, c23379d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m73621f(InterfaceC22131e interfaceC22131e, AbstractC18254h abstractC18254h, InterfaceC17910s0 interfaceC17910s0, C22135i c22135i) {
        if (abstractC18254h instanceof C18251e) {
            InterfaceC22131e.m63378L(interfaceC22131e, interfaceC17910s0, ((C18251e) abstractC18254h).getBrush(), 0.0f, c22135i, 52);
        } else {
            if (!(abstractC18254h instanceof C18253g)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22131e.m63386z(interfaceC22131e, interfaceC17910s0, ((C18253g) abstractC18254h).getColor(), 0.0f, c22135i, 52);
        }
    }
}
