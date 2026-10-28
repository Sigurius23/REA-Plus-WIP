package hn;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p527um.C35074d;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hn.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C17504l {

    /* JADX INFO: renamed from: a */
    public final String f67657a;

    /* JADX INFO: renamed from: b */
    public final String f67658b;

    /* JADX INFO: renamed from: c */
    public final String f67659c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f67660d;

    /* JADX INFO: renamed from: e */
    public final boolean f67661e;

    /* JADX INFO: renamed from: f */
    public final boolean f67662f;

    /* JADX INFO: renamed from: g */
    public final boolean f67663g;

    /* JADX INFO: renamed from: h */
    public final boolean f67664h;

    public C17504l(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z13, boolean z14) {
        str.getClass();
        this.f67657a = str;
        this.f67658b = str2;
        this.f67659c = str3;
        this.f67660d = codecCapabilities;
        this.f67663g = z4;
        this.f67661e = z13;
        this.f67662f = z14;
        this.f67664h = AbstractC24555m.m71616j(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m49692a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC24567y.m71675f(i13, widthAlignment) * widthAlignment, AbstractC24567y.m71675f(i14, heightAlignment) * heightAlignment);
        int i15 = point.x;
        int i16 = point.y;
        return (d3 == -1.0d || d3 < 1.0d) ? videoCapabilities.isSizeSupported(i15, i16) : videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d3));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: g */
    public static C17504l m49693g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z13) {
        boolean z14;
        int i13;
        if (codecCapabilities == null || (i13 = AbstractC24567y.f95875a) < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = false;
        } else {
            if (i13 <= 22) {
                String str4 = AbstractC24567y.f95878d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        if (codecCapabilities != null && AbstractC24567y.f95875a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new C17504l(str, str2, str3, codecCapabilities, z4, z14, z13 || (codecCapabilities != null && AbstractC24567y.f95875a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    /* JADX INFO: renamed from: b */
    public final C35074d m49694b(C31521c0 c31521c0, C31521c0 c31521c1) {
        C31521c0 c31521c2;
        C31521c0 c31521c3;
        int i13 = !AbstractC24567y.m71670a(c31521c0.f130077L, c31521c1.f130077L) ? 8 : 0;
        if (this.f67664h) {
            if (c31521c0.f130085T != c31521c1.f130085T) {
                i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if (!this.f67661e && (c31521c0.f130082Q != c31521c1.f130082Q || c31521c0.f130083R != c31521c1.f130083R)) {
                i13 |= 512;
            }
            if (!AbstractC24567y.m71670a(c31521c0.f130089X, c31521c1.f130089X)) {
                i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            if (AbstractC24567y.f95878d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f67657a) && !c31521c0.m97114b(c31521c1)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new C35074d(this.f67657a, c31521c0, c31521c1, c31521c0.m97114b(c31521c1) ? 3 : 2, 0);
            }
            c31521c2 = c31521c0;
            c31521c3 = c31521c1;
        } else {
            c31521c2 = c31521c0;
            c31521c3 = c31521c1;
            if (c31521c2.f130090Y != c31521c3.f130090Y) {
                i13 |= 4096;
            }
            if (c31521c2.f130091Z != c31521c3.f130091Z) {
                i13 |= DfuBaseService.ERROR_REMOTE_MASK;
            }
            if (c31521c2.f130092a0 != c31521c3.f130092a0) {
                i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
            }
            String str = this.f67658b;
            if (i13 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairM49753d = AbstractC17513u.m49753d(c31521c2);
                Pair pairM49753d2 = AbstractC17513u.m49753d(c31521c3);
                if (pairM49753d != null && pairM49753d2 != null) {
                    int iIntValue = ((Integer) pairM49753d.first).intValue();
                    int iIntValue2 = ((Integer) pairM49753d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C35074d(this.f67657a, c31521c2, c31521c3, 3, 0);
                    }
                }
            }
            if (!c31521c2.m97114b(c31521c3)) {
                i13 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new C35074d(this.f67657a, c31521c2, c31521c3, 1, 0);
            }
        }
        return new C35074d(this.f67657a, c31521c2, c31521c3, 0, i13);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX INFO: renamed from: c */
    public final boolean m49695c(C31521c0 c31521c0) {
        Pair pairM49753d;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i13;
        String str = c31521c0.f130077L;
        int i14 = c31521c0.f130083R;
        int i15 = c31521c0.f130082Q;
        String str2 = c31521c0.f130074I;
        String str3 = this.f67658b;
        if (!str3.equals(str) && !str3.equals(AbstractC17513u.m49751b(c31521c0))) {
            return false;
        }
        boolean z13 = this.f67664h;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f67660d;
        if (str2 == null || (pairM49753d = AbstractC17513u.m49753d(c31521c0)) == null) {
            z4 = false;
        } else {
            int iIntValue = ((Integer) pairM49753d.first).intValue();
            int iIntValue2 = ((Integer) pairM49753d.second).intValue();
            int i16 = 2;
            if ("video/dolby-vision".equals(c31521c0.f130077L)) {
                if ("video/avc".equals(str3)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str3)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (z13 || iIntValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                z4 = false;
                if (AbstractC24567y.f95875a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    } else if (iIntValue3 >= 120000000) {
                        i16 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i16 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i16 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i16 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i16 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i16 = 16;
                    } else if (iIntValue3 >= 3600000) {
                        i16 = 8;
                    } else if (iIntValue3 >= 1800000) {
                        i16 = 4;
                    } else if (iIntValue3 < 800000) {
                        i16 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i16;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = codecProfileLevelArr.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        int length2 = str2.length() + 22;
                        String str4 = this.f67659c;
                        StringBuilder sb4 = new StringBuilder(str4.length() + length2);
                        sb4.append("codec.profileLevel, ");
                        sb4.append(str2);
                        sb4.append(", ");
                        sb4.append(str4);
                        m49698f(sb4.toString());
                        return false;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i17];
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        break;
                    }
                    i17++;
                }
            } else {
                z4 = false;
            }
        }
        if (!z13) {
            int i18 = AbstractC24567y.f95875a;
            if (i18 >= 21) {
                int i19 = c31521c0.f130091Z;
                if (i19 != -1) {
                    if (codecCapabilities == null) {
                        m49698f("sampleRate.caps");
                        return z4;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m49698f("sampleRate.aCaps");
                        return z4;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i19)) {
                        StringBuilder sb5 = new StringBuilder(31);
                        sb5.append("sampleRate.support, ");
                        sb5.append(i19);
                        m49698f(sb5.toString());
                        return z4;
                    }
                }
                int i24 = c31521c0.f130090Y;
                if (i24 != -1) {
                    if (codecCapabilities == null) {
                        m49698f("channelCount.caps");
                        return z4;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m49698f("channelCount.aCaps");
                        return z4;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i18 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                        if ("audio/ac3".equals(str3)) {
                            i13 = 6;
                        } else {
                            i13 = "audio/eac3".equals(str3) ? 16 : 30;
                        }
                        String str5 = this.f67657a;
                        StringBuilder sb6 = new StringBuilder(AbstractC30007c.m91832b(59, str5));
                        sb6.append("AssumedMaxChannelAdjustment: ");
                        sb6.append(str5);
                        sb6.append(", [");
                        sb6.append(maxInputChannelCount);
                        sb6.append(" to ");
                        sb6.append(i13);
                        sb6.append("]");
                        Log.w("MediaCodecInfo", sb6.toString());
                        maxInputChannelCount = i13;
                    }
                    if (maxInputChannelCount < i24) {
                        StringBuilder sb7 = new StringBuilder(33);
                        sb7.append("channelCount.support, ");
                        sb7.append(i24);
                        m49698f(sb7.toString());
                        return z4;
                    }
                }
            }
        } else if (i15 > 0 && i14 > 0) {
            if (AbstractC24567y.f95875a >= 21) {
                return m49697e(i15, i14, c31521c0.f130084S);
            }
            boolean z14 = i15 * i14 <= AbstractC17513u.m49758i() ? true : z4;
            if (!z14) {
                StringBuilder sb8 = new StringBuilder(40);
                sb8.append("legacyFrameSize, ");
                sb8.append(i15);
                sb8.append("x");
                sb8.append(i14);
                m49698f(sb8.toString());
            }
            return z14;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m49696d(C31521c0 c31521c0) {
        if (this.f67664h) {
            return this.f67661e;
        }
        Pair pairM49753d = AbstractC17513u.m49753d(c31521c0);
        return pairM49753d != null && ((Integer) pairM49753d.first).intValue() == 42;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m49697e(int i13, int i14, double d3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f67660d;
        if (codecCapabilities == null) {
            m49698f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m49698f("sizeAndRate.vCaps");
            return false;
        }
        if (m49692a(videoCapabilities, i13, i14, d3)) {
            return true;
        }
        if (i13 < i14) {
            String str = this.f67657a;
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC24567y.f95876b)) && m49692a(videoCapabilities, i14, i13, d3)) {
                StringBuilder sb4 = new StringBuilder(69);
                sb4.append("sizeAndRate.rotated, ");
                sb4.append(i13);
                sb4.append("x");
                sb4.append(i14);
                sb4.append("x");
                sb4.append(d3);
                String string = sb4.toString();
                String str2 = AbstractC24567y.f95879e;
                int iM91832b = AbstractC30007c.m91832b(AbstractC30007c.m91832b(25, string), str);
                String str3 = this.f67658b;
                StringBuilder sb5 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(iM91832b, str3), str2));
                sb5.append("AssumedSupport [");
                sb5.append(string);
                sb5.append("] [");
                sb5.append(str);
                AbstractC11266d.m30444B(sb5, ", ", str3, "] [", str2);
                sb5.append("]");
                Log.d("MediaCodecInfo", sb5.toString());
                return true;
            }
        }
        StringBuilder sb6 = new StringBuilder(69);
        sb6.append("sizeAndRate.support, ");
        sb6.append(i13);
        sb6.append("x");
        sb6.append(i14);
        sb6.append("x");
        sb6.append(d3);
        m49698f(sb6.toString());
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m49698f(String str) {
        String str2 = AbstractC24567y.f95879e;
        int iM91832b = AbstractC30007c.m91832b(20, str);
        String str3 = this.f67657a;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str3);
        String str4 = this.f67658b;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(iM91832b2, str4), str2));
        sb4.append("NoSupport [");
        sb4.append(str);
        sb4.append("] [");
        sb4.append(str3);
        AbstractC11266d.m30444B(sb4, ", ", str4, "] [", str2);
        sb4.append("]");
        Log.d("MediaCodecInfo", sb4.toString());
    }

    public final String toString() {
        return this.f67657a;
    }
}
