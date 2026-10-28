package mn;

import in.C18715c;
import in.C18717e;
import io.sentry.config.AbstractC20301a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p460rg.AbstractC31375j;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: mn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25703a extends AbstractC20301a {

    /* JADX INFO: renamed from: d */
    public static final Pattern f101209d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f101210b = AbstractC39717d.f170958c.newDecoder();

    /* JADX INFO: renamed from: c */
    public final CharsetDecoder f101211c = AbstractC39717d.f170957b.newDecoder();

    @Override // io.sentry.config.AbstractC20301a
    /* JADX INFO: renamed from: t */
    public final C18715c mo56358t(C18717e c18717e, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f101211c;
        CharsetDecoder charsetDecoder2 = this.f101210b;
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
            return new C18715c(new C25706d(bArr, null, null));
        }
        Matcher matcher = f101209d.matcher(string);
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
        return new C18715c(new C25706d(bArr, str, str2));
    }
}
