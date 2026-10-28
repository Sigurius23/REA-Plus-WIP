package p635y2;

import java.io.Serializable;
import m83.AbstractC25260n;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C39120p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168251a;

    /* JADX INFO: renamed from: b */
    public final C39117o f168252b;

    /* JADX INFO: renamed from: c */
    public final C39117o f168253c;

    /* JADX INFO: renamed from: d */
    public final C39117o f168254d;

    /* JADX INFO: renamed from: e */
    public final C39117o f168255e;

    /* JADX INFO: renamed from: f */
    public final Serializable f168256f;

    public C39120p(String str) {
        this.f168251a = 1;
        this.f168256f = str;
        this.f168252b = new C39117o(1, null);
        this.f168253c = new C39117o(0, null);
        this.f168254d = new C39117o(1, null);
        this.f168255e = new C39117o(0, null);
    }

    /* JADX INFO: renamed from: a */
    public final C39117o m124648a() {
        switch (this.f168251a) {
            case 0:
                break;
        }
        return this.f168255e;
    }

    /* JADX INFO: renamed from: b */
    public final C39117o m124649b() {
        switch (this.f168251a) {
            case 0:
                break;
        }
        return this.f168252b;
    }

    /* JADX INFO: renamed from: c */
    public final C39117o m124650c() {
        switch (this.f168251a) {
            case 0:
                break;
        }
        return this.f168254d;
    }

    /* JADX INFO: renamed from: d */
    public final C39117o m124651d() {
        switch (this.f168251a) {
            case 0:
                break;
        }
        return this.f168253c;
    }

    public final String toString() {
        switch (this.f168251a) {
            case 0:
                return AbstractC25260n.m74028D0((C39120p[]) this.f168256f, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.f168256f;
                return str != null ? AbstractC31061c.m95633i(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39120p(C39120p[] c39120pArr) {
        this.f168251a = 0;
        this.f168256f = c39120pArr;
        int length = c39120pArr.length;
        C39117o[] c39117oArr = new C39117o[length];
        for (int i13 = 0; i13 < length; i13++) {
            c39117oArr[i13] = ((C39120p[]) this.f168256f)[i13].m124649b();
        }
        this.f168252b = new C39117o(1, new C39152z1(c39117oArr, 0));
        int length2 = ((C39120p[]) this.f168256f).length;
        C39117o[] c39117oArr2 = new C39117o[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            c39117oArr2[i14] = ((C39120p[]) this.f168256f)[i14].m124651d();
        }
        this.f168253c = new C39117o(0, new C39114n(c39117oArr2, 0));
        int length3 = ((C39120p[]) this.f168256f).length;
        C39117o[] c39117oArr3 = new C39117o[length3];
        for (int i15 = 0; i15 < length3; i15++) {
            c39117oArr3[i15] = ((C39120p[]) this.f168256f)[i15].m124650c();
        }
        this.f168254d = new C39117o(1, new C39152z1(c39117oArr3, 1));
        int length4 = ((C39120p[]) this.f168256f).length;
        C39117o[] c39117oArr4 = new C39117o[length4];
        for (int i16 = 0; i16 < length4; i16++) {
            c39117oArr4[i16] = ((C39120p[]) this.f168256f)[i16].m124648a();
        }
        this.f168255e = new C39117o(0, new C39114n(c39117oArr4, 1));
    }
}
