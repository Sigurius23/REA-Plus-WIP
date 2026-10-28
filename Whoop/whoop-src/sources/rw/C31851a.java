package rw;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p440qw.AbstractC30672g;
import p536uw.C35288a;
import p563vw.C36540a;

/* JADX INFO: renamed from: rw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31851a implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132105w;

    public /* synthetic */ C31851a(int i13) {
        this.f132105w = i13;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        switch (this.f132105w) {
            case 0:
                Type type = c36540a.f156460b;
                boolean z4 = type instanceof GenericArrayType;
                if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C31852b(c28417m, c28417m.m86136c(new C36540a(genericComponentType)), AbstractC30672g.m94272h(genericComponentType));
            case 1:
                if (c36540a.f156459a == Date.class) {
                    return new C31852b(AbstractC31855e.f132113b, 2, 2);
                }
                return null;
            case 2:
                Class superclass = c36540a.f156459a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C31856f(superclass);
            case 3:
                throw new AssertionError("Factory should not be used");
            case 4:
                if (c36540a.f156459a == java.sql.Date.class) {
                    return new C35288a(0);
                }
                return null;
            case 5:
                if (c36540a.f156459a == Time.class) {
                    return new C35288a(1);
                }
                return null;
            default:
                if (c36540a.f156459a != Timestamp.class) {
                    return null;
                }
                c28417m.getClass();
                return new C35288a(c28417m.m86136c(new C36540a(Date.class)));
        }
    }

    public String toString() {
        switch (this.f132105w) {
            case 1:
                return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
            default:
                return super.toString();
        }
    }
}
