package p571w3;

import java.util.ArrayList;
import p006a4.AbstractC0355b;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: w3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C36776l {

    /* JADX INFO: renamed from: b */
    public static final C36776l f157351b = new C36776l(0);

    /* JADX INFO: renamed from: c */
    public static final C36776l f157352c = new C36776l(1);

    /* JADX INFO: renamed from: d */
    public static final C36776l f157353d = new C36776l(2);

    /* JADX INFO: renamed from: a */
    public final int f157354a;

    public C36776l(int i13) {
        this.f157354a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36776l) {
            return this.f157354a == ((C36776l) obj).f157354a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f157354a;
    }

    public final String toString() {
        int i13 = this.f157354a;
        if (i13 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i13 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC25012a.m73377j(new StringBuilder("TextDecoration["), AbstractC0355b.m988b(62, ", ", arrayList, null), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
