package p305lj;

import com.amplitude.android.engagement.types.AfterTimeTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24437k0 extends TriggerConfig {

    /* JADX INFO: renamed from: a */
    public final AfterTimeTriggerConfig f95322a;

    public C24437k0(AfterTimeTriggerConfig afterTimeTriggerConfig) {
        super(null);
        this.f95322a = afterTimeTriggerConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24437k0) && AbstractC22676k.m65745e(this.f95322a, ((C24437k0) obj).f95322a);
    }

    public final int hashCode() {
        return this.f95322a.hashCode();
    }

    public final String toString() {
        return "AfterTime(config=" + this.f95322a + ')';
    }
}
