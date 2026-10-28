package p049cj;

import java.io.Closeable;
import java.util.Arrays;
import p108e4.AbstractC12667a;
import p108e4.AbstractC12682p;
import p581we.C37199o;

/* JADX INFO: renamed from: cj.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4737c implements Closeable {

    /* JADX INFO: renamed from: E */
    public static final String[] f19339E = new String[128];

    /* JADX INFO: renamed from: w */
    public int f19340w;

    /* JADX INFO: renamed from: x */
    public int[] f19341x;

    /* JADX INFO: renamed from: y */
    public String[] f19342y;

    /* JADX INFO: renamed from: z */
    public int[] f19343z;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f19339E[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f19339E;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: b */
    public final String m14820b() {
        return AbstractC12667a.m35431B(this.f19340w, this.f19341x, this.f19343z, this.f19342y);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo14821h();

    public abstract boolean hasNext();

    /* JADX INFO: renamed from: i */
    public abstract int mo14822i();

    /* JADX INFO: renamed from: k */
    public final void m14823k(int i13) {
        int i14 = this.f19340w;
        int[] iArr = this.f19341x;
        if (i14 == iArr.length) {
            if (i14 == 256) {
                throw new C4735a("Nesting too deep at " + m14820b());
            }
            this.f19341x = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f19342y;
            this.f19342y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f19343z;
            this.f19343z = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f19341x;
        int i15 = this.f19340w;
        this.f19340w = i15 + 1;
        iArr3[i15] = i13;
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo14824m(C37199o c37199o);

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextString();

    /* JADX INFO: renamed from: s */
    public abstract void mo14825s();

    public abstract void skipValue();

    /* JADX INFO: renamed from: x */
    public final void m14826x(String str) throws C4736b {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " at path ");
        sbM35484d.append(m14820b());
        throw new C4736b(sbM35484d.toString());
    }
}
