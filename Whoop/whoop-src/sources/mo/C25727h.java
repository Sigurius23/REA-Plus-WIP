package mo;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mapbox.common.module.RunnableC5445c;
import hn.InterfaceC17503k;
import p215i9.InterfaceC18235k;
import p309lo.AbstractC24567y;
import p454r9.C31080e;
import p454r9.C31089n;
import p516u8.C34629y0;
import p607x8.AbstractC38065t;
import p619xl.C38445a;

/* JADX INFO: renamed from: mo.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C25727h implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101359w = 0;

    /* JADX INFO: renamed from: x */
    public final Handler f101360x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f101361y;

    public C25727h(C25728i c25728i, InterfaceC17503k interfaceC17503k) {
        this.f101361y = c25728i;
        Handler handlerM71680k = AbstractC24567y.m71680k(this);
        this.f101360x = handlerM71680k;
        interfaceC17503k.mo45169t(this, handlerM71680k);
    }

    /* JADX INFO: renamed from: a */
    public void m75848a(long j7) {
        Surface surface;
        C31080e c31080e = (C31080e) this.f101361y;
        if (this != c31080e.f128153J1 || c31080e.f71009k0 == null) {
            return;
        }
        if (j7 == Long.MAX_VALUE) {
            c31080e.f70989V0 = true;
            return;
        }
        try {
            C38445a c38445a = c31080e.f128162e1;
            c31080e.m52546v0(j7);
            C34629y0 c34629y0 = c31080e.f128148E1;
            if (!c34629y0.equals(C34629y0.f145874d) && !c34629y0.equals(c31080e.f128149F1)) {
                c31080e.f128149F1 = c34629y0;
                c38445a.m123171H(c34629y0);
            }
            c31080e.f70993X0.f11170f++;
            C31089n c31089n = c31080e.f128165h1;
            boolean z4 = c31089n.f128220e != 3;
            c31089n.f128220e = 3;
            c31089n.f128227l.getClass();
            c31089n.f128222g = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
            if (z4 && (surface = c31080e.f128175r1) != null) {
                Handler handler = (Handler) c38445a.f164636x;
                if (handler != null) {
                    handler.post(new RunnableC5445c(c38445a, surface, SystemClock.elapsedRealtime(), 6));
                }
                c31080e.f128178u1 = true;
            }
            c31080e.mo52533d0(j7);
        } catch (ExoPlaybackException e5) {
            c31080e.f70991W0 = e5;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f101359w) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                int i13 = message.arg1;
                int i14 = message.arg2;
                int i15 = AbstractC24567y.f95875a;
                long j7 = (((long) i14) & 4294967295L) | ((((long) i13) & 4294967295L) << 32);
                C25728i c25728i = (C25728i) this.f101361y;
                if (this != c25728i.f101376L1) {
                    return true;
                }
                if (j7 == Long.MAX_VALUE) {
                    c25728i.f67701X0 = true;
                    return true;
                }
                try {
                    c25728i.m49742n0(j7);
                    c25728i.m75863v0();
                    c25728i.f67705Z0.f11170f++;
                    c25728i.m75862u0();
                    c25728i.mo49723X(j7);
                    return true;
                } catch (com.google.android.exoplayer2.ExoPlaybackException e5) {
                    c25728i.f67703Y0 = e5;
                    return true;
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                int i16 = message.arg1;
                int i17 = message.arg2;
                int i18 = AbstractC38065t.f163031a;
                m75848a((((long) i17) & 4294967295L) | ((((long) i16) & 4294967295L) << 32));
                return true;
        }
    }

    public C25727h(C31080e c31080e, InterfaceC18235k interfaceC18235k) {
        this.f101361y = c31080e;
        Handler handlerM121920m = AbstractC38065t.m121920m(this);
        this.f101360x = handlerM121920m;
        interfaceC18235k.mo52492j(this, handlerM121920m);
    }
}
