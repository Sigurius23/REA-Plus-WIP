package io.sentry;

import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: io.sentry.r2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20517r2 implements InterfaceC20544t0, InterfaceC20602v0 {

    /* JADX INFO: renamed from: w */
    public static final C20517r2 f76871w = new C20517r2();

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: a */
    public C20501v mo1857a(C20484j c20484j) {
        return C20501v.f76802x;
    }

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: b */
    public C20501v mo1858b(C20484j c20484j) {
        return C20501v.f76802x;
    }

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: c */
    public C20501v mo1859c(C20484j c20484j) {
        return C20501v.f76802x;
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: i */
    public void mo16058i(EnumC20436n5 enumC20436n5, Throwable th3, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th3.toString();
        StringWriter stringWriter = new StringWriter();
        th3.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC20436n5 + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: j */
    public void mo16060j(EnumC20436n5 enumC20436n5, String str, Throwable th3) {
        if (th3 == null) {
            mo16066m(enumC20436n5, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th3.toString());
        StringWriter stringWriter = new StringWriter();
        th3.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC20436n5 + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: m */
    public void mo16066m(EnumC20436n5 enumC20436n5, String str, Object... objArr) {
        System.out.println(enumC20436n5 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: o */
    public boolean mo16069o(EnumC20436n5 enumC20436n5) {
        return true;
    }
}
