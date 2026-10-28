package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C1403m {

    /* JADX INFO: renamed from: a */
    public final AbstractC1400l f5937a;

    /* JADX INFO: renamed from: b */
    public int f5938b;

    /* JADX INFO: renamed from: c */
    public int f5939c;

    /* JADX INFO: renamed from: d */
    public int f5940d = 0;

    public C1403m(AbstractC1400l abstractC1400l) {
        Charset charset = AbstractC1383f0.f5887a;
        this.f5937a = abstractC1400l;
        abstractC1400l.f5934b = this;
    }

    /* JADX INFO: renamed from: w */
    public static void m4440w(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.m4266f();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m4441x(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.m4266f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4442a() {
        int i13 = this.f5940d;
        if (i13 != 0) {
            this.f5938b = i13;
            this.f5940d = 0;
        } else {
            this.f5938b = this.f5937a.mo4363H();
        }
        int i14 = this.f5938b;
        if (i14 == 0 || i14 == this.f5939c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m4443b(Object obj, InterfaceC1372b1 interfaceC1372b1, C1417s c1417s) {
        int i13 = this.f5939c;
        this.f5939c = ((this.f5938b >>> 3) << 3) | 4;
        try {
            interfaceC1372b1.mo4291e(obj, this, c1417s);
            if (this.f5938b != this.f5939c) {
                throw InvalidProtocolBufferException.m4266f();
            }
            this.f5939c = i13;
        } catch (Throwable th3) {
            this.f5939c = i13;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4444c(Object obj, InterfaceC1372b1 interfaceC1372b1, C1417s c1417s) throws InvalidProtocolBufferException {
        AbstractC1400l abstractC1400l = this.f5937a;
        int iMo4364I = abstractC1400l.mo4364I();
        if (abstractC1400l.f5933a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo4376q = abstractC1400l.mo4376q(iMo4364I);
        abstractC1400l.f5933a++;
        interfaceC1372b1.mo4291e(obj, this, c1417s);
        abstractC1400l.mo4372e(0);
        abstractC1400l.f5933a--;
        abstractC1400l.mo4375m(iMo4376q);
    }

    /* JADX INFO: renamed from: d */
    public final void m4445d(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1379e;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Boolean.valueOf(abstractC1400l.mo4377s()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Boolean.valueOf(abstractC1400l.mo4377s()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        AbstractC1379e abstractC1379e = (AbstractC1379e) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                abstractC1379e.m4326c(abstractC1400l.mo4377s());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            abstractC1379e.m4326c(abstractC1400l.mo4377s());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1391i m4446e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4463v(2);
        return this.f5937a.mo4378t();
    }

    /* JADX INFO: renamed from: f */
    public final void m4447f(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo4363H;
        if ((this.f5938b & 7) != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            interfaceC1380e0.add(m4446e());
            AbstractC1400l abstractC1400l = this.f5937a;
            if (abstractC1400l.mo4374k()) {
                return;
            } else {
                iMo4363H = abstractC1400l.mo4363H();
            }
        } while (iMo4363H == this.f5938b);
        this.f5940d = iMo4363H;
    }

    /* JADX INFO: renamed from: g */
    public final void m4448g(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1413q;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 1) {
                do {
                    interfaceC1380e0.add(Double.valueOf(abstractC1400l.mo4379u()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4364I = abstractC1400l.mo4364I();
            m4441x(iMo4364I);
            int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
            do {
                interfaceC1380e0.add(Double.valueOf(abstractC1400l.mo4379u()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            return;
        }
        AbstractC1413q abstractC1413q = (AbstractC1413q) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 1) {
            do {
                abstractC1413q.m4507c(abstractC1400l.mo4379u());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4364I2 = abstractC1400l.mo4364I();
        m4441x(iMo4364I2);
        int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
        do {
            abstractC1413q.m4507c(abstractC1400l.mo4379u());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
    }

    /* JADX INFO: renamed from: h */
    public final void m4449h(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4380v()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4380v()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                c1371b0.m4283c(abstractC1400l.mo4380v());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            c1371b0.m4283c(abstractC1400l.mo4380v());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: i */
    public final void m4450i(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 2) {
                int iMo4364I = abstractC1400l.mo4364I();
                m4440w(iMo4364I);
                int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4381w()));
                } while (abstractC1400l.mo4373j() < iMo4373j);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.m4263c();
            }
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4381w()));
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H = abstractC1400l.mo4363H();
                }
            } while (iMo4363H == this.f5938b);
            this.f5940d = iMo4363H;
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 2) {
            int iMo4364I2 = abstractC1400l.mo4364I();
            m4440w(iMo4364I2);
            int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
            do {
                c1371b0.m4283c(abstractC1400l.mo4381w());
            } while (abstractC1400l.mo4373j() < iMo4373j2);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            c1371b0.m4283c(abstractC1400l.mo4381w());
            if (abstractC1400l.mo4374k()) {
                return;
            } else {
                iMo4363H2 = abstractC1400l.mo4363H();
            }
        } while (iMo4363H2 == this.f5938b);
        this.f5940d = iMo4363H2;
    }

    /* JADX INFO: renamed from: j */
    public final void m4451j(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1398k0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 1) {
                do {
                    interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4382x()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4364I = abstractC1400l.mo4364I();
            m4441x(iMo4364I);
            int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
            do {
                interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4382x()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 1) {
            do {
                abstractC1398k0.m4406c(abstractC1400l.mo4382x());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4364I2 = abstractC1400l.mo4364I();
        m4441x(iMo4364I2);
        int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
        do {
            abstractC1398k0.m4406c(abstractC1400l.mo4382x());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
    }

    /* JADX INFO: renamed from: k */
    public final void m4452k(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1425w;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 2) {
                int iMo4364I = abstractC1400l.mo4364I();
                m4440w(iMo4364I);
                int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
                do {
                    interfaceC1380e0.add(Float.valueOf(abstractC1400l.mo4383y()));
                } while (abstractC1400l.mo4373j() < iMo4373j);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.m4263c();
            }
            do {
                interfaceC1380e0.add(Float.valueOf(abstractC1400l.mo4383y()));
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H = abstractC1400l.mo4363H();
                }
            } while (iMo4363H == this.f5938b);
            this.f5940d = iMo4363H;
            return;
        }
        AbstractC1425w abstractC1425w = (AbstractC1425w) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 2) {
            int iMo4364I2 = abstractC1400l.mo4364I();
            m4440w(iMo4364I2);
            int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
            do {
                abstractC1425w.m4549c(abstractC1400l.mo4383y());
            } while (abstractC1400l.mo4373j() < iMo4373j2);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            abstractC1425w.m4549c(abstractC1400l.mo4383y());
            if (abstractC1400l.mo4374k()) {
                return;
            } else {
                iMo4363H2 = abstractC1400l.mo4363H();
            }
        } while (iMo4363H2 == this.f5938b);
        this.f5940d = iMo4363H2;
    }

    /* JADX INFO: renamed from: l */
    public final void m4453l(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4384z()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4384z()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                c1371b0.m4283c(abstractC1400l.mo4384z());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            c1371b0.m4283c(abstractC1400l.mo4384z());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: m */
    public final void m4454m(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1398k0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4356A()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4356A()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                abstractC1398k0.m4406c(abstractC1400l.mo4356A());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            abstractC1398k0.m4406c(abstractC1400l.mo4356A());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: n */
    public final void m4455n(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 2) {
                int iMo4364I = abstractC1400l.mo4364I();
                m4440w(iMo4364I);
                int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4357B()));
                } while (abstractC1400l.mo4373j() < iMo4373j);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.m4263c();
            }
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4357B()));
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H = abstractC1400l.mo4363H();
                }
            } while (iMo4363H == this.f5938b);
            this.f5940d = iMo4363H;
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 2) {
            int iMo4364I2 = abstractC1400l.mo4364I();
            m4440w(iMo4364I2);
            int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
            do {
                c1371b0.m4283c(abstractC1400l.mo4357B());
            } while (abstractC1400l.mo4373j() < iMo4373j2);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            c1371b0.m4283c(abstractC1400l.mo4357B());
            if (abstractC1400l.mo4374k()) {
                return;
            } else {
                iMo4363H2 = abstractC1400l.mo4363H();
            }
        } while (iMo4363H2 == this.f5938b);
        this.f5940d = iMo4363H2;
    }

    /* JADX INFO: renamed from: o */
    public final void m4456o(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1398k0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 1) {
                do {
                    interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4358C()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4364I = abstractC1400l.mo4364I();
            m4441x(iMo4364I);
            int iMo4373j = abstractC1400l.mo4373j() + iMo4364I;
            do {
                interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4358C()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 1) {
            do {
                abstractC1398k0.m4406c(abstractC1400l.mo4358C());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4364I2 = abstractC1400l.mo4364I();
        m4441x(iMo4364I2);
        int iMo4373j2 = abstractC1400l.mo4373j() + iMo4364I2;
        do {
            abstractC1398k0.m4406c(abstractC1400l.mo4358C());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
    }

    /* JADX INFO: renamed from: p */
    public final void m4457p(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4359D()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4359D()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                c1371b0.m4283c(abstractC1400l.mo4359D());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            c1371b0.m4283c(abstractC1400l.mo4359D());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m4458q(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1398k0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4360E()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4360E()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                abstractC1398k0.m4406c(abstractC1400l.mo4360E());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            abstractC1398k0.m4406c(abstractC1400l.mo4360E());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: r */
    public final void m4459r(InterfaceC1380e0 interfaceC1380e0, boolean z4) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo4361F;
        int iMo4363H;
        if ((this.f5938b & 7) != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        do {
            AbstractC1400l abstractC1400l = this.f5937a;
            if (z4) {
                m4463v(2);
                strMo4361F = abstractC1400l.mo4362G();
            } else {
                m4463v(2);
                strMo4361F = abstractC1400l.mo4361F();
            }
            interfaceC1380e0.add(strMo4361F);
            if (abstractC1400l.mo4374k()) {
                return;
            } else {
                iMo4363H = abstractC1400l.mo4363H();
            }
        } while (iMo4363H == this.f5938b);
        this.f5940d = iMo4363H;
    }

    /* JADX INFO: renamed from: s */
    public final void m4460s(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof C1371b0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4364I()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Integer.valueOf(abstractC1400l.mo4364I()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                c1371b0.m4283c(abstractC1400l.mo4364I());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            c1371b0.m4283c(abstractC1400l.mo4364I());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: t */
    public final void m4461t(InterfaceC1380e0 interfaceC1380e0) throws InvalidProtocolBufferException {
        int iMo4363H;
        int iMo4363H2;
        boolean z4 = interfaceC1380e0 instanceof AbstractC1398k0;
        AbstractC1400l abstractC1400l = this.f5937a;
        if (!z4) {
            int i13 = this.f5938b & 7;
            if (i13 == 0) {
                do {
                    interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4365J()));
                    if (abstractC1400l.mo4374k()) {
                        return;
                    } else {
                        iMo4363H = abstractC1400l.mo4363H();
                    }
                } while (iMo4363H == this.f5938b);
                this.f5940d = iMo4363H;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.m4263c();
            }
            int iMo4373j = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
            do {
                interfaceC1380e0.add(Long.valueOf(abstractC1400l.mo4365J()));
            } while (abstractC1400l.mo4373j() < iMo4373j);
            m4462u(iMo4373j);
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) interfaceC1380e0;
        int i14 = this.f5938b & 7;
        if (i14 == 0) {
            do {
                abstractC1398k0.m4406c(abstractC1400l.mo4365J());
                if (abstractC1400l.mo4374k()) {
                    return;
                } else {
                    iMo4363H2 = abstractC1400l.mo4363H();
                }
            } while (iMo4363H2 == this.f5938b);
            this.f5940d = iMo4363H2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.m4263c();
        }
        int iMo4373j2 = abstractC1400l.mo4373j() + abstractC1400l.mo4364I();
        do {
            abstractC1398k0.m4406c(abstractC1400l.mo4365J());
        } while (abstractC1400l.mo4373j() < iMo4373j2);
        m4462u(iMo4373j2);
    }

    /* JADX INFO: renamed from: u */
    public final void m4462u(int i13) throws InvalidProtocolBufferException {
        if (this.f5937a.mo4373j() != i13) {
            throw InvalidProtocolBufferException.m4267g();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4463v(int i13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f5938b & 7) != i13) {
            throw InvalidProtocolBufferException.m4263c();
        }
    }
}
