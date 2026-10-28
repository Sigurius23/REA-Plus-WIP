package co;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.C1753x2;
import ed3.C13117a;
import io.getstream.chat.android.client.ChatClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p460rg.AbstractC31375j;
import p621xn.AbstractC38467d;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import p658yr.AbstractC39717d;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: co.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C4853a extends AbstractC38467d {

    /* JADX INFO: renamed from: r */
    public static final Pattern f20173r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m */
    public final boolean f20174m;

    /* JADX INFO: renamed from: n */
    public final C1753x2 f20175n;

    /* JADX INFO: renamed from: o */
    public LinkedHashMap f20176o;

    /* JADX INFO: renamed from: p */
    public float f20177p = -3.4028235E38f;

    /* JADX INFO: renamed from: q */
    public float f20178q = -3.4028235E38f;

    public C4853a(List list) {
        if (list == null || list.isEmpty()) {
            this.f20174m = false;
            this.f20175n = null;
            return;
        }
        this.f20174m = true;
        byte[] bArr = (byte[]) list.get(0);
        int i13 = AbstractC24567y.f95875a;
        String str = new String(bArr, AbstractC39717d.f170958c);
        AbstractC24543a.m71569e(str.startsWith("Format:"));
        C1753x2 c1753x2M5347b = C1753x2.m5347b(str);
        c1753x2M5347b.getClass();
        this.f20175n = c1753x2M5347b;
        m15494i(new C13117a((byte[]) list.get(1), 1, (byte) 0));
    }

    /* JADX INFO: renamed from: h */
    public static int m15492h(long j7, ArrayList arrayList, ArrayList arrayList2) {
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

    /* JADX INFO: renamed from: j */
    public static long m15493j(String str) {
        Matcher matcher = f20173r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i13 = AbstractC24567y.f95875a;
        return (Long.parseLong(matcher.group(4)) * ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) {
        C13117a c13117a;
        int i14;
        float f13;
        int i15;
        Layout.Alignment alignment;
        int i16;
        int i17;
        float f14;
        float f15;
        float f16;
        float f17;
        int i18;
        float f18;
        int i19;
        int i24;
        int iM15496a;
        int i25;
        C4853a c4853a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C13117a c13117a2 = new C13117a(bArr, i13, 1, false);
        boolean z13 = c4853a.f20174m;
        if (!z13) {
            c4853a.m15494i(c13117a2);
        }
        C1753x2 c1753x2M5347b = z13 ? c4853a.f20175n : null;
        while (true) {
            String strM36700j = c13117a2.m36700j();
            if (strM36700j == null) {
                return new C4857e(arrayList, arrayList2);
            }
            if (strM36700j.startsWith("Format:")) {
                c1753x2M5347b = C1753x2.m5347b(strM36700j);
            } else {
                if (strM36700j.startsWith("Dialogue:")) {
                    if (c1753x2M5347b == null) {
                        Log.w("SsaDecoder", strM36700j.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strM36700j) : new String("Skipping dialogue line before complete format: "));
                    } else {
                        int i26 = c1753x2M5347b.f6935e;
                        AbstractC24543a.m71569e(strM36700j.startsWith("Dialogue:"));
                        String[] strArrSplit = strM36700j.substring(9).split(",", i26);
                        if (strArrSplit.length != i26) {
                            Log.w("SsaDecoder", strM36700j.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(strM36700j) : new String("Skipping dialogue line with fewer columns than format: "));
                        } else {
                            if (m15493j(strArrSplit[c1753x2M5347b.f6931a]) == -9223372036854775807L) {
                                Log.w("SsaDecoder", strM36700j.length() != 0 ? "Skipping invalid timing: ".concat(strM36700j) : new String("Skipping invalid timing: "));
                            } else {
                                long jM15493j = m15493j(strArrSplit[c1753x2M5347b.f6932b]);
                                if (jM15493j == -9223372036854775807L) {
                                    Log.w("SsaDecoder", strM36700j.length() != 0 ? "Skipping invalid timing: ".concat(strM36700j) : new String("Skipping invalid timing: "));
                                } else {
                                    LinkedHashMap linkedHashMap = c4853a.f20176o;
                                    C4856d c4856d = (linkedHashMap == null || (i25 = c1753x2M5347b.f6933c) == -1) ? null : (C4856d) linkedHashMap.get(strArrSplit[i25].trim());
                                    String str = strArrSplit[c1753x2M5347b.f6934d];
                                    Matcher matcher = C4855c.f20188a.matcher(str);
                                    int i27 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        C13117a c13117a3 = c13117a2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM15495a = C4855c.m15495a(strGroup);
                                            if (pointFM15495a != null) {
                                                pointF = pointFM15495a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C4855c.f20191d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM15496a = C4856d.m15496a(strGroup2);
                                            } else {
                                                iM15496a = -1;
                                            }
                                            if (iM15496a != -1) {
                                                i27 = iM15496a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c13117a2 = c13117a3;
                                    }
                                    c13117a = c13117a2;
                                    String strReplace = C4855c.f20188a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f19 = c4853a.f20177p;
                                    float f24 = c4853a.f20178q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c4856d != null) {
                                        boolean z14 = c4856d.f20197f;
                                        Integer num = c4856d.f20194c;
                                        if (num != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f25 = c4856d.f20195d;
                                        if (f25 == -3.4028235E38f || f24 == -3.4028235E38f) {
                                            f17 = -3.4028235E38f;
                                            i18 = Integer.MIN_VALUE;
                                        } else {
                                            f17 = f25 / f24;
                                            i18 = 1;
                                        }
                                        boolean z15 = c4856d.f20196e;
                                        if (z15 && z14) {
                                            f18 = f17;
                                            i19 = i18;
                                            i24 = 33;
                                            i14 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f18 = f17;
                                            i19 = i18;
                                            i24 = 33;
                                            i14 = 0;
                                            if (z15) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z14 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c4856d.f20198g) {
                                            spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i24);
                                        }
                                        if (c4856d.f20199h) {
                                            spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i24);
                                        }
                                        i15 = i19;
                                        f13 = f18;
                                    } else {
                                        c1753x2M5347b = c1753x2M5347b;
                                        f19 = f19;
                                        i14 = 0;
                                        f13 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    }
                                    int i28 = -1;
                                    if (i27 != -1) {
                                        i28 = i27;
                                    } else if (c4856d != null) {
                                        i28 = c4856d.f20193b;
                                    }
                                    switch (i28) {
                                        case 0:
                                        default:
                                            AbstractC30007c.m91850t(30, i28, "Unknown alignment: ", "SsaDecoder");
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
                                    int i29 = Integer.MIN_VALUE;
                                    switch (i28) {
                                        case 0:
                                        default:
                                            AbstractC30007c.m91850t(30, i28, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i14 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i14 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i14 = 2;
                                            break;
                                    }
                                    switch (i28) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC30007c.m91850t(30, i28, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i29 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i29 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i29 = 0;
                                            break;
                                    }
                                    if (pointF == null || f24 == -3.4028235E38f || f19 == -3.4028235E38f) {
                                        float f26 = 0.05f;
                                        if (i14 != 0) {
                                            i17 = 1;
                                            if (i14 != 1) {
                                                i16 = 2;
                                                f14 = i14 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i16 = 2;
                                                f14 = 0.5f;
                                            }
                                        } else {
                                            i16 = 2;
                                            i17 = 1;
                                            f14 = 0.05f;
                                        }
                                        if (i29 != 0) {
                                            f26 = i29 != i17 ? i29 != i16 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f15 = f26;
                                        f16 = f14;
                                    } else {
                                        f16 = pointF.x / f19;
                                        f15 = pointF.y / f24;
                                    }
                                    C38465b c38465b = new C38465b(spannableString, alignment, null, null, f15, 0, i29, f16, i14, i15, f13, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iM15492h = m15492h(jM15493j, arrayList2, arrayList);
                                    for (int iM15492h2 = m15492h(r9, arrayList2, arrayList); iM15492h2 < iM15492h; iM15492h2++) {
                                        ((List) arrayList.get(iM15492h2)).add(c38465b);
                                    }
                                }
                            }
                        }
                    }
                    c13117a = c13117a2;
                    c1753x2M5347b = c1753x2M5347b;
                } else {
                    c13117a = c13117a2;
                    c1753x2M5347b = c1753x2M5347b;
                }
                c4853a = this;
                c13117a2 = c13117a;
                c1753x2M5347b = c1753x2M5347b;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0298  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public final void m15494i(C13117a c13117a) {
        int i13;
        float f13;
        C4856d c4856d;
        float f14;
        while (true) {
            String strM36700j = c13117a.m36700j();
            if (strM36700j == null) {
                return;
            }
            int i14 = 2;
            int i15 = 0;
            char c3 = '[';
            if ("[Script Info]".equalsIgnoreCase(strM36700j)) {
                while (true) {
                    String strM36700j2 = c13117a.m36700j();
                    if (strM36700j2 == null || (c13117a.m36692a() != 0 && (c13117a.f45381a[c13117a.f45382b] & 255) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM36700j2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM96499o = AbstractC31375j.m96499o(strArrSplit[0].trim());
                        strM96499o.getClass();
                        if (strM96499o.equals("playresx")) {
                            this.f20177p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM96499o.equals("playresy")) {
                            try {
                                this.f20178q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM36700j)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    C4854b c4854b = null;
                    while (true) {
                        String strM36700j3 = c13117a.m36700j();
                        if (strM36700j3 != null && (c13117a.m36692a() == 0 || (c13117a.f45381a[c13117a.f45382b] & 255) != c3)) {
                            if (strM36700j3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM36700j3.substring(7), ",");
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = -1;
                                int i27 = -1;
                                for (int i28 = i15; i28 < strArrSplit2.length; i28++) {
                                    String strM96499o2 = AbstractC31375j.m96499o(strArrSplit2[i28].trim());
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
                                        case 1767875043:
                                            i13 = strM96499o2.equals("alignment") ? 7 : -1;
                                            break;
                                        default:
                                            i13 = -1;
                                            break;
                                    }
                                    switch (i13) {
                                        case 0:
                                            i25 = i28;
                                            break;
                                        case 1:
                                            i26 = i28;
                                            break;
                                        case 2:
                                            i27 = i28;
                                            break;
                                        case 3:
                                            i18 = i28;
                                            break;
                                        case 4:
                                            i24 = i28;
                                            break;
                                        case 5:
                                            i16 = i28;
                                            break;
                                        case 6:
                                            i19 = i28;
                                            break;
                                        case 7:
                                            i17 = i28;
                                            break;
                                    }
                                }
                                if (i16 != -1) {
                                    c4854b = new C4854b(i16, i17, i18, i19, i24, i25, i26, i27, strArrSplit2.length);
                                }
                            } else {
                                if (strM36700j3.startsWith("Style:")) {
                                    if (c4854b == null) {
                                        Log.w("SsaDecoder", strM36700j3.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(strM36700j3) : new String("Skipping 'Style:' line before 'Format:' line: "));
                                    } else {
                                        AbstractC24543a.m71569e(strM36700j3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM36700j3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i29 = c4854b.f20187i;
                                        if (length != i29) {
                                            int length2 = strArrSplit3.length;
                                            int i34 = AbstractC24567y.f95875a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM30465s = AbstractC11266d.m30465s(i29, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbM30465s.append(strM36700j3);
                                            sbM30465s.append("'");
                                            Log.w("SsaStyle", sbM30465s.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c4854b.f20179a].trim();
                                                int i35 = c4854b.f20180b;
                                                int iM15496a = i35 != -1 ? C4856d.m15496a(strArrSplit3[i35].trim()) : -1;
                                                int i36 = c4854b.f20181c;
                                                Integer numM15498c = i36 != -1 ? C4856d.m15498c(strArrSplit3[i36].trim()) : null;
                                                int i37 = c4854b.f20182d;
                                                if (i37 != -1) {
                                                    String strTrim2 = strArrSplit3[i37].trim();
                                                    try {
                                                        f14 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e5) {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                                                        sb4.append("Failed to parse font size: '");
                                                        sb4.append(strTrim2);
                                                        sb4.append("'");
                                                        AbstractC24543a.m71564F("SsaStyle", sb4.toString(), e5);
                                                        f14 = -3.4028235E38f;
                                                    }
                                                    f13 = f14;
                                                } else {
                                                    f13 = -3.4028235E38f;
                                                }
                                                int i38 = c4854b.f20183e;
                                                boolean z4 = i38 != -1 && C4856d.m15497b(strArrSplit3[i38].trim());
                                                int i39 = c4854b.f20184f;
                                                boolean z13 = i39 != -1 && C4856d.m15497b(strArrSplit3[i39].trim());
                                                int i44 = c4854b.f20185g;
                                                boolean z14 = i44 != -1 && C4856d.m15497b(strArrSplit3[i44].trim());
                                                int i45 = c4854b.f20186h;
                                                c4856d = new C4856d(strTrim, iM15496a, numM15498c, f13, z4, z13, z14, i45 != -1 && C4856d.m15497b(strArrSplit3[i45].trim()));
                                            } catch (RuntimeException e13) {
                                                StringBuilder sb5 = new StringBuilder(strM36700j3.length() + 36);
                                                sb5.append("Skipping malformed 'Style:' line: '");
                                                sb5.append(strM36700j3);
                                                sb5.append("'");
                                                AbstractC24543a.m71564F("SsaStyle", sb5.toString(), e13);
                                                c4856d = null;
                                            }
                                            if (c4856d != null) {
                                                linkedHashMap.put(c4856d.f20192a, c4856d);
                                            }
                                        }
                                        c4856d = null;
                                        if (c4856d != null) {
                                            linkedHashMap.put(c4856d.f20192a, c4856d);
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
                this.f20176o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM36700j)) {
                Log.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM36700j)) {
                return;
            }
        }
    }
}
