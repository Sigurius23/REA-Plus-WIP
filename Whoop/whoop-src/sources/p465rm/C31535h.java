package p465rm;

import com.whoop.service.network.model.UserSessionDto;
import live.hms.video.error.ErrorCodes;
import p284ko.C22631o;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: rm.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31535h {

    /* JADX INFO: renamed from: a */
    public final C22631o f130152a;

    /* JADX INFO: renamed from: b */
    public final long f130153b;

    /* JADX INFO: renamed from: c */
    public final long f130154c;

    /* JADX INFO: renamed from: d */
    public final long f130155d;

    /* JADX INFO: renamed from: e */
    public final long f130156e;

    /* JADX INFO: renamed from: f */
    public final int f130157f;

    /* JADX INFO: renamed from: g */
    public final long f130158g;

    /* JADX INFO: renamed from: h */
    public int f130159h;

    /* JADX INFO: renamed from: i */
    public boolean f130160i;

    public C31535h() {
        C22631o c22631o = new C22631o(0);
        m97140a(2500, 0, "bufferForPlaybackMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        m97140a(ErrorCodes.WebsocketMethodErrors.cServerErrors, 0, "bufferForPlaybackAfterRebufferMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        m97140a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m97140a(50000, ErrorCodes.WebsocketMethodErrors.cServerErrors, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m97140a(50000, 50000, "maxBufferMs", "minBufferMs");
        m97140a(0, 0, "backBufferDurationMs", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        this.f130152a = c22631o;
        long j7 = 50000;
        this.f130153b = AbstractC24567y.m71695z(j7);
        this.f130154c = AbstractC24567y.m71695z(j7);
        this.f130155d = AbstractC24567y.m71695z(2500);
        this.f130156e = AbstractC24567y.m71695z(ErrorCodes.WebsocketMethodErrors.cServerErrors);
        this.f130157f = -1;
        this.f130159h = 13107200;
        this.f130158g = AbstractC24567y.m71695z(0);
    }

    /* JADX INFO: renamed from: a */
    public static void m97140a(int i13, int i14, String str, String str2) {
        boolean z4 = i13 >= i14;
        StringBuilder sb4 = new StringBuilder(str2.length() + str.length() + 21);
        sb4.append(str);
        sb4.append(" cannot be less than ");
        sb4.append(str2);
        AbstractC24543a.m71570f(z4, sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public final void m97141b(boolean z4) {
        int i13 = this.f130157f;
        if (i13 == -1) {
            i13 = 13107200;
        }
        this.f130159h = i13;
        this.f130160i = false;
        if (z4) {
            C22631o c22631o = this.f130152a;
            synchronized (c22631o) {
                if (c22631o.f89027b) {
                    c22631o.m65566a(0);
                }
            }
        }
    }
}
