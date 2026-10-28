package ub3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p249jc.C21565a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ub3.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34756j {

    /* JADX INFO: renamed from: a */
    public static final C21565a f146414a = new C21565a(25);

    /* JADX INFO: renamed from: a */
    public static final void m109751a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List m109752b(ArrayList arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C25271y.f99162w;
        }
        if (size == 1) {
            return AbstractC37056f.m118958J(AbstractC25265s.m74096F0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static C34754h m109753c() {
        return new C34754h(0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m109754d(Throwable th3) {
        Class<?> superclass = th3.getClass();
        while (!AbstractC22676k.m65745e(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m109755e(Object obj) throws Throwable {
        if (obj instanceof C34755i) {
            throw ((C34755i) obj).f146413a;
        }
    }
}
