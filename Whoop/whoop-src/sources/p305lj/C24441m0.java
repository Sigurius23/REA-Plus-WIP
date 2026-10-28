package p305lj;

import com.amplitude.android.engagement.types.ElementAppearedTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24441m0 extends TriggerConfig {

    /* JADX INFO: renamed from: a */
    public final ElementAppearedTriggerConfig f95323a;

    public C24441m0(ElementAppearedTriggerConfig elementAppearedTriggerConfig) {
        super(null);
        this.f95323a = elementAppearedTriggerConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24441m0) && AbstractC22676k.m65745e(this.f95323a, ((C24441m0) obj).f95323a);
    }

    public final int hashCode() {
        return this.f95323a.hashCode();
    }

    public final String toString() {
        return "ElementAppeared(config=" + this.f95323a + ')';
    }
}
