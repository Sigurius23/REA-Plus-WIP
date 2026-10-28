package ga;

import ca.C4358a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p460rg.AbstractC31375j;
import p516u8.C34585c0;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: ga.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15614a extends AbstractC35903f {

    /* JADX INFO: renamed from: c */
    public static final Pattern f58620c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f58621a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f58622b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: n */
    public final C34585c0 mo31690n(C4358a c4358a, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f58622b;
        CharsetDecoder charsetDecoder2 = this.f58621a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th3) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th3;
            }
        } catch (Throwable th4) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th4;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C34585c0(new C15616c(bArr, null, null));
        }
        Matcher matcher = f58620c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM96499o = AbstractC31375j.m96499o(strGroup);
                strM96499o.getClass();
                if (strM96499o.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM96499o.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C34585c0(new C15616c(bArr, str, str2));
    }
}
