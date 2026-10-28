package p305lj;

import com.amplitude.android.engagement.types.ElementClickedTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24443n0 extends TriggerConfig {

    /* JADX INFO: renamed from: a */
    public final ElementClickedTriggerConfig f95324a;

    public C24443n0(ElementClickedTriggerConfig elementClickedTriggerConfig) {
        super(null);
        this.f95324a = elementClickedTriggerConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24443n0) && AbstractC22676k.m65745e(this.f95324a, ((C24443n0) obj).f95324a);
    }

    public final int hashCode() {
        return this.f95324a.hashCode();
    }

    public final String toString() {
        return "ElementClicked(config=" + this.f95324a + ')';
    }
}
