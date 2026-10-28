package ug3;

import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p508ty.C34249c;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;
import vg3.C36032a;

/* JADX INFO: renamed from: ug3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C34954c extends AbstractC29199m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147918a;

    public /* synthetic */ C34954c(int i13) {
        this.f147918a = i13;
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C29224y0 c29224y0) {
        switch (this.f147918a) {
            case 0:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return C34952a.f147906w;
                }
                return null;
            default:
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (AbstractC5581l.class.isAssignableFrom(cls)) {
                        return new C36032a(AbstractC5586q.get(cls));
                    }
                }
                return null;
        }
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        switch (this.f147918a) {
            case 0:
                if (type == String.class) {
                    return C34953b.f147913J;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return C34953b.f147914x;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return C34953b.f147915y;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return C34953b.f147916z;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return C34953b.f147908E;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return C34953b.f147909F;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return C34953b.f147910G;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return C34953b.f147911H;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return C34953b.f147912I;
                }
                return null;
            default:
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (AbstractC5581l.class.isAssignableFrom(cls)) {
                        return new C34249c(AbstractC5586q.get(cls), 11);
                    }
                }
                return null;
        }
    }
}
