package p031b9;

import android.content.Context;
import android.content.DialogInterface;
import android.opengl.Matrix;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.fragment.app.RunnableC1319m;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import bc3.InterfaceC2994c0;
import c23.ViewOnTouchListenerC3909o;
import c93.InterfaceC4339a;
import com.stripe.android.model.StripeIntent$Usage;
import com.whoop.android.R;
import e93.AbstractC12889b;
import gm.C15990r;
import he1.DialogInterfaceOnShowListenerC17213b;
import i23.InterfaceC18016a;
import i93.C18283i;
import i93.C18284j;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import io.getstream.photoview.PhotoView;
import j23.C21262a;
import j23.C21263b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kg.AbstractC22452f;
import kg.C22447a;
import kg.C22448b;
import l83.C23470p;
import lu.C24739a;
import lu.C24740b;
import lu.C24741c;
import m23.C24970d;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25258m;
import m83.C25271y;
import ne3.C26610e;
import ne3.C26611e0;
import ne3.InterfaceC26629n0;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a3.C0237p;
import p006a4.AbstractC0354a;
import p303lg.C24022a;
import p309lo.C24560r;
import p309lo.C24565w;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p389p0.C28506a0;
import p389p0.C28516d1;
import p389p0.C28561y0;
import p389p0.InterfaceC28507a1;
import p389p0.ViewOnAttachStateChangeListenerC28505a;
import p474s.AbstractC32004s;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p522uf.AbstractC34870c0;
import p550vd.AbstractC35903f;
import p565vy.InterfaceC36562b;
import p598wy.C37688a;
import p598wy.InterfaceC37689b;
import p607x8.C38061p;
import p607x8.C38063r;
import p619xl.C38445a;
import p635y2.C39137u1;
import p636y3.C39169a;
import p705ea2.DialogInterfaceOnDismissListenerC12898c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa.C30108m;
import qa.InterfaceC30105j;
import th.C33804b;
import th.C33806d;
import th.C33807e;
import tk.C33872c;
import tk.C33873d;
import x30.C37900j1;
import xd3.C38220c;
import xd3.C38222e;
import xd3.C38223f;
import xd3.C38224g;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38983w0;
import y00.C39001y0;
import y00.EnumC38817e3;

/* JADX INFO: renamed from: b9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C2817b implements InterfaceC33648q, InterfaceC37689b {

    /* JADX INFO: renamed from: F */
    public static C2817b f11020F;

    /* JADX INFO: renamed from: E */
    public Object f11021E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11022w;

    /* JADX INFO: renamed from: x */
    public boolean f11023x;

    /* JADX INFO: renamed from: y */
    public Object f11024y;

    /* JADX INFO: renamed from: z */
    public Object f11025z;

    public C2817b(String str, C38983w0 paymentMode, boolean z4, InterfaceC4339a interfaceC4339a) {
        this.f11022w = 13;
        AbstractC22676k.m65750j(paymentMode, "paymentMode");
        this.f11024y = str;
        this.f11025z = paymentMode;
        this.f11023x = z4;
        this.f11021E = interfaceC4339a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C33872c m8000c(C2817b c2817b) {
        return (C33872c) c2817b.f11024y;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean[] m8001d(C2817b c2817b) {
        return (boolean[]) c2817b.f11025z;
    }

    /* JADX INFO: renamed from: g */
    public static void m8002g(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f13 = fArr2[10];
        float f14 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        float f15 = fArr2[10] / fSqrt;
        fArr[0] = f15;
        float f16 = fArr2[8];
        fArr[2] = f16 / fSqrt;
        fArr[8] = (-f16) / fSqrt;
        fArr[10] = f15;
    }

    /* JADX INFO: renamed from: h */
    public static void m8003h(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f13 = fArr2[10];
        float f14 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        float f15 = fArr2[10] / fSqrt;
        fArr[0] = f15;
        float f16 = fArr2[8];
        fArr[2] = f16 / fSqrt;
        fArr[8] = (-f16) / fSqrt;
        fArr[10] = f15;
    }

    /* JADX INFO: renamed from: a */
    public void m8004a() {
        switch (this.f11022w) {
            case 5:
                C24741c.m72434b((C24741c) this.f11021E, this, false);
                return;
            case 11:
                C33873d.m107110b((C33873d) this.f11021E, this, false);
                return;
            default:
                C38223f c38223f = (C38223f) this.f11021E;
                synchronized (c38223f) {
                    try {
                        if (this.f11023x) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (AbstractC22676k.m65745e(((C38220c) this.f11024y).f163820g, this)) {
                            c38223f.m122497h(this, false);
                        }
                        this.f11023x = true;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8005b() {
        if (this.f11023x) {
            return;
        }
        try {
            m8004a();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8006e() {
        switch (this.f11022w) {
            case 11:
                C33873d.m107110b((C33873d) this.f11021E, this, true);
                this.f11023x = true;
                return;
            default:
                C38223f c38223f = (C38223f) this.f11021E;
                synchronized (c38223f) {
                    try {
                        if (this.f11023x) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (AbstractC22676k.m65745e(((C38220c) this.f11024y).f163820g, this)) {
                            c38223f.m122497h(this, true);
                        }
                        this.f11023x = true;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8007f(boolean z4) {
        C33807e c33807e = (C33807e) this.f11021E;
        synchronized (c33807e.f141595H) {
            try {
                if (this.f11023x) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC22676k.m65745e(((C33804b) this.f11024y).f141585g, this)) {
                    C33807e.m106961b(c33807e, this, z4);
                }
                this.f11023x = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m8008i() {
        C38220c c38220c = (C38220c) this.f11024y;
        if (AbstractC22676k.m65745e(c38220c.f163820g, this)) {
            C38223f c38223f = (C38223f) this.f11021E;
            if (c38223f.f163840L) {
                c38223f.m122497h(this, false);
            } else {
                c38220c.f163819f = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8009j() {
        while (m8018u() != null) {
        }
    }

    /* JADX INFO: renamed from: k */
    public C26611e0 m8010k(int i13) {
        C26611e0 c26611e0;
        C33807e c33807e = (C33807e) this.f11021E;
        synchronized (c33807e.f141595H) {
            if (this.f11023x) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f11025z)[i13] = true;
            Object obj = ((C33804b) this.f11024y).f141582d.get(i13);
            C33806d c33806d = c33807e.f141604Q;
            C26611e0 c26611e1 = (C26611e0) obj;
            if (!c33806d.m79274x(c26611e1)) {
                try {
                    c33806d.mo37080p0(c26611e1, false).close();
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception unused) {
                }
            }
            c26611e0 = (C26611e0) obj;
        }
        return c26611e0;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public void mo3098l() {
        SparseArray sparseArray = (SparseArray) this.f11021E;
        ((InterfaceC33648q) this.f11024y).mo3098l();
        if (this.f11023x) {
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                ((C30108m) sparseArray.valueAt(i13)).f122855i = true;
            }
        }
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ InterfaceC36562b mo8011m(JSONObject jSONObject) {
        switch (this.f11022w) {
            case 13:
                return m8019w(jSONObject);
            default:
                return m8020x(jSONObject);
        }
    }

    /* JADX INFO: renamed from: n */
    public File m8012n() {
        File file;
        synchronized (((C33873d) this.f11021E)) {
            try {
                C33872c c33872c = (C33872c) this.f11024y;
                if (c33872c.f141875f != this) {
                    throw new IllegalStateException();
                }
                if (!c33872c.f141874e) {
                    ((boolean[]) this.f11025z)[0] = true;
                }
                file = c33872c.f141873d[0];
                if (!((C33873d) this.f11021E).f141887w.exists()) {
                    ((C33873d) this.f11021E).f141887w.mkdirs();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return file;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: o */
    public InterfaceC33639k0 mo3101o(int i13, int i14) {
        SparseArray sparseArray = (SparseArray) this.f11021E;
        InterfaceC33648q interfaceC33648q = (InterfaceC33648q) this.f11024y;
        if (i14 != 3) {
            this.f11023x = true;
            return interfaceC33648q.mo3101o(i13, i14);
        }
        C30108m c30108m = (C30108m) sparseArray.get(i13);
        if (c30108m != null) {
            return c30108m;
        }
        C30108m c30108m2 = new C30108m(interfaceC33648q.mo3101o(i13, i14), (InterfaceC30105j) this.f11025z);
        sparseArray.put(i13, c30108m2);
        return c30108m2;
    }

    /* JADX INFO: renamed from: p */
    public C2345k m8013p() {
        return (C2345k) ((C23470p) this.f11025z).getValue();
    }

    /* JADX INFO: renamed from: q */
    public String m8014q() {
        return ((C22447a) this.f11024y).f87876b.toString();
    }

    /* JADX INFO: renamed from: r */
    public OutputStream m8015r(int i13) {
        FileOutputStream fileOutputStream;
        C24739a c24739a;
        synchronized (((C24741c) this.f11021E)) {
            try {
                C24740b c24740b = (C24740b) this.f11024y;
                if (c24740b.f96737d != this) {
                    throw new IllegalStateException();
                }
                if (!c24740b.f96736c) {
                    ((boolean[]) this.f11025z)[i13] = true;
                }
                File fileM72432b = c24740b.m72432b(i13);
                try {
                    fileOutputStream = new FileOutputStream(fileM72432b);
                } catch (FileNotFoundException unused) {
                    ((C24741c) this.f11021E).f96751w.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileM72432b);
                    } catch (FileNotFoundException unused2) {
                        return C24741c.f96740P;
                    }
                }
                c24739a = new C24739a(this, fileOutputStream);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c24739a;
    }

    /* JADX INFO: renamed from: s */
    public InterfaceC26629n0 m8016s(int i13) {
        C38223f c38223f = (C38223f) this.f11021E;
        synchronized (c38223f) {
            try {
                if (this.f11023x) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC22676k.m65745e(((C38220c) this.f11024y).f163820g, this)) {
                    return new C26610e();
                }
                if (!((C38220c) this.f11024y).f163818e) {
                    boolean[] zArr = (boolean[]) this.f11025z;
                    AbstractC22676k.m65747g(zArr);
                    zArr[i13] = true;
                }
                C26611e0 file = (C26611e0) ((C38220c) this.f11024y).f163817d.get(i13);
                try {
                    C38222e c38222e = c38223f.f163849x;
                    c38222e.getClass();
                    AbstractC22676k.m65750j(file, "file");
                    return new C38224g(c38222e.mo37080p0(file, false), new C37900j1(5, c38223f, this));
                } catch (FileNotFoundException unused) {
                    return new C26610e();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public C2817b m8017t() {
        C2817b c2817b = (C2817b) this.f11021E;
        if (c2817b != null) {
            c2817b.m8009j();
        }
        AbstractC22452f abstractC22452fM8018u = m8018u();
        while (abstractC22452fM8018u != null && !(abstractC22452fM8018u instanceof C22447a)) {
            abstractC22452fM8018u = m8018u();
        }
        C22447a c22447a = (C22447a) abstractC22452fM8018u;
        C2817b c2817bM113998R = c22447a != null ? AbstractC35903f.m113998R(c22447a, (C15990r) this.f11025z) : null;
        this.f11021E = c2817bM113998R;
        return c2817bM113998R;
    }

    /* JADX INFO: renamed from: u */
    public AbstractC22452f m8018u() {
        C15990r c15990r = (C15990r) this.f11025z;
        if (this.f11023x) {
            return null;
        }
        C38445a c38445a = (C38445a) c15990r.f60512x;
        C25258m c25258m = (C25258m) c15990r.f60513y;
        while (1 > c25258m.f99142y && !((AbstractC34870c0) c38445a.f164637y).equals(C24022a.f94887z)) {
            AbstractC22452f abstractC22452fM123186x = c38445a.m123186x();
            AbstractC22676k.m65747g(abstractC22452fM123186x);
            c25258m.addLast(abstractC22452fM123186x);
        }
        AbstractC22452f abstractC22452f = (AbstractC22452f) (c25258m.mo74007a() > 0 ? c25258m.get(0) : null);
        C22447a c22447a = (C22447a) this.f11024y;
        if (abstractC22452f != null && (abstractC22452f instanceof C22448b)) {
            C22448b c22448b = (C22448b) abstractC22452f;
            if (c22448b.f87879a == c22447a.f87875a && c22448b.f87880b.equals(c22447a.f87876b)) {
                c15990r.m45147M();
                this.f11023x = true;
                return null;
            }
        }
        return c15990r.m45147M();
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: v */
    public void mo3109v(InterfaceC33627e0 interfaceC33627e0) {
        ((InterfaceC33648q) this.f11024y).mo3109v(interfaceC33627e0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: w */
    public C38887l3 m8019w(JSONObject jSONObject) {
        ?? arrayList;
        EnumC38817e3 enumC38817e3;
        C38983w0 c38983w0 = (C38983w0) this.f11025z;
        List listM121113a = C37688a.m121113a(jSONObject.optJSONArray("payment_method_types"));
        List listM121113a2 = C37688a.m121113a(jSONObject.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM121113a2, 10));
        Iterator it = listM121113a2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("link_funding_sources");
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it3 = c18284jM36278i0.iterator();
            while (((C18283i) it3).f71138y) {
                arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC25243e0) it3).nextInt()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            String lowerCase2 = ((String) it4.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            arrayList3.add(lowerCase2);
        }
        String strM99551t = AbstractC32004s.m99551t("country_code", jSONObject);
        int iOrdinal = c38983w0.f167803z.ordinal();
        if (iOrdinal == 0) {
            enumC38817e3 = EnumC38817e3.Automatic;
        } else if (iOrdinal == 1) {
            enumC38817e3 = EnumC38817e3.AutomaticAsync;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC38817e3 = EnumC38817e3.Manual;
        }
        EnumC38817e3 enumC38817e4 = enumC38817e3;
        String str = (String) this.f11024y;
        boolean z4 = this.f11023x;
        long jLongValue = ((Number) ((InterfaceC4339a) this.f11021E).invoke()).longValue();
        StripeIntent$Usage stripeIntent$Usage = c38983w0.f167802y;
        long j7 = c38983w0.f167800w;
        return new C38887l3(str, listM121113a, Long.valueOf(j7), 0L, null, enumC38817e4, null, null, strM99551t, jLongValue, c38983w0.f167801x, null, z4, null, null, null, null, stripeIntent$Usage, null, null, arrayList2, arrayList3, null, c38983w0.f167799E, listM121113a.isEmpty(), 5105816);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: x */
    public C38840g6 m8020x(JSONObject jSONObject) {
        ?? arrayList;
        List listM121113a = C37688a.m121113a(jSONObject.optJSONArray("payment_method_types"));
        List listM121113a2 = C37688a.m121113a(jSONObject.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM121113a2, 10));
        Iterator it = listM121113a2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("link_funding_sources");
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it3 = c18284jM36278i0.iterator();
            while (((C18283i) it3).f71138y) {
                arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC25243e0) it3).nextInt()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            String lowerCase2 = ((String) it4.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            arrayList3.add(lowerCase2);
        }
        String strM99551t = AbstractC32004s.m99551t("country_code", jSONObject);
        return new C38840g6((String) this.f11024y, ((Number) ((InterfaceC4339a) this.f11021E).invoke()).longValue(), strM99551t, this.f11023x, listM121113a, ((C39001y0) this.f11025z).f167871x, arrayList2, arrayList3, listM121113a.isEmpty());
    }

    /* JADX INFO: renamed from: y */
    public C28561y0 m8021y(int i13, long j7, C0237p c0237p, boolean z4, Function1 function1) {
        InterfaceC28507a1 interfaceC28507a1 = (InterfaceC28507a1) this.f11021E;
        boolean z13 = interfaceC28507a1 instanceof ViewOnAttachStateChangeListenerC28505a;
        C28561y0 c28561y0 = new C28561y0(this, i13, c0237p, function1);
        c28561y0.f115551d = new C39169a(j7);
        if (!z13) {
            interfaceC28507a1.mo86816a(c28561y0);
        } else if (z4) {
            ViewOnAttachStateChangeListenerC28505a viewOnAttachStateChangeListenerC28505a = (ViewOnAttachStateChangeListenerC28505a) interfaceC28507a1;
            viewOnAttachStateChangeListenerC28505a.f115395x.add(new C28516d1(1, c28561y0));
            if (!viewOnAttachStateChangeListenerC28505a.f115396y) {
                viewOnAttachStateChangeListenerC28505a.f115396y = true;
                viewOnAttachStateChangeListenerC28505a.f115394w.post(viewOnAttachStateChangeListenerC28505a);
            }
        } else {
            ViewOnAttachStateChangeListenerC28505a viewOnAttachStateChangeListenerC28505a2 = (ViewOnAttachStateChangeListenerC28505a) interfaceC28507a1;
            viewOnAttachStateChangeListenerC28505a2.f115395x.add(new C28516d1(0, c28561y0));
            if (!viewOnAttachStateChangeListenerC28505a2.f115396y) {
                viewOnAttachStateChangeListenerC28505a2.f115396y = true;
                viewOnAttachStateChangeListenerC28505a2.f115394w.post(viewOnAttachStateChangeListenerC28505a2);
            }
        }
        AbstractC0354a.m959F(i13, "compose:lazy:schedule_prefetch:index");
        return c28561y0;
    }

    /* JADX INFO: renamed from: z */
    public void m8022z() {
        C38063r c38063r = (C38063r) this.f11021E;
        if (this.f11023x) {
            c38063r.m121879c(new RunnableC1319m(this, 6));
            this.f11023x = false;
        }
    }

    public C2817b(String str, C39001y0 setupMode, boolean z4, InterfaceC4339a interfaceC4339a) {
        this.f11022w = 14;
        AbstractC22676k.m65750j(setupMode, "setupMode");
        this.f11024y = str;
        this.f11025z = setupMode;
        this.f11023x = z4;
        this.f11021E = interfaceC4339a;
    }

    public C2817b(C22447a c22447a, C15990r c15990r) {
        this.f11022w = 3;
        this.f11024y = c22447a;
        this.f11025z = c15990r;
    }

    public C2817b(Context context, C24560r c24560r) {
        this.f11022w = 4;
        this.f11024y = c24560r;
        C24970d c24970d = new C24970d(context);
        this.f11021E = c24970d;
        this.f11023x = true;
        c24970d.setZoomingAllowed$photoview_dialog_release(true);
        c24970d.setSwipeToDismissAllowed$photoview_dialog_release(true);
        c24970d.setContainerPadding$photoview_dialog_release((int[]) c24560r.f95853w);
        c24970d.setImagesMargin$photoview_dialog_release(0);
        c24970d.setOverlayView$photoview_dialog_release(null);
        c24970d.setBackgroundColor(-16777216);
        c24970d.m73295f((ArrayList) c24560r.f95855y, c24560r.f95854x, (InterfaceC18016a) c24560r.f95856z);
        c24970d.setOnPageChange$photoview_dialog_release(new C19962a(this, 26));
        c24970d.setOnDismiss$photoview_dialog_release(new C19683b(this, 20));
        C24844i view = new C24844i(context, R.style.ImageViewerDialog_NoStatusBar).setView(c24970d);
        view.f97324a.f97271p = new DialogInterface.OnKeyListener() { // from class: l23.a
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
                Object next;
                AbstractC22676k.m65747g(keyEvent);
                C24970d c24970d2 = (C24970d) this.f92097w.f11021E;
                if (i13 != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                    return false;
                }
                if (!c24970d2.m73294e()) {
                    c24970d2.m73293d();
                    return true;
                }
                C21263b c21263b = c24970d2.f97726M;
                if (c21263b != null) {
                    int currentPosition$photoview_dialog_release = c24970d2.getCurrentPosition$photoview_dialog_release();
                    Iterator it = c21263b.f81179i.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C21262a) next).f81169b != currentPosition$photoview_dialog_release);
                    C21262a c21262a = (C21262a) next;
                    if (c21262a != null) {
                        PhotoView photoView = c21262a.f81171d;
                        AbstractC22676k.m65750j(photoView, "<this>");
                        float minimumScale = photoView.getMinimumScale();
                        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = photoView.f74900w;
                        if (viewOnTouchListenerC3909o == null) {
                            AbstractC22676k.m65757q("attacher");
                            throw null;
                        }
                        PhotoView photoView2 = viewOnTouchListenerC3909o.f15987w;
                        viewOnTouchListenerC3909o.m11894e(minimumScale, photoView2.getRight() / 2, photoView2.getBottom() / 2, true);
                        return true;
                    }
                }
                return true;
            }
        };
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = view.create();
        int i13 = 1;
        dialogInterfaceC24846jCreate.setOnShowListener(new DialogInterfaceOnShowListenerC17213b(this, i13));
        dialogInterfaceC24846jCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC12898c(this, i13));
        this.f11025z = dialogInterfaceC24846jCreate;
    }

    public C2817b(int i13) {
        this.f11022w = i13;
        switch (i13) {
            case 6:
                this.f11024y = new float[16];
                this.f11025z = new float[16];
                this.f11021E = new C24565w(0);
                break;
            case 9:
                this.f11024y = new float[16];
                this.f11025z = new float[16];
                this.f11021E = new C24565w(1);
                break;
        }
    }

    public C2817b(InterfaceC2994c0 coroutineScope) {
        this.f11022w = 2;
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.f11024y = coroutineScope;
        this.f11025z = AbstractC1772c1.m5382S(this, "ScopeProviderImpl");
    }

    public C2817b(InterfaceC33648q interfaceC33648q, InterfaceC30105j interfaceC30105j) {
        this.f11022w = 8;
        this.f11024y = interfaceC33648q;
        this.f11025z = interfaceC30105j;
        this.f11021E = new SparseArray();
    }

    public C2817b(Context context, Looper looper, Looper looper2, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0, C38061p c38061p) {
        this.f11022w = 0;
        this.f11024y = context.getApplicationContext();
        this.f11021E = c38061p.m121874a(looper, null);
        this.f11025z = new C2814a(this, c38061p.m121874a(looper2, null), surfaceHolderCallbackC2821c0);
    }

    public C2817b(C28506a0 c28506a0, C39137u1 c39137u1, InterfaceC28507a1 interfaceC28507a1) {
        this.f11022w = 7;
        this.f11024y = c28506a0;
        this.f11025z = c39137u1;
        this.f11021E = interfaceC28507a1;
        this.f11023x = true;
    }

    public C2817b(C33807e c33807e, C33804b c33804b) {
        this.f11022w = 10;
        this.f11021E = c33807e;
        this.f11024y = c33804b;
        this.f11025z = new boolean[2];
    }

    public C2817b(C24741c c24741c, C24740b c24740b) {
        this.f11022w = 5;
        this.f11021E = c24741c;
        this.f11024y = c24740b;
        this.f11025z = c24740b.f96736c ? null : new boolean[c24741c.f96743G];
    }

    public C2817b(C33873d c33873d, C33872c c33872c) {
        this.f11022w = 11;
        this.f11021E = c33873d;
        this.f11024y = c33872c;
        this.f11025z = c33872c.f141874e ? null : new boolean[c33873d.f141879G];
    }

    public C2817b(C38223f c38223f, C38220c c38220c) {
        boolean[] zArr;
        this.f11022w = 12;
        this.f11021E = c38223f;
        this.f11024y = c38220c;
        if (c38220c.f163818e) {
            zArr = null;
        } else {
            c38223f.getClass();
            zArr = new boolean[2];
        }
        this.f11025z = zArr;
    }
}
