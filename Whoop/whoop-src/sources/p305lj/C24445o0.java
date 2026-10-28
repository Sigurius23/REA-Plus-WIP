package p305lj;

import com.amplitude.android.engagement.types.EventTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24445o0 extends TriggerConfig {

    /* JADX INFO: renamed from: a */
    public final EventTriggerConfig f95325a;

    public C24445o0(EventTriggerConfig eventTriggerConfig) {
        super(null);
        this.f95325a = eventTriggerConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24445o0) && AbstractC22676k.m65745e(this.f95325a, ((C24445o0) obj).f95325a);
    }

    public final int hashCode() {
        return this.f95325a.hashCode();
    }

    public final String toString() {
        return "Event(config=" + this.f95325a + ')';
    }
}
