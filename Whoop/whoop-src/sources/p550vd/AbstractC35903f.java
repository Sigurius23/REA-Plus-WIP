package p550vd;

import af.C0804a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import android.widget.RemoteViews;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.health.platform.client.proto.C1498n;
import androidx.health.platform.client.proto.C1503o;
import androidx.health.platform.client.proto.C1508p;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.C1538v;
import androidx.health.platform.client.proto.C1543w;
import androidx.health.platform.client.proto.C1548x;
import androidx.health.platform.client.proto.C1552y;
import androidx.room.C1778e;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b01.C2185f;
import b20.C2326f;
import b20.InterfaceC2322b;
import b30.C2548j1;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import c43.C4188d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca.C4358a;
import com.amplitude.android.engagement.types.ModalFormFactor;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.iterable.iterableapi.C5363q;
import com.stripe.android.core.exception.StripeException;
import com.whoop.android.R;
import d40.AbstractC11672q;
import d40.AbstractC11673r;
import d40.C11674s;
import dc3.C11929n;
import dc3.C11930o;
import dc3.InterfaceC11939x;
import e93.AbstractC12889b;
import f41.C14076n;
import fo.C14661g;
import ge3.AbstractC15751g;
import gm.C15990r;
import h00.AbstractC16495c0;
import h00.C16493b0;
import h00.C16521p0;
import io.getstream.android.video.generated.models.MemberResponse;
import io.getstream.android.video.generated.models.UserResponse;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.video.android.model.User;
import io.getstream.video.android.model.UserType;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import jg3.C21682i;
import kg.AbstractC22452f;
import kg.C22447a;
import kg.C22448b;
import kg.C22450d;
import kg.C22451e;
import l53.C23370k;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import me.C25461b;
import me.C25466g;
import me.C25467h;
import p000.AbstractC11266d;
import p002a0.C0047q0;
import p003a1.C0109h;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p008a7.AbstractC0514e;
import p008a7.C0510a;
import p008a7.C0511b;
import p008a7.C0512c;
import p008a7.C0513d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p029b5.C2726e;
import p031b9.C2817b;
import p035bp.AbstractC3511b;
import p074cs.AbstractC11096c;
import p074cs.C11095b;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12313p;
import p132f0.C13821r1;
import p163g1.AbstractC15011f9;
import p163g1.C15069l3;
import p169g7.AbstractC15540a;
import p180h0.C16482y1;
import p184h5.AbstractC16901p0;
import p184h5.InterfaceC16882j;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.C17924z0;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.C23016z;
import p294l3.C23283u0;
import p322m7.InterfaceC25140e0;
import p322m7.InterfaceC25146g0;
import p328mj.C25607n;
import p334n5.C26289a;
import p335n6.EnumC26402s;
import p335n6.InterfaceC26398o;
import p336n7.C26411a;
import p336n7.C26412b;
import p336n7.C26413c;
import p342nj.C26741f;
import p358o6.C27594b;
import p358o6.InterfaceC27593a;
import p368og.C27914k;
import p368og.EnumC27905b;
import p368og.InterfaceC27908e;
import p368og.InterfaceC27910g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28783u;
import p395p6.AbstractC28869c1;
import p395p6.C28903o;
import p395p6.C28931x0;
import p395p6.C28932x1;
import p401pj.C29280n;
import p412q3.C29891y;
import p415q6.AbstractC29995e;
import p460rg.AbstractC31366a;
import p460rg.C31367b;
import p460rg.C31371f;
import p460rg.InterfaceC31373h;
import p474s.AbstractC32004s;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p512u2.C34450b0;
import p513u4.AbstractC34523k;
import p516u8.C34585c0;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p545v6.C35725n;
import p545v6.C35726o;
import p545v6.C35727p;
import p545v6.C35733v;
import p574w6.AbstractC36852c;
import p574w6.C36851b;
import p602x1.C37816b;
import p619xl.C38445a;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import pt2.C29529k;
import q30.C29934u0;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import re.AbstractC31309z;
import re.C31275i;
import re.C31277j;
import re.C31279k;
import re.C31281l;
import re.C31283m;
import re.C31285n;
import re.C31287o;
import re.C31289p;
import re.C31291q;
import re.C31293r;
import re.C31295s;
import re.C31297t;
import re.C31299u;
import re.C31301v;
import re.C31303w;
import re.C31305x;
import re.C31307y;
import rs.AbstractC31780b;
import s30.AbstractC32100b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import sj.C32561l;
import te0.AbstractC33745d;
import va3.AbstractC35849g;
import vg.C35966m;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import ye.C39476c;

/* JADX INFO: renamed from: vd.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35903f {
    /* JADX INFO: renamed from: A */
    public static final void m113983A(InterfaceC30063j interfaceC30063j, EnumC27905b enumC27905b, String str, Throwable th3, InterfaceC4339a interfaceC4339a) {
        Map map;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        InterfaceC27910g interfaceC27910gMo44900a = AbstractC3511b.m10394w(interfaceC30063j).getLoggerProvider().mo44900a(str);
        if (interfaceC27910gMo44900a.mo389j(enumC27905b)) {
            C27914k c27914k = (C27914k) interfaceC30063j.get(C27914k.f112511x);
            if (c27914k == null || (map = c27914k.f112512w) == null) {
                map = C25272z.f99163w;
            }
            InterfaceC31373h interfaceC31373hM96473m = AbstractC31366a.m96473m(interfaceC30063j);
            if (interfaceC31373hM96473m != null) {
                C31367b c31367b = ((C31371f) interfaceC31373hM96473m).f129033w;
            }
            InterfaceC27908e interfaceC27908eMo44899g = interfaceC27910gMo44900a.mo44899g(enumC27905b);
            if (th3 != null) {
                interfaceC27908eMo44899g.mo7486a(th3);
            }
            interfaceC27908eMo44899g.mo7492r(interfaceC4339a);
            for (Map.Entry entry : map.entrySet()) {
                interfaceC27908eMo44899g.mo7487c((String) entry.getKey(), entry.getValue());
            }
            interfaceC27908eMo44899g.mo7488e();
        }
    }

    /* JADX INFO: renamed from: B */
    public static final C15990r m113984B(InterfaceC30063j interfaceC30063j, String str) {
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        return new C15990r(interfaceC30063j, AbstractC3511b.m10394w(interfaceC30063j).getLoggerProvider().mo44900a(str), str);
    }

    /* JADX INFO: renamed from: C */
    public static final Map m113985C(Duration duration) {
        return duration != null ? AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)))) : C25272z.f99163w;
    }

    /* JADX INFO: renamed from: D */
    public static String m113986D(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb4 = new StringBuilder(str2.length() + str.length());
        for (int i13 = 0; i13 < str.length(); i13++) {
            sb4.append(str.charAt(i13));
            if (str2.length() > i13) {
                sb4.append(str2.charAt(i13));
            }
        }
        return sb4.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: E */
    public static final C39476c m113987E(byte[] payload) {
        Object objM107888l;
        C2817b c2817bM8017t;
        String strM114017l;
        String strM114017l2;
        AbstractC22676k.m65750j(payload, "payload");
        C2817b c2817bM114005Z = m114005Z(payload);
        try {
            String strM8014q = c2817bM114005Z.m8014q();
            if (!AbstractC22676k.m65745e(strM8014q, "ErrorResponse") && !AbstractC22676k.m65745e(strM8014q, "Error")) {
                throw new IllegalStateException("expected restXml error response with root tag of <ErrorResponse> or <Error>");
            }
            if (AbstractC22676k.m65745e(c2817bM114005Z.m8014q(), "ErrorResponse")) {
                c2817bM8017t = c2817bM114005Z.m8017t();
                if (c2817bM8017t == null) {
                    throw new IllegalStateException("expected more tags after <ErrorResponse>");
                }
            } else {
                c2817bM8017t = c2817bM114005Z;
            }
            String strM114017l3 = null;
            if (AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "Error")) {
                strM114017l = null;
                strM114017l2 = null;
                while (true) {
                    C2817b c2817bM8017t2 = c2817bM8017t.m8017t();
                    if (c2817bM8017t2 != null) {
                        String strM8014q2 = c2817bM8017t2.m8014q();
                        switch (strM8014q2.hashCode()) {
                            case -1675388953:
                                if (!strM8014q2.equals("Message")) {
                                }
                                c2817bM8017t2.m8009j();
                                break;
                            case -1597066262:
                                if (strM8014q2.equals("RequestId")) {
                                    strM114017l3 = m114017l(c2817bM8017t2);
                                } else {
                                    continue;
                                }
                                c2817bM8017t2.m8009j();
                                break;
                            case 2105869:
                                if (strM8014q2.equals("Code")) {
                                    strM114017l2 = m114017l(c2817bM8017t2);
                                } else {
                                    continue;
                                }
                                c2817bM8017t2.m8009j();
                                break;
                            case 954925063:
                                if (!strM8014q2.equals("message")) {
                                }
                                c2817bM8017t2.m8009j();
                                break;
                            default:
                                continue;
                                c2817bM8017t2.m8009j();
                                break;
                        }
                        strM114017l = m114017l(c2817bM8017t2);
                        c2817bM8017t2.m8009j();
                    }
                }
            } else {
                strM114017l = null;
                strM114017l2 = null;
            }
            if (strM114017l3 == null) {
                while (true) {
                    C2817b c2817bM8017t3 = c2817bM114005Z.m8017t();
                    if (c2817bM8017t3 != null) {
                        if (AbstractC22676k.m65745e(c2817bM8017t3.m8014q(), "RequestId")) {
                            strM114017l3 = m114017l(c2817bM8017t3);
                        }
                    }
                }
            }
            objM107888l = new C0804a(strM114017l3, strM114017l2, strM114017l);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            objM107888l = AbstractC33745d.m106662u("Unable to deserialize RestXml error", thM68037a);
        }
        AbstractC34132o.m107864I(objM107888l);
        C0804a c0804a = (C0804a) objM107888l;
        return new C39476c(c0804a.f2968b, c0804a.f2969c, c0804a.f2967a);
    }

    /* JADX INFO: renamed from: F */
    public static final C1543w m113988F(String str) {
        C1538v c1538vM4921s = C1543w.m4921s();
        c1538vM4921s.m4815c();
        C1543w.m4919p((C1543w) c1538vM4921s.f6114x, str);
        return (C1543w) c1538vM4921s.m4813a();
    }

    /* JADX INFO: renamed from: G */
    public static final Object m113989G(C0047q0 c0047q0) {
        if (c0047q0.m104g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i13 = c0047q0.f137b - 1;
        Object objM102e = c0047q0.m102e(i13);
        c0047q0.m107j(i13);
        return objM102e;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m113990H(C2326f c2326f, InterfaceC2322b interfaceC2322b, StripeException stripeException, Map map, int i13) {
        if ((i13 & 2) != 0) {
            stripeException = null;
        }
        if ((i13 & 4) != 0) {
            map = C25272z.f99163w;
        }
        c2326f.m7175a(interfaceC2322b, stripeException, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public static final Object m113991I(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C25466g c25466g;
        C25461b c25461b;
        if (abstractC32269c instanceof C25466g) {
            c25466g = (C25466g) abstractC32269c;
            int i13 = c25466g.f99708y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25466g.f99708y = i13 - Integer.MIN_VALUE;
            } else {
                c25466g = new C25466g(abstractC32269c);
            }
        } else {
            c25466g = new C25466g(abstractC32269c);
        }
        Object obj = c25466g.f99707x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25466g.f99708y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C25461b c25461b2 = new C25461b(interfaceC35967n, c31983m2, 2);
            try {
                c25466g.f99706w = c25461b2;
                c25466g.f99708y = 1;
                try {
                    Object objM99483g = c25461b2.f99697x.m99483g(c25466g);
                    if (objM99483g == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = objM99483g;
                    c25461b = c25461b2;
                } catch (Throwable th3) {
                    th = th3;
                    c25461b = c25461b2;
                    c25461b.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25461b = c25466g.f99706w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Throwable th5) {
                th = th5;
                try {
                    c25461b.close();
                } catch (Throwable th6) {
                    AbstractC29125c.m88530g(th, th6);
                }
                throw th;
            }
        }
        String str = (String) obj;
        c25461b.close();
        return str;
    }

    /* JADX INFO: renamed from: J */
    public static Object m113992J(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32275i abstractC32275i, int i13) {
        if ((i13 & 1) != 0) {
            InterfaceC35967n.f153143a.getClass();
            interfaceC35967n = C35966m.f153142b;
        }
        if ((i13 & 2) != 0) {
            c31983m2 = new C31983m2(new C25467h(interfaceC35967n, null, 0));
        }
        return m113991I(interfaceC35967n, c31983m2, abstractC32275i);
    }

    /* JADX INFO: renamed from: K */
    public static C14661g m113993K(C14661g c14661g, String[] strArr, Map map) {
        int i13 = 0;
        if (c14661g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C14661g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C14661g c14661g2 = new C14661g();
                int length = strArr.length;
                while (i13 < length) {
                    c14661g2.m41883a((C14661g) map.get(strArr[i13]));
                    i13++;
                }
                return c14661g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c14661g.m41883a((C14661g) map.get(strArr[0]));
                return c14661g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i13 < length2) {
                    c14661g.m41883a((C14661g) map.get(strArr[i13]));
                    i13++;
                }
            }
        }
        return c14661g;
    }

    /* JADX INFO: renamed from: L */
    public static int m113994L(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    /* JADX INFO: renamed from: M */
    public static final Object[] m113995M(C23370k c23370k) {
        AbstractC22676k.m65750j(c23370k, "<this>");
        return new Object[]{c23370k.f92645a, c23370k.f92646b, c23370k.f92647c, Long.valueOf(c23370k.f92648d)};
    }

    /* JADX INFO: renamed from: P */
    public static final void m113996P(C1508p c1508p, C26413c c26413c) {
        String str = c26413c.f104891a;
        Instant instant = c26413c.f104893c;
        C26411a c26411a = c26413c.f104892b;
        if (!AbstractC22676k.m65745e(str, "")) {
            String str2 = c26413c.f104891a;
            c1508p.m4815c();
            C1533u.m4836v((C1533u) c1508p.f6114x, str2);
        }
        if (c26411a.f104886a.length() > 0) {
            C1498n c1498nM4736s = C1503o.m4736s();
            String str3 = c26411a.f104886a;
            c1498nM4736s.m4815c();
            C1503o.m4734p((C1503o) c1498nM4736s.f6114x, str3);
            C1503o c1503o = (C1503o) c1498nM4736s.m4813a();
            c1508p.m4815c();
            C1533u.m4837w((C1533u) c1508p.f6114x, c1503o);
        }
        if (instant.isAfter(Instant.EPOCH)) {
            long epochMilli = instant.toEpochMilli();
            c1508p.m4815c();
            C1533u.m4839y((C1533u) c1508p.f6114x, epochMilli);
        }
        String str4 = c26413c.f104894d;
        if (str4 != null) {
            c1508p.m4815c();
            C1533u.m4824C((C1533u) c1508p.f6114x, str4);
        }
        long j7 = c26413c.f104895e;
        if (j7 > 0) {
            c1508p.m4815c();
            C1533u.m4825D((C1533u) c1508p.f6114x, j7);
        }
        C26412b c26412b = c26413c.f104896f;
        if (c26412b != null) {
            C1548x c1548xM4940y = C1552y.m4940y();
            String str5 = c26412b.f104887a;
            if (str5 != null) {
                c1548xM4940y.m4815c();
                C1552y.m4936p((C1552y) c1548xM4940y.f6114x, str5);
            }
            String str6 = c26412b.f104888b;
            if (str6 != null) {
                c1548xM4940y.m4815c();
                C1552y.m4937q((C1552y) c1548xM4940y.f6114x, str6);
            }
            String str7 = (String) AbstractC15540a.f58270b.getOrDefault(Integer.valueOf(c26412b.f104889c), "UNKNOWN");
            c1548xM4940y.m4815c();
            C1552y.m4938r((C1552y) c1548xM4940y.f6114x, str7);
            C1552y c1552y = (C1552y) c1548xM4940y.m4813a();
            c1508p.m4815c();
            C1533u.m4826E((C1533u) c1508p.f6114x, c1552y);
        }
        int i13 = c26413c.f104897g;
        if (i13 > 0) {
            c1508p.m4815c();
            C1533u.m4833s((C1533u) c1508p.f6114x, i13);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final C2817b m113998R(C22447a c22447a, C15990r c15990r) {
        C22450d c22450d = c22447a.f87876b;
        AbstractC22452f abstractC22452f = (AbstractC22452f) c15990r.f60514z;
        C22447a c22447a2 = abstractC22452f instanceof C22447a ? (C22447a) abstractC22452f : null;
        if (c22447a2 == null) {
            throw new IllegalStateException(("expected start tag found " + ((AbstractC22452f) c15990r.f60514z)).toString());
        }
        C22450d c22450d2 = c22447a2.f87876b;
        if (c22450d.equals(c22450d2)) {
            return new C2817b(c22447a, c15990r);
        }
        throw new IllegalStateException(("expected start tag " + c22450d + " but current reader state is on " + c22450d2).toString());
    }

    /* JADX INFO: renamed from: S */
    public static int[] m113999S(Collection collection) {
        if (collection instanceof C11095b) {
            C11095b c11095b = (C11095b) collection;
            return Arrays.copyOfRange(c11095b.f35193w, c11095b.f35194x, c11095b.f35195y);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = array[i13];
            obj.getClass();
            iArr[i13] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ C4188d m114000T(MemberResponse memberResponse) {
        AbstractC22676k.m65750j(memberResponse, "<this>");
        String userId = memberResponse.getUserId();
        String name = memberResponse.getUser().getName();
        String str = name == null ? "" : name;
        String image = memberResponse.getUser().getImage();
        String str2 = image == null ? "" : image;
        List<String> teams = memberResponse.getUser().getTeams();
        if (teams == null) {
            teams = C25271y.f99162w;
        }
        return new C4188d(userId, str, memberResponse.getUser().getRole(), str2, teams, new Date(memberResponse.getCreatedAt().toEpochSecond()), new Date(memberResponse.getUpdatedAt().toEpochSecond()));
    }

    /* JADX INFO: renamed from: U */
    public static final ExtractedText m114001U(C29891y c29891y) {
        ExtractedText extractedText = new ExtractedText();
        String str = c29891y.f122125a.f92135x;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j7 = c29891y.f122126b;
        extractedText.selectionStart = C23283u0.m67360f(j7);
        extractedText.selectionEnd = C23283u0.m67359e(j7);
        extractedText.flags = !AbstractC39414r.m125875T(c29891y.f122125a.f92135x, '\n', false) ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ User m114002V(UserResponse userResponse) {
        AbstractC22676k.m65750j(userResponse, "<this>");
        String id4 = userResponse.getId();
        String role = userResponse.getRole();
        String name = userResponse.getName();
        String image = userResponse.getImage();
        List<String> teams = userResponse.getTeams();
        Map<String, Object> custom = userResponse.getCustom();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(custom.size()));
        Iterator<T> it = custom.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return new User(id4, role, (UserType) null, name, image, teams, linkedHashMap, (C21682i) null, (C21682i) null, (C21682i) null, 900, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public static Integer m114003W(String str) {
        byte b;
        Integer num;
        Long l7;
        Long lValueOf;
        Long lValueOf2;
        byte b6;
        str.getClass();
        if (str.isEmpty()) {
            l7 = 0;
            num = null;
        } else {
            int i13 = str.charAt(0) == '-' ? 1 : 0;
            if (i13 == str.length()) {
                l7 = 0;
                num = null;
            } else {
                int i14 = i13 + 1;
                char cCharAt = str.charAt(i13);
                if (cCharAt < 128) {
                    b = AbstractC11096c.f35196a[cCharAt];
                } else {
                    byte[] bArr = AbstractC11096c.f35196a;
                    b = -1;
                }
                if (b < 0 || b >= 10) {
                    num = null;
                    l7 = num;
                } else {
                    long j7 = -b;
                    long j13 = 10;
                    long j14 = Long.MIN_VALUE / j13;
                    while (true) {
                        if (i14 < str.length()) {
                            int i15 = i14 + 1;
                            char cCharAt2 = str.charAt(i14);
                            if (cCharAt2 < 128) {
                                b6 = AbstractC11096c.f35196a[cCharAt2];
                            } else {
                                byte[] bArr2 = AbstractC11096c.f35196a;
                                b6 = -1;
                            }
                            if (b6 < 0 || b6 >= 10 || j7 < j14) {
                                num = null;
                            } else {
                                long j15 = j7 * j13;
                                num = null;
                                long j16 = b6;
                                if (j15 >= j16 - Long.MIN_VALUE) {
                                    j7 = j15 - j16;
                                    i14 = i15;
                                }
                            }
                        } else {
                            num = null;
                            if (i13 != 0) {
                                lValueOf2 = Long.valueOf(j7);
                            } else if (j7 != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j7);
                            }
                        }
                        l7 = num;
                    }
                }
            }
        }
        if (l7 != 0) {
            l7 = lValueOf;
            l7 = lValueOf2;
            if (l7.longValue() == l7.intValue()) {
                return Integer.valueOf(l7.intValue());
            }
        }
        l7 = lValueOf;
        l7 = lValueOf2;
        return num;
    }

    /* JADX INFO: renamed from: X */
    public static final Object m114004X(InterfaceC11939x interfaceC11939x, Object obj) {
        Object objMo32218s = interfaceC11939x.mo32218s(obj);
        if (!(objMo32218s instanceof C11929n)) {
            return C23454a0.f92919a;
        }
        return ((C11930o) AbstractC3006f0.m8699E(C30064k.f122676w, new C0109h(interfaceC11939x, obj, (InterfaceC30057d) null, 15))).f39032a;
    }

    /* JADX INFO: renamed from: Z */
    public static final C2817b m114005Z(byte[] payload) {
        boolean z4;
        AbstractC22676k.m65750j(payload, "payload");
        C15990r c15990r = new C15990r(new C38445a(new C5363q(AbstractC39421y.m125916A(payload))));
        AbstractC22452f abstractC22452fM45147M = (AbstractC22452f) c15990r.f60514z;
        do {
            z4 = abstractC22452fM45147M instanceof C22447a;
            if (!z4) {
                abstractC22452fM45147M = c15990r.m45147M();
            }
            if (abstractC22452fM45147M == null) {
                break;
            }
        } while (!z4);
        C22447a c22447a = (C22447a) abstractC22452fM45147M;
        if (c22447a != null) {
            return m113998R(c22447a, c15990r);
        }
        throw new IllegalStateException(("expected start tag: last = " + ((AbstractC22452f) c15990r.f60514z)).toString());
    }

    /* JADX INFO: renamed from: a */
    public static final void m114006a(String error, Modifier modifier, Composer composer, int i13) {
        Typeface typefaceM109098b;
        C28655q c28655q;
        AbstractC22676k.m65750j(error, "error");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(228805126);
        int i14 = i13 | (c28655q2.m87153g(error) ? 4 : 2);
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            C11674s c11674sM31084m = AbstractC11673r.m31084m(c28655q2);
            c28655q2.m87150e0(72788359);
            boolean zM87153g = c28655q2.m87153g(c11674sM31084m);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                Integer num = c11674sM31084m.f37729k;
                if (num == null || (typefaceM109098b = AbstractC34523k.m109098b(context, num.intValue())) == null) {
                    typefaceM109098b = Typeface.DEFAULT;
                }
                objM87133R = typefaceM109098b;
                c28655q2.m87172p0(objM87133R);
            }
            Typeface typeface = (Typeface) objM87133R;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(72793700);
            boolean zM87153g2 = c28655q2.m87153g(c11674sM31084m);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39183o(interfaceC39171c.mo735h(C39183o.m124805c(AbstractC11672q.f37694d.f37725g) * c11674sM31084m.f37722d));
                c28655q2.m87172p0(objM87133R2);
            }
            long j7 = ((C39183o) objM87133R2).f168429a;
            c28655q2.m87173q(false);
            long jM43088c = C15069l3.m43147a(c28655q2).m43088c();
            AbstractC22676k.m65747g(typeface);
            C28783u c28783u = new C28783u(new C29934u0(typeface, 20));
            c28655q2.m87150e0(72806137);
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C2185f(17);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(error, AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R3), jM43088c, j7, null, null, c28783u, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, i14 & 14, 0, 130992);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2548j1(error, i13, modifier);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m114007b(Nudge nudge, NudgeStep step, int i13, C25607n c25607n, Composer composer, int i14) {
        boolean z4;
        Modifier modifierM3425v;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1804023969);
        boolean z13 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp >= 600;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        C2307m c2307m = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
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
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
        AbstractC22989q.m66760a(AbstractC12313p.m34307y(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.4f, C17919x.f69625b), AbstractC17918w0.f69621a), (step.getFormFactor() instanceof ModalFormFactor) && ((ModalFormFactor) step.getFormFactor()).getCanClickOutsideToClose(), new C26741f((Object) c25607n, 1), c28655q, 6), c28655q, 0);
        c28655q.m87152f0(457787633);
        InterfaceC30057d interfaceC30057d = null;
        Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3427x(c2314t, null, 3), C2299e.f9102E);
        if (z13) {
            modifierM3425v = AbstractC1102d.m3409f(0.5f, modifierMo3400a);
            z4 = false;
        } else {
            c28655q.m87152f0(-412521741);
            C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            z4 = false;
            c28655q.m87173q(false);
            modifierM3425v = AbstractC1102d.m3425v(modifierMo3400a, 0.0f, c35035m.f148320Q, 1);
        }
        c28655q.m87173q(z4);
        Modifier modifierMo3471e = modifierM3425v.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0(new C16482y1(2, 1, interfaceC30057d)), 6));
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z4);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
        AbstractC32100b.m99856a(step, new C32561l(nudge, step, i13, c25607n), null, c28655q, 72, 4);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C29280n(nudge, step, i13, c25607n, i14, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m114008c(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(565863980);
        int i14 = i13 | 6;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            C16493b0 c16493b0 = (C16493b0) c28655q.m87161k(AbstractC16495c0.f63391a);
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            Boolean boolValueOf = Boolean.valueOf(c13821r1M92099U.mo39182c());
            c28655q.m87150e0(-294083256);
            boolean zM87153g = c28655q.m87153g(c16493b0) | c28655q.m87153g(c13821r1M92099U);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C1778e(c16493b0, c13821r1M92099U, null, 10);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, boolValueOf);
            modifier2 = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifier2, c13821r1M92099U, 14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 20;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier2), f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c37816b.invoke(C23016z.f90757a, c28655q, Integer.valueOf((i14 & 112) | 6));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier2, c37816b, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Exception m114009d(C26289a c26289a, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(c26289a, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(c26289a, str);
        }
        throw new FrameworkClassParsingException();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:108:0x0247  */
    /* JADX WARN: Code duplicated, block: B:111:0x024c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0268  */
    /* JADX WARN: Code duplicated, block: B:116:0x026b  */
    /* JADX WARN: Code duplicated, block: B:118:0x026e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0273  */
    /* JADX WARN: Code duplicated, block: B:122:0x0279  */
    /* JADX WARN: Code duplicated, block: B:125:0x0280  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:76:0x0160, B:78:0x0166, B:81:0x0175), top: B:130:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0175 A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:76:0x0160, B:78:0x0166, B:81:0x0175), top: B:130:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff  */
    /* JADX INFO: renamed from: e */
    public static final void m114010e(C28932x1 c28932x1, RemoteViews remoteViews, InterfaceC26398o interfaceC26398o, C28931x0 c28931x0) {
        int i13;
        C22669g0 c22669g0;
        Context context;
        C22669g0 c22669g1;
        C22669g0 c22669g2;
        C27594b c27594b;
        AbstractC0514e abstractC0514e;
        C35727p c35727p;
        C36851b c36851b;
        int iOrdinal;
        Object obj;
        Object obj2;
        List list;
        float fM99535d;
        float fM99535d2;
        boolean z4;
        float f13;
        InterfaceC27593a interfaceC27593a;
        Integer num;
        int iIntValue;
        int i14;
        Context context2 = c28932x1.f117049a;
        C22669g0 c22669g3 = new C22669g0();
        C22669g0 c22669g4 = new C22669g0();
        C22669g0 c22669g5 = new C22669g0();
        C22669g0 c22669g6 = new C22669g0();
        C22669g0 c22669g7 = new C22669g0();
        c22669g7.f89336w = EnumC26402s.f104853w;
        C22669g0 c22669g8 = new C22669g0();
        C22669g0 c22669g9 = new C22669g0();
        C22669g0 c22669g10 = new C22669g0();
        C22669g0 c22669g11 = new C22669g0();
        interfaceC26398o.mo78097a(C23454a0.f92919a, new C14076n(c22669g8, c22669g3, c22669g4, context2, remoteViews, c28931x0, c22669g5, c22669g7, c22669g6, c28932x1, c22669g10, c22669g9, c22669g11));
        C35733v c35733v = (C35733v) c22669g3.f89336w;
        C35725n c35725n = (C35725n) c22669g4.f89336w;
        Object obj3 = AbstractC28869c1.f116844a;
        int i15 = c28931x0.f117047b;
        int i16 = c28931x0.f117046a;
        int i17 = 0;
        if (i15 != -1) {
            if (Build.VERSION.SDK_INT >= 31) {
                throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
            }
            AbstractC0514e abstractC0514e2 = c35733v != null ? c35733v.f151984a : null;
            AbstractC0514e abstractC0514e3 = c35725n != null ? c35725n.f151971a : null;
            if (m114024y(abstractC0514e2) || m114024y(abstractC0514e3)) {
                boolean z13 = (abstractC0514e2 instanceof C0512c) || (abstractC0514e2 instanceof C0511b);
                boolean z14 = (abstractC0514e3 instanceof C0512c) || (abstractC0514e3 instanceof C0511b);
                if (z13 && z14) {
                    i13 = R.layout.size_match_match;
                } else if (z13) {
                    i13 = R.layout.size_match_wrap;
                } else {
                    i13 = z14 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap;
                }
                c22669g0 = c22669g7;
                int iM31937E = AbstractC11894a.m31937E(remoteViews, c28932x1, R.id.sizeViewStub, i13, null);
                boolean z15 = abstractC0514e2 instanceof C0510a;
                C0513d c0513d = C0513d.f1722a;
                context = context2;
                C0512c c0512c = C0512c.f1721a;
                C0511b c0511b = C0511b.f1720a;
                if (z15) {
                    c22669g2 = c22669g11;
                    c22669g1 = c22669g9;
                    remoteViews.setInt(iM31937E, "setWidth", (int) TypedValue.applyDimension(1, ((C0510a) abstractC0514e2).f1719a, context.getResources().getDisplayMetrics()));
                } else {
                    c22669g1 = c22669g9;
                    c22669g2 = c22669g11;
                    if (!AbstractC22676k.m65745e(abstractC0514e2, c0511b) && !AbstractC22676k.m65745e(abstractC0514e2, c0512c) && !AbstractC22676k.m65745e(abstractC0514e2, c0513d) && abstractC0514e2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (abstractC0514e3 instanceof C0510a) {
                    remoteViews.setInt(iM31937E, "setHeight", (int) TypedValue.applyDimension(1, ((C0510a) abstractC0514e3).f1719a, context.getResources().getDisplayMetrics()));
                } else if (!AbstractC22676k.m65745e(abstractC0514e3, c0511b) && !AbstractC22676k.m65745e(abstractC0514e3, c0512c) && !AbstractC22676k.m65745e(abstractC0514e3, c0513d) && abstractC0514e3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            c27594b = (C27594b) c22669g8.f89336w;
            if (c27594b != null) {
                interfaceC27593a = c27594b.f111086a;
                num = c28932x1.f117061m;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i16;
                }
                try {
                    i14 = 25;
                    if (c28932x1.f117054f) {
                        remoteViews.setOnClickFillInIntent(iIntValue, AbstractC29995e.m91723b(interfaceC27593a, c28932x1, iIntValue, new C29529k(i14)));
                    } else {
                        remoteViews.setOnClickPendingIntent(iIntValue, AbstractC29995e.m91725d(interfaceC27593a, c28932x1, iIntValue, new C29529k(i14)));
                    }
                } catch (Throwable th3) {
                    Log.e("GlanceAppWidget", "Unrecognized Action: " + interfaceC27593a, th3);
                }
            }
            abstractC0514e = (AbstractC0514e) c22669g6.f89336w;
            if (abstractC0514e != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C28903o.m87823a(remoteViews, i16, abstractC0514e);
                } else {
                    Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                }
            }
            c35727p = (C35727p) c22669g5.f89336w;
            if (c35727p != null) {
                Resources resources = context.getResources();
                C35726o c35726o = c35727p.f151974a;
                float fM99535d3 = AbstractC32004s.m99535d(c35726o.f151973b, resources) + c35726o.f151972a;
                C35726o c35726o2 = c35727p.f151975b;
                fM99535d = AbstractC32004s.m99535d(c35726o2.f151973b, resources) + c35726o2.f151972a;
                C35726o c35726o3 = c35727p.f151976c;
                float fM99535d4 = AbstractC32004s.m99535d(c35726o3.f151973b, resources) + c35726o3.f151972a;
                C35726o c35726o4 = c35727p.f151977d;
                float fM99535d5 = AbstractC32004s.m99535d(c35726o4.f151973b, resources) + c35726o4.f151972a;
                C35726o c35726o5 = c35727p.f151978e;
                fM99535d2 = AbstractC32004s.m99535d(c35726o5.f151973b, resources) + c35726o5.f151972a;
                C35726o c35726o6 = c35727p.f151979f;
                float fM99535d6 = AbstractC32004s.m99535d(c35726o6.f151973b, resources) + c35726o6.f151972a;
                z4 = c28932x1.f117051c;
                if (z4) {
                    f13 = fM99535d2;
                } else {
                    f13 = fM99535d;
                }
                float f14 = fM99535d3 + f13;
                if (!z4) {
                    fM99535d = fM99535d2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                remoteViews.setViewPadding(c28931x0.f117046a, (int) TypedValue.applyDimension(1, f14, displayMetrics), (int) TypedValue.applyDimension(1, fM99535d4, displayMetrics), (int) TypedValue.applyDimension(1, fM99535d5 + fM99535d, displayMetrics), (int) TypedValue.applyDimension(1, fM99535d6, displayMetrics));
            }
            if (c22669g10.f89336w == null) {
                throw new ClassCastException();
            }
            c36851b = (C36851b) c22669g2.f89336w;
            if (c36851b != null) {
                obj = c36851b.f157626a.f157625a.get(AbstractC36852c.f157627a);
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                list = (List) obj2;
                if (list != null) {
                    remoteViews.setContentDescription(i16, AbstractC25265s.m74110N0(list, null, null, null, null, 63));
                }
            }
            iOrdinal = ((EnumC26402s) c22669g0.f89336w).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i17 = 4;
                } else {
                    if (iOrdinal == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i17 = 8;
                }
            }
            remoteViews.setViewVisibility(i16, i17);
        }
        if (c35733v != null) {
            m114012g(remoteViews, c35733v, i16);
        }
        if (c35725n != null) {
            m114011f(remoteViews, c35725n, i16);
        }
        context = context2;
        c22669g0 = c22669g7;
        c22669g1 = c22669g9;
        c22669g2 = c22669g11;
        c27594b = (C27594b) c22669g8.f89336w;
        if (c27594b != null) {
            interfaceC27593a = c27594b.f111086a;
            num = c28932x1.f117061m;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i16;
            }
            i14 = 25;
            if (c28932x1.f117054f) {
                remoteViews.setOnClickFillInIntent(iIntValue, AbstractC29995e.m91723b(interfaceC27593a, c28932x1, iIntValue, new C29529k(i14)));
            } else {
                remoteViews.setOnClickPendingIntent(iIntValue, AbstractC29995e.m91725d(interfaceC27593a, c28932x1, iIntValue, new C29529k(i14)));
            }
        }
        abstractC0514e = (AbstractC0514e) c22669g6.f89336w;
        if (abstractC0514e != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C28903o.m87823a(remoteViews, i16, abstractC0514e);
            } else {
                Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
            }
        }
        c35727p = (C35727p) c22669g5.f89336w;
        if (c35727p != null) {
            Resources resources2 = context.getResources();
            C35726o c35726o7 = c35727p.f151974a;
            float fM99535d7 = AbstractC32004s.m99535d(c35726o7.f151973b, resources2) + c35726o7.f151972a;
            C35726o c35726o8 = c35727p.f151975b;
            fM99535d = AbstractC32004s.m99535d(c35726o8.f151973b, resources2) + c35726o8.f151972a;
            C35726o c35726o9 = c35727p.f151976c;
            float fM99535d8 = AbstractC32004s.m99535d(c35726o9.f151973b, resources2) + c35726o9.f151972a;
            C35726o c35726o10 = c35727p.f151977d;
            float fM99535d9 = AbstractC32004s.m99535d(c35726o10.f151973b, resources2) + c35726o10.f151972a;
            C35726o c35726o11 = c35727p.f151978e;
            fM99535d2 = AbstractC32004s.m99535d(c35726o11.f151973b, resources2) + c35726o11.f151972a;
            C35726o c35726o12 = c35727p.f151979f;
            float fM99535d10 = AbstractC32004s.m99535d(c35726o12.f151973b, resources2) + c35726o12.f151972a;
            z4 = c28932x1.f117051c;
            if (z4) {
                f13 = fM99535d2;
            } else {
                f13 = fM99535d;
            }
            float f15 = fM99535d7 + f13;
            if (!z4) {
                fM99535d = fM99535d2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(c28931x0.f117046a, (int) TypedValue.applyDimension(1, f15, displayMetrics2), (int) TypedValue.applyDimension(1, fM99535d8, displayMetrics2), (int) TypedValue.applyDimension(1, fM99535d9 + fM99535d, displayMetrics2), (int) TypedValue.applyDimension(1, fM99535d10, displayMetrics2));
        }
        if (c22669g10.f89336w == null) {
            throw new ClassCastException();
        }
        c36851b = (C36851b) c22669g2.f89336w;
        if (c36851b != null) {
            obj = c36851b.f157626a.f157625a.get(AbstractC36852c.f157627a);
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            list = (List) obj2;
            if (list != null) {
                remoteViews.setContentDescription(i16, AbstractC25265s.m74110N0(list, null, null, null, null, 63));
            }
        }
        iOrdinal = ((EnumC26402s) c22669g0.f89336w).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i17 = 4;
            } else {
                if (iOrdinal == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i17 = 8;
            }
        }
        remoteViews.setViewVisibility(i16, i17);
    }

    /* JADX INFO: renamed from: f */
    public static final void m114011f(RemoteViews remoteViews, C35725n c35725n, int i13) {
        AbstractC0514e abstractC0514e = c35725n.f151971a;
        int i14 = Build.VERSION.SDK_INT;
        C0511b c0511b = C0511b.f1720a;
        C0513d c0513d = C0513d.f1722a;
        if (i14 >= 31) {
            if (i14 >= 33 || !AbstractC37056f.m118959K(c0513d, c0511b).contains(abstractC0514e)) {
                C28903o.m87824b(remoteViews, i13, abstractC0514e);
                return;
            }
            return;
        }
        List listM118959K = AbstractC37056f.m118959K(c0513d, C0512c.f1721a, c0511b);
        Object obj = AbstractC28869c1.f116844a;
        if (listM118959K.contains(abstractC0514e)) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + abstractC0514e + " requires a complex layout before API 31");
    }

    /* JADX INFO: renamed from: g */
    public static final void m114012g(RemoteViews remoteViews, C35733v c35733v, int i13) {
        AbstractC0514e abstractC0514e = c35733v.f151984a;
        int i14 = Build.VERSION.SDK_INT;
        C0511b c0511b = C0511b.f1720a;
        C0513d c0513d = C0513d.f1722a;
        if (i14 >= 31) {
            if (i14 >= 33 || !AbstractC37056f.m118959K(c0513d, c0511b).contains(abstractC0514e)) {
                C28903o.m87825c(remoteViews, i13, abstractC0514e);
                return;
            }
            return;
        }
        List listM118959K = AbstractC37056f.m118959K(c0513d, C0512c.f1721a, c0511b);
        Object obj = AbstractC28869c1.f116844a;
        if (listM118959K.contains(abstractC0514e)) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + abstractC0514e + " requires a complex layout before API 31");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m114013h(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < bArr.length; i14++) {
            i13 |= bArr[i14] ^ bArr2[i14];
        }
        return i13 == 0;
    }

    /* JADX INFO: renamed from: i */
    public static List m114014i(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C11095b(0, iArr.length, iArr);
    }

    /* JADX INFO: renamed from: j */
    public static final C2726e m114015j(C3033m c3033m) {
        return new C2726e(c3033m);
    }

    /* JADX INFO: renamed from: k */
    public static int m114016k(long j7) {
        int i13 = (int) j7;
        if (((long) i13) == j7) {
            return i13;
        }
        throw new IllegalArgumentException(AbstractC31780b.m98690k("Out of range: %s", Long.valueOf(j7)));
    }

    /* JADX INFO: renamed from: l */
    public static final String m114017l(C2817b c2817b) {
        AbstractC22452f abstractC22452fM8018u = c2817b.m8018u();
        if (abstractC22452fM8018u instanceof C22451e) {
            String str = ((C22451e) abstractC22452fM8018u).f87886b;
            return str == null ? "" : str;
        }
        if (abstractC22452fM8018u == null || (abstractC22452fM8018u instanceof C22448b)) {
            return "";
        }
        throw new DeserializationException("expected XmlToken.Text element, found " + abstractC22452fM8018u);
    }

    /* JADX INFO: renamed from: o */
    public static void m114018o() {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m114019p(InterfaceC16882j interfaceC16882j, KeyEvent keyEvent) {
        if (interfaceC16882j == null) {
            return false;
        }
        return interfaceC16882j.superDispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    public static AbstractC31309z m114020q(String value) {
        AbstractC22676k.m65750j(value, "value");
        switch (value.hashCode()) {
            case -1737337862:
                if (value.equals("PASSWORD_VERIFIER")) {
                    return C31293r.f128832b;
                }
                break;
            case -1409329619:
                if (value.equals("PASSWORD_SRP")) {
                    return C31291q.f128829b;
                }
                break;
            case -1406772517:
                if (value.equals("WEB_AUTHN")) {
                    return C31307y.f128857b;
                }
                break;
            case -1362602558:
                if (value.equals("SMS_MFA")) {
                    return C31301v.f128846b;
                }
                break;
            case -1362600187:
                if (value.equals("SMS_OTP")) {
                    return C31303w.f128851b;
                }
                break;
            case 161754570:
                if (value.equals("SOFTWARE_TOKEN_MFA")) {
                    return C31305x.f128856b;
                }
                break;
            case 325396255:
                if (value.equals("DEVICE_SRP_AUTH")) {
                    return C31281l.f128807b;
                }
                break;
            case 338106308:
                if (value.equals("NEW_PASSWORD_REQUIRED")) {
                    return C31287o.f128820b;
                }
                break;
            case 359356710:
                if (value.equals("MFA_SETUP")) {
                    return C31285n.f128815b;
                }
                break;
            case 613324744:
                if (value.equals("EMAIL_OTP")) {
                    return C31283m.f128809b;
                }
                break;
            case 645737717:
                if (value.equals("CUSTOM_CHALLENGE")) {
                    return C31277j.f128802b;
                }
                break;
            case 823370944:
                if (value.equals("SELECT_CHALLENGE")) {
                    return C31297t.f128842b;
                }
                break;
            case 872896308:
                if (value.equals("SELECT_MFA_TYPE")) {
                    return C31299u.f128845b;
                }
                break;
            case 1330737924:
                if (value.equals("ADMIN_NO_SRP_AUTH")) {
                    return C31275i.f128799b;
                }
                break;
            case 1362077265:
                if (value.equals("DEVICE_PASSWORD_VERIFIER")) {
                    return C31279k.f128805b;
                }
                break;
            case 1999612571:
                if (value.equals("PASSWORD")) {
                    return C31289p.f128826b;
                }
                break;
        }
        return new C31295s(value);
    }

    /* JADX INFO: renamed from: u */
    public static int m114021u(int i13, int i14, int i15, int[] iArr) {
        while (i14 < i15) {
            if (iArr[i14] == i13) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public static final C1508p m114022v(InterfaceC25140e0 interfaceC25140e0) {
        C1508p c1508pM4829e0 = C1533u.m4829e0();
        AbstractC22676k.m65749i(c1508pM4829e0, "newBuilder()");
        m113996P(c1508pM4829e0, interfaceC25140e0.mo73692c());
        long epochMilli = interfaceC25140e0.getTime().toEpochMilli();
        c1508pM4829e0.m4815c();
        C1533u.m4840z((C1533u) c1508pM4829e0.f6114x, epochMilli);
        ZoneOffset zoneOffsetMo73695d = interfaceC25140e0.mo73695d();
        if (zoneOffsetMo73695d != null) {
            int totalSeconds = zoneOffsetMo73695d.getTotalSeconds();
            c1508pM4829e0.m4815c();
            C1533u.m4838x((C1533u) c1508pM4829e0.f6114x, totalSeconds);
        }
        return c1508pM4829e0;
    }

    /* JADX INFO: renamed from: w */
    public static final C1508p m114023w(InterfaceC25146g0 interfaceC25146g0) {
        C1508p c1508pM4829e0 = C1533u.m4829e0();
        AbstractC22676k.m65749i(c1508pM4829e0, "newBuilder()");
        m113996P(c1508pM4829e0, interfaceC25146g0.mo73692c());
        long epochMilli = interfaceC25146g0.getStartTime().toEpochMilli();
        c1508pM4829e0.m4815c();
        C1533u.m4822A((C1533u) c1508pM4829e0.f6114x, epochMilli);
        long epochMilli2 = interfaceC25146g0.mo73693e().toEpochMilli();
        c1508pM4829e0.m4815c();
        C1533u.m4823B((C1533u) c1508pM4829e0.f6114x, epochMilli2);
        ZoneOffset zoneOffsetMo73691b = interfaceC25146g0.mo73691b();
        if (zoneOffsetMo73691b != null) {
            int totalSeconds = zoneOffsetMo73691b.getTotalSeconds();
            c1508pM4829e0.m4815c();
            C1533u.m4830p((C1533u) c1508pM4829e0.f6114x, totalSeconds);
        }
        ZoneOffset zoneOffsetMo73694f = interfaceC25146g0.mo73694f();
        if (zoneOffsetMo73694f != null) {
            int totalSeconds2 = zoneOffsetMo73694f.getTotalSeconds();
            c1508pM4829e0.m4815c();
            C1533u.m4831q((C1533u) c1508pM4829e0.f6114x, totalSeconds2);
        }
        return c1508pM4829e0;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m114024y(AbstractC0514e abstractC0514e) {
        if (abstractC0514e instanceof C0510a) {
            return true;
        }
        if (AbstractC22676k.m65745e(abstractC0514e, C0511b.f1720a) || AbstractC22676k.m65745e(abstractC0514e, C0512c.f1721a) || AbstractC22676k.m65745e(abstractC0514e, C0513d.f1722a) || abstractC0514e == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: z */
    public static final C17924z0 m114025z(C17924z0 c17924z0, C17924z0 c17924z1, float f13) {
        return new C17924z0(AbstractC17918w0.m51535w(c17924z0.f69669a, c17924z1.f69669a, f13), AbstractC15751g.m44428H(c17924z0.f69670b, c17924z1.f69670b, f13), AbstractC12889b.m36249O(c17924z0.f69671c, c17924z1.f69671c, f13));
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo59953N(boolean z4);

    /* JADX INFO: renamed from: O */
    public abstract void mo59954O(boolean z4);

    /* JADX INFO: renamed from: Y */
    public abstract TransformationMethod mo59955Y(TransformationMethod transformationMethod);

    /* JADX INFO: renamed from: m */
    public C34585c0 m114026m(C4358a c4358a) {
        ByteBuffer byteBuffer = c4358a.f2063E;
        byteBuffer.getClass();
        AbstractC35849g.m113802d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo31690n(c4358a, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public abstract C34585c0 mo31690n(C4358a c4358a, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: r */
    public abstract List mo43597r();

    /* JADX INFO: renamed from: s */
    public abstract InputFilter[] mo59956s(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: t */
    public abstract int mo43598t();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo59957x();
}
