package live.hms.video.plugin.video.virtualbackground;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;", "", "", "rotatedWidth", "rotatedHeight", "rotation", "Ll83/a0;", "onFrame", "(III)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface VideoFrameInfoListener {
    void onFrame(int rotatedWidth, int rotatedHeight, int rotation);
}
