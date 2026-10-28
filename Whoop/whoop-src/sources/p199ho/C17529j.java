package p199ho;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import ed3.C13117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24544b;
import p309lo.AbstractC24567y;
import p460rg.AbstractC31375j;
import p621xn.AbstractC38467d;
import p621xn.InterfaceC38468e;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: ho.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C17529j extends AbstractC38467d {

    /* JADX INFO: renamed from: m */
    public final C13117a f67806m = new C13117a();

    /* JADX INFO: renamed from: n */
    public final C17521b f67807n = new C17521b();

    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0240  */
    /* JADX WARN: Code duplicated, block: B:130:0x024b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:133:0x025e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0266  */
    /* JADX WARN: Code duplicated, block: B:137:0x026e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0272  */
    /* JADX WARN: Code duplicated, block: B:140:0x027a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0281  */
    /* JADX WARN: Code duplicated, block: B:143:0x0289  */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:174:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x032a  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0344  */
    /* JADX WARN: Code duplicated, block: B:182:0x0346  */
    /* JADX WARN: Code duplicated, block: B:185:0x034f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0351  */
    /* JADX WARN: Code duplicated, block: B:189:0x035a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0364  */
    /* JADX WARN: Code duplicated, block: B:194:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x036e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0381  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:238:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) throws SubtitleDecoderException {
        C17523d c17523dM49771d;
        String strTrim;
        int i14;
        String string;
        int i15;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z13;
        C17529j c17529j = this;
        C13117a c13117a = c17529j.f67806m;
        c13117a.m36687I(i13, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC17530k.m49777c(c13117a);
            while (!TextUtils.isEmpty(c13117a.m36700j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z14 = false;
                int i16 = -1;
                int i17 = 0;
                byte b6 = -1;
                while (true) {
                    int i18 = 1;
                    if (b6 == -1) {
                        i17 = c13117a.f45382b;
                        String strM36700j = c13117a.m36700j();
                        if (strM36700j == null) {
                            b6 = 0;
                        } else if ("STYLE".equals(strM36700j)) {
                            b6 = 2;
                        } else {
                            b6 = strM36700j.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        c13117a.m36689K(i17);
                        if (b6 == 0) {
                            return new C17531l(arrayList2, 0);
                        }
                        if (b6 == 1) {
                            while (!TextUtils.isEmpty(c13117a.m36700j())) {
                            }
                        } else {
                            String str = null;
                            if (b6 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                                }
                                c13117a.m36700j();
                                C17521b c17521b = c17529j.f67807n;
                                C13117a c13117a2 = c17521b.f67760a;
                                StringBuilder sb4 = c17521b.f67761b;
                                sb4.setLength(0);
                                int i19 = c13117a.f45382b;
                                while (!TextUtils.isEmpty(c13117a.m36700j())) {
                                }
                                c13117a2.m36687I(c13117a.f45382b, c13117a.f45381a);
                                c13117a2.m36689K(i19);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    C17521b.m49764c(c13117a2);
                                    if (c13117a2.m36692a() >= 5 && "::cue".equals(c13117a2.m36712v(5, AbstractC39717d.f170958c))) {
                                        int i24 = c13117a2.f45382b;
                                        String strM49763b = C17521b.m49763b(c13117a2, sb4);
                                        if (strM49763b == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strM49763b)) {
                                            c13117a2.m36689K(i24);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strM49763b)) {
                                                int i25 = c13117a2.f45382b;
                                                int i26 = c13117a2.f45383c;
                                                int i27 = z14 ? 1 : 0;
                                                while (i25 < i26 && i27 == 0) {
                                                    int i28 = i25 + 1;
                                                    i27 = ((char) c13117a2.f45381a[i25]) == ')' ? i18 : z14 ? 1 : 0;
                                                    i25 = i28;
                                                }
                                                strTrim = c13117a2.m36712v((i25 - 1) - c13117a2.f45382b, AbstractC39717d.f170958c).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(C17521b.m49763b(c13117a2, sb4))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(C17521b.m49763b(c13117a2, sb4))) {
                                        C17522c c17522c = new C17522c();
                                        c17522c.f67762a = "";
                                        c17522c.f67763b = "";
                                        c17522c.f67764c = Collections.EMPTY_SET;
                                        c17522c.f67765d = "";
                                        c17522c.f67766e = str;
                                        c17522c.f67768g = z14;
                                        c17522c.f67770i = z14;
                                        c17522c.f67771j = i16;
                                        c17522c.f67772k = i16;
                                        c17522c.f67773l = i16;
                                        c17522c.f67774m = i16;
                                        c17522c.f67775n = i16;
                                        c17522c.f67777p = i16;
                                        c17522c.f67778q = z14;
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i16) {
                                                Matcher matcher2 = C17521b.f67758c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i18);
                                                    strGroup2.getClass();
                                                    c17522c.f67765d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z14 ? 1 : 0, iIndexOf);
                                            }
                                            int i29 = AbstractC24567y.f95875a;
                                            String[] strArrSplit = strTrim.split("\\.", i16);
                                            String str2 = strArrSplit[z14 ? 1 : 0];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i16) {
                                                c17522c.f67763b = str2.substring(z14 ? 1 : 0, iIndexOf2);
                                                c17522c.f67762a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                c17522c.f67763b = str2;
                                            }
                                            if (strArrSplit.length > i18) {
                                                int length = strArrSplit.length;
                                                AbstractC24543a.m71569e(length <= strArrSplit.length ? i18 : z14 ? 1 : 0);
                                                c17522c.f67764c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i18, length)));
                                            }
                                        }
                                        ?? r10 = z14 ? 1 : 0;
                                        String strM49763b2 = null;
                                        while (r10 == 0) {
                                            int i34 = c13117a2.f45382b;
                                            strM49763b2 = C17521b.m49763b(c13117a2, sb4);
                                            ?? r14 = (strM49763b2 == null || "}".equals(strM49763b2)) ? i18 : z14;
                                            if (r14 == 0) {
                                                c13117a2.m36689K(i34);
                                                C17521b.m49764c(c13117a2);
                                                String strM49762a = C17521b.m49762a(c13117a2, sb4);
                                                if (!"".equals(strM49762a) && ":".equals(C17521b.m49763b(c13117a2, sb4))) {
                                                    C17521b.m49764c(c13117a2);
                                                    StringBuilder sb5 = new StringBuilder();
                                                    boolean z15 = false;
                                                    while (true) {
                                                        if (z15) {
                                                            string = sb5.toString();
                                                        } else {
                                                            int i35 = c13117a2.f45382b;
                                                            boolean z16 = z15;
                                                            String strM49763b3 = C17521b.m49763b(c13117a2, sb4);
                                                            if (strM49763b3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strM49763b3) || ";".equals(strM49763b3)) {
                                                                c13117a2.m36689K(i35);
                                                                z15 = true;
                                                            } else {
                                                                sb5.append(strM49763b3);
                                                                z15 = z16;
                                                            }
                                                        }
                                                    }
                                                    if (string == null || "".equals(string)) {
                                                        i14 = 1;
                                                    } else {
                                                        int i36 = c13117a2.f45382b;
                                                        String strM49763b4 = C17521b.m49763b(c13117a2, sb4);
                                                        if (";".equals(strM49763b4)) {
                                                            if ("color".equals(strM49762a)) {
                                                                i15 = 1;
                                                                c17522c.f67767f = AbstractC24544b.m71591a(string, true);
                                                                c17522c.f67768g = true;
                                                            } else {
                                                                i15 = 1;
                                                                if ("background-color".equals(strM49762a)) {
                                                                    c17522c.f67769h = AbstractC24544b.m71591a(string, true);
                                                                    c17522c.f67770i = true;
                                                                } else if ("ruby-position".equals(strM49762a)) {
                                                                    if ("text-combine-upright".equals(strM49762a)) {
                                                                        if ("all".equals(string)) {
                                                                            z13 = true;
                                                                        } else {
                                                                            z13 = true;
                                                                        }
                                                                        c17522c.f67778q = z13;
                                                                    } else if ("text-decoration".equals(strM49762a)) {
                                                                        if ("underline".equals(string)) {
                                                                            i15 = 1;
                                                                            c17522c.f67772k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strM49762a)) {
                                                                        c17522c.f67766e = AbstractC31375j.m96499o(string);
                                                                    } else if ("font-weight".equals(strM49762a)) {
                                                                        i15 = 1;
                                                                        if ("font-style".equals(strM49762a)) {
                                                                            if ("italic".equals(string)) {
                                                                                c17522c.f67774m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strM49762a)) {
                                                                            matcher = C17521b.f67759d.matcher(AbstractC31375j.m96499o(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i14);
                                                                                        strGroup3.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i14);
                                                                                        strGroup4.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i14);
                                                                                        strGroup5.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup6 = matcher.group(i14);
                                                                                strGroup6.getClass();
                                                                                c17522c.f67776o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                StringBuilder sb6 = new StringBuilder(string.length() + 22);
                                                                                sb6.append("Invalid font-size: '");
                                                                                sb6.append(string);
                                                                                sb6.append("'.");
                                                                                Log.w("WebvttCssParser", sb6.toString());
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i15 = 1;
                                                                        c17522c.f67773l = 1;
                                                                    }
                                                                    i14 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    c17522c.f67777p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c17522c.f67777p = 2;
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                }
                                                            }
                                                            i14 = i15;
                                                        } else if ("}".equals(strM49763b4)) {
                                                            c13117a2.m36689K(i36);
                                                            if ("color".equals(strM49762a)) {
                                                                i15 = 1;
                                                                c17522c.f67767f = AbstractC24544b.m71591a(string, true);
                                                                c17522c.f67768g = true;
                                                            } else {
                                                                i15 = 1;
                                                                if ("background-color".equals(strM49762a)) {
                                                                    c17522c.f67769h = AbstractC24544b.m71591a(string, true);
                                                                    c17522c.f67770i = true;
                                                                } else if ("ruby-position".equals(strM49762a)) {
                                                                    if ("text-combine-upright".equals(strM49762a)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z13 = true;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        c17522c.f67778q = z13;
                                                                    } else if ("text-decoration".equals(strM49762a)) {
                                                                        if ("underline".equals(string)) {
                                                                            i15 = 1;
                                                                            c17522c.f67772k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strM49762a)) {
                                                                        c17522c.f67766e = AbstractC31375j.m96499o(string);
                                                                    } else if ("font-weight".equals(strM49762a)) {
                                                                        i15 = 1;
                                                                        if ("font-style".equals(strM49762a)) {
                                                                            if ("italic".equals(string)) {
                                                                                c17522c.f67774m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strM49762a)) {
                                                                            matcher = C17521b.f67759d.matcher(AbstractC31375j.m96499o(string));
                                                                            if (matcher.matches()) {
                                                                                StringBuilder sb7 = new StringBuilder(string.length() + 22);
                                                                                sb7.append("Invalid font-size: '");
                                                                                sb7.append(string);
                                                                                sb7.append("'.");
                                                                                Log.w("WebvttCssParser", sb7.toString());
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i14);
                                                                                        strGroup7.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i14);
                                                                                        strGroup8.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i14 = 1;
                                                                                                c17522c.f67775n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i14);
                                                                                        strGroup9.getClass();
                                                                                        c17522c.f67776o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        c17522c.f67775n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup10 = matcher.group(i14);
                                                                                strGroup10.getClass();
                                                                                c17522c.f67776o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i15 = 1;
                                                                        c17522c.f67773l = 1;
                                                                    }
                                                                    i14 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    c17522c.f67777p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c17522c.f67777p = 2;
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                }
                                                            }
                                                            i14 = i15;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i14 = i18;
                                                }
                                            } else {
                                                i14 = i18;
                                            }
                                            i18 = i14;
                                            r10 = r14;
                                            z14 = false;
                                        }
                                        int i37 = i18;
                                        if ("}".equals(strM49763b2)) {
                                            arrayList3.add(c17522c);
                                        }
                                        i18 = i37;
                                        z14 = false;
                                        i16 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b6 == 3) {
                                Pattern pattern = AbstractC17528i.f67802a;
                                String strM36700j2 = c13117a.m36700j();
                                if (strM36700j2 == null) {
                                    c17523dM49771d = null;
                                } else {
                                    Pattern pattern2 = AbstractC17528i.f67802a;
                                    Matcher matcher3 = pattern2.matcher(strM36700j2);
                                    if (matcher3.matches()) {
                                        c17523dM49771d = AbstractC17528i.m49771d(null, matcher3, c13117a, arrayList);
                                    } else {
                                        String strM36700j3 = c13117a.m36700j();
                                        if (strM36700j3 == null) {
                                            c17523dM49771d = null;
                                        } else {
                                            Matcher matcher4 = pattern2.matcher(strM36700j3);
                                            if (matcher4.matches()) {
                                                c17523dM49771d = AbstractC17528i.m49771d(strM36700j2.trim(), matcher4, c13117a, arrayList);
                                            } else {
                                                c17523dM49771d = null;
                                            }
                                        }
                                    }
                                }
                                if (c17523dM49771d != null) {
                                    arrayList2.add(c17523dM49771d);
                                }
                            }
                            c17529j = this;
                        }
                    }
                }
            }
        } catch (ParserException e5) {
            throw new SubtitleDecoderException(e5);
        }
    }
}
