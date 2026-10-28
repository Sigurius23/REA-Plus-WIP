package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import ro.C31624i;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: d.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11277d0 extends AbstractC11272b1 implements InterfaceC11282f {

    /* JADX INFO: renamed from: a */
    public final int f36193a;

    /* JADX INFO: renamed from: b */
    public final int f36194b;

    /* JADX INFO: renamed from: c */
    public final int f36195c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11307q f36196d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36197e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11277d0(int i13, int i14, int i15, InterfaceC11307q interfaceC11307q, int i16) {
        this(i13, i14, i15, interfaceC11307q);
        this.f36197e = i16;
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() {
        return this;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        int i13;
        int i14;
        int i15;
        switch (this.f36197e) {
            case 0:
                AbstractC11272b1 abstractC11272b1Mo30476j = this.f36196d.mo30482d().mo30476j();
                boolean zM30487l = m30487l();
                int iMo30479c = abstractC11272b1Mo30476j.mo30479c(zM30487l);
                int i16 = 2;
                int i17 = 1;
                if (zM30487l) {
                    if (iMo30479c < 128) {
                        i13 = 1;
                    } else {
                        int i18 = iMo30479c;
                        i13 = 2;
                        while (true) {
                            i18 >>>= 8;
                            if (i18 != 0) {
                                i13++;
                            }
                        }
                    }
                    iMo30479c += i13;
                }
                if (z4) {
                    int i19 = this.f36195c;
                    if (i19 >= 31) {
                        while (true) {
                            i19 >>>= 7;
                            if (i19 != 0) {
                                i16++;
                            } else {
                                i17 = i16;
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                return iMo30479c + i17;
            case 1:
                AbstractC11272b1 abstractC11272b1Mo30482d = this.f36196d.mo30482d();
                boolean zM30487l2 = m30487l();
                int iMo30479c2 = abstractC11272b1Mo30482d.mo30479c(zM30487l2);
                if (zM30487l2) {
                    iMo30479c2 += 3;
                }
                if (z4) {
                    int i24 = this.f36195c;
                    if (i24 < 31) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                        while (true) {
                            i24 >>>= 7;
                            if (i24 != 0) {
                                i14++;
                            }
                        }
                    }
                } else {
                    i14 = 0;
                }
                return iMo30479c2 + i14;
            default:
                AbstractC11272b1 abstractC11272b1Mo30477k = this.f36196d.mo30482d().mo30477k();
                boolean zM30487l3 = m30487l();
                int iMo30479c3 = abstractC11272b1Mo30477k.mo30479c(zM30487l3);
                int i25 = 2;
                int i26 = 1;
                if (zM30487l3) {
                    if (iMo30479c3 < 128) {
                        i15 = 1;
                    } else {
                        int i27 = iMo30479c3;
                        i15 = 2;
                        while (true) {
                            i27 >>>= 8;
                            if (i27 != 0) {
                                i15++;
                            }
                        }
                    }
                    iMo30479c3 += i15;
                }
                if (z4) {
                    int i28 = this.f36195c;
                    if (i28 >= 31) {
                        while (true) {
                            i28 >>>= 7;
                            if (i28 != 0) {
                                i25++;
                            } else {
                                i26 = i25;
                            }
                        }
                    }
                } else {
                    i26 = 0;
                }
                return iMo30479c3 + i26;
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        switch (this.f36197e) {
            case 0:
                AbstractC11272b1 abstractC11272b1Mo30476j = this.f36196d.mo30482d().mo30476j();
                boolean zM30487l = m30487l();
                if (z4) {
                    int i13 = this.f36194b;
                    if (zM30487l || abstractC11272b1Mo30476j.mo30475h()) {
                        i13 |= 32;
                    }
                    c31624i.m97706e(i13, this.f36195c);
                }
                if (zM30487l) {
                    c31624i.m97705d(abstractC11272b1Mo30476j.mo30479c(true));
                }
                abstractC11272b1Mo30476j.mo30480f(c31624i.mo30515c(), zM30487l);
                break;
            case 1:
                AbstractC11272b1 abstractC11272b1Mo30482d = this.f36196d.mo30482d();
                boolean zM30487l2 = m30487l();
                if (z4) {
                    int i14 = this.f36194b;
                    if (zM30487l2 || abstractC11272b1Mo30482d.mo30475h()) {
                        i14 |= 32;
                    }
                    c31624i.m97706e(i14, this.f36195c);
                }
                if (!zM30487l2) {
                    abstractC11272b1Mo30482d.mo30480f(c31624i, false);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c31624i.f130665x;
                    byteArrayOutputStream.write(128);
                    abstractC11272b1Mo30482d.mo30480f(c31624i, true);
                    byteArrayOutputStream.write(0);
                    byteArrayOutputStream.write(0);
                }
                break;
            default:
                AbstractC11272b1 abstractC11272b1Mo30477k = this.f36196d.mo30482d().mo30477k();
                boolean zM30487l3 = m30487l();
                if (z4) {
                    int i15 = this.f36194b;
                    if (zM30487l3 || abstractC11272b1Mo30477k.mo30475h()) {
                        i15 |= 32;
                    }
                    c31624i.m97706e(i15, this.f36195c);
                }
                if (zM30487l3) {
                    c31624i.m97705d(abstractC11272b1Mo30477k.mo30479c(true));
                }
                abstractC11272b1Mo30477k.mo30480f(c31624i.mo30533l(), zM30487l3);
                break;
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (!(abstractC11272b1 instanceof C11277d0)) {
            return false;
        }
        C11277d0 c11277d0 = (C11277d0) abstractC11272b1;
        if (this.f36195c != c11277d0.f36195c || this.f36194b != c11277d0.f36194b) {
            return false;
        }
        if (this.f36193a != c11277d0.f36193a && m30487l() != c11277d0.m30487l()) {
            return false;
        }
        AbstractC11272b1 abstractC11272b1Mo30482d = this.f36196d.mo30482d();
        AbstractC11272b1 abstractC11272b1Mo30482d2 = c11277d0.f36196d.mo30482d();
        if (abstractC11272b1Mo30482d == abstractC11272b1Mo30482d2) {
            return true;
        }
        if (m30487l()) {
            return abstractC11272b1Mo30482d.mo30474g(abstractC11272b1Mo30482d2);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo30480f(new C31624i(byteArrayOutputStream, 19), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            c11277d0.mo30480f(new C31624i(byteArrayOutputStream2, 19), true);
            return Arrays.equals(byteArray, byteArrayOutputStream2.toByteArray());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        switch (this.f36197e) {
            case 0:
                return m30487l() || this.f36196d.mo30482d().mo30476j().mo30475h();
            case 1:
                return m30487l() || this.f36196d.mo30482d().mo30475h();
            default:
                return m30487l() || this.f36196d.mo30482d().mo30477k().mo30475h();
        }
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return (((this.f36194b * 7919) ^ this.f36195c) ^ (m30487l() ? 15 : 240)) ^ this.f36196d.mo30482d().hashCode();
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        switch (this.f36197e) {
            case 0:
                return this;
            default:
                return new C11277d0(this.f36193a, this.f36194b, this.f36195c, this.f36196d, 0);
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        switch (this.f36197e) {
            case 0:
            case 2:
                return this;
            case 1:
            default:
                return new C11277d0(this.f36193a, this.f36194b, this.f36195c, this.f36196d, 2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30487l() {
        int i13 = this.f36193a;
        return i13 == 1 || i13 == 3;
    }

    public final String toString() {
        return AbstractC37926s0.m121470h(this.f36194b, this.f36195c) + this.f36196d;
    }

    public C11277d0(int i13, int i14, int i15, InterfaceC11307q interfaceC11307q) {
        if (interfaceC11307q == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i14 == 0 || (i14 & 192) != i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "invalid tag class: "));
        }
        this.f36193a = i13;
        this.f36194b = i14;
        this.f36195c = i15;
        this.f36196d = interfaceC11307q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11277d0(boolean z4, int i13, AbstractC11272b1 abstractC11272b1, int i14) {
        this(z4 ? 1 : 2, 128, i13, abstractC11272b1);
        this.f36197e = i14;
    }
}
