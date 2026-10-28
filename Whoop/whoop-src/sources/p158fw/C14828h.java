package p158fw;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.iterable.iterableapi.RunnableC5343k1;
import java.util.List;
import m83.C25271y;
import mo.C25735p;
import p002a0.C0028i;
import p309lo.C24565w;
import p454r9.C31078c;
import p454r9.C31084i;
import p454r9.C31089n;
import p454r9.C31091p;
import p454r9.InterfaceC31088m;
import p516u8.C34592g;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34629y0;
import p607x8.AbstractC38065t;
import p607x8.C38060o;
import p607x8.C38061p;
import p607x8.C38063r;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: fw.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C14828h {

    /* JADX INFO: renamed from: a */
    public long f55088a;

    /* JADX INFO: renamed from: b */
    public List f55089b;

    /* JADX INFO: renamed from: c */
    public Object f55090c;

    /* JADX INFO: renamed from: d */
    public Object f55091d;

    /* JADX INFO: renamed from: e */
    public final Object f55092e;

    public C14828h() {
        List components = AbstractC14827g.f55087a;
        C14830j flags = C14830j.f55095b;
        AbstractC22676k.m65750j(components, "components");
        AbstractC22676k.m65750j(flags, "flags");
        this.f55089b = C25271y.f99162w;
        this.f55090c = components;
        this.f55091d = flags;
        this.f55088a = 1048576L;
        this.f55092e = " ";
    }

    /* JADX INFO: renamed from: a */
    public void m42619a(boolean z4) {
        this.f55088a = -9223372036854775807L;
        C31084i c31084i = (C31084i) this.f55092e;
        C31078c c31078c = c31084i.f128196f;
        C24565w c24565w = c31084i.f128192b;
        if (c31084i.f128201k == 1) {
            if (z4) {
                C31089n c31089n = c31078c.f128125a;
                C25735p c25735p = c31089n.f128217b;
                c25735p.f101418k = 0L;
                c25735p.f101421n = -1L;
                c25735p.f101419l = -1L;
                c31089n.f128223h = -9223372036854775807L;
                c31089n.f128221f = -9223372036854775807L;
                c31089n.m95744d(1);
                c31089n.f128224i = -9223372036854775807L;
            }
            C31091p c31091p = c31078c.f128127c;
            C24565w c24565w2 = c31091p.f128238d;
            C0028i c0028i = c31091p.f128240f;
            c0028i.f70b = 0;
            c0028i.f71c = 0;
            c31091p.f128241g = -9223372036854775807L;
            C24565w c24565w3 = c31091p.f128239e;
            if (c24565w3.m71658h() > 0) {
                AbstractC35849g.m113802d(c24565w3.m71658h() > 0);
                while (c24565w3.m71658h() > 1) {
                    c24565w3.m71655e();
                }
                Object objM71655e = c24565w3.m71655e();
                objM71655e.getClass();
                c24565w3.m71651a(0L, (Long) objM71655e);
            }
            if (c24565w2.m71658h() > 0) {
                AbstractC35849g.m113802d(c24565w2.m71658h() > 0);
                while (c24565w2.m71658h() > 1) {
                    c24565w2.m71655e();
                }
                Object objM71655e2 = c24565w2.m71655e();
                objM71655e2.getClass();
                c24565w2.m71651a(0L, (C34629y0) objM71655e2);
            }
            c31078c.f128128d.clear();
            while (c24565w.m71658h() > 1) {
                c24565w.m71655e();
            }
            if (c24565w.m71658h() == 1) {
                Long l7 = (Long) c24565w.m71655e();
                l7.getClass();
                c31078c.m95722a(l7.longValue(), c31084i.f128203m);
            }
            c31084i.f128202l = -9223372036854775807L;
            C38063r c38063r = c31084i.f128199i;
            AbstractC35849g.m113808j(c38063r);
            c38063r.m121879c(new RunnableC5343k1(c31084i));
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m42620b(C34610p c34610p) {
        C31084i c31084i = (C31084i) this.f55092e;
        AbstractC35849g.m113807i(c31084i.f128201k == 0);
        C34592g c34592g = c34610p.f145757B;
        if (c34592g == null || !c34592g.m109389d()) {
            c34592g = C34592g.f145657h;
        }
        if (c34592g.f145660c != 7 || AbstractC38065t.f163031a < 34) {
        }
        C38061p c38061p = c31084i.f128197g;
        Looper looperMyLooper = Looper.myLooper();
        AbstractC35849g.m113808j(looperMyLooper);
        c31084i.f128199i = c38061p.m121874a(looperMyLooper, null);
        try {
            c31084i.f128193c.m95739a();
            throw null;
        } catch (VideoFrameProcessingException e5) {
            throw new VideoSink$VideoSinkException(e5, c34610p);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m42621c(int i13) {
        C25735p c25735p = ((C31084i) this.f55092e).f128196f.f128125a.f128217b;
        if (c25735p.f101415h == i13) {
            return;
        }
        c25735p.f101415h = i13;
        c25735p.m75877d(true);
    }

    /* JADX INFO: renamed from: d */
    public void m42622d(Surface surface, C38060o c38060o) {
        C31084i c31084i = (C31084i) this.f55092e;
        Pair pair = c31084i.f128200j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C38060o) c31084i.f128200j.second).equals(c38060o)) {
            return;
        }
        c31084i.f128200j = Pair.create(surface, c38060o);
        int i13 = c38060o.f163021a;
    }

    /* JADX INFO: renamed from: e */
    public void m42623e(float f13) {
        ((C31084i) this.f55092e).f128196f.f128125a.m95747g(f13);
    }

    /* JADX INFO: renamed from: f */
    public void m42624f(long j7, long j13) {
        C31084i c31084i = (C31084i) this.f55092e;
        C24565w c24565w = c31084i.f128192b;
        long j14 = this.f55088a;
        c24565w.m71651a(j14 == -9223372036854775807L ? 0L : j14 + 1, Long.valueOf(j7));
        c31084i.f128203m = j13;
        c31084i.f128196f.m95722a(0L, j13);
    }

    /* JADX INFO: renamed from: g */
    public void m42625g(List list) {
        if (((C41060w0) this.f55089b).equals(list)) {
            return;
        }
        C31084i c31084i = (C31084i) this.f55092e;
        c31084i.f128193c.getClass();
        C41014d0 c41014d0 = new C41014d0(4);
        c41014d0.m133224c(list);
        c41014d0.m133224c(c31084i.f128195e);
        this.f55089b = c41014d0.m133239f();
        C34610p c34610p = (C34610p) this.f55090c;
        if (c34610p == null) {
            return;
        }
        C34608o c34608oM109410a = c34610p.m109410a();
        C34592g c34592g = c34610p.f145757B;
        if (c34592g == null || !c34592g.m109389d()) {
            c34592g = C34592g.f145657h;
        }
        c34608oM109410a.f145717A = c34592g;
        c34608oM109410a.m109403a();
        AbstractC35849g.m113808j(null);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void m42626h(InterfaceC31088m interfaceC31088m) {
        ((C31084i) this.f55092e).f128196f.f128133i = interfaceC31088m;
    }

    /* JADX INFO: renamed from: i */
    public void m42627i() {
        C31084i c31084i = (C31084i) this.f55092e;
        if (c31084i.f128202l >= this.f55088a) {
            long j7 = c31084i.f128196f.f128127c.f128241g;
        }
    }

    public C14828h(C31084i c31084i, Context context) {
        this.f55092e = c31084i;
        AbstractC38065t.m121894H(context);
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f55089b = C41060w0.f177067E;
        this.f55088a = -9223372036854775807L;
        this.f55091d = C31084i.f128190o;
    }
}
