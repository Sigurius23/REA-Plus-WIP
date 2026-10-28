package j93;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23464j;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j93.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21472i0 implements TypeVariable, Type {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21458b0 f82439w;

    public C21472i0(InterfaceC21458b0 interfaceC21458b0) {
        this.f82439w = interfaceC21458b0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !AbstractC22676k.m65745e(this.f82439w.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f82439w.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC21478l0.m60447r((InterfaceC21456a0) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C23464j(AbstractC11266d.m30461o("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f82439w));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f82439w.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f82439w.getName();
    }

    public final int hashCode() {
        this.f82439w.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f82439w.getName();
    }
}
