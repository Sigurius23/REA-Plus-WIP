package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1269z extends AbstractC1197a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1269z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1214f1 unknownFields;

    public AbstractC1269z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1214f1.f5390f;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1269z m4020d(Class cls) {
        AbstractC1269z abstractC1269z = defaultInstanceMap.get(cls);
        if (abstractC1269z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1269z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC1269z != null) {
            return abstractC1269z;
        }
        AbstractC1269z abstractC1269z2 = (AbstractC1269z) ((AbstractC1269z) AbstractC1235m1.m3918d(cls)).mo4024c(6);
        if (abstractC1269z2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1269z2);
        return abstractC1269z2;
    }

    /* JADX INFO: renamed from: e */
    public static Object m4021e(Method method, AbstractC1269z abstractC1269z, Object... objArr) {
        try {
            return method.invoke(abstractC1269z, objArr);
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

    /* JADX INFO: renamed from: f */
    public static final boolean m4022f(AbstractC1269z abstractC1269z, boolean z4) {
        byte bByteValue = ((Byte) abstractC1269z.mo4024c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C1264w0 c1264w0 = C1264w0.f5502c;
        c1264w0.getClass();
        boolean zMo3990c = c1264w0.m4012a(abstractC1269z.getClass()).mo3990c(abstractC1269z);
        if (z4) {
            abstractC1269z.mo4024c(2);
        }
        return zMo3990c;
    }

    /* JADX INFO: renamed from: j */
    public static void m4023j(Class cls, AbstractC1269z abstractC1269z) {
        abstractC1269z.m4026h();
        defaultInstanceMap.put(cls, abstractC1269z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1197a
    /* JADX INFO: renamed from: a */
    public final int mo3748a(InterfaceC1270z0 interfaceC1270z0) {
        int iMo3994g;
        int iMo3994g2;
        if (m4025g()) {
            if (interfaceC1270z0 == null) {
                C1264w0 c1264w0 = C1264w0.f5502c;
                c1264w0.getClass();
                iMo3994g2 = c1264w0.m4012a(getClass()).mo3994g(this);
            } else {
                iMo3994g2 = interfaceC1270z0.mo3994g(this);
            }
            if (iMo3994g2 >= 0) {
                return iMo3994g2;
            }
            throw new IllegalStateException(AbstractC2875y.m8295h(iMo3994g2, "serialized size must be non-negative, was "));
        }
        int i13 = this.memoizedSerializedSize;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        if (interfaceC1270z0 == null) {
            C1264w0 c1264w1 = C1264w0.f5502c;
            c1264w1.getClass();
            iMo3994g = c1264w1.m4012a(getClass()).mo3994g(this);
        } else {
            iMo3994g = interfaceC1270z0.mo3994g(this);
        }
        m4028k(iMo3994g);
        return iMo3994g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1197a
    /* JADX INFO: renamed from: b */
    public final void mo3749b(C1236n c1236n) {
        C1264w0 c1264w0 = C1264w0.f5502c;
        c1264w0.getClass();
        InterfaceC1270z0 interfaceC1270z0M4012a = c1264w0.m4012a(getClass());
        C1225j0 c1225j0 = c1236n.f5440d;
        if (c1225j0 == null) {
            c1225j0 = new C1225j0(c1236n);
        }
        interfaceC1270z0M4012a.mo3992e(this, c1225j0);
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo4024c(int i13);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1264w0 c1264w0 = C1264w0.f5502c;
        c1264w0.getClass();
        return c1264w0.m4012a(getClass()).mo3996i(this, (AbstractC1269z) obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4025g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m4026h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m4025g()) {
            C1264w0 c1264w0 = C1264w0.f5502c;
            c1264w0.getClass();
            return c1264w0.m4012a(getClass()).mo3995h(this);
        }
        if (this.memoizedHashCode == 0) {
            C1264w0 c1264w1 = C1264w0.f5502c;
            c1264w1.getClass();
            this.memoizedHashCode = c1264w1.m4012a(getClass()).mo3995h(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC1269z m4027i() {
        return (AbstractC1269z) mo4024c(4);
    }

    /* JADX INFO: renamed from: k */
    public final void m4028k(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(AbstractC2875y.m8295h(i13, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        return AbstractC1243p0.m3967d(this, super.toString());
    }
}
