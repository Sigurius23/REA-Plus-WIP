package sn;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.IOException;
import p284ko.C22611c0;
import p284ko.HandlerC22642z;
import p508ty.C34249c;
import p527um.C35073c;
import p619xl.C38445a;

/* JADX INFO: renamed from: sn.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32738i0 implements InterfaceC32756r0 {

    /* JADX INFO: renamed from: w */
    public final int f136109w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32742k0 f136110x;

    public C32738i0(C32742k0 c32742k0, int i13) {
        this.f136110x = c32742k0;
        this.f136109w = i13;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: b */
    public final boolean mo79412b() {
        C32742k0 c32742k0 = this.f136110x;
        return !c32742k0.m102718E() && c32742k0.f136136R[this.f136109w].m102745p(c32742k0.f136154j0);
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: c */
    public final void mo79413c() throws IOException {
        int i13 = this.f136109w;
        C32742k0 c32742k0 = this.f136110x;
        C32754q0 c32754q0 = c32742k0.f136136R[i13];
        C34249c c34249c = c32754q0.f136219h;
        if (c34249c != null && c34249c.m108301r() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionM108297n = c32754q0.f136219h.m108297n();
            drmSession$DrmSessionExceptionM108297n.getClass();
            throw drmSession$DrmSessionExceptionM108297n;
        }
        C22611c0 c22611c0 = c32742k0.f136128J;
        int iM43809h = c32742k0.f136159z.m43809h(c32742k0.f136145a0);
        IOException iOException = c22611c0.f88959c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC22642z handlerC22642z = c22611c0.f88958b;
        if (handlerC22642z != null) {
            if (iM43809h == Integer.MIN_VALUE) {
                iM43809h = handlerC22642z.f89089w;
            }
            IOException iOException2 = handlerC22642z.f89092z;
            if (iOException2 != null && handlerC22642z.f89084E > iM43809h) {
                throw iOException2;
            }
        }
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: e */
    public final int mo79415e(C38445a c38445a, C35073c c35073c, int i13) {
        C32742k0 c32742k0 = this.f136110x;
        if (c32742k0.m102718E()) {
            return -3;
        }
        int i14 = this.f136109w;
        c32742k0.m102714A(i14);
        int iM102749t = c32742k0.f136136R[i14].m102749t(c38445a, c35073c, i13, c32742k0.f136154j0);
        if (iM102749t == -3) {
            c32742k0.m102715B(i14);
        }
        return iM102749t;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: j */
    public final int mo79416j(long j7) throws Throwable {
        C32742k0 c32742k0 = this.f136110x;
        if (c32742k0.m102718E()) {
            return 0;
        }
        int i13 = this.f136109w;
        c32742k0.m102714A(i13);
        C32754q0 c32754q0 = c32742k0.f136136R[i13];
        int iM102743n = c32754q0.m102743n(j7, c32742k0.f136154j0);
        c32754q0.m102752w(iM102743n);
        if (iM102743n == 0) {
            c32742k0.m102715B(i13);
        }
        return iM102743n;
    }
}
