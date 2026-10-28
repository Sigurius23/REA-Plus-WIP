package fa3;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: fa3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14306c0 {

    /* JADX INFO: renamed from: a */
    public final String f52233a;

    /* JADX INFO: renamed from: b */
    public final C35850h f52234b;

    /* JADX INFO: renamed from: c */
    public final String f52235c;

    /* JADX INFO: renamed from: d */
    public final String f52236d;

    /* JADX INFO: renamed from: e */
    public final String f52237e;

    public C14306c0(String classInternalName, C35850h c35850h, String str, String str2) {
        AbstractC22676k.m65750j(classInternalName, "classInternalName");
        this.f52233a = classInternalName;
        this.f52234b = c35850h;
        this.f52235c = str;
        this.f52236d = str2;
        String jvmDescriptor = c35850h + '(' + str + ')' + str2;
        AbstractC22676k.m65750j(jvmDescriptor, "jvmDescriptor");
        this.f52237e = classInternalName + '.' + jvmDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14306c0)) {
            return false;
        }
        C14306c0 c14306c0 = (C14306c0) obj;
        return AbstractC22676k.m65745e(this.f52233a, c14306c0.f52233a) && AbstractC22676k.m65745e(this.f52234b, c14306c0.f52234b) && AbstractC22676k.m65745e(this.f52235c, c14306c0.f52235c) && AbstractC22676k.m65745e(this.f52236d, c14306c0.f52236d);
    }

    public final int hashCode() {
        return this.f52236d.hashCode() + AbstractC11266d.m30450d((this.f52234b.hashCode() + (this.f52233a.hashCode() * 31)) * 31, 31, this.f52235c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NameAndSignature(classInternalName=");
        sb4.append(this.f52233a);
        sb4.append(", name=");
        sb4.append(this.f52234b);
        sb4.append(", parameters=");
        sb4.append(this.f52235c);
        sb4.append(", returnType=");
        return AbstractC25012a.m73377j(sb4, this.f52236d, ')');
    }
}
