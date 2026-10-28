package p668z1;

import c41.C4065l3;
import c93.InterfaceC4339a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m83.AbstractC25265s;
import p002a0.C0039m0;
import p390p1.AbstractC28657q1;
import p390p1.AbstractC28659r;
import p446r1.C30849c;
import p459rf.C31345p;
import p602x1.AbstractC37817c;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import vd1.C35909c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: z1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C39973v {

    /* JADX INFO: renamed from: a */
    public final Function1 f172494a;

    /* JADX INFO: renamed from: c */
    public boolean f172496c;

    /* JADX INFO: renamed from: h */
    public C35909c f172501h;

    /* JADX INFO: renamed from: i */
    public C39972u f172502i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f172495b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C4065l3 f172497d = new C4065l3(this, 15);

    /* JADX INFO: renamed from: e */
    public final C31345p f172498e = new C31345p(this, 11);

    /* JADX INFO: renamed from: f */
    public final C30849c f172499f = new C30849c(new C39972u[16]);

    /* JADX INFO: renamed from: g */
    public final Object f172500g = new Object();

    /* JADX INFO: renamed from: j */
    public long f172503j = -1;

    public C39973v(Function1 function1) {
        this.f172494a = function1;
    }

    /* JADX INFO: renamed from: a */
    public final void m128201a() {
        synchronized (this.f172500g) {
            C30849c c30849c = this.f172499f;
            Object[] objArr = c30849c.f127227w;
            int i13 = c30849c.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C39972u c39972u = (C39972u) objArr[i14];
                c39972u.f172486e.m123a();
                c39972u.f172487f.m123a();
                c39972u.f172492k.m123a();
                c39972u.f172493l.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:12:0x002e->B:23:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:24:0x007a, B:26:0x0082, B:31:0x0092, B:28:0x0087, B:9:0x0022, B:12:0x002e, B:14:0x0043, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:23:0x0073, B:32:0x0098), top: B:37:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:24:0x007a BREAK  A[LOOP:1: B:12:0x002e->B:23:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: b */
    public final void m128202b(Object obj) {
        int i13;
        synchronized (this.f172500g) {
            try {
                C30849c c30849c = this.f172499f;
                int i14 = c30849c.f127229y;
                int i15 = 0;
                int i16 = 0;
                while (i15 < i14) {
                    C39972u c39972u = (C39972u) c30849c.f127227w[i15];
                    C0039m0 c0039m0 = (C0039m0) c39972u.f172487f.m133k(obj);
                    if (c0039m0 == null) {
                        i13 = i15;
                    } else {
                        Object[] objArr = c0039m0.f115b;
                        int[] iArr = c0039m0.f116c;
                        long[] jArr = c0039m0.f114a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j7 = jArr[i17];
                                i13 = i15;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        if ((j7 & 255) < 128) {
                                            int i24 = (i17 << 3) + i19;
                                            Object obj2 = objArr[i24];
                                            int i25 = iArr[i24];
                                            c39972u.m128199d(obj, obj2);
                                        }
                                        j7 >>= 8;
                                    }
                                    if (i18 != 8) {
                                        break;
                                    }
                                    if (i17 != length) {
                                        break;
                                    }
                                    i17++;
                                    i15 = i13;
                                } else if (i17 != length) {
                                    break;
                                    break;
                                } else {
                                    i17++;
                                    i15 = i13;
                                }
                            }
                        } else {
                            i13 = i15;
                        }
                    }
                    if (!c39972u.f172487f.m132j()) {
                        i16++;
                    } else if (i16 > 0) {
                        Object[] objArr2 = c30849c.f127227w;
                        objArr2[i13 - i16] = objArr2[i13];
                    }
                    i15 = i13 + 1;
                }
                int i26 = i14 - i16;
                Arrays.fill(c30849c.f127227w, i26, i14, (Object) null);
                c30849c.f127229y = i26;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m128203c() {
        boolean z4;
        Set set;
        Set set2;
        synchronized (this.f172500g) {
            z4 = this.f172496c;
        }
        if (z4) {
            return false;
        }
        boolean z13 = false;
        while (true) {
            AtomicReference atomicReference = this.f172495b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC28659r.m87193d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z13;
            }
            synchronized (this.f172500g) {
                C30849c c30849c = this.f172499f;
                Object[] objArr = c30849c.f127227w;
                int i13 = c30849c.f127229y;
                for (int i14 = 0; i14 < i13; i14++) {
                    z13 = ((C39972u) objArr[i14]).m128197b(set) || z13;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128204d(InterfaceC4339a interfaceC4339a, Function1 function1, Object obj) {
        Object obj2;
        C39972u c39972u;
        synchronized (this.f172500g) {
            C30849c c30849c = this.f172499f;
            Object[] objArr = c30849c.f127227w;
            int i13 = c30849c.f127229y;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i14];
                if (((C39972u) obj2).f172482a == function1) {
                    break;
                } else {
                    i14++;
                }
            }
            c39972u = (C39972u) obj2;
            if (c39972u == null) {
                AbstractC22676k.m65748h(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC22681m0.m65774e(1, function1);
                c39972u = new C39972u(function1);
                c30849c.m94885b(c39972u);
            }
        }
        C39972u c39972u2 = this.f172502i;
        long j7 = this.f172503j;
        if (j7 != -1 && j7 != AbstractC37817c.m121342c()) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbM125596b.append(AbstractC37817c.m121342c());
            sbM125596b.append(", name=");
            sbM125596b.append(Thread.currentThread().getName());
            sbM125596b.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            AbstractC28657q1.m87188a(sbM125596b.toString());
        }
        try {
            this.f172502i = c39972u;
            this.f172503j = AbstractC37817c.m121342c();
            c39972u.m128196a(obj, this.f172498e, interfaceC4339a);
        } finally {
            this.f172502i = c39972u2;
            this.f172503j = j7;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m128205e() {
        C4065l3 c4065l3 = this.f172497d;
        AbstractC39963l.m128166f(AbstractC39963l.f172460a);
        synchronized (AbstractC39963l.f172462c) {
            AbstractC39963l.f172467h = AbstractC25265s.m74128f1(c4065l3, (Collection) AbstractC39963l.f172467h);
        }
        this.f172501h = new C35909c(c4065l3, 4);
    }
}
