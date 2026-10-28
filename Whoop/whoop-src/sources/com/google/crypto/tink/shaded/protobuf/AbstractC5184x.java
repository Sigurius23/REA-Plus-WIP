package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import androidx.health.platform.client.proto.C1448d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5184x extends AbstractC5122a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5184x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C5133d1 unknownFields;

    public AbstractC5184x() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C5133d1.f21499f;
    }

    /* JADX INFO: renamed from: h */
    public static void m16352h(AbstractC5184x abstractC5184x) throws InvalidProtocolBufferException {
        if (!m16355o(abstractC5184x, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC5184x m16353k(Class cls) {
        AbstractC5184x abstractC5184x = defaultInstanceMap.get(cls);
        if (abstractC5184x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5184x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC5184x != null) {
            return abstractC5184x;
        }
        AbstractC5184x abstractC5184xMo16299a = ((AbstractC5184x) AbstractC5160m1.m16278b(cls)).mo16299a();
        if (abstractC5184xMo16299a == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC5184xMo16299a);
        return abstractC5184xMo16299a;
    }

    /* JADX INFO: renamed from: n */
    public static Object m16354n(Method method, AbstractC5184x abstractC5184x, Object... objArr) {
        try {
            return method.invoke(abstractC5184x, objArr);
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

    /* JADX INFO: renamed from: o */
    public static final boolean m16355o(AbstractC5184x abstractC5184x, boolean z4) {
        byte bByteValue = ((Byte) abstractC5184x.mo16361j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo16114c = C5185x0.m16370a().m16372c(abstractC5184x).mo16114c(abstractC5184x);
        if (z4) {
            abstractC5184x.mo16361j(2);
        }
        return zMo16114c;
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC5184x m16356t(AbstractC5184x abstractC5184x, AbstractC5146i abstractC5146i, C5167p c5167p) throws InvalidProtocolBufferException {
        C5143h c5143h = (C5143h) abstractC5146i;
        C5149j c5149jM3868f = AbstractC1230l.m3868f(c5143h.f21510z, c5143h.mo16167j(), c5143h.size(), true);
        AbstractC5184x abstractC5184xM16358v = m16358v(abstractC5184x, c5149jM3868f, c5167p);
        c5149jM3868f.mo3834a(0);
        m16352h(abstractC5184xM16358v);
        return abstractC5184xM16358v;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5184x m16357u(AbstractC5184x abstractC5184x, byte[] bArr, C5167p c5167p) throws InvalidProtocolBufferException {
        int length = bArr.length;
        AbstractC5184x abstractC5184xM16367s = abstractC5184x.m16367s();
        try {
            InterfaceC5124a1 interfaceC5124a1M16372c = C5185x0.m16370a().m16372c(abstractC5184xM16367s);
            interfaceC5124a1M16372c.mo16118g(abstractC5184xM16367s, bArr, 0, length, new C1448d(c5167p));
            interfaceC5124a1M16372c.mo16113b(abstractC5184xM16367s);
            m16352h(abstractC5184xM16367s);
            return abstractC5184xM16367s;
        } catch (InvalidProtocolBufferException e5) {
            if (e5.f21477w) {
                throw new InvalidProtocolBufferException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (UninitializedMessageException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (IOException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m16104f();
        }
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5184x m16358v(AbstractC5184x abstractC5184x, AbstractC1230l abstractC1230l, C5167p c5167p) throws InvalidProtocolBufferException {
        AbstractC5184x abstractC5184xM16367s = abstractC5184x.m16367s();
        try {
            InterfaceC5124a1 interfaceC5124a1M16372c = C5185x0.m16370a().m16372c(abstractC5184xM16367s);
            interfaceC5124a1M16372c.mo16117f(abstractC5184xM16367s, C5155l.m16217a(abstractC1230l), c5167p);
            interfaceC5124a1M16372c.mo16113b(abstractC5184xM16367s);
            return abstractC5184xM16367s;
        } catch (InvalidProtocolBufferException e5) {
            if (e5.f21477w) {
                throw new InvalidProtocolBufferException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (UninitializedMessageException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (IOException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        } catch (RuntimeException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw e15;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16359w(Class cls, AbstractC5184x abstractC5184x) {
        abstractC5184x.m16365q();
        defaultInstanceMap.put(cls, abstractC5184x);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5122a
    /* JADX INFO: renamed from: b */
    public final int mo16105b(InterfaceC5124a1 interfaceC5124a1) {
        if (m16364p()) {
            int iMo16116e = interfaceC5124a1 == null ? C5185x0.m16370a().m16372c(this).mo16116e(this) : interfaceC5124a1.mo16116e(this);
            if (iMo16116e >= 0) {
                return iMo16116e;
            }
            throw new IllegalStateException(AbstractC2875y.m8295h(iMo16116e, "serialized size must be non-negative, was "));
        }
        int i13 = this.memoizedSerializedSize;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        int iMo16116e2 = interfaceC5124a1 == null ? C5185x0.m16370a().m16372c(this).mo16116e(this) : interfaceC5124a1.mo16116e(this);
        m16368x(iMo16116e2);
        return iMo16116e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5185x0.m16370a().m16372c(this).mo16120i(this, (AbstractC5184x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5122a
    /* JADX INFO: renamed from: g */
    public final void mo16110g(C5158m c5158m) {
        C5185x0.m16370a().m16372c(this).mo16119h(this, C5153k0.m16207a(c5158m));
    }

    public final int hashCode() {
        if (m16364p()) {
            return C5185x0.m16370a().m16372c(this).mo16121j(this);
        }
        if (this.memoizedHashCode == 0) {
            this.memoizedHashCode = C5185x0.m16370a().m16372c(this).mo16121j(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC5180v m16360i() {
        return (AbstractC5180v) mo16361j(5);
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo16361j(int i13);

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5168p0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5184x mo16299a() {
        return (AbstractC5184x) mo16361j(6);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC5181v0 m16363m() {
        return (InterfaceC5181v0) mo16361j(7);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16364p() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m16365q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5122a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC5180v mo16107d() {
        return (AbstractC5180v) mo16361j(5);
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC5184x m16367s() {
        return (AbstractC5184x) mo16361j(4);
    }

    public final String toString() {
        return AbstractC5171q0.m16308d(this, super.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m16368x(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(AbstractC2875y.m8295h(i13, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC5180v m16369y() {
        AbstractC5180v abstractC5180v = (AbstractC5180v) mo16361j(5);
        abstractC5180v.m16351f(this);
        return abstractC5180v;
    }
}
