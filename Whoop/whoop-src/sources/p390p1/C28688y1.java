package p390p1;

import ad3.C0783z;
import androidx.compose.runtime.ComposeRuntimeError;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3027k1;
import bh.C3245h;
import bp0.C3526n;
import c93.InterfaceC4351m;
import com.google.crypto.tink.internal.C5101l0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25262p;
import m83.C25271y;
import p002a0.AbstractC0018e1;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p007a6.C0428i;
import p446r1.C30847a;
import p446r1.C30849c;
import p446r1.C30851e;
import p474s.C31983m2;
import p482s7.AbstractC32237a;
import p537ux.C35331f0;
import p540v1.C35524b;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p668z1.C39958g;
import p714k80.C22275d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p1.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28688y1 extends AbstractC28667t {

    /* JADX INFO: renamed from: a */
    public long f116035a;

    /* JADX INFO: renamed from: b */
    public final C28607e f116036b;

    /* JADX INFO: renamed from: c */
    public final Object f116037c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3027k1 f116038d;

    /* JADX INFO: renamed from: e */
    public Throwable f116039e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f116040f;

    /* JADX INFO: renamed from: g */
    public Object f116041g;

    /* JADX INFO: renamed from: h */
    public C0059w0 f116042h;

    /* JADX INFO: renamed from: i */
    public final C30849c f116043i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f116044j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f116045k;

    /* JADX INFO: renamed from: l */
    public final C0057v0 f116046l;

    /* JADX INFO: renamed from: m */
    public final C5101l0 f116047m;

    /* JADX INFO: renamed from: n */
    public final C0057v0 f116048n;

    /* JADX INFO: renamed from: o */
    public final C0057v0 f116049o;

    /* JADX INFO: renamed from: p */
    public ArrayList f116050p;

    /* JADX INFO: renamed from: q */
    public LinkedHashSet f116051q;

    /* JADX INFO: renamed from: r */
    public C3033m f116052r;

    /* JADX INFO: renamed from: s */
    public C0783z f116053s;

    /* JADX INFO: renamed from: t */
    public boolean f116054t;

    /* JADX INFO: renamed from: u */
    public final C13045h2 f116055u;

    /* JADX INFO: renamed from: v */
    public final C31983m2 f116056v;

    /* JADX INFO: renamed from: w */
    public final C3031l1 f116057w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f116058x;

    /* JADX INFO: renamed from: y */
    public final C28676v0 f116059y;

    /* JADX INFO: renamed from: z */
    public static final C13045h2 f116034z = AbstractC13091v.m36593c(C35524b.f151145z);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f116033A = new AtomicReference(Boolean.FALSE);

    public C28688y1(InterfaceC30063j interfaceC30063j) {
        C28607e c28607e = new C28607e(new C25262p(this, 8));
        this.f116036b = c28607e;
        this.f116037c = new Object();
        this.f116040f = new ArrayList();
        this.f116042h = new C0059w0();
        this.f116043i = new C30849c(new C28679w[16]);
        this.f116044j = new ArrayList();
        this.f116045k = new ArrayList();
        this.f116046l = new C0057v0();
        this.f116047m = new C5101l0(29);
        this.f116048n = new C0057v0();
        this.f116049o = new C0057v0();
        this.f116055u = AbstractC13091v.m36593c(EnumC28681w1.f116016y);
        this.f116056v = new C31983m2(10);
        C3031l1 c3031l1 = new C3031l1((InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w));
        c3031l1.invokeOnCompletion(new C0428i(this, 26));
        this.f116057w = c3031l1;
        this.f116058x = interfaceC30063j.plus(c28607e).plus(c3031l1);
        this.f116059y = new C28676v0(8);
    }

    /* JADX INFO: renamed from: B */
    public static final void m87281B(ArrayList arrayList, C28688y1 c28688y1, C28679w c28679w) {
        arrayList.clear();
        synchronized (c28688y1.f116037c) {
            Iterator it = c28688y1.f116045k.iterator();
            while (it.hasNext()) {
                AbstractC28687y0 abstractC28687y0 = (AbstractC28687y0) it.next();
                if (AbstractC22676k.m65745e(abstractC28687y0.m87277b(), c28679w)) {
                    arrayList.add(abstractC28687y0);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m87282u(C39949b c39949b) {
        try {
            if (c39949b.mo128127w() instanceof C39958g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c39949b.mo128122c();
        } catch (Throwable th3) {
            c39949b.mo128122c();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m87283A(C28679w c28679w) {
        synchronized (this.f116037c) {
            ArrayList arrayList = this.f116045k;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (AbstractC22676k.m65745e(((AbstractC28687y0) arrayList.get(i13)).m87277b(), c28679w)) {
                    ArrayList arrayList2 = new ArrayList();
                    m87281B(arrayList2, this, c28679w);
                    while (!arrayList2.isEmpty()) {
                        m87284C(arrayList2, null);
                        m87281B(arrayList2, this, c28679w);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final List m87284C(List list, C0059w0 c0059w0) {
        C39949b c39949bMo128121C;
        ArrayList<C23465k> arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            C28679w c28679wM87277b = ((AbstractC28687y0) obj).m87277b();
            Object arrayList2 = map.get(c28679wM87277b);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(c28679wM87277b, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C28679w c28679w = (C28679w) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c28679w.f116004V.f115890F) {
                AbstractC28659r.m87192c("Check failed");
            }
            C0428i c0428i = new C0428i(c28679w, 25);
            C3526n c3526n = new C3526n(28, c28679w, c0059w0);
            AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
            C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
            if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(c0428i, c3526n)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                try {
                    synchronized (this.f116037c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                AbstractC28687y0 abstractC28687y0 = (AbstractC28687y0) list2.get(i14);
                                C0057v0 c0057v0 = this.f116046l;
                                abstractC28687y0.getClass();
                                Object objM94882b = C30847a.m94882b(c0057v0);
                                arrayList.add(new C23465k(abstractC28687y0, objM94882b));
                            }
                            int size3 = arrayList.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                C23465k c23465k = (C23465k) arrayList.get(i15);
                                if (c23465k.f92938x == null) {
                                    C5101l0 c5101l0 = this.f116047m;
                                    ((AbstractC28687y0) c23465k.f92937w).getClass();
                                    if (((C0057v0) c5101l0.f21443x).m124b(null)) {
                                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                                        for (C23465k c23465k2 : arrayList) {
                                            if (c23465k2.f92938x == null) {
                                                C5101l0 c5101l1 = this.f116047m;
                                                ((AbstractC28687y0) c23465k2.f92937w).getClass();
                                                C0057v0 c0057v1 = (C0057v0) c5101l1.f21443x;
                                                if (c0057v1.m131i()) {
                                                    ((C0057v0) c5101l1.f21444y).m123a();
                                                }
                                            }
                                            arrayList3.add(c23465k2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        if (((C23465k) arrayList.get(i16)).f92938x != null) {
                            int size5 = arrayList.size();
                            for (int i17 = 0; i17 < size5; i17++) {
                                if (((C23465k) arrayList.get(i17)).f92938x == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i18 = 0; i18 < size6; i18++) {
                                        C23465k c23465k3 = (C23465k) arrayList.get(i18);
                                        if (c23465k3.f92938x == null) {
                                        }
                                    }
                                    synchronized (this.f116037c) {
                                        AbstractC25265s.m74141p0(this.f116045k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i19 = 0; i19 < size7; i19++) {
                                        Object obj2 = arrayList.get(i19);
                                        if (((C23465k) obj2).f92938x != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c28679w.m87223q(arrayList);
                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                    m87282u(c39949bMo128121C);
                } catch (Throwable th4) {
                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                    throw th4;
                }
            } catch (Throwable th5) {
                m87282u(c39949bMo128121C);
                throw th5;
            }
        }
        return AbstractC25265s.m74093D1(map.keySet());
    }

    /* JADX INFO: renamed from: D */
    public final C28679w m87285D(C28679w c28679w, C0059w0 c0059w0) {
        C39949b c39949bMo128121C;
        if (c28679w.f116004V.f115890F || c28679w.f116005W == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f116051q;
        if (linkedHashSet == null || !linkedHashSet.contains(c28679w)) {
            C0428i c0428i = new C0428i(c28679w, 25);
            C3526n c3526n = new C3526n(28, c28679w, c0059w0);
            AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
            C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
            if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(c0428i, c3526n)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                if (c0059w0 != null) {
                    try {
                        if (c0059w0.m143h()) {
                            C22275d c22275d = new C22275d(7, c0059w0, c28679w);
                            C28655q c28655q = c28679w.f116004V;
                            if (c28655q.f115890F) {
                                AbstractC28659r.m87192c("Preparing a composition while composing is not supported");
                            }
                            c28655q.f115890F = true;
                            try {
                                c22275d.invoke();
                                c28655q.f115890F = false;
                            } catch (Throwable th3) {
                                c28655q.f115890F = false;
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        AbstractC39957f.m128151q(abstractC39957fM128153j);
                        throw th4;
                    }
                }
                boolean zM87229w = c28679w.m87229w();
                AbstractC39957f.m128151q(abstractC39957fM128153j);
                m87282u(c39949bMo128121C);
                if (zM87229w) {
                    return c28679w;
                }
            } catch (Throwable th5) {
                m87282u(c39949bMo128121C);
                throw th5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m87286E(Throwable th3, C28679w c28679w) throws Throwable {
        if (!((Boolean) f116033A.get()).booleanValue() || (th3 instanceof ComposeRuntimeError)) {
            synchronized (this.f116037c) {
                C0783z c0783z = this.f116053s;
                if (c0783z != null) {
                    throw ((Throwable) c0783z.f2818x);
                }
                this.f116053s = new C0783z(th3, 25);
            }
            throw th3;
        }
        synchronized (this.f116037c) {
            try {
                AbstractC32237a.m100297k("Error was captured in composition while live edit was enabled.", th3);
                this.f116044j.clear();
                this.f116043i.m94890g();
                this.f116042h = new C0059w0();
                this.f116045k.clear();
                this.f116046l.m123a();
                this.f116048n.m123a();
                this.f116053s = new C0783z(th3, 25);
                if (c28679w != null) {
                    m87288G(c28679w);
                }
                m87291w();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m87287F() {
        synchronized (this.f116037c) {
            boolean z4 = true;
            if (this.f116042h.m142g()) {
                if (this.f116043i.f127229y == 0 && !m87292x() && !this.f116046l.m132j()) {
                    z4 = false;
                }
                return z4;
            }
            List listM87294z = m87294z();
            C30851e c30851e = new C30851e(this.f116042h);
            this.f116042h = new C0059w0();
            try {
                int size = listM87294z.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C28679w) listM87294z.get(i13)).m87230x(c30851e);
                    if (((EnumC28681w1) this.f116055u.getValue()).compareTo(EnumC28681w1.f116015x) <= 0) {
                        break;
                    }
                }
                synchronized (this.f116037c) {
                    if (m87291w() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f116043i.f127229y == 0 && !m87292x() && !this.f116046l.m132j()) {
                        z4 = false;
                    }
                }
                return z4;
            } catch (Throwable th3) {
                synchronized (this.f116037c) {
                    C0059w0 c0059w0 = this.f116042h;
                    c0059w0.getClass();
                    Iterator<E> it = c30851e.iterator();
                    while (it.hasNext()) {
                        c0059w0.m146k(it.next());
                    }
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m87288G(C28679w c28679w) {
        ArrayList arrayList = this.f116050p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f116050p = arrayList;
        }
        if (!arrayList.contains(c28679w)) {
            arrayList.add(c28679w);
        }
        if (this.f116040f.remove(c28679w)) {
            this.f116041g = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object m87289H(AbstractC32275i abstractC32275i) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.f116036b, new C3245h(this, new C28685x1(this, null), AbstractC28683x.m87268v(abstractC32275i.getContext()), null), abstractC32275i);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM8705K != enumC31071a) {
            objM8705K = c23454a0;
        }
        return objM8705K == enumC31071a ? objM8705K : c23454a0;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: a */
    public final void mo87090a(C28679w c28679w, InterfaceC4351m interfaceC4351m) throws Throwable {
        EnumC28681w1 enumC28681w1;
        boolean zContains;
        C39949b c39949bMo128121C;
        boolean z4 = c28679w.f116004V.f115890F;
        synchronized (this.f116037c) {
            EnumC28681w1 enumC28681w2 = (EnumC28681w1) this.f116055u.getValue();
            enumC28681w1 = EnumC28681w1.f116015x;
            zContains = enumC28681w2.compareTo(enumC28681w1) > 0 ? true ^ m87294z().contains(c28679w) : true;
        }
        try {
            C0428i c0428i = new C0428i(c28679w, 25);
            C3526n c3526n = new C3526n(28, c28679w, (Object) null);
            AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
            C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
            if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(c0428i, c3526n)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                try {
                    c28679w.m87216j(interfaceC4351m);
                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                    m87282u(c39949bMo128121C);
                    synchronized (this.f116037c) {
                        if (((EnumC28681w1) this.f116055u.getValue()).compareTo(enumC28681w1) > 0 && !m87294z().contains(c28679w)) {
                            this.f116040f.add(c28679w);
                            this.f116041g = null;
                        }
                    }
                    if (!z4) {
                        AbstractC39963l.m128171k().mo128125m();
                    }
                    try {
                        m87283A(c28679w);
                        try {
                            c28679w.m87210d();
                            c28679w.m87212f();
                            if (z4) {
                                return;
                            }
                            AbstractC39963l.m128171k().mo128125m();
                        } catch (Throwable th3) {
                            m87286E(th3, null);
                        }
                    } catch (Throwable th4) {
                        m87286E(th4, c28679w);
                    }
                } catch (Throwable th5) {
                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                    throw th5;
                }
            } catch (Throwable th6) {
                m87282u(c39949bMo128121C);
                throw th6;
            }
        } catch (Throwable th7) {
            if (zContains) {
                synchronized (this.f116037c) {
                }
            }
            m87286E(th7, c28679w);
        }
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: b */
    public final C0059w0 mo87091b(C28679w c28679w, C35331f0 c35331f0, InterfaceC4351m interfaceC4351m) {
        C31983m2 c31983m2 = this.f116056v;
        try {
            C35331f0 c35331f1 = c28679w.f115998P;
            c28679w.f115998P = c35331f0;
            try {
                mo87090a(c28679w, interfaceC4351m);
                C0059w0 c0059w0 = (C0059w0) c31983m2.m99482f();
                if (c0059w0 == null) {
                    c0059w0 = AbstractC0018e1.f44a;
                    AbstractC22676k.m65748h(c0059w0, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                c28679w.f115998P = c35331f1;
                c31983m2.m99492s(null);
                return c0059w0;
            } catch (Throwable th3) {
                c28679w.f115998P = c35331f1;
                throw th3;
            }
        } catch (Throwable th4) {
            c31983m2.m99492s(null);
            throw th4;
        }
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: d */
    public final boolean mo87093d() {
        return ((Boolean) f116033A.get()).booleanValue();
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: e */
    public final boolean mo87094e() {
        return false;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: f */
    public final boolean mo87095f() {
        return false;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: g */
    public final long mo87096g() {
        return 1000;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: h */
    public final InterfaceC28663s mo87097h() {
        return null;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: j */
    public final InterfaceC30063j mo87099j() {
        return this.f116058x;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: k */
    public final void mo87100k(C28679w c28679w) {
        InterfaceC3025k interfaceC3025kM87291w;
        synchronized (this.f116037c) {
            if (this.f116043i.m94891h(c28679w)) {
                interfaceC3025kM87291w = null;
            } else {
                this.f116043i.m94885b(c28679w);
                interfaceC3025kM87291w = m87291w();
            }
        }
        if (interfaceC3025kM87291w != null) {
            ((C3033m) interfaceC3025kM87291w).resumeWith(C23454a0.f92919a);
        }
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: l */
    public final AbstractC28684x0 mo87101l(AbstractC28687y0 abstractC28687y0) {
        AbstractC28684x0 abstractC28684x0;
        synchronized (this.f116037c) {
            abstractC28684x0 = (AbstractC28684x0) this.f116048n.m133k(abstractC28687y0);
        }
        return abstractC28684x0;
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: m */
    public final C0059w0 mo87102m(C28679w c28679w, C35331f0 c35331f0, C0059w0 c0059w0) {
        C31983m2 c31983m2 = this.f116056v;
        try {
            m87287F();
            c28679w.m87230x(new C30851e(c0059w0));
            C35331f0 c35331f1 = c28679w.f115998P;
            c28679w.f115998P = c35331f0;
            try {
                C28679w c28679wM87285D = m87285D(c28679w, null);
                if (c28679wM87285D != null) {
                    m87283A(c28679w);
                    c28679wM87285D.m87210d();
                    c28679wM87285D.m87212f();
                }
                C0059w0 c0059w1 = (C0059w0) c31983m2.m99482f();
                if (c0059w1 == null) {
                    c0059w1 = AbstractC0018e1.f44a;
                    AbstractC22676k.m65748h(c0059w1, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                c28679w.f115998P = c35331f1;
                c31983m2.m99492s(null);
                return c0059w1;
            } catch (Throwable th3) {
                c28679w.f115998P = c35331f1;
                throw th3;
            }
        } catch (Throwable th4) {
            c31983m2.m99492s(null);
            throw th4;
        }
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: n */
    public final void mo87103n(Set set) {
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: p */
    public final void mo87105p(C28677v1 c28677v1) {
        C31983m2 c31983m2 = this.f116056v;
        C0059w0 c0059w0 = (C0059w0) c31983m2.m99482f();
        if (c0059w0 == null) {
            C0059w0 c0059w1 = AbstractC0018e1.f44a;
            c0059w0 = new C0059w0();
            c31983m2.m99492s(c0059w0);
        }
        c0059w0.m136a(c28677v1);
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: q */
    public final void mo87106q(C28679w c28679w) {
        synchronized (this.f116037c) {
            try {
                LinkedHashSet linkedHashSet = this.f116051q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f116051q = linkedHashSet;
                }
                linkedHashSet.add(c28679w);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p390p1.AbstractC28667t
    /* JADX INFO: renamed from: t */
    public final void mo87109t(C28679w c28679w) {
        synchronized (this.f116037c) {
            if (this.f116040f.remove(c28679w)) {
                this.f116041g = null;
            }
            this.f116043i.m94893k(c28679w);
            this.f116044j.remove(c28679w);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m87290v() {
        synchronized (this.f116037c) {
            if (((EnumC28681w1) this.f116055u.getValue()).compareTo(EnumC28681w1.f116011E) >= 0) {
                C13045h2 c13045h2 = this.f116055u;
                EnumC28681w1 enumC28681w1 = EnumC28681w1.f116015x;
                c13045h2.getClass();
                c13045h2.m36571k(null, enumC28681w1);
            }
        }
        this.f116057w.cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC3025k m87291w() {
        EnumC28681w1 enumC28681w1;
        C13045h2 c13045h2 = this.f116055u;
        int iCompareTo = ((EnumC28681w1) c13045h2.getValue()).compareTo(EnumC28681w1.f116015x);
        ArrayList arrayList = this.f116045k;
        ArrayList arrayList2 = this.f116044j;
        C30849c c30849c = this.f116043i;
        if (iCompareTo > 0) {
            if (this.f116053s != null) {
                enumC28681w1 = EnumC28681w1.f116016y;
            } else if (this.f116038d == null) {
                this.f116042h = new C0059w0();
                c30849c.m94890g();
                enumC28681w1 = m87292x() ? EnumC28681w1.f116017z : EnumC28681w1.f116016y;
            } else {
                enumC28681w1 = (c30849c.f127229y == 0 && !this.f116042h.m143h() && arrayList2.isEmpty() && arrayList.isEmpty() && !m87292x() && !this.f116046l.m132j()) ? EnumC28681w1.f116011E : EnumC28681w1.f116012F;
            }
            c13045h2.getClass();
            c13045h2.m36571k(null, enumC28681w1);
            if (enumC28681w1 != EnumC28681w1.f116012F) {
                return null;
            }
            C3033m c3033m = this.f116052r;
            this.f116052r = null;
            return c3033m;
        }
        for (C28679w c28679w : m87294z()) {
        }
        this.f116040f.clear();
        this.f116041g = C25271y.f99162w;
        this.f116042h = new C0059w0();
        c30849c.m94890g();
        arrayList2.clear();
        arrayList.clear();
        this.f116050p = null;
        C3033m c3033m2 = this.f116052r;
        if (c3033m2 != null) {
            c3033m2.cancel(null);
        }
        this.f116052r = null;
        this.f116053s = null;
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m87292x() {
        return !this.f116054t && (this.f116036b.f115730z.get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m87293y() {
        boolean z4;
        synchronized (this.f116037c) {
            z4 = this.f116042h.m143h() || this.f116043i.f127229y != 0 || m87292x();
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: z */
    public final List m87294z() {
        ?? r10 = this.f116041g;
        if (r10 != 0) {
            return r10;
        }
        ArrayList arrayList = this.f116040f;
        List arrayList2 = arrayList.isEmpty() ? C25271y.f99162w : new ArrayList(arrayList);
        this.f116041g = arrayList2;
        return arrayList2;
    }
}
