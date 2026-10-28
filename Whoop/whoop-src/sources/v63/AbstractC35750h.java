package v63;

import a63.C0476a0;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.C2990b0;
import bc3.C3022j0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC3027k1;
import e63.C12776e;
import hg3.AbstractC17269i;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.io.EOFException;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p005a3.C0227m1;
import p007a6.C0410c;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p579wc.C37074c;
import p610xc.C38185a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ud3.AbstractC34799a1;
import ud3.C34848w0;
import ud3.C34850x0;
import ve.InterfaceC35918c;
import w53.C36845b;
import w53.C36847d;
import w53.C36848e;
import w63.AbstractC36867b;
import w63.C36866a;
import wd3.C37170d;
import y53.AbstractC39246f;
import y53.C39241a;
import y53.C39247g;
import z53.C40115g;

/* JADX INFO: renamed from: v63.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35750h {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m113272a(C40115g c40115g, C12776e c12776e, AbstractC32269c abstractC32269c) {
        C39241a c39241a;
        if (abstractC32269c instanceof C39241a) {
            c39241a = (C39241a) abstractC32269c;
            int i13 = c39241a.f168742z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39241a.f168742z = i13 - Integer.MIN_VALUE;
            } else {
                c39241a = new C39241a(abstractC32269c);
            }
        } else {
            c39241a = new C39241a(abstractC32269c);
        }
        Object objPlus = c39241a.f168741y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39241a.f168742z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objPlus);
            InterfaceC3027k1 interfaceC3027k1 = c12776e.f43719e;
            c39241a.f168739w = c40115g;
            c39241a.f168740x = c12776e;
            c39241a.f168742z = 1;
            C2990b0 c2990b0 = AbstractC39246f.f168746a;
            C3031l1 c3031l1 = new C3031l1(interfaceC3027k1);
            objPlus = c40115g.f173155G.plus(c3031l1).plus(AbstractC39246f.f168746a);
            InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) c39241a.getContext().get(C3023j1.f12041w);
            if (interfaceC3027k2 != null) {
                c3031l1.invokeOnCompletion(new C0476a0(interfaceC3027k2.invokeOnCompletion(true, true, new C0227m1(c3031l1, 29)), 1));
            }
            if (objPlus != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objPlus);
            return objPlus;
        }
        c12776e = c39241a.f168740x;
        c40115g = c39241a.f168739w;
        AbstractC34132o.m107864I(objPlus);
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) objPlus;
        C3022j0 c3022j0M8711e = AbstractC3006f0.m8711e(c40115g, interfaceC30063j.plus(new C39247g(interfaceC30063j)), new C0410c(c40115g, c12776e, null, 27), 2);
        c39241a.f168739w = null;
        c39241a.f168740x = null;
        c39241a.f168742z = 2;
        Object objM8817m = c3022j0M8711e.m8817m(c39241a);
        return objM8817m == obj ? obj : objM8817m;
    }

    /* JADX INFO: renamed from: b */
    public static final File m113273b(Context context, String fileName) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC35918c m113274c(C37074c c37074c) {
        return new C38185a(c37074c);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m113275d(C35747e c35747e) throws Throwable {
        long jM113270s = c35747e.m113270s();
        if (jM113270s > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i13 = (int) jM113270s;
        AbstractC22676k.m65750j(c35747e, "<this>");
        if (i13 == 0) {
            return AbstractC36867b.f157705a;
        }
        byte[] bArr = new byte[i13];
        boolean z4 = true;
        C36866a c36866aM118252b = AbstractC36867b.m118252b(c35747e, 1);
        if (c36866aM118252b != null) {
            int i14 = 0;
            do {
                try {
                    int iMin = Math.min(i13, c36866aM118252b.f77287c - c36866aM118252b.f77286b);
                    AbstractC35745c.m113249l(c36866aM118252b, bArr, i14, iMin);
                    i13 -= iMin;
                    i14 += iMin;
                    if (i13 <= 0) {
                        AbstractC36867b.m118251a(c35747e, c36866aM118252b);
                        break;
                    }
                    try {
                        c36866aM118252b = AbstractC36867b.m118253c(c35747e, c36866aM118252b);
                    } catch (Throwable th3) {
                        th = th3;
                        z4 = false;
                        if (z4) {
                            AbstractC36867b.m118251a(c35747e, c36866aM118252b);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } while (c36866aM118252b != null);
        }
        if (i13 <= 0) {
            return bArr;
        }
        throw new EOFException(AbstractC2875y.m8296i(i13, "Premature end of stream: expected ", " bytes"));
    }

    /* JADX INFO: renamed from: e */
    public static String m113276e(C35747e c35747e, Charset charset) {
        AbstractC22676k.m65750j(c35747e, "<this>");
        AbstractC22676k.m65750j(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        AbstractC22676k.m65749i(charsetDecoderNewDecoder, "charset.newDecoder()");
        return AbstractC17269i.m48859D(charsetDecoderNewDecoder, c35747e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m113277f(C36845b c36845b, AbstractC32269c abstractC32269c) throws Throwable {
        C36847d c36847d;
        if (abstractC32269c instanceof C36847d) {
            c36847d = (C36847d) abstractC32269c;
            int i13 = c36847d.f157621y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c36847d.f157621y = i13 - Integer.MIN_VALUE;
            } else {
                c36847d = new C36847d(abstractC32269c);
            }
        } else {
            c36847d = new C36847d(abstractC32269c);
        }
        Object objM55857v = c36847d.f157620x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c36847d.f157621y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM55857v);
            InterfaceC20024q interfaceC20024qMo13322b = c36845b.m118140d().mo13322b();
            c36847d.f157619w = c36845b;
            c36847d.f157621y = 1;
            objM55857v = ((C20020m) interfaceC20024qMo13322b).m55857v(c36847d);
            if (objM55857v == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36845b = c36847d.f157619w;
            AbstractC34132o.m107864I(objM55857v);
        }
        return new C36848e(c36845b.f157615w, c36845b.m118139c(), c36845b.m118140d(), m113275d((C35747e) objM55857v));
    }

    /* JADX INFO: renamed from: g */
    public static final C34850x0 m113278g(C34850x0 c34850x0) {
        AbstractC22676k.m65750j(c34850x0, "<this>");
        C34848w0 c34848w0M109933h = c34850x0.m109933h();
        AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
        c34848w0M109933h.f146767g = new C37170d(abstractC34799a1.mo1942k(), abstractC34799a1.mo1941i());
        return c34848w0M109933h.m109930a();
    }
}
