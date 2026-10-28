package p83;

import java.util.Comparator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C28976b implements Comparator {

    /* JADX INFO: renamed from: w */
    public static final C28976b f117212w = new C28976b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a5 = (Comparable) obj;
        Comparable b = (Comparable) obj2;
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        return b.compareTo(a5);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C28975a.f117211w;
    }
}
