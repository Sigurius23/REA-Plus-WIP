package uk0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uk0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Ljava/nio/ByteBuffer;", "b", "(Ljava/lang/String;)Ljava/nio/ByteBuffer;", "", "a", "([B)Ljava/lang/String;", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35050d {
    /* JADX INFO: renamed from: a */
    public static final String m110789a(byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        AbstractC22676k.m65749i(charsetDefaultCharset, "defaultCharset(...)");
        return AbstractC39414r.m125872R0(new String(bArr, charsetDefaultCharset), 0);
    }

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer m110790b(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        AbstractC22676k.m65749i(charsetDefaultCharset, "defaultCharset(...)");
        ByteBuffer byteBufferEncode = charsetDefaultCharset.encode(str);
        AbstractC22676k.m65749i(byteBufferEncode, "encode(...)");
        return byteBufferEncode;
    }
}
