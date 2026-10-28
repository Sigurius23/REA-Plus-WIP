package p284ko;

import android.media.ApplicationMediaCapabilities;
import android.os.Bundle;

/* JADX INFO: renamed from: ko.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22618g {
    /* JADX INFO: renamed from: a */
    public static void m65562a(Bundle bundle) {
        bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
    }
}
