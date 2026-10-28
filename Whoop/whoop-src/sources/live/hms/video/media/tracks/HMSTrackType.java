package live.hms.video.media.tracks;

import ge3.AbstractC15751g;
import hms.webrtc.MediaStreamTrack;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSTrackType;", "", "<init>", "(Ljava/lang/String;I)V", "AUDIO", "VIDEO", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum HMSTrackType {
    AUDIO,
    VIDEO;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\b¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSTrackType$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/media/tracks/HMSTrackType;", "track", "Lhms/webrtc/MediaStreamTrack;", "from$lib_release", "stringTrackType", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HMSTrackType from$lib_release(MediaStreamTrack track) {
            AbstractC22676k.m65750j(track, "track");
            String strKind = track.kind();
            if (AbstractC22676k.m65745e(strKind, "audio")) {
                return HMSTrackType.AUDIO;
            }
            return AbstractC22676k.m65745e(strKind, "video") ? HMSTrackType.VIDEO : HMSTrackType.VIDEO;
        }

        private Companion() {
        }

        public final HMSTrackType from$lib_release(String stringTrackType) {
            if (AbstractC22676k.m65745e(stringTrackType, "audio")) {
                return HMSTrackType.AUDIO;
            }
            if (AbstractC22676k.m65745e(stringTrackType, "video")) {
                return HMSTrackType.VIDEO;
            }
            return null;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
