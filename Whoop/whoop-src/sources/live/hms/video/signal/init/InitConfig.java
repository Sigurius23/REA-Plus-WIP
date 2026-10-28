package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Llive/hms/video/signal/init/InitConfig;", "", "endpoint", "", "logLevel", "policy", "rtcConfig", "Llive/hms/video/signal/init/RtcConfiguration;", "serverConfiguration", "Llive/hms/video/signal/init/ServerConfiguration;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/RtcConfiguration;Llive/hms/video/signal/init/ServerConfiguration;)V", "getEndpoint", "()Ljava/lang/String;", "getLogLevel", "getPolicy", "getRtcConfig", "()Llive/hms/video/signal/init/RtcConfiguration;", "getServerConfiguration", "()Llive/hms/video/signal/init/ServerConfiguration;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class InitConfig {

    @SerializedName("endpoint")
    private final String endpoint;

    @SerializedName("log_level")
    private final String logLevel;

    @SerializedName("policy")
    private final String policy;

    @SerializedName("rtcConfiguration")
    private final RtcConfiguration rtcConfig;

    @SerializedName("config")
    private final ServerConfiguration serverConfiguration;

    public InitConfig(String endpoint, String logLevel, String policy, RtcConfiguration rtcConfig, ServerConfiguration serverConfiguration) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(logLevel, "logLevel");
        AbstractC22676k.m65750j(policy, "policy");
        AbstractC22676k.m65750j(rtcConfig, "rtcConfig");
        this.endpoint = endpoint;
        this.logLevel = logLevel;
        this.policy = policy;
        this.rtcConfig = rtcConfig;
        this.serverConfiguration = serverConfiguration;
    }

    public static /* synthetic */ InitConfig copy$default(InitConfig initConfig, String str, String str2, String str3, RtcConfiguration rtcConfiguration, ServerConfiguration serverConfiguration, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = initConfig.endpoint;
        }
        if ((i13 & 2) != 0) {
            str2 = initConfig.logLevel;
        }
        if ((i13 & 4) != 0) {
            str3 = initConfig.policy;
        }
        if ((i13 & 8) != 0) {
            rtcConfiguration = initConfig.rtcConfig;
        }
        if ((i13 & 16) != 0) {
            serverConfiguration = initConfig.serverConfiguration;
        }
        ServerConfiguration serverConfiguration2 = serverConfiguration;
        String str4 = str3;
        return initConfig.copy(str, str2, str4, rtcConfiguration, serverConfiguration2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RtcConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    public final InitConfig copy(String endpoint, String logLevel, String policy, RtcConfiguration rtcConfig, ServerConfiguration serverConfiguration) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(logLevel, "logLevel");
        AbstractC22676k.m65750j(policy, "policy");
        AbstractC22676k.m65750j(rtcConfig, "rtcConfig");
        return new InitConfig(endpoint, logLevel, policy, rtcConfig, serverConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitConfig)) {
            return false;
        }
        InitConfig initConfig = (InitConfig) other;
        return AbstractC22676k.m65745e(this.endpoint, initConfig.endpoint) && AbstractC22676k.m65745e(this.logLevel, initConfig.logLevel) && AbstractC22676k.m65745e(this.policy, initConfig.policy) && AbstractC22676k.m65745e(this.rtcConfig, initConfig.rtcConfig) && AbstractC22676k.m65745e(this.serverConfiguration, initConfig.serverConfiguration);
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getLogLevel() {
        return this.logLevel;
    }

    public final String getPolicy() {
        return this.policy;
    }

    public final RtcConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    public final ServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    public int hashCode() {
        int iHashCode = (this.rtcConfig.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.endpoint.hashCode() * 31, 31, this.logLevel), 31, this.policy)) * 31;
        ServerConfiguration serverConfiguration = this.serverConfiguration;
        return iHashCode + (serverConfiguration == null ? 0 : serverConfiguration.hashCode());
    }

    public String toString() {
        return "InitConfig(endpoint=" + this.endpoint + ", logLevel=" + this.logLevel + ", policy=" + this.policy + ", rtcConfig=" + this.rtcConfig + ", serverConfiguration=" + this.serverConfiguration + ')';
    }

    public /* synthetic */ InitConfig(String str, String str2, String str3, RtcConfiguration rtcConfiguration, ServerConfiguration serverConfiguration, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, rtcConfiguration, serverConfiguration);
    }
}
