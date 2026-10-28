package androidx.health.platform.client.proto;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.u0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1534u0 extends AbstractC1433a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1534u0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1457e3 unknownFields;

    public AbstractC1534u0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1457e3.f6031f;
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC1534u0 m4864f(Class cls) {
        AbstractC1534u0 abstractC1534u0 = defaultInstanceMap.get(cls);
        if (abstractC1534u0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1534u0 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC1534u0 != null) {
            return abstractC1534u0;
        }
        AbstractC1534u0 abstractC1534u1 = (AbstractC1534u0) ((AbstractC1534u0) AbstractC1502n3.m4720b(cls)).mo4573e(6);
        if (abstractC1534u1 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1534u1);
        return abstractC1534u1;
    }

    /* JADX INFO: renamed from: g */
    public static Object m4865g(Method method, AbstractC1534u0 abstractC1534u0, Object... objArr) {
        try {
            return method.invoke(abstractC1534u0, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m4866h(AbstractC1534u0 abstractC1534u0, boolean z4) {
        byte bByteValue = ((Byte) abstractC1534u0.mo4573e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C1554y1 c1554y1 = C1554y1.f6164c;
        c1554y1.getClass();
        boolean zMo4766c = c1554y1.m4946a(abstractC1534u0.getClass()).mo4766c(abstractC1534u0);
        if (z4) {
            abstractC1534u0.mo4573e(2);
        }
        return zMo4766c;
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1544w0 m4867k(InterfaceC1544w0 interfaceC1544w0) {
        int size = interfaceC1544w0.size();
        return interfaceC1544w0.mo4923i(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC1534u0 m4868m(AbstractC1534u0 abstractC1534u0, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        C1489l0 c1489l0M4695a = C1489l0.m4695a();
        AbstractC1534u0 abstractC1534u0M4873l = abstractC1534u0.m4873l();
        try {
            C1554y1 c1554y1 = C1554y1.f6164c;
            c1554y1.getClass();
            InterfaceC1536u2 interfaceC1536u2M4946a = c1554y1.m4946a(abstractC1534u0M4873l.getClass());
            C1448d c1448d = new C1448d();
            c1489l0M4695a.getClass();
            interfaceC1536u2M4946a.mo4768e(abstractC1534u0M4873l, bArr, 0, length, c1448d);
            interfaceC1536u2M4946a.mo4765b(abstractC1534u0M4873l);
            if (m4866h(abstractC1534u0M4873l, true)) {
                return abstractC1534u0M4873l;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e5) {
            throw e5;
        } catch (UninitializedMessageException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (IOException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m4561d();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m4869n(Class cls, AbstractC1534u0 abstractC1534u0) {
        abstractC1534u0.m4872j();
        defaultInstanceMap.put(cls, abstractC1534u0);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1433a
    /* JADX INFO: renamed from: b */
    public final int mo4563b(InterfaceC1536u2 interfaceC1536u2) {
        int iMo4772i;
        int iMo4772i2;
        if (m4871i()) {
            if (interfaceC1536u2 == null) {
                C1554y1 c1554y1 = C1554y1.f6164c;
                c1554y1.getClass();
                iMo4772i2 = c1554y1.m4946a(getClass()).mo4772i(this);
            } else {
                iMo4772i2 = interfaceC1536u2.mo4772i(this);
            }
            if (iMo4772i2 >= 0) {
                return iMo4772i2;
            }
            throw new IllegalStateException(AbstractC2875y.m8295h(iMo4772i2, "serialized size must be non-negative, was "));
        }
        int i13 = this.memoizedSerializedSize;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        if (interfaceC1536u2 == null) {
            C1554y1 c1554y2 = C1554y1.f6164c;
            c1554y2.getClass();
            iMo4772i = c1554y2.m4946a(getClass()).mo4772i(this);
        } else {
            iMo4772i = interfaceC1536u2.mo4772i(this);
        }
        m4874o(iMo4772i);
        return iMo4772i;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1433a
    /* JADX INFO: renamed from: c */
    public final void mo4564c(C1483k c1483k) {
        C1554y1 c1554y1 = C1554y1.f6164c;
        c1554y1.getClass();
        InterfaceC1536u2 interfaceC1536u2M4946a = c1554y1.m4946a(getClass());
        C1465g1 c1465g1 = c1483k.f6058c;
        if (c1465g1 == null) {
            c1465g1 = new C1465g1(c1483k);
        }
        interfaceC1536u2M4946a.mo4771h(this, c1465g1);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1524s0 m4870d() {
        return (AbstractC1524s0) mo4573e(5);
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo4573e(int i13);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1554y1 c1554y1 = C1554y1.f6164c;
        c1554y1.getClass();
        return c1554y1.m4946a(getClass()).mo4770g(this, (AbstractC1534u0) obj);
    }

    public final int hashCode() {
        if (m4871i()) {
            C1554y1 c1554y1 = C1554y1.f6164c;
            c1554y1.getClass();
            return c1554y1.m4946a(getClass()).mo4769f(this);
        }
        if (this.memoizedHashCode == 0) {
            C1554y1 c1554y2 = C1554y1.f6164c;
            c1554y2.getClass();
            this.memoizedHashCode = c1554y2.m4946a(getClass()).mo4769f(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4871i() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m4872j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC1534u0 m4873l() {
        return (AbstractC1534u0) mo4573e(4);
    }

    /* JADX INFO: renamed from: o */
    public final void m4874o(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(AbstractC2875y.m8295h(i13, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1500n1.f6072a;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("# ");
        sb4.append(string);
        AbstractC1500n1.m4718c(this, sb4, 0);
        return sb4.toString();
    }
}
