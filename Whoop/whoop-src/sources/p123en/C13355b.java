package p123en;

import java.io.EOFException;
import java.io.IOException;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p362oa.C27747a;
import p362oa.InterfaceC27750d;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33646o;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37374p;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: en.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C13355b implements InterfaceC13359f, InterfaceC27750d {

    /* JADX INFO: renamed from: E */
    public long f46669E;

    /* JADX INFO: renamed from: F */
    public long f46670F;

    /* JADX INFO: renamed from: G */
    public long f46671G;

    /* JADX INFO: renamed from: H */
    public long f46672H;

    /* JADX INFO: renamed from: I */
    public long f46673I;

    /* JADX INFO: renamed from: J */
    public long f46674J;

    /* JADX INFO: renamed from: K */
    public long f46675K;

    /* JADX INFO: renamed from: L */
    public final Object f46676L;

    /* JADX INFO: renamed from: M */
    public final Object f46677M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46678w = 0;

    /* JADX INFO: renamed from: x */
    public final long f46679x;

    /* JADX INFO: renamed from: y */
    public final long f46680y;

    /* JADX INFO: renamed from: z */
    public int f46681z;

    public C13355b(AbstractC13361h abstractC13361h, long j7, long j13, long j14, long j15, boolean z4) {
        AbstractC24543a.m71569e(j7 >= 0 && j13 > j7);
        this.f46677M = abstractC13361h;
        this.f46679x = j7;
        this.f46680y = j13;
        if (j14 == j13 - j7 || z4) {
            this.f46669E = j15;
            this.f46681z = 4;
        } else {
            this.f46681z = 0;
        }
        this.f46676L = new C13358e(0);
    }

    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: d */
    public InterfaceC37374p mo2199d() {
        if (this.f46669E != 0) {
            return new C13354a(this);
        }
        return null;
    }

    @Override // p123en.InterfaceC13359f, p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: e */
    public final void mo2200e(long j7) {
        switch (this.f46678w) {
            case 0:
                this.f46671G = AbstractC24567y.m71678i(j7, 0L, this.f46669E - 1);
                this.f46681z = 2;
                this.f46672H = this.f46679x;
                this.f46673I = this.f46680y;
                this.f46674J = 0L;
                this.f46675K = this.f46669E;
                break;
            default:
                this.f46671G = AbstractC38065t.m121915h(j7, 0L, this.f46669E - 1);
                this.f46681z = 2;
                this.f46672H = this.f46679x;
                this.f46673I = this.f46680y;
                this.f46674J = 0L;
                this.f46675K = this.f46669E;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: j */
    public long mo2203j(InterfaceC33646o interfaceC33646o) throws IOException {
        long j7;
        long j13;
        long jM121915h;
        C13358e c13358e = (C13358e) this.f46676L;
        int i13 = this.f46681z;
        long j14 = this.f46680y;
        if (i13 == 0) {
            j7 = 0;
            long position = interfaceC33646o.getPosition();
            this.f46670F = position;
            this.f46681z = 1;
            long j15 = j14 - 65307;
            if (j15 > position) {
                return j15;
            }
        } else if (i13 != 1) {
            if (i13 == 2) {
                if (this.f46672H == this.f46673I) {
                    jM121915h = -1;
                } else {
                    long position2 = interfaceC33646o.getPosition();
                    if (c13358e.m37619c(interfaceC33646o, this.f46673I)) {
                        c13358e.m37617a(interfaceC33646o, false);
                        interfaceC33646o.mo3093e();
                        long j16 = this.f46671G;
                        long j17 = c13358e.f46688b;
                        long j18 = j16 - j17;
                        j13 = 2;
                        int i14 = c13358e.f46690d + c13358e.f46691e;
                        if (0 > j18 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.f46673I = position2;
                                this.f46675K = j17;
                            } else {
                                this.f46672H = interfaceC33646o.getPosition() + ((long) i14);
                                this.f46674J = c13358e.f46688b;
                            }
                            long j19 = this.f46673I;
                            long j24 = this.f46672H;
                            if (j19 - j24 < 100000) {
                                this.f46673I = j24;
                                jM121915h = j24;
                            } else {
                                long position3 = interfaceC33646o.getPosition() - (((long) i14) * (j18 <= 0 ? 2L : 1L));
                                long j25 = this.f46673I;
                                long j26 = this.f46672H;
                                jM121915h = AbstractC38065t.m121915h((((j25 - j26) * j18) / (this.f46675K - this.f46674J)) + position3, j26, j25 - 1);
                            }
                        } else {
                            jM121915h = -1;
                        }
                    } else {
                        jM121915h = this.f46672H;
                        if (jM121915h == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jM121915h != -1) {
                        return jM121915h;
                    }
                    this.f46681z = 3;
                }
                j13 = 2;
                if (jM121915h != -1) {
                    return jM121915h;
                }
                this.f46681z = 3;
            } else {
                if (i13 != 3) {
                    if (i13 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j13 = 2;
            }
            while (true) {
                c13358e.m37619c(interfaceC33646o, -1L);
                c13358e.m37617a(interfaceC33646o, false);
                if (c13358e.f46688b > this.f46671G) {
                    interfaceC33646o.mo3093e();
                    this.f46681z = 4;
                    return -(this.f46674J + j13);
                }
                interfaceC33646o.mo3100n(c13358e.f46690d + c13358e.f46691e);
                this.f46672H = interfaceC33646o.getPosition();
                this.f46674J = c13358e.f46688b;
            }
        } else {
            j7 = 0;
        }
        c13358e.f46687a = 0;
        c13358e.f46688b = j7;
        c13358e.f46689c = 0;
        c13358e.f46690d = 0;
        c13358e.f46691e = 0;
        if (!c13358e.m37619c(interfaceC33646o, -1L)) {
            throw new EOFException();
        }
        c13358e.m37617a(interfaceC33646o, false);
        interfaceC33646o.mo3100n(c13358e.f46690d + c13358e.f46691e);
        long j27 = c13358e.f46688b;
        while ((c13358e.f46687a & 4) != 4 && c13358e.m37619c(interfaceC33646o, -1L) && interfaceC33646o.getPosition() < j14 && c13358e.m37617a(interfaceC33646o, true)) {
            try {
                interfaceC33646o.mo3100n(c13358e.f46690d + c13358e.f46691e);
                j27 = c13358e.f46688b;
            } catch (EOFException unused) {
            }
        }
        this.f46669E = j27;
        this.f46681z = 4;
        return this.f46670F;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: k */
    public long mo2204k(InterfaceC37368j interfaceC37368j) throws IOException {
        long j7;
        long j13;
        long jM71678i;
        C13358e c13358e = (C13358e) this.f46676L;
        int i13 = this.f46681z;
        long j14 = this.f46680y;
        if (i13 == 0) {
            j7 = 0;
            long position = interfaceC37368j.getPosition();
            this.f46670F = position;
            this.f46681z = 1;
            long j15 = j14 - 65307;
            if (j15 > position) {
                return j15;
            }
        } else if (i13 != 1) {
            if (i13 == 2) {
                if (this.f46672H == this.f46673I) {
                    jM71678i = -1;
                } else {
                    long position2 = interfaceC37368j.getPosition();
                    if (c13358e.m37620d(interfaceC37368j, this.f46673I)) {
                        c13358e.m37618b(interfaceC37368j, false);
                        interfaceC37368j.mo3093e();
                        long j16 = this.f46671G;
                        long j17 = c13358e.f46688b;
                        long j18 = j16 - j17;
                        j13 = 2;
                        int i14 = c13358e.f46690d + c13358e.f46691e;
                        if (0 > j18 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.f46673I = position2;
                                this.f46675K = j17;
                            } else {
                                this.f46672H = interfaceC37368j.getPosition() + ((long) i14);
                                this.f46674J = c13358e.f46688b;
                            }
                            long j19 = this.f46673I;
                            long j24 = this.f46672H;
                            if (j19 - j24 < 100000) {
                                this.f46673I = j24;
                                jM71678i = j24;
                            } else {
                                long position3 = interfaceC37368j.getPosition() - (((long) i14) * (j18 <= 0 ? 2L : 1L));
                                long j25 = this.f46673I;
                                long j26 = this.f46672H;
                                jM71678i = AbstractC24567y.m71678i((((j25 - j26) * j18) / (this.f46675K - this.f46674J)) + position3, j26, j25 - 1);
                            }
                        } else {
                            jM71678i = -1;
                        }
                    } else {
                        jM71678i = this.f46672H;
                        if (jM71678i == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jM71678i != -1) {
                        return jM71678i;
                    }
                    this.f46681z = 3;
                }
                j13 = 2;
                if (jM71678i != -1) {
                    return jM71678i;
                }
                this.f46681z = 3;
            } else {
                if (i13 != 3) {
                    if (i13 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j13 = 2;
            }
            while (true) {
                c13358e.m37620d(interfaceC37368j, -1L);
                c13358e.m37618b(interfaceC37368j, false);
                if (c13358e.f46688b > this.f46671G) {
                    interfaceC37368j.mo3093e();
                    this.f46681z = 4;
                    return -(this.f46674J + j13);
                }
                interfaceC37368j.mo3100n(c13358e.f46690d + c13358e.f46691e);
                this.f46672H = interfaceC37368j.getPosition();
                this.f46674J = c13358e.f46688b;
            }
        } else {
            j7 = 0;
        }
        c13358e.f46687a = 0;
        c13358e.f46688b = j7;
        c13358e.f46689c = 0;
        c13358e.f46690d = 0;
        c13358e.f46691e = 0;
        if (!c13358e.m37620d(interfaceC37368j, -1L)) {
            throw new EOFException();
        }
        c13358e.m37618b(interfaceC37368j, false);
        interfaceC37368j.mo3100n(c13358e.f46690d + c13358e.f46691e);
        long j27 = c13358e.f46688b;
        while ((c13358e.f46687a & 4) != 4 && c13358e.m37620d(interfaceC37368j, -1L) && interfaceC37368j.getPosition() < j14 && c13358e.m37618b(interfaceC37368j, true)) {
            try {
                interfaceC37368j.mo3100n(c13358e.f46690d + c13358e.f46691e);
                j27 = c13358e.f46688b;
            } catch (EOFException unused) {
            }
        }
        this.f46669E = j27;
        this.f46681z = 4;
        return this.f46670F;
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: d */
    public InterfaceC33627e0 mo2198d() {
        if (this.f46669E != 0) {
            return new C27747a(this);
        }
        return null;
    }

    public C13355b(AbstractC13361h abstractC13361h, long j7, long j13, long j14, long j15, boolean z4, byte b) {
        AbstractC35849g.m113802d(j7 >= 0 && j13 > j7);
        this.f46677M = abstractC13361h;
        this.f46679x = j7;
        this.f46680y = j13;
        if (j14 != j13 - j7 && !z4) {
            this.f46681z = 0;
        } else {
            this.f46669E = j15;
            this.f46681z = 4;
        }
        this.f46676L = new C13358e(1);
    }
}
