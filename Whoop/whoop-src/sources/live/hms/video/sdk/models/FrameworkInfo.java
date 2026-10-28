package live.hms.video.sdk.models;

import live.hms.video.events.AgentType;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/FrameworkInfo;", "", "framework", "Llive/hms/video/events/AgentType;", "frameworkSdkVersion", "", "frameworkVersion", "isPrebuilt", "", "<init>", "(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)V", "getFramework", "()Llive/hms/video/events/AgentType;", "getFrameworkSdkVersion", "()Ljava/lang/String;", "getFrameworkVersion", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class FrameworkInfo {
    private final AgentType framework;
    private final String frameworkSdkVersion;
    private final String frameworkVersion;
    private final boolean isPrebuilt;

    public FrameworkInfo(AgentType framework, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(framework, "framework");
        this.framework = framework;
        this.frameworkSdkVersion = str;
        this.frameworkVersion = str2;
        this.isPrebuilt = z4;
    }

    public static /* synthetic */ FrameworkInfo copy$default(FrameworkInfo frameworkInfo, AgentType agentType, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            agentType = frameworkInfo.framework;
        }
        if ((i13 & 2) != 0) {
            str = frameworkInfo.frameworkSdkVersion;
        }
        if ((i13 & 4) != 0) {
            str2 = frameworkInfo.frameworkVersion;
        }
        if ((i13 & 8) != 0) {
            z4 = frameworkInfo.isPrebuilt;
        }
        return frameworkInfo.copy(agentType, str, str2, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AgentType getFramework() {
        return this.framework;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrameworkSdkVersion() {
        return this.frameworkSdkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPrebuilt() {
        return this.isPrebuilt;
    }

    public final FrameworkInfo copy(AgentType framework, String frameworkSdkVersion, String frameworkVersion, boolean isPrebuilt) {
        AbstractC22676k.m65750j(framework, "framework");
        return new FrameworkInfo(framework, frameworkSdkVersion, frameworkVersion, isPrebuilt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameworkInfo)) {
            return false;
        }
        FrameworkInfo frameworkInfo = (FrameworkInfo) other;
        return this.framework == frameworkInfo.framework && AbstractC22676k.m65745e(this.frameworkSdkVersion, frameworkInfo.frameworkSdkVersion) && AbstractC22676k.m65745e(this.frameworkVersion, frameworkInfo.frameworkVersion) && this.isPrebuilt == frameworkInfo.isPrebuilt;
    }

    public final AgentType getFramework() {
        return this.framework;
    }

    public final String getFrameworkSdkVersion() {
        return this.frameworkSdkVersion;
    }

    public final String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    public int hashCode() {
        int iHashCode = this.framework.hashCode() * 31;
        String str = this.frameworkSdkVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.frameworkVersion;
        return Boolean.hashCode(this.isPrebuilt) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isPrebuilt() {
        return this.isPrebuilt;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("FrameworkInfo(framework=");
        sb4.append(this.framework);
        sb4.append(", frameworkSdkVersion=");
        sb4.append(this.frameworkSdkVersion);
        sb4.append(", frameworkVersion=");
        sb4.append(this.frameworkVersion);
        sb4.append(", isPrebuilt=");
        return AbstractC2875y.m8305r(sb4, this.isPrebuilt, ')');
    }

    public /* synthetic */ FrameworkInfo(AgentType agentType, String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(agentType, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, z4);
    }
}
