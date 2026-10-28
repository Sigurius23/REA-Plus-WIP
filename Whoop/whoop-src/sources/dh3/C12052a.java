package dh3;

import io.sentry.hints.C20363j;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: dh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12052a implements InterfaceC38282i {

    /* JADX INFO: renamed from: G */
    public static final C20363j f39956G = new C20363j(14);

    /* JADX INFO: renamed from: E */
    public long f39957E;

    /* JADX INFO: renamed from: F */
    public InterfaceC38282i f39958F;

    /* JADX INFO: renamed from: w */
    public long f39959w;

    /* JADX INFO: renamed from: x */
    public InterfaceC38282i f39960x;

    /* JADX INFO: renamed from: y */
    public boolean f39961y;

    /* JADX INFO: renamed from: z */
    public long f39962z;

    /* JADX INFO: renamed from: a */
    public final void m33223a() {
        while (true) {
            synchronized (this) {
                try {
                    long j7 = this.f39962z;
                    long j13 = this.f39957E;
                    InterfaceC38282i interfaceC38282i = this.f39958F;
                    if (j7 == 0 && j13 == 0 && interfaceC38282i == null) {
                        this.f39961y = false;
                        return;
                    }
                    this.f39962z = 0L;
                    this.f39957E = 0L;
                    this.f39958F = null;
                    long j14 = this.f39959w;
                    if (j14 != Long.MAX_VALUE) {
                        long j15 = j14 + j7;
                        if (j15 < 0 || j15 == Long.MAX_VALUE) {
                            this.f39959w = Long.MAX_VALUE;
                            j14 = Long.MAX_VALUE;
                        } else {
                            j14 = j15 - j13;
                            if (j14 < 0) {
                                throw new IllegalStateException("more produced than requested");
                            }
                            this.f39959w = j14;
                        }
                    }
                    if (interfaceC38282i == null) {
                        InterfaceC38282i interfaceC38282i2 = this.f39960x;
                        if (interfaceC38282i2 != null && j7 != 0) {
                            interfaceC38282i2.request(j7);
                        }
                    } else if (interfaceC38282i == f39956G) {
                        this.f39960x = null;
                    } else {
                        this.f39960x = interfaceC38282i;
                        interfaceC38282i.request(j14);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m33224b(long j7) {
        if (j7 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            try {
                if (this.f39961y) {
                    this.f39957E += j7;
                    return;
                }
                this.f39961y = true;
                try {
                    long j13 = this.f39959w;
                    if (j13 != Long.MAX_VALUE) {
                        long j14 = j13 - j7;
                        if (j14 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f39959w = j14;
                    }
                    m33223a();
                } catch (Throwable th3) {
                    synchronized (this) {
                        this.f39961y = false;
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33225c(InterfaceC38282i interfaceC38282i) {
        synchronized (this) {
            try {
                if (this.f39961y) {
                    if (interfaceC38282i == null) {
                        interfaceC38282i = f39956G;
                    }
                    this.f39958F = interfaceC38282i;
                    return;
                }
                this.f39961y = true;
                try {
                    this.f39960x = interfaceC38282i;
                    if (interfaceC38282i != null) {
                        interfaceC38282i.request(this.f39959w);
                    }
                    m33223a();
                } catch (Throwable th3) {
                    synchronized (this) {
                        this.f39961y = false;
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j7 == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f39961y) {
                    this.f39962z += j7;
                    return;
                }
                this.f39961y = true;
                try {
                    long j13 = this.f39959w + j7;
                    if (j13 < 0) {
                        j13 = Long.MAX_VALUE;
                    }
                    this.f39959w = j13;
                    InterfaceC38282i interfaceC38282i = this.f39960x;
                    if (interfaceC38282i != null) {
                        interfaceC38282i.request(j7);
                    }
                    m33223a();
                } catch (Throwable th3) {
                    synchronized (this) {
                        this.f39961y = false;
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
