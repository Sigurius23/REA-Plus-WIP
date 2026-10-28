package io;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p213i7.C18194g;
import p465rm.InterfaceC31529f;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import sn.C32766w0;

/* JADX INFO: renamed from: io.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C20708t implements InterfaceC31529f {

    /* JADX INFO: renamed from: y */
    public static final C18194g f77526y = new C18194g(8);

    /* JADX INFO: renamed from: w */
    public final C32766w0 f77527w;

    /* JADX INFO: renamed from: x */
    public final AbstractC41023g0 f77528x;

    public C20708t(C32766w0 c32766w0) {
        this.f77527w = c32766w0;
        AbstractC41047q.m133273c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i13 = 0;
        int i14 = 0;
        while (i13 < c32766w0.f136260w) {
            Integer numValueOf = Integer.valueOf(i13);
            int i15 = i14 + 1;
            int iM133221e = AbstractC41005a0.m133221e(objArrCopyOf.length, i15);
            if (iM133221e > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM133221e);
            }
            objArrCopyOf[i14] = numValueOf;
            i13++;
            i14 = i15;
        }
        this.f77528x = AbstractC41023g0.m133250j(i14, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20708t.class == obj.getClass()) {
            C20708t c20708t = (C20708t) obj;
            if (this.f77527w.equals(c20708t.f77527w) && this.f77528x.equals(c20708t.f77528x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f77528x.hashCode() * 31) + this.f77527w.hashCode();
    }

    public C20708t(C32766w0 c32766w0, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c32766w0.f136260w)) {
            throw new IndexOutOfBoundsException();
        }
        this.f77527w = c32766w0;
        this.f77528x = AbstractC41023g0.m133252m(list);
    }
}
