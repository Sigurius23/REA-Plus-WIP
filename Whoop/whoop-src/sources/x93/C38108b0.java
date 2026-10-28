package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import m83.C25271y;
import ma3.InterfaceC25373b;
import ma3.InterfaceC25374c;
import p000.AbstractC11266d;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: x93.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C38108b0 extends AbstractC38126r implements InterfaceC25373b, InterfaceC25374c {

    /* JADX INFO: renamed from: a */
    public final TypeVariable f163210a;

    public C38108b0(TypeVariable typeVariable) {
        AbstractC22676k.m65750j(typeVariable, "typeVariable");
        this.f163210a = typeVariable;
    }

    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        Annotation[] declaredAnnotations;
        AbstractC22676k.m65750j(fqName, "fqName");
        TypeVariable typeVariable = this.f163210a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC32237a.m100291e(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38108b0) {
            return AbstractC22676k.m65745e(this.f163210a, ((C38108b0) obj).f163210a);
        }
        return false;
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f163210a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C25271y.f99162w : AbstractC32237a.m100292f(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f163210a.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C38108b0.class, sb4, ": ");
        sb4.append(this.f163210a);
        return sb4.toString();
    }
}
