package q33;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.C2570m;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import java.nio.ByteBuffer;
import l83.C23470p;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;
import p095dp.AbstractC12240d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import r53.C30941b;
import r53.C30943d;
import r53.C30944e;
import r53.C30945f;
import r53.RunnableC30940a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C29954b implements VideoProcessor {

    /* JADX INFO: renamed from: a */
    public final AbstractC22680m f122352a;

    /* JADX INFO: renamed from: b */
    public final AbstractC22680m f122353b;

    /* JADX INFO: renamed from: c */
    public VideoSink f122354c;

    /* JADX INFO: renamed from: d */
    public final YuvConverter f122355d = new YuvConverter();

    /* JADX INFO: renamed from: e */
    public int f122356e;

    /* JADX INFO: renamed from: f */
    public int f122357f;

    /* JADX INFO: renamed from: g */
    public TextureBufferImpl f122358g;

    /* JADX INFO: renamed from: h */
    public VideoFrame.I420Buffer f122359h;

    /* JADX INFO: renamed from: i */
    public final int[] f122360i;

    /* JADX INFO: renamed from: j */
    public Bitmap f122361j;

    /* JADX WARN: Multi-variable type inference failed */
    public C29954b(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f122352a = (AbstractC22680m) interfaceC4339a;
        this.f122353b = (AbstractC22680m) interfaceC4339a2;
        int[] iArr = new int[1];
        this.f122360i = iArr;
        GLES20.glGenTextures(1, iArr, 0);
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z4) {
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v9, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame frame) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int[] iArr;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        AbstractC22676k.m65750j(frame, "frame");
        ?? r10 = this.f122352a;
        C29953a c29953a = (C29953a) r10.invoke();
        if (c29953a == null) {
            VideoSink videoSink = this.f122354c;
            if (videoSink != null) {
                videoSink.onFrame(frame);
                return;
            }
            return;
        }
        if (!(c29953a instanceof C29953a)) {
            throw new Error(AbstractC25012a.m73375h(r10.invoke(), "Unsupported video filter type "));
        }
        C23470p c23470p = C29955c.f122362a;
        VideoFrame.I420Buffer i420 = frame.getBuffer().toI420();
        Bitmap bitmap = null;
        if (i420 != null) {
            try {
                int strideY = i420.getStrideY();
                ByteBuffer dataY = i420.getDataY();
                AbstractC22676k.m65749i(dataY, "getDataY(...)");
                C30945f c30945f = new C30945f(strideY, dataY);
                int strideU = i420.getStrideU();
                ByteBuffer dataU = i420.getDataU();
                AbstractC22676k.m65749i(dataU, "getDataU(...)");
                C30945f c30945f2 = new C30945f(strideU, dataU);
                int strideV = i420.getStrideV();
                ByteBuffer dataV = i420.getDataV();
                AbstractC22676k.m65749i(dataV, "getDataV(...)");
                C30945f c30945f3 = new C30945f(strideV, dataV);
                int width = i420.getWidth();
                int height = i420.getHeight();
                C30944e c30944eM91640a = C29955c.m91640a(new C30944e(null, c30945f, c30945f2, c30945f3, width, height, new Rect(0, 0, width, height), null), frame.getRotation());
                int i39 = c30944eM91640a.f127676H;
                int i44 = c30944eM91640a.f127677I;
                Rect rect = new Rect(0, 0, i39, i44);
                int i45 = i39 << 2;
                ByteBuffer byteBuffer = AbstractC12240d.m34085v(AbstractC37056f.m118958J(new C30943d(i45 * i44)))[0];
                C30941b c30941b = new C30941b(byteBuffer, new C30945f(i45, byteBuffer), i39, i44, rect, new RunnableC30940a(byteBuffer, 0));
                c30944eM91640a.m95190h(c30941b);
                Bitmap bitmapM95189h = c30941b.m95189h();
                c30944eM91640a.close();
                c30941b.close();
                i420.release();
                bitmap = bitmapM95189h;
            } catch (Throwable th3) {
                C2345k c2345k = (C2345k) C29955c.f122362a.getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                String str = c2345k.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "Failed to convert VideoFrame to Bitmap", th3);
                }
            }
        }
        this.f122361j = bitmap;
        if (bitmap == null || this.f122354c == null) {
            return;
        }
        int width2 = bitmap.getWidth();
        Bitmap bitmap2 = this.f122361j;
        AbstractC22676k.m65747g(bitmap2);
        int height2 = bitmap2.getHeight();
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) this.f122353b.invoke();
        VideoFrame.I420Buffer i420Buffer = this.f122359h;
        if (i420Buffer != null) {
            i420Buffer.release();
        }
        if (this.f122356e != width2 || this.f122357f != height2) {
            this.f122356e = width2;
            this.f122357f = height2;
            TextureBufferImpl textureBufferImpl = this.f122358g;
            if (textureBufferImpl != null) {
                textureBufferImpl.release();
            }
            VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.RGB;
            Matrix matrix = new Matrix();
            matrix.preScale(1.0f, -1.0f);
            this.f122358g = new TextureBufferImpl(this.f122356e, this.f122357f, type, this.f122360i[0], matrix, surfaceTextureHelper.getHandler(), this.f122355d, (Runnable) null);
        }
        Bitmap bitmap3 = this.f122361j;
        AbstractC22676k.m65747g(bitmap3);
        int iM36284n = AbstractC12889b.m36284n(80, 4, 96);
        if (iM36284n > 0 && bitmap3.getWidth() != 0 && bitmap3.getHeight() != 0) {
            C2570m c2570m = c29953a.f122351a;
            int width3 = bitmap3.getWidth();
            int height3 = bitmap3.getHeight();
            int i46 = width3 - 1;
            int i47 = height3 - 1;
            int i48 = width3 * height3;
            int iMax = Math.max(width3, height3);
            if (((int[]) c2570m.f9987x).length < i48) {
                c2570m.f9987x = new int[i48];
                c2570m.f9988y = new int[i48];
                c2570m.f9989z = new int[i48];
                c2570m.f9984E = new int[i48];
            }
            if (((int[]) c2570m.f9985F).length < iMax) {
                c2570m.f9985F = new int[iMax];
            }
            bitmap3.getPixels((int[]) c2570m.f9987x, 0, width3, 0, 0, width3, height3);
            int i49 = iM36284n + iM36284n;
            int i54 = i49 + 1;
            int i55 = iM36284n + 1;
            int i56 = (i49 + 2) >> 1;
            int i57 = i56 * i56;
            int i58 = i57 * 256;
            int[] iArr2 = new int[i58];
            for (int i59 = 0; i59 < i58; i59++) {
                iArr2[i59] = i59 / i57;
            }
            int[] iArr3 = new int[i54 * 3];
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            while (i64 < height3) {
                int i67 = -iM36284n;
                if (i67 <= iM36284n) {
                    i26 = 0;
                    i27 = 0;
                    i28 = 0;
                    i29 = 0;
                    i34 = 0;
                    i35 = 0;
                    i36 = 0;
                    i37 = 0;
                    i38 = 0;
                    while (true) {
                        iArr = iArr3;
                        int i68 = ((int[]) c2570m.f9987x)[Math.min(i46, Math.max(i67, 0)) + i65];
                        int i69 = (i67 + iM36284n) * 3;
                        iArr[i69] = (i68 >> 16) & 255;
                        int i74 = i69 + 1;
                        iArr[i74] = (i68 >> 8) & 255;
                        int i75 = i69 + 2;
                        iArr[i75] = i68 & 255;
                        int iAbs = i55 - Math.abs(i67);
                        int i76 = iArr[i69];
                        i26 = (i76 * iAbs) + i26;
                        int i77 = iArr[i74];
                        i27 = (i77 * iAbs) + i27;
                        int i78 = iArr[i75];
                        i28 = (iAbs * i78) + i28;
                        if (i67 > 0) {
                            i36 += i76;
                            i37 += i77;
                            i38 += i78;
                        } else {
                            i29 += i76;
                            i34 += i77;
                            i35 += i78;
                        }
                        if (i67 == iM36284n) {
                            break;
                        }
                        i67++;
                        iArr3 = iArr;
                    }
                } else {
                    iArr = iArr3;
                    i26 = 0;
                    i27 = 0;
                    i28 = 0;
                    i29 = 0;
                    i34 = 0;
                    i35 = 0;
                    i36 = 0;
                    i37 = 0;
                    i38 = 0;
                }
                int i79 = iM36284n;
                int i83 = 0;
                while (i83 < width3) {
                    ((int[]) c2570m.f9988y)[i65] = iArr2[i26];
                    ((int[]) c2570m.f9989z)[i65] = iArr2[i27];
                    ((int[]) c2570m.f9984E)[i65] = iArr2[i28];
                    int i84 = i26 - i29;
                    int i85 = i27 - i34;
                    int i86 = i28 - i35;
                    int i87 = (((i79 - iM36284n) + i54) % i54) * 3;
                    int i88 = i29 - iArr[i87];
                    int i89 = i87 + 1;
                    int i94 = i34 - iArr[i89];
                    int i95 = i87 + 2;
                    int i96 = i35 - iArr[i95];
                    int i97 = i83;
                    if (i64 == 0) {
                        ((int[]) c2570m.f9985F)[i97] = Math.min(i97 + i55, i46);
                    }
                    int i98 = ((int[]) c2570m.f9987x)[i66 + ((int[]) c2570m.f9985F)[i97]];
                    iArr[i87] = (i98 >> 16) & 255;
                    iArr[i89] = (i98 >> 8) & 255;
                    int i99 = i98 & 255;
                    iArr[i95] = i99;
                    int i100 = i36 + iArr[i87];
                    int i101 = i37 + iArr[i89];
                    int i102 = i38 + i99;
                    i26 = i84 + i100;
                    i27 = i85 + i101;
                    i28 = i86 + i102;
                    i79 = (i79 + 1) % i54;
                    int i103 = i79 * 3;
                    int i104 = iArr[i103];
                    i29 = i88 + i104;
                    int i105 = iArr[i103 + 1];
                    i34 = i94 + i105;
                    int i106 = iArr[i103 + 2];
                    i35 = i96 + i106;
                    i36 = i100 - i104;
                    i37 = i101 - i105;
                    i38 = i102 - i106;
                    i65++;
                    i83 = i97 + 1;
                }
                i66 += width3;
                i64++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            int i107 = 0;
            while (i107 < width3) {
                int i108 = -iM36284n;
                int i109 = i108 * width3;
                int i110 = i107;
                if (i108 <= iM36284n) {
                    int i111 = i108;
                    int i112 = i109;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i24 = 0;
                    int i113 = 0;
                    i25 = 0;
                    while (true) {
                        int iMax2 = Math.max(0, i112) + i110;
                        int i114 = (i111 + iM36284n) * 3;
                        int i115 = i112;
                        iArr4[i114] = ((int[]) c2570m.f9988y)[iMax2];
                        int i116 = i114 + 1;
                        iArr4[i116] = ((int[]) c2570m.f9989z)[iMax2];
                        int i117 = i114 + 2;
                        iArr4[i117] = ((int[]) c2570m.f9984E)[iMax2];
                        int iAbs2 = i55 - Math.abs(i111);
                        i113 = (((int[]) c2570m.f9988y)[iMax2] * iAbs2) + i113;
                        i25 = (((int[]) c2570m.f9989z)[iMax2] * iAbs2) + i25;
                        i14 += ((int[]) c2570m.f9984E)[iMax2] * iAbs2;
                        if (i111 > 0) {
                            i18 += iArr4[i114];
                            i19 += iArr4[i116];
                            i24 += iArr4[i117];
                        } else {
                            i15 += iArr4[i114];
                            i16 += iArr4[i116];
                            i17 += iArr4[i117];
                        }
                        i112 = i111 < i47 ? i115 + width3 : i115;
                        if (i111 == iM36284n) {
                            break;
                        } else {
                            i111++;
                        }
                    }
                    i13 = i113;
                } else {
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i24 = 0;
                    i25 = 0;
                }
                int i118 = iM36284n;
                int i119 = i13;
                int i120 = i110;
                int i121 = 0;
                while (i121 < height3) {
                    int i122 = iM36284n;
                    int[] iArr5 = (int[]) c2570m.f9987x;
                    iArr5[i120] = (iArr5[i120] & (-16777216)) | (iArr2[i119] << 16) | (iArr2[i25] << 8) | iArr2[i14];
                    int i123 = i119 - i15;
                    int i124 = i25 - i16;
                    int i125 = i14 - i17;
                    int i126 = (((i118 - i122) + i54) % i54) * 3;
                    int i127 = i15 - iArr4[i126];
                    int i128 = i126 + 1;
                    int i129 = i16 - iArr4[i128];
                    int i130 = i126 + 2;
                    int i131 = i17 - iArr4[i130];
                    if (i110 == 0) {
                        ((int[]) c2570m.f9985F)[i121] = Math.min(i121 + i55, i47) * width3;
                    }
                    int i132 = i110 + ((int[]) c2570m.f9985F)[i121];
                    iArr4[i126] = ((int[]) c2570m.f9988y)[i132];
                    iArr4[i128] = ((int[]) c2570m.f9989z)[i132];
                    int i133 = ((int[]) c2570m.f9984E)[i132];
                    iArr4[i130] = i133;
                    int i134 = i18 + iArr4[i126];
                    int i135 = i19 + iArr4[i128];
                    int i136 = i24 + i133;
                    i119 = i123 + i134;
                    i25 = i124 + i135;
                    i14 = i125 + i136;
                    i118 = (i118 + 1) % i54;
                    int i137 = i118 * 3;
                    int i138 = iArr4[i137];
                    i15 = i127 + i138;
                    int i139 = iArr4[i137 + 1];
                    i16 = i129 + i139;
                    int i140 = iArr4[i137 + 2];
                    i17 = i131 + i140;
                    i18 = i134 - i138;
                    i19 = i135 - i139;
                    i24 = i136 - i140;
                    i120 += width3;
                    i121++;
                    iM36284n = i122;
                }
                i107 = i110 + 1;
            }
            bitmap3.setPixels((int[]) c2570m.f9987x, 0, width3, 0, 0, width3, height3);
        }
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        Bitmap bitmap4 = this.f122361j;
        AbstractC22676k.m65747g(bitmap4);
        GLUtils.texImage2D(3553, 0, bitmap4, 0);
        VideoFrame.I420Buffer i420BufferConvert = this.f122355d.convert(this.f122358g);
        this.f122359h = i420BufferConvert;
        VideoSink videoSink2 = this.f122354c;
        if (videoSink2 != null) {
            videoSink2.onFrame(new VideoFrame(i420BufferConvert, 0, frame.getTimestampNs()));
        }
        Bitmap bitmap5 = this.f122361j;
        if (bitmap5 != null) {
            bitmap5.recycle();
        }
    }

    @Override // org.webrtc.VideoProcessor
    public final void setSink(VideoSink videoSink) {
        this.f122354c = videoSink;
    }
}
