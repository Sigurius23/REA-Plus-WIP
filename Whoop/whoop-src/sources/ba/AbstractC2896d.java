package ba;

import androidx.media3.common.ParserException;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p016an.C1052c;
import p607x8.AbstractC38046a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: ba.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2896d {

    /* JADX INFO: renamed from: a */
    public static final String[] f11596a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f11597b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f11598c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static C1052c m8457a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC38046a.m121820o(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m5049a(null, "Couldn't find xmp metadata");
        }
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0M8458b = C41060w0.f177067E;
        long j7 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParserNewPullParser, "rdf:Description")) {
                int i13 = 0;
                for (int i14 = 0; i14 < 4; i14++) {
                    String strM121815j = AbstractC38046a.m121815j(xmlPullParserNewPullParser, f11596a[i14]);
                    if (strM121815j != null) {
                        if (Integer.parseInt(strM121815j) != 1) {
                            break loop0;
                        }
                        int i15 = 0;
                        while (true) {
                            if (i15 < 4) {
                                String strM121815j2 = AbstractC38046a.m121815j(xmlPullParserNewPullParser, f11597b[i15]);
                                if (strM121815j2 != null) {
                                    j7 = Long.parseLong(strM121815j2);
                                    if (j7 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i15++;
                            }
                            j7 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i13 >= 2) {
                                C41017e0 c41017e1 = AbstractC41023g0.f176998x;
                                c41060w0M8458b = C41060w0.f177067E;
                                break;
                            }
                            String strM121815j3 = AbstractC38046a.m121815j(xmlPullParserNewPullParser, f11598c[i13]);
                            if (strM121815j3 != null) {
                                c41060w0M8458b = AbstractC41023g0.m133257t(new C2894b("image/jpeg", 0L, 0L), new C2894b(MimeType.MIME_TYPE_VIDEO_MP4, Long.parseLong(strM121815j3), 0L));
                                break;
                            }
                            i13++;
                        }
                    }
                }
                return null;
            }
            if (AbstractC38046a.m121820o(xmlPullParserNewPullParser, "Container:Directory")) {
                c41060w0M8458b = m8458b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC38046a.m121820o(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c41060w0M8458b = m8458b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC38046a.m121819n(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c41060w0M8458b.isEmpty()) {
            break loop0;
        }
        return new C1052c(j7, c41060w0M8458b);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C41060w0 m8458b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC38046a.m121820o(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM121815j = AbstractC38046a.m121815j(xmlPullParser, strConcat3);
                String strM121815j2 = AbstractC38046a.m121815j(xmlPullParser, strConcat4);
                String strM121815j3 = AbstractC38046a.m121815j(xmlPullParser, strConcat5);
                String strM121815j4 = AbstractC38046a.m121815j(xmlPullParser, strConcat6);
                if (strM121815j == null || strM121815j2 == null) {
                    return C41060w0.f177067E;
                }
                c41014d0M133251l.m133222a(new C2894b(strM121815j, strM121815j3 != null ? Long.parseLong(strM121815j3) : 0L, strM121815j4 != null ? Long.parseLong(strM121815j4) : 0L));
            }
        } while (!AbstractC38046a.m121819n(xmlPullParser, strConcat2));
        return c41014d0M133251l.m133239f();
    }
}
