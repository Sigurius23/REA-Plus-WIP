package rw;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p133f1.C13968p1;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p440qw.AbstractC30672g;
import p563vw.C36540a;

/* JADX INFO: renamed from: rw.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31853c implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132111w;

    /* JADX INFO: renamed from: x */
    public final C13968p1 f132112x;

    public /* synthetic */ C31853c(C13968p1 c13968p1, int i13) {
        this.f132111w = i13;
        this.f132112x = c13968p1;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        Type[] actualTypeArguments;
        int i13 = this.f132111w;
        C13968p1 c13968p1 = this.f132112x;
        Type type = Object.class;
        int i14 = 2;
        switch (i13) {
            case 0:
                Type type2 = c36540a.f156460b;
                Class cls = c36540a.f156459a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                AbstractC30672g.m94266b(Collection.class.isAssignableFrom(cls));
                Type typeM94274j = AbstractC30672g.m94274j(type2, cls, AbstractC30672g.m94271g(type2, cls, Collection.class), new HashMap());
                type = typeM94274j instanceof ParameterizedType ? ((ParameterizedType) typeM94274j).getActualTypeArguments()[0] : Object.class;
                return new C31852b(i14, new C31856f(c28417m, c28417m.m86136c(new C36540a(type)), type), c13968p1.m39754j(c36540a, false));
            default:
                Type type3 = c36540a.f156460b;
                Class cls2 = c36540a.f156459a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    AbstractC30672g.m94266b(Map.class.isAssignableFrom(cls2));
                    Type typeM94274j2 = AbstractC30672g.m94274j(type3, cls2, AbstractC30672g.m94271g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = typeM94274j2 instanceof ParameterizedType ? ((ParameterizedType) typeM94274j2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                return new C31856f(this, new C31856f(c28417m, (type4 == Boolean.TYPE || type4 == Boolean.class) ? AbstractC31869s.f132162c : c28417m.m86136c(new C36540a(type4)), type4), new C31856f(c28417m, c28417m.m86136c(new C36540a(type5)), type5), c13968p1.m39754j(c36540a, false));
        }
    }
}
