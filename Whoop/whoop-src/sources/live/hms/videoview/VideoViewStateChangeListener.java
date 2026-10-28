package live.hms.videoview;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Llive/hms/videoview/VideoViewStateChangeListener;", "", "Ll83/a0;", "onFirstFrameRendered", "()V", "", "newWidth", "newHeight", "onResolutionChange", "(II)V", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface VideoViewStateChangeListener {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onFirstFrameRendered(VideoViewStateChangeListener videoViewStateChangeListener) {
        }

        public static void onResolutionChange(VideoViewStateChangeListener videoViewStateChangeListener, int i13, int i14) {
        }
    }

    void onFirstFrameRendered();

    void onResolutionChange(int newWidth, int newHeight);
}
