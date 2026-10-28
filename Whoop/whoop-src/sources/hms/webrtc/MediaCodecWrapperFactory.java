package hms.webrtc;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
