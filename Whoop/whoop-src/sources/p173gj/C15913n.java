package p173gj;

import java.util.HashSet;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gj.n */
/* JADX INFO: loaded from: classes.dex */
public final class C15913n {

    /* JADX INFO: renamed from: a */
    public HashSet f60200a;

    /* JADX INFO: renamed from: a */
    public final boolean m44895a(String str) {
        return !this.f60200a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15913n.class.equals(obj.getClass())) {
            return AbstractC22676k.m65745e(((C15913n) obj).f60200a, this.f60200a);
        }
        return false;
    }
}
