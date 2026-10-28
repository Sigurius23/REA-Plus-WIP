package ka3;

import cb3.AbstractC4393e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import m83.AbstractC25267u;
import mb3.C25389f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KTypeParameterImpl;
import r93.InterfaceC31117e;
import r93.InterfaceC31165x0;
import wb3.C37058h;
import wb3.C37062l;

/* JADX INFO: renamed from: ka3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C22313e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87081w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC31117e f87082x;

    public /* synthetic */ C22313e(InterfaceC31117e interfaceC31117e, int i13) {
        this.f87081w = i13;
        this.f87082x = interfaceC31117e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87081w) {
            case 0:
                C25389f kotlinTypeRefiner = (C25389f) obj;
                AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
                AbstractC4393e.m13808f(this.f87082x);
                return null;
            case 1:
                C37062l container = (C37062l) obj;
                AbstractC22676k.m65750j(container, "container");
                List listMo60497j = this.f87082x.mo60497j();
                AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
                List<InterfaceC31165x0> list = listMo60497j;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                for (InterfaceC31165x0 interfaceC31165x0 : list) {
                    AbstractC22676k.m65747g(interfaceC31165x0);
                    arrayList.add(new KTypeParameterImpl(container, interfaceC31165x0));
                }
                return arrayList;
            default:
                C37062l it = (C37062l) obj;
                AbstractC22676k.m65750j(it, "it");
                Collection supertypes = this.f87082x.mo60496e().getSupertypes();
                AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
                Collection collection = supertypes;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C37058h((AbstractC23811y) it3.next(), null));
                }
                return arrayList2;
        }
    }

    public C22313e(InterfaceC31117e interfaceC31117e, C22314f c22314f, AbstractC23763c0 abstractC23763c0, C22309a c22309a) {
        this.f87081w = 0;
        this.f87082x = interfaceC31117e;
    }
}
