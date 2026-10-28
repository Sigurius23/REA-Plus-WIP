package p215i9;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import cr.C11078p;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Objects;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p006a4.AbstractC0354a;
import p031b9.C2835h;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11895b;
import p309lo.C24561s;
import p516u8.AbstractC34587d0;
import p516u8.C34592g;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38047b;
import p607x8.AbstractC38065t;
import p641y8.AbstractC39319n;
import p641y8.C39313h;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: i9.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C18237m {

    /* JADX INFO: renamed from: a */
    public final String f70948a;

    /* JADX INFO: renamed from: b */
    public final String f70949b;

    /* JADX INFO: renamed from: c */
    public final String f70950c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f70951d;

    /* JADX INFO: renamed from: e */
    public final boolean f70952e;

    /* JADX INFO: renamed from: f */
    public final boolean f70953f;

    /* JADX INFO: renamed from: g */
    public final boolean f70954g;

    /* JADX INFO: renamed from: h */
    public final boolean f70955h;

    /* JADX INFO: renamed from: i */
    public final boolean f70956i;

    public C18237m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        str.getClass();
        this.f70948a = str;
        this.f70949b = str2;
        this.f70950c = str3;
        this.f70951d = codecCapabilities;
        this.f70954g = z4;
        this.f70952e = z15;
        this.f70953f = z16;
        this.f70955h = z17;
        this.f70956i = AbstractC34587d0.m109381n(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m52508a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC38065t.m121912e(i13, widthAlignment) * widthAlignment, AbstractC38065t.m121912e(i14, heightAlignment) * heightAlignment);
        int i15 = point.x;
        int i16 = point.y;
        return (d3 == -1.0d || d3 < 1.0d) ? videoCapabilities.isSizeSupported(i15, i16) : videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d3));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX INFO: renamed from: i */
    public static C18237m m52509i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        boolean z17;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z16 = false;
        } else {
            if (AbstractC38065t.f163031a <= 22) {
                String str4 = Build.MODEL;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z16 = false;
                }
            }
            z16 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z18 = z15 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (AbstractC38065t.f163031a < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z17 = false;
        } else {
            String str5 = Build.MANUFACTURER;
            if (str5.equals("Xiaomi") || str5.equals("OPPO")) {
                z17 = false;
            } else {
                z17 = true;
            }
        }
        return new C18237m(str, str2, str3, codecCapabilities, z4, z13, z14, z16, z18, z17);
    }

    /* JADX INFO: renamed from: b */
    public final C2835h m52510b(C34610p c34610p, C34610p c34610p2) {
        C34610p c34610p3;
        C34610p c34610p4;
        String str = c34610p.f145783n;
        C34592g c34592g = c34610p.f145757B;
        String str2 = c34610p2.f145783n;
        C34592g c34592g2 = c34610p2.f145757B;
        int i13 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f70956i) {
            if (c34610p.f145793x != c34610p2.f145793x) {
                i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if (!this.f70952e && (c34610p.f145790u != c34610p2.f145790u || c34610p.f145791v != c34610p2.f145791v)) {
                i13 |= 512;
            }
            if ((!C34592g.m109386e(c34592g) || !C34592g.m109386e(c34592g2)) && !Objects.equals(c34592g, c34592g2)) {
                i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f70948a) && !c34610p.m109411b(c34610p2)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new C2835h(this.f70948a, c34610p, c34610p2, c34610p.m109411b(c34610p2) ? 3 : 2, 0);
            }
            c34610p3 = c34610p;
            c34610p4 = c34610p2;
        } else {
            c34610p3 = c34610p;
            c34610p4 = c34610p2;
            if (c34610p3.f145759D != c34610p4.f145759D) {
                i13 |= 4096;
            }
            if (c34610p3.f145760E != c34610p4.f145760E) {
                i13 |= DfuBaseService.ERROR_REMOTE_MASK;
            }
            if (c34610p3.f145761F != c34610p4.f145761F) {
                i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
            }
            String str3 = this.f70949b;
            if (i13 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairM52550d = AbstractC18243s.m52550d(c34610p3);
                Pair pairM52550d2 = AbstractC18243s.m52550d(c34610p4);
                if (pairM52550d != null && pairM52550d2 != null) {
                    int iIntValue = ((Integer) pairM52550d.first).intValue();
                    int iIntValue2 = ((Integer) pairM52550d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C2835h(this.f70948a, c34610p3, c34610p4, 3, 0);
                    }
                }
            }
            if (!c34610p3.m109411b(c34610p4)) {
                i13 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new C2835h(this.f70948a, c34610p3, c34610p4, 1, 0);
            }
        }
        return new C2835h(this.f70948a, c34610p3, c34610p4, 0, i13);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[PHI: r2
      0x00c5: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v13 android.util.Pair) binds: [B:3:0x000f, B:5:0x0017, B:10:0x002b, B:40:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    public final boolean m52511c(C34610p c34610p, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strM121828a;
        int i13;
        Pair pairM52550d = AbstractC18243s.m52550d(c34610p);
        String str = c34610p.f145783n;
        int i14 = 4;
        String str2 = this.f70950c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strM109382o = AbstractC34587d0.m109382o(str2);
            if (strM109382o.equals("video/mv-hevc")) {
                return true;
            }
            if (strM109382o.equals("video/hevc")) {
                List list = c34610p.f145786q;
                int i15 = 0;
                loop0: while (true) {
                    if (i15 >= list.size()) {
                        pair = null;
                        strM121828a = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i15);
                    int length = bArr.length;
                    int i16 = 3;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                        int i17 = 0;
                        while (i17 < bArr.length) {
                            int iM125276c = AbstractC39319n.m125276c(bArr, i17, bArr.length, zArr);
                            if (iM125276c != bArr.length) {
                                c41014d0M133251l.m133222a(Integer.valueOf(iM125276c));
                            }
                            i17 = iM125276c + 3;
                        }
                        C41060w0 c41060w0M133239f = c41014d0M133251l.m133239f();
                        int i18 = 0;
                        while (i18 < c41060w0M133239f.f177069z) {
                            if (((Integer) c41060w0M133239f.get(i18)).intValue() + i16 < length) {
                                C24561s c24561s = new C24561s(((Integer) c41060w0M133239f.get(i18)).intValue() + i16, length, 6, bArr);
                                C11078p c11078pM125279f = AbstractC39319n.m125279f(c24561s);
                                if (c11078pM125279f.f35038a == 33 && c11078pM125279f.f35039b == 0) {
                                    c24561s.m71643t(4);
                                    int iM71632i = c24561s.m71632i(3);
                                    c24561s.m71642s();
                                    pair = null;
                                    C39313h c39313hM125280g = AbstractC39319n.m125280g(c24561s, true, iM71632i, null);
                                    strM121828a = AbstractC38047b.m121828a(c39313hM125280g.f169121a, c39313hM125280g.f169122b, c39313hM125280g.f169123c, c39313hM125280g.f169124d, c39313hM125280g.f169125e, c39313hM125280g.f169126f);
                                    break loop0;
                                }
                                i13 = 3;
                            } else {
                                i13 = i16;
                            }
                            i18++;
                            i16 = i13;
                        }
                    }
                    i15++;
                }
                if (strM121828a == null) {
                    pairM52550d = pair;
                } else {
                    String strTrim = strM121828a.trim();
                    int i19 = AbstractC38065t.f163031a;
                    pairM52550d = AbstractC38047b.m121829b(strM121828a, strTrim.split("\\.", -1), c34610p.f145757B);
                }
            }
        }
        if (pairM52550d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM52550d.first).intValue();
        int iIntValue2 = ((Integer) pairM52550d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str3 = this.f70949b;
        if (zEquals) {
            str3.getClass();
            switch (str3) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f70956i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f70951d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC38065t.f163031a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i14 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else if (iIntValue3 >= 120000000) {
                i14 = 512;
            } else if (iIntValue3 >= 60000000) {
                i14 = 256;
            } else if (iIntValue3 >= 30000000) {
                i14 = 128;
            } else if (iIntValue3 >= 18000000) {
                i14 = 64;
            } else if (iIntValue3 >= 12000000) {
                i14 = 32;
            } else if (iIntValue3 >= 7200000) {
                i14 = 16;
            } else if (iIntValue3 >= 3600000) {
                i14 = 8;
            } else if (iIntValue3 < 1800000) {
                i14 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i14;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z4)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = Build.DEVICE;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        m52516h("codec.profileLevel, " + c34610p.f145780k + ", " + str2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52512d(C34610p c34610p) {
        return (Objects.equals(c34610p.f145783n, "audio/flac") && c34610p.f145761F == 22 && AbstractC38065t.f163031a < 34 && this.f70948a.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52513e(C34610p c34610p) {
        int i13;
        int i14;
        String str = c34610p.f145783n;
        String str2 = this.f70949b;
        if ((!str2.equals(str) && !str2.equals(AbstractC18243s.m52548b(c34610p))) || !m52511c(c34610p, true) || !m52512d(c34610p)) {
            return false;
        }
        if (this.f70956i) {
            int i15 = c34610p.f145790u;
            if (i15 > 0 && (i14 = c34610p.f145791v) > 0) {
                return m52515g(i15, i14, c34610p.f145792w);
            }
        } else {
            int i16 = c34610p.f145760E;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f70951d;
            if (i16 != -1) {
                if (codecCapabilities == null) {
                    m52516h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m52516h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i16)) {
                    m52516h("sampleRate.support, " + i16);
                    return false;
                }
            }
            int i17 = c34610p.f145759D;
            if (i17 != -1) {
                if (codecCapabilities == null) {
                    m52516h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m52516h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((AbstractC38065t.f163031a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i13 = 6;
                    } else {
                        i13 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbM30467u = AbstractC11266d.m30467u(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f70948a, ", [", " to ");
                    sbM30467u.append(i13);
                    sbM30467u.append("]");
                    AbstractC38046a.m121826u("MediaCodecInfo", sbM30467u.toString());
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i17) {
                    m52516h("channelCount.support, " + i17);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m52514f(C34610p c34610p) {
        if (this.f70956i) {
            return this.f70952e;
        }
        Pair pairM52550d = AbstractC18243s.m52550d(c34610p);
        return pairM52550d != null && ((Integer) pairM52550d.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX INFO: renamed from: g */
    public final boolean m52515g(int i13, int i14, double d3) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f70951d;
        if (codecCapabilities == null) {
            m52516h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m52516h("sizeAndRate.vCaps");
            return false;
        }
        int i15 = AbstractC38065t.f163031a;
        if (i15 >= 29) {
            int iM962b = (i15 < 29 || ((bool = AbstractC3511b.f13983E) != null && bool.booleanValue())) ? 0 : AbstractC0354a.m962b(videoCapabilities, i13, i14, d3);
            if (iM962b != 2) {
                if (iM962b == 1) {
                    StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.cover, ", "x", "@");
                    sbM30465s.append(d3);
                    m52516h(sbM30465s.toString());
                    return false;
                }
                if (!m52508a(videoCapabilities, i13, i14, d3)) {
                    if (i13 < i14) {
                        str = this.f70948a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbM30465s2 = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.rotated, ", "x", "@");
                            sbM30465s2.append(d3);
                            StringBuilder sbM32001t = AbstractC11895b.m32001t("AssumedSupport [", sbM30465s2.toString(), "] [", str, ", ");
                            sbM32001t.append(this.f70949b);
                            sbM32001t.append("] [");
                            sbM32001t.append(AbstractC38065t.f163032b);
                            sbM32001t.append("]");
                            AbstractC38046a.m121811f("MediaCodecInfo", sbM32001t.toString());
                            return true;
                        }
                        StringBuilder sbM30465s3 = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.rotated, ", "x", "@");
                        sbM30465s3.append(d3);
                        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("AssumedSupport [", sbM30465s3.toString(), "] [", str, ", ");
                        sbM32001t2.append(this.f70949b);
                        sbM32001t2.append("] [");
                        sbM32001t2.append(AbstractC38065t.f163032b);
                        sbM32001t2.append("]");
                        AbstractC38046a.m121811f("MediaCodecInfo", sbM32001t2.toString());
                        return true;
                    }
                    StringBuilder sbM30465s4 = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.support, ", "x", "@");
                    sbM30465s4.append(d3);
                    m52516h(sbM30465s4.toString());
                    return false;
                }
            }
        } else if (!m52508a(videoCapabilities, i13, i14, d3)) {
            if (i13 < i14) {
                str = this.f70948a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m52508a(videoCapabilities, i14, i13, d3)) {
                    StringBuilder sbM30465s5 = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.rotated, ", "x", "@");
                    sbM30465s5.append(d3);
                    StringBuilder sbM32001t3 = AbstractC11895b.m32001t("AssumedSupport [", sbM30465s5.toString(), "] [", str, ", ");
                    sbM32001t3.append(this.f70949b);
                    sbM32001t3.append("] [");
                    sbM32001t3.append(AbstractC38065t.f163032b);
                    sbM32001t3.append("]");
                    AbstractC38046a.m121811f("MediaCodecInfo", sbM32001t3.toString());
                    return true;
                }
            }
            StringBuilder sbM30465s6 = AbstractC11266d.m30465s(i13, i14, "sizeAndRate.support, ", "x", "@");
            sbM30465s6.append(d3);
            m52516h(sbM30465s6.toString());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m52516h(String str) {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("NoSupport [", str, "] [");
        sbM53375p.append(this.f70948a);
        sbM53375p.append(", ");
        sbM53375p.append(this.f70949b);
        sbM53375p.append("] [");
        sbM53375p.append(AbstractC38065t.f163032b);
        sbM53375p.append("]");
        AbstractC38046a.m121811f("MediaCodecInfo", sbM53375p.toString());
    }

    public final String toString() {
        return this.f70948a;
    }
}
