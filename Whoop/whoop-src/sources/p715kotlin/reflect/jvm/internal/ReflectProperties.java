package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes5.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements InterfaceC4339a {
        private final InterfaceC4339a initializer;
        private volatile SoftReference<Object> value;

        private static /* synthetic */ void $$$reportNull$$$0(int i13) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }

        public LazySoftVal(T t14, InterfaceC4339a interfaceC4339a) {
            if (interfaceC4339a == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = interfaceC4339a;
            if (t14 != null) {
                this.value = new SoftReference<>(escape(t14));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, c93.InterfaceC4339a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T t14 = (T) this.initializer.invoke();
            this.value = new SoftReference<>(escape(t14));
            return t14;
        }
    }

    public static abstract class Val<T> {
        private static final Object NULL_VALUE = new Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public Object escape(T t14) {
            return t14 == null ? NULL_VALUE : t14;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        public abstract T invoke();

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == NULL_VALUE) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i13) {
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static <T> LazySoftVal<T> lazySoft(T t14, InterfaceC4339a interfaceC4339a) {
        if (interfaceC4339a == null) {
            $$$reportNull$$$0(0);
        }
        return new LazySoftVal<>(t14, interfaceC4339a);
    }

    public static <T> LazySoftVal<T> lazySoft(InterfaceC4339a interfaceC4339a) {
        if (interfaceC4339a == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, interfaceC4339a);
    }
}
