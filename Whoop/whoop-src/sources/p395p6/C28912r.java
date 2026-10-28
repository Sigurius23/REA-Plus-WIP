package p395p6;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: p6.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C28912r {

    /* JADX INFO: renamed from: a */
    public final int f117013a;

    public C28912r(int i13) {
        this.f117013a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28912r) && this.f117013a == ((C28912r) obj).f117013a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117013a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("ContainerInfo(layoutId="), this.f117013a, ')');
    }
}
