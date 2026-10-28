package p127ev;

import a30.C0332w0;
import a33.C0352d;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.platform.client.proto.C1533u;
import b30.C2570m;
import bc3.AbstractC3050q0;
import cf.AbstractC4537l;
import co.nstant.p050in.cbor.CborException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.squareup.wire.AbstractC5583n;
import dm.C12173c;
import eu.C13633t;
import fm.C14578h;
import fm.C14579i;
import fm.C14580j;
import fm.C14581k;
import fm.C14582l;
import fm.C14584n;
import fm.EnumC14590t;
import fm.EnumC14591u;
import fm.EnumC14593w;
import g73.C15553a;
import gf.C15760a;
import gf.C15768i;
import gm.AbstractC15987o;
import gm.C15980h;
import gm.C15981i;
import gm.C15985m;
import gm.C15990r;
import hm.C17414a;
import hm.C17418e;
import hm.InterfaceC17419f;
import hn.C17508p;
import ht.C17613b;
import io.sentry.android.replay.video.C20245d;
import io.seon.androidsdk.service.C20669h1;
import j93.InterfaceC21461d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jm.C21779a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l30.C23294c;
import l30.C23296e;
import l30.C23306o;
import l30.EnumC23297f;
import l30.EnumC23298g;
import l83.C23468n;
import la.C23548b;
import m30.C24992h;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import mg.C25525g;
import mg.InterfaceC25526h;
import mm.C25680d;
import n30.C26212c;
import o30.C27504b;
import om.InterfaceC28022a;
import om.InterfaceC28023b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC30802r;
import p012ab.C0680g0;
import p013ah.AbstractC0869d;
import p013ah.C0866a;
import p013ah.C0867b;
import p013ah.C0870e;
import p013ah.C0871f;
import p013ah.C0872g;
import p013ah.C0873h;
import p013ah.C0874i;
import p013ah.C0875j;
import p013ah.C0876k;
import p013ah.C0878m;
import p013ah.C0879n;
import p013ah.EnumC0877l;
import p031b9.AbstractC2875y;
import p047c9.C4312c;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10939f;
import p072cp.ViewOnClickListenerC10937d;
import p077d0.C11387o2;
import p091dg.C12002a;
import p095dp.AbstractC12240d;
import p108e4.AbstractC12682p;
import p122em.C13321a;
import p122em.C13322b;
import p122em.C13323c;
import p127ev.C13668i;
import p217ib.AbstractC18302a0;
import p217ib.AbstractC18307d;
import p217ib.AbstractC18313j;
import p217ib.AbstractC18317n;
import p217ib.C18306c0;
import p217ib.C18310g;
import p217ib.C18316m;
import p344nm.C26820b;
import p344nm.C26827i;
import p344nm.InterfaceC26821c;
import p344nm.InterfaceC26822d;
import p460rg.EnumC31369d;
import p463rj.AbstractC31479j;
import p505ts.AbstractC34132o;
import p522uf.C34893t;
import p522uf.C34895v;
import p522uf.InterfaceC34879h;
import p522uf.InterfaceC34885l;
import p529uo.AbstractC35127o;
import p530up.AbstractC35148d;
import p530up.C35147c;
import p558vp.C36262f;
import p619xl.C38445a;
import p680zg.C40615a;
import p680zg.C40616b;
import p680zg.C40617c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pm.InterfaceC29353a;
import q30.AbstractC29931t;
import q30.C29893a;
import q30.C29898c0;
import q30.C29900d0;
import q30.C29902e0;
import q30.C29910i0;
import q30.C29914k0;
import q30.C29915l;
import q30.C29916l0;
import q30.C29917m;
import q30.C29919n;
import q30.C29923p;
import q30.C29925q;
import q30.C29926q0;
import q30.C29927r;
import q30.C29928r0;
import q30.C29929s;
import q30.C29934u0;
import q30.C29936v0;
import q30.C29937w;
import q30.C29938w0;
import q30.C29939x;
import q30.C29942z;
import q83.InterfaceC30063j;
import r30.C30897b;
import r30.EnumC30901f;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import t30.C33517s;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: ev.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C13668i {

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int[] f48453j;

    /* JADX INFO: renamed from: a */
    public Object f48454a;

    /* JADX INFO: renamed from: b */
    public Object f48455b;

    /* JADX INFO: renamed from: c */
    public Object f48456c;

    /* JADX INFO: renamed from: d */
    public Object f48457d;

    /* JADX INFO: renamed from: e */
    public Object f48458e;

    /* JADX INFO: renamed from: f */
    public Object f48459f;

    /* JADX INFO: renamed from: g */
    public Object f48460g;

    /* JADX INFO: renamed from: h */
    public Object f48461h;

    /* JADX INFO: renamed from: i */
    public Object f48462i;

    public C13668i(ByteArrayInputStream byteArrayInputStream) {
        this.f48454a = byteArrayInputStream;
        this.f48455b = new C40615a(this, byteArrayInputStream);
        this.f48456c = new C40616b(this, byteArrayInputStream);
        this.f48457d = new C40615a(this, byteArrayInputStream);
        this.f48458e = new C40615a(this, byteArrayInputStream);
        this.f48459f = new C40615a(this, byteArrayInputStream);
        this.f48460g = new C40615a(this, byteArrayInputStream);
        this.f48461h = new C40615a(this, byteArrayInputStream);
        this.f48462i = new C40617c(this, byteArrayInputStream);
    }

    /* JADX INFO: renamed from: l */
    public static void m38529l(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String strM111078c = AbstractC35127o.m111078c(context, iIsGooglePlayServicesAvailable);
        String strM111080e = AbstractC35127o.m111080e(context, iIsGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strM111078c);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strM111080e);
            linearLayout.addView(button);
            button.setOnClickListener(new ViewOnClickListenerC10937d(context, errorResolutionIntent));
        }
    }

    /* JADX INFO: renamed from: a */
    public C25126d m38530a() {
        C12002a c12002a = (C12002a) this.f48460g;
        InterfaceC34885l interfaceC34885l = (InterfaceC34885l) this.f48457d;
        if (interfaceC34885l == null) {
            throw new IllegalArgumentException("SdkHttpOperation.serializeWith must not be null");
        }
        InterfaceC34879h interfaceC34879h = (InterfaceC34879h) this.f48458e;
        if (interfaceC34879h == null) {
            throw new IllegalArgumentException("SdkHttpOperation.deserializeWith must not be null");
        }
        String str = (String) this.f48461h;
        if (str == null) {
            throw new IllegalArgumentException("operationName is a required HTTP execution attribute");
        }
        if (((String) this.f48462i) == null) {
            throw new IllegalArgumentException("serviceName is a required HTTP execution attribute");
        }
        c12002a.mo33083c(AbstractC4537l.f18268a, str);
        C15760a c15760a = AbstractC4537l.f18269b;
        String str2 = (String) this.f48462i;
        AbstractC22676k.m65747g(str2);
        c12002a.mo33083c(c15760a, str2);
        return new C25126d((C20245d) this.f48459f, (C12002a) this.f48460g, interfaceC34885l, interfaceC34879h, new C34895v((InterfaceC21461d) this.f48454a, (InterfaceC21461d) this.f48455b), (C2570m) this.f48456c);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC18317n m38531b() {
        AbstractC18317n c18310g;
        C15553a c15553a = (C15553a) this.f48460g;
        AbstractC18317n abstractC18317n = (AbstractC18317n) this.f48458e;
        Object objMo52704g = abstractC18317n != null ? abstractC18317n.mo52704g() : null;
        do {
            AbstractC18313j abstractC18313j = (AbstractC18313j) this.f48459f;
            if (abstractC18313j != null) {
                abstractC18313j.mo52721d(c15553a);
            }
            AbstractC18313j abstractC18313jMo16801s = ((AbstractC5583n) this.f48461h).mo16801s();
            this.f48459f = abstractC18313jMo16801s;
            abstractC18313jMo16801s.mo52719a(c15553a);
            AbstractC18313j abstractC18313jM52701k = (AbstractC18313j) this.f48459f;
            C18316m c18316m = (C18316m) this.f48462i;
            if (abstractC18313jM52701k == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            }
            int i13 = AbstractC18317n.f71303K;
            if (abstractC18313jM52701k.mo52696b() || !c18316m.f71301c) {
                int iIntValue = -1;
                if (!abstractC18313jM52701k.mo52696b()) {
                    abstractC18313jM52701k = ((AbstractC18302a0) abstractC18313jM52701k).m52701k();
                    if (objMo52704g != null) {
                        iIntValue = ((Integer) objMo52704g).intValue();
                    }
                }
                c18310g = new C18310g((AbstractC18307d) abstractC18313jM52701k, c18316m, objMo52704g, iIntValue);
            } else {
                c18310g = new C18306c0((AbstractC18302a0) abstractC18313jM52701k, c18316m, objMo52704g != null ? ((Integer) objMo52704g).intValue() : 0);
            }
            this.f48458e = c18310g;
        } while (c18310g.mo52706l());
        return (AbstractC18317n) this.f48458e;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0869d m38532c() throws CborException {
        C0866a c0866a;
        C0873h c0873h;
        EnumC0877l enumC0877l;
        AbstractC0869d c0875j;
        double dPow;
        double dPow2;
        float f13;
        try {
            int i13 = ((ByteArrayInputStream) this.f48454a).read();
            if (i13 == -1) {
                return null;
            }
            int[] iArr = f48453j;
            int i14 = 9;
            int i15 = 4;
            if (iArr == null) {
                iArr = new int[AbstractC12682p.m35486f(9).length];
                try {
                    iArr[5] = 6;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[6] = 7;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[8] = 9;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[7] = 8;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                f48453j = iArr;
            }
            switch (i13 >> 5) {
                case 0:
                    i14 = 2;
                    break;
                case 1:
                    i14 = 3;
                    break;
                case 2:
                    i14 = 4;
                    break;
                case 3:
                    i14 = 5;
                    break;
                case 4:
                    i14 = 6;
                    break;
                case 5:
                    i14 = 7;
                    break;
                case 6:
                    i14 = 8;
                    break;
                case 7:
                    break;
                default:
                    i14 = 1;
                    break;
            }
            long j7 = 0;
            switch (iArr[AbstractC12682p.m35485e(i14)]) {
                case 2:
                    return new C0874i(2, ((C40615a) this.f48455b).m7263q(i13));
                case 3:
                    return new C0874i(3, C40616b.f175047d.subtract(((C40616b) this.f48456c).m7263q(i13)));
                case 4:
                    C40615a c40615a = (C40615a) this.f48457d;
                    C13668i c13668i = (C13668i) c40615a.f9292c;
                    long jM7262p = c40615a.m7262p(i13);
                    if (jM7262p != -1) {
                        return new C0867b(c40615a.m7257j(jM7262p));
                    }
                    c13668i.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        AbstractC0869d abstractC0869dM38532c = c13668i.m38532c();
                        if (abstractC0869dM38532c == null) {
                            throw new CborException("Unexpected end of stream");
                        }
                        int i16 = abstractC0869dM38532c.f3161a;
                        if (C0876k.f3174d.equals(abstractC0869dM38532c)) {
                            return new C0867b(byteArrayOutputStream.toByteArray());
                        }
                        if (i16 != 4) {
                            throw new CborException("Unexpected major type ".concat(AbstractC30802r.m94749B(i16)));
                        }
                        byte[] bArr = ((C0867b) abstractC0869dM38532c).f3159d;
                        if (bArr == null) {
                            bArr = null;
                        }
                        if (bArr != null) {
                            byteArrayOutputStream.write(bArr, 0, bArr.length);
                        }
                    }
                    break;
                case 5:
                    C40615a c40615a2 = (C40615a) this.f48458e;
                    C13668i c13668i2 = (C13668i) c40615a2.f9292c;
                    long jM7262p2 = c40615a2.m7262p(i13);
                    if (jM7262p2 != -1) {
                        return new C0879n(new String(c40615a2.m7257j(jM7262p2), StandardCharsets.UTF_8));
                    }
                    c13668i2.getClass();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        AbstractC0869d abstractC0869dM38532c2 = c13668i2.m38532c();
                        if (abstractC0869dM38532c2 == null) {
                            throw new CborException("Unexpected end of stream");
                        }
                        int i17 = abstractC0869dM38532c2.f3161a;
                        if (C0876k.f3174d.equals(abstractC0869dM38532c2)) {
                            return new C0879n(new String(byteArrayOutputStream2.toByteArray(), StandardCharsets.UTF_8));
                        }
                        if (i17 != 5) {
                            throw new CborException("Unexpected major type ".concat(AbstractC30802r.m94749B(i17)));
                        }
                        byte[] bytes = ((C0879n) abstractC0869dM38532c2).toString().getBytes(StandardCharsets.UTF_8);
                        byteArrayOutputStream2.write(bytes, 0, bytes.length);
                    }
                    break;
                case 6:
                    C40615a c40615a3 = (C40615a) this.f48459f;
                    C13668i c13668i3 = (C13668i) c40615a3.f9292c;
                    long jM7262p3 = c40615a3.m7262p(i13);
                    if (jM7262p3 == -1) {
                        c0866a = new C0866a();
                        c0866a.f3160c = true;
                        c13668i3.getClass();
                        while (true) {
                            AbstractC0869d abstractC0869dM38532c3 = c13668i3.m38532c();
                            if (abstractC0869dM38532c3 == null) {
                                throw new CborException("Unexpected end of stream");
                            }
                            C0876k c0876k = C0876k.f3174d;
                            if (c0876k.equals(abstractC0869dM38532c3)) {
                                c0866a.m2112a(c0876k);
                            } else {
                                c0866a.m2112a(abstractC0869dM38532c3);
                            }
                        }
                    } else {
                        c0866a = new C0866a(Math.abs((int) jM7262p3));
                        while (j7 < jM7262p3) {
                            AbstractC0869d abstractC0869dM38532c4 = c13668i3.m38532c();
                            if (abstractC0869dM38532c4 == null) {
                                throw new CborException("Unexpected end of stream");
                            }
                            c0866a.m2112a(abstractC0869dM38532c4);
                            j7++;
                        }
                    }
                    return c0866a;
                case 7:
                    C40615a c40615a4 = (C40615a) this.f48460g;
                    C13668i c13668i4 = (C13668i) c40615a4.f9292c;
                    long jM7262p4 = c40615a4.m7262p(i13);
                    if (jM7262p4 == -1) {
                        c0873h = new C0873h();
                        c0873h.f3160c = true;
                        c13668i4.getClass();
                        while (true) {
                            AbstractC0869d abstractC0869dM38532c5 = c13668i4.m38532c();
                            if (!C0876k.f3174d.equals(abstractC0869dM38532c5)) {
                                AbstractC0869d abstractC0869dM38532c6 = c13668i4.m38532c();
                                if (abstractC0869dM38532c5 == null || abstractC0869dM38532c6 == null) {
                                    throw new CborException("Unexpected end of stream");
                                }
                                if (c0873h.f3165d.put(abstractC0869dM38532c5, abstractC0869dM38532c6) == null) {
                                    c0873h.f3166e.add(abstractC0869dM38532c5);
                                }
                            }
                        }
                    } else {
                        c0873h = new C0873h(Math.abs((int) jM7262p4));
                        while (j7 < jM7262p4) {
                            AbstractC0869d abstractC0869dM38532c7 = c13668i4.m38532c();
                            AbstractC0869d abstractC0869dM38532c8 = c13668i4.m38532c();
                            if (abstractC0869dM38532c7 == null || abstractC0869dM38532c8 == null) {
                                throw new CborException("Unexpected end of stream");
                            }
                            if (c0873h.f3165d.put(abstractC0869dM38532c7, abstractC0869dM38532c8) == null) {
                                c0873h.f3166e.add(abstractC0869dM38532c7);
                            }
                            j7++;
                        }
                    }
                    return c0873h;
                case 8:
                    C0878m c0878m = new C0878m(((C40615a) this.f48461h).m7262p(i13));
                    AbstractC0869d abstractC0869dM38532c9 = m38532c();
                    if (abstractC0869dM38532c9 == null) {
                        throw new CborException("Unexpected end of stream: tag without following data item.");
                    }
                    long j13 = c0878m.f3184c;
                    if (j13 == 30) {
                        if (!(abstractC0869dM38532c9 instanceof C0866a)) {
                            throw new CborException("Error decoding RationalNumber: not an array");
                        }
                        ArrayList arrayList = ((C0866a) abstractC0869dM38532c9).f3158d;
                        if (arrayList.size() != 2) {
                            throw new CborException("Error decoding RationalNumber: array size is not 2");
                        }
                        AbstractC0869d abstractC0869d = (AbstractC0869d) arrayList.get(0);
                        if (!(abstractC0869d instanceof C0874i)) {
                            throw new CborException("Error decoding RationalNumber: first data item is not a number");
                        }
                        AbstractC0869d abstractC0869d2 = (AbstractC0869d) arrayList.get(1);
                        if (!(abstractC0869d2 instanceof C0874i)) {
                            throw new CborException("Error decoding RationalNumber: second data item is not a number");
                        }
                        C0874i c0874i = (C0874i) abstractC0869d;
                        C0874i c0874i2 = (C0874i) abstractC0869d2;
                        C0872g c0872g = new C0872g();
                        c0872g.f3162b = new C0878m(30L);
                        if (c0874i2.f3167c.equals(BigInteger.ZERO)) {
                            throw new CborException("Denominator is zero");
                        }
                        c0872g.m2112a(c0874i);
                        c0872g.m2112a(c0874i2);
                        return c0872g;
                    }
                    if (j13 == 38) {
                        if (!(abstractC0869dM38532c9 instanceof C0866a)) {
                            throw new CborException("Error decoding LanguageTaggedString: not an array");
                        }
                        ArrayList arrayList2 = ((C0866a) abstractC0869dM38532c9).f3158d;
                        if (arrayList2.size() != 2) {
                            throw new CborException("Error decoding LanguageTaggedString: array size is not 2");
                        }
                        AbstractC0869d abstractC0869d3 = (AbstractC0869d) arrayList2.get(0);
                        if (!(abstractC0869d3 instanceof C0879n)) {
                            throw new CborException("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
                        }
                        AbstractC0869d abstractC0869d4 = (AbstractC0869d) arrayList2.get(1);
                        if (!(abstractC0869d4 instanceof C0879n)) {
                            throw new CborException("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
                        }
                        C0872g c0872g2 = new C0872g();
                        c0872g2.f3162b = new C0878m(38L);
                        c0872g2.m2112a((C0879n) abstractC0869d3);
                        c0872g2.m2112a((C0879n) abstractC0869d4);
                        return c0872g2;
                    }
                    AbstractC0869d abstractC0869d5 = abstractC0869dM38532c9;
                    while (true) {
                        C0878m c0878m2 = abstractC0869d5.f3162b;
                        if (c0878m2 == null) {
                            abstractC0869d5.f3162b = c0878m;
                            return abstractC0869dM38532c9;
                        }
                        abstractC0869d5 = c0878m2;
                    }
                    break;
                case 9:
                    C40617c c40617c = (C40617c) this.f48462i;
                    c40617c.getClass();
                    int i18 = i13 & 31;
                    EnumC0877l enumC0877l2 = EnumC0877l.f3182y;
                    EnumC0877l enumC0877l3 = EnumC0877l.f3183z;
                    switch (i18) {
                        case 24:
                            enumC0877l = EnumC0877l.f3181x;
                            break;
                        case 25:
                            enumC0877l = enumC0877l2;
                            break;
                        case 26:
                            enumC0877l = enumC0877l3;
                            break;
                        case 27:
                            enumC0877l = EnumC0877l.f3176E;
                            break;
                        case 28:
                        case 29:
                        case 30:
                            enumC0877l = EnumC0877l.f3177F;
                            break;
                        case 31:
                            enumC0877l = EnumC0877l.f3178G;
                            break;
                        default:
                            enumC0877l = EnumC0877l.f3180w;
                            break;
                    }
                    int iOrdinal = enumC0877l.ordinal();
                    if (iOrdinal == 0) {
                        switch (i18) {
                            case 20:
                                i15 = 1;
                                break;
                            case 21:
                                i15 = 2;
                                break;
                            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                i15 = 3;
                                break;
                            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                break;
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                i15 = 5;
                                break;
                            default:
                                i15 = 6;
                                break;
                        }
                        int iM35485e = AbstractC12682p.m35485e(i15);
                        if (iM35485e == 0) {
                            return C0875j.f3168g;
                        }
                        if (iM35485e == 1) {
                            return C0875j.f3169h;
                        }
                        if (iM35485e == 2) {
                            return C0875j.f3170i;
                        }
                        if (iM35485e == 3) {
                            return C0875j.f3171j;
                        }
                        if (iM35485e != 5) {
                            throw new CborException("Not implemented");
                        }
                        c0875j = new C0875j(i18);
                    } else {
                        if (iOrdinal == 1) {
                            return new C0875j(c40617c.m7271z());
                        }
                        if (iOrdinal == 2) {
                            byte[] bArrM7242A = c40617c.f175048d.m7242A(2);
                            int i19 = (bArrM7242A[1] & 255) | ((bArrM7242A[0] & 255) << 8);
                            int i24 = (32768 & i19) >> 15;
                            int i25 = (i19 & 31744) >> 10;
                            int i26 = i19 & 1023;
                            if (i25 == 0) {
                                dPow = Math.pow(2.0d, -14.0d) * ((double) (i24 != 0 ? -1 : 1));
                                dPow2 = ((double) i26) / Math.pow(2.0d, 10.0d);
                            } else {
                                if (i25 != 31) {
                                    dPow = Math.pow(2.0d, i25 - 15) * ((double) (i24 != 0 ? -1 : 1));
                                    dPow2 = (((double) i26) / Math.pow(2.0d, 10.0d)) + 1.0d;
                                } else if (i26 != 0) {
                                    f13 = Float.NaN;
                                } else {
                                    f13 = (i24 != 0 ? -1 : 1) * Float.POSITIVE_INFINITY;
                                }
                                c0875j = new C0871f(enumC0877l2, f13);
                            }
                            f13 = (float) (dPow2 * dPow);
                            c0875j = new C0871f(enumC0877l2, f13);
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    byte[] bArrM7242A2 = c40617c.f175050f.m7242A(8);
                                    return new C0870e(Double.longBitsToDouble((((((((((((((((long) (bArrM7242A2[0] & 255)) << 8) | ((long) (bArrM7242A2[1] & 255))) << 8) | ((long) (bArrM7242A2[2] & 255))) << 8) | ((long) (bArrM7242A2[3] & 255))) << 8) | ((long) (bArrM7242A2[4] & 255))) << 8) | ((long) (bArrM7242A2[5] & 255))) << 8) | ((long) (bArrM7242A2[6] & 255))) << 8) | ((long) (bArrM7242A2[7] & 255))));
                                }
                                if (iOrdinal == 6) {
                                    return C0876k.f3174d;
                                }
                                throw new CborException("Not implemented");
                            }
                            byte[] bArrM7242A3 = c40617c.f175049e.m7242A(4);
                            c0875j = new C0871f(enumC0877l3, Float.intBitsToFloat((bArrM7242A3[3] & 255) | ((((((bArrM7242A3[0] & 255) << 8) | (bArrM7242A3[1] & 255)) << 8) | (bArrM7242A3[2] & 255)) << 8)));
                        }
                    }
                    return c0875j;
                default:
                    throw new CborException(AbstractC2875y.m8295h(i13, "Not implemented major type "));
            }
        } catch (IOException e5) {
            throw new CborException(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public Object m38533d(C29926q0 c29926q0, AbstractC32269c abstractC32269c) throws JSONException {
        C29898c0 c29898c0;
        JSONObject jSONObjectPut;
        C13668i c13668i;
        String str;
        if (abstractC32269c instanceof C29898c0) {
            c29898c0 = (C29898c0) abstractC32269c;
            int i13 = c29898c0.f122153F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29898c0.f122153F = i13 - Integer.MIN_VALUE;
            } else {
                c29898c0 = new C29898c0(this, abstractC32269c);
            }
        } else {
            c29898c0 = new C29898c0(this, abstractC32269c);
        }
        Object objM67389a = c29898c0.f122157z;
        Object obj = EnumC31071a.f128113w;
        int i14 = c29898c0.f122153F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM67389a);
            jSONObjectPut = new JSONObject().put("DV", "1.6");
            C23296e c23296e = (C23296e) this.f48454a;
            String str2 = (String) this.f48460g;
            c29898c0.f122154w = this;
            c29898c0.f122155x = jSONObjectPut;
            c29898c0.f122156y = "DD";
            c29898c0.f122153F = 1;
            objM67389a = c23296e.m67389a(str2, c29926q0, c29898c0);
            if (objM67389a == obj) {
                return obj;
            }
            c13668i = this;
            str = "DD";
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c29898c0.f122156y;
            jSONObjectPut = c29898c0.f122155x;
            c13668i = c29898c0.f122154w;
            AbstractC34132o.m107864I(objM67389a);
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put(str, new JSONObject((Map) objM67389a));
        C11387o2 c11387o2 = (C11387o2) c13668i.f48455b;
        c11387o2.getClass();
        HashMap map = new HashMap();
        List listM118959K = AbstractC37056f.m118959K(EnumC23297f.PARAM_PLATFORM, EnumC23297f.PARAM_DEVICE_MODEL, EnumC23297f.PARAM_OS_NAME, EnumC23297f.PARAM_OS_VERSION, EnumC23297f.PARAM_LOCALE, EnumC23297f.PARAM_TIME_ZONE, EnumC23297f.PARAM_SCREEN_RESOLUTION, EnumC23297f.PARAM_SDK_APP_ID, EnumC23297f.PARAM_SDK_VERSION, EnumC23297f.PARAM_SDK_REF_NUMBER, EnumC23297f.PARAM_DATE_TIME, EnumC23297f.PARAM_SDK_TRANS_ID, EnumC23297f.PARAM_WEB_VIEW_USER_AGENT, EnumC23297f.PARAM_SIM_CARRIER_ID, EnumC23297f.PARAM_SECURE_FRP_MODE, EnumC23297f.PARAM_APPLY_RAMPING_RINGER, EnumC23297f.PARAM_HARDWARE_SKU, EnumC23297f.PARAM_SOC_MANUFACTURER, EnumC23297f.PARAM_SOC_MODEL, EnumC23297f.PARAM_SIM_CARRIER_ID_NAME, EnumC23297f.PARAM_MANUFACTURER_CODE, EnumC23297f.PARAM_SIM_SPECIFIC_CARRIER_ID, EnumC23297f.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME, EnumC23297f.PARAM_MULTI_SIM_SUPPORTED, EnumC23297f.PARAM_SUBSCRIPTION_ID, EnumC23297f.PARAM_RTT_CALLING_MODE);
        for (EnumC23297f enumC23297f : EnumC23297f.f92334c0) {
            if (!listM118959K.contains(enumC23297f)) {
                String str3 = enumC23297f.f92338w;
                EnumC23298g[] enumC23298gArr = EnumC23298g.f92339x;
                map.put(str3, "RE01");
            }
        }
        HashMap map2 = new HashMap();
        int i15 = c11387o2.f36515x;
        if (i15 < 26) {
            EnumC23297f enumC23297f2 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr2 = EnumC23298g.f92339x;
            map2.put("A003", "RE02");
            map2.put("A053", "RE02");
            map2.put("A076", "RE02");
        }
        if (i15 < 23) {
            EnumC23297f enumC23297f3 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr3 = EnumC23298g.f92339x;
            map2.put("A012", "RE02");
            map2.put("A022", "RE02");
            map2.put("A025", "RE02");
            map2.put("A027", "RE02");
            map2.put("A062", "RE02");
            map2.put("A063", "RE02");
            map2.put("A064", "RE02");
            map2.put("A103", "RE02");
            map2.put("A123", "RE02");
        }
        if (i15 > 23) {
            EnumC23297f enumC23297f4 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr4 = EnumC23298g.f92339x;
            map2.put("A079", "RE02");
        }
        if (i15 < 22) {
            EnumC23297f enumC23297f5 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr5 = EnumC23298g.f92339x;
            map2.put("A026", "RE02");
        }
        if (i15 < 28) {
            EnumC23297f enumC23297f6 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr6 = EnumC23298g.f92339x;
            map2.put("A138", "RE02");
            map2.put("A139", "RE02");
            map2.put("A150", "RE02");
        }
        if (i15 < 29) {
            EnumC23297f enumC23297f7 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr7 = EnumC23298g.f92339x;
            map2.put("A141", "RE02");
            map2.put("A142", "RE02");
            map2.put("A143", "RE02");
            map2.put("A152", "RE02");
        }
        if (i15 < 30) {
            EnumC23297f enumC23297f8 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr8 = EnumC23298g.f92339x;
            map2.put("A145", "RE02");
            map2.put("A149", "RE02");
            map2.put("A151", "RE02");
        }
        if (i15 < 31) {
            EnumC23297f enumC23297f9 = EnumC23297f.PARAM_PLATFORM;
            EnumC23298g[] enumC23298gArr9 = EnumC23298g.f92339x;
            map2.put("A153", "RE02");
            map2.put("A154", "RE02");
            map2.put("A155", "RE02");
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, map2);
        HashMap map3 = new HashMap();
        EnumC23297f enumC23297f10 = EnumC23297f.PARAM_PLATFORM;
        EnumC23298g[] enumC23298gArr10 = EnumC23298g.f92339x;
        map3.put("A028", "RE03");
        map3.put("A029", "RE03");
        map3.put("A030", "RE03");
        map3.put("A031", "RE03");
        map3.put("A032", "RE03");
        map3.put("A033", "RE03");
        map3.put("A034", "RE03");
        map3.put("A035", "RE03");
        map3.put("A036", "RE03");
        map3.put("A037", "RE03");
        map3.put("A038", "RE03");
        map3.put("C011", "RE03");
        map3.put("C012", "RE03");
        map3.put("C009", "RE03");
        map3.put("A039", "RE03");
        map3.put("A040", "RE03");
        map3.put("A041", "RE03");
        map3.put("A001", "RE03");
        map3.put("A002", "RE03");
        map3.put("A003", "RE03");
        map3.put("A004", "RE03");
        map3.put("A017", "RE03");
        map3.put("A019", "RE03");
        map3.put("A020", "RE03");
        map3.put("A025", "RE03");
        map3.put("A027", "RE03");
        map3.put("A053", "RE03");
        map3.put("A076", "RE03");
        map3.put("A143", "RE03");
        map3.put("A146", "RE03");
        map3.put("A147", "RE03");
        map3.put("A148", "RE03");
        map3.put("A149", "RE03");
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, map3);
        HashMap map4 = new HashMap();
        map4.put("A140", "RE04");
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("DPNA", new JSONObject(AbstractC25247g0.m73995d0(linkedHashMapM73995d1, map4)));
        ArrayList arrayListM67388a = ((C23294c) c13668i.f48456c).m67388a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM67388a, 10));
        Iterator it = arrayListM67388a.iterator();
        while (it.hasNext()) {
            arrayList.add(((C23306o) it.next()).f92352w);
        }
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("SW", new JSONArray((Collection) arrayList));
        AbstractC22676k.m65749i(jSONObjectPut4, "put(...)");
        return jSONObjectPut4;
    }

    /* JADX INFO: renamed from: e */
    public C20245d m38534e() {
        return (C20245d) this.f48459f;
    }

    /* JADX INFO: renamed from: f */
    public C2570m m38535f() {
        return (C2570m) this.f48456c;
    }

    /* JADX INFO: renamed from: g */
    public void m38536g(C15981i c15981i, int i13) {
        byte[] bArr;
        long j7;
        C17414a c17414a;
        String str;
        C17414a c17414a2;
        int i14;
        C13322b c13322bM1679c;
        String str2;
        Integer numValueOf;
        String str3;
        Iterator it;
        C25126d c25126d;
        final C13668i c13668i = this;
        final C15981i c15981i2 = c15981i;
        byte[] bArr2 = c15981i2.f60489b;
        InterfaceC28023b interfaceC28023b = (InterfaceC28023b) c13668i.f48459f;
        InterfaceC17419f interfaceC17419fM49437a = ((C17418e) c13668i.f48455b).m49437a(c15981i2.f60488a);
        long j13 = 0;
        while (true) {
            final int i15 = 0;
            C26827i c26827i = (C26827i) interfaceC28023b;
            if (!((Boolean) c26827i.m80062s(new InterfaceC28022a(c13668i) { // from class: mm.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C13668i f101017x;

                {
                    this.f101017x = c13668i;
                }

                @Override // om.InterfaceC28022a
                public final Object execute() {
                    Boolean bool;
                    switch (i15) {
                        case 0:
                            C15981i c15981i3 = c15981i2;
                            C26827i c26827i2 = (C26827i) ((InterfaceC26822d) this.f101017x.f48456c);
                            SQLiteDatabase sQLiteDatabaseM80058b = c26827i2.m80058b();
                            sQLiteDatabaseM80058b.beginTransaction();
                            try {
                                Long lM80056h = C26827i.m80056h(sQLiteDatabaseM80058b, c15981i3);
                                if (lM80056h == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c26827i2.m80058b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM80056h.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                }
                                sQLiteDatabaseM80058b.setTransactionSuccessful();
                                sQLiteDatabaseM80058b.endTransaction();
                                return bool;
                            } catch (Throwable th4) {
                                sQLiteDatabaseM80058b.endTransaction();
                                throw th4;
                            }
                        default:
                            C26827i c26827i3 = (C26827i) ((InterfaceC26822d) this.f101017x.f48456c);
                            c26827i3.getClass();
                            return (Iterable) c26827i3.m80059i(new C4312c(22, c26827i3, c15981i2));
                    }
                }
            })).booleanValue()) {
                c26827i.m80062s(new C20669h1(j13, c13668i, c15981i2));
                return;
            }
            final int i16 = 1;
            Iterable iterable = (Iterable) c26827i.m80062s(new InterfaceC28022a(c13668i) { // from class: mm.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C13668i f101017x;

                {
                    this.f101017x = c13668i;
                }

                @Override // om.InterfaceC28022a
                public final Object execute() {
                    Boolean bool;
                    switch (i16) {
                        case 0:
                            C15981i c15981i3 = c15981i2;
                            C26827i c26827i2 = (C26827i) ((InterfaceC26822d) this.f101017x.f48456c);
                            SQLiteDatabase sQLiteDatabaseM80058b = c26827i2.m80058b();
                            sQLiteDatabaseM80058b.beginTransaction();
                            try {
                                Long lM80056h = C26827i.m80056h(sQLiteDatabaseM80058b, c15981i3);
                                if (lM80056h == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c26827i2.m80058b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM80056h.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                }
                                sQLiteDatabaseM80058b.setTransactionSuccessful();
                                sQLiteDatabaseM80058b.endTransaction();
                                return bool;
                            } catch (Throwable th4) {
                                sQLiteDatabaseM80058b.endTransaction();
                                throw th4;
                            }
                        default:
                            C26827i c26827i3 = (C26827i) ((InterfaceC26822d) this.f101017x.f48456c);
                            c26827i3.getClass();
                            return (Iterable) c26827i3.m80059i(new C4312c(22, c26827i3, c15981i2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i17 = 4;
            if (interfaceC17419fM49437a == null) {
                AbstractC12240d.m34088y(c15981i2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                c17414a2 = new C17414a(3, -1L);
                bArr = bArr2;
                j7 = j13;
            } else {
                ArrayList<C15980h> arrayList = new ArrayList();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C26820b) it3.next()).f106980c);
                }
                String str4 = "proto";
                if (bArr2 != null) {
                    InterfaceC26821c interfaceC26821c = (InterfaceC26821c) c13668i.f48462i;
                    Objects.requireNonNull(interfaceC26821c);
                    C21779a c21779a = (C21779a) c26827i.m80062s(new C17508p(interfaceC26821c, 29));
                    C0332w0 c0332w0 = new C0332w0(i17);
                    c0332w0.f1166G = new HashMap();
                    c0332w0.f1164E = Long.valueOf(((InterfaceC29353a) c13668i.f48460g).getTime());
                    c0332w0.f1165F = Long.valueOf(((InterfaceC29353a) c13668i.f48461h).getTime());
                    c0332w0.f1170z = "GDT_CLIENT_METRICS";
                    C12173c c12173c = new C12173c("proto");
                    c21779a.getClass();
                    C15990r c15990r = AbstractC15987o.f60501a;
                    c15990r.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c15990r.m45138A(c21779a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c0332w0.f1169y = new C15985m(c12173c, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C13323c) interfaceC17419fM49437a).m37430a(c0332w0.m860m()));
                }
                C13323c c13323c = (C13323c) interfaceC17419fM49437a;
                HashMap map = new HashMap();
                for (C15980h c15980h : arrayList) {
                    String str5 = c15980h.f60482a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(c15980h);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c15980h);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    C15980h c15980h2 = (C15980h) ((List) entry.getValue()).get(0);
                    EnumC14593w enumC14593w = EnumC14593w.f53667w;
                    long time = c13323c.f46166f.getTime();
                    long time2 = c13323c.f46165e.getTime();
                    C14580j c14580j = new C14580j(new C14578h(Integer.valueOf(c15980h2.m45123b("sdk-version")), c15980h2.m45122a("model"), c15980h2.m45122a("hardware"), c15980h2.m45122a("device"), c15980h2.m45122a("product"), c15980h2.m45122a("os-uild"), c15980h2.m45122a("manufacturer"), c15980h2.m45122a("fingerprint"), c15980h2.m45122a("locale"), c15980h2.m45122a("country"), c15980h2.m45122a("mcc_mnc"), c15980h2.m45122a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C15980h c15980h3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C15985m c15985m = c15980h3.f60484c;
                        long j14 = j13;
                        C12173c c12173c2 = c15985m.f60498a;
                        byte[] bArr4 = c15985m.f60499b;
                        if (c12173c2.equals(new C12173c(str4))) {
                            c25126d = new C25126d(1);
                            c25126d.f98479E = bArr4;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (c12173c2.equals(new C12173c("json"))) {
                                String str6 = new String(bArr4, Charset.forName("UTF-8"));
                                c25126d = new C25126d(1);
                                c25126d.f98480F = str6;
                            } else {
                                it = it4;
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + c12173c2 + ". Skipping...");
                                }
                            }
                            it4 = it;
                            bArr2 = bArr3;
                            j13 = j14;
                            str4 = str3;
                        }
                        it = it4;
                        c25126d.f98484x = Long.valueOf(c15980h3.f60485d);
                        c25126d.f98486z = Long.valueOf(c15980h3.f60486e);
                        String str7 = (String) c15980h3.f60487f.get("tz-offset");
                        c25126d.f98481G = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        c25126d.f98482H = new C14584n((EnumC14591u) EnumC14591u.f53665w.get(c15980h3.m45123b("net-type")), (EnumC14590t) EnumC14590t.f53663w.get(c15980h3.m45123b("mobile-subtype")));
                        Integer num = c15980h3.f60483b;
                        if (num != null) {
                            c25126d.f98485y = num;
                        }
                        String strM8299l = ((Long) c25126d.f98484x) == null ? " eventTimeMs" : "";
                        if (((Long) c25126d.f98486z) == null) {
                            strM8299l = strM8299l.concat(" eventUptimeMs");
                        }
                        if (((Long) c25126d.f98481G) == null) {
                            strM8299l = AbstractC2875y.m8299l(strM8299l, " timezoneOffsetSeconds");
                        }
                        if (!strM8299l.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strM8299l));
                        }
                        arrayList4.add(new C14581k(((Long) c25126d.f98484x).longValue(), (Integer) c25126d.f98485y, ((Long) c25126d.f98486z).longValue(), (byte[]) c25126d.f98479E, (String) c25126d.f98480F, ((Long) c25126d.f98481G).longValue(), (C14584n) c25126d.f98482H));
                        it4 = it;
                        bArr2 = bArr3;
                        j13 = j14;
                        str4 = str3;
                    }
                    arrayList3.add(new C14582l(time, time2, c14580j, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                    str4 = str4;
                }
                bArr = bArr2;
                j7 = j13;
                C14579i c14579i = new C14579i(arrayList3);
                URL urlM37429b = c13323c.f46164d;
                if (bArr != null) {
                    try {
                        C13321a c13321aM37428a = C13321a.m37428a(bArr);
                        str = c13321aM37428a.f46157b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = c13321aM37428a.f46156a;
                        if (str8 != null) {
                            urlM37429b = C13323c.m37429b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c17414a = new C17414a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i18 = 19;
                    C0352d c0352d = new C0352d(urlM37429b, c14579i, str, i18);
                    C0680g0 c0680g0 = new C0680g0(c13323c, 28);
                    int i19 = 5;
                    do {
                        c13322bM1679c = c0680g0.m1679c(c0352d);
                        URL url = (URL) c13322bM1679c.f46160c;
                        if (url != null) {
                            AbstractC12240d.m34088y(url, "CctTransportBackend", "Following redirect to: %s");
                            c0352d = new C0352d(url, (C14579i) c0352d.f1238y, (String) c0352d.f1239z, i18);
                        } else {
                            c0352d = null;
                        }
                        if (c0352d == null) {
                            break;
                        } else {
                            i19--;
                        }
                    } while (i19 >= 1);
                    int i24 = c13322bM1679c.f46158a;
                    if (i24 == 200) {
                        c17414a2 = new C17414a(1, c13322bM1679c.f46159b);
                    } else {
                        if (i24 >= 500 || i24 == 404) {
                            c17414a = new C17414a(2, -1L);
                        } else if (i24 == 400) {
                            try {
                                c17414a = new C17414a(4, -1L);
                            } catch (IOException e5) {
                                e = e5;
                                AbstractC12240d.m34035A("CctTransportBackend", "Could not make request to the backend", e);
                                i14 = 2;
                                c17414a2 = new C17414a(2, -1L);
                            }
                        } else {
                            c17414a = new C17414a(3, -1L);
                        }
                        c17414a2 = c17414a;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            }
            i14 = 2;
            int i25 = c17414a2.f67499a;
            if (i25 == i14) {
                c26827i.m80062s(new C17613b(this, iterable, c15981i, j7));
                ((C15990r) this.f48457d).m45149O(c15981i, i13 + 1, true);
                return;
            }
            c13668i = this;
            c15981i2 = c15981i;
            long jMax = j7;
            int i26 = 1;
            c26827i.m80062s(new C4312c(20, c13668i, iterable));
            if (i25 == 1) {
                jMax = Math.max(jMax, c17414a2.f67500b);
                if (bArr != null) {
                    c26827i.m80062s(new C25680d(c13668i, i26));
                }
            } else if (i25 == 4) {
                HashMap map2 = new HashMap();
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    String str9 = ((C26820b) it5.next()).f106980c.f60482a;
                    if (map2.containsKey(str9)) {
                        map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                    } else {
                        map2.put(str9, 1);
                    }
                }
                c26827i.m80062s(new C4312c(21, c13668i, map2));
            }
            j13 = jMax;
            bArr2 = bArr;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m38537h(InterfaceC34879h interfaceC34879h) {
        this.f48458e = interfaceC34879h;
    }

    /* JADX INFO: renamed from: i */
    public void m38538i(String str) {
        this.f48461h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m38539j(InterfaceC34885l interfaceC34885l) {
        this.f48457d = interfaceC34885l;
    }

    /* JADX INFO: renamed from: k */
    public void m38540k(String str) {
        this.f48462i = str;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010c A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0134 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0138 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0143 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015c A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0160 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0174 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0178 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0189 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:30:0x0106, B:32:0x010c, B:35:0x0134, B:37:0x0138, B:39:0x0143, B:40:0x014b, B:41:0x015c, B:43:0x0160, B:44:0x0174, B:46:0x0178, B:47:0x0189, B:48:0x018e), top: B:65:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: m */
    public Object m38541m(C29910i0 c29910i0, AbstractC32269c abstractC32269c) {
        C29900d0 c29900d0;
        C13668i c13668i;
        C13668i c13668i2;
        C29936v0 c29936v0;
        C29919n c29919n;
        Object objM107888l;
        Throwable thM68037a;
        AbstractC29931t abstractC29931t;
        C29910i0 c29910i1 = c29910i0;
        if (abstractC32269c instanceof C29900d0) {
            c29900d0 = (C29900d0) abstractC32269c;
            int i13 = c29900d0.f122162H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29900d0.f122162H = i13 - Integer.MIN_VALUE;
            } else {
                c29900d0 = new C29900d0(this, abstractC32269c);
            }
        } else {
            c29900d0 = new C29900d0(this, abstractC32269c);
        }
        Object objM91524b = c29900d0.f122160F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29900d0.f122162H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM91524b);
            ((AbstractC37926s0) this.f48462i).mo91521s();
            try {
                C23548b c23548b = (C23548b) this.f48457d;
                C29902e0 c29902e0 = (C29902e0) this.f48455b;
                String str = c29910i1.f122193y.f122206z;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C29893a c29893aM68162C = c23548b.m68162C(c29902e0.m91514a(str));
                String acsUrl = c29893aM68162C.f122130w;
                ECPublicKey eCPublicKey = c29893aM68162C.f122131x;
                C29926q0 c29926q0 = (C29926q0) this.f48454a;
                C29915l c29915l = c29910i1.f122193y;
                String str2 = c29915l.f122204x;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str3 = c29915l.f122203w;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C30897b c30897b = new C30897b("2.2.0", str3, str2, c29926q0, c29915l.f122202E, null, 4064);
                C29934u0 c29934u0 = (C29934u0) this.f48459f;
                C26212c c26212c = (C26212c) this.f48461h;
                AbstractC22676k.m65750j(acsUrl, "acsUrl");
                C29938w0 c29938w0 = new C29938w0(acsUrl, c26212c, (InterfaceC30063j) c29934u0.f122249x);
                C22365e c22365e = AbstractC3050q0.f12077a;
                C29936v0 c29936v1 = new C29936v0(c29938w0, c26212c, ExecutorC22364d.f87316w);
                C27504b c27504b = (C27504b) this.f48456c;
                String str4 = c29910i1.f122191w;
                byte[] encoded = c29910i1.f122192x.getPrivate().getEncoded();
                AbstractC22676k.m65749i(encoded, "getEncoded(...)");
                byte[] encoded2 = eCPublicKey.getEncoded();
                AbstractC22676k.m65749i(encoded2, "getEncoded(...)");
                C29919n c29919n2 = new C29919n(c27504b, str4, c30897b, acsUrl, new C29917m(encoded, encoded2));
                C38445a c38445a = (C38445a) this.f48458e;
                c29900d0.f122163w = this;
                c29900d0.f122164x = c29910i1;
                c29900d0.f122165y = this;
                c29900d0.f122166z = c29936v1;
                c29900d0.f122159E = c29919n2;
                c29900d0.f122162H = 1;
                objM91524b = new C29928r0(c29919n2).m91522a((C26212c) c38445a.f164636x, (InterfaceC30063j) c38445a.f164637y).m91524b(c30897b, c29900d0);
                if (objM91524b == enumC31071a) {
                    return enumC31071a;
                }
                c13668i = this;
                c13668i2 = c13668i;
                c29936v0 = c29936v1;
                c29919n = c29919n2;
                abstractC29931t = (AbstractC29931t) objM91524b;
                if (abstractC29931t instanceof C29927r) {
                    objM107888l = new C29916l0(new C33517s(((C29927r) abstractC29931t).f122228x, ((C29927r) abstractC29931t).f122227w, (C24992h) c13668i2.f48460g, c29919n, new C29928r0(c29919n), c29910i1.f122194z, c29910i1.f122190E));
                } else if (abstractC29931t instanceof C29923p) {
                    if (((C29923p) abstractC29931t).f122223w.f127436E == EnumC30901f.ThreeDsSdk) {
                        c29936v0.m91540a(((C29923p) abstractC29931t).f122223w);
                    }
                    objM107888l = new C29914k0(new C29937w(((C29923p) abstractC29931t).f122223w, null, c29910i1.f122190E));
                } else if (abstractC29931t instanceof C29929s) {
                    c29936v0.m91540a(((C29929s) abstractC29931t).f122231w);
                    objM107888l = new C29914k0(new C29942z(null, null, c29910i1.f122190E));
                } else {
                    if (abstractC29931t instanceof C29925q) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM107888l = new C29914k0(new C29939x(((C29925q) abstractC29931t).f122225w, null, c29910i1.f122190E));
                }
            } catch (Throwable th3) {
                th = th3;
                c13668i = this;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    return objM107888l;
                }
                ((C26212c) c13668i.f48461h).m77828c(thM68037a);
                ((AbstractC37926s0) c13668i.f48462i).mo91520o("Exception during initial challenge request.", thM68037a);
                return new C29914k0(new C29939x(thM68037a, null, c29910i1.f122190E));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C29919n c29919n3 = c29900d0.f122159E;
            c29936v0 = c29900d0.f122166z;
            c13668i2 = c29900d0.f122165y;
            C29910i0 c29910i2 = c29900d0.f122164x;
            c13668i = c29900d0.f122163w;
            try {
                AbstractC34132o.m107864I(objM91524b);
                c29919n = c29919n3;
                c29910i1 = c29910i2;
                try {
                    abstractC29931t = (AbstractC29931t) objM91524b;
                    if (abstractC29931t instanceof C29927r) {
                        objM107888l = new C29916l0(new C33517s(((C29927r) abstractC29931t).f122228x, ((C29927r) abstractC29931t).f122227w, (C24992h) c13668i2.f48460g, c29919n, new C29928r0(c29919n), c29910i1.f122194z, c29910i1.f122190E));
                    } else if (abstractC29931t instanceof C29923p) {
                        if (((C29923p) abstractC29931t).f122223w.f127436E == EnumC30901f.ThreeDsSdk) {
                            c29936v0.m91540a(((C29923p) abstractC29931t).f122223w);
                        }
                        objM107888l = new C29914k0(new C29937w(((C29923p) abstractC29931t).f122223w, null, c29910i1.f122190E));
                    } else if (abstractC29931t instanceof C29929s) {
                        c29936v0.m91540a(((C29929s) abstractC29931t).f122231w);
                        objM107888l = new C29914k0(new C29942z(null, null, c29910i1.f122190E));
                    } else {
                        if (abstractC29931t instanceof C29925q) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM107888l = new C29914k0(new C29939x(((C29925q) abstractC29931t).f122225w, null, c29910i1.f122190E));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
            } catch (Throwable th5) {
                th = th5;
                c29910i1 = c29910i2;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    return objM107888l;
                }
                ((C26212c) c13668i.f48461h).m77828c(thM68037a);
                ((AbstractC37926s0) c13668i.f48462i).mo91520o("Exception during initial challenge request.", thM68037a);
                return new C29914k0(new C29939x(thM68037a, null, c29910i1.f122190E));
            }
        }
        thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a == null) {
            return objM107888l;
        }
        ((C26212c) c13668i.f48461h).m77828c(thM68037a);
        ((AbstractC37926s0) c13668i.f48462i).mo91520o("Exception during initial challenge request.", thM68037a);
        return new C29914k0(new C29939x(thM68037a, null, c29910i1.f122190E));
    }

    /* JADX INFO: renamed from: n */
    public void m38542n(int i13) {
        while (!((LinkedList) this.f48456c).isEmpty() && ((InterfaceC10939f) ((LinkedList) this.f48456c).getLast()).mo28989a() >= i13) {
            ((LinkedList) this.f48456c).removeLast();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m38543o(Bundle bundle, InterfaceC10939f interfaceC10939f) {
        if (((C29938w0) this.f48454a) != null) {
            interfaceC10939f.mo28990b();
            return;
        }
        if (((LinkedList) this.f48456c) == null) {
            this.f48456c = new LinkedList();
        }
        ((LinkedList) this.f48456c).add(interfaceC10939f);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f48455b;
            if (bundle2 == null) {
                this.f48455b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        C31624i c31624i = (C31624i) this.f48457d;
        this.f48460g = c31624i;
        if (c31624i == null || ((C29938w0) this.f48454a) != null) {
            return;
        }
        try {
            Context context = (Context) this.f48459f;
            synchronized (AbstractC35148d.class) {
                AbstractC35148d.m111151B(context);
            }
            C36262f c36262fM115717n0 = AbstractC31479j.m96946y((Context) this.f48459f).m115717n0(new BinderC10935b((Context) this.f48459f), (GoogleMapOptions) this.f48461h);
            if (c36262fM115717n0 == null) {
                return;
            }
            ((C31624i) this.f48460g).m97717y(new C29938w0((C35147c) this.f48458e, c36262fM115717n0));
            Iterator it = ((ArrayList) this.f48462i).iterator();
            while (it.hasNext()) {
                ((C29938w0) this.f48454a).m91570t((C13633t) it.next());
            }
            ((ArrayList) this.f48462i).clear();
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    public C13668i(InterfaceC21461d inputType, InterfaceC21461d outputType) {
        AbstractC22676k.m65750j(inputType, "inputType");
        AbstractC22676k.m65750j(outputType, "outputType");
        this.f48454a = inputType;
        this.f48455b = outputType;
        C2570m c2570m = new C2570m(20);
        InterfaceC25526h.f99937a.getClass();
        c2570m.f9987x = C25525g.f99936b;
        c2570m.f9988y = EnumC31369d.f129030x;
        c2570m.f9989z = C15768i.f59433w;
        c2570m.f9984E = C34893t.f146944n;
        this.f48456c = c2570m;
        this.f48459f = new C20245d(4);
        this.f48460g = new C12002a();
    }
}
