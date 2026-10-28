package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import io.sentry.hints.C20363j;
import java.io.IOException;
import p014aj.C0929d;
import p037bu.C3632c;
import p088dc.AbstractC11895b;
import p586wk.C37329g;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;

/* JADX INFO: renamed from: gl.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15937b0 implements InterfaceC37332j {

    /* JADX INFO: renamed from: d */
    public static final C37329g f60338d = new C37329g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C0929d(11, false));

    /* JADX INFO: renamed from: e */
    public static final C37329g f60339e = new C37329g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C3632c(10));

    /* JADX INFO: renamed from: f */
    public static final C20363j f60340f = new C20363j(22);

    /* JADX INFO: renamed from: a */
    public final InterfaceC15935a0 f60341a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0955b f60342b;

    /* JADX INFO: renamed from: c */
    public final C20363j f60343c = f60340f;

    public C15937b0(InterfaceC0955b interfaceC0955b, InterfaceC15935a0 interfaceC15935a0) {
        this.f60342b = interfaceC0955b;
        this.f60341a = interfaceC15935a0;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m44993c(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i13, int i14, int i15, C15946k c15946k) {
        Bitmap scaledFrameAtTime = null;
        if (i14 != Integer.MIN_VALUE && i15 != Integer.MIN_VALUE && c15946k != C15946k.f60357e) {
            try {
                int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i18 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i18 == 90 || i18 == 270) {
                    i17 = i16;
                    i16 = i17;
                }
                float fM45010b = c15946k.m45010b(i16, i17, i14, i15);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j7, i13, Math.round(i16 * fM45010b), Math.round(fM45010b * i17));
            } catch (Throwable th3) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th3);
                }
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j7, i13) : scaledFrameAtTime;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) throws IOException {
        long jLongValue = ((Long) c37330h.m119569c(f60338d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) c37330h.m119569c(f60339e);
        if (num == null) {
            num = 2;
        }
        C15946k c15946k = (C15946k) c37330h.m119569c(C15946k.f60359g);
        if (c15946k == null) {
            c15946k = C15946k.f60358f;
        }
        C15946k c15946k2 = c15946k;
        this.f60343c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f60341a.mo44991e(mediaMetadataRetriever, obj);
                Bitmap bitmapM44993c = m44993c(mediaMetadataRetriever, jLongValue, num.intValue(), i13, i14, c15946k2);
                mediaMetadataRetriever.release();
                return C15938c.m44994b(this.f60342b, bitmapM44993c);
            } catch (RuntimeException e5) {
                throw new IOException(e5);
            }
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        return true;
    }
}
