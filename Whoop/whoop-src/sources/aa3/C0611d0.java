package aa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0611d0 extends AbstractC0638m0 {

    /* JADX INFO: renamed from: a */
    public final String f2166a;

    public C0611d0(String className) {
        AbstractC22676k.m65750j(className, "className");
        this.f2166a = className;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0611d0) && AbstractC22676k.m65745e(this.f2166a, ((C0611d0) obj).f2166a);
    }

    public final int hashCode() {
        return this.f2166a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("KClassValue("), this.f2166a, ')');
    }
}
