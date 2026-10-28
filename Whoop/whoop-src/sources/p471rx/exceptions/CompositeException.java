package p471rx.exceptions;

import ah3.C0893a;
import ah3.C0894b;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final List f132385w;

    /* JADX INFO: renamed from: x */
    public final String f132386x;

    /* JADX INFO: renamed from: y */
    public C0893a f132387y;

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th3 = (Throwable) it.next();
                if (th3 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th3).f132385w);
                } else if (th3 != null) {
                    linkedHashSet.add(th3);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f132385w = listUnmodifiableList;
        this.f132386x = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    /* JADX INFO: renamed from: a */
    public static void m99120a(StringBuilder sb4, Throwable th3, String str) {
        sb4.append(str);
        sb4.append(th3);
        sb4.append('\n');
        for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
            sb4.append("\t\tat ");
            sb4.append(stackTraceElement);
            sb4.append('\n');
        }
        if (th3.getCause() != null) {
            sb4.append("\tCaused by: ");
            m99120a(sb4, th3.getCause(), "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m99121b(AbstractC37978j abstractC37978j) {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append(this);
        sb4.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb4.append("\tat ");
            sb4.append(stackTraceElement);
            sb4.append('\n');
        }
        int i13 = 1;
        for (Throwable th3 : this.f132385w) {
            sb4.append("  ComposedException ");
            sb4.append(i13);
            sb4.append(" :\n");
            m99120a(sb4, th3, "\t");
            i13++;
        }
        synchronized (abstractC37978j.mo2189N()) {
            abstractC37978j.mo2190T(sb4.toString());
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f132387y == null) {
                C0893a c0893a = new C0893a(0);
                HashSet hashSet = new HashSet();
                C0893a c0893a2 = c0893a;
                for (Throwable runtimeException : this.f132385w) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                    break;
                                }
                                cause = cause.getCause();
                            }
                        }
                        for (Throwable th3 : arrayList) {
                            if (hashSet.contains(th3)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th3);
                            }
                        }
                        try {
                            c0893a2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = c0893a2.getCause();
                        if (cause3 != null && cause3 != c0893a2) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                    break;
                                }
                                cause3 = cause3.getCause();
                            }
                            c0893a2 = cause3;
                        }
                    }
                }
                this.f132387y = c0893a;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f132387y;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f132386x;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m99121b(new C0894b(printStream, 0));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m99121b(new C0894b(printWriter, 1));
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Throwable th3 : thArr) {
            if (th3 instanceof CompositeException) {
                linkedHashSet.addAll(((CompositeException) th3).f132385w);
            } else if (th3 != null) {
                linkedHashSet.add(th3);
            } else {
                linkedHashSet.add(new NullPointerException());
            }
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f132385w = listUnmodifiableList;
        this.f132386x = listUnmodifiableList.size() + " exceptions occurred. ";
    }
}
