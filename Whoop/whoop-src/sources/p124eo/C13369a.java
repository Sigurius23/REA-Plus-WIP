package p124eo;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import ed3.C13117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p621xn.AbstractC38467d;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import qg3.C30352d;

/* JADX INFO: renamed from: eo.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13369a extends AbstractC38467d {

    /* JADX INFO: renamed from: o */
    public static final Pattern f46777o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p */
    public static final Pattern f46778p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m */
    public final StringBuilder f46779m = new StringBuilder();

    /* JADX INFO: renamed from: n */
    public final ArrayList f46780n = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static long m37664h(Matcher matcher, int i13) {
        String strGroup = matcher.group(i13 + 1);
        long j7 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i13 + 2);
        strGroup2.getClass();
        long j13 = (Long.parseLong(strGroup2) * 60000) + j7;
        String strGroup3 = matcher.group(i13 + 3);
        strGroup3.getClass();
        long j14 = (Long.parseLong(strGroup3) * 1000) + j13;
        String strGroup4 = matcher.group(i13 + 4);
        if (strGroup4 != null) {
            j14 += Long.parseLong(strGroup4);
        }
        return j14 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) {
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        float f13;
        float f14;
        C38465b c38465b;
        this = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        C13117a c13117a = new C13117a(bArr, i13, 1, false);
        int i18 = 0;
        int i19 = 0;
        while (true) {
            String strM36700j = c13117a.m36700j();
            if (strM36700j != null) {
                if (strM36700j.length() != 0) {
                    try {
                        Integer.parseInt(strM36700j);
                        String strM36700j2 = c13117a.m36700j();
                        if (strM36700j2 == null) {
                            Log.w("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f46777o.matcher(strM36700j2);
                            if (matcher.matches()) {
                                long jM37664h = m37664h(matcher, 1);
                                if (i19 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19 * 2);
                                }
                                int i24 = i19 + 1;
                                jArrCopyOf[i19] = jM37664h;
                                long jM37664h2 = m37664h(matcher, 6);
                                if (i24 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i24 * 2);
                                }
                                i19 += 2;
                                jArrCopyOf[i24] = jM37664h2;
                                StringBuilder sb4 = this.f46779m;
                                sb4.setLength(i18);
                                ArrayList arrayList2 = this.f46780n;
                                arrayList2.clear();
                                String strM36700j3 = c13117a.m36700j();
                                while (!TextUtils.isEmpty(strM36700j3)) {
                                    if (sb4.length() > 0) {
                                        sb4.append("<br>");
                                    }
                                    String strTrim = strM36700j3.trim();
                                    StringBuilder sb5 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f46778p.matcher(strTrim);
                                    int i25 = i18;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i25;
                                        int length = strGroup.length();
                                        sb5.replace(iStart, iStart + length, "");
                                        i25 += length;
                                    }
                                    sb4.append(sb5.toString());
                                    strM36700j3 = c13117a.m36700j();
                                    i18 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb4.toString());
                                int i26 = 0;
                                while (true) {
                                    if (i26 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i26);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i26++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    c38465b = new C38465b(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            str.equals("{\\an2}");
                                            i14 = 1;
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 0;
                                            }
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i14 = 1;
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 2;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 0;
                                            }
                                            break;
                                        case -685620493:
                                            str.equals("{\\an8}");
                                            i14 = 1;
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                i14 = 1;
                                            } else {
                                                i14 = 2;
                                            }
                                            break;
                                        default:
                                            i14 = 1;
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 2;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 2;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            str.equals("{\\an4}");
                                            i15 = 1;
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i15 = 1;
                                            break;
                                        case -685620555:
                                            str.equals("{\\an6}");
                                            i15 = 1;
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 0;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 0;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                i15 = 1;
                                            } else {
                                                i15 = 0;
                                            }
                                            break;
                                        default:
                                            i15 = 1;
                                            break;
                                    }
                                    if (i14 != 0) {
                                        i16 = 1;
                                        if (i14 != 1) {
                                            i17 = 2;
                                            if (i14 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f13 = 0.92f;
                                        } else {
                                            i17 = 2;
                                            f13 = 0.5f;
                                        }
                                    } else {
                                        i16 = 1;
                                        i17 = 2;
                                        f13 = 0.08f;
                                    }
                                    if (i15 == 0) {
                                        f14 = 0.08f;
                                    } else if (i15 == i16) {
                                        f14 = 0.5f;
                                    } else {
                                        if (i15 != i17) {
                                            throw new IllegalArgumentException();
                                        }
                                        f14 = 0.92f;
                                    }
                                    c38465b = new C38465b(spannedFromHtml, null, null, null, f14, 0, i15, f13, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(c38465b);
                                arrayList.add(C38465b.f164723R);
                                jArrCopyOf = jArrCopyOf;
                            } else {
                                Log.w("SubripDecoder", strM36700j2.length() != 0 ? "Skipping invalid timing: ".concat(strM36700j2) : new String("Skipping invalid timing: "));
                            }
                            i18 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        Log.w("SubripDecoder", strM36700j.length() != 0 ? "Skipping invalid index: ".concat(strM36700j) : new String("Skipping invalid index: "));
                    }
                }
            }
        }
        return new C30352d(11, (C38465b[]) arrayList.toArray(new C38465b[i18]), Arrays.copyOf(jArrCopyOf, i19));
    }
}
