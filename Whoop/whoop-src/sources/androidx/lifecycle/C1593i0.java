package androidx.lifecycle;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p489t.C33242a;
import p509u.C34293a;
import p509u.C34294b;
import p509u.C34295c;
import p509u.C34296d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1593i0 extends AbstractC1638x {

    /* JADX INFO: renamed from: b */
    public final boolean f6248b;

    /* JADX INFO: renamed from: c */
    public C34293a f6249c;

    /* JADX INFO: renamed from: d */
    public EnumC1635w f6250d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f6251e;

    /* JADX INFO: renamed from: f */
    public int f6252f;

    /* JADX INFO: renamed from: g */
    public boolean f6253g;

    /* JADX INFO: renamed from: h */
    public boolean f6254h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6255i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f6256j;

    public C1593i0(InterfaceC1585g0 interfaceC1585g0, boolean z4) {
        this.f6248b = z4;
        this.f6249c = new C34293a();
        EnumC1635w enumC1635w = EnumC1635w.f6326x;
        this.f6250d = enumC1635w;
        this.f6255i = new ArrayList();
        this.f6251e = new WeakReference(interfaceC1585g0);
        this.f6256j = AbstractC13091v.m36593c(enumC1635w);
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: a */
    public final void mo4986a(InterfaceC1581f0 observer) {
        InterfaceC1577e0 c1570c1;
        InterfaceC1585g0 interfaceC1585g0;
        EnumC1632v enumC1632v;
        AbstractC22676k.m65750j(observer, "observer");
        m4990f("addObserver");
        EnumC1635w enumC1635w = this.f6250d;
        EnumC1635w enumC1635w2 = EnumC1635w.f6325w;
        if (enumC1635w != enumC1635w2) {
            enumC1635w2 = EnumC1635w.f6326x;
        }
        C1589h0 c1589h0 = new C1589h0();
        HashMap map = AbstractC1600k0.f6266a;
        boolean z4 = observer instanceof InterfaceC1577e0;
        boolean z13 = observer instanceof DefaultLifecycleObserver;
        if (z4 && z13) {
            c1570c1 = new C1602l((DefaultLifecycleObserver) observer, (InterfaceC1577e0) observer);
        } else if (z13) {
            c1570c1 = new C1602l((DefaultLifecycleObserver) observer, (InterfaceC1577e0) null);
        } else if (z4) {
            c1570c1 = (InterfaceC1577e0) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC1600k0.m4999b(cls) == 2) {
                Object obj = AbstractC1600k0.f6267b.get(cls);
                AbstractC22676k.m65747g(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC1600k0.m4998a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1617q[] interfaceC1617qArr = new InterfaceC1617q[size];
                if (size > 0) {
                    AbstractC1600k0.m4998a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1570c1 = new C1584g(interfaceC1617qArr);
            } else {
                c1570c1 = new C1570c1(observer);
            }
        }
        c1589h0.f6240b = c1570c1;
        c1589h0.f6239a = enumC1635w2;
        if (((C1589h0) this.f6249c.mo108606c(observer, c1589h0)) == null && (interfaceC1585g0 = (InterfaceC1585g0) this.f6251e.get()) != null) {
            boolean z14 = this.f6252f != 0 || this.f6253g;
            EnumC1635w enumC1635wM4989e = m4989e(observer);
            this.f6252f++;
            while (c1589h0.f6239a.compareTo(enumC1635wM4989e) < 0 && this.f6249c.f144029E.containsKey(observer)) {
                EnumC1635w enumC1635w3 = c1589h0.f6239a;
                ArrayList arrayList = this.f6255i;
                arrayList.add(enumC1635w3);
                C1626t c1626t = EnumC1632v.Companion;
                EnumC1635w state = c1589h0.f6239a;
                c1626t.getClass();
                AbstractC22676k.m65750j(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    enumC1632v = EnumC1632v.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1632v = iOrdinal != 3 ? null : EnumC1632v.ON_RESUME;
                } else {
                    enumC1632v = EnumC1632v.ON_START;
                }
                if (enumC1632v == null) {
                    throw new IllegalStateException("no event up from " + c1589h0.f6239a);
                }
                c1589h0.m4979a(interfaceC1585g0, enumC1632v);
                arrayList.remove(arrayList.size() - 1);
                enumC1635wM4989e = m4989e(observer);
            }
            if (!z14) {
                m4994j();
            }
            this.f6252f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: b */
    public final EnumC1635w getCurrentState() {
        return this.f6250d;
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: d */
    public final void mo4988d(InterfaceC1581f0 observer) {
        AbstractC22676k.m65750j(observer, "observer");
        m4990f("removeObserver");
        this.f6249c.mo108607d(observer);
    }

    /* JADX INFO: renamed from: e */
    public final EnumC1635w m4989e(InterfaceC1581f0 interfaceC1581f0) {
        HashMap map = this.f6249c.f144029E;
        C34295c c34295c = map.containsKey(interfaceC1581f0) ? ((C34295c) map.get(interfaceC1581f0)).f144036z : null;
        EnumC1635w enumC1635w = c34295c != null ? ((C1589h0) c34295c.f144034x).f6239a : null;
        ArrayList arrayList = this.f6255i;
        EnumC1635w enumC1635w2 = arrayList.isEmpty() ? null : (EnumC1635w) AbstractC25012a.m73371d(arrayList, 1);
        EnumC1635w state1 = this.f6250d;
        AbstractC22676k.m65750j(state1, "state1");
        if (enumC1635w == null || enumC1635w.compareTo(state1) >= 0) {
            enumC1635w = state1;
        }
        return (enumC1635w2 == null || enumC1635w2.compareTo(enumC1635w) >= 0) ? enumC1635w : enumC1635w2;
    }

    /* JADX INFO: renamed from: f */
    public final void m4990f(String str) {
        if (this.f6248b && !C33242a.m105474V().f138639a.m105476V()) {
            throw new IllegalStateException(AbstractC11895b.m31996o("Method ", str, " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4991g(EnumC1632v event) {
        AbstractC22676k.m65750j(event, "event");
        m4990f("handleLifecycleEvent");
        m4992h(event.m5039a());
    }

    /* JADX INFO: renamed from: h */
    public final void m4992h(EnumC1635w next) {
        if (this.f6250d == next) {
            return;
        }
        InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f6251e.get();
        EnumC1635w current = this.f6250d;
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(next, "next");
        if (current == EnumC1635w.f6326x && next == EnumC1635w.f6325w) {
            throw new IllegalStateException(("State must be at least '" + EnumC1635w.f6327y + "' to be moved to '" + next + "' in component " + interfaceC1585g0).toString());
        }
        EnumC1635w enumC1635w = EnumC1635w.f6325w;
        if (current == enumC1635w && current != next) {
            throw new IllegalStateException(("State is '" + enumC1635w + "' and cannot be moved to `" + next + "` in component " + interfaceC1585g0).toString());
        }
        this.f6250d = next;
        if (this.f6253g || this.f6252f != 0) {
            this.f6254h = true;
            return;
        }
        this.f6253g = true;
        m4994j();
        this.f6253g = false;
        if (this.f6250d == enumC1635w) {
            this.f6249c = new C34293a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4993i(EnumC1635w state) {
        AbstractC22676k.m65750j(state, "state");
        m4990f("setCurrentState");
        m4992h(state);
    }

    /* JADX INFO: renamed from: j */
    public final void m4994j() {
        EnumC1632v enumC1632v;
        InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f6251e.get();
        if (interfaceC1585g0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C34293a c34293a = this.f6249c;
            if (c34293a.f144043z != 0) {
                C34295c c34295c = c34293a.f144040w;
                AbstractC22676k.m65747g(c34295c);
                EnumC1635w enumC1635w = ((C1589h0) c34295c.f144034x).f6239a;
                C34295c c34295c2 = this.f6249c.f144041x;
                AbstractC22676k.m65747g(c34295c2);
                EnumC1635w enumC1635w2 = ((C1589h0) c34295c2.f144034x).f6239a;
                if (enumC1635w == enumC1635w2 && this.f6250d == enumC1635w2) {
                    break;
                }
                this.f6254h = false;
                EnumC1635w enumC1635w3 = this.f6250d;
                C34295c c34295c3 = this.f6249c.f144040w;
                AbstractC22676k.m65747g(c34295c3);
                int iCompareTo = enumC1635w3.compareTo(((C1589h0) c34295c3.f144034x).f6239a);
                ArrayList arrayList = this.f6255i;
                if (iCompareTo < 0) {
                    C34293a c34293a2 = this.f6249c;
                    C34294b c34294b = new C34294b(c34293a2.f144041x, c34293a2.f144040w, 1);
                    c34293a2.f144042y.put(c34294b, Boolean.FALSE);
                    while (c34294b.hasNext() && !this.f6254h) {
                        Map.Entry entry = (Map.Entry) c34294b.next();
                        AbstractC22676k.m65747g(entry);
                        InterfaceC1581f0 interfaceC1581f0 = (InterfaceC1581f0) entry.getKey();
                        C1589h0 c1589h0 = (C1589h0) entry.getValue();
                        while (c1589h0.f6239a.compareTo(this.f6250d) > 0 && !this.f6254h && this.f6249c.f144029E.containsKey(interfaceC1581f0)) {
                            C1626t c1626t = EnumC1632v.Companion;
                            EnumC1635w enumC1635w4 = c1589h0.f6239a;
                            c1626t.getClass();
                            EnumC1632v enumC1632vM5033a = C1626t.m5033a(enumC1635w4);
                            if (enumC1632vM5033a == null) {
                                throw new IllegalStateException("no event down from " + c1589h0.f6239a);
                            }
                            arrayList.add(enumC1632vM5033a.m5039a());
                            c1589h0.m4979a(interfaceC1585g0, enumC1632vM5033a);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C34295c c34295c4 = this.f6249c.f144041x;
                if (!this.f6254h && c34295c4 != null && this.f6250d.compareTo(((C1589h0) c34295c4.f144034x).f6239a) > 0) {
                    C34293a c34293a3 = this.f6249c;
                    c34293a3.getClass();
                    C34296d c34296d = new C34296d(c34293a3);
                    c34293a3.f144042y.put(c34296d, Boolean.FALSE);
                    while (c34296d.hasNext() && !this.f6254h) {
                        Map.Entry entry2 = (Map.Entry) c34296d.next();
                        InterfaceC1581f0 interfaceC1581f1 = (InterfaceC1581f0) entry2.getKey();
                        C1589h0 c1589h1 = (C1589h0) entry2.getValue();
                        while (c1589h1.f6239a.compareTo(this.f6250d) < 0 && !this.f6254h && this.f6249c.f144029E.containsKey(interfaceC1581f1)) {
                            arrayList.add(c1589h1.f6239a);
                            C1626t c1626t2 = EnumC1632v.Companion;
                            EnumC1635w state = c1589h1.f6239a;
                            c1626t2.getClass();
                            AbstractC22676k.m65750j(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 1) {
                                enumC1632v = EnumC1632v.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                enumC1632v = iOrdinal != 3 ? null : EnumC1632v.ON_RESUME;
                            } else {
                                enumC1632v = EnumC1632v.ON_START;
                            }
                            if (enumC1632v == null) {
                                throw new IllegalStateException("no event up from " + c1589h1.f6239a);
                            }
                            c1589h1.m4979a(interfaceC1585g0, enumC1632v);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f6254h = false;
        this.f6256j.m36570j(this.f6250d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1593i0(InterfaceC1585g0 provider) {
        this(provider, true);
        AbstractC22676k.m65750j(provider, "provider");
    }
}
