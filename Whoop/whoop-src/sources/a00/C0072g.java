package a00;

import a30.C0332w0;
import aa3.InterfaceC0654t0;
import ab3.C0709a;
import ab3.C0714f;
import ab3.C0716h;
import ab3.C0717i;
import ab3.C0726r;
import ab3.C0728t;
import ab3.C0733y;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.C1075i;
import android.support.v4.media.session.HandlerC1074h;
import android.support.v4.media.session.InterfaceC1076j;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.C1591h2;
import androidx.room.AbstractC1772c1;
import androidx.room.C1774d;
import androidx.viewpager2.widget.ViewPager2;
import bg.C3215j;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import ca3.C4384k;
import ca3.InterfaceC4385l;
import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.C5099k0;
import com.iterable.iterableapi.RunnableC5320e2;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import com.whoop.android.R;
import d00.C11433l;
import e10.C12553k;
import e10.C12559n;
import e10.C12568r0;
import e10.C12572t0;
import e10.C12575v;
import e10.C12577w;
import e10.InterfaceC12555l;
import e10.InterfaceC12578x;
import e93.AbstractC12889b;
import ea3.C12933d;
import ea3.C12934e;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import gm.C15990r;
import gs.AbstractC16127d;
import gs.C16124b0;
import gs.C16132f0;
import gs.C16133g;
import gs.C16139j;
import gs.C16141k;
import gs.C16142k0;
import gs.C16145n;
import gs.C16148q;
import gs.C16151t;
import gs.C16154w;
import h02.C16587n0;
import hc3.C17171d;
import im.InterfaceC18653b;
import io.sentry.android.core.EnumC20171z;
import io.seon.androidsdk.service.C20656d0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import jb3.C21548h;
import k83.InterfaceC22297a;
import kb3.C22340i;
import kb3.C22342k;
import l20.C23236a;
import l83.C23468n;
import lb3.AbstractC23811y;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mr.AbstractC25906l;
import mr.C25901g;
import mr.C25909o;
import o10.C27394g;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import om.InterfaceC28023b;
import p002a0.C0022g;
import p002a0.C0062y;
import p075ct.C11105a;
import p076d.AbstractC11290h1;
import p076d.AbstractC11322x0;
import p076d.C11301n;
import p076d.C11317v;
import p087db.C11858k0;
import p098dt.AbstractC12350b;
import p141f9.C14260b;
import p184h5.AbstractC16901p0;
import p190hc.C17146i;
import p211i5.C18091d;
import p283kl.C22557f;
import p299l9.C23501g1;
import p344nm.InterfaceC26822d;
import p442qy.C30765d;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p599wz.C37718g0;
import p599wz.C37737m1;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p690zr.AbstractC41047q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import qa3.C30172x;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import r93.InterfaceC31163w0;
import ro.C31624i;
import s83.AbstractC32269c;
import s93.InterfaceC32300b;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33414l;
import u00.C34377e;
import u93.AbstractC34711x0;
import u93.C34673e0;
import ub3.AbstractC34756j;
import v00.C35459c0;
import v00.C35463e0;
import v00.C35465f0;
import v00.C35469h0;
import v00.InterfaceC35471i0;
import va3.C35845c;
import va3.C35850h;
import y00.AbstractC38794c0;
import y00.AbstractC38963t7;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38793c;
import y00.C38809d5;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38901n;
import y00.C38977v3;
import y00.C38987w4;
import y00.C38991x;
import y00.C39000y;
import y00.EnumC38828f4;
import y00.EnumC38922p2;
import y00.EnumC38941r3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: a00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C0072g implements InterfaceC0654t0, InterfaceC18653b, InterfaceC27771n, InterfaceC27772o {

    /* JADX INFO: renamed from: F */
    public static C0072g f219F;

    /* JADX INFO: renamed from: G */
    public static C0072g f220G;

    /* JADX INFO: renamed from: E */
    public Object f221E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f222w;

    /* JADX INFO: renamed from: x */
    public Object f223x;

    /* JADX INFO: renamed from: y */
    public Object f224y;

    /* JADX INFO: renamed from: z */
    public Object f225z;

    public /* synthetic */ C0072g(int i13, boolean z4) {
        this.f222w = i13;
    }

    /* JADX INFO: renamed from: o */
    public static C0072g m163o() {
        if (f220G == null) {
            f220G = new C0072g(25);
        }
        return f220G;
    }

    /* JADX INFO: renamed from: z */
    public static void m164z(long j7, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j7) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            map.remove(arrayList.get(i13));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m165A(C25901g c25901g) {
        synchronized (this.f223x) {
            try {
                if (m200r(c25901g)) {
                    C25909o c25909o = (C25909o) this.f225z;
                    if (c25909o.f102279c) {
                        c25909o.f102279c = false;
                        m166B(c25909o);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m166B(C25909o c25909o) {
        Handler handler = (Handler) this.f224y;
        int i13 = c25909o.f102278b;
        if (i13 == -2) {
            return;
        }
        if (i13 <= 0) {
            i13 = i13 == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(c25909o);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c25909o), i13);
    }

    /* JADX INFO: renamed from: C */
    public C14260b m167C(List list) {
        C14260b c14260b;
        HashMap map = (HashMap) this.f225z;
        ArrayList arrayListM187e = m187e(list);
        if (arrayListM187e.size() < 2) {
            return (C14260b) AbstractC41047q.m133278h(null, arrayListM187e);
        }
        Collections.sort(arrayListM187e, new C11858k0(2));
        ArrayList arrayList = new ArrayList();
        int i13 = ((C14260b) arrayListM187e.get(0)).f52060c;
        for (int i14 = 0; i14 < arrayListM187e.size(); i14++) {
            C14260b c14260b2 = (C14260b) arrayListM187e.get(i14);
            if (i13 != c14260b2.f52060c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (C14260b) arrayListM187e.get(0);
            }
            arrayList.add(new Pair(c14260b2.f52059b, Integer.valueOf(c14260b2.f52061d)));
        }
        C14260b c14260b3 = (C14260b) map.get(arrayList);
        if (c14260b3 != null) {
            return c14260b3;
        }
        List listSubList = arrayListM187e.subList(0, arrayList.size());
        int i15 = 0;
        for (int i16 = 0; i16 < listSubList.size(); i16++) {
            i15 += ((C14260b) listSubList.get(i16)).f52061d;
        }
        int iNextInt = ((Random) this.f221E).nextInt(i15);
        int i17 = 0;
        for (int i18 = 0; i18 < listSubList.size(); i18++) {
            c14260b = (C14260b) listSubList.get(i18);
            i17 += c14260b.f52061d;
            if (iNextInt < i17) {
                map.put(arrayList, c14260b);
                return c14260b;
            }
        }
        c14260b = (C14260b) AbstractC41047q.m133279i(listSubList);
        map.put(arrayList, c14260b);
        return c14260b;
    }

    /* JADX INFO: renamed from: D */
    public void m168D(C31624i c31624i) {
        this.f224y = c31624i;
    }

    /* JADX INFO: renamed from: E */
    public void m169E(AbstractC16127d abstractC16127d) {
        this.f221E = abstractC16127d;
    }

    /* JADX INFO: renamed from: F */
    public void m170F(C16124b0 c16124b0) {
        this.f225z = c16124b0;
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: G */
    public void mo171G(C35845c c35845c, C35850h c35850h) {
        ((ArrayList) this.f223x).add(new C0717i(c35845c, c35850h));
    }

    /* JADX INFO: renamed from: H */
    public void m172H(C31624i c31624i) {
        this.f225z = c31624i;
    }

    /* JADX INFO: renamed from: I */
    public void m173I(Integer num) {
        this.f221E = num;
    }

    /* JADX INFO: renamed from: J */
    public void m174J(String str) {
        this.f224y = str;
    }

    /* JADX INFO: renamed from: K */
    public void m175K(C16141k c16141k) {
        this.f223x = c16141k;
    }

    /* JADX INFO: renamed from: L */
    public void m176L(InterfaceC1076j interfaceC1076j, Handler handler) {
        synchronized (this.f223x) {
            try {
                this.f225z = new WeakReference(interfaceC1076j);
                HandlerC1074h handlerC1074h = (HandlerC1074h) this.f221E;
                HandlerC1074h handlerC1074h2 = null;
                if (handlerC1074h != null) {
                    handlerC1074h.removeCallbacksAndMessages(null);
                }
                if (interfaceC1076j != null && handler != null) {
                    handlerC1074h2 = new HandlerC1074h(this, handler.getLooper(), 0);
                }
                this.f221E = handlerC1074h2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m177M(C16124b0 c16124b0) {
        this.f223x = c16124b0;
    }

    /* JADX INFO: renamed from: N */
    public void m178N() {
        C25909o c25909o = (C25909o) this.f221E;
        if (c25909o != null) {
            this.f225z = c25909o;
            this.f221E = null;
            C25901g c25901g = (C25901g) c25909o.f102277a.get();
            if (c25901g == null) {
                this.f225z = null;
            } else {
                Handler handler = AbstractC25906l.f102245A;
                handler.sendMessage(handler.obtainMessage(0, c25901g.f102229a));
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public InterfaceC0080o m179O(InterfaceC12578x interfaceC12578x) {
        C30765d c30765d = (C30765d) this.f225z;
        if (interfaceC12578x instanceof C12559n) {
            return C0077l.f244a;
        }
        if (interfaceC12578x instanceof C12575v) {
            C12575v c12575v = (C12575v) interfaceC12578x;
            c30765d.m94512b("DefaultLinkConfirmationHandler: Failed to confirm payment", c12575v.f42944a);
            return new C0078m(c12575v.f42945b);
        }
        if (interfaceC12578x instanceof C12577w) {
            return C0079n.f246a;
        }
        if (interfaceC12578x != null) {
            throw new NoWhenBranchMatchedException();
        }
        c30765d.m94512b("DefaultLinkConfirmationHandler: Payment confirmation returned null", null);
        return new C0078m(AbstractC32128i.m100054h(R.string.stripe_something_went_wrong));
    }

    /* JADX INFO: renamed from: P */
    public void m180P() {
        int itemCount;
        C17146i c17146i = (C17146i) this.f224y;
        C17146i c17146i2 = (C17146i) this.f223x;
        ViewPager2 viewPager2 = (ViewPager2) this.f221E;
        int i13 = android.R.id.accessibilityActionPageLeft;
        AbstractC16901p0.m47580k(viewPager2, android.R.id.accessibilityActionPageLeft);
        AbstractC16901p0.m47577h(viewPager2, 0);
        AbstractC16901p0.m47580k(viewPager2, android.R.id.accessibilityActionPageRight);
        AbstractC16901p0.m47577h(viewPager2, 0);
        AbstractC16901p0.m47580k(viewPager2, android.R.id.accessibilityActionPageUp);
        AbstractC16901p0.m47577h(viewPager2, 0);
        AbstractC16901p0.m47580k(viewPager2, android.R.id.accessibilityActionPageDown);
        AbstractC16901p0.m47577h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getDisplayCount()) == 0 || !viewPager2.f7324R) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f7330z < itemCount - 1) {
                AbstractC16901p0.m47581l(viewPager2, new C18091d(android.R.id.accessibilityActionPageDown, (String) null), c17146i2);
            }
            if (viewPager2.f7330z > 0) {
                AbstractC16901p0.m47581l(viewPager2, new C18091d(android.R.id.accessibilityActionPageUp, (String) null), c17146i);
                return;
            }
            return;
        }
        boolean z4 = viewPager2.f7313G.getLayoutDirection() == 1;
        int i14 = z4 ? 16908360 : 16908361;
        if (z4) {
            i13 = 16908361;
        }
        if (viewPager2.f7330z < itemCount - 1) {
            AbstractC16901p0.m47581l(viewPager2, new C18091d(i14, (String) null), c17146i2);
        }
        if (viewPager2.f7330z > 0) {
            AbstractC16901p0.m47581l(viewPager2, new C18091d(i13, (String) null), c17146i);
        }
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: X */
    public void mo181X(C0714f c0714f) {
        ((ArrayList) this.f223x).add(new C0728t(new C0726r(c0714f)));
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: Y */
    public void mo182Y(Object obj) {
        ArrayList arrayList = (ArrayList) this.f223x;
        C5099k0 c5099k0 = (C5099k0) this.f224y;
        C35850h c35850h = (C35850h) this.f225z;
        Object objM1780c = C0716h.m1780c(obj, (C34673e0) c5099k0.f21441z);
        if (objM1780c == null) {
            objM1780c = AbstractC35148d.m111188s("Unsupported annotation argument: " + c35850h);
        }
        arrayList.add(objM1780c);
    }

    @Override // aa3.InterfaceC0654t0
    /* JADX INFO: renamed from: a */
    public ArrayList mo183a() {
        return (ArrayList) this.f224y;
    }

    @Override // aa3.InterfaceC0654t0
    /* JADX INFO: renamed from: b */
    public ArrayList mo184b() {
        return (ArrayList) this.f225z;
    }

    @Override // aa3.InterfaceC0654t0
    /* JADX INFO: renamed from: c */
    public ArrayList mo185c() {
        return (ArrayList) this.f223x;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList m186d() {
        Set setKeySet = ((LinkedHashMap) this.f223x).keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            InterfaceC31117e interfaceC31117eM194k = m194k((C35850h) it.next());
            if (interfaceC31117eM194k != null) {
                arrayList.add(interfaceC31117eM194k);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList m187e(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f223x;
        m164z(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f224y;
        m164z(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C14260b c14260b = (C14260b) list.get(i13);
            if (!map.containsKey(c14260b.f52059b) && !map2.containsKey(Integer.valueOf(c14260b.f52060c))) {
                arrayList.add(c14260b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public C16133g m188f() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15952b;
        C16141k c16141k = (C16141k) this.f223x;
        if (c16141k == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C31624i c31624i2 = (C31624i) this.f224y;
        if (c31624i2 == null || (c31624i = (C31624i) this.f225z) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c16141k.f61325a != ((C11105a) c31624i2.f130665x).f35302a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c16141k.f61326b != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (c16141k.mo42237a() && ((Integer) this.f221E) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C16141k) this.f223x).mo42237a() && ((Integer) this.f221E) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C16139j c16139j = ((C16141k) this.f223x).f61329e;
        if (c16139j == C16139j.f61303j) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c16139j == C16139j.f61302i) {
            c11105aM15952b = AbstractC5079a0.m15951a(((Integer) this.f221E).intValue());
        } else {
            if (c16139j != C16139j.f61301h) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((C16141k) this.f223x).f61329e);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(((Integer) this.f221E).intValue());
        }
        return new C16133g((C16141k) this.f223x, (C31624i) this.f224y, (C31624i) this.f225z, c11105aM15952b, (Integer) this.f221E);
    }

    /* JADX INFO: renamed from: g */
    public C16132f0 m189g() throws GeneralSecurityException {
        if (((C16124b0) this.f223x) == null) {
            this.f223x = C16124b0.f61250l;
        }
        if (((String) this.f224y) == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (((C16124b0) this.f225z) == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC16127d abstractC16127d = (AbstractC16127d) this.f221E;
        if (abstractC16127d == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC16127d.mo42237a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        C16124b0 c16124b0 = (C16124b0) this.f225z;
        AbstractC16127d abstractC16127d2 = (AbstractC16127d) this.f221E;
        if ((c16124b0.equals(C16124b0.f61243e) && (abstractC16127d2 instanceof C16148q)) || ((c16124b0.equals(C16124b0.f61245g) && (abstractC16127d2 instanceof C16154w)) || ((c16124b0.equals(C16124b0.f61244f) && (abstractC16127d2 instanceof C16142k0)) || ((c16124b0.equals(C16124b0.f61246h) && (abstractC16127d2 instanceof C16141k)) || ((c16124b0.equals(C16124b0.f61247i) && (abstractC16127d2 instanceof C16145n)) || (c16124b0.equals(C16124b0.f61248j) && (abstractC16127d2 instanceof C16151t))))))) {
            return new C16132f0((C16124b0) this.f223x, (String) this.f224y, (C16124b0) this.f225z, (AbstractC16127d) this.f221E);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + ((C16124b0) this.f225z).f61252b + " when new keys are picked according to " + ((AbstractC16127d) this.f221E) + ".");
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return new C0072g((Executor) ((InterfaceC22297a) this.f223x).get(), (InterfaceC26822d) ((InterfaceC22297a) this.f224y).get(), (C15990r) ((C15990r) this.f225z).get(), (InterfaceC28023b) ((InterfaceC22297a) this.f221E).get(), 23);
    }

    /* JADX INFO: renamed from: h */
    public boolean m190h(C25909o c25909o, int i13) {
        C25901g c25901g = (C25901g) c25909o.f102277a.get();
        if (c25901g == null) {
            return false;
        }
        ((Handler) this.f224y).removeCallbacksAndMessages(c25909o);
        Handler handler = AbstractC25906l.f102245A;
        handler.sendMessage(handler.obtainMessage(1, i13, 0, c25901g.f102229a));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r14 == r2) goto L45;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m191i(p599wz.InterfaceC37739n0 r11, a00.C0071f r12, p599wz.AbstractC37760u0 r13, s83.AbstractC32269c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a00.C0072g.m191i(wz.n0, a00.f, wz.u0, s83.c):java.lang.Object");
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: i0 */
    public InterfaceC27771n mo192i0(C35845c c35845c) {
        ArrayList arrayList = new ArrayList();
        return new C0072g(((C5099k0) this.f224y).m15988F(c35845c, InterfaceC31155s0.f128370q, arrayList), this, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public Object m193j(InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) {
        C0075j c0075j;
        C0072g c0072g;
        C0072g c0072g2;
        C0072g c0072g3;
        Object objM107888l;
        Throwable thM68037a;
        if (abstractC32269c instanceof C0075j) {
            c0075j = (C0075j) abstractC32269c;
            int i13 = c0075j.f235E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0075j.f235E = i13 - Integer.MIN_VALUE;
            } else {
                c0075j = new C0075j(this, abstractC32269c);
            }
        } else {
            c0075j = new C0075j(this, abstractC32269c);
        }
        Object objM35246b = c0075j.f238y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0075j.f235E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35246b);
            try {
                C12553k c12553k = (C12553k) interfaceC4339a.invoke();
                C12568r0 c12568r0 = (C12568r0) this.f221E;
                c0075j.f236w = this;
                c0075j.f237x = this;
                c0075j.f235E = 1;
                if (c12568r0.m35251g(c12553k, c0075j) != enumC31071a) {
                    c0072g2 = this;
                    c0072g3 = c0072g2;
                }
                return enumC31071a;
            } catch (Throwable th3) {
                th = th3;
                c0072g = this;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0072g2 = c0075j.f237x;
                c0072g = c0075j.f236w;
                try {
                    AbstractC34132o.m107864I(objM35246b);
                    objM107888l = c0072g2.m179O((InterfaceC12578x) objM35246b);
                } catch (Throwable th4) {
                    th = th4;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    return objM107888l;
                }
                ((C30765d) c0072g.f225z).m94512b("DefaultLinkConfirmationHandler: Failed to confirm payment", thM68037a);
                return new C0078m(AbstractC32128i.m100054h(R.string.stripe_something_went_wrong));
            }
            c0072g2 = c0075j.f237x;
            c0072g3 = c0075j.f236w;
            try {
                AbstractC34132o.m107864I(objM35246b);
            } catch (Throwable th5) {
                th = th5;
                c0072g = c0072g3;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        C12568r0 c12568r1 = (C12568r0) c0072g2.f221E;
        c0075j.f236w = c0072g3;
        c0075j.f237x = c0072g2;
        c0075j.f235E = 2;
        objM35246b = c12568r1.m35246b(c0075j);
        if (objM35246b != enumC31071a) {
            c0072g = c0072g3;
            objM107888l = c0072g2.m179O((InterfaceC12578x) objM35246b);
            thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a == null) {
                return objM107888l;
            }
            ((C30765d) c0072g.f225z).m94512b("DefaultLinkConfirmationHandler: Failed to confirm payment", thM68037a);
            return new C0078m(AbstractC32128i.m100054h(R.string.stripe_something_went_wrong));
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC31117e m194k(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return (InterfaceC31117e) ((C1591h2) this.f224y).invoke(name);
    }

    @Override // oa3.InterfaceC27771n, oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public void mo195l() {
        switch (this.f222w) {
            case 27:
                ((C25126d) this.f224y).mo195l();
                ((ArrayList) ((C0072g) this.f225z).f223x).add(new C0709a((InterfaceC32300b) AbstractC25265s.m74142p1((ArrayList) this.f221E)));
                break;
            default:
                C25126d c25126d = (C25126d) this.f221E;
                C35850h c35850h = (C35850h) this.f225z;
                ArrayList elements = (ArrayList) this.f223x;
                c25126d.getClass();
                AbstractC22676k.m65750j(elements, "elements");
                if (c35850h != null) {
                    InterfaceC31108b interfaceC31108bM9475C = AbstractC3269g.m9475C(c35850h, (InterfaceC31117e) c25126d.f98479E);
                    if (interfaceC31108bM9475C != null) {
                        HashMap map = (HashMap) c25126d.f98485y;
                        List listM109752b = AbstractC34756j.m109752b(elements);
                        AbstractC23811y type = ((AbstractC34711x0) interfaceC31108bM9475C).getType();
                        AbstractC22676k.m65749i(type, "getType(...)");
                        map.put(c35850h, new C0733y(listM109752b, type));
                        break;
                    } else if (((C5099k0) c25126d.f98486z).m15986D((C35845c) c25126d.f98480F) && AbstractC22676k.m65745e(c35850h.m113817b(), "value")) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : elements) {
                            if (obj instanceof C0709a) {
                                arrayList.add(obj);
                            }
                        }
                        List list = (List) c25126d.f98481G;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            list.add((InterfaceC32300b) ((C0709a) it.next()).f2696a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: m */
    public InterfaceC27772o mo196m(C35850h c35850h) {
        return ((C25126d) this.f223x).mo196m(c35850h);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: n */
    public void mo197n(C35850h c35850h, C0714f c0714f) {
        ((C25126d) this.f223x).mo197n(c35850h, c0714f);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: p */
    public void mo198p(C35850h c35850h, Object obj) {
        ((C25126d) this.f223x).mo198p(c35850h, obj);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: q */
    public void mo199q(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
        ((C25126d) this.f223x).mo199q(c35850h, c35845c, c35850h2);
    }

    /* JADX INFO: renamed from: r */
    public boolean m200r(C25901g c25901g) {
        C25909o c25909o = (C25909o) this.f225z;
        return (c25909o == null || c25901g == null || c25909o.f102277a.get() != c25901g) ? false : true;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: s */
    public InterfaceC27771n mo201s(C35845c c35845c, C35850h c35850h) {
        return ((C25126d) this.f223x).mo201s(c35845c, c35850h);
    }

    /* JADX INFO: renamed from: t */
    public boolean m202t() {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f223x;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC5320e2(this));
        AbstractC12350b.m34595p("IterableTaskStorage", "Database not initialized or is closed");
        return false;
    }

    public String toString() {
        switch (this.f222w) {
            case 15:
                try {
                    Locale locale = Locale.ENGLISH;
                    return ((String) this.f223x) + ";" + ((String) this.f224y) + ";" + ((C20656d0) this.f225z) + ";" + ((Long) this.f221E);
                } catch (Throwable unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m203u(InterfaceC31163w0 interfaceC31163w0) {
        if (((InterfaceC31163w0) this.f224y).equals(interfaceC31163w0)) {
            return true;
        }
        C0072g c0072g = (C0072g) this.f223x;
        return c0072g != null ? c0072g.m203u(interfaceC31163w0) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public C12553k m204v(AbstractC38794c0 selectedPaymentDetails, C11433l c11433l, String str, String str2, C35459c0 c35459c0) {
        String str3;
        boolean zM124359b;
        EnumC38941r3 enumC38941r3;
        C38793c c38793c;
        InterfaceC12555l c12572t0;
        C37718g0 c37718g0 = (C37718g0) this.f223x;
        boolean z4 = c37718g0.f161608H;
        InterfaceC38802c8 interfaceC38802c8 = c37718g0.f161636w;
        if (z4) {
            AbstractC22676k.m65750j(selectedPaymentDetails, "paymentDetails");
            if (selectedPaymentDetails instanceof C38991x) {
                List listMo124336p = interfaceC38802c8.mo124336p();
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                boolean zContains = listMo124336p.contains("us_bank_account");
                if (c37718g0.f161620T != EnumC38922p2.LinkCardBrand || zContains) {
                    str3 = "bank_account";
                }
            } else if (!(selectedPaymentDetails instanceof C38774a0) && !(selectedPaymentDetails instanceof C38784b0)) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "card";
        } else {
            C33623c0 c33623c1 = EnumC38828f4.f167088G;
            str3 = "link";
        }
        if (interfaceC38802c8 instanceof C38887l3) {
            zM124359b = ((C38887l3) interfaceC38802c8).m124359b(str3);
        } else {
            if (!(interfaceC38802c8 instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            zM124359b = true;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (zM124359b || c37718g0.f161633g0) {
            InterfaceC35471i0 interfaceC35471i0 = c37718g0.f161632f0;
            if (interfaceC35471i0 instanceof C35463e0) {
                enumC38941r3 = ((C35463e0) interfaceC35471i0).f151002w;
            } else {
                if (!(interfaceC35471i0 instanceof C35465f0) && !AbstractC22676k.m65745e(interfaceC35471i0, C35469h0.f151005w)) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC38941r3 = null;
            }
            if (enumC38941r3 == null) {
                enumC38941r3 = EnumC38941r3.LIMITED;
            }
        } else {
            enumC38941r3 = EnumC38941r3.UNSPECIFIED;
        }
        EnumC38941r3 enumC38941r4 = enumC38941r3;
        if (c37718g0.f161608H) {
            c12572t0 = new C27394g(selectedPaymentDetails.getId(), str3, str, str2, enumC38941r4);
        } else {
            String consumerSessionClientSecret = c11433l.f36652G;
            C38901n clientAttributionMetadata = c37718g0.f161635i0;
            AbstractC22676k.m65750j(selectedPaymentDetails, "selectedPaymentDetails");
            AbstractC22676k.m65750j(consumerSessionClientSecret, "consumerSessionClientSecret");
            AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
            C39000y c39000yMo124309b = selectedPaymentDetails.mo124309b();
            if (c39000yMo124309b != null) {
                String str4 = c39000yMo124309b.f167867x;
                String str5 = c39000yMo124309b.f167868y;
                String str6 = c39000yMo124309b.f167864F;
                String str7 = c39000yMo124309b.f167863E;
                String str8 = c39000yMo124309b.f167869z;
                CountryCode countryCode = c39000yMo124309b.f167865G;
                c38793c = new C38793c(str7, countryCode != null ? countryCode.getValue() : null, str4, str5, str6, str8);
            } else {
                c38793c = null;
            }
            String strMo124310f = selectedPaymentDetails.mo124310f();
            C39000y c39000yMo124309b2 = selectedPaymentDetails.mo124309b();
            C38977v3 c38977v3 = new C38977v3(c38793c, strMo124310f, c39000yMo124309b2 != null ? c39000yMo124309b2.f167866w : null, str2);
            String paymentDetailsId = selectedPaymentDetails.getId();
            C38977v3 c38977v4 = !c38977v3.equals(new C38977v3(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 15)) ? c38977v3 : null;
            Map mapM124385o = str != null ? AbstractC38963t7.m124385o("card", AbstractC31061c.m95645u("cvc", str)) : null;
            AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
            c12572t0 = new C12572t0(new C38809d5(EnumC38828f4.f167089H, null, null, new C38987w4(paymentDetailsId, consumerSessionClientSecret, mapM124385o), null, c38977v4, enumC38941r4, clientAttributionMetadata, 1522686), null, null, false, false, false);
        }
        return new C12553k(c12572t0, c35459c0);
    }

    /* JADX INFO: renamed from: w */
    public void m205w() {
    }

    /* JADX INFO: renamed from: x */
    public void m206x() {
    }

    /* JADX INFO: renamed from: y */
    public void m207y(C25901g c25901g) {
        synchronized (this.f223x) {
            try {
                if (m200r(c25901g)) {
                    C25909o c25909o = (C25909o) this.f225z;
                    if (!c25909o.f102279c) {
                        c25909o.f102279c = true;
                        ((Handler) this.f224y).removeCallbacksAndMessages(c25909o);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public C0072g(AbstractC11290h1 abstractC11290h1) {
        this.f222w = 17;
        for (int i13 = 0; i13 < abstractC11290h1.mo30507o(); i13++) {
            if (i13 == 0) {
                this.f224y = Base64.encodeToString(((AbstractC11322x0) abstractC11290h1.mo30505l(0)).f36277a, 0).trim();
            } else if (i13 == 1) {
                this.f225z = Boolean.valueOf(((C11301n) abstractC11290h1.mo30505l(1)).m30512l());
            } else if (i13 == 2) {
                C11317v c11317v = (C11317v) abstractC11290h1.mo30505l(2);
                c11317v.getClass();
                this.f223x = new BigInteger(c11317v.f36265a);
            } else if (i13 == 3) {
                try {
                    this.f221E = Base64.encodeToString(((AbstractC11322x0) abstractC11290h1.mo30505l(3)).f36277a, 0).trim();
                } catch (Exception unused) {
                }
            }
        }
    }

    public /* synthetic */ C0072g(Object obj, Serializable serializable, int i13) {
        this.f222w = i13;
        this.f223x = obj;
        this.f224y = serializable;
        this.f225z = null;
        this.f221E = null;
    }

    public /* synthetic */ C0072g(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f222w = i13;
        this.f223x = obj;
        this.f224y = obj2;
        this.f225z = obj3;
        this.f221E = obj4;
    }

    public C0072g(Context context, String str, InterfaceC30063j workContext) {
        this.f222w = 12;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f223x = context;
        this.f224y = str;
        this.f225z = workContext;
        this.f221E = AbstractC30060g.m92088H(new C16587n0(this, 1));
    }

    public C0072g(C37718g0 configuration, C35459c0 paymentMethodMetadata, C30765d logger, C12568r0 confirmationHandler) {
        this.f222w = 1;
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        this.f223x = configuration;
        this.f224y = paymentMethodMetadata;
        this.f225z = logger;
        this.f221E = confirmationHandler;
        confirmationHandler.m35247c(paymentMethodMetadata);
    }

    public C0072g(C33368c0 c33368c0, C0332w0 c0332w0, C33366b4 c33366b4, C17171d scope) {
        this.f222w = 26;
        AbstractC22676k.m65750j(scope, "scope");
        this.f223x = c33368c0;
        this.f224y = c0332w0;
        this.f225z = c33366b4;
        this.f221E = AbstractC1772c1.m5382S(this, "RingingStateObserver");
    }

    public C0072g(C23236a cvcRecollectionHandler, EventReporter$Mode mode, InterfaceC22297a analyticEventCallbackProvider, C34377e linkGateFactory) {
        this.f222w = 2;
        AbstractC22676k.m65750j(cvcRecollectionHandler, "cvcRecollectionHandler");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(analyticEventCallbackProvider, "analyticEventCallbackProvider");
        AbstractC22676k.m65750j(linkGateFactory, "linkGateFactory");
        this.f223x = cvcRecollectionHandler;
        this.f224y = mode;
        this.f225z = analyticEventCallbackProvider;
        this.f221E = linkGateFactory;
    }

    public C0072g(C33414l c33414l) {
        this.f222w = 29;
        this.f223x = c33414l;
        this.f224y = new LinkedHashMap();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Float.valueOf(0.0f));
        this.f225z = c13045h2M36593c;
        this.f221E = c13045h2M36593c;
    }

    public C0072g(C0072g c0072g, C38747x linkAccountManager, C37737m1 dismissalCoordinator, InterfaceC37739n0 linkLaunchMode) {
        this.f222w = 0;
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(dismissalCoordinator, "dismissalCoordinator");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        this.f223x = c0072g;
        this.f224y = linkAccountManager;
        this.f225z = dismissalCoordinator;
        this.f221E = linkLaunchMode;
    }

    public C0072g(int i13) {
        this.f222w = i13;
        switch (i13) {
            case 4:
                this.f223x = new Object();
                this.f224y = new C1075i(this);
                this.f225z = new WeakReference(null);
                break;
            case 5:
                this.f223x = new C0022g(0);
                this.f224y = new SparseArray();
                this.f225z = new C0062y((Object) null);
                this.f221E = new C0022g(0);
                break;
            case 9:
                Random random = new Random();
                this.f225z = new HashMap();
                this.f221E = random;
                this.f223x = new HashMap();
                this.f224y = new HashMap();
                break;
            case 10:
                this.f223x = null;
                this.f224y = null;
                this.f225z = null;
                this.f221E = null;
                break;
            case 16:
                this.f223x = null;
                this.f224y = null;
                this.f225z = null;
                this.f221E = new HashMap();
                break;
            case 25:
                this.f223x = new Object();
                this.f224y = new Handler(Looper.getMainLooper(), new C22557f(this, 1));
                break;
            default:
                this.f223x = new ArrayList();
                this.f224y = new ArrayList();
                this.f225z = new ArrayList(0);
                InterfaceC4385l.f17711a.getClass();
                List listM13764a = C4384k.m13764a();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13764a, 10));
                Iterator it = listM13764a.iterator();
                while (it.hasNext()) {
                    ((C12933d) ((InterfaceC4385l) it.next())).getClass();
                    arrayList.add(new C12934e());
                }
                this.f221E = arrayList;
                break;
        }
    }

    public C0072g(C5099k0 c5099k0, C35850h c35850h, C25126d c25126d) {
        this.f222w = 28;
        this.f224y = c5099k0;
        this.f225z = c35850h;
        this.f221E = c25126d;
        this.f223x = new ArrayList();
    }

    public C0072g(C25126d c25126d, C0072g c0072g, ArrayList arrayList) {
        this.f222w = 27;
        this.f224y = c25126d;
        this.f225z = c0072g;
        this.f221E = arrayList;
        this.f223x = c25126d;
    }

    public C0072g(EnumC20171z enumC20171z) {
        this.f222w = 14;
        this.f223x = enumC20171z;
        this.f224y = null;
        this.f225z = null;
        this.f221E = null;
    }

    public C0072g(C21548h c21548h) {
        this.f222w = 18;
        this.f221E = c21548h;
        List list = c21548h.f82629E.f123286T;
        AbstractC22676k.m65749i(list, "getEnumEntryList(...)");
        List list2 = list;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Object obj : list2) {
            linkedHashMap.put(AbstractC12889b.m36240F(c21548h.f82636L.f65761b, ((C30172x) obj).f123503z), obj);
        }
        this.f223x = linkedHashMap;
        C21548h c21548h2 = (C21548h) this.f221E;
        this.f224y = c21548h2.f82636L.f65760a.f65735a.m64224c(new C1774d(3, this, c21548h2));
        C22342k c22342k = ((C21548h) this.f221E).f82636L.f65760a.f65735a;
        C3215j c3215j = new C3215j(this, 4);
        c22342k.getClass();
        this.f225z = new C22340i(c22342k, c3215j);
    }

    public C0072g(String sourceId) {
        this.f222w = 6;
        AbstractC22676k.m65750j(sourceId, "sourceId");
        this.f223x = sourceId;
        this.f224y = new HashMap();
        this.f225z = new HashMap();
        this.f221E = "";
    }

    public C0072g(C23501g1 c23501g1, boolean[] zArr) {
        this.f222w = 21;
        this.f223x = c23501g1;
        this.f224y = zArr;
        int i13 = c23501g1.f93027a;
        this.f225z = new boolean[i13];
        this.f221E = new boolean[i13];
    }

    public C0072g(ViewPager2 viewPager2) {
        this.f222w = 13;
        this.f221E = viewPager2;
        this.f223x = new C17146i(this, 0);
        this.f224y = new C17146i(this, 1);
    }
}
