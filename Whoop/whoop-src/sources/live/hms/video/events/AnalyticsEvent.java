package live.hms.video.events;

import java.util.HashMap;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J*\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\tHÆ\u0003¢\u0006\u0002\u0010\u0014JR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R/\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m65681d2 = {"Llive/hms/video/events/AnalyticsEvent;", "", "name", "", "level", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "includesPII", "", "properties", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;ZLjava/util/HashMap;)V", "getName", "()Ljava/lang/String;", "getLevel", "()Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "getIncludesPII", "()Z", "getProperties", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "timestamp", "", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;ZLjava/util/HashMap;)Llive/hms/video/events/AnalyticsEvent;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AnalyticsEvent {
    private final boolean includesPII;
    private final HMSAnalyticsEventLevel level;
    private final String name;
    private final HashMap<String, Object> properties;
    private final long timestamp;

    public AnalyticsEvent(String name, HMSAnalyticsEventLevel level, boolean z4, HashMap<String, Object> properties) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(properties, "properties");
        this.name = name;
        this.level = level;
        this.includesPII = z4;
        this.properties = properties;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, HMSAnalyticsEventLevel hMSAnalyticsEventLevel, boolean z4, HashMap map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticsEvent.name;
        }
        if ((i13 & 2) != 0) {
            hMSAnalyticsEventLevel = analyticsEvent.level;
        }
        if ((i13 & 4) != 0) {
            z4 = analyticsEvent.includesPII;
        }
        if ((i13 & 8) != 0) {
            map = analyticsEvent.properties;
        }
        return analyticsEvent.copy(str, hMSAnalyticsEventLevel, z4, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSAnalyticsEventLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIncludesPII() {
        return this.includesPII;
    }

    public final HashMap<String, Object> component4() {
        return this.properties;
    }

    public final AnalyticsEvent copy(String name, HMSAnalyticsEventLevel level, boolean includesPII, HashMap<String, Object> properties) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(properties, "properties");
        return new AnalyticsEvent(name, level, includesPII, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return AbstractC22676k.m65745e(this.name, analyticsEvent.name) && this.level == analyticsEvent.level && this.includesPII == analyticsEvent.includesPII && AbstractC22676k.m65745e(this.properties, analyticsEvent.properties);
    }

    public final boolean getIncludesPII() {
        return this.includesPII;
    }

    public final HMSAnalyticsEventLevel getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final HashMap<String, Object> getProperties() {
        return this.properties;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.properties.hashCode() + AbstractC2875y.m8289b((this.level.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.includesPII);
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.name + ", level=" + this.level + ", includesPII=" + this.includesPII + ", properties=" + this.properties + ')';
    }

    public /* synthetic */ AnalyticsEvent(String str, HMSAnalyticsEventLevel hMSAnalyticsEventLevel, boolean z4, HashMap map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hMSAnalyticsEventLevel, z4, (i13 & 8) != 0 ? new HashMap() : map);
    }
}
