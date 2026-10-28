package p668z1;

import p491t1.AbstractC33272c;
import p491t1.C33275f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39968q {

    /* JADX INFO: renamed from: a */
    public static final Object f172474a = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m128187a(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException("index (" + i13 + ") is out of bound of [0, " + i14 + ')');
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m128188b(C39974w c39974w, int i13, AbstractC33272c abstractC33272c, boolean z4) {
        boolean z13;
        synchronized (f172474a) {
            try {
                int i14 = c39974w.f172505d;
                if (i14 == i13) {
                    c39974w.f172504c = abstractC33272c;
                    z13 = true;
                    if (z4) {
                        c39974w.f172506e++;
                    }
                    c39974w.f172505d = i14 + 1;
                } else {
                    z13 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13;
    }

    /* JADX INFO: renamed from: c */
    public static final int m128189c(long[] jArr, long j7) {
        int length = jArr.length - 1;
        int i13 = 0;
        while (i13 <= length) {
            int i14 = (i13 + length) >>> 1;
            long j13 = jArr[i14];
            if (j7 > j13) {
                i13 = i14 + 1;
            } else {
                if (j7 >= j13) {
                    return i14;
                }
                length = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final C39974w m128190e(C39967p c39967p) {
        C39974w c39974w = c39967p.f172473w;
        AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (C39974w) AbstractC39963l.m128180t(c39974w, c39967p);
    }

    /* JADX INFO: renamed from: f */
    public static final int m128191f(C39967p c39967p) {
        C39974w c39974w = c39967p.f172473w;
        AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((C39974w) AbstractC39963l.m128169i(c39974w)).f172506e;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m128192g(C39967p c39967p, Function1 function1) {
        int i13;
        AbstractC33272c abstractC33272c;
        Object objInvoke;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (f172474a) {
                C39974w c39974w = c39967p.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            C33275f c33275fMo105554g = abstractC33272c.mo105554g();
            objInvoke = function1.invoke(c33275fMo105554g);
            AbstractC33272c abstractC33272cM105581d = c33275fMo105554g.m105581d();
            if (AbstractC22676k.m65745e(abstractC33272cM105581d, abstractC33272c)) {
                break;
            }
            C39974w c39974w3 = c39967p.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, c39967p, abstractC39957fM128171k), i13, abstractC33272cM105581d, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, c39967p);
        } while (!zM128188b);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo128155d();
}
