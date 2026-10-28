package ge3;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.UserManager;
import android.view.View;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1848z0;
import androidx.room.C1831t1;
import b63.C2763a;
import b63.C2764b;
import b63.C2771i;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce3.C4515p;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.android.R;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import gb.C15645g;
import gb.C15648i;
import gb.C15656q;
import gb.C15659t;
import gb.C15660u;
import ge3.AbstractC15751g;
import hb3.AbstractC17108c0;
import i63.AbstractC18159b;
import i63.C18163d;
import ia3.C18295a;
import ia3.C18299e;
import ia3.InterfaceC18300f;
import io.ktor.utils.p228io.C20020m;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k63.InterfaceC22231a;
import k63.InterfaceC22232b;
import l83.C23454a0;
import l83.EnumC23463i;
import m83.AbstractC25260n;
import m93.InterfaceC25339g;
import n20.C26175j;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p005a3.C0222l0;
import p005a3.C0237p;
import p007a6.C0410c;
import p007a6.C0413d;
import p007a6.C0419f;
import p007a6.C0432j0;
import p007a6.C0440m;
import p014aj.C0928c;
import p026b2.C2314t;
import p026b2.C2319y;
import p027b3.AbstractC2453v1;
import p027b3.C2370e3;
import p048ce.C4463d;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12964i1;
import p114eb.C12967j1;
import p114eb.C12991u0;
import p132f0.C13825t;
import p138f6.C14132d;
import p163g1.AbstractC14981d1;
import p163g1.C14970c1;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17892j0;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17875c1;
import p208i2.C17887h;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p218ic.EnumC18346a;
import p238j0.InterfaceC21083i;
import p249jc.AbstractC21598x;
import p255jk.C21743a;
import p255jk.C21745c;
import p255jk.C21746d;
import p270k2.C22127a;
import p270k2.C22128b;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p293l2.C23224a;
import p293l2.C23226c;
import p293l2.InterfaceC23228e;
import p363ob.C27779b;
import p363ob.C27780c;
import p363ob.C27781d;
import p363ob.C27782e;
import p363ob.C27783f;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p392p3.C28758a;
import p392p3.C28772j;
import p392p3.C28781s;
import p505ts.AbstractC34132o;
import p514u5.C34536a;
import p634y1.AbstractC39038k;
import p636y3.C39169a;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qa3.EnumC30125d0;
import qa3.EnumC30147k1;
import r83.C31072b;
import r83.C31073c;
import r83.C31074d;
import r83.C31075e;
import r83.EnumC31071a;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.C31148p;
import r93.InterfaceC31123g;
import ro.C31624i;
import s63.C32236a;
import s83.AbstractC32267a;
import s83.AbstractC32269c;
import s83.AbstractC32274h;
import s93.InterfaceC32307i;
import se.AbstractC32416g;
import t83.C33617b;
import ud3.C34807d0;
import uf3.C34911a;
import v63.AbstractC35744b;
import v63.AbstractC35745c;
import va3.AbstractC35854l;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import x93.C38122n;
import xb3.C38175j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ge3.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15751g {
    /* JADX INFO: renamed from: A */
    public static final InterfaceC30063j m44421A(AbstractC1848z0 abstractC1848z0, boolean z4, AbstractC32269c abstractC32269c) {
        C1831t1 c1831t1 = (C1831t1) abstractC32269c.getContext().get(C1831t1.f7178x);
        InterfaceC30063j interfaceC30063j = c1831t1 != null ? c1831t1.f7179w : null;
        if (abstractC1848z0.inCompatibilityMode()) {
            if (interfaceC30063j != null) {
                return abstractC1848z0.getQueryContext().plus(interfaceC30063j);
            }
            return z4 ? abstractC1848z0.getTransactionContext$room_runtime() : abstractC1848z0.getQueryContext();
        }
        InterfaceC30063j queryContext = abstractC1848z0.getQueryContext();
        if (interfaceC30063j == null) {
            interfaceC30063j = C30064k.f122676w;
        }
        return queryContext.plus(interfaceC30063j);
    }

    /* JADX INFO: renamed from: B */
    public static final C34536a m44422B(View view) {
        C34536a c34536a = (C34536a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c34536a != null) {
            return c34536a;
        }
        C34536a c34536a2 = new C34536a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c34536a2);
        return c34536a2;
    }

    /* JADX INFO: renamed from: C */
    public static final C14132d m44423C(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC30057d m44424D(InterfaceC30057d interfaceC30057d) {
        InterfaceC30057d<Object> interfaceC30057dIntercepted;
        AbstractC22676k.m65750j(interfaceC30057d, "<this>");
        AbstractC32269c abstractC32269c = interfaceC30057d instanceof AbstractC32269c ? (AbstractC32269c) interfaceC30057d : null;
        return (abstractC32269c == null || (interfaceC30057dIntercepted = abstractC32269c.intercepted()) == null) ? interfaceC30057d : interfaceC30057dIntercepted;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m44425E(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m44426F(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m44427G(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX INFO: renamed from: H */
    public static final long m44428H(long j7, long j13, float f13) {
        float fM36249O = AbstractC12889b.m36249O(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j13 >> 32)), f13);
        float fM36249O2 = AbstractC12889b.m36249O(Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 & 4294967295L)), f13);
        return (((long) Float.floatToRawIntBits(fM36249O)) << 32) | (((long) Float.floatToRawIntBits(fM36249O2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: I */
    public static final C14132d m44429I(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: J */
    public static final int m44430J(EnumC30125d0 enumC30125d0) {
        int i13 = enumC30125d0 == null ? -1 : AbstractC17108c0.f65711a[enumC30125d0.ordinal()];
        if (i13 != 1) {
            int i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                    }
                }
            }
            return i14;
        }
        return 1;
    }

    /* JADX INFO: renamed from: K */
    public static final C34911a m44431K(Object... objArr) {
        return new C34911a(AbstractC25260n.m74055Z0(objArr));
    }

    /* JADX INFO: renamed from: L */
    public static final Object m44432L(AbstractC1848z0 db4, boolean z4, boolean z13, Function1 function1) {
        AbstractC22676k.m65750j(db4, "db");
        db4.assertNotMainThread();
        db4.assertNotSuspendingTransaction();
        InterfaceC30063j interfaceC30063j = db4.getSuspendingTransactionContext().get();
        if (interfaceC30063j == null) {
            interfaceC30063j = C30064k.f122676w;
        }
        return AbstractC12889b.m36260Z(new C27781d(interfaceC30063j, db4, z13, z4, function1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public static final Object m44433M(AbstractC1848z0 abstractC1848z0, Function1 function1, InterfaceC30057d interfaceC30057d) throws Throwable {
        C27782e c27782e;
        if (interfaceC30057d instanceof C27782e) {
            c27782e = (C27782e) interfaceC30057d;
            int i13 = c27782e.f112009z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27782e.f112009z = i13 - Integer.MIN_VALUE;
            } else {
                c27782e = new C27782e(interfaceC30057d);
            }
        } else {
            c27782e = new C27782e(interfaceC30057d);
        }
        Object objM44421A = c27782e.f112008y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c27782e.f112009z;
        InterfaceC30057d interfaceC30057d2 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM44421A);
            if (abstractC1848z0.inCompatibilityMode()) {
                C0432j0 c0432j0 = new C0432j0(abstractC1848z0, function1, interfaceC30057d2, 2);
                c27782e.f112009z = 1;
                Object objM88529f0 = AbstractC29125c.m88529f0(abstractC1848z0, c0432j0, c27782e);
                if (objM88529f0 != enumC31071a) {
                    return objM88529f0;
                }
            } else if (abstractC1848z0.inCompatibilityMode() && abstractC1848z0.isOpenInternal$room_runtime() && abstractC1848z0.inTransaction()) {
                C2319y c2319y = new C2319y(abstractC1848z0, function1, (InterfaceC30057d) null);
                c27782e.f112009z = 2;
                Object objUseConnection = abstractC1848z0.useConnection(false, c2319y, c27782e);
                if (objUseConnection != enumC31071a) {
                    return objUseConnection;
                }
            } else {
                c27782e.f112006w = abstractC1848z0;
                c27782e.f112007x = function1;
                c27782e.f112009z = 3;
                objM44421A = m44421A(abstractC1848z0, true, c27782e);
                if (objM44421A != enumC31071a) {
                }
            }
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM44421A);
            return objM44421A;
        }
        if (i14 == 2) {
            AbstractC34132o.m107864I(objM44421A);
            return objM44421A;
        }
        if (i14 != 3) {
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM44421A);
            return objM44421A;
        }
        function1 = c27782e.f112007x;
        abstractC1848z0 = c27782e.f112006w;
        AbstractC34132o.m107864I(objM44421A);
        C26175j c26175j = new C26175j(abstractC1848z0, function1, (InterfaceC30057d) null);
        c27782e.f112006w = null;
        c27782e.f112007x = null;
        c27782e.f112009z = 4;
        Object objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) objM44421A, c26175j, c27782e);
        return objM8705K == enumC31071a ? enumC31071a : objM8705K;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: N */
    public static final Object m44434N(AbstractC1848z0 abstractC1848z0, boolean z4, boolean z13, Function1 function1, InterfaceC30057d interfaceC30057d) throws Throwable {
        C27783f c27783f;
        boolean z14;
        AbstractC1848z0 abstractC1848z1;
        boolean z15;
        Function1 function2;
        if (interfaceC30057d instanceof C27783f) {
            c27783f = (C27783f) interfaceC30057d;
            int i13 = c27783f.f112011F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27783f.f112011F = i13 - Integer.MIN_VALUE;
            } else {
                c27783f = new C27783f(interfaceC30057d);
            }
        } else {
            c27783f = new C27783f(interfaceC30057d);
        }
        C27783f c27783f2 = c27783f;
        Object obj = c27783f2.f112010E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c27783f2.f112011F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC1848z0.inCompatibilityMode() && abstractC1848z0.isOpenInternal$room_runtime() && abstractC1848z0.inTransaction()) {
                C27779b c27779b = new C27779b(z13, z4, abstractC1848z0, null, function1, 1);
                c27783f2.f112011F = 1;
                Object objUseConnection = abstractC1848z0.useConnection(z4, c27779b, c27783f2);
                if (objUseConnection != enumC31071a) {
                    return objUseConnection;
                }
            } else {
                z14 = z4;
                c27783f2.f112012w = abstractC1848z0;
                c27783f2.f112013x = function1;
                c27783f2.f112014y = z14;
                c27783f2.f112015z = z13;
                c27783f2.f112011F = 2;
                InterfaceC30063j interfaceC30063jM44421A = m44421A(abstractC1848z0, z13, c27783f2);
                if (interfaceC30063jM44421A != enumC31071a) {
                    abstractC1848z1 = abstractC1848z0;
                    obj = interfaceC30063jM44421A;
                    z15 = z13;
                    function2 = function1;
                }
            }
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        boolean z16 = c27783f2.f112015z;
        z14 = c27783f2.f112014y;
        Function1 function3 = c27783f2.f112013x;
        AbstractC1848z0 abstractC1848z2 = c27783f2.f112012w;
        AbstractC34132o.m107864I(obj);
        z15 = z16;
        function2 = function3;
        abstractC1848z1 = abstractC1848z2;
        C27780c c27780c = new C27780c((InterfaceC30057d) null, abstractC1848z1, z14, z15, function2);
        c27783f2.f112012w = null;
        c27783f2.f112013x = null;
        c27783f2.f112011F = 3;
        Object objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) obj, c27780c, c27783f2);
        return objM8705K == enumC31071a ? enumC31071a : objM8705K;
    }

    /* JADX INFO: renamed from: O */
    public static byte[] m44435O(long j7, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC11895b.m31996o("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC11895b.m31996o("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC11895b.m31996o("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j7) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j7)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    while (true) {
                        int i13 = bufferedInputStream.read(bArr);
                        if (i13 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i13);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                bufferedInputStream.close();
                throw th6;
            }
        } catch (Throwable th7) {
            try {
                fileInputStream.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX INFO: renamed from: P */
    public static String m44436P(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        ?? r10;
        FileInputStream fileInputStream;
        ?? bufferedReader;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        try {
                            StringBuilder sb4 = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    String string = sb4.toString();
                                    AbstractC32416g.m101160q(fileInputStream);
                                    AbstractC32416g.m101160q(inputStreamReader);
                                    AbstractC32416g.m101160q(bufferedReader);
                                    return string;
                                }
                                sb4.append(line);
                                th = th;
                                fileInputStream2 = fileInputStream;
                                r10 = bufferedReader;
                                AbstractC32416g.m101160q(fileInputStream2);
                                AbstractC32416g.m101160q(inputStreamReader);
                                AbstractC32416g.m101160q(r10);
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            bufferedReader = bufferedReader;
                            AbstractC12350b.m34596q("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
                            AbstractC32416g.m101160q(fileInputStream);
                            AbstractC32416g.m101160q(inputStreamReader);
                            AbstractC32416g.m101160q(bufferedReader);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e13) {
                    e = e13;
                    bufferedReader = 0;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = 0;
                }
            } catch (Exception e14) {
                e = e14;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                AbstractC12350b.m34596q("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
                AbstractC32416g.m101160q(fileInputStream);
                AbstractC32416g.m101160q(inputStreamReader);
                AbstractC32416g.m101160q(bufferedReader);
                return null;
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                bufferedReader = 0;
            }
        } catch (Exception e15) {
            e = e15;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            r10 = 0;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static String m44437Q(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb4.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb4.toString();
                }
                sb4.append("\n");
                sb4.append(line2);
            }
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m44438R(InterfaceC22231a interfaceC22231a, C18163d c18163d, InterfaceC22232b interfaceC22232b) {
        C2764b c2764b = (C2764b) interfaceC22231a;
        c2764b.getClass();
        c2764b.f10892b.add(new C2763a(interfaceC22232b, c18163d, c18163d.equals(AbstractC18159b.f70468a) ? C2771i.f10908w : new C31624i(c18163d, 7)));
    }

    /* JADX INFO: renamed from: S */
    public static final C12991u0 m44439S(AbstractC12964i1[] abstractC12964i1Arr, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        Object[] objArrCopyOf = Arrays.copyOf(abstractC12964i1Arr, abstractC12964i1Arr.length);
        C28539n0 c28539n0 = new C28539n0(10, C15659t.f58764w, new C15660u(context, 0));
        boolean zM87157i = c28655q.m87157i(context);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C0222l0(context, 9);
            c28655q.m87172p0(objM87133R);
        }
        C12991u0 c12991u0 = (C12991u0) AbstractC39038k.m124459e(objArrCopyOf, c28539n0, (InterfaceC4339a) objM87133R, c28655q, 0, 4);
        for (AbstractC12964i1 abstractC12964i1 : abstractC12964i1Arr) {
            c12991u0.f44702w.m36450a(abstractC12964i1);
        }
        return c12991u0;
    }

    /* JADX INFO: renamed from: T */
    public static final long m44440T(float f13, long j7) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j7 >> 32)) - f13);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j7 & 4294967295L)) - f13);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: U */
    public static final C14132d m44441U(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: V */
    public static final C14132d m44442V(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: W */
    public static JSONArray m44443W(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = jSONArray.get(i13);
            if (obj.getClass().equals(String.class)) {
                String strSubstring = (String) obj;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONArray.put(i13, strSubstring);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i13, m44444X((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                JSONArray jSONArray2 = (JSONArray) obj;
                m44443W(jSONArray2);
                jSONArray.put(i13, jSONArray2);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: X */
    public static JSONObject m44444X(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC22676k.m65749i(itKeys, "obj.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC22676k.m65748h(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (obj.getClass().equals(String.class)) {
                    String strSubstring = (String) obj;
                    if (strSubstring.length() > 1024) {
                        strSubstring = strSubstring.substring(0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    jSONObject.put(str, strSubstring);
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(str, m44444X((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    m44443W(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: Y */
    public static final C32236a m44445Y(InterfaceC21461d kClass, InterfaceC21456a0 interfaceC21456a0, Type type) {
        AbstractC22676k.m65750j(kClass, "kClass");
        return new C32236a(kClass, interfaceC21456a0, type);
    }

    /* JADX INFO: renamed from: Z */
    public static Object m44446Z(InterfaceC4351m interfaceC4351m, Object obj, InterfaceC30057d interfaceC30057d) {
        AbstractC22676k.m65750j(interfaceC4351m, "<this>");
        InterfaceC30063j context = interfaceC30057d.getContext();
        Object c31074d = context == C30064k.f122676w ? new C31074d(interfaceC30057d) : new C31075e(context, interfaceC30057d);
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        return interfaceC4351m.invoke(obj, c31074d);
    }

    /* JADX INFO: renamed from: a */
    public static final C20020m m44447a(byte[] content) {
        AbstractC22676k.m65750j(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, 0, content.length);
        AbstractC22676k.m65749i(byteBufferWrap, "wrap(content, offset, length)");
        return new C20020m(byteBufferWrap);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m44448a0(File file, String str) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return true;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableUtilImpl", "Error while writing to file: " + file.toString(), e5);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m44449b(Modifier modifier, long j7, float f13, float f14, Composer composer, final int i13, final int i14) {
        int i15;
        long j13;
        float f15;
        int i16;
        boolean z4;
        final Modifier modifier2;
        final long j14;
        final float f16;
        final float f17;
        C28677v1 c28677v1M87180u;
        int i17;
        Modifier modifierM3398t;
        Modifier modifier3;
        long jM51541c;
        float f18;
        float density;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1249392198);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                j13 = j7;
                int i19 = c28655q.m87151f(j13) ? 32 : 16;
                i15 |= i19;
            } else {
                j13 = j7;
            }
            i15 |= i19;
        } else {
            j13 = j7;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                f15 = f13;
                i15 |= c28655q.m87147d(f15) ? 256 : 128;
            }
            i16 = i15 | 3072;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                i17 = i13 & 1;
                modifierM3398t = C2314t.f9131w;
                if (i17 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier3 = modifierM3398t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i14 & 2) != 0) {
                        jM51541c = C17919x.m51541c(0.12f, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e());
                    } else {
                        jM51541c = j13;
                    }
                    if (i24 != 0) {
                        f15 = 1;
                    }
                    f18 = 0;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier;
                    f18 = f14;
                    jM51541c = j13;
                }
                c28655q.m87175r();
                if (f18 != 0.0f) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, f18, 0.0f, 0.0f, 0.0f, 14);
                }
                if (C39174f.m124782b(f15, 0.0f)) {
                    c28655q.m87150e0(-455967894);
                    density = 1.0f / ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-455901337);
                    c28655q.m87173q(false);
                    density = f15;
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(density, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifierM3398t))), jM51541c, AbstractC17918w0.f69621a), c28655q, 0);
                f16 = f18;
                modifier2 = modifier3;
                j14 = jM51541c;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                j14 = j13;
                f16 = f14;
            }
            f17 = f15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15751g.m44449b(modifier2, j14, f17, f16, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 384;
        f15 = f13;
        i16 = i15 | 3072;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            i17 = i13 & 1;
            modifierM3398t = C2314t.f9131w;
            if (i17 != 0) {
                if (i18 != 0) {
                    modifier3 = modifierM3398t;
                } else {
                    modifier3 = modifier;
                }
                if ((i14 & 2) != 0) {
                    jM51541c = C17919x.m51541c(0.12f, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e());
                } else {
                    jM51541c = j13;
                }
                if (i24 != 0) {
                    f15 = 1;
                }
                f18 = 0;
            } else {
                if (i18 != 0) {
                    modifier3 = modifierM3398t;
                } else {
                    modifier3 = modifier;
                }
                if ((i14 & 2) != 0) {
                    jM51541c = C17919x.m51541c(0.12f, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e());
                } else {
                    jM51541c = j13;
                }
                if (i24 != 0) {
                    f15 = 1;
                }
                f18 = 0;
            }
            c28655q.m87175r();
            if (f18 != 0.0f) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, f18, 0.0f, 0.0f, 0.0f, 14);
            }
            if (C39174f.m124782b(f15, 0.0f)) {
                c28655q.m87150e0(-455967894);
                density = 1.0f / ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getDensity();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-455901337);
                c28655q.m87173q(false);
                density = f15;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(density, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifierM3398t))), jM51541c, AbstractC17918w0.f69621a), c28655q, 0);
            f16 = f18;
            modifier2 = modifier3;
            j14 = jM51541c;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            j14 = j13;
            f16 = f14;
        }
        f17 = f15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15751g.m44449b(modifier2, j14, f17, f16, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m44450c(float f13, float f14) {
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: d */
    public static final C12991u0 m44451d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C12991u0 c12991u0 = new C12991u0(context);
        C12967j1 c12967j1 = c12991u0.f44702w;
        c12967j1.m36450a(new C15645g(c12967j1));
        c12991u0.f44702w.m36450a(new C15648i());
        c12991u0.f44702w.m36450a(new C15656q());
        return c12991u0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    public static final Object m44452e(List list, C0440m c0440m, AbstractC32269c abstractC32269c) throws Throwable {
        C0413d c0413d;
        List list2;
        C22669g0 c22669g0;
        Iterator it;
        Throwable th3;
        Function1 function1;
        if (abstractC32269c instanceof C0413d) {
            c0413d = (C0413d) abstractC32269c;
            int i13 = c0413d.f1419z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0413d.f1419z = i13 - Integer.MIN_VALUE;
            } else {
                c0413d = new C0413d(abstractC32269c);
            }
        } else {
            c0413d = new C0413d(abstractC32269c);
        }
        Object obj = c0413d.f1418y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c0413d.f1419z;
        if (i14 != 0) {
            if (i14 == 1) {
                list2 = (List) c0413d.f1416w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0413d.f1417x;
                c22669g0 = (C22669g0) c0413d.f1416w;
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Throwable th4) {
                    Object obj3 = c22669g0.f89336w;
                    if (obj3 == null) {
                        c22669g0.f89336w = th4;
                    } else {
                        AbstractC29125c.m88530g((Throwable) obj3, th4);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                c0413d.f1416w = c22669g0;
                c0413d.f1417x = it;
                c0413d.f1419z = 2;
                if (function1.invoke(c0413d) == obj2) {
                    return obj2;
                }
            }
            th3 = (Throwable) c22669g0.f89336w;
            if (th3 == null) {
                return C23454a0.f92919a;
            }
            throw th3;
        }
        AbstractC34132o.m107864I(obj);
        ArrayList arrayList = new ArrayList();
        C0419f c0419f = new C0419f(list, arrayList, (InterfaceC30057d) null);
        c0413d.f1416w = arrayList;
        c0413d.f1419z = 1;
        if (c0440m.m1121a(c0419f, c0413d) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        c22669g0 = new C22669g0();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c0413d.f1416w = c22669g0;
            c0413d.f1417x = it;
            c0413d.f1419z = 2;
            if (function1.invoke(c0413d) == obj2) {
                return obj2;
            }
        }
        th3 = (Throwable) c22669g0.f89336w;
        if (th3 == null) {
            return C23454a0.f92919a;
        }
        throw th3;
    }

    /* JADX INFO: renamed from: f */
    public static final C14132d m44453f(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: g */
    public static final Modifier m44454g(Modifier modifier, C13825t c13825t, InterfaceC17869a1 interfaceC17869a1) {
        return m44456i(c13825t.f49345a, modifier, c13825t.f49346b, interfaceC17869a1);
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m44455h(Modifier modifier, float f13, long j7, InterfaceC17869a1 interfaceC17869a1) {
        return m44456i(f13, modifier, new C17875c1(j7), interfaceC17869a1);
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m44456i(float f13, Modifier modifier, AbstractC17911t abstractC17911t, InterfaceC17869a1 interfaceC17869a1) {
        return modifier.mo3471e(new BorderModifierNodeElement(f13, abstractC17911t, interfaceC17869a1));
    }

    /* JADX INFO: renamed from: j */
    public static long m44457j(boolean z4, int i13, EnumC18346a backoffPolicy, long j7, long j13, int i14, boolean z13, long j14, long j15, long j16, long j17) {
        AbstractC22676k.m65750j(backoffPolicy, "backoffPolicy");
        if (j17 != Long.MAX_VALUE && z13) {
            if (i14 != 0) {
                long j18 = j13 + 900000;
                if (j17 < j18) {
                    return j18;
                }
            }
            return j17;
        }
        if (z4) {
            long jScalb = backoffPolicy == EnumC18346a.f71444x ? j7 * ((long) i13) : (long) Math.scalb(j7, i13 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j13 + jScalb;
        }
        if (z13) {
            long j19 = i14 == 0 ? j13 + j14 : j13 + j16;
            return (j15 == j16 || i14 != 0) ? j19 : (j16 - j15) + j19;
        }
        if (j13 == -1) {
            return Long.MAX_VALUE;
        }
        return j13 + j14;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [c93.m, s83.h] */
    /* JADX INFO: renamed from: k */
    public static final void m44458k(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        C38175j c38175jM113247i = AbstractC35745c.m113247i((AbstractC32274h) AbstractC37926s0.m121477p(view).f99158b);
        while (c38175jM113247i.hasNext()) {
            ArrayList arrayList = m44422B((View) c38175jM113247i.next()).f145162a;
            for (int iM118951C = AbstractC37056f.m118951C(arrayList); -1 < iM118951C; iM118951C--) {
                ((C2370e3) arrayList.get(iM118951C)).f9352a.m7235d();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static C41113q m44459l(C41113q c41113q, InterfaceC31123g interfaceC31123g, C38122n c38122n, int i13) {
        if ((i13 & 2) != 0) {
            c38122n = null;
        }
        AbstractC22676k.m65750j(c41113q, "<this>");
        return new C41113q((C18295a) c41113q.f177224x, c38122n != null ? new C18299e(c41113q, interfaceC31123g, c38122n, 0) : (InterfaceC18300f) c41113q.f177225y, AbstractC30060g.m92087G(EnumC23463i.f92935y, new C4515p(c41113q, interfaceC31123g, false, 2)));
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC28601c1 m44460m(InterfaceC21083i interfaceC21083i, C28655q c28655q, int i13) {
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        boolean z4 = (((i13 & 14) ^ 6) > 4 && c28655q.m87153g(interfaceC21083i)) || (i13 & 6) == 4;
        Object objM87133R2 = c28655q.m87133R();
        if (z4 || objM87133R2 == c28676v0) {
            objM87133R2 = new C0410c(interfaceC21083i, interfaceC28601c1, null, 20);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC21083i);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: n */
    public static C34807d0 m44461n(C34807d0 c34807d0, C34807d0 c34807d1) {
        C22677k0 c22677k0 = new C22677k0(2, false);
        int size = c34807d0.size();
        for (int i13 = 0; i13 < size; i13++) {
            String strM109864c = c34807d0.m109864c(i13);
            String strM109867g = c34807d0.m109867g(i13);
            if ((!"Warning".equalsIgnoreCase(strM109864c) || !AbstractC39421y.m125930O(strM109867g, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, false)) && ("Content-Length".equalsIgnoreCase(strM109864c) || "Content-Encoding".equalsIgnoreCase(strM109864c) || "Content-Type".equalsIgnoreCase(strM109864c) || !m44425E(strM109864c) || c34807d1.m109863a(strM109864c) == null)) {
                c22677k0.m65765f(strM109864c, strM109867g);
            }
        }
        int size2 = c34807d1.size();
        for (int i14 = 0; i14 < size2; i14++) {
            String strM109864c2 = c34807d1.m109864c(i14);
            if (!"Content-Length".equalsIgnoreCase(strM109864c2) && !"Content-Encoding".equalsIgnoreCase(strM109864c2) && !"Content-Type".equalsIgnoreCase(strM109864c2) && m44425E(strM109864c2)) {
                c22677k0.m65765f(strM109864c2, c34807d1.m109867g(i14));
            }
        }
        return c22677k0.m65766g();
    }

    /* JADX INFO: renamed from: o */
    public static final C41113q m44462o(C41113q c41113q, InterfaceC32307i additionalAnnotations) {
        AbstractC22676k.m65750j(c41113q, "<this>");
        AbstractC22676k.m65750j(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? c41113q : new C41113q((C18295a) c41113q.f177224x, (InterfaceC18300f) c41113q.f177225y, AbstractC30060g.m92087G(EnumC23463i.f92935y, new C4463d(3, c41113q, additionalAnnotations)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static InterfaceC30057d m44463p(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, InterfaceC30057d interfaceC30057d2) {
        AbstractC22676k.m65750j(interfaceC4351m, "<this>");
        if (interfaceC4351m instanceof AbstractC32267a) {
            return ((AbstractC32267a) interfaceC4351m).create(interfaceC30057d, interfaceC30057d2);
        }
        InterfaceC30063j context = interfaceC30057d2.getContext();
        return context == C30064k.f122676w ? new C31072b(interfaceC4351m, interfaceC30057d2, interfaceC30057d) : new C31073c(interfaceC30057d2, context, interfaceC4351m, interfaceC30057d);
    }

    /* JADX INFO: renamed from: q */
    public static final C28772j m44464q(Context context) {
        return new C28772j(new C0928c(context), new C28758a(Build.VERSION.SDK_INT >= 31 ? C28781s.f116548a.m87532a(context) : 0));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m44465r(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!m44465r(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC31146o m44466s(EnumC30147k1 enumC30147k1) {
        switch (enumC30147k1 == null ? -1 : AbstractC17108c0.f65712b[enumC30147k1.ordinal()]) {
            case 1:
                C31148p INTERNAL = AbstractC31150q.f128352d;
                AbstractC22676k.m65749i(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                C31148p PRIVATE = AbstractC31150q.f128349a;
                AbstractC22676k.m65749i(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                C31148p PRIVATE_TO_THIS = AbstractC31150q.f128350b;
                AbstractC22676k.m65749i(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                C31148p PROTECTED = AbstractC31150q.f128351c;
                AbstractC22676k.m65749i(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                C31148p PUBLIC = AbstractC31150q.f128353e;
                AbstractC22676k.m65749i(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                C31148p LOCAL = AbstractC31150q.f128354f;
                AbstractC22676k.m65749i(LOCAL, "LOCAL");
                return LOCAL;
            default:
                C31148p PRIVATE2 = AbstractC31150q.f128349a;
                AbstractC22676k.m65749i(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: t */
    public static final void m44467t(InterfaceC22131e interfaceC22131e, C23226c c23226c) {
        boolean z4;
        float f13;
        InterfaceC17915v interfaceC17915vM716w = interfaceC22131e.mo744t0().m716w();
        C23226c c23226c2 = (C23226c) interfaceC22131e.mo744t0().f813y;
        InterfaceC23228e interfaceC23228e = c23226c.f91965a;
        if (c23226c.f91983s) {
            return;
        }
        c23226c.m67208a();
        if (!interfaceC23228e.mo67238j()) {
            try {
                c23226c.f91965a.mo67214A(c23226c.f91966b, c23226c.f91967c, c23226c, c23226c.f91969e);
            } catch (Throwable unused) {
            }
        }
        boolean z13 = interfaceC23228e.mo67227N() > 0.0f;
        if (z13) {
            interfaceC17915vM716w.mo51418i();
        }
        Canvas canvasM51433a = AbstractC17876d.m51433a(interfaceC17915vM716w);
        boolean zIsHardwareAccelerated = canvasM51433a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j7 = c23226c.f91984t;
            float f14 = (int) (j7 >> 32);
            float f15 = (int) (j7 & 4294967295L);
            long j13 = c23226c.f91985u;
            float f16 = ((int) (j13 >> 32)) + f14;
            float f17 = ((int) (j13 & 4294967295L)) + f15;
            float fMo67229a = interfaceC23228e.mo67229a();
            AbstractC17921y abstractC17921yMo67236h = interfaceC23228e.mo67236h();
            int iMo67252x = interfaceC23228e.mo67252x();
            if (fMo67229a < 1.0f || iMo67252x != 3 || abstractC17921yMo67236h != null || interfaceC23228e.mo67235g() == 1) {
                C17887h c17887hM51522j = c23226c.f91980p;
                if (c17887hM51522j == null) {
                    c17887hM51522j = AbstractC17918w0.m51522j();
                    c23226c.f91980p = c17887hM51522j;
                }
                c17887hM51522j.m51445c(fMo67229a);
                c17887hM51522j.m51446d(iMo67252x);
                c17887hM51522j.m51448f(abstractC17921yMo67236h);
                canvasM51433a = canvasM51433a;
                f13 = f14;
                canvasM51433a.saveLayer(f13, f15, f16, f17, c17887hM51522j.f69578a);
            } else {
                canvasM51433a.save();
                canvasM51433a = canvasM51433a;
                f13 = f14;
            }
            canvasM51433a.translate(f13, f15);
            canvasM51433a.concat(interfaceC23228e.mo67249u());
        }
        boolean z14 = !zIsHardwareAccelerated && c23226c.f91987w;
        if (z14) {
            interfaceC17915vM716w.mo51426q();
            AbstractC17904p0 abstractC17904p0M67211d = c23226c.m67211d();
            if (abstractC17904p0M67211d instanceof C17900n0) {
                InterfaceC17915v.m51498h(interfaceC17915vM716w, ((C17900n0) abstractC17904p0M67211d).f69601a);
            } else if (abstractC17904p0M67211d instanceof C17902o0) {
                C17891j c17891jM51478a = c23226c.f91977m;
                if (c17891jM51478a != null) {
                    c17891jM51478a.f69587a.rewind();
                } else {
                    c17891jM51478a = AbstractC17897m.m51478a();
                    c23226c.f91977m = c17891jM51478a;
                }
                InterfaceC17910s0.m51496b(c17891jM51478a, ((C17902o0) abstractC17904p0M67211d).f69602a);
                interfaceC17915vM716w.mo51423n(c17891jM51478a, 1);
            } else {
                if (!(abstractC17904p0M67211d instanceof C17898m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC17915vM716w.mo51423n(((C17898m0) abstractC17904p0M67211d).f69599a, 1);
            }
        }
        if (c23226c2 != null) {
            C23224a c23224a = c23226c2.f91982r;
            if (!c23224a.f91957a) {
                AbstractC17892j0.m51467a("Only add dependencies during a tracking");
            }
            C0059w0 c0059w0 = (C0059w0) c23224a.f91960d;
            if (c0059w0 != null) {
                c0059w0.m136a(c23226c);
            } else if (((C23226c) c23224a.f91958b) != null) {
                C0059w0 c0059w1 = AbstractC0018e1.f44a;
                C0059w0 c0059w2 = new C0059w0();
                C23226c c23226c3 = (C23226c) c23224a.f91958b;
                AbstractC22676k.m65747g(c23226c3);
                c0059w2.m136a(c23226c3);
                c0059w2.m136a(c23226c);
                c23224a.f91960d = c0059w2;
                c23224a.f91958b = null;
            } else {
                c23224a.f91958b = c23226c;
            }
            C0059w0 c0059w3 = (C0059w0) c23224a.f91961e;
            if (c0059w3 != null) {
                z4 = !c0059w3.m147l(c23226c);
            } else if (((C23226c) c23224a.f91959c) != c23226c) {
                z4 = true;
            } else {
                c23224a.f91959c = null;
                z4 = false;
            }
            if (z4) {
                c23226c.f91981q++;
            }
        }
        if (AbstractC17876d.m51433a(interfaceC17915vM716w).isHardwareAccelerated()) {
            interfaceC23228e.mo67217D(interfaceC17915vM716w);
        } else {
            C22128b c22128b = c23226c.f91979o;
            if (c22128b == null) {
                c22128b = new C22128b();
                c23226c.f91979o = c22128b;
            }
            C0237p c0237p = c22128b.f85852x;
            InterfaceC39171c interfaceC39171c = c23226c.f91966b;
            EnumC39181m enumC39181m = c23226c.f91967c;
            long jM113239l = AbstractC35744b.m113239l(c23226c.f91985u);
            C22127a c22127a = ((C22128b) c0237p.f814z).f85851w;
            InterfaceC39171c interfaceC39171c2 = c22127a.f85847a;
            EnumC39181m enumC39181m2 = c22127a.f85848b;
            InterfaceC17915v interfaceC17915vM716w2 = c0237p.m716w();
            long jM670A = c0237p.m670A();
            C23226c c23226c4 = (C23226c) c0237p.f813y;
            c0237p.m686Q(interfaceC39171c);
            c0237p.m689T(enumC39181m);
            c0237p.m685P(interfaceC17915vM716w);
            c0237p.m690U(jM113239l);
            c0237p.f813y = c23226c;
            interfaceC17915vM716w.mo51426q();
            try {
                c23226c.m67210c(c22128b);
                interfaceC17915vM716w.mo51417g();
                c0237p.m686Q(interfaceC39171c2);
                c0237p.m689T(enumC39181m2);
                c0237p.m685P(interfaceC17915vM716w2);
                c0237p.m690U(jM670A);
                c0237p.f813y = c23226c4;
            } catch (Throwable th3) {
                interfaceC17915vM716w.mo51417g();
                c0237p.m686Q(interfaceC39171c2);
                c0237p.m689T(enumC39181m2);
                c0237p.m685P(interfaceC17915vM716w2);
                c0237p.m690U(jM670A);
                c0237p.f813y = c23226c4;
                throw th3;
            }
        }
        if (z14) {
            interfaceC17915vM716w.mo51417g();
        }
        if (z13) {
            interfaceC17915vM716w.mo51427r();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasM51433a.restore();
    }

    /* JADX INFO: renamed from: u */
    public static final C33617b m44468u(Enum[] entries) {
        AbstractC22676k.m65750j(entries, "entries");
        return new C33617b(entries);
    }

    /* JADX INFO: renamed from: v */
    public static JSONObject m44469v(C21743a event) throws JSONException {
        AbstractC22676k.m65750j(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", event.mo61353a());
        String str = event.f83629a;
        if (str != null) {
            jSONObject.put("user_id", str);
        }
        String str2 = event.f83630b;
        if (str2 != null) {
            jSONObject.put("device_id", str2);
        }
        Long l7 = event.f83631c;
        if (l7 != null) {
            jSONObject.put("time", l7);
        }
        jSONObject.put("event_properties", m44444X(AbstractC12889b.m36272f0(event.f83625N)));
        jSONObject.put("user_properties", m44444X(AbstractC12889b.m36272f0(event.f83626O)));
        jSONObject.put("groups", m44444X(AbstractC12889b.m36272f0(event.f83627P)));
        jSONObject.put("group_properties", m44444X(AbstractC12889b.m36272f0(event.f83628Q)));
        String str3 = event.f83637i;
        if (str3 != null) {
            jSONObject.put("app_version", str3);
        }
        String str4 = event.f83639k;
        if (str4 != null) {
            jSONObject.put("platform", str4);
        }
        String str5 = event.f83640l;
        if (str5 != null) {
            jSONObject.put("os_name", str5);
        }
        String str6 = event.f83641m;
        if (str6 != null) {
            jSONObject.put("os_version", str6);
        }
        String str7 = event.f83642n;
        if (str7 != null) {
            jSONObject.put("device_brand", str7);
        }
        String str8 = event.f83643o;
        if (str8 != null) {
            jSONObject.put("device_manufacturer", str8);
        }
        String str9 = event.f83644p;
        if (str9 != null) {
            jSONObject.put("device_model", str9);
        }
        String str10 = event.f83645q;
        if (str10 != null) {
            jSONObject.put("carrier", str10);
        }
        String str11 = event.f83646r;
        if (str11 != null) {
            jSONObject.put("country", str11);
        }
        String str12 = event.f83647s;
        if (str12 != null) {
            jSONObject.put("region", str12);
        }
        String str13 = event.f83648t;
        if (str13 != null) {
            jSONObject.put("city", str13);
        }
        String str14 = event.f83649u;
        if (str14 != null) {
            jSONObject.put("dma", str14);
        }
        String str15 = event.f83612A;
        if (str15 != null) {
            jSONObject.put("language", str15);
        }
        Double d3 = event.f83618G;
        if (d3 != null) {
            jSONObject.put("price", d3);
        }
        Integer num = event.f83619H;
        if (num != null) {
            jSONObject.put("quantity", num);
        }
        Double d14 = event.f83617F;
        if (d14 != null) {
            jSONObject.put("revenue", d14);
        }
        String str16 = event.f83620I;
        if (str16 != null) {
            jSONObject.put("productId", str16);
        }
        String str17 = event.f83621J;
        if (str17 != null) {
            jSONObject.put("revenueType", str17);
        }
        Double d15 = event.f83635g;
        if (d15 != null) {
            jSONObject.put("location_lat", d15);
        }
        Double d16 = event.f83636h;
        if (d16 != null) {
            jSONObject.put("location_lng", d16);
        }
        String str18 = event.f83614C;
        if (str18 != null) {
            jSONObject.put("ip", str18);
        }
        String str19 = event.f83638j;
        if (str19 != null) {
            jSONObject.put("version_name", str19);
        }
        String str20 = event.f83650v;
        if (str20 != null) {
            jSONObject.put("idfa", str20);
        }
        String str21 = event.f83651w;
        if (str21 != null) {
            jSONObject.put("idfv", str21);
        }
        String str22 = event.f83652x;
        if (str22 != null) {
            jSONObject.put("adid", str22);
        }
        String str23 = event.f83654z;
        if (str23 != null) {
            jSONObject.put("android_id", str23);
        }
        Long l12 = event.f83632d;
        if (l12 != null) {
            jSONObject.put(AnalyticsRequestV2.PARAM_EVENT_ID, l12);
        }
        Long l13 = event.f83633e;
        if (l13 != null) {
            jSONObject.put("session_id", l13);
        }
        String str24 = event.f83634f;
        if (str24 != null) {
            jSONObject.put("insert_id", str24);
        }
        String str25 = event.f83613B;
        if (str25 != null) {
            jSONObject.put("library", str25);
        }
        String str26 = event.f83622K;
        if (str26 != null) {
            jSONObject.put("partner_id", str26);
        }
        String str27 = event.f83653y;
        if (str27 != null) {
            jSONObject.put("android_app_set_id", str27);
        }
        C21746d c21746d = event.f83615D;
        if (c21746d != null) {
            jSONObject.put("plan", c21746d.m61361a());
        }
        C21745c c21745c = event.f83616E;
        if (c21745c != null) {
            jSONObject.put("ingestion_metadata", c21745c.m61360g());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: w */
    public static final long m44470w(long j7, int i13, boolean z4, float f13) {
        int iM124765i = ((z4 || i13 == 2 || i13 == 4 || i13 == 5) && C39169a.m124761e(j7)) ? C39169a.m124765i(j7) : Integer.MAX_VALUE;
        if (C39169a.m124767k(j7) != iM124765i) {
            iM124765i = AbstractC12889b.m36284n(AbstractC37056f.m118989l(f13), C39169a.m124767k(j7), iM124765i);
        }
        return AbstractC35854l.m113834n(0, iM124765i, 0, C39169a.m124764h(j7));
    }

    /* JADX INFO: renamed from: x */
    public static final C14132d m44471x(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new C14132d(name);
    }

    /* JADX INFO: renamed from: y */
    public static final Object m44472y(Class cls, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
        InterfaceC21461d clazz = AbstractC21598x.m60666V(cls);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        AbstractC22676k.m65750j(clazz, "clazz");
        return c26669a.f106046a.f159364d.m122602a(interfaceC4339a, clazz, interfaceC35951a);
    }

    /* JADX INFO: renamed from: z */
    public static final int m44473z(InterfaceC25339g interfaceC25339g) {
        AbstractC22676k.m65750j(interfaceC25339g, "<this>");
        return interfaceC25339g.mo74408a().size();
    }
}
