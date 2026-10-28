package j33;

import androidx.room.AbstractC1772c1;
import b23.C2343i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.RtpParameters;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Codec;
import stream.video.sfu.models.PublishOption;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.VideoDimension;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j33.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21300d {

    /* JADX INFO: renamed from: a */
    public static final Object f81385a;

    static {
        AbstractC1772c1.m5382S(C2343i.f9269a, "VideoLayers");
        f81385a = AbstractC25247g0.m73990Y(new C23465k("q", 300000), new C23465k(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, 750000), new C23465k("f", 1250000));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m59804a(VideoDimension videoDimension, PublishOption publishOption) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i13;
        int i14;
        String str;
        int i15;
        ArrayList arrayList3 = new ArrayList();
        int width = videoDimension.getWidth();
        int height = videoDimension.getHeight();
        int bitrate = publishOption.getBitrate();
        Codec codec = publishOption.getCodec();
        boolean zM59806c = m59806c(codec != null ? codec.getName() : null);
        int fps = publishOption.getFps();
        int iMax = Math.max(publishOption.getMax_spatial_layers(), 1);
        int max_temporal_layers = publishOption.getMax_temporal_layers();
        VideoDimension video_dimension = publishOption.getVideo_dimension();
        if (video_dimension == null) {
            video_dimension = videoDimension;
        }
        int height2 = video_dimension.getHeight();
        int width2 = video_dimension.getWidth();
        if (height < height2 || width < width2) {
            bitrate = (int) (((double) bitrate) * (((double) (height * width)) / ((double) (height2 * width2))));
        }
        double d3 = 1.0d;
        double d14 = 1.0d;
        for (String str2 : AbstractC25265s.m74156w1(AbstractC37056f.m118959K("f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "q"), iMax)) {
            int i16 = max_temporal_layers;
            int i17 = (int) (((double) width) / d3);
            int i18 = (int) (((double) height) / d3);
            int i19 = width;
            int i24 = height;
            int iIntValue = (int) (((double) bitrate) / d14);
            if (iIntValue <= 0) {
                Integer num = (Integer) f81385a.get(str2);
                iIntValue = num != null ? num.intValue() : 1250000;
            }
            C21299c c21299c = new C21299c(true, str2, i17, i18, iIntValue, Integer.valueOf(fps), null, null, false);
            if (zM59806c) {
                i15 = i16;
                c21299c.f81382g = AbstractC25012a.m73372e(iMax, i15, "L", "T", iMax > 1 ? "_KEY" : "");
            } else {
                i15 = i16;
                c21299c.f81383h = Double.valueOf(d3);
            }
            int i25 = i15;
            double d15 = 2;
            d3 *= d15;
            d14 *= d15;
            arrayList3.add(0, c21299c);
            width = i19;
            bitrate = bitrate;
            max_temporal_layers = i25;
            height = i24;
        }
        int iMax2 = Math.max(videoDimension.getWidth(), videoDimension.getHeight());
        if (iMax2 > 320) {
            if (iMax2 <= 640) {
                arrayList = new ArrayList();
                for (Object obj : arrayList3) {
                    if (!AbstractC22676k.m65745e(((C21299c) obj).f81377b, "q")) {
                        arrayList.add(obj);
                    }
                }
            }
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            i13 = 0;
            for (Object obj2 : arrayList3) {
                i14 = i13 + 1;
                if (i13 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C21299c c21299c2 = (C21299c) obj2;
                if (i13 != 0) {
                    str = "q";
                } else if (i13 != 1) {
                    str = "f";
                } else {
                    str = StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT;
                }
                arrayList2.add(C21299c.m59803a(c21299c2, str, 509));
                i13 = i14;
            }
            return arrayList2;
        }
        arrayList = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (AbstractC22676k.m65745e(((C21299c) obj3).f81377b, "f")) {
                arrayList.add(obj3);
            }
        }
        arrayList3 = arrayList;
        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        i13 = 0;
        while (r0.hasNext()) {
            i14 = i13 + 1;
            if (i13 >= 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C21299c c21299c3 = (C21299c) obj2;
            if (i13 != 0) {
                str = "q";
            } else if (i13 != 1) {
                str = "f";
            } else {
                str = StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT;
            }
            arrayList2.add(C21299c.m59803a(c21299c3, str, 509));
            i13 = i14;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m59805b(TrackType trackType) {
        AbstractC22676k.m65750j(trackType, "trackType");
        return trackType == TrackType.TRACK_TYPE_AUDIO || trackType == TrackType.TRACK_TYPE_SCREEN_SHARE_AUDIO;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m59806c(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase.equals("vp9") || lowerCase.equals("av1") || lowerCase.equals("video/vp9") || lowerCase.equals("video/av1");
    }

    /* JADX INFO: renamed from: d */
    public static final String m59807d(RtpParameters.Encoding encoding) {
        AbstractC22676k.m65750j(encoding, "<this>");
        String str = encoding.rid;
        boolean z4 = encoding.active;
        Double d3 = encoding.scaleResolutionDownBy;
        Integer num = encoding.maxBitrateBps;
        Integer num2 = encoding.maxFramerate;
        String str2 = encoding.scalabilityMode;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("Encoding(rid=", str, ", active=", ", scaleResolutionDownBy=", z4);
        sbM73379l.append(d3);
        sbM73379l.append(", maxBitrateBps=");
        sbM73379l.append(num);
        sbM73379l.append(", maxFramerate=");
        sbM73379l.append(num2);
        sbM73379l.append(", scalabilityMode=");
        sbM73379l.append(str2);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    /* JADX INFO: renamed from: e */
    public static final VideoDimension m59808e(CameraEnumerationAndroid.CaptureFormat captureFormat) {
        AbstractC22676k.m65750j(captureFormat, "<this>");
        return new VideoDimension(captureFormat.width, captureFormat.height, null, 4, null);
    }
}
