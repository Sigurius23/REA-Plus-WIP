package p524ui;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: ui.w */
/* JADX INFO: loaded from: classes.dex */
public final class C34995w implements InterfaceC34997y {

    /* JADX INFO: renamed from: a */
    public final int f148052a;

    public /* synthetic */ C34995w(int i13) {
        this.f148052a = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34995w) {
            return this.f148052a == ((C34995w) obj).f148052a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148052a);
    }

    public final String toString() {
        return AbstractC31061c.m95639o("RawRes(resId=", this.f148052a, ')');
    }
}
