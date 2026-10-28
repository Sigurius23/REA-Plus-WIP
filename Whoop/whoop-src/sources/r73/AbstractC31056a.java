package r73;

import p185h6.RunnableC16959n;
import p249jc.C21565a;
import p249jc.C21567b;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: r73.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31056a {

    /* JADX INFO: renamed from: b */
    public static final C21565a f128063b;

    /* JADX INFO: renamed from: c */
    public static final C21567b f128064c;

    /* JADX INFO: renamed from: a */
    public static final RunnableC16959n f128062a = new RunnableC16959n(1);

    /* JADX INFO: renamed from: d */
    public static final C21565a f128065d = new C21565a(22);

    static {
        int i13 = 21;
        f128063b = new C21565a(i13);
        f128064c = new C21567b(i13);
    }

    /* JADX INFO: renamed from: a */
    public static void m95616a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95617b(int i13, String str) {
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC25012a.m73373f(i13, str, " > 0 required but it was "));
        }
    }
}
