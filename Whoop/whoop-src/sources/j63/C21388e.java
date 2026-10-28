package j63;

import i63.C18163d;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import u63.AbstractC34560a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j63.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21388e extends AbstractC21385b {

    /* JADX INFO: renamed from: a */
    public final String f81811a;

    /* JADX INFO: renamed from: b */
    public final C18163d f81812b;

    /* JADX INFO: renamed from: c */
    public final byte[] f81813c;

    public C21388e(String text, C18163d contentType) {
        byte[] bytes;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(contentType, "contentType");
        this.f81811a = text;
        this.f81812b = contentType;
        Charset charsetM88536m = AbstractC29125c.m88536m(contentType);
        charsetM88536m = charsetM88536m == null ? AbstractC39397a.f169546a : charsetM88536m;
        if (AbstractC22676k.m65745e(charsetM88536m, AbstractC39397a.f169546a)) {
            bytes = AbstractC39421y.m125919D(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetM88536m.newEncoder();
            AbstractC22676k.m65749i(charsetEncoderNewEncoder, "charset.newEncoder()");
            int length = text.length();
            CharBuffer charBuffer = AbstractC34560a.f145563a;
            if (length == text.length()) {
                bytes = text.getBytes(charsetEncoderNewEncoder.charset());
                AbstractC22676k.m65749i(bytes, "input as java.lang.String).getBytes(charset())");
            } else {
                String strSubstring = text.substring(0, length);
                AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                bytes = strSubstring.getBytes(charsetEncoderNewEncoder.charset());
                AbstractC22676k.m65749i(bytes, "input.substring(fromInde…ring).getBytes(charset())");
            }
        }
        this.f81813c = bytes;
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: a */
    public final Long mo1201a() {
        return Long.valueOf(this.f81813c.length);
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: b */
    public final C18163d mo1202b() {
        return this.f81812b;
    }

    @Override // j63.AbstractC21385b
    /* JADX INFO: renamed from: d */
    public final byte[] mo1203d() {
        return this.f81813c;
    }

    public final String toString() {
        return "TextContent[" + this.f81812b + "] \"" + AbstractC39414r.m125866L0(30, this.f81811a) + '\"';
    }
}
