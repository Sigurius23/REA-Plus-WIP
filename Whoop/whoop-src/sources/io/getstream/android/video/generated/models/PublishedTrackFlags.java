package io.getstream.android.video.generated.models;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "", "audio", "", "screenshare", "screenshareAudio", "video", "(ZZZZ)V", "getAudio", "()Z", "getScreenshare", "getScreenshareAudio", "getVideo", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class PublishedTrackFlags {
    private final boolean audio;
    private final boolean screenshare;
    private final boolean screenshareAudio;
    private final boolean video;

    public PublishedTrackFlags(@InterfaceC30731q(name = "audio") boolean z4, @InterfaceC30731q(name = "screenshare") boolean z13, @InterfaceC30731q(name = "screenshare_audio") boolean z14, @InterfaceC30731q(name = "video") boolean z15) {
        this.audio = z4;
        this.screenshare = z13;
        this.screenshareAudio = z14;
        this.video = z15;
    }

    public static /* synthetic */ PublishedTrackFlags copy$default(PublishedTrackFlags publishedTrackFlags, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = publishedTrackFlags.audio;
        }
        if ((i13 & 2) != 0) {
            z13 = publishedTrackFlags.screenshare;
        }
        if ((i13 & 4) != 0) {
            z14 = publishedTrackFlags.screenshareAudio;
        }
        if ((i13 & 8) != 0) {
            z15 = publishedTrackFlags.video;
        }
        return publishedTrackFlags.copy(z4, z13, z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAudio() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getScreenshare() {
        return this.screenshare;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getScreenshareAudio() {
        return this.screenshareAudio;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getVideo() {
        return this.video;
    }

    public final PublishedTrackFlags copy(@InterfaceC30731q(name = "audio") boolean audio, @InterfaceC30731q(name = "screenshare") boolean screenshare, @InterfaceC30731q(name = "screenshare_audio") boolean screenshareAudio, @InterfaceC30731q(name = "video") boolean video) {
        return new PublishedTrackFlags(audio, screenshare, screenshareAudio, video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishedTrackFlags)) {
            return false;
        }
        PublishedTrackFlags publishedTrackFlags = (PublishedTrackFlags) other;
        return this.audio == publishedTrackFlags.audio && this.screenshare == publishedTrackFlags.screenshare && this.screenshareAudio == publishedTrackFlags.screenshareAudio && this.video == publishedTrackFlags.video;
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final boolean getScreenshare() {
        return this.screenshare;
    }

    public final boolean getScreenshareAudio() {
        return this.screenshareAudio;
    }

    public final boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Boolean.hashCode(this.video) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.audio) * 31, 31, this.screenshare), 31, this.screenshareAudio);
    }

    public String toString() {
        boolean z4 = this.audio;
        boolean z13 = this.screenshare;
        return AbstractC36095b.m114682j(AbstractC11895b.m32002u("PublishedTrackFlags(audio=", ", screenshare=", ", screenshareAudio=", z4, z13), this.screenshareAudio, ", video=", this.video, ")");
    }
}
