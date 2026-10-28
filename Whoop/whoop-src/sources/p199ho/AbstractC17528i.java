package p199ho;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import bo.C3499a;
import bo.C3501c;
import ed3.C13117a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import se.AbstractC32416g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ho.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17528i {

    /* JADX INFO: renamed from: a */
    public static final Pattern f67802a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f67803b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f67804c;

    /* JADX INFO: renamed from: d */
    public static final Map f67805d;

    static {
        HashMap map = new HashMap();
        AbstractC38963t7.m124387q(255, 255, 255, map, "white");
        AbstractC38963t7.m124387q(0, 255, 0, map, "lime");
        AbstractC38963t7.m124387q(0, 255, 255, map, "cyan");
        AbstractC38963t7.m124387q(255, 0, 0, map, "red");
        AbstractC38963t7.m124387q(255, 255, 0, map, "yellow");
        AbstractC38963t7.m124387q(255, 0, 255, map, "magenta");
        AbstractC38963t7.m124387q(0, 0, 255, map, "blue");
        AbstractC38963t7.m124387q(0, 0, 0, map, "black");
        f67804c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        AbstractC38963t7.m124387q(255, 255, 255, map2, "bg_white");
        AbstractC38963t7.m124387q(0, 255, 0, map2, "bg_lime");
        AbstractC38963t7.m124387q(0, 255, 255, map2, "bg_cyan");
        AbstractC38963t7.m124387q(255, 0, 0, map2, "bg_red");
        AbstractC38963t7.m124387q(255, 255, 0, map2, "bg_yellow");
        AbstractC38963t7.m124387q(255, 0, 255, map2, "bg_magenta");
        AbstractC38963t7.m124387q(0, 0, 255, map2, "bg_blue");
        AbstractC38963t7.m124387q(0, 0, 0, map2, "bg_black");
        f67805d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m49768a(String str, C17525f c17525f, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i13;
        int i14;
        int i15;
        int i16 = c17525f.f67786b;
        int length = spannableStringBuilder.length();
        String str2 = c17525f.f67785a;
        str2.getClass();
        int i17 = -1;
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i16, length, 33);
                break;
            case "c":
                for (String str3 : c17525f.f67788d) {
                    Map map = f67804c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i16, length, 33);
                    } else {
                        Map map2 = f67805d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i16, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i16, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i16, length, 33);
                break;
            case "ruby":
                int iM49770c = m49770c(list2, str, c17525f);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C17524e.f67782c);
                int i18 = c17525f.f67786b;
                int i19 = 0;
                int length2 = 0;
                while (i19 < arrayList.size()) {
                    if ("rt".equals(((C17524e) arrayList.get(i19)).f67783a.f67785a)) {
                        C17524e c17524e = (C17524e) arrayList.get(i19);
                        int iM49770c2 = m49770c(list2, str, c17524e.f67783a);
                        if (iM49770c2 == i17) {
                            iM49770c2 = iM49770c != i17 ? iM49770c : 1;
                        }
                        int i24 = c17524e.f67783a.f67786b - length2;
                        int i25 = c17524e.f67784b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i24, i25);
                        spannableStringBuilder.delete(i24, i25);
                        spannableStringBuilder.setSpan(new C3501c(charSequenceSubSequence.toString(), iM49770c2), i18, i24, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i18 = i24;
                    }
                    i19++;
                    i17 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM49769b = m49769b(list2, str, c17525f);
        for (int i26 = 0; i26 < arrayListM49769b.size(); i26++) {
            C17522c c17522c = ((C17526g) arrayListM49769b.get(i26)).f67790x;
            int i27 = c17522c.f67773l;
            if (i27 == -1 && c17522c.f67774m == -1) {
                i13 = -1;
            } else {
                i13 = (c17522c.f67774m == 1 ? (char) 2 : (char) 0) | (i27 == 1 ? (char) 1 : (char) 0);
            }
            if (i13 != -1) {
                int i28 = c17522c.f67773l;
                if (i28 == -1 && c17522c.f67774m == -1) {
                    i15 = -1;
                    i14 = 1;
                } else {
                    i14 = 1;
                    i15 = (i28 == 1 ? 1 : 0) | (c17522c.f67774m == 1 ? 2 : 0);
                }
                AbstractC32416g.m101158o(spannableStringBuilder, new StyleSpan(i15), i16, length);
            } else {
                i14 = 1;
            }
            if (c17522c.f67771j == i14) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i16, length, 33);
            }
            if (c17522c.f67772k == i14) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i16, length, 33);
            }
            if (c17522c.f67768g) {
                if (!c17522c.f67768g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC32416g.m101158o(spannableStringBuilder, new ForegroundColorSpan(c17522c.f67767f), i16, length);
            }
            if (c17522c.f67770i) {
                if (!c17522c.f67770i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC32416g.m101158o(spannableStringBuilder, new BackgroundColorSpan(c17522c.f67769h), i16, length);
            }
            if (c17522c.f67766e != null) {
                AbstractC32416g.m101158o(spannableStringBuilder, new TypefaceSpan(c17522c.f67766e), i16, length);
            }
            int i29 = c17522c.f67775n;
            if (i29 == 1) {
                AbstractC32416g.m101158o(spannableStringBuilder, new AbsoluteSizeSpan((int) c17522c.f67776o, true), i16, length);
            } else if (i29 == 2) {
                AbstractC32416g.m101158o(spannableStringBuilder, new RelativeSizeSpan(c17522c.f67776o), i16, length);
            } else if (i29 == 3) {
                AbstractC32416g.m101158o(spannableStringBuilder, new RelativeSizeSpan(c17522c.f67776o / 100.0f), i16, length);
            }
            if (c17522c.f67778q) {
                spannableStringBuilder.setSpan(new C3499a(), i16, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m49769b(List list, String str, C17525f c17525f) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C17522c c17522c = (C17522c) list.get(i13);
            String str2 = c17525f.f67785a;
            Set set = c17525f.f67788d;
            String str3 = c17525f.f67787c;
            if (c17522c.f67762a.isEmpty() && c17522c.f67763b.isEmpty() && c17522c.f67764c.isEmpty() && c17522c.f67765d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM49765a = C17522c.m49765a(C17522c.m49765a(C17522c.m49765a(0, 1073741824, c17522c.f67762a, str), 2, c17522c.f67763b, str2), 4, c17522c.f67765d, str3);
                if (iM49765a == -1 || !set.containsAll(c17522c.f67764c)) {
                    r10 = 0;
                } else {
                    size = iM49765a + (c17522c.f67764c.size() * 4);
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new C17526g(r10, c17522c));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m49770c(List list, String str, C17525f c17525f) {
        ArrayList arrayListM49769b = m49769b(list, str, c17525f);
        for (int i13 = 0; i13 < arrayListM49769b.size(); i13++) {
            int i14 = ((C17526g) arrayListM49769b.get(i13)).f67790x.f67777p;
            if (i14 != -1) {
                return i14;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static C17523d m49771d(String str, Matcher matcher, C13117a c13117a, ArrayList arrayList) {
        C17527h c17527h = new C17527h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c17527h.f67791a = AbstractC17530k.m49776b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c17527h.f67792b = AbstractC17530k.m49776b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m49772e(strGroup3, c17527h);
            StringBuilder sb4 = new StringBuilder();
            String strM36700j = c13117a.m36700j();
            while (!TextUtils.isEmpty(strM36700j)) {
                if (sb4.length() > 0) {
                    sb4.append("\n");
                }
                sb4.append(strM36700j.trim());
                strM36700j = c13117a.m36700j();
            }
            c17527h.f67793c = m49773f(str, sb4.toString(), arrayList);
            return new C17523d(c17527h.m49767b().m123258a(), c17527h.f67791a, c17527h.f67792b);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m49772e(String str, C17527h c17527h) {
        int i13;
        int i14;
        int i15;
        Matcher matcher = f67803b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m49774g(strGroup2, c17527h);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i13 = 2;
                                break;
                            case "end":
                                i13 = 3;
                                break;
                            case "left":
                                i13 = 4;
                                break;
                            case "right":
                                i13 = 5;
                                break;
                            case "start":
                                i13 = 1;
                                break;
                            default:
                                Log.w("WebvttCueParser", strGroup2.length() != 0 ? "Invalid alignment value: ".concat(strGroup2) : new String("Invalid alignment value: "));
                                i13 = 2;
                                break;
                        }
                        c17527h.f67794d = i13;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i14 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i14 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i14 = 2;
                                    break;
                                default:
                                    Log.w("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                                    i14 = Integer.MIN_VALUE;
                                    break;
                            }
                            c17527h.f67799i = i14;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c17527h.f67798h = AbstractC17530k.m49775a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c17527h.f67800j = AbstractC17530k.m49775a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i15 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i15 = 1;
                        } else {
                            Log.w("WebvttCueParser", strGroup2.length() != 0 ? "Invalid 'vertical' value: ".concat(strGroup2) : new String("Invalid 'vertical' value: "));
                            i15 = Integer.MIN_VALUE;
                        }
                        c17527h.f67801k = i15;
                    } else {
                        StringBuilder sb4 = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                        sb4.append("Unknown cue setting ");
                        sb4.append(strGroup);
                        sb4.append(":");
                        sb4.append(strGroup2);
                        Log.w("WebvttCueParser", sb4.toString());
                    }
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static SpannedString m49773f(String str, String str2, List list) {
        char c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (true) {
            String strTrim = "";
            if (i13 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m49768a(str, (C17525f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m49768a(str, new C17525f("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i13);
            if (cCharAt == '&') {
                i13++;
                int iIndexOf = str2.indexOf(59, i13);
                int iIndexOf2 = str2.indexOf(32, i13);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i13, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            StringBuilder sb4 = new StringBuilder(strSubstring.length() + 33);
                            sb4.append("ignoring unsupported entity: '&");
                            sb4.append(strSubstring);
                            sb4.append(";'");
                            Log.w("WebvttCueParser", sb4.toString());
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i13 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i13++;
            } else {
                int length = i13 + 1;
                if (length < str2.length()) {
                    boolean z4 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i14 = length - 2;
                    boolean z13 = str2.charAt(i14) == '/';
                    int i15 = i13 + (z4 ? 2 : 1);
                    if (!z13) {
                        i14 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i15, i14);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC24543a.m71569e(!strTrim2.isEmpty());
                        int i16 = AbstractC24567y.f95875a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z4) {
                                    if (!z13) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        AbstractC24543a.m71569e(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c3 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c3 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c3];
                                        HashSet hashSet = new HashSet();
                                        for (int i17 = 1; i17 < strArrSplit.length; i17++) {
                                            hashSet.add(strArrSplit[i17]);
                                        }
                                        arrayDeque.push(new C17525f(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        C17525f c17525f = (C17525f) arrayDeque.pop();
                                        m49768a(str, c17525f, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C17524e(c17525f, spannableStringBuilder.length()));
                                        }
                                        if (c17525f.f67785a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i13 = length;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m49774g(String str, C17527h c17527h) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i13 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i13 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i13 = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                    i13 = Integer.MIN_VALUE;
                    break;
            }
            c17527h.f67797g = i13;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c17527h.f67795e = AbstractC17530k.m49775a(str);
            c17527h.f67796f = 0;
        } else {
            c17527h.f67795e = Integer.parseInt(str);
            c17527h.f67796f = 1;
        }
    }
}
