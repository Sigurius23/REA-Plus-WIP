package io;

import java.util.Arrays;

/* JADX INFO: renamed from: io.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C20039s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20035o[] f75175a;

    /* JADX INFO: renamed from: b */
    public int f75176b;

    public C20039s(InterfaceC20035o... interfaceC20035oArr) {
        this.f75175a = interfaceC20035oArr;
        int length = interfaceC20035oArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20039s.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f75175a, ((C20039s) obj).f75175a);
    }

    public final int hashCode() {
        if (this.f75176b == 0) {
            this.f75176b = 527 + Arrays.hashCode(this.f75175a);
        }
        return this.f75176b;
    }
}
