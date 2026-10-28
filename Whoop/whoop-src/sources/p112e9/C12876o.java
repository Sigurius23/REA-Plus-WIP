package p112e9;

import android.os.Handler;
import androidx.media3.common.ParserException;
import ca.C4358a;
import com.whoop.service.network.model.UserSessionDto;
import p113ea.C12890a;
import p284ko.C22631o;
import p299l9.C23534w0;
import p299l9.C23538y0;
import p499t9.C33637j0;
import p499t9.InterfaceC33639k0;
import p516u8.C34585c0;
import p516u8.C34610p;
import p516u8.InterfaceC34594h;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import qg3.C30352d;

/* JADX INFO: renamed from: e9.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C12876o implements InterfaceC33639k0 {

    /* JADX INFO: renamed from: a */
    public final C23538y0 f44321a;

    /* JADX INFO: renamed from: b */
    public final C30352d f44322b = new C30352d(4, (char) 0);

    /* JADX INFO: renamed from: c */
    public final C4358a f44323c = new C4358a(1);

    /* JADX INFO: renamed from: d */
    public long f44324d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C12877p f44325e;

    public C12876o(C12877p c12877p, C22631o c22631o) {
        this.f44325e = c12877p;
        this.f44321a = new C23538y0(c22631o, null, null);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: a */
    public final void mo36173a(C34610p c34610p) {
        this.f44321a.mo36173a(c34610p);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: b */
    public final void mo36174b(long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
        long jM68122e;
        long jM121899M;
        this.f44321a.mo36174b(j7, i13, i14, i15, c33637j0);
        while (this.f44321a.m68132o(false)) {
            C4358a c4358a = this.f44323c;
            c4358a.mo1506o();
            if (this.f44321a.m68135r(this.f44322b, c4358a, 0, false) == -4) {
                c4358a.m1509r();
            } else {
                c4358a = null;
            }
            if (c4358a != null) {
                long j13 = c4358a.f2065G;
                C34585c0 c34585c0M114026m = this.f44325e.f44333y.m114026m(c4358a);
                if (c34585c0M114026m != null) {
                    C12890a c12890a = (C12890a) c34585c0M114026m.f145640a[0];
                    String str = c12890a.f44378a;
                    String str2 = c12890a.f44379b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jM121899M = AbstractC38065t.m121899M(AbstractC38065t.m121921n(c12890a.f44382e));
                        } catch (ParserException unused) {
                            jM121899M = -9223372036854775807L;
                        }
                        if (jM121899M != -9223372036854775807L) {
                            C12875n c12875n = new C12875n(j13, jM121899M);
                            Handler handler = this.f44325e.f44334z;
                            handler.sendMessage(handler.obtainMessage(1, c12875n));
                        }
                    }
                }
            }
        }
        C23538y0 c23538y0 = this.f44321a;
        C23534w0 c23534w0 = c23538y0.f93218a;
        synchronized (c23538y0) {
            int i16 = c23538y0.f93236s;
            jM68122e = i16 == 0 ? -1L : c23538y0.m68122e(i16);
        }
        c23534w0.m68118c(jM68122e);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: c */
    public final int mo36175c(InterfaceC34594h interfaceC34594h, int i13, boolean z4) {
        return this.f44321a.mo36175c(interfaceC34594h, i13, z4);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: d */
    public final void mo36176d(C38059n c38059n, int i13, int i14) {
        this.f44321a.mo36176d(c38059n, i13, 0);
    }
}
