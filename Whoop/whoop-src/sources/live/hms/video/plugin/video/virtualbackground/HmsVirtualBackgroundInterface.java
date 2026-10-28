package live.hms.video.plugin.video.virtualbackground;

import android.graphics.Bitmap;
import live.hms.video.plugin.video.HMSVideoPlugin;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/plugin/video/virtualbackground/HmsVirtualBackgroundInterface;", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "", "getCurrentBlurPercentage", "()I", "blurPercentage", "Ll83/a0;", "enableBlur", "(I)V", "Landroid/graphics/Bitmap;", "bitmap", "enableBackground", "(Landroid/graphics/Bitmap;)V", "disableEffects", "()V", "Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;", "listener", "setVideoFrameInfoListener", "(Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HmsVirtualBackgroundInterface extends HMSVideoPlugin {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void enableBlur$default(HmsVirtualBackgroundInterface hmsVirtualBackgroundInterface, int i13, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableBlur");
            }
            if ((i14 & 1) != 0) {
                i13 = 75;
            }
            hmsVirtualBackgroundInterface.enableBlur(i13);
        }

        public static void setKey(HmsVirtualBackgroundInterface hmsVirtualBackgroundInterface, String key) {
            AbstractC22676k.m65750j(key, "key");
            HMSVideoPlugin.DefaultImpls.setKey(hmsVirtualBackgroundInterface, key);
        }
    }

    void disableEffects();

    void enableBackground(Bitmap bitmap);

    void enableBlur(int blurPercentage);

    int getCurrentBlurPercentage();

    void setVideoFrameInfoListener(VideoFrameInfoListener listener);
}
