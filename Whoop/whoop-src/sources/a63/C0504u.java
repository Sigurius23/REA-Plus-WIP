package a63;

import e93.AbstractC12889b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import o63.C27610a;
import p715kotlin.jvm.internal.AbstractC22676k;
import u63.AbstractC34560a;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: a63.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C0504u {

    /* JADX INFO: renamed from: d */
    public static final C0475a f1692d = new C0475a(2);

    /* JADX INFO: renamed from: e */
    public static final C27610a f1693e = new C27610a("HttpPlainText");

    /* JADX INFO: renamed from: a */
    public final Charset f1694a;

    /* JADX INFO: renamed from: b */
    public final Charset f1695b;

    /* JADX INFO: renamed from: c */
    public final String f1696c;

    public C0504u(Set charsets, Map charsetQuality, Charset responseCharsetFallback) {
        AbstractC22676k.m65750j(charsets, "charsets");
        AbstractC22676k.m65750j(charsetQuality, "charsetQuality");
        AbstractC22676k.m65750j(responseCharsetFallback, "responseCharsetFallback");
        this.f1694a = responseCharsetFallback;
        List<C23465k> listM74152u1 = AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(charsetQuality), new C0503t(1));
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listM74152u2 = AbstractC25265s.m74152u1(arrayList, new C0503t(0));
        StringBuilder sb4 = new StringBuilder();
        for (Charset charset : listM74152u2) {
            if (sb4.length() > 0) {
                sb4.append(",");
            }
            sb4.append(AbstractC34560a.m109275c(charset));
        }
        for (C23465k c23465k : listM74152u1) {
            Charset charset2 = (Charset) c23465k.f92937w;
            float fFloatValue = ((Number) c23465k.f92938x).floatValue();
            if (sb4.length() > 0) {
                sb4.append(",");
            }
            double d3 = fFloatValue;
            if (0.0d > d3 || d3 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb4.append(AbstractC34560a.m109275c(charset2) + ";q=" + (((double) AbstractC12889b.m36258X(100 * fFloatValue)) / 100.0d));
        }
        if (sb4.length() == 0) {
            sb4.append(AbstractC34560a.m109275c(this.f1694a));
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        this.f1696c = string;
        Charset charset3 = (Charset) AbstractC25265s.m74100H0(listM74152u2);
        if (charset3 == null) {
            C23465k c23465k2 = (C23465k) AbstractC25265s.m74100H0(listM74152u1);
            charset3 = c23465k2 != null ? (Charset) c23465k2.f92937w : null;
            if (charset3 == null) {
                charset3 = AbstractC39397a.f169546a;
            }
        }
        this.f1695b = charset3;
    }
}
