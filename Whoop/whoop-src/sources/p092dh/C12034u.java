package p092dh;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;
import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import io.sentry.config.AbstractC20301a;
import mh.C25545m;
import p000.AbstractC30802r;
import p341nh.C26714h;
import p341nh.EnumC26713g;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: dh.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C12034u implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C22669g0 f39798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C12036w f39799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C22659b0 f39800c;

    public C12034u(C22669g0 c22669g0, C12036w c12036w, C22659b0 c22659b0) {
        this.f39798a = c22669g0;
        this.f39799b = c12036w;
        this.f39800c = c22659b0;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.f39798a.f89336w = imageDecoder;
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        C25545m c25545m = this.f39799b.f39805b;
        C26714h c26714h = c25545m.f100138d;
        EnumC26713g enumC26713g = c25545m.f100139e;
        C26714h c26714h2 = C26714h.f106216c;
        int iM56333c0 = AbstractC22676k.m65745e(c26714h, c26714h2) ? width : AbstractC20301a.m56333c0(c26714h.f106217a, enumC26713g);
        C26714h c26714h3 = c25545m.f100138d;
        int iM56333c1 = AbstractC22676k.m65745e(c26714h3, c26714h2) ? height : AbstractC20301a.m56333c0(c26714h3.f106218b, c25545m.f100139e);
        if (width > 0 && height > 0 && (width != iM56333c0 || height != iM56333c1)) {
            double dM5393k = AbstractC1772c1.m5393k(width, height, iM56333c0, iM56333c1, c25545m.f100139e);
            boolean z4 = dM5393k < 1.0d;
            this.f39800c.f89329w = z4;
            if (z4 || !c25545m.f100140f) {
                imageDecoder.setTargetSize(AbstractC12889b.m36257W(((double) width) * dM5393k), AbstractC12889b.m36257W(dM5393k * ((double) height)));
            }
        }
        imageDecoder.setAllocator(c25545m.f100136b == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!c25545m.f100141g ? 1 : 0);
        ColorSpace colorSpace = c25545m.f100137c;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!c25545m.f100142h);
        AbstractC30802r.m94771t(c25545m.f100146l.f100151w.get("coil#animated_transformation"));
        imageDecoder.setPostProcessor(null);
    }
}
