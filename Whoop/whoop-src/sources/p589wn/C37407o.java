package p589wn;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.whoop.service.network.model.UserSessionDto;
import in.C18715c;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTimeConstants;
import p094dn.AbstractC12191k;
import p284ko.InterfaceC22613d0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31532g;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p556vm.C36135b;
import p556vm.C36136c;
import p658yr.AbstractC39717d;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import q30.C29938w0;
import q63.AbstractC30007c;
import vn.C36188s;
import vn.C36189t;

/* JADX INFO: renamed from: wn.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C37407o implements InterfaceC22613d0 {

    /* JADX INFO: renamed from: w */
    public final C37405m f160122w;

    /* JADX INFO: renamed from: x */
    public final C37402j f160123x;

    /* JADX INFO: renamed from: y */
    public static final Pattern f160118y = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: z */
    public static final Pattern f160120z = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: E */
    public static final Pattern f160072E = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: F */
    public static final Pattern f160073F = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: G */
    public static final Pattern f160074G = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: H */
    public static final Pattern f160075H = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: I */
    public static final Pattern f160076I = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: J */
    public static final Pattern f160077J = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: K */
    public static final Pattern f160078K = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: L */
    public static final Pattern f160079L = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: M */
    public static final Pattern f160080M = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: N */
    public static final Pattern f160081N = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: O */
    public static final Pattern f160082O = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: P */
    public static final Pattern f160083P = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f160084Q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: R */
    public static final Pattern f160085R = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: S */
    public static final Pattern f160086S = m119757a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: T */
    public static final Pattern f160087T = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: U */
    public static final Pattern f160088U = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: V */
    public static final Pattern f160089V = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: W */
    public static final Pattern f160090W = m119757a("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: X */
    public static final Pattern f160091X = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f160092Y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f160093Z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f160094a0 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: b0 */
    public static final Pattern f160095b0 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: c0 */
    public static final Pattern f160096c0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: d0 */
    public static final Pattern f160097d0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: e0 */
    public static final Pattern f160098e0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: f0 */
    public static final Pattern f160099f0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: g0 */
    public static final Pattern f160100g0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: h0 */
    public static final Pattern f160101h0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: i0 */
    public static final Pattern f160102i0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: j0 */
    public static final Pattern f160103j0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: k0 */
    public static final Pattern f160104k0 = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: l0 */
    public static final Pattern f160105l0 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: m0 */
    public static final Pattern f160106m0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: n0 */
    public static final Pattern f160107n0 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: o0 */
    public static final Pattern f160108o0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: p0 */
    public static final Pattern f160109p0 = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: q0 */
    public static final Pattern f160110q0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: r0 */
    public static final Pattern f160111r0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: s0 */
    public static final Pattern f160112s0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t0 */
    public static final Pattern f160113t0 = m119757a("AUTOSELECT");

    /* JADX INFO: renamed from: u0 */
    public static final Pattern f160114u0 = m119757a("DEFAULT");

    /* JADX INFO: renamed from: v0 */
    public static final Pattern f160115v0 = m119757a("FORCED");

    /* JADX INFO: renamed from: w0 */
    public static final Pattern f160116w0 = m119757a("INDEPENDENT");

    /* JADX INFO: renamed from: x0 */
    public static final Pattern f160117x0 = m119757a("GAP");

    /* JADX INFO: renamed from: y0 */
    public static final Pattern f160119y0 = m119757a("PRECISE");

    /* JADX INFO: renamed from: z0 */
    public static final Pattern f160121z0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: A0 */
    public static final Pattern f160070A0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: B0 */
    public static final Pattern f160071B0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C37407o(C37405m c37405m, C37402j c37402j) {
        this.f160122w = c37405m;
        this.f160123x = c37402j;
    }

    /* JADX INFO: renamed from: a */
    public static Pattern m119757a(String str) {
        StringBuilder sb4 = new StringBuilder(str.length() + 9);
        sb4.append(str);
        sb4.append("=(NO|YES)");
        return Pattern.compile(sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public static C36136c m119758b(String str, C36135b[] c36135bArr) {
        C36135b[] c36135bArr2 = new C36135b[c36135bArr.length];
        for (int i13 = 0; i13 < c36135bArr.length; i13++) {
            C36135b c36135b = c36135bArr[i13];
            c36135bArr2[i13] = new C36135b(c36135b.f154636x, c36135b.f154637y, c36135b.f154638z, null);
        }
        return new C36136c(str, true, c36135bArr2);
    }

    /* JADX INFO: renamed from: d */
    public static C36135b m119759d(String str, String str2, HashMap map) throws ParserException {
        String strM119765j = m119765j(str, f160103j0, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f160104k0;
        if (zEquals) {
            String strM119766k = m119766k(str, pattern, map);
            return new C36135b(AbstractC31532g.f130147b, null, MimeType.MIME_TYPE_VIDEO_MP4, Base64.decode(strM119766k.substring(strM119766k.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC31532g.f130147b;
            int i13 = AbstractC24567y.f95875a;
            return new C36135b(uuid, null, "hls", str.getBytes(AbstractC39717d.f170958c));
        }
        if (!"com.microsoft.playready".equals(str2) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strM119765j)) {
            return null;
        }
        String strM119766k2 = m119766k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM119766k2.substring(strM119766k2.indexOf(44)), 0);
        UUID uuid2 = AbstractC31532g.f130148c;
        return new C36135b(uuid2, null, MimeType.MIME_TYPE_VIDEO_MP4, AbstractC12191k.m33807a(uuid2, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:305:0x0887  */
    /* JADX WARN: Code duplicated, block: B:307:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:310:0x08be  */
    /* JADX WARN: Code duplicated, block: B:311:0x08c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static C37402j m119760e(C37405m c37405m, C37402j c37402j, C29938w0 c29938w0, String str) throws IOException {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i13;
        long j7;
        C36136c c36136c;
        C37399g c37399g;
        C36136c c36136c2;
        String str3;
        C36136c c36136cM119758b;
        C37399g c37399g2;
        long j13;
        long j14;
        C36136c c36136c3;
        int i14;
        int i15;
        C37405m c37405m2 = c37405m;
        c37402j = c37402j;
        boolean z4 = c37405m2.f160069c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C37401i c37401i = new C37401i(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z13 = z4;
        String strM119765j = "";
        long j15 = -9223372036854775807L;
        long j16 = 0;
        long jM71695z = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long jLongValue = 0;
        long j24 = 0;
        long j25 = -1;
        boolean zM119762g = false;
        C37397e c37397e = null;
        int i16 = 0;
        C36136c c36136c4 = null;
        C37399g c37399g3 = null;
        C36136c c36136c5 = null;
        int i17 = 0;
        String strM119766k = null;
        String strM119765j2 = null;
        boolean z14 = false;
        int i18 = 0;
        boolean z15 = false;
        int i19 = 0;
        String str4 = null;
        boolean z16 = false;
        boolean z17 = false;
        long j26 = -9223372036854775807L;
        long j27 = -9223372036854775807L;
        long j28 = 0;
        int i24 = 1;
        while (c29938w0.m91573w()) {
            String strM91576z = c29938w0.m91576z();
            if (strM91576z.startsWith("#EXT")) {
                arrayList6.add(strM91576z);
            }
            zM119762g = zM119762g;
            if (strM91576z.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM119766k2 = m119766k(strM91576z, f160084Q, map);
                if ("VOD".equals(strM119766k2)) {
                    i16 = 1;
                } else if ("EVENT".equals(strM119766k2)) {
                    i16 = 2;
                }
            } else if (strM91576z.equals("#EXT-X-I-FRAMES-ONLY")) {
                zM119762g = zM119762g;
                z16 = true;
            } else {
                if (strM91576z.startsWith("#EXT-X-START")) {
                    double d3 = Double.parseDouble(m119766k(strM91576z, f160096c0, Collections.EMPTY_MAP));
                    c37401i = c37401i;
                    zM119762g = m119762g(strM91576z, f160119y0);
                    j15 = (long) (d3 * 1000000.0d);
                    arrayList6 = arrayList6;
                } else {
                    ArrayList arrayList7 = arrayList6;
                    c37401i = c37401i;
                    if (strM91576z.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dM119763h = m119763h(strM91576z, f160085R);
                        long j29 = dM119763h == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM119763h * 1000000.0d);
                        boolean zM119762g2 = m119762g(strM91576z, f160086S);
                        double dM119763h2 = m119763h(strM91576z, f160088U);
                        long j34 = dM119763h2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM119763h2 * 1000000.0d);
                        double dM119763h3 = m119763h(strM91576z, f160089V);
                        c37401i = new C37401i(j29, zM119762g2, j34, dM119763h3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM119763h3 * 1000000.0d), m119762g(strM91576z, f160090W));
                    } else if (strM91576z.startsWith("#EXT-X-PART-INF")) {
                        j27 = (long) (Double.parseDouble(m119766k(strM91576z, f160082O, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strM91576z.startsWith("#EXT-X-MAP");
                        Pattern pattern = f160098e0;
                        Pattern pattern2 = f160104k0;
                        if (zStartsWith) {
                            String strM119766k3 = m119766k(strM91576z, pattern2, map);
                            String strM119765j3 = m119765j(strM91576z, pattern, null, map);
                            if (strM119765j3 != null) {
                                int i25 = AbstractC24567y.f95875a;
                                String[] strArrSplit = strM119765j3.split("@", -1);
                                j25 = Long.parseLong(strArrSplit[i18]);
                                if (strArrSplit.length > 1) {
                                    j18 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            long j35 = j25;
                            if (j35 == -1) {
                                j18 = 0;
                            }
                            if (strM119766k != null && strM119765j2 == null) {
                                throw ParserException.m15563b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            String str5 = strM119766k;
                            C37399g c37399g4 = new C37399g(strM119766k3, j18, j35, str5, strM119765j2);
                            strM119766k = str5;
                            String str6 = strM119765j2;
                            if (j35 != -1) {
                                j18 += j35;
                            }
                            arrayList6 = arrayList7;
                            c37399g3 = c37399g4;
                            j25 = -1;
                            zM119762g = zM119762g;
                            c37401i = c37401i;
                            strM119765j2 = str6;
                        } else {
                            arrayList6 = arrayList7;
                            strM119765j2 = strM119765j2;
                            ArrayList arrayList8 = arrayList4;
                            ArrayList arrayList9 = arrayList5;
                            if (strM91576z.startsWith("#EXT-X-TARGETDURATION")) {
                                j26 = ((long) Integer.parseInt(m119766k(strM91576z, f160080M, Collections.EMPTY_MAP))) * 1000000;
                            } else if (strM91576z.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j17 = Long.parseLong(m119766k(strM91576z, f160091X, Collections.EMPTY_MAP));
                                j28 = j17;
                            } else if (strM91576z.startsWith("#EXT-X-VERSION")) {
                                i24 = Integer.parseInt(m119766k(strM91576z, f160083P, Collections.EMPTY_MAP));
                            } else {
                                if (strM91576z.startsWith("#EXT-X-DEFINE")) {
                                    String strM119765j4 = m119765j(strM91576z, f160070A0, null, map);
                                    if (strM119765j4 != null) {
                                        String str7 = (String) c37405m2.f160065l.get(strM119765j4);
                                        if (str7 != null) {
                                            map.put(strM119765j4, str7);
                                        }
                                    } else {
                                        map.put(m119766k(strM91576z, f160109p0, map), m119766k(strM91576z, f160121z0, map));
                                    }
                                    str2 = str4;
                                } else if (strM91576z.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(m119766k(strM91576z, f160092Y, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    strM119765j = m119765j(strM91576z, f160093Z, "", map);
                                } else if (strM91576z.startsWith("#EXT-X-SKIP")) {
                                    int i26 = Integer.parseInt(m119766k(strM91576z, f160087T, Collections.EMPTY_MAP));
                                    AbstractC24543a.m71573i((c37402j == null || !arrayList3.isEmpty()) ? i18 : 1);
                                    int i27 = AbstractC24567y.f95875a;
                                    long j36 = c37402j.f160035k;
                                    AbstractC41023g0 abstractC41023g0 = c37402j.f160042r;
                                    int i28 = (int) (j28 - j36);
                                    int i29 = i26 + i28;
                                    if (i28 < 0 || i29 > abstractC41023g0.size()) {
                                        throw new IOException() { // from class: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                        };
                                    }
                                    long j37 = j19;
                                    strM119765j2 = strM119765j2;
                                    while (i28 < i29) {
                                        C37399g c37399g5 = (C37399g) abstractC41023g0.get(i28);
                                        if (j28 != c37402j.f160035k) {
                                            int i34 = (c37402j.f160034j - i19) + c37399g5.f160022z;
                                            AbstractC41023g0 abstractC41023g1 = c37399g5.f160011M;
                                            ArrayList arrayList10 = new ArrayList();
                                            int i35 = i18;
                                            long j38 = j37;
                                            while (i35 < abstractC41023g1.size()) {
                                                C37397e c37397e2 = (C37397e) abstractC41023g1.get(i35);
                                                arrayList10.add(new C37397e(c37397e2.f160019w, c37397e2.f160020x, c37397e2.f160021y, i34, j38, c37397e2.f160013F, c37397e2.f160014G, c37397e2.f160015H, c37397e2.f160016I, c37397e2.f160017J, c37397e2.f160018K, c37397e2.f160005L, c37397e2.f160006M));
                                                j38 += c37397e2.f160021y;
                                                i35++;
                                                i29 = i29;
                                            }
                                            i15 = i29;
                                            c37399g5 = new C37399g(c37399g5.f160019w, c37399g5.f160020x, c37399g5.f160010L, c37399g5.f160021y, i34, j37, c37399g5.f160013F, c37399g5.f160014G, c37399g5.f160015H, c37399g5.f160016I, c37399g5.f160017J, c37399g5.f160018K, arrayList10);
                                        } else {
                                            i15 = i29;
                                        }
                                        arrayList3.add(c37399g5);
                                        long j39 = c37399g5.f160021y;
                                        String str8 = c37399g5.f160015H;
                                        j37 += j39;
                                        long j44 = c37399g5.f160017J;
                                        if (j44 != -1) {
                                            j18 = c37399g5.f160016I + j44;
                                        }
                                        int i36 = c37399g5.f160022z;
                                        C37399g c37399g6 = c37399g5.f160020x;
                                        C36136c c36136c6 = c37399g5.f160013F;
                                        String str9 = c37399g5.f160014G;
                                        if (str8 == null || !str8.equals(Long.toHexString(j17))) {
                                            strM119765j2 = str8;
                                        }
                                        j17++;
                                        i28++;
                                        i17 = i36;
                                        c37399g3 = c37399g6;
                                        strM119766k = str9;
                                        c36136c4 = c36136c6;
                                        i29 = i15;
                                        j16 = j37;
                                        c37402j = c37402j;
                                    }
                                    c37405m2 = c37405m;
                                    c37402j = c37402j;
                                    zM119762g = zM119762g;
                                    c37401i = c37401i;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList9;
                                    arrayList4 = arrayList8;
                                    j19 = j37;
                                } else if (strM91576z.startsWith("#EXT-X-KEY")) {
                                    String strM119766k4 = m119766k(strM91576z, f160101h0, map);
                                    String strM119765j5 = m119765j(strM91576z, f160102i0, "identity", map);
                                    if ("NONE".equals(strM119766k4)) {
                                        treeMap.clear();
                                        c36136c4 = null;
                                        strM119766k = null;
                                        strM119765j2 = null;
                                    } else {
                                        strM119765j2 = m119765j(strM91576z, f160105l0, null, map);
                                        if (!"identity".equals(strM119765j5)) {
                                            String str10 = str4;
                                            str4 = str10 == null ? ("SAMPLE-AES-CENC".equals(strM119766k4) || "SAMPLE-AES-CTR".equals(strM119766k4)) ? "cenc" : "cbcs" : str10;
                                            C36135b c36135bM119759d = m119759d(strM91576z, strM119765j5, map);
                                            if (c36135bM119759d != null) {
                                                treeMap.put(strM119765j5, c36135bM119759d);
                                                c36136c4 = null;
                                            }
                                            strM119766k = null;
                                        } else if ("AES-128".equals(strM119766k4)) {
                                            strM119766k = m119766k(strM91576z, pattern2, map);
                                            strM119765j2 = strM119765j2;
                                        }
                                        strM119766k = null;
                                    }
                                    c37405m2 = c37405m;
                                    c37402j = c37402j;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList9;
                                    arrayList4 = arrayList8;
                                } else {
                                    str2 = str4;
                                    if (strM91576z.startsWith("#EXT-X-BYTERANGE")) {
                                        String strM119766k5 = m119766k(strM91576z, f160097d0, map);
                                        int i37 = AbstractC24567y.f95875a;
                                        String[] strArrSplit2 = strM119766k5.split("@", -1);
                                        j25 = Long.parseLong(strArrSplit2[i18]);
                                        if (strArrSplit2.length > 1) {
                                            j18 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strM91576z.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i19 = Integer.parseInt(strM91576z.substring(strM91576z.indexOf(58) + 1));
                                        c37405m2 = c37405m;
                                        c37402j = c37402j;
                                        str4 = str2;
                                        zM119762g = zM119762g;
                                        c37401i = c37401i;
                                        strM119765j2 = strM119765j2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z15 = true;
                                    } else if (strM91576z.equals("#EXT-X-DISCONTINUITY")) {
                                        i17++;
                                    } else if (strM91576z.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (jM71695z == 0) {
                                            String strSubstring = strM91576z.substring(strM91576z.indexOf(58) + 1);
                                            Matcher matcher = AbstractC24567y.f95881g.matcher(strSubstring);
                                            if (!matcher.matches()) {
                                                String strValueOf = String.valueOf(strSubstring);
                                                throw ParserException.m15562a(null, strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "));
                                            }
                                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                                i14 = i18;
                                            } else {
                                                i14 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                if ("-".equals(matcher.group(11))) {
                                                    i14 *= -1;
                                                }
                                            }
                                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                            gregorianCalendar.clear();
                                            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                                String strValueOf2 = String.valueOf(matcher.group(8));
                                                gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
                                            }
                                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                                            if (i14 != 0) {
                                                timeInMillis -= (long) (i14 * DateTimeConstants.MILLIS_PER_MINUTE);
                                            }
                                            jM71695z = AbstractC24567y.m71695z(timeInMillis) - j19;
                                        }
                                    } else if (strM91576z.equals("#EXT-X-GAP")) {
                                        c37405m2 = c37405m;
                                        c37402j = c37402j;
                                        str4 = str2;
                                        zM119762g = zM119762g;
                                        c37401i = c37401i;
                                        strM119765j2 = strM119765j2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z17 = true;
                                    } else if (strM91576z.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        c37405m2 = c37405m;
                                        c37402j = c37402j;
                                        str4 = str2;
                                        zM119762g = zM119762g;
                                        c37401i = c37401i;
                                        strM119765j2 = strM119765j2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z13 = true;
                                    } else if (strM91576z.equals("#EXT-X-ENDLIST")) {
                                        c37405m2 = c37405m;
                                        c37402j = c37402j;
                                        str4 = str2;
                                        zM119762g = zM119762g;
                                        c37401i = c37401i;
                                        strM119765j2 = strM119765j2;
                                        arrayList6 = arrayList6;
                                        arrayList5 = arrayList9;
                                        arrayList4 = arrayList8;
                                        z14 = true;
                                    } else {
                                        if (strM91576z.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jM119764i = m119764i(strM91576z, f160094a0);
                                            Matcher matcher2 = f160095b0.matcher(strM91576z);
                                            if (matcher2.find()) {
                                                String strGroup = matcher2.group(1);
                                                strGroup.getClass();
                                                i13 = Integer.parseInt(strGroup);
                                            } else {
                                                i13 = -1;
                                            }
                                            C37398f c37398f = new C37398f(Uri.parse(AbstractC24543a.m71560B(str, m119766k(strM91576z, pattern2, map))), jM119764i, i13);
                                            arrayList = arrayList9;
                                            arrayList.add(c37398f);
                                        } else {
                                            arrayList = arrayList9;
                                            if (!strM91576z.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                C36136c c36136cM119758b2 = c36136c5;
                                                C37399g c37399g7 = c37399g3;
                                                if (strM91576z.startsWith("#EXT-X-PART")) {
                                                    String hexString = strM119766k == null ? null : strM119765j2 != null ? strM119765j2 : Long.toHexString(j17);
                                                    String strM119766k6 = m119766k(strM91576z, pattern2, map);
                                                    long j45 = (long) (Double.parseDouble(m119766k(strM91576z, f160081N, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean zM119762g3 = m119762g(strM91576z, f160116w0) | (z13 && arrayList8.isEmpty());
                                                    boolean zM119762g4 = m119762g(strM91576z, f160117x0);
                                                    String strM119765j6 = m119765j(strM91576z, pattern, null, map);
                                                    if (strM119765j6 != null) {
                                                        int i38 = AbstractC24567y.f95875a;
                                                        String[] strArrSplit3 = strM119765j6.split("@", -1);
                                                        long j46 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j24 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j7 = j46;
                                                    } else {
                                                        j7 = -1;
                                                    }
                                                    long j47 = j7 == -1 ? 0L : j24;
                                                    if (c36136c4 != null || treeMap.isEmpty()) {
                                                        c36136c = c36136c4;
                                                    } else {
                                                        C36135b[] c36135bArr = (C36135b[]) treeMap.values().toArray(new C36135b[0]);
                                                        C36136c c36136c7 = new C36136c(str2, true, c36135bArr);
                                                        if (c36136cM119758b2 == null) {
                                                            c36136cM119758b2 = m119758b(str2, c36135bArr);
                                                        }
                                                        c36136c = c36136c7;
                                                    }
                                                    long j48 = j16;
                                                    arrayList8.add(new C37397e(strM119766k6, c37399g7, j45, i17, j48, c36136c, strM119766k, hexString, j47, j7, zM119762g4, zM119762g3, false));
                                                    j16 = j48 + j45;
                                                    if (j7 != -1) {
                                                        j47 += j7;
                                                    }
                                                    j24 = j47;
                                                    c36136c5 = c36136cM119758b2;
                                                    c37399g3 = c37399g7;
                                                    arrayList4 = arrayList8;
                                                    str4 = str2;
                                                    c36136c4 = c36136c;
                                                    i18 = 0;
                                                } else {
                                                    c37399g3 = c37399g7;
                                                    j16 = j16;
                                                    arrayList2 = arrayList8;
                                                    if (strM91576z.startsWith("#")) {
                                                        c36136c5 = c36136cM119758b2;
                                                        strM119766k = strM119766k;
                                                        j25 = j25;
                                                        z17 = z17;
                                                        strM119765j = strM119765j;
                                                        c37399g3 = c37399g3;
                                                        arrayList4 = arrayList2;
                                                        str4 = str2;
                                                        strM119765j = strM119765j;
                                                        j16 = j16;
                                                        strM119766k = strM119766k;
                                                        j25 = j25;
                                                        z17 = z17;
                                                        i18 = 0;
                                                    } else {
                                                        String hexString2 = strM119766k == null ? null : strM119765j2 != null ? strM119765j2 : Long.toHexString(j17);
                                                        long j49 = j17 + 1;
                                                        String strM119767l = m119767l(strM91576z, map);
                                                        C37399g c37399g8 = (C37399g) map2.get(strM119767l);
                                                        if (j25 == -1) {
                                                            c37399g = c37399g8;
                                                            j18 = 0;
                                                        } else {
                                                            if (z16 && c37399g3 == null && c37399g8 == null) {
                                                                c37399g8 = new C37399g(strM119767l, 0L, j18, null, null);
                                                                map2.put(strM119767l, c37399g8);
                                                            }
                                                            c37399g = c37399g8;
                                                        }
                                                        if (c36136c4 != null || treeMap.isEmpty()) {
                                                            c36136c2 = c36136cM119758b2;
                                                            str3 = strM119767l;
                                                        } else {
                                                            c36136c2 = c36136cM119758b2;
                                                            str3 = strM119767l;
                                                            C36135b[] c36135bArr2 = (C36135b[]) treeMap.values().toArray(new C36135b[0]);
                                                            C36136c c36136c8 = new C36136c(str2, true, c36135bArr2);
                                                            if (c36136c2 == null) {
                                                                c36136cM119758b = m119758b(str2, c36135bArr2);
                                                                c36136c4 = c36136c8;
                                                            } else {
                                                                c36136c4 = c36136c8;
                                                            }
                                                            if (c37399g3 != null) {
                                                                c37399g2 = c37399g3;
                                                            } else {
                                                                c37399g2 = c37399g;
                                                            }
                                                            int i39 = i17;
                                                            String str11 = strM119766k;
                                                            j13 = j25;
                                                            j14 = j18;
                                                            long j54 = j19;
                                                            long j55 = jLongValue;
                                                            C36136c c36136c9 = c36136c4;
                                                            i17 = i39;
                                                            arrayList3.add(new C37399g(str3, c37399g2, strM119765j, j55, i39, j54, c36136c9, str11, hexString2, j14, j13, z17, arrayList2));
                                                            j16 = j54 + j55;
                                                            ArrayList arrayList11 = new ArrayList();
                                                            if (j25 != -1) {
                                                                j18 = j14 + j13;
                                                            } else {
                                                                j18 = j14;
                                                            }
                                                            arrayList5 = arrayList;
                                                            c36136c5 = c36136cM119758b;
                                                            c37399g3 = c37399g3;
                                                            j17 = j49;
                                                            str4 = str2;
                                                            strM119765j = "";
                                                            j19 = j16;
                                                            c36136c4 = c36136c9;
                                                            strM119766k = str11;
                                                            jLongValue = 0;
                                                            j25 = -1;
                                                            c37401i = c37401i;
                                                            strM119765j2 = strM119765j2;
                                                            arrayList6 = arrayList6;
                                                            i18 = 0;
                                                            z17 = false;
                                                            c37405m2 = c37405m;
                                                            c37402j = c37402j;
                                                            arrayList4 = arrayList11;
                                                        }
                                                        c36136cM119758b = c36136c2;
                                                        if (c37399g3 != null) {
                                                            c37399g2 = c37399g3;
                                                        } else {
                                                            c37399g2 = c37399g;
                                                        }
                                                        int i310 = i17;
                                                        String str12 = strM119766k;
                                                        j13 = j25;
                                                        j14 = j18;
                                                        long j56 = j19;
                                                        long j57 = jLongValue;
                                                        C36136c c36136c10 = c36136c4;
                                                        i17 = i310;
                                                        arrayList3.add(new C37399g(str3, c37399g2, strM119765j, j57, i310, j56, c36136c10, str12, hexString2, j14, j13, z17, arrayList2));
                                                        j16 = j56 + j57;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (j25 != -1) {
                                                            j18 = j14 + j13;
                                                        } else {
                                                            j18 = j14;
                                                        }
                                                        arrayList5 = arrayList;
                                                        c36136c5 = c36136cM119758b;
                                                        c37399g3 = c37399g3;
                                                        j17 = j49;
                                                        str4 = str2;
                                                        strM119765j = "";
                                                        j19 = j16;
                                                        c36136c4 = c36136c10;
                                                        strM119766k = str12;
                                                        jLongValue = 0;
                                                        j25 = -1;
                                                        c37401i = c37401i;
                                                        strM119765j2 = strM119765j2;
                                                        arrayList6 = arrayList6;
                                                        i18 = 0;
                                                        z17 = false;
                                                        c37405m2 = c37405m;
                                                        c37402j = c37402j;
                                                        arrayList4 = arrayList12;
                                                    }
                                                }
                                                arrayList5 = arrayList;
                                                c37405m2 = c37405m;
                                            } else if (c37397e == null && "PART".equals(m119766k(strM91576z, f160107n0, map))) {
                                                C36136c c36136cM119758b3 = c36136c5;
                                                C37399g c37399g9 = c37399g3;
                                                String strM119766k7 = m119766k(strM91576z, pattern2, map);
                                                long jM119764i2 = m119764i(strM91576z, f160099f0);
                                                long jM119764i3 = m119764i(strM91576z, f160100g0);
                                                String hexString3 = strM119766k == null ? null : strM119765j2 != null ? strM119765j2 : Long.toHexString(j17);
                                                if (c36136c4 != null || treeMap.isEmpty()) {
                                                    c36136c3 = c36136c4;
                                                } else {
                                                    C36135b[] c36135bArr3 = (C36135b[]) treeMap.values().toArray(new C36135b[i18]);
                                                    C36136c c36136c11 = new C36136c(str2, true, c36135bArr3);
                                                    if (c36136cM119758b3 == null) {
                                                        c36136cM119758b3 = m119758b(str2, c36135bArr3);
                                                    }
                                                    c36136c3 = c36136c11;
                                                }
                                                if (jM119764i2 == -1 || jM119764i3 != -1) {
                                                    long j58 = j16;
                                                    j16 = j58;
                                                    c37397e = new C37397e(strM119766k7, c37399g9, 0L, i17, j58, c36136c3, strM119766k, hexString3, jM119764i2 != -1 ? jM119764i2 : 0L, jM119764i3, false, false, true);
                                                }
                                                arrayList5 = arrayList;
                                                str4 = str2;
                                                c37399g3 = c37399g9;
                                                c36136c4 = c36136c3;
                                                zM119762g = zM119762g;
                                                c37401i = c37401i;
                                                strM119765j2 = strM119765j2;
                                                arrayList6 = arrayList6;
                                                arrayList4 = arrayList8;
                                                i18 = 0;
                                                c37405m2 = c37405m;
                                                c36136c5 = c36136cM119758b3;
                                                c37402j = c37402j;
                                            }
                                        }
                                        c37399g3 = c37399g3;
                                        j16 = j16;
                                        strM119766k = strM119766k;
                                        j25 = j25;
                                        arrayList2 = arrayList8;
                                        c37399g3 = c37399g3;
                                        arrayList4 = arrayList2;
                                        str4 = str2;
                                        strM119765j = strM119765j;
                                        j16 = j16;
                                        strM119766k = strM119766k;
                                        j25 = j25;
                                        z17 = z17;
                                        i18 = 0;
                                        arrayList5 = arrayList;
                                        c37405m2 = c37405m;
                                    }
                                    c37405m2 = c37405m;
                                    c37402j = c37402j;
                                    str4 = str2;
                                }
                                arrayList = arrayList9;
                                arrayList2 = arrayList8;
                                c37399g3 = c37399g3;
                                arrayList4 = arrayList2;
                                str4 = str2;
                                strM119765j = strM119765j;
                                j16 = j16;
                                strM119766k = strM119766k;
                                j25 = j25;
                                z17 = z17;
                                i18 = 0;
                                arrayList5 = arrayList;
                                c37405m2 = c37405m;
                            }
                            strM119765j2 = strM119765j2;
                            arrayList6 = arrayList6;
                            arrayList5 = arrayList9;
                            arrayList4 = arrayList8;
                        }
                    }
                    arrayList6 = arrayList7;
                    zM119762g = zM119762g;
                }
                c37401i = c37401i;
            }
            zM119762g = zM119762g;
        }
        boolean z18 = zM119762g;
        ArrayList arrayList13 = arrayList5;
        ArrayList arrayList14 = arrayList6;
        C37401i c37401i2 = c37401i;
        ArrayList arrayList15 = arrayList4;
        HashMap map3 = new HashMap();
        for (int i44 = 0; i44 < arrayList13.size(); i44++) {
            C37398f c37398f2 = (C37398f) arrayList13.get(i44);
            long size = c37398f2.f160008b;
            if (size == -1) {
                size = (j28 + ((long) arrayList3.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = c37398f2.f160009c;
            if (size2 == -1 && j27 != -9223372036854775807L) {
                size2 = (arrayList15.isEmpty() ? ((C37399g) AbstractC41047q.m133279i(arrayList3)).f160011M : arrayList15).size() - 1;
            }
            Uri uri = c37398f2.f160007a;
            map3.put(uri, new C37398f(uri, size, size2));
        }
        if (c37397e != null) {
            arrayList15.add(c37397e);
        }
        return new C37402j(i16, str, arrayList14, j15, z18, jM71695z, z15, i19, j28, i24, j26, j27, z13, z14, jM71695z != 0, c36136c5, arrayList3, arrayList15, c37401i2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: f */
    public static C37405m m119761f(C29938w0 c29938w0, String str) throws IOException {
        ?? r10;
        ArrayList arrayList;
        int i13;
        ArrayList arrayList2;
        C37404l c37404l;
        String strM71609c;
        int i14;
        String str2;
        C37404l c37404l2;
        String strM71609c2;
        C37404l c37404l3;
        int i15;
        int i16;
        int i17;
        Uri uriM71561C;
        int i18;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        boolean z4 = false;
        boolean z13 = false;
        while (true) {
            boolean zM91573w = c29938w0.m91573w();
            Pattern pattern = f160104k0;
            ArrayList arrayList11 = arrayList7;
            Pattern pattern2 = f160109p0;
            boolean z14 = z4;
            if (!zM91573w) {
                ArrayList arrayList12 = arrayList8;
                ArrayList arrayList13 = arrayList4;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList10;
                ArrayList arrayList17 = arrayList9;
                boolean z15 = z13;
                ArrayList arrayList18 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                    C37404l c37404l4 = (C37404l) arrayList3.get(i19);
                    Uri uri = c37404l4.f160050a;
                    C31521c0 c31521c0 = c37404l4.f160051b;
                    if (hashSet.add(uri)) {
                        AbstractC24543a.m71573i(c31521c0.f130075J == null);
                        ArrayList arrayList19 = (ArrayList) map.get(c37404l4.f160050a);
                        arrayList19.getClass();
                        C18715c c18715c = new C18715c(new C36189t(null, null, arrayList19));
                        C31518b0 c31518b0M97113a = c31521c0.m97113a();
                        c31518b0M97113a.f130045i = c18715c;
                        arrayList18.add(new C37404l(c37404l4.f160050a, new C31521c0(c31518b0M97113a), c37404l4.f160052c, c37404l4.f160053d, c37404l4.f160054e, c37404l4.f160055f));
                    }
                }
                int i24 = 0;
                C31521c0 c31521c1 = null;
                List arrayList20 = null;
                while (i24 < arrayList12.size()) {
                    ArrayList arrayList21 = arrayList12;
                    String str4 = (String) arrayList21.get(i24);
                    String strM119766k = m119766k(str4, f160110q0, map2);
                    String strM119766k2 = m119766k(str4, pattern2, map2);
                    C31518b0 c31518b0 = new C31518b0();
                    int i25 = i24;
                    StringBuilder sb4 = new StringBuilder(strM119766k2.length() + strM119766k.length() + 1);
                    sb4.append(strM119766k);
                    sb4.append(":");
                    sb4.append(strM119766k2);
                    c31518b0.f130037a = sb4.toString();
                    c31518b0.f130038b = strM119766k2;
                    c31518b0.f130046j = "application/x-mpegURL";
                    boolean zM119762g = m119762g(str4, f160114u0);
                    if (m119762g(str4, f160115v0)) {
                        r10 = zM119762g;
                        r10 = (zM119762g ? 1 : 0) | 2;
                    }
                    r10 = zM119762g;
                    int i26 = r10;
                    if (m119762g(str4, f160113t0)) {
                        i26 = (r10 == true ? 1 : 0) | 4;
                    }
                    c31518b0.f130040d = i26;
                    String strM119765j = m119765j(str4, f160111r0, null, map2);
                    if (TextUtils.isEmpty(strM119765j)) {
                        arrayList = arrayList18;
                        i13 = 0;
                    } else {
                        int i27 = AbstractC24567y.f95875a;
                        arrayList = arrayList18;
                        String[] strArrSplit = strM119765j.split(",", -1);
                        i13 = AbstractC24567y.m71679j(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (AbstractC24567y.m71679j(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i13 |= 4096;
                        }
                        if (AbstractC24567y.m71679j(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        if (AbstractC24567y.m71679j(strArrSplit, "public.easy-to-read")) {
                            i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        }
                    }
                    c31518b0.f130041e = i13;
                    c31518b0.f130039c = m119765j(str4, f160108o0, null, map2);
                    String strM119765j2 = m119765j(str4, pattern, null, map2);
                    Uri uriM71561C2 = strM119765j2 == null ? null : AbstractC24543a.m71561C(str3, strM119765j2);
                    arrayList12 = arrayList21;
                    C18715c c18715c2 = new C18715c(new C36189t(strM119766k, strM119766k2, Collections.EMPTY_LIST));
                    switch (m119766k(str4, f160106m0, map2)) {
                        case "SUBTITLES":
                            arrayList2 = arrayList14;
                            int i28 = 0;
                            while (true) {
                                if (i28 < arrayList3.size()) {
                                    c37404l = (C37404l) arrayList3.get(i28);
                                    if (!strM119766k.equals(c37404l.f160054e)) {
                                        i28++;
                                    }
                                } else {
                                    c37404l = null;
                                }
                            }
                            if (c37404l != null) {
                                String strM71683n = AbstractC24567y.m71683n(3, c37404l.f160051b.f130074I);
                                c31518b0.f130044h = strM71683n;
                                strM71609c = AbstractC24555m.m71609c(strM71683n);
                            } else {
                                strM71609c = null;
                            }
                            if (strM71609c == null) {
                                strM71609c = "text/vtt";
                            }
                            c31518b0.f130047k = strM71609c;
                            c31518b0.f130045i = c18715c2;
                            if (uriM71561C2 != null) {
                                arrayList15 = arrayList15;
                                arrayList15.add(new C37403k(uriM71561C2, new C31521c0(c31518b0), strM119766k2));
                                break;
                            } else {
                                arrayList15 = arrayList15;
                                Log.w("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList2 = arrayList14;
                            String strM119766k3 = m119766k(str4, f160112s0, map2);
                            if (strM119766k3.startsWith("CC")) {
                                i14 = Integer.parseInt(strM119766k3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i14 = Integer.parseInt(strM119766k3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList();
                            }
                            c31518b0.f130047k = str2;
                            c31518b0.f130035C = i14;
                            arrayList20.add(new C31521c0(c31518b0));
                            break;
                        case "AUDIO":
                            ArrayList arrayList22 = arrayList13;
                            int i29 = 0;
                            while (true) {
                                if (i29 < arrayList3.size()) {
                                    c37404l2 = (C37404l) arrayList3.get(i29);
                                    int i34 = i29;
                                    if (!strM119766k.equals(c37404l2.f160053d)) {
                                        i29 = i34 + 1;
                                    }
                                } else {
                                    c37404l2 = null;
                                }
                            }
                            if (c37404l2 != null) {
                                String strM71683n2 = AbstractC24567y.m71683n(1, c37404l2.f160051b.f130074I);
                                c31518b0.f130044h = strM71683n2;
                                strM71609c2 = AbstractC24555m.m71609c(strM71683n2);
                            } else {
                                strM71609c2 = null;
                            }
                            arrayList13 = arrayList22;
                            String strM119765j3 = m119765j(str4, f160076I, null, map2);
                            if (strM119765j3 != null) {
                                int i35 = AbstractC24567y.f95875a;
                                c31518b0.f130060x = Integer.parseInt(strM119765j3.split("/", 2)[0]);
                                if ("audio/eac3".equals(strM71609c2) && strM119765j3.endsWith("/JOC")) {
                                    c31518b0.f130044h = "ec+3";
                                    strM71609c2 = "audio/eac3-joc";
                                }
                            }
                            c31518b0.f130047k = strM71609c2;
                            if (uriM71561C2 != null) {
                                c31518b0.f130045i = c18715c2;
                                arrayList2 = arrayList14;
                                arrayList2.add(new C37403k(uriM71561C2, new C31521c0(c31518b0), strM119766k2));
                            } else {
                                arrayList2 = arrayList14;
                                if (c37404l2 != null) {
                                    c31521c1 = new C31521c0(c31518b0);
                                }
                            }
                            break;
                        case "VIDEO":
                            int i36 = 0;
                            while (true) {
                                if (i36 < arrayList3.size()) {
                                    c37404l3 = (C37404l) arrayList3.get(i36);
                                    if (!strM119766k.equals(c37404l3.f160052c)) {
                                        i36++;
                                    }
                                } else {
                                    c37404l3 = null;
                                }
                            }
                            if (c37404l3 != null) {
                                C31521c0 c31521c2 = c37404l3.f160051b;
                                String strM71683n3 = AbstractC24567y.m71683n(2, c31521c2.f130074I);
                                c31518b0.f130044h = strM71683n3;
                                c31518b0.f130047k = AbstractC24555m.m71609c(strM71683n3);
                                c31518b0.f130052p = c31521c2.f130082Q;
                                c31518b0.f130053q = c31521c2.f130083R;
                                c31518b0.f130054r = c31521c2.f130084S;
                            }
                            if (uriM71561C2 != null) {
                                c31518b0.f130045i = c18715c2;
                                arrayList13.add(new C37403k(uriM71561C2, new C31521c0(c31518b0), strM119766k2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList14;
                            break;
                    }
                    i24 = i25 + 1;
                    arrayList18 = arrayList;
                    str3 = str;
                    arrayList14 = arrayList2;
                    arrayList15 = arrayList15;
                }
                ArrayList arrayList23 = arrayList18;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList14;
                if (z14) {
                    arrayList20 = Collections.EMPTY_LIST;
                }
                return new C37405m(str, arrayList16, arrayList23, arrayList13, arrayList25, arrayList24, arrayList11, c31521c1, arrayList20, z15, map2, arrayList17);
            }
            String strM91576z = c29938w0.m91576z();
            if (strM91576z.startsWith("#EXT")) {
                arrayList10.add(strM91576z);
            }
            boolean zStartsWith = strM91576z.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList10;
            if (strM91576z.startsWith("#EXT-X-DEFINE")) {
                map2.put(m119766k(strM91576z, pattern2, map2), m119766k(strM91576z, f160121z0, map2));
            } else {
                if (strM91576z.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList5 = arrayList5;
                    arrayList9 = arrayList9;
                    z4 = z14;
                    z13 = true;
                } else if (strM91576z.startsWith("#EXT-X-MEDIA")) {
                    arrayList8.add(strM91576z);
                } else if (strM91576z.startsWith("#EXT-X-SESSION-KEY")) {
                    C36135b c36135bM119759d = m119759d(strM91576z, m119765j(strM91576z, f160102i0, "identity", map2), map2);
                    if (c36135bM119759d != null) {
                        String strM119766k4 = m119766k(strM91576z, f160101h0, map2);
                        arrayList9.add(new C36136c(("SAMPLE-AES-CENC".equals(strM119766k4) || "SAMPLE-AES-CTR".equals(strM119766k4)) ? "cenc" : "cbcs", true, c36135bM119759d));
                    }
                } else if (strM91576z.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z14 | strM91576z.contains("CLOSED-CAPTIONS=NONE");
                    int i37 = zStartsWith ? DfuBaseService.ERROR_CONNECTION_MASK : 0;
                    int i38 = Integer.parseInt(m119766k(strM91576z, f160075H, Collections.EMPTY_MAP));
                    Matcher matcher = f160118y.matcher(strM91576z);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i15 = Integer.parseInt(strGroup);
                    } else {
                        i15 = -1;
                    }
                    boolean z16 = z13;
                    String strM119765j4 = m119765j(strM91576z, f160077J, null, map2);
                    String strM119765j5 = m119765j(strM91576z, f160078K, null, map2);
                    if (strM119765j5 != null) {
                        int i39 = AbstractC24567y.f95875a;
                        String[] strArrSplit2 = strM119765j5.split("x", -1);
                        int i44 = Integer.parseInt(strArrSplit2[0]);
                        i17 = Integer.parseInt(strArrSplit2[1]);
                        if (i44 <= 0 || i17 <= 0) {
                            i17 = -1;
                            i18 = -1;
                        } else {
                            i18 = i44;
                        }
                        i16 = i18;
                    } else {
                        i16 = -1;
                        i17 = -1;
                    }
                    String strM119765j6 = m119765j(strM91576z, f160079L, null, map2);
                    float f13 = strM119765j6 != null ? Float.parseFloat(strM119765j6) : -1.0f;
                    String strM119765j7 = m119765j(strM91576z, f160120z, null, map2);
                    String strM119765j8 = m119765j(strM91576z, f160072E, null, map2);
                    String strM119765j9 = m119765j(strM91576z, f160073F, null, map2);
                    String strM119765j10 = m119765j(strM91576z, f160074G, null, map2);
                    if (zStartsWith) {
                        uriM71561C = AbstractC24543a.m71561C(str3, m119766k(strM91576z, pattern, map2));
                    } else {
                        if (!c29938w0.m91573w()) {
                            throw ParserException.m15563b("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        uriM71561C = AbstractC24543a.m71561C(str3, m119767l(c29938w0.m91576z(), map2));
                    }
                    C31518b0 c31518b1 = new C31518b0();
                    c31518b1.f130037a = Integer.toString(arrayList3.size());
                    c31518b1.f130046j = "application/x-mpegURL";
                    c31518b1.f130044h = strM119765j4;
                    c31518b1.f130042f = i15;
                    c31518b1.f130043g = i38;
                    c31518b1.f130052p = i16;
                    c31518b1.f130053q = i17;
                    c31518b1.f130054r = f13;
                    c31518b1.f130041e = i37;
                    arrayList3.add(new C37404l(uriM71561C, new C31521c0(c31518b1), strM119765j7, strM119765j8, strM119765j9, strM119765j10));
                    ArrayList arrayList27 = (ArrayList) map.get(uriM71561C);
                    if (arrayList27 == null) {
                        arrayList27 = new ArrayList();
                        map.put(uriM71561C, arrayList27);
                    }
                    arrayList27.add(new C36188s(strM119765j7, strM119765j8, i15, i38, strM119765j9, strM119765j10));
                    z4 = zContains;
                    z13 = z16;
                }
                arrayList7 = arrayList11;
                arrayList10 = arrayList26;
                arrayList9 = arrayList9;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList8 = arrayList8;
            }
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
            z4 = z14;
            arrayList7 = arrayList11;
            arrayList10 = arrayList26;
            arrayList9 = arrayList9;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList8 = arrayList8;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m119762g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static double m119763h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: i */
    public static long m119764i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: j */
    public static String m119765j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m119767l(str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static String m119766k(String str, Pattern pattern, Map map) throws ParserException {
        String strM119765j = m119765j(str, pattern, null, map);
        if (strM119765j != null) {
            return strM119765j;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(19, strPattern), str));
        sb4.append("Couldn't match ");
        sb4.append(strPattern);
        sb4.append(" in ");
        sb4.append(str);
        throw ParserException.m15563b(sb4.toString());
    }

    /* JADX INFO: renamed from: l */
    public static String m119767l(String str, Map map) {
        Matcher matcher = f160071B0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0071, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:38:0x0075, B:40:0x007b, B:43:0x0086, B:45:0x008e, B:49:0x00a4, B:51:0x00ac, B:53:0x00b4, B:55:0x00bc, B:57:0x00c4, B:59:0x00cc, B:61:0x00d4, B:63:0x00dc, B:66:0x00e5, B:67:0x00e9), top: B:82:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0072, LOOP:1: B:16:0x003a->B:20:0x0045, LOOP_END, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0071, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:38:0x0075, B:40:0x007b, B:43:0x0086, B:45:0x008e, B:49:0x00a4, B:51:0x00ac, B:53:0x00b4, B:55:0x00bc, B:57:0x00c4, B:59:0x00cc, B:61:0x00d4, B:63:0x00dc, B:66:0x00e5, B:67:0x00e9), top: B:82:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:95:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x0050
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // p284ko.InterfaceC22613d0
    /* JADX INFO: renamed from: c */
    public final p589wn.AbstractC37406n mo30741c(android.net.Uri r7, p284ko.C22629m r8) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p589wn.C37407o.mo30741c(android.net.Uri, ko.m):wn.n");
    }
}
