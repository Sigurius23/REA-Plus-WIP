package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsResponse;", "", "audioOnly", "", "mode", "", "quality", "(ZLjava/lang/String;Ljava/lang/String;)V", "getAudioOnly", "()Z", "getMode", "()Ljava/lang/String;", "getQuality", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RecordSettingsResponse {
    private final boolean audioOnly;
    private final String mode;
    private final String quality;

    public RecordSettingsResponse(@InterfaceC30731q(name = "audio_only") boolean z4, @InterfaceC30731q(name = "mode") String mode, @InterfaceC30731q(name = "quality") String quality) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(quality, "quality");
        this.audioOnly = z4;
        this.mode = mode;
        this.quality = quality;
    }

    public static /* synthetic */ RecordSettingsResponse copy$default(RecordSettingsResponse recordSettingsResponse, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = recordSettingsResponse.audioOnly;
        }
        if ((i13 & 2) != 0) {
            str = recordSettingsResponse.mode;
        }
        if ((i13 & 4) != 0) {
            str2 = recordSettingsResponse.quality;
        }
        return recordSettingsResponse.copy(z4, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAudioOnly() {
        return this.audioOnly;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuality() {
        return this.quality;
    }

    public final RecordSettingsResponse copy(@InterfaceC30731q(name = "audio_only") boolean audioOnly, @InterfaceC30731q(name = "mode") String mode, @InterfaceC30731q(name = "quality") String quality) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(quality, "quality");
        return new RecordSettingsResponse(audioOnly, mode, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordSettingsResponse)) {
            return false;
        }
        RecordSettingsResponse recordSettingsResponse = (RecordSettingsResponse) other;
        return this.audioOnly == recordSettingsResponse.audioOnly && AbstractC22676k.m65745e(this.mode, recordSettingsResponse.mode) && AbstractC22676k.m65745e(this.quality, recordSettingsResponse.quality);
    }

    public final boolean getAudioOnly() {
        return this.audioOnly;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return this.quality.hashCode() + AbstractC11266d.m30450d(Boolean.hashCode(this.audioOnly) * 31, 31, this.mode);
    }

    public String toString() {
        boolean z4 = this.audioOnly;
        return AbstractC25012a.m73376i(this.quality, ")", AbstractC13673n.m38567n("RecordSettingsResponse(audioOnly=", ", mode=", this.mode, ", quality=", z4));
    }
}
