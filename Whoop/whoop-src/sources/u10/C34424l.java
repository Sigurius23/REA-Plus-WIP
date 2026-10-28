package u10;

import c13.AbstractC3855a;

/* JADX INFO: renamed from: u10.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C34424l extends AbstractC34422j {

    /* JADX INFO: renamed from: b */
    public final boolean f144662b;

    public C34424l(boolean z4) {
        this.f144662b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34424l) && this.f144662b == ((C34424l) obj).f144662b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144662b);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Close(shouldInvokeRowSelectionCallback=", ")", this.f144662b);
    }
}
