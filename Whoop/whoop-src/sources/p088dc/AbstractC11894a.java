package p088dc;

import a01.C0085e;
import ad3.AbstractC0770m;
import ad3.C0775r;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.glance.appwidget.protobuf.C1371b0;
import androidx.glance.appwidget.protobuf.C1376d;
import androidx.glance.appwidget.protobuf.C1381e1;
import androidx.glance.appwidget.protobuf.C1418s0;
import androidx.glance.appwidget.protobuf.InterfaceC1372b1;
import androidx.glance.appwidget.protobuf.InterfaceC1380e0;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1836v0;
import b30.C2549j2;
import b30.C2557k2;
import b30.C2564l1;
import b30.C2565l2;
import b30.C2580n1;
import b30.C2588o1;
import b30.C2669z3;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bf.AbstractC3187b;
import bf.InterfaceC3186a;
import bh.InterfaceC3242e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.AbstractC4590k;
import ch.AbstractC4596q;
import ch.C4591l;
import coil.compose.AsyncImagePainter;
import coil3.request.NullRequestDataException;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.maps.ScreenCoordinate;
import com.squareup.wire.AbstractC5583n;
import d30.C11514a;
import d30.C11566v;
import d40.AbstractC11673r;
import e30.AbstractC12605c;
import e93.AbstractC12889b;
import ec3.C13081r1;
import fi.C14498d;
import fi.C14500f;
import fi.C14503i;
import g40.C15352f4;
import g40.C15389m1;
import g40.C15399o1;
import g40.C15404p1;
import g40.C15424t1;
import gf.C15762c;
import gf.C15767h;
import gf.InterfaceC15761b;
import gf.InterfaceC15771l;
import h20.C16651f;
import h20.C16657g;
import h20.C16735t;
import hc3.AbstractC17182o;
import hc3.C17171d;
import hg3.AbstractC17269i;
import i93.C18283i;
import i93.C18284j;
import io.sentry.InterfaceC20602v0;
import io.sentry.rrweb.AbstractC20523b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C22139d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23811y;
import live.hms.video.utils.AndroidSDKConstants;
import m40.C25046w;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import ne3.C26610e;
import ne3.C26643w;
import no.nordicsemi.android.dfu.DfuBaseService;
import oa3.C27775r;
import ob3.InterfaceC27798h;
import oq1.C28119c;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p002a0.C0030i1;
import p003a1.C0106e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p006a4.AbstractC0354a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2364d2;
import p040c0.AbstractC3781t1;
import p043c4.C3948a0;
import p043c4.C3951c;
import p048ce.AbstractC4482w;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11391p2;
import p077d0.C11362i1;
import p077d0.C11413x;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12314q;
import p105e1.C12515b;
import p132f0.C13825t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15034i;
import p163g1.C15045j;
import p163g1.C15069l3;
import p163g1.C15071l5;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p180h0.C16368c;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16439p3;
import p182h3.C16793i;
import p197hj.C17327j;
import p197hj.C17338u;
import p206i0.AbstractC17833k;
import p206i0.C17829g;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17875c1;
import p208i2.C17903p;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p249jc.AbstractC21598x;
import p254jj.RunnableC21737c;
import p266jz.C22057e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p294l3.C23283u0;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p328mj.AbstractC25611r;
import p328mj.C25594a;
import p328mj.C25596c;
import p328mj.C25607n;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28592a0;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28780r;
import p392p3.InterfaceC28770h;
import p395p6.AbstractC28865b0;
import p395p6.C28932x1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29672a;
import p409q0.C29674b;
import p409q0.C29696t;
import p412q3.C29891y;
import p461rh.InterfaceC31421j;
import p482s7.AbstractC32237a;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34323i;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p525uj.AbstractC35032j;
import p525uj.C35035m;
import p581we.C37199o;
import p585wj.AbstractC37316b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p607x8.InterfaceC38049d;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p636y3.C39172d;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import pf.AbstractC29125c;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30100e;
import qa3.C30129e1;
import qa3.C30145k;
import qa3.C30146k0;
import qa3.C30154o;
import qa3.C30171w0;
import r40.AbstractC30916a;
import r80.AbstractC31061c;
import r93.AbstractC31167y0;
import r93.C31112c0;
import r93.C31164x;
import s20.C32077a;
import sa3.AbstractC32330d;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import se.AbstractC32410a;
import se.AbstractC32411b;
import t20.C33333n;
import ta3.AbstractC33686l;
import ta3.C33678d;
import ta3.C33680f;
import te0.AbstractC33745d;
import tj.AbstractC33863b;
import ua3.C34724d;
import ua3.C34727g;
import v00.C35459c0;
import v63.AbstractC35745c;
import va3.C35850h;
import ve.C35920e;
import w10.C36689a;
import w10.C36690b;
import w10.C36691c;
import w10.InterfaceC36692d;
import wa3.C36998i;
import wa3.C37010o;
import wb3.AbstractC37056f;
import xc3.AbstractC38195a;
import y00.C38915o4;
import y00.EnumC38828f4;
import y00.EnumC38910o;

/* JADX INFO: renamed from: dc.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11894a {

    /* JADX INFO: renamed from: a */
    public static C27430e f38883a;

    /* JADX INFO: renamed from: A */
    public static C2364d2 m31933A() {
        Object obj = C2364d2.f9330f.get();
        AbstractC22676k.m65747g(obj);
        return (C2364d2) obj;
    }

    /* JADX INFO: renamed from: B */
    public static final C27775r m31934B(C30146k0 proto, InterfaceC32332f nameResolver, C32334h c32334h, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        C37010o propertySignature = AbstractC33686l.f140738d;
        AbstractC22676k.m65749i(propertySignature, "propertySignature");
        C33680f c33680f = (C33680f) AbstractC21478l0.m60453x(proto, propertySignature);
        if (c33680f != null) {
            if (z4) {
                C36998i c36998i = C34727g.f146269a;
                C34724d c34724dM109650b = C34727g.m109650b(proto, nameResolver, c32334h, z14);
                if (c34724dM109650b != null) {
                    return AbstractC12314q.m34341u(c34724dM109650b);
                }
            } else if (z13 && (c33680f.f140695x & 2) == 2) {
                C33678d c33678d = c33680f.f140697z;
                AbstractC22676k.m65749i(c33678d, "getSyntheticMethod(...)");
                return new C27775r(nameResolver.getString(c33678d.f140679y).concat(nameResolver.getString(c33678d.f140680z)));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m31936D(EnumC38910o enumC38910o) {
        int i13 = enumC38910o == null ? -1 : AbstractC30916a.f127495a[enumC38910o.ordinal()];
        if (i13 == -1) {
            return false;
        }
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3 || i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: E */
    public static final int m31937E(RemoteViews remoteViews, C28932x1 c28932x1, int i13, int i14, Integer num) {
        int iIntValue;
        if (i13 == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iIncrementAndGet = c28932x1.f117055g.incrementAndGet();
            if (iIncrementAndGet >= AbstractC28865b0.f116812j) {
                throw new IllegalStateException("There are too many views");
            }
            iIntValue = iIncrementAndGet + AbstractC28865b0.f116811i;
        }
        if (iIntValue != -1) {
            remoteViews.setInt(i13, "setInflatedId", iIntValue);
        }
        if (i14 != 0) {
            remoteViews.setInt(i13, "setLayoutResource", i14);
        }
        remoteViews.setViewVisibility(i13, 0);
        return iIntValue;
    }

    /* JADX INFO: renamed from: F */
    public static final void m31938F(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        abstractC23811y.mo69863p0();
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m31939G(Composer composer) {
        return (((Configuration) ((C28655q) composer).m87161k(AndroidCompositionLocals_androidKt.f4975a)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: H */
    public static final AbstractC31167y0 m31940H(C30145k c30145k, boolean z4, InterfaceC32332f nameResolver, C32334h c32334h, C16793i c16793i, C15352f4 c15352f4) {
        InterfaceC27798h interfaceC27798h;
        AbstractC22676k.m65750j(c30145k, "<this>");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        if ((c30145k.f123300y & 8) == 8) {
            C35850h c35850hM36240F = AbstractC12889b.m36240F(nameResolver, c30145k.f123289W);
            C30171w0 c30171w0M60670Z = AbstractC21598x.m60670Z(c30145k, c32334h);
            if ((c30171w0M60670Z != null && (interfaceC27798h = (InterfaceC27798h) c16793i.invoke(c30171w0M60670Z)) != null) || (interfaceC27798h = (InterfaceC27798h) c15352f4.invoke(c35850hM36240F)) != null) {
                return new C31164x(c35850hM36240F, interfaceC27798h);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC12889b.m36240F(nameResolver, c30145k.f123271E) + " with property " + c35850hM36240F).toString());
        }
        if (z4 && AbstractC32330d.f133811k.mo91233e(c30145k.f123301z).booleanValue()) {
            List list = c30145k.f123282P;
            AbstractC22676k.m65749i(list, "getConstructorList(...)");
            Iterator it = list.iterator();
            boolean z13 = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z13) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (!AbstractC32330d.f133814n.mo91233e(((C30154o) next).f123372z).booleanValue()) {
                    if (!z13) {
                        z13 = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            C30154o c30154o = (C30154o) obj;
            if (c30154o != null) {
                List list2 = c30154o.f123364E;
                AbstractC22676k.m65749i(list2, "getValueParameterList(...)");
                List<C30129e1> list3 = list2;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                for (C30129e1 c30129e1 : list3) {
                    arrayList.add(new C23465k(AbstractC12889b.m36240F(nameResolver, c30129e1.f123114E), c16793i.invoke(AbstractC21598x.m60713y0(c30129e1, c32334h))));
                }
                return new C31112c0(arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static int m31941I(Object obj, InterfaceC1372b1 interfaceC1372b1, byte[] bArr, int i13, int i14, int i15, C1376d c1376d) throws InvalidProtocolBufferException {
        C1418s0 c1418s0 = (C1418s0) interfaceC1372b1;
        int i16 = c1376d.f5879d + 1;
        c1376d.f5879d = i16;
        if (i16 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM4522E = c1418s0.m4522E(obj, bArr, i13, i14, i15, c1376d);
        c1376d.f5879d--;
        c1376d.f5878c = obj;
        return iM4522E;
    }

    /* JADX INFO: renamed from: J */
    public static int m31942J(Object obj, InterfaceC1372b1 interfaceC1372b1, byte[] bArr, int i13, int i14, C1376d c1376d) throws InvalidProtocolBufferException {
        int iM31971t = i13 + 1;
        int i15 = bArr[i13];
        if (i15 < 0) {
            iM31971t = m31971t(i15, bArr, iM31971t, c1376d);
            i15 = c1376d.f5876a;
        }
        int i16 = iM31971t;
        if (i15 < 0 || i15 > i14 - i16) {
            throw InvalidProtocolBufferException.m4267g();
        }
        int i17 = c1376d.f5879d + 1;
        c1376d.f5879d = i17;
        if (i17 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = i16 + i15;
        interfaceC1372b1.mo4293g(obj, bArr, i16, i18, c1376d);
        c1376d.f5879d--;
        c1376d.f5878c = obj;
        return i18;
    }

    /* JADX INFO: renamed from: K */
    public static void m31943K(InterfaceC30100e interfaceC30100e, int i13, InterfaceC38049d interfaceC38049d) {
        long jMo1675h = interfaceC30100e.mo1675h(i13);
        List listMo1674d = interfaceC30100e.mo1674d(jMo1675h);
        if (listMo1674d.isEmpty()) {
            return;
        }
        if (i13 == interfaceC30100e.mo1676j() - 1) {
            throw new IllegalStateException();
        }
        long jMo1675h2 = interfaceC30100e.mo1675h(i13 + 1) - interfaceC30100e.mo1675h(i13);
        if (jMo1675h2 > 0) {
            interfaceC38049d.accept(new C30096a(listMo1674d, jMo1675h, jMo1675h2));
        }
    }

    /* JADX INFO: renamed from: L */
    public static C29672a m31944L(AbstractC29701y abstractC29701y, EnumC16377d2 enumC16377d2, Composer composer, int i13) {
        boolean z4 = (((i13 & 14) ^ 6) > 4 && ((C28655q) composer).m87153g(abstractC29701y)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (z4 || objM87133R == C28635l.f115821a) {
            objM87133R = new C29672a(abstractC29701y, enumC16377d2);
            c28655q.m87172p0(objM87133R);
        }
        return (C29672a) objM87133R;
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m31945M(C4861a c4861a, JsonObject jsonObject) {
        Object objM1830a;
        String strM1833d;
        Integer numM1846h;
        C5101l0 c5101l0 = C4861a.f20259o;
        c5101l0.m16047a0("Rendering nudge with args: " + jsonObject);
        Activity activityM49083a = C17338u.f67142w.m49083a();
        if (activityM49083a == null) {
            c5101l0.m16067m0("No active activity to render nudge");
            return false;
        }
        try {
            JsonElement jsonElement = (JsonElement) jsonObject.get("nudge");
            if (jsonElement == null) {
                c5101l0.m16067m0("No nudge data provided");
                return false;
            }
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("stepIndex");
            int iIntValue = (jsonElement2 == null || (numM1846h = AbstractC0770m.m1846h(AbstractC0770m.m1848j(jsonElement2))) == null) ? 0 : numM1846h.intValue();
            C35035m c35035mM110702d = null;
            try {
                C0775r c0775r = AbstractC37316b.f159546a;
                c0775r.getClass();
                objM1830a = c0775r.m1830a(Nudge.Companion.serializer(), jsonElement);
            } catch (Exception e5) {
                C4861a.f20259o.m16067m0("Failed to deserialize from JsonElement: " + e5.getMessage());
                objM1830a = null;
            }
            Nudge nudge = (Nudge) objM1830a;
            if (nudge == null) {
                C4861a.f20259o.m16067m0("Unable to deserialize Nudge; nudgeJson=" + jsonElement);
                return false;
            }
            C22669g0 c22669g0 = new C22669g0();
            try {
                Object obj = jsonObject.get("theme");
                try {
                    C0775r c0775r2 = AbstractC37316b.f159546a;
                    c0775r2.getClass();
                    strM1833d = c0775r2.m1833d(AbstractC38195a.m122336d(JsonElement.Companion.serializer()), obj);
                } catch (Exception e13) {
                    C4861a.f20259o.m16067m0("Failed to serialize to JSON string: " + e13.getMessage());
                    strM1833d = null;
                }
                JSONObject jSONObject = strM1833d != null ? new JSONObject(strM1833d) : null;
                if (jSONObject != null) {
                    C35035m c35035m = C35035m.f148302o0;
                    c35035mM110702d = AbstractC35032j.m110702d(jSONObject);
                }
                c22669g0.f89336w = c35035mM110702d;
            } catch (Exception e14) {
                C4861a.f20259o.m16032K("Failed to parse theme JSON: " + e14.getMessage());
            }
            activityM49083a.runOnUiThread(new RunnableC21737c(nudge, c4861a, iIntValue, c22669g0, 0));
            return true;
        } catch (Exception e15) {
            C4861a.f20259o.m16032K("Error rendering nudge", e15);
            return false;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m31946N(AbstractC20523b abstractC20523b, C37199o c37199o, InterfaceC20602v0 interfaceC20602v0) {
        c37199o.m119207K("type");
        c37199o.m119219Y(interfaceC20602v0, abstractC20523b.f76900w);
        c37199o.m119207K("timestamp");
        c37199o.m119218X(abstractC20523b.f76901x);
    }

    /* JADX INFO: renamed from: O */
    public static C26643w m31947O(C26610e c26610e) {
        return new C26643w(c26610e);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX INFO: renamed from: P */
    public static void m31948P(InterfaceC30100e interfaceC30100e, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        int iMo1673b;
        boolean z4;
        long j7 = c30106k.f122845a;
        if (j7 == -9223372036854775807L) {
            iMo1673b = 0;
        } else {
            iMo1673b = interfaceC30100e.mo1673b(j7);
            if (iMo1673b == -1) {
                iMo1673b = interfaceC30100e.mo1676j();
            }
            if (iMo1673b > 0 && interfaceC30100e.mo1675h(iMo1673b - 1) == j7) {
                iMo1673b--;
            }
        }
        if (j7 == -9223372036854775807L || iMo1673b >= interfaceC30100e.mo1676j()) {
            z4 = false;
        } else {
            List listMo1674d = interfaceC30100e.mo1674d(j7);
            long jMo1675h = interfaceC30100e.mo1675h(iMo1673b);
            if (listMo1674d.isEmpty()) {
                z4 = false;
            } else {
                long j13 = c30106k.f122845a;
                if (j13 < jMo1675h) {
                    interfaceC38049d.accept(new C30096a(listMo1674d, j13, jMo1675h - j13));
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        }
        for (int i13 = iMo1673b; i13 < interfaceC30100e.mo1676j(); i13++) {
            m31943K(interfaceC30100e, i13, interfaceC38049d);
        }
        if (c30106k.f122846b) {
            if (z4) {
                iMo1673b--;
            }
            for (int i14 = 0; i14 < iMo1673b; i14++) {
                m31943K(interfaceC30100e, i14, interfaceC38049d);
            }
            if (z4) {
                interfaceC38049d.accept(new C30096a(interfaceC30100e.mo1674d(j7), interfaceC30100e.mo1675h(iMo1673b), j7 - interfaceC30100e.mo1675h(iMo1673b)));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final C15767h m31949Q(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return new C15767h(str);
    }

    /* JADX INFO: renamed from: R */
    public static final C35920e m31950R(C35920e c35920e, InterfaceC3186a metric) {
        AbstractC22676k.m65750j(c35920e, "<this>");
        AbstractC22676k.m65750j(metric, "metric");
        InterfaceC15761b interfaceC15761b = c35920e.f152986e;
        if (interfaceC15761b instanceof InterfaceC15771l) {
            AbstractC3187b.m9171c((InterfaceC15771l) interfaceC15761b, metric);
            return c35920e;
        }
        C15762c c15762cM60709w0 = AbstractC21598x.m60709w0(interfaceC15761b);
        AbstractC3187b.m9171c(c15762cM60709w0, metric);
        return AbstractC32237a.m100288b(c35920e, null, c15762cM60709w0, 31);
    }

    /* JADX INFO: renamed from: S */
    public static final C35920e m31951S(C35920e c35920e, LinkedHashSet metrics) {
        AbstractC22676k.m65750j(c35920e, "<this>");
        AbstractC22676k.m65750j(metrics, "metrics");
        Iterator it = metrics.iterator();
        C35920e c35920eM31950R = c35920e;
        while (it.hasNext()) {
            c35920eM31950R = m31950R(c35920e, (InterfaceC3186a) it.next());
        }
        return c35920eM31950R;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x019b  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX INFO: renamed from: a */
    public static final void m31952a(final InterfaceC4339a interfaceC4339a, final C37816b c37816b, Modifier modifier, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, final InterfaceC4351m interfaceC4351m3, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, C3948a0 c3948a0, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4351m interfaceC4351m4;
        int i17;
        int i18;
        InterfaceC4351m interfaceC4351m5;
        int i19;
        InterfaceC4351m interfaceC4351m6;
        long j14;
        int i24;
        boolean z4;
        C28655q c28655q;
        final Modifier modifier3;
        final InterfaceC4351m interfaceC4351m7;
        final InterfaceC4351m interfaceC4351m8;
        final long j15;
        final InterfaceC17869a1 interfaceC17869a2;
        final long j16;
        final C3948a0 c3948a1;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int i25;
        long jM43093h;
        Modifier modifier5;
        int i26;
        InterfaceC4351m interfaceC4351m9;
        InterfaceC17869a1 interfaceC17869a3;
        C3948a0 c3948a2;
        long j17;
        long j18;
        int i27;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1967984963);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(c37816b) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4351m4 = interfaceC4351m;
                    if (c28655q2.m87157i(interfaceC4351m4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4351m5 = interfaceC4351m2;
                        if (c28655q2.m87157i(interfaceC4351m5)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((196608 & i13) == 0) {
                        interfaceC4351m6 = interfaceC4351m3;
                        if (c28655q2.m87157i(interfaceC4351m6)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    } else {
                        interfaceC4351m6 = interfaceC4351m3;
                    }
                    if ((1572864 & i13) == 0) {
                        i15 |= 524288;
                    }
                    if ((12582912 & i13) == 0) {
                        if ((i14 & 128) == 0) {
                            j14 = j7;
                            int i29 = c28655q2.m87151f(j14) ? 8388608 : 4194304;
                            i15 |= i29;
                        } else {
                            j14 = j7;
                        }
                        i15 |= i29;
                    } else {
                        j14 = j7;
                    }
                    if ((100663296 & i13) == 0) {
                        i15 |= AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i24 = i15 | 805306368;
                    if ((306783379 & i24) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i24 & 1, z4)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                            if (i28 != 0) {
                                modifier4 = C2314t.f9131w;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i16 != 0) {
                                interfaceC4351m4 = null;
                            }
                            InterfaceC4351m interfaceC4351m10 = i18 == 0 ? interfaceC4351m5 : null;
                            C33252i c33252i = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i25 = i24 & (-3670017);
                            if ((i14 & 128) != 0) {
                                jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                                i25 = i24 & (-33030145);
                            } else {
                                jM43093h = j14;
                            }
                            long jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                            modifier5 = modifier4;
                            i26 = i25 & (-234881025);
                            interfaceC4351m9 = interfaceC4351m10;
                            interfaceC17869a3 = c33252i;
                            c3948a2 = new C3948a0(7);
                            j17 = jM43093h;
                            j18 = jM43101b;
                        } else {
                            c28655q2.m87138X();
                            int i34 = i24 & (-3670017);
                            if ((i14 & 128) != 0) {
                                i34 = i24 & (-33030145);
                            }
                            i26 = i34 & (-234881025);
                            interfaceC17869a3 = interfaceC17869a1;
                            j18 = j13;
                            c3948a2 = c3948a0;
                            modifier5 = modifier2;
                            interfaceC4351m9 = interfaceC4351m5;
                            j17 = j14;
                        }
                        c28655q2.m87175r();
                        int i35 = (2147483646 & i26) >> 3;
                        c28655q = c28655q2;
                        m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i35 & 7168) | (57344 & i35) | (3670016 & i35) | (i35 & 234881024));
                        interfaceC4351m7 = interfaceC4351m4;
                        modifier3 = modifier5;
                        interfaceC4351m8 = interfaceC4351m9;
                        interfaceC17869a2 = interfaceC17869a3;
                        j15 = j17;
                        j16 = j18;
                        c3948a1 = c3948a2;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC4351m7 = interfaceC4351m4;
                        interfaceC4351m8 = interfaceC4351m5;
                        j15 = j14;
                        interfaceC17869a2 = interfaceC17869a1;
                        j16 = j13;
                        c3948a1 = c3948a0;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 24576;
                interfaceC4351m5 = interfaceC4351m2;
                if ((196608 & i13) == 0) {
                    interfaceC4351m6 = interfaceC4351m3;
                    if (c28655q2.m87157i(interfaceC4351m6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                } else {
                    interfaceC4351m6 = interfaceC4351m3;
                }
                if ((1572864 & i13) == 0) {
                    i15 |= 524288;
                }
                if ((12582912 & i13) == 0) {
                    if ((i14 & 128) == 0) {
                        j14 = j7;
                        if (c28655q2.m87151f(j14)) {
                        }
                        i15 |= i29;
                    } else {
                        j14 = j7;
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                if ((100663296 & i13) == 0) {
                    i15 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i24 = i15 | 805306368;
                if ((306783379 & i24) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i2 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b2 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i2;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b2;
                    } else {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b3 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i3;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b3;
                    }
                    c28655q2.m87175r();
                    int i36 = (2147483646 & i26) >> 3;
                    c28655q = c28655q2;
                    m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i36 & 7168) | (57344 & i36) | (3670016 & i36) | (i36 & 234881024));
                    interfaceC4351m7 = interfaceC4351m4;
                    modifier3 = modifier5;
                    interfaceC4351m8 = interfaceC4351m9;
                    interfaceC17869a2 = interfaceC17869a3;
                    j15 = j17;
                    j16 = j18;
                    c3948a1 = c3948a2;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4351m7 = interfaceC4351m4;
                    interfaceC4351m8 = interfaceC4351m5;
                    j15 = j14;
                    interfaceC17869a2 = interfaceC17869a1;
                    j16 = j13;
                    c3948a1 = c3948a0;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 3072;
            interfaceC4351m4 = interfaceC4351m;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m5 = interfaceC4351m2;
                    if (c28655q2.m87157i(interfaceC4351m5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    interfaceC4351m6 = interfaceC4351m3;
                    if (c28655q2.m87157i(interfaceC4351m6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                } else {
                    interfaceC4351m6 = interfaceC4351m3;
                }
                if ((1572864 & i13) == 0) {
                    i15 |= 524288;
                }
                if ((12582912 & i13) == 0) {
                    if ((i14 & 128) == 0) {
                        j14 = j7;
                        if (c28655q2.m87151f(j14)) {
                        }
                        i15 |= i29;
                    } else {
                        j14 = j7;
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                if ((100663296 & i13) == 0) {
                    i15 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i24 = i15 | 805306368;
                if ((306783379 & i24) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i4 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b4 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i4;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b4;
                    } else {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i5 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b5 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i5;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b5;
                    }
                    c28655q2.m87175r();
                    int i37 = (2147483646 & i26) >> 3;
                    c28655q = c28655q2;
                    m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i37 & 7168) | (57344 & i37) | (3670016 & i37) | (i37 & 234881024));
                    interfaceC4351m7 = interfaceC4351m4;
                    modifier3 = modifier5;
                    interfaceC4351m8 = interfaceC4351m9;
                    interfaceC17869a2 = interfaceC17869a3;
                    j15 = j17;
                    j16 = j18;
                    c3948a1 = c3948a2;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4351m7 = interfaceC4351m4;
                    interfaceC4351m8 = interfaceC4351m5;
                    j15 = j14;
                    interfaceC17869a2 = interfaceC17869a1;
                    j16 = j13;
                    c3948a1 = c3948a0;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 24576;
            interfaceC4351m5 = interfaceC4351m2;
            if ((196608 & i13) == 0) {
                interfaceC4351m6 = interfaceC4351m3;
                if (c28655q2.m87157i(interfaceC4351m6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            } else {
                interfaceC4351m6 = interfaceC4351m3;
            }
            if ((1572864 & i13) == 0) {
                i15 |= 524288;
            }
            if ((12582912 & i13) == 0) {
                if ((i14 & 128) == 0) {
                    j14 = j7;
                    if (c28655q2.m87151f(j14)) {
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                i15 |= i29;
            } else {
                j14 = j7;
            }
            if ((100663296 & i13) == 0) {
                i15 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i24 = i15 | 805306368;
            if ((306783379 & i24) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i6 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b6 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i6;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b6;
                } else {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i7 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b7 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i7;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b7;
                }
                c28655q2.m87175r();
                int i38 = (2147483646 & i26) >> 3;
                c28655q = c28655q2;
                m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i38 & 7168) | (57344 & i38) | (3670016 & i38) | (i38 & 234881024));
                interfaceC4351m7 = interfaceC4351m4;
                modifier3 = modifier5;
                interfaceC4351m8 = interfaceC4351m9;
                interfaceC17869a2 = interfaceC17869a3;
                j15 = j17;
                j16 = j18;
                c3948a1 = c3948a2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4351m7 = interfaceC4351m4;
                interfaceC4351m8 = interfaceC4351m5;
                j15 = j14;
                interfaceC17869a2 = interfaceC17869a1;
                j16 = j13;
                c3948a1 = c3948a0;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4351m4 = interfaceC4351m;
                if (c28655q2.m87157i(interfaceC4351m4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m5 = interfaceC4351m2;
                    if (c28655q2.m87157i(interfaceC4351m5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    interfaceC4351m6 = interfaceC4351m3;
                    if (c28655q2.m87157i(interfaceC4351m6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                } else {
                    interfaceC4351m6 = interfaceC4351m3;
                }
                if ((1572864 & i13) == 0) {
                    i15 |= 524288;
                }
                if ((12582912 & i13) == 0) {
                    if ((i14 & 128) == 0) {
                        j14 = j7;
                        if (c28655q2.m87151f(j14)) {
                        }
                        i15 |= i29;
                    } else {
                        j14 = j7;
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                if ((100663296 & i13) == 0) {
                    i15 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i24 = i15 | 805306368;
                if ((306783379 & i24) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i8 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b8 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i8;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b8;
                    } else {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i18 == 0) {
                        }
                        C33252i c33252i9 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i25 = i24 & (-3670017);
                        if ((i14 & 128) != 0) {
                            jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            i25 = i24 & (-33030145);
                        } else {
                            jM43093h = j14;
                        }
                        long jM43101b9 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                        modifier5 = modifier4;
                        i26 = i25 & (-234881025);
                        interfaceC4351m9 = interfaceC4351m10;
                        interfaceC17869a3 = c33252i9;
                        c3948a2 = new C3948a0(7);
                        j17 = jM43093h;
                        j18 = jM43101b9;
                    }
                    c28655q2.m87175r();
                    int i39 = (2147483646 & i26) >> 3;
                    c28655q = c28655q2;
                    m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i39 & 7168) | (57344 & i39) | (3670016 & i39) | (i39 & 234881024));
                    interfaceC4351m7 = interfaceC4351m4;
                    modifier3 = modifier5;
                    interfaceC4351m8 = interfaceC4351m9;
                    interfaceC17869a2 = interfaceC17869a3;
                    j15 = j17;
                    j16 = j18;
                    c3948a1 = c3948a2;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4351m7 = interfaceC4351m4;
                    interfaceC4351m8 = interfaceC4351m5;
                    j15 = j14;
                    interfaceC17869a2 = interfaceC17869a1;
                    j16 = j13;
                    c3948a1 = c3948a0;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 24576;
            interfaceC4351m5 = interfaceC4351m2;
            if ((196608 & i13) == 0) {
                interfaceC4351m6 = interfaceC4351m3;
                if (c28655q2.m87157i(interfaceC4351m6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            } else {
                interfaceC4351m6 = interfaceC4351m3;
            }
            if ((1572864 & i13) == 0) {
                i15 |= 524288;
            }
            if ((12582912 & i13) == 0) {
                if ((i14 & 128) == 0) {
                    j14 = j7;
                    if (c28655q2.m87151f(j14)) {
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                i15 |= i29;
            } else {
                j14 = j7;
            }
            if ((100663296 & i13) == 0) {
                i15 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i24 = i15 | 805306368;
            if ((306783379 & i24) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i10 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b10 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i10;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b10;
                } else {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i11 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b11 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i11;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b11;
                }
                c28655q2.m87175r();
                int i310 = (2147483646 & i26) >> 3;
                c28655q = c28655q2;
                m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i310 & 7168) | (57344 & i310) | (3670016 & i310) | (i310 & 234881024));
                interfaceC4351m7 = interfaceC4351m4;
                modifier3 = modifier5;
                interfaceC4351m8 = interfaceC4351m9;
                interfaceC17869a2 = interfaceC17869a3;
                j15 = j17;
                j16 = j18;
                c3948a1 = c3948a2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4351m7 = interfaceC4351m4;
                interfaceC4351m8 = interfaceC4351m5;
                j15 = j14;
                interfaceC17869a2 = interfaceC17869a1;
                j16 = j13;
                c3948a1 = c3948a0;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 3072;
        interfaceC4351m4 = interfaceC4351m;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4351m5 = interfaceC4351m2;
                if (c28655q2.m87157i(interfaceC4351m5)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((196608 & i13) == 0) {
                interfaceC4351m6 = interfaceC4351m3;
                if (c28655q2.m87157i(interfaceC4351m6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            } else {
                interfaceC4351m6 = interfaceC4351m3;
            }
            if ((1572864 & i13) == 0) {
                i15 |= 524288;
            }
            if ((12582912 & i13) == 0) {
                if ((i14 & 128) == 0) {
                    j14 = j7;
                    if (c28655q2.m87151f(j14)) {
                    }
                    i15 |= i29;
                } else {
                    j14 = j7;
                }
                i15 |= i29;
            } else {
                j14 = j7;
            }
            if ((100663296 & i13) == 0) {
                i15 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i24 = i15 | 805306368;
            if ((306783379 & i24) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i12 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b12 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i12;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b12;
                } else {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i18 == 0) {
                    }
                    C33252i c33252i13 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i25 = i24 & (-3670017);
                    if ((i14 & 128) != 0) {
                        jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        i25 = i24 & (-33030145);
                    } else {
                        jM43093h = j14;
                    }
                    long jM43101b13 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    modifier5 = modifier4;
                    i26 = i25 & (-234881025);
                    interfaceC4351m9 = interfaceC4351m10;
                    interfaceC17869a3 = c33252i13;
                    c3948a2 = new C3948a0(7);
                    j17 = jM43093h;
                    j18 = jM43101b13;
                }
                c28655q2.m87175r();
                int i311 = (2147483646 & i26) >> 3;
                c28655q = c28655q2;
                m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i311 & 7168) | (57344 & i311) | (3670016 & i311) | (i311 & 234881024));
                interfaceC4351m7 = interfaceC4351m4;
                modifier3 = modifier5;
                interfaceC4351m8 = interfaceC4351m9;
                interfaceC17869a2 = interfaceC17869a3;
                j15 = j17;
                j16 = j18;
                c3948a1 = c3948a2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4351m7 = interfaceC4351m4;
                interfaceC4351m8 = interfaceC4351m5;
                j15 = j14;
                interfaceC17869a2 = interfaceC17869a1;
                j16 = j13;
                c3948a1 = c3948a0;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 24576;
        interfaceC4351m5 = interfaceC4351m2;
        if ((196608 & i13) == 0) {
            interfaceC4351m6 = interfaceC4351m3;
            if (c28655q2.m87157i(interfaceC4351m6)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        } else {
            interfaceC4351m6 = interfaceC4351m3;
        }
        if ((1572864 & i13) == 0) {
            i15 |= 524288;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) == 0) {
                j14 = j7;
                if (c28655q2.m87151f(j14)) {
                }
                i15 |= i29;
            } else {
                j14 = j7;
            }
            i15 |= i29;
        } else {
            j14 = j7;
        }
        if ((100663296 & i13) == 0) {
            i15 |= AndroidSDKConstants.FLAG_MUTABLE;
        }
        i24 = i15 | 805306368;
        if ((306783379 & i24) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC4351m4 = null;
                }
                if (i18 == 0) {
                }
                C33252i c33252i14 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                i25 = i24 & (-3670017);
                if ((i14 & 128) != 0) {
                    jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    i25 = i24 & (-33030145);
                } else {
                    jM43093h = j14;
                }
                long jM43101b14 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                modifier5 = modifier4;
                i26 = i25 & (-234881025);
                interfaceC4351m9 = interfaceC4351m10;
                interfaceC17869a3 = c33252i14;
                c3948a2 = new C3948a0(7);
                j17 = jM43093h;
                j18 = jM43101b14;
            } else {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC4351m4 = null;
                }
                if (i18 == 0) {
                }
                C33252i c33252i15 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                i25 = i24 & (-3670017);
                if ((i14 & 128) != 0) {
                    jM43093h = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    i25 = i24 & (-33030145);
                } else {
                    jM43093h = j14;
                }
                long jM43101b15 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                modifier5 = modifier4;
                i26 = i25 & (-234881025);
                interfaceC4351m9 = interfaceC4351m10;
                interfaceC17869a3 = c33252i15;
                c3948a2 = new C3948a0(7);
                j17 = jM43093h;
                j18 = jM43101b15;
            }
            c28655q2.m87175r();
            int i312 = (2147483646 & i26) >> 3;
            c28655q = c28655q2;
            m31953b(interfaceC4339a, AbstractC37817c.m121344e(-309297447, c28655q2, new C15034i(interfaceC4351m4, c37816b, 1)), modifier5, interfaceC4351m9, interfaceC4351m6, interfaceC17869a3, j17, j18, c3948a2, c28655q, (i26 & 896) | (i26 & 14) | 48 | (i312 & 7168) | (57344 & i312) | (3670016 & i312) | (i312 & 234881024));
            interfaceC4351m7 = interfaceC4351m4;
            modifier3 = modifier5;
            interfaceC4351m8 = interfaceC4351m9;
            interfaceC17869a2 = interfaceC17869a3;
            j15 = j17;
            j16 = j18;
            c3948a1 = c3948a2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4351m7 = interfaceC4351m4;
            interfaceC4351m8 = interfaceC4351m5;
            j15 = j14;
            interfaceC17869a2 = interfaceC17869a1;
            j16 = j13;
            c3948a1 = c3948a0;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC11894a.m31952a(interfaceC4339a, c37816b, modifier3, interfaceC4351m7, interfaceC4351m8, interfaceC4351m3, interfaceC17869a2, j15, j16, c3948a1, (Composer) obj, iM87244L, i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m31953b(final InterfaceC4339a interfaceC4339a, final C37816b c37816b, final Modifier modifier, final InterfaceC4351m interfaceC4351m, final InterfaceC4351m interfaceC4351m2, final InterfaceC17869a1 interfaceC17869a1, final long j7, final long j13, final C3948a0 c3948a0, Composer composer, final int i13) {
        int i14;
        Modifier modifier2;
        InterfaceC4351m interfaceC4351m3;
        InterfaceC4351m interfaceC4351m4;
        InterfaceC17869a1 interfaceC17869a2;
        long j14;
        long j15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1409209698);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i13 & 3072) == 0) {
            interfaceC4351m3 = interfaceC4351m;
            i14 |= c28655q.m87157i(interfaceC4351m3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4351m3 = interfaceC4351m;
        }
        if ((i13 & 24576) == 0) {
            interfaceC4351m4 = interfaceC4351m2;
            i14 |= c28655q.m87157i(interfaceC4351m4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            interfaceC4351m4 = interfaceC4351m2;
        }
        if ((196608 & i13) == 0) {
            interfaceC17869a2 = interfaceC17869a1;
            i14 |= c28655q.m87153g(interfaceC17869a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((1572864 & i13) == 0) {
            j14 = j7;
            i14 |= c28655q.m87151f(j14) ? 1048576 : 524288;
        } else {
            j14 = j7;
        }
        if ((12582912 & i13) == 0) {
            j15 = j13;
            i14 |= c28655q.m87151f(j15) ? 8388608 : 4194304;
        } else {
            j15 = j13;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87153g(c3948a0) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i14 & 1, (38347923 & i14) != 38347922)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            AbstractC32411b.m101089d(interfaceC4339a, c3948a0, AbstractC37817c.m121344e(-488319269, c28655q, new C15045j(c37816b, modifier2, interfaceC4351m3, interfaceC4351m4, interfaceC17869a2, j14, j15)), c28655q, (i14 & 14) | 384 | (((i14 & 268435454) >> 21) & 112));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC11894a.m31953b(interfaceC4339a, c37816b, modifier, interfaceC4351m, interfaceC4351m2, interfaceC17869a1, j7, j13, c3948a0, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m31954c(Object obj, String str, Modifier modifier, C2307m c2307m, InterfaceC39105k interfaceC39105k, float f13, C28655q c28655q, int i13, int i14) {
        c28655q.m87152f0(-941517612);
        Modifier modifier2 = (i14 & 4) != 0 ? C2314t.f9131w : modifier;
        C2307m c2307m2 = (i14 & 32) != 0 ? C2299e.f9102E : c2307m;
        InterfaceC39105k interfaceC39105k2 = (i14 & 64) != 0 ? C39102j.f168200b : interfaceC39105k;
        float f14 = (i14 & 128) != 0 ? 1.0f : f13;
        InterfaceC3242e interfaceC3242eM16747F = AbstractC5583n.m16747F(AbstractC4596q.f18485a, c28655q);
        int i15 = i13 << 3;
        int i16 = (i13 & 112) | 520 | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        c28655q.m87152f0(2032051394);
        C4591l c4591l = new C4591l(obj, AbstractC4590k.f18473b, interfaceC3242eM16747F);
        int i17 = i16 & 112;
        int i18 = i16 >> 3;
        AbstractC4482w.m13998k(c4591l, str, modifier2, AsyncImagePainter.f20210T, null, c2307m2, interfaceC39105k2, f14, c28655q, i17 | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | ((((i13 >> 27) & 14) << 27) & 1879048192), 0);
        c28655q.m87173q(false);
        c28655q.m87173q(false);
    }

    /* JADX INFO: renamed from: d */
    public static final CancellationException m31955d(String str, Throwable th3) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th3);
        return cancellationException;
    }

    /* JADX INFO: renamed from: e */
    public static final void m31956e(Nudge nudge, int i13, C25594a c25594a, C25607n c25607n, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1123959490);
        C4861a c4861a = (C4861a) c28655q.m87161k(AbstractC25611r.f100475a);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            C28592a0 c28592a0 = new C28592a0(AbstractC28683x.m87262p(c28655q));
            c28655q.m87172p0(c28592a0);
            objM87133R = c28592a0;
        }
        InterfaceC2994c0 interfaceC2994c0 = ((C28592a0) objM87133R).f115706w;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC31061c.m95646v(i13, c28655q);
        }
        InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
        C29674b c29674bM91150b = AbstractC29677c0.m91150b(new C17327j(nudge, 2), ((C28621h1) interfaceC28593a1).m87024x(), 0, c28655q, 2);
        NudgeStep nudgeStep = nudge.getSteps().get(c29674bM91150b.m91162k());
        Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        AbstractC33863b.m107084a(nudge, i13, AbstractC37817c.m121341b(62042027, c28655q, new C25596c(nudge, nudgeStep, c29674bM91150b, c25607n, c25594a, configuration, configuration.smallestScreenWidthDp >= 600, i14, interfaceC2994c0, interfaceC28593a1, c4861a)), c28655q, 392);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(nudge, i13, c25594a, c25607n, i14);
    }

    /* JADX INFO: renamed from: f */
    public static final C14498d m31957f(C14503i c14503i, Throwable th3) {
        InterfaceC31421j interfaceC31421j;
        if (th3 instanceof NullRequestDataException) {
            Function1 function1 = c14503i.f52982o;
            C14500f c14500f = c14503i.f52988u;
            interfaceC31421j = (InterfaceC31421j) function1.invoke(c14503i);
            if (interfaceC31421j == null) {
                interfaceC31421j = (InterfaceC31421j) c14500f.f52957j.invoke(c14503i);
            }
            if (interfaceC31421j == null && (interfaceC31421j = (InterfaceC31421j) c14503i.f52981n.invoke(c14503i)) == null) {
                interfaceC31421j = (InterfaceC31421j) c14500f.f52956i.invoke(c14503i);
            }
        } else {
            interfaceC31421j = (InterfaceC31421j) c14503i.f52981n.invoke(c14503i);
            if (interfaceC31421j == null) {
                interfaceC31421j = (InterfaceC31421j) c14503i.f52988u.f52956i.invoke(c14503i);
            }
        }
        return new C14498d(interfaceC31421j, c14503i, th3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:152:0x022b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0237  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:161:0x029e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:173:0x0301  */
    /* JADX WARN: Code duplicated, block: B:175:0x0312  */
    /* JADX WARN: Code duplicated, block: B:176:0x0314  */
    /* JADX WARN: Code duplicated, block: B:178:0x0317  */
    /* JADX WARN: Code duplicated, block: B:179:0x0322  */
    /* JADX WARN: Code duplicated, block: B:181:0x0326  */
    /* JADX WARN: Code duplicated, block: B:182:0x0337  */
    /* JADX WARN: Code duplicated, block: B:185:0x034f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0354  */
    /* JADX WARN: Code duplicated, block: B:189:0x036d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0371  */
    /* JADX WARN: Code duplicated, block: B:195:0x038d  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:204:0x0441  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX INFO: renamed from: g */
    public static final void m31958g(final boolean z4, final C15399o1 element, Modifier modifier, InterfaceC17869a1 interfaceC17869a1, C23285v0 c23285v0, float f13, float f14, String str, C15404p1 c15404p1, float f15, C15247s c15247s, Composer composer, final int i13, final int i14, int i15) {
        int i16;
        Modifier modifier2;
        InterfaceC17869a1 interfaceC17869a2;
        int i17;
        float f16;
        int i18;
        int i19;
        float f17;
        int i24;
        int i25;
        String str2;
        int i26;
        C15404p1 c15404p2;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        C28676v0 c28676v0;
        C2314t c2314t;
        InterfaceC17869a1 interfaceC17869a3;
        C23285v0 c23285v1;
        int i39;
        float f18;
        float f19;
        String str3;
        float f24;
        C15247s c15247s2;
        float f25;
        Object objM87133R;
        InterfaceC15237i interfaceC15237i;
        C15247s c15247s3;
        C23285v0 c23285v2;
        int iHashCode;
        C0213j c0213j;
        String str4;
        C0209i c0209i;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        ArrayList arrayList;
        Iterator it;
        C28655q c28655q;
        final C15404p1 c15404p3;
        final String str5;
        final InterfaceC17869a1 interfaceC17869a4;
        final C15247s c15247s4;
        final C23285v0 c23285v3;
        final Modifier modifier3;
        final float f26;
        final float f27;
        final float f28;
        int iNextInt;
        boolean z13;
        long j7;
        float f29;
        long j13;
        C28677v1 c28677v1M87180u;
        int i44;
        int i45;
        final int i46 = i15;
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-280585760);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(element) ? 32 : 16;
        }
        int i47 = i46 & 4;
        if (i47 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i46 & 8) == 0) {
                    interfaceC17869a2 = interfaceC17869a1;
                    if (c28655q2.m87153g(interfaceC17869a2)) {
                        i45 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i16 |= i45;
                } else {
                    interfaceC17869a2 = interfaceC17869a1;
                }
                i45 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i16 |= i45;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            if ((i13 & 24576) == 0) {
                i16 |= DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i46 & 32;
            if (i17 != 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    f16 = f13;
                    if (c28655q2.m87147d(f16)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i46 & 64;
                if (i19 != 0) {
                    if ((1572864 & i13) == 0) {
                        f17 = f14;
                        if (c28655q2.m87147d(f17)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    i25 = i46 & 128;
                    if (i25 != 0) {
                        if ((i13 & 12582912) == 0) {
                            str2 = str;
                            if (c28655q2.m87153g(str2)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i16 |= i26;
                        }
                        if ((i13 & 100663296) == 0) {
                            if ((i46 & 256) == 0) {
                                c15404p2 = c15404p1;
                                if (c28655q2.m87153g(c15404p2)) {
                                    i44 = 67108864;
                                }
                                i16 |= i44;
                            } else {
                                c15404p2 = c15404p1;
                            }
                            i44 = AndroidSDKConstants.FLAG_MUTABLE;
                            i16 |= i44;
                        } else {
                            c15404p2 = c15404p1;
                        }
                        i27 = i16;
                        i28 = i46 & 512;
                        if (i28 != 0) {
                            i27 |= 805306368;
                        } else if ((i13 & 805306368) != 0) {
                            if (c28655q2.m87147d(f15)) {
                                i29 = 536870912;
                            } else {
                                i29 = 268435456;
                            }
                            i27 |= i29;
                        }
                        i34 = i27;
                        i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        if (i35 != 0) {
                            i36 = 6;
                        } else if ((i14 & 6) == 0) {
                            if (c28655q2.m87153g(c15247s)) {
                                i37 = 4;
                            } else {
                                i37 = 2;
                            }
                            i36 = i14 | i37;
                        } else {
                            i36 = i14;
                        }
                        if ((i34 & 306783379) != 306783378 && (i36 & 3) == 2 && c28655q2.m87121F()) {
                            c28655q2.m87138X();
                            c23285v3 = c23285v0;
                            f28 = f15;
                            modifier3 = modifier2;
                            f26 = f16;
                            c28655q = c28655q2;
                            str5 = str2;
                            c15247s4 = c15247s;
                            c15404p3 = c15404p2;
                            interfaceC17869a4 = interfaceC17869a2;
                            f27 = f17;
                        } else {
                            c28655q2.m87140Z();
                            i38 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i38 != 0 || c28655q2.m87118C()) {
                                if (i47 != 0) {
                                    modifier2 = c2314t;
                                }
                                if ((i46 & 8) != 0) {
                                    interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                    i34 &= -7169;
                                } else {
                                    interfaceC17869a3 = interfaceC17869a2;
                                }
                                c28655q2.m87150e0(-1771981384);
                                c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                                c28655q2.m87173q(false);
                                i39 = i34 & (-57345);
                                if (i17 != 0) {
                                    f18 = 8;
                                } else {
                                    f18 = f16;
                                }
                                if (i19 != 0) {
                                    f19 = 20;
                                } else {
                                    f19 = f17;
                                }
                                if (i25 != 0) {
                                    str3 = "●";
                                } else {
                                    str3 = str;
                                }
                                i46 = i15;
                                if ((i46 & 256) != 0) {
                                    long jM43091f = C15069l3.m43147a(c28655q2).m43091f();
                                    long j14 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                    long j15 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                    long j16 = C17919x.f69636m;
                                    i39 = i34 & (-234938369);
                                    c15404p2 = new C15404p1(jM43091f, j15, j16, j16, j14);
                                }
                                if (i28 != 0) {
                                    f24 = 2;
                                } else {
                                    f24 = f15;
                                }
                                if (i35 != 0) {
                                    c28655q2.m87150e0(1737572977);
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = AbstractC33745d.m106649h(c28655q2);
                                    }
                                    c28655q2.m87173q(false);
                                    c15247s2 = (C15247s) objM87133R;
                                } else {
                                    c15247s2 = c15247s;
                                }
                                f25 = f18;
                            } else {
                                c28655q2.m87138X();
                                if ((i46 & 8) != 0) {
                                    i34 &= -7169;
                                }
                                int i48 = i34 & (-57345);
                                if ((i46 & 256) != 0) {
                                    i48 = i34 & (-234938369);
                                }
                                f24 = f15;
                                c15247s2 = c15247s;
                                i39 = i48;
                                c15404p2 = c15404p2;
                                modifier2 = modifier2;
                                f25 = f16;
                                f19 = f17;
                                c23285v1 = c23285v0;
                                str3 = str;
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87175r();
                            InterfaceC15237i interfaceC15237i2 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                            interfaceC15237i = interfaceC15237i2;
                            c15247s3 = c15247s2;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            c23285v2 = c23285v1;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            str4 = str3;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            c28655q2.m87150e0(-538960683);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                            }
                            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                            c28655q2.m87173q(false);
                            c28655q2.m87150e0(-538954822);
                            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, 6);
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
                            it = c18284jM36278i0.iterator();
                            while (((C18283i) it).f71138y) {
                                iNextInt = ((AbstractC25243e0) it).nextInt();
                                if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (iNextInt == 0) {
                                    c28655q2.m87150e0(-1247415338);
                                    c28655q2.m87173q(false);
                                } else if (iNextInt == 3) {
                                    c28655q2.m87150e0(-1247413470);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(-1247411137);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87150e0(-538945187);
                                if (z4) {
                                    f29 = 1.0f;
                                } else {
                                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                        AbstractC17918w0.m51536x(j7);
                                    } else {
                                        AbstractC17918w0.m51536x(j7);
                                    }
                                    f29 = 0.38f;
                                }
                                c28655q2.m87173q(false);
                                Modifier modifierM107879c = AbstractC34132o.m107879c(f29, c2314t);
                                float f34 = f25;
                                float f35 = f19;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM107879c, true, 1.0f);
                                long j17 = AbstractC11673r.m31082k(c28655q2).f37668a;
                                float fM31077f = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                                if (z13 != 0) {
                                    j13 = c15404p2.f57862a;
                                } else {
                                    j13 = c15404p2.f57866e;
                                }
                                C13825t c13825tM48880a = AbstractC17269i.m48880a(fM31077f, j13);
                                C15247s c15247s5 = c15247s3;
                                C23285v0 c23285v4 = c23285v2;
                                C2314t c2314t2 = c2314t;
                                String str6 = str4;
                                ArrayList arrayList2 = arrayList;
                                InterfaceC15237i interfaceC15237i3 = interfaceC15237i;
                                C28655q c28655q3 = c28655q2;
                                InterfaceC17869a1 interfaceC17869a5 = interfaceC17869a3;
                                AbstractC32410a.m101046p(modifierM31988g, interfaceC17869a5, false, j17, c13825tM48880a, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i3, c15247s5, c23285v4, z4, c15404p2, str6, interfaceC28593a1)), c28655q3, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                                arrayList2.add(C23454a0.f92919a);
                                c28655q2 = c28655q3;
                                interfaceC17869a3 = interfaceC17869a5;
                                interfaceC15237i = interfaceC15237i3;
                                c15247s3 = c15247s5;
                                c23285v2 = c23285v4;
                                str4 = str6;
                                arrayList = arrayList2;
                                f25 = f34;
                                f19 = f35;
                                f24 = f24;
                                c2314t = c2314t2;
                            }
                            float f36 = f25;
                            float f37 = f24;
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            c15404p3 = c15404p2;
                            str5 = str4;
                            interfaceC17869a4 = interfaceC17869a3;
                            c15247s4 = c15247s3;
                            c23285v3 = c23285v2;
                            modifier3 = modifier2;
                            f26 = f36;
                            f27 = f19;
                            f28 = f37;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                    int iM87244L2 = AbstractC28683x.m87244L(i14);
                                    AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i16 |= 12582912;
                    str2 = str;
                    if ((i13 & 100663296) == 0) {
                        if ((i46 & 256) == 0) {
                            c15404p2 = c15404p1;
                            if (c28655q2.m87153g(c15404p2)) {
                                i44 = 67108864;
                            }
                            i16 |= i44;
                        } else {
                            c15404p2 = c15404p1;
                        }
                        i44 = AndroidSDKConstants.FLAG_MUTABLE;
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i27 = i16;
                    i28 = i46 & 512;
                    if (i28 != 0) {
                        i27 |= 805306368;
                    } else if ((i13 & 805306368) != 0) {
                        if (c28655q2.m87147d(f15)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i27 |= i29;
                    }
                    i34 = i27;
                    i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q2.m87153g(c15247s)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f2 = C15069l3.m43147a(c28655q2).m43091f();
                                long j18 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j19 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j110 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f2, j19, j110, j110, j18);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f3 = C15069l3.m43147a(c28655q2).m43091f();
                                long j111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j113 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f3, j112, j113, j113, j111);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i4 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i4;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
                        it = c18284jM36278i1.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c2 = AbstractC34132o.m107879c(f29, c2314t);
                            float f38 = f25;
                            float f39 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM107879c2, true, 1.0f);
                            long j114 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f2 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(fM31077f2, j13);
                            C15247s c15247s6 = c15247s3;
                            C23285v0 c23285v5 = c23285v2;
                            C2314t c2314t3 = c2314t;
                            String str7 = str4;
                            ArrayList arrayList3 = arrayList;
                            InterfaceC15237i interfaceC15237i5 = interfaceC15237i;
                            C28655q c28655q4 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a6 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g2, interfaceC17869a6, false, j114, c13825tM48880a2, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i5, c15247s6, c23285v5, z4, c15404p2, str7, interfaceC28593a1)), c28655q4, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList3.add(C23454a0.f92919a);
                            c28655q2 = c28655q4;
                            interfaceC17869a3 = interfaceC17869a6;
                            interfaceC15237i = interfaceC15237i5;
                            c15247s3 = c15247s6;
                            c23285v2 = c23285v5;
                            str4 = str7;
                            arrayList = arrayList3;
                            f25 = f38;
                            f19 = f39;
                            f24 = f24;
                            c2314t = c2314t3;
                        }
                        float f310 = f25;
                        float f311 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f310;
                        f27 = f19;
                        f28 = f311;
                    } else {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f4 = C15069l3.m43147a(c28655q2).m43091f();
                                long j115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j117 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f4, j116, j117, j117, j115);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f5 = C15069l3.m43147a(c28655q2).m43091f();
                                long j118 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j119 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1110 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f5, j119, j1110, j1110, j118);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i6 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i6;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i2, 10));
                        it = c18284jM36278i2.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c3 = AbstractC34132o.m107879c(f29, c2314t);
                            float f312 = f25;
                            float f313 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g3 = AbstractC11895b.m31988g(modifierM107879c3, true, 1.0f);
                            long j1111 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f3 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a3 = AbstractC17269i.m48880a(fM31077f3, j13);
                            C15247s c15247s7 = c15247s3;
                            C23285v0 c23285v6 = c23285v2;
                            C2314t c2314t4 = c2314t;
                            String str8 = str4;
                            ArrayList arrayList4 = arrayList;
                            InterfaceC15237i interfaceC15237i7 = interfaceC15237i;
                            C28655q c28655q5 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a7 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g3, interfaceC17869a7, false, j1111, c13825tM48880a3, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i7, c15247s7, c23285v6, z4, c15404p2, str8, interfaceC28593a1)), c28655q5, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList4.add(C23454a0.f92919a);
                            c28655q2 = c28655q5;
                            interfaceC17869a3 = interfaceC17869a7;
                            interfaceC15237i = interfaceC15237i7;
                            c15247s3 = c15247s7;
                            c23285v2 = c23285v6;
                            str4 = str8;
                            arrayList = arrayList4;
                            f25 = f312;
                            f19 = f313;
                            f24 = f24;
                            c2314t = c2314t4;
                        }
                        float f314 = f25;
                        float f315 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f314;
                        f27 = f19;
                        f28 = f315;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i14);
                                AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i16 |= 1572864;
                f17 = f14;
                i25 = i46 & 128;
                if (i25 != 0) {
                    if ((i13 & 12582912) == 0) {
                        str2 = str;
                        if (c28655q2.m87153g(str2)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    if ((i13 & 100663296) == 0) {
                        if ((i46 & 256) == 0) {
                            c15404p2 = c15404p1;
                            if (c28655q2.m87153g(c15404p2)) {
                                i44 = 67108864;
                            }
                            i16 |= i44;
                        } else {
                            c15404p2 = c15404p1;
                        }
                        i44 = AndroidSDKConstants.FLAG_MUTABLE;
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i27 = i16;
                    i28 = i46 & 512;
                    if (i28 != 0) {
                        i27 |= 805306368;
                    } else if ((i13 & 805306368) != 0) {
                        if (c28655q2.m87147d(f15)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i27 |= i29;
                    }
                    i34 = i27;
                    i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q2.m87153g(c15247s)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f6 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1114 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f6, j1113, j1114, j1114, j1112);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f7 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1117 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f7, j1116, j1117, j1117, j1115);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i8 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i8;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i3 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i3, 10));
                        it = c18284jM36278i3.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c4 = AbstractC34132o.m107879c(f29, c2314t);
                            float f316 = f25;
                            float f317 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g4 = AbstractC11895b.m31988g(modifierM107879c4, true, 1.0f);
                            long j1118 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f4 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a4 = AbstractC17269i.m48880a(fM31077f4, j13);
                            C15247s c15247s8 = c15247s3;
                            C23285v0 c23285v7 = c23285v2;
                            C2314t c2314t5 = c2314t;
                            String str9 = str4;
                            ArrayList arrayList5 = arrayList;
                            InterfaceC15237i interfaceC15237i9 = interfaceC15237i;
                            C28655q c28655q6 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a8 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g4, interfaceC17869a8, false, j1118, c13825tM48880a4, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i9, c15247s8, c23285v7, z4, c15404p2, str9, interfaceC28593a1)), c28655q6, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList5.add(C23454a0.f92919a);
                            c28655q2 = c28655q6;
                            interfaceC17869a3 = interfaceC17869a8;
                            interfaceC15237i = interfaceC15237i9;
                            c15247s3 = c15247s8;
                            c23285v2 = c23285v7;
                            str4 = str9;
                            arrayList = arrayList5;
                            f25 = f316;
                            f19 = f317;
                            f24 = f24;
                            c2314t = c2314t5;
                        }
                        float f318 = f25;
                        float f319 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f318;
                        f27 = f19;
                        f28 = f319;
                    } else {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f8 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j11110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j11111 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f8, j11110, j11111, j11111, j1119);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f9 = C15069l3.m43147a(c28655q2).m43091f();
                                long j11112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j11113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j11114 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f9, j11113, j11114, j11114, j11112);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i10 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i10;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i4 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i4, 10));
                        it = c18284jM36278i4.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c5 = AbstractC34132o.m107879c(f29, c2314t);
                            float f3110 = f25;
                            float f3111 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g5 = AbstractC11895b.m31988g(modifierM107879c5, true, 1.0f);
                            long j11115 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f5 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a5 = AbstractC17269i.m48880a(fM31077f5, j13);
                            C15247s c15247s9 = c15247s3;
                            C23285v0 c23285v8 = c23285v2;
                            C2314t c2314t6 = c2314t;
                            String str10 = str4;
                            ArrayList arrayList6 = arrayList;
                            InterfaceC15237i interfaceC15237i11 = interfaceC15237i;
                            C28655q c28655q7 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a9 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g5, interfaceC17869a9, false, j11115, c13825tM48880a5, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11, c15247s9, c23285v8, z4, c15404p2, str10, interfaceC28593a1)), c28655q7, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList6.add(C23454a0.f92919a);
                            c28655q2 = c28655q7;
                            interfaceC17869a3 = interfaceC17869a9;
                            interfaceC15237i = interfaceC15237i11;
                            c15247s3 = c15247s9;
                            c23285v2 = c23285v8;
                            str4 = str10;
                            arrayList = arrayList6;
                            f25 = f3110;
                            f19 = f3111;
                            f24 = f24;
                            c2314t = c2314t6;
                        }
                        float f3112 = f25;
                        float f3113 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f3112;
                        f27 = f19;
                        f28 = f3113;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i14);
                                AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i16 |= 12582912;
                str2 = str;
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f10 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11118 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f10, j11117, j11118, j11118, j11116);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11, j111110, j111111, j111111, j11119);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i12 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i12;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i5 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i5, 10));
                    it = c18284jM36278i5.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c6 = AbstractC34132o.m107879c(f29, c2314t);
                        float f3114 = f25;
                        float f3115 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g6 = AbstractC11895b.m31988g(modifierM107879c6, true, 1.0f);
                        long j111112 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f6 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a6 = AbstractC17269i.m48880a(fM31077f6, j13);
                        C15247s c15247s10 = c15247s3;
                        C23285v0 c23285v9 = c23285v2;
                        C2314t c2314t7 = c2314t;
                        String str11 = str4;
                        ArrayList arrayList7 = arrayList;
                        InterfaceC15237i interfaceC15237i13 = interfaceC15237i;
                        C28655q c28655q8 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a10 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g6, interfaceC17869a10, false, j111112, c13825tM48880a6, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i13, c15247s10, c23285v9, z4, c15404p2, str11, interfaceC28593a1)), c28655q8, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList7.add(C23454a0.f92919a);
                        c28655q2 = c28655q8;
                        interfaceC17869a3 = interfaceC17869a10;
                        interfaceC15237i = interfaceC15237i13;
                        c15247s3 = c15247s10;
                        c23285v2 = c23285v9;
                        str4 = str11;
                        arrayList = arrayList7;
                        f25 = f3114;
                        f19 = f3115;
                        f24 = f24;
                        c2314t = c2314t7;
                    }
                    float f3116 = f25;
                    float f3117 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f3116;
                    f27 = f19;
                    f28 = f3117;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f12 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111115 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f12, j111114, j111115, j111115, j111113);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f13 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111118 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f13, j111117, j111118, j111118, j111116);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i14 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i14;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i6 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i6, 10));
                    it = c18284jM36278i6.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c7 = AbstractC34132o.m107879c(f29, c2314t);
                        float f3118 = f25;
                        float f3119 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g7 = AbstractC11895b.m31988g(modifierM107879c7, true, 1.0f);
                        long j111119 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f7 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a7 = AbstractC17269i.m48880a(fM31077f7, j13);
                        C15247s c15247s11 = c15247s3;
                        C23285v0 c23285v10 = c23285v2;
                        C2314t c2314t8 = c2314t;
                        String str12 = str4;
                        ArrayList arrayList8 = arrayList;
                        InterfaceC15237i interfaceC15237i15 = interfaceC15237i;
                        C28655q c28655q9 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a11 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g7, interfaceC17869a11, false, j111119, c13825tM48880a7, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i15, c15247s11, c23285v10, z4, c15404p2, str12, interfaceC28593a1)), c28655q9, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList8.add(C23454a0.f92919a);
                        c28655q2 = c28655q9;
                        interfaceC17869a3 = interfaceC17869a11;
                        interfaceC15237i = interfaceC15237i15;
                        c15247s3 = c15247s11;
                        c23285v2 = c23285v10;
                        str4 = str12;
                        arrayList = arrayList8;
                        f25 = f3118;
                        f19 = f3119;
                        f24 = f24;
                        c2314t = c2314t8;
                    }
                    float f31110 = f25;
                    float f31111 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f31110;
                    f27 = f19;
                    f28 = f31111;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f16 = f13;
            i19 = i46 & 64;
            if (i19 != 0) {
                if ((1572864 & i13) == 0) {
                    f17 = f14;
                    if (c28655q2.m87147d(f17)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i46 & 128;
                if (i25 != 0) {
                    if ((i13 & 12582912) == 0) {
                        str2 = str;
                        if (c28655q2.m87153g(str2)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    if ((i13 & 100663296) == 0) {
                        if ((i46 & 256) == 0) {
                            c15404p2 = c15404p1;
                            if (c28655q2.m87153g(c15404p2)) {
                                i44 = 67108864;
                            }
                            i16 |= i44;
                        } else {
                            c15404p2 = c15404p1;
                        }
                        i44 = AndroidSDKConstants.FLAG_MUTABLE;
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i27 = i16;
                    i28 = i46 & 512;
                    if (i28 != 0) {
                        i27 |= 805306368;
                    } else if ((i13 & 805306368) != 0) {
                        if (c28655q2.m87147d(f15)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i27 |= i29;
                    }
                    i34 = i27;
                    i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q2.m87153g(c15247s)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f14 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111112 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f14, j1111111, j1111112, j1111112, j1111110);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f15 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111115 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f15, j1111114, j1111115, j1111115, j1111113);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i16 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i16;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i7 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i7, 10));
                        it = c18284jM36278i7.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c8 = AbstractC34132o.m107879c(f29, c2314t);
                            float f31112 = f25;
                            float f31113 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g8 = AbstractC11895b.m31988g(modifierM107879c8, true, 1.0f);
                            long j1111116 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f8 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a8 = AbstractC17269i.m48880a(fM31077f8, j13);
                            C15247s c15247s12 = c15247s3;
                            C23285v0 c23285v11 = c23285v2;
                            C2314t c2314t9 = c2314t;
                            String str13 = str4;
                            ArrayList arrayList9 = arrayList;
                            InterfaceC15237i interfaceC15237i17 = interfaceC15237i;
                            C28655q c28655q10 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a12 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g8, interfaceC17869a12, false, j1111116, c13825tM48880a8, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i17, c15247s12, c23285v11, z4, c15404p2, str13, interfaceC28593a1)), c28655q10, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList9.add(C23454a0.f92919a);
                            c28655q2 = c28655q10;
                            interfaceC17869a3 = interfaceC17869a12;
                            interfaceC15237i = interfaceC15237i17;
                            c15247s3 = c15247s12;
                            c23285v2 = c23285v11;
                            str4 = str13;
                            arrayList = arrayList9;
                            f25 = f31112;
                            f19 = f31113;
                            f24 = f24;
                            c2314t = c2314t9;
                        }
                        float f31114 = f25;
                        float f31115 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f31114;
                        f27 = f19;
                        f28 = f31115;
                    } else {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f16 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111119 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f16, j1111118, j1111119, j1111119, j1111117);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f17 = C15069l3.m43147a(c28655q2).m43091f();
                                long j11111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j11111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j11111112 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f17, j11111111, j11111112, j11111112, j11111110);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i18 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i18;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i8 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i8, 10));
                        it = c18284jM36278i8.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c9 = AbstractC34132o.m107879c(f29, c2314t);
                            float f31116 = f25;
                            float f31117 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g9 = AbstractC11895b.m31988g(modifierM107879c9, true, 1.0f);
                            long j11111113 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f9 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a9 = AbstractC17269i.m48880a(fM31077f9, j13);
                            C15247s c15247s13 = c15247s3;
                            C23285v0 c23285v12 = c23285v2;
                            C2314t c2314t10 = c2314t;
                            String str14 = str4;
                            ArrayList arrayList10 = arrayList;
                            InterfaceC15237i interfaceC15237i19 = interfaceC15237i;
                            C28655q c28655q11 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a13 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g9, interfaceC17869a13, false, j11111113, c13825tM48880a9, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i19, c15247s13, c23285v12, z4, c15404p2, str14, interfaceC28593a1)), c28655q11, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList10.add(C23454a0.f92919a);
                            c28655q2 = c28655q11;
                            interfaceC17869a3 = interfaceC17869a13;
                            interfaceC15237i = interfaceC15237i19;
                            c15247s3 = c15247s13;
                            c23285v2 = c23285v12;
                            str4 = str14;
                            arrayList = arrayList10;
                            f25 = f31116;
                            f19 = f31117;
                            f24 = f24;
                            c2314t = c2314t10;
                        }
                        float f31118 = f25;
                        float f31119 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f31118;
                        f27 = f19;
                        f28 = f31119;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i14);
                                AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i16 |= 12582912;
                str2 = str;
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f18 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111116 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f18, j11111115, j11111116, j11111116, j11111114);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f19 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111119 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f19, j11111118, j11111119, j11111119, j11111117);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i110 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i110;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3409f10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i9 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i9, 10));
                    it = c18284jM36278i9.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c10 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311110 = f25;
                        float f311111 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g10 = AbstractC11895b.m31988g(modifierM107879c10, true, 1.0f);
                        long j111111110 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f10 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a10 = AbstractC17269i.m48880a(fM31077f10, j13);
                        C15247s c15247s14 = c15247s3;
                        C23285v0 c23285v13 = c23285v2;
                        C2314t c2314t11 = c2314t;
                        String str15 = str4;
                        ArrayList arrayList11 = arrayList;
                        InterfaceC15237i interfaceC15237i111 = interfaceC15237i;
                        C28655q c28655q12 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a14 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g10, interfaceC17869a14, false, j111111110, c13825tM48880a10, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111, c15247s14, c23285v13, z4, c15404p2, str15, interfaceC28593a1)), c28655q12, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList11.add(C23454a0.f92919a);
                        c28655q2 = c28655q12;
                        interfaceC17869a3 = interfaceC17869a14;
                        interfaceC15237i = interfaceC15237i111;
                        c15247s3 = c15247s14;
                        c23285v2 = c23285v13;
                        str4 = str15;
                        arrayList = arrayList11;
                        f25 = f311110;
                        f19 = f311111;
                        f24 = f24;
                        c2314t = c2314t11;
                    }
                    float f311112 = f25;
                    float f311113 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f311112;
                    f27 = f19;
                    f28 = f311113;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f110 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111113 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f110, j111111112, j111111113, j111111113, j111111111);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f111 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111116 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f111, j111111115, j111111116, j111111116, j111111114);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i112 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i112;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3409f11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i10 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i10, 10));
                    it = c18284jM36278i10.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c11 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311114 = f25;
                        float f311115 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g11 = AbstractC11895b.m31988g(modifierM107879c11, true, 1.0f);
                        long j111111117 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f11 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a11 = AbstractC17269i.m48880a(fM31077f11, j13);
                        C15247s c15247s15 = c15247s3;
                        C23285v0 c23285v14 = c23285v2;
                        C2314t c2314t12 = c2314t;
                        String str16 = str4;
                        ArrayList arrayList12 = arrayList;
                        InterfaceC15237i interfaceC15237i113 = interfaceC15237i;
                        C28655q c28655q13 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a15 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g11, interfaceC17869a15, false, j111111117, c13825tM48880a11, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i113, c15247s15, c23285v14, z4, c15404p2, str16, interfaceC28593a1)), c28655q13, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList12.add(C23454a0.f92919a);
                        c28655q2 = c28655q13;
                        interfaceC17869a3 = interfaceC17869a15;
                        interfaceC15237i = interfaceC15237i113;
                        c15247s3 = c15247s15;
                        c23285v2 = c23285v14;
                        str4 = str16;
                        arrayList = arrayList12;
                        f25 = f311114;
                        f19 = f311115;
                        f24 = f24;
                        c2314t = c2314t12;
                    }
                    float f311116 = f25;
                    float f311117 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f311116;
                    f27 = f19;
                    f28 = f311117;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 1572864;
            f17 = f14;
            i25 = i46 & 128;
            if (i25 != 0) {
                if ((i13 & 12582912) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f112 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111118 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111119 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111110 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f112, j111111119, j1111111110, j1111111110, j111111118);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f113 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111113 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f113, j1111111112, j1111111113, j1111111113, j1111111111);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i114 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i114;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3409f12);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i11 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i11, 10));
                    it = c18284jM36278i11.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c12 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311118 = f25;
                        float f311119 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g12 = AbstractC11895b.m31988g(modifierM107879c12, true, 1.0f);
                        long j1111111114 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f12 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a12 = AbstractC17269i.m48880a(fM31077f12, j13);
                        C15247s c15247s16 = c15247s3;
                        C23285v0 c23285v15 = c23285v2;
                        C2314t c2314t13 = c2314t;
                        String str17 = str4;
                        ArrayList arrayList13 = arrayList;
                        InterfaceC15237i interfaceC15237i115 = interfaceC15237i;
                        C28655q c28655q14 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a16 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g12, interfaceC17869a16, false, j1111111114, c13825tM48880a12, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i115, c15247s16, c23285v15, z4, c15404p2, str17, interfaceC28593a1)), c28655q14, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList13.add(C23454a0.f92919a);
                        c28655q2 = c28655q14;
                        interfaceC17869a3 = interfaceC17869a16;
                        interfaceC15237i = interfaceC15237i115;
                        c15247s3 = c15247s16;
                        c23285v2 = c23285v15;
                        str4 = str17;
                        arrayList = arrayList13;
                        f25 = f311118;
                        f19 = f311119;
                        f24 = f24;
                        c2314t = c2314t13;
                    }
                    float f3111110 = f25;
                    float f3111111 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f3111110;
                    f27 = f19;
                    f28 = f3111111;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f114 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111117 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f114, j1111111116, j1111111117, j1111111117, j1111111115);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f115 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111118 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111119 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111111110 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f115, j1111111119, j11111111110, j11111111110, j1111111118);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i116 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i116;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3409f13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i12 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i12, 10));
                    it = c18284jM36278i12.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c13 = AbstractC34132o.m107879c(f29, c2314t);
                        float f3111112 = f25;
                        float f3111113 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g13 = AbstractC11895b.m31988g(modifierM107879c13, true, 1.0f);
                        long j11111111111 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f13 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a13 = AbstractC17269i.m48880a(fM31077f13, j13);
                        C15247s c15247s17 = c15247s3;
                        C23285v0 c23285v16 = c23285v2;
                        C2314t c2314t14 = c2314t;
                        String str18 = str4;
                        ArrayList arrayList14 = arrayList;
                        InterfaceC15237i interfaceC15237i117 = interfaceC15237i;
                        C28655q c28655q15 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a17 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g13, interfaceC17869a17, false, j11111111111, c13825tM48880a13, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i117, c15247s17, c23285v16, z4, c15404p2, str18, interfaceC28593a1)), c28655q15, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList14.add(C23454a0.f92919a);
                        c28655q2 = c28655q15;
                        interfaceC17869a3 = interfaceC17869a17;
                        interfaceC15237i = interfaceC15237i117;
                        c15247s3 = c15247s17;
                        c23285v2 = c23285v16;
                        str4 = str18;
                        arrayList = arrayList14;
                        f25 = f3111112;
                        f19 = f3111113;
                        f24 = f24;
                        c2314t = c2314t14;
                    }
                    float f3111114 = f25;
                    float f3111115 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f3111114;
                    f27 = f19;
                    f28 = f3111115;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 12582912;
            str2 = str;
            if ((i13 & 100663296) == 0) {
                if ((i46 & 256) == 0) {
                    c15404p2 = c15404p1;
                    if (c28655q2.m87153g(c15404p2)) {
                        i44 = 67108864;
                    }
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i44 = AndroidSDKConstants.FLAG_MUTABLE;
                i16 |= i44;
            } else {
                c15404p2 = c15404p1;
            }
            i27 = i16;
            i28 = i46 & 512;
            if (i28 != 0) {
                i27 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q2.m87147d(f15)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i27 |= i29;
            }
            i34 = i27;
            i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(c15247s)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i34 & 306783379) != 306783378) {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f116 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111114 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f116, j11111111113, j11111111114, j11111111114, j11111111112);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f117 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111117 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f117, j11111111116, j11111111117, j11111111117, j11111111115);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i118 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i118;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3409f14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i13 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i13, 10));
                it = c18284jM36278i13.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c14 = AbstractC34132o.m107879c(f29, c2314t);
                    float f3111116 = f25;
                    float f3111117 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g14 = AbstractC11895b.m31988g(modifierM107879c14, true, 1.0f);
                    long j11111111118 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f14 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a14 = AbstractC17269i.m48880a(fM31077f14, j13);
                    C15247s c15247s18 = c15247s3;
                    C23285v0 c23285v17 = c23285v2;
                    C2314t c2314t15 = c2314t;
                    String str19 = str4;
                    ArrayList arrayList15 = arrayList;
                    InterfaceC15237i interfaceC15237i119 = interfaceC15237i;
                    C28655q c28655q16 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a18 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g14, interfaceC17869a18, false, j11111111118, c13825tM48880a14, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i119, c15247s18, c23285v17, z4, c15404p2, str19, interfaceC28593a1)), c28655q16, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList15.add(C23454a0.f92919a);
                    c28655q2 = c28655q16;
                    interfaceC17869a3 = interfaceC17869a18;
                    interfaceC15237i = interfaceC15237i119;
                    c15247s3 = c15247s18;
                    c23285v2 = c23285v17;
                    str4 = str19;
                    arrayList = arrayList15;
                    f25 = f3111116;
                    f19 = f3111117;
                    f24 = f24;
                    c2314t = c2314t15;
                }
                float f3111118 = f25;
                float f3111119 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f3111118;
                f27 = f19;
                f28 = f3111119;
            } else {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f118 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j111111111110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111111 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f118, j111111111110, j111111111111, j111111111111, j11111111119);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f119 = C15069l3.m43147a(c28655q2).m43091f();
                        long j111111111112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j111111111113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111114 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f119, j111111111113, j111111111114, j111111111114, j111111111112);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i1110 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i1110;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3409f15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i14 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i14, 10));
                it = c18284jM36278i14.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c15 = AbstractC34132o.m107879c(f29, c2314t);
                    float f31111110 = f25;
                    float f31111111 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g15 = AbstractC11895b.m31988g(modifierM107879c15, true, 1.0f);
                    long j111111111115 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f15 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a15 = AbstractC17269i.m48880a(fM31077f15, j13);
                    C15247s c15247s19 = c15247s3;
                    C23285v0 c23285v18 = c23285v2;
                    C2314t c2314t16 = c2314t;
                    String str110 = str4;
                    ArrayList arrayList16 = arrayList;
                    InterfaceC15237i interfaceC15237i1111 = interfaceC15237i;
                    C28655q c28655q17 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a19 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g15, interfaceC17869a19, false, j111111111115, c13825tM48880a15, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1111, c15247s19, c23285v18, z4, c15404p2, str110, interfaceC28593a1)), c28655q17, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList16.add(C23454a0.f92919a);
                    c28655q2 = c28655q17;
                    interfaceC17869a3 = interfaceC17869a19;
                    interfaceC15237i = interfaceC15237i1111;
                    c15247s3 = c15247s19;
                    c23285v2 = c23285v18;
                    str4 = str110;
                    arrayList = arrayList16;
                    f25 = f31111110;
                    f19 = f31111111;
                    f24 = f24;
                    c2314t = c2314t16;
                }
                float f31111112 = f25;
                float f31111113 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f31111112;
                f27 = f19;
                f28 = f31111113;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i14);
                        AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if ((i46 & 8) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q2.m87153g(interfaceC17869a2)) {
                    i45 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i16 |= i45;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i45 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i45;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((i13 & 24576) == 0) {
            i16 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        i17 = i46 & 32;
        if (i17 != 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                f16 = f13;
                if (c28655q2.m87147d(f16)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i46 & 64;
            if (i19 != 0) {
                if ((1572864 & i13) == 0) {
                    f17 = f14;
                    if (c28655q2.m87147d(f17)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i46 & 128;
                if (i25 != 0) {
                    if ((i13 & 12582912) == 0) {
                        str2 = str;
                        if (c28655q2.m87153g(str2)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    if ((i13 & 100663296) == 0) {
                        if ((i46 & 256) == 0) {
                            c15404p2 = c15404p1;
                            if (c28655q2.m87153g(c15404p2)) {
                                i44 = 67108864;
                            }
                            i16 |= i44;
                        } else {
                            c15404p2 = c15404p1;
                        }
                        i44 = AndroidSDKConstants.FLAG_MUTABLE;
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i27 = i16;
                    i28 = i46 & 512;
                    if (i28 != 0) {
                        i27 |= 805306368;
                    } else if ((i13 & 805306368) != 0) {
                        if (c28655q2.m87147d(f15)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i27 |= i29;
                    }
                    i34 = i27;
                    i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q2.m87153g(c15247s)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f1110 = C15069l3.m43147a(c28655q2).m43091f();
                                long j111111111116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j111111111117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j111111111118 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f1110, j111111111117, j111111111118, j111111111118, j111111111116);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f1111 = C15069l3.m43147a(c28655q2).m43091f();
                                long j111111111119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111111111110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111111111111 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f1111, j1111111111110, j1111111111111, j1111111111111, j111111111119);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i1112 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i1112;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3409f16);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a16);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i15 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i15, 10));
                        it = c18284jM36278i15.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c16 = AbstractC34132o.m107879c(f29, c2314t);
                            float f31111114 = f25;
                            float f31111115 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g16 = AbstractC11895b.m31988g(modifierM107879c16, true, 1.0f);
                            long j1111111111112 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f16 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a16 = AbstractC17269i.m48880a(fM31077f16, j13);
                            C15247s c15247s110 = c15247s3;
                            C23285v0 c23285v19 = c23285v2;
                            C2314t c2314t17 = c2314t;
                            String str111 = str4;
                            ArrayList arrayList17 = arrayList;
                            InterfaceC15237i interfaceC15237i1113 = interfaceC15237i;
                            C28655q c28655q18 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a110 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g16, interfaceC17869a110, false, j1111111111112, c13825tM48880a16, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1113, c15247s110, c23285v19, z4, c15404p2, str111, interfaceC28593a1)), c28655q18, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList17.add(C23454a0.f92919a);
                            c28655q2 = c28655q18;
                            interfaceC17869a3 = interfaceC17869a110;
                            interfaceC15237i = interfaceC15237i1113;
                            c15247s3 = c15247s110;
                            c23285v2 = c23285v19;
                            str4 = str111;
                            arrayList = arrayList17;
                            f25 = f31111114;
                            f19 = f31111115;
                            f24 = f24;
                            c2314t = c2314t17;
                        }
                        float f31111116 = f25;
                        float f31111117 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f31111116;
                        f27 = f19;
                        f28 = f31111117;
                    } else {
                        c28655q2.m87140Z();
                        i38 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i38 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f1112 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1111111111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111111111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111111111115 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f1112, j1111111111114, j1111111111115, j1111111111115, j1111111111113);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i46 & 8) != 0) {
                                interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                                i34 &= -7169;
                            } else {
                                interfaceC17869a3 = interfaceC17869a2;
                            }
                            c28655q2.m87150e0(-1771981384);
                            c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                            c28655q2.m87173q(false);
                            i39 = i34 & (-57345);
                            if (i17 != 0) {
                                f18 = 8;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                f19 = 20;
                            } else {
                                f19 = f17;
                            }
                            if (i25 != 0) {
                                str3 = "●";
                            } else {
                                str3 = str;
                            }
                            i46 = i15;
                            if ((i46 & 256) != 0) {
                                long jM43091f1113 = C15069l3.m43147a(c28655q2).m43091f();
                                long j1111111111116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                                long j1111111111117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                                long j1111111111118 = C17919x.f69636m;
                                i39 = i34 & (-234938369);
                                c15404p2 = new C15404p1(jM43091f1113, j1111111111117, j1111111111118, j1111111111118, j1111111111116);
                            }
                            if (i28 != 0) {
                                f24 = 2;
                            } else {
                                f24 = f15;
                            }
                            if (i35 != 0) {
                                c28655q2.m87150e0(1737572977);
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC33745d.m106649h(c28655q2);
                                }
                                c28655q2.m87173q(false);
                                c15247s2 = (C15247s) objM87133R;
                            } else {
                                c15247s2 = c15247s;
                            }
                            f25 = f18;
                        }
                        c28655q2.m87175r();
                        InterfaceC15237i interfaceC15237i1114 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, modifier2);
                        interfaceC15237i = interfaceC15237i1114;
                        c15247s3 = c15247s2;
                        C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        c23285v2 = c23285v1;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3409f17);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        str4 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a17);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m17);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N17);
                        c28655q2.m87150e0(-538960683);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-538954822);
                        C18284j c18284jM36278i16 = AbstractC12889b.m36278i0(0, 6);
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i16, 10));
                        it = c18284jM36278i16.iterator();
                        while (((C18283i) it).f71138y) {
                            iNextInt = ((AbstractC25243e0) it).nextInt();
                            if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (iNextInt == 0) {
                                c28655q2.m87150e0(-1247415338);
                                c28655q2.m87173q(false);
                            } else if (iNextInt == 3) {
                                c28655q2.m87150e0(-1247413470);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1247411137);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87150e0(-538945187);
                            if (z4) {
                                f29 = 1.0f;
                            } else {
                                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                    AbstractC17918w0.m51536x(j7);
                                } else {
                                    AbstractC17918w0.m51536x(j7);
                                }
                                f29 = 0.38f;
                            }
                            c28655q2.m87173q(false);
                            Modifier modifierM107879c17 = AbstractC34132o.m107879c(f29, c2314t);
                            float f31111118 = f25;
                            float f31111119 = f19;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g17 = AbstractC11895b.m31988g(modifierM107879c17, true, 1.0f);
                            long j1111111111119 = AbstractC11673r.m31082k(c28655q2).f37668a;
                            float fM31077f17 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                            if (z13 != 0) {
                                j13 = c15404p2.f57862a;
                            } else {
                                j13 = c15404p2.f57866e;
                            }
                            C13825t c13825tM48880a17 = AbstractC17269i.m48880a(fM31077f17, j13);
                            C15247s c15247s111 = c15247s3;
                            C23285v0 c23285v110 = c23285v2;
                            C2314t c2314t18 = c2314t;
                            String str112 = str4;
                            ArrayList arrayList18 = arrayList;
                            InterfaceC15237i interfaceC15237i1115 = interfaceC15237i;
                            C28655q c28655q19 = c28655q2;
                            InterfaceC17869a1 interfaceC17869a111 = interfaceC17869a3;
                            AbstractC32410a.m101046p(modifierM31988g17, interfaceC17869a111, false, j1111111111119, c13825tM48880a17, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1115, c15247s111, c23285v110, z4, c15404p2, str112, interfaceC28593a1)), c28655q19, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                            arrayList18.add(C23454a0.f92919a);
                            c28655q2 = c28655q19;
                            interfaceC17869a3 = interfaceC17869a111;
                            interfaceC15237i = interfaceC15237i1115;
                            c15247s3 = c15247s111;
                            c23285v2 = c23285v110;
                            str4 = str112;
                            arrayList = arrayList18;
                            f25 = f31111118;
                            f19 = f31111119;
                            f24 = f24;
                            c2314t = c2314t18;
                        }
                        float f311111110 = f25;
                        float f311111111 = f24;
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c15404p3 = c15404p2;
                        str5 = str4;
                        interfaceC17869a4 = interfaceC17869a3;
                        c15247s4 = c15247s3;
                        c23285v3 = c23285v2;
                        modifier3 = modifier2;
                        f26 = f311111110;
                        f27 = f19;
                        f28 = f311111111;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i14);
                                AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i16 |= 12582912;
                str2 = str;
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1114 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11111111111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11111111111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111111111112 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1114, j11111111111111, j11111111111112, j11111111111112, j11111111111110);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1115 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11111111111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11111111111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111111111115 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1115, j11111111111114, j11111111111115, j11111111111115, j11111111111113);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i1116 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i1116;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3409f18);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a18);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m18);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N18);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i17 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i17, 10));
                    it = c18284jM36278i17.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c18 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311111112 = f25;
                        float f311111113 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g18 = AbstractC11895b.m31988g(modifierM107879c18, true, 1.0f);
                        long j11111111111116 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f18 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a18 = AbstractC17269i.m48880a(fM31077f18, j13);
                        C15247s c15247s112 = c15247s3;
                        C23285v0 c23285v111 = c23285v2;
                        C2314t c2314t19 = c2314t;
                        String str113 = str4;
                        ArrayList arrayList19 = arrayList;
                        InterfaceC15237i interfaceC15237i1117 = interfaceC15237i;
                        C28655q c28655q110 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a112 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g18, interfaceC17869a112, false, j11111111111116, c13825tM48880a18, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1117, c15247s112, c23285v111, z4, c15404p2, str113, interfaceC28593a1)), c28655q110, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList19.add(C23454a0.f92919a);
                        c28655q2 = c28655q110;
                        interfaceC17869a3 = interfaceC17869a112;
                        interfaceC15237i = interfaceC15237i1117;
                        c15247s3 = c15247s112;
                        c23285v2 = c23285v111;
                        str4 = str113;
                        arrayList = arrayList19;
                        f25 = f311111112;
                        f19 = f311111113;
                        f24 = f24;
                        c2314t = c2314t19;
                    }
                    float f311111114 = f25;
                    float f311111115 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f311111114;
                    f27 = f19;
                    f28 = f311111115;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1116 = C15069l3.m43147a(c28655q2).m43091f();
                            long j11111111111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j11111111111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j11111111111119 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1116, j11111111111118, j11111111111119, j11111111111119, j11111111111117);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1117 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111111111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111111111112 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1117, j111111111111111, j111111111111112, j111111111111112, j111111111111110);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i1118 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i1118;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3409f19);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a19);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m19);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N19);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i18 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i18, 10));
                    it = c18284jM36278i18.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c19 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311111116 = f25;
                        float f311111117 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g19 = AbstractC11895b.m31988g(modifierM107879c19, true, 1.0f);
                        long j111111111111113 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f19 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a19 = AbstractC17269i.m48880a(fM31077f19, j13);
                        C15247s c15247s113 = c15247s3;
                        C23285v0 c23285v112 = c23285v2;
                        C2314t c2314t110 = c2314t;
                        String str114 = str4;
                        ArrayList arrayList110 = arrayList;
                        InterfaceC15237i interfaceC15237i1119 = interfaceC15237i;
                        C28655q c28655q111 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a113 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g19, interfaceC17869a113, false, j111111111111113, c13825tM48880a19, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1119, c15247s113, c23285v112, z4, c15404p2, str114, interfaceC28593a1)), c28655q111, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList110.add(C23454a0.f92919a);
                        c28655q2 = c28655q111;
                        interfaceC17869a3 = interfaceC17869a113;
                        interfaceC15237i = interfaceC15237i1119;
                        c15247s3 = c15247s113;
                        c23285v2 = c23285v112;
                        str4 = str114;
                        arrayList = arrayList110;
                        f25 = f311111116;
                        f19 = f311111117;
                        f24 = f24;
                        c2314t = c2314t110;
                    }
                    float f311111118 = f25;
                    float f311111119 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f311111118;
                    f27 = f19;
                    f28 = f311111119;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 1572864;
            f17 = f14;
            i25 = i46 & 128;
            if (i25 != 0) {
                if ((i13 & 12582912) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1118 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111111111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111111111116 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1118, j111111111111115, j111111111111116, j111111111111116, j111111111111114);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f1119 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111111111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111111111119 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f1119, j111111111111118, j111111111111119, j111111111111119, j111111111111117);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i11110 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i11110;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3409f110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m110);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N110);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i19 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i19, 10));
                    it = c18284jM36278i19.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c110 = AbstractC34132o.m107879c(f29, c2314t);
                        float f3111111110 = f25;
                        float f3111111111 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g110 = AbstractC11895b.m31988g(modifierM107879c110, true, 1.0f);
                        long j1111111111111110 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f110 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a110 = AbstractC17269i.m48880a(fM31077f110, j13);
                        C15247s c15247s114 = c15247s3;
                        C23285v0 c23285v113 = c23285v2;
                        C2314t c2314t111 = c2314t;
                        String str115 = str4;
                        ArrayList arrayList111 = arrayList;
                        InterfaceC15237i interfaceC15237i11111 = interfaceC15237i;
                        C28655q c28655q112 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a114 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g110, interfaceC17869a114, false, j1111111111111110, c13825tM48880a110, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11111, c15247s114, c23285v113, z4, c15404p2, str115, interfaceC28593a1)), c28655q112, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList111.add(C23454a0.f92919a);
                        c28655q2 = c28655q112;
                        interfaceC17869a3 = interfaceC17869a114;
                        interfaceC15237i = interfaceC15237i11111;
                        c15247s3 = c15247s114;
                        c23285v2 = c23285v113;
                        str4 = str115;
                        arrayList = arrayList111;
                        f25 = f3111111110;
                        f19 = f3111111111;
                        f24 = f24;
                        c2314t = c2314t111;
                    }
                    float f3111111112 = f25;
                    float f3111111113 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f3111111112;
                    f27 = f19;
                    f28 = f3111111113;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11110 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111111111111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111111111112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111111111113 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11110, j1111111111111112, j1111111111111113, j1111111111111113, j1111111111111111);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11111 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111111111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111111111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111111111116 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11111, j1111111111111115, j1111111111111116, j1111111111111116, j1111111111111114);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i11112 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i11112;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3409f111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a111);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i110 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i110, 10));
                    it = c18284jM36278i110.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c111 = AbstractC34132o.m107879c(f29, c2314t);
                        float f3111111114 = f25;
                        float f3111111115 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g111 = AbstractC11895b.m31988g(modifierM107879c111, true, 1.0f);
                        long j1111111111111117 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f111 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a111 = AbstractC17269i.m48880a(fM31077f111, j13);
                        C15247s c15247s115 = c15247s3;
                        C23285v0 c23285v114 = c23285v2;
                        C2314t c2314t112 = c2314t;
                        String str116 = str4;
                        ArrayList arrayList112 = arrayList;
                        InterfaceC15237i interfaceC15237i11113 = interfaceC15237i;
                        C28655q c28655q113 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a115 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g111, interfaceC17869a115, false, j1111111111111117, c13825tM48880a111, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11113, c15247s115, c23285v114, z4, c15404p2, str116, interfaceC28593a1)), c28655q113, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList112.add(C23454a0.f92919a);
                        c28655q2 = c28655q113;
                        interfaceC17869a3 = interfaceC17869a115;
                        interfaceC15237i = interfaceC15237i11113;
                        c15247s3 = c15247s115;
                        c23285v2 = c23285v114;
                        str4 = str116;
                        arrayList = arrayList112;
                        f25 = f3111111114;
                        f19 = f3111111115;
                        f24 = f24;
                        c2314t = c2314t112;
                    }
                    float f3111111116 = f25;
                    float f3111111117 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f3111111116;
                    f27 = f19;
                    f28 = f3111111117;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 12582912;
            str2 = str;
            if ((i13 & 100663296) == 0) {
                if ((i46 & 256) == 0) {
                    c15404p2 = c15404p1;
                    if (c28655q2.m87153g(c15404p2)) {
                        i44 = 67108864;
                    }
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i44 = AndroidSDKConstants.FLAG_MUTABLE;
                i16 |= i44;
            } else {
                c15404p2 = c15404p1;
            }
            i27 = i16;
            i28 = i46 & 512;
            if (i28 != 0) {
                i27 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q2.m87147d(f15)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i27 |= i29;
            }
            i34 = i27;
            i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(c15247s)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i34 & 306783379) != 306783378) {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f11112 = C15069l3.m43147a(c28655q2).m43091f();
                        long j1111111111111118 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j1111111111111119 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111110 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f11112, j1111111111111119, j11111111111111110, j11111111111111110, j1111111111111118);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f11113 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111111111111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111113 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f11113, j11111111111111112, j11111111111111113, j11111111111111113, j11111111111111111);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i11114 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i11114;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3409f112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a112);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N112);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i111 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i111, 10));
                it = c18284jM36278i111.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c112 = AbstractC34132o.m107879c(f29, c2314t);
                    float f3111111118 = f25;
                    float f3111111119 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g112 = AbstractC11895b.m31988g(modifierM107879c112, true, 1.0f);
                    long j11111111111111114 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f112 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a112 = AbstractC17269i.m48880a(fM31077f112, j13);
                    C15247s c15247s116 = c15247s3;
                    C23285v0 c23285v115 = c23285v2;
                    C2314t c2314t113 = c2314t;
                    String str117 = str4;
                    ArrayList arrayList113 = arrayList;
                    InterfaceC15237i interfaceC15237i11115 = interfaceC15237i;
                    C28655q c28655q114 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a116 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g112, interfaceC17869a116, false, j11111111111111114, c13825tM48880a112, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11115, c15247s116, c23285v115, z4, c15404p2, str117, interfaceC28593a1)), c28655q114, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList113.add(C23454a0.f92919a);
                    c28655q2 = c28655q114;
                    interfaceC17869a3 = interfaceC17869a116;
                    interfaceC15237i = interfaceC15237i11115;
                    c15247s3 = c15247s116;
                    c23285v2 = c23285v115;
                    str4 = str117;
                    arrayList = arrayList113;
                    f25 = f3111111118;
                    f19 = f3111111119;
                    f24 = f24;
                    c2314t = c2314t113;
                }
                float f31111111110 = f25;
                float f31111111111 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f31111111110;
                f27 = f19;
                f28 = f31111111111;
            } else {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f11114 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111111111115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111117 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f11114, j11111111111111116, j11111111111111117, j11111111111111117, j11111111111111115);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f11115 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111111111118 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111119 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111111111110 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f11115, j11111111111111119, j111111111111111110, j111111111111111110, j11111111111111118);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i11116 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i11116;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3409f113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a113);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m113);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N113);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i112 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i112, 10));
                it = c18284jM36278i112.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c113 = AbstractC34132o.m107879c(f29, c2314t);
                    float f31111111112 = f25;
                    float f31111111113 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g113 = AbstractC11895b.m31988g(modifierM107879c113, true, 1.0f);
                    long j111111111111111111 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f113 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a113 = AbstractC17269i.m48880a(fM31077f113, j13);
                    C15247s c15247s117 = c15247s3;
                    C23285v0 c23285v116 = c23285v2;
                    C2314t c2314t114 = c2314t;
                    String str118 = str4;
                    ArrayList arrayList114 = arrayList;
                    InterfaceC15237i interfaceC15237i11117 = interfaceC15237i;
                    C28655q c28655q115 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a117 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g113, interfaceC17869a117, false, j111111111111111111, c13825tM48880a113, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11117, c15247s117, c23285v116, z4, c15404p2, str118, interfaceC28593a1)), c28655q115, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList114.add(C23454a0.f92919a);
                    c28655q2 = c28655q115;
                    interfaceC17869a3 = interfaceC17869a117;
                    interfaceC15237i = interfaceC15237i11117;
                    c15247s3 = c15247s117;
                    c23285v2 = c23285v116;
                    str4 = str118;
                    arrayList = arrayList114;
                    f25 = f31111111112;
                    f19 = f31111111113;
                    f24 = f24;
                    c2314t = c2314t114;
                }
                float f31111111114 = f25;
                float f31111111115 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f31111111114;
                f27 = f19;
                f28 = f31111111115;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i14);
                        AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        f16 = f13;
        i19 = i46 & 64;
        if (i19 != 0) {
            if ((1572864 & i13) == 0) {
                f17 = f14;
                if (c28655q2.m87147d(f17)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            i25 = i46 & 128;
            if (i25 != 0) {
                if ((i13 & 12582912) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                if ((i13 & 100663296) == 0) {
                    if ((i46 & 256) == 0) {
                        c15404p2 = c15404p1;
                        if (c28655q2.m87153g(c15404p2)) {
                            i44 = 67108864;
                        }
                        i16 |= i44;
                    } else {
                        c15404p2 = c15404p1;
                    }
                    i44 = AndroidSDKConstants.FLAG_MUTABLE;
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i27 = i16;
                i28 = i46 & 512;
                if (i28 != 0) {
                    i27 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q2.m87147d(f15)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i27 |= i29;
                }
                i34 = i27;
                i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(c15247s)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i34 & 306783379) != 306783378) {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11116 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111111112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111111111111113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111111111111114 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11116, j111111111111111113, j111111111111111114, j111111111111111114, j111111111111111112);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11117 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111111115 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j111111111111111116 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j111111111111111117 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11117, j111111111111111116, j111111111111111117, j111111111111111117, j111111111111111115);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i11118 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i11118;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3409f114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a114);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m114);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N114);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i113 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i113, 10));
                    it = c18284jM36278i113.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c114 = AbstractC34132o.m107879c(f29, c2314t);
                        float f31111111116 = f25;
                        float f31111111117 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g114 = AbstractC11895b.m31988g(modifierM107879c114, true, 1.0f);
                        long j111111111111111118 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f114 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a114 = AbstractC17269i.m48880a(fM31077f114, j13);
                        C15247s c15247s118 = c15247s3;
                        C23285v0 c23285v117 = c23285v2;
                        C2314t c2314t115 = c2314t;
                        String str119 = str4;
                        ArrayList arrayList115 = arrayList;
                        InterfaceC15237i interfaceC15237i11119 = interfaceC15237i;
                        C28655q c28655q116 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a118 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g114, interfaceC17869a118, false, j111111111111111118, c13825tM48880a114, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i11119, c15247s118, c23285v117, z4, c15404p2, str119, interfaceC28593a1)), c28655q116, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList115.add(C23454a0.f92919a);
                        c28655q2 = c28655q116;
                        interfaceC17869a3 = interfaceC17869a118;
                        interfaceC15237i = interfaceC15237i11119;
                        c15247s3 = c15247s118;
                        c23285v2 = c23285v117;
                        str4 = str119;
                        arrayList = arrayList115;
                        f25 = f31111111116;
                        f19 = f31111111117;
                        f24 = f24;
                        c2314t = c2314t115;
                    }
                    float f31111111118 = f25;
                    float f31111111119 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f31111111118;
                    f27 = f19;
                    f28 = f31111111119;
                } else {
                    c28655q2.m87140Z();
                    i38 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11118 = C15069l3.m43147a(c28655q2).m43091f();
                            long j111111111111111119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111111111111110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111111111111111 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11118, j1111111111111111110, j1111111111111111111, j1111111111111111111, j111111111111111119);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i46 & 8) != 0) {
                            interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                            i34 &= -7169;
                        } else {
                            interfaceC17869a3 = interfaceC17869a2;
                        }
                        c28655q2.m87150e0(-1771981384);
                        c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                        c28655q2.m87173q(false);
                        i39 = i34 & (-57345);
                        if (i17 != 0) {
                            f18 = 8;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            f19 = 20;
                        } else {
                            f19 = f17;
                        }
                        if (i25 != 0) {
                            str3 = "●";
                        } else {
                            str3 = str;
                        }
                        i46 = i15;
                        if ((i46 & 256) != 0) {
                            long jM43091f11119 = C15069l3.m43147a(c28655q2).m43091f();
                            long j1111111111111111112 = AbstractC11673r.m31082k(c28655q2).f37669b;
                            long j1111111111111111113 = AbstractC11673r.m31082k(c28655q2).f37674g;
                            long j1111111111111111114 = C17919x.f69636m;
                            i39 = i34 & (-234938369);
                            c15404p2 = new C15404p1(jM43091f11119, j1111111111111111113, j1111111111111111114, j1111111111111111114, j1111111111111111112);
                        }
                        if (i28 != 0) {
                            f24 = 2;
                        } else {
                            f24 = f15;
                        }
                        if (i35 != 0) {
                            c28655q2.m87150e0(1737572977);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC33745d.m106649h(c28655q2);
                            }
                            c28655q2.m87173q(false);
                            c15247s2 = (C15247s) objM87133R;
                        } else {
                            c15247s2 = c15247s;
                        }
                        f25 = f18;
                    }
                    c28655q2.m87175r();
                    InterfaceC15237i interfaceC15237i111110 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, modifier2);
                    interfaceC15237i = interfaceC15237i111110;
                    c15247s3 = c15247s2;
                    C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    c23285v2 = c23285v1;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3409f115);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    str4 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a115);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m115);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N115);
                    c28655q2.m87150e0(-538960683);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-538954822);
                    C18284j c18284jM36278i114 = AbstractC12889b.m36278i0(0, 6);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i114, 10));
                    it = c18284jM36278i114.iterator();
                    while (((C18283i) it).f71138y) {
                        iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iNextInt == 0) {
                            c28655q2.m87150e0(-1247415338);
                            c28655q2.m87173q(false);
                        } else if (iNextInt == 3) {
                            c28655q2.m87150e0(-1247413470);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1247411137);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87150e0(-538945187);
                        if (z4) {
                            f29 = 1.0f;
                        } else {
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            f29 = 0.38f;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM107879c115 = AbstractC34132o.m107879c(f29, c2314t);
                        float f311111111110 = f25;
                        float f311111111111 = f19;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g115 = AbstractC11895b.m31988g(modifierM107879c115, true, 1.0f);
                        long j1111111111111111115 = AbstractC11673r.m31082k(c28655q2).f37668a;
                        float fM31077f115 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                        if (z13 != 0) {
                            j13 = c15404p2.f57862a;
                        } else {
                            j13 = c15404p2.f57866e;
                        }
                        C13825t c13825tM48880a115 = AbstractC17269i.m48880a(fM31077f115, j13);
                        C15247s c15247s119 = c15247s3;
                        C23285v0 c23285v118 = c23285v2;
                        C2314t c2314t116 = c2314t;
                        String str1110 = str4;
                        ArrayList arrayList116 = arrayList;
                        InterfaceC15237i interfaceC15237i111111 = interfaceC15237i;
                        C28655q c28655q117 = c28655q2;
                        InterfaceC17869a1 interfaceC17869a119 = interfaceC17869a3;
                        AbstractC32410a.m101046p(modifierM31988g115, interfaceC17869a119, false, j1111111111111111115, c13825tM48880a115, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111111, c15247s119, c23285v118, z4, c15404p2, str1110, interfaceC28593a1)), c28655q117, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                        arrayList116.add(C23454a0.f92919a);
                        c28655q2 = c28655q117;
                        interfaceC17869a3 = interfaceC17869a119;
                        interfaceC15237i = interfaceC15237i111111;
                        c15247s3 = c15247s119;
                        c23285v2 = c23285v118;
                        str4 = str1110;
                        arrayList = arrayList116;
                        f25 = f311111111110;
                        f19 = f311111111111;
                        f24 = f24;
                        c2314t = c2314t116;
                    }
                    float f311111111112 = f25;
                    float f311111111113 = f24;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c15404p3 = c15404p2;
                    str5 = str4;
                    interfaceC17869a4 = interfaceC17869a3;
                    c15247s4 = c15247s3;
                    c23285v3 = c23285v2;
                    modifier3 = modifier2;
                    f26 = f311111111112;
                    f27 = f19;
                    f28 = f311111111113;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i14);
                            AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 12582912;
            str2 = str;
            if ((i13 & 100663296) == 0) {
                if ((i46 & 256) == 0) {
                    c15404p2 = c15404p1;
                    if (c28655q2.m87153g(c15404p2)) {
                        i44 = 67108864;
                    }
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i44 = AndroidSDKConstants.FLAG_MUTABLE;
                i16 |= i44;
            } else {
                c15404p2 = c15404p1;
            }
            i27 = i16;
            i28 = i46 & 512;
            if (i28 != 0) {
                i27 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q2.m87147d(f15)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i27 |= i29;
            }
            i34 = i27;
            i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(c15247s)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i34 & 306783379) != 306783378) {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111110 = C15069l3.m43147a(c28655q2).m43091f();
                        long j1111111111111111116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j1111111111111111117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j1111111111111111118 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111110, j1111111111111111117, j1111111111111111118, j1111111111111111118, j1111111111111111116);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111111 = C15069l3.m43147a(c28655q2).m43091f();
                        long j1111111111111111119 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111111110 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111111111 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111111, j11111111111111111110, j11111111111111111111, j11111111111111111111, j1111111111111111119);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i111112 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i111112;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM3409f116);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a116);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m116);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N116);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i115 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i115, 10));
                it = c18284jM36278i115.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c116 = AbstractC34132o.m107879c(f29, c2314t);
                    float f311111111114 = f25;
                    float f311111111115 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g116 = AbstractC11895b.m31988g(modifierM107879c116, true, 1.0f);
                    long j11111111111111111112 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f116 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a116 = AbstractC17269i.m48880a(fM31077f116, j13);
                    C15247s c15247s1110 = c15247s3;
                    C23285v0 c23285v119 = c23285v2;
                    C2314t c2314t117 = c2314t;
                    String str1111 = str4;
                    ArrayList arrayList117 = arrayList;
                    InterfaceC15237i interfaceC15237i111113 = interfaceC15237i;
                    C28655q c28655q118 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a1110 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g116, interfaceC17869a1110, false, j11111111111111111112, c13825tM48880a116, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111113, c15247s1110, c23285v119, z4, c15404p2, str1111, interfaceC28593a1)), c28655q118, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList117.add(C23454a0.f92919a);
                    c28655q2 = c28655q118;
                    interfaceC17869a3 = interfaceC17869a1110;
                    interfaceC15237i = interfaceC15237i111113;
                    c15247s3 = c15247s1110;
                    c23285v2 = c23285v119;
                    str4 = str1111;
                    arrayList = arrayList117;
                    f25 = f311111111114;
                    f19 = f311111111115;
                    f24 = f24;
                    c2314t = c2314t117;
                }
                float f311111111116 = f25;
                float f311111111117 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f311111111116;
                f27 = f19;
                f28 = f311111111117;
            } else {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111112 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111111111111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111111115 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111112, j11111111111111111114, j11111111111111111115, j11111111111111111115, j11111111111111111113);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111113 = C15069l3.m43147a(c28655q2).m43091f();
                        long j11111111111111111116 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j11111111111111111117 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j11111111111111111118 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111113, j11111111111111111117, j11111111111111111118, j11111111111111111118, j11111111111111111116);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i111114 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i111114;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3409f117);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a117);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m117);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N117);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i116 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i116, 10));
                it = c18284jM36278i116.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c117 = AbstractC34132o.m107879c(f29, c2314t);
                    float f311111111118 = f25;
                    float f311111111119 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g117 = AbstractC11895b.m31988g(modifierM107879c117, true, 1.0f);
                    long j11111111111111111119 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f117 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a117 = AbstractC17269i.m48880a(fM31077f117, j13);
                    C15247s c15247s1111 = c15247s3;
                    C23285v0 c23285v1110 = c23285v2;
                    C2314t c2314t118 = c2314t;
                    String str1112 = str4;
                    ArrayList arrayList118 = arrayList;
                    InterfaceC15237i interfaceC15237i111115 = interfaceC15237i;
                    C28655q c28655q119 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a1111 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g117, interfaceC17869a1111, false, j11111111111111111119, c13825tM48880a117, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111115, c15247s1111, c23285v1110, z4, c15404p2, str1112, interfaceC28593a1)), c28655q119, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList118.add(C23454a0.f92919a);
                    c28655q2 = c28655q119;
                    interfaceC17869a3 = interfaceC17869a1111;
                    interfaceC15237i = interfaceC15237i111115;
                    c15247s3 = c15247s1111;
                    c23285v2 = c23285v1110;
                    str4 = str1112;
                    arrayList = arrayList118;
                    f25 = f311111111118;
                    f19 = f311111111119;
                    f24 = f24;
                    c2314t = c2314t118;
                }
                float f3111111111110 = f25;
                float f3111111111111 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f3111111111110;
                f27 = f19;
                f28 = f3111111111111;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i14);
                        AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 1572864;
        f17 = f14;
        i25 = i46 & 128;
        if (i25 != 0) {
            if ((i13 & 12582912) == 0) {
                str2 = str;
                if (c28655q2.m87153g(str2)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            if ((i13 & 100663296) == 0) {
                if ((i46 & 256) == 0) {
                    c15404p2 = c15404p1;
                    if (c28655q2.m87153g(c15404p2)) {
                        i44 = 67108864;
                    }
                    i16 |= i44;
                } else {
                    c15404p2 = c15404p1;
                }
                i44 = AndroidSDKConstants.FLAG_MUTABLE;
                i16 |= i44;
            } else {
                c15404p2 = c15404p1;
            }
            i27 = i16;
            i28 = i46 & 512;
            if (i28 != 0) {
                i27 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q2.m87147d(f15)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i27 |= i29;
            }
            i34 = i27;
            i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(c15247s)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i34 & 306783379) != 306783378) {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111114 = C15069l3.m43147a(c28655q2).m43091f();
                        long j111111111111111111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j111111111111111111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111111111111112 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111114, j111111111111111111111, j111111111111111111112, j111111111111111111112, j111111111111111111110);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111115 = C15069l3.m43147a(c28655q2).m43091f();
                        long j111111111111111111113 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j111111111111111111114 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111111111111115 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111115, j111111111111111111114, j111111111111111111115, j111111111111111111115, j111111111111111111113);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i111116 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i111116;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3409f118);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m118);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N118);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i117 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i117, 10));
                it = c18284jM36278i117.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c118 = AbstractC34132o.m107879c(f29, c2314t);
                    float f3111111111112 = f25;
                    float f3111111111113 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g118 = AbstractC11895b.m31988g(modifierM107879c118, true, 1.0f);
                    long j111111111111111111116 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f118 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a118 = AbstractC17269i.m48880a(fM31077f118, j13);
                    C15247s c15247s1112 = c15247s3;
                    C23285v0 c23285v1111 = c23285v2;
                    C2314t c2314t119 = c2314t;
                    String str1113 = str4;
                    ArrayList arrayList119 = arrayList;
                    InterfaceC15237i interfaceC15237i111117 = interfaceC15237i;
                    C28655q c28655q1110 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a1112 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g118, interfaceC17869a1112, false, j111111111111111111116, c13825tM48880a118, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111117, c15247s1112, c23285v1111, z4, c15404p2, str1113, interfaceC28593a1)), c28655q1110, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList119.add(C23454a0.f92919a);
                    c28655q2 = c28655q1110;
                    interfaceC17869a3 = interfaceC17869a1112;
                    interfaceC15237i = interfaceC15237i111117;
                    c15247s3 = c15247s1112;
                    c23285v2 = c23285v1111;
                    str4 = str1113;
                    arrayList = arrayList119;
                    f25 = f3111111111112;
                    f19 = f3111111111113;
                    f24 = f24;
                    c2314t = c2314t119;
                }
                float f3111111111114 = f25;
                float f3111111111115 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f3111111111114;
                f27 = f19;
                f28 = f3111111111115;
            } else {
                c28655q2.m87140Z();
                i38 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i38 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111116 = C15069l3.m43147a(c28655q2).m43091f();
                        long j111111111111111111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j111111111111111111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j111111111111111111119 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111116, j111111111111111111118, j111111111111111111119, j111111111111111111119, j111111111111111111117);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i46 & 8) != 0) {
                        interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                        i34 &= -7169;
                    } else {
                        interfaceC17869a3 = interfaceC17869a2;
                    }
                    c28655q2.m87150e0(-1771981384);
                    c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                    c28655q2.m87173q(false);
                    i39 = i34 & (-57345);
                    if (i17 != 0) {
                        f18 = 8;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        f19 = 20;
                    } else {
                        f19 = f17;
                    }
                    if (i25 != 0) {
                        str3 = "●";
                    } else {
                        str3 = str;
                    }
                    i46 = i15;
                    if ((i46 & 256) != 0) {
                        long jM43091f111117 = C15069l3.m43147a(c28655q2).m43091f();
                        long j1111111111111111111110 = AbstractC11673r.m31082k(c28655q2).f37669b;
                        long j1111111111111111111111 = AbstractC11673r.m31082k(c28655q2).f37674g;
                        long j1111111111111111111112 = C17919x.f69636m;
                        i39 = i34 & (-234938369);
                        c15404p2 = new C15404p1(jM43091f111117, j1111111111111111111111, j1111111111111111111112, j1111111111111111111112, j1111111111111111111110);
                    }
                    if (i28 != 0) {
                        f24 = 2;
                    } else {
                        f24 = f15;
                    }
                    if (i35 != 0) {
                        c28655q2.m87150e0(1737572977);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC33745d.m106649h(c28655q2);
                        }
                        c28655q2.m87173q(false);
                        c15247s2 = (C15247s) objM87133R;
                    } else {
                        c15247s2 = c15247s;
                    }
                    f25 = f18;
                }
                c28655q2.m87175r();
                InterfaceC15237i interfaceC15237i111118 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, modifier2);
                interfaceC15237i = interfaceC15237i111118;
                c15247s3 = c15247s2;
                C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                c23285v2 = c23285v1;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM3409f119);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                str4 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a119);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m119);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N119);
                c28655q2.m87150e0(-538960683);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-538954822);
                C18284j c18284jM36278i118 = AbstractC12889b.m36278i0(0, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i118, 10));
                it = c18284jM36278i118.iterator();
                while (((C18283i) it).f71138y) {
                    iNextInt = ((AbstractC25243e0) it).nextInt();
                    if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (iNextInt == 0) {
                        c28655q2.m87150e0(-1247415338);
                        c28655q2.m87173q(false);
                    } else if (iNextInt == 3) {
                        c28655q2.m87150e0(-1247413470);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1247411137);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87150e0(-538945187);
                    if (z4) {
                        f29 = 1.0f;
                    } else {
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        f29 = 0.38f;
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM107879c119 = AbstractC34132o.m107879c(f29, c2314t);
                    float f3111111111116 = f25;
                    float f3111111111117 = f19;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g119 = AbstractC11895b.m31988g(modifierM107879c119, true, 1.0f);
                    long j1111111111111111111113 = AbstractC11673r.m31082k(c28655q2).f37668a;
                    float fM31077f119 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                    if (z13 != 0) {
                        j13 = c15404p2.f57862a;
                    } else {
                        j13 = c15404p2.f57866e;
                    }
                    C13825t c13825tM48880a119 = AbstractC17269i.m48880a(fM31077f119, j13);
                    C15247s c15247s1113 = c15247s3;
                    C23285v0 c23285v1112 = c23285v2;
                    C2314t c2314t1110 = c2314t;
                    String str1114 = str4;
                    ArrayList arrayList1110 = arrayList;
                    InterfaceC15237i interfaceC15237i111119 = interfaceC15237i;
                    C28655q c28655q1111 = c28655q2;
                    InterfaceC17869a1 interfaceC17869a1113 = interfaceC17869a3;
                    AbstractC32410a.m101046p(modifierM31988g119, interfaceC17869a1113, false, j1111111111111111111113, c13825tM48880a119, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i111119, c15247s1113, c23285v1112, z4, c15404p2, str1114, interfaceC28593a1)), c28655q1111, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                    arrayList1110.add(C23454a0.f92919a);
                    c28655q2 = c28655q1111;
                    interfaceC17869a3 = interfaceC17869a1113;
                    interfaceC15237i = interfaceC15237i111119;
                    c15247s3 = c15247s1113;
                    c23285v2 = c23285v1112;
                    str4 = str1114;
                    arrayList = arrayList1110;
                    f25 = f3111111111116;
                    f19 = f3111111111117;
                    f24 = f24;
                    c2314t = c2314t1110;
                }
                float f3111111111118 = f25;
                float f3111111111119 = f24;
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c15404p3 = c15404p2;
                str5 = str4;
                interfaceC17869a4 = interfaceC17869a3;
                c15247s4 = c15247s3;
                c23285v3 = c23285v2;
                modifier3 = modifier2;
                f26 = f3111111111118;
                f27 = f19;
                f28 = f3111111111119;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i14);
                        AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 12582912;
        str2 = str;
        if ((i13 & 100663296) == 0) {
            if ((i46 & 256) == 0) {
                c15404p2 = c15404p1;
                if (c28655q2.m87153g(c15404p2)) {
                    i44 = 67108864;
                }
                i16 |= i44;
            } else {
                c15404p2 = c15404p1;
            }
            i44 = AndroidSDKConstants.FLAG_MUTABLE;
            i16 |= i44;
        } else {
            c15404p2 = c15404p1;
        }
        i27 = i16;
        i28 = i46 & 512;
        if (i28 != 0) {
            i27 |= 805306368;
        } else if ((i13 & 805306368) != 0) {
            if (c28655q2.m87147d(f15)) {
                i29 = 536870912;
            } else {
                i29 = 268435456;
            }
            i27 |= i29;
        }
        i34 = i27;
        i35 = i46 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i35 != 0) {
            i36 = 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q2.m87153g(c15247s)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i36 = i14 | i37;
        } else {
            i36 = i14;
        }
        if ((i34 & 306783379) != 306783378) {
            c28655q2.m87140Z();
            i38 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            c2314t = C2314t.f9131w;
            if (i38 != 0) {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if ((i46 & 8) != 0) {
                    interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i34 &= -7169;
                } else {
                    interfaceC17869a3 = interfaceC17869a2;
                }
                c28655q2.m87150e0(-1771981384);
                c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                c28655q2.m87173q(false);
                i39 = i34 & (-57345);
                if (i17 != 0) {
                    f18 = 8;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    f19 = 20;
                } else {
                    f19 = f17;
                }
                if (i25 != 0) {
                    str3 = "●";
                } else {
                    str3 = str;
                }
                i46 = i15;
                if ((i46 & 256) != 0) {
                    long jM43091f111118 = C15069l3.m43147a(c28655q2).m43091f();
                    long j1111111111111111111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                    long j1111111111111111111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                    long j1111111111111111111116 = C17919x.f69636m;
                    i39 = i34 & (-234938369);
                    c15404p2 = new C15404p1(jM43091f111118, j1111111111111111111115, j1111111111111111111116, j1111111111111111111116, j1111111111111111111114);
                }
                if (i28 != 0) {
                    f24 = 2;
                } else {
                    f24 = f15;
                }
                if (i35 != 0) {
                    c28655q2.m87150e0(1737572977);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC33745d.m106649h(c28655q2);
                    }
                    c28655q2.m87173q(false);
                    c15247s2 = (C15247s) objM87133R;
                } else {
                    c15247s2 = c15247s;
                }
                f25 = f18;
            } else {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if ((i46 & 8) != 0) {
                    interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i34 &= -7169;
                } else {
                    interfaceC17869a3 = interfaceC17869a2;
                }
                c28655q2.m87150e0(-1771981384);
                c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                c28655q2.m87173q(false);
                i39 = i34 & (-57345);
                if (i17 != 0) {
                    f18 = 8;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    f19 = 20;
                } else {
                    f19 = f17;
                }
                if (i25 != 0) {
                    str3 = "●";
                } else {
                    str3 = str;
                }
                i46 = i15;
                if ((i46 & 256) != 0) {
                    long jM43091f111119 = C15069l3.m43147a(c28655q2).m43091f();
                    long j1111111111111111111117 = AbstractC11673r.m31082k(c28655q2).f37669b;
                    long j1111111111111111111118 = AbstractC11673r.m31082k(c28655q2).f37674g;
                    long j1111111111111111111119 = C17919x.f69636m;
                    i39 = i34 & (-234938369);
                    c15404p2 = new C15404p1(jM43091f111119, j1111111111111111111118, j1111111111111111111119, j1111111111111111111119, j1111111111111111111117);
                }
                if (i28 != 0) {
                    f24 = 2;
                } else {
                    f24 = f15;
                }
                if (i35 != 0) {
                    c28655q2.m87150e0(1737572977);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC33745d.m106649h(c28655q2);
                    }
                    c28655q2.m87173q(false);
                    c15247s2 = (C15247s) objM87133R;
                } else {
                    c15247s2 = c15247s;
                }
                f25 = f18;
            }
            c28655q2.m87175r();
            InterfaceC15237i interfaceC15237i1111110 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, modifier2);
            interfaceC15237i = interfaceC15237i1111110;
            c15247s3 = c15247s2;
            C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            c23285v2 = c23285v1;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3409f1110);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            str4 = str3;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a1110);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1110);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1110);
            c28655q2.m87150e0(-538960683);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-538954822);
            C18284j c18284jM36278i119 = AbstractC12889b.m36278i0(0, 6);
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i119, 10));
            it = c18284jM36278i119.iterator();
            while (((C18283i) it).f71138y) {
                iNextInt = ((AbstractC25243e0) it).nextInt();
                if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (iNextInt == 0) {
                    c28655q2.m87150e0(-1247415338);
                    c28655q2.m87173q(false);
                } else if (iNextInt == 3) {
                    c28655q2.m87150e0(-1247413470);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1247411137);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                    c28655q2.m87173q(false);
                }
                c28655q2.m87150e0(-538945187);
                if (z4) {
                    f29 = 1.0f;
                } else {
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    f29 = 0.38f;
                }
                c28655q2.m87173q(false);
                Modifier modifierM107879c1110 = AbstractC34132o.m107879c(f29, c2314t);
                float f31111111111110 = f25;
                float f31111111111111 = f19;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g1110 = AbstractC11895b.m31988g(modifierM107879c1110, true, 1.0f);
                long j11111111111111111111110 = AbstractC11673r.m31082k(c28655q2).f37668a;
                float fM31077f1110 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                if (z13 != 0) {
                    j13 = c15404p2.f57862a;
                } else {
                    j13 = c15404p2.f57866e;
                }
                C13825t c13825tM48880a1110 = AbstractC17269i.m48880a(fM31077f1110, j13);
                C15247s c15247s1114 = c15247s3;
                C23285v0 c23285v1113 = c23285v2;
                C2314t c2314t1111 = c2314t;
                String str1115 = str4;
                ArrayList arrayList1111 = arrayList;
                InterfaceC15237i interfaceC15237i1111111 = interfaceC15237i;
                C28655q c28655q1112 = c28655q2;
                InterfaceC17869a1 interfaceC17869a1114 = interfaceC17869a3;
                AbstractC32410a.m101046p(modifierM31988g1110, interfaceC17869a1114, false, j11111111111111111111110, c13825tM48880a1110, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1111111, c15247s1114, c23285v1113, z4, c15404p2, str1115, interfaceC28593a1)), c28655q1112, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                arrayList1111.add(C23454a0.f92919a);
                c28655q2 = c28655q1112;
                interfaceC17869a3 = interfaceC17869a1114;
                interfaceC15237i = interfaceC15237i1111111;
                c15247s3 = c15247s1114;
                c23285v2 = c23285v1113;
                str4 = str1115;
                arrayList = arrayList1111;
                f25 = f31111111111110;
                f19 = f31111111111111;
                f24 = f24;
                c2314t = c2314t1111;
            }
            float f31111111111112 = f25;
            float f31111111111113 = f24;
            c28655q = c28655q2;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c15404p3 = c15404p2;
            str5 = str4;
            interfaceC17869a4 = interfaceC17869a3;
            c15247s4 = c15247s3;
            c23285v3 = c23285v2;
            modifier3 = modifier2;
            f26 = f31111111111112;
            f27 = f19;
            f28 = f31111111111113;
        } else {
            c28655q2.m87140Z();
            i38 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            c2314t = C2314t.f9131w;
            if (i38 != 0) {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if ((i46 & 8) != 0) {
                    interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i34 &= -7169;
                } else {
                    interfaceC17869a3 = interfaceC17869a2;
                }
                c28655q2.m87150e0(-1771981384);
                c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                c28655q2.m87173q(false);
                i39 = i34 & (-57345);
                if (i17 != 0) {
                    f18 = 8;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    f19 = 20;
                } else {
                    f19 = f17;
                }
                if (i25 != 0) {
                    str3 = "●";
                } else {
                    str3 = str;
                }
                i46 = i15;
                if ((i46 & 256) != 0) {
                    long jM43091f1111110 = C15069l3.m43147a(c28655q2).m43091f();
                    long j11111111111111111111111 = AbstractC11673r.m31082k(c28655q2).f37669b;
                    long j11111111111111111111112 = AbstractC11673r.m31082k(c28655q2).f37674g;
                    long j11111111111111111111113 = C17919x.f69636m;
                    i39 = i34 & (-234938369);
                    c15404p2 = new C15404p1(jM43091f1111110, j11111111111111111111112, j11111111111111111111113, j11111111111111111111113, j11111111111111111111111);
                }
                if (i28 != 0) {
                    f24 = 2;
                } else {
                    f24 = f15;
                }
                if (i35 != 0) {
                    c28655q2.m87150e0(1737572977);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC33745d.m106649h(c28655q2);
                    }
                    c28655q2.m87173q(false);
                    c15247s2 = (C15247s) objM87133R;
                } else {
                    c15247s2 = c15247s;
                }
                f25 = f18;
            } else {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if ((i46 & 8) != 0) {
                    interfaceC17869a3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56428b;
                    i34 &= -7169;
                } else {
                    interfaceC17869a3 = interfaceC17869a2;
                }
                c28655q2.m87150e0(-1771981384);
                c23285v1 = new C23285v0(AbstractC11673r.m31082k(c28655q2).f37671d, AbstractC35745c.m113246h(24), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 3, 0L, 16744408);
                c28655q2.m87173q(false);
                i39 = i34 & (-57345);
                if (i17 != 0) {
                    f18 = 8;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    f19 = 20;
                } else {
                    f19 = f17;
                }
                if (i25 != 0) {
                    str3 = "●";
                } else {
                    str3 = str;
                }
                i46 = i15;
                if ((i46 & 256) != 0) {
                    long jM43091f1111111 = C15069l3.m43147a(c28655q2).m43091f();
                    long j11111111111111111111114 = AbstractC11673r.m31082k(c28655q2).f37669b;
                    long j11111111111111111111115 = AbstractC11673r.m31082k(c28655q2).f37674g;
                    long j11111111111111111111116 = C17919x.f69636m;
                    i39 = i34 & (-234938369);
                    c15404p2 = new C15404p1(jM43091f1111111, j11111111111111111111115, j11111111111111111111116, j11111111111111111111116, j11111111111111111111114);
                }
                if (i28 != 0) {
                    f24 = 2;
                } else {
                    f24 = f15;
                }
                if (i35 != 0) {
                    c28655q2.m87150e0(1737572977);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC33745d.m106649h(c28655q2);
                    }
                    c28655q2.m87173q(false);
                    c15247s2 = (C15247s) objM87133R;
                } else {
                    c15247s2 = c15247s;
                }
                f25 = f18;
            }
            c28655q2.m87175r();
            InterfaceC15237i interfaceC15237i1111112 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, modifier2);
            interfaceC15237i = interfaceC15237i1111112;
            c15247s3 = c15247s2;
            C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            c23285v2 = c23285v1;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM3409f1111);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            str4 = str3;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a1111);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111);
            c28655q2.m87150e0(-538960683);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(-1, c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-538954822);
            C18284j c18284jM36278i1110 = AbstractC12889b.m36278i0(0, 6);
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1110, 10));
            it = c18284jM36278i1110.iterator();
            while (((C18283i) it).f71138y) {
                iNextInt = ((AbstractC25243e0) it).nextInt();
                if (((C28621h1) interfaceC28593a1).m87024x() == iNextInt) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (iNextInt == 0) {
                    c28655q2.m87150e0(-1247415338);
                    c28655q2.m87173q(false);
                } else if (iNextInt == 3) {
                    c28655q2.m87150e0(-1247413470);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f19, c2314t));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1247411137);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f25, c2314t));
                    c28655q2.m87173q(false);
                }
                c28655q2.m87150e0(-538945187);
                if (z4) {
                    f29 = 1.0f;
                } else {
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    f29 = 0.38f;
                }
                c28655q2.m87173q(false);
                Modifier modifierM107879c1111 = AbstractC34132o.m107879c(f29, c2314t);
                float f31111111111114 = f25;
                float f31111111111115 = f19;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g1111 = AbstractC11895b.m31988g(modifierM107879c1111, true, 1.0f);
                long j11111111111111111111117 = AbstractC11673r.m31082k(c28655q2).f37668a;
                float fM31077f1111 = AbstractC11673r.m31077f(z13, f24, (i39 >> 21) & 896, c28655q2, 0);
                if (z13 != 0) {
                    j13 = c15404p2.f57862a;
                } else {
                    j13 = c15404p2.f57866e;
                }
                C13825t c13825tM48880a1111 = AbstractC17269i.m48880a(fM31077f1111, j13);
                C15247s c15247s1115 = c15247s3;
                C23285v0 c23285v1114 = c23285v2;
                C2314t c2314t1112 = c2314t;
                String str1116 = str4;
                ArrayList arrayList1112 = arrayList;
                InterfaceC15237i interfaceC15237i1111113 = interfaceC15237i;
                C28655q c28655q1113 = c28655q2;
                InterfaceC17869a1 interfaceC17869a1115 = interfaceC17869a3;
                AbstractC32410a.m101046p(modifierM31988g1111, interfaceC17869a1115, false, j11111111111111111111117, c13825tM48880a1111, AbstractC37817c.m121344e(-1091924397, c28655q2, new C15424t1(element, iNextInt, z13, interfaceC15237i1111113, c15247s1115, c23285v1114, z4, c15404p2, str1116, interfaceC28593a1)), c28655q1113, ((i39 >> 6) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 4);
                arrayList1112.add(C23454a0.f92919a);
                c28655q2 = c28655q1113;
                interfaceC17869a3 = interfaceC17869a1115;
                interfaceC15237i = interfaceC15237i1111113;
                c15247s3 = c15247s1115;
                c23285v2 = c23285v1114;
                str4 = str1116;
                arrayList = arrayList1112;
                f25 = f31111111111114;
                f19 = f31111111111115;
                f24 = f24;
                c2314t = c2314t1112;
            }
            float f31111111111116 = f25;
            float f31111111111117 = f24;
            c28655q = c28655q2;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c15404p3 = c15404p2;
            str5 = str4;
            interfaceC17869a4 = interfaceC17869a3;
            c15247s4 = c15247s3;
            c23285v3 = c23285v2;
            modifier3 = modifier2;
            f26 = f31111111111116;
            f27 = f19;
            f28 = f31111111111117;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.q1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i14);
                    AbstractC11894a.m31958g(z4, element, modifier3, interfaceC17869a4, c23285v3, f26, f27, str5, c15404p3, f28, c15247s4, (Composer) obj, iM87244L, iM87244L2, i46);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m31959h(String str, boolean z4, C23285v0 c23285v0, C15399o1 c15399o1, int i13, InterfaceC15237i interfaceC15237i, Modifier modifier, boolean z13, C15404p1 c15404p1, String str2, Composer composer, int i14) {
        long jM60431f;
        C28655q c28655q;
        String str3 = str;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1791721297);
        int i15 = (c28655q2.m87153g(str2) ? 536870912 : 268435456) | i14 | (c28655q2.m87153g(str3) ? 4 : 2) | (c28655q2.m87155h(z4) ? 32 : 16) | (c28655q2.m87153g(c23285v0) ? 256 : 128) | (c28655q2.m87157i(c15399o1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q2.m87157i(interfaceC15237i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q2.m87153g(modifier) ? 1048576 : 524288) | (c28655q2.m87155h(z13) ? 8388608 : 4194304) | (c28655q2.m87153g(c15404p1) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE);
        if ((306783379 & i15) == 306783378 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            if (z4) {
                int length = str3.length();
                jM60431f = AbstractC21478l0.m60431f(length, length);
            } else {
                jM60431f = C23283u0.f92251b;
            }
            C29891y c29891y = new C29891y(4, str3, jM60431f);
            C17875c1 c17875c1 = new C17875c1(AbstractC11673r.m31082k(c28655q2).f37673f);
            C15389m1 c15389m1 = c15399o1.f57854b;
            int i16 = 0;
            C34351r0 c34351r0 = new C34351r0(i16, 8, i16, 123);
            c28655q2.m87150e0(1117275294);
            boolean zM87157i = c28655q2.m87157i(interfaceC15237i);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C2564l1(interfaceC15237i, 4);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(1117272882);
            boolean zM87157i2 = c28655q2.m87157i(interfaceC15237i);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2564l1(interfaceC15237i, 5);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            C34348q0 c34348q0 = new C34348q0(function1, (Function1) objM87133R2, null, null, 58);
            int i17 = i15 & 14;
            int i18 = i15 >> 12;
            int i19 = i18 & 7168;
            c28655q2.m87150e0(912615263);
            str3 = str;
            C37816b c37816bM121344e = AbstractC37817c.m121344e(1562088977, c28655q2, new C2669z3(z4, c15404p1, str, z13, str2));
            c28655q2.m87173q(false);
            c28655q2.m87150e0(1117244683);
            boolean zM87157i3 = ((57344 & i15) == 16384) | (i17 == 4) | c28655q2.m87157i(c15399o1) | c28655q2.m87157i(interfaceC15237i);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2588o1(str3, c15399o1, i13, interfaceC15237i);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC34323i.m108620b(c29891y, (Function1) objM87133R3, modifier, z13, false, c23285v0, c34351r0, c34348q0, true, 0, 0, null, null, null, c17875c1, c37816bM121344e, c28655q, (i18 & 896) | 100663296 | i19 | ((i15 << 9) & 458752), 0, 15888);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2580n1(str3, z4, c23285v0, c15399o1, i13, interfaceC15237i, modifier, z13, c15404p1, str2, i14);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m31960i(int i13, String str, C25046w imageLoader, boolean z4, Modifier modifier, C2307m c2307m, Composer composer, int i14) {
        boolean z13;
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(36976951);
        int i15 = i14 | (c28655q.m87149e(i13) ? 4 : 2) | (c28655q.m87153g(str) ? 32 : 16) | (c28655q.m87157i(imageLoader) ? 256 : 128) | (c28655q.m87155h(z4) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((74899 & i15) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-1529074886);
            boolean z14 = ((double) AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a)) < 0.5d;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1907730487);
            boolean z15 = (i15 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                if (z4) {
                    objM87133R = new C17903p(z14 ? C17919x.f69629f : C17919x.f69625b, 5);
                } else {
                    objM87133R = null;
                }
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1193756126, c28655q, new C2565l2(i13, (AbstractC17921y) objM87133R, c2307m, modifierM3407d));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            if (str != null) {
                c28655q.m87150e0(-1027133550);
                int i16 = i15 >> 3;
                z13 = true;
                AbstractC12314q.m34329i(str, imageLoader, modifierM3407d, C39102j.f168200b, null, null, c2307m, true, AbstractC37817c.m121344e(-1956875215, c28655q, new C2557k2(c37816bM121344e, 0)), AbstractC37817c.m121344e(-155295931, c28655q, new C2557k2(c37816bM121344e, 1)), c28655q, (i16 & 112) | (i16 & 14) | 905997760 | 12582912, 6, 96);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(-1026687119);
                c37816bM121344e.invoke(c28655q, 6);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(i13, str, imageLoader, z4, modifier, c2307m, i14);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m31961j(int i13, AbstractC17921y abstractC17921y, C2307m c2307m, Modifier modifier, Composer composer, int i14) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-808382466);
        int i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(abstractC17921y) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(c2307m) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (i13 != 0) {
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(i13, c28655q, i15 & 14), null, AbstractC1136a.m3599a(modifier, "PaymentMethodIconFomRes"), c2307m, null, 0.0f, abstractC17921y, c28655q, ((i15 << 3) & 7168) | 48 | ((i15 << 15) & 3670016), 48);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(i13, abstractC17921y, c2307m, modifier, i14);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final C22057e m31962k(InterfaceC36692d interfaceC36692d) {
        if (interfaceC36692d instanceof C36689a) {
            return ((C36689a) interfaceC36692d).f157127x;
        }
        if (interfaceC36692d instanceof C36691c) {
            return ((C36691c) interfaceC36692d).f157132y;
        }
        if (interfaceC36692d instanceof C36690b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final ScreenCoordinate m31963l(MotionEvent motionEvent) {
        return new ScreenCoordinate(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: m */
    public static final void m31964m(float f13, float f14, float f15) {
        if (f13 >= f14) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f14 >= f15) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: renamed from: n */
    public static C11566v m31965n(String selectedPaymentMethodCode, AbstractC12605c viewModel, C35459c0 paymentMethodMetadata, C16651f customerStateHolder, C11514a c11514a) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d()));
        C16657g c16657gM47261b = C16735t.m47261b(viewModel, paymentMethodMetadata, 4);
        C32077a c32077aM47226a = c16657gM47261b.m47226a(selectedPaymentMethodCode);
        List listM47227b = c16657gM47261b.m47227b(selectedPaymentMethodCode);
        C1836v0 c1836v0 = new C1836v0(2, c16657gM47261b, C16657g.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0, 4);
        C33333n c33333nM100289c = AbstractC32237a.m100289c(viewModel, paymentMethodMetadata, selectedPaymentMethodCode, c11514a);
        Iterable iterable = (Iterable) ((InterfaceC4339a) customerStateHolder.f64022c.f104635y).invoke();
        boolean z4 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                EnumC38828f4 enumC38828f4 = ((C38915o4) it.next()).f167511E;
                if (AbstractC22676k.m65745e(enumC38828f4 != null ? enumC38828f4.f167132w : null, selectedPaymentMethodCode)) {
                    z4 = true;
                    break;
                }
            }
        }
        return new C11566v(selectedPaymentMethodCode, c32077aM47226a, listM47227b, c1836v0, c33333nM100289c, new C0106e(1, viewModel.f43021Y, C22139d.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0, 24), paymentMethodMetadata.m112540i(selectedPaymentMethodCode, z4), paymentMethodMetadata.f150996w.mo124338q0(), viewModel.f43013Q, viewModel.f43011O, (C13081r1) c11514a.f37088b.f1239z, c17171dM8708b, AbstractC17182o.f65999a);
    }

    /* JADX INFO: renamed from: o */
    public static int m31966o(byte[] bArr, int i13, C1376d c1376d) throws InvalidProtocolBufferException {
        int iM31972u = m31972u(bArr, i13, c1376d);
        int i14 = c1376d.f5876a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        if (i14 > bArr.length - iM31972u) {
            throw InvalidProtocolBufferException.m4267g();
        }
        if (i14 == 0) {
            c1376d.f5878c = AbstractC1391i.f5905x;
            return iM31972u;
        }
        c1376d.f5878c = AbstractC1391i.m4353d(bArr, iM31972u, i14);
        return iM31972u + i14;
    }

    /* JADX INFO: renamed from: p */
    public static int m31967p(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: q */
    public static long m31968q(int i13, byte[] bArr) {
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: r */
    public static int m31969r(InterfaceC1372b1 interfaceC1372b1, int i13, byte[] bArr, int i14, int i15, InterfaceC1380e0 interfaceC1380e0, C1376d c1376d) throws InvalidProtocolBufferException {
        AbstractC1368a0 abstractC1368a0Mo4290d = interfaceC1372b1.mo4290d();
        InterfaceC1372b1 interfaceC1372b2 = interfaceC1372b1;
        byte[] bArr2 = bArr;
        int i16 = i15;
        C1376d c1376d2 = c1376d;
        int iM31942J = m31942J(abstractC1368a0Mo4290d, interfaceC1372b2, bArr2, i14, i16, c1376d2);
        interfaceC1372b2.mo4288b(abstractC1368a0Mo4290d);
        c1376d2.f5878c = abstractC1368a0Mo4290d;
        interfaceC1380e0.add(abstractC1368a0Mo4290d);
        while (iM31942J < i16) {
            C1376d c1376d3 = c1376d2;
            int i17 = i16;
            int iM31972u = m31972u(bArr2, iM31942J, c1376d3);
            if (i13 != c1376d3.f5876a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC1372b1 interfaceC1372b3 = interfaceC1372b2;
            AbstractC1368a0 abstractC1368a0Mo4290d2 = interfaceC1372b3.mo4290d();
            iM31942J = m31942J(abstractC1368a0Mo4290d2, interfaceC1372b3, bArr3, iM31972u, i17, c1376d3);
            interfaceC1372b2 = interfaceC1372b3;
            bArr2 = bArr3;
            i16 = i17;
            c1376d2 = c1376d3;
            interfaceC1372b2.mo4288b(abstractC1368a0Mo4290d2);
            c1376d2.f5878c = abstractC1368a0Mo4290d2;
            interfaceC1380e0.add(abstractC1368a0Mo4290d2);
        }
        return iM31942J;
    }

    /* JADX INFO: renamed from: s */
    public static int m31970s(int i13, byte[] bArr, int i14, int i15, C1381e1 c1381e1, C1376d c1376d) throws InvalidProtocolBufferException {
        if ((i13 >>> 3) == 0) {
            throw InvalidProtocolBufferException.m4261a();
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int iM31974w = m31974w(bArr, i14, c1376d);
            c1381e1.m4331d(i13, Long.valueOf(c1376d.f5877b));
            return iM31974w;
        }
        if (i16 == 1) {
            c1381e1.m4331d(i13, Long.valueOf(m31968q(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int iM31972u = m31972u(bArr, i14, c1376d);
            int i17 = c1376d.f5876a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.m4265e();
            }
            if (i17 > bArr.length - iM31972u) {
                throw InvalidProtocolBufferException.m4267g();
            }
            if (i17 == 0) {
                c1381e1.m4331d(i13, AbstractC1391i.f5905x);
            } else {
                c1381e1.m4331d(i13, AbstractC1391i.m4353d(bArr, iM31972u, i17));
            }
            return iM31972u + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw InvalidProtocolBufferException.m4261a();
            }
            c1381e1.m4331d(i13, Integer.valueOf(m31967p(i14, bArr)));
            return i14 + 4;
        }
        C1381e1 c1381e1M4328c = C1381e1.m4328c();
        int i18 = (i13 & (-8)) | 4;
        int i19 = c1376d.f5879d + 1;
        c1376d.f5879d = i19;
        if (i19 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i24 = 0;
        while (i14 < i15) {
            int iM31972u2 = m31972u(bArr, i14, c1376d);
            i24 = c1376d.f5876a;
            if (i24 == i18) {
                i14 = iM31972u2;
                break;
            }
            i14 = m31970s(i24, bArr, iM31972u2, i15, c1381e1M4328c, c1376d);
        }
        c1376d.f5879d--;
        if (i14 > i15 || i24 != i18) {
            throw InvalidProtocolBufferException.m4266f();
        }
        c1381e1.m4331d(i13, c1381e1M4328c);
        return i14;
    }

    /* JADX INFO: renamed from: t */
    public static int m31971t(int i13, byte[] bArr, int i14, C1376d c1376d) {
        int i15 = i13 & 127;
        int i16 = i14 + 1;
        byte b = bArr[i14];
        if (b >= 0) {
            c1376d.f5876a = i15 | (b << 7);
            return i16;
        }
        int i17 = i15 | ((b & 127) << 7);
        int i18 = i14 + 2;
        byte b6 = bArr[i16];
        if (b6 >= 0) {
            c1376d.f5876a = i17 | (b6 << 14);
            return i18;
        }
        int i19 = i17 | ((b6 & 127) << 14);
        int i24 = i14 + 3;
        byte b8 = bArr[i18];
        if (b8 >= 0) {
            c1376d.f5876a = i19 | (b8 << 21);
            return i24;
        }
        int i25 = i19 | ((b8 & 127) << 21);
        int i26 = i14 + 4;
        byte b14 = bArr[i24];
        if (b14 >= 0) {
            c1376d.f5876a = i25 | (b14 << 28);
            return i26;
        }
        int i27 = i25 | ((b14 & 127) << 28);
        while (true) {
            int i28 = i26 + 1;
            if (bArr[i26] >= 0) {
                c1376d.f5876a = i27;
                return i28;
            }
            i26 = i28;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m31972u(byte[] bArr, int i13, C1376d c1376d) {
        int i14 = i13 + 1;
        byte b = bArr[i13];
        if (b < 0) {
            return m31971t(b, bArr, i14, c1376d);
        }
        c1376d.f5876a = b;
        return i14;
    }

    /* JADX INFO: renamed from: v */
    public static int m31973v(int i13, byte[] bArr, int i14, int i15, InterfaceC1380e0 interfaceC1380e0, C1376d c1376d) {
        C1371b0 c1371b0 = (C1371b0) interfaceC1380e0;
        int iM31972u = m31972u(bArr, i14, c1376d);
        c1371b0.m4283c(c1376d.f5876a);
        while (iM31972u < i15) {
            int iM31972u2 = m31972u(bArr, iM31972u, c1376d);
            if (i13 != c1376d.f5876a) {
                break;
            }
            iM31972u = m31972u(bArr, iM31972u2, c1376d);
            c1371b0.m4283c(c1376d.f5876a);
        }
        return iM31972u;
    }

    /* JADX INFO: renamed from: w */
    public static int m31974w(byte[] bArr, int i13, C1376d c1376d) {
        int i14 = i13 + 1;
        long j7 = bArr[i13];
        if (j7 >= 0) {
            c1376d.f5877b = j7;
            return i14;
        }
        int i15 = i13 + 2;
        byte b = bArr[i14];
        long j13 = (j7 & 127) | (((long) (b & 127)) << 7);
        int i16 = 7;
        while (b < 0) {
            int i17 = i15 + 1;
            byte b6 = bArr[i15];
            i16 += 7;
            j13 |= ((long) (b6 & 127)) << i16;
            b = b6;
            i15 = i17;
        }
        c1376d.f5877b = j13;
        return i15;
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC16439p3 m31975x(AbstractC29701y abstractC29701y, C29696t c29696t, Composer composer, int i13, int i14) {
        int i15 = 1;
        if ((i14 & 2) != 0) {
            c29696t = new C29696t(1);
        }
        C11413x c11413xM11572a = AbstractC3781t1.m11572a(composer);
        Object obj = AbstractC11391p2.f36529a;
        C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, Float.valueOf(1));
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
        int i16 = 6;
        boolean zM87153g = ((((i13 & 14) ^ 6) > 4 && c28655q.m87153g(abstractC29701y)) || (i13 & 6) == 4) | c28655q.m87153g(c11413xM11572a) | c28655q.m87153g(c11362i1M30573u) | ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(c29696t)) || (i13 & 48) == 32) | c28655q.m87153g(interfaceC39171c) | c28655q.m87149e(enumC39181m.ordinal());
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C16368c c16368c = new C16368c(abstractC29701y, new C28119c(i16, abstractC29701y, enumC39181m), c29696t, i15);
            float f13 = AbstractC17833k.f69346a;
            C17829g c17829g = new C17829g(c16368c, c11413xM11572a, c11362i1M30573u);
            c28655q.m87172p0(c17829g);
            objM87133R = c17829g;
        }
        return (InterfaceC16439p3) objM87133R;
    }

    /* JADX INFO: renamed from: y */
    public static C12515b m31976y(C12515b c12515b, EnumC39181m enumC39181m, C23285v0 c23285v0, InterfaceC39171c interfaceC39171c, InterfaceC28770h interfaceC28770h) {
        if (c12515b != null && enumC39181m == c12515b.f42723a && AbstractC21598x.m60695p0(c23285v0, enumC39181m).equals(c12515b.f42724b) && interfaceC39171c.getDensity() == c12515b.f42725c.f168408w && interfaceC28770h == c12515b.f42726d) {
            return c12515b;
        }
        C12515b c12515b2 = C12515b.f42722h;
        if (c12515b2 != null && enumC39181m == c12515b2.f42723a && AbstractC21598x.m60695p0(c23285v0, enumC39181m).equals(c12515b2.f42724b) && interfaceC39171c.getDensity() == c12515b2.f42725c.f168408w && interfaceC28770h == c12515b2.f42726d) {
            return c12515b2;
        }
        C12515b c12515b3 = new C12515b(enumC39181m, AbstractC21598x.m60695p0(c23285v0, enumC39181m), new C39172d(interfaceC39171c.getDensity(), interfaceC39171c.getFontScale()), interfaceC28770h);
        C12515b.f42722h = c12515b3;
        return c12515b3;
    }

    /* JADX INFO: renamed from: z */
    public static final Rect m31977z(TextPaint textPaint, CharSequence charSequence, int i13, int i14) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i13 - 1, i14, MetricAffectingSpan.class) != i14) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i13 < i14) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i13, i14, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i13, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(metricAffectingSpanArr);
                    while (c0030i1M65777h.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) c0030i1M65777h.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0354a.m982v(textPaint2, charSequence, i13, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i13, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i13 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0354a.m982v(textPaint, charSequence, i13, i14, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i13, i14, rect3);
        return rect3;
    }
}
