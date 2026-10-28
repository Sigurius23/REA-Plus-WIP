package hg3;

import java.io.PrintStream;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: hg3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17264d {

    /* JADX INFO: renamed from: a */
    public static final int f66352a;

    /* JADX INFO: renamed from: b */
    public static final int f66353b;

    static {
        int i13;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i14 = 2;
        if (property != null && !property.isEmpty()) {
            int i15 = 0;
            while (true) {
                if (i15 >= 3) {
                    i13 = 1;
                    break;
                } else {
                    if (strArr[i15].equalsIgnoreCase(property)) {
                        i13 = 2;
                        break;
                    }
                    i15++;
                }
            }
        } else {
            i13 = 1;
            break;
        }
        f66352a = i13;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i14 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i14 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i14 = 3;
            }
        }
        f66353b = i14;
    }

    /* JADX INFO: renamed from: a */
    public static final void m48845a(String str) {
        m48847c().println("SLF4J(E): " + str);
    }

    /* JADX INFO: renamed from: b */
    public static final void m48846b(String str, Throwable th3) {
        m48847c().println("SLF4J(E): " + str);
        m48847c().println("SLF4J(E): Reported exception:");
        th3.printStackTrace(m48847c());
    }

    /* JADX INFO: renamed from: c */
    public static PrintStream m48847c() {
        return AbstractC12682p.m35485e(f66352a) != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: d */
    public static void m48848d(String str) {
        if (AbstractC12682p.m35485e(2) >= AbstractC12682p.m35485e(f66353b)) {
            m48847c().println("SLF4J(I): " + str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48849e(String str) {
        if (AbstractC12682p.m35485e(3) >= AbstractC12682p.m35485e(f66353b)) {
            m48847c().println("SLF4J(W): " + str);
        }
    }
}
