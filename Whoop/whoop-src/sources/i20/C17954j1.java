package i20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import eg.C13161j;
import g40.InterfaceC15318a0;
import h20.C16670i0;
import h20.C16671i1;
import h20.C16760x0;
import hm.C17417d;
import j20.C21241c;
import java.util.LinkedHashMap;
import java.util.Set;
import m63.C25126d;
import m83.C25235a0;
import m83.C25272z;
import p133f1.C13968p1;
import p565vy.AbstractC36561a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: i20.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17954j1 extends AbstractC1637w1 implements InterfaceC15318a0 {

    /* JADX INFO: renamed from: E */
    public final LinkedHashMap f69744E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f69745F;

    /* JADX INFO: renamed from: G */
    public LinkedHashMap f69746G;

    /* JADX INFO: renamed from: H */
    public final C13081r1 f69747H;

    /* JADX INFO: renamed from: I */
    public final C13045h2 f69748I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f69749J;

    /* JADX INFO: renamed from: K */
    public final C13968p1 f69750K;

    /* JADX INFO: renamed from: L */
    public final C25126d f69751L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f69752M;

    /* JADX INFO: renamed from: N */
    public final C13045h2 f69753N;

    /* JADX INFO: renamed from: O */
    public final C13045h2 f69754O;

    /* JADX INFO: renamed from: P */
    public final C13045h2 f69755P;

    /* JADX INFO: renamed from: w */
    public final C17946h f69756w;

    /* JADX INFO: renamed from: x */
    public final C17957k1 f69757x;

    /* JADX INFO: renamed from: y */
    public final C21241c f69758y;

    /* JADX INFO: renamed from: z */
    public C13161j f69759z;

    public C17954j1(C17946h c17946h, C17957k1 navigator, C21241c eventReporter) {
        boolean zContains;
        Object c17948h1;
        Boolean bool;
        C16760x0 c16760x0;
        String str;
        C17928b c17928b;
        C16671i1 c16671i1;
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        this.f69756w = c17946h;
        this.f69757x = navigator;
        this.f69758y = eventReporter;
        C17975s c17975s = c17946h.f69728x;
        C17417d c17417d = new C17417d(c17975s, 5);
        InterfaceC30057d interfaceC30057d = null;
        C17928b c17928bM51572g = (c17975s == null || (c16671i1 = c17975s.f69803I) == null) ? null : m51572g(new C17928b(c16671i1.f64116y, c16671i1.f64114w, c16671i1.f64117z, null));
        LinkedHashMap linkedHashMapM49434m = c17928bM51572g != null ? c17417d.m49434m(c17928bM51572g) : null;
        this.f69744E = linkedHashMapM49434m;
        C17928b c17928bM51572g2 = (c17975s == null || (c17928b = c17975s.f69805x) == null) ? null : m51572g(c17928b);
        LinkedHashMap linkedHashMapM49434m2 = c17928bM51572g2 != null ? c17417d.m49434m(c17928bM51572g2) : null;
        boolean zM65745e = AbstractC22676k.m65745e(linkedHashMapM49434m, linkedHashMapM49434m2);
        if (c17975s == null || linkedHashMapM49434m == null) {
            zContains = false;
        } else if (c17928bM51572g == null || (c16760x0 = c17928bM51572g.f69684x) == null || (str = c16760x0.f64399x) == null) {
            zContains = true;
        } else {
            Set set = c17975s.f69806y;
            set = set.isEmpty() ? null : set;
            zContains = (set == null ? AbstractC36561a.f156562a : set).contains(str);
        }
        if (zContains) {
            c17948h1 = new C17948h1((linkedHashMapM49434m != null && linkedHashMapM49434m2 == null) || zM65745e);
        } else {
            c17948h1 = C17945g1.f69726a;
        }
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c17948h1);
        this.f69745F = c13045h2M36593c;
        this.f69746G = zM65745e ? null : linkedHashMapM49434m2;
        this.f69747H = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(c17928bM51572g2 != null ? c17928bM51572g2 : c17928bM51572g);
        this.f69748I = c13045h2M36593c2;
        this.f69749J = c13045h2M36593c2;
        this.f69750K = new C13968p1(c17975s != null ? c17975s.f69801G : null, c17975s != null ? c17975s.f69802H : C25235a0.f99113w);
        C17928b c17928b2 = (C17928b) c13045h2M36593c2.getValue();
        this.f69751L = new C25126d(c17928b2 != null ? AbstractC17960l1.m51589p(c17928b2, null) : C25272z.f99163w, c17975s, this);
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(Boolean.TRUE);
        this.f69752M = c13045h2M36593c3;
        this.f69753N = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f69754O = c13045h2M36593c4;
        this.f69755P = c13045h2M36593c4;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C17939e1(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C17939e1(this, interfaceC30057d, 1), 3);
        if (c17928bM51572g2 == null || (bool = c17928bM51572g2.f69686z) == null) {
            return;
        }
        c13045h2M36593c4.m36571k(null, bool);
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: d */
    public final void mo43528d(C13161j c13161j) {
        this.f69759z = c13161j;
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: e */
    public final void mo43529e(String str) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C16670i0(this, str, (InterfaceC30057d) null, 11), 3);
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: f */
    public final C13968p1 mo43530f() {
        return this.f69750K;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: g */
    public final C17928b m51572g(C17928b c17928b) {
        Set set;
        C17975s c17975s = this.f69756w.f69728x;
        if (c17975s != null) {
            set = c17975s.f69806y;
            if (set.isEmpty()) {
                set = null;
            }
            if (set == null) {
                set = AbstractC36561a.f156562a;
            }
        } else {
            set = AbstractC36561a.f156562a;
        }
        C16760x0 c16760x0 = c17928b.f69684x;
        if ((c16760x0 != null ? c16760x0.f64399x : null) == null || set.contains(c16760x0.f64399x)) {
            return c17928b;
        }
        return null;
    }
}
