package live.hms.video.media.settings;

import live.hms.video.utils.HMSLogger;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/media/settings/HMSLogSettings;", "", "maxDirSizeInBytes", "", "isLogStorageEnabled", "", "level", "Llive/hms/video/utils/HMSLogger$LogLevel;", "<init>", "(JZLlive/hms/video/utils/HMSLogger$LogLevel;)V", "getMaxDirSizeInBytes", "()J", "()Z", "getLevel", "()Llive/hms/video/utils/HMSLogger$LogLevel;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSLogSettings {
    private final boolean isLogStorageEnabled;
    private final HMSLogger.LogLevel level;
    private final long maxDirSizeInBytes;

    public HMSLogSettings() {
        this(0L, false, null, 7, null);
    }

    public static /* synthetic */ HMSLogSettings copy$default(HMSLogSettings hMSLogSettings, long j7, boolean z4, HMSLogger.LogLevel logLevel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = hMSLogSettings.maxDirSizeInBytes;
        }
        if ((i13 & 2) != 0) {
            z4 = hMSLogSettings.isLogStorageEnabled;
        }
        if ((i13 & 4) != 0) {
            logLevel = hMSLogSettings.level;
        }
        return hMSLogSettings.copy(j7, z4, logLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMaxDirSizeInBytes() {
        return this.maxDirSizeInBytes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLogStorageEnabled() {
        return this.isLogStorageEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSLogger.LogLevel getLevel() {
        return this.level;
    }

    public final HMSLogSettings copy(long maxDirSizeInBytes, boolean isLogStorageEnabled, HMSLogger.LogLevel level) {
        AbstractC22676k.m65750j(level, "level");
        return new HMSLogSettings(maxDirSizeInBytes, isLogStorageEnabled, level);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSLogSettings)) {
            return false;
        }
        HMSLogSettings hMSLogSettings = (HMSLogSettings) other;
        return this.maxDirSizeInBytes == hMSLogSettings.maxDirSizeInBytes && this.isLogStorageEnabled == hMSLogSettings.isLogStorageEnabled && this.level == hMSLogSettings.level;
    }

    public final HMSLogger.LogLevel getLevel() {
        return this.level;
    }

    public final long getMaxDirSizeInBytes() {
        return this.maxDirSizeInBytes;
    }

    public int hashCode() {
        return this.level.hashCode() + AbstractC2875y.m8289b(Long.hashCode(this.maxDirSizeInBytes) * 31, 31, this.isLogStorageEnabled);
    }

    public final boolean isLogStorageEnabled() {
        return this.isLogStorageEnabled;
    }

    public String toString() {
        return "HMSLogSettings(maxDirSizeInBytes=" + this.maxDirSizeInBytes + ", isLogStorageEnabled=" + this.isLogStorageEnabled + ", level=" + this.level + ')';
    }

    public HMSLogSettings(long j7, boolean z4, HMSLogger.LogLevel level) {
        AbstractC22676k.m65750j(level, "level");
        this.maxDirSizeInBytes = j7;
        this.isLogStorageEnabled = z4;
        this.level = level;
    }

    public /* synthetic */ HMSLogSettings(long j7, boolean z4, HMSLogger.LogLevel logLevel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1000000L : j7, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? HMSLogger.LogLevel.DEBUG : logLevel);
    }
}
