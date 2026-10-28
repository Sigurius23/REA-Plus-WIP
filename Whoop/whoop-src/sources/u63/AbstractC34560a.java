package u63;

import e93.AbstractC12889b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import p715kotlin.jvm.internal.AbstractC22676k;
import t63.AbstractC33559b;
import w63.C36866a;

/* JADX INFO: renamed from: u63.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34560a {

    /* JADX INFO: renamed from: a */
    public static final CharBuffer f145563a = CharBuffer.allocate(0);

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f145564b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        AbstractC22676k.m65747g(byteBufferAllocate);
        f145564b = byteBufferAllocate;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m109273a(CharsetEncoder charsetEncoder, C36866a c36866a) throws EOFException {
        ByteBuffer byteBuffer = (ByteBuffer) c36866a.f77291g;
        int i13 = c36866a.f77287c;
        int i14 = c36866a.f77289e - i13;
        ByteBuffer byteBuffer2 = AbstractC33559b.f140038a;
        ByteBuffer byteBufferM36264b0 = AbstractC12889b.m36264b0(byteBuffer, i13, i14);
        CoderResult coderResultEncode = charsetEncoder.encode(f145563a, byteBufferM36264b0, true);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            m109276d(coderResultEncode);
        }
        boolean zIsUnderflow = coderResultEncode.isUnderflow();
        if (byteBufferM36264b0.limit() != i14) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        c36866a.m56791b(byteBufferM36264b0.position());
        return zIsUnderflow;
    }

    /* JADX INFO: renamed from: b */
    public static final int m109274b(CharsetEncoder charsetEncoder, CharSequence input, int i13, int i14, C36866a c36866a) throws EOFException {
        AbstractC22676k.m65750j(input, "input");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i13, i14);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) c36866a.f77291g;
        int i15 = c36866a.f77287c;
        int i16 = c36866a.f77289e - i15;
        ByteBuffer byteBuffer2 = AbstractC33559b.f140038a;
        ByteBuffer byteBufferM36264b0 = AbstractC12889b.m36264b0(byteBuffer, i15, i16);
        CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBufferM36264b0, false);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            m109276d(coderResultEncode);
        }
        if (byteBufferM36264b0.limit() != i16) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        c36866a.m56791b(byteBufferM36264b0.position());
        return iRemaining - charBufferWrap.remaining();
    }

    /* JADX INFO: renamed from: c */
    public static final String m109275c(Charset charset) {
        AbstractC22676k.m65750j(charset, "<this>");
        String strName = charset.name();
        AbstractC22676k.m65749i(strName, "name()");
        return strName;
    }

    /* JADX INFO: renamed from: d */
    public static final void m109276d(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.p228io.charsets.MalformedInputException(message);
        }
    }
}
