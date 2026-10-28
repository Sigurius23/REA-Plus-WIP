package live.hms.video.media.settings;

import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/media/settings/DefaultVideoSettings;", "", "<init>", "()V", "QVGA", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "getQVGA", "()Llive/hms/video/media/settings/HMSVideoTrackSettings;", "VGA", "getVGA", "SHD", "getSHD", "HD", "getHD", "FHD", "getFHD", "QHD", "getQHD", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DefaultVideoSettings {
    public static final DefaultVideoSettings INSTANCE = new DefaultVideoSettings();
    private static final HMSVideoTrackSettings QVGA = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(320, 180)).maxBitrate(150000).build();
    private static final HMSVideoTrackSettings VGA = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(640, 360)).maxBitrate(500000).build();
    private static final HMSVideoTrackSettings SHD = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(960, 540)).maxBitrate(1200000).build();
    private static final HMSVideoTrackSettings HD = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(1280, 720)).maxBitrate(2500000).build();
    private static final HMSVideoTrackSettings FHD = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(1920, 1080)).maxBitrate(4000000).build();
    private static final HMSVideoTrackSettings QHD = new HMSVideoTrackSettings.Builder().resolution(new HMSVideoResolution(2560, DateTimeConstants.MINUTES_PER_DAY)).maxBitrate(8000000).build();

    private DefaultVideoSettings() {
    }

    public final HMSVideoTrackSettings getFHD() {
        return FHD;
    }

    public final HMSVideoTrackSettings getHD() {
        return HD;
    }

    public final HMSVideoTrackSettings getQHD() {
        return QHD;
    }

    public final HMSVideoTrackSettings getQVGA() {
        return QVGA;
    }

    public final HMSVideoTrackSettings getSHD() {
        return SHD;
    }

    public final HMSVideoTrackSettings getVGA() {
        return VGA;
    }
}
