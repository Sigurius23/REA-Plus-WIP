package p479s4;

import a10.AbstractC0122j;
import a10.C0114b;
import a10.C0115c;
import a10.C0116d;
import a10.C0117e;
import a10.C0118f;
import a10.C0119g;
import a10.C0121i;
import a10.EnumC0120h;
import a30.C0319q;
import a30.C0323s;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import com.google.android.exoplayer2.ParserException;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import h20.C16746u4;
import h40.C16837c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kr.C22786e;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import org.json.JSONObject;
import p027b3.AbstractC2399k2;
import p031b9.C2817b;
import p043c4.AbstractC3979v;
import p141f9.C14279u;
import p163g1.AbstractC15170v4;
import p163g1.C15120q4;
import p208i2.C17919x;
import p335n6.C26385b;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.C28679w;
import p390p1.C28688y1;
import p390p1.InterfaceC28663s;
import p395p6.C28894l;
import p395p6.C28899m1;
import p474s.AbstractC32004s;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p520ud.C34784e;
import p537ux.C35338j;
import p537ux.EnumC35336i;
import p550vd.AbstractC35903f;
import p579wc.C37082e1;
import p598wy.InterfaceC37689b;
import p605x6.C37999d;
import p605x6.C38012q;
import p605x6.C38013r;
import p605x6.C38015t;
import p605x6.C38017v;
import p605x6.InterfaceC38016u;
import p635y2.AbstractC39101i1;
import p635y2.C39117o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sz.C33122b0;
import te0.AbstractC33745d;
import wr1.C37572f;
import x30.C37894h1;
import y00.C38793c;
import y00.C38887l3;
import y00.C38986w3;
import y00.C38995x3;
import y00.C39004y3;
import y00.C39013z3;
import y00.EnumC38853i;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: s4.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32126g implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m100036a(float f13, int i13, long j7, long j13, Composer composer, Modifier modifier) {
        int i14;
        int i15;
        long j14;
        long j15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1612004165);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        int i16 = i14 | 3072;
        if ((i13 & 24576) == 0) {
            i16 = i14 | 11264;
        }
        if ((i16 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            j15 = j13;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                i15 = i16 & (-57345);
                j14 = C17919x.f69636m;
            } else {
                c28655q.m87138X();
                i15 = i16 & (-57345);
                j14 = j13;
            }
            c28655q.m87175r();
            if (((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                c28655q.m87150e0(624878673);
                int i17 = i15 << 3;
                AbstractC15170v4.m43201a(f13, (i17 & 57344) | (i17 & 112) | 6 | (i17 & 896) | (i17 & 7168), j7, j14, c28655q, modifier);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(625159223);
                AbstractC15170v4.m43202b(modifier, j7, f13, j14, 0, c28655q, i15 & 65534, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            j15 = j14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15120q4(modifier, j7, f13, j15, i13, 3, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: b */
    public static final float m100037b(AbstractC39101i1 abstractC39101i1, boolean z4, C39117o[] c39117oArr, float f13) {
        float f14 = Float.NaN;
        for (C39117o c39117o : c39117oArr) {
            float fMo124629b = abstractC39101i1.mo124629b(c39117o);
            if (Float.isNaN(f14)) {
                f14 = fMo124629b;
            } else if (z4 == (fMo124629b > f14)) {
                f14 = fMo124629b;
            }
        }
        return Float.isNaN(f14) ? f13 : f14;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v8, types: [p1.s] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p6.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p1.y1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [bc3.k1] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [x6.d] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: c */
    public static final Object m100038c(InterfaceC38016u interfaceC38016u, Context context, C28894l c28894l, C38015t c38015t, C37572f c37572f, AbstractC32269c abstractC32269c) throws Throwable {
        C38013r c38013r;
        ?? r10;
        C37999d c37999d;
        C28688y1 c28688y1;
        C28894l c28894l2;
        C2996c2 c2996c2;
        Context context2;
        C38015t c38015t2;
        InterfaceC38016u interfaceC38016u2;
        C28688y1 c28688y2;
        InterfaceC3027k1 interfaceC3027k1;
        C37999d c37999d2;
        InterfaceC28663s interfaceC28663s;
        C28679w c28679w;
        C28688y1 c28688y3;
        C28679w c28679w2;
        int i13;
        ?? r14 = context;
        ?? r15 = c28894l;
        if (abstractC32269c instanceof C38013r) {
            c38013r = (C38013r) abstractC32269c;
            i13 = c38013r.f162832J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                int i14 = i13 - Integer.MIN_VALUE;
                c38013r.f162832J = i14;
                r10 = i14;
            } else {
                c38013r = new C38013r(abstractC32269c);
                r10 = i13;
            }
        } else {
            c38013r = new C38013r(abstractC32269c);
            r10 = i13;
        }
        C38013r c38013r2 = c38013r;
        Object obj = c38013r2.f162831I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r16 = c38013r2.f162832J;
        int i15 = 2;
        InterfaceC30057d interfaceC30057d = null;
        try {
            if (r16 != 0) {
                try {
                    if (r16 == 1) {
                        C28679w c28679w3 = c38013r2.f162830H;
                        C28688y1 c28688y4 = c38013r2.f162829G;
                        C2996c2 c2996c3 = c38013r2.f162828F;
                        C37999d c37999d3 = c38013r2.f162827E;
                        C38015t c38015t3 = (C38015t) c38013r2.f162836z;
                        C28894l c28894l3 = (C28894l) c38013r2.f162835y;
                        Context context3 = (Context) c38013r2.f162834x;
                        InterfaceC38016u interfaceC38016u3 = (InterfaceC38016u) c38013r2.f162833w;
                        AbstractC34132o.m107864I(obj);
                        c37999d = c37999d3;
                        c28688y1 = c28688y4;
                        c28894l2 = c28894l3;
                        c2996c2 = c2996c3;
                        context2 = context3;
                        c38015t2 = c38015t3;
                        interfaceC38016u2 = interfaceC38016u3;
                        c28679w = c28679w3;
                    } else {
                        if (r16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC28663s interfaceC28663s2 = (InterfaceC28663s) c38013r2.f162836z;
                        c28688y2 = (C28688y1) c38013r2.f162835y;
                        interfaceC3027k1 = (InterfaceC3027k1) c38013r2.f162834x;
                        c37999d2 = (C37999d) c38013r2.f162833w;
                        AbstractC34132o.m107864I(obj);
                        interfaceC28663s = interfaceC28663s2;
                    }
                    interfaceC28663s.dispose();
                    c37999d2.m121738a();
                    interfaceC3027k1.cancel((CancellationException) null);
                    c28688y2.m87290v();
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    th = th3;
                    r16.dispose();
                    r10.m121738a();
                    r14.cancel(null);
                    r15.m87290v();
                    throw th;
                }
            }
            AbstractC34132o.m107864I(obj);
            c37999d = new C37999d(interfaceC38016u);
            C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(interfaceC38016u, null, null, new C16746u4(i15, 2, interfaceC30057d), 3);
            r15.getClass();
            C28899m1 c28899m1 = new C28899m1(50);
            C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
            C38012q c38012q = new C38012q(interfaceC38016u, r15, r14);
            c37572f.getClass();
            C3031l1 c3031l1M8709c = AbstractC3006f0.m8709c();
            InterfaceC2994c0 interfaceC2994c0 = ((C38017v) interfaceC38016u).f162844w;
            InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w);
            if (interfaceC3027k2 != null) {
                interfaceC3027k2.invokeOnCompletion(new C37894h1(c3031l1M8709c, 1));
            }
            C28688y1 c28688y5 = new C28688y1(interfaceC2994c0.getCoroutineContext().plus(c3031l1M8709c).plus(c38012q));
            C28679w c28679w4 = new C28679w(c28688y5, new C26385b(c28899m1));
            try {
                try {
                    c28679w2 = c28679w4;
                    c28688y3 = c28688y5;
                    try {
                        AbstractC3006f0.m8732z(interfaceC38016u, c37999d, null, new C0323s(c28679w4, r15, r14, c28688y5, interfaceC38016u, null, 6), 2);
                        c28894l2 = c28894l;
                        try {
                            context2 = context;
                            interfaceC38016u2 = interfaceC38016u;
                            AbstractC3006f0.m8732z(interfaceC38016u2, null, null, new C0319q(c28688y3, c28894l2, c13045h2M36593c, context, c28899m1, interfaceC38016u, c38015t, (InterfaceC30057d) null, 3), 3);
                            C16837c c16837c = new C16837c(2, 5, interfaceC30057d);
                            c38013r2.f162833w = interfaceC38016u2;
                            c38013r2.f162834x = context2;
                            c38013r2.f162835y = c28894l2;
                            c38015t2 = c38015t;
                            c38013r2.f162836z = c38015t2;
                            c38013r2.f162827E = c37999d;
                            c2996c2 = c2996c2M8732z;
                            try {
                                c38013r2.f162828F = c2996c2;
                                c38013r2.f162829G = c28688y3;
                                c38013r2.f162830H = c28679w2;
                                c38013r2.f162832J = 1;
                                if (AbstractC13091v.m36616z(c13045h2M36593c, c16837c, c38013r2) != enumC31071a) {
                                    c28688y1 = c28688y3;
                                    c28679w = c28679w2;
                                }
                                return enumC31071a;
                            } catch (Throwable th4) {
                                th = th4;
                                r15 = c28688y3;
                                r14 = c2996c2;
                                r16 = c28679w2;
                                r10 = c37999d;
                                r16.dispose();
                                r10.m121738a();
                                r14.cancel(null);
                                r15.m87290v();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c2996c2 = c2996c2M8732z;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c2996c2 = c2996c2M8732z;
                        r15 = c28688y3;
                        r14 = c2996c2;
                        r16 = c28679w2;
                        r10 = c37999d;
                        r16.dispose();
                        r10.m121738a();
                        r14.cancel(null);
                        r15.m87290v();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c28679w2 = c28679w4;
                    c28688y3 = c28688y5;
                }
            } catch (Throwable th8) {
                th = th8;
                c28688y3 = c28688y5;
                c28679w2 = c28679w4;
            }
            C37082e1 c37082e1 = new C37082e1(interfaceC38016u2, c38015t2, c28894l2, c37999d);
            c38013r2.f162833w = c37999d;
            c38013r2.f162834x = c2996c2;
            c38013r2.f162835y = c28688y1;
            c38013r2.f162836z = c28679w;
            c38013r2.f162827E = null;
            c38013r2.f162828F = null;
            c38013r2.f162829G = null;
            c38013r2.f162830H = null;
            c38013r2.f162832J = 2;
            if (c28894l2.m87815c(context2, c37082e1, c38013r2) != enumC31071a) {
                c28688y2 = c28688y1;
                interfaceC3027k1 = c2996c2;
                c37999d2 = c37999d;
                interfaceC28663s = c28679w;
                interfaceC28663s.dispose();
                c37999d2.m121738a();
                interfaceC3027k1.cancel((CancellationException) null);
                c28688y2.m87290v();
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (Throwable th9) {
            th = th9;
            r15 = c28688y1;
            r14 = c2996c2;
            r16 = c28679w;
            r10 = c37999d;
            r16.dispose();
            r10.m121738a();
            r14.cancel(null);
            r15.m87290v();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m100039d(String str, boolean z4) throws ParserException {
        if (!z4) {
            throw ParserException.m15562a(null, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C35338j m100040e(C33122b0 c33122b0) {
        EnumC35336i enumC35336i;
        AbstractC22676k.m65750j(c33122b0, "<this>");
        boolean z4 = c33122b0.f138163w;
        int iOrdinal = c33122b0.f138164x.ordinal();
        if (iOrdinal == 0) {
            enumC35336i = EnumC35336i.Min;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            enumC35336i = EnumC35336i.Full;
        }
        return new C35338j(z4, enumC35336i, c33122b0.f138165y);
    }

    /* JADX INFO: renamed from: f */
    public static IconCompat m100041f(Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            return IconCompat.m3681e(null, icon.getResPackage(), icon.getResId());
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            PorterDuff.Mode mode = IconCompat.f5264k;
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f5266b = string;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f5266b = icon;
            return iconCompat2;
        }
        Uri uri2 = icon.getUri();
        PorterDuff.Mode mode2 = IconCompat.f5264k;
        uri2.getClass();
        String string2 = uri2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f5266b = string2;
        return iconCompat3;
    }

    /* JADX INFO: renamed from: g */
    public static final C34784e m100042g(C2817b c2817b) {
        Object objM107888l;
        Object objM107888l2;
        C14279u c14279u = new C14279u(3);
        while (true) {
            C2817b c2817bM8017t = c2817b.m8017t();
            if (c2817bM8017t == null) {
                break;
            }
            String strM8014q = c2817bM8017t.m8014q();
            if (AbstractC22676k.m65745e(strM8014q, "AssumedRoleId")) {
                try {
                    objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#assumedRoleIdType`)", thM68037a);
                }
                AbstractC34132o.m107864I(objM107888l);
                c14279u.f52139c = (String) objM107888l;
            } else if (AbstractC22676k.m65745e(strM8014q, "Arn")) {
                try {
                    objM107888l2 = AbstractC35903f.m114017l(c2817bM8017t);
                } catch (Throwable th4) {
                    objM107888l2 = AbstractC34132o.m107888l(th4);
                }
                Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
                if (thM68037a2 != null) {
                    objM107888l2 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#arnType`)", thM68037a2);
                }
                AbstractC34132o.m107864I(objM107888l2);
                c14279u.f52138b = (String) objM107888l2;
            }
            c2817bM8017t.m8009j();
        }
        if (c14279u.f52138b == null) {
            c14279u.f52138b = "";
        }
        if (c14279u.f52139c == null) {
            c14279u.f52139c = "";
        }
        return new C34784e(c14279u);
    }

    /* JADX INFO: renamed from: h */
    public static Object m100043h(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC3979v.m12013d(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m100044i(InterfaceC38802c8 intent) {
        AbstractC22676k.m65750j(intent, "intent");
        return intent instanceof C38887l3 ? 50000 : 50001;
    }

    /* JADX INFO: renamed from: j */
    public static C39013z3 m100045j(JSONObject jSONObject) {
        C39004y3 c39004y3;
        EnumC38853i enumC38853i;
        C38986w3 c38986w3;
        String str;
        Integer num;
        Integer num2;
        String str2;
        AbstractC0122j abstractC0122j;
        C38995x3 c38995x3;
        Object next;
        AbstractC0122j c0114b;
        JSONObject jSONObjectOptJSONObject;
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        String strM99551t = AbstractC32004s.m99551t("brand", jSONObject);
        c33623c0.getClass();
        EnumC38853i enumC38853iM106236i = C33623c0.m106236i(strM99551t);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("checks");
        C38986w3 c38986w4 = jSONObjectOptJSONObject2 != null ? new C38986w3(AbstractC32004s.m99551t("address_line1_check", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("address_postal_code_check", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("cvc_check", jSONObjectOptJSONObject2)) : null;
        String strM99551t2 = AbstractC32004s.m99551t("country", jSONObject);
        Integer numValueOf = !jSONObject.has("exp_month") ? null : Integer.valueOf(jSONObject.optInt("exp_month"));
        Integer numValueOf2 = !jSONObject.has("exp_year") ? null : Integer.valueOf(jSONObject.optInt("exp_year"));
        String strM99551t3 = AbstractC32004s.m99551t("fingerprint", jSONObject);
        String strM99551t4 = AbstractC32004s.m99551t("funding", jSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("last4", jSONObject);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("three_d_secure_usage");
        if (jSONObjectOptJSONObject3 != null) {
            boolean z4 = false;
            if (jSONObjectOptJSONObject3.has("supported") && jSONObjectOptJSONObject3.optBoolean("supported", false)) {
                z4 = true;
            }
            c39004y3 = new C39004y3(z4);
        } else {
            c39004y3 = null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("wallet");
        if (jSONObjectOptJSONObject4 != null) {
            C22786e c22786e = EnumC0120h.f370x;
            String strM99551t6 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject4);
            c22786e.getClass();
            Iterator it = EnumC0120h.f369K.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((EnumC0120h) next).f373w.equals(strM99551t6));
            EnumC0120h enumC0120h = (EnumC0120h) next;
            if (enumC0120h == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject(enumC0120h.f373w)) == null) {
                enumC38853i = enumC38853iM106236i;
                c38986w3 = c38986w4;
                str = strM99551t2;
                num = numValueOf;
                num2 = numValueOf2;
                str2 = strM99551t3;
                c0114b = null;
            } else {
                String strM99551t7 = AbstractC32004s.m99551t("dynamic_last4", jSONObjectOptJSONObject4);
                enumC38853i = enumC38853iM106236i;
                c38986w3 = c38986w4;
                str = strM99551t2;
                num = numValueOf;
                num2 = numValueOf2;
                str2 = strM99551t3;
                switch (enumC0120h.ordinal()) {
                    case 0:
                        c0114b = new C0114b(strM99551t7);
                        break;
                    case 1:
                        c0114b = new C0115c(strM99551t7);
                        break;
                    case 2:
                        c0114b = new C0116d(strM99551t7);
                        break;
                    case 3:
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("billing_address");
                        C38793c c38793c = jSONObjectOptJSONObject5 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject5)) : null;
                        String strM99551t8 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_EMAIL, jSONObjectOptJSONObject);
                        String strM99551t9 = AbstractC32004s.m99551t("name", jSONObjectOptJSONObject);
                        JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject.optJSONObject("shipping_address");
                        c0114b = new C0118f(c38793c, strM99551t8, strM99551t9, jSONObjectOptJSONObject6 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject6)) : null);
                        break;
                    case 4:
                        c0114b = new C0119g(strM99551t7);
                        break;
                    case 5:
                        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject.optJSONObject("billing_address");
                        C38793c c38793c2 = jSONObjectOptJSONObject7 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject7), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject7), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject7), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject7), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject7), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject7)) : null;
                        String strM99551t10 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_EMAIL, jSONObjectOptJSONObject);
                        String strM99551t11 = AbstractC32004s.m99551t("name", jSONObjectOptJSONObject);
                        JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject.optJSONObject("shipping_address");
                        c0114b = new C0121i(c38793c2, strM99551t10, strM99551t11, jSONObjectOptJSONObject8 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject8), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject8), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject8), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject8), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject8), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject8)) : null, strM99551t7);
                        break;
                    case 6:
                        c0114b = new C0117e(strM99551t7);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            abstractC0122j = c0114b;
        } else {
            enumC38853i = enumC38853iM106236i;
            c38986w3 = c38986w4;
            str = strM99551t2;
            num = numValueOf;
            num2 = numValueOf2;
            str2 = strM99551t3;
            abstractC0122j = null;
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("networks");
        if (jSONObjectOptJSONObject9 != null) {
            Iterable iterableM99543l = AbstractC32004s.m99543l(jSONObjectOptJSONObject9.optJSONArray("available"));
            if (iterableM99543l == null) {
                iterableM99543l = C25271y.f99162w;
            }
            Iterable iterable = iterableM99543l;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().toString());
            }
            Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
            boolean z13 = false;
            if (jSONObjectOptJSONObject9.has("selection_mandatory") && jSONObjectOptJSONObject9.optBoolean("selection_mandatory", false)) {
                z13 = true;
            }
            c38995x3 = new C38995x3(z13, AbstractC32004s.m99551t("preferred", jSONObjectOptJSONObject9), setM74103I1);
        } else {
            c38995x3 = null;
        }
        return new C39013z3(enumC38853i, c38986w3, str, num, num2, str2, strM99551t4, strM99551t5, c39004y3, abstractC0122j, c38995x3, AbstractC32004s.m99551t("display_brand", jSONObject));
    }
}
