package x83;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import no.nordicsemi.android.dfu.DfuBaseService;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: x83.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38093j extends AbstractC35862g {
    /* JADX INFO: renamed from: l */
    public static boolean m122038l(File file) {
        AbstractC22676k.m65750j(file, "<this>");
        C38089f c38089f = new C38089f(new C38091h(file, EnumC38092i.f163141x));
        while (true) {
            boolean z4 = true;
            while (c38089f.hasNext()) {
                File file2 = (File) c38089f.next();
                if (file2.delete() || !file2.exists()) {
                    if (z4) {
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m122039m(File file) {
        AbstractC22676k.m65750j(file, "<this>");
        String name = file.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return AbstractC39414r.m125860F0('.', name, "");
    }

    /* JADX INFO: renamed from: n */
    public static String m122040n(File file) {
        AbstractC22676k.m65750j(file, "<this>");
        String name = file.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return AbstractC39414r.m125865K0(name, ".", name);
    }

    /* JADX INFO: renamed from: o */
    public static File m122041o(File file, String str) {
        int length;
        int iM125887f0;
        File file2 = new File(str);
        String path = file2.getPath();
        AbstractC22676k.m65749i(path, "getPath(...)");
        char c3 = File.separatorChar;
        int iM125887f1 = AbstractC39414r.m125887f0(path, c3, 0, false, 4);
        if (iM125887f1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c3 || (iM125887f0 = AbstractC39414r.m125887f0(path, c3, 2, false, 4)) < 0) {
                length = 1;
            } else {
                int iM125887f2 = AbstractC39414r.m125887f0(path, c3, iM125887f0 + 1, false, 4);
                length = iM125887f2 >= 0 ? iM125887f2 + 1 : path.length();
            }
        } else if (iM125887f1 <= 0 || path.charAt(iM125887f1 - 1) != ':') {
            length = (iM125887f1 == -1 && AbstractC39414r.m125881Z(path, ':')) ? path.length() : 0;
        } else {
            length = iM125887f1 + 1;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        if ((string.length() == 0) || AbstractC39414r.m125881Z(string, c3)) {
            return new File(string + file2);
        }
        return new File(string + c3 + file2);
    }

    /* JADX INFO: renamed from: p */
    public static void m122042p(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(fileOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m122043q(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        AbstractC22676k.m65750j(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(DfuBaseService.ERROR_REMOTE_MASK);
        AbstractC22676k.m65747g(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(DfuBaseService.ERROR_REMOTE_MASK * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC22676k.m65749i(byteBufferAllocate, "allocate(...)");
        int i13 = 0;
        int i14 = 0;
        while (i13 < str.length()) {
            int iMin = Math.min(8192 - i14, str.length() - i13);
            int i15 = i13 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC22676k.m65749i(cArrArray, "array(...)");
            str.getChars(i13, i15, cArrArray, i14);
            charBufferAllocate.limit(iMin + i14);
            i14 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i15 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i14 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i13 = i15;
        }
    }
}
