package in;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import p085d9.C11799p;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31523d;
import p465rm.C31521c0;
import p465rm.C31548l0;
import p465rm.C31551m0;
import p465rm.C31559p;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p619xl.C38445a;

/* JADX INFO: renamed from: in.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C18718f extends AbstractC31523d implements Handler.Callback {

    /* JADX INFO: renamed from: M */
    public final C18716d f73528M;

    /* JADX INFO: renamed from: N */
    public final SurfaceHolderCallbackC31565r f73529N;

    /* JADX INFO: renamed from: O */
    public final Handler f73530O;

    /* JADX INFO: renamed from: P */
    public final C18717e f73531P;

    /* JADX INFO: renamed from: Q */
    public AbstractC20301a f73532Q;

    /* JADX INFO: renamed from: R */
    public boolean f73533R;

    /* JADX INFO: renamed from: S */
    public boolean f73534S;

    /* JADX INFO: renamed from: T */
    public long f73535T;

    /* JADX INFO: renamed from: U */
    public long f73536U;

    /* JADX INFO: renamed from: V */
    public C18715c f73537V;

    public C18718f(SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r, Looper looper) {
        Handler handler;
        super(5);
        this.f73529N = surfaceHolderCallbackC31565r;
        if (looper == null) {
            handler = null;
        } else {
            int i13 = AbstractC24567y.f95875a;
            handler = new Handler(looper, this);
        }
        this.f73530O = handler;
        this.f73528M = C18716d.f73526a;
        this.f73531P = new C18717e(1);
        this.f73536U = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: A */
    public final void m54419A(C18715c c18715c) {
        SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = this.f73529N;
        C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
        C31551m0 c31551m0 = c31571u.f130390J0;
        C11799p c11799p = c31571u.f130395M;
        C31548l0 c31548l0M97149a = c31551m0.m97149a();
        int i13 = 0;
        while (true) {
            InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
            if (i13 >= interfaceC18714bArr.length) {
                break;
            }
            interfaceC18714bArr[i13].mo54416w(c31548l0M97149a);
            i13++;
        }
        c31571u.f130390J0 = new C31551m0(c31548l0M97149a);
        C31551m0 c31551m0M97200R = c31571u.m97200R();
        if (!c31551m0M97200R.equals(c31571u.f130425p0)) {
            c31571u.f130425p0 = c31551m0M97200R;
            c11799p.m31623g(14, new C31559p(surfaceHolderCallbackC31565r, 0));
        }
        c11799p.m31623g(28, new C31559p(c18715c, 1));
        c11799p.m31618b();
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: h */
    public final String mo54420h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m54419A((C18715c) message.obj);
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: j */
    public final boolean mo49735j() {
        return this.f73534S;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public final boolean mo49737k() {
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: l */
    public final void mo54421l() {
        this.f73537V = null;
        this.f73536U = -9223372036854775807L;
        this.f73532Q = null;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public final void mo49741n(long j7, boolean z4) {
        this.f73537V = null;
        this.f73536U = -9223372036854775807L;
        this.f73533R = false;
        this.f73534S = false;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: r */
    public final void mo49743r(C31521c0[] c31521c0Arr, long j7, long j13) {
        this.f73532Q = this.f73528M.m54417a(c31521c0Arr[0]);
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: t */
    public final void mo49744t(long j7, long j13) {
        boolean z4 = true;
        while (z4) {
            if (!this.f73533R && this.f73537V == null) {
                C18717e c18717e = this.f73531P;
                c18717e.mo49690o();
                C38445a c38445a = this.f130111x;
                c38445a.m123175j();
                int iM97120s = m97120s(c38445a, c18717e, 0);
                if (iM97120s == -4) {
                    if (c18717e.m1496f(4)) {
                        this.f73533R = true;
                    } else {
                        c18717e.f73527I = this.f73535T;
                        c18717e.m110919r();
                        AbstractC20301a abstractC20301a = this.f73532Q;
                        int i13 = AbstractC24567y.f95875a;
                        C18715c c18715cM56357s = abstractC20301a.m56357s(c18717e);
                        if (c18715cM56357s != null) {
                            ArrayList arrayList = new ArrayList(c18715cM56357s.f73525w.length);
                            m54422z(c18715cM56357s, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f73537V = new C18715c(arrayList);
                                this.f73536U = c18717e.f148797F;
                            }
                        }
                    }
                } else if (iM97120s == -5) {
                    C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
                    c31521c0.getClass();
                    this.f73535T = c31521c0.f130081P;
                }
            }
            C18715c c18715c = this.f73537V;
            if (c18715c == null || this.f73536U > j7) {
                z4 = false;
            } else {
                Handler handler = this.f73530O;
                if (handler != null) {
                    handler.obtainMessage(0, c18715c).sendToTarget();
                } else {
                    m54419A(c18715c);
                }
                this.f73537V = null;
                this.f73536U = -9223372036854775807L;
                z4 = true;
            }
            if (this.f73533R && this.f73537V == null) {
                this.f73534S = true;
            }
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: x */
    public final int mo49746x(C31521c0 c31521c0) {
        if (this.f73528M.m54418b(c31521c0)) {
            return AbstractC31523d.m97116d(c31521c0.f130096e0 == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC31523d.m97116d(0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: z */
    public final void m54422z(C18715c c18715c, ArrayList arrayList) {
        int i13 = 0;
        while (true) {
            InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
            if (i13 >= interfaceC18714bArr.length) {
                return;
            }
            C31521c0 c31521c0Mo54414d = interfaceC18714bArr[i13].mo54414d();
            if (c31521c0Mo54414d != null) {
                C18716d c18716d = this.f73528M;
                if (c18716d.m54418b(c31521c0Mo54414d)) {
                    AbstractC20301a abstractC20301aM54417a = c18716d.m54417a(c31521c0Mo54414d);
                    byte[] bArrMo54415j = interfaceC18714bArr[i13].mo54415j();
                    bArrMo54415j.getClass();
                    C18717e c18717e = this.f73531P;
                    c18717e.mo49690o();
                    c18717e.m110918q(bArrMo54415j.length);
                    c18717e.f148801z.put(bArrMo54415j);
                    c18717e.m110919r();
                    C18715c c18715cM56357s = abstractC20301aM54417a.m56357s(c18717e);
                    if (c18715cM56357s != null) {
                        m54422z(c18715cM56357s, arrayList);
                    }
                } else {
                    arrayList.add(interfaceC18714bArr[i13]);
                }
            } else {
                arrayList.add(interfaceC18714bArr[i13]);
            }
            i13++;
        }
    }
}
