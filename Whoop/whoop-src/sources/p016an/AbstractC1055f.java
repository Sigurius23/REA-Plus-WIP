package p016an;

import com.google.android.exoplayer2.ParserException;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p309lo.AbstractC24543a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: an.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1055f {

    /* JADX INFO: renamed from: a */
    public static final String[] f4102a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f4103b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f4104c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static C1052c m3115a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC24543a.m71587w(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m15562a(null, "Couldn't find xmp metadata");
        }
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0M3116b = C41060w0.f177067E;
        long j7 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC24543a.m71587w(xmlPullParserNewPullParser, "rdf:Description")) {
                int i13 = 0;
                for (int i14 = 0; i14 < 4; i14++) {
                    String strM71582r = AbstractC24543a.m71582r(xmlPullParserNewPullParser, f4102a[i14]);
                    if (strM71582r != null) {
                        if (Integer.parseInt(strM71582r) != 1) {
                            break loop0;
                        }
                        int i15 = 0;
                        while (true) {
                            if (i15 < 4) {
                                String strM71582r2 = AbstractC24543a.m71582r(xmlPullParserNewPullParser, f4103b[i15]);
                                if (strM71582r2 != null) {
                                    j7 = Long.parseLong(strM71582r2);
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
                                c41060w0M3116b = C41060w0.f177067E;
                                break;
                            }
                            String strM71582r3 = AbstractC24543a.m71582r(xmlPullParserNewPullParser, f4104c[i13]);
                            if (strM71582r3 != null) {
                                c41060w0M3116b = AbstractC41023g0.m133257t(new C1051b("image/jpeg", 0L, 0L), new C1051b(MimeType.MIME_TYPE_VIDEO_MP4, Long.parseLong(strM71582r3), 0L));
                                break;
                            }
                            i13++;
                        }
                    }
                }
                return null;
            }
            if (AbstractC24543a.m71587w(xmlPullParserNewPullParser, "Container:Directory")) {
                c41060w0M3116b = m3116b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC24543a.m71587w(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c41060w0M3116b = m3116b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC24543a.m71586v(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c41060w0M3116b.isEmpty()) {
            break loop0;
        }
        return new C1052c(j7, c41060w0M3116b);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C41060w0 m3116b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC24543a.m71587w(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM71582r = AbstractC24543a.m71582r(xmlPullParser, strConcat3);
                String strM71582r2 = AbstractC24543a.m71582r(xmlPullParser, strConcat4);
                String strM71582r3 = AbstractC24543a.m71582r(xmlPullParser, strConcat5);
                String strM71582r4 = AbstractC24543a.m71582r(xmlPullParser, strConcat6);
                if (strM71582r == null || strM71582r2 == null) {
                    return C41060w0.f177067E;
                }
                c41014d0M133251l.m133222a(new C1051b(strM71582r, strM71582r3 != null ? Long.parseLong(strM71582r3) : 0L, strM71582r4 != null ? Long.parseLong(strM71582r4) : 0L));
            }
        } while (!AbstractC24543a.m71586v(xmlPullParser, strConcat2));
        return c41014d0M133251l.m133239f();
    }
}
