package live.hms.video.media.settings;

import ge3.AbstractC15751g;
import java.util.HashMap;
import l83.C23465k;
import live.hms.video.error.ErrorFactory;
import live.hms.video.events.IAnalyticsPropertiesProvider;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B%\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0014j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0011H\u0016¢\u0006\u0002\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/events/IAnalyticsPropertiesProvider;", "videoSettings", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "audioSettings", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "simulcast", "", "<init>", "(Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)V", "getVideoSettings", "()Llive/hms/video/media/settings/HMSVideoTrackSettings;", "getAudioSettings", "()Llive/hms/video/media/settings/HMSAudioTrackSettings;", "getSimulcast", "()Z", "toAnalyticsProperties", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "InitState", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTrackSettings implements IAnalyticsPropertiesProvider {
    private final HMSAudioTrackSettings audioSettings;
    private final boolean simulcast;
    private final HMSVideoTrackSettings videoSettings;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Llive/hms/video/media/settings/HMSTrackSettings$Builder;", "", "<init>", "()V", "video", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "audio", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "simulcast", "", "enabled", "build", "Llive/hms/video/media/settings/HMSTrackSettings;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private boolean simulcast;
        private HMSVideoTrackSettings video = DefaultVideoSettings.INSTANCE.getQVGA();
        private HMSAudioTrackSettings audio = new HMSAudioTrackSettings.Builder().build();

        public final Builder audio(HMSAudioTrackSettings audio) {
            this.audio = audio;
            return this;
        }

        public final HMSTrackSettings build() {
            HMSVideoTrackSettings hMSVideoTrackSettings = this.video;
            if (hMSVideoTrackSettings == null && this.audio == null) {
                throw ErrorFactory.TracksErrors.NothingToReturn$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, null, null, null, 14, null);
            }
            if (hMSVideoTrackSettings == null && this.simulcast) {
                throw ErrorFactory.TracksErrors.InvalidVideoSettings$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, null, null, null, 14, null);
            }
            return new HMSTrackSettings(hMSVideoTrackSettings, this.audio, this.simulcast, null);
        }

        public final Builder simulcast(boolean enabled) {
            this.simulcast = enabled;
            return this;
        }

        public final Builder video(HMSVideoTrackSettings video) {
            this.video = video;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "", "<init>", "(Ljava/lang/String;I)V", "MUTED", "UNMUTED", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum InitState {
        MUTED,
        UNMUTED;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ HMSTrackSettings(HMSVideoTrackSettings hMSVideoTrackSettings, HMSAudioTrackSettings hMSAudioTrackSettings, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSVideoTrackSettings, hMSAudioTrackSettings, z4);
    }

    public final HMSAudioTrackSettings getAudioSettings() {
        return this.audioSettings;
    }

    public final boolean getSimulcast() {
        return this.simulcast;
    }

    public final HMSVideoTrackSettings getVideoSettings() {
        return this.videoSettings;
    }

    @Override // live.hms.video.events.IAnalyticsPropertiesProvider
    public HashMap<String, Object> toAnalyticsProperties() {
        HashMap<String, Object> mapM73987V = AbstractC25247g0.m73987V(new C23465k("audio_enabled", Boolean.valueOf(this.audioSettings != null)), new C23465k("video_enabled", Boolean.valueOf(this.videoSettings != null)));
        HMSAudioTrackSettings hMSAudioTrackSettings = this.audioSettings;
        if (hMSAudioTrackSettings != null) {
            mapM73987V.putAll(hMSAudioTrackSettings.toAnalyticsProperties());
        }
        HMSVideoTrackSettings hMSVideoTrackSettings = this.videoSettings;
        if (hMSVideoTrackSettings != null) {
            mapM73987V.putAll(hMSVideoTrackSettings.toAnalyticsProperties());
        }
        return mapM73987V;
    }

    private HMSTrackSettings(HMSVideoTrackSettings hMSVideoTrackSettings, HMSAudioTrackSettings hMSAudioTrackSettings, boolean z4) {
        this.videoSettings = hMSVideoTrackSettings;
        this.audioSettings = hMSAudioTrackSettings;
        this.simulcast = z4;
    }
}
