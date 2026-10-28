package m93;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;

/* JADX INFO: renamed from: m93.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C25340h extends AbstractC25357y implements InterfaceC25338f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f99369e;

    /* JADX INFO: renamed from: f */
    public final Object f99370f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C25340h(Constructor constructor, Object obj, int i13) {
        this.f99369e = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                AbstractC22676k.m65749i(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f99370f = obj;
                break;
            default:
                AbstractC22676k.m65750j(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                AbstractC22676k.m65749i(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                AbstractC22676k.m65749i(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC25260n.m74072m0(1, genericParameterTypes2.length - 1, genericParameterTypes2)));
                this.f99370f = obj;
                break;
        }
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        switch (this.f99369e) {
            case 0:
                AbstractC22676k.m65750j(args, "args");
                mo74412c(args);
                Constructor constructor = (Constructor) this.f99382a;
                C22677k0 c22677k0 = new C22677k0(3);
                c22677k0.m65760a(this.f99370f);
                c22677k0.m65764e(args);
                c22677k0.m65760a(null);
                ArrayList arrayList = c22677k0.f89339a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC22676k.m65750j(args, "args");
                mo74412c(args);
                Constructor constructor2 = (Constructor) this.f99382a;
                C22677k0 c22677k1 = new C22677k0(2);
                c22677k1.m65760a(this.f99370f);
                c22677k1.m65764e(args);
                ArrayList arrayList2 = c22677k1.f89339a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
