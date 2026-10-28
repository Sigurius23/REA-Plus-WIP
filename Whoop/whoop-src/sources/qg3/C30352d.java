package qg3;

import a30.C0332w0;
import a33.C0352d;
import android.app.Notification;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.iterable.iterableapi.C5309c;
import com.iterable.iterableapi.C5315d1;
import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.EnumC5303a1;
import com.iterable.iterableapi.EnumC5358o0;
import com.stripe.android.uicore.address.CountryAddressSchema;
import com.stripe.android.uicore.address.FieldSchema;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.address.NameType;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import e40.AbstractC12695i;
import e40.C12688b;
import e40.InterfaceC12687a;
import e43.C12717i;
import e53.C12743b;
import e53.C12745d;
import ec3.C13045h2;
import ed3.C13117a;
import f53.C14125m;
import h53.C16939d;
import h53.C16942g;
import hn.C17494b;
import hn.C17495c;
import hn.C17501i;
import hn.InterfaceC17502j;
import i53.C18135g;
import im.InterfaceC18653b;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.video.android.model.StreamCallId;
import io.sentry.android.replay.video.C20245d;
import io.sentry.internal.debugmeta.C20378c;
import j43.C21323g;
import j43.C21325i;
import j43.EnumC21324h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import k83.InterfaceC22297a;
import l83.C23470p;
import le3.C23885f;
import le3.C23886g;
import le3.C23887h;
import le3.C23889j;
import le3.C23890k;
import m83.AbstractC25247g0;
import n10.C26145o0;
import n23.AbstractC26205h;
import n43.C26285a;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import ng3.C26701n;
import ng3.C26702o;
import o23.C27481k;
import o23.InterfaceC27471a;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0271z0;
import p012ab.C0678f0;
import p012ab.C0684i0;
import p012ab.C0686j0;
import p012ab.C0690l0;
import p012ab.InterfaceC0676e0;
import p031b9.AbstractC2875y;
import p047c9.C4310a;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p151fn.C14634v;
import p151fn.C14636x;
import p151fn.InterfaceC14633u;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;
import p184h5.C16913t0;
import p215i9.C18226b;
import p215i9.C18228d;
import p215i9.C18233i;
import p215i9.C18237m;
import p215i9.InterfaceC18234j;
import p292l1.C23121k0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p309lo.C24566x;
import p314m.C24859r;
import p314m.LayoutInflaterFactory2C24829a0;
import p344nm.C26819a;
import p344nm.C26827i;
import p344nm.C26829k;
import p382ou.AbstractC28362h;
import p382ou.C28357c;
import p382ou.C28363i;
import p383ov.AbstractC28380b;
import p383ov.EnumC28379a;
import p408q.AbstractC29658b;
import p408q.InterfaceC29657a;
import p442qy.C30765d;
import p465rm.C31543j1;
import p474s.C31983m2;
import p479s4.AbstractC32122c;
import p499t9.InterfaceC33648q;
import p505ts.AbstractC34132o;
import p516u8.C34606n;
import p588wm.InterfaceC37369k;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33391g1;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import ud3.C34807d0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import y43.C39230b;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yd3.C39472c;

/* JADX INFO: renamed from: qg3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C30352d implements InterfaceC0676e0, InterfaceC38468e, InterfaceC14633u, InterfaceC17502j, InterfaceC18234j, InterfaceC34823k, InterfaceC29657a, InterfaceC18653b, InterfaceC27471a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124534w;

    /* JADX INFO: renamed from: x */
    public Object f124535x;

    /* JADX INFO: renamed from: y */
    public Object f124536y;

    public /* synthetic */ C30352d(int i13, char c3) {
        this.f124534w = i13;
    }

    /* JADX INFO: renamed from: A */
    public void m92809A(EnumC28379a enumC28379a) {
        C20245d c20245d = (C20245d) this.f124535x;
        Boolean bool = (Boolean) ((LinkedHashMap) this.f124536y).remove(enumC28379a);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            AbstractC28362h abstractC28362h = AbstractC28380b.f114493a[enumC28379a.ordinal()] == 1 ? (C28363i) c20245d.f76049e : (C28357c) c20245d.f76052h;
            abstractC28362h.f114406g = zBooleanValue;
            if (zBooleanValue || !abstractC28362h.f114435q) {
                return;
            }
            abstractC28362h.f114436r = true;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m92810B(EnumC28379a enumC28379a) {
        C20245d c20245d = (C20245d) this.f124535x;
        AbstractC28362h abstractC28362h = AbstractC28380b.f114493a[enumC28379a.ordinal()] == 1 ? (C28363i) c20245d.f76049e : (C28357c) c20245d.f76052h;
        ((LinkedHashMap) this.f124536y).put(enumC28379a, Boolean.valueOf(abstractC28362h.f114406g));
        abstractC28362h.f114406g = false;
        if (abstractC28362h.f114435q) {
            abstractC28362h.f114436r = true;
        }
    }

    /* JADX INFO: renamed from: C */
    public EnumC21324h m92811C(Context context, Notification notification, StreamCallId streamCallId) {
        C11457j c11457jMo35558c;
        if (AbstractC32122c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0 && notification != null) {
            InterfaceC33408j3.f139483t.getClass();
            InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
            if (interfaceC33408j3 != null && (c11457jMo35558c = ((C33366b4) interfaceC33408j3).mo35558c()) != null) {
                c11457jMo35558c.m30733C(streamCallId.getNotificationId(C12717i.f43512b), notification, streamCallId);
            }
            return EnumC21324h.f81538y;
        }
        C2345k c2345kM92818r = m92818r();
        InterfaceC2339e interfaceC2339e = c2345kM92818r.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM92818r.f9273a)) {
            c2345kM92818r.f9274b.log(enumC2341g, c2345kM92818r.f9273a, "[showIncomingCall] Cannot show notification - permission=" + (AbstractC32122c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) + ", notification=" + (notification != null), null);
        }
        return EnumC21324h.f81539z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m.n] */
    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: D */
    public void mo91067D(AbstractC29658b abstractC29658b) {
        ((InterfaceC29657a) this.f124535x).mo91067D(abstractC29658b);
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) this.f124536y;
        if (layoutInflaterFactory2C24829a0.f97221W != null) {
            layoutInflaterFactory2C24829a0.f97210L.getDecorView().removeCallbacks(layoutInflaterFactory2C24829a0.f97222X);
        }
        if (layoutInflaterFactory2C24829a0.f97220V != null) {
            C16913t0 c16913t0 = layoutInflaterFactory2C24829a0.f97223Y;
            if (c16913t0 != null) {
                c16913t0.m47608b();
            }
            C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(layoutInflaterFactory2C24829a0.f97220V);
            c16913t0M47570a.m47607a(0.0f);
            layoutInflaterFactory2C24829a0.f97223Y = c16913t0M47570a;
            c16913t0M47570a.m47610d(new C24859r(this, 2));
        }
        layoutInflaterFactory2C24829a0.f97212N.onSupportActionModeFinished(layoutInflaterFactory2C24829a0.f97219U);
        layoutInflaterFactory2C24829a0.f97219U = null;
        ViewGroup viewGroup = layoutInflaterFactory2C24829a0.f97225a0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(viewGroup);
        layoutInflaterFactory2C24829a0.m72795M();
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public int mo1673b(long j7) {
        long[] jArr = (long[]) this.f124536y;
        int iM71671b = AbstractC24567y.m71671b(jArr, j7, false);
        if (iM71671b < jArr.length) {
            return iM71671b;
        }
        return -1;
    }

    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: c */
    public void mo931c(C38059n c38059n) {
        C0686j0 c0686j0 = (C0686j0) this.f124536y;
        SparseArray sparseArray = c0686j0.f2454g;
        C24561s c24561s = (C24561s) this.f124535x;
        if (c38059n.m121867t() == 0 && (c38059n.m121867t() & 128) != 0) {
            c38059n.m121847G(6);
            int iM121848a = c38059n.m121848a() / 4;
            for (int i13 = 0; i13 < iM121848a; i13++) {
                c38059n.m121852e(c24561s.f95858b, 0, 4);
                c24561s.m71640q(0);
                int iM71632i = c24561s.m71632i(16);
                c24561s.m71643t(3);
                if (iM71632i == 0) {
                    c24561s.m71643t(13);
                } else {
                    int iM71632i2 = c24561s.m71632i(13);
                    if (sparseArray.get(iM71632i2) == null) {
                        sparseArray.put(iM71632i2, new C0678f0(new C0684i0(c0686j0, iM71632i2)));
                        c0686j0.f2460m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public List mo1674d(long j7) {
        C38465b c38465b;
        int iM71674e = AbstractC24567y.m71674e((long[]) this.f124536y, j7, false);
        return (iM71674e == -1 || (c38465b = ((C38465b[]) this.f124535x)[iM71674e]) == C38465b.f164723R) ? Collections.EMPTY_LIST : Collections.singletonList(c38465b);
    }

    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: f */
    public void mo934f(C13117a c13117a) {
        C14636x c14636x = (C14636x) this.f124536y;
        SparseArray sparseArray = c14636x.f54032f;
        C24561s c24561s = (C24561s) this.f124535x;
        if (c13117a.m36715y() == 0 && (c13117a.m36715y() & 128) != 0) {
            c13117a.m36690L(6);
            int iM36692a = c13117a.m36692a() / 4;
            for (int i13 = 0; i13 < iM36692a; i13++) {
                c13117a.m36697g(c24561s.f95858b, 0, 4);
                c24561s.m71640q(0);
                int iM71632i = c24561s.m71632i(16);
                c24561s.m71643t(3);
                if (iM71632i == 0) {
                    c24561s.m71643t(13);
                } else {
                    int iM71632i2 = c24561s.m71632i(13);
                    if (sparseArray.get(iM71632i2) == null) {
                        sparseArray.put(iM71632i2, new C14634v(new C0684i0(c14636x, iM71632i2)));
                        c14636x.f54038l++;
                    }
                }
            }
            if (c14636x.f54027a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: g */
    public void mo935g(C38064s c38064s, InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        C26701n c26701n = new C26701n(14);
        C26702o c26702o = new C26702o(13, false);
        Object obj = ((InterfaceC22297a) this.f124535x).get();
        InterfaceC22297a interfaceC22297a = (InterfaceC22297a) this.f124536y;
        return new C26827i(c26701n, c26702o, C26819a.f106972f, (C26829k) obj, interfaceC22297a);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public long mo1675h(int i13) {
        long[] jArr = (long[]) this.f124536y;
        AbstractC24543a.m71569e(i13 >= 0);
        AbstractC24543a.m71569e(i13 < jArr.length);
        return jArr[i13];
    }

    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: i */
    public void mo937i(C24566x c24566x, InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public int mo1676j() {
        return ((long[]) this.f124536y).length;
    }

    /* JADX INFO: renamed from: k */
    public void m92812k() {
        this.f124535x = null;
        this.f124536y = null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m92813l(int i13) {
        return ((C34606n) this.f124535x).f145698a.get(i13);
    }

    @Override // hn.InterfaceC17502j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C17495c mo43807a(C17501i c17501i) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c17501i.f67652a.f67657a;
        C17495c c17495c = null;
        try {
            String strValueOf = String.valueOf(str);
            AbstractC24543a.m71567c(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C17495c c17495c2 = new C17495c(mediaCodecCreateByCodecName, (HandlerThread) ((C17494b) this.f124535x).get(), (HandlerThread) ((C17494b) this.f124536y).get());
                try {
                    AbstractC24543a.m71579o();
                    C17495c.m49684g(c17495c2, c17501i.f67653b, c17501i.f67655d, c17501i.f67656e);
                    return c17495c2;
                } catch (Exception e5) {
                    e = e5;
                    c17495c = c17495c2;
                    if (c17495c != null) {
                        c17495c.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // p215i9.InterfaceC18234j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C18226b mo43808e(C0332w0 c0332w0) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((C18237m) c0332w0.f1168x).f70948a;
        C18226b c18226b = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C18226b c18226b2 = new C18226b(mediaCodecCreateByCodecName, (HandlerThread) ((C17494b) this.f124535x).get(), new C18228d(mediaCodecCreateByCodecName, (HandlerThread) ((C17494b) this.f124536y).get()), (C18233i) c0332w0.f1166G);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) c0332w0.f1164E;
                    C18226b.m52481l(c18226b2, (MediaFormat) c0332w0.f1169y, surface, (MediaCrypto) c0332w0.f1165F, (surface == null && ((C18237m) c0332w0.f1168x).f70955h && AbstractC38065t.f163031a >= 35) ? 8 : 0);
                    return c18226b2;
                } catch (Exception e5) {
                    e = e5;
                    c18226b = c18226b2;
                    if (c18226b != null) {
                        c18226b.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: o */
    public boolean mo91068o(AbstractC29658b abstractC29658b, MenuItem menuItem) {
        return ((InterfaceC29657a) this.f124535x).mo91068o(abstractC29658b, menuItem);
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) {
        C23886g.m70159d((C23886g) this.f124535x, iOException, null, 6);
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        InterfaceC26633p0 source;
        InterfaceC26629n0 interfaceC26629n0Mo14152d;
        int iIntValue;
        try {
            InterfaceC26631o0 interfaceC26631o0M70160a = ((C23886g) this.f124535x).m70160a(c34850x0);
            C34807d0 c34807d0 = c34850x0.f146777F;
            int size = c34807d0.size();
            int i13 = 0;
            int i14 = 0;
            boolean z4 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            Integer numM125932Q = null;
            Integer numM125932Q2 = null;
            while (i14 < size) {
                if (c34807d0.m109864c(i14).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String strM109867g = c34807d0.m109867g(i14);
                    int i15 = i13;
                    while (i15 < strM109867g.length()) {
                        c34807d0 = c34807d0;
                        int iM119122g = AbstractC37172f.m119122g(strM109867g, DateTimeRange.lowerUpperDelimiter, i15, i13, 4);
                        int iM119120e = AbstractC37172f.m119120e(';', i15, iM119122g, strM109867g);
                        String strM119133r = AbstractC37172f.m119133r(i15, iM119120e, strM109867g);
                        i15 = iM119120e + 1;
                        if (strM119133r.equalsIgnoreCase("permessage-deflate")) {
                            if (z4) {
                                z15 = true;
                            }
                            while (true) {
                                i15 = i15;
                                while (true) {
                                    if (i15 >= iM119122g) {
                                        break;
                                    }
                                    int iM119120e2 = AbstractC37172f.m119120e(';', i15, iM119122g, strM109867g);
                                    int iM119120e3 = AbstractC37172f.m119120e('=', i15, iM119120e2, strM109867g);
                                    String strM119133r2 = AbstractC37172f.m119133r(i15, iM119120e3, strM109867g);
                                    String strM125901t0 = iM119120e3 < iM119120e2 ? AbstractC39414r.m125901t0(AbstractC37172f.m119133r(iM119120e3 + 1, iM119120e2, strM109867g), "\"", "\"") : null;
                                    i15 = iM119120e2 + 1;
                                    if (strM119133r2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (numM125932Q != null) {
                                            z15 = true;
                                        }
                                        numM125932Q = strM125901t0 != null ? AbstractC39421y.m125932Q(strM125901t0) : null;
                                        if (numM125932Q != null) {
                                        }
                                        z15 = true;
                                    } else if (strM119133r2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z13) {
                                            z15 = true;
                                        }
                                        if (strM125901t0 != null) {
                                            z15 = true;
                                        }
                                        z13 = true;
                                    } else {
                                        if (strM119133r2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (numM125932Q2 != null) {
                                                z15 = true;
                                            }
                                            numM125932Q2 = strM125901t0 != null ? AbstractC39421y.m125932Q(strM125901t0) : null;
                                            if (numM125932Q2 != null) {
                                            }
                                        } else if (strM119133r2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z14) {
                                                z15 = true;
                                            }
                                            if (strM125901t0 != null) {
                                                z15 = true;
                                            }
                                            z14 = true;
                                        }
                                        z15 = true;
                                    }
                                }
                            }
                            z4 = true;
                        } else {
                            i15 = i15;
                            z15 = true;
                        }
                        i13 = 0;
                    }
                }
                i14++;
                c34807d0 = c34807d0;
                i13 = 0;
            }
            ((C23886g) this.f124535x).f94449e = new C23887h(z4, numM125932Q, z13, numM125932Q2, z14, z15);
            if (z15 || numM125932Q != null || (numM125932Q2 != null && (8 > (iIntValue = numM125932Q2.intValue()) || iIntValue >= 16))) {
                C23886g c23886g = (C23886g) this.f124535x;
                synchronized (c23886g) {
                    c23886g.f94461q.clear();
                    c23886g.m70161b(MessageListItemViewType.ERROR_MESSAGE, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String name = AbstractC37174h.f158963b + " WebSocket " + ((C34832o0) this.f124536y).f146712a.m109881j();
            C23886g c23886g2 = (C23886g) this.f124535x;
            C31983m2 c31983m2 = new C31983m2(interfaceC26631o0M70160a);
            AbstractC22676k.m65750j(name, "name");
            C23887h c23887h = c23886g2.f94449e;
            AbstractC22676k.m65747g(c23887h);
            synchronized (c23886g2) {
                try {
                    c23886g2.f94458n = name;
                    c23886g2.f94459o = c31983m2;
                    c23886g2.f94456l = new C23890k((C26617h0) c31983m2.f132770y, c23886g2.f94447c, c23887h.f94469a, c23887h.f94471c, c23886g2.f94450f);
                    c23886g2.f94454j = new C23885f(c23886g2);
                    long j7 = c23886g2.f94448d;
                    if (j7 != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j7);
                        C39472c c39472c = c23886g2.f94457m;
                        String name2 = name.concat(" ping");
                        C23121k0 c23121k0 = new C23121k0(c23886g2, nanos, 1);
                        c39472c.getClass();
                        AbstractC22676k.m65750j(name2, "name");
                        c39472c.m126120d(new C23885f(name2, c23121k0), nanos);
                    }
                    if (!c23886g2.f94461q.isEmpty()) {
                        c23886g2.m70164f();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c23886g2.f94455k = new C23889j((C26621j0) c31983m2.f132769x, c23886g2, c23887h.f94469a, c23887h.f94473e);
            C23886g c23886g3 = (C23886g) this.f124535x;
            try {
                c23886g3.f94446b.onOpen(c23886g3, c34850x0);
                while (c23886g3.f94464t == -1) {
                    C23889j c23889j = c23886g3.f94455k;
                    AbstractC22676k.m65747g(c23889j);
                    c23889j.m70168b();
                }
            } catch (Exception e5) {
                C23886g.m70159d(c23886g3, e5, null, 6);
            } finally {
                c23886g3.m70163e();
            }
        } catch (IOException e13) {
            C23886g.m70159d((C23886g) this.f124535x, e13, c34850x0, 4);
            AbstractC37172f.m119117b(c34850x0);
            InterfaceC26631o0 interfaceC26631o0 = c34850x0.f146779H;
            if (interfaceC26631o0 != null && (interfaceC26629n0Mo14152d = interfaceC26631o0.mo14152d()) != null) {
                AbstractC37172f.m119117b(interfaceC26629n0Mo14152d);
            }
            InterfaceC26631o0 interfaceC26631o1 = c34850x0.f146779H;
            if (interfaceC26631o1 == null || (source = interfaceC26631o1.getSource()) == null) {
                return;
            }
            AbstractC37172f.m119117b(source);
        }
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        C27481k c27481k = (C27481k) this.f124535x;
        AbstractC3006f0.m8732z(c27481k.f110704d, null, null, new C26285a(c27481k, it, (InterfaceC27471a) this.f124536y, (InterfaceC30057d) null, 5), 3);
    }

    /* JADX INFO: renamed from: p */
    public void m92816p(Uri uri) {
        C5309c c5309c;
        C5315d1 c5315d1 = (C5315d1) this.f124536y;
        C5339j1 c5339j1 = (C5339j1) this.f124535x;
        Context context = c5315d1.f21666x;
        AbstractC12350b.m34557F();
        if (uri != null && !uri.toString().isEmpty()) {
            String string = uri.toString();
            if (string.startsWith("action://")) {
                AbstractC34924m.m110164y(context, C5309c.m16415a(string.replace("action://", "")), 3);
            } else if (string.startsWith("itbl://")) {
                AbstractC34924m.m110164y(context, C5309c.m16415a(string.replace("itbl://", "")), 3);
            } else if (!string.startsWith("iterable://")) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "openUrl");
                    jSONObject.put("data", string);
                    c5309c = new C5309c(jSONObject);
                } catch (JSONException unused) {
                    c5309c = null;
                }
                AbstractC34924m.m110164y(context, c5309c, 3);
            } else if ("delete".equals(string.replace("iterable://", ""))) {
                c5315d1.m16424g(c5339j1, EnumC5358o0.f21791w, EnumC5303a1.f21630w);
            }
        }
        c5315d1.f21663J = System.currentTimeMillis();
        c5315d1.m16425h();
    }

    /* JADX INFO: renamed from: q */
    public String m92817q() {
        return AbstractC11895b.m31996o("HealthData#", (String) this.f124535x, "#androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
    }

    /* JADX INFO: renamed from: r */
    public C2345k m92818r() {
        switch (this.f124534w) {
            case 15:
                return (C2345k) ((C23470p) this.f124535x).getValue();
            default:
                return (C2345k) ((C23470p) this.f124536y).getValue();
        }
    }

    /* JADX INFO: renamed from: s */
    public C39230b m92819s() {
        return (C39230b) ((C23470p) this.f124536y).getValue();
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: t */
    public boolean mo91069t(AbstractC29658b abstractC29658b, Menu menu) {
        return ((InterfaceC29657a) this.f124535x).mo91069t(abstractC29658b, menu);
    }

    public String toString() {
        switch (this.f124534w) {
            case 0:
                Throwable th3 = (Throwable) this.f124536y;
                if (th3 != null) {
                    return "Result{isError=true, error=\"" + th3 + "\"}";
                }
                return "Result{isError=false, response=" + ((C29218v0) this.f124535x) + '}';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public EnumC21324h m92820u(Context context, C21325i c21325i, Notification notification) {
        Class cls = c21325i.f81543d.f81524d;
        C21323g c21323g = (C21323g) this.f124535x;
        if (c21323g.m59854d(context, cls)) {
            return m92811C(context, notification, c21325i.f81540a);
        }
        C2345k c2345kM92818r = m92818r();
        InterfaceC2339e interfaceC2339e = c2345kM92818r.f9275c;
        String str = c2345kM92818r.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM92818r.f9274b.log(enumC2341g, str, "[showIncomingCall] Starting regular service", null);
        }
        context.startService(c21323g.m59851a(context, c21325i));
        return EnumC21324h.f81537x;
    }

    /* JADX INFO: renamed from: v */
    public boolean m92821v() {
        C33391g1 c33391g1;
        C13045h2 c13045h2;
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        boolean z4 = ((interfaceC33408j3 == null || (c33391g1 = ((C33366b4) interfaceC33408j3).f139248U) == null || (c13045h2 = c33391g1.f139405h) == null) ? null : (C33368c0) c13045h2.getValue()) != null;
        C2345k c2345kM92818r = m92818r();
        InterfaceC2339e interfaceC2339e = c2345kM92818r.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM92818r.f9273a)) {
            c2345kM92818r.f9274b.log(enumC2341g, c2345kM92818r.f9273a, AbstractC11266d.m30462p("[showIncomingCall] hasActiveCall: ", z4), null);
        }
        return !z4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public Object m92822w(AbstractC32269c abstractC32269c) {
        C12743b c12743b;
        C30352d c30352d;
        if (abstractC32269c instanceof C12743b) {
            c12743b = (C12743b) abstractC32269c;
            int i13 = c12743b.f43625z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12743b.f43625z = i13 - Integer.MIN_VALUE;
            } else {
                c12743b = new C12743b(this, abstractC32269c);
            }
        } else {
            c12743b = new C12743b(this, abstractC32269c);
        }
        Object objMo31821e = c12743b.f43623x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12743b.f43625z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo31821e);
            C20378c c20378c = (C20378c) this.f124536y;
            if (c20378c == null) {
                AbstractC22676k.m65757q("provider");
                throw null;
            }
            c12743b.f43622w = this;
            c12743b.f43625z = 1;
            objMo31821e = c20378c.mo31821e(c12743b);
            if (objMo31821e == enumC31071a) {
                return enumC31071a;
            }
            c30352d = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30352d = c12743b.f43622w;
            AbstractC34132o.m107864I(objMo31821e);
        }
        String token = (String) objMo31821e;
        C12745d c12745d = (C12745d) c30352d.f124535x;
        c12745d.getClass();
        AbstractC22676k.m65750j(token, "token");
        c12745d.f43626a = token;
        return objMo31821e;
    }

    /* JADX INFO: renamed from: x */
    public void m92823x() throws IOException {
        String str = (String) this.f124535x;
        if (((FileChannel) this.f124536y) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f124536y = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th3) {
            FileChannel fileChannel = (FileChannel) this.f124536y;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f124536y = null;
            throw new IllegalStateException(AbstractC11895b.m31996o("Unable to lock file: '", str, "'."), th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public void m92824y(C16939d c16939d, AbstractC32269c abstractC32269c) {
        C16942g c16942g;
        if (abstractC32269c instanceof C16942g) {
            c16942g = (C16942g) abstractC32269c;
            int i13 = c16942g.f65023y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16942g.f65023y = i13 - Integer.MIN_VALUE;
            } else {
                c16942g = new C16942g(this, abstractC32269c);
            }
        } else {
            c16942g = new C16942g(this, abstractC32269c);
        }
        Object obj = c16942g.f65021w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16942g.f65023y;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C13045h2 c13045h2 = m92819s().f168690e;
        C14125m c14125m = new C14125m(1, c16939d);
        c16942g.f65023y = 1;
        c13045h2.collect(c14125m, c16942g);
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: z */
    public boolean mo91070z(AbstractC29658b abstractC29658b, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C24829a0) this.f124536y).f97225a0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(viewGroup);
        return ((InterfaceC29657a) this.f124535x).mo91070z(abstractC29658b, menu);
    }

    public /* synthetic */ C30352d(int i13, Object obj, Object obj2) {
        this.f124534w = i13;
        this.f124535x = obj;
        this.f124536y = obj2;
    }

    public /* synthetic */ C30352d(Object obj, Object obj2, boolean z4, int i13) {
        this.f124534w = i13;
        this.f124536y = obj;
        this.f124535x = obj2;
    }

    public C30352d(C20245d c20245d) {
        this.f124534w = 28;
        this.f124535x = c20245d;
        this.f124536y = new LinkedHashMap();
    }

    public C30352d(C12745d tokenRepository) {
        this.f124534w = 10;
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        this.f124535x = tokenRepository;
    }

    public C30352d(C21323g c21323g) {
        this.f124534w = 19;
        this.f124535x = c21323g;
        this.f124536y = AbstractC1772c1.m5382S(this, "IncomingCallPresenter");
    }

    public C30352d(String str) {
        this.f124534w = 21;
        this.f124535x = str.concat(".lck");
    }

    public C30352d(Context context) {
        this.f124534w = 9;
        this.f124535x = context;
    }

    public C30352d(C26145o0 intentFirstConfirmationInterceptorFactory, C30765d logger) {
        this.f124534w = 24;
        AbstractC22676k.m65750j(intentFirstConfirmationInterceptorFactory, "intentFirstConfirmationInterceptorFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.f124535x = intentFirstConfirmationInterceptorFactory;
        this.f124536y = logger;
    }

    public C30352d(int i13) {
        this.f124534w = 16;
        C17494b c17494b = new C17494b(i13, 0);
        C17494b c17494b2 = new C17494b(i13, 1);
        this.f124535x = c17494b;
        this.f124536y = c17494b2;
    }

    public C30352d(Context context, String str, String str2) {
        this.f124534w = 29;
        if (str != null) {
            this.f124536y = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f124535x = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f124535x = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public C30352d(C34606n c34606n, SparseArray sparseArray) {
        this.f124534w = 5;
        this.f124535x = c34606n;
        SparseBooleanArray sparseBooleanArray = c34606n.f145698a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            int iM109400a = c34606n.m109400a(i13);
            C4310a c4310a = (C4310a) sparseArray.get(iM109400a);
            c4310a.getClass();
            sparseArray2.append(iM109400a, c4310a);
        }
        this.f124536y = sparseArray2;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Map] */
    public C30352d(int i13, byte b) {
        this.f124534w = i13;
        switch (i13) {
            case 13:
                Object obj = C12688b.f43390a;
                this.f124535x = AbstractC12695i.m35503b("ZZ", AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null))));
                ?? r10 = C12688b.f43390a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(r10.size()));
                for (Map.Entry entry : r10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), AbstractC12695i.m35503b((String) entry.getKey(), ((InterfaceC12687a) entry.getValue()).mo35497a()));
                }
                this.f124536y = linkedHashMap;
                break;
            case 14:
                this.f124535x = new C31543j1(0);
                this.f124536y = new C31543j1(0);
                break;
            case 15:
                this.f124535x = AbstractC1772c1.m5382S(this, "Video:SfuSocketState");
                this.f124536y = AbstractC30060g.m92088H(new C0271z0(12, C18135g.f70432a, this));
                break;
            case 20:
                this.f124535x = new LinkedHashMap();
                this.f124536y = new LinkedHashMap();
                break;
            default:
                C30352d c30352d = AbstractC5078a.f21383c;
                this.f124535x = new C0352d((C0352d) c30352d.f124535x);
                this.f124536y = Arrays.copyOf((long[]) c30352d.f124536y, 10);
                break;
        }
    }

    public C30352d(C14636x c14636x) {
        this.f124534w = 12;
        this.f124536y = c14636x;
        this.f124535x = new C24561s(new byte[4], 4, 0, (byte) 0);
    }

    public C30352d(C0686j0 c0686j0) {
        this.f124534w = 2;
        this.f124536y = c0686j0;
        this.f124535x = new C24561s(new byte[4], 4, 5, (byte) 0);
    }
}
