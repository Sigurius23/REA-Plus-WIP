package ud3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import l83.InterfaceC23457c;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26610e;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26624l;
import ne3.C26643w;
import ne3.InterfaceC26618i;
import p088dc.AbstractC11894a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: ud3.v0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34846v0 {
    public static final C34844u0 Companion = new C34844u0();
    public static final AbstractC34846v0 EMPTY;

    static {
        C26624l c26624l = C26624l.f105881E;
        AbstractC22676k.m65750j(c26624l, "<this>");
        EMPTY = new C34838r0(null, c26624l);
    }

    public static final AbstractC34846v0 create(File file, C34818h0 c34818h0) {
        Companion.getClass();
        return C34844u0.m109924a(file, c34818h0);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C34818h0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final C26624l sha256() throws IOException {
        C26643w c26643wM31947O = AbstractC11894a.m31947O(new C26610e());
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(c26643wM31947O);
        try {
            writeTo(c26617h0M79157b);
            c26617h0M79157b.close();
            return c26643wM31947O.m79285b();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(c26617h0M79157b, th3);
                throw th4;
            }
        }
    }

    public abstract void writeTo(InterfaceC26618i interfaceC26618i);

    public static final AbstractC34846v0 create(FileDescriptor fileDescriptor, C34818h0 c34818h0) {
        Companion.getClass();
        AbstractC22676k.m65750j(fileDescriptor, "<this>");
        return new C34840s0(fileDescriptor, c34818h0);
    }

    public static final AbstractC34846v0 create(String str, C34818h0 c34818h0) {
        Companion.getClass();
        return C34844u0.m109925b(str, c34818h0);
    }

    public static final AbstractC34846v0 create(C26611e0 c26611e0, AbstractC26632p fileSystem, C34818h0 c34818h0) {
        Companion.getClass();
        AbstractC22676k.m65750j(c26611e0, "<this>");
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        return new C34836q0(c26611e0, fileSystem, c34818h0);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, File file) {
        Companion.getClass();
        AbstractC22676k.m65750j(file, "file");
        return C34844u0.m109924a(file, c34818h0);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, String content) {
        Companion.getClass();
        AbstractC22676k.m65750j(content, "content");
        return C34844u0.m109925b(content, c34818h0);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, C26624l content) {
        Companion.getClass();
        AbstractC22676k.m65750j(content, "content");
        return new C34838r0(c34818h0, content);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, byte[] content) {
        Companion.getClass();
        AbstractC22676k.m65750j(content, "content");
        return C34844u0.m109926c(c34818h0, content, 0, content.length);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, byte[] content, int i13) {
        Companion.getClass();
        AbstractC22676k.m65750j(content, "content");
        return C34844u0.m109926c(c34818h0, content, i13, content.length);
    }

    public static final AbstractC34846v0 create(byte[] bArr) {
        C34844u0 c34844u0 = Companion;
        c34844u0.getClass();
        AbstractC22676k.m65750j(bArr, "<this>");
        return C34844u0.m109927d(c34844u0, bArr, null, 0, 7);
    }

    public static final AbstractC34846v0 create(byte[] bArr, C34818h0 c34818h0) {
        C34844u0 c34844u0 = Companion;
        c34844u0.getClass();
        AbstractC22676k.m65750j(bArr, "<this>");
        return C34844u0.m109927d(c34844u0, bArr, c34818h0, 0, 6);
    }

    public static final AbstractC34846v0 create(byte[] bArr, C34818h0 c34818h0, int i13) {
        C34844u0 c34844u0 = Companion;
        c34844u0.getClass();
        AbstractC22676k.m65750j(bArr, "<this>");
        return C34844u0.m109927d(c34844u0, bArr, c34818h0, i13, 4);
    }

    public static final AbstractC34846v0 create(byte[] bArr, C34818h0 c34818h0, int i13, int i14) {
        Companion.getClass();
        return C34844u0.m109926c(c34818h0, bArr, i13, i14);
    }

    public static final AbstractC34846v0 create(C26624l c26624l, C34818h0 c34818h0) {
        Companion.getClass();
        AbstractC22676k.m65750j(c26624l, "<this>");
        return new C34838r0(c34818h0, c26624l);
    }

    @InterfaceC23457c
    public static final AbstractC34846v0 create(C34818h0 c34818h0, byte[] content, int i13, int i14) {
        Companion.getClass();
        AbstractC22676k.m65750j(content, "content");
        return C34844u0.m109926c(c34818h0, content, i13, i14);
    }
}
