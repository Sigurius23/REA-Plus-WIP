package p292l1;

import c93.InterfaceC4339a;
import com.whoop.stories.C10270c;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.net.SocketTimeoutException;
import l83.C23454a0;
import le3.C23886g;
import le3.C23890k;
import ne3.C26624l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr1.C31763b;

/* JADX INFO: renamed from: l1.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23121k0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91351w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f91352x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f91353y;

    public /* synthetic */ C23121k0(long j7, String str) {
        this.f91351w = 3;
        this.f91352x = j7;
        this.f91353y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C23890k c23890k;
        switch (this.f91351w) {
            case 0:
                ((Function1) this.f91353y).invoke(Long.valueOf(this.f91352x));
                return C23454a0.f92919a;
            case 1:
                C23886g c23886g = (C23886g) this.f91353y;
                long j7 = this.f91352x;
                synchronized (c23886g) {
                    try {
                        if (!c23886g.f94466v && (c23890k = c23886g.f94456l) != null) {
                            int i13 = c23886g.f94468x ? c23886g.f94467w : -1;
                            c23886g.f94467w++;
                            c23886g.f94468x = true;
                            if (i13 != -1) {
                                StringBuilder sb4 = new StringBuilder("sent ping but didn't receive pong within ");
                                sb4.append(c23886g.f94448d);
                                sb4.append("ms (after ");
                                C23886g.m70159d(c23886g, new SocketTimeoutException(AbstractC18489d0.m53371l(sb4, i13 - 1, " successful ping/pongs)")), null, 2);
                            } else {
                                try {
                                    C26624l payload = C26624l.f105881E;
                                    AbstractC22676k.m65750j(payload, "payload");
                                    c23890k.m70171b(9, payload);
                                } catch (IOException e5) {
                                    C23886g.m70159d(c23886g, e5, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Long.valueOf(j7);
            case 2:
                return C10270c.m26197O((C10270c) this.f91353y, this.f91352x);
            default:
                return C31763b.m98617v(this.f91352x, (String) this.f91353y);
        }
    }

    public /* synthetic */ C23121k0(Object obj, long j7, int i13) {
        this.f91351w = i13;
        this.f91353y = obj;
        this.f91352x = j7;
    }
}
