package com.google.crypto.tink.internal;

import ad3.C0783z;
import al.C0957d;
import al.InterfaceC0962i;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1848z0;
import ba3.C2910h;
import bd3.C3143v;
import c93.InterfaceC4339a;
import ch3.C4706r0;
import ch3.C4708s0;
import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.C5340j2;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5344k2;
import com.iterable.iterableapi.C5392z1;
import com.iterable.iterableapi.EnumC5303a1;
import com.iterable.iterableapi.InterfaceC5318e0;
import com.iterable.iterableapi.InterfaceC5348l2;
import dc3.C11934s;
import fa3.C14328u;
import fk.InterfaceC14544a;
import gb3.AbstractC15702a;
import gs.C16139j;
import gs.C16151t;
import hb3.AbstractC17104a0;
import hb3.C17109d;
import hb3.C17136y;
import hb3.InterfaceC17103a;
import hb3.InterfaceC17107c;
import hb3.InterfaceC17111e;
import ih0.AbstractC18489d0;
import io.sentry.C20275c5;
import io.sentry.C20513q6;
import io.sentry.C20541s5;
import io.sentry.C20619w4;
import io.sentry.C20620w5;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20424m5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.clientreport.C20294b;
import io.sentry.clientreport.C20295c;
import io.sentry.clientreport.C20298f;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.clientreport.InterfaceC20299g;
import io.sentry.config.AbstractC20301a;
import io.sentry.hints.C20363j;
import io.sentry.internal.debugmeta.InterfaceC20376a;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20584f;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import ka3.C22309a;
import kb3.C22336e;
import kb3.C22342k;
import kh.C22467a;
import kh.C22468b;
import kh.C22470d;
import kh.C22471e;
import kh.InterfaceC22473g;
import l83.C23470p;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import lb3.C23778h0;
import lb3.C23802t0;
import lb3.EnumC23776g1;
import ls.C24706c;
import ls.C24707d;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26466i;
import nb3.C26552i;
import oa3.C27763f;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p014aj.C0928c;
import p014aj.C0929d;
import p034bl.C3368h;
import p037bu.C3632c;
import p075ct.C11105a;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p108e4.C12673g;
import p127ev.AbstractC13673n;
import p136f4.C14053e;
import p136f4.C14054f;
import p197hj.C17341x;
import p197hj.EnumC17339v;
import p210i4.C18059a;
import p210i4.C18063e;
import p210i4.C18065g;
import p210i4.C18066h;
import p249jc.AbstractC21598x;
import p249jc.C21567b;
import p249jc.C21577g;
import p249jc.C21586l;
import p372ol.C28009d;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p446r1.C30849c;
import p457rc.RunnableC31226i;
import p474s.C31983m2;
import p526ul.AbstractC35057c;
import p560vs.C36409p3;
import p581we.C37199o;
import p586wk.InterfaceC37327e;
import p635y2.InterfaceC39127r0;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qa3.C30120b1;
import qa3.C30122c0;
import qa3.C30127e;
import qa3.C30129e1;
import qa3.C30136h;
import qa3.C30146k0;
import qa3.C30154o;
import qa3.C30171w0;
import qa3.C30172x;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s93.C32301c;
import sa3.C32331e;
import sa3.InterfaceC32332f;
import sc.InterfaceC32351a;
import se.AbstractC32410a;
import tl.AbstractC33913l;
import tl.C33909h;
import va3.C35845c;
import w93.C36969b;
import wa3.InterfaceC37019v;
import x93.AbstractC38109c;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5101l0 implements InterfaceC5105n0, InterfaceC38282i, InterfaceC17103a, InterfaceC17107c, InterfaceC20602v0, InterfaceC20376a, InterfaceC20299g, InterfaceC22473g, InterfaceC17111e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21442w;

    /* JADX INFO: renamed from: x */
    public Object f21443x;

    /* JADX INFO: renamed from: y */
    public Object f21444y;

    public /* synthetic */ C5101l0(int i13, Object obj, Object obj2) {
        this.f21442w = i13;
        this.f21444y = obj;
        this.f21443x = obj2;
    }

    /* JADX INFO: renamed from: E */
    public static EnumC20418m m16021E(EnumC20424m5 enumC20424m5) {
        if (EnumC20424m5.Event.equals(enumC20424m5)) {
            return EnumC20418m.Error;
        }
        if (EnumC20424m5.Session.equals(enumC20424m5)) {
            return EnumC20418m.Session;
        }
        if (EnumC20424m5.Transaction.equals(enumC20424m5)) {
            return EnumC20418m.Transaction;
        }
        if (EnumC20424m5.UserFeedback.equals(enumC20424m5)) {
            return EnumC20418m.UserReport;
        }
        if (EnumC20424m5.Feedback.equals(enumC20424m5)) {
            return EnumC20418m.Feedback;
        }
        if (EnumC20424m5.Profile.equals(enumC20424m5)) {
            return EnumC20418m.Profile;
        }
        if (EnumC20424m5.ProfileChunk.equals(enumC20424m5)) {
            return EnumC20418m.ProfileChunkUi;
        }
        if (EnumC20424m5.Attachment.equals(enumC20424m5)) {
            return EnumC20418m.Attachment;
        }
        if (EnumC20424m5.CheckIn.equals(enumC20424m5)) {
            return EnumC20418m.Monitor;
        }
        if (EnumC20424m5.ReplayVideo.equals(enumC20424m5)) {
            return EnumC20418m.Replay;
        }
        if (EnumC20424m5.Log.equals(enumC20424m5)) {
            return EnumC20418m.LogItem;
        }
        if (EnumC20424m5.Span.equals(enumC20424m5)) {
            return EnumC20418m.Span;
        }
        return EnumC20424m5.TraceMetric.equals(enumC20424m5) ? EnumC20418m.TraceMetric : EnumC20418m.Default;
    }

    /* JADX INFO: renamed from: F */
    public static C5101l0 m16022F(C36409p3 c36409p3) throws GeneralSecurityException {
        String strM116534E = c36409p3.m116534E();
        Charset charset = AbstractC5113r0.f21461a;
        byte[] bArr = new byte[strM116534E.length()];
        int i13 = 0;
        for (int i14 = 0; i14 < strM116534E.length(); i14++) {
            char cCharAt = strM116534E.charAt(i14);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i14] = (byte) cCharAt;
        }
        return new C5101l0(i13, c36409p3, C11105a.m30034a(bArr));
    }

    /* JADX INFO: renamed from: G */
    public static C5101l0 m16023G(C36409p3 c36409p3) {
        return new C5101l0(0, c36409p3, AbstractC5113r0.m16079c(c36409p3.m116534E()));
    }

    /* JADX INFO: renamed from: J */
    public static void m16024J(C0230n0 c0230n0) {
        if (c0230n0.f792n0 > 0) {
            c0230n0.m625j();
            c0230n0.f791m0 = false;
            C30849c c30849cM595M = c0230n0.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                m16024J((C0230n0) objArr[i14]);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static JSONObject m16025Q(C5339j1 c5339j1, EnumC5303a1 enumC5303a1) {
        JSONObject jSONObject = new JSONObject();
        try {
            boolean zM16469q = c5339j1.m16469q();
            jSONObject.putOpt("saveToInbox", Boolean.valueOf(c5339j1.m16464l()));
            jSONObject.putOpt("silentInbox", Boolean.valueOf(zM16469q));
            if (enumC5303a1 == null) {
                return jSONObject;
            }
            jSONObject.putOpt("location", enumC5303a1.toString());
            return jSONObject;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableApiClient", "Could not populate messageContext JSON", e5);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m16026X(C5101l0 c5101l0, C12673g c12673g, float f13, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0;
        }
        float f14 = 0;
        c5101l0.getClass();
        int i14 = c12673g.f43338b;
        String str = "top";
        if (i14 != 0) {
            if (i14 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        C18059a c18059a = new C18059a(new char[0]);
        c18059a.m51893j(C18066h.m51912j(c12673g.f43337a.toString()));
        c18059a.m51893j(C18066h.m51912j(str));
        c18059a.m51893j(new C18063e(f13));
        c18059a.m51893j(new C18063e(f14));
        ((C18065g) c5101l0.f21443x).m51891B((String) c5101l0.f21444y, c18059a);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: A */
    public ArrayList mo15984A(C30171w0 proto, InterfaceC32332f nameResolver) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.m118820k(((AbstractC15702a) this.f21443x).f59027k);
        if (iterable == null) {
            iterable = C25271y.f99162w;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), nameResolver));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public void m16027B(JSONObject jSONObject) {
        try {
            C5341k c5341k = (C5341k) ((C0928c) this.f21443x).f3421x;
            String str = c5341k.f21746d;
            if (str != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
                return;
            }
            String str2 = c5341k.f21748f;
            if (str2 != null) {
                jSONObject.put("userId", str2);
            } else {
                jSONObject.put("userId", c5341k.f21747e);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: C */
    public C16151t m16028C() throws GeneralSecurityException {
        Integer num = (Integer) this.f21443x;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((C16139j) this.f21444y) != null) {
            return new C16151t(num.intValue(), (C16139j) this.f21444y);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    /* JADX INFO: renamed from: D */
    public C24707d m16029D() throws GeneralSecurityException {
        Integer num = (Integer) this.f21443x;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((C24706c) this.f21444y) != null) {
            return new C24707d(num.intValue(), (C24706c) this.f21444y);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    /* JADX INFO: renamed from: H */
    public void m16030H(InterfaceC4339a interfaceC4339a) {
        if (4 > ((EnumC17339v) this.f21444y).f67150w) {
            return;
        }
        m16045Z(EnumC17339v.DEBUG, (String) interfaceC4339a.invoke());
    }

    /* JADX INFO: renamed from: I */
    public void m16031I(Object... objArr) {
        m16045Z(EnumC17339v.DEBUG, AbstractC25260n.m74028D0(objArr, null, null, null, C17341x.f67154x, 31));
    }

    /* JADX INFO: renamed from: K */
    public void m16032K(Object... objArr) {
        m16045Z(EnumC17339v.ERROR, AbstractC25260n.m74028D0(objArr, null, null, null, C17341x.f67155y, 31));
    }

    /* JADX INFO: renamed from: L */
    public void m16033L() {
        ((C20513q6) this.f21444y).getOnDiscard();
    }

    /* JADX INFO: renamed from: M */
    public Object m16034M(InterfaceC0962i interfaceC0962i) {
        HashMap map = (HashMap) this.f21444y;
        C0957d c0957d = (C0957d) map.get(interfaceC0962i);
        if (c0957d == null) {
            c0957d = new C0957d(interfaceC0962i);
            map.put(interfaceC0962i, c0957d);
        } else {
            interfaceC0962i.mo2439a();
        }
        C0957d c0957d2 = c0957d.f3541d;
        c0957d2.f3540c = c0957d.f3540c;
        c0957d.f3540c.f3541d = c0957d2;
        C0957d c0957d3 = (C0957d) this.f21443x;
        c0957d.f3541d = c0957d3;
        C0957d c0957d4 = c0957d3.f3540c;
        c0957d.f3540c = c0957d4;
        c0957d4.f3541d = c0957d;
        c0957d.f3541d.f3540c = c0957d;
        ArrayList arrayList = c0957d.f3539b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c0957d.f3539b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public AbstractC23773f1 m16035N(C22309a c22309a) {
        AbstractC23773f1 abstractC23773f1M56322U;
        AbstractC23763c0 abstractC23763c0M64109b = c22309a.m64109b();
        return (abstractC23763c0M64109b == null || (abstractC23773f1M56322U = AbstractC20301a.m56322U(abstractC23763c0M64109b)) == null) ? (C26552i) ((C23470p) this.f21443x).getValue() : abstractC23773f1M56322U;
    }

    /* JADX INFO: renamed from: O */
    public JSONObject m16036O() {
        C5341k c5341k = (C5341k) ((C0928c) this.f21443x).f3421x;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("deviceId", c5341k.m16485d());
            jSONObject.putOpt("platform", "Android");
            jSONObject.putOpt("appPackageName", c5341k.f21743a.getPackageName());
            return jSONObject;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableApiClient", "Could not populate deviceInfo JSON", e5);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: P */
    public AbstractC23811y m16037P(InterfaceC31165x0 typeParameter, C22309a typeAttr) {
        AbstractC22676k.m65750j(typeParameter, "typeParameter");
        AbstractC22676k.m65750j(typeAttr, "typeAttr");
        return (AbstractC23811y) ((C22336e) this.f21444y).invoke(new C23802t0(typeParameter, typeAttr));
    }

    /* JADX INFO: renamed from: R */
    public InterfaceC39127r0 m16038R() {
        return (InterfaceC39127r0) ((C28633k1) this.f21444y).getValue();
    }

    /* JADX INFO: renamed from: S */
    public synchronized List m16039S(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f21443x).contains(str)) {
                ((ArrayList) this.f21443x).add(str);
            }
            arrayList = (List) ((HashMap) this.f21444y).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f21444y).put(str, arrayList);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public InterfaceC5348l2 m16040T() {
        if (((InterfaceC5348l2) this.f21444y) == null) {
            this.f21444y = new C5344k2();
        }
        return (InterfaceC5348l2) this.f21444y;
    }

    /* JADX INFO: renamed from: U */
    public synchronized ArrayList m16041U(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f21443x).iterator();
        while (it.hasNext()) {
            List<C28009d> list = (List) ((HashMap) this.f21444y).get((String) it.next());
            if (list != null) {
                for (C28009d c28009d : list) {
                    if ((c28009d.f112943a.isAssignableFrom(cls) && cls2.isAssignableFrom(c28009d.f112944b)) && !arrayList.contains(c28009d.f112944b)) {
                        arrayList.add(c28009d.f112944b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public String m16042V(InterfaceC37327e interfaceC37327e) {
        String str;
        synchronized (((C33909h) this.f21443x)) {
            str = (String) ((C33909h) this.f21443x).m107260a(interfaceC37327e);
        }
        if (str == null) {
            C3368h c3368h = (C3368h) ((C31983m2) this.f21444y).mo43684b();
            try {
                interfaceC37327e.mo33605a(c3368h.f13117w);
                byte[] bArrDigest = c3368h.f13117w.digest();
                char[] cArr = AbstractC33913l.f142094b;
                synchronized (cArr) {
                    for (int i13 = 0; i13 < bArrDigest.length; i13++) {
                        byte b = bArrDigest[i13];
                        int i14 = i13 * 2;
                        char[] cArr2 = AbstractC33913l.f142093a;
                        cArr[i14] = cArr2[(b & 255) >>> 4];
                        cArr[i14 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((C31983m2) this.f21444y).mo43683a(c3368h);
            } catch (Throwable th3) {
                ((C31983m2) this.f21444y).mo43683a(c3368h);
                throw th3;
            }
        }
        synchronized (((C33909h) this.f21443x)) {
            ((C33909h) this.f21443x).m107261d(interfaceC37327e, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: W */
    public boolean m16043W(Object obj, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        C2910h c2910h = (C2910h) this.f21444y;
        return ((((Number) ((C22686q) this.f21443x).get(obj)).intValue() >>> c2910h.f11691a) & ((1 << c2910h.f11692b) - 1)) == c2910h.f11693c;
    }

    /* JADX INFO: renamed from: Y */
    public C32301c m16044Y(C30136h proto, InterfaceC32332f nameResolver) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        return ((C37199o) this.f21444y).m119229m(proto, nameResolver);
    }

    /* JADX INFO: renamed from: Z */
    public void m16045Z(EnumC17339v enumC17339v, String str) {
        String str2 = (String) this.f21443x;
        if (enumC17339v.f67150w > ((EnumC17339v) this.f21444y).f67150w) {
            return;
        }
        int iOrdinal = enumC17339v.ordinal();
        if (iOrdinal == 1) {
            Log.e(str2, "[Error]: " + str);
            return;
        }
        if (iOrdinal == 2) {
            Log.w(str2, "[Warn]: " + str);
        } else if (iOrdinal == 3) {
            Log.v(str2, "[Log]: " + str);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            Log.d(str2, "[Debug]: " + str);
        }
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: a */
    public void mo16046a(int i13) {
        int i14;
        if (i13 >= 40) {
            mo16048b();
            return;
        }
        if (10 > i13 || i13 >= 20) {
            return;
        }
        C22471e c22471e = (C22471e) this.f21444y;
        synchronized (c22471e.f13c) {
            i14 = c22471e.f14d;
        }
        c22471e.m8i(i14 / 2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m16047a0(Object... objArr) {
        m16045Z(EnumC17339v.VERBOSE, AbstractC25260n.m74028D0(objArr, null, null, null, C17341x.f67156z, 31));
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: b */
    public void mo16048b() {
        ((C22471e) this.f21444y).m8i(-1);
    }

    /* JADX INFO: renamed from: b0 */
    public void m16049b0(InterfaceC0962i interfaceC0962i, Object obj) {
        HashMap map = (HashMap) this.f21444y;
        C0957d c0957d = (C0957d) map.get(interfaceC0962i);
        if (c0957d == null) {
            c0957d = new C0957d(interfaceC0962i);
            c0957d.f3541d = c0957d;
            C0957d c0957d2 = (C0957d) this.f21443x;
            c0957d.f3541d = c0957d2.f3541d;
            c0957d.f3540c = c0957d2;
            c0957d2.f3541d = c0957d;
            c0957d.f3541d.f3540c = c0957d;
            map.put(interfaceC0962i, c0957d);
        } else {
            interfaceC0962i.mo2439a();
        }
        if (c0957d.f3539b == null) {
            c0957d.f3539b = new ArrayList();
        }
        c0957d.f3539b.add(obj);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: c */
    public List mo16003c(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0) {
        ((AbstractC15702a) this.f21443x).getClass();
        C25271y c25271y = C25271y.f99162w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c25271y, 10));
        Iterator<E> it = c25271y.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) abstractC17104a0.f65705x));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public void m16050c0(String str, String str2, Long l7) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((C20584f) ((C3632c) this.f21443x).f14788w).m56714a()).get(new C20295c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l7.longValue());
        }
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: d */
    public void mo16051d(EnumC20296d enumC20296d, EnumC20418m enumC20418m) {
        mo16062k(enumC20296d, enumC20418m, 1L);
    }

    /* JADX INFO: renamed from: d0 */
    public Object m16052d0() {
        C0957d c0957d = (C0957d) this.f21443x;
        C0957d c0957d2 = c0957d.f3541d;
        while (true) {
            boolean zEquals = c0957d2.equals(c0957d);
            Object obj = c0957d2.f3538a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c0957d2.f3539b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c0957d2.f3539b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C0957d c0957d3 = c0957d2.f3541d;
            c0957d3.f3540c = c0957d2.f3540c;
            c0957d2.f3540c.f3541d = c0957d3;
            ((HashMap) this.f21444y).remove(obj);
            ((InterfaceC0962i) obj).mo2439a();
            c0957d2 = c0957d2.f3541d;
        }
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: e */
    public List mo16005e(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0) {
        ((AbstractC15702a) this.f21443x).getClass();
        C25271y c25271y = C25271y.f99162w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c25271y, 10));
        Iterator<E> it = c25271y.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) abstractC17104a0.f65705x));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public void m16053e0(C20294b c20294b) {
        if (c20294b == null) {
            return;
        }
        for (C20298f c20298f : c20294b.f76190x) {
            m16050c0(c20298f.m56299c(), c20298f.m56297a(), c20298f.m56298b());
        }
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: f */
    public void mo16054f(C22467a c22467a, Bitmap bitmap, Map map) {
        int i13;
        int iM88546w = AbstractC29125c.m88546w(bitmap);
        C22471e c22471e = (C22471e) this.f21444y;
        synchronized (c22471e.f13c) {
            i13 = c22471e.f11a;
        }
        if (iM88546w <= i13) {
            ((C22471e) this.f21444y).m3d(c22467a, new C22470d(bitmap, map, iM88546w));
        } else {
            ((C22471e) this.f21444y).m4e(c22467a);
            ((C3143v) this.f21443x).m9046o(c22467a, bitmap, map, iM88546w);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m16055f0(String str, JSONObject jSONObject) {
        m16056g0(str, jSONObject, ((C5341k) ((C0928c) this.f21443x).f3421x).f21749g, null, null);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: g */
    public ArrayList mo16007g(C17136y container) {
        AbstractC22676k.m65750j(container, "container");
        Iterable iterable = (List) container.f65805E.m118820k(((AbstractC15702a) this.f21443x).f59019c);
        if (iterable == null) {
            iterable = C25271y.f99162w;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) container.f65705x));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public void m16056g0(String str, JSONObject jSONObject, String str2, C5392z1 c5392z1, InterfaceC5318e0 interfaceC5318e0) {
        m16040T().mo16478b(((C5341k) ((C0928c) this.f21443x).f3421x).f21745c, str, jSONObject, str2, c5392z1, interfaceC5318e0);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: h */
    public List mo16008h(AbstractC17104a0 abstractC17104a0, InterfaceC37019v proto, int i13) {
        AbstractC15702a abstractC15702a = (AbstractC15702a) this.f21443x;
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC18489d0.m53382w(i13, "kind");
        if (proto instanceof C30122c0) {
            abstractC15702a.getClass();
        } else {
            if (!(proto instanceof C30146k0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iM35485e = AbstractC12682p.m35485e(i13);
            if (iM35485e != 1 && iM35485e != 2 && iM35485e != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(AbstractC13673n.m38553E(i13)).toString());
            }
            abstractC15702a.getClass();
        }
        C25271y c25271y = C25271y.f99162w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c25271y, 10));
        Iterator<E> it = c25271y.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) abstractC17104a0.f65705x));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public void m16057h0(int i13) throws InvalidAlgorithmParameterException {
        switch (this.f21442w) {
            case 13:
                if (i13 != 16 && i13 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
                }
                this.f21443x = Integer.valueOf(i13);
                return;
            default:
                if (i13 != 32 && i13 != 48 && i13 != 64) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i13)));
                }
                this.f21443x = Integer.valueOf(i13);
                return;
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: i */
    public void mo16058i(EnumC20436n5 enumC20436n5, Throwable th3, String str, Object... objArr) {
        InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f21444y;
        if (interfaceC20602v0 == null || !mo16069o(enumC20436n5)) {
            return;
        }
        interfaceC20602v0.mo16058i(enumC20436n5, th3, str, objArr);
    }

    /* JADX INFO: renamed from: i0 */
    public void m16059i0(boolean z4) {
        if (z4) {
            InterfaceC5348l2 interfaceC5348l2 = (InterfaceC5348l2) this.f21444y;
            if (interfaceC5348l2 == null || interfaceC5348l2.getClass() != C5340j2.class) {
                this.f21444y = new C5340j2(((C5341k) ((C0928c) this.f21443x).f3421x).f21743a);
                return;
            }
            return;
        }
        InterfaceC5348l2 interfaceC5348l3 = (InterfaceC5348l2) this.f21444y;
        if (interfaceC5348l3 == null || interfaceC5348l3.getClass() != C5344k2.class) {
            this.f21444y = new C5344k2();
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: j */
    public void mo16060j(EnumC20436n5 enumC20436n5, String str, Throwable th3) {
        InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f21444y;
        if (interfaceC20602v0 == null || !mo16069o(enumC20436n5)) {
            return;
        }
        interfaceC20602v0.mo16060j(enumC20436n5, str, th3);
    }

    /* JADX INFO: renamed from: j0 */
    public void m16061j0(C21586l workSpecId, int i13) {
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        ((InterfaceC32351a) this.f21444y).m100716a(new RunnableC31226i((C21577g) this.f21443x, workSpecId, false, i13));
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: k */
    public void mo16062k(EnumC20296d enumC20296d, EnumC20418m enumC20418m, long j7) {
        try {
            m16050c0(enumC20296d.getReason(), enumC20418m.getCategory(), Long.valueOf(j7));
            m16033L();
        } catch (Throwable th3) {
            ((C20513q6) this.f21444y).getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Unable to record lost event.", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX INFO: renamed from: k0 */
    public C26466i m16063k0(C23758a1 c23758a1, List list, C22309a c22309a) {
        AbstractC23773f1 abstractC23773f1M101015X;
        C26466i c26466i = new C26466i();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC23811y abstractC23811y = (AbstractC23811y) it.next();
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
            if (interfaceC31126hMo1784d instanceof InterfaceC31117e) {
                Set setM64112e = c22309a.m64112e();
                AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
                if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
                    AbstractC23797r abstractC23797r = (AbstractC23797r) abstractC23773f1Mo69863p0;
                    AbstractC23763c0 abstractC23763c0M101015X = abstractC23797r.f94187x;
                    if (!abstractC23763c0M101015X.mo69844i0().getParameters().isEmpty() && abstractC23763c0M101015X.mo69844i0().mo1784d() != null) {
                        List parameters = abstractC23763c0M101015X.mo69844i0().getParameters();
                        AbstractC22676k.m65749i(parameters, "getParameters(...)");
                        List<InterfaceC31165x0> list2 = parameters;
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                        for (InterfaceC31165x0 interfaceC31165x0 : list2) {
                            AbstractC23804u0 c23778h0 = (AbstractC23804u0) AbstractC25265s.m74102I0(interfaceC31165x0.getIndex(), abstractC23811y.mo69842X());
                            boolean z4 = setM64112e != null && setM64112e.contains(interfaceC31165x0);
                            if (c23778h0 == null || z4) {
                                c23778h0 = new C23778h0(interfaceC31165x0);
                            } else {
                                AbstractC23812y0 abstractC23812y0M69821f = c23758a1.m69821f();
                                AbstractC23811y abstractC23811yMo69868b = c23778h0.mo69868b();
                                AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                                if (abstractC23812y0M69821f.mo64119d(abstractC23811yMo69868b) == null) {
                                    c23778h0 = new C23778h0(interfaceC31165x0);
                                }
                            }
                            arrayList.add(c23778h0);
                        }
                        abstractC23763c0M101015X = AbstractC32410a.m101015X(abstractC23763c0M101015X, arrayList, null, 2);
                    }
                    AbstractC23763c0 abstractC23763c0M101015X2 = abstractC23797r.f94188y;
                    if (!abstractC23763c0M101015X2.mo69844i0().getParameters().isEmpty() && abstractC23763c0M101015X2.mo69844i0().mo1784d() != null) {
                        List parameters2 = abstractC23763c0M101015X2.mo69844i0().getParameters();
                        AbstractC22676k.m65749i(parameters2, "getParameters(...)");
                        List<InterfaceC31165x0> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                        for (InterfaceC31165x0 interfaceC31165x1 : list3) {
                            AbstractC23804u0 c23778h1 = (AbstractC23804u0) AbstractC25265s.m74102I0(interfaceC31165x1.getIndex(), abstractC23811y.mo69842X());
                            boolean z13 = setM64112e != null && setM64112e.contains(interfaceC31165x1);
                            if (c23778h1 == null || z13) {
                                c23778h1 = new C23778h0(interfaceC31165x1);
                            } else {
                                AbstractC23812y0 abstractC23812y0M69821f2 = c23758a1.m69821f();
                                AbstractC23811y abstractC23811yMo69868b2 = c23778h1.mo69868b();
                                AbstractC22676k.m65749i(abstractC23811yMo69868b2, "getType(...)");
                                if (abstractC23812y0M69821f2.mo64119d(abstractC23811yMo69868b2) == null) {
                                    c23778h1 = new C23778h0(interfaceC31165x1);
                                }
                            }
                            arrayList2.add(c23778h1);
                        }
                        abstractC23763c0M101015X2 = AbstractC32410a.m101015X(abstractC23763c0M101015X2, arrayList2, null, 2);
                    }
                    abstractC23773f1M101015X = AbstractC23791o.m69883b(abstractC23763c0M101015X, abstractC23763c0M101015X2);
                } else {
                    if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23763c0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23773f1Mo69863p0;
                    if (abstractC23763c0.mo69844i0().getParameters().isEmpty() || abstractC23763c0.mo69844i0().mo1784d() == null) {
                        abstractC23773f1M101015X = abstractC23763c0;
                    } else {
                        List parameters3 = abstractC23763c0.mo69844i0().getParameters();
                        AbstractC22676k.m65749i(parameters3, "getParameters(...)");
                        List<InterfaceC31165x0> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                        for (InterfaceC31165x0 interfaceC31165x2 : list4) {
                            AbstractC23804u0 c23778h2 = (AbstractC23804u0) AbstractC25265s.m74102I0(interfaceC31165x2.getIndex(), abstractC23811y.mo69842X());
                            boolean z14 = setM64112e != null && setM64112e.contains(interfaceC31165x2);
                            if (c23778h2 == null || z14) {
                                c23778h2 = new C23778h0(interfaceC31165x2);
                            } else {
                                AbstractC23812y0 abstractC23812y0M69821f3 = c23758a1.m69821f();
                                AbstractC23811y abstractC23811yMo69868b3 = c23778h2.mo69868b();
                                AbstractC22676k.m65749i(abstractC23811yMo69868b3, "getType(...)");
                                if (abstractC23812y0M69821f3.mo64119d(abstractC23811yMo69868b3) == null) {
                                    c23778h2 = new C23778h0(interfaceC31165x2);
                                }
                            }
                            arrayList3.add(c23778h2);
                        }
                        abstractC23773f1M101015X = AbstractC32410a.m101015X(abstractC23763c0, arrayList3, null, 2);
                    }
                }
                c26466i.add(c23758a1.m69822g(AbstractC23791o.m69885d(abstractC23773f1M101015X, abstractC23773f1Mo69863p0), EnumC23776g1.OUT_VARIANCE));
            } else if (interfaceC31126hMo1784d instanceof InterfaceC31165x0) {
                Set setM64112e2 = c22309a.m64112e();
                if (setM64112e2 == null || !setM64112e2.contains(interfaceC31126hMo1784d)) {
                    List upperBounds = ((InterfaceC31165x0) interfaceC31126hMo1784d).getUpperBounds();
                    AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
                    c26466i.addAll(m16063k0(c23758a1, upperBounds, c22309a));
                } else {
                    c26466i.add(m16035N(c22309a));
                }
            }
        }
        return AbstractC12350b.m34586g(c26466i);
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC20376a
    /* JADX INFO: renamed from: l */
    public List mo16064l() {
        InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f21444y;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f21443x).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th3) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error getting Proguard UUIDs.", e5);
            return null;
        } catch (RuntimeException e13) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e13, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m16065l0(JSONObject jSONObject) {
        Boolean bool = Boolean.FALSE;
        JSONObject jSONObject2 = new JSONObject();
        try {
            m16027B(jSONObject2);
            C5341k c5341k = (C5341k) ((C0928c) this.f21443x).f3421x;
            if (c5341k.f21746d == null && (c5341k.f21748f != null || c5341k.f21747e != null)) {
                jSONObject2.put("preferUserId", true);
            }
            jSONObject2.put("dataFields", jSONObject);
            jSONObject2.put("mergeNestedObjects", bool);
            m16055f0("users/update", jSONObject2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: m */
    public void mo16066m(EnumC20436n5 enumC20436n5, String str, Object... objArr) {
        InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f21444y;
        if (interfaceC20602v0 == null || !mo16069o(enumC20436n5)) {
            return;
        }
        interfaceC20602v0.mo16066m(enumC20436n5, str, objArr);
    }

    /* JADX INFO: renamed from: m0 */
    public void m16067m0(Object... objArr) {
        m16045Z(EnumC17339v.WARN, AbstractC25260n.m74028D0(objArr, null, null, null, C17341x.f67153E, 31));
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: n */
    public void mo16068n(EnumC20296d enumC20296d, C20275c5 c20275c5) {
        C20513q6 c20513q6 = (C20513q6) this.f21444y;
        if (c20275c5 == null) {
            return;
        }
        try {
            EnumC20424m5 enumC20424m5 = c20275c5.f76147a.f76265E;
            if (EnumC20424m5.ClientReport.equals(enumC20424m5)) {
                try {
                    m16053e0(c20275c5.m56246e(c20513q6.getSerializer()));
                    return;
                } catch (Exception unused) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC20418m enumC20418mM16021E = m16021E(enumC20424m5);
            if (enumC20418mM16021E.equals(EnumC20418m.Transaction)) {
                C20473d0 c20473d0M56250i = c20275c5.m56250i(c20513q6.getSerializer());
                if (c20473d0M56250i != null) {
                    ArrayList arrayList = c20473d0M56250i.f76637S;
                    m16050c0(enumC20296d.getReason(), EnumC20418m.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    m16033L();
                }
                m16050c0(enumC20296d.getReason(), enumC20418mM16021E.getCategory(), 1L);
                m16033L();
                return;
            }
            if (enumC20418mM16021E.equals(EnumC20418m.LogItem)) {
                C20541s5 c20541s5M56248g = c20275c5.m56248g(c20513q6.getSerializer());
                if (c20541s5M56248g == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                m16050c0(enumC20296d.getReason(), enumC20418mM16021E.getCategory(), Long.valueOf(c20541s5M56248g.f76984w.size()));
                m16050c0(enumC20296d.getReason(), EnumC20418m.LogByte.getCategory(), Long.valueOf(c20275c5.m56247f().length));
                m16033L();
                return;
            }
            if (!enumC20418mM16021E.equals(EnumC20418m.TraceMetric)) {
                m16050c0(enumC20296d.getReason(), enumC20418mM16021E.getCategory(), 1L);
                m16033L();
                return;
            }
            C20620w5 c20620w5M56249h = c20275c5.m56249h(c20513q6.getSerializer());
            if (c20620w5M56249h == null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            m16050c0(enumC20296d.getReason(), enumC20418mM16021E.getCategory(), Long.valueOf(c20620w5M56249h.f77163w.size()));
            m16033L();
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: o */
    public boolean mo16069o(EnumC20436n5 enumC20436n5) {
        C20513q6 c20513q6 = (C20513q6) this.f21443x;
        return enumC20436n5 != null && c20513q6.isDebug() && enumC20436n5.ordinal() >= c20513q6.getDiagnosticLevel().ordinal();
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: p */
    public C22468b mo16070p(C22467a c22467a) {
        C22470d c22470d = (C22470d) ((C22471e) this.f21444y).m2c(c22467a);
        if (c22470d != null) {
            return new C22468b(c22470d.f88022a, c22470d.f88023b);
        }
        return null;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: q */
    public List mo16013q(AbstractC17104a0 abstractC17104a0, InterfaceC37019v proto, int i13) {
        List list;
        AbstractC15702a abstractC15702a = (AbstractC15702a) this.f21443x;
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC18489d0.m53382w(i13, "kind");
        if (proto instanceof C30154o) {
            list = (List) ((C30154o) proto).m118820k(abstractC15702a.f59018b);
        } else if (proto instanceof C30122c0) {
            list = (List) ((C30122c0) proto).m118820k(abstractC15702a.f59020d);
        } else {
            if (!(proto instanceof C30146k0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iM35485e = AbstractC12682p.m35485e(i13);
            if (iM35485e == 1) {
                list = (List) ((C30146k0) proto).m118820k(abstractC15702a.f59021e);
            } else if (iM35485e == 2) {
                list = (List) ((C30146k0) proto).m118820k(abstractC15702a.f59022f);
            } else {
                if (iM35485e != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C30146k0) proto).m118820k(abstractC15702a.f59023g);
            }
        }
        if (list == null) {
            list = C25271y.f99162w;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) abstractC17104a0.f65705x));
        }
        return arrayList;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: r */
    public ArrayList mo16014r(C30120b1 proto, InterfaceC32332f nameResolver) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.m118820k(((AbstractC15702a) this.f21443x).f59028l);
        if (iterable == null) {
            iterable = C25271y.f99162w;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        C4708s0 c4708s0 = (C4708s0) this.f21444y;
        if (c4708s0.f19274I == Thread.currentThread() || !c4708s0.f19271F) {
            ((InterfaceC38282i) this.f21443x).request(j7);
        } else {
            c4708s0.f19272G.mo37106c(new C4706r0(this, j7));
        }
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: s */
    public List mo16015s(AbstractC17104a0 container, C30172x c30172x) {
        AbstractC22676k.m65750j(container, "container");
        Iterable iterable = (List) c30172x.m118820k(((AbstractC15702a) this.f21443x).f59024h);
        if (iterable == null) {
            iterable = C25271y.f99162w;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) container.f65705x));
        }
        return arrayList;
    }

    @Override // hb3.InterfaceC17103a
    /* JADX INFO: renamed from: t */
    public Object mo16016t(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, AbstractC23811y abstractC23811y) {
        C30127e c30127e = (C30127e) AbstractC21478l0.m60453x(c30146k0, ((AbstractC15702a) this.f21443x).f59025i);
        if (c30127e == null) {
            return null;
        }
        return ((C37199o) this.f21444y).m119212R(abstractC23811y, c30127e, (InterfaceC32332f) abstractC17104a0.f65705x);
    }

    public String toString() {
        switch (this.f21442w) {
            case 3:
                StringBuilder sb4 = new StringBuilder("GroupedLinkedMap( ");
                C0957d c0957d = (C0957d) this.f21443x;
                C0957d c0957d2 = c0957d.f3540c;
                boolean z4 = false;
                while (!c0957d2.equals(c0957d)) {
                    sb4.append('{');
                    sb4.append(c0957d2.f3538a);
                    sb4.append(':');
                    ArrayList arrayList = c0957d2.f3539b;
                    sb4.append(arrayList != null ? arrayList.size() : 0);
                    sb4.append("}, ");
                    c0957d2 = c0957d2.f3540c;
                    z4 = true;
                }
                if (z4) {
                    sb4.delete(sb4.length() - 2, sb4.length());
                }
                sb4.append(" )");
                return sb4.toString();
            case 11:
                String strM91837g = "[ ";
                if (((C14054f) this.f21443x) != null) {
                    for (int i13 = 0; i13 < 9; i13++) {
                        strM91837g = AbstractC30007c.m91837g(((C14054f) this.f21443x).f50176H[i13], " ", AbstractC18489d0.m53374o(strM91837g));
                    }
                }
                StringBuilder sbM35484d = AbstractC12682p.m35484d(strM91837g, "] ");
                sbM35484d.append((C14054f) this.f21443x);
                return sbM35484d.toString();
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: u */
    public void mo16071u(EnumC20296d enumC20296d, C5101l0 c5101l0) {
        if (c5101l0 == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) c5101l0.f21444y).iterator();
            while (it.hasNext()) {
                mo16068n(enumC20296d, (C20275c5) it.next());
            }
        } catch (Throwable th3) {
            ((C20513q6) this.f21444y).getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: v */
    public List mo16017v(AbstractC17104a0 abstractC17104a0, InterfaceC37019v callableProto, int i13, int i14, C30129e1 c30129e1) {
        AbstractC22676k.m65750j(callableProto, "callableProto");
        AbstractC18489d0.m53382w(i13, "kind");
        List listMo16018w = c30129e1 != null ? mo16018w(abstractC17104a0, callableProto, i13, i14, c30129e1) : null;
        return listMo16018w == null ? C25271y.f99162w : listMo16018w;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: w */
    public List mo16018w(AbstractC17104a0 abstractC17104a0, InterfaceC37019v callableProto, int i13, int i14, C30129e1 proto) {
        AbstractC22676k.m65750j(callableProto, "callableProto");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(proto, "proto");
        Iterable iterable = (List) proto.m118820k(((AbstractC15702a) this.f21443x).f59026j);
        if (iterable == null) {
            iterable = C25271y.f99162w;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(m16044Y((C30136h) it.next(), (InterfaceC32332f) abstractC17104a0.f65705x));
        }
        return arrayList;
    }

    @Override // hb3.InterfaceC17111e
    /* JADX INFO: renamed from: x */
    public C17109d mo2333x(C35845c classId) {
        AbstractC22676k.m65750j(classId, "classId");
        C0929d c0929d = (C0929d) this.f21443x;
        C27763f c27763f = (C27763f) this.f21444y;
        c27763f.m83862c().f65737c.getClass();
        C36969b c36969bM34252D = AbstractC12313p.m34252D(c0929d, classId, C32331e.f133827g);
        if (c36969bM34252D == null) {
            return null;
        }
        AbstractC38109c.m122089a(c36969bM34252D.f158227a).equals(classId);
        return c27763f.m83866g(c36969bM34252D);
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: y */
    public C5101l0 mo16072y(C5101l0 c5101l0) {
        C20513q6 c20513q6 = (C20513q6) this.f21444y;
        Date dateM60659O = AbstractC21598x.m60659O();
        C3632c c3632c = (C3632c) this.f21443x;
        c3632c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((C20584f) c3632c.f14788w).m56714a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new C20298f(((C20295c) entry.getKey()).f76192a, ((C20295c) entry.getKey()).f76193b, lValueOf));
            }
        }
        C20294b c20294b = arrayList.isEmpty() ? null : new C20294b(dateM60659O, arrayList);
        if (c20294b == null) {
            return c5101l0;
        }
        try {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) c5101l0.f21444y).iterator();
            while (it.hasNext()) {
                arrayList2.add((C20275c5) it.next());
            }
            arrayList2.add(C20275c5.m56242b(c20513q6.getSerializer(), c20294b));
            return new C5101l0((C20619w4) c5101l0.f21443x, arrayList2);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Unable to attach client report to envelope.", new Object[0]);
            return c5101l0;
        }
    }

    @Override // hb3.InterfaceC17103a
    /* JADX INFO: renamed from: z */
    public Object mo16020z(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, AbstractC23811y abstractC23811y) {
        return null;
    }

    public /* synthetic */ C5101l0(int i13, boolean z4) {
        this.f21442w = i13;
    }

    public /* synthetic */ C5101l0(Object obj, Object obj2, boolean z4, int i13) {
        this.f21442w = i13;
        this.f21443x = obj;
        this.f21444y = obj2;
    }

    public C5101l0(InterfaceC31109b0 module, C41113q c41113q, AbstractC15702a protocol) {
        this.f21442w = 14;
        AbstractC22676k.m65750j(module, "module");
        AbstractC22676k.m65750j(protocol, "protocol");
        this.f21443x = protocol;
        this.f21444y = new C37199o(module, c41113q);
    }

    public C5101l0(C21567b c21567b) {
        this.f21442w = 25;
        C22342k c22342k = new C22342k("Type parameter upper bound erasure results");
        this.f21443x = AbstractC30060g.m92088H(new C14328u(this, 9));
        this.f21444y = c22342k.m64223b(new C11934s(this, 10));
    }

    public C5101l0(String str, HashMap map) {
        this.f21442w = 17;
        AbstractC29125c.m88510S(str, "url is required");
        try {
            this.f21443x = URI.create(str).toURL();
            this.f21444y = map;
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e5);
        }
    }

    public C5101l0(Context context, InterfaceC14544a logger, C0783z c0783z) {
        this.f21442w = 10;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.f21443x = logger;
        this.f21444y = c0783z;
    }

    public C5101l0(int i13) {
        this.f21442w = i13;
        switch (i13) {
            case 3:
                this.f21443x = new C0957d(null);
                this.f21444y = new HashMap();
                break;
            case 6:
                this.f21443x = new C33909h(1000L);
                this.f21444y = AbstractC35057c.m110829a(10, new C20363j(11));
                break;
            case 12:
                this.f21443x = new Object();
                this.f21444y = new ArrayBlockingQueue(512);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f21443x = new LinkedHashSet();
                this.f21444y = new LinkedHashMap();
                break;
            case 28:
                this.f21443x = new ArrayList();
                this.f21444y = new HashMap();
                break;
            case 29:
                this.f21443x = new C0057v0();
                this.f21444y = new C0057v0();
                break;
            default:
                this.f21443x = new C30849c(new C0230n0[16]);
                break;
        }
    }

    public C5101l0(Context context, InterfaceC20602v0 interfaceC20602v0) {
        this.f21442w = 19;
        Context applicationContext = context.getApplicationContext();
        this.f21443x = applicationContext != null ? applicationContext : context;
        this.f21444y = interfaceC20602v0;
    }

    public C5101l0(C0230n0 c0230n0, InterfaceC39127r0 interfaceC39127r0) {
        this.f21442w = 1;
        this.f21443x = c0230n0;
        this.f21444y = AbstractC28683x.m87272z(interfaceC39127r0);
    }

    public C5101l0(C20513q6 c20513q6) {
        this.f21442w = 20;
        this.f21444y = c20513q6;
        this.f21443x = new C3632c(16);
    }

    public C5101l0(String str) {
        this.f21442w = 15;
        this.f21443x = str;
        this.f21444y = EnumC17339v.DEBUG;
    }

    public C5101l0(AbstractC1848z0 database) {
        this.f21442w = 4;
        AbstractC22676k.m65750j(database, "database");
        this.f21443x = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC22676k.m65749i(setNewSetFromMap, "newSetFromMap(...)");
        this.f21444y = setNewSetFromMap;
    }

    public C5101l0(C22686q c22686q, C2910h c2910h) {
        this.f21442w = 5;
        this.f21443x = c22686q;
        this.f21444y = c2910h;
        if (c2910h.f11692b != 1 || c2910h.f11693c != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h, " was passed").toString());
        }
    }

    public C5101l0(C20619w4 c20619w4, List list) {
        this.f21442w = 18;
        AbstractC29125c.m88510S(c20619w4, "SentryEnvelopeHeader is required.");
        this.f21443x = c20619w4;
        AbstractC29125c.m88510S(list, "SentryEnvelope items are required.");
        this.f21444y = list;
    }

    public C5101l0(C14053e c14053e) {
        this.f21442w = 11;
        this.f21444y = c14053e;
    }

    public C5101l0(C0928c c0928c) {
        this.f21442w = 8;
        this.f21443x = c0928c;
    }

    public C5101l0(C21577g processor, InterfaceC32351a workTaskExecutor) {
        this.f21442w = 21;
        AbstractC22676k.m65750j(processor, "processor");
        AbstractC22676k.m65750j(workTaskExecutor, "workTaskExecutor");
        this.f21443x = processor;
        this.f21444y = workTaskExecutor;
    }

    public C5101l0(C20501v c20501v, C20499t c20499t, C20275c5 c20275c5) {
        this.f21442w = 18;
        this.f21443x = new C20619w4(c20501v, c20499t, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c20275c5);
        this.f21444y = arrayList;
    }

    public C5101l0(int i13, C3143v c3143v) {
        this.f21442w = 23;
        this.f21443x = c3143v;
        this.f21444y = new C22471e(i13, this);
    }

    public C5101l0(int i13, C18065g c18065g) {
        this.f21442w = 9;
        this.f21443x = c18065g;
        String str = "top";
        if (i13 != 0) {
            if (i13 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.f21444y = str;
    }
}
