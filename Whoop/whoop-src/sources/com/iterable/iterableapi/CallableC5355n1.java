package com.iterable.iterableapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.util.Base64;
import com.airbnb.lottie.LottieAnimationView;
import hms.webrtc.audio.WebRtcAudioRecord;
import io.sentry.C20275c5;
import io.sentry.C20541s5;
import io.sentry.C20620w5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20390j1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.clientreport.C20294b;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import javax.crypto.Cipher;
import ne3.AbstractC26604b;
import p098dt.AbstractC12350b;
import p426qi.AbstractC30391l;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: com.iterable.iterableapi.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class CallableC5355n1 implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21777w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21778x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f21779y;

    public /* synthetic */ CallableC5355n1(int i13, Object obj, Object obj2) {
        this.f21777w = i13;
        this.f21778x = obj;
        this.f21779y = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        int i13 = this.f21777w;
        byte[] bArr = null;
        Object obj = this.f21779y;
        Object obj2 = this.f21778x;
        switch (i13) {
            case 0:
                C5390z it = (C5390z) obj2;
                String str = (String) obj;
                AbstractC22676k.m65750j(it, "$it");
                if (str == null) {
                    return null;
                }
                try {
                    byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
                    AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(1, C5390z.m16543c());
                    byte[] iv3 = cipher.getIV();
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    AbstractC22676k.m65747g(bArrDoFinal);
                    AbstractC22676k.m65747g(iv3);
                    byte[] bArr2 = new byte[iv3.length + 2 + bArrDoFinal.length];
                    bArr2[0] = 1;
                    bArr2[1] = (byte) iv3.length;
                    System.arraycopy(iv3, 0, bArr2, 2, iv3.length);
                    System.arraycopy(bArrDoFinal, 0, bArr2, iv3.length + 2, bArrDoFinal.length);
                    return Base64.encodeToString(bArr2, 2);
                } catch (Exception e5) {
                    AbstractC12350b.m34596q("IterableDataEncryptor", "Encryption failed", e5);
                    throw e5;
                }
            case 1:
                return ((WebRtcAudioRecord) obj2).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) obj);
            case 2:
                InterfaceC20390j1 interfaceC20390j1 = (InterfaceC20390j1) obj2;
                C20620w5 c20620w5 = (C20620w5) obj;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C20275c5.f76146d));
                    try {
                        interfaceC20390j1.mo56235a(bufferedWriter, c20620w5);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th3) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 3:
                InterfaceC20390j1 interfaceC20390j2 = (InterfaceC20390j1) obj2;
                C20294b c20294b = (C20294b) obj;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C20275c5.f76146d));
                    try {
                        interfaceC20390j2.mo56235a(bufferedWriter2, c20294b);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th7) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            case 4:
                InterfaceC20390j1 interfaceC20390j3 = (InterfaceC20390j1) obj2;
                C20541s5 c20541s5 = (C20541s5) obj;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, C20275c5.f76146d));
                    try {
                        interfaceC20390j3.mo56235a(bufferedWriter3, c20541s5);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th11) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                        throw th11;
                    }
                } catch (Throwable th13) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th14) {
                        th13.addSuppressed(th14);
                    }
                    throw th13;
                }
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                InterfaceC20602v0 logger = ((ScreenshotEventProcessor) obj2).f75262w.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream4);
                            bitmap.recycle();
                            if (byteArrayOutputStream4.size() <= 0) {
                                logger.mo16066m(EnumC20436n5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream4.close();
                            } else {
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                bArr = byteArray4;
                            }
                        } catch (Throwable th15) {
                            try {
                                byteArrayOutputStream4.close();
                                break;
                            } catch (Throwable th16) {
                                th15.addSuppressed(th16);
                            }
                            throw th15;
                        }
                    } catch (Throwable th17) {
                        logger.mo16060j(EnumC20436n5.ERROR, "Compressing bitmap failed.", th17);
                    }
                    break;
                }
                return bArr;
            case 6:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                String str2 = (String) obj;
                if (!lottieAnimationView.f20250J) {
                    return AbstractC30391l.m92863b(lottieAnimationView.getContext(), str2, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = AbstractC30391l.f124703a;
                return AbstractC30391l.m92863b(context, str2, "asset_" + str2);
            case 7:
                return AbstractC30391l.m92866e(AbstractC26604b.m79166k((InputStream) obj2), (String) obj);
            case 8:
                return AbstractC30391l.m92866e(AbstractC26604b.m79166k(new ByteArrayInputStream(((String) obj).getBytes())), (String) obj2);
            default:
                return AbstractC30391l.m92869h(null, (ZipInputStream) obj2, (String) obj);
        }
    }

    public /* synthetic */ CallableC5355n1(String str, String str2) {
        this.f21777w = 8;
        this.f21779y = str;
        this.f21778x = str2;
    }
}
