package p395p6;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: p6.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28863a1 {

    /* JADX INFO: renamed from: a */
    public final int f116801a;

    public C28863a1(int i13) {
        this.f116801a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28863a1) && this.f116801a == ((C28863a1) obj).f116801a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116801a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("LayoutInfo(layoutId="), this.f116801a, ')');
    }
}
