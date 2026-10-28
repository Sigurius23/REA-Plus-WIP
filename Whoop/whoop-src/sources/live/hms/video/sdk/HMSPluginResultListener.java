package live.hms.video.sdk;

import hms.webrtc.VideoFrame;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/sdk/HMSPluginResultListener;", "", "Lhms/webrtc/VideoFrame;", "output", "Ll83/a0;", "onOutputResult", "(Lhms/webrtc/VideoFrame;)V", "Llive/hms/video/sdk/ProcessTimeVariables;", "timeObject", "onTimeTaken", "(Llive/hms/video/sdk/ProcessTimeVariables;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSPluginResultListener {
    void onOutputResult(VideoFrame output);

    void onTimeTaken(ProcessTimeVariables timeObject);
}
