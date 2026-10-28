package wb3;

import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25271y;
import o93.AbstractC27741m;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.reflect.jvm.internal.KTypeParameterImpl;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.StandardKTypes;
import r80.AbstractC31061c;
import va3.C35847e;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: wb3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C37063m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158566w = 0;

    /* JADX INFO: renamed from: x */
    public final C35847e f158567x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC21461d f158568y;

    public C37063m(InterfaceC21461d interfaceC21461d, C35847e c35847e) {
        this.f158568y = interfaceC21461d;
        this.f158567x = c35847e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC21461d interfaceC21461dMo118941b;
        int i13 = this.f158566w;
        InterfaceC21461d interfaceC21461d = this.f158568y;
        C35847e c35847e = this.f158567x;
        C37062l klass = (C37062l) obj;
        switch (i13) {
            case 0:
                AbstractC22676k.m65750j(klass, "klass");
                List typeParameters = interfaceC21461d.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    KTypeParameterImpl kTypeParameterImpl = new KTypeParameterImpl(klass, ((InterfaceC21458b0) it.next()).getName(), (AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111826J) || AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111825I)) ? EnumC21464e0.f82428y : EnumC21464e0.f82426w, false);
                    kTypeParameterImpl.setUpperBounds(AbstractC37056f.m118958J(StandardKTypes.INSTANCE.getNULLABLE_ANY()));
                    arrayList.add(kTypeParameterImpl);
                }
                return arrayList;
            default:
                AbstractC22676k.m65750j(klass, "klass");
                if (AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111827K)) {
                    InterfaceC21456a0 interfaceC21456a0M65692e = AbstractC22671h0.m65692e(Iterable.class, C21462d0.f82423c);
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC21456a0 interfaceC21456a0MutableCollectionType = c22673i0.mutableCollectionType(interfaceC21456a0M65692e);
                    AbstractC22676k.m65748h(interfaceC21456a0MutableCollectionType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
                    interfaceC21461dMo118941b = ((AbstractC37051a) interfaceC21456a0MutableCollectionType).mo118941b();
                    if (interfaceC21461dMo118941b == null) {
                        throw new KotlinReflectionInternalError(AbstractC31061c.m95642r(c22673i0, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111828L)) {
                    InterfaceC21456a0 interfaceC21456a0M65692e2 = AbstractC22671h0.m65692e(Collection.class, C21462d0.f82423c);
                    C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                    InterfaceC21456a0 interfaceC21456a0MutableCollectionType2 = c22673i1.mutableCollectionType(interfaceC21456a0M65692e2);
                    AbstractC22676k.m65748h(interfaceC21456a0MutableCollectionType2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
                    interfaceC21461dMo118941b = ((AbstractC37051a) interfaceC21456a0MutableCollectionType2).mo118941b();
                    if (interfaceC21461dMo118941b == null) {
                        throw new KotlinReflectionInternalError(AbstractC31061c.m95642r(c22673i1, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111830N)) {
                    InterfaceC21456a0 interfaceC21456a0M65692e3 = AbstractC22671h0.m65692e(Collection.class, C21462d0.f82423c);
                    C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                    InterfaceC21456a0 interfaceC21456a0MutableCollectionType3 = c22673i2.mutableCollectionType(interfaceC21456a0M65692e3);
                    AbstractC22676k.m65748h(interfaceC21456a0MutableCollectionType3, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
                    interfaceC21461dMo118941b = ((AbstractC37051a) interfaceC21456a0MutableCollectionType3).mo118941b();
                    if (interfaceC21461dMo118941b == null) {
                        throw new KotlinReflectionInternalError(AbstractC31061c.m95642r(c22673i2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC22676k.m65745e(c35847e, AbstractC27741m.f111829M)) {
                    InterfaceC21456a0 interfaceC21456a0M65692e4 = AbstractC22671h0.m65692e(Iterator.class, C21462d0.f82423c);
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21456a0 interfaceC21456a0MutableCollectionType4 = c22673i3.mutableCollectionType(interfaceC21456a0M65692e4);
                    AbstractC22676k.m65748h(interfaceC21456a0MutableCollectionType4, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
                    interfaceC21461dMo118941b = ((AbstractC37051a) interfaceC21456a0MutableCollectionType4).mo118941b();
                    if (interfaceC21461dMo118941b == null) {
                        throw new KotlinReflectionInternalError(AbstractC31061c.m95642r(c22673i3, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC21461dMo118941b = null;
                }
                List list = klass.f158564y;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it3 = list.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    C25271y c25271y = C25271y.f99162w;
                    if (!zHasNext) {
                        List listM74077r0 = AbstractC25260n.m74077r0(new InterfaceC21461d[]{interfaceC21461d, interfaceC21461dMo118941b});
                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
                        Iterator it4 = listM74077r0.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(AbstractC21598x.m60714z((InterfaceC21461d) it4.next(), arrayList2, false, c25271y));
                        }
                        return arrayList3;
                    }
                    InterfaceC21458b0 interfaceC21458b0 = (InterfaceC21458b0) it3.next();
                    C21462d0 c21462d0 = C21462d0.f82423c;
                    arrayList2.add(AbstractC37978j.m121626I(AbstractC21598x.m60714z(interfaceC21458b0, c25271y, false, c25271y)));
                }
                break;
        }
    }

    public C37063m(C35847e c35847e, InterfaceC21461d interfaceC21461d) {
        this.f158567x = c35847e;
        this.f158568y = interfaceC21461d;
    }
}
