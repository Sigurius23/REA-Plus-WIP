package p076d;

import java.io.IOException;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11267a extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11307q[] f36181a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11307q[] f36182b;

    public AbstractC11267a() {
        InterfaceC11307q[] interfaceC11307qArr = C11311s.f36243d;
        this.f36181a = interfaceC11307qArr;
        this.f36182b = interfaceC11307qArr;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m30473l(byte[] bArr, byte[] bArr2) {
        int i13 = bArr[0] & 223;
        int i14 = bArr2[0] & 223;
        if (i13 != i14) {
            return i13 < i14;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i15 = 1; i15 < iMin; i15++) {
            byte b = bArr[i15];
            byte b6 = bArr2[i15];
            if (b != b6) {
                return (b & 255) < (b6 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof AbstractC11267a) {
            AbstractC11267a abstractC11267a = (AbstractC11267a) abstractC11272b1;
            int length = this.f36181a.length;
            if (abstractC11267a.f36181a.length == length) {
                C11325z c11325z = (C11325z) mo30476j();
                C11325z c11325z2 = (C11325z) abstractC11267a.mo30476j();
                for (int i13 = 0; i13 < length; i13++) {
                    AbstractC11272b1 abstractC11272b1Mo30482d = c11325z.f36181a[i13].mo30482d();
                    AbstractC11272b1 abstractC11272b1Mo30482d2 = c11325z2.f36181a[i13].mo30482d();
                    if (abstractC11272b1Mo30482d == abstractC11272b1Mo30482d2 || abstractC11272b1Mo30482d.mo30474g(abstractC11272b1Mo30482d2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return true;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        InterfaceC11307q[] interfaceC11307qArr = this.f36181a;
        int length = interfaceC11307qArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += interfaceC11307qArr[length].mo30482d().hashCode();
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        int i13;
        if (this.f36182b == null) {
            InterfaceC11307q[] interfaceC11307qArr = (InterfaceC11307q[]) this.f36181a.clone();
            this.f36182b = interfaceC11307qArr;
            int length = interfaceC11307qArr.length;
            if (length >= 2) {
                InterfaceC11307q interfaceC11307q = interfaceC11307qArr[0];
                InterfaceC11307q interfaceC11307q2 = interfaceC11307qArr[1];
                try {
                    byte[] bArrM30483i = interfaceC11307q.mo30482d().m30483i();
                    try {
                        byte[] bArrM30483i2 = interfaceC11307q2.mo30482d().m30483i();
                        if (m30473l(bArrM30483i2, bArrM30483i)) {
                            interfaceC11307q2 = interfaceC11307q;
                            interfaceC11307q = interfaceC11307q2;
                            bArrM30483i2 = bArrM30483i;
                            bArrM30483i = bArrM30483i2;
                        }
                        for (int i14 = 2; i14 < length; i14++) {
                            InterfaceC11307q interfaceC11307q3 = interfaceC11307qArr[i14];
                            try {
                                byte[] bArrM30483i3 = interfaceC11307q3.mo30482d().m30483i();
                                if (m30473l(bArrM30483i2, bArrM30483i3)) {
                                    interfaceC11307qArr[i14 - 2] = interfaceC11307q;
                                    interfaceC11307q = interfaceC11307q2;
                                    bArrM30483i = bArrM30483i2;
                                    interfaceC11307q2 = interfaceC11307q3;
                                    bArrM30483i2 = bArrM30483i3;
                                } else if (m30473l(bArrM30483i, bArrM30483i3)) {
                                    interfaceC11307qArr[i14 - 2] = interfaceC11307q;
                                    interfaceC11307q = interfaceC11307q3;
                                    bArrM30483i = bArrM30483i3;
                                } else {
                                    int i15 = i14 - 1;
                                    while (true) {
                                        i13 = i15 - 1;
                                        if (i13 <= 0) {
                                            break;
                                        }
                                        InterfaceC11307q interfaceC11307q4 = interfaceC11307qArr[i15 - 2];
                                        try {
                                            if (m30473l(interfaceC11307q4.mo30482d().m30483i(), bArrM30483i3)) {
                                                break;
                                            }
                                            interfaceC11307qArr[i13] = interfaceC11307q4;
                                            i15 = i13;
                                        } catch (IOException unused) {
                                            throw new IllegalArgumentException("cannot encode object added to SET");
                                        }
                                    }
                                    interfaceC11307qArr[i13] = interfaceC11307q3;
                                }
                            } catch (IOException unused2) {
                                throw new IllegalArgumentException("cannot encode object added to SET");
                            }
                        }
                        interfaceC11307qArr[length - 2] = interfaceC11307q;
                        interfaceC11307qArr[length - 1] = interfaceC11307q2;
                    } catch (IOException unused3) {
                        throw new IllegalArgumentException("cannot encode object added to SET");
                    }
                } catch (IOException unused4) {
                    throw new IllegalArgumentException("cannot encode object added to SET");
                }
            }
        }
        C11325z c11325z = new C11325z(this.f36182b);
        c11325z.f36281d = -1;
        return c11325z;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        C11325z c11325z = new C11325z(this.f36181a, this.f36182b);
        c11325z.f36281d = -1;
        return c11325z;
    }

    public final String toString() {
        InterfaceC11307q[] interfaceC11307qArr = this.f36181a;
        int length = interfaceC11307qArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i13 = 0;
        while (true) {
            stringBuffer.append(interfaceC11307qArr[i13]);
            i13++;
            if (i13 >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC11267a(C11311s c11311s) {
        if (c11311s == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        InterfaceC11307q[] interfaceC11307qArrM30523f = c11311s.m30523f();
        this.f36181a = interfaceC11307qArrM30523f;
        this.f36182b = interfaceC11307qArrM30523f.length >= 2 ? null : interfaceC11307qArrM30523f;
    }

    public AbstractC11267a(InterfaceC11307q[] interfaceC11307qArr) {
        this.f36181a = interfaceC11307qArr;
        this.f36182b = interfaceC11307qArr;
    }

    public AbstractC11267a(InterfaceC11307q[] interfaceC11307qArr, InterfaceC11307q[] interfaceC11307qArr2) {
        this.f36181a = interfaceC11307qArr;
        this.f36182b = interfaceC11307qArr2;
    }
}
