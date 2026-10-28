package ua;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.C1753x2;
import io.getstream.chat.android.client.ChatClient;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p460rg.AbstractC31375j;
import p576w8.C36932b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ua.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34714a implements InterfaceC30107l {

    /* JADX INFO: renamed from: G */
    public static final Pattern f146222G = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: w */
    public final boolean f146225w;

    /* JADX INFO: renamed from: x */
    public final C1753x2 f146226x;

    /* JADX INFO: renamed from: z */
    public LinkedHashMap f146228z;

    /* JADX INFO: renamed from: E */
    public float f146223E = -3.4028235E38f;

    /* JADX INFO: renamed from: F */
    public float f146224F = -3.4028235E38f;

    /* JADX INFO: renamed from: y */
    public final C38059n f146227y = new C38059n();

    public C34714a(List list) {
        if (list == null || list.isEmpty()) {
            this.f146225w = false;
            this.f146226x = null;
            return;
        }
        this.f146225w = true;
        String strM121921n = AbstractC38065t.m121921n((byte[]) list.get(0));
        AbstractC35849g.m113802d(strM121921n.startsWith("Format:"));
        C1753x2 c1753x2M5348c = C1753x2.m5348c(strM121921n);
        c1753x2M5348c.getClass();
        this.f146226x = c1753x2M5348c;
        m109638b(new C38059n((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static int m109636a(long j7, ArrayList arrayList, ArrayList arrayList2) {
        int i13;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j7) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, Long.valueOf(j7));
        arrayList2.add(i13, i13 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i13 - 1)));
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public static long m109637c(String str) {
        Matcher matcher = f146222G.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i13 = AbstractC38065t.f163031a;
        return (Long.parseLong(matcher.group(4)) * ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m109638b(C38059n c38059n, Charset charset) {
        int i13;
        C34717d c34717d;
        while (true) {
            String strM121855h = c38059n.m121855h(charset);
            if (strM121855h == null) {
                return;
            }
            int i14 = 2;
            int i15 = 0;
            char c3 = '[';
            if ("[Script Info]".equalsIgnoreCase(strM121855h)) {
                while (true) {
                    String strM121855h2 = c38059n.m121855h(charset);
                    if (strM121855h2 == null || (c38059n.m121848a() != 0 && c38059n.m121850c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM121855h2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM96499o = AbstractC31375j.m96499o(strArrSplit[0].trim());
                        strM96499o.getClass();
                        if (strM96499o.equals("playresx")) {
                            this.f146223E = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM96499o.equals("playresy")) {
                            try {
                                this.f146224F = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM121855h)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    C34715b c34715b = null;
                    while (true) {
                        String strM121855h3 = c38059n.m121855h(charset);
                        if (strM121855h3 != null && (c38059n.m121848a() == 0 || c38059n.m121850c(charset) != c3)) {
                            int i16 = -1;
                            if (strM121855h3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM121855h3.substring(7), ",");
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = -1;
                                int i27 = -1;
                                int i28 = -1;
                                int i29 = -1;
                                int i34 = -1;
                                for (int i35 = i15; i35 < strArrSplit2.length; i35++) {
                                    String strM96499o2 = AbstractC31375j.m96499o(strArrSplit2[i35].trim());
                                    strM96499o2.getClass();
                                    switch (strM96499o2.hashCode()) {
                                        case -1178781136:
                                            i13 = strM96499o2.equals("italic") ? i15 : -1;
                                            break;
                                        case -1026963764:
                                            i13 = strM96499o2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i13 = strM96499o2.equals("strikeout") ? i14 : -1;
                                            break;
                                        case -70925746:
                                            i13 = strM96499o2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i13 = strM96499o2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i13 = strM96499o2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i13 = strM96499o2.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i13 = strM96499o2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i13 = strM96499o2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i13 = strM96499o2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i13 = -1;
                                            break;
                                    }
                                    switch (i13) {
                                        case 0:
                                            i27 = i35;
                                            break;
                                        case 1:
                                            i28 = i35;
                                            break;
                                        case 2:
                                            i29 = i35;
                                            break;
                                        case 3:
                                            i19 = i35;
                                            break;
                                        case 4:
                                            i26 = i35;
                                            break;
                                        case 5:
                                            i17 = i35;
                                            break;
                                        case 6:
                                            i25 = i35;
                                            break;
                                        case 7:
                                            i34 = i35;
                                            break;
                                        case 8:
                                            i18 = i35;
                                            break;
                                        case 9:
                                            i24 = i35;
                                            break;
                                    }
                                }
                                if (i17 != -1) {
                                    c34715b = new C34715b(i17, i18, i19, i24, i25, i26, i27, i28, i29, i34, strArrSplit2.length);
                                }
                            } else {
                                if (strM121855h3.startsWith("Style:")) {
                                    if (c34715b == null) {
                                        AbstractC38046a.m121826u("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM121855h3));
                                    } else {
                                        AbstractC35849g.m113802d(strM121855h3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM121855h3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i36 = c34715b.f146239k;
                                        if (length != i36) {
                                            int length2 = strArrSplit3.length;
                                            int i37 = AbstractC38065t.f163031a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM30465s = AbstractC11266d.m30465s(i36, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbM30465s.append(strM121855h3);
                                            sbM30465s.append("'");
                                            AbstractC38046a.m121826u("SsaStyle", sbM30465s.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c34715b.f146229a].trim();
                                                int i38 = c34715b.f146230b;
                                                int iM109640a = i38 != -1 ? C34717d.m109640a(strArrSplit3[i38].trim()) : -1;
                                                int i39 = c34715b.f146231c;
                                                Integer numM109642c = i39 != -1 ? C34717d.m109642c(strArrSplit3[i39].trim()) : null;
                                                int i44 = c34715b.f146232d;
                                                Integer numM109642c2 = i44 != -1 ? C34717d.m109642c(strArrSplit3[i44].trim()) : null;
                                                int i45 = c34715b.f146233e;
                                                float f13 = -3.4028235E38f;
                                                if (i45 != -1) {
                                                    String strTrim2 = strArrSplit3[i45].trim();
                                                    try {
                                                        f13 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e5) {
                                                        AbstractC38046a.m121827v("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e5);
                                                    }
                                                }
                                                float f14 = f13;
                                                int i46 = c34715b.f146234f;
                                                boolean z4 = i46 != -1 && C34717d.m109641b(strArrSplit3[i46].trim());
                                                int i47 = c34715b.f146235g;
                                                boolean z13 = i47 != -1 && C34717d.m109641b(strArrSplit3[i47].trim());
                                                int i48 = c34715b.f146236h;
                                                boolean z14 = i48 != -1 && C34717d.m109641b(strArrSplit3[i48].trim());
                                                int i49 = c34715b.f146237i;
                                                boolean z15 = i49 != -1 && C34717d.m109641b(strArrSplit3[i49].trim());
                                                int i54 = c34715b.f146238j;
                                                if (i54 != -1) {
                                                    String strTrim3 = strArrSplit3[i54].trim();
                                                    try {
                                                        int i55 = Integer.parseInt(strTrim3.trim());
                                                        if (i55 == 1 || i55 == 3) {
                                                            i16 = i55;
                                                        } else {
                                                            AbstractC38046a.m121826u("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                                c34717d = new C34717d(strTrim, iM109640a, numM109642c, numM109642c2, f14, z4, z13, z14, z15, i16);
                                            } catch (RuntimeException e13) {
                                                AbstractC38046a.m121827v("SsaStyle", "Skipping malformed 'Style:' line: '" + strM121855h3 + "'", e13);
                                                c34717d = null;
                                            }
                                            if (c34717d != null) {
                                                linkedHashMap.put(c34717d.f146244a, c34717d);
                                            }
                                        }
                                        c34717d = null;
                                        if (c34717d != null) {
                                            linkedHashMap.put(c34717d.f146244a, c34717d);
                                        }
                                    }
                                }
                                i14 = 2;
                                i15 = 0;
                                c3 = '[';
                            }
                        }
                    }
                }
                this.f146228z = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM121855h)) {
                AbstractC38046a.m121818m("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM121855h)) {
                return;
            }
        }
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public final int mo91110c0() {
        return 1;
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public final void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        Charset charset;
        C1753x2 c1753x2;
        long j7;
        int i15;
        float f13;
        int i16;
        Layout.Alignment alignment;
        int i17;
        int i18;
        float f14;
        float f15;
        float f16;
        int i19;
        int i24;
        float f17;
        int i25;
        float f18;
        int i26;
        int i27;
        int iM109640a;
        int i28;
        C34714a c34714a = this;
        long j13 = c30106k.f122845a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C38059n c38059n = c34714a.f146227y;
        c38059n.m121844D(i13 + i14, bArr);
        c38059n.m121846F(i13);
        Charset charsetM121842B = c38059n.m121842B();
        if (charsetM121842B == null) {
            charsetM121842B = StandardCharsets.UTF_8;
        }
        boolean z4 = c34714a.f146225w;
        if (!z4) {
            c34714a.m109638b(c38059n, charsetM121842B);
        }
        C1753x2 c1753x2M5348c = z4 ? c34714a.f146226x : null;
        while (true) {
            String strM121855h = c38059n.m121855h(charsetM121842B);
            if (strM121855h == null) {
                long j14 = j13;
                ArrayList arrayList3 = (j14 == -9223372036854775807L || !c30106k.f122846b) ? null : new ArrayList();
                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                    List list = (List) arrayList.get(i29);
                    if (!list.isEmpty() || i29 == 0) {
                        if (i29 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i29)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i29 + 1)).longValue() - ((Long) arrayList2.get(i29)).longValue();
                        if (j14 == -9223372036854775807L || jLongValue >= j14) {
                            interfaceC38049d.accept(new C30096a(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C30096a(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC38049d.accept((C30096a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM121855h.startsWith("Format:")) {
                c1753x2M5348c = C1753x2.m5348c(strM121855h);
            } else {
                if (strM121855h.startsWith("Dialogue:")) {
                    if (c1753x2M5348c == null) {
                        AbstractC38046a.m121826u("SsaParser", "Skipping dialogue line before complete format: ".concat(strM121855h));
                    } else {
                        int i34 = c1753x2M5348c.f6935e;
                        AbstractC35849g.m113802d(strM121855h.startsWith("Dialogue:"));
                        String[] strArrSplit = strM121855h.substring(9).split(",", i34);
                        if (strArrSplit.length != i34) {
                            AbstractC38046a.m121826u("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM121855h));
                        } else {
                            long jM109637c = m109637c(strArrSplit[c1753x2M5348c.f6931a]);
                            charset = charsetM121842B;
                            if (jM109637c == -9223372036854775807L) {
                                AbstractC38046a.m121826u("SsaParser", "Skipping invalid timing: ".concat(strM121855h));
                                j7 = j13;
                                c1753x2 = c1753x2M5348c;
                                c38059n = c38059n;
                            } else {
                                j7 = j13;
                                long jM109637c2 = m109637c(strArrSplit[c1753x2M5348c.f6932b]);
                                if (jM109637c2 == -9223372036854775807L || jM109637c2 <= jM109637c) {
                                    c1753x2 = c1753x2M5348c;
                                    c38059n = c38059n;
                                    AbstractC38046a.m121826u("SsaParser", "Skipping invalid timing: ".concat(strM121855h));
                                } else {
                                    LinkedHashMap linkedHashMap = c34714a.f146228z;
                                    C34717d c34717d = (linkedHashMap == null || (i28 = c1753x2M5348c.f6933c) == -1) ? null : (C34717d) linkedHashMap.get(strArrSplit[i28].trim());
                                    String str = strArrSplit[c1753x2M5348c.f6934d];
                                    Matcher matcher = C34716c.f146240a.matcher(str);
                                    int i35 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        C1753x2 c1753x3 = c1753x2M5348c;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM109639a = C34716c.m109639a(strGroup);
                                            if (pointFM109639a != null) {
                                                pointF = pointFM109639a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C34716c.f146243d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM109640a = C34717d.m109640a(strGroup2);
                                            } else {
                                                iM109640a = -1;
                                            }
                                            if (iM109640a != -1) {
                                                i35 = iM109640a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c1753x2M5348c = c1753x3;
                                    }
                                    c1753x2 = c1753x2M5348c;
                                    String strReplace = C34716c.f146240a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f19 = c34714a.f146223E;
                                    float f24 = c34714a.f146224F;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c34717d != null) {
                                        boolean z13 = c34717d.f146250g;
                                        Integer num = c34717d.f146247d;
                                        Integer num2 = c34717d.f146246c;
                                        if (num2 != null) {
                                            i19 = 33;
                                            i24 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i19 = 33;
                                            i24 = 0;
                                        }
                                        if (c34717d.f146253j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i24, spannableString.length(), i19);
                                        }
                                        float f25 = c34717d.f146248e;
                                        if (f25 == -3.4028235E38f || f24 == -3.4028235E38f) {
                                            f17 = -3.4028235E38f;
                                            i25 = Integer.MIN_VALUE;
                                        } else {
                                            f17 = f25 / f24;
                                            i25 = 1;
                                        }
                                        boolean z14 = c34717d.f146249f;
                                        if (z14 && z13) {
                                            f18 = f17;
                                            i26 = i25;
                                            i27 = 33;
                                            i15 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f18 = f17;
                                            i26 = i25;
                                            i27 = 33;
                                            i15 = 0;
                                            if (z14) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z13 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c34717d.f146251h) {
                                            spannableString.setSpan(new UnderlineSpan(), i15, spannableString.length(), i27);
                                        }
                                        if (c34717d.f146252i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i15, spannableString.length(), i27);
                                        }
                                        f13 = f18;
                                        i16 = i26;
                                    } else {
                                        c38059n = c38059n;
                                        f19 = f19;
                                        i15 = 0;
                                        f13 = -3.4028235E38f;
                                        i16 = Integer.MIN_VALUE;
                                    }
                                    if (i35 == -1) {
                                        i35 = c34717d != null ? c34717d.f146245b : -1;
                                    }
                                    switch (i35) {
                                        case 0:
                                        default:
                                            AbstractC38963t7.m124388r(i35, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    int i36 = Integer.MIN_VALUE;
                                    switch (i35) {
                                        case 0:
                                        default:
                                            AbstractC38963t7.m124388r(i35, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i15 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i15 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i15 = 2;
                                            break;
                                    }
                                    switch (i35) {
                                        case 0:
                                        default:
                                            AbstractC38963t7.m124388r(i35, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i36 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i36 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i36 = 0;
                                            break;
                                    }
                                    if (pointF == 0 || f24 == -3.4028235E38f || f19 == -3.4028235E38f) {
                                        float f26 = 0.5f;
                                        if (i15 != 0) {
                                            i18 = 1;
                                            if (i15 != 1) {
                                                i17 = 2;
                                                f14 = i15 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i17 = 2;
                                                f14 = 0.5f;
                                            }
                                        } else {
                                            i17 = 2;
                                            i18 = 1;
                                            f14 = 0.05f;
                                        }
                                        if (i36 == 0) {
                                            f26 = 0.05f;
                                        } else if (i36 != i18) {
                                            f26 = i36 != i17 ? -3.4028235E38f : 0.95f;
                                        }
                                        f15 = f26;
                                        f16 = f14;
                                    } else {
                                        float f27 = pointF.x / f19;
                                        f15 = pointF.y / f24;
                                        f16 = f27;
                                    }
                                    C36932b c36932b = new C36932b(spannableString, alignment, null, null, f15, 0, i36, f16, i15, i16, f13, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iM109636a = m109636a(jM109637c2, arrayList2, arrayList);
                                    for (int iM109636a2 = m109636a(jM109637c, arrayList2, arrayList); iM109636a2 < iM109636a; iM109636a2++) {
                                        ((List) arrayList.get(iM109636a2)).add(c36932b);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM121842B;
                    j7 = j13;
                    c1753x2 = c1753x2M5348c;
                    c38059n = c38059n;
                } else {
                    charset = charsetM121842B;
                    j7 = j13;
                    c1753x2 = c1753x2M5348c;
                    c38059n = c38059n;
                }
                c34714a = this;
                charsetM121842B = charset;
                j13 = j7;
                c1753x2M5348c = c1753x2;
                c38059n = c38059n;
            }
        }
    }
}
