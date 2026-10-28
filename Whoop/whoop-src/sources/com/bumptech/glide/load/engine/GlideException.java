package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p684zk.C40796u;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: F */
    public static final StackTraceElement[] f20340F = new StackTraceElement[0];

    /* JADX INFO: renamed from: E */
    public final String f20341E;

    /* JADX INFO: renamed from: w */
    public final List f20342w;

    /* JADX INFO: renamed from: x */
    public InterfaceC37327e f20343x;

    /* JADX INFO: renamed from: y */
    public EnumC37323a f20344y;

    /* JADX INFO: renamed from: z */
    public Class f20345z;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    public static void m15555a(Throwable th3, ArrayList arrayList) {
        if (!(th3 instanceof GlideException)) {
            arrayList.add(th3);
            return;
        }
        Iterator it = ((GlideException) th3).f20342w.iterator();
        while (it.hasNext()) {
            m15555a((Throwable) it.next(), arrayList);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15556b(List list, C40796u c40796u) throws IOException {
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            c40796u.append("Cause (");
            int i14 = i13 + 1;
            c40796u.append(String.valueOf(i14));
            c40796u.append(" of ");
            c40796u.append(String.valueOf(size));
            c40796u.append("): ");
            Throwable th3 = (Throwable) list.get(i13);
            if (th3 instanceof GlideException) {
                ((GlideException) th3).m15559e(c40796u);
            } else {
                m15557c(th3, c40796u);
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15557c(Throwable th3, Appendable appendable) {
        try {
            appendable.append(th3.getClass().toString()).append(": ").append(th3.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15558d() {
        ArrayList arrayList = new ArrayList();
        m15555a(this, arrayList);
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            StringBuilder sb4 = new StringBuilder("Root cause (");
            int i14 = i13 + 1;
            sb4.append(i14);
            sb4.append(" of ");
            sb4.append(size);
            sb4.append(")");
            Log.i("Glide", sb4.toString(), (Throwable) arrayList.get(i13));
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15559e(Appendable appendable) {
        m15557c(this, appendable);
        try {
            m15556b(this.f20342w, new C40796u(appendable));
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb4 = new StringBuilder(71);
        sb4.append(this.f20341E);
        sb4.append(this.f20345z != null ? ", " + this.f20345z : "");
        sb4.append(this.f20344y != null ? ", " + this.f20344y : "");
        sb4.append(this.f20343x != null ? ", " + this.f20343x : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m15555a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb4.toString();
        }
        if (arrayList.size() == 1) {
            sb4.append("\nThere was 1 cause:");
        } else {
            sb4.append("\nThere were ");
            sb4.append(arrayList.size());
            sb4.append(" causes:");
        }
        for (Throwable th3 : arrayList) {
            sb4.append('\n');
            sb4.append(th3.getClass().getName());
            sb4.append('(');
            sb4.append(th3.getMessage());
            sb4.append(')');
        }
        sb4.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb4.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m15559e(System.err);
    }

    public GlideException(String str, List list) {
        this.f20341E = str;
        setStackTrace(f20340F);
        this.f20342w = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m15559e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m15559e(printWriter);
    }
}
