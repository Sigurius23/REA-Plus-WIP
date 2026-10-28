package p305lj;

import com.amplitude.android.engagement.types.SimpleTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24447p0 extends TriggerConfig {

    /* JADX INFO: renamed from: a */
    public final SimpleTriggerConfig f95326a;

    public C24447p0(SimpleTriggerConfig simpleTriggerConfig) {
        super(null);
        this.f95326a = simpleTriggerConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24447p0) && AbstractC22676k.m65745e(this.f95326a, ((C24447p0) obj).f95326a);
    }

    public final int hashCode() {
        return this.f95326a.hashCode();
    }

    public final String toString() {
        return "Simple(config=" + this.f95326a + ')';
    }
}
