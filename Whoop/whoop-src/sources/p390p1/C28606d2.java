package p390p1;

import androidx.compose.runtime.Composer;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28606d2 {

    /* JADX INFO: renamed from: a */
    public final Composer f115724a;

    public final boolean equals(Object obj) {
        if (obj instanceof C28606d2) {
            return AbstractC22676k.m65745e(this.f115724a, ((C28606d2) obj).f115724a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f115724a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f115724a + ')';
    }
}
