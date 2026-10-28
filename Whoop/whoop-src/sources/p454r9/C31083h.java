package p454r9;

import androidx.media3.common.VideoFrameProcessingException;
import p516u8.InterfaceC34627x0;

/* JADX INFO: renamed from: r9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C31083h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC34627x0 f128189a;

    public C31083h(InterfaceC34627x0 interfaceC34627x0) {
        this.f128189a = interfaceC34627x0;
    }

    /* JADX INFO: renamed from: a */
    public final void m95739a() throws VideoFrameProcessingException {
        try {
            ((C31083h) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC34627x0.class).newInstance(this.f128189a)).m95739a();
        } catch (Exception e5) {
            if (!(e5 instanceof VideoFrameProcessingException)) {
                throw new VideoFrameProcessingException(e5);
            }
            int i13 = VideoFrameProcessingException.f6367w;
        }
    }
}
