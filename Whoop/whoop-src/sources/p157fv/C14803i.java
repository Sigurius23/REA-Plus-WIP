package p157fv;

import java.io.Serializable;
import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C14803i {

    /* JADX INFO: renamed from: a */
    public final Object[] f54954a;

    /* JADX INFO: renamed from: b */
    public final Object f54955b;

    /* JADX INFO: renamed from: c */
    public final String f54956c;

    public C14803i(Object[] objArr, Serializable serializable, String str) {
        this.f54954a = objArr;
        this.f54955b = serializable;
        this.f54956c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C14803i.class.equals(obj.getClass())) {
            return false;
        }
        C14803i c14803i = (C14803i) obj;
        return AbstractC22676k.m65745e(c14803i.f54956c, this.f54956c) && Arrays.equals(c14803i.f54954a, this.f54954a) && AbstractC22676k.m65745e(c14803i.f54955b, this.f54955b);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f54954a) * 31;
        String str = this.f54956c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.f54955b;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
