package m93;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import m83.AbstractC25260n;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m93.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C25354v extends AbstractC25356x implements InterfaceC25338f {

    /* JADX INFO: renamed from: f */
    public final Object[] f99379f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C25354v(Method method, Object[] boundReceiverComponents) {
        Collection collectionM118958J;
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(boundReceiverComponents, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = boundReceiverComponents.length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionM118958J = C25271y.f99162w;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionM118958J = AbstractC25260n.m74049W0(genericParameterTypes);
            } else if (length2 == 1) {
                collectionM118958J = AbstractC37056f.m118958J(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i13 = length3 - length2; i13 < length3; i13++) {
                    arrayList.add(genericParameterTypes[i13]);
                }
                collectionM118958J = arrayList;
            }
        }
        super(method, false, (Type[]) collectionM118958J.toArray(new Type[0]));
        this.f99379f = boundReceiverComponents;
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        C22677k0 c22677k0 = new C22677k0(2);
        c22677k0.m65764e(this.f99379f);
        c22677k0.m65764e(args);
        ArrayList arrayList = c22677k0.f89339a;
        return m74413e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
