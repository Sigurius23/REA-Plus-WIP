package p474s;

import a30.C0332w0;
import ag.C0853c;
import ag.C0855e;
import ag.EnumC0856f;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2570m;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import cf.AbstractC4537l;
import d33.C11636x;
import e93.AbstractC12889b;
import eg.C13166o;
import eo2.C13392l;
import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15761b;
import gg.InterfaceC15820g;
import gi.C15870a;
import gi.C15878i;
import gi.EnumC15876g;
import gi.InterfaceC15872c;
import h00.C16521p0;
import i93.C18283i;
import i93.C18284j;
import io.sentry.android.replay.video.C20245d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import l83.C23465k;
import m63.C25126d;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import mg.C25527i;
import mg.InterfaceC25526h;
import ng.C26671a;
import ng.C26672b;
import ng.C26676f;
import ng.C26678h;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025b1.AbstractC2218i;
import p026b2.C2314t;
import p091dg.C12002a;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C14970c1;
import p163g1.C15001f;
import p163g1.C15033h9;
import p249jc.AbstractC21598x;
import p335n6.InterfaceC26398o;
import p368og.C27914k;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31372g;
import p460rg.C31374i;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p460rg.InterfaceC31373h;
import p485sf.C32442n;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34881i;
import p522uf.C34866a0;
import p522uf.C34867b;
import p522uf.C34873e;
import p522uf.C34886m;
import p522uf.C34889p;
import p522uf.C34892s;
import p522uf.C34893t;
import p522uf.C34894u;
import p522uf.C34895v;
import p522uf.C34898y;
import p522uf.C34899z;
import p522uf.InterfaceC34875f;
import p522uf.InterfaceC34879h;
import p522uf.InterfaceC34885l;
import p545v6.C35726o;
import p545v6.C35727p;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p647yf.InterfaceC39492e;
import p667z0.C39919a;
import p667z0.C39924f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import tf.C33759d;
import uz1.C35429g;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: s.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32004s {
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m99532a(String text, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        Modifier modifier3;
        C28655q c28655q;
        Modifier modifier4;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1723562927);
        int i15 = i13 | (c28655q2.m87153g(text) ? 4 : 2);
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !c28655q2.m87121F()) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q = c28655q2;
                Modifier modifier5 = modifier3;
                AbstractC15011f9.m43114b(text, modifier5, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56277d, c28655q, i15 & 126, 0, 65528);
                modifier4 = modifier5;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                modifier4 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13392l(text, modifier4, i13, i14, 10);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28655q = c28655q2;
            Modifier modifier6 = modifier3;
            AbstractC15011f9.m43114b(text, modifier6, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56277d, c28655q, i15 & 126, 0, 65528);
            modifier4 = modifier6;
        } else {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28655q = c28655q2;
            Modifier modifier7 = modifier3;
            AbstractC15011f9.m43114b(text, modifier7, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56277d, c28655q, i15 & 126, 0, 65528);
            modifier4 = modifier7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13392l(text, modifier4, i13, i14, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m99533b(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2064964257);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            m99534c(modifier, c37816b, c28655q, ((i14 << 3) & 896) | (i14 & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier, c37816b, i13, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m99534c(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(771959668);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(null) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C28633k1 c28633k1 = new C28633k1(null, C28676v0.f115976y);
                c28655q.m87172p0(c28633k1);
                objM87133R = c28633k1;
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35429g(23, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87247a(AbstractC2218i.f8840b.mo86977a(m99553v((InterfaceC4339a) objM87133R2, c28655q, 0)), AbstractC37817c.m121344e(-291176396, c28655q, new C15001f(modifier, interfaceC28601c1, c37816b, 14)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier, c37816b, i13, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m99535d(List list, Resources resources) {
        float dimension = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (bc3.AbstractC3006f0.m8716j(r6, r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m99536e(p091dg.C12002a r6, s83.AbstractC32269c r7) {
        /*
            boolean r0 = r7 instanceof p522uf.C34897x
            if (r0 == 0) goto L13
            r0 = r7
            uf.x r0 = (p522uf.C34897x) r0
            int r1 = r0.f146965E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146965E = r1
            goto L18
        L13:
            uf.x r0 = new uf.x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f146969z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f146965E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f146968y
            java.util.Iterator r2 = r0.f146967x
            dg.a r5 = r0.f146966w
            p505ts.AbstractC34132o.m107864I(r7)
            r7 = r2
            r2 = r6
            r6 = r5
            goto L53
        L3f:
            p505ts.AbstractC34132o.m107864I(r7)
            gf.a r7 = p522uf.AbstractC34881i.f146916d
            java.lang.Object r7 = r6.mo33082b(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L6e
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
        L53:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r7.next()
            rf.l r5 = (p459rf.C31341l) r5
            r0.f146966w = r6
            r0.f146967x = r7
            r0.f146968y = r2
            r0.f146965E = r4
            java.lang.Object r5 = x43.AbstractC37978j.m121656q(r5, r0)
            if (r5 != r1) goto L53
            goto L81
        L6e:
            bc3.l1 r6 = r6.f39589x
            bc3.k1 r6 = bc3.AbstractC3006f0.m8725s(r6)
            r7 = 0
            r0.f146966w = r7
            r0.f146967x = r7
            r0.f146965E = r3
            java.lang.Object r6 = bc3.AbstractC3006f0.m8716j(r6, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p474s.AbstractC32004s.m99536e(dg.a, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public static final long m99537f(int i13, int i14, C15878i c15878i, EnumC15876g enumC15876g, C15878i c15878i2) {
        int i15;
        int i16;
        if (!AbstractC22676k.m65745e(c15878i, C15878i.f59992c)) {
            i13 = m99555x(c15878i.f59993a, enumC15876g);
            i14 = m99555x(c15878i.f59994b, enumC15876g);
        }
        InterfaceC15872c interfaceC15872c = c15878i2.f59993a;
        InterfaceC15872c interfaceC15872c2 = c15878i2.f59994b;
        if ((interfaceC15872c instanceof C15870a) && i13 != Integer.MIN_VALUE && i13 != Integer.MAX_VALUE && i13 > (i16 = ((C15870a) interfaceC15872c).f59978a)) {
            i13 = i16;
        }
        if ((interfaceC15872c2 instanceof C15870a) && i14 != Integer.MIN_VALUE && i14 != Integer.MAX_VALUE && i14 > (i15 = ((C15870a) interfaceC15872c2).f59978a)) {
            i14 = i15;
        }
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    /* JADX INFO: renamed from: g */
    public static final double m99538g(int i13, int i14, int i15, int i16, EnumC15876g enumC15876g) {
        double d3 = ((double) i15) / ((double) i13);
        double d14 = ((double) i16) / ((double) i14);
        int iOrdinal = enumC15876g.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d3, d14);
        }
        if (iOrdinal == 1) {
            return Math.min(d3, d14);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m99539h(byte[] bArr) throws Throwable {
        Inflater inflater;
        InflaterInputStream inflaterInputStream = null;
        try {
            inflater = new Inflater(true);
            try {
                InflaterInputStream inflaterInputStream2 = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    while (true) {
                        int i13 = inflaterInputStream2.read(bArr2);
                        if (i13 <= 0) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream2.close();
                            inflater.end();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i13);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inflaterInputStream = inflaterInputStream2;
                    if (inflaterInputStream != null) {
                        inflaterInputStream.close();
                    }
                    if (inflater != null) {
                        inflater.end();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            inflater = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m99540i(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == obj2;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            return Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
        }
        if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof char[]) && (obj2 instanceof char[])) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof float[]) && (obj2 instanceof float[])) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        return ((obj instanceof short[]) && (obj2 instanceof short[])) ? Arrays.equals((short[]) obj, (short[]) obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m99541j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0266 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0270 A[Catch: all -> 0x0269, TryCatch #6 {all -> 0x0269, blocks: (B:65:0x026c, B:67:0x0270, B:69:0x0283, B:68:0x0278, B:52:0x023f), top: B:80:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0278 A[Catch: all -> 0x0269, TryCatch #6 {all -> 0x0269, blocks: (B:65:0x026c, B:67:0x0270, B:69:0x0283, B:68:0x0278, B:52:0x023f), top: B:80:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: k */
    public static final Object m99542k(C25126d c25126d, InterfaceC39492e handler, Object obj, C11636x c11636x, InterfaceC30057d interfaceC30057d) throws Throwable {
        C34899z c34899z;
        InterfaceC31373h interfaceC31373h;
        InterfaceC30063j c26678h;
        InterfaceC25526h interfaceC25526h;
        C12002a c12002a;
        C25126d c25126d2 = c25126d;
        if (interfaceC30057d instanceof C34899z) {
            c34899z = (C34899z) interfaceC30057d;
            int i13 = c34899z.f146980z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c34899z.f146980z = i13 - Integer.MIN_VALUE;
            } else {
                c34899z = new C34899z(interfaceC30057d);
            }
        } else {
            c34899z = new C34899z(interfaceC30057d);
        }
        Object objM8705K = c34899z.f146979y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c34899z.f146980z;
        int i15 = 3;
        int i16 = 1;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                C20245d c20245d = (C20245d) c25126d2.f98484x;
                ArrayList arrayList = (ArrayList) c25126d2.f98482H;
                C12002a c12002a2 = (C12002a) c25126d2.f98485y;
                AbstractC22676k.m65750j(c20245d, "<this>");
                AbstractC22676k.m65750j(handler, "handler");
                C0332w0 c0332w0 = new C0332w0(c12002a2, arrayList, (C34895v) c25126d2.f98480F);
                C0855e c0855e = (C0855e) c20245d.f76048d;
                C0855e c0855e2 = new C0855e(2);
                EnumC0856f enumC0856f = EnumC0856f.f3062x;
                c0855e.m2064c(c0855e2, enumC0856f);
                c0855e.m2064c(new C0855e(c0332w0, i15), enumC0856f);
                c0855e.m2064c(new C0853c(C34866a0.f146876w), enumC0856f);
                C34892s c34892s = new C34892s(AbstractC37926s0.m121476n(new C34886m(new C34873e(AbstractC37926s0.m121476n(new C34886m(AbstractC37926s0.m121476n(AbstractC37926s0.m121476n(new C34867b(new C34873e(AbstractC37926s0.m121476n(handler, c0855e), (InterfaceC34879h) c25126d2.f98479E, c0332w0), c0332w0, (C34889p) c20245d.f76049e, (InterfaceC34875f) c20245d.f76050f), (C0855e) c20245d.f76047c), new C33759d((C13166o) c20245d.f76051g, (InterfaceC15820g) c20245d.f76052h, c0332w0)), i16), (C0855e) c20245d.f76046b), (InterfaceC34885l) c25126d2.f98486z, c0332w0), 0), (C0855e) c20245d.f76045a), c0332w0);
                C34894u c34894u = new C34894u(c12002a2, obj);
                C2570m c2570m = (C2570m) c25126d2.f98481G;
                String str = (String) c12002a2.mo33082b(AbstractC4537l.f18269b);
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str2 = (String) c12002a2.mo33082b(AbstractC4537l.f18268a);
                if (str2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Object obj2 = c2570m.f9985F;
                ((C31377l) ((InterfaceC25526h) c2570m.f9987x).mo75077d()).getClass();
                ((C26672b) ((InterfaceC25526h) c2570m.f9987x).mo75076b()).getClass();
                C15762c c15762c = new C15762c();
                c15762c.mo33083c(new C15760a("rpc.service"), str);
                c15762c.mo33083c(new C15760a("rpc.method"), str2);
                AbstractC21598x.m60675c0(AbstractC21598x.m60709w0((InterfaceC15761b) c2570m.f9989z), c15762c);
                String name = str + '.' + str2;
                EnumC31369d spanKind = (EnumC31369d) c2570m.f9988y;
                AbstractC22676k.m65750j(name, "name");
                AbstractC22676k.m65750j(spanKind, "spanKind");
                InterfaceC31373h.f129036s.getClass();
                C31371f c31371f = C31372g.f129035b;
                InterfaceC30063j interfaceC30063jPlus = new C25527i((InterfaceC25526h) c2570m.f9987x).plus(new C27914k(AbstractC25247g0.m74002k0(new C23465k[]{new C23465k("rpc", name), new C23465k("sdkInvocationId", (String) AbstractC21598x.m60654J(c12002a2, AbstractC34881i.f146917e))})));
                c12002a2.mo33083c(AbstractC34881i.f146919g, (C34893t) c2570m.f9984E);
                c12002a2.mo33083c(AbstractC34881i.f146920h, c15762c);
                arrayList.add(new C32442n((C34893t) c2570m.f9984E, str, str2));
                try {
                    C25527i c25527i = (C25527i) c34899z.getContext().get(C25527i.f99938x);
                    C26676f c26676f = (c25527i == null || (interfaceC25526h = c25527i.f99939w) == null || interfaceC25526h.mo75076b() == null) ? null : C26671a.f106051a;
                    C30064k c30064k = C30064k.f122676w;
                    if (c26676f != null) {
                        c26678h = new C26678h(c26676f);
                    } else {
                        c26678h = (C26678h) c34899z.getContext().get(C26678h.f106054x);
                        if (c26678h == null) {
                            c26678h = c30064k;
                        }
                    }
                    InterfaceC30063j interfaceC30063jPlus2 = interfaceC30063jPlus.plus(new C31374i(c31371f)).plus(c26678h).plus(c30064k);
                    interfaceC31373h = c31371f;
                    try {
                        try {
                            C34898y c34898y = new C34898y(interfaceC31373h, null, c34892s, c34894u, c11636x);
                            c34899z.f146977w = c25126d2;
                            c34899z.f146978x = interfaceC31373h;
                            c34899z.f146980z = 1;
                            objM8705K = AbstractC3006f0.m8705K(interfaceC30063jPlus2, c34898y, c34899z);
                            if (objM8705K != enumC31071a) {
                                interfaceC31373h.getClass();
                                c12002a = (C12002a) c25126d2.f98485y;
                                c34899z.f146977w = null;
                                c34899z.f146978x = objM8705K;
                                c34899z.f146980z = 2;
                                if (m99536e(c12002a, c34899z) == enumC31071a) {
                                    return objM8705K;
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            if (e instanceof CancellationException) {
                                AbstractC31375j.m96498n(interfaceC31373h, "cancelled", Boolean.TRUE);
                            } else {
                                EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                                ((C31371f) interfaceC31373h).getClass();
                                AbstractC31375j.m96497m(interfaceC31373h, e);
                            }
                            throw e;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC31373h.getClass();
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    interfaceC31373h = c31371f;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC31373h = c31371f;
                    interfaceC31373h.getClass();
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        Object obj3 = c34899z.f146978x;
                        AbstractC34132o.m107864I(objM8705K);
                        return obj3;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th5 = (Throwable) c34899z.f146978x;
                    AbstractC34132o.m107864I(objM8705K);
                    throw th5;
                }
                InterfaceC31373h interfaceC31373h2 = (InterfaceC31373h) c34899z.f146978x;
                C25126d c25126d3 = c34899z.f146977w;
                try {
                    AbstractC34132o.m107864I(objM8705K);
                    interfaceC31373h = interfaceC31373h2;
                    c25126d2 = c25126d3;
                    interfaceC31373h.getClass();
                    c12002a = (C12002a) c25126d2.f98485y;
                    c34899z.f146977w = null;
                    c34899z.f146978x = objM8705K;
                    c34899z.f146980z = 2;
                    if (m99536e(c12002a, c34899z) == enumC31071a) {
                        return objM8705K;
                    }
                } catch (Exception e14) {
                    e = e14;
                    interfaceC31373h = interfaceC31373h2;
                    if (e instanceof CancellationException) {
                        AbstractC31375j.m96498n(interfaceC31373h, "cancelled", Boolean.TRUE);
                    } else {
                        EnumC31370e[] enumC31370eArr2 = EnumC31370e.f129032w;
                        ((C31371f) interfaceC31373h).getClass();
                        AbstractC31375j.m96497m(interfaceC31373h, e);
                    }
                    throw e;
                } catch (Throwable th6) {
                    th = th6;
                    interfaceC31373h = interfaceC31373h2;
                    interfaceC31373h.getClass();
                    throw th;
                }
            }
        } catch (Throwable th7) {
            C12002a c12002a3 = (C12002a) c25126d2.f98485y;
            c34899z.f146977w = null;
            c34899z.f146978x = th7;
            c34899z.f146980z = 3;
            if (m99536e(c12002a3, c34899z) != enumC31071a) {
                throw th7;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m99543l(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            arrayList.add(jSONArray.get(((AbstractC25243e0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object objM99544m : arrayList) {
            if (objM99544m instanceof JSONArray) {
                objM99544m = m99543l((JSONArray) objM99544m);
            } else if (objM99544m instanceof JSONObject) {
                objM99544m = m99544m((JSONObject) objM99544m);
            } else if (AbstractC22676k.m65745e(objM99544m, "null")) {
                objM99544m = null;
            }
            if (objM99544m != null) {
                arrayList2.add(objM99544m);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public static Map m99544m(JSONObject jSONObject) {
        Map mapM114689q;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayNames.length());
        ArrayList<String> arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            arrayList.add(jSONArrayNames.getString(((AbstractC25243e0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object objOpt = jSONObject.opt(str);
            if (objOpt == null || objOpt.equals("null")) {
                mapM114689q = null;
            } else {
                if (objOpt instanceof JSONObject) {
                    objOpt = m99544m((JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    objOpt = m99543l((JSONArray) objOpt);
                }
                mapM114689q = AbstractC36095b.m114689q(objOpt, str);
            }
            if (mapM114689q != null) {
                arrayList2.add(mapM114689q);
            }
        }
        Iterator it3 = arrayList2.iterator();
        Map mapM73995d0 = C25272z.f99163w;
        while (it3.hasNext()) {
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, (Map) it3.next());
        }
        return mapM73995d0;
    }

    /* JADX INFO: renamed from: n */
    public static JSONArray m99545n(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object objValueOf : list) {
            if (objValueOf instanceof Map) {
                objValueOf = m99546o((Map) objValueOf);
            } else if (objValueOf instanceof List) {
                objValueOf = m99545n((List) objValueOf);
            } else if (!(objValueOf instanceof Number) && !(objValueOf instanceof Boolean)) {
                objValueOf = String.valueOf(objValueOf);
            }
            jSONArray.put(objValueOf);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: o */
    public static JSONObject m99546o(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, m99546o((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, m99545n((List) obj));
                    } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                        jSONObject.put(str, obj);
                    } else {
                        jSONObject.put(str, obj.toString());
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: p */
    public static String m99547p(String str) {
        if (str == null || "null".equals(str) || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static void m99548q(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static final String m99549r(JSONObject jSONObject) {
        String strM99547p = m99547p(jSONObject.optString("currency"));
        if (strM99547p == null || strM99547p.length() != 3) {
            return null;
        }
        return strM99547p;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Long m99550s(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.optLong(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final String m99551t(String str, JSONObject jSONObject) {
        return m99547p(jSONObject != null ? jSONObject.optString(str) : null);
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC26398o m99552u(InterfaceC26398o interfaceC26398o, float f13) {
        C35726o c35726o = new C35726o(f13, 2);
        return interfaceC26398o.mo78107d(new C35727p(new C35726o(0.0f, 3), c35726o, c35726o, new C35726o(0.0f, 3), c35726o, c35726o));
    }

    /* JADX INFO: renamed from: v */
    public static final C39924f m99553v(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
        boolean zM87153g = c28655q.m87153g(view);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C39924f(view, null, interfaceC4339a);
            c28655q.m87172p0(objM87133R);
        }
        C39924f c39924f = (C39924f) objM87133R;
        boolean zM87157i = c28655q.m87157i(c39924f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C39919a(c39924f, 3);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c39924f, (Function1) objM87133R2, c28655q);
        return c39924f;
    }

    /* JADX INFO: renamed from: w */
    public static final Object m99554w(C25126d c25126d, InterfaceC39492e interfaceC39492e, Object obj, InterfaceC30057d interfaceC30057d) {
        return m99542k(c25126d, interfaceC39492e, obj, new C11636x(2, 9, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: x */
    public static int m99555x(InterfaceC15872c interfaceC15872c, EnumC15876g enumC15876g) {
        if (interfaceC15872c instanceof C15870a) {
            return ((C15870a) interfaceC15872c).f59978a;
        }
        int iOrdinal = enumC15876g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
