package wb3;

import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import ob3.InterfaceC27802l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wb3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C37062l implements InterfaceC21461d, KTypeParameterOwnerImpl, InterfaceC27802l {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21461d f158562w;

    /* JADX INFO: renamed from: x */
    public final String f158563x;

    /* JADX INFO: renamed from: y */
    public final List f158564y;

    /* JADX INFO: renamed from: z */
    public final List f158565z;

    public C37062l(InterfaceC21461d klass, String qualifiedName, Function1 function1, Function1 function2) {
        AbstractC22676k.m65750j(klass, "klass");
        AbstractC22676k.m65750j(qualifiedName, "qualifiedName");
        this.f158562w = klass;
        this.f158563x = qualifiedName;
        this.f158564y = (List) function1.invoke(this);
        this.f158565z = (List) function2.invoke(this);
    }

    @Override // j93.InterfaceC21461d
    public final boolean equals(Object obj) {
        if (obj instanceof C37062l) {
            return AbstractC22676k.m65745e(this.f158562w, ((C37062l) obj).f158562w);
        }
        return false;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return this.f158562w.getAnnotations();
    }

    @Override // j93.InterfaceC21461d
    public final Collection getConstructors() {
        return this.f158562w.getConstructors();
    }

    @Override // j93.InterfaceC21461d
    public final Collection getMembers() {
        return this.f158562w.getMembers();
    }

    @Override // j93.InterfaceC21461d
    public final Object getObjectInstance() {
        return this.f158562w.getObjectInstance();
    }

    @Override // j93.InterfaceC21461d
    public final String getQualifiedName() {
        return this.f158563x;
    }

    @Override // j93.InterfaceC21461d
    public final String getSimpleName() {
        String str = this.f158563x;
        return AbstractC39414r.m125861G0(str, ".", str);
    }

    @Override // j93.InterfaceC21461d
    public final List getSupertypes() {
        return this.f158565z;
    }

    @Override // j93.InterfaceC21461d
    public final List getTypeParameters() {
        return this.f158564y;
    }

    @Override // j93.InterfaceC21461d
    public final int hashCode() {
        return this.f158562w.hashCode();
    }

    @Override // j93.InterfaceC21461d
    public final boolean isAbstract() {
        return this.f158562w.isAbstract();
    }

    @Override // j93.InterfaceC21461d
    public final boolean isInner() {
        return this.f158562w.isInner();
    }

    @Override // j93.InterfaceC21461d
    public final boolean isInstance(Object obj) {
        return this.f158562w.isInstance(obj);
    }

    @Override // j93.InterfaceC21461d
    public final boolean isSealed() {
        return this.f158562w.isSealed();
    }

    @Override // j93.InterfaceC21461d
    public final boolean isValue() {
        return this.f158562w.isValue();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f158562w + ')';
    }
}
