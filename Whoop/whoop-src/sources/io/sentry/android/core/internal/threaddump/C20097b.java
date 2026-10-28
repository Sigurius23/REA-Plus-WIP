package io.sentry.android.core.internal.threaddump;

import com.google.android.material.datepicker.C5020n;
import ih0.AbstractC18489d0;
import io.sentry.C20446o5;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20505z;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p014aj.C0929d;
import p098dt.AbstractC12350b;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: io.sentry.android.core.internal.threaddump.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20097b {

    /* JADX INFO: renamed from: f */
    public static final Pattern f75484f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g */
    public static final Pattern f75485g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f75486h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i */
    public static final Pattern f75487i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j */
    public static final Pattern f75488j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k */
    public static final Pattern f75489k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f75490l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m */
    public static final Pattern f75491m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n */
    public static final Pattern f75492n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o */
    public static final Pattern f75493o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p */
    public static final Pattern f75494p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q */
    public static final Pattern f75495q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a */
    public final C20513q6 f75496a;

    /* JADX INFO: renamed from: b */
    public final boolean f75497b;

    /* JADX INFO: renamed from: c */
    public final C0929d f75498c;

    /* JADX INFO: renamed from: d */
    public final HashMap f75499d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f75500e = new ArrayList();

    public C20097b(C20513q6 c20513q6, boolean z4) {
        this.f75496a = c20513q6;
        this.f75497b = z4;
        this.f75498c = new C0929d(c20513q6);
    }

    /* JADX INFO: renamed from: a */
    public static void m55974a(C20471c0 c20471c0, C20446o5 c20446o5) {
        Map map = c20471c0.f76625J;
        if (map == null) {
            map = new HashMap();
        }
        C20446o5 c20446o6 = (C20446o5) map.get(c20446o5.f76542x);
        if (c20446o6 != null) {
            c20446o6.f76541w = Math.max(c20446o6.f76541w, c20446o5.f76541w);
        } else {
            String str = c20446o5.f76542x;
            C20446o5 c20446o7 = new C20446o5();
            c20446o7.f76541w = c20446o5.f76541w;
            c20446o7.f76542x = str;
            c20446o7.f76543y = c20446o5.f76543y;
            c20446o7.f76544z = c20446o5.f76544z;
            c20446o7.f76539E = c20446o5.f76539E;
            c20446o7.f76540F = AbstractC12350b.m34553B(c20446o5.f76540F);
            map.put(str, c20446o7);
        }
        c20471c0.f76625J = map;
    }

    /* JADX INFO: renamed from: c */
    public static Long m55975c(Matcher matcher, int i13) {
        String strGroup = matcher.group(i13);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m55976e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m55977b() {
        return new ArrayList(this.f75499d.values());
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m55978d() {
        return this.f75500e;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0324 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0326  */
    /* JADX WARN: Code duplicated, block: B:103:0x0349  */
    /* JADX WARN: Code duplicated, block: B:105:0x034f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0351  */
    /* JADX WARN: Code duplicated, block: B:108:0x037f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0381  */
    /* JADX WARN: Code duplicated, block: B:111:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x038a  */
    /* JADX WARN: Code duplicated, block: B:115:0x03af  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x03bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x03be  */
    /* JADX WARN: Code duplicated, block: B:120:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:122:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:137:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03ea A[EDGE_INSN: B:139:0x03ea->B:126:0x03ea BREAK  A[LOOP:1: B:48:0x0170->B:125:0x03da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03ea A[EDGE_INSN: B:140:0x03ea->B:126:0x03ea BREAK  A[LOOP:1: B:48:0x0170->B:125:0x03da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x03da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0199  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code duplicated, block: B:75:0x022b  */
    /* JADX WARN: Code duplicated, block: B:78:0x024d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0250  */
    /* JADX WARN: Code duplicated, block: B:81:0x0256  */
    /* JADX WARN: Code duplicated, block: B:83:0x025e  */
    /* JADX WARN: Code duplicated, block: B:84:0x027c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0287  */
    /* JADX WARN: Code duplicated, block: B:88:0x0290  */
    /* JADX WARN: Code duplicated, block: B:90:0x0298  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x031e  */
    /* JADX INFO: renamed from: f */
    public final void m55979f(C5020n c5020n) {
        int i13;
        String str;
        C20513q6 c20513q6;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        C20505z c20505z;
        C20096a c20096aM15747t;
        String str2;
        String str3;
        Matcher matcher11;
        Matcher matcher12;
        C20505z c20505z2;
        String strGroup;
        Integer numValueOf;
        String strGroup2;
        String strM109967B;
        HashMap map;
        String strGroup3;
        Integer numValueOf2;
        boolean zEquals;
        boolean z4;
        C20097b c20097b = this;
        C5020n c5020n2 = c5020n;
        int i14 = c5020n2.f20931x;
        Pattern pattern = f75484f;
        String str4 = "";
        Matcher matcher13 = pattern.matcher("");
        Pattern pattern2 = f75485g;
        Matcher matcher14 = pattern2.matcher("");
        while (c5020n2.f20932y < i14) {
            C20096a c20096aM15747t2 = c5020n2.m15747t();
            String str5 = "Internal error while parsing thread dump.";
            C20513q6 c20513q7 = c20097b.f75496a;
            if (c20096aM15747t2 == null) {
                c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str6 = c20096aM15747t2.f75483a;
            if (m55976e(matcher13, str6) || m55976e(matcher14, str6)) {
                c5020n2.f20932y--;
                C20471c0 c20471c0 = new C20471c0();
                Matcher matcher15 = pattern.matcher(str4);
                Matcher matcher16 = pattern2.matcher(str4);
                if (c5020n2.f20932y >= i14) {
                    i13 = i14;
                    c20471c0 = null;
                } else {
                    C20096a c20096aM15747t3 = c5020n2.m15747t();
                    if (c20096aM15747t3 == null) {
                        c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str7 = c20096aM15747t3.f75483a;
                        if (m55976e(matcher15, str7)) {
                            Long lM55975c = m55975c(matcher15, 4);
                            if (lM55975c == null) {
                                c20513q7.getLogger().mo16066m(EnumC20436n5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                c20471c0.f76627w = lM55975c;
                                c20471c0.f76629y = matcher15.group(1);
                                String strGroup4 = matcher15.group(5);
                                if (strGroup4 != null) {
                                    if (strGroup4.contains(" ")) {
                                        c20471c0.f76630z = strGroup4.substring(0, strGroup4.indexOf(32));
                                    } else {
                                        c20471c0.f76630z = strGroup4;
                                    }
                                }
                                str = c20471c0.f76629y;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    c20471c0.f76623H = Boolean.valueOf(zEquals);
                                    c20471c0.f76620E = Boolean.valueOf(zEquals);
                                    if (zEquals || c20097b.f75497b) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    c20471c0.f76621F = Boolean.valueOf(z4);
                                }
                                c20513q6 = (C20513q6) c20097b.f75498c.f3422w;
                                arrayList = new ArrayList();
                                matcher = f75486h.matcher(str4);
                                matcher2 = f75487i.matcher(str4);
                                matcher3 = f75488j.matcher(str4);
                                matcher4 = f75489k.matcher(str4);
                                matcher5 = f75491m.matcher(str4);
                                matcher6 = f75490l.matcher(str4);
                                matcher7 = f75493o.matcher(str4);
                                matcher8 = f75492n.matcher(str4);
                                matcher9 = f75494p.matcher(str4);
                                matcher10 = f75495q.matcher(str4);
                                c20505z = null;
                                while (true) {
                                    if (c5020n2.f20932y >= i14) {
                                        c20096aM15747t = c5020n2.m15747t();
                                        if (c20096aM15747t == null) {
                                            c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, str5, new Object[0]);
                                        } else {
                                            str2 = c20096aM15747t.f75483a;
                                            i13 = i14;
                                            if (m55976e(matcher2, str2)) {
                                                c20505z = new C20505z();
                                                str3 = str5;
                                                String strM53370k = AbstractC18489d0.m53370k(matcher2.group(1), ".", matcher2.group(2));
                                                c20505z.f76825F = strM53370k;
                                                c20505z.f76824E = matcher2.group(3);
                                                c20505z.f76845z = matcher2.group(4);
                                                strGroup3 = matcher2.group(5);
                                                if (strGroup3 != null || strGroup3.length() == 0) {
                                                    numValueOf2 = null;
                                                } else {
                                                    int i15 = Integer.parseInt(strGroup3);
                                                    numValueOf2 = Integer.valueOf(i15);
                                                    if (i15 < 0) {
                                                        numValueOf2 = null;
                                                    }
                                                }
                                                c20505z.f76826G = numValueOf2;
                                                c20505z.f76830K = C0929d.m2335q(strM53370k, c20513q6.getInAppIncludes(), c20513q6.getInAppExcludes());
                                                arrayList.add(c20505z);
                                                matcher2 = matcher2;
                                            } else {
                                                str3 = str5;
                                                if (m55976e(matcher, str2)) {
                                                    c20505z2 = new C20505z();
                                                    c20505z2.f76831L = matcher.group(3);
                                                    c20505z2.f76824E = matcher.group(6);
                                                    strGroup = matcher.group(7);
                                                    if (strGroup != null || strGroup.length() == 0) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                                    }
                                                    c20505z2.f76826G = numValueOf;
                                                    c20505z2.f76836Q = "0x" + matcher.group(2);
                                                    c20505z2.f76833N = "native";
                                                    strGroup2 = matcher.group(8);
                                                    if (strGroup2 == null) {
                                                        strM109967B = null;
                                                    } else {
                                                        strM109967B = AbstractC34870c0.m109967B(strGroup2);
                                                    }
                                                    if (strM109967B != null) {
                                                        map = c20097b.f75499d;
                                                        if (!map.containsKey(strM109967B)) {
                                                            DebugImage debugImage = new DebugImage();
                                                            debugImage.setDebugId(strM109967B);
                                                            debugImage.setType("elf");
                                                            debugImage.setCodeFile(matcher.group(4));
                                                            debugImage.setCodeId(strGroup2);
                                                            map.put(strM109967B, debugImage);
                                                        }
                                                        c20505z2.f76837R = "rel:".concat(strM109967B);
                                                    } else {
                                                        matcher2 = matcher2;
                                                    }
                                                    arrayList.add(c20505z2);
                                                    c20505z = null;
                                                } else {
                                                    matcher2 = matcher2;
                                                    if (m55976e(matcher3, str2)) {
                                                        c20505z = new C20505z();
                                                        String strM53370k2 = AbstractC18489d0.m53370k(matcher3.group(1), ".", matcher3.group(2));
                                                        c20505z.f76825F = strM53370k2;
                                                        c20505z.f76824E = matcher3.group(3);
                                                        c20505z.f76830K = C0929d.m2335q(strM53370k2, c20513q6.getInAppIncludes(), c20513q6.getInAppExcludes());
                                                        c20505z.f76832M = Boolean.TRUE;
                                                        arrayList.add(c20505z);
                                                    } else if (m55976e(matcher4, str2)) {
                                                        if (c20505z != null) {
                                                            C20446o5 c20446o5 = new C20446o5();
                                                            c20446o5.f76541w = 1;
                                                            c20446o5.f76542x = matcher4.group(1);
                                                            c20446o5.f76543y = matcher4.group(2);
                                                            c20446o5.f76544z = matcher4.group(3);
                                                            c20505z.f76841V = c20446o5;
                                                            m55974a(c20471c0, c20446o5);
                                                        }
                                                    } else if (m55976e(matcher5, str2)) {
                                                        if (m55976e(matcher6, str2)) {
                                                            if (c20505z != null) {
                                                                C20446o5 c20446o6 = new C20446o5();
                                                                c20446o6.f76541w = 4;
                                                                c20446o6.f76542x = matcher6.group(1);
                                                                c20446o6.f76543y = matcher6.group(2);
                                                                c20446o6.f76544z = matcher6.group(3);
                                                                c20505z.f76841V = c20446o6;
                                                                m55974a(c20471c0, c20446o6);
                                                            }
                                                        } else if (m55976e(matcher7, str2)) {
                                                            if (c20505z != null) {
                                                                C20446o5 c20446o7 = new C20446o5();
                                                                c20446o7.f76541w = 8;
                                                                c20446o7.f76542x = matcher7.group(1);
                                                                c20446o7.f76543y = matcher7.group(2);
                                                                c20446o7.f76544z = matcher7.group(3);
                                                                c20446o7.f76539E = m55975c(matcher7, 4);
                                                                c20505z.f76841V = c20446o7;
                                                                m55974a(c20471c0, c20446o7);
                                                            }
                                                            matcher11 = matcher9;
                                                            matcher12 = matcher10;
                                                        } else {
                                                            if (m55976e(matcher8, str2)) {
                                                                matcher11 = matcher9;
                                                                if (m55976e(matcher11, str2)) {
                                                                    if (str2.length() != 0) {
                                                                        break;
                                                                    }
                                                                    matcher12 = matcher10;
                                                                    if (m55976e(matcher12, str2)) {
                                                                        break;
                                                                    }
                                                                } else if (c20505z != null) {
                                                                    C20446o5 c20446o8 = new C20446o5();
                                                                    c20446o8.f76541w = 8;
                                                                    c20505z.f76841V = c20446o8;
                                                                    m55974a(c20471c0, c20446o8);
                                                                }
                                                            } else {
                                                                if (c20505z != null) {
                                                                    C20446o5 c20446o9 = new C20446o5();
                                                                    c20446o9.f76541w = 8;
                                                                    c20446o9.f76542x = matcher8.group(1);
                                                                    c20446o9.f76543y = matcher8.group(2);
                                                                    c20446o9.f76544z = matcher8.group(3);
                                                                    c20505z.f76841V = c20446o9;
                                                                    m55974a(c20471c0, c20446o9);
                                                                }
                                                                matcher11 = matcher9;
                                                            }
                                                            matcher12 = matcher10;
                                                        }
                                                        c5020n2 = c5020n;
                                                        matcher9 = matcher11;
                                                        matcher10 = matcher12;
                                                        matcher2 = matcher2;
                                                        str5 = str3;
                                                        i14 = i13;
                                                        c20097b = this;
                                                    } else if (c20505z != null) {
                                                        C20446o5 c20446o10 = new C20446o5();
                                                        c20446o10.f76541w = 2;
                                                        c20446o10.f76542x = matcher5.group(1);
                                                        c20446o10.f76543y = matcher5.group(2);
                                                        c20446o10.f76544z = matcher5.group(3);
                                                        c20505z.f76841V = c20446o10;
                                                        m55974a(c20471c0, c20446o10);
                                                    }
                                                }
                                            }
                                            matcher11 = matcher9;
                                            matcher12 = matcher10;
                                            c5020n2 = c5020n;
                                            matcher9 = matcher11;
                                            matcher10 = matcher12;
                                            matcher2 = matcher2;
                                            str5 = str3;
                                            i14 = i13;
                                            c20097b = this;
                                        }
                                    }
                                    i13 = i14;
                                    break;
                                }
                                Collections.reverse(arrayList);
                                C20469b0 c20469b0 = new C20469b0(arrayList);
                                c20469b0.f76616y = Boolean.TRUE;
                                c20471c0.f76624I = c20469b0;
                            }
                        } else {
                            if (m55976e(matcher16, str7)) {
                                Long lM55975c2 = m55975c(matcher16, 3);
                                if (lM55975c2 == null) {
                                    c20513q7.getLogger().mo16066m(EnumC20436n5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    c20471c0.f76627w = lM55975c2;
                                    c20471c0.f76629y = matcher16.group(1);
                                }
                            }
                            str = c20471c0.f76629y;
                            if (str != null) {
                                zEquals = str.equals("main");
                                c20471c0.f76623H = Boolean.valueOf(zEquals);
                                c20471c0.f76620E = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                c20471c0.f76621F = Boolean.valueOf(z4);
                            }
                            c20513q6 = (C20513q6) c20097b.f75498c.f3422w;
                            arrayList = new ArrayList();
                            matcher = f75486h.matcher(str4);
                            matcher2 = f75487i.matcher(str4);
                            matcher3 = f75488j.matcher(str4);
                            matcher4 = f75489k.matcher(str4);
                            matcher5 = f75491m.matcher(str4);
                            matcher6 = f75490l.matcher(str4);
                            matcher7 = f75493o.matcher(str4);
                            matcher8 = f75492n.matcher(str4);
                            matcher9 = f75494p.matcher(str4);
                            matcher10 = f75495q.matcher(str4);
                            c20505z = null;
                            while (true) {
                                if (c5020n2.f20932y >= i14) {
                                    c20096aM15747t = c5020n2.m15747t();
                                    if (c20096aM15747t == null) {
                                        c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, str5, new Object[0]);
                                    } else {
                                        str2 = c20096aM15747t.f75483a;
                                        i13 = i14;
                                        if (m55976e(matcher2, str2)) {
                                            c20505z = new C20505z();
                                            str3 = str5;
                                            String strM53370k3 = AbstractC18489d0.m53370k(matcher2.group(1), ".", matcher2.group(2));
                                            c20505z.f76825F = strM53370k3;
                                            c20505z.f76824E = matcher2.group(3);
                                            c20505z.f76845z = matcher2.group(4);
                                            strGroup3 = matcher2.group(5);
                                            if (strGroup3 != null) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            c20505z.f76826G = numValueOf2;
                                            c20505z.f76830K = C0929d.m2335q(strM53370k3, c20513q6.getInAppIncludes(), c20513q6.getInAppExcludes());
                                            arrayList.add(c20505z);
                                            matcher2 = matcher2;
                                        } else {
                                            str3 = str5;
                                            if (m55976e(matcher, str2)) {
                                                c20505z2 = new C20505z();
                                                c20505z2.f76831L = matcher.group(3);
                                                c20505z2.f76824E = matcher.group(6);
                                                strGroup = matcher.group(7);
                                                if (strGroup != null) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                                c20505z2.f76826G = numValueOf;
                                                c20505z2.f76836Q = "0x" + matcher.group(2);
                                                c20505z2.f76833N = "native";
                                                strGroup2 = matcher.group(8);
                                                if (strGroup2 == null) {
                                                    strM109967B = null;
                                                } else {
                                                    strM109967B = AbstractC34870c0.m109967B(strGroup2);
                                                }
                                                if (strM109967B != null) {
                                                    map = c20097b.f75499d;
                                                    if (!map.containsKey(strM109967B)) {
                                                        DebugImage debugImage2 = new DebugImage();
                                                        debugImage2.setDebugId(strM109967B);
                                                        debugImage2.setType("elf");
                                                        debugImage2.setCodeFile(matcher.group(4));
                                                        debugImage2.setCodeId(strGroup2);
                                                        map.put(strM109967B, debugImage2);
                                                    }
                                                    c20505z2.f76837R = "rel:".concat(strM109967B);
                                                } else {
                                                    matcher2 = matcher2;
                                                }
                                                arrayList.add(c20505z2);
                                                c20505z = null;
                                            } else {
                                                matcher2 = matcher2;
                                                if (m55976e(matcher3, str2)) {
                                                    c20505z = new C20505z();
                                                    String strM53370k4 = AbstractC18489d0.m53370k(matcher3.group(1), ".", matcher3.group(2));
                                                    c20505z.f76825F = strM53370k4;
                                                    c20505z.f76824E = matcher3.group(3);
                                                    c20505z.f76830K = C0929d.m2335q(strM53370k4, c20513q6.getInAppIncludes(), c20513q6.getInAppExcludes());
                                                    c20505z.f76832M = Boolean.TRUE;
                                                    arrayList.add(c20505z);
                                                } else if (m55976e(matcher4, str2)) {
                                                    if (c20505z != null) {
                                                        C20446o5 c20446o11 = new C20446o5();
                                                        c20446o11.f76541w = 1;
                                                        c20446o11.f76542x = matcher4.group(1);
                                                        c20446o11.f76543y = matcher4.group(2);
                                                        c20446o11.f76544z = matcher4.group(3);
                                                        c20505z.f76841V = c20446o11;
                                                        m55974a(c20471c0, c20446o11);
                                                    }
                                                } else if (m55976e(matcher5, str2)) {
                                                    if (m55976e(matcher6, str2)) {
                                                        if (c20505z != null) {
                                                            C20446o5 c20446o12 = new C20446o5();
                                                            c20446o12.f76541w = 4;
                                                            c20446o12.f76542x = matcher6.group(1);
                                                            c20446o12.f76543y = matcher6.group(2);
                                                            c20446o12.f76544z = matcher6.group(3);
                                                            c20505z.f76841V = c20446o12;
                                                            m55974a(c20471c0, c20446o12);
                                                        }
                                                    } else if (m55976e(matcher7, str2)) {
                                                        if (c20505z != null) {
                                                            C20446o5 c20446o13 = new C20446o5();
                                                            c20446o13.f76541w = 8;
                                                            c20446o13.f76542x = matcher7.group(1);
                                                            c20446o13.f76543y = matcher7.group(2);
                                                            c20446o13.f76544z = matcher7.group(3);
                                                            c20446o13.f76539E = m55975c(matcher7, 4);
                                                            c20505z.f76841V = c20446o13;
                                                            m55974a(c20471c0, c20446o13);
                                                        }
                                                        matcher11 = matcher9;
                                                        matcher12 = matcher10;
                                                    } else {
                                                        if (m55976e(matcher8, str2)) {
                                                            matcher11 = matcher9;
                                                            if (m55976e(matcher11, str2)) {
                                                                if (str2.length() != 0) {
                                                                    break;
                                                                    break;
                                                                }
                                                                matcher12 = matcher10;
                                                                if (m55976e(matcher12, str2)) {
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (c20505z != null) {
                                                                C20446o5 c20446o14 = new C20446o5();
                                                                c20446o14.f76541w = 8;
                                                                c20505z.f76841V = c20446o14;
                                                                m55974a(c20471c0, c20446o14);
                                                            }
                                                        } else {
                                                            if (c20505z != null) {
                                                                C20446o5 c20446o15 = new C20446o5();
                                                                c20446o15.f76541w = 8;
                                                                c20446o15.f76542x = matcher8.group(1);
                                                                c20446o15.f76543y = matcher8.group(2);
                                                                c20446o15.f76544z = matcher8.group(3);
                                                                c20505z.f76841V = c20446o15;
                                                                m55974a(c20471c0, c20446o15);
                                                            }
                                                            matcher11 = matcher9;
                                                        }
                                                        matcher12 = matcher10;
                                                    }
                                                    c5020n2 = c5020n;
                                                    matcher9 = matcher11;
                                                    matcher10 = matcher12;
                                                    matcher2 = matcher2;
                                                    str5 = str3;
                                                    i14 = i13;
                                                    c20097b = this;
                                                } else if (c20505z != null) {
                                                    C20446o5 c20446o16 = new C20446o5();
                                                    c20446o16.f76541w = 2;
                                                    c20446o16.f76542x = matcher5.group(1);
                                                    c20446o16.f76543y = matcher5.group(2);
                                                    c20446o16.f76544z = matcher5.group(3);
                                                    c20505z.f76841V = c20446o16;
                                                    m55974a(c20471c0, c20446o16);
                                                }
                                            }
                                        }
                                        matcher11 = matcher9;
                                        matcher12 = matcher10;
                                        c5020n2 = c5020n;
                                        matcher9 = matcher11;
                                        matcher10 = matcher12;
                                        matcher2 = matcher2;
                                        str5 = str3;
                                        i14 = i13;
                                        c20097b = this;
                                    }
                                }
                                i13 = i14;
                                break;
                            }
                            Collections.reverse(arrayList);
                            C20469b0 c20469b1 = new C20469b0(arrayList);
                            c20469b1.f76616y = Boolean.TRUE;
                            c20471c0.f76624I = c20469b1;
                        }
                    }
                    i13 = i14;
                    c20471c0 = null;
                }
                c20097b = this;
                if (c20471c0 != null) {
                    c20097b.f75500e.add(c20471c0);
                }
            } else {
                i13 = i14;
                pattern = pattern;
                str4 = str4;
                matcher13 = matcher13;
                pattern2 = pattern2;
                matcher14 = matcher14;
            }
            c5020n2 = c5020n;
            pattern = pattern;
            matcher13 = matcher13;
            pattern2 = pattern2;
            matcher14 = matcher14;
            str4 = str4;
            i14 = i13;
        }
    }
}
