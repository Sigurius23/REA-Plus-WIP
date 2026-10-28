package androidx.datastore.preferences.protobuf;

import androidx.health.platform.client.proto.C1533u;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1233m {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230l f5427a;

    /* JADX INFO: renamed from: b */
    public int f5428b;

    /* JADX INFO: renamed from: c */
    public int f5429c;

    /* JADX INFO: renamed from: d */
    public int f5430d = 0;

    public C1233m(AbstractC1230l abstractC1230l) {
        Charset charset = AbstractC1204c0.f5362a;
        this.f5427a = abstractC1230l;
        abstractC1230l.f5423y = this;
    }

    /* JADX INFO: renamed from: y */
    public static void m3888y(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m3889z(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3890a() {
        int i13 = this.f5430d;
        if (i13 != 0) {
            this.f5428b = i13;
            this.f5430d = 0;
        } else {
            this.f5428b = this.f5427a.mo3823D();
        }
        int i14 = this.f5428b;
        if (i14 == 0 || i14 == this.f5429c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m3891b(Object obj, InterfaceC1270z0 interfaceC1270z0, C1245q c1245q) {
        int i13 = this.f5429c;
        this.f5429c = ((this.f5428b >>> 3) << 3) | 4;
        try {
            interfaceC1270z0.mo3993f(obj, this, c1245q);
            if (this.f5428b != this.f5429c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f5429c = i13;
        } catch (Throwable th3) {
            this.f5429c = i13;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3892c(Object obj, InterfaceC1270z0 interfaceC1270z0, C1245q c1245q) throws InvalidProtocolBufferException {
        AbstractC1230l abstractC1230l = this.f5427a;
        int iMo3824E = abstractC1230l.mo3824E();
        if (abstractC1230l.f5422x >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo3838l = abstractC1230l.mo3838l(iMo3824E);
        abstractC1230l.f5422x++;
        interfaceC1270z0.mo3993f(obj, this, c1245q);
        abstractC1230l.mo3834a(0);
        abstractC1230l.f5422x--;
        abstractC1230l.mo3837k(iMo3838l);
    }

    /* JADX INFO: renamed from: d */
    public final void m3893d(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Boolean.valueOf(abstractC1230l.mo3839m()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Boolean.valueOf(abstractC1230l.mo3839m()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: e */
    public final C1218h m3894e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m3912w(2);
        return this.f5427a.mo3840n();
    }

    /* JADX INFO: renamed from: f */
    public final void m3895f(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo3823D;
        if ((this.f5428b & 7) != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            ((C1266x0) abstractC1200b).add(m3894e());
            AbstractC1230l abstractC1230l = this.f5427a;
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f5428b);
        this.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: g */
    public final void m3896g(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 1) {
            do {
                ((C1266x0) abstractC1200b).add(Double.valueOf(abstractC1230l.mo3841q()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3824E = abstractC1230l.mo3824E();
        m3889z(iMo3824E);
        int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
        do {
            ((C1266x0) abstractC1200b).add(Double.valueOf(abstractC1230l.mo3841q()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
    }

    /* JADX INFO: renamed from: h */
    public final void m3897h(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3842r()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3842r()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: i */
    public final Object m3898i(EnumC1259u1 enumC1259u1, Class cls, C1245q c1245q) throws InvalidProtocolBufferException {
        int iOrdinal = enumC1259u1.ordinal();
        AbstractC1230l abstractC1230l = this.f5427a;
        switch (iOrdinal) {
            case 0:
                m3912w(1);
                return Double.valueOf(abstractC1230l.mo3841q());
            case 1:
                m3912w(5);
                return Float.valueOf(abstractC1230l.mo3845u());
            case 2:
                m3912w(0);
                return Long.valueOf(abstractC1230l.mo3847w());
            case 3:
                m3912w(0);
                return Long.valueOf(abstractC1230l.mo3825F());
            case 4:
                m3912w(0);
                return Integer.valueOf(abstractC1230l.mo3846v());
            case 5:
                m3912w(1);
                return Long.valueOf(abstractC1230l.mo3844t());
            case 6:
                m3912w(5);
                return Integer.valueOf(abstractC1230l.mo3843s());
            case 7:
                m3912w(0);
                return Boolean.valueOf(abstractC1230l.mo3839m());
            case 8:
                m3912w(2);
                return abstractC1230l.mo3822C();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m3912w(2);
                InterfaceC1270z0 interfaceC1270z0M4012a = C1264w0.f5502c.m4012a(cls);
                AbstractC1269z abstractC1269zMo3991d = interfaceC1270z0M4012a.mo3991d();
                m3892c(abstractC1269zMo3991d, interfaceC1270z0M4012a, c1245q);
                interfaceC1270z0M4012a.mo3989b(abstractC1269zMo3991d);
                return abstractC1269zMo3991d;
            case 11:
                return m3894e();
            case 12:
                m3912w(0);
                return Integer.valueOf(abstractC1230l.mo3824E());
            case 13:
                m3912w(0);
                return Integer.valueOf(abstractC1230l.mo3842r());
            case 14:
                m3912w(5);
                return Integer.valueOf(abstractC1230l.mo3848x());
            case 15:
                m3912w(1);
                return Long.valueOf(abstractC1230l.mo3849y());
            case 16:
                m3912w(0);
                return Integer.valueOf(abstractC1230l.mo3850z());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                m3912w(0);
                return Long.valueOf(abstractC1230l.mo3820A());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3899j(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 2) {
            int iMo3824E = abstractC1230l.mo3824E();
            m3888y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3843s()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3843s()));
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f5428b);
        this.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: k */
    public final void m3900k(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 1) {
            do {
                ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3844t()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3824E = abstractC1230l.mo3824E();
        m3889z(iMo3824E);
        int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
        do {
            ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3844t()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
    }

    /* JADX INFO: renamed from: l */
    public final void m3901l(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 2) {
            int iMo3824E = abstractC1230l.mo3824E();
            m3888y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                ((C1266x0) abstractC1200b).add(Float.valueOf(abstractC1230l.mo3845u()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            ((C1266x0) abstractC1200b).add(Float.valueOf(abstractC1230l.mo3845u()));
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f5428b);
        this.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: m */
    public final void m3902m(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3846v()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3846v()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: n */
    public final void m3903n(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3847w()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3847w()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: o */
    public final void m3904o(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 2) {
            int iMo3824E = abstractC1230l.mo3824E();
            m3888y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3848x()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3848x()));
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f5428b);
        this.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: p */
    public final void m3905p(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 1) {
            do {
                ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3849y()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3824E = abstractC1230l.mo3824E();
        m3889z(iMo3824E);
        int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
        do {
            ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3849y()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
    }

    /* JADX INFO: renamed from: q */
    public final void m3906q(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3850z()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3850z()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: r */
    public final void m3907r(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3820A()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3820A()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: s */
    public final void m3908s(AbstractC1200b abstractC1200b, boolean z4) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo3821B;
        int iMo3823D;
        if ((this.f5428b & 7) != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        do {
            AbstractC1230l abstractC1230l = this.f5427a;
            if (z4) {
                m3912w(2);
                strMo3821B = abstractC1230l.mo3822C();
            } else {
                m3912w(2);
                strMo3821B = abstractC1230l.mo3821B();
            }
            ((C1266x0) abstractC1200b).add(strMo3821B);
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f5428b);
        this.f5430d = iMo3823D;
    }

    /* JADX INFO: renamed from: t */
    public final void m3909t(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3824E()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Integer.valueOf(abstractC1230l.mo3824E()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: u */
    public final void m3910u(AbstractC1200b abstractC1200b) throws InvalidProtocolBufferException {
        int iMo3823D;
        int i13 = this.f5428b & 7;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (i13 == 0) {
            do {
                ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3825F()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f5428b);
            this.f5430d = iMo3823D;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.m3744b();
        }
        int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            ((C1266x0) abstractC1200b).add(Long.valueOf(abstractC1230l.mo3825F()));
        } while (abstractC1230l.mo3835d() < iMo3835d);
        m3911v(iMo3835d);
    }

    /* JADX INFO: renamed from: v */
    public final void m3911v(int i13) throws InvalidProtocolBufferException {
        if (this.f5427a.mo3835d() != i13) {
            throw InvalidProtocolBufferException.m3747e();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3912w(int i13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f5428b & 7) != i13) {
            throw InvalidProtocolBufferException.m3744b();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3913x() {
        int i13;
        AbstractC1230l abstractC1230l = this.f5427a;
        if (abstractC1230l.mo3836e() || (i13 = this.f5428b) == this.f5429c) {
            return false;
        }
        return abstractC1230l.mo3826H(i13);
    }
}
