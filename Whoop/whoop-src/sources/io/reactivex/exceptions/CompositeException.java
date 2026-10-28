package io.reactivex.exceptions;

import ah3.C0893a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o73.C27648a;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final List f75172w;

    /* JADX INFO: renamed from: x */
    public final String f75173x;

    /* JADX INFO: renamed from: y */
    public C0893a f75174y;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m55876a(StringBuilder sb4, Throwable th3, String str) {
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
            m55876a(sb4, th3.getCause(), "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55877b(C27648a c27648a) {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append(this);
        sb4.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb4.append("\tat ");
            sb4.append(stackTraceElement);
            sb4.append('\n');
        }
        int i13 = 1;
        for (Throwable th3 : this.f75172w) {
            sb4.append("  ComposedException ");
            sb4.append(i13);
            sb4.append(" :\n");
            m55876a(sb4, th3, "\t");
            i13++;
        }
        String string = sb4.toString();
        switch (c27648a.f111256a) {
            case 0:
                ((PrintStream) c27648a.f111257b).println((Object) string);
                break;
            default:
                ((PrintWriter) c27648a.f111257b).println((Object) string);
                break;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f75174y == null) {
                C0893a c0893a = new C0893a(1);
                HashSet hashSet = new HashSet();
                C0893a c0893a2 = c0893a;
                for (Throwable runtimeException : this.f75172w) {
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
                                cause = cause2;
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
                        if (cause3 != null && c0893a2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                    break;
                                }
                                cause3 = cause4;
                            }
                            c0893a2 = cause3;
                        }
                    }
                }
                this.f75174y = c0893a;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f75174y;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f75173x;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m55877b(new C27648a(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th3 = (Throwable) it.next();
                if (th3 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th3).f75172w);
                } else if (th3 != null) {
                    linkedHashSet.add(th3);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f75172w = listUnmodifiableList;
            this.f75173x = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m55877b(new C27648a(printWriter, 1));
    }
}
