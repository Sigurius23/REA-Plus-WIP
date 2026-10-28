package ne3;

/* JADX INFO: renamed from: ne3.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26613f0 implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: E */
    public boolean f105857E;

    /* JADX INFO: renamed from: F */
    public long f105858F;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f105859w;

    /* JADX INFO: renamed from: x */
    public final C26616h f105860x;

    /* JADX INFO: renamed from: y */
    public C26623k0 f105861y;

    /* JADX INFO: renamed from: z */
    public int f105862z;

    public C26613f0(InterfaceC26620j interfaceC26620j) {
        this.f105859w = interfaceC26620j;
        C26616h c26616hMo79205f = interfaceC26620j.mo79205f();
        this.f105860x = c26616hMo79205f;
        C26623k0 c26623k0 = c26616hMo79205f.f105865w;
        this.f105861y = c26623k0;
        this.f105862z = c26623k0 != null ? c26623k0.f105875b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f105857E = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f105875b) goto L15;
     */
    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo9164h1(ne3.C26616h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f105857E
            if (r3 != 0) goto L63
            ne3.k0 r3 = r8.f105861y
            ne3.h r4 = r8.f105860x
            if (r3 == 0) goto L2b
            ne3.k0 r5 = r4.f105865w
            if (r3 != r5) goto L23
            int r3 = r8.f105862z
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r5)
            int r5 = r5.f105875b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f105858F
            r2 = 1
            long r0 = r0 + r2
            ne3.j r2 = r8.f105859w
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            ne3.k0 r0 = r8.f105861y
            if (r0 != 0) goto L4c
            ne3.k0 r0 = r4.f105865w
            if (r0 == 0) goto L4c
            r8.f105861y = r0
            int r0 = r0.f105875b
            r8.f105862z = r0
        L4c:
            long r0 = r4.f105866x
            long r2 = r8.f105858F
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            ne3.h r2 = r8.f105860x
            long r4 = r8.f105858F
            r3 = r9
            r2.m79214k(r3, r4, r6)
            long r9 = r8.f105858F
            long r9 = r9 + r6
            r8.f105858F = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p088dc.AbstractC11895b.m31994m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ne3.C26613f0.mo9164h1(ne3.h, long):long");
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105859w.timeout();
    }
}
