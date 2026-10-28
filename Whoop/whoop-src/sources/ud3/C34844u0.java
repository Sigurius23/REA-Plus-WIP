package ud3;

import java.io.File;
import java.nio.charset.Charset;
import l83.C23465k;
import p557vo.AbstractC36221c;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ud3.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34844u0 {
    /* JADX INFO: renamed from: a */
    public static C34834p0 m109924a(File file, C34818h0 c34818h0) {
        AbstractC22676k.m65750j(file, "<this>");
        return new C34834p0(file, c34818h0);
    }

    /* JADX INFO: renamed from: b */
    public static C34842t0 m109925b(String str, C34818h0 c34818h0) {
        AbstractC22676k.m65750j(str, "<this>");
        C23465k c23465kM115321b = AbstractC36221c.m115321b(c34818h0);
        Charset charset = (Charset) c23465kM115321b.f92937w;
        C34818h0 c34818h1 = (C34818h0) c23465kM115321b.f92938x;
        byte[] bytes = str.getBytes(charset);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        return m109926c(c34818h1, bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: c */
    public static C34842t0 m109926c(C34818h0 c34818h0, byte[] bArr, int i13, int i14) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC37172f.m119116a(bArr.length, i13, i14);
        return new C34842t0(c34818h0, bArr, i14, i13);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C34842t0 m109927d(C34844u0 c34844u0, byte[] bArr, C34818h0 c34818h0, int i13, int i14) {
        if ((i14 & 1) != 0) {
            c34818h0 = null;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        int length = bArr.length;
        c34844u0.getClass();
        return m109926c(c34818h0, bArr, i13, length);
    }
}
