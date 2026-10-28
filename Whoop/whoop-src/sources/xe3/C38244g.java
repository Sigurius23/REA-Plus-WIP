package xe3;

import aa3.C0656u0;
import af3.AbstractC0842r;
import af3.AbstractC0844t;
import af3.C0824b;
import af3.C0825b0;
import af3.C0826c;
import af3.C0833i;
import af3.C0835k;
import af3.C0836l;
import af3.C0839o;
import af3.C0841q;
import af3.C0846v;
import af3.C0847w;
import af3.C0849y;
import bf3.C3205d;
import bi.C3278p;
import cf3.AbstractC4545a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kr.C22786e;
import p012ab.C0690l0;
import p047c9.C4320k;
import p188ha.C17039h;
import p319m4.AbstractC25012a;
import p478s3.AbstractC32098d;
import p508ty.C34249c;
import ve3.EnumC35932c;
import we3.C37234a;
import we3.C37235b;
import ze3.AbstractC40598b;

/* JADX INFO: renamed from: xe3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C38244g {

    /* JADX INFO: renamed from: r */
    public static final LinkedHashSet f163963r = new LinkedHashSet(Arrays.asList(C0824b.class, C0835k.class, C0833i.class, C0836l.class, C0825b0.class, AbstractC0842r.class, C0839o.class));

    /* JADX INFO: renamed from: s */
    public static final Map f163964s;

    /* JADX INFO: renamed from: a */
    public C3205d f163965a;

    /* JADX INFO: renamed from: e */
    public boolean f163969e;

    /* JADX INFO: renamed from: i */
    public boolean f163973i;

    /* JADX INFO: renamed from: j */
    public final List f163974j;

    /* JADX INFO: renamed from: k */
    public final C22786e f163975k;

    /* JADX INFO: renamed from: l */
    public final List f163976l;

    /* JADX INFO: renamed from: m */
    public final int f163977m;

    /* JADX INFO: renamed from: n */
    public final C38242e f163978n;

    /* JADX INFO: renamed from: p */
    public final ArrayList f163980p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f163981q;

    /* JADX INFO: renamed from: b */
    public int f163966b = -1;

    /* JADX INFO: renamed from: c */
    public int f163967c = 0;

    /* JADX INFO: renamed from: d */
    public int f163968d = 0;

    /* JADX INFO: renamed from: f */
    public int f163970f = 0;

    /* JADX INFO: renamed from: g */
    public int f163971g = 0;

    /* JADX INFO: renamed from: h */
    public int f163972h = 0;

    /* JADX INFO: renamed from: o */
    public final C3278p f163979o = new C3278p(6);

    static {
        HashMap map = new HashMap();
        map.put(C0824b.class, new C37234a(1));
        map.put(C0835k.class, new C37234a(3));
        map.put(C0833i.class, new C37234a(2));
        map.put(C0836l.class, new C37234a(4));
        map.put(C0825b0.class, new C37234a(7));
        map.put(AbstractC0842r.class, new C37234a(6));
        map.put(C0839o.class, new C37234a(5));
        f163964s = Collections.unmodifiableMap(map);
    }

    public C38244g(ArrayList arrayList, C22786e c22786e, ArrayList arrayList2, int i13) {
        ArrayList arrayList3 = new ArrayList();
        this.f163980p = arrayList3;
        this.f163981q = new ArrayList();
        this.f163974j = arrayList;
        this.f163975k = c22786e;
        this.f163976l = arrayList2;
        this.f163977m = i13;
        C38242e c38242e = new C38242e(0);
        this.f163978n = c38242e;
        arrayList3.add(new C38243f(c38242e, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m122571a(C38243f c38243f) {
        AbstractC4545a abstractC4545a = c38243f.f163961a;
        while (!m122578h().mo14223c(abstractC4545a.mo14226f())) {
            m122576f(1);
        }
        m122578h().mo14226f().m2055c(abstractC4545a.mo14226f());
        this.f163980p.add(c38243f);
    }

    /* JADX INFO: renamed from: b */
    public final void m122572b(C38253p c38253p) {
        C38249l c38249l = c38253p.f164020b;
        c38249l.m122591a();
        for (C0841q c0841q : c38249l.f164004c) {
            C0847w c0847w = c38253p.f164019a;
            c0841q.m2059j();
            AbstractC0844t abstractC0844t = c0847w.f3041d;
            c0841q.f3041d = abstractC0844t;
            if (abstractC0844t != null) {
                abstractC0844t.f3042e = c0841q;
            }
            c0841q.f3042e = c0847w;
            c0847w.f3041d = c0841q;
            AbstractC0844t abstractC0844t2 = c0847w.f3038a;
            c0841q.f3038a = abstractC0844t2;
            if (c0841q.f3041d == null) {
                abstractC0844t2.f3039b = c0841q;
            }
            C3278p c3278p = this.f163979o;
            c3278p.getClass();
            String strM131676a = AbstractC40598b.m131676a(c0841q.f3034g);
            LinkedHashMap linkedHashMap = c3278p.f12803a;
            if (!linkedHashMap.containsKey(strM131676a)) {
                linkedHashMap.put(strM131676a, c0841q);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m122573c() {
        CharSequence charSequenceSubSequence;
        if (this.f163969e) {
            int i13 = this.f163967c + 1;
            CharSequence charSequence = this.f163965a.f12559a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i13, charSequence.length());
            int i14 = 4 - (this.f163968d % 4);
            StringBuilder sb4 = new StringBuilder(charSequenceSubSequence2.length() + i14);
            for (int i15 = 0; i15 < i14; i15++) {
                sb4.append(' ');
            }
            sb4.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb4.toString();
        } else {
            int i16 = this.f163967c;
            if (i16 == 0) {
                charSequenceSubSequence = this.f163965a.f12559a;
            } else {
                CharSequence charSequence2 = this.f163965a.f12559a;
                charSequenceSubSequence = charSequence2.subSequence(i16, charSequence2.length());
            }
        }
        m122578h().mo14221a(new C3205d(charSequenceSubSequence, this.f163977m == 3 ? new C0849y(this.f163966b, this.f163967c, charSequenceSubSequence.length()) : null));
        m122574d();
    }

    /* JADX INFO: renamed from: d */
    public final void m122574d() {
        int i13 = 1;
        if (this.f163977m == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f163980p;
            if (i13 >= arrayList.size()) {
                return;
            }
            C38243f c38243f = (C38243f) arrayList.get(i13);
            int i14 = c38243f.f163962b;
            int length = this.f163965a.f12559a.length() - i14;
            if (length != 0) {
                c38243f.f163961a.mo14222b(new C0849y(this.f163966b, i14, length));
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m122575e() {
        char cCharAt = this.f163965a.f12559a.charAt(this.f163967c);
        this.f163967c++;
        if (cCharAt != '\t') {
            this.f163968d++;
        } else {
            int i13 = this.f163968d;
            this.f163968d = (4 - (i13 % 4)) + i13;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m122576f(int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            ArrayList arrayList = this.f163980p;
            AbstractC4545a abstractC4545a = ((C38243f) arrayList.remove(arrayList.size() - 1)).f163961a;
            if (abstractC4545a instanceof C38253p) {
                m122572b((C38253p) abstractC4545a);
            }
            abstractC4545a.mo14225e();
            this.f163981q.add(abstractC4545a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m122577g() {
        int i13 = this.f163967c;
        int i14 = this.f163968d;
        this.f163973i = true;
        int length = this.f163965a.f12559a.length();
        while (i13 < length) {
            char cCharAt = this.f163965a.f12559a.charAt(i13);
            if (cCharAt == '\t') {
                i13++;
                i14 += 4 - (i14 % 4);
            } else if (cCharAt != ' ') {
                this.f163973i = false;
                break;
            } else {
                i13++;
                i14++;
            }
        }
        this.f163970f = i13;
        this.f163971g = i14;
        this.f163972h = i14 - this.f163968d;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC4545a m122578h() {
        return ((C38243f) AbstractC25012a.m73371d(this.f163980p, 1)).f163961a;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0292  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a4 A[PHI: r22 r23
      0x02a4: PHI (r22v15 cf3.a) = 
      (r22v9 cf3.a)
      (r22v10 cf3.a)
      (r22v10 cf3.a)
      (r22v12 cf3.a)
      (r22v12 cf3.a)
      (r22v12 cf3.a)
      (r22v13 cf3.a)
      (r22v13 cf3.a)
      (r22v13 cf3.a)
      (r22v14 cf3.a)
      (r22v14 cf3.a)
      (r22v14 cf3.a)
      (r22v17 cf3.a)
      (r22v20 cf3.a)
     binds: [B:314:0x05cc, B:279:0x0528, B:301:0x0576, B:202:0x03c1, B:273:0x04f9, B:275:0x0505, B:185:0x0362, B:187:0x036a, B:466:0x02a4, B:178:0x032a, B:180:0x032e, B:182:0x033a, B:157:0x02a2, B:91:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r23v11 int) = 
      (r23v5 int)
      (r23v6 int)
      (r23v6 int)
      (r23v8 int)
      (r23v8 int)
      (r23v8 int)
      (r23v9 int)
      (r23v9 int)
      (r23v9 int)
      (r23v10 int)
      (r23v10 int)
      (r23v10 int)
      (r23v13 int)
      (r23v17 int)
     binds: [B:314:0x05cc, B:279:0x0528, B:301:0x0576, B:202:0x03c1, B:273:0x04f9, B:275:0x0505, B:185:0x0362, B:187:0x036a, B:466:0x02a4, B:178:0x032a, B:180:0x032e, B:182:0x033a, B:157:0x02a2, B:91:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:262:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:263:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:265:0x04db  */
    /* JADX WARN: Code duplicated, block: B:268:0x04e5 A[LOOP:10: B:264:0x04d9->B:268:0x04e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:300:0x0575  */
    /* JADX WARN: Code duplicated, block: B:378:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:473:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x01e1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX INFO: renamed from: i */
    public final void m122579i(String str) {
        ArrayList arrayList;
        AbstractC4545a abstractC4545a;
        int i13;
        int i14;
        C38239b c38239b;
        List listM2056e;
        boolean z4;
        boolean z13;
        EnumC35932c enumC35932c;
        char cCharAt;
        int i15;
        C38245h c38245h;
        C38239b c38239b2;
        int i16;
        int i17;
        int length;
        C38246i c38246i;
        char c3;
        char c7;
        boolean z14;
        C38250m c38250m;
        char cCharAt2;
        C38250m c38250m2;
        C38239b c38239b3;
        ?? r10;
        boolean zEquals;
        boolean zEquals2;
        int i18;
        int i19;
        char cCharAt3;
        int i24;
        String string = str;
        this.f163966b++;
        int i25 = 0;
        this.f163967c = 0;
        this.f163968d = 0;
        this.f163969e = false;
        int length2 = string.length();
        StringBuilder sb4 = null;
        for (int i26 = 0; i26 < length2; i26++) {
            char cCharAt4 = string.charAt(i26);
            if (cCharAt4 == 0) {
                if (sb4 == null) {
                    sb4 = new StringBuilder(length2);
                    sb4.append((CharSequence) string, 0, i26);
                }
                sb4.append((char) 65533);
            } else if (sb4 != null) {
                sb4.append(cCharAt4);
            }
        }
        if (sb4 != null) {
            string = sb4.toString();
        }
        this.f163965a = new C3205d(string, this.f163977m != 1 ? new C0849y(this.f163966b, 0, string.length()) : null);
        int i27 = 1;
        int i28 = 1;
        while (true) {
            arrayList = this.f163980p;
            if (i27 >= arrayList.size()) {
                break;
            }
            C38243f c38243f = (C38243f) arrayList.get(i27);
            AbstractC4545a abstractC4545a2 = c38243f.f163961a;
            m122577g();
            C17039h c17039hMo14229i = abstractC4545a2.mo14229i(this);
            if (c17039hMo14229i == null) {
                break;
            }
            c38243f.f163962b = this.f163967c;
            if (c17039hMo14229i.f65524b) {
                m122574d();
                m122576f(arrayList.size() - i27);
                return;
            }
            int i29 = c17039hMo14229i.f65523a;
            if (i29 != -1) {
                m122581k(i29);
            } else {
                int i34 = c17039hMo14229i.f65525c;
                if (i34 != -1) {
                    m122580j(i34);
                }
            }
            i28++;
            i27++;
        }
        int size = arrayList.size() - i28;
        AbstractC4545a abstractC4545a3 = ((C38243f) arrayList.get(i28 - 1)).f163961a;
        int i35 = this.f163967c;
        boolean z15 = (abstractC4545a3.mo14226f() instanceof C0847w) || abstractC4545a3.mo14227g();
        boolean z16 = false;
        while (true) {
            if (z15) {
                int i36 = this.f163967c;
                m122577g();
                if (!this.f163973i) {
                    int i37 = 4;
                    if (this.f163972h >= 4 || !Character.isLetter(Character.codePointAt(this.f163965a.f12559a, this.f163970f))) {
                        C34249c c34249c = new C34249c(abstractC4545a3, 22);
                        Iterator it = this.f163974j.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i38 = ((C37234a) it.next()).f159230a;
                                int i39 = i25;
                                char c14 = ' ';
                                char c15 = '\t';
                                Object obj = c34249c.f143660x;
                                switch (i38) {
                                    case 0:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        ArrayList arrayList2 = c34249c.m108299p().f2286a;
                                        if (arrayList2.size() != 1) {
                                            i14 = i39;
                                        } else if (AbstractC32098d.m99840f('|', ((C3205d) arrayList2.get(i39)).f12559a, i39) != -1) {
                                            C3205d c3205d = this.f163965a;
                                            CharSequence charSequence = c3205d.m9253a(this.f163967c, c3205d.f12559a.length()).f12559a;
                                            ArrayList arrayList3 = new ArrayList();
                                            int i44 = 0;
                                            int i45 = 0;
                                            boolean z17 = false;
                                            while (true) {
                                                if (i44 < charSequence.length()) {
                                                    char cCharAt5 = charSequence.charAt(i44);
                                                    if (cCharAt5 == '\t' || cCharAt5 == ' ') {
                                                        i44++;
                                                    } else if (cCharAt5 == '-' || cCharAt5 == ':') {
                                                        if (i45 != 0 || arrayList3.isEmpty()) {
                                                            if (cCharAt5 == ':') {
                                                                i44++;
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            boolean z18 = false;
                                                            while (i44 < charSequence.length() && charSequence.charAt(i44) == '-') {
                                                                i44++;
                                                                z18 = true;
                                                            }
                                                            if (z18) {
                                                                if (i44 >= charSequence.length() || charSequence.charAt(i44) != ':') {
                                                                    z13 = false;
                                                                } else {
                                                                    i44++;
                                                                    z13 = true;
                                                                }
                                                                if (z4 && z13) {
                                                                    enumC35932c = EnumC35932c.f153009x;
                                                                } else if (z4) {
                                                                    enumC35932c = EnumC35932c.f153008w;
                                                                } else {
                                                                    enumC35932c = z13 ? EnumC35932c.f153010y : null;
                                                                }
                                                                arrayList3.add(enumC35932c);
                                                                i45 = 0;
                                                            }
                                                        }
                                                    } else if (cCharAt5 == '|') {
                                                        i44++;
                                                        i45++;
                                                        if (i45 <= 1) {
                                                            z17 = true;
                                                        }
                                                    }
                                                } else if (!z17) {
                                                }
                                                arrayList3 = null;
                                            }
                                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                                i14 = 0;
                                            } else {
                                                i14 = 0;
                                                C3205d c3205d2 = (C3205d) arrayList2.get(0);
                                                if (arrayList3.size() >= C37235b.m119334k(c3205d2).size()) {
                                                    C38239b c38239b4 = new C38239b(new C37235b(arrayList3, c3205d2));
                                                    c38239b4.f163941b = this.f163967c;
                                                    c38239b4.f163943d = true;
                                                    c38239b = c38239b4;
                                                }
                                            }
                                        } else {
                                            i14 = 0;
                                        }
                                        c38239b = null;
                                        break;
                                    case 1:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        int i46 = this.f163970f;
                                        if (C38238a.m122567j(this, i46)) {
                                            int i47 = this.f163968d + this.f163972h;
                                            int i48 = i47 + 1;
                                            CharSequence charSequence2 = this.f163965a.f12559a;
                                            int i49 = i46 + 1;
                                            if (i49 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i49)) == '\t' || cCharAt == ' ')) {
                                                i48 = i47 + 2;
                                            }
                                            AbstractC4545a[] abstractC4545aArr = new AbstractC4545a[1];
                                            abstractC4545aArr[i39] = new C38238a();
                                            c38239b = new C38239b(abstractC4545aArr);
                                            c38239b.f163942c = i48;
                                        } else {
                                            c38239b = null;
                                        }
                                        i14 = i39;
                                        break;
                                    case 2:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        int i54 = this.f163972h;
                                        if (i54 < 4) {
                                            int i55 = this.f163970f;
                                            CharSequence charSequence3 = this.f163965a.f12559a;
                                            int length3 = charSequence3.length();
                                            int i56 = i55;
                                            int i57 = i39;
                                            int i58 = i57;
                                            while (true) {
                                                i15 = i55;
                                                if (i56 < length3) {
                                                    char cCharAt6 = charSequence3.charAt(i56);
                                                    if (cCharAt6 == '`') {
                                                        i57++;
                                                    } else if (cCharAt6 == '~') {
                                                        i58++;
                                                    }
                                                    i56++;
                                                    i55 = i15;
                                                }
                                            }
                                            if (i57 < 3 || i58 != 0) {
                                                if (i58 < 3 || i57 != 0) {
                                                    c38245h = null;
                                                } else {
                                                    c38245h = new C38245h(i58, i54, '~');
                                                }
                                            } else if (AbstractC32098d.m99840f('`', charSequence3, i15 + i57) != -1) {
                                                c38245h = null;
                                            } else {
                                                c38245h = new C38245h(i57, i54, '`');
                                            }
                                            if (c38245h != null) {
                                                AbstractC4545a[] abstractC4545aArr2 = new AbstractC4545a[1];
                                                abstractC4545aArr2[i39] = c38245h;
                                                c38239b2 = new C38239b(abstractC4545aArr2);
                                                c38239b2.f163941b = i15 + c38245h.f163982a.f3023h;
                                                c38239b = c38239b2;
                                            }
                                            i14 = i39;
                                        }
                                        c38239b = null;
                                        i14 = i39;
                                        break;
                                    case 3:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        if (this.f163972h >= 4) {
                                            c38239b = null;
                                        } else {
                                            C3205d c3205d3 = this.f163965a;
                                            int i59 = this.f163970f;
                                            CharSequence charSequence4 = c3205d3.f12559a;
                                            if (charSequence4.charAt(i59) == '#') {
                                                C3205d c3205dM9253a = c3205d3.m9253a(i59, charSequence4.length());
                                                ArrayList arrayList4 = new ArrayList();
                                                arrayList4.add(c3205dM9253a);
                                                C0690l0 c0690l0 = new C0690l0(arrayList4);
                                                int iM1737g = c0690l0.m1737g('#');
                                                if (iM1737g == 0 || iM1737g > 6) {
                                                    i16 = 2;
                                                    c38246i = null;
                                                } else if (c0690l0.m1735e()) {
                                                    char cM1742l = c0690l0.m1742l();
                                                    if (cM1742l != ' ') {
                                                        c3 = '\t';
                                                        if (cM1742l != '\t') {
                                                            i16 = 2;
                                                            c38246i = null;
                                                        }
                                                    } else {
                                                        c3 = '\t';
                                                    }
                                                    c0690l0.m1745o();
                                                    C4320k c4320kM1743m = c0690l0.m1743m();
                                                    C4320k c4320kM1743m2 = c4320kM1743m;
                                                    int i64 = 1;
                                                    while (c0690l0.m1735e()) {
                                                        char cM1742l2 = c0690l0.m1742l();
                                                        if (cM1742l2 == c3 || cM1742l2 == ' ') {
                                                            c7 = '#';
                                                            c0690l0.m1739i();
                                                            i64 = 1;
                                                        } else {
                                                            c7 = '#';
                                                            if (cM1742l2 != '#') {
                                                                c0690l0.m1739i();
                                                                c4320kM1743m2 = c0690l0.m1743m();
                                                                i64 = i39;
                                                            } else if (i64 != 0) {
                                                                c0690l0.m1737g('#');
                                                                int iM1745o = c0690l0.m1745o();
                                                                if (c0690l0.m1735e()) {
                                                                    c4320kM1743m2 = c0690l0.m1743m();
                                                                }
                                                                i64 = iM1745o > 0 ? 1 : i39;
                                                            } else {
                                                                c0690l0.m1739i();
                                                                c4320kM1743m2 = c0690l0.m1743m();
                                                            }
                                                        }
                                                        c3 = '\t';
                                                    }
                                                    C0656u0 c0656u0M1734d = c0690l0.m1734d(c4320kM1743m, c4320kM1743m2);
                                                    if (c0656u0M1734d.m1644m().isEmpty()) {
                                                        i16 = 2;
                                                        c38246i = new C38246i(iM1737g, new C0656u0(2));
                                                    } else {
                                                        i16 = 2;
                                                        c38246i = new C38246i(iM1737g, c0656u0M1734d);
                                                    }
                                                } else {
                                                    c38246i = new C38246i(iM1737g, new C0656u0(2));
                                                    i16 = 2;
                                                }
                                                if (c38246i != null) {
                                                    AbstractC4545a[] abstractC4545aArr3 = new AbstractC4545a[1];
                                                    abstractC4545aArr3[i39] = c38246i;
                                                    c38239b = new C38239b(abstractC4545aArr3);
                                                    c38239b.f163941b = charSequence4.length();
                                                }
                                            } else {
                                                i16 = 2;
                                            }
                                            char cCharAt7 = charSequence4.charAt(i59);
                                            if (cCharAt7 == '-') {
                                                length = charSequence4.length();
                                                for (i17 = i59 + 1; i17 < length; i17++) {
                                                    if (charSequence4.charAt(i17) != '-') {
                                                        length = i17;
                                                        if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                            i16 = i39;
                                                        }
                                                    }
                                                }
                                                if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                    i16 = i39;
                                                }
                                            } else if (cCharAt7 != '=') {
                                                i16 = i39;
                                            } else {
                                                int length4 = charSequence4.length();
                                                for (int i65 = i59 + 1; i65 < length4; i65++) {
                                                    if (charSequence4.charAt(i65) != '=') {
                                                        length4 = i65;
                                                        if (AbstractC32098d.m99851r(charSequence4, length4, charSequence4.length()) >= charSequence4.length()) {
                                                            i16 = 1;
                                                        } else {
                                                            length = charSequence4.length();
                                                            while (i17 < length) {
                                                                if (charSequence4.charAt(i17) != '-') {
                                                                    length = i17;
                                                                    if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                                        i16 = i39;
                                                                    }
                                                                }
                                                            }
                                                            if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                                i16 = i39;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (AbstractC32098d.m99851r(charSequence4, length4, charSequence4.length()) >= charSequence4.length()) {
                                                    i16 = 1;
                                                } else {
                                                    length = charSequence4.length();
                                                    while (i17 < length) {
                                                        if (charSequence4.charAt(i17) != '-') {
                                                            length = i17;
                                                            if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                                i16 = i39;
                                                            }
                                                        }
                                                    }
                                                    if (AbstractC32098d.m99851r(charSequence4, length, charSequence4.length()) < charSequence4.length()) {
                                                        i16 = i39;
                                                    }
                                                }
                                            }
                                            if (i16 > 0) {
                                                C0656u0 c0656u0M108299p = c34249c.m108299p();
                                                if (!c0656u0M108299p.f2286a.isEmpty()) {
                                                    C38246i c38246i2 = new C38246i(i16, c0656u0M108299p);
                                                    AbstractC4545a[] abstractC4545aArr4 = new AbstractC4545a[1];
                                                    abstractC4545aArr4[i39] = c38246i2;
                                                    c38239b2 = new C38239b(abstractC4545aArr4);
                                                    c38239b2.f163941b = charSequence4.length();
                                                    c38239b2.f163943d = true;
                                                    c38239b = c38239b2;
                                                }
                                            }
                                            c38239b = null;
                                        }
                                        i14 = i39;
                                        break;
                                    case 4:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        int i66 = this.f163970f;
                                        CharSequence charSequence5 = this.f163965a.f12559a;
                                        if (this.f163972h >= 4 || charSequence5.charAt(i66) != '<') {
                                            c38239b = null;
                                        } else {
                                            int i67 = 1;
                                            while (true) {
                                                if (i67 <= 7) {
                                                    if (i67 != 7 || (!(((AbstractC4545a) obj).mo14226f() instanceof C0847w) && !m122578h().mo14224d())) {
                                                        Pattern[] patternArr = C38247j.f163988e[i67];
                                                        Pattern pattern = patternArr[i39];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i66, charSequence5.length())).find()) {
                                                            AbstractC4545a[] abstractC4545aArr5 = new AbstractC4545a[1];
                                                            abstractC4545aArr5[i39] = new C38247j(pattern2);
                                                            c38239b = new C38239b(abstractC4545aArr5);
                                                            c38239b.f163941b = this.f163967c;
                                                        }
                                                    }
                                                    i67++;
                                                } else {
                                                    c38239b = null;
                                                }
                                            }
                                        }
                                        i14 = i39;
                                        break;
                                    case 5:
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        if (this.f163972h < 4 || this.f163973i || (m122578h().mo14226f() instanceof C0847w)) {
                                            c38239b = null;
                                        } else {
                                            AbstractC4545a[] abstractC4545aArr6 = new AbstractC4545a[1];
                                            abstractC4545aArr6[i39] = new C38246i();
                                            c38239b = new C38239b(abstractC4545aArr6);
                                            c38239b.f163942c = this.f163968d + 4;
                                        }
                                        i14 = i39;
                                        break;
                                    case 6:
                                        AbstractC4545a abstractC4545a4 = (AbstractC4545a) obj;
                                        int i68 = this.f163972h;
                                        if (i68 < 4) {
                                            int i69 = this.f163970f;
                                            int i74 = this.f163968d + i68;
                                            boolean zIsEmpty = c34249c.m108299p().f2286a.isEmpty();
                                            CharSequence charSequence6 = this.f163965a.f12559a;
                                            char cCharAt8 = charSequence6.charAt(i69);
                                            if (cCharAt8 == '*' || cCharAt8 == '+' || cCharAt8 == '-') {
                                                z14 = zIsEmpty;
                                                abstractC4545a = abstractC4545a3;
                                                i13 = i36;
                                                int i75 = i69 + 1;
                                                if (i75 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i75)) == '\t' || cCharAt2 == ' ') {
                                                    C0826c c0826c = new C0826c();
                                                    c0826c.f3020h = cCharAt8;
                                                    c38250m = new C38250m(c0826c, i75);
                                                } else {
                                                    c38250m = null;
                                                }
                                            } else {
                                                int length5 = charSequence6.length();
                                                z14 = zIsEmpty;
                                                int i76 = i69;
                                                int i77 = i39;
                                                while (true) {
                                                    abstractC4545a = abstractC4545a3;
                                                    if (i76 < length5) {
                                                        char cCharAt9 = charSequence6.charAt(i76);
                                                        i13 = i36;
                                                        if (cCharAt9 != ')' && cCharAt9 != '.') {
                                                            switch (cCharAt9) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i77++;
                                                                    if (i77 <= 9) {
                                                                        i76++;
                                                                        abstractC4545a3 = abstractC4545a;
                                                                        i36 = i13;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i77 >= 1 && ((i19 = i76 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i19)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence6.subSequence(i69, i76).toString();
                                                            C0846v c0846v = new C0846v();
                                                            c0846v.f3047h = Integer.parseInt(string2);
                                                            c0846v.f3048i = cCharAt9;
                                                            c38250m = new C38250m(c0846v, i19);
                                                        }
                                                    } else {
                                                        i13 = i36;
                                                    }
                                                    c38250m = null;
                                                }
                                            }
                                            if (c38250m == null) {
                                                c38250m2 = null;
                                            } else {
                                                AbstractC0842r abstractC0842r = c38250m.f164011a;
                                                int i78 = c38250m.f164012b;
                                                int i79 = (i78 - i69) + i74;
                                                int length6 = charSequence6.length();
                                                int i83 = i79;
                                                while (true) {
                                                    if (i78 >= length6) {
                                                        i18 = i39;
                                                    } else {
                                                        char cCharAt10 = charSequence6.charAt(i78);
                                                        if (cCharAt10 == '\t') {
                                                            i83 = (4 - (i83 % 4)) + i83;
                                                        } else if (cCharAt10 == ' ') {
                                                            i83++;
                                                        } else {
                                                            i18 = 1;
                                                        }
                                                        i78++;
                                                    }
                                                }
                                                if (z14 || ((!(abstractC0842r instanceof C0846v) || ((C0846v) abstractC0842r).f3047h == 1) && i18 != 0)) {
                                                    if (i18 == 0 || i83 - i79 > 4) {
                                                        i83 = i79 + 1;
                                                    }
                                                    c38250m2 = new C38250m(abstractC0842r, i83);
                                                } else {
                                                    c38250m2 = null;
                                                }
                                            }
                                            if (c38250m2 != null) {
                                                AbstractC0842r abstractC0842r2 = c38250m2.f164011a;
                                                int i84 = c38250m2.f164012b;
                                                C38252o c38252o = new C38252o(i84 - this.f163968d);
                                                if (abstractC4545a4 instanceof C38251n) {
                                                    AbstractC0842r abstractC0842r3 = ((C38251n) abstractC4545a4).f164013a;
                                                    if ((abstractC0842r3 instanceof C0826c) && (abstractC0842r2 instanceof C0826c)) {
                                                        zEquals2 = Character.valueOf(((C0826c) abstractC0842r3).f3020h).equals(Character.valueOf(((C0826c) abstractC0842r2).f3020h));
                                                    } else if ((abstractC0842r3 instanceof C0846v) && (abstractC0842r2 instanceof C0846v)) {
                                                        zEquals = Character.valueOf(((C0846v) abstractC0842r3).f3048i).equals(Character.valueOf(((C0846v) abstractC0842r2).f3048i));
                                                    } else {
                                                        r10 = i39;
                                                    }
                                                    if (r10 == 0) {
                                                        r10 = zEquals;
                                                        r10 = zEquals2;
                                                        C38251n c38251n = new C38251n(abstractC0842r2);
                                                        abstractC0842r2.f3037g = true;
                                                        AbstractC4545a[] abstractC4545aArr7 = new AbstractC4545a[2];
                                                        abstractC4545aArr7[i39] = c38251n;
                                                        abstractC4545aArr7[1] = c38252o;
                                                        c38239b3 = new C38239b(abstractC4545aArr7);
                                                        c38239b3.f163942c = i84;
                                                    } else {
                                                        r10 = zEquals;
                                                        r10 = zEquals2;
                                                        AbstractC4545a[] abstractC4545aArr8 = new AbstractC4545a[1];
                                                        abstractC4545aArr8[i39] = c38252o;
                                                        c38239b3 = new C38239b(abstractC4545aArr8);
                                                        c38239b3.f163942c = i84;
                                                    }
                                                } else {
                                                    r10 = zEquals;
                                                    r10 = zEquals2;
                                                    C38251n c38251n2 = new C38251n(abstractC0842r2);
                                                    abstractC0842r2.f3037g = true;
                                                    AbstractC4545a[] abstractC4545aArr9 = new AbstractC4545a[2];
                                                    abstractC4545aArr9[i39] = c38251n2;
                                                    abstractC4545aArr9[1] = c38252o;
                                                    c38239b3 = new C38239b(abstractC4545aArr9);
                                                    c38239b3.f163942c = i84;
                                                }
                                                c38239b = c38239b3;
                                            }
                                            i14 = i39;
                                        } else {
                                            abstractC4545a = abstractC4545a3;
                                            i13 = i36;
                                        }
                                        c38239b = null;
                                        i14 = i39;
                                        break;
                                    default:
                                        if (this.f163972h >= i37) {
                                            c38239b = null;
                                        } else {
                                            int i85 = this.f163970f;
                                            CharSequence charSequence7 = this.f163965a.f12559a;
                                            int length7 = charSequence7.length();
                                            int i86 = i39;
                                            int i87 = i86;
                                            int i88 = i87;
                                            while (true) {
                                                if (i85 >= length7) {
                                                    int i89 = i86;
                                                    int i94 = i87;
                                                    int i95 = i88;
                                                    if ((i89 >= 3 && i94 == 0 && i95 == 0) || ((i94 >= 3 && i89 == 0 && i95 == 0) || (i95 >= 3 && i89 == 0 && i94 == 0))) {
                                                        AbstractC4545a[] abstractC4545aArr10 = new AbstractC4545a[1];
                                                        abstractC4545aArr10[i39] = new C38242e(1);
                                                        c38239b = new C38239b(abstractC4545aArr10);
                                                        c38239b.f163941b = charSequence7.length();
                                                    }
                                                } else {
                                                    char cCharAt11 = charSequence7.charAt(i85);
                                                    if (cCharAt11 == c15 || cCharAt11 == c14) {
                                                        i24 = i86;
                                                        i87 = i87;
                                                        i88 = i88;
                                                    } else if (cCharAt11 != '*') {
                                                        if (cCharAt11 == '-') {
                                                            i86++;
                                                        } else if (cCharAt11 == '_') {
                                                            i87++;
                                                        }
                                                        i24 = i86;
                                                    } else {
                                                        i24 = i86;
                                                        i88++;
                                                    }
                                                    i85++;
                                                    i86 = i24;
                                                    c15 = '\t';
                                                    c14 = ' ';
                                                }
                                                c38239b = null;
                                            }
                                        }
                                        abstractC4545a = abstractC4545a3;
                                        i13 = i36;
                                        i14 = i39;
                                        break;
                                }
                                if (c38239b == null) {
                                    i25 = i14;
                                    abstractC4545a3 = abstractC4545a;
                                    i36 = i13;
                                    i37 = 4;
                                }
                            } else {
                                i14 = i25;
                                abstractC4545a = abstractC4545a3;
                                i13 = i36;
                                c38239b = null;
                            }
                        }
                        if (c38239b == null) {
                            m122581k(this.f163970f);
                        } else {
                            int i96 = this.f163967c;
                            if (size > 0) {
                                m122576f(size);
                                size = i14;
                            }
                            int i97 = c38239b.f163941b;
                            if (i97 != -1) {
                                m122581k(i97);
                            } else {
                                int i98 = c38239b.f163942c;
                                if (i98 != -1) {
                                    m122580j(i98);
                                }
                            }
                            if (c38239b.f163943d) {
                                AbstractC4545a abstractC4545a5 = ((C38243f) arrayList.remove(arrayList.size() - 1)).f163961a;
                                if (abstractC4545a5 instanceof C38253p) {
                                    m122572b((C38253p) abstractC4545a5);
                                }
                                abstractC4545a5.mo14225e();
                                abstractC4545a5.mo14226f().m2059j();
                                listM2056e = abstractC4545a5.mo14226f().m2056e();
                            } else {
                                listM2056e = null;
                            }
                            AbstractC4545a[] abstractC4545aArr11 = c38239b.f163940a;
                            int length8 = abstractC4545aArr11.length;
                            boolean zMo14227g = z15;
                            int i99 = i14;
                            while (i99 < length8) {
                                AbstractC4545a abstractC4545a6 = abstractC4545aArr11[i99];
                                m122571a(new C38243f(abstractC4545a6, i96));
                                if (listM2056e != null) {
                                    abstractC4545a6.mo14226f().m2058h(listM2056e);
                                }
                                i99++;
                                abstractC4545a = abstractC4545a6;
                                zMo14227g = abstractC4545a6.mo14227g();
                            }
                            i25 = i14;
                            z15 = zMo14227g;
                            abstractC4545a3 = abstractC4545a;
                            i35 = i13;
                            z16 = true;
                        }
                    }
                    i35 = i13;
                }
                abstractC4545a = abstractC4545a3;
                i13 = i36;
                m122581k(this.f163970f);
                i35 = i13;
            } else {
                abstractC4545a = abstractC4545a3;
            }
            if (!z16 && !this.f163973i && m122578h().mo14224d()) {
                ((C38243f) AbstractC25012a.m73371d(arrayList, 1)).f163962b = i35;
                m122573c();
                return;
            }
            if (size > 0) {
                m122576f(size);
            }
            if (!abstractC4545a.mo14227g()) {
                m122573c();
                return;
            } else if (this.f163973i) {
                m122574d();
                return;
            } else {
                m122571a(new C38243f(new C38253p(), i35));
                m122573c();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m122580j(int i13) {
        int i14;
        int i15 = this.f163971g;
        if (i13 >= i15) {
            this.f163967c = this.f163970f;
            this.f163968d = i15;
        }
        int length = this.f163965a.f12559a.length();
        while (true) {
            i14 = this.f163968d;
            if (i14 >= i13 || this.f163967c == length) {
                break;
            } else {
                m122575e();
            }
        }
        if (i14 <= i13) {
            this.f163969e = false;
            return;
        }
        this.f163967c--;
        this.f163968d = i13;
        this.f163969e = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m122581k(int i13) {
        int i14 = this.f163970f;
        if (i13 >= i14) {
            this.f163967c = i14;
            this.f163968d = this.f163971g;
        }
        int length = this.f163965a.f12559a.length();
        while (true) {
            int i15 = this.f163967c;
            if (i15 >= i13 || i15 == length) {
                break;
            } else {
                m122575e();
            }
        }
        this.f163969e = false;
    }
}
