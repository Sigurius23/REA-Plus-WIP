package p512u2;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: u2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C34480z {

    /* JADX INFO: renamed from: a */
    public final int f144854a;

    public /* synthetic */ C34480z(int i13) {
        this.f144854a = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34480z) {
            return this.f144854a == ((C34480z) obj).f144854a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144854a);
    }

    public final String toString() {
        return AbstractC31061c.m95639o("PointerKeyboardModifiers(packedValue=", this.f144854a, ')');
    }
}
