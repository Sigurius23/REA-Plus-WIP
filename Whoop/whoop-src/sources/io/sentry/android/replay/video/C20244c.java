package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.sentry.android.replay.video.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20244c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C20244c f76044w = new C20244c(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean z4 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        AbstractC22676k.m65749i(codecInfos, "getCodecInfos(...)");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            if (AbstractC39414r.m125876U(name, "c2.exynos", false)) {
                z4 = true;
                break;
            }
        }
        return Boolean.valueOf(z4);
    }
}
