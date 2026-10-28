package io.getstream.chat.android.client.api.interceptor;

import ae3.AbstractC0800h;
import ae3.C0801i;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import l83.InterfaceC23462h;
import ne3.C26616h;
import ne3.C26642v;
import ne3.InterfaceC26620j;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34818h0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import va3.AbstractC35854l;
import yb3.AbstractC39421y;
import zd3.C40563g;
import zd3.C40572p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;", "Lud3/g0;", "<init>", "()V", "Lne3/h;", "buffer", "Ljava/nio/charset/Charset;", "charset", "Ll83/a0;", "logRequestBody", "(Lne3/h;Ljava/nio/charset/Charset;)V", "Lud3/d0;", "headers", "", "bodyHasUnknownEncoding", "(Lud3/d0;)Z", "isProbablyUtf8", "(Lne3/h;)Z", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HttpLoggingInterceptor implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:Http");

    private final boolean bodyHasUnknownEncoding(C34807d0 headers) {
        String strM109863a = headers.m109863a("Content-Encoding");
        return (strM109863a == null || strM109863a.equalsIgnoreCase("identity") || strM109863a.equalsIgnoreCase("gzip")) ? false : true;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isProbablyUtf8(C26616h c26616h) {
        try {
            C26616h c26616h2 = new C26616h();
            long j7 = c26616h.f105866x;
            long j13 = 64;
            if (j7 <= 64) {
                j13 = j7;
            }
            c26616h.m79214k(c26616h2, 0L, j13);
            for (int i13 = 0; i13 < 16 && !c26616h2.mo79222o(); i13++) {
                int iM79196T0 = c26616h2.m79196T0();
                if (Character.isISOControl(iM79196T0) && !Character.isWhitespace(iM79196T0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    @StreamHandsOff(reason = "Request body shouldn't be log entirely as it might produce OutOfMemory exceptions when sending big files. The log will be limited to 1048576 bytes.")
    private final void logRequestBody(C26616h buffer, Charset charset) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, buffer.m79188M0(Math.min(buffer.f105866x, 1048576L), charset), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:109:0x02df  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:113:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x031e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x021f  */
    /* JADX WARN: Code duplicated, block: B:76:0x022b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0239  */
    /* JADX WARN: Code duplicated, block: B:80:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x0248  */
    /* JADX WARN: Code duplicated, block: B:84:0x0256  */
    /* JADX WARN: Code duplicated, block: B:86:0x025f  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a1  */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x02ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01bf, please report this as an issue */
    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws Exception {
        String str;
        Charset UTF_8;
        String str2;
        String str3;
        String str4;
        C34850x0 c34850x0M1939b;
        long millis;
        AbstractC34799a1 abstractC34799a1;
        C34807d0 c34807d0;
        String str5;
        long jMo1941i;
        String str6;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str7;
        C26616h c26616hMo79205f;
        Long lValueOf;
        C2345k logger2;
        InterfaceC2339e interfaceC2339e2;
        String str8;
        C2345k logger3;
        InterfaceC2339e interfaceC2339e3;
        String str9;
        C2345k logger4;
        InterfaceC2339e interfaceC2339e4;
        String str10;
        C2345k logger5;
        InterfaceC2339e interfaceC2339e5;
        String str11;
        C26642v c26642v;
        C2345k logger6;
        InterfaceC2339e interfaceC2339e6;
        String str12;
        C2345k logger7;
        InterfaceC2339e interfaceC2339e7;
        String str13;
        String strConcat;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        if (!C2343i.f9270b) {
            return c0801i.m1939b(c34832o0);
        }
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        String str14 = c34832o0.f146713b;
        C40563g c40563g = c0801i.f2954d;
        C40572p c40572pM131536c = c40563g != null ? c40563g.m131536c() : null;
        C34810e0 c34810e0 = c34832o0.f146712a;
        if (c40572pM131536c != null) {
            str = " " + c40572pM131536c.f174730g;
        } else {
            str = "";
        }
        String str15 = "--> " + str14 + " " + c34810e0 + str;
        if (abstractC34846v0 != null) {
            str15 = ((Object) str15) + " (" + abstractC34846v0.contentLength() + "-byte body)";
        }
        C2345k logger8 = getLogger();
        InterfaceC2339e interfaceC2339e8 = logger8.f9275c;
        String str16 = logger8.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e8.isLoggable(enumC2341g, str16)) {
            logger8.f9274b.log(enumC2341g, str16, str15, null);
        }
        try {
            if (abstractC34846v0 == null) {
                C2345k logger9 = getLogger();
                InterfaceC2339e interfaceC2339e9 = logger9.f9275c;
                String str17 = logger9.f9273a;
                if (interfaceC2339e9.isLoggable(enumC2341g, str17)) {
                    logger9.f9274b.log(enumC2341g, str17, AbstractC11266d.m30461o("--> END ", str14), null);
                }
            } else if (bodyHasUnknownEncoding(c34832o0.f146714c)) {
                C2345k logger10 = getLogger();
                InterfaceC2339e interfaceC2339e10 = logger10.f9275c;
                String str18 = logger10.f9273a;
                if (interfaceC2339e10.isLoggable(enumC2341g, str18)) {
                    logger10.f9274b.log(enumC2341g, str18, AbstractC11895b.m31996o("--> END ", str14, " (encoded body omitted)"), null);
                }
            } else {
                if (!abstractC34846v0.isDuplex()) {
                    if (abstractC34846v0.isOneShot()) {
                        C2345k logger11 = getLogger();
                        InterfaceC2339e interfaceC2339e11 = logger11.f9275c;
                        String str19 = logger11.f9273a;
                        if (interfaceC2339e11.isLoggable(enumC2341g, str19)) {
                            logger11.f9274b.log(enumC2341g, str19, AbstractC11895b.m31996o("--> END ", str14, " (one-shot body omitted)"), null);
                        }
                    } else {
                        C26616h c26616h = new C26616h();
                        abstractC34846v0.writeTo(c26616h);
                        C34818h0 contentType = abstractC34846v0.getContentType();
                        if (contentType == null || (UTF_8 = contentType.m109889a(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            AbstractC22676k.m65749i(UTF_8, "UTF_8");
                        }
                        C2345k logger12 = getLogger();
                        InterfaceC2339e interfaceC2339e12 = logger12.f9275c;
                        String str20 = logger12.f9273a;
                        if (interfaceC2339e12.isLoggable(enumC2341g, str20)) {
                            logger12.f9274b.log(enumC2341g, str20, "", null);
                        }
                        if (isProbablyUtf8(c26616h)) {
                            logRequestBody(c26616h, UTF_8);
                            C2345k logger13 = getLogger();
                            InterfaceC2339e interfaceC2339e13 = logger13.f9275c;
                            String str21 = logger13.f9273a;
                            if (interfaceC2339e13.isLoggable(enumC2341g, str21)) {
                                InterfaceC2344j interfaceC2344j = logger13.f9274b;
                                str2 = "";
                                str3 = " ";
                                StringBuilder sbM32000s = AbstractC11895b.m32000s("--> END ", str14, abstractC34846v0.contentLength(), " (");
                                sbM32000s.append("-byte body)");
                                interfaceC2344j.log(enumC2341g, str21, sbM32000s.toString(), null);
                            } else {
                                str2 = "";
                                str3 = " ";
                            }
                        } else {
                            str2 = "";
                            str3 = " ";
                            C2345k logger14 = getLogger();
                            InterfaceC2339e interfaceC2339e14 = logger14.f9275c;
                            String str22 = logger14.f9273a;
                            if (interfaceC2339e14.isLoggable(enumC2341g, str22)) {
                                InterfaceC2344j interfaceC2344j2 = logger14.f9274b;
                                str4 = str2;
                                StringBuilder sbM32000s2 = AbstractC11895b.m32000s("--> END ", str14, abstractC34846v0.contentLength(), " (binary ");
                                sbM32000s2.append("-byte body omitted)");
                                interfaceC2344j2.log(enumC2341g, str22, sbM32000s2.toString(), null);
                            }
                        }
                        str4 = str2;
                    }
                    long jNanoTime = System.nanoTime();
                    c34850x0M1939b = c0801i.m1939b(c34832o0);
                    millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    abstractC34799a1 = c34850x0M1939b.f146778G;
                    c34807d0 = c34850x0M1939b.f146777F;
                    str5 = c34850x0M1939b.f146791y;
                    AbstractC22676k.m65747g(abstractC34799a1);
                    jMo1941i = abstractC34799a1.mo1941i();
                    if (jMo1941i != -1) {
                        str6 = jMo1941i + "-byte";
                    } else {
                        str6 = "unknown-length";
                    }
                    logger = getLogger();
                    interfaceC2339e = logger.f9275c;
                    str7 = logger.f9273a;
                    if (interfaceC2339e.isLoggable(enumC2341g, str7)) {
                        InterfaceC2344j interfaceC2344j3 = logger.f9274b;
                        int i13 = c34850x0M1939b.f146792z;
                        if (str5.length() == 0) {
                            strConcat = str4;
                        } else {
                            strConcat = str3.concat(str5);
                        }
                        C34810e0 c34810e1 = c34850x0M1939b.f146789w.f146712a;
                        StringBuilder sb4 = new StringBuilder("<-- ");
                        sb4.append(i13);
                        sb4.append(strConcat);
                        sb4.append(str3);
                        sb4.append(c34810e1);
                        AbstractC2875y.m8285A(sb4, " (", millis, "ms, ");
                        interfaceC2344j3.log(enumC2341g, str7, AbstractC25012a.m73376i(str6, " body)", sb4), null);
                    }
                    if (!AbstractC0800h.m1933a(c34850x0M1939b)) {
                        logger7 = getLogger();
                        interfaceC2339e7 = logger7.f9275c;
                        str13 = logger7.f9273a;
                        if (interfaceC2339e7.isLoggable(enumC2341g, str13)) {
                            logger7.f9274b.log(enumC2341g, str13, "<-- END HTTP", null);
                            return c34850x0M1939b;
                        }
                    } else if (bodyHasUnknownEncoding(c34807d0)) {
                        logger6 = getLogger();
                        interfaceC2339e6 = logger6.f9275c;
                        str12 = logger6.f9273a;
                        if (interfaceC2339e6.isLoggable(enumC2341g, str12)) {
                            logger6.f9274b.log(enumC2341g, str12, "<-- END HTTP (encoded body omitted)", null);
                            return c34850x0M1939b;
                        }
                    } else {
                        InterfaceC26620j interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1();
                        interfaceC26620jMo1940d1.request(Long.MAX_VALUE);
                        c26616hMo79205f = interfaceC26620jMo1940d1.mo79205f();
                        if (AbstractC39421y.m125921F(c34807d0.m109863a("Content-Encoding"), "gzip", true)) {
                            lValueOf = Long.valueOf(c26616hMo79205f.f105866x);
                            c26642v = new C26642v(c26616hMo79205f.m79210i());
                            try {
                                c26616hMo79205f = new C26616h();
                                c26616hMo79205f.mo79189N0(c26642v);
                                c26642v.close();
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    AbstractC35854l.m113829i(c26642v, th3);
                                    throw th4;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        if (!isProbablyUtf8(c26616hMo79205f)) {
                            logger4 = getLogger();
                            interfaceC2339e4 = logger4.f9275c;
                            str10 = logger4.f9273a;
                            if (interfaceC2339e4.isLoggable(enumC2341g, str10)) {
                                logger4.f9274b.log(enumC2341g, str10, str4, null);
                            }
                            logger5 = getLogger();
                            interfaceC2339e5 = logger5.f9275c;
                            str11 = logger5.f9273a;
                            if (interfaceC2339e5.isLoggable(enumC2341g, str11)) {
                                logger5.f9274b.log(enumC2341g, str11, AbstractC31061c.m95636l(c26616hMo79205f.f105866x, "<-- END HTTP (binary ", "-byte body omitted)"), null);
                                return c34850x0M1939b;
                            }
                        } else if (lValueOf != null) {
                            logger3 = getLogger();
                            interfaceC2339e3 = logger3.f9275c;
                            str9 = logger3.f9273a;
                            if (interfaceC2339e3.isLoggable(enumC2341g, str9)) {
                                logger3.f9274b.log(enumC2341g, str9, "<-- END HTTP (" + c26616hMo79205f.f105866x + "-byte, " + lValueOf + "-gzipped-byte body omitted)", null);
                                return c34850x0M1939b;
                            }
                        } else {
                            logger2 = getLogger();
                            interfaceC2339e2 = logger2.f9275c;
                            str8 = logger2.f9273a;
                            if (interfaceC2339e2.isLoggable(enumC2341g, str8)) {
                                logger2.f9274b.log(enumC2341g, str8, AbstractC31061c.m95636l(c26616hMo79205f.f105866x, "<-- END HTTP (", "-byte body omitted)"), null);
                            }
                        }
                    }
                    return c34850x0M1939b;
                }
                C2345k logger15 = getLogger();
                InterfaceC2339e interfaceC2339e15 = logger15.f9275c;
                String str23 = logger15.f9273a;
                if (interfaceC2339e15.isLoggable(enumC2341g, str23)) {
                    logger15.f9274b.log(enumC2341g, str23, AbstractC11895b.m31996o("--> END ", str14, " (duplex request body omitted)"), null);
                }
            }
            c34850x0M1939b = c0801i.m1939b(c34832o0);
            millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            abstractC34799a1 = c34850x0M1939b.f146778G;
            c34807d0 = c34850x0M1939b.f146777F;
            str5 = c34850x0M1939b.f146791y;
            AbstractC22676k.m65747g(abstractC34799a1);
            jMo1941i = abstractC34799a1.mo1941i();
            if (jMo1941i != -1) {
                str6 = jMo1941i + "-byte";
            } else {
                str6 = "unknown-length";
            }
            logger = getLogger();
            interfaceC2339e = logger.f9275c;
            str7 = logger.f9273a;
            if (interfaceC2339e.isLoggable(enumC2341g, str7)) {
                InterfaceC2344j interfaceC2344j4 = logger.f9274b;
                int i14 = c34850x0M1939b.f146792z;
                if (str5.length() == 0) {
                    strConcat = str4;
                } else {
                    strConcat = str3.concat(str5);
                }
                C34810e0 c34810e2 = c34850x0M1939b.f146789w.f146712a;
                StringBuilder sb5 = new StringBuilder("<-- ");
                sb5.append(i14);
                sb5.append(strConcat);
                sb5.append(str3);
                sb5.append(c34810e2);
                AbstractC2875y.m8285A(sb5, " (", millis, "ms, ");
                interfaceC2344j4.log(enumC2341g, str7, AbstractC25012a.m73376i(str6, " body)", sb5), null);
            }
            if (!AbstractC0800h.m1933a(c34850x0M1939b)) {
                logger7 = getLogger();
                interfaceC2339e7 = logger7.f9275c;
                str13 = logger7.f9273a;
                if (interfaceC2339e7.isLoggable(enumC2341g, str13)) {
                    logger7.f9274b.log(enumC2341g, str13, "<-- END HTTP", null);
                    return c34850x0M1939b;
                }
            } else if (bodyHasUnknownEncoding(c34807d0)) {
                logger6 = getLogger();
                interfaceC2339e6 = logger6.f9275c;
                str12 = logger6.f9273a;
                if (interfaceC2339e6.isLoggable(enumC2341g, str12)) {
                    logger6.f9274b.log(enumC2341g, str12, "<-- END HTTP (encoded body omitted)", null);
                    return c34850x0M1939b;
                }
            } else {
                InterfaceC26620j interfaceC26620jMo1940d2 = abstractC34799a1.mo1940d1();
                interfaceC26620jMo1940d2.request(Long.MAX_VALUE);
                c26616hMo79205f = interfaceC26620jMo1940d2.mo79205f();
                if (AbstractC39421y.m125921F(c34807d0.m109863a("Content-Encoding"), "gzip", true)) {
                    lValueOf = Long.valueOf(c26616hMo79205f.f105866x);
                    c26642v = new C26642v(c26616hMo79205f.m79210i());
                    c26616hMo79205f = new C26616h();
                    c26616hMo79205f.mo79189N0(c26642v);
                    c26642v.close();
                } else {
                    lValueOf = null;
                }
                if (!isProbablyUtf8(c26616hMo79205f)) {
                    logger4 = getLogger();
                    interfaceC2339e4 = logger4.f9275c;
                    str10 = logger4.f9273a;
                    if (interfaceC2339e4.isLoggable(enumC2341g, str10)) {
                        logger4.f9274b.log(enumC2341g, str10, str4, null);
                    }
                    logger5 = getLogger();
                    interfaceC2339e5 = logger5.f9275c;
                    str11 = logger5.f9273a;
                    if (interfaceC2339e5.isLoggable(enumC2341g, str11)) {
                        logger5.f9274b.log(enumC2341g, str11, AbstractC31061c.m95636l(c26616hMo79205f.f105866x, "<-- END HTTP (binary ", "-byte body omitted)"), null);
                        return c34850x0M1939b;
                    }
                } else if (lValueOf != null) {
                    logger3 = getLogger();
                    interfaceC2339e3 = logger3.f9275c;
                    str9 = logger3.f9273a;
                    if (interfaceC2339e3.isLoggable(enumC2341g, str9)) {
                        logger3.f9274b.log(enumC2341g, str9, "<-- END HTTP (" + c26616hMo79205f.f105866x + "-byte, " + lValueOf + "-gzipped-byte body omitted)", null);
                        return c34850x0M1939b;
                    }
                } else {
                    logger2 = getLogger();
                    interfaceC2339e2 = logger2.f9275c;
                    str8 = logger2.f9273a;
                    if (interfaceC2339e2.isLoggable(enumC2341g, str8)) {
                        logger2.f9274b.log(enumC2341g, str8, AbstractC31061c.m95636l(c26616hMo79205f.f105866x, "<-- END HTTP (", "-byte body omitted)"), null);
                    }
                }
            }
            return c34850x0M1939b;
        } catch (Exception e5) {
            C2345k logger16 = getLogger();
            InterfaceC2339e interfaceC2339e16 = logger16.f9275c;
            String str24 = logger16.f9273a;
            if (interfaceC2339e16.isLoggable(EnumC2341g.INFO, str24)) {
                logger16.f9274b.log(EnumC2341g.INFO, str24, AbstractC2875y.m8297j(e5, "<-- HTTP FAILED: "), null);
            }
            throw e5;
        }
        str3 = " ";
        str4 = "";
        long jNanoTime2 = System.nanoTime();
    }
}
