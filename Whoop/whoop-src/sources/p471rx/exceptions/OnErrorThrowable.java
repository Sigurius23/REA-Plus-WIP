package p471rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import jh3.C21705f;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorThrowable extends RuntimeException {

    public static class OnNextValue extends RuntimeException {

        /* JADX INFO: renamed from: w */
        public final Serializable f132388w;

        public OnNextValue(Object obj) {
            String strConcat;
            StringBuilder sb4 = new StringBuilder("OnError while emitting onNext value: ");
            if (obj == null) {
                strConcat = "null";
            } else if (AbstractC31884a.f132389a.contains(obj.getClass())) {
                strConcat = obj.toString();
            } else if (obj instanceof String) {
                strConcat = (String) obj;
            } else if (obj instanceof Enum) {
                strConcat = ((Enum) obj).name();
            } else {
                C21705f.f83334f.m61158b().getClass();
                strConcat = obj.getClass().getName().concat(".class");
            }
            sb4.append(strConcat);
            super(sb4.toString());
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th3) {
                    obj = th3.getMessage();
                }
            }
            this.f132388w = (Serializable) obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Throwable m99122a(Object obj, Throwable th3) {
        int i13 = 0;
        Throwable runtimeException = th3;
        int i14 = 0;
        while (runtimeException.getCause() != null) {
            int i15 = i14 + 1;
            if (i14 >= 25) {
                runtimeException = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            runtimeException = runtimeException.getCause();
            i14 = i15;
        }
        if (!(runtimeException instanceof OnNextValue) || ((OnNextValue) runtimeException).f132388w != obj) {
            OnNextValue onNextValue = new OnNextValue(obj);
            HashSet hashSet = new HashSet();
            Throwable cause = th3;
            while (cause.getCause() != null) {
                int i16 = i13 + 1;
                if (i13 < 25) {
                    cause = cause.getCause();
                    if (hashSet.contains(cause.getCause())) {
                        break;
                    }
                    hashSet.add(cause.getCause());
                    i13 = i16;
                }
            }
            try {
                cause.initCause(onNextValue);
            } catch (Throwable unused) {
            }
            return th3;
        }
        return th3;
    }
}
