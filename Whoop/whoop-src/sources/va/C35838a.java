package va;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p576w8.C36932b;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35838a implements InterfaceC30107l {

    /* JADX INFO: renamed from: w */
    public final StringBuilder f152573w = new StringBuilder();

    /* JADX INFO: renamed from: x */
    public final ArrayList f152574x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public final C38059n f152575y = new C38059n();

    /* JADX INFO: renamed from: z */
    public static final Pattern f152572z = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: E */
    public static final Pattern f152571E = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX INFO: renamed from: a */
    public static C36932b m113747a(Spanned spanned, String str) {
        int i13;
        int i14;
        float f13;
        if (str == null) {
            return new C36932b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i13 = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i13 = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i13 = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                break;
            default:
                i13 = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i14 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i14 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i14 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                break;
            default:
                i14 = 1;
                break;
        }
        float f14 = 0.92f;
        if (i13 == 0) {
            f13 = 0.08f;
        } else if (i13 == 1) {
            f13 = 0.5f;
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            f13 = 0.92f;
        }
        if (i14 == 0) {
            f14 = 0.08f;
        } else if (i14 == 1) {
            f14 = 0.5f;
        } else if (i14 != 2) {
            throw new IllegalArgumentException();
        }
        return new C36932b(spanned, null, null, null, f14, 0, i14, f13, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public static long m113748b(Matcher matcher, int i13) {
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

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public final int mo91110c0() {
        return 1;
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public final void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        String str;
        C35838a c35838a = this;
        long j7 = c30106k.f122845a;
        C38059n c38059n = c35838a.f152575y;
        c38059n.m121844D(i13 + i14, bArr);
        c38059n.m121846F(i13);
        Charset charsetM121842B = c38059n.m121842B();
        if (charsetM121842B == null) {
            charsetM121842B = StandardCharsets.UTF_8;
        }
        long j13 = -9223372036854775807L;
        ArrayList arrayList = (j7 == -9223372036854775807L || !c30106k.f122846b) ? null : new ArrayList();
        while (true) {
            String strM121855h = c38059n.m121855h(charsetM121842B);
            if (strM121855h == null) {
                break;
            }
            if (strM121855h.length() != 0) {
                try {
                    Integer.parseInt(strM121855h);
                    String strM121855h2 = c38059n.m121855h(charsetM121842B);
                    if (strM121855h2 == null) {
                        AbstractC38046a.m121826u("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f152572z.matcher(strM121855h2);
                    if (matcher.matches()) {
                        long jM113748b = m113748b(matcher, 1);
                        long jM113748b2 = m113748b(matcher, 6);
                        StringBuilder sb4 = c35838a.f152573w;
                        sb4.setLength(0);
                        long j14 = j13;
                        ArrayList arrayList2 = c35838a.f152574x;
                        arrayList2.clear();
                        for (String strM121855h3 = c38059n.m121855h(charsetM121842B); !TextUtils.isEmpty(strM121855h3); strM121855h3 = c38059n.m121855h(charsetM121842B)) {
                            if (sb4.length() > 0) {
                                sb4.append("<br>");
                            }
                            String strTrim = strM121855h3.trim();
                            StringBuilder sb5 = new StringBuilder(strTrim);
                            Matcher matcher2 = f152571E.matcher(strTrim);
                            int i15 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i15;
                                int length = strGroup.length();
                                sb5.replace(iStart, iStart + length, "");
                                i15 += length;
                                j7 = j7;
                            }
                            sb4.append(sb5.toString());
                        }
                        long j15 = j7;
                        Spanned spannedFromHtml = Html.fromHtml(sb4.toString());
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i16);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (j15 == j14 || jM113748b >= j15) {
                            interfaceC38049d.accept(new C30096a(AbstractC41023g0.m133256r(m113747a(spannedFromHtml, str)), jM113748b, jM113748b2 - jM113748b));
                        } else if (arrayList != null) {
                            arrayList.add(new C30096a(AbstractC41023g0.m133256r(m113747a(spannedFromHtml, str)), jM113748b, jM113748b2 - jM113748b));
                        }
                        c35838a = this;
                        j13 = j14;
                        j7 = j15;
                    } else {
                        AbstractC38046a.m121826u("SubripParser", "Skipping invalid timing: ".concat(strM121855h2));
                        c35838a = this;
                    }
                } catch (NumberFormatException unused) {
                    AbstractC38046a.m121826u("SubripParser", "Skipping invalid index: ".concat(strM121855h));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC38049d.accept((C30096a) it.next());
            }
        }
    }
}
