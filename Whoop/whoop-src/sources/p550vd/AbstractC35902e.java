package p550vd;

import a33.C0351c;
import ae.C0784a;
import ae.C0785b;
import ae.C0786c;
import ae.C0787d;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ServiceCompat;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.health.platform.client.proto.C1439b0;
import androidx.health.platform.client.proto.C1508p;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.ProcessLifecycleOwner;
import ar2.C1930a;
import aws.sdk.kotlin.runtime.ConfigurationException;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bz.C3702a;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cg.C4559n;
import cg.C4560o;
import d00.C11433l;
import d40.AbstractC11673r;
import d40.C11662g;
import d42.C11699o;
import ed3.C13117a;
import fk.InterfaceC14544a;
import g40.AbstractC15376j4;
import g40.C15392n;
import g40.C15397o;
import g40.EnumC15343e1;
import g40.InterfaceC15361h1;
import h00.C16511k0;
import h00.C16513l0;
import h20.C16689l1;
import h20.EnumC16677j1;
import h40.C16838d;
import h40.C16845k;
import ih0.AbstractC18489d0;
import io.sentry.android.replay.AbstractC20205f0;
import j93.AbstractC21478l0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l83.C23454a0;
import lb3.InterfaceC23796q0;
import m83.AbstractC25260n;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n53.C26304a;
import n53.C26308b;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p029b5.AbstractC2722a;
import p029b5.C2728g;
import p031b9.AbstractC2875y;
import p048ce.C4469j;
import p048ce.C4470k;
import p048ce.EnumC4471l;
import p077d0.AbstractC11348f;
import p078d1.C11456i;
import p163g1.AbstractC14981d1;
import p163g1.C14954a7;
import p163g1.C14970c1;
import p163g1.C15160u4;
import p163g1.C15197y1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p182h3.C16793i;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17252m;
import p194hg.InterfaceC17253n;
import p208i2.C17919x;
import p219ig.C18458c;
import p250jf.AbstractC21636e;
import p250jf.C21632a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C22937b;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p294l3.C23283u0;
import p322m7.InterfaceC25176u0;
import p334n5.C26289a;
import p368og.InterfaceC27908e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p395p6.C28864b;
import p401pj.C29269g;
import p401pj.C29271h;
import p401pj.C29273i;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p520ud.AbstractC34786g;
import p550vd.AbstractC35902e;
import p558vp.AbstractC36259c;
import p576w8.C36931a;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p619xl.C38445a;
import p635y2.InterfaceC39127r0;
import p636y3.C39176h;
import p646yd.AbstractC39455f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r93.InterfaceC31135k;
import re.C31253a;
import re.C31256b;
import s83.AbstractC32269c;
import vf3.AbstractC35952b;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import xa3.C38148i;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.C38991x;
import y00.C39000y;
import yb3.C39412p;

/* JADX INFO: renamed from: vd.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35902e implements InterfaceC27908e {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: D */
    public static final Window m113937D(View view) throws IllegalAccessException {
        Field field;
        AbstractC22676k.m65750j(view, "<this>");
        Object obj = AbstractC20205f0.f75905a;
        View rootView = view.getRootView();
        AbstractC22676k.m65749i(rootView, "getRootView(...)");
        Class cls = (Class) AbstractC20205f0.f75905a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) AbstractC20205f0.f75906b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    /* JADX INFO: renamed from: F */
    public static C31256b m113938F(Function1 function1) {
        C31253a c31253a = new C31253a();
        function1.invoke(c31253a);
        return new C31256b(c31253a);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m113939G() {
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f6173I;
            return ProcessLifecycleOwner.f6173I.f6175F.f6250d.m5040a(EnumC1635w.f6328z);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m113940H(String str, InterfaceC14544a interfaceC14544a) {
        Class<?> cls;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e5) {
            if (interfaceC14544a != null) {
                interfaceC14544a.debug("Class not available:" + str + ": " + e5);
            }
            cls = null;
        } catch (UnsatisfiedLinkError e13) {
            if (interfaceC14544a != null) {
                interfaceC14544a.error("Failed to load (UnsatisfiedLinkError) " + str + ": " + e13);
            }
            cls = null;
        } catch (Throwable th3) {
            if (interfaceC14544a != null) {
                interfaceC14544a.error("Failed to initialize " + str + ": " + th3);
            }
            cls = null;
        }
        return cls != null;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m113941J(C28864b c28864b) {
        int i13 = c28864b.f116802a;
        boolean z4 = false;
        if (Integer.MIN_VALUE <= i13 && i13 < -1) {
            z4 = true;
        }
        return !z4;
    }

    /* JADX INFO: renamed from: M */
    public static void m113942M(int i13, String str, String str2) {
        AbstractC18489d0.m53382w(i13, "aggregationType");
        AbstractC18489d0.m53382w(i13, "aggregationType");
    }

    /* JADX INFO: renamed from: N */
    public static long m113943N(C13117a c13117a, int i13, int i14) {
        c13117a.m36689K(i13);
        if (c13117a.m36692a() < 5) {
            return -9223372036854775807L;
        }
        int iM36699i = c13117a.m36699i();
        if ((8388608 & iM36699i) != 0 || ((2096896 & iM36699i) >> 8) != i14 || (iM36699i & 32) == 0 || c13117a.m36715y() < 7 || c13117a.m36692a() < 7 || (c13117a.m36715y() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c13117a.m36697g(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: O */
    public static final C16845k m113944O(Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(2070707701);
        EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
        int i14 = i13 & 2;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i14 != 0) {
            c28655q.m87150e0(-21688856);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C16513l0(15);
                c28655q.m87172p0(objM87133R);
            }
            function1 = (Function1) objM87133R;
            c28655q.m87173q(false);
        }
        C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, AbstractC11348f.m30574v(0, 0, null, 7), function1, true, c28655q, 3120, 0);
        c28655q.m87150e0(1251392408);
        WeakHashMap weakHashMap = C22944c2.f90553v;
        C22937b c22937b = C22949e.m66712e(c28655q).f90556c;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(c22937b.m66705e().f151452d > 0), c28655q);
        InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
        c28655q.m87150e0(726699122);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C16838d(interfaceC2464x2, interfaceC28601c1M87238F);
            c28655q.m87172p0(objM87133R2);
        }
        C16838d c16838d = (C16838d) objM87133R2;
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        c28655q.m87150e0(-21677788);
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new C16845k(c15199y3M3460c, c16838d);
            c28655q.m87172p0(objM87133R3);
        }
        C16845k c16845k = (C16845k) objM87133R3;
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        return c16845k;
    }

    /* JADX INFO: renamed from: P */
    public static void m113945P(C36931a c36931a) {
        c36931a.f158019k = -3.4028235E38f;
        c36931a.f158018j = Integer.MIN_VALUE;
        CharSequence charSequence = c36931a.f158009a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c36931a.f158009a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c36931a.f158009a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: Q */
    public static final Object m113946Q(C31983m2 c31983m2, String str, String str2, String str3, C35971r c35971r, AbstractC32269c abstractC32269c) throws Throwable {
        C0784a c0784a;
        String sysPropSuffix;
        String envSuffix;
        C35971r provider;
        String str4;
        Object obj;
        Object objInvoke;
        String serviceKey;
        C4469j c4469j;
        String strM13963a;
        C4560o c4560oM83563N;
        Map map;
        C4470k c4470k;
        C31983m2 c31983m3 = c31983m2;
        if (abstractC32269c instanceof C0784a) {
            c0784a = (C0784a) abstractC32269c;
            int i13 = c0784a.f2821G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0784a.f2821G = i13 - Integer.MIN_VALUE;
            } else {
                c0784a = new C0784a(abstractC32269c);
            }
        } else {
            c0784a = new C0784a(abstractC32269c);
        }
        Object objM99483g = c0784a.f2820F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0784a.f2821G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            c0784a.f2822w = c31983m3;
            sysPropSuffix = str;
            c0784a.f2823x = sysPropSuffix;
            envSuffix = str2;
            c0784a.f2824y = envSuffix;
            c0784a.f2825z = str3;
            c0784a.f2819E = c35971r;
            c0784a.f2821G = 1;
            Object objM113948S = m113948S(c35971r, c31983m3, c0784a);
            if (objM113948S != enumC31071a) {
                provider = c35971r;
                str4 = str3;
                obj = objM113948S;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            C35971r c35971r2 = c0784a.f2819E;
            str4 = c0784a.f2825z;
            envSuffix = c0784a.f2824y;
            String str5 = c0784a.f2823x;
            C31983m2 c31983m4 = c0784a.f2822w;
            AbstractC34132o.m107864I(objM99483g);
            provider = c35971r2;
            c31983m3 = c31983m4;
            obj = objM99483g;
            sysPropSuffix = str5;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serviceKey = c0784a.f2825z;
            AbstractC34132o.m107864I(objM99483g);
        }
        c4469j = (C4469j) objM99483g;
        AbstractC22676k.m65750j(c4469j, "<this>");
        AbstractC22676k.m65750j(serviceKey, "serviceKey");
        strM13963a = c4469j.m13961a().m13963a("services", null);
        if (strM13963a != null) {
            map = (Map) c4469j.f17992a.get(EnumC4471l.f18000y);
            if (map == null) {
                map = C25272z.f99163w;
            }
            c4470k = (C4470k) map.get(strM13963a);
            if (c4470k != null) {
                throw new ConfigurationException(AbstractC31061c.m95633i('\'', "shared config points to nonexistent services section '", strM13963a));
            }
            c4560oM83563N = C27648a.m83563N(c4470k, serviceKey, "endpoint_url");
        } else {
            c4560oM83563N = null;
        }
        if (c4560oM83563N == null) {
            return C27648a.m83563N(c4469j.m13961a(), "endpoint_url", null);
        }
        return c4560oM83563N;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        C21632a c21632a = AbstractC39455f.f169739a;
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(sysPropSuffix, "sysPropSuffix");
        AbstractC22676k.m65750j(envSuffix, "envSuffix");
        C16793i c16793i = new C16793i(1, C4560o.f18367i, C4559n.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0, 3);
        C14954a7 c14954a7 = AbstractC21636e.f83072a;
        C39412p c39412pM60880a = AbstractC21636e.m60880a("aws.endpointUrl", sysPropSuffix);
        C39412p c39412pM60880a2 = AbstractC21636e.m60880a("AWS_ENDPOINT_URL_", envSuffix);
        String strM60883d = AbstractC21636e.m60883d(provider.m114206a(), c39412pM60880a);
        if (strM60883d == null) {
            Map<String, String> map2 = System.getenv();
            AbstractC22676k.m65749i(map2, "getenv(...)");
            strM60883d = AbstractC21636e.m60883d(map2, c39412pM60880a2);
        }
        if (strM60883d == null || (objInvoke = c16793i.invoke(strM60883d)) == null) {
            objInvoke = null;
        }
        C4560o c4560o = (C4560o) objInvoke;
        if (c4560o == null) {
            c4560o = (C4560o) AbstractC21636e.m60881b(AbstractC39455f.f169762x, provider);
        }
        if (c4560o != null) {
            return c4560o;
        }
        c0784a.f2822w = null;
        c0784a.f2823x = null;
        c0784a.f2824y = null;
        c0784a.f2825z = str4;
        c0784a.f2819E = null;
        c0784a.f2821G = 2;
        objM99483g = c31983m3.m99483g(c0784a);
        if (objM99483g != enumC31071a) {
            serviceKey = str4;
            c4469j = (C4469j) objM99483g;
            AbstractC22676k.m65750j(c4469j, "<this>");
            AbstractC22676k.m65750j(serviceKey, "serviceKey");
            strM13963a = c4469j.m13961a().m13963a("services", null);
            if (strM13963a != null) {
                map = (Map) c4469j.f17992a.get(EnumC4471l.f18000y);
                if (map == null) {
                    map = C25272z.f99163w;
                }
                c4470k = (C4470k) map.get(strM13963a);
                if (c4470k != null) {
                    throw new ConfigurationException(AbstractC31061c.m95633i('\'', "shared config points to nonexistent services section '", strM13963a));
                }
                c4560oM83563N = C27648a.m83563N(c4470k, serviceKey, "endpoint_url");
            } else {
                c4560oM83563N = null;
            }
            if (c4560oM83563N == null) {
                return C27648a.m83563N(c4469j.m13961a(), "endpoint_url", null);
            }
            return c4560oM83563N;
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: R */
    public static Object m113947R(C31983m2 c31983m2, String str, String str2, String str3, AbstractC32269c abstractC32269c) {
        InterfaceC35967n.f153143a.getClass();
        return m113946Q(c31983m2, str, str2, str3, C35966m.f153142b, abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[PHI: r4
      0x003c: PHI (r4v3 java.lang.Boolean) = (r4v2 java.lang.Boolean), (r4v8 java.lang.Boolean) binds: [B:15:0x003a, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public static final Object m113948S(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C0785b c0785b;
        Boolean boolM83551B;
        boolean zBooleanValue;
        if (abstractC32269c instanceof C0785b) {
            c0785b = (C0785b) abstractC32269c;
            int i13 = c0785b.f2827x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0785b.f2827x = i13 - Integer.MIN_VALUE;
            } else {
                c0785b = new C0785b(abstractC32269c);
            }
        } else {
            c0785b = new C0785b(abstractC32269c);
        }
        Object objM99483g = c0785b.f2826w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c0785b.f2827x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            boolM83551B = (Boolean) AbstractC21636e.m60881b(AbstractC39455f.f169763y, interfaceC35967n);
            if (boolM83551B != null) {
                zBooleanValue = boolM83551B.booleanValue();
            } else {
                c0785b.f2827x = 1;
                objM99483g = c31983m2.m99483g(c0785b);
                if (objM99483g == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM99483g);
        boolM83551B = C27648a.m83551B(((C4469j) objM99483g).m13961a(), "ignore_configured_endpoint_urls");
        if (boolM83551B != null) {
            zBooleanValue = boolM83551B.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: T */
    public static float m113949T(float f13, int i13, int i14, int i15) {
        float f14;
        if (f13 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i13 == 0) {
            f14 = i15;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    return -3.4028235E38f;
                }
                return f13;
            }
            f14 = i14;
        }
        return f13 * f14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U */
    public static final Object m113950U(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C0786c c0786c;
        if (abstractC32269c instanceof C0786c) {
            c0786c = (C0786c) abstractC32269c;
            int i13 = c0786c.f2829x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0786c.f2829x = i13 - Integer.MIN_VALUE;
            } else {
                c0786c = new C0786c(abstractC32269c);
            }
        } else {
            c0786c = new C0786c(abstractC32269c);
        }
        Object objM99483g = c0786c.f2828w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c0786c.f2829x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            Boolean bool = (Boolean) AbstractC21636e.m60881b(AbstractC39455f.f169761w, interfaceC35967n);
            if (bool != null) {
                return bool;
            }
            c0786c.f2829x = 1;
            objM99483g = c31983m2.m99483g(c0786c);
            if (objM99483g == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM99483g);
        }
        C4470k c4470k = (C4470k) objM99483g;
        AbstractC22676k.m65750j(c4470k, "<this>");
        return C27648a.m83551B(c4470k, "use_dualstack_endpoint");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public static final Object m113951V(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C0787d c0787d;
        if (abstractC32269c instanceof C0787d) {
            c0787d = (C0787d) abstractC32269c;
            int i13 = c0787d.f2831x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0787d.f2831x = i13 - Integer.MIN_VALUE;
            } else {
                c0787d = new C0787d(abstractC32269c);
            }
        } else {
            c0787d = new C0787d(abstractC32269c);
        }
        Object objM99483g = c0787d.f2830w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c0787d.f2831x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            Boolean bool = (Boolean) AbstractC21636e.m60881b(AbstractC39455f.f169760v, interfaceC35967n);
            if (bool != null) {
                return bool;
            }
            c0787d.f2831x = 1;
            objM99483g = c31983m2.m99483g(c0787d);
            if (objM99483g == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM99483g);
        }
        C4470k c4470k = (C4470k) objM99483g;
        AbstractC22676k.m65750j(c4470k, "<this>");
        return C27648a.m83551B(c4470k, "use_fips_endpoint");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X */
    public static final Object m113953X(Function1 function1, AbstractC32269c abstractC32269c) {
        C26304a c26304a;
        if (abstractC32269c instanceof C26304a) {
            c26304a = (C26304a) abstractC32269c;
            int i13 = c26304a.f104537x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26304a.f104537x = i13 - Integer.MIN_VALUE;
            } else {
                c26304a = new C26304a(abstractC32269c);
            }
        } else {
            c26304a = new C26304a(abstractC32269c);
        }
        Object obj = c26304a.f104536w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c26304a.f104537x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c26304a.f104537x = 1;
                if (function1.invoke(c26304a) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeSuspendingCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeSuspendingCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    public static final Object m113954Y(C0351c c0351c, InterfaceC30057d interfaceC30057d) {
        C26308b c26308b;
        if (interfaceC30057d instanceof C26308b) {
            c26308b = (C26308b) interfaceC30057d;
            int i13 = c26308b.f104545x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26308b.f104545x = i13 - Integer.MIN_VALUE;
            } else {
                c26308b = new C26308b(interfaceC30057d);
            }
        } else {
            c26308b = new C26308b(interfaceC30057d);
        }
        Object objInvoke = c26308b.f104544w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c26308b.f104545x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                c26308b.f104545x = 1;
                objInvoke = c0351c.invoke(c26308b);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objInvoke);
            }
            return new C26204g(objInvoke);
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
            return new C26203f(new C26201d(AbstractC11266d.m30461o("Safe call failed with ", e5.getMessage()), e5));
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m113955Z(InterfaceC17252m serializer, AbstractC34786g input) {
        AbstractC22676k.m65750j(serializer, "serializer");
        AbstractC22676k.m65750j(input, "input");
        C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("arn")}), 0);
        C38445a c38445a = new C38445a(13);
        ((LinkedHashSet) c38445a.f164637y).add(new C18458c("PolicyDescriptorType"));
        c38445a.m123180p(c17248i);
        InterfaceC17253n interfaceC17253nMo48823e = serializer.mo48823e(new C17249j(c38445a));
        input.getClass();
        interfaceC17253nMo48823e.mo30746o();
    }

    /* JADX INFO: renamed from: a0 */
    public static void m113956a0(EditorInfo editorInfo, CharSequence charSequence) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            AbstractC2722a.m7685l(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i13 >= 30) {
            AbstractC2722a.m7685l(editorInfo, charSequence);
            return;
        }
        int i14 = editorInfo.initialSelStart;
        int i15 = editorInfo.initialSelEnd;
        int i16 = i14 > i15 ? i15 : i14;
        if (i14 <= i15) {
            i14 = i15;
        }
        int length = charSequence.length();
        if (i16 < 0 || i14 > length) {
            m113961d0(editorInfo, null, 0, 0);
            return;
        }
        int i17 = editorInfo.inputType & 4095;
        if (i17 == 129 || i17 == 225 || i17 == 18) {
            m113961d0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m113961d0(editorInfo, charSequence, i16, i14);
            return;
        }
        int i18 = i14 - i16;
        int i19 = i18 > 1024 ? 0 : i18;
        int i24 = 2048 - i19;
        int iMin = Math.min(charSequence.length() - i14, i24 - Math.min(i16, (int) (((double) i24) * 0.8d)));
        int iMin2 = Math.min(i16, i24 - iMin);
        int i25 = i16 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i25))) {
            i25++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i14 + iMin) - 1))) {
            iMin--;
        }
        int i26 = iMin2 + i19;
        m113961d0(editorInfo, i19 != i18 ? TextUtils.concat(charSequence.subSequence(i25, i25 + iMin2), charSequence.subSequence(i14, iMin + i14)) : charSequence.subSequence(i25, i26 + iMin + i25), iMin2, i26);
    }

    /* JADX INFO: renamed from: b */
    public static final void m113957b(C15392n c15392n, Modifier modifier, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier2;
        EnumC15343e1 enumC15343e1;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(686574397);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c15392n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = i14 | 48;
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            modifier3 = modifier;
            interfaceC4339a3 = interfaceC4339a;
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            int i16 = i13 & 1;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 == 0 || c28655q2.m87118C()) {
                c28655q2.m87150e0(-814666095);
                boolean zM87157i = c28655q2.m87157i(c15392n);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C11456i(c15392n, 26);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q2.m87173q(false);
                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                modifier2 = C2314t.f9131w;
            } else {
                c28655q2.m87138X();
                modifier2 = modifier;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28655q2.m87175r();
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c15392n.f57839c, c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c15392n.f57840d, c28655q2, 0);
            C11662g c11662g = (C11662g) c28655q2.m87161k(AbstractC11673r.f37718j);
            boolean z13 = ((InterfaceC15361h1) interfaceC28601c1M83597t2.getValue()) != null;
            C22976l1 c22976l1M31070a = c11662g.m31070a();
            if (z13) {
                enumC15343e1 = EnumC15343e1.f57653x;
            } else {
                if (z13) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC15343e1 = EnumC15343e1.f57652w;
            }
            c28655q2.m87150e0(-814638598);
            long jM43088c = z13 ? ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43088c() : C17919x.f69636m;
            c28655q2.m87173q(false);
            boolean z14 = z13;
            interfaceC4339a3 = interfaceC4339a2;
            C15197y1 c15197y1M43588d = AbstractC15376j4.m43588d(enumC15343e1, 0L, 0L, 0L, jM43088c, c28655q2, 0, 14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            c28655q2.m87150e0(-814631127);
            boolean zM87153g = c28655q2.m87153g(interfaceC4339a3);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C11699o(interfaceC4339a3, 28);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            Modifier modifierM3361f = AbstractC1092a.m3361f(modifierM3409f, z4, null, (InterfaceC4339a) objM87133R2, 6);
            c28655q2.m87150e0(-814654882);
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C15160u4(15);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC36259c.m115690g("", (Function1) objM87133R3, modifierM3361f, false, null, AbstractC37817c.m121344e(1216241975, c28655q2, new C15397o(interfaceC28601c1M83597t, 0)), null, null, null, z14, null, null, null, true, 0, 0, null, null, c15197y1M43588d, c22976l1M31070a, c28655q, 819465270, 196656, 0, 1012016);
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(c15392n, modifier3, z4, interfaceC4339a3, i13, 9);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m113958b0(TextView textView, int i13) {
        AbstractC37056f.m118991n(i13);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i13 != fontMetricsInt) {
            textView.setLineSpacing(i13 - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m113959c0(Configuration configuration, C2728g c2728g) {
        configuration.setLocales(c2728g.f10739a.f10740a);
    }

    /* JADX INFO: renamed from: d */
    public static final void m113960d(String markdown, Modifier modifier, long j7, long j13, int i13, float f13, C28780r fontWeight, Typeface typeface, Function1 function1, Composer composer, int i14) {
        AbstractC22676k.m65750j(markdown, "markdown");
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(fontWeight, "fontWeight");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-851449205);
        AbstractC1137a.m3601a(new C29269g(f13, j7, i13, j13, typeface, fontWeight), modifier, new C29271h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), j13, function1, markdown), c28655q, i14 & 112, 0);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C29273i(markdown, modifier, j7, j13, i13, f13, fontWeight, typeface, function1, i14);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m113961d0(EditorInfo editorInfo, CharSequence charSequence, int i13, int i14) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i13);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i14);
    }

    /* JADX INFO: renamed from: f */
    public static final void m113962f(final float f13, final C37816b c37816b, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1679846033);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(274024662);
            if (f13 == 0.0f) {
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c37816b.invoke(C1100b.f4583a, c28655q, 54);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i15 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h00.j0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = i15;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i16) {
                                case 0:
                                    AbstractC35902e.m113962f(f13, c37816b, composer2, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                                default:
                                    AbstractC35902e.m113962f(f13, c37816b, composer2, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(1689133125, c28655q, new C16511k0(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp, f13, c37816b)), c28655q, 3072, 7);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i16 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: h00.j0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i17) {
                        case 0:
                            AbstractC35902e.m113962f(f13, c37816b, composer2, AbstractC28683x.m87244L(i13 | 1));
                            break;
                        default:
                            AbstractC35902e.m113962f(f13, c37816b, composer2, AbstractC28683x.m87244L(i13 | 1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m113963f0(InterfaceC3704c interfaceC3704c, EnumC3703b enumC3703b) {
        ((C3702a) interfaceC3704c).f15143a.put(enumC3703b, Long.valueOf(SystemClock.uptimeMillis()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0050
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: g */
    public static final java.lang.Object m113964g(int r5, p715kotlin.jvm.functions.Function1 r6, s83.AbstractC32269c r7) {
        /*
            boolean r0 = r7 instanceof h40.C16846l
            if (r0 == 0) goto L13
            r0 = r7
            h40.l r0 = (h40.C16846l) r0
            int r1 = r0.f64732E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64732E = r1
            goto L18
        L13:
            h40.l r0 = new h40.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f64736z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f64732E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.f64734x
            int r6 = r0.f64733w
            kotlin.jvm.functions.Function1 r2 = r0.f64735y
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.util.concurrent.CancellationException -> L2d
            goto L52
        L2d:
            r7 = r2
            goto L50
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p505ts.AbstractC34132o.m107864I(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L3f:
            if (r5 >= r6) goto L52
            r0.f64735y = r7     // Catch: java.util.concurrent.CancellationException -> L50
            r0.f64733w = r6     // Catch: java.util.concurrent.CancellationException -> L50
            r0.f64734x = r5     // Catch: java.util.concurrent.CancellationException -> L50
            r0.f64732E = r3     // Catch: java.util.concurrent.CancellationException -> L50
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L50
            if (r5 != r1) goto L52
            goto L54
        L50:
            int r5 = r5 + r3
            goto L3f
        L52:
            l83.a0 r1 = l83.C23454a0.f92919a
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p550vd.AbstractC35902e.m113964g(int, kotlin.jvm.functions.Function1, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC26205h m113965g0(Service service, int i13, Notification notification, String trigger, int i14) {
        String str;
        int iD;
        AbstractC22676k.m65750j(notification, "notification");
        AbstractC22676k.m65750j(trigger, "trigger");
        try {
            if (Build.VERSION.SDK_INT < 29) {
                service.startForeground(i13, notification);
                iD = Log.d("AndroidUtils", "[startForegroundWithServiceType] 1 startForeground notificationId: " + i13);
            } else {
                switch (trigger.hashCode()) {
                    case -822844713:
                        str = "incoming_call";
                        trigger.equals(str);
                        break;
                    case -285646686:
                        trigger.equals("ongoing_call");
                        break;
                    case -282090292:
                        if (trigger.equals("share_screen")) {
                            i14 = 32;
                        }
                        break;
                    case 89080657:
                        str = "outgoing_call";
                        trigger.equals(str);
                        break;
                }
                ServiceCompat.startForeground(service, i13, notification, i14);
                iD = Log.d("AndroidUtils", "[startForegroundWithServiceType] 2 startForeground notificationId: " + i13);
            }
            return new C26204g(Integer.valueOf(iD));
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
            return new C26203f(new C26201d(AbstractC11266d.m30461o("Safe call failed with ", e5.getMessage()), e5));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final boolean m113966h0(AbstractC38794c0 abstractC38794c0, C16689l1 billingDetailsConfig, C11433l linkAccount) {
        C39000y c39000yMo124309b;
        AbstractC22676k.m65750j(abstractC38794c0, "<this>");
        AbstractC22676k.m65750j(billingDetailsConfig, "billingDetailsConfig");
        AbstractC22676k.m65750j(linkAccount, "linkAccount");
        if (!(abstractC38794c0 instanceof C38991x) && !(abstractC38794c0 instanceof C38774a0)) {
            return true;
        }
        if (billingDetailsConfig.f64192z == EnumC16677j1.f64133y && ((c39000yMo124309b = abstractC38794c0.mo124309b()) == null || c39000yMo124309b.f167867x == null || c39000yMo124309b.f167863E == null || c39000yMo124309b.f167864F == null || c39000yMo124309b.f167865G == null)) {
            return false;
        }
        if (billingDetailsConfig.m47252i() && linkAccount.m30677f() == null) {
            return false;
        }
        if (!billingDetailsConfig.m47251h()) {
            return true;
        }
        C39000y c39000yMo124309b2 = abstractC38794c0.mo124309b();
        return (c39000yMo124309b2 != null ? c39000yMo124309b2.f167866w : null) != null;
    }

    /* JADX INFO: renamed from: i0 */
    public static final C1533u m113967i0(InterfaceC25176u0 interfaceC25176u0, String str, Function1 function1) {
        C1508p c1508pM114023w = AbstractC35903f.m114023w(interfaceC25176u0);
        c1508pM114023w.m4795f(AbstractC35903f.m113988F(str));
        Iterator it = interfaceC25176u0.mo73696a().iterator();
        while (it.hasNext()) {
            C1439b0 c1439b0 = (C1439b0) function1.invoke(it.next());
            c1508pM114023w.m4815c();
            C1533u.m4827F((C1533u) c1508pM114023w.f6114x, c1439b0);
        }
        return (C1533u) c1508pM114023w.m4813a();
    }

    /* JADX INFO: renamed from: j */
    public static void m113968j() {
        AbstractC18489d0.m53382w(6, "aggregationType");
    }

    /* JADX INFO: renamed from: k */
    public static CreateCredentialException m113969k(String str, String str2) {
        Exception excM114009d;
        try {
            CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new C26289a(26), null);
            if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(0), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(1), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(2), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(3), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(4), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(5), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(6), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(7), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(8), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(9), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(10), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(11), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(12), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(13), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(14), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(15), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(16), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(17), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(18), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(19), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(20), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(21), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(22), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(23), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(24), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(25), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(26), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excM114009d = AbstractC35903f.m114009d(new C26289a(27), str2, createPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excM114009d = AbstractC35903f.m114009d(new C26289a(28), str2, createPublicKeyCredentialDomException);
            }
            return (CreateCredentialException) excM114009d;
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final String m113970l(int i13) {
        return AbstractC2875y.m8295h(i13, "appWidget-");
    }

    /* JADX INFO: renamed from: l0 */
    public static final long m113971l0(long j7, long j13) {
        int iM67358d;
        int iM67360f = C23283u0.m67360f(j7);
        int iM67359e = C23283u0.m67359e(j7);
        if ((C23283u0.m67360f(j13) < C23283u0.m67359e(j7)) && (C23283u0.m67360f(j7) < C23283u0.m67359e(j13))) {
            if ((C23283u0.m67360f(j13) <= C23283u0.m67360f(j7)) && (C23283u0.m67359e(j7) <= C23283u0.m67359e(j13))) {
                iM67360f = C23283u0.m67360f(j13);
                iM67359e = iM67360f;
            } else {
                if ((C23283u0.m67360f(j7) <= C23283u0.m67360f(j13)) && (C23283u0.m67359e(j13) <= C23283u0.m67359e(j7))) {
                    iM67358d = C23283u0.m67358d(j13);
                } else {
                    int iM67360f2 = C23283u0.m67360f(j13);
                    if (iM67360f >= C23283u0.m67359e(j13) || iM67360f2 > iM67360f) {
                        iM67359e = C23283u0.m67360f(j13);
                    } else {
                        iM67360f = C23283u0.m67360f(j13);
                        iM67358d = C23283u0.m67358d(j13);
                    }
                }
                iM67359e -= iM67358d;
            }
        } else if (iM67359e > C23283u0.m67360f(j13)) {
            iM67360f -= C23283u0.m67358d(j13);
            iM67358d = C23283u0.m67358d(j13);
            iM67359e -= iM67358d;
        }
        return AbstractC21478l0.m60431f(iM67360f, iM67359e);
    }

    /* JADX INFO: renamed from: m */
    public static final long m113972m() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: m0 */
    public static int m113973m0(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: n */
    public static final String m113974n(InterfaceC23796q0 interfaceC23796q0) {
        StringBuilder sb4 = new StringBuilder();
        m113976o(sb4, "type: " + interfaceC23796q0);
        m113976o(sb4, "hashCode: " + interfaceC23796q0.hashCode());
        m113976o(sb4, "javaClass: " + interfaceC23796q0.getClass().getCanonicalName());
        for (InterfaceC31135k interfaceC31135kMo1784d = interfaceC23796q0.mo1784d(); interfaceC31135kMo1784d != null; interfaceC31135kMo1784d = interfaceC31135kMo1784d.mo60581g()) {
            m113976o(sb4, "fqName: " + C38148i.f163318c.m122219w(interfaceC31135kMo1784d));
            m113976o(sb4, "javaClass: " + interfaceC31135kMo1784d.getClass().getCanonicalName());
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n0 */
    public static int m113975n0(long j7) {
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (((-16384) & j7) == 0) {
            return 2;
        }
        if (((-2097152) & j7) == 0) {
            return 3;
        }
        if (((-268435456) & j7) == 0) {
            return 4;
        }
        if (((-34359738368L) & j7) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j7) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j7) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j7) == 0) {
            return 8;
        }
        return (j7 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: o */
    public static final void m113976o(StringBuilder sb4, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        sb4.append(str);
        sb4.append('\n');
    }

    /* JADX INFO: renamed from: p */
    public static void m113977p(int i13, String str, String str2) {
        AbstractC18489d0.m53382w(i13, "aggregationType");
        AbstractC18489d0.m53382w(i13, "aggregationType");
    }

    /* JADX INFO: renamed from: q */
    public static void m113978q(int i13, String str, String str2, Function1 function1) {
        AbstractC18489d0.m53382w(i13, "aggregationType");
        AbstractC18489d0.m53382w(i13, "aggregationType");
    }

    /* JADX INFO: renamed from: s */
    public static void m113979s() {
        AbstractC18489d0.m53382w(1, "aggregationType");
    }

    /* JADX INFO: renamed from: t */
    public static void m113980t() {
        AbstractC18489d0.m53382w(5, "aggregationType");
        AbstractC18489d0.m53382w(5, "aggregationType");
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m113981u(int i13) {
        return i13 == 0;
    }

    /* JADX INFO: renamed from: v */
    public static final List m113982v(Bundle bundle) {
        int i13 = bundle.getInt("appWidgetMinHeight", 0);
        int i14 = bundle.getInt("appWidgetMaxWidth", 0);
        C39176h c39176h = null;
        C39176h c39176h2 = (i13 == 0 || i14 == 0) ? null : new C39176h(AbstractC35952b.m114193a(i14, i13));
        int i15 = bundle.getInt("appWidgetMaxHeight", 0);
        int i16 = bundle.getInt("appWidgetMinWidth", 0);
        if (i15 != 0 && i16 != 0) {
            c39176h = new C39176h(AbstractC35952b.m114193a(i16, i15));
        }
        return AbstractC25260n.m74077r0(new C39176h[]{c39176h2, c39176h});
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo72268A();

    /* JADX INFO: renamed from: B */
    public abstract int mo72269B(View view);

    /* JADX INFO: renamed from: C */
    public abstract int mo72270C(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: E */
    public abstract int mo72271E();

    /* JADX INFO: renamed from: I */
    public abstract boolean mo72272I(float f13);

    /* JADX INFO: renamed from: K */
    public abstract boolean mo72273K(View view);

    /* JADX INFO: renamed from: L */
    public abstract boolean mo72274L(float f13, float f14);

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: a */
    public void mo7486a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: c */
    public void mo7487c(String key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: e */
    public void mo7488e() {
    }

    /* JADX INFO: renamed from: e0 */
    public abstract boolean mo72275e0(View view, float f13);

    /* JADX INFO: renamed from: h */
    public abstract int mo72276h(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: i */
    public abstract float mo72277i(int i13);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo72278j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i13);

    /* JADX INFO: renamed from: k0 */
    public abstract void mo72279k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14);

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: r */
    public void mo7492r(InterfaceC4339a interfaceC4339a) {
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo72280w(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: x */
    public abstract int mo72281x();

    /* JADX INFO: renamed from: y */
    public abstract int mo72282y();

    /* JADX INFO: renamed from: z */
    public abstract int mo72283z();
}
