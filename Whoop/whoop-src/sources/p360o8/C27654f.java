package p360o8;

import android.os.Looper;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import j93.InterfaceC21461d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p002a0.C0024g1;
import p249jc.AbstractC21598x;
import p298l8.C23418a;
import p507tx.AbstractC34235f;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31619d;

/* JADX INFO: renamed from: o8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C27654f extends AbstractC27650b {

    /* JADX INFO: renamed from: a */
    public final Object f111267a;

    /* JADX INFO: renamed from: b */
    public final C27653e f111268b;

    public C27654f(InterfaceC1585g0 interfaceC1585g0, C1579e2 store) {
        this.f111267a = interfaceC1585g0;
        AbstractC22676k.m65750j(store, "store");
        C23418a defaultCreationExtras = C23418a.f92771b;
        AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
        C41113q c41113q = new C41113q(store, C27653e.f111264y, defaultCreationExtras);
        InterfaceC21461d modelClass = AbstractC21598x.m60666V(C27653e.class);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f111268b = (C27653e) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.g0, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p360o8.AbstractC27650b
    /* JADX INFO: renamed from: b */
    public final C31619d mo83608b(int i13, InterfaceC27649a interfaceC27649a) {
        C27653e c27653e = this.f111268b;
        boolean z4 = c27653e.f111266x;
        C0024g1 c0024g1 = c27653e.f111265w;
        if (z4) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C27651c c27651c = (C27651c) c0024g1.m55d(i13);
        ?? r10 = this.f111267a;
        if (c27651c != 0) {
            return c27651c.m83612e(r10, interfaceC27649a);
        }
        try {
            c27653e.f111266x = true;
            C31619d c31619dMo83606w = interfaceC27649a.mo83606w();
            if (c31619dMo83606w.getClass().isMemberClass() && !Modifier.isStatic(c31619dMo83606w.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c31619dMo83606w);
            }
            C27651c c27651c2 = new C27651c(i13, c31619dMo83606w);
            c0024g1.m57f(i13, c27651c2);
            c27653e.f111266x = false;
            return c27651c2.m83612e(r10, interfaceC27649a);
        } catch (Throwable th3) {
            c27653e.f111266x = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m83613c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0024g1 c0024g1 = this.f111268b.f111265w;
        if (c0024g1.m58g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i13 = 0; i13 < c0024g1.m58g(); i13++) {
                C27651c c27651c = (C27651c) c0024g1.m59h(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c0024g1.m56e(i13));
                printWriter.print(": ");
                printWriter.println(c27651c.toString());
                c27651c.m83610c(str2, printWriter);
            }
        }
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("LoaderManager{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" in ");
        AbstractC34235f.m108239y(sb4, this.f111267a);
        sb4.append("}}");
        return sb4.toString();
    }
}
