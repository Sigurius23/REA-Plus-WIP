package live.hms.video.sdk.featureflags;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/FeatureFlags;", "", "flags", "", "", "<init>", "(Ljava/util/Set;)V", "isFeatureEnabled", "", "feat", "Llive/hms/video/sdk/featureflags/Features;", "getAllEnabledFeatures", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class FeatureFlags {
    private final Set<String> flags;

    public FeatureFlags(Set<String> flags) {
        AbstractC22676k.m65750j(flags, "flags");
        this.flags = flags;
    }

    public final List<Features> getAllEnabledFeatures() {
        Set<String> set = this.flags;
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Features.SERVER_SIDE_SUBSCRIBE_DEGRADATION server_side_subscribe_degradation = Features.SERVER_SIDE_SUBSCRIBE_DEGRADATION.INSTANCE;
            if (!AbstractC22676k.m65745e(server_side_subscribe_degradation.getServerName(), str)) {
                server_side_subscribe_degradation = null;
            }
            if (server_side_subscribe_degradation != null) {
                arrayList.add(server_side_subscribe_degradation);
            }
        }
        return arrayList;
    }

    public final boolean isFeatureEnabled(Features feat) {
        AbstractC22676k.m65750j(feat, "feat");
        return this.flags.contains(feat.getServerName());
    }
}
