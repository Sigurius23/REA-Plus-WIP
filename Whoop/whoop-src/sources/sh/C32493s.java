package sh;

import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import p477s2.AbstractC32069a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sh.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C32493s implements InterfaceC32491q {

    /* JADX INFO: renamed from: E */
    public InterfaceC26620j f134532E;

    /* JADX INFO: renamed from: F */
    public C26611e0 f134533F;

    /* JADX INFO: renamed from: w */
    public final AbstractC26632p f134534w;

    /* JADX INFO: renamed from: x */
    public final AbstractC32069a f134535x;

    /* JADX INFO: renamed from: y */
    public final Object f134536y = new Object();

    /* JADX INFO: renamed from: z */
    public boolean f134537z;

    public C32493s(InterfaceC26620j interfaceC26620j, AbstractC26632p abstractC26632p, AbstractC32069a abstractC32069a) {
        this.f134534w = abstractC26632p;
        this.f134535x = abstractC32069a;
        this.f134532E = interfaceC26620j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        throw r1;
     */
    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ne3.C26611e0 mo101467D0() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f134536y
            monitor-enter(r0)
            boolean r1 = r6.f134537z     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L76
            ne3.e0 r1 = r6.f134533F     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto Ld
            monitor-exit(r0)
            return r1
        Ld:
            ne3.p r1 = r6.f134534w     // Catch: java.lang.Throwable -> L71
        Lf:
            ne3.e0 r2 = ne3.AbstractC26632p.f105901x     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "tmp_"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L71
            g93.c r4 = g93.AbstractC15612d.f58612w     // Catch: java.lang.Throwable -> L71
            r4.getClass()     // Catch: java.lang.Throwable -> L71
            g93.a r4 = g93.AbstractC15612d.f58613x     // Catch: java.lang.Throwable -> L71
            java.util.Random r4 = r4.mo43930i()     // Catch: java.lang.Throwable -> L71
            long r4 = r4.nextLong()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = l83.C23476v.m68040a(r4)     // Catch: java.lang.Throwable -> L71
            r3.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L71
            ne3.e0 r2 = r2.m79176e(r3)     // Catch: java.lang.Throwable -> L71
            boolean r3 = r1.m79274x(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto Lf
            r3 = 1
            ne3.n0 r1 = r1.mo37080p0(r2, r3)     // Catch: java.lang.Throwable -> L71
            r1.close()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L71 java.lang.RuntimeException -> L74
        L44:
            ne3.p r1 = r6.f134534w     // Catch: java.lang.Throwable -> L71
            r3 = 0
            ne3.n0 r1 = r1.mo37080p0(r2, r3)     // Catch: java.lang.Throwable -> L71
            ne3.h0 r1 = ne3.AbstractC26604b.m79157b(r1)     // Catch: java.lang.Throwable -> L71
            r3 = 0
            ne3.j r4 = r6.f134532E     // Catch: java.lang.Throwable -> L5f
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r4)     // Catch: java.lang.Throwable -> L5f
            r1.mo79189N0(r4)     // Catch: java.lang.Throwable -> L5f
            r1.close()     // Catch: java.lang.Throwable -> L5d
            r1 = r3
            goto L69
        L5d:
            r1 = move-exception
            goto L69
        L5f:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r1 = move-exception
            pf.AbstractC29125c.m88530g(r4, r1)     // Catch: java.lang.Throwable -> L71
        L68:
            r1 = r4
        L69:
            if (r1 != 0) goto L73
            r6.f134532E = r3     // Catch: java.lang.Throwable -> L71
            r6.f134533F = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)
            return r2
        L71:
            r1 = move-exception
            goto L7e
        L73:
            throw r1     // Catch: java.lang.Throwable -> L71
        L74:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L71
        L76:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L71
            throw r2     // Catch: java.lang.Throwable -> L71
        L7e:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C32493s.mo101467D0():ne3.e0");
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: V0 */
    public final C26611e0 mo101468V0() {
        C26611e0 c26611e0;
        synchronized (this.f134536y) {
            if (this.f134537z) {
                throw new IllegalStateException("closed");
            }
            c26611e0 = this.f134533F;
        }
        return c26611e0;
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: c */
    public final AbstractC32069a mo101469c() {
        return this.f134535x;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f134536y) {
            this.f134537z = true;
            InterfaceC26620j interfaceC26620j = this.f134532E;
            if (interfaceC26620j != null) {
                try {
                    interfaceC26620j.close();
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception unused) {
                }
            }
            C26611e0 c26611e0 = this.f134533F;
            if (c26611e0 != null) {
                AbstractC26632p abstractC26632p = this.f134534w;
                abstractC26632p.getClass();
                abstractC26632p.mo79153m(c26611e0);
            }
        }
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo101470d1() {
        synchronized (this.f134536y) {
            if (this.f134537z) {
                throw new IllegalStateException("closed");
            }
            InterfaceC26620j interfaceC26620j = this.f134532E;
            if (interfaceC26620j != null) {
                return interfaceC26620j;
            }
            AbstractC26632p abstractC26632p = this.f134534w;
            C26611e0 c26611e0 = this.f134533F;
            AbstractC22676k.m65747g(c26611e0);
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(abstractC26632p.mo79155x0(c26611e0));
            this.f134532E = c26621j0M79158c;
            return c26621j0M79158c;
        }
    }

    @Override // sh.InterfaceC32491q
    public final AbstractC26632p getFileSystem() {
        return this.f134534w;
    }
}
