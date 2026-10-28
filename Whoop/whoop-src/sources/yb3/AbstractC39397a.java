package yb3;

import java.nio.charset.Charset;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39397a {

    /* JADX INFO: renamed from: a */
    public static final Charset f169546a;

    /* JADX INFO: renamed from: b */
    public static final Charset f169547b;

    /* JADX INFO: renamed from: c */
    public static final Charset f169548c;

    /* JADX INFO: renamed from: d */
    public static final Charset f169549d;

    /* JADX INFO: renamed from: e */
    public static final Charset f169550e;

    /* JADX INFO: renamed from: f */
    public static volatile Charset f169551f;

    /* JADX INFO: renamed from: g */
    public static volatile Charset f169552g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC22676k.m65749i(charsetForName, "forName(...)");
        f169546a = charsetForName;
        AbstractC22676k.m65749i(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        AbstractC22676k.m65749i(charsetForName2, "forName(...)");
        f169547b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        AbstractC22676k.m65749i(charsetForName3, "forName(...)");
        f169548c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        AbstractC22676k.m65749i(charsetForName4, "forName(...)");
        f169549d = charsetForName4;
        Charset charsetForName5 = Charset.forName("ISO-8859-1");
        AbstractC22676k.m65749i(charsetForName5, "forName(...)");
        f169550e = charsetForName5;
    }
}
