package za;

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
import java.nio.charset.StandardCharsets;
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
import p199ho.C17527h;
import p484s9.AbstractC32281f;
import p576w8.C36935e;
import p576w8.C36937g;
import p576w8.C36939i;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: za.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC40219g {

    /* JADX INFO: renamed from: a */
    public static final Pattern f173674a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f173675b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f173676c;

    /* JADX INFO: renamed from: d */
    public static final Map f173677d;

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
        f173676c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        AbstractC38963t7.m124387q(255, 255, 255, map2, "bg_white");
        AbstractC38963t7.m124387q(0, 255, 0, map2, "bg_lime");
        AbstractC38963t7.m124387q(0, 255, 255, map2, "bg_cyan");
        AbstractC38963t7.m124387q(255, 0, 0, map2, "bg_red");
        AbstractC38963t7.m124387q(255, 255, 0, map2, "bg_yellow");
        AbstractC38963t7.m124387q(255, 0, 255, map2, "bg_magenta");
        AbstractC38963t7.m124387q(0, 0, 255, map2, "bg_blue");
        AbstractC38963t7.m124387q(0, 0, 0, map2, "bg_black");
        f173677d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m129102a(String str, C40217e c40217e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i13;
        int i14;
        int i15;
        int i16 = c40217e.f173669b;
        int length = spannableStringBuilder.length();
        String str2 = c40217e.f173668a;
        str2.getClass();
        int i17 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i16, length, 33);
                break;
            case "c":
                for (String str3 : c40217e.f173671d) {
                    Map map = f173676c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i16, length, 33);
                    } else {
                        Map map2 = f173677d;
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
            case "v":
                spannableStringBuilder.setSpan(new C36939i(c40217e.f173670c), i16, length, 33);
                break;
            case "ruby":
                int iM129104c = m129104c(list2, str, c40217e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C40216d.f173665c);
                int i18 = c40217e.f173669b;
                int i19 = 0;
                int length2 = 0;
                while (i19 < arrayList.size()) {
                    if ("rt".equals(((C40216d) arrayList.get(i19)).f173666a.f173668a)) {
                        C40216d c40216d = (C40216d) arrayList.get(i19);
                        int iM129104c2 = m129104c(list2, str, c40216d.f173666a);
                        if (iM129104c2 == i17) {
                            iM129104c2 = iM129104c != i17 ? iM129104c : 1;
                        }
                        int i24 = c40216d.f173666a.f173669b - length2;
                        int i25 = c40216d.f173667b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i24, i25);
                        spannableStringBuilder.delete(i24, i25);
                        spannableStringBuilder.setSpan(new C36937g(charSequenceSubSequence.toString(), iM129104c2), i18, i24, 33);
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
        ArrayList arrayListM129103b = m129103b(list2, str, c40217e);
        for (int i26 = 0; i26 < arrayListM129103b.size(); i26++) {
            C40214b c40214b = ((C40218f) arrayListM129103b.get(i26)).f173673x;
            int i27 = c40214b.f173656l;
            if (i27 == -1 && c40214b.f173657m == -1) {
                i13 = -1;
            } else {
                i13 = (c40214b.f173657m == 1 ? (char) 2 : (char) 0) | (i27 == 1 ? (char) 1 : (char) 0);
            }
            if (i13 != -1) {
                int i28 = c40214b.f173656l;
                if (i28 == -1 && c40214b.f173657m == -1) {
                    i15 = -1;
                    i14 = 1;
                } else {
                    i14 = 1;
                    i15 = (i28 == 1 ? 1 : 0) | (c40214b.f173657m == 1 ? 2 : 0);
                }
                AbstractC32281f.m100449o(spannableStringBuilder, new StyleSpan(i15), i16, length);
            } else {
                i14 = 1;
            }
            if (c40214b.f173654j == i14) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i16, length, 33);
            }
            if (c40214b.f173655k == i14) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i16, length, 33);
            }
            if (c40214b.f173651g) {
                if (!c40214b.f173651g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC32281f.m100449o(spannableStringBuilder, new ForegroundColorSpan(c40214b.f173650f), i16, length);
            }
            if (c40214b.f173653i) {
                if (!c40214b.f173653i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC32281f.m100449o(spannableStringBuilder, new BackgroundColorSpan(c40214b.f173652h), i16, length);
            }
            if (c40214b.f173649e != null) {
                AbstractC32281f.m100449o(spannableStringBuilder, new TypefaceSpan(c40214b.f173649e), i16, length);
            }
            int i29 = c40214b.f173658n;
            if (i29 == 1) {
                AbstractC32281f.m100449o(spannableStringBuilder, new AbsoluteSizeSpan((int) c40214b.f173659o, true), i16, length);
            } else if (i29 == 2) {
                AbstractC32281f.m100449o(spannableStringBuilder, new RelativeSizeSpan(c40214b.f173659o), i16, length);
            } else if (i29 == 3) {
                AbstractC32281f.m100449o(spannableStringBuilder, new RelativeSizeSpan(c40214b.f173659o / 100.0f), i16, length);
            }
            if (c40214b.f173661q) {
                spannableStringBuilder.setSpan(new C36935e(), i16, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m129103b(List list, String str, C40217e c40217e) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C40214b c40214b = (C40214b) list.get(i13);
            String str2 = c40217e.f173668a;
            Set set = c40217e.f173671d;
            String str3 = c40217e.f173670c;
            if (c40214b.f173645a.isEmpty() && c40214b.f173646b.isEmpty() && c40214b.f173647c.isEmpty() && c40214b.f173648d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM129101a = C40214b.m129101a(C40214b.m129101a(C40214b.m129101a(0, 1073741824, c40214b.f173645a, str), 2, c40214b.f173646b, str2), 4, c40214b.f173648d, str3);
                if (iM129101a == -1 || !set.containsAll(c40214b.f173647c)) {
                    r10 = 0;
                } else {
                    size = iM129101a + (c40214b.f173647c.size() * 4);
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new C40218f(r10, c40214b));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m129104c(List list, String str, C40217e c40217e) {
        ArrayList arrayListM129103b = m129103b(list, str, c40217e);
        for (int i13 = 0; i13 < arrayListM129103b.size(); i13++) {
            int i14 = ((C40218f) arrayListM129103b.get(i13)).f173673x.f173660p;
            if (i14 != -1) {
                return i14;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static C40215c m129105d(String str, Matcher matcher, C38059n c38059n, ArrayList arrayList) {
        C17527h c17527h = new C17527h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c17527h.f67791a = AbstractC40220h.m129110b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c17527h.f67792b = AbstractC40220h.m129110b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m129106e(strGroup3, c17527h);
            StringBuilder sb4 = new StringBuilder();
            c38059n.getClass();
            String strM121855h = c38059n.m121855h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM121855h)) {
                if (sb4.length() > 0) {
                    sb4.append("\n");
                }
                sb4.append(strM121855h.trim());
                strM121855h = c38059n.m121855h(StandardCharsets.UTF_8);
            }
            c17527h.f67793c = m129107f(str, sb4.toString(), arrayList);
            return new C40215c(c17527h.m49766a().m118550a(), c17527h.f67791a, c17527h.f67792b);
        } catch (IllegalArgumentException unused) {
            AbstractC38046a.m121826u("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m129106e(String str, C17527h c17527h) {
        int i13;
        int i14;
        int i15;
        Matcher matcher = f173675b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m129108g(strGroup2, c17527h);
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
                                AbstractC38046a.m121826u("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
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
                                    AbstractC38046a.m121826u("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i14 = Integer.MIN_VALUE;
                                    break;
                            }
                            c17527h.f67799i = i14;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c17527h.f67798h = AbstractC40220h.m129109a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c17527h.f67800j = AbstractC40220h.m129109a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i15 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i15 = 1;
                        } else {
                            AbstractC38046a.m121826u("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i15 = Integer.MIN_VALUE;
                        }
                        c17527h.f67801k = i15;
                    } else {
                        AbstractC38046a.m121826u("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                AbstractC38046a.m121826u("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static SpannedString m129107f(String str, String str2, List list) {
        char c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (true) {
            String strTrim = "";
            if (i13 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m129102a(str, (C40217e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m129102a(str, new C40217e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
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
                            AbstractC38046a.m121826u("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
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
                        AbstractC35849g.m113802d(!strTrim2.isEmpty());
                        int i16 = AbstractC38065t.f163031a;
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
                                        AbstractC35849g.m113802d(!strTrim3.isEmpty());
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
                                        arrayDeque.push(new C40217e(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        C40217e c40217e = (C40217e) arrayDeque.pop();
                                        m129102a(str, c40217e, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C40216d(c40217e, spannableStringBuilder.length()));
                                        }
                                        if (c40217e.f173668a.equals(str3)) {
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
    public static void m129108g(String str, C17527h c17527h) {
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
                    AbstractC38046a.m121826u("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i13 = Integer.MIN_VALUE;
                    break;
            }
            c17527h.f67797g = i13;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c17527h.f67795e = AbstractC40220h.m129109a(str);
            c17527h.f67796f = 0;
        } else {
            c17527h.f67795e = Integer.parseInt(str);
            c17527h.f67796f = 1;
        }
    }
}
