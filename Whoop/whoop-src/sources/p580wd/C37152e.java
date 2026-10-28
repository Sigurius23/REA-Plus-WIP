package p580wd;

import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C37152e extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158902b;

    public C37152e(String str) {
        this.f158902b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37152e) && AbstractC22676k.m65745e(this.f158902b, ((C37152e) obj).f158902b);
    }

    public final int hashCode() {
        return this.f158902b.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public final String m119071m() {
        return this.f158902b;
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Process(command="), this.f158902b, ')');
    }
}
