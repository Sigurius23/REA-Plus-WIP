package p547v8;

import ad3.AbstractC0757c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1439b0;
import androidx.health.platform.client.proto.C1464g0;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.C1552y;
import aq1.C1909c;
import b01.C2185f;
import b30.C2531h0;
import b30.C2539i0;
import b30.C2557k2;
import b30.C2603q0;
import bd3.C3117d0;
import bd3.C3121f0;
import bd3.C3124h;
import bd3.EnumC3133l0;
import bf0.C3195g;
import bi.AbstractC3269g;
import bi.C3279q;
import bi.C3280r;
import bi.C3281s;
import bi.C3282t;
import c63.C4277a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.BannerFormFactor;
import com.amplitude.android.engagement.types.BannerPosition;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5574e;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d40.AbstractC11673r;
import e30.AbstractC12605c;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ec3.C13081r1;
import f63.AbstractC14155c;
import fc0.C14361e;
import fi.ViewOnAttachStateChangeListenerC14514t;
import g40.C15341e;
import g40.InterfaceC15450y2;
import gb.C15657r;
import ge3.AbstractC15751g;
import h00.EnumC16505h0;
import h20.C16651f;
import h20.C16670i0;
import h20.C16776z4;
import h40.AbstractC16836b;
import h40.C16839e;
import h40.C16845k;
import ha3.C17062e;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.ktor.utils.p228io.InterfaceC20021n;
import io.sentry.C20578u6;
import io.sentry.EnumC20550t6;
import io.sentry.android.replay.C20253w;
import j40.C21312a;
import j93.AbstractC21478l0;
import ja3.C21510f0;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka3.C22309a;
import l83.C23454a0;
import l83.C23465k;
import lb3.EnumC23761b1;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import n53.C26318e;
import n83.C26463f;
import na.C26488a;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26624l;
import ne3.C26639s0;
import ne3.C26646z;
import ne3.InterfaceC26620j;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import oe3.C27889i;
import oe3.C27890j;
import p000.AbstractC11266d;
import p000.C17820i;
import p002a0.C0030i1;
import p003a1.C0106e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2298d;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2378g1;
import p031b9.AbstractC2875y;
import p031b9.C2852m1;
import p043c4.AbstractC3979v;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p118ei.C13217d;
import p136f4.C14051c;
import p163g1.AbstractC14959b1;
import p163g1.C15069l3;
import p169g7.AbstractC15540a;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p249jc.C21567b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23138n;
import p292l1.C23103h0;
import p292l1.C23132m;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25021j;
import p319m4.C25013b;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;
import p319m4.C25019h;
import p319m4.C25020i;
import p328mj.C25607n;
import p333n4.C26259o;
import p333n4.InterfaceC26247c;
import p336n7.C26411a;
import p336n7.C26412b;
import p336n7.C26413c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p40.C28826a;
import p401pj.AbstractC29265e;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p450r5.RunnableC30928b;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32128i;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p525uj.AbstractC35032j;
import p571w3.EnumC36774j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p635y2.InterfaceC39127r0;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rb3.InterfaceC31197e;
import ro.C31624i;
import s83.AbstractC32269c;
import sj.C32561l;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34838r0;
import ud3.C34850x0;
import v00.C35459c0;
import va3.AbstractC35846d;
import wb3.AbstractC37056f;
import wc3.InterfaceC37137b;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: v8.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35785b {

    /* JADX INFO: renamed from: a */
    public static AudioManager f152188a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: A */
    public static final C26413c m113378A(C1533u c1533u) {
        String strM4841G;
        String str;
        String strM4854U = c1533u.m4862c0() ? c1533u.m4854U() : "";
        AbstractC22676k.m65749i(strM4854U, "if (hasUid()) uid else Metadata.EMPTY_ID");
        String strM4737q = c1533u.m4843I().m4737q();
        AbstractC22676k.m65749i(strM4737q, "dataOrigin.applicationId");
        C26411a c26411a = new C26411a(strM4737q);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c1533u.m4855V());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(updateTimeMillis)");
        if (c1533u.m4858Y()) {
            strM4841G = c1533u.m4841G();
            str = null;
        } else {
            strM4841G = null;
            str = null;
        }
        long jM4842H = c1533u.m4842H();
        C26412b c26412b = str;
        if (c1533u.m4859Z()) {
            C1552y device = c1533u.m4845L();
            AbstractC22676k.m65749i(device, "device");
            String strM4941t = device.m4944w() ? device.m4941t() : str;
            String strM4942u = str;
            if (device.m4945x()) {
                strM4942u = device.m4942u();
            }
            ?? r14 = AbstractC15540a.f58269a;
            String type = device.m4943v();
            AbstractC22676k.m65749i(type, "type");
            c26412b = new C26412b(strM4941t, strM4942u, ((Number) r14.getOrDefault(type, 0)).intValue());
        }
        return new C26413c(strM4854U, c26411a, instantOfEpochMilli, strM4841G, jM4842H, c26412b, c1533u.m4849P());
    }

    /* JADX INFO: renamed from: B */
    public static final ViewOnAttachStateChangeListenerC14514t m113379B(ImageView imageView) {
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514t;
        Object tag = imageView.getTag(R.id.coil3_request_manager);
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514t2 = tag instanceof ViewOnAttachStateChangeListenerC14514t ? (ViewOnAttachStateChangeListenerC14514t) tag : null;
        if (viewOnAttachStateChangeListenerC14514t2 != null) {
            return viewOnAttachStateChangeListenerC14514t2;
        }
        synchronized (imageView) {
            try {
                Object tag2 = imageView.getTag(R.id.coil3_request_manager);
                viewOnAttachStateChangeListenerC14514t = tag2 instanceof ViewOnAttachStateChangeListenerC14514t ? (ViewOnAttachStateChangeListenerC14514t) tag2 : null;
                if (viewOnAttachStateChangeListenerC14514t == null) {
                    viewOnAttachStateChangeListenerC14514t = new ViewOnAttachStateChangeListenerC14514t(imageView);
                    imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14514t);
                    imageView.setTag(R.id.coil3_request_manager, viewOnAttachStateChangeListenerC14514t);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return viewOnAttachStateChangeListenerC14514t;
    }

    /* JADX INFO: renamed from: C */
    public static final Instant m113380C(C1533u c1533u) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c1533u.m4851R());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(startTimeMillis)");
        return instantOfEpochMilli;
    }

    /* JADX INFO: renamed from: D */
    public static final ZoneOffset m113381D(C1533u c1533u) {
        if (c1533u.m4861b0()) {
            return ZoneOffset.ofTotalSeconds(c1533u.m4852S());
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final String m113382E(C1533u c1533u, String str) {
        C1464g0 c1464g0 = (C1464g0) c1533u.m4856W().get(str);
        if (c1464g0 != null) {
            return c1464g0.m4623z();
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final Instant m113383F(C1533u c1533u) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c1533u.m4848O());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(instantTimeMillis)");
        return instantOfEpochMilli;
    }

    /* JADX INFO: renamed from: G */
    public static final ZoneOffset m113384G(C1533u c1533u) {
        if (c1533u.m4863d0()) {
            return ZoneOffset.ofTotalSeconds(c1533u.m4857X());
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static String m113385H(InterfaceC31197e interfaceC31197e, C17062e c17062e) {
        if (interfaceC31197e.mo96148a(c17062e)) {
            return null;
        }
        return interfaceC31197e.getDescription();
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m113386I(int i13, int i14) {
        int i15;
        if (i14 < 100) {
            Calendar calendar = Calendar.getInstance();
            AbstractC22676k.m65749i(calendar, "getInstance(...)");
            int i16 = calendar.get(1);
            int i17 = i16 / 100;
            int i18 = i16 % 100;
            if (i18 > 80 && i14 < 20) {
                i17++;
            } else if (i18 < 20 && i14 > 80) {
                i17--;
            }
            i14 += i17 * 100;
        }
        Calendar calendar2 = Calendar.getInstance();
        AbstractC22676k.m65749i(calendar2, "getInstance(...)");
        if (1 > i13 || i13 >= 13 || i14 < 0 || i14 >= 9981 || i14 < (i15 = calendar2.get(1))) {
            return false;
        }
        return i14 > i15 || i13 >= calendar2.get(2) + 1;
    }

    /* JADX INFO: renamed from: J */
    public static final int m113387J(C1533u c1533u, String str, Map stringToIntMap) {
        AbstractC22676k.m65750j(stringToIntMap, "stringToIntMap");
        C1464g0 c1464g0 = (C1464g0) c1533u.m4856W().get(str);
        String strM4621x = c1464g0 != null ? c1464g0.m4621x() : null;
        if (strM4621x == null) {
            return 0;
        }
        return ((Number) stringToIntMap.getOrDefault(strM4621x, 0)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: K */
    public static final String m113388K(Context context, String str) {
        Integer numValueOf = Integer.valueOf(R.string.stripe_invalid_card_number);
        Integer numValueOf2 = Integer.valueOf(R.string.stripe_invalid_cvc);
        AbstractC22676k.m65750j(context, "<this>");
        if (str != null) {
            switch (str.hashCode()) {
                case -2011738994:
                    numValueOf = !str.equals("generic_decline") ? null : Integer.valueOf(R.string.stripe_generic_decline);
                    break;
                case -1109249604:
                    numValueOf = !str.equals("invalid_expiry_month") ? null : Integer.valueOf(R.string.stripe_invalid_expiry_month);
                    break;
                case -952840184:
                    if (!str.equals("invalid_cvc")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf2;
                    }
                    break;
                case -857379549:
                    if (!str.equals("incorrect_number")) {
                        numValueOf = null;
                    }
                    break;
                case -822522913:
                    numValueOf = !str.equals("invalid_owner_name") ? null : Integer.valueOf(R.string.stripe_invalid_owner_name);
                    break;
                case -343766564:
                    numValueOf = !str.equals("processing_error") ? null : Integer.valueOf(R.string.stripe_processing_error);
                    break;
                case -308669807:
                    if (!str.equals("invalid_number")) {
                        numValueOf = null;
                    }
                    break;
                case 147203197:
                    numValueOf = !str.equals("card_declined") ? null : Integer.valueOf(R.string.stripe_card_declined);
                    break;
                case 657301889:
                    numValueOf = !str.equals("invalid_expiry_year") ? null : Integer.valueOf(R.string.stripe_invalid_expiry_year);
                    break;
                case 1436957674:
                    numValueOf = !str.equals("expired_card") ? null : Integer.valueOf(R.string.stripe_expired_card);
                    break;
                case 1705388818:
                    numValueOf = !str.equals("insufficient_funds") ? null : Integer.valueOf(R.string.stripe_insufficient_funds);
                    break;
                case 1737231027:
                    numValueOf = !str.equals("invalid_bank_account_iban") ? null : Integer.valueOf(R.string.stripe_invalid_bank_account_iban);
                    break;
                case 2037370550:
                    if (!str.equals("incorrect_cvc")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf2;
                    }
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return context.getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static final C26639s0 m113389L(C26611e0 c26611e0, AbstractC26632p fileSystem, Function1 function1) {
        Throwable th3;
        Throwable th4;
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        C26646z c26646zMo79150b0 = fileSystem.mo79150b0(c26611e0);
        try {
            long size = c26646zMo79150b0.size() - ((long) 22);
            long j7 = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + c26646zMo79150b0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            while (true) {
                C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(size));
                try {
                    if (c26621j0M79158c.mo79192Q0() == 101010256) {
                        int iM79239h = c26621j0M79158c.m79239h() & 65535;
                        int iM79239h2 = c26621j0M79158c.m79239h() & 65535;
                        long jM79239h = c26621j0M79158c.m79239h() & 65535;
                        if (jM79239h != (c26621j0M79158c.m79239h() & 65535) || iM79239h != 0 || iM79239h2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        long j13 = j7;
                        c26621j0M79158c.skip(4L);
                        long jMo79192Q0 = 4294967295L & ((long) c26621j0M79158c.mo79192Q0());
                        int iM79239h3 = c26621j0M79158c.m79239h() & 65535;
                        C26488a c26488a = new C26488a(jM79239h, jMo79192Q0, iM79239h3);
                        c26621j0M79158c.mo79215k0(iM79239h3);
                        c26621j0M79158c.close();
                        long j14 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j14 > j13) {
                            C26621j0 c26621j0M79158c2 = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(j14));
                            try {
                                if (c26621j0M79158c2.mo79192Q0() == 117853008) {
                                    int iMo79192Q0 = c26621j0M79158c2.mo79192Q0();
                                    long jMo79204e0 = c26621j0M79158c2.mo79204e0();
                                    if (c26621j0M79158c2.mo79192Q0() != 1 || iMo79192Q0 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    C26621j0 c26621j0M79158c3 = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(jMo79204e0));
                                    try {
                                        int iMo79192Q1 = c26621j0M79158c3.mo79192Q0();
                                        if (iMo79192Q1 != 101075792) {
                                            throw new IOException("bad zip: expected " + m113430y(101075792) + " but was " + m113430y(iMo79192Q1));
                                        }
                                        c26621j0M79158c3.skip(12L);
                                        int iMo79192Q2 = c26621j0M79158c3.mo79192Q0();
                                        int iMo79192Q3 = c26621j0M79158c3.mo79192Q0();
                                        long jMo79204e1 = c26621j0M79158c3.mo79204e0();
                                        if (jMo79204e1 != c26621j0M79158c3.mo79204e0() || iMo79192Q2 != 0 || iMo79192Q3 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        c26621j0M79158c3.skip(8L);
                                        C26488a c26488a2 = new C26488a(jMo79204e1, c26621j0M79158c3.mo79204e0(), iM79239h3);
                                        try {
                                            c26621j0M79158c3.close();
                                            th4 = null;
                                        } catch (Throwable th6) {
                                            th4 = th6;
                                        }
                                        c26488a = c26488a2;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            c26621j0M79158c3.close();
                                        } catch (Throwable th8) {
                                            AbstractC29125c.m88530g(th7, th8);
                                        }
                                        th4 = th7;
                                    }
                                }
                                try {
                                    c26621j0M79158c2.close();
                                    th3 = null;
                                } catch (Throwable th9) {
                                    th3 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    c26621j0M79158c2.close();
                                } catch (Throwable th11) {
                                    AbstractC29125c.m88530g(th10, th11);
                                }
                                th3 = th10;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        C26621j0 c26621j0M79158c4 = AbstractC26604b.m79158c(c26646zMo79150b0.m79289i(c26488a.f105202b));
                        try {
                            long j15 = c26488a.f105201a;
                            while (j13 < j15) {
                                C27889i c27889iM113392O = m113392O(c26621j0M79158c4);
                                if (c27889iM113392O.f112455h >= c26488a.f105202b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) function1.invoke(c27889iM113392O)).booleanValue()) {
                                    arrayList.add(c27889iM113392O);
                                }
                                j13++;
                            }
                            try {
                                c26621j0M79158c4.close();
                            } catch (Throwable th12) {
                                th5 = th12;
                            }
                        } catch (Throwable th13) {
                            try {
                                c26621j0M79158c4.close();
                            } catch (Throwable th14) {
                                AbstractC29125c.m88530g(th13, th14);
                            }
                            th5 = th13;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        C26639s0 c26639s0 = new C26639s0(c26611e0, fileSystem, m113415j(arrayList));
                        try {
                            c26646zMo79150b0.close();
                        } catch (Throwable unused) {
                        }
                        return c26639s0;
                    }
                    long j16 = j7;
                    c26621j0M79158c.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j7 = j16;
                } catch (Throwable th15) {
                    c26621j0M79158c.close();
                    throw th15;
                }
            }
        } catch (Throwable th16) {
            if (c26646zMo79150b0 == null) {
                throw th16;
            }
            try {
                c26646zMo79150b0.close();
                throw th16;
            } catch (Throwable th17) {
                AbstractC29125c.m88530g(th16, th17);
                throw th16;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m113390M(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    /* JADX INFO: renamed from: N */
    public static final void m113391N(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }

    /* JADX INFO: renamed from: O */
    public static final C27889i m113392O(C26621j0 c26621j0) throws IOException {
        int iMo79192Q0 = c26621j0.mo79192Q0();
        if (iMo79192Q0 != 33639248) {
            throw new IOException("bad zip: expected " + m113430y(33639248) + " but was " + m113430y(iMo79192Q0));
        }
        c26621j0.skip(4L);
        short sM79239h = c26621j0.m79239h();
        int i13 = sM79239h & 65535;
        if ((sM79239h & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m113430y(i13));
        }
        int iM79239h = c26621j0.m79239h() & 65535;
        int iM79239h2 = c26621j0.m79239h() & 65535;
        int iM79239h3 = c26621j0.m79239h() & 65535;
        long jMo79192Q0 = ((long) c26621j0.mo79192Q0()) & 4294967295L;
        C22667f0 c22667f0 = new C22667f0();
        c22667f0.f89335w = ((long) c26621j0.mo79192Q0()) & 4294967295L;
        C22667f0 c22667f1 = new C22667f0();
        c22667f1.f89335w = ((long) c26621j0.mo79192Q0()) & 4294967295L;
        int iM79239h4 = c26621j0.m79239h() & 65535;
        int iM79239h5 = c26621j0.m79239h() & 65535;
        int iM79239h6 = 65535 & c26621j0.m79239h();
        c26621j0.skip(8L);
        C22667f0 c22667f2 = new C22667f0();
        c22667f2.f89335w = ((long) c26621j0.mo79192Q0()) & 4294967295L;
        String strMo79215k0 = c26621j0.mo79215k0(iM79239h4);
        if (AbstractC39414r.m125875T(strMo79215k0, (char) 0, false)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j7 = c22667f1.f89335w == 4294967295L ? 8 : 0L;
        if (c22667f0.f89335w == 4294967295L) {
            j7 += (long) 8;
        }
        if (c22667f2.f89335w == 4294967295L) {
            j7 += (long) 8;
        }
        C22669g0 c22669g0 = new C22669g0();
        C22669g0 c22669g1 = new C22669g0();
        C22669g0 c22669g2 = new C22669g0();
        C22659b0 c22659b0 = new C22659b0();
        m113393P(c26621j0, iM79239h5, new C23103h0(c22659b0, j7, c22667f1, c26621j0, c22667f0, c22667f2, c22669g0, c22669g1, c22669g2));
        if (j7 > 0 && !c22659b0.f89329w) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strMo79215k1 = c26621j0.mo79215k0(iM79239h6);
        String str = C26611e0.f105848x;
        return new C27889i(C21567b.m60606o("/", false).m79176e(strMo79215k0), AbstractC39421y.m125920E(strMo79215k0, "/", false), strMo79215k1, jMo79192Q0, c22667f0.f89335w, c22667f1.f89335w, iM79239h, c22667f2.f89335w, iM79239h3, iM79239h2, (Long) c22669g0.f89336w, (Long) c22669g1.f89336w, (Long) c22669g2.f89336w, 57344);
    }

    /* JADX INFO: renamed from: P */
    public static final void m113393P(C26621j0 c26621j0, int i13, InterfaceC4351m interfaceC4351m) throws IOException {
        C26616h c26616h = c26621j0.f105872x;
        long j7 = i13;
        while (j7 != 0) {
            if (j7 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM79239h = c26621j0.m79239h() & 65535;
            long jM79239h = ((long) c26621j0.m79239h()) & 65535;
            long j13 = j7 - ((long) 4);
            if (j13 < jM79239h) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c26621j0.mo79207g0(jM79239h);
            long j14 = c26616h.f105866x;
            interfaceC4351m.invoke(Integer.valueOf(iM79239h), Long.valueOf(jM79239h));
            long j15 = (c26616h.f105866x + jM79239h) - j14;
            if (j15 < 0) {
                throw new IOException(AbstractC2875y.m8295h(iM79239h, "unsupported zip: too many bytes processed for "));
            }
            if (j15 > 0) {
                c26616h.skip(j15);
            }
            j7 = j13 - jM79239h;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final C27889i m113394Q(C26621j0 c26621j0, C27889i c27889i) throws IOException {
        int iMo79192Q0 = c26621j0.mo79192Q0();
        if (iMo79192Q0 != 67324752) {
            throw new IOException("bad zip: expected " + m113430y(67324752) + " but was " + m113430y(iMo79192Q0));
        }
        c26621j0.skip(2L);
        short sM79239h = c26621j0.m79239h();
        int i13 = sM79239h & 65535;
        if ((sM79239h & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m113430y(i13));
        }
        c26621j0.skip(18L);
        long jM79239h = ((long) c26621j0.m79239h()) & 65535;
        int iM79239h = c26621j0.m79239h() & 65535;
        c26621j0.skip(jM79239h);
        if (c27889i == null) {
            c26621j0.skip(iM79239h);
            return null;
        }
        C22669g0 c22669g0 = new C22669g0();
        C22669g0 c22669g1 = new C22669g0();
        C22669g0 c22669g2 = new C22669g0();
        m113393P(c26621j0, iM79239h, new C27890j(c26621j0, c22669g0, c22669g1, c22669g2));
        return new C27889i(c27889i.f112448a, c27889i.f112449b, c27889i.f112450c, c27889i.f112451d, c27889i.f112452e, c27889i.f112453f, c27889i.f112454g, c27889i.f112455h, c27889i.f112456i, c27889i.f112457j, c27889i.f112458k, c27889i.f112459l, c27889i.f112460m, (Integer) c22669g0.f89336w, (Integer) c22669g1.f89336w, (Integer) c22669g2.f89336w);
    }

    /* JADX INFO: renamed from: R */
    public static final String m113395R(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(str, "<terms>", "<a href=\"https://link.com/terms\">", false), "</terms>", "</a>", false), "<privacy>", "<a href=\"https://link.com/privacy\">", false), "</privacy>", "</a>", false), "<link>", "<a href=\"https://link.com\">", false), "</link>", "</a>", false);
    }

    /* JADX INFO: renamed from: S */
    public static final String m113396S(InterfaceC41211c interfaceC41211c, Composer composer) {
        AbstractC22676k.m65750j(interfaceC41211c, "<this>");
        return interfaceC41211c.mo133889M((Context) ((C28655q) composer).m87161k(AndroidCompositionLocals_androidKt.f4976b));
    }

    /* JADX INFO: renamed from: T */
    public static final void m113397T(RemoteViews remoteViews, int i13, int i14) {
        remoteViews.setInt(i13, "setColorFilter", i14);
    }

    /* JADX INFO: renamed from: U */
    public static final void m113398U(RemoteViews remoteViews, int i13, int i14) {
        remoteViews.setInt(i13, "setBackgroundResource", i14);
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0338  */
    /* JADX WARN: Code duplicated, block: B:207:0x0367  */
    /* JADX INFO: renamed from: V */
    public static boolean m113399V(C25017f c25017f, InterfaceC26247c interfaceC26247c) {
        C26259o c26259o;
        C26259o c26259o2;
        int iM77937c;
        C26259o c26259o3;
        C26259o c26259o4;
        boolean z4;
        ArrayList arrayList = c25017f.f97963r0;
        C14051c c14051c = c25017f.f97969x0;
        int[] iArr = c25017f.f97940q0;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 1;
            if (i14 >= size) {
                int i16 = 0;
                ArrayList arrayList2 = null;
                ArrayList<AbstractC25021j> arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList<AbstractC25021j> arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (i16 < size) {
                    C25016e c25016e = (C25016e) arrayList.get(i16);
                    int i17 = i13;
                    int i18 = iArr[i17];
                    int i19 = iArr[i15];
                    int i24 = i15;
                    int[] iArr2 = c25016e.f97940q0;
                    int[] iArr3 = iArr;
                    if (!m113403Z(i18, i19, iArr2[i17], iArr2[i24])) {
                        C25017f.m73454b0(c25016e, interfaceC26247c, c25017f.f97962M0);
                    }
                    boolean z13 = c25016e instanceof C25020i;
                    if (z13) {
                        C25020i c25020i = (C25020i) c25016e;
                        if (c25020i.f98019v0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c25020i);
                        }
                        z4 = z13;
                        if (c25020i.f98019v0 == i24) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c25020i);
                        }
                    } else {
                        z4 = z13;
                    }
                    if (c25016e instanceof AbstractC25021j) {
                        if (c25016e instanceof C25013b) {
                            C25013b c25013b = (C25013b) c25016e;
                            if (c25013b.m73397Z() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c25013b);
                            }
                            if (c25013b.m73397Z() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c25013b);
                            }
                        } else {
                            AbstractC25021j abstractC25021j = (AbstractC25021j) c25016e;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(abstractC25021j);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(abstractC25021j);
                        }
                    }
                    if (c25016e.f97890J.f97877f == null && c25016e.f97892L.f97877f == null && !z4 && !(c25016e instanceof C25013b)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(c25016e);
                    }
                    if (c25016e.f97891K.f97877f == null && c25016e.f97893M.f97877f == null && c25016e.f97894N.f97877f == null && !z4 && !(c25016e instanceof C25013b)) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(c25016e);
                    }
                    i16++;
                    i13 = i17;
                    iArr = iArr3;
                    i15 = 1;
                }
                int[] iArr4 = iArr;
                int i25 = i13;
                ArrayList<C26259o> arrayList8 = new ArrayList();
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        m113421p((C25020i) it.next(), i25, arrayList8, null);
                    }
                }
                int i26 = i25;
                C26259o c26259o5 = null;
                if (arrayList3 != null) {
                    for (AbstractC25021j abstractC25021j2 : arrayList3) {
                        C26259o c26259oM113421p = m113421p(abstractC25021j2, i26, arrayList8, c26259o5);
                        abstractC25021j2.m73473W(i26, arrayList8, c26259oM113421p);
                        c26259oM113421p.m77936b(arrayList8);
                        c26259o5 = null;
                        i26 = 0;
                    }
                }
                HashSet hashSet = c25017f.mo73439j(2).f97872a;
                if (hashSet != null) {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        m113421p(((C25015d) it3.next()).f97875d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet2 = c25017f.mo73439j(4).f97872a;
                if (hashSet2 != null) {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        m113421p(((C25015d) it4.next()).f97875d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet3 = c25017f.mo73439j(7).f97872a;
                if (hashSet3 != null) {
                    Iterator it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        m113421p(((C25015d) it5.next()).f97875d, 0, arrayList8, null);
                    }
                }
                C26259o c26259o6 = null;
                if (arrayList6 != null) {
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        m113421p((C25016e) it6.next(), 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        m113421p((C25020i) it7.next(), 1, arrayList8, null);
                    }
                }
                int i27 = 1;
                if (arrayList5 != null) {
                    for (AbstractC25021j abstractC25021j3 : arrayList5) {
                        C26259o c26259oM113421p2 = m113421p(abstractC25021j3, i27, arrayList8, c26259o6);
                        abstractC25021j3.m73473W(i27, arrayList8, c26259oM113421p2);
                        c26259oM113421p2.m77936b(arrayList8);
                        c26259o6 = null;
                        i27 = 1;
                    }
                }
                HashSet hashSet4 = c25017f.mo73439j(3).f97872a;
                if (hashSet4 != null) {
                    Iterator it8 = hashSet4.iterator();
                    while (it8.hasNext()) {
                        m113421p(((C25015d) it8.next()).f97875d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet5 = c25017f.mo73439j(6).f97872a;
                if (hashSet5 != null) {
                    Iterator it9 = hashSet5.iterator();
                    while (it9.hasNext()) {
                        m113421p(((C25015d) it9.next()).f97875d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet6 = c25017f.mo73439j(5).f97872a;
                if (hashSet6 != null) {
                    Iterator it10 = hashSet6.iterator();
                    while (it10.hasNext()) {
                        m113421p(((C25015d) it10.next()).f97875d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet7 = c25017f.mo73439j(7).f97872a;
                if (hashSet7 != null) {
                    Iterator it11 = hashSet7.iterator();
                    while (it11.hasNext()) {
                        m113421p(((C25015d) it11.next()).f97875d, 1, arrayList8, null);
                    }
                }
                char c3 = 1;
                if (arrayList7 != null) {
                    Iterator it12 = arrayList7.iterator();
                    while (it12.hasNext()) {
                        m113421p((C25016e) it12.next(), 1, arrayList8, null);
                    }
                }
                int i28 = 0;
                while (i28 < size) {
                    C25016e c25016e2 = (C25016e) arrayList.get(i28);
                    int[] iArr5 = c25016e2.f97940q0;
                    if (iArr5[0] == 3 && iArr5[c3] == 3) {
                        int i29 = c25016e2.f97936o0;
                        int size2 = arrayList8.size();
                        int i34 = 0;
                        while (true) {
                            if (i34 >= size2) {
                                c26259o3 = null;
                                break;
                            }
                            c26259o3 = (C26259o) arrayList8.get(i34);
                            if (i29 == c26259o3.f104401b) {
                                break;
                            }
                            i34++;
                        }
                        int i35 = c25016e2.f97938p0;
                        int size3 = arrayList8.size();
                        int i36 = 0;
                        while (true) {
                            if (i36 >= size3) {
                                c26259o4 = null;
                                break;
                            }
                            c26259o4 = (C26259o) arrayList8.get(i36);
                            if (i35 == c26259o4.f104401b) {
                                break;
                            }
                            i36++;
                        }
                        if (c26259o3 != null && c26259o4 != null) {
                            c26259o3.m77938d(0, c26259o4);
                            c26259o4.f104402c = 2;
                            arrayList8.remove(c26259o3);
                        }
                    }
                    i28++;
                    c3 = 1;
                }
                if (arrayList8.size() > 1) {
                    int i37 = 0;
                    if (iArr4[0] == 2) {
                        int i38 = 0;
                        c26259o = null;
                        for (C26259o c26259o7 : arrayList8) {
                            if (c26259o7.f104402c != 1) {
                                int iM77937c2 = c26259o7.m77937c(c14051c, i37);
                                if (iM77937c2 > i38) {
                                    c26259o = c26259o7;
                                    i38 = iM77937c2;
                                }
                                i37 = 0;
                            }
                        }
                        if (c26259o != null) {
                            c25017f.m73425O(1);
                            c25017f.m73429S(i38);
                        } else {
                            c26259o = null;
                        }
                    } else {
                        c26259o = null;
                    }
                    if (iArr4[1] == 2) {
                        C26259o c26259o8 = null;
                        int i39 = 0;
                        for (C26259o c26259o9 : arrayList8) {
                            if (c26259o9.f104402c != 0 && (iM77937c = c26259o9.m77937c(c14051c, 1)) > i39) {
                                c26259o8 = c26259o9;
                                i39 = iM77937c;
                            }
                        }
                        if (c26259o8 != null) {
                            c25017f.m73427Q(1);
                            c25017f.m73424N(i39);
                            c26259o2 = c26259o8;
                        } else {
                            c26259o2 = null;
                        }
                    } else {
                        c26259o2 = null;
                    }
                    if (c26259o != null || c26259o2 != null) {
                        return true;
                    }
                }
                return false;
            }
            C25016e c25016e3 = (C25016e) arrayList.get(i14);
            int i44 = iArr[0];
            int i45 = iArr[1];
            int[] iArr6 = c25016e3.f97940q0;
            if (!m113403Z(i44, i45, iArr6[0], iArr6[1]) || (c25016e3 instanceof C25019h)) {
                return false;
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: W */
    public static C22309a m113400W(EnumC23761b1 enumC23761b1, boolean z4, C21510f0 c21510f0, int i13) {
        boolean z13 = (i13 & 1) != 0 ? false : z4;
        boolean z14 = (i13 & 2) == 0;
        if ((i13 & 4) != 0) {
            c21510f0 = null;
        }
        return new C22309a(enumC23761b1, z14, z13, c21510f0 != null ? AbstractC12350b.m34570S(c21510f0) : null, 34);
    }

    /* JADX INFO: renamed from: X */
    public static String m113401X(int i13) {
        Object[] objArr = {Integer.valueOf(Color.red(i13)), Integer.valueOf(Color.green(i13)), Integer.valueOf(Color.blue(i13)), Double.valueOf(((double) Color.alpha(i13)) / 255.0d)};
        int i14 = AbstractC38065t.f163031a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX INFO: renamed from: Y */
    public static final C23465k m113402Y(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.length() <= 0) {
            throw new IllegalStateException("StreamCallCid can not be empty");
        }
        if (!AbstractC39414r.m125875T(str, ':', false)) {
            throw new IllegalStateException("StreamCallCid needs to be in the format StreamCallType:StreamCallId. For example, default:123");
        }
        List listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{":"}, 6);
        if (listM125906y0.size() < 2) {
            listM125906y0 = null;
        }
        if (listM125906y0 != null) {
            return new C23465k(AbstractC25265s.m74096F0(listM125906y0), AbstractC25265s.m74112P0(listM125906y0));
        }
        throw new IllegalStateException("unexpected StreamCallCid format: ".concat(str).toString());
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m113403Z(int i13, int i14, int i15, int i16) {
        return (i15 == 1 || i15 == 2 || (i15 == 4 && i13 != 2)) || (i16 == 1 || i16 == 2 || (i16 == 4 && i14 != 2));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m113404a(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i13) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: a0 */
    public static final C4277a m113405a0(AbstractC14155c abstractC14155c, InterfaceC20021n content) {
        AbstractC22676k.m65750j(abstractC14155c, "<this>");
        AbstractC22676k.m65750j(content, "content");
        return new C4277a(abstractC14155c.mo13321a(), content, abstractC14155c);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m113406b(boolean z4, C15341e controller, Set set, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        Modifier modifier2;
        int i16;
        C2314t c2314t;
        Modifier modifier3;
        ArrayList arrayListM9517x;
        ArrayList arrayList;
        Modifier modifier4;
        Modifier modifier5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        int i18;
        C28677v1 c28677v1M87180u;
        Set set2 = set;
        AbstractC22676k.m65750j(controller, "controller");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1316951872);
        if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(controller) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(set2) ? 256 : 128;
        }
        IdentifierSpec identifierSpec2 = identifierSpec;
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(identifierSpec2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !c28655q.m87121F()) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                arrayListM9517x = AbstractC3269g.m9517x((List) C27648a.m83597t(controller.f57648a, c28655q, 0).getValue(), set2);
                if (arrayListM9517x.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = arrayListM9517x;
                }
                if (arrayList != null) {
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c28655q.m87150e0(1145869254);
                    i17 = 0;
                    for (Object obj : arrayList) {
                        i18 = i17 + 1;
                        if (i17 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        int i24 = i16 << 3;
                        AbstractC32073e.m99745g(z13, (InterfaceC15450y2) obj, modifier3, set2, identifierSpec2, c28655q, (i24 & 57344) | (i16 & 14) | ((i16 >> 6) & 896) | (i24 & 7168), 0);
                        Modifier modifier6 = modifier3;
                        c28655q.m87150e0(1145880551);
                        if (i17 != AbstractC37056f.m118951C(arrayList)) {
                            AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                        }
                        c28655q.m87173q(false);
                        set2 = set;
                        identifierSpec2 = identifierSpec;
                        modifier3 = modifier6;
                        i17 = i18;
                        z13 = z4;
                    }
                    modifier4 = modifier3;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                } else {
                    modifier4 = modifier3;
                }
                modifier5 = modifier4;
            } else {
                c28655q.m87138X();
                modifier5 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(z4, controller, set, identifierSpec, modifier5, i13, i14, 10);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            arrayListM9517x = AbstractC3269g.m9517x((List) C27648a.m83597t(controller.f57648a, c28655q, 0).getValue(), set2);
            if (arrayListM9517x.isEmpty()) {
                arrayList = arrayListM9517x;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(1145869254);
                i17 = 0;
                while (r13.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    int i25 = i16 << 3;
                    AbstractC32073e.m99745g(z13, (InterfaceC15450y2) obj, modifier3, set2, identifierSpec2, c28655q, (i25 & 57344) | (i16 & 14) | ((i16 >> 6) & 896) | (i25 & 7168), 0);
                    Modifier modifier7 = modifier3;
                    c28655q.m87150e0(1145880551);
                    if (i17 != AbstractC37056f.m118951C(arrayList)) {
                        AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                    }
                    c28655q.m87173q(false);
                    set2 = set;
                    identifierSpec2 = identifierSpec;
                    modifier3 = modifier7;
                    i17 = i18;
                    z13 = z4;
                }
                modifier4 = modifier3;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                modifier4 = modifier3;
            }
            modifier5 = modifier4;
        } else {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            arrayListM9517x = AbstractC3269g.m9517x((List) C27648a.m83597t(controller.f57648a, c28655q, 0).getValue(), set2);
            if (arrayListM9517x.isEmpty()) {
                arrayList = arrayListM9517x;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c28655q.m87150e0(1145869254);
                i17 = 0;
                while (r13.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    int i26 = i16 << 3;
                    AbstractC32073e.m99745g(z13, (InterfaceC15450y2) obj, modifier3, set2, identifierSpec2, c28655q, (i26 & 57344) | (i16 & 14) | ((i16 >> 6) & 896) | (i26 & 7168), 0);
                    Modifier modifier8 = modifier3;
                    c28655q.m87150e0(1145880551);
                    if (i17 != AbstractC37056f.m118951C(arrayList)) {
                        AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                    }
                    c28655q.m87173q(false);
                    set2 = set;
                    identifierSpec2 = identifierSpec;
                    modifier3 = modifier8;
                    i17 = i18;
                    z13 = z4;
                }
                modifier4 = modifier3;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                modifier4 = modifier3;
            }
            modifier5 = modifier4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(z4, controller, set, identifierSpec, modifier5, i13, i14, 10);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static String m113407b0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strM8304q = AbstractC2875y.m8304q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM8304q), (Throwable) e5);
                    String name2 = e5.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + strM8304q.length() + 8 + 1);
                    sb4.append("<");
                    sb4.append(strM8304q);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    string = sb4.toString();
                }
            }
            objArr[i14] = string;
            i14++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i15, iIndexOf);
            sb5.append(objArr[i13]);
            i13++;
            i15 = iIndexOf + 2;
        }
        sb5.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb5.append(", ");
                sb5.append(objArr[i16]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0321  */
    /* JADX WARN: Code duplicated, block: B:102:0x0325  */
    /* JADX WARN: Code duplicated, block: B:107:0x0340  */
    /* JADX WARN: Code duplicated, block: B:111:0x034e  */
    /* JADX WARN: Code duplicated, block: B:114:0x037b  */
    /* JADX WARN: Code duplicated, block: B:115:0x037f  */
    /* JADX WARN: Code duplicated, block: B:120:0x039a  */
    /* JADX WARN: Code duplicated, block: B:123:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0403  */
    /* JADX WARN: Code duplicated, block: B:131:0x0421  */
    /* JADX WARN: Code duplicated, block: B:133:0x0461  */
    /* JADX WARN: Code duplicated, block: B:134:0x0465  */
    /* JADX WARN: Code duplicated, block: B:139:0x0480  */
    /* JADX WARN: Code duplicated, block: B:142:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x051c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0520  */
    /* JADX WARN: Code duplicated, block: B:160:0x053b  */
    /* JADX WARN: Code duplicated, block: B:164:0x055b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:0x055c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0103  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0180  */
    /* JADX WARN: Code duplicated, block: B:48:0x0184  */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0208  */
    /* JADX WARN: Code duplicated, block: B:65:0x020c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0227  */
    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x0241  */
    /* JADX WARN: Code duplicated, block: B:79:0x0244  */
    /* JADX WARN: Code duplicated, block: B:82:0x0287  */
    /* JADX WARN: Code duplicated, block: B:83:0x028b  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e5  */
    /* JADX INFO: renamed from: c */
    public static final void m113408c(Nudge nudge, NudgeStep step, C25607n c25607n, Composer composer, int i13) {
        int i14;
        BannerPosition position;
        int i15;
        C0209i c0209i;
        int i16;
        C2307m c2307m;
        C1100b c1100b;
        int iHashCode;
        int iHashCode2;
        int iM35485e;
        C2307m c2307m2;
        C32561l c32561l;
        int iHashCode3;
        int iHashCode4;
        boolean z4;
        boolean z13;
        C28677v1 c28677v1M87180u;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        float f13;
        int iHashCode10;
        float f14;
        C2306l c2306l = C2299e.f9108K;
        C2305k c2305k = C2299e.f9110M;
        C2307m c2307m3 = C2299e.f9102E;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-157446334);
        Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        C32561l c32561l2 = new C32561l(nudge, step, 0, c25607n);
        if (configuration.screenWidthDp >= 600) {
            i14 = 3;
        } else {
            i14 = configuration.orientation == 2 ? 2 : 1;
        }
        FormFactor formFactor = step.getFormFactor();
        BannerFormFactor bannerFormFactor = formFactor instanceof BannerFormFactor ? (BannerFormFactor) formFactor : null;
        if (bannerFormFactor == null || (position = bannerFormFactor.getPosition()) == null) {
            position = BannerPosition.BOTTOM;
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        C2307m c2307m4 = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m4, false);
        int iHashCode11 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i2 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
        C0209i c0209i3 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
        C0209i c0209i4 = C0217k.f732j;
        BannerPosition bannerPosition = position;
        if (!c28655q.f115903S) {
            i15 = i14;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode11))) {
            }
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            i16 = AbstractC29265e.f118430a[bannerPosition.ordinal()];
            if (i16 != 1) {
                c2307m = C2299e.f9115x;
            } else {
                if (i16 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c2307m = C2299e.f9105H;
            }
            c1100b = C1100b.f4583a;
            Modifier modifierM3394p = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC12889b.m36262a0(AbstractC1102d.m3409f(1.0f, c2314t), 5, AbstractC33253j.m105489e(AbstractC35032j.m110704f(c28655q).f148315L), false, 0L, 0L, 28), AbstractC33253j.m105489e(AbstractC35032j.m110704f(c28655q).f148315L)), ((C23132m) c28655q.m87161k(AbstractC23138n.f91494a)).f91456p, AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
            iM35485e = AbstractC12682p.m35485e(i15);
            if (iM35485e != 0) {
                if (iM35485e != 1) {
                    c32561l = c32561l2;
                    c28655q.m87152f0(809304833);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                    c28655q.m87158i0();
                    c2307m2 = c2307m4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(AbstractC35032j.m110704f(c28655q).f148317N), c2305k, c28655q, 0);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                    c32561l.m101584d(null, 64, c28655q, 1);
                    c32561l.m101585e(0, 64, c28655q, 1);
                    c28655q.m87173q(true);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3424u(configuration.screenWidthDp * 0.3f, c2314t), 16, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode8 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode8))) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N6);
                    c32561l.m101581a(c28655q, 8);
                    c28655q.m87173q(true);
                    c32561l.m101582b(null, 64, c28655q, 1);
                    c28655q.m87173q(true);
                    z13 = false;
                    c28655q.m87173q(false);
                } else if (iM35485e != 2) {
                    c28655q.m87152f0(809307710);
                    c28655q.m87173q(false);
                    z13 = false;
                    c2307m2 = c2307m4;
                    c32561l = c32561l2;
                } else {
                    c28655q.m87152f0(809305950);
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(AbstractC35032j.m110704f(c28655q).f148317N, C2299e.f9111N), c2306l, c28655q, 48);
                    iHashCode9 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode9))) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q, iHashCode9, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N7);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                    c32561l2.m101584d(null, 64, c28655q, 1);
                    c32561l2.m101585e(0, 64, c28655q, 1);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3424u(configuration.screenWidthDp * 0.25f, c2314t), 16, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode10 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode10))) {
                        AbstractC11266d.m30471y(iHashCode10, c28655q, iHashCode10, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N8);
                    c32561l2.m101581a(c28655q, 8);
                    c28655q.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                    c32561l2.m101582b(null, 64, c28655q, 1);
                    c28655q.m87173q(true);
                    z13 = false;
                    c28655q.m87173q(false);
                    c32561l = c32561l2;
                    c2307m2 = c2307m4;
                }
                z4 = true;
            } else {
                c2307m2 = c2307m4;
                c32561l = c32561l2;
                c28655q.m87152f0(809307096);
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(AbstractC35032j.m110704f(c28655q).f148317N), c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m9);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N9);
                c32561l.m101584d(null, 64, c28655q, 1);
                c32561l.m101585e(0, 64, c28655q, 1);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m10);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N10);
                c32561l.m101581a(c28655q, 8);
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87152f0(1833915335);
            if (i15 == z4) {
                Modifier modifierM3394p5 = AbstractC1099a.m3394p(16, c1100b.mo3400a(c2314t, C2299e.f9116y));
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m2, z13);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m11);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N11);
                z4 = true;
                c32561l.m101582b(null, 64, c28655q, 1);
                c28655q.m87173q(true);
                z13 = false;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z4);
            c28655q.m87173q(z4);
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C15657r(nudge, step, c25607n, i13, 3);
        }
        i15 = i14;
        AbstractC11266d.m30471y(iHashCode11, c28655q, iHashCode11, c0209i4);
        c0209i = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
        i16 = AbstractC29265e.f118430a[bannerPosition.ordinal()];
        if (i16 != 1) {
            c2307m = C2299e.f9115x;
        } else {
            if (i16 == 2) {
                throw new NoWhenBranchMatchedException();
            }
            c2307m = C2299e.f9105H;
        }
        c1100b = C1100b.f4583a;
        Modifier modifierM3394p6 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3));
        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d8);
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m12);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
        }
        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N12);
        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC12889b.m36262a0(AbstractC1102d.m3409f(1.0f, c2314t), 5, AbstractC33253j.m105489e(AbstractC35032j.m110704f(c28655q).f148315L), false, 0L, 0L, 28), AbstractC33253j.m105489e(AbstractC35032j.m110704f(c28655q).f148315L)), ((C23132m) c28655q.m87161k(AbstractC23138n.f91494a)).f91456p, AbstractC17918w0.f69621a);
        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m4, false);
        iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d9);
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m13);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
        } else {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
        }
        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N13);
        iM35485e = AbstractC12682p.m35485e(i15);
        if (iM35485e != 0) {
            if (iM35485e != 1) {
                c32561l = c32561l2;
                c28655q.m87152f0(809304833);
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                c28655q.m87158i0();
                c2307m2 = c2307m4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(AbstractC35032j.m110704f(c28655q).f148317N), c2305k, c28655q, 0);
                iHashCode7 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N15);
                c32561l.m101584d(null, 64, c28655q, 1);
                c32561l.m101585e(0, 64, c28655q, 1);
                c28655q.m87173q(true);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3424u(configuration.screenWidthDp * 0.3f, c2314t), 16, 0.0f, 0.0f, 0.0f, 14);
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode8 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N16);
                c32561l.m101581a(c28655q, 8);
                c28655q.m87173q(true);
                c32561l.m101582b(null, 64, c28655q, 1);
                c28655q.m87173q(true);
                z13 = false;
                c28655q.m87173q(false);
            } else if (iM35485e != 2) {
                c28655q.m87152f0(809307710);
                c28655q.m87173q(false);
                z13 = false;
                c2307m2 = c2307m4;
                c32561l = c32561l2;
            } else {
                c28655q.m87152f0(809305950);
                Modifier modifierM3394p8 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
                C22949e c22949e3 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(AbstractC35032j.m110704f(c28655q).f148317N, C2299e.f9111N), c2306l, c28655q, 48);
                iHashCode9 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode9, c28655q, iHashCode9, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode9, c28655q, iHashCode9, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N17);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                c32561l2.m101584d(null, 64, c28655q, 1);
                c32561l2.m101585e(0, 64, c28655q, 1);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3424u(configuration.screenWidthDp * 0.25f, c2314t), 16, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode10 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode10, c28655q, iHashCode10, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode10, c28655q, iHashCode10, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N18);
                c32561l2.m101581a(c28655q, 8);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                c32561l2.m101582b(null, 64, c28655q, 1);
                c28655q.m87173q(true);
                z13 = false;
                c28655q.m87173q(false);
                c32561l = c32561l2;
                c2307m2 = c2307m4;
            }
            z4 = true;
        } else {
            c2307m2 = c2307m4;
            c32561l = c32561l2;
            c28655q.m87152f0(809307096);
            Modifier modifierM3394p9 = AbstractC1099a.m3394p(AbstractC35032j.m110704f(c28655q).f148316M, AbstractC1102d.m3409f(1.0f, c2314t));
            C22949e c22949e4 = AbstractC22977m.f90650a;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(AbstractC35032j.m110704f(c28655q).f148317N), c2305k, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3394p9);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N19);
            c32561l.m101584d(null, 64, c28655q, 1);
            c32561l.m101585e(0, 64, c28655q, 1);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N110);
            c32561l.m101581a(c28655q, 8);
            z4 = true;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z13 = false;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(z4);
        c28655q.m87152f0(1833915335);
        if (i15 == z4) {
            Modifier modifierM3394p10 = AbstractC1099a.m3394p(16, c1100b.mo3400a(c2314t, C2299e.f9116y));
            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m2, z13);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3394p10);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d13);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m111);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N111);
            z4 = true;
            c32561l.m101582b(null, 64, c28655q, 1);
            c28655q.m87173q(true);
            z13 = false;
        }
        c28655q.m87173q(z13);
        c28655q.m87173q(z4);
        c28655q.m87173q(z4);
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15657r(nudge, step, c25607n, i13, 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m113409d(Modifier modifier, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Modifier modifier3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-340640888);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(null) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) != 0) {
                if (c28655q2.m87155h(z13)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) == 1170 || !c28655q2.m87121F()) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q = c28655q2;
                AbstractC14959b1.m43082a(z4, null, modifier3, z13, AbstractC12240d.m34081r(C15069l3.m43147a(c28655q2).m43091f(), AbstractC11673r.m31082k(c28655q2).f37672e, C15069l3.m43147a(c28655q2).m43093h(), 0L, c28655q, 0, 24), c28655q, i15 & 8190, 16);
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21312a(z4, modifier3, z13, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) != 0) {
            if (c28655q2.m87155h(z13)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) == 1170) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28655q = c28655q2;
            AbstractC14959b1.m43082a(z4, null, modifier3, z13, AbstractC12240d.m34081r(C15069l3.m43147a(c28655q2).m43091f(), AbstractC11673r.m31082k(c28655q2).f37672e, C15069l3.m43147a(c28655q2).m43093h(), 0L, c28655q, 0, 24), c28655q, i15 & 8190, 16);
        } else {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28655q = c28655q2;
            AbstractC14959b1.m43082a(z4, null, modifier3, z13, AbstractC12240d.m34081r(C15069l3.m43147a(c28655q2).m43091f(), AbstractC11673r.m31082k(c28655q2).f37672e, C15069l3.m43147a(c28655q2).m43093h(), 0L, c28655q, 0, 24), c28655q, i15 & 8190, 16);
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21312a(z4, modifier3, z13, i13, i14);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m113410e(EnumC16505h0 enumC16505h0, Modifier modifier, int i13, Composer composer, int i14) {
        int i15;
        String strM92103Y;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1788855147);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(enumC16505h0) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i16 = i15 | (c28655q.m87149e(i13) ? 256 : 128);
        if ((i16 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87140Z();
            if ((i14 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            int iOrdinal = enumC16505h0.ordinal();
            if (iOrdinal == 0) {
                c28655q.m87150e0(758246027);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_sign_up_terms_alternative_with_phone_number);
                c28655q.m87173q(false);
            } else if (iOrdinal == 1) {
                c28655q.m87150e0(758384349);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_sign_up_terms_alternative);
                c28655q.m87173q(false);
            } else if (iOrdinal == 2) {
                c28655q.m87150e0(758497065);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_sign_up_terms);
                c28655q.m87173q(false);
            } else if (iOrdinal == 3) {
                c28655q.m87150e0(758615547);
                strM92103Y = "<img src=\"link_logo\"> • " + AbstractC30060g.m92103Y(c28655q, R.string.stripe_sign_up_terms_default_opt_in);
                c28655q.m87173q(false);
            } else {
                if (iOrdinal != 4) {
                    throw AbstractC11895b.m32003v(1964120590, c28655q, false);
                }
                c28655q.m87150e0(758759108);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_link_sign_up_terms);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(1964142575);
            C26463f c26463f = new C26463f();
            c28655q.m87150e0(1964143158);
            if (enumC16505h0 == EnumC16505h0.f63468z) {
                c26463f.put("link_logo", new C28826a(AbstractC11673r.m31087p(AbstractC11673r.m31082k(c28655q).f37668a) ? R.drawable.stripe_link_logo_knockout_black : R.drawable.stripe_link_logo_knockout_white, R.string.stripe_link, null));
            }
            c28655q.m87173q(false);
            C26463f c26463fM78380b = c26463f.m78380b();
            c28655q.m87173q(false);
            AbstractC32069a.m99663a(m113395R(strM92103Y), modifier, i13, 7, c26463fM78380b, c28655q, i16 & MessageListItemViewType.GIPHY, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(enumC16505h0, i13, modifier, i14, 9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m113411f(C16845k state, C16839e layoutInfo, Modifier modifier, InterfaceC4339a onDismissed, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(layoutInfo, "layoutInfo");
        AbstractC22676k.m65750j(onDismissed, "onDismissed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2027717252);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(layoutInfo) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            modifier2 = modifier;
            i14 |= c28655q2.m87153g(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onDismissed) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-106848513);
            boolean zM87157i = ((i14 & 7168) == 2048) | c28655q2.m87157i(state);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C16670i0(state, (Object) onDismissed, (InterfaceC30057d) null, 7);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66724m(modifier2));
            long j7 = layoutInfo.f64711c;
            long j13 = layoutInfo.f64710b;
            c28655q = c28655q2;
            AbstractC1118c.m3458a(AbstractC37817c.m121344e(-1631825366, c28655q2, new C2557k2(c37816b, 7)), modifierM66720i, state.f64729a, false, layoutInfo.f64709a, 0, j13, 0L, j7, AbstractC16836b.f64704a, c28655q, 805506566, 128);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(state, layoutInfo, modifier, onDismissed, c37816b, i13, 13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C3281s m113412g(C34850x0 c34850x0) {
        InterfaceC26620j interfaceC26620jMo1940d1;
        int i13 = c34850x0.f146792z;
        long j7 = c34850x0.f146783L;
        long j13 = c34850x0.f146784M;
        C34807d0 c34807d0 = c34850x0.f146777F;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c34807d0.iterator();
        while (true) {
            C0030i1 c0030i1 = (C0030i1) it;
            if (!c0030i1.hasNext()) {
                break;
            }
            C23465k c23465k = (C23465k) c0030i1.next();
            String str = (String) c23465k.f92937w;
            String str2 = (String) c23465k.f92938x;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        C3279q c3279q = new C3279q(AbstractC25247g0.m74001j0(linkedHashMap));
        AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
        return new C3281s(i13, j7, j13, c3279q, (abstractC34799a1 == null || (interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1()) == null) ? null : new C3282t(interfaceC26620jMo1940d1), c34850x0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093 A[LOOP:1: B:24:0x008d->B:26:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final C34832o0 m113413h(C3280r c3280r, AbstractC32269c abstractC32269c) {
        C13217d c13217d;
        C34830n0 c34830n0;
        String str;
        C34830n0 c34830n1;
        C3280r c3280r2;
        C34838r0 c34838r0;
        C22677k0 c22677k0;
        String str2;
        Iterator it;
        if (abstractC32269c instanceof C13217d) {
            c13217d = (C13217d) abstractC32269c;
            int i13 = c13217d.f45800x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13217d.f45800x = i13 - Integer.MIN_VALUE;
            } else {
                c13217d = new C13217d(abstractC32269c);
            }
        } else {
            c13217d = new C13217d(abstractC32269c);
        }
        Object obj = c13217d.f45799w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13217d.f45800x;
        C34830n0 c34830n2 = null;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C26624l c26624l = (C26624l) obj;
            if (c26624l != null) {
                AbstractC34846v0.Companion.getClass();
                c34838r0 = new C34838r0(null, c26624l);
                c3280r2 = null;
                c34830n1 = null;
                str = null;
            } else {
                c3280r = null;
                c34830n0 = null;
                c34830n1 = null;
                str = null;
            }
            c34830n2.m109904e(str, c34838r0);
            C3279q c3279q = c3280r2.f12808c;
            c22677k0 = new C22677k0(2, false);
            for (Map.Entry entry : c3279q.f12805a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    c22677k0.m65765f(str2, (String) it.next());
                }
            }
            c34830n1.m109903d(c22677k0.m65766g());
            return new C34832o0(c34830n1);
        }
        AbstractC34132o.m107864I(obj);
        c34830n0 = new C34830n0();
        c34830n0.m109905f(c3280r.f12806a);
        str = c3280r.f12807b;
        c34830n1 = c34830n0;
        C34830n0 c34830n3 = c34830n0;
        c3280r2 = c3280r;
        c34838r0 = null;
        c34830n2 = c34830n3;
        c34830n2.m109904e(str, c34838r0);
        C3279q c3279q2 = c3280r2.f12808c;
        c22677k0 = new C22677k0(2, false);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                c22677k0.m65765f(str2, (String) it.next());
            }
        }
        c34830n1.m109903d(c22677k0.m65766g());
        return new C34832o0(c34830n1);
    }

    /* JADX INFO: renamed from: i */
    public static final CursorAnchorInfo m113414i(CursorAnchorInfo.Builder builder, C29891y c29891y, InterfaceC29884r interfaceC29884r, C23277r0 c23277r0, Matrix matrix, C16618c c16618c, C16618c c16618c2, boolean z4, boolean z13, boolean z14, boolean z15) {
        builder.reset();
        builder.setMatrix(matrix);
        long j7 = c29891y.f122126b;
        C23283u0 c23283u0 = c29891y.f122127c;
        int iM67360f = C23283u0.m67360f(j7);
        builder.setSelectionRange(iM67360f, C23283u0.m67359e(c29891y.f122126b));
        if (z4 && iM67360f >= 0) {
            int iMo15749x = interfaceC29884r.mo15749x(iM67360f);
            C16618c c16618cM67334c = c23277r0.m67334c(iMo15749x);
            float fM36283m = AbstractC12889b.m36283m(c16618cM67334c.f63939a, 0.0f, (int) (c23277r0.f92229c >> 32));
            boolean zM113417l = m113417l(c16618c, fM36283m, c16618cM67334c.f63940b);
            boolean zM113417l2 = m113417l(c16618c, fM36283m, c16618cM67334c.f63942d);
            boolean z16 = c23277r0.m67332a(iMo15749x) == EnumC36774j.f157348x;
            int i13 = (zM113417l || zM113417l2) ? 1 : 0;
            if (!zM113417l || !zM113417l2) {
                i13 |= 2;
            }
            if (z16) {
                i13 |= 4;
            }
            float f13 = c16618cM67334c.f63940b;
            float f14 = c16618cM67334c.f63942d;
            builder.setInsertionMarkerLocation(fM36283m, f13, f14, f14, i13);
        }
        if (z13) {
            int iM67360f2 = c23283u0 != null ? C23283u0.m67360f(c23283u0.f92253a) : -1;
            int iM67359e = c23283u0 != null ? C23283u0.m67359e(c23283u0.f92253a) : -1;
            if (iM67360f2 >= 0 && iM67360f2 < iM67359e) {
                builder.setComposingText(iM67360f2, c29891y.f122125a.f92135x.subSequence(iM67360f2, iM67359e));
                int iMo15749x2 = interfaceC29884r.mo15749x(iM67360f2);
                int iMo15749x3 = interfaceC29884r.mo15749x(iM67359e);
                float[] fArr = new float[(iMo15749x3 - iMo15749x2) * 4];
                c23277r0.f92228b.m67371a(AbstractC21478l0.m60431f(iMo15749x2, iMo15749x3), fArr);
                for (int i14 = iM67360f2; i14 < iM67359e; i14++) {
                    int iMo15749x4 = interfaceC29884r.mo15749x(i14);
                    int i15 = (iMo15749x4 - iMo15749x2) * 4;
                    float f15 = fArr[i15];
                    float f16 = fArr[i15 + 1];
                    float f17 = fArr[i15 + 2];
                    float f18 = fArr[i15 + 3];
                    int i16 = (f15 < c16618c.f63941c ? 1 : 0) & (c16618c.f63939a < f17 ? 1 : 0) & (c16618c.f63940b < f18 ? 1 : 0) & (f16 < c16618c.f63942d ? 1 : 0);
                    if (!m113417l(c16618c, f15, f16) || !m113417l(c16618c, f17, f18)) {
                        i16 |= 2;
                    }
                    if (c23277r0.m67332a(iMo15749x4) == EnumC36774j.f157348x) {
                        i16 |= 4;
                    }
                    builder.addCharacterBounds(i14, f15, f16, f17, f18, i16);
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 33 && z14) {
            AbstractC3979v.m12020k(builder, c16618c2);
        }
        if (i17 >= 34 && z15) {
            AbstractC2378g1.m7327b(builder, c23277r0, c16618c);
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: j */
    public static final LinkedHashMap m113415j(ArrayList arrayList) {
        String str = C26611e0.f105848x;
        C26611e0 c26611e0M60606o = C21567b.m60606o("/", false);
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k(c26611e0M60606o, new C27889i(c26611e0M60606o, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (C27889i c27889i : AbstractC25265s.m74152u1(arrayList, new C2298d(25))) {
            if (((C27889i) linkedHashMapM73993b0.put(c27889i.f112448a, c27889i)) == null) {
                while (true) {
                    C26611e0 c26611e0 = c27889i.f112448a;
                    C26611e0 c26611e0M79174c = c26611e0.m79174c();
                    if (c26611e0M79174c == null) {
                        break;
                    }
                    C27889i c27889i2 = (C27889i) linkedHashMapM73993b0.get(c26611e0M79174c);
                    if (c27889i2 != null) {
                        c27889i2.f112464q.add(c26611e0);
                        break;
                    }
                    C27889i c27889i3 = new C27889i(c26611e0M79174c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapM73993b0.put(c26611e0M79174c, c27889i3);
                    c27889i3.f112464q.add(c26611e0);
                    c27889i = c27889i3;
                }
            }
        }
        return linkedHashMapM73993b0;
    }

    /* JADX INFO: renamed from: k */
    public static final C5574e m113416k(AbstractC5586q abstractC5586q, String str) {
        return new C5574e(str, abstractC5586q, abstractC5586q.getType(), abstractC5586q.getIdentity());
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m113417l(C16618c c16618c, float f13, float f14) {
        float f15 = c16618c.f63939a;
        if (f13 > c16618c.f63941c || f15 > f13) {
            return false;
        }
        return f14 <= c16618c.f63942d && c16618c.f63940b <= f14;
    }

    /* JADX INFO: renamed from: m */
    public static C2603q0 m113418m(AbstractC12605c viewModel, C35459c0 paymentMethodMetadata, C16651f customerStateHolder, C16776z4 savedPaymentMethodMutator) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
        AbstractC22676k.m65750j(savedPaymentMethodMutator, "savedPaymentMethodMutator");
        C26318e c26318e = savedPaymentMethodMutator.f64495n;
        C13045h2 c13045h2 = savedPaymentMethodMutator.f64498q;
        C26318e c26318e2 = savedPaymentMethodMutator.f64496o;
        C26318e c26318e3 = customerStateHolder.f64025f;
        C2539i0 c2539i0 = new C2539i0(0, savedPaymentMethodMutator, C16776z4.class, "toggleEditing", "toggleEditing()V", 0, 1);
        C13081r1 c13081r1 = viewModel.f43013Q;
        C13081r1 c13081r2 = viewModel.f43012P;
        C13081r1 c13081r3 = customerStateHolder.f64023d;
        return new C2603q0(c26318e, c13045h2, c26318e2, c26318e3, c2539i0, c13081r1, AbstractC3269g.m9484M(viewModel.f43009M.f127270g, new C2185f(16)), c13081r2, c13081r3, new C17820i(16, viewModel, paymentMethodMetadata), new C0106e(1, savedPaymentMethodMutator, C16776z4.class, "updatePaymentMethod", "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", 0, 9), new C2531h0(viewModel, 1), paymentMethodMetadata.f150996w.mo124338q0());
    }

    /* JADX INFO: renamed from: n */
    public static final Object m113419n(AbstractC0757c json, InterfaceC37137b deserializer, InputStream stream2) {
        AbstractC22676k.m65750j(json, "<this>");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        AbstractC22676k.m65750j(stream2, "stream");
        C31624i c31624i = new C31624i(stream2);
        try {
            char[] cArrM3871J = C3124h.f12263z.m3871J(DfuBaseService.ERROR_CONNECTION_MASK);
            AbstractC22676k.m65750j(json, "json");
            C3117d0 c3117d0 = new C3117d0(c31624i, cArrM3871J);
            try {
                Object objDecodeSerializableValue = new C3121f0(json, EnumC3133l0.OBJ, c3117d0, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
                c3117d0.m8963p();
                c3117d0.m8983F();
                c31624i.m97699B();
                return objDecodeSerializableValue;
            } catch (Throwable th3) {
                c3117d0.m8983F();
                throw th3;
            }
        } catch (Throwable th4) {
            c31624i.m97699B();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m113420o(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: p */
    public static C26259o m113421p(C25016e c25016e, int i13, ArrayList arrayList, C26259o c26259o) {
        int i14;
        int i15 = i13 == 0 ? c25016e.f97936o0 : c25016e.f97938p0;
        if (i15 != -1 && (c26259o == null || i15 != c26259o.f104401b)) {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                C26259o c26259o2 = (C26259o) arrayList.get(i16);
                if (c26259o2.f104401b == i15) {
                    if (c26259o != null) {
                        c26259o.m77938d(i13, c26259o2);
                        arrayList.remove(c26259o);
                    }
                    c26259o = c26259o2;
                    break;
                }
            }
        } else if (i15 != -1) {
            return c26259o;
        }
        if (c26259o == null) {
            if (c25016e instanceof AbstractC25021j) {
                AbstractC25021j abstractC25021j = (AbstractC25021j) c25016e;
                int i17 = 0;
                while (true) {
                    if (i17 >= abstractC25021j.f98022s0) {
                        i14 = -1;
                        break;
                    }
                    C25016e c25016e2 = abstractC25021j.f98021r0[i17];
                    if ((i13 == 0 && (i14 = c25016e2.f97936o0) != -1) || (i13 == 1 && (i14 = c25016e2.f97938p0) != -1)) {
                        break;
                    }
                    i17++;
                }
                if (i14 != -1) {
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        C26259o c26259o3 = (C26259o) arrayList.get(i18);
                        if (c26259o3.f104401b == i14) {
                            c26259o = c26259o3;
                            break;
                        }
                    }
                }
            }
            if (c26259o == null) {
                c26259o = new C26259o();
                c26259o.f104400a = new ArrayList();
                c26259o.f104403d = null;
                c26259o.f104404e = -1;
                int i19 = C26259o.f104399f;
                C26259o.f104399f = i19 + 1;
                c26259o.f104401b = i19;
                c26259o.f104402c = i13;
            }
            arrayList.add(c26259o);
        }
        int i24 = c26259o.f104401b;
        if (c26259o.m77935a(c25016e)) {
            if (c25016e instanceof C25020i) {
                C25020i c25020i = (C25020i) c25016e;
                c25020i.f98018u0.m73401c(c25020i.f98019v0 == 0 ? 1 : 0, arrayList, c26259o);
            }
            if (i13 == 0) {
                c25016e.f97936o0 = i24;
                c25016e.f97890J.m73401c(i13, arrayList, c26259o);
                c25016e.f97892L.m73401c(i13, arrayList, c26259o);
            } else {
                c25016e.f97938p0 = i24;
                c25016e.f97891K.m73401c(i13, arrayList, c26259o);
                c25016e.f97894N.m73401c(i13, arrayList, c26259o);
                c25016e.f97893M.m73401c(i13, arrayList, c26259o);
            }
            c25016e.f97897Q.m73401c(i13, arrayList, c26259o);
        }
        return c26259o;
    }

    /* JADX INFO: renamed from: q */
    public static C20253w m113422q(Context context, C20578u6 c20578u6, int i13, int i14) {
        AbstractC22676k.m65750j(context, "context");
        float f13 = i14;
        float f14 = f13 / context.getResources().getDisplayMetrics().density;
        EnumC20550t6 enumC20550t6 = c20578u6.f77065g;
        int iM36258X = AbstractC12889b.m36258X(f14 * enumC20550t6.sizeScale);
        int i15 = iM36258X % 16;
        Integer numValueOf = Integer.valueOf(i15 <= 8 ? Math.max(16, iM36258X - i15) : iM36258X + (16 - i15));
        float f15 = i13;
        int iM36258X2 = AbstractC12889b.m36258X((f15 / context.getResources().getDisplayMetrics().density) * enumC20550t6.sizeScale);
        int i16 = iM36258X2 % 16;
        Integer numValueOf2 = Integer.valueOf(i16 <= 8 ? Math.max(16, iM36258X2 - i16) : iM36258X2 + (16 - i16));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new C20253w(iIntValue2, iIntValue, iIntValue2 / f15, iIntValue / f13, c20578u6.f77066h, enumC20550t6.bitRate);
    }

    /* JADX INFO: renamed from: r */
    public static synchronized AudioManager m113423r(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f152188a = null;
            }
            AudioManager audioManager = f152188a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                C2852m1 c2852m1 = new C2852m1(7);
                AbstractC38046a.m121814i().execute(new RunnableC30928b(16, applicationContext, c2852m1));
                c2852m1.m8246a();
                AudioManager audioManager2 = f152188a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f152188a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public static double m113424s(C1533u c1533u, String str) {
        C1464g0 c1464g0 = (C1464g0) c1533u.m4856W().get(str);
        if (c1464g0 != null) {
            return c1464g0.m4620w();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: t */
    public static double m113425t(C1439b0 c1439b0, String str) {
        C1464g0 c1464g0 = (C1464g0) c1439b0.m4575s().get(str);
        if (c1464g0 != null) {
            return c1464g0.m4620w();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: u */
    public static final Instant m113426u(C1533u c1533u) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c1533u.m4846M());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(endTimeMillis)");
        return instantOfEpochMilli;
    }

    /* JADX INFO: renamed from: v */
    public static final ZoneOffset m113427v(C1533u c1533u) {
        if (c1533u.m4860a0()) {
            return ZoneOffset.ofTotalSeconds(c1533u.m4847N());
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final String m113428w(Context context, String str, String str2, String str3) {
        String strM113388K = m113388K(context, str3);
        if (strM113388K != null) {
            return strM113388K;
        }
        String strM113388K2 = m113388K(context, str2);
        if (strM113388K2 != null) {
            return strM113388K2;
        }
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.stripe_unexpected_error_try_again);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC41211c m113429x(Throwable th3) {
        AbstractC22676k.m65750j(th3, "<this>");
        boolean z4 = th3 instanceof APIConnectionException;
        C25271y c25271y = C25271y.f99162w;
        if (z4) {
            return AbstractC32128i.m100064s(R.string.stripe_failure_connection_error, new Object[0], c25271y);
        }
        String localizedMessage = th3.getLocalizedMessage();
        return localizedMessage != null ? new C41212d(localizedMessage, AbstractC25260n.m74049W0(new Object[0])) : AbstractC32128i.m100064s(R.string.stripe_internal_error, new Object[0], c25271y);
    }

    /* JADX INFO: renamed from: y */
    public static final String m113430y(int i13) {
        AbstractC35846d.m113779c(16);
        String string = Integer.toString(i13, 16);
        AbstractC22676k.m65749i(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: z */
    public static long m113431z(C1533u c1533u, String str) {
        C1464g0 c1464g0 = (C1464g0) c1533u.m4856W().get(str);
        if (c1464g0 != null) {
            return c1464g0.m4622y();
        }
        return 0L;
    }
}
