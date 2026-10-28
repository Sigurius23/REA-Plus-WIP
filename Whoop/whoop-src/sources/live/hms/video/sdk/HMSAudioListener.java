package live.hms.video.sdk;

import live.hms.video.sdk.models.HMSSpeaker;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/sdk/HMSAudioListener;", "", "", "Llive/hms/video/sdk/models/HMSSpeaker;", "speakers", "Ll83/a0;", "onAudioLevelUpdate", "([Llive/hms/video/sdk/models/HMSSpeaker;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSAudioListener {
    void onAudioLevelUpdate(HMSSpeaker[] speakers);
}
