package p005a3;

import al.InterfaceC0955b;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.HandlerThread;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bd3.C3143v;
import bg.C3217l;
import bh.C3247j;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import cg.C4560o;
import ck.C4771a;
import com.google.crypto.tink.internal.C5101l0;
import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.HandlerC5361p0;
import dk.C12100f;
import e93.AbstractC12889b;
import fj.C14525a;
import fj.C14526b;
import fk.InterfaceC14544a;
import ge3.AbstractC15751g;
import gl.C15938c;
import hb3.AbstractC17104a0;
import ia3.C18295a;
import ia3.C18297c;
import ia3.InterfaceC18300f;
import io.sentry.C20269c;
import io.sentry.C20353h7;
import io.sentry.android.core.internal.util.C20101b;
import io.sentry.config.AbstractC20301a;
import io.sentry.hints.C20363j;
import io.sentry.protocol.C20501v;
import j93.InterfaceC21493z;
import ja3.C21510f0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ka3.AbstractC22312d;
import ka3.C22309a;
import ka3.C22311c;
import ka3.C22316h;
import ka3.EnumC22310b;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import l83.EnumC23463i;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.C23806v0;
import lb3.C23813z;
import lb3.EnumC23761b1;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import lk.C24482a;
import lk.InterfaceC24484c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import ma3.InterfaceC25374c;
import ma3.InterfaceC25376e;
import nb3.C26555l;
import nb3.EnumC26554k;
import nf3.C26669a;
import o93.AbstractC27742n;
import o93.C27740l;
import o93.EnumC27738j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a0.AbstractC0015d1;
import p002a0.C0005a0;
import p002a0.C0020f0;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p007a6.C0448q;
import p014aj.C0928c;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p087db.C11856j0;
import p098dt.AbstractC12350b;
import p173gj.C15903d;
import p185h6.C16948c;
import p185h6.C16963r;
import p185h6.C16966u;
import p185h6.C16969x;
import p185h6.C16970y;
import p185h6.InterfaceC16951f;
import p185h6.InterfaceC16961p;
import p208i2.InterfaceC17915v;
import p210i4.AbstractC18061c;
import p210i4.C18063e;
import p210i4.C18066h;
import p212i6.C18148a;
import p242j4.InterfaceC21304d;
import p249jc.C21565a;
import p249jc.C21567b;
import p270k2.C22128b;
import p283kl.C22553b;
import p304lh.InterfaceC24066e;
import p306ll.C24500c;
import p306ll.InterfaceC24498a;
import p319m4.C25016e;
import p319m4.C25017f;
import p333n4.C26246b;
import p333n4.InterfaceC26247c;
import p390p1.AbstractC28659r;
import p390p1.C28631k;
import p390p1.InterfaceC28599c;
import p390p1.InterfaceC28623i;
import p425qh.ComponentCallbacks2C30361g;
import p436qs.C30559c;
import p436qs.C30560d;
import p463rj.AbstractC31479j;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p543v4.AbstractC35644c;
import p547v8.AbstractC35785b;
import p586wk.C37330h;
import p602x1.C37822h;
import p619xl.C38445a;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p684zk.InterfaceC40801z;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import pf.AbstractC29140r;
import pf.C29137o;
import pf.C29138p;
import pf.InterfaceC29142t;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q93.C30080d;
import q93.C30081e;
import r83.EnumC31071a;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s83.AbstractC32269c;
import s93.C32305g;
import s93.C32308j;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import sb3.AbstractC32350a;
import se.AbstractC32416g;
import se.AbstractC32417h;
import uf3.C34911a;
import va3.AbstractC35854l;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35965l;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import x93.AbstractC38106a0;
import x93.C38108b0;
import x93.C38112d0;
import x93.C38116h;
import x93.C38122n;
import x93.C38124p;
import x93.C38133y;
import xf3.C38266c;
import ya3.AbstractC39363f;
import yb3.AbstractC39397a;
import z93.EnumC40212c;

/* JADX INFO: renamed from: a3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0237p implements InterfaceC24066e, InterfaceC24484c, InterfaceC24498a, InterfaceC28599c, InterfaceC29142t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f811w;

    /* JADX INFO: renamed from: x */
    public Object f812x;

    /* JADX INFO: renamed from: y */
    public Object f813y;

    /* JADX INFO: renamed from: z */
    public Object f814z;

    public /* synthetic */ C0237p(int i13, boolean z4) {
        this.f811w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static final void m668a(C0237p c0237p, Network network, boolean z4) {
        boolean z13;
        boolean z14 = false;
        for (Network network2 : ((ConnectivityManager) c0237p.f812x).getAllNetworks()) {
            if (AbstractC22676k.m65745e(network2, network)) {
                z13 = z4;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c0237p.f812x).getNetworkCapabilities(network2);
                z13 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z13) {
                z14 = true;
                break;
            }
        }
        ComponentCallbacks2C30361g componentCallbacks2C30361g = (ComponentCallbacks2C30361g) c0237p.f813y;
        synchronized (componentCallbacks2C30361g) {
            try {
                if (((C3247j) componentCallbacks2C30361g.f124559w.get()) != null) {
                    componentCallbacks2C30361g.f124558E = z14;
                } else {
                    componentCallbacks2C30361g.m92832b();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m669u(Editable editable, KeyEvent keyEvent, boolean z4) {
        C16970y[] c16970yArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c16970yArr = (C16970y[]) editable.getSpans(selectionStart, selectionEnd, C16970y.class)) != null && c16970yArr.length > 0) {
                for (C16970y c16970y : c16970yArr) {
                    int spanStart = editable.getSpanStart(c16970y);
                    int spanEnd = editable.getSpanEnd(c16970y);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public long m670A() {
        return ((C22128b) this.f814z).f85851w.f85850d;
    }

    /* JADX INFO: renamed from: B */
    public String m671B() {
        Boolean bool = (Boolean) this.f814z;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((C20501v) this.f812x) + "-" + ((C20353h7) this.f813y) + "-" + str;
    }

    /* JADX INFO: renamed from: C */
    public boolean m672C(CharSequence charSequence, int i13, int i14, C16969x c16969x) {
        if ((c16969x.f65126c & 3) == 0) {
            InterfaceC16951f interfaceC16951f = (InterfaceC16951f) this.f814z;
            C18148a c18148aM47732b = c16969x.m47732b();
            int iM52082a = c18148aM47732b.m52082a(8);
            if (iM52082a != 0) {
                ((ByteBuffer) c18148aM47732b.f70446z).getShort(iM52082a + c18148aM47732b.f70443w);
            }
            C16948c c16948c = (C16948c) interfaceC16951f;
            c16948c.getClass();
            ThreadLocal threadLocal = C16948c.f65069b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb4 = (StringBuilder) threadLocal.get();
            sb4.setLength(0);
            while (i13 < i14) {
                sb4.append(charSequence.charAt(i13));
                i13++;
            }
            TextPaint textPaint = c16948c.f65070a;
            String string = sb4.toString();
            int i15 = AbstractC35644c.f151453a;
            boolean zM96942u = AbstractC31479j.m96942u(textPaint, string);
            int i16 = c16969x.f65126c & 4;
            c16969x.f65126c = zM96942u ? i16 | 2 : i16 | 1;
        }
        return (c16969x.f65126c & 3) == 2;
    }

    /* JADX INFO: renamed from: D */
    public boolean m673D() {
        return !(((C0220k2) ((C0928c) this.f812x).f3421x).isEmpty() && ((C0220k2) ((C0928c) this.f814z).f3421x).isEmpty() && ((C0220k2) ((C0928c) this.f813y).f3421x).isEmpty());
    }

    /* JADX INFO: renamed from: E */
    public void m674E(JSONObject jSONObject) {
        C5339j1 c5339j1M16456d;
        synchronized (this) {
            try {
                Iterator it = ((Map) this.f813y).entrySet().iterator();
                while (it.hasNext()) {
                    ((C5339j1) ((Map.Entry) it.next()).getValue()).m16473u(null);
                }
                ((Map) this.f813y).clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("inAppMessages");
        if (jSONArrayOptJSONArray != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject != null && (c5339j1M16456d = C5339j1.m16456d(jSONObjectOptJSONObject, this)) != null) {
                    c5339j1M16456d.m16473u(this);
                    ((Map) this.f813y).put(c5339j1M16456d.m16459g(), c5339j1M16456d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m675F(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c) {
        C26246b c26246b = (C26246b) this.f813y;
        int[] iArr = c25016e.f97940q0;
        int[] iArr2 = c25016e.f97944u;
        c26246b.f104359a = iArr[0];
        c26246b.f104360b = iArr[1];
        c26246b.f104361c = c25016e.m73445r();
        c26246b.f104362d = c25016e.m73441l();
        c26246b.f104367i = false;
        c26246b.f104368j = i13;
        boolean z4 = c26246b.f104359a == 3;
        boolean z13 = c26246b.f104360b == 3;
        boolean z14 = z4 && c25016e.f97904X > 0.0f;
        boolean z15 = z13 && c25016e.f97904X > 0.0f;
        if (z14 && iArr2[0] == 4) {
            c26246b.f104359a = 1;
        }
        if (z15 && iArr2[1] == 4) {
            c26246b.f104360b = 1;
        }
        interfaceC26247c.mo3624a(c25016e, c26246b);
        c25016e.m73429S(c26246b.f104363e);
        c25016e.m73424N(c26246b.f104364f);
        c25016e.f97886F = c26246b.f104366h;
        c25016e.m73420J(c26246b.f104365g);
        c26246b.f104368j = 0;
        return c26246b.f104367i;
    }

    /* JADX INFO: renamed from: G */
    public void m676G(AbstractC17104a0 abstractC17104a0, C37822h c37822h) {
        Exception exc;
        int i13;
        C0020f0 c0020f0 = (C0020f0) this.f812x;
        int i14 = c0020f0.f47b;
        C0047q0 c0047q0 = (C0047q0) this.f813y;
        C0047q0 c0047q1 = new C0047q0();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            int i17 = i15 + 1;
            try {
                try {
                    switch (c0020f0.m28c(i15)) {
                        case 0:
                            abstractC17104a0.mo710p();
                            i15 = i17;
                            break;
                        case 1:
                            int i18 = i16 + 1;
                            abstractC17104a0.mo706l(c0047q0.m102e(i16));
                            i16 = i18;
                            i15 = i17;
                            break;
                        case 2:
                            int i19 = i15 + 2;
                            i15 += 3;
                            abstractC17104a0.mo701f(c0020f0.m28c(i17), c0020f0.m28c(i19));
                            break;
                        case 3:
                            int i24 = i15 + 2;
                            try {
                                int i25 = i15 + 3;
                                try {
                                    i15 += 4;
                                    abstractC17104a0.mo700e(c0020f0.m28c(i17), c0020f0.m28c(i24), c0020f0.m28c(i25));
                                } catch (Exception e5) {
                                    exc = e5;
                                    i15 = i25;
                                    throw new C28631k(c0047q0, c0047q1, c0020f0, i15, exc);
                                }
                            } catch (Exception e13) {
                                exc = e13;
                                i15 = i24;
                            }
                            break;
                        case 4:
                            abstractC17104a0.m48352a();
                            i15 = i17;
                            break;
                        case 5:
                            i15 += 2;
                            i13 = i16 + 1;
                            abstractC17104a0.mo705k(c0020f0.m28c(i17), c0047q0.m102e(i16));
                            i16 = i13;
                            break;
                        case 6:
                            i15 += 2;
                            try {
                                i13 = i16 + 1;
                                abstractC17104a0.mo702g(c0020f0.m28c(i17), c0047q0.m102e(i16));
                                i16 = i13;
                            } catch (Exception e14) {
                                exc = e14;
                                throw new C28631k(c0047q0, c0047q1, c0020f0, i15, exc);
                            }
                            break;
                        case 7:
                            int i26 = i16 + 1;
                            Object objM102e = c0047q0.m102e(i16);
                            AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            AbstractC22681m0.m65774e(2, objM102e);
                            i16 += 2;
                            abstractC17104a0.mo699d(c0047q0.m102e(i26), (InterfaceC4351m) objM102e);
                            i15 = i17;
                            break;
                        case 8:
                            Object obj = abstractC17104a0.f65707z;
                            if (obj instanceof InterfaceC28623i) {
                                InterfaceC28623i interfaceC28623i = (InterfaceC28623i) obj;
                                if (c37822h.f161973f.m94893k(interfaceC28623i)) {
                                    interfaceC28623i.mo608a();
                                }
                            }
                            c0047q1.m98a(obj);
                            abstractC17104a0.mo707m();
                            i15 = i17;
                            break;
                        default:
                            i15 = i17;
                            break;
                    }
                } catch (Exception e15) {
                    exc = e15;
                    i15 = i17;
                }
            } catch (Throwable th3) {
                abstractC17104a0.mo751h();
                throw th3;
            }
        }
        if (i16 != c0047q0.f137b) {
            AbstractC28659r.m87192c("Applier operation size mismatch");
        }
        c0047q0.m100c();
        c0020f0.f47b = 0;
        abstractC17104a0.mo751h();
    }

    /* JADX INFO: renamed from: H */
    public Object m677H(CharSequence charSequence, int i13, int i14, int i15, boolean z4, InterfaceC16961p interfaceC16961p) {
        int i16;
        char c3;
        C16963r c16963r = new C16963r((C16966u) ((C41113q) this.f813y).f177226z);
        int iCodePointAt = Character.codePointAt(charSequence, i13);
        int i17 = 0;
        boolean zMo31818a = true;
        int iCharCount = i13;
        loop0: while (true) {
            i16 = iCharCount;
            while (true) {
                if (iCharCount < i14 && i17 < i15 && zMo31818a) {
                    SparseArray sparseArray = c16963r.f65101c.f65117a;
                    C16966u c16966u = sparseArray == null ? null : (C16966u) sparseArray.get(iCodePointAt);
                    if (c16963r.f65099a == 2) {
                        if (c16966u != null) {
                            c16963r.f65101c = c16966u;
                            c16963r.f65104f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c16963r.m47719a();
                            } else if (iCodePointAt != 65039) {
                                C16966u c16966u2 = c16963r.f65101c;
                                if (c16966u2.f65118b != null) {
                                    if (c16963r.f65104f != 1) {
                                        c16963r.f65102d = c16966u2;
                                        c16963r.m47719a();
                                    } else if (c16963r.m47720b()) {
                                        c16963r.f65102d = c16963r.f65101c;
                                        c16963r.m47719a();
                                    } else {
                                        c16963r.m47719a();
                                    }
                                    c3 = 3;
                                } else {
                                    c16963r.m47719a();
                                }
                            }
                            c3 = 1;
                        }
                        c3 = 2;
                    } else if (c16966u == null) {
                        c16963r.m47719a();
                        c3 = 1;
                    } else {
                        c16963r.f65099a = 2;
                        c16963r.f65101c = c16966u;
                        c16963r.f65104f = 1;
                        c3 = 2;
                    }
                    c16963r.f65103e = iCodePointAt;
                    if (c3 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i16)) + i16;
                        if (iCharCount >= i14) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c3 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i14) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c3 == 3) {
                        if (!z4 && m672C(charSequence, i16, iCharCount, c16963r.f65102d.f65118b)) {
                            break;
                        }
                        zMo31818a = interfaceC16961p.mo31818a(charSequence, i16, iCharCount, c16963r.f65102d.f65118b);
                        i17++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c16963r.f65099a == 2 && c16963r.f65101c.f65118b != null && ((c16963r.f65104f > 1 || c16963r.m47720b()) && i17 < i15 && zMo31818a && (z4 || !m672C(charSequence, i16, iCharCount, c16963r.f65101c.f65118b)))) {
            interfaceC16961p.mo31818a(charSequence, i16, iCharCount, c16963r.f65101c.f65118b);
        }
        return interfaceC16961p.mo31820d();
    }

    /* JADX INFO: renamed from: I */
    public void m678I(String str, String value) {
        AbstractC22676k.m65750j(value, "value");
        ((Properties) this.f813y).setProperty(str, value);
        m681L();
    }

    /* JADX INFO: renamed from: J */
    public void m679J(String str) {
        C15903d c15903d = (C15903d) this.f814z;
        AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60133f, null, new C0448q(this, str, null, 9), 2);
    }

    /* JADX INFO: renamed from: K */
    public synchronized void m680K(C5339j1 c5339j1) {
        c5339j1.m16473u(null);
        String strM16459g = c5339j1.m16459g();
        File file = new File(((Context) this.f812x).getFilesDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "IterableInAppFileStorage");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, strM16459g);
        File[] fileArrListFiles = file3.listFiles();
        if (fileArrListFiles != null) {
            for (File file4 : fileArrListFiles) {
                file4.delete();
            }
            file3.delete();
        }
        ((Map) this.f813y).remove(c5339j1.m16459g());
        HandlerC5361p0 handlerC5361p0 = (HandlerC5361p0) this.f814z;
        if (!handlerC5361p0.hasMessages(100)) {
            handlerC5361p0.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m681L() {
        File file = (File) this.f814z;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((Properties) this.f813y).store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            InterfaceC14544a interfaceC14544a = (InterfaceC14544a) this.f812x;
            if (interfaceC14544a != null) {
                interfaceC14544a.error("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + AbstractC29125c.m88514W(th5));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    public void m682M(String str, String str2) {
        File file = new File(((Context) this.f812x).getFilesDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "IterableInAppFileStorage");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.isDirectory() || !new File(file3, "index.html").exists()) {
            if (!file3.mkdir()) {
            }
            if (file3 == null) {
                AbstractC12350b.m34595p("IterableInAppFileStorage", "Failed to create folder for HTML content");
            } else {
                if (AbstractC15751g.m44448a0(new File(file3, "index.html"), str2)) {
                }
                AbstractC12350b.m34595p("IterableInAppFileStorage", "Failed to store HTML content");
            }
        }
        AbstractC12350b.m34577Z("IterableInAppFileStorage", "Directory with file already exists. No need to store again");
        file3 = null;
        if (file3 == null) {
            AbstractC12350b.m34595p("IterableInAppFileStorage", "Failed to create folder for HTML content");
        } else if (AbstractC15751g.m44448a0(new File(file3, "index.html"), str2)) {
            AbstractC12350b.m34595p("IterableInAppFileStorage", "Failed to store HTML content");
        }
    }

    /* JADX INFO: renamed from: N */
    public synchronized void m683N() {
        for (C5339j1 c5339j1 : ((Map) this.f813y).values()) {
            if (c5339j1.m16462j()) {
                m682M(c5339j1.m16459g(), c5339j1.m16457e().f21677a);
                c5339j1.m16472t();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public JSONObject m684O() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = ((Map) this.f813y).entrySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(((C5339j1) ((Map.Entry) it.next()).getValue()).m16476x());
            }
            jSONObject.putOpt("inAppMessages", jSONArray);
            return jSONObject;
        } catch (JSONException e5) {
            AbstractC12350b.m34596q("IterableInAppFileStorage", "Error while serializing messages", e5);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m685P(InterfaceC17915v interfaceC17915v) {
        ((C22128b) this.f814z).f85851w.f85849c = interfaceC17915v;
    }

    /* JADX INFO: renamed from: Q */
    public void m686Q(InterfaceC39171c interfaceC39171c) {
        ((C22128b) this.f814z).f85851w.f85847a = interfaceC39171c;
    }

    /* JADX INFO: renamed from: R */
    public void m687R(String str) {
        this.f813y = str;
        Iterator it = ((ArrayList) this.f814z).iterator();
        while (it.hasNext()) {
            C14525a c14525a = ((C4771a) it.next()).f19659w;
            if (c14525a == null) {
                AbstractC22676k.m65757q("connector");
                throw null;
            }
            C41113q c41113q = c14525a.f53074a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) c41113q.f177224x).readLock();
            lock.lock();
            try {
                C14526b c14526b = (C14526b) c41113q.f177225y;
                lock.unlock();
                c41113q.m133456H(new C14526b(c14526b.f53076a, str, c14526b.f53078c));
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m688S(int i13) {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i13 * 8)));
        }
        this.f812x = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: T */
    public void m689T(EnumC39181m enumC39181m) {
        ((C22128b) this.f814z).f85851w.f85848b = enumC39181m;
    }

    /* JADX INFO: renamed from: U */
    public void m690U(long j7) {
        ((C22128b) this.f814z).f85851w.f85850d = j7;
    }

    /* JADX INFO: renamed from: V */
    public void m691V(int i13) {
        if (i13 < 10 || 16 < i13) {
            throw new GeneralSecurityException(AbstractC2875y.m8295h(i13, "Invalid tag size for AesCmacParameters: "));
        }
        this.f813y = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: W */
    public void m692W(String str) {
        this.f812x = str;
        Iterator it = ((ArrayList) this.f814z).iterator();
        while (it.hasNext()) {
            C14525a c14525a = ((C4771a) it.next()).f19659w;
            if (c14525a == null) {
                AbstractC22676k.m65757q("connector");
                throw null;
            }
            C41113q c41113q = c14525a.f53074a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) c41113q.f177224x).readLock();
            lock.lock();
            try {
                C14526b c14526b = (C14526b) c41113q.f177225y;
                lock.unlock();
                String str2 = c14526b.f53076a;
                c41113q.m133456H(new C14526b(str, c14526b.f53077b, c14526b.f53078c));
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m693X(C25017f c25017f, int i13, int i14, int i15) {
        c25017f.getClass();
        int i16 = c25017f.f97912c0;
        int i17 = c25017f.f97914d0;
        c25017f.f97912c0 = 0;
        c25017f.f97914d0 = 0;
        c25017f.m73429S(i14);
        c25017f.m73424N(i15);
        if (i16 < 0) {
            c25017f.f97912c0 = 0;
        } else {
            c25017f.f97912c0 = i16;
        }
        if (i17 < 0) {
            c25017f.f97914d0 = 0;
        } else {
            c25017f.f97914d0 = i17;
        }
        C25017f c25017f2 = (C25017f) this.f814z;
        c25017f2.f97966u0 = i13;
        c25017f2.m73459Z();
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC23773f1 m694Y(C38116h arrayType, C22309a c22309a, boolean z4) {
        C41113q c41113q = (C41113q) this.f812x;
        C18295a c18295a = (C18295a) c41113q.f177224x;
        AbstractC22676k.m65750j(arrayType, "arrayType");
        AbstractC38106a0 abstractC38106a0M122100c = arrayType.m122100c();
        C38133y c38133y = abstractC38106a0M122100c instanceof C38133y ? (C38133y) abstractC38106a0M122100c : null;
        EnumC27738j enumC27738jM122129c = c38133y != null ? c38133y.m122129c() : null;
        C18297c c18297c = new C18297c(c41113q, arrayType, true);
        if (enumC27738jM122129c == null) {
            AbstractC23811y abstractC23811yM695Z = m695Z(abstractC38106a0M122100c, AbstractC35785b.m113400W(EnumC23761b1.f94124x, c22309a.m64113f(), null, 6));
            if (c22309a.m64113f()) {
                return c18295a.f71237o.mo78661c().m83821i(z4 ? EnumC23776g1.OUT_VARIANCE : EnumC23776g1.INVARIANT, abstractC23811yM695Z, c18297c);
            }
            return AbstractC23791o.m69883b(c18295a.f71237o.mo78661c().m83821i(EnumC23776g1.INVARIANT, abstractC23811yM695Z, c18297c), c18295a.f71237o.mo78661c().m83821i(EnumC23776g1.OUT_VARIANCE, abstractC23811yM695Z, c18297c).mo64125r0(true));
        }
        AbstractC23763c0 abstractC23763c0M83830r = c18295a.f71237o.mo78661c().m83830r(enumC27738jM122129c);
        AbstractC23811y abstractC23811yM56320S = AbstractC20301a.m56320S(abstractC23763c0M83830r, new C32308j(new InterfaceC32307i[]{abstractC23763c0M83830r.getAnnotations(), c18297c}));
        AbstractC22676k.m65748h(abstractC23811yM56320S, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23811yM56320S;
        return c22309a.m64113f() ? abstractC23763c0 : AbstractC23791o.m69883b(abstractC23763c0, abstractC23763c0.mo64125r0(true));
    }

    /* JADX INFO: renamed from: Z */
    public AbstractC23811y m695Z(InterfaceC25376e interfaceC25376e, C22309a c22309a) {
        AbstractC23763c0 abstractC23763c0M712r;
        C18295a c18295a = (C18295a) ((C41113q) this.f812x).f177224x;
        if (interfaceC25376e instanceof C38133y) {
            EnumC27738j enumC27738jM122129c = ((C38133y) interfaceC25376e).m122129c();
            return enumC27738jM122129c != null ? c18295a.f71237o.mo78661c().m83831t(enumC27738jM122129c) : c18295a.f71237o.mo78661c().m83834x();
        }
        boolean z4 = false;
        if (!(interfaceC25376e instanceof C38124p)) {
            if (interfaceC25376e instanceof C38116h) {
                return m694Y((C38116h) interfaceC25376e, c22309a, false);
            }
            if (interfaceC25376e instanceof C38112d0) {
                AbstractC38106a0 abstractC38106a0M122097c = ((C38112d0) interfaceC25376e).m122097c();
                return abstractC38106a0M122097c != null ? m695Z(abstractC38106a0M122097c, c22309a) : c18295a.f71237o.mo78661c().m83826n();
            }
            if (interfaceC25376e == null) {
                return c18295a.f71237o.mo78661c().m83826n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + interfaceC25376e);
        }
        C38124p c38124p = (C38124p) interfaceC25376e;
        if (!c22309a.m64113f() && c22309a.m64111d() != EnumC23761b1.f94123w) {
            z4 = true;
        }
        boolean zM122111g = c38124p.m122111g();
        if (!zM122111g && !z4) {
            AbstractC23763c0 abstractC23763c0M712r2 = m712r(c38124p, c22309a, null);
            return abstractC23763c0M712r2 != null ? abstractC23763c0M712r2 : C26555l.m78682c(EnumC26554k.UNRESOLVED_JAVA_CLASS, c38124p.m122109e());
        }
        AbstractC23763c0 abstractC23763c0M712r3 = m712r(c38124p, c22309a.m64116i(EnumC22310b.f87073y), null);
        if (abstractC23763c0M712r3 != null && (abstractC23763c0M712r = m712r(c38124p, c22309a.m64116i(EnumC22310b.f87072x), abstractC23763c0M712r3)) != null) {
            return zM122111g ? new C22316h(abstractC23763c0M712r3, abstractC23763c0M712r) : AbstractC23791o.m69883b(abstractC23763c0M712r3, abstractC23763c0M712r);
        }
        return C26555l.m78682c(EnumC26554k.UNRESOLVED_JAVA_CLASS, c38124p.m122109e());
    }

    /* JADX INFO: renamed from: a0 */
    public void m696a0(C25017f c25017f) {
        ArrayList arrayList = (ArrayList) this.f812x;
        arrayList.clear();
        int size = c25017f.f97963r0.size();
        for (int i13 = 0; i13 < size; i13++) {
            C25016e c25016e = (C25016e) c25017f.f97963r0.get(i13);
            int[] iArr = c25016e.f97940q0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c25016e);
            }
        }
        c25017f.f97965t0.f104372b = true;
    }

    /* JADX INFO: renamed from: b */
    public void m697b(C0230n0 c0230n0, EnumC0267y enumC0267y) {
        C0928c c0928c = (C0928c) this.f812x;
        C0928c c0928c2 = (C0928c) this.f813y;
        C0928c c0928c3 = (C0928c) this.f814z;
        int iOrdinal = enumC0267y.ordinal();
        if (iOrdinal == 0) {
            c0928c.m2328q(c0230n0);
            c0928c3.m2328q(c0230n0);
            return;
        }
        if (iOrdinal == 1) {
            c0928c2.m2328q(c0230n0);
            c0928c3.m2328q(c0230n0);
            return;
        }
        if (iOrdinal == 2) {
            if (c0230n0.f759G != null) {
                c0928c3.m2328q(c0230n0);
                return;
            } else {
                c0928c.m2328q(c0230n0);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (c0230n0.f759G != null) {
            c0928c3.m2328q(c0230n0);
        } else {
            c0928c2.m2328q(c0230n0);
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC18061c m698c() {
        C39174f c39174f = (C39174f) this.f812x;
        if (c39174f != null) {
            return new C18063e(c39174f.f168413w);
        }
        String str = (String) this.f813y;
        if (str != null) {
            return C18066h.m51912j(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.f814z) + ". Using WrapContent.");
        return C18066h.m51912j("wrap");
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: d */
    public void mo699d(Object obj, InterfaceC4351m interfaceC4351m) {
        ((C0020f0) this.f812x).m26a(7);
        C0047q0 c0047q0 = (C0047q0) this.f813y;
        c0047q0.m98a(interfaceC4351m);
        c0047q0.m98a(obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: e */
    public void mo700e(int i13, int i14, int i15) {
        C0020f0 c0020f0 = (C0020f0) this.f812x;
        c0020f0.m26a(3);
        c0020f0.m26a(i13);
        c0020f0.m26a(i14);
        c0020f0.m26a(i15);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: f */
    public void mo701f(int i13, int i14) {
        C0020f0 c0020f0 = (C0020f0) this.f812x;
        c0020f0.m26a(2);
        c0020f0.m26a(i13);
        c0020f0.m26a(i14);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: g */
    public void mo702g(int i13, Object obj) {
        C0020f0 c0020f0 = (C0020f0) this.f812x;
        c0020f0.m26a(6);
        c0020f0.m26a(i13);
        ((C0047q0) this.f813y).m98a(obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: i */
    public Object mo703i() {
        return this.f814z;
    }

    @Override // p304lh.InterfaceC24066e
    public boolean isOnline() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f812x;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063 A[LOOP:0: B:27:0x005d->B:29:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk.InterfaceC24484c
    /* JADX INFO: renamed from: j */
    public Object mo704j(InterfaceC30057d interfaceC30057d) {
        C24482a c24482a;
        C0237p c0237p;
        String message;
        ArrayList arrayList;
        if (interfaceC30057d instanceof C24482a) {
            c24482a = (C24482a) interfaceC30057d;
            int i13 = c24482a.f95513z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24482a.f95513z = i13 - Integer.MIN_VALUE;
            } else {
                c24482a = new C24482a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c24482a = new C24482a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c24482a.f95511x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24482a.f95513z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                C12100f c12100f = (C12100f) this.f812x;
                c24482a.f95510w = this;
                c24482a.f95513z = 1;
                if (c12100f.mo33429f(c24482a) == enumC31071a) {
                    return enumC31071a;
                }
                c0237p = this;
                arrayList = (ArrayList) ((C12100f) c0237p.f812x).mo33424a();
                if (!arrayList.isEmpty()) {
                    for (Object obj2 : arrayList) {
                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                        c0237p.m679J((String) obj2);
                    }
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                c0237p = this;
                message = e.getMessage();
                if (message != null) {
                    ((InterfaceC14544a) c0237p.f813y).warn("Event storage file not found: ".concat(message));
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0237p = c24482a.f95510w;
            try {
                AbstractC34132o.m107864I(obj);
                arrayList = (ArrayList) ((C12100f) c0237p.f812x).mo33424a();
                if (!arrayList.isEmpty()) {
                    while (r5.hasNext()) {
                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                        c0237p.m679J((String) obj2);
                    }
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                message = e.getMessage();
                if (message != null) {
                    ((InterfaceC14544a) c0237p.f813y).warn("Event storage file not found: ".concat(message));
                }
            }
        }
        return C23454a0.f92919a;
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: k */
    public void mo705k(int i13, Object obj) {
        C0020f0 c0020f0 = (C0020f0) this.f812x;
        c0020f0.m26a(5);
        c0020f0.m26a(i13);
        ((C0047q0) this.f813y).m98a(obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: l */
    public void mo706l(Object obj) {
        ((C0020f0) this.f812x).m26a(1);
        ((C0047q0) this.f813y).m98a(obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: m */
    public void mo707m() {
        ((C0020f0) this.f812x).m26a(8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:48|49|120|50|(2:114|52)(1:56)|57|(5:112|60|(5:129|62|118|63|132)(1:131)|130|58)|128|68|124|69|70|108|71|72) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:114|52) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:112|60|(5:129|62|118|63|132)(1:131)|130|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:129|62|118|63|132) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:46|(15:48|49|120|50|(2:114|52)(1:56)|57|(5:112|60|(5:129|62|118|63|132)(1:131)|130|58)|128|68|124|69|70|108|71|72)(1:79)|126|80|(5:83|(4:86|(3:135|88|138)(1:137)|136|84)|134|89|81)|133|(1:91)|94|95) */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r0 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0129, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0141, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0147, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a8 -> B:39:0x00ab). Please report as a decompilation issue!!! */
    @Override // lk.InterfaceC24484c
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo708n(q83.InterfaceC30057d r21) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a3.C0237p.mo708n(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    public C30560d m709o() {
        Integer num = (Integer) this.f812x;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f813y) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((C30559c) this.f814z) != null) {
            return new C30560d(num.intValue(), ((Integer) this.f813y).intValue(), (C30559c) this.f814z);
        }
        throw new GeneralSecurityException("variant not set");
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: p */
    public void mo710p() {
        ((C0020f0) this.f812x).m26a(0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // pf.InterfaceC29142t
    /* JADX INFO: renamed from: q */
    public AbstractC29140r mo711q(C4560o c4560o) {
        C3217l c3217l;
        AbstractC29140r abstractC29140r;
        C23470p c23470p = (C23470p) this.f813y;
        C23470p c23470p2 = (C23470p) this.f812x;
        if (((AbstractC29140r) c23470p2.getValue()) != null || ((AbstractC29140r) c23470p.getValue()) != null) {
            Set set = (Set) ((C23470p) this.f814z).getValue();
            if ((set instanceof Collection) && set.isEmpty()) {
                c3217l = c4560o.f18368a;
                if (AbstractC22676k.m65745e(c3217l, C3217l.f12584d)) {
                    abstractC29140r = (AbstractC29140r) c23470p2.getValue();
                } else if (AbstractC22676k.m65745e(c3217l, C3217l.f12583c)) {
                    abstractC29140r = (AbstractC29140r) c23470p.getValue();
                } else {
                    abstractC29140r = null;
                }
                if (abstractC29140r != null) {
                    return abstractC29140r;
                }
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((C29137o) it.next()).m88550a(c4560o)) {
                    }
                }
                c3217l = c4560o.f18368a;
                if (AbstractC22676k.m65745e(c3217l, C3217l.f12584d)) {
                    abstractC29140r = (AbstractC29140r) c23470p2.getValue();
                } else if (AbstractC22676k.m65745e(c3217l, C3217l.f12583c)) {
                    abstractC29140r = (AbstractC29140r) c23470p.getValue();
                } else {
                    abstractC29140r = null;
                }
                if (abstractC29140r != null) {
                    return abstractC29140r;
                }
            }
        }
        return C29138p.f117931a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r4v3, types: [lb3.v0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [lb3.u0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [lb3.v0] */
    /* JADX INFO: renamed from: r */
    public AbstractC23763c0 m712r(C38124p c38124p, C22309a c22309a, AbstractC23763c0 abstractC23763c0) {
        C38124p c38124p2;
        C23784k0 c23784k0M56329a0;
        InterfaceC23796q0 interfaceC23796q0Mo60496e;
        ?? M74093D1;
        boolean z4;
        ?? c23806v0;
        AbstractC23804u0 abstractC23804u0M60605k;
        InterfaceC31117e interfaceC31117eM92214b;
        EnumC23776g1 variance;
        C41113q c41113q = (C41113q) this.f812x;
        C18295a c18295a = (C18295a) c41113q.f177224x;
        boolean z13 = false;
        if (abstractC23763c0 == null || (c23784k0M56329a0 = abstractC23763c0.mo69843Y()) == null) {
            c38124p2 = c38124p;
            c23784k0M56329a0 = AbstractC20301a.m56329a0(new C18297c(c41113q, c38124p2, false));
        } else {
            c38124p2 = c38124p;
        }
        C23784k0 c23784k0 = c23784k0M56329a0;
        InterfaceC25374c interfaceC25374cM122107c = c38124p2.m122107c();
        C21510f0 c21510f0 = null;
        if (interfaceC25374cM122107c == null) {
            c38124p.m122108d();
            throw null;
        }
        boolean z14 = true;
        if (interfaceC25374cM122107c instanceof C38122n) {
            C38122n c38122n = (C38122n) interfaceC25374cM122107c;
            C35847e c35847eM122102c = c38122n.m122102c();
            if (c35847eM122102c == null) {
                throw new AssertionError("Class type should have a FQ name: " + interfaceC25374cM122107c);
            }
            if (c22309a.m64113f() && c35847eM122102c.equals(AbstractC22312d.f87080a)) {
                C27740l c27740l = c18295a.f71238p;
                C21565a c21565a = c27740l.f111816c;
                InterfaceC21493z property = C27740l.f111813e[0];
                c21565a.getClass();
                AbstractC22676k.m65750j(property, "property");
                C35850h c35850hM113814e = C35850h.m113814e(AbstractC32350a.m100695b(property.getName()));
                InterfaceC31126h contributedClassifier = ((InterfaceC22712o) c27740l.f111815b.getValue()).getContributedClassifier(c35850hM113814e, EnumC40212c.f173638x);
                interfaceC31117eM92214b = contributedClassifier instanceof InterfaceC31117e ? (InterfaceC31117e) contributedClassifier : null;
                if (interfaceC31117eM92214b == null) {
                    interfaceC31117eM92214b = c27740l.f111814a.m133473t(new C35845c(AbstractC27742n.f111884i, c35850hM113814e), AbstractC37056f.m118958J(1));
                }
            } else {
                interfaceC31117eM92214b = C30081e.m92214b(c35847eM122102c, c18295a.f71237o.mo78661c());
                if (interfaceC31117eM92214b == null) {
                    interfaceC31117eM92214b = null;
                } else {
                    String str = C30080d.f122759a;
                    if (C30080d.f122769k.containsKey(AbstractC39363f.m125524f(interfaceC31117eM92214b))) {
                        if (c22309a.m64110c() == EnumC22310b.f87073y || c22309a.m64111d() == EnumC23761b1.f94123w) {
                            interfaceC31117eM92214b = C30081e.m92213a(interfaceC31117eM92214b);
                        } else if (AbstractC32416g.m101137F((InterfaceC25376e) AbstractC25265s.m74114R0(c38124p2.m122110f()))) {
                            C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31117eM92214b);
                            String str2 = C30080d.f122759a;
                            C35847e c35847eM92212h = C30080d.m92212h(c35848fM125524f);
                            if (c35847eM92212h == null) {
                                throw new IllegalArgumentException("Given class " + interfaceC31117eM92214b + " is not a read-only collection");
                            }
                            List parameters = AbstractC4393e.m13807e(interfaceC31117eM92214b).m83822j(c35847eM92212h).mo60496e().getParameters();
                            AbstractC22676k.m65749i(parameters, "getParameters(...)");
                            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) AbstractC25265s.m74114R0(parameters);
                            if (interfaceC31165x0 != null && (variance = interfaceC31165x0.getVariance()) != null && variance != EnumC23776g1.OUT_VARIANCE) {
                                interfaceC31117eM92214b = C30081e.m92213a(interfaceC31117eM92214b);
                            }
                        }
                    }
                }
            }
            if (interfaceC31117eM92214b == null) {
                C3632c c3632c = (C3632c) c18295a.f71233k.f3422w;
                if (c3632c == null) {
                    AbstractC22676k.m65757q("resolver");
                    throw null;
                }
                interfaceC31117eM92214b = c3632c.m11160I(c38122n);
            }
            if (interfaceC31117eM92214b == null || (interfaceC23796q0Mo60496e = interfaceC31117eM92214b.mo60496e()) == null) {
                c38124p2.m122108d();
                throw null;
            }
        } else {
            if (!(interfaceC25374cM122107c instanceof C38108b0)) {
                throw new IllegalStateException("Unknown classifier kind: " + interfaceC25374cM122107c);
            }
            InterfaceC31165x0 interfaceC31165x0Mo52687a = ((InterfaceC18300f) this.f813y).mo52687a((C38108b0) interfaceC25374cM122107c);
            interfaceC23796q0Mo60496e = interfaceC31165x0Mo52687a != null ? interfaceC31165x0Mo52687a.mo60496e() : null;
        }
        if (interfaceC23796q0Mo60496e == null) {
            return null;
        }
        boolean z15 = (c22309a.m64110c() == EnumC22310b.f87073y || c22309a.m64113f() || c22309a.m64111d() == EnumC23761b1.f94123w) ? false : true;
        if (AbstractC22676k.m65745e(abstractC23763c0 != null ? abstractC23763c0.mo69844i0() : null, interfaceC23796q0Mo60496e) && !c38124p2.m122111g() && z15) {
            return abstractC23763c0.mo64125r0(true);
        }
        if (!c38124p2.m122111g()) {
            if (c38124p2.m122110f().isEmpty()) {
                List parameters2 = interfaceC23796q0Mo60496e.getParameters();
                AbstractC22676k.m65749i(parameters2, "getParameters(...)");
                if (parameters2.isEmpty()) {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
        }
        List parameters3 = interfaceC23796q0Mo60496e.getParameters();
        AbstractC22676k.m65749i(parameters3, "getParameters(...)");
        if (z14) {
            List<InterfaceC31165x0> list = parameters3;
            M74093D1 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (InterfaceC31165x0 interfaceC31165x1 : list) {
                if (AbstractC20301a.m56310I(interfaceC31165x1, null, c22309a.m64112e())) {
                    abstractC23804u0M60605k = AbstractC23767d1.m69855k(interfaceC31165x1, c22309a);
                } else {
                    InterfaceC23796q0 interfaceC23796q0 = interfaceC23796q0Mo60496e;
                    interfaceC23796q0Mo60496e = interfaceC23796q0;
                    abstractC23804u0M60605k = C21567b.m60605k(interfaceC31165x1, c22309a.m64115h(c38124p.m122111g()), (C5101l0) this.f814z, new C23813z(c18295a.f71223a, new C22311c(this, interfaceC31165x1, c22309a, interfaceC23796q0, c38124p2)));
                }
                M74093D1.add(abstractC23804u0M60605k);
                c38124p2 = c38124p;
            }
        } else if (parameters3.size() != c38124p.m122110f().size()) {
            List<InterfaceC31165x0> list2 = parameters3;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (InterfaceC31165x0 interfaceC31165x2 : list2) {
                EnumC26554k enumC26554k = EnumC26554k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                String strM113817b = interfaceC31165x2.getName().m113817b();
                AbstractC22676k.m65749i(strM113817b, "asString(...)");
                arrayList.add(new C23806v0(C26555l.m78682c(enumC26554k, strM113817b)));
            }
            M74093D1 = AbstractC25265s.m74093D1(arrayList);
        } else {
            C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(c38124p.m122110f());
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
            Iterator it = c25263qM74105J1.iterator();
            while (true) {
                C25241d0 c25241d0 = (C25241d0) it;
                if (!c25241d0.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                int i13 = c25239c0.f99117a;
                InterfaceC25376e interfaceC25376e = (InterfaceC25376e) c25239c0.f99118b;
                parameters3.size();
                InterfaceC31165x0 interfaceC31165x3 = (InterfaceC31165x0) parameters3.get(i13);
                EnumC23761b1 enumC23761b1 = EnumC23761b1.f94124x;
                C22309a c22309aM113400W = AbstractC35785b.m113400W(enumC23761b1, z13, c21510f0, 7);
                AbstractC22676k.m65747g(interfaceC31165x3);
                if (interfaceC25376e instanceof C38112d0) {
                    C38112d0 c38112d0 = (C38112d0) interfaceC25376e;
                    AbstractC38106a0 abstractC38106a0M122097c = c38112d0.m122097c();
                    EnumC23776g1 enumC23776g1 = c38112d0.m122098d() ? EnumC23776g1.OUT_VARIANCE : EnumC23776g1.IN_VARIANCE;
                    if (abstractC38106a0M122097c == null || !(interfaceC31165x3.getVariance() == EnumC23776g1.INVARIANT || enumC23776g1 == interfaceC31165x3.getVariance())) {
                        z4 = false;
                        c23806v0 = AbstractC23767d1.m69855k(interfaceC31165x3, c22309aM113400W);
                    } else {
                        InterfaceC32300b interfaceC32300bM101172C = AbstractC32417h.m101172C(c41113q, c38112d0);
                        z4 = false;
                        AbstractC23811y abstractC23811yM695Z = m695Z(abstractC38106a0M122097c, AbstractC35785b.m113400W(enumC23761b1, false, null, 7));
                        if (interfaceC32300bM101172C != null) {
                            ArrayList arrayListM74127e1 = AbstractC25265s.m74127e1(abstractC23811yM695Z.getAnnotations(), interfaceC32300bM101172C);
                            abstractC23811yM695Z = AbstractC20301a.m56320S(abstractC23811yM695Z, arrayListM74127e1.isEmpty() ? C32305g.f133684a : new C32308j(arrayListM74127e1, 0 == true ? 1 : 0));
                        }
                        c23806v0 = AbstractC20301a.m56350r(abstractC23811yM695Z, enumC23776g1, interfaceC31165x3);
                    }
                } else {
                    z4 = z13;
                    c23806v0 = new C23806v0(m695Z(interfaceC25376e, c22309aM113400W), EnumC23776g1.INVARIANT);
                }
                arrayList2.add(c23806v0);
                z13 = z4;
                c21510f0 = null;
            }
            M74093D1 = AbstractC25265s.m74093D1(arrayList2);
        }
        return AbstractC23791o.m69890i(M74093D1, c23784k0, interfaceC23796q0Mo60496e, z15);
    }

    /* JADX INFO: renamed from: s */
    public boolean m713s(C0230n0 c0230n0) {
        return !(c0230n0.f759G == null) && (((C0220k2) ((C0928c) this.f812x).f3421x).contains(c0230n0) || ((C0220k2) ((C0928c) this.f813y).f3421x).contains(c0230n0));
    }

    @Override // p304lh.InterfaceC24066e
    public void shutdown() {
        ((ConnectivityManager) this.f812x).unregisterNetworkCallback((C20101b) this.f814z);
    }

    @Override // p306ll.InterfaceC24498a
    /* JADX INFO: renamed from: t */
    public InterfaceC40801z mo714t(InterfaceC40801z interfaceC40801z, C37330h c37330h) {
        Drawable drawable = (Drawable) interfaceC40801z.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C3143v) this.f813y).mo714t(C15938c.m44994b((InterfaceC0955b) this.f812x, ((BitmapDrawable) drawable).getBitmap()), c37330h);
        }
        if (drawable instanceof C22553b) {
            return ((C24500c) this.f814z).mo714t(interfaceC40801z, c37330h);
        }
        return null;
    }

    public String toString() {
        switch (this.f811w) {
            case 13:
                return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.f812x) + ", body=" + ((C38445a) this.f813y) + ", headers=" + ((LinkedHashMap) this.f814z) + '}';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public float m715v(AbstractC18061c abstractC18061c) {
        HashMap map = (HashMap) this.f812x;
        HashMap map2 = (HashMap) this.f813y;
        if (!(abstractC18061c instanceof C18066h)) {
            if (abstractC18061c instanceof C18063e) {
                return ((C18063e) abstractC18061c).mo51907d();
            }
            return 0.0f;
        }
        String strM51906c = ((C18066h) abstractC18061c).m51906c();
        if (map2.containsKey(strM51906c)) {
            return ((InterfaceC21304d) map2.get(strM51906c)).value();
        }
        if (map.containsKey(strM51906c)) {
            return ((Integer) map.get(strM51906c)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC17915v m716w() {
        return ((C22128b) this.f814z).f85851w.f85849c;
    }

    /* JADX INFO: renamed from: x */
    public File m717x() {
        File file = new File(((Context) this.f812x).getCacheDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "itbl_inapp.json");
    }

    /* JADX INFO: renamed from: y */
    public synchronized C5339j1 m718y(String str) {
        return (C5339j1) ((Map) this.f813y).get(str);
    }

    /* JADX INFO: renamed from: z */
    public synchronized ArrayList m719z() {
        return new ArrayList(((Map) this.f813y).values());
    }

    public /* synthetic */ C0237p(Object obj, Object obj2, Object obj3, int i13) {
        this.f811w = i13;
        this.f812x = obj;
        this.f813y = obj2;
        this.f814z = obj3;
    }

    public C0237p(File file, String fileNameWithoutExtension, InterfaceC14544a interfaceC14544a) {
        this.f811w = 29;
        AbstractC22676k.m65750j(fileNameWithoutExtension, "fileNameWithoutExtension");
        this.f812x = interfaceC14544a;
        this.f813y = new Properties();
        this.f814z = new File(file, fileNameWithoutExtension.concat(".properties"));
    }

    public C0237p(List list) {
        this.f811w = 21;
        this.f812x = list;
        this.f813y = AbstractC25247g0.m73990Y(new C23465k("AssociateSoftwareToken", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ChangePassword", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("CompleteWebAuthnRegistration", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ConfirmDevice", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ConfirmForgotPassword", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ConfirmSignUp", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("DeleteUser", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("DeleteUserAttributes", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("DeleteWebAuthnCredential", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ForgetDevice", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ForgotPassword", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GetDevice", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GetTokensFromRefreshToken", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GetUser", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GetUserAttributeVerificationCode", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GetUserAuthFactors", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("GlobalSignOut", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("InitiateAuth", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ListDevices", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ListWebAuthnCredentials", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("ResendConfirmationCode", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("RespondToAuthChallenge", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("RevokeToken", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("SetUserMFAPreference", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("SetUserSettings", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("SignUp", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("StartWebAuthnRegistration", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("UpdateAuthEventFeedback", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("UpdateDeviceStatus", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("UpdateUserAttributes", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("VerifySoftwareToken", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))), new C23465k("VerifyUserAttribute", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))));
        this.f814z = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(31, null));
    }

    public C0237p(C12100f c12100f, InterfaceC14544a logger, C15903d c15903d) {
        this.f811w = 18;
        AbstractC22676k.m65750j(logger, "logger");
        this.f812x = c12100f;
        this.f813y = logger;
        this.f814z = c15903d;
    }

    public C0237p(C26669a c26669a, C38266c scope, C34911a c34911a) {
        this.f811w = 28;
        AbstractC22676k.m65750j(scope, "scope");
        this.f812x = c26669a;
        this.f813y = scope;
        this.f814z = c34911a;
    }

    public C0237p(Context context) {
        this.f811w = 3;
        this.f813y = Collections.synchronizedMap(new LinkedHashMap());
        HandlerThread handlerThread = new HandlerThread("FileOperationThread");
        this.f812x = context;
        handlerThread.start();
        this.f814z = new HandlerC5361p0(this, handlerThread.getLooper());
        try {
            File file = new File(context.getFilesDir(), "com.iterable.sdk");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "IterableInAppFileStorage");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, "itbl_inapp.json");
            if (file3.exists()) {
                m674E(new JSONObject(AbstractC15751g.m44436P(file3)));
            } else if (m717x().exists()) {
                m674E(new JSONObject(AbstractC15751g.m44436P(m717x())));
            }
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableInAppFileStorage", "Error while loading in-app messages from file", e5);
        }
    }

    public C0237p(C41113q c41113q, InterfaceC18300f typeParameterResolver) {
        this.f811w = 16;
        AbstractC22676k.m65750j(typeParameterResolver, "typeParameterResolver");
        this.f812x = c41113q;
        this.f813y = typeParameterResolver;
        this.f814z = new C5101l0(new C21567b(6));
    }

    public C0237p(View view) {
        this.f811w = 26;
        this.f812x = view;
        this.f813y = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C0222l0(this, 17));
        this.f814z = new C0929d(view);
    }

    public C0237p(C22128b c22128b) {
        this.f811w = 15;
        this.f814z = c22128b;
        this.f812x = new C0929d(this);
    }

    public C0237p(ConnectivityManager connectivityManager, ComponentCallbacks2C30361g componentCallbacks2C30361g) {
        this.f811w = 17;
        this.f812x = connectivityManager;
        this.f813y = componentCallbacks2C30361g;
        C20101b c20101b = new C20101b(this, 1);
        this.f814z = c20101b;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c20101b);
    }

    public C0237p(C25017f c25017f) {
        this.f811w = 20;
        this.f812x = new ArrayList();
        this.f813y = new C26246b();
        this.f814z = c25017f;
    }

    public C0237p(C20501v c20501v, C20353h7 c20353h7, C20269c c20269c) {
        this.f811w = 9;
        this.f812x = c20501v;
        this.f813y = c20353h7;
        this.f814z = AbstractC37056f.m119001y(c20269c, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0237p(C0237p c0237p) {
        this((C20501v) c0237p.f812x, (C20353h7) c0237p.f813y, (C20269c) c0237p.f814z);
        this.f811w = 9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0237p(int i13) {
        this(new C20501v(), new C20353h7(), (C20269c) null);
        this.f811w = i13;
        final int i14 = 1;
        final int i15 = 0;
        switch (i13) {
            case 1:
                this.f812x = new LinkedHashSet();
                this.f813y = new LinkedHashMap();
                this.f814z = AbstractC39397a.f169546a;
                break;
            case 7:
                List list = Collections.EMPTY_LIST;
                this.f812x = list;
                this.f813y = list;
                break;
            case 8:
                this.f814z = new ArrayList();
                break;
            case 9:
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                long[] jArr = AbstractC0015d1.f36a;
                this.f812x = new C0057v0();
                break;
            case 24:
                this.f812x = new C0005a0(16);
                long[] jArr2 = AbstractC0015d1.f36a;
                this.f813y = new C0057v0();
                this.f814z = new C21567b(23);
                break;
            case 25:
                InterfaceC35967n.f153143a.getClass();
                final C35971r provider = C35966m.f153142b;
                AbstractC22676k.m65750j(provider, "provider");
                this.f812x = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: pf.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                C3217l c3217l = C3217l.f12584d;
                                InterfaceC35965l interfaceC35965l = provider;
                                C29139q c29139qM108233s = AbstractC34235f.m108233s(interfaceC35965l, c3217l);
                                return c29139qM108233s == null ? AbstractC34235f.m108232r(interfaceC35965l, c3217l) : c29139qM108233s;
                            case 1:
                                C3217l c3217l2 = C3217l.f12583c;
                                InterfaceC35965l interfaceC35965l2 = provider;
                                C29139q c29139qM108233s2 = AbstractC34235f.m108233s(interfaceC35965l2, c3217l2);
                                return c29139qM108233s2 == null ? AbstractC34235f.m108232r(interfaceC35965l2, c3217l2) : c29139qM108233s2;
                            default:
                                return AbstractC34235f.m108231q(provider);
                        }
                    }
                });
                this.f813y = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: pf.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                C3217l c3217l = C3217l.f12584d;
                                InterfaceC35965l interfaceC35965l = provider;
                                C29139q c29139qM108233s = AbstractC34235f.m108233s(interfaceC35965l, c3217l);
                                return c29139qM108233s == null ? AbstractC34235f.m108232r(interfaceC35965l, c3217l) : c29139qM108233s;
                            case 1:
                                C3217l c3217l2 = C3217l.f12583c;
                                InterfaceC35965l interfaceC35965l2 = provider;
                                C29139q c29139qM108233s2 = AbstractC34235f.m108233s(interfaceC35965l2, c3217l2);
                                return c29139qM108233s2 == null ? AbstractC34235f.m108232r(interfaceC35965l2, c3217l2) : c29139qM108233s2;
                            default:
                                return AbstractC34235f.m108231q(provider);
                        }
                    }
                });
                final int i16 = 2;
                this.f814z = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: pf.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                C3217l c3217l = C3217l.f12584d;
                                InterfaceC35965l interfaceC35965l = provider;
                                C29139q c29139qM108233s = AbstractC34235f.m108233s(interfaceC35965l, c3217l);
                                return c29139qM108233s == null ? AbstractC34235f.m108232r(interfaceC35965l, c3217l) : c29139qM108233s;
                            case 1:
                                C3217l c3217l2 = C3217l.f12583c;
                                InterfaceC35965l interfaceC35965l2 = provider;
                                C29139q c29139qM108233s2 = AbstractC34235f.m108233s(interfaceC35965l2, c3217l2);
                                return c29139qM108233s2 == null ? AbstractC34235f.m108232r(interfaceC35965l2, c3217l2) : c29139qM108233s2;
                            default:
                                return AbstractC34235f.m108231q(provider);
                        }
                    }
                });
                break;
            default:
                this.f812x = new C0928c(1, (byte) 0);
                this.f813y = new C0928c(1, (byte) 0);
                this.f814z = new C0928c(1, (byte) 0);
                break;
        }
    }

    public C0237p(C41113q c41113q, C20363j c20363j, C16948c c16948c, Set set) {
        this.f811w = 6;
        this.f812x = c20363j;
        this.f813y = c41113q;
        this.f814z = c16948c;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m677H(str, 0, str.length(), 1, true, new C11856j0(str, 4, false));
        }
    }

    public C0237p(Object obj) {
        this.f811w = 23;
        this.f812x = new C0020f0();
        this.f813y = new C0047q0();
        this.f814z = obj;
    }

    public C0237p(String str, String str2) {
        this.f811w = 4;
        this.f812x = null;
        this.f813y = str;
        this.f814z = str2;
    }
}
