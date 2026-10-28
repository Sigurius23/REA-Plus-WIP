package p602x1;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: x1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C37818d {

    /* JADX INFO: renamed from: a */
    public int f161963a = 0;

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IntRef(element = ");
        sb4.append(this.f161963a);
        sb4.append(")@");
        int iHashCode = hashCode();
        AbstractC35846d.m113779c(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        return sb4.toString();
    }
}
