package io.getstream.chat.android.p226ui.common.internal.file;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;", "", "cacheFilePrefix", "", "bitmapShareFilename", "bitmapQuality", "", "cacheTtlMs", "", "maxCacheSizeBytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJ)V", "getCacheFilePrefix", "()Ljava/lang/String;", "getBitmapShareFilename", "getBitmapQuality", "()I", "getCacheTtlMs", "()J", "getMaxCacheSizeBytes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ShareCacheConfig {
    public static final int $stable = 0;
    private final int bitmapQuality;
    private final String bitmapShareFilename;
    private final String cacheFilePrefix;
    private final long cacheTtlMs;
    private final long maxCacheSizeBytes;

    public ShareCacheConfig() {
        this(null, null, 0, 0L, 0L, 31, null);
    }

    public static /* synthetic */ ShareCacheConfig copy$default(ShareCacheConfig shareCacheConfig, String str, String str2, int i13, long j7, long j13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = shareCacheConfig.cacheFilePrefix;
        }
        if ((i14 & 2) != 0) {
            str2 = shareCacheConfig.bitmapShareFilename;
        }
        if ((i14 & 4) != 0) {
            i13 = shareCacheConfig.bitmapQuality;
        }
        if ((i14 & 8) != 0) {
            j7 = shareCacheConfig.cacheTtlMs;
        }
        if ((i14 & 16) != 0) {
            j13 = shareCacheConfig.maxCacheSizeBytes;
        }
        long j14 = j13;
        int i15 = i13;
        return shareCacheConfig.copy(str, str2, i15, j7, j14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCacheFilePrefix() {
        return this.cacheFilePrefix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBitmapShareFilename() {
        return this.bitmapShareFilename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBitmapQuality() {
        return this.bitmapQuality;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCacheTtlMs() {
        return this.cacheTtlMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMaxCacheSizeBytes() {
        return this.maxCacheSizeBytes;
    }

    public final ShareCacheConfig copy(String cacheFilePrefix, String bitmapShareFilename, int bitmapQuality, long cacheTtlMs, long maxCacheSizeBytes) {
        AbstractC22676k.m65750j(cacheFilePrefix, "cacheFilePrefix");
        AbstractC22676k.m65750j(bitmapShareFilename, "bitmapShareFilename");
        return new ShareCacheConfig(cacheFilePrefix, bitmapShareFilename, bitmapQuality, cacheTtlMs, maxCacheSizeBytes);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareCacheConfig)) {
            return false;
        }
        ShareCacheConfig shareCacheConfig = (ShareCacheConfig) other;
        return AbstractC22676k.m65745e(this.cacheFilePrefix, shareCacheConfig.cacheFilePrefix) && AbstractC22676k.m65745e(this.bitmapShareFilename, shareCacheConfig.bitmapShareFilename) && this.bitmapQuality == shareCacheConfig.bitmapQuality && this.cacheTtlMs == shareCacheConfig.cacheTtlMs && this.maxCacheSizeBytes == shareCacheConfig.maxCacheSizeBytes;
    }

    public final int getBitmapQuality() {
        return this.bitmapQuality;
    }

    public final String getBitmapShareFilename() {
        return this.bitmapShareFilename;
    }

    public final String getCacheFilePrefix() {
        return this.cacheFilePrefix;
    }

    public final long getCacheTtlMs() {
        return this.cacheTtlMs;
    }

    public final long getMaxCacheSizeBytes() {
        return this.maxCacheSizeBytes;
    }

    public final int hashCode() {
        return Long.hashCode(this.maxCacheSizeBytes) + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.bitmapQuality, AbstractC11266d.m30450d(this.cacheFilePrefix.hashCode() * 31, 31, this.bitmapShareFilename), 31), this.cacheTtlMs, 31);
    }

    public final String toString() {
        String str = this.cacheFilePrefix;
        String str2 = this.bitmapShareFilename;
        int i13 = this.bitmapQuality;
        long j7 = this.cacheTtlMs;
        long j13 = this.maxCacheSizeBytes;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareCacheConfig(cacheFilePrefix=", str, ", bitmapShareFilename=", str2, ", bitmapQuality=");
        sbM32001t.append(i13);
        sbM32001t.append(", cacheTtlMs=");
        sbM32001t.append(j7);
        sbM32001t.append(", maxCacheSizeBytes=");
        sbM32001t.append(j13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ShareCacheConfig(String cacheFilePrefix, String bitmapShareFilename, int i13, long j7, long j13) {
        AbstractC22676k.m65750j(cacheFilePrefix, "cacheFilePrefix");
        AbstractC22676k.m65750j(bitmapShareFilename, "bitmapShareFilename");
        this.cacheFilePrefix = cacheFilePrefix;
        this.bitmapShareFilename = bitmapShareFilename;
        this.bitmapQuality = i13;
        this.cacheTtlMs = j7;
        this.maxCacheSizeBytes = j13;
    }

    public /* synthetic */ ShareCacheConfig(String str, String str2, int i13, long j7, long j13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "TMP" : str, (i14 & 2) != 0 ? "shared_image.png" : str2, (i14 & 4) != 0 ? 90 : i13, (i14 & 8) != 0 ? 300000L : j7, (i14 & 16) != 0 ? 26214400L : j13);
    }
}
