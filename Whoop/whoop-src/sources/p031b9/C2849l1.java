package p031b9;

import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p309lo.InterfaceC24554l;
import p465rm.C31576w0;
import p516u8.C34589e0;
import p607x8.AbstractC38065t;
import p607x8.C38061p;

/* JADX INFO: renamed from: b9.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2849l1 implements InterfaceC2858p0, InterfaceC24554l {

    /* JADX INFO: renamed from: E */
    public final Object f11310E;

    /* JADX INFO: renamed from: F */
    public Object f11311F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11312w;

    /* JADX INFO: renamed from: x */
    public long f11313x;

    /* JADX INFO: renamed from: y */
    public long f11314y;

    /* JADX INFO: renamed from: z */
    public boolean f11315z;

    public C2849l1(C24562t c24562t) {
        this.f11312w = 2;
        this.f11310E = c24562t;
        this.f11311F = C31576w0.f130464z;
    }

    /* JADX INFO: renamed from: a */
    public void m8244a(long j7) {
        switch (this.f11312w) {
            case 0:
                this.f11313x = j7;
                if (this.f11315z) {
                    ((C38061p) this.f11310E).getClass();
                    this.f11314y = SystemClock.elapsedRealtime();
                }
                break;
            default:
                this.f11313x = j7;
                if (this.f11315z) {
                    ((C24562t) this.f11310E).getClass();
                    this.f11314y = SystemClock.elapsedRealtime();
                }
                break;
        }
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: b */
    public C31576w0 mo8163b() {
        return (C31576w0) this.f11311F;
    }

    @Override // p031b9.InterfaceC2858p0, p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: c */
    public long mo8165c() {
        switch (this.f11312w) {
            case 0:
                long j7 = this.f11313x;
                if (!this.f11315z) {
                    return j7;
                }
                ((C38061p) this.f11310E).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11314y;
                C34589e0 c34589e0 = (C34589e0) this.f11311F;
                return j7 + (c34589e0.f145648a == 1.0f ? AbstractC38065t.m121896J(jElapsedRealtime) : jElapsedRealtime * ((long) c34589e0.f145650c));
            default:
                long j13 = this.f11313x;
                if (!this.f11315z) {
                    return j13;
                }
                ((C24562t) this.f11310E).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.f11314y;
                C31576w0 c31576w0 = (C31576w0) this.f11311F;
                return j13 + (c31576w0.f130465w == 1.0f ? AbstractC24567y.m71695z(jElapsedRealtime2) : jElapsedRealtime2 * ((long) c31576w0.f130467y));
        }
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: d */
    public void mo8166d(C34589e0 c34589e0) {
        if (this.f11315z) {
            m8244a(mo8165c());
        }
        this.f11311F = c34589e0;
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: f */
    public void mo8168f(C31576w0 c31576w0) {
        if (this.f11315z) {
            m8244a(mo8165c());
        }
        this.f11311F = c31576w0;
    }

    /* JADX INFO: renamed from: g */
    public void m8245g() {
        switch (this.f11312w) {
            case 0:
                if (!this.f11315z) {
                    ((C38061p) this.f11310E).getClass();
                    this.f11314y = SystemClock.elapsedRealtime();
                    this.f11315z = true;
                }
                break;
            default:
                if (!this.f11315z) {
                    ((C24562t) this.f11310E).getClass();
                    this.f11314y = SystemClock.elapsedRealtime();
                    this.f11315z = true;
                }
                break;
        }
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: b */
    public C34589e0 mo8164b() {
        return (C34589e0) this.f11311F;
    }

    public C2849l1(C38061p c38061p) {
        this.f11312w = 0;
        this.f11310E = c38061p;
        this.f11311F = C34589e0.f145647d;
    }

    public C2849l1(long j7, long j13, boolean z4, File file, HashMap map) {
        this.f11312w = 1;
        this.f11313x = j7;
        this.f11310E = file;
        this.f11314y = j13;
        this.f11311F = map;
        this.f11315z = z4;
    }
}
