package k93;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;

/* JADX INFO: renamed from: k93.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22305b extends C22693x {

    /* JADX INFO: renamed from: w */
    public static final C22305b f87029w = new C22305b(AbstractC22306c.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
    public final Object get(Object obj) {
        InterfaceC21461d interfaceC21461d = (InterfaceC21461d) obj;
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        List supertypes = interfaceC21461d.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            InterfaceC21463e classifier = ((InterfaceC21456a0) it.next()).getClassifier();
            InterfaceC21461d interfaceC21461d2 = classifier instanceof InterfaceC21461d ? (InterfaceC21461d) classifier : null;
            if (interfaceC21461d2 != null) {
                arrayList.add(interfaceC21461d2);
            }
        }
        return arrayList;
    }
}
