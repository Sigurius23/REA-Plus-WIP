package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1368a0 extends AbstractC1367a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1368a0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1381e1 unknownFields;

    public AbstractC1368a0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1381e1.f5880f;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1368a0 m4270e(Class cls) {
        AbstractC1368a0 abstractC1368a0 = defaultInstanceMap.get(cls);
        if (abstractC1368a0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1368a0 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC1368a0 != null) {
            return abstractC1368a0;
        }
        AbstractC1368a0 abstractC1368a1 = (AbstractC1368a0) ((AbstractC1368a0) AbstractC1399k1.m4409b(cls)).mo4275d(6);
        if (abstractC1368a1 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1368a1);
        return abstractC1368a1;
    }

    /* JADX INFO: renamed from: f */
    public static Object m4271f(Method method, AbstractC1368a0 abstractC1368a0, Object... objArr) {
        try {
            return method.invoke(abstractC1368a0, objArr);
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

    /* JADX INFO: renamed from: g */
    public static final boolean m4272g(AbstractC1368a0 abstractC1368a0, boolean z4) {
        byte bByteValue = ((Byte) abstractC1368a0.mo4275d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C1430y0 c1430y0 = C1430y0.f5993c;
        c1430y0.getClass();
        boolean zMo4289c = c1430y0.m4555a(abstractC1368a0.getClass()).mo4289c(abstractC1368a0);
        if (z4) {
            abstractC1368a0.mo4275d(2);
        }
        return zMo4289c;
    }

    /* JADX INFO: renamed from: k */
    public static void m4273k(Class cls, AbstractC1368a0 abstractC1368a0) {
        abstractC1368a0.m4277i();
        defaultInstanceMap.put(cls, abstractC1368a0);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1367a
    /* JADX INFO: renamed from: b */
    public final int mo4269b(InterfaceC1372b1 interfaceC1372b1) {
        int iMo4294h;
        int iMo4294h2;
        if (m4276h()) {
            if (interfaceC1372b1 == null) {
                C1430y0 c1430y0 = C1430y0.f5993c;
                c1430y0.getClass();
                iMo4294h2 = c1430y0.m4555a(getClass()).mo4294h(this);
            } else {
                iMo4294h2 = interfaceC1372b1.mo4294h(this);
            }
            if (iMo4294h2 >= 0) {
                return iMo4294h2;
            }
            throw new IllegalStateException(AbstractC2875y.m8295h(iMo4294h2, "serialized size must be non-negative, was "));
        }
        int i13 = this.memoizedSerializedSize;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        if (interfaceC1372b1 == null) {
            C1430y0 c1430y1 = C1430y0.f5993c;
            c1430y1.getClass();
            iMo4294h = c1430y1.m4555a(getClass()).mo4294h(this);
        } else {
            iMo4294h = interfaceC1372b1.mo4294h(this);
        }
        m4279l(iMo4294h);
        return iMo4294h;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1429y m4274c() {
        return (AbstractC1429y) mo4275d(5);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo4275d(int i13);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1430y0 c1430y0 = C1430y0.f5993c;
        c1430y0.getClass();
        return c1430y0.m4555a(getClass()).mo4296j(this, (AbstractC1368a0) obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4276h() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (m4276h()) {
            C1430y0 c1430y0 = C1430y0.f5993c;
            c1430y0.getClass();
            return c1430y0.m4555a(getClass()).mo4292f(this);
        }
        if (this.memoizedHashCode == 0) {
            C1430y0 c1430y1 = C1430y0.f5993c;
            c1430y1.getClass();
            this.memoizedHashCode = c1430y1.m4555a(getClass()).mo4292f(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m4277i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC1368a0 m4278j() {
        return (AbstractC1368a0) mo4275d(4);
    }

    /* JADX INFO: renamed from: l */
    public final void m4279l(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(AbstractC2875y.m8295h(i13, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public final void m4280m(AbstractC1411p abstractC1411p) {
        C1430y0 c1430y0 = C1430y0.f5993c;
        c1430y0.getClass();
        InterfaceC1372b1 interfaceC1372b1M4555a = c1430y0.m4555a(getClass());
        C1404m0 c1404m0 = abstractC1411p.f5955d;
        if (c1404m0 == null) {
            c1404m0 = new C1404m0(abstractC1411p);
        }
        interfaceC1372b1M4555a.mo4295i(this, c1404m0);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1416r0.f5959a;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("# ");
        sb4.append(string);
        AbstractC1416r0.m4511c(this, sb4, 0);
        return sb4.toString();
    }
}
