package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "", "maxSpeechCaptionMs", "", "silenceDurationMs", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMaxSpeechCaptionMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSilenceDurationMs", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SpeechSegmentConfig {
    private final Integer maxSpeechCaptionMs;
    private final Integer silenceDurationMs;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeechSegmentConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SpeechSegmentConfig copy$default(SpeechSegmentConfig speechSegmentConfig, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = speechSegmentConfig.maxSpeechCaptionMs;
        }
        if ((i13 & 2) != 0) {
            num2 = speechSegmentConfig.silenceDurationMs;
        }
        return speechSegmentConfig.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMaxSpeechCaptionMs() {
        return this.maxSpeechCaptionMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSilenceDurationMs() {
        return this.silenceDurationMs;
    }

    public final SpeechSegmentConfig copy(@InterfaceC30731q(name = "max_speech_caption_ms") Integer maxSpeechCaptionMs, @InterfaceC30731q(name = "silence_duration_ms") Integer silenceDurationMs) {
        return new SpeechSegmentConfig(maxSpeechCaptionMs, silenceDurationMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechSegmentConfig)) {
            return false;
        }
        SpeechSegmentConfig speechSegmentConfig = (SpeechSegmentConfig) other;
        return AbstractC22676k.m65745e(this.maxSpeechCaptionMs, speechSegmentConfig.maxSpeechCaptionMs) && AbstractC22676k.m65745e(this.silenceDurationMs, speechSegmentConfig.silenceDurationMs);
    }

    public final Integer getMaxSpeechCaptionMs() {
        return this.maxSpeechCaptionMs;
    }

    public final Integer getSilenceDurationMs() {
        return this.silenceDurationMs;
    }

    public int hashCode() {
        Integer num = this.maxSpeechCaptionMs;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.silenceDurationMs;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SpeechSegmentConfig(maxSpeechCaptionMs=" + this.maxSpeechCaptionMs + ", silenceDurationMs=" + this.silenceDurationMs + ")";
    }

    public SpeechSegmentConfig(@InterfaceC30731q(name = "max_speech_caption_ms") Integer num, @InterfaceC30731q(name = "silence_duration_ms") Integer num2) {
        this.maxSpeechCaptionMs = num;
        this.silenceDurationMs = num2;
    }

    public /* synthetic */ SpeechSegmentConfig(Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2);
    }
}
