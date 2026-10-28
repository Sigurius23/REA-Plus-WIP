package fo;

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
import android.util.Log;
import android.util.Pair;
import bo.C3499a;
import bo.C3501c;
import bo.C3502d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p309lo.AbstractC24567y;
import p550vd.AbstractC35903f;
import p621xn.C38464a;
import se.AbstractC32416g;

/* JADX INFO: renamed from: fo.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14659e {

    /* JADX INFO: renamed from: a */
    public final String f54105a;

    /* JADX INFO: renamed from: b */
    public final String f54106b;

    /* JADX INFO: renamed from: c */
    public final boolean f54107c;

    /* JADX INFO: renamed from: d */
    public final long f54108d;

    /* JADX INFO: renamed from: e */
    public final long f54109e;

    /* JADX INFO: renamed from: f */
    public final C14661g f54110f;

    /* JADX INFO: renamed from: g */
    public final String[] f54111g;

    /* JADX INFO: renamed from: h */
    public final String f54112h;

    /* JADX INFO: renamed from: i */
    public final String f54113i;

    /* JADX INFO: renamed from: j */
    public final C14659e f54114j;

    /* JADX INFO: renamed from: k */
    public final HashMap f54115k;

    /* JADX INFO: renamed from: l */
    public final HashMap f54116l;

    /* JADX INFO: renamed from: m */
    public ArrayList f54117m;

    public C14659e(String str, String str2, long j7, long j13, C14661g c14661g, String[] strArr, String str3, String str4, C14659e c14659e) {
        this.f54105a = str;
        this.f54106b = str2;
        this.f54113i = str4;
        this.f54110f = c14661g;
        this.f54111g = strArr;
        this.f54107c = str2 != null;
        this.f54108d = j7;
        this.f54109e = j13;
        str3.getClass();
        this.f54112h = str3;
        this.f54114j = c14659e;
        this.f54115k = new HashMap();
        this.f54116l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C14659e m41874a(String str) {
        return new C14659e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m41875e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C38464a c38464a = new C38464a();
            c38464a.f164706a = new SpannableStringBuilder();
            treeMap.put(str, c38464a);
        }
        CharSequence charSequence = ((C38464a) treeMap.get(str)).f164706a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final C14659e m41876b(int i13) {
        ArrayList arrayList = this.f54117m;
        if (arrayList != null) {
            return (C14659e) arrayList.get(i13);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m41877c() {
        ArrayList arrayList = this.f54117m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m41878d(TreeSet treeSet, boolean z4) {
        String str = this.f54105a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.f54113i != null)) {
            long j7 = this.f54108d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j13 = this.f54109e;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
        }
        if (this.f54117m == null) {
            return;
        }
        for (int i13 = 0; i13 < this.f54117m.size(); i13++) {
            ((C14659e) this.f54117m.get(i13)).m41878d(treeSet, z4 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41879f(long j7) {
        long j13 = this.f54108d;
        long j14 = this.f54109e;
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
    public final void m41880g(long j7, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f54112h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m41879f(j7) && "div".equals(this.f54105a) && (str2 = this.f54113i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i13 = 0; i13 < m41877c(); i13++) {
            m41876b(i13).m41880g(j7, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX INFO: renamed from: h */
    public final void m41881h(long j7, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i13;
        C14659e c14659e;
        C14661g c14661gM113993K;
        int i14;
        int i15;
        int i16;
        int i17;
        Map map3 = map;
        if (m41879f(j7)) {
            String str2 = this.f54112h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f54116l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f54115k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C38464a c38464a = (C38464a) treeMap.get(str4);
                    c38464a.getClass();
                    C14660f c14660f = (C14660f) map2.get(str3);
                    c14660f.getClass();
                    int i18 = c14660f.f54127j;
                    C14661g c14661gM113993K2 = AbstractC35903f.m113993K(this.f54110f, this.f54111g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c38464a.f164706a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c38464a.f164706a = spannableStringBuilder;
                    }
                    if (c14661gM113993K2 != null) {
                        int i19 = c14661gM113993K2.f54135h;
                        int i24 = 1;
                        if (((i19 == -1 && c14661gM113993K2.f54136i == -1) ? -1 : (i19 == 1 ? (char) 1 : (char) 0) | (c14661gM113993K2.f54136i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i25 = c14661gM113993K2.f54135h;
                            if (i25 != -1) {
                                if (i25 == i24) {
                                    i15 = i24;
                                } else {
                                    i15 = 0;
                                }
                                if (c14661gM113993K2.f54136i == i24) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                i17 = i15 | i16;
                            } else if (c14661gM113993K2.f54136i == -1) {
                                i17 = -1;
                                i24 = 1;
                            } else {
                                i24 = 1;
                                if (i25 == i24) {
                                    i15 = i24;
                                } else {
                                    i15 = 0;
                                }
                                if (c14661gM113993K2.f54136i == i24) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                i17 = i15 | i16;
                            }
                            StyleSpan styleSpan = new StyleSpan(i17);
                            i13 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i13 = 33;
                        }
                        if (c14661gM113993K2.f54133f == i24) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i13);
                        }
                        if (c14661gM113993K2.f54134g == i24) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i13);
                        }
                        if (c14661gM113993K2.f54130c) {
                            if (!c14661gM113993K2.f54130c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC32416g.m101158o(spannableStringBuilder, new ForegroundColorSpan(c14661gM113993K2.f54129b), iIntValue, iIntValue2);
                        }
                        if (c14661gM113993K2.f54132e) {
                            if (!c14661gM113993K2.f54132e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC32416g.m101158o(spannableStringBuilder, new BackgroundColorSpan(c14661gM113993K2.f54131d), iIntValue, iIntValue2);
                        }
                        if (c14661gM113993K2.f54128a != null) {
                            AbstractC32416g.m101158o(spannableStringBuilder, new TypefaceSpan(c14661gM113993K2.f54128a), iIntValue, iIntValue2);
                        }
                        C14656b c14656b = c14661gM113993K2.f54145r;
                        if (c14656b != null) {
                            int i26 = c14656b.f54089a;
                            if (i26 == -1) {
                                i26 = (i18 == 2 || i18 == 1) ? 3 : 1;
                                i14 = 1;
                            } else {
                                i14 = c14656b.f54090b;
                            }
                            int i27 = c14656b.f54091c;
                            if (i27 == -2) {
                                i27 = 1;
                            }
                            AbstractC32416g.m101158o(spannableStringBuilder, new C3502d(i26, i14, i27), iIntValue, iIntValue2);
                        }
                        int i28 = c14661gM113993K2.f54140m;
                        if (i28 == 2) {
                            C14659e c14659e2 = this.f54114j;
                            while (true) {
                                if (c14659e2 == null) {
                                    c14659e2 = null;
                                    break;
                                }
                                C14661g c14661gM113993K3 = AbstractC35903f.m113993K(c14659e2.f54110f, c14659e2.f54111g, map3);
                                if (c14661gM113993K3 != null && c14661gM113993K3.f54140m == 1) {
                                    break;
                                } else {
                                    c14659e2 = c14659e2.f54114j;
                                }
                            }
                            if (c14659e2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c14659e2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c14659e = null;
                                        break;
                                    }
                                    C14659e c14659e3 = (C14659e) arrayDeque.pop();
                                    C14661g c14661gM113993K4 = AbstractC35903f.m113993K(c14659e3.f54110f, c14659e3.f54111g, map3);
                                    if (c14661gM113993K4 != null && c14661gM113993K4.f54140m == 3) {
                                        c14659e = c14659e3;
                                        break;
                                    }
                                    for (int iM41877c = c14659e3.m41877c() - 1; iM41877c >= 0; iM41877c--) {
                                        arrayDeque.push(c14659e3.m41876b(iM41877c));
                                    }
                                }
                                if (c14659e != null) {
                                    if (c14659e.m41877c() != 1 || c14659e.m41876b(0).f54106b == null) {
                                        Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c14659e.m41876b(0).f54106b;
                                        int i29 = AbstractC24567y.f95875a;
                                        C14661g c14661gM113993K5 = AbstractC35903f.m113993K(c14659e.f54110f, c14659e.f54111g, map3);
                                        int i34 = c14661gM113993K5 != null ? c14661gM113993K5.f54141n : -1;
                                        if (i34 == -1 && (c14661gM113993K = AbstractC35903f.m113993K(c14659e2.f54110f, c14659e2.f54111g, map3)) != null) {
                                            i34 = c14661gM113993K.f54141n;
                                        }
                                        spannableStringBuilder.setSpan(new C3501c(str5, i34), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (i28 == 3 || i28 == 4) {
                            spannableStringBuilder.setSpan(new C14655a(), iIntValue, iIntValue2, 33);
                        }
                        if (c14661gM113993K2.f54144q == 1) {
                            AbstractC32416g.m101158o(spannableStringBuilder, new C3499a(), iIntValue, iIntValue2);
                        }
                        int i35 = c14661gM113993K2.f54137j;
                        if (i35 == 1) {
                            AbstractC32416g.m101158o(spannableStringBuilder, new AbsoluteSizeSpan((int) c14661gM113993K2.f54138k, true), iIntValue, iIntValue2);
                        } else if (i35 == 2) {
                            AbstractC32416g.m101158o(spannableStringBuilder, new RelativeSizeSpan(c14661gM113993K2.f54138k), iIntValue, iIntValue2);
                        } else if (i35 == 3) {
                            AbstractC32416g.m101158o(spannableStringBuilder, new RelativeSizeSpan(c14661gM113993K2.f54138k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f54105a)) {
                            float f13 = c14661gM113993K2.f54146s;
                            if (f13 != Float.MAX_VALUE) {
                                c38464a.f164722q = (f13 * (-90.0f)) / 100.0f;
                            }
                            Layout.Alignment alignment = c14661gM113993K2.f54142o;
                            if (alignment != null) {
                                c38464a.f164708c = alignment;
                            }
                            Layout.Alignment alignment2 = c14661gM113993K2.f54143p;
                            if (alignment2 != null) {
                                c38464a.f164709d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i36 = 0;
            while (i36 < m41877c()) {
                m41876b(i36).m41881h(j7, map3, map2, str3, treeMap);
                i36++;
                map3 = map;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m41882i(long j7, boolean z4, String str, TreeMap treeMap) {
        HashMap map = this.f54115k;
        map.clear();
        HashMap map2 = this.f54116l;
        map2.clear();
        String str2 = this.f54105a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f54112h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f54107c && z4) {
            SpannableStringBuilder spannableStringBuilderM41875e = m41875e(str4, treeMap);
            String str5 = this.f54106b;
            str5.getClass();
            spannableStringBuilderM41875e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            m41875e(str4, treeMap).append('\n');
            return;
        }
        if (m41879f(j7)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C38464a) entry.getValue()).f164706a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i13 = 0; i13 < m41877c(); i13++) {
                m41876b(i13).m41882i(j7, z4 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM41875e2 = m41875e(str4, treeMap);
                int length = spannableStringBuilderM41875e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM41875e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM41875e2.charAt(length) != '\n') {
                    spannableStringBuilderM41875e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C38464a) entry2.getValue()).f164706a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
