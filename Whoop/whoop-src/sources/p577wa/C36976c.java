package p577wa;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p484s9.AbstractC32281f;
import p576w8.C36931a;
import p576w8.C36935e;
import p576w8.C36937g;
import p576w8.C36938h;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import s93.AbstractC32309k;

/* JADX INFO: renamed from: wa.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C36976c {

    /* JADX INFO: renamed from: a */
    public final String f158243a;

    /* JADX INFO: renamed from: b */
    public final String f158244b;

    /* JADX INFO: renamed from: c */
    public final boolean f158245c;

    /* JADX INFO: renamed from: d */
    public final long f158246d;

    /* JADX INFO: renamed from: e */
    public final long f158247e;

    /* JADX INFO: renamed from: f */
    public final C36979f f158248f;

    /* JADX INFO: renamed from: g */
    public final String[] f158249g;

    /* JADX INFO: renamed from: h */
    public final String f158250h;

    /* JADX INFO: renamed from: i */
    public final String f158251i;

    /* JADX INFO: renamed from: j */
    public final C36976c f158252j;

    /* JADX INFO: renamed from: k */
    public final HashMap f158253k;

    /* JADX INFO: renamed from: l */
    public final HashMap f158254l;

    /* JADX INFO: renamed from: m */
    public ArrayList f158255m;

    public C36976c(String str, String str2, long j7, long j13, C36979f c36979f, String[] strArr, String str3, String str4, C36976c c36976c) {
        this.f158243a = str;
        this.f158244b = str2;
        this.f158251i = str4;
        this.f158248f = c36979f;
        this.f158249g = strArr;
        this.f158245c = str2 != null;
        this.f158246d = j7;
        this.f158247e = j13;
        str3.getClass();
        this.f158250h = str3;
        this.f158252j = c36976c;
        this.f158253k = new HashMap();
        this.f158254l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C36976c m118693a(String str) {
        return new C36976c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m118694e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C36931a c36931a = new C36931a();
            c36931a.f158009a = new SpannableStringBuilder();
            treeMap.put(str, c36931a);
        }
        CharSequence charSequence = ((C36931a) treeMap.get(str)).f158009a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final C36976c m118695b(int i13) {
        ArrayList arrayList = this.f158255m;
        if (arrayList != null) {
            return (C36976c) arrayList.get(i13);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m118696c() {
        ArrayList arrayList = this.f158255m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m118697d(TreeSet treeSet, boolean z4) {
        String str = this.f158243a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.f158251i != null)) {
            long j7 = this.f158246d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j13 = this.f158247e;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
        }
        if (this.f158255m == null) {
            return;
        }
        for (int i13 = 0; i13 < this.f158255m.size(); i13++) {
            ((C36976c) this.f158255m.get(i13)).m118697d(treeSet, z4 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m118698f(long j7) {
        long j13 = this.f158246d;
        long j14 = this.f158247e;
        if (j13 == -9223372036854775807L && j14 == -9223372036854775807L) {
            return true;
        }
        if (j13 <= j7 && j14 == -9223372036854775807L) {
            return true;
        }
        if (j13 != -9223372036854775807L || j7 >= j14) {
            return j13 <= j7 && j7 < j14;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m118699g(long j7, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f158250h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m118698f(j7) && "div".equals(this.f158243a) && (str2 = this.f158251i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i13 = 0; i13 < m118696c(); i13++) {
            m118695b(i13).m118699g(j7, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0219  */
    /* JADX WARN: Code duplicated, block: B:148:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x021f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0225  */
    /* JADX WARN: Code duplicated, block: B:153:0x0238  */
    /* JADX WARN: Code duplicated, block: B:165:0x026a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0282  */
    /* JADX WARN: Code duplicated, block: B:169:0x0291  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX INFO: renamed from: h */
    public final void m118700h(long j7, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i13;
        C36976c c36976c;
        int i14;
        C36979f c36979fM100577g;
        int i15;
        float f13;
        float f14;
        float f15;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i16;
        RelativeSizeSpan relativeSizeSpan;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        Map map3 = map;
        if (m118698f(j7)) {
            String str2 = this.f158250h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it3 = this.f158254l.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f158253k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C36931a c36931a = (C36931a) treeMap.get(str4);
                    c36931a.getClass();
                    C36978e c36978e = (C36978e) map2.get(str3);
                    c36978e.getClass();
                    int i26 = c36978e.f158274j;
                    C36979f c36979fM100577g2 = AbstractC32309k.m100577g(this.f158248f, this.f158249g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c36931a.f158009a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c36931a.f158009a = spannableStringBuilder;
                    }
                    if (c36979fM100577g2 != null) {
                        int i27 = c36979fM100577g2.f158282h;
                        int i28 = 1;
                        if (((i27 == -1 && c36979fM100577g2.f158283i == -1) ? -1 : (i27 == 1 ? (char) 1 : (char) 0) | (c36979fM100577g2.f158283i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i29 = c36979fM100577g2.f158282h;
                            if (i29 != -1) {
                                if (i29 == i28) {
                                    i19 = i28;
                                } else {
                                    i19 = 0;
                                }
                                if (c36979fM100577g2.f158283i == i28) {
                                    i24 = 2;
                                } else {
                                    i24 = 0;
                                }
                                i25 = i19 | i24;
                            } else if (c36979fM100577g2.f158283i == -1) {
                                i25 = -1;
                                i28 = 1;
                            } else {
                                i28 = 1;
                                if (i29 == i28) {
                                    i19 = i28;
                                } else {
                                    i19 = 0;
                                }
                                if (c36979fM100577g2.f158283i == i28) {
                                    i24 = 2;
                                } else {
                                    i24 = 0;
                                }
                                i25 = i19 | i24;
                            }
                            StyleSpan styleSpan = new StyleSpan(i25);
                            i13 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i13 = 33;
                        }
                        if (c36979fM100577g2.f158280f == i28) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i13);
                        }
                        if (c36979fM100577g2.f158281g == i28) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i13);
                        }
                        if (c36979fM100577g2.f158277c) {
                            if (!c36979fM100577g2.f158277c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC32281f.m100449o(spannableStringBuilder, new ForegroundColorSpan(c36979fM100577g2.f158276b), iIntValue, iIntValue2);
                        }
                        if (c36979fM100577g2.f158279e) {
                            if (!c36979fM100577g2.f158279e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC32281f.m100449o(spannableStringBuilder, new BackgroundColorSpan(c36979fM100577g2.f158278d), iIntValue, iIntValue2);
                        }
                        if (c36979fM100577g2.f158275a != null) {
                            AbstractC32281f.m100449o(spannableStringBuilder, new TypefaceSpan(c36979fM100577g2.f158275a), iIntValue, iIntValue2);
                        }
                        C36975b c36975b = c36979fM100577g2.f158292r;
                        if (c36975b != null) {
                            int i34 = c36975b.f158240a;
                            if (i34 == -1) {
                                i34 = (i26 == 2 || i26 == 1) ? 3 : 1;
                                i18 = 1;
                            } else {
                                i18 = c36975b.f158241b;
                            }
                            int i35 = c36975b.f158242c;
                            if (i35 == -2) {
                                i35 = 1;
                            }
                            AbstractC32281f.m100449o(spannableStringBuilder, new C36938h(i34, i18, i35), iIntValue, iIntValue2);
                        }
                        int i36 = c36979fM100577g2.f158287m;
                        if (i36 == 2) {
                            C36976c c36976c2 = this.f158252j;
                            while (true) {
                                if (c36976c2 == null) {
                                    c36976c2 = null;
                                    break;
                                }
                                C36979f c36979fM100577g3 = AbstractC32309k.m100577g(c36976c2.f158248f, c36976c2.f158249g, map3);
                                if (c36979fM100577g3 != null && c36979fM100577g3.f158287m == 1) {
                                    break;
                                } else {
                                    c36976c2 = c36976c2.f158252j;
                                }
                            }
                            if (c36976c2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c36976c2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c36976c = null;
                                        break;
                                    }
                                    C36976c c36976c3 = (C36976c) arrayDeque.pop();
                                    C36979f c36979fM100577g4 = AbstractC32309k.m100577g(c36976c3.f158248f, c36976c3.f158249g, map3);
                                    if (c36979fM100577g4 != null && c36979fM100577g4.f158287m == 3) {
                                        c36976c = c36976c3;
                                        break;
                                    }
                                    for (int iM118696c = c36976c3.m118696c() - 1; iM118696c >= 0; iM118696c--) {
                                        arrayDeque.push(c36976c3.m118695b(iM118696c));
                                    }
                                }
                                if (c36976c != null) {
                                    if (c36976c.m118696c() == 1) {
                                        i14 = 0;
                                        if (c36976c.m118695b(0).f158244b != null) {
                                            String str5 = c36976c.m118695b(0).f158244b;
                                            int i37 = AbstractC38065t.f163031a;
                                            C36979f c36979fM100577g5 = AbstractC32309k.m100577g(c36976c.f158248f, c36976c.f158249g, map3);
                                            int i38 = c36979fM100577g5 != null ? c36979fM100577g5.f158288n : -1;
                                            if (i38 == -1 && (c36979fM100577g = AbstractC32309k.m100577g(c36976c2.f158248f, c36976c2.f158249g, map3)) != null) {
                                                i38 = c36979fM100577g.f158288n;
                                            }
                                            spannableStringBuilder.setSpan(new C36937g(str5, i38), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i14 = 0;
                                    }
                                    AbstractC38046a.m121818m("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (c36979fM100577g2.f158291q == 1) {
                                AbstractC32281f.m100449o(spannableStringBuilder, new C36935e(), iIntValue, iIntValue2);
                            }
                            i15 = c36979fM100577g2.f158284j;
                            f13 = 100.0f;
                            if (i15 != 1) {
                                it = it3;
                                f14 = 100.0f;
                                AbstractC32281f.m100449o(spannableStringBuilder, new AbsoluteSizeSpan((int) c36979fM100577g2.f158285k, true), iIntValue, iIntValue2);
                            } else if (i15 != 2) {
                                it = it3;
                                f14 = 100.0f;
                                AbstractC32281f.m100449o(spannableStringBuilder, new RelativeSizeSpan(c36979fM100577g2.f158285k), iIntValue, iIntValue2);
                            } else if (i15 != 3) {
                                it = it3;
                                f14 = 100.0f;
                            } else {
                                float f16 = c36979fM100577g2.f158285k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i39 = i14;
                                sizeChange = f16;
                                i16 = i39;
                                while (i16 < length) {
                                    float f17 = f13;
                                    relativeSizeSpan = relativeSizeSpanArr[i16];
                                    Iterator it4 = it3;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i17 = i16;
                                    } else {
                                        i17 = i16;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i16 = i17 + 1;
                                    f13 = f17;
                                    it3 = it4;
                                }
                                it = it3;
                                f14 = f13;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f158243a)) {
                                f15 = c36979fM100577g2.f158293s;
                                if (f15 != Float.MAX_VALUE) {
                                    c36931a.f158025q = (f15 * (-90.0f)) / f14;
                                }
                                alignment = c36979fM100577g2.f158289o;
                                if (alignment != null) {
                                    c36931a.f158011c = alignment;
                                }
                                alignment2 = c36979fM100577g2.f158290p;
                                if (alignment2 != null) {
                                    c36931a.f158012d = alignment2;
                                }
                            }
                        } else if (i36 == 3 || i36 == 4) {
                            spannableStringBuilder.setSpan(new C36974a(), iIntValue, iIntValue2, 33);
                        }
                        i14 = 0;
                        if (c36979fM100577g2.f158291q == 1) {
                            AbstractC32281f.m100449o(spannableStringBuilder, new C36935e(), iIntValue, iIntValue2);
                        }
                        i15 = c36979fM100577g2.f158284j;
                        f13 = 100.0f;
                        if (i15 != 1) {
                            it = it3;
                            f14 = 100.0f;
                            AbstractC32281f.m100449o(spannableStringBuilder, new AbsoluteSizeSpan((int) c36979fM100577g2.f158285k, true), iIntValue, iIntValue2);
                        } else if (i15 != 2) {
                            it = it3;
                            f14 = 100.0f;
                            AbstractC32281f.m100449o(spannableStringBuilder, new RelativeSizeSpan(c36979fM100577g2.f158285k), iIntValue, iIntValue2);
                        } else if (i15 != 3) {
                            it = it3;
                            f14 = 100.0f;
                        } else {
                            float f18 = c36979fM100577g2.f158285k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i310 = i14;
                            sizeChange = f18;
                            i16 = i310;
                            while (i16 < length) {
                                float f19 = f13;
                                relativeSizeSpan = relativeSizeSpanArr[i16];
                                Iterator it5 = it3;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i17 = i16;
                                } else {
                                    i17 = i16;
                                }
                                i16 = i17 + 1;
                                f13 = f19;
                                it3 = it5;
                            }
                            it = it3;
                            f14 = f13;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f158243a)) {
                            f15 = c36979fM100577g2.f158293s;
                            if (f15 != Float.MAX_VALUE) {
                                c36931a.f158025q = (f15 * (-90.0f)) / f14;
                            }
                            alignment = c36979fM100577g2.f158289o;
                            if (alignment != null) {
                                c36931a.f158011c = alignment;
                            }
                            alignment2 = c36979fM100577g2.f158290p;
                            if (alignment2 != null) {
                                c36931a.f158012d = alignment2;
                            }
                        }
                    }
                    it3 = it;
                }
                it = it3;
                it3 = it;
            }
            int i44 = 0;
            while (i44 < m118696c()) {
                m118695b(i44).m118700h(j7, map3, map2, str3, treeMap);
                i44++;
                map3 = map;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m118701i(long j7, boolean z4, String str, TreeMap treeMap) {
        HashMap map = this.f158253k;
        map.clear();
        HashMap map2 = this.f158254l;
        map2.clear();
        String str2 = this.f158243a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f158250h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f158245c && z4) {
            SpannableStringBuilder spannableStringBuilderM118694e = m118694e(str4, treeMap);
            String str5 = this.f158244b;
            str5.getClass();
            spannableStringBuilderM118694e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            m118694e(str4, treeMap).append('\n');
            return;
        }
        if (m118698f(j7)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C36931a) entry.getValue()).f158009a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i13 = 0; i13 < m118696c(); i13++) {
                m118695b(i13).m118701i(j7, z4 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM118694e2 = m118694e(str4, treeMap);
                int length = spannableStringBuilderM118694e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM118694e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM118694e2.charAt(length) != '\n') {
                    spannableStringBuilderM118694e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C36931a) entry2.getValue()).f158009a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
