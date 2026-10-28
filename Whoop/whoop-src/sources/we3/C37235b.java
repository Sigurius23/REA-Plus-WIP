package we3;

import aa3.C0656u0;
import af3.AbstractC0822a;
import af3.C0849y;
import bf3.C3205d;
import cf3.AbstractC4545a;
import java.util.ArrayList;
import java.util.List;
import p188ha.C17039h;
import p478s3.AbstractC32098d;
import ve3.C35930a;
import ve3.C35931b;
import ve3.C35933d;
import ve3.C35934e;
import ve3.C35935f;
import ve3.EnumC35932c;
import xe3.C38244g;
import xe3.C38248k;

/* JADX INFO: renamed from: we3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C37235b extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final C35930a f159231a = new C35930a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f159232b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f159233c;

    /* JADX INFO: renamed from: d */
    public boolean f159234d;

    public C37235b(ArrayList arrayList, C3205d c3205d) {
        ArrayList arrayList2 = new ArrayList();
        this.f159232b = arrayList2;
        this.f159234d = true;
        this.f159233c = arrayList;
        arrayList2.add(c3205d);
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m119334k(C3205d c3205d) {
        CharSequence charSequence = c3205d.f12559a;
        int iM99851r = AbstractC32098d.m99851r(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(iM99851r) == '|') {
            iM99851r++;
            length = AbstractC32098d.m99852s(charSequence, charSequence.length() - 1, iM99851r) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb4 = new StringBuilder();
        int i13 = iM99851r;
        while (iM99851r < length) {
            char cCharAt = charSequence.charAt(iM99851r);
            if (cCharAt == '\\') {
                int i14 = iM99851r + 1;
                if (i14 >= length || charSequence.charAt(i14) != '|') {
                    sb4.append('\\');
                } else {
                    sb4.append('|');
                    iM99851r = i14;
                }
            } else if (cCharAt != '|') {
                sb4.append(cCharAt);
            } else {
                arrayList.add(new C3205d(sb4.toString(), c3205d.m9253a(i13, iM99851r).f12560b));
                sb4.setLength(0);
                i13 = iM99851r + 1;
            }
            iM99851r++;
        }
        if (sb4.length() > 0) {
            arrayList.add(new C3205d(sb4.toString(), c3205d.m9253a(i13, c3205d.f12559a.length()).f12560b));
        }
        return arrayList;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public final void mo14221a(C3205d c3205d) {
        this.f159232b.add(c3205d);
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: d */
    public final boolean mo14224d() {
        return this.f159234d;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f159231a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: h */
    public final void mo14228h(C38248k c38248k) {
        C35930a c35930a = this.f159231a;
        List listM2056e = c35930a.m2056e();
        C0849y c0849y = !listM2056e.isEmpty() ? (C0849y) listM2056e.get(0) : null;
        C35934e c35934e = new C35934e();
        if (c0849y != null) {
            c35934e.m2054b(c0849y);
        }
        c35930a.m2055c(c35934e);
        C35935f c35935f = new C35935f();
        c35935f.m2058h(c35934e.m2056e());
        c35934e.m2055c(c35935f);
        ArrayList arrayList = this.f159232b;
        ArrayList arrayListM119334k = m119334k((C3205d) arrayList.get(0));
        int size = arrayListM119334k.size();
        for (int i13 = 0; i13 < size; i13++) {
            C35933d c35933dM119335j = m119335j((C3205d) arrayListM119334k.get(i13), i13, c38248k);
            c35933dM119335j.f153012g = true;
            c35935f.m2055c(c35933dM119335j);
        }
        int i14 = 2;
        C35931b c35931b = null;
        while (i14 < arrayList.size()) {
            C3205d c3205d = (C3205d) arrayList.get(i14);
            C0849y c0849y2 = i14 < listM2056e.size() ? (C0849y) listM2056e.get(i14) : null;
            ArrayList arrayListM119334k2 = m119334k(c3205d);
            C35935f c35935f2 = new C35935f();
            if (c0849y2 != null) {
                c35935f2.m2054b(c0849y2);
            }
            int i15 = 0;
            while (i15 < size) {
                c35935f2.m2055c(m119335j(i15 < arrayListM119334k2.size() ? (C3205d) arrayListM119334k2.get(i15) : new C3205d("", null), i15, c38248k));
                i15++;
            }
            if (c35931b == null) {
                c35931b = new C35931b();
                c35930a.m2055c(c35931b);
            }
            c35931b.m2055c(c35935f2);
            c35931b.m2054b(c0849y2);
            i14++;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        CharSequence charSequence = c38244g.f163965a.f12559a;
        int iM99840f = AbstractC32098d.m99840f('|', charSequence, c38244g.f163970f);
        if (iM99840f == -1) {
            return null;
        }
        if (iM99840f != c38244g.f163970f || AbstractC32098d.m99851r(charSequence, iM99840f + 1, charSequence.length()) != charSequence.length()) {
            return C17039h.m48099a(c38244g.f163967c);
        }
        this.f159234d = false;
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final C35933d m119335j(C3205d c3205d, int i13, C38248k c38248k) {
        C35933d c35933d = new C35933d();
        C0849y c0849y = c3205d.f12560b;
        if (c0849y != null) {
            c35933d.m2054b(c0849y);
        }
        ArrayList arrayList = this.f159233c;
        if (i13 < arrayList.size()) {
            c35933d.f153013h = (EnumC35932c) arrayList.get(i13);
        }
        CharSequence charSequence = c3205d.f12559a;
        int iM99851r = AbstractC32098d.m99851r(charSequence, 0, charSequence.length());
        C3205d c3205dM9253a = c3205d.m9253a(iM99851r, AbstractC32098d.m99852s(charSequence, charSequence.length() - 1, iM99851r) + 1);
        C0656u0 c0656u0 = new C0656u0(2);
        c0656u0.f2286a.add(c3205dM9253a);
        c38248k.m122587e(c0656u0, c35933d);
        return c35933d;
    }
}
