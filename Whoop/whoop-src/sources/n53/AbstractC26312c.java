package n53;

import java.util.List;
import live.hms.video.factories.MediaConstraintsFactory;
import org.webrtc.MediaConstraints;
import p320m5.C25067k;
import stream.video.sfu.models.AudioBitrateProfile;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n53.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26312c {

    /* JADX INFO: renamed from: a */
    public static final MediaConstraints f104557a;

    /* JADX INFO: renamed from: b */
    public static final MediaConstraints f104558b;

    static {
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kEnableDtlsSrtp, MediaConstraintsFactory.kValueTrue));
        f104557a = mediaConstraints;
        MediaConstraints mediaConstraints2 = new MediaConstraints();
        mediaConstraints2.mandatory.add(new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kIceRestart, MediaConstraintsFactory.kValueTrue));
        mediaConstraints2.optional.add(new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kEnableDtlsSrtp, MediaConstraintsFactory.kValueTrue));
        f104558b = mediaConstraints2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ MediaConstraints m78067a(C25067k c25067k) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        boolean z4 = !(((AudioBitrateProfile) c25067k.invoke()) == AudioBitrateProfile.AUDIO_BITRATE_PROFILE_MUSIC_HIGH_QUALITY);
        List listM118959K = AbstractC37056f.m118959K(new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kGoogEchoCancellation, String.valueOf(z4)), new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kAutoGainControl, String.valueOf(z4)), new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kHighpassFilter, String.valueOf(z4)), new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kNoiseSuppression, String.valueOf(z4)), new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kTypingNoiseDetection, String.valueOf(z4)));
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.optional;
        list.add(new MediaConstraints.KeyValuePair(MediaConstraintsFactory.kEnableDtlsSrtp, MediaConstraintsFactory.kValueTrue));
        list.addAll(listM118959K);
        return mediaConstraints;
    }
}
