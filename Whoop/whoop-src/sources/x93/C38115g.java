package x93;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import ma3.InterfaceC25372a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: x93.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C38115g extends AbstractC38113e implements InterfaceC25372a {

    /* JADX INFO: renamed from: b */
    public final Object[] f163223b;

    public C38115g(C35850h c35850h, Object[] objArr) {
        super(c35850h);
        this.f163223b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m122099a() {
        Object c38123o;
        Object[] objArr = this.f163223b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC22676k.m65747g(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC38109c.f163211a;
            if (Enum.class.isAssignableFrom(cls)) {
                c38123o = new C38127s(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                c38123o = new C38114f(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                c38123o = new C38115g(null, (Object[]) obj);
            } else {
                c38123o = obj instanceof Class ? new C38123o(null, (Class) obj) : new C38129u(null, obj);
            }
            arrayList.add(c38123o);
        }
        return arrayList;
    }
}
