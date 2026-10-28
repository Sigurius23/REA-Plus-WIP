package bd3;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import m83.C25258m;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3128j {

    /* JADX INFO: renamed from: a */
    public final InputStream f12268a;

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f12269b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f12270c;

    /* JADX INFO: renamed from: d */
    public boolean f12271d;

    /* JADX INFO: renamed from: e */
    public char f12272e;

    public C3128j(InputStream inputStream, Charset charset) {
        byte[] bArr;
        AbstractC22676k.m65750j(inputStream, "inputStream");
        AbstractC22676k.m65750j(charset, "charset");
        this.f12268a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        AbstractC22676k.m65749i(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f12269b = charsetDecoderOnUnmappableCharacter;
        C3120f c3120f = C3120f.f12244c;
        synchronized (c3120f) {
            C25258m c25258m = (C25258m) c3120f.f5934b;
            bArr = null;
            byte[] bArr2 = (byte[]) (c25258m.isEmpty() ? null : c25258m.removeLast());
            if (bArr2 != null) {
                c3120f.f5933a -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        AbstractC22676k.m65749i(byteBufferWrap, "wrap(...)");
        this.f12270c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX INFO: renamed from: a */
    public final int m8987a(char[] cArr, int i13, int i14) throws CharacterCodingException {
        int i15;
        CharsetDecoder charsetDecoder;
        char c3;
        char c7;
        char c14;
        char c15;
        if (i14 == 0) {
            return 0;
        }
        if (i13 < 0 || i13 >= cArr.length || i14 < 0 || i13 + i14 > cArr.length) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Unexpected arguments: ", ", ", ", ");
            sbM30465s.append(cArr.length);
            throw new IllegalArgumentException(sbM30465s.toString().toString());
        }
        boolean z4 = true;
        if (this.f12271d) {
            cArr[i13] = this.f12272e;
            i13++;
            i14--;
            this.f12271d = false;
            if (i14 == 0) {
                return 1;
            }
            i15 = 1;
        } else {
            i15 = 0;
        }
        if (i14 == 1) {
            if (this.f12271d) {
                this.f12271d = false;
                c15 = this.f12272e;
            } else {
                char[] cArr2 = new char[2];
                int iM8987a = m8987a(cArr2, 0, 2);
                if (iM8987a == -1) {
                    c3 = 65535;
                } else if (iM8987a == 1) {
                    c7 = cArr2[0];
                } else {
                    if (iM8987a != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iM8987a).toString());
                    }
                    this.f12272e = cArr2[1];
                    this.f12271d = true;
                    c14 = cArr2[0];
                }
            }
            if (c3 != 65535) {
                c3 = c7;
                c3 = c14;
                c3 = c15;
                cArr[i13] = c3;
                return i15 + 1;
            }
            if (i15 == 0) {
                return -1;
            }
            return i15;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i13, i14);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z13 = false;
        while (true) {
            charsetDecoder = this.f12269b;
            ByteBuffer byteBuffer = this.f12270c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z13);
            if (coderResultDecode.isUnderflow()) {
                if (z13 || !charBuffer.hasRemaining()) {
                    z4 = z13;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f12268a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z13 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th3) {
                    byteBuffer.flip();
                    throw th3;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z4 = z13;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z4) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i15;
    }
}
