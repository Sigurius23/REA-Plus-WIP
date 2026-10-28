package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C5155l {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230l f21536a;

    /* JADX INFO: renamed from: b */
    public int f21537b;

    /* JADX INFO: renamed from: c */
    public int f21538c;

    /* JADX INFO: renamed from: d */
    public int f21539d = 0;

    public C5155l(AbstractC1230l abstractC1230l) {
        AbstractC5126b0.m16123a(abstractC1230l, "input");
        this.f21536a = abstractC1230l;
        abstractC1230l.f5423y = this;
    }

    /* JADX INFO: renamed from: a */
    public static C5155l m16217a(AbstractC1230l abstractC1230l) {
        C5155l c5155l = (C5155l) abstractC1230l.f5423y;
        return c5155l != null ? c5155l : new C5155l(abstractC1230l);
    }

    /* JADX INFO: renamed from: x */
    public static void m16218x(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.m16103e();
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m16219y(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.m16103e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m16220b() {
        int i13 = this.f21539d;
        if (i13 != 0) {
            this.f21537b = i13;
            this.f21539d = 0;
        } else {
            this.f21537b = this.f21536a.mo3823D();
        }
        int i14 = this.f21537b;
        if (i14 == 0 || i14 == this.f21538c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    /* JADX INFO: renamed from: c */
    public final void m16221c(Object obj, InterfaceC5124a1 interfaceC5124a1, C5167p c5167p) {
        int i13 = this.f21538c;
        this.f21538c = ((this.f21537b >>> 3) << 3) | 4;
        try {
            interfaceC5124a1.mo16117f(obj, this, c5167p);
            if (this.f21537b != this.f21538c) {
                throw InvalidProtocolBufferException.m16103e();
            }
            this.f21538c = i13;
        } catch (Throwable th3) {
            this.f21538c = i13;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16222d(Object obj, InterfaceC5124a1 interfaceC5124a1, C5167p c5167p) throws InvalidProtocolBufferException {
        AbstractC1230l abstractC1230l = this.f21536a;
        int iMo3824E = abstractC1230l.mo3824E();
        if (abstractC1230l.f5422x >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo3838l = abstractC1230l.mo3838l(iMo3824E);
        abstractC1230l.f5422x++;
        interfaceC5124a1.mo16117f(obj, this, c5167p);
        abstractC1230l.mo3834a(0);
        abstractC1230l.f5422x--;
        abstractC1230l.mo3837k(iMo3838l);
    }

    /* JADX INFO: renamed from: e */
    public final void m16223e(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5131d;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC1230l.mo3839m()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Boolean.valueOf(abstractC1230l.mo3839m()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5131d abstractC5131d = (AbstractC5131d) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5131d.m16153c(abstractC1230l.mo3839m());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5131d.m16153c(abstractC1230l.mo3839m());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC5146i m16224f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m16241w(2);
        return this.f21536a.mo3876p();
    }

    /* JADX INFO: renamed from: g */
    public final void m16225g(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo3823D;
        if ((this.f21537b & 7) != 2) {
            int i13 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(m16224f());
            AbstractC1230l abstractC1230l = this.f21536a;
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f21537b);
        this.f21539d = iMo3823D;
    }

    /* JADX INFO: renamed from: h */
    public final void m16226h(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5161n;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 1) {
                do {
                    list.add(Double.valueOf(abstractC1230l.mo3841q()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3824E = abstractC1230l.mo3824E();
            m16219y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                list.add(Double.valueOf(abstractC1230l.mo3841q()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        AbstractC5161n abstractC5161n = (AbstractC5161n) list;
        int i15 = this.f21537b & 7;
        if (i15 == 1) {
            do {
                abstractC5161n.m16293c(abstractC1230l.mo3841q());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3824E2 = abstractC1230l.mo3824E();
        m16219y(iMo3824E2);
        int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
        do {
            abstractC5161n.m16293c(abstractC1230l.mo3841q());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
    }

    /* JADX INFO: renamed from: i */
    public final void m16227i(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3842r()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3842r()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3842r());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3842r());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: j */
    public final void m16228j(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 2) {
                int iMo3824E = abstractC1230l.mo3824E();
                m16218x(iMo3824E);
                int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3843s()));
                } while (abstractC1230l.mo3835d() < iMo3835d);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3843s()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f21537b);
            this.f21539d = iMo3823D;
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 2) {
            int iMo3824E2 = abstractC1230l.mo3824E();
            m16218x(iMo3824E2);
            int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3843s());
            } while (abstractC1230l.mo3835d() < iMo3835d2);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3843s());
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D2 = abstractC1230l.mo3823D();
            }
        } while (iMo3823D2 == this.f21537b);
        this.f21539d = iMo3823D2;
    }

    /* JADX INFO: renamed from: k */
    public final void m16229k(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5147i0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1230l.mo3844t()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3824E = abstractC1230l.mo3824E();
            m16219y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                list.add(Long.valueOf(abstractC1230l.mo3844t()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
        int i15 = this.f21537b & 7;
        if (i15 == 1) {
            do {
                abstractC5147i0.m16175c(abstractC1230l.mo3844t());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3824E2 = abstractC1230l.mo3824E();
        m16219y(iMo3824E2);
        int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
        do {
            abstractC5147i0.m16175c(abstractC1230l.mo3844t());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
    }

    /* JADX INFO: renamed from: l */
    public final void m16230l(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5176t;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 2) {
                int iMo3824E = abstractC1230l.mo3824E();
                m16218x(iMo3824E);
                int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
                do {
                    list.add(Float.valueOf(abstractC1230l.mo3845u()));
                } while (abstractC1230l.mo3835d() < iMo3835d);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Float.valueOf(abstractC1230l.mo3845u()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f21537b);
            this.f21539d = iMo3823D;
            return;
        }
        AbstractC5176t abstractC5176t = (AbstractC5176t) list;
        int i15 = this.f21537b & 7;
        if (i15 == 2) {
            int iMo3824E2 = abstractC1230l.mo3824E();
            m16218x(iMo3824E2);
            int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
            do {
                abstractC5176t.m16346c(abstractC1230l.mo3845u());
            } while (abstractC1230l.mo3835d() < iMo3835d2);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            abstractC5176t.m16346c(abstractC1230l.mo3845u());
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D2 = abstractC1230l.mo3823D();
            }
        } while (iMo3823D2 == this.f21537b);
        this.f21539d = iMo3823D2;
    }

    /* JADX INFO: renamed from: m */
    public final void m16231m(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3846v()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3846v()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3846v());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3846v());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: n */
    public final void m16232n(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5147i0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1230l.mo3847w()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Long.valueOf(abstractC1230l.mo3847w()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5147i0.m16175c(abstractC1230l.mo3847w());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5147i0.m16175c(abstractC1230l.mo3847w());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: o */
    public final void m16233o(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 2) {
                int iMo3824E = abstractC1230l.mo3824E();
                m16218x(iMo3824E);
                int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3848x()));
                } while (abstractC1230l.mo3835d() < iMo3835d);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3848x()));
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D = abstractC1230l.mo3823D();
                }
            } while (iMo3823D == this.f21537b);
            this.f21539d = iMo3823D;
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 2) {
            int iMo3824E2 = abstractC1230l.mo3824E();
            m16218x(iMo3824E2);
            int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3848x());
            } while (abstractC1230l.mo3835d() < iMo3835d2);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3848x());
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D2 = abstractC1230l.mo3823D();
            }
        } while (iMo3823D2 == this.f21537b);
        this.f21539d = iMo3823D2;
    }

    /* JADX INFO: renamed from: p */
    public final void m16234p(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5147i0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1230l.mo3849y()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3824E = abstractC1230l.mo3824E();
            m16219y(iMo3824E);
            int iMo3835d = abstractC1230l.mo3835d() + iMo3824E;
            do {
                list.add(Long.valueOf(abstractC1230l.mo3849y()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            return;
        }
        AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
        int i15 = this.f21537b & 7;
        if (i15 == 1) {
            do {
                abstractC5147i0.m16175c(abstractC1230l.mo3849y());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3824E2 = abstractC1230l.mo3824E();
        m16219y(iMo3824E2);
        int iMo3835d2 = abstractC1230l.mo3835d() + iMo3824E2;
        do {
            abstractC5147i0.m16175c(abstractC1230l.mo3849y());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
    }

    /* JADX INFO: renamed from: q */
    public final void m16235q(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3850z()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3850z()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3850z());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3850z());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: r */
    public final void m16236r(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5147i0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1230l.mo3820A()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Long.valueOf(abstractC1230l.mo3820A()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5147i0.m16175c(abstractC1230l.mo3820A());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5147i0.m16175c(abstractC1230l.mo3820A());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: s */
    public final void m16237s(List list, boolean z4) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo3821B;
        int iMo3823D;
        int iMo3823D2;
        if ((this.f21537b & 7) != 2) {
            int i13 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        boolean z13 = list instanceof InterfaceC5135e0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (z13 && !z4) {
            InterfaceC5135e0 interfaceC5135e0 = (InterfaceC5135e0) list;
            do {
                interfaceC5135e0.mo16154T0(m16224f());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        do {
            if (z4) {
                m16241w(2);
                strMo3821B = abstractC1230l.mo3822C();
            } else {
                m16241w(2);
                strMo3821B = abstractC1230l.mo3821B();
            }
            list.add(strMo3821B);
            if (abstractC1230l.mo3836e()) {
                return;
            } else {
                iMo3823D = abstractC1230l.mo3823D();
            }
        } while (iMo3823D == this.f21537b);
        this.f21539d = iMo3823D;
    }

    /* JADX INFO: renamed from: t */
    public final void m16238t(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5186y;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1230l.mo3824E()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Integer.valueOf(abstractC1230l.mo3824E()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5186y abstractC5186y = (AbstractC5186y) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5186y.m16373c(abstractC1230l.mo3824E());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5186y.m16373c(abstractC1230l.mo3824E());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: u */
    public final void m16239u(List list) throws InvalidProtocolBufferException {
        int iMo3823D;
        int iMo3823D2;
        boolean z4 = list instanceof AbstractC5147i0;
        AbstractC1230l abstractC1230l = this.f21536a;
        if (!z4) {
            int i13 = this.f21537b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1230l.mo3825F()));
                    if (abstractC1230l.mo3836e()) {
                        return;
                    } else {
                        iMo3823D = abstractC1230l.mo3823D();
                    }
                } while (iMo3823D == this.f21537b);
                this.f21539d = iMo3823D;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int iMo3835d = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
            do {
                list.add(Long.valueOf(abstractC1230l.mo3825F()));
            } while (abstractC1230l.mo3835d() < iMo3835d);
            m16240v(iMo3835d);
            return;
        }
        AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
        int i15 = this.f21537b & 7;
        if (i15 == 0) {
            do {
                abstractC5147i0.m16175c(abstractC1230l.mo3825F());
                if (abstractC1230l.mo3836e()) {
                    return;
                } else {
                    iMo3823D2 = abstractC1230l.mo3823D();
                }
            } while (iMo3823D2 == this.f21537b);
            this.f21539d = iMo3823D2;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f21476x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo3835d2 = abstractC1230l.mo3835d() + abstractC1230l.mo3824E();
        do {
            abstractC5147i0.m16175c(abstractC1230l.mo3825F());
        } while (abstractC1230l.mo3835d() < iMo3835d2);
        m16240v(iMo3835d2);
    }

    /* JADX INFO: renamed from: v */
    public final void m16240v(int i13) throws InvalidProtocolBufferException {
        if (this.f21536a.mo3835d() != i13) {
            throw InvalidProtocolBufferException.m16104f();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16241w(int i13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f21537b & 7) == i13) {
            return;
        }
        int i14 = InvalidProtocolBufferException.f21476x;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }
}
