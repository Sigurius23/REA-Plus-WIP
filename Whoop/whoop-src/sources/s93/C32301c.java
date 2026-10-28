package s93;

import cb3.AbstractC4393e;
import java.util.Map;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import nb3.C26555l;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import va3.C35847e;
import xa3.C38148i;

/* JADX INFO: renamed from: s93.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C32301c implements InterfaceC32300b {

    /* JADX INFO: renamed from: a */
    public final AbstractC23811y f133665a;

    /* JADX INFO: renamed from: b */
    public final Map f133666b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC31155s0 f133667c;

    public C32301c(AbstractC23763c0 abstractC23763c0, Map map, InterfaceC31155s0 interfaceC31155s0) {
        if (abstractC23763c0 == null) {
            m100549c(0);
            throw null;
        }
        if (map == null) {
            m100549c(1);
            throw null;
        }
        this.f133665a = abstractC23763c0;
        this.f133666b = map;
        this.f133667c = interfaceC31155s0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100549c(int i13) {
        String str = (i13 == 3 || i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "valueArguments";
        } else if (i13 == 2) {
            objArr[0] = "source";
        } else if (i13 == 3 || i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i13 == 3) {
            objArr[1] = "getType";
        } else if (i13 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public final Map mo43952a() {
        Map map = this.f133666b;
        if (map != null) {
            return map;
        }
        m100549c(4);
        throw null;
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: b */
    public final C35847e mo43953b() {
        InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d(this);
        if (interfaceC31117eM13806d != null) {
            if (C26555l.m78685f(interfaceC31117eM13806d)) {
                interfaceC31117eM13806d = null;
            }
            if (interfaceC31117eM13806d != null) {
                return AbstractC4393e.m13805c(interfaceC31117eM13806d);
            }
        }
        return null;
    }

    @Override // s93.InterfaceC32300b
    public final InterfaceC31155s0 getSource() {
        InterfaceC31155s0 interfaceC31155s0 = this.f133667c;
        if (interfaceC31155s0 != null) {
            return interfaceC31155s0;
        }
        m100549c(5);
        throw null;
    }

    @Override // s93.InterfaceC32300b
    public final AbstractC23811y getType() {
        AbstractC23811y abstractC23811y = this.f133665a;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        m100549c(3);
        throw null;
    }

    public final String toString() {
        return C38148i.f163318c.m122220x(this, null);
    }
}
