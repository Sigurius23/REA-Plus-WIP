package io.sentry.android.replay.video;

import ae3.C0803k;
import ag.C0855e;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Surface;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5112r;
import com.google.crypto.tink.internal.C5121z;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.stripe.hcaptcha.HCaptchaException;
import eg.C13162k;
import eg.C13166o;
import gg.C15821h;
import gg.InterfaceC15820g;
import ih0.AbstractC18489d0;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.util.C20240h;
import io.sentry.android.replay.util.EnumC20238f;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Iterator;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p021av.C2088b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p154fs.AbstractC14724b;
import p154fs.AbstractC14733k;
import p154fs.AbstractC14740r;
import p154fs.C14728f;
import p154fs.C14730h;
import p522uf.C34889p;
import p522uf.InterfaceC34875f;
import p560vs.C36409p3;
import p560vs.C36421r3;
import p560vs.C36433t3;
import p560vs.C36439u3;
import p560vs.EnumC36397n3;
import p715kotlin.jvm.internal.AbstractC22676k;
import ps.C29499a;
import ps.C29500b;
import ps.C29501c;
import q83.AbstractC30060g;
import qg3.C30352d;
import se.AbstractC32410a;
import u40.C34531g;
import u40.InterfaceC34532h;
import x40.InterfaceC37951a;
import x40.InterfaceC37952b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.sentry.android.replay.video.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20245d {

    /* JADX INFO: renamed from: a */
    public Object f76045a;

    /* JADX INFO: renamed from: b */
    public Object f76046b;

    /* JADX INFO: renamed from: c */
    public Object f76047c;

    /* JADX INFO: renamed from: d */
    public Object f76048d;

    /* JADX INFO: renamed from: e */
    public Object f76049e;

    /* JADX INFO: renamed from: f */
    public Object f76050f;

    /* JADX INFO: renamed from: g */
    public Object f76051g;

    /* JADX INFO: renamed from: h */
    public Object f76052h;

    public C20245d(C20513q6 options, C20242a c20242a) {
        AbstractC22676k.m65750j(options, "options");
        this.f76045a = options;
        this.f76046b = c20242a;
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(enumC23463i, C20244c.f76044w);
        this.f76047c = interfaceC23462hM92087G;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) interfaceC23462hM92087G.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(c20242a.f76037f);
        AbstractC22676k.m65747g(mediaCodecCreateByCodecName);
        this.f76049e = mediaCodecCreateByCodecName;
        this.f76048d = AbstractC30060g.m92087G(enumC23463i, new C2088b(this, 27));
        this.f76050f = new MediaCodec.BufferInfo();
        String absolutePath = c20242a.f76032a.getAbsolutePath();
        AbstractC22676k.m65749i(absolutePath, "getAbsolutePath(...)");
        this.f76051g = new C20243b(absolutePath, c20242a.f76035d);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m56158e(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return AbstractC32410a.m101055y(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC11895b.m31996o("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C14728f m56159f(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new C14728f((C36421r3) C14730h.m42231a(C36439u3.m116671G(byteArrayInputStream, C5167p.m16298a())).f54470a.m16369y(), 3);
        } finally {
            byteArrayInputStream.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized C29499a m56160a() {
        C29499a c29499a;
        try {
            if (((String) this.f76046b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            C36409p3 c36409p3 = (C36409p3) this.f76051g;
            if (c36409p3 != null && ((C14728f) this.f76050f) == null) {
                this.f76050f = new C14728f(AbstractC14724b.m42225b(c36409p3.m16108e()), 2);
            }
            synchronized (C29499a.f119956b) {
                try {
                    byte[] bArrM56158e = m56158e((Context) this.f76045a, (String) this.f76046b, (String) this.f76047c);
                    if (bArrM56158e == null) {
                        if (((String) this.f76048d) != null) {
                            this.f76049e = m56165h();
                        }
                        this.f76052h = m56163d();
                    } else if (((String) this.f76048d) != null) {
                        this.f76052h = m56164g(bArrM56158e);
                    } else {
                        this.f76052h = m56159f(bArrM56158e);
                    }
                    c29499a = new C29499a(this);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return c29499a;
    }

    /* JADX INFO: renamed from: b */
    public void m56161b(boolean z4) {
        ByteBuffer byteBuffer;
        C20243b c20243b = (C20243b) this.f76051g;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f76050f;
        MediaCodec mediaCodec = (MediaCodec) this.f76049e;
        C20513q6 c20513q6 = (C20513q6) this.f76045a;
        if (c20513q6.getSessionReplay().f77072n) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: drainCodec(" + z4 + ')', new Object[0]);
        }
        if (z4) {
            if (c20513q6.getSessionReplay().f77072n) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z4) {
                    return;
                }
                if (c20513q6.getSessionReplay().f77072n) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (c20243b.f76040c) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                AbstractC22676k.m65749i(outputFormat, "getOutputFormat(...)");
                if (c20513q6.getSessionReplay().f77072n) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                MediaMuxer mediaMuxer = c20243b.f76039b;
                c20243b.f76041d = mediaMuxer.addTrack(outputFormat);
                mediaMuxer.start();
                c20243b.f76040c = true;
            } else if (iDequeueOutputBuffer < 0) {
                if (c20513q6.getSessionReplay().f77072n) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC2875y.m8295h(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException(AbstractC2875y.m8296i(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                if ((bufferInfo.flags & 2) != 0) {
                    if (c20513q6.getSessionReplay().f77072n) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!c20243b.f76040c) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    long j7 = c20243b.f76038a;
                    int i13 = c20243b.f76042e;
                    c20243b.f76042e = i13 + 1;
                    long j13 = j7 * ((long) i13);
                    c20243b.f76043f = j13;
                    bufferInfo.presentationTimeUs = j13;
                    c20243b.f76039b.writeSampleData(c20243b.f76041d, byteBuffer, bufferInfo);
                    if (c20513q6.getSessionReplay().f77072n) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC18489d0.m53371l(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (c20513q6.getSessionReplay().f77072n) {
                        if (z4) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX INFO: renamed from: c */
    public void m56162c(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC22676k.m65749i(MANUFACTURER, "MANUFACTURER");
        if (AbstractC39414r.m125876U(MANUFACTURER, "xiaomi", true) || AbstractC39414r.m125876U(MANUFACTURER, "motorola", true)) {
            surface = (Surface) this.f76052h;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            EnumC20238f enumC20238f = EnumC20238f.SOC_MANUFACTURER;
            if (C20240h.m56154a(enumC20238f).equalsIgnoreCase("spreadtrum") || C20240h.m56154a(enumC20238f).equalsIgnoreCase("unisoc")) {
                surface = (Surface) this.f76052h;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = (Surface) this.f76052h;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = (Surface) this.f76052h;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        m56161b(false);
    }

    /* JADX INFO: renamed from: d */
    public C14728f m56163d() throws GeneralSecurityException {
        if (((C14728f) this.f76050f) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        C14728f c14728f = new C14728f(C36439u3.m116670F(), 3);
        C14728f c14728f2 = (C14728f) this.f76050f;
        synchronized (c14728f) {
            AbstractC14733k abstractC14733k = (AbstractC14733k) c14728f2.f54468b;
            c14728f.m42227a(abstractC14733k instanceof C5112r ? (C36409p3) ((C5112r) abstractC14733k).f21460a.f21444y : (C36409p3) ((C5101l0) C5121z.f21474b.m16098h(abstractC14733k)).f21444y);
        }
        int iM116781D = AbstractC14740r.m42243a(c14728f.m42229c().f54470a).m116798B().m116781D();
        synchronized (c14728f) {
            for (int i13 = 0; i13 < ((C36439u3) ((C36421r3) c14728f.f54468b).f21594x).m116675C(); i13++) {
                try {
                    C36433t3 c36433t3M116674B = ((C36439u3) ((C36421r3) c14728f.f54468b).f21594x).m116674B(i13);
                    if (c36433t3M116674B.m116646E() == iM116781D) {
                        if (!c36433t3M116674B.m116648G().equals(EnumC36397n3.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM116781D);
                        }
                        C36421r3 c36421r3 = (C36421r3) c14728f.f54468b;
                        c36421r3.m16350e();
                        C36439u3.m116673z((C36439u3) c36421r3.f21594x, iM116781D);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            throw new GeneralSecurityException("key not found: " + iM116781D);
        }
        Context context = (Context) this.f76045a;
        String str = (String) this.f76046b;
        C30352d c30352d = new C30352d(context, str, (String) this.f76047c);
        C14730h c14730hM42229c = c14728f.m42229c();
        C29500b c29500b = (C29500b) this.f76049e;
        try {
            if (c29500b != null) {
                c14730hM42229c.m42235e(c30352d, c29500b);
                return c14728f;
            }
            if (((SharedPreferences.Editor) c30352d.f124535x).putString(str, AbstractC32410a.m101003K(c14730hM42229c.f54470a.m16108e())).commit()) {
                return c14728f;
            }
            throw new IOException("Failed to write to SharedPreferences");
        } catch (IOException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public C14728f m56164g(byte[] bArr) {
        try {
            this.f76049e = new C29501c().m90136c((String) this.f76048d);
            try {
                return new C14728f((C36421r3) C14730h.m42232c(new C14728f(new ByteArrayInputStream(bArr), 1), (C29500b) this.f76049e).f54470a.m16369y(), 3);
            } catch (IOException | GeneralSecurityException e5) {
                try {
                    return m56159f(bArr);
                } catch (IOException unused) {
                    throw e5;
                }
            }
        } catch (GeneralSecurityException | ProviderException e13) {
            try {
                C14728f c14728fM56159f = m56159f(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e13);
                return c14728fM56159f;
            } catch (IOException unused2) {
                throw e13;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public C29500b m56165h() throws KeyStoreException {
        C29501c c29501c = new C29501c();
        try {
            boolean zM90133a = C29501c.m90133a((String) this.f76048d);
            try {
                return c29501c.m90136c((String) this.f76048d);
            } catch (GeneralSecurityException | ProviderException e5) {
                if (!zM90133a) {
                    throw new KeyStoreException(AbstractC11895b.m31996o("the master key ", (String) this.f76048d, " exists but is unusable"), e5);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e5);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e13) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e13);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m56166i() {
        MediaCodec mediaCodec = (MediaCodec) this.f76049e;
        try {
            m56161b(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.f76052h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((C20243b) this.f76051g).f76039b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th3) {
            ((C20513q6) this.f76045a).getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to properly release video encoder", th3);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m56167j() {
        ((ArrayList) this.f76047c).clear();
        ((ArrayList) this.f76048d).clear();
        ((ArrayList) this.f76049e).clear();
        InterfaceC34532h interfaceC34532h = (InterfaceC34532h) this.f76052h;
        if (interfaceC34532h != null) {
            interfaceC34532h.reset();
            this.f76052h = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m56168k(C34889p c34889p) {
        this.f76049e = c34889p;
    }

    /* JADX INFO: renamed from: l */
    public void m56169l(InterfaceC34875f interfaceC34875f) {
        this.f76050f = interfaceC34875f;
    }

    /* JADX INFO: renamed from: m */
    public void m56170m(InterfaceC15820g interfaceC15820g) {
        AbstractC22676k.m65750j(interfaceC15820g, "<set-?>");
        this.f76052h = interfaceC15820g;
    }

    /* JADX INFO: renamed from: n */
    public void m56171n(C13166o c13166o) {
        AbstractC22676k.m65750j(c13166o, "<set-?>");
        this.f76051g = c13166o;
    }

    /* JADX INFO: renamed from: o */
    public void m56172o() {
        C34531g c34531g = (C34531g) this.f76045a;
        boolean z4 = false;
        if (c34531g != null) {
            Iterator it = ((ArrayList) this.f76047c).iterator();
            while (it.hasNext()) {
                ((InterfaceC37952b) it.next()).onSuccess(c34531g);
                z4 = true;
            }
        }
        HCaptchaException hCaptchaException = (HCaptchaException) this.f76046b;
        if (hCaptchaException != null) {
            Iterator it3 = ((ArrayList) this.f76048d).iterator();
            while (it3.hasNext()) {
                ((InterfaceC37951a) it3.next()).mo109105e(hCaptchaException);
                z4 = true;
            }
        }
        if (z4) {
            this.f76045a = null;
            this.f76046b = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m56173p(C36409p3 c36409p3) {
        this.f76051g = c36409p3;
    }

    /* JADX INFO: renamed from: q */
    public void m56174q(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.f76048d = str;
    }

    /* JADX INFO: renamed from: r */
    public void m56175r(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f76045a = context;
        this.f76046b = str;
        this.f76047c = str2;
    }

    public C20245d(int i13) {
        switch (i13) {
            case 3:
                this.f76050f = new Handler(Looper.getMainLooper());
                this.f76047c = new ArrayList();
                this.f76048d = new ArrayList();
                this.f76049e = new ArrayList();
                this.f76045a = null;
                this.f76046b = null;
                break;
            case 4:
                this.f76045a = new C0855e(1);
                this.f76046b = new C0855e(1);
                this.f76047c = new C0855e(1);
                this.f76048d = new C0855e(1);
                this.f76049e = C34889p.f146932d;
                this.f76051g = new C13166o(new C0803k(new C13162k()));
                this.f76052h = C15821h.f59715x;
                break;
            default:
                this.f76045a = null;
                this.f76046b = null;
                this.f76047c = null;
                this.f76048d = null;
                this.f76049e = null;
                this.f76050f = null;
                this.f76051g = null;
                break;
        }
    }
}
