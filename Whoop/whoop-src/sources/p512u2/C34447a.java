package p512u2;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C34447a implements InterfaceC34469o {

    /* JADX INFO: renamed from: b */
    public final int f144742b;

    public C34447a(int i13) {
        this.f144742b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C34447a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f144742b == ((C34447a) obj).f144742b;
    }

    public final int hashCode() {
        return this.f144742b;
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("AndroidPointerIcon(type="), this.f144742b, ')');
    }
}
