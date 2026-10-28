package p031b9;

import com.whoop.service.network.model.UserSessionDto;
import java.util.HashMap;
import java.util.Iterator;
import live.hms.video.error.ErrorCodes;
import p284ko.C22631o;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C2844k {

    /* JADX INFO: renamed from: a */
    public final C22631o f11235a;

    /* JADX INFO: renamed from: b */
    public final long f11236b;

    /* JADX INFO: renamed from: c */
    public final long f11237c;

    /* JADX INFO: renamed from: d */
    public final long f11238d;

    /* JADX INFO: renamed from: e */
    public final long f11239e;

    /* JADX INFO: renamed from: f */
    public final int f11240f;

    /* JADX INFO: renamed from: g */
    public final long f11241g;

    /* JADX INFO: renamed from: h */
    public final HashMap f11242h;

    /* JADX INFO: renamed from: i */
    public long f11243i;

    public C2844k() {
        C22631o c22631o = new C22631o(1);
        m8157a(1000, 0, "bufferForPlaybackMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        m8157a(ErrorCodes.InitAPIErrors.cServerErrors, 0, "bufferForPlaybackAfterRebufferMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        m8157a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        m8157a(50000, ErrorCodes.InitAPIErrors.cServerErrors, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m8157a(50000, 50000, "maxBufferMs", "minBufferMs");
        m8157a(0, 0, "backBufferDurationMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        this.f11235a = c22631o;
        long j7 = 50000;
        this.f11236b = AbstractC38065t.m121896J(j7);
        this.f11237c = AbstractC38065t.m121896J(j7);
        this.f11238d = AbstractC38065t.m121896J(1000);
        this.f11239e = AbstractC38065t.m121896J(ErrorCodes.InitAPIErrors.cServerErrors);
        this.f11240f = -1;
        this.f11241g = AbstractC38065t.m121896J(0);
        this.f11242h = new HashMap();
        this.f11243i = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static void m8157a(int i13, int i14, String str, String str2) {
        AbstractC35849g.m113803e(i13 >= i14, str + " cannot be less than " + str2);
    }

    /* JADX INFO: renamed from: b */
    public final int m8158b() {
        Iterator it = this.f11242h.values().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((C2841j) it.next()).f11222b;
        }
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8159c(C2851m0 c2851m0) {
        int i13;
        long j7 = this.f11237c;
        C2841j c2841j = (C2841j) this.f11242h.get(c2851m0.f11316a);
        c2841j.getClass();
        C22631o c22631o = this.f11235a;
        synchronized (c22631o) {
            i13 = c22631o.f89030e * c22631o.f89028c;
        }
        boolean z4 = i13 >= m8158b();
        long jMin = this.f11236b;
        float f13 = c2851m0.f11318c;
        if (f13 > 1.0f) {
            jMin = Math.min(AbstractC38065t.m121928u(f13, jMin), j7);
        }
        long jMax = Math.max(jMin, 500000L);
        long j13 = c2851m0.f11317b;
        if (j13 < jMax) {
            c2841j.f11221a = !z4;
            if (z4 && j13 < 500000) {
                AbstractC38046a.m121826u("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j13 >= j7 || z4) {
            c2841j.f11221a = false;
        }
        return c2841j.f11221a;
    }

    /* JADX INFO: renamed from: d */
    public final void m8160d() {
        if (!this.f11242h.isEmpty()) {
            this.f11235a.m65566a(m8158b());
            return;
        }
        C22631o c22631o = this.f11235a;
        synchronized (c22631o) {
            if (c22631o.f89027b) {
                c22631o.m65566a(0);
            }
        }
    }
}
