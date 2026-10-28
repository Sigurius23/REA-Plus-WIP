package p076d;

import c13.AbstractC3855a;
import java.io.IOException;

/* JADX INFO: renamed from: d.h1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11290h1 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC11307q[] f36215a;

    public AbstractC11290h1() {
        this.f36215a = C11311s.f36243d;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC11290h1 m30504m(Object obj) {
        if (obj == null || (obj instanceof AbstractC11290h1)) {
            return (AbstractC11290h1) obj;
        }
        if (obj instanceof InterfaceC11307q) {
            AbstractC11272b1 abstractC11272b1Mo30482d = ((InterfaceC11307q) obj).mo30482d();
            if (abstractC11272b1Mo30482d instanceof AbstractC11290h1) {
                return (AbstractC11290h1) abstractC11272b1Mo30482d;
            }
        } else if (obj instanceof byte[]) {
            try {
                C11286g0 c11286g0 = new C11286g0((byte[]) obj);
                try {
                    AbstractC11272b1 abstractC11272b1M30502i = c11286g0.m30502i();
                    if (c11286g0.available() != 0) {
                        throw new IOException("Extra data detected in stream");
                    }
                    if (AbstractC11290h1.class.isInstance(abstractC11272b1M30502i)) {
                        return (AbstractC11290h1) abstractC11272b1M30502i;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(abstractC11272b1M30502i.getClass().getName()));
                } catch (ClassCastException unused) {
                    throw new IOException("cannot recognise object in stream");
                }
            } catch (IOException e5) {
                throw new IllegalArgumentException(AbstractC3855a.m11824h(e5, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof AbstractC11290h1) {
            AbstractC11290h1 abstractC11290h1 = (AbstractC11290h1) abstractC11272b1;
            int iMo30507o = mo30507o();
            if (abstractC11290h1.mo30507o() == iMo30507o) {
                for (int i13 = 0; i13 < iMo30507o; i13++) {
                    AbstractC11272b1 abstractC11272b1Mo30482d = this.f36215a[i13].mo30482d();
                    AbstractC11272b1 abstractC11272b1Mo30482d2 = abstractC11290h1.f36215a[i13].mo30482d();
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
    public int hashCode() {
        int length = this.f36215a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f36215a[length].mo30482d().hashCode();
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        C11321x c11321x = new C11321x(this.f36215a, 0);
        c11321x.f36274c = -1;
        return c11321x;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        C11321x c11321x = new C11321x(this.f36215a, 1);
        c11321x.f36274c = -1;
        return c11321x;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC11307q mo30505l(int i13) {
        return this.f36215a[i13];
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC11285g[] m30506n() {
        InterfaceC11307q interfaceC11307qMo30482d;
        int iMo30507o = mo30507o();
        AbstractC11285g[] abstractC11285gArr = new AbstractC11285g[iMo30507o];
        for (int i13 = 0; i13 < iMo30507o; i13++) {
            InterfaceC11307q interfaceC11307q = this.f36215a[i13];
            if (interfaceC11307q == null || (interfaceC11307q instanceof AbstractC11285g)) {
                interfaceC11307qMo30482d = interfaceC11307q;
            } else {
                interfaceC11307qMo30482d = interfaceC11307q.mo30482d();
                if (!(interfaceC11307qMo30482d instanceof AbstractC11285g)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC11307q.getClass().getName()));
                }
            }
            abstractC11285gArr[i13] = (AbstractC11285g) interfaceC11307qMo30482d;
        }
        return abstractC11285gArr;
    }

    /* JADX INFO: renamed from: o */
    public int mo30507o() {
        return this.f36215a.length;
    }

    /* JADX INFO: renamed from: p */
    public abstract AbstractC11285g mo30490p();

    /* JADX INFO: renamed from: q */
    public abstract AbstractC11322x0 mo30491q();

    public final String toString() {
        int iMo30507o = mo30507o();
        if (iMo30507o == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i13 = 0;
        while (true) {
            stringBuffer.append(this.f36215a[i13]);
            i13++;
            if (i13 >= iMo30507o) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC11290h1(C11311s c11311s) {
        if (c11311s == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f36215a = c11311s.m30523f();
    }

    public AbstractC11290h1(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f36215a = new InterfaceC11307q[]{abstractC11272b1};
    }
}
