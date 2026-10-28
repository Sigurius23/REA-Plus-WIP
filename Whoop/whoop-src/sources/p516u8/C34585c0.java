package p516u8;

import java.util.Arrays;
import java.util.List;
import p558vp.AbstractC36259c;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34585c0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC34583b0[] f145640a;

    /* JADX INFO: renamed from: b */
    public final long f145641b;

    public C34585c0(InterfaceC34583b0... interfaceC34583b0Arr) {
        this(-9223372036854775807L, interfaceC34583b0Arr);
    }

    /* JADX INFO: renamed from: a */
    public final C34585c0 m109365a(InterfaceC34583b0... interfaceC34583b0Arr) {
        if (interfaceC34583b0Arr.length == 0) {
            return this;
        }
        int i13 = AbstractC38065t.f163031a;
        InterfaceC34583b0[] interfaceC34583b0Arr2 = this.f145640a;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC34583b0Arr2, interfaceC34583b0Arr2.length + interfaceC34583b0Arr.length);
        System.arraycopy(interfaceC34583b0Arr, 0, objArrCopyOf, interfaceC34583b0Arr2.length, interfaceC34583b0Arr.length);
        return new C34585c0(this.f145641b, (InterfaceC34583b0[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final C34585c0 m109366b(C34585c0 c34585c0) {
        return c34585c0 == null ? this : m109365a(c34585c0.f145640a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34585c0.class == obj.getClass()) {
            C34585c0 c34585c0 = (C34585c0) obj;
            if (Arrays.equals(this.f145640a, c34585c0.f145640a) && this.f145641b == c34585c0.f145641b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC36259c.m115682b0(this.f145641b) + (Arrays.hashCode(this.f145640a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("entries=");
        sb4.append(Arrays.toString(this.f145640a));
        long j7 = this.f145641b;
        if (j7 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j7;
        }
        sb4.append(str);
        return sb4.toString();
    }

    public C34585c0(long j7, InterfaceC34583b0... interfaceC34583b0Arr) {
        this.f145641b = j7;
        this.f145640a = interfaceC34583b0Arr;
    }

    public C34585c0(List list) {
        this((InterfaceC34583b0[]) list.toArray(new InterfaceC34583b0[0]));
    }
}
