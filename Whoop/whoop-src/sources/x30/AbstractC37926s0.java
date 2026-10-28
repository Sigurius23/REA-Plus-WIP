package x30;

import a23.C0175b;
import ag.C0851a;
import ag.InterfaceC0852b;
import am2.C1023i0;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import az1.C2161b;
import b01.C2193n;
import b30.C2483b0;
import b30.C2525g2;
import b30.C2555k0;
import b30.C2574m3;
import b30.C2580n1;
import b30.C2588o1;
import b30.C2596p1;
import b30.C2649w4;
import b30.EnumC2586o;
import b30.EnumC2594p;
import bc3.AbstractC3006f0;
import bg.EnumC3218m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd.C4421a;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.PopoverFormFactor;
import com.amplitude.android.engagement.types.PopoverPosition;
import com.google.android.gms.maps.GoogleMapOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.whoop.android.R;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import eu.C13604c;
import eu.C13607d0;
import eu.C13612g;
import eu.C13616i;
import eu.C13624m;
import eu.C13626n;
import eu.C13628o;
import eu.C13630q;
import eu.C13636w;
import eu.C13639z;
import g40.C15330c0;
import gb.C15657r;
import h20.AbstractC16726r2;
import h20.C16708o2;
import h20.C16714p2;
import h20.C16744u2;
import h20.EnumC16738t2;
import ih0.AbstractC18489d0;
import io.sentry.util.C20588j;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import j93.InterfaceC21467g;
import j93.InterfaceC21469h;
import j93.InterfaceC21482o;
import j93.InterfaceC21486s;
import j93.InterfaceC21493z;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25264r;
import m93.InterfaceC25339g;
import mg.C25527i;
import mg.InterfaceC25526h;
import n53.C26307a2;
import n53.C26318e;
import n83.C26466i;
import ng.C26671a;
import ng.C26676f;
import ng.C26678h;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import org.json.JSONArray;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p003a1.C0109h;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0271z0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2378g1;
import p027b3.AbstractC2399k2;
import p027b3.AbstractC2453v1;
import p027b3.C2356c;
import p027b3.C2365d3;
import p031b9.AbstractC2875y;
import p032bc.C2953i;
import p035bp.AbstractC3511b;
import p043c4.C3955e;
import p048ce.C4458a;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p114eb.C12968k;
import p184h5.C16910s0;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.C18027i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p328mj.C25598e;
import p328mj.C25607n;
import p335n6.InterfaceC26398o;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27438i;
import p355o2.C27441l;
import p355o2.C27442m;
import p355o2.C27449t;
import p358o6.C27594b;
import p358o6.InterfaceC27593a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.C28780r;
import p401pj.AbstractC29258a0;
import p401pj.C29280n;
import p423qf.C30318b;
import p442qy.C30767f;
import p459rf.C31340k;
import p459rf.C31347r;
import p459rf.C31350u;
import p459rf.C31351v;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31372g;
import p460rg.C31374i;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p460rg.InterfaceC31373h;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p525uj.AbstractC35029g;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p530up.C35147c;
import p537ux.C35338j;
import p537ux.C35352q;
import p537ux.InterfaceC35322b;
import p558vp.AbstractC36259c;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p647yf.InterfaceC39492e;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.reflect.jvm.internal.DescriptorKProperty;
import p715kotlin.reflect.jvm.internal.ReflectKCallable;
import p715kotlin.reflect.jvm.internal.UtilKt;
import p83.C28976b;
import q20.EnumC29806a;
import q30.C29934u0;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s83.AbstractC32269c;
import sj.C32561l;
import ud3.AbstractC34798a0;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34835q;
import ud3.C34837r;
import ud3.C34843u;
import ud3.EnumC34805c1;
import ud3.InterfaceC34853z;
import v00.C35473j0;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import wd3.AbstractC37174h;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;
import y00.AbstractC38833g;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.C38879k5;
import y00.C38889l5;
import y00.C38898m5;
import y00.C38907n5;
import y00.C38916o5;
import y00.C38925p5;
import y00.C38934q5;
import y00.C38952s5;
import y00.C38961t5;
import y00.EnumC38828f4;
import y00.EnumC38910o;
import yb3.AbstractC39414r;
import zd3.C40571o;

/* JADX INFO: renamed from: x30.s0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37926s0 {

    /* JADX INFO: renamed from: a */
    public static C27430e f162382a;

    /* JADX INFO: renamed from: A */
    public static ScreenCoordinate m121449A(MercatorCoordinate mercatorCoordinate, MercatorCoordinate arg) {
        AbstractC22676k.m65750j(mercatorCoordinate, "<this>");
        AbstractC22676k.m65750j(arg, "arg");
        return new ScreenCoordinate(mercatorCoordinate.getX() - arg.getX(), mercatorCoordinate.getY() - arg.getY());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Type inference failed for: r5v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v12, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m121450B(p326mf.AbstractC25492l r5, s83.AbstractC32269c r6) {
        /*
            boolean r0 = r6 instanceof p326mf.C25493m
            if (r0 == 0) goto L13
            r0 = r6
            mf.m r0 = (p326mf.C25493m) r0
            int r1 = r0.f99827x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99827x = r1
            goto L18
        L13:
            mf.m r0 = new mf.m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f99826w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f99827x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L7c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L59
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            boolean r6 = r5 instanceof p326mf.C25490j
            r2 = 0
            if (r6 == 0) goto L3f
            return r2
        L3f:
            boolean r6 = r5 instanceof p367of.C27892a
            if (r6 == 0) goto L48
            of.a r5 = (p367of.C27892a) r5
            byte[] r5 = r5.f112471a
            return r5
        L48:
            boolean r6 = r5 instanceof p326mf.C25494n
            if (r6 == 0) goto L60
            mf.n r5 = (p326mf.C25494n) r5
            t9.u r5 = r5.f99829b
            r0.f99827x = r4
            java.lang.Object r6 = p647yf.AbstractC39497j.m126160e(r5, r0)
            if (r6 != r1) goto L59
            goto L7b
        L59:
            yf.k r6 = (p647yf.C39498k) r6
            byte[] r5 = r6.mo126149n()
            return r5
        L60:
            boolean r6 = r5 instanceof p326mf.AbstractC25491k
            if (r6 == 0) goto L7f
            mf.k r5 = (p326mf.AbstractC25491k) r5
            yf.u r5 = r5.mo74903d()
            r0.f99827x = r3
            kc3.d r6 = p679zf.AbstractC40608i.f174971a
            a13.h r3 = new a13.h
            r4 = 23
            r3.<init>(r5, r2, r4)
            java.lang.Object r6 = bc3.AbstractC3006f0.m8705K(r6, r3, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            byte[] r6 = (byte[]) r6
            return r6
        L7f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x30.AbstractC37926s0.m121450B(mf.l, s83.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m121451C(vg.InterfaceC35967n r8, p474s.C31983m2 r9, s83.AbstractC32269c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x30.AbstractC37926s0.m121451C(vg.n, s.m2, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: D */
    public static final Object m121452D(InterfaceC21461d interfaceC21461d, Throwable th3) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        if (interfaceC21461d.isInstance(th3)) {
            return th3;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m121453E(C20588j c20588j, Double d3) {
        AbstractC22676k.m65750j(c20588j, "<this>");
        return d3 != null && d3.doubleValue() >= c20588j.m56721c();
    }

    /* JADX INFO: renamed from: F */
    public static void m121454F(AccessibilityEvent accessibilityEvent, boolean z4) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC2378g1.m7343r(accessibilityEvent, z4);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m121455G(InterfaceC21459c interfaceC21459c) {
        InterfaceC25339g caller;
        InterfaceC25339g defaultCaller;
        if (interfaceC21459c instanceof InterfaceC21482o) {
            InterfaceC21493z interfaceC21493z = (InterfaceC21493z) interfaceC21459c;
            Field fieldM83556G = C27648a.m83556G(interfaceC21493z);
            if (fieldM83556G != null) {
                fieldM83556G.setAccessible(true);
            }
            Method methodM83557H = C27648a.m83557H(interfaceC21493z.getGetter());
            if (methodM83557H != null) {
                methodM83557H.setAccessible(true);
            }
            Method methodM83557H2 = C27648a.m83557H(((InterfaceC21482o) interfaceC21459c).getSetter());
            if (methodM83557H2 != null) {
                methodM83557H2.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC21459c instanceof InterfaceC21493z) {
            InterfaceC21493z interfaceC21493z2 = (InterfaceC21493z) interfaceC21459c;
            Field fieldM83556G2 = C27648a.m83556G(interfaceC21493z2);
            if (fieldM83556G2 != null) {
                fieldM83556G2.setAccessible(true);
            }
            Method methodM83557H3 = C27648a.m83557H(interfaceC21493z2.getGetter());
            if (methodM83557H3 != null) {
                methodM83557H3.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC21459c instanceof InterfaceC21486s) {
            Field fieldM83556G3 = C27648a.m83556G(((InterfaceC21486s) interfaceC21459c).getProperty());
            if (fieldM83556G3 != null) {
                fieldM83556G3.setAccessible(true);
            }
            Method methodM83557H4 = C27648a.m83557H((InterfaceC21467g) interfaceC21459c);
            if (methodM83557H4 != null) {
                methodM83557H4.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC21459c instanceof InterfaceC21469h) {
            Field fieldM83556G4 = C27648a.m83556G(((InterfaceC21469h) interfaceC21459c).getProperty());
            if (fieldM83556G4 != null) {
                fieldM83556G4.setAccessible(true);
            }
            Method methodM83557H5 = C27648a.m83557H((InterfaceC21467g) interfaceC21459c);
            if (methodM83557H5 != null) {
                methodM83557H5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(interfaceC21459c instanceof InterfaceC21467g)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC21459c + " (" + interfaceC21459c.getClass() + ')');
        }
        InterfaceC21467g interfaceC21467g = (InterfaceC21467g) interfaceC21459c;
        Method methodM83557H6 = C27648a.m83557H(interfaceC21467g);
        if (methodM83557H6 != null) {
            methodM83557H6.setAccessible(true);
        }
        ReflectKCallable<?> reflectKCallableAsReflectCallable = UtilKt.asReflectCallable(interfaceC21459c);
        Object member = (reflectKCallableAsReflectCallable == null || (defaultCaller = reflectKCallableAsReflectCallable.getDefaultCaller()) == null) ? null : defaultCaller.getMember();
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        ReflectKCallable<?> reflectKCallableAsReflectCallable2 = UtilKt.asReflectCallable(interfaceC21467g);
        Member member2 = (reflectKCallableAsReflectCallable2 == null || (caller = reflectKCallableAsReflectCallable2.getCaller()) == null) ? null : caller.getMember();
        Constructor constructor = member2 instanceof Constructor ? (Constructor) member2 : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final InterfaceC41211c m121456H(Throwable th3) {
        C30767f c30767f;
        String str;
        String str2;
        AbstractC22676k.m65750j(th3, "<this>");
        if ((th3 instanceof APIConnectionException ? (APIConnectionException) th3 : null) != null) {
            return AbstractC32128i.m100054h(R.string.stripe_network_error_message);
        }
        LocalStripeException localStripeException = th3 instanceof LocalStripeException ? (LocalStripeException) th3 : null;
        if (localStripeException != null && (str2 = localStripeException.f22152F) != null) {
            return AbstractC32128i.m100055i(str2);
        }
        StripeException stripeException = th3 instanceof StripeException ? (StripeException) th3 : null;
        return (stripeException == null || (c30767f = stripeException.f22155w) == null || (str = c30767f.f126703x) == null) ? AbstractC32128i.m100054h(R.string.stripe_something_went_wrong) : AbstractC32128i.m100055i(str);
    }

    /* JADX INFO: renamed from: I */
    public static final EnumC38910o m121457I(EnumC16738t2 enumC16738t2) {
        AbstractC22676k.m65750j(enumC16738t2, "<this>");
        int iOrdinal = enumC16738t2.ordinal();
        if (iOrdinal == 0) {
            return EnumC38910o.OnSession;
        }
        if (iOrdinal == 1) {
            return EnumC38910o.OffSession;
        }
        if (iOrdinal == 2) {
            return EnumC38910o.None;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: J */
    public static Point m121458J(Point start, Point end) {
        AbstractC22676k.m65750j(start, "start");
        AbstractC22676k.m65750j(end, "end");
        double dAbs = Math.abs(end.longitude() - start.longitude());
        if (dAbs <= 180.0d || dAbs >= 360.0d) {
            return start;
        }
        double dLongitude = start.longitude();
        if (start.longitude() > 0.0d && end.longitude() < 0.0d) {
            dLongitude -= (double) 360;
        } else if (start.longitude() < 0.0d && end.longitude() > 0.0d) {
            dLongitude += (double) 360;
        }
        Point pointFromLngLat = Point.fromLngLat(dLongitude, start.latitude());
        AbstractC22676k.m65749i(pointFromLngLat, "fromLngLat(lon, start.latitude())");
        return pointFromLngLat;
    }

    /* JADX INFO: renamed from: K */
    public static final AbstractC38970u5 m121459K(AbstractC38970u5 abstractC38970u5, String str, C16744u2 intentConfiguration) {
        C16708o2 c16708o2;
        AbstractC38970u5 c38925p5;
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        EnumC38828f4.f167088G.getClass();
        EnumC38828f4 enumC38828f4M106237k = C33623c0.m106237k(str);
        if (enumC38828f4M106237k != null) {
            AbstractC16726r2 abstractC16726r2 = intentConfiguration.f64308w;
            AbstractC38970u5 abstractC38970u6 = null;
            C16714p2 c16714p2 = abstractC16726r2 instanceof C16714p2 ? (C16714p2) abstractC16726r2 : null;
            if (c16714p2 != null && (c16708o2 = c16714p2.f64246E) != null) {
                EnumC16738t2 enumC16738t2 = (EnumC16738t2) c16708o2.f64236w.get(enumC38828f4M106237k);
                if (enumC16738t2 != null) {
                    EnumC38910o setupFutureUsage = m121457I(enumC16738t2);
                    if (abstractC38970u5 != null) {
                        EnumC38910o enumC38910oM124348d = AbstractC38833g.m124348d(abstractC38970u5);
                        if (enumC38910oM124348d == EnumC38910o.OffSession) {
                            setupFutureUsage = enumC38910oM124348d;
                        }
                        if (abstractC38970u5 instanceof C38879k5) {
                            c38925p5 = new C38879k5(((C38879k5) abstractC38970u5).f167327x, setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38889l5) {
                            c38925p5 = C38889l5.m124360f((C38889l5) abstractC38970u5, null, setupFutureUsage, 11);
                        } else if (abstractC38970u5 instanceof C38916o5) {
                            c38925p5 = new C38916o5(setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38898m5) {
                            String confirmationNumber = ((C38898m5) abstractC38970u5).f167446x;
                            AbstractC22676k.m65750j(confirmationNumber, "confirmationNumber");
                            c38925p5 = new C38898m5(confirmationNumber, setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38907n5) {
                            c38925p5 = new C38907n5(setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38934q5) {
                            c38925p5 = new C38934q5(setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38952s5) {
                            c38925p5 = new C38952s5(((C38952s5) abstractC38970u5).f167665x, setupFutureUsage);
                        } else if (abstractC38970u5 instanceof C38961t5) {
                            c38925p5 = new C38961t5(setupFutureUsage);
                        } else {
                            if (!(abstractC38970u5 instanceof C38925p5)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            EnumC38828f4 paymentMethodType = ((C38925p5) abstractC38970u5).f167553x;
                            AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
                            AbstractC22676k.m65750j(setupFutureUsage, "setupFutureUsage");
                            c38925p5 = new C38925p5(paymentMethodType, setupFutureUsage);
                        }
                    } else {
                        c38925p5 = new C38925p5(enumC38828f4M106237k, setupFutureUsage);
                    }
                    abstractC38970u6 = c38925p5;
                }
                if (abstractC38970u6 != null) {
                    return abstractC38970u6;
                }
            }
        }
        return abstractC38970u5;
    }

    /* JADX INFO: renamed from: L */
    public static final C38809d5 m121460L(C38809d5 c38809d5, C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(c38809d5, "<this>");
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        C26466i c26466i = new C26466i();
        c26466i.addAll(c38809d5.m124342h());
        c26466i.add("deferred-intent");
        if (intentConfiguration.f64309x.isEmpty()) {
            c26466i.add("autopm");
        }
        return C38809d5.m124340f(c38809d5, null, AbstractC12350b.m34586g(c26466i), 3670015);
    }

    /* JADX INFO: renamed from: M */
    public static Point m121461M(Point point) {
        AbstractC22676k.m65750j(point, "<this>");
        double dLongitude = point.longitude();
        double d3 = dLongitude - 180.0d;
        if (Math.abs(d3) < 1.0E-6d) {
            dLongitude = -180.0d;
        } else {
            double d14 = dLongitude - (-180.0d);
            if ((d14 <= 1.0E-6d && Math.abs(d14) >= 1.0E-6d) || d3 >= -1.0E-6d) {
                double d15 = (d14 % 360.0d) - 180.0d;
                dLongitude = dLongitude < -180.0d ? d15 + 360.0d : d15;
            }
        }
        if (Double.isNaN(dLongitude)) {
            Point pointFromLngLat = Point.fromLngLat(point.longitude(), point.latitude());
            AbstractC22676k.m65749i(pointFromLngLat, "fromLngLat(this.longitude(), this.latitude())");
            return pointFromLngLat;
        }
        Point pointFromLngLat2 = Point.fromLngLat(dLongitude, point.latitude());
        AbstractC22676k.m65749i(pointFromLngLat2, "fromLngLat(lng, this.latitude())");
        return pointFromLngLat2;
    }

    /* JADX INFO: renamed from: N */
    public static void m121462N(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m121463a(Modifier modifier, String str, boolean z4, String label, boolean z13, Function1 onValueChange, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onValueChange, "onValueChange");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1416537179);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(label) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onValueChange) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((74899 & i15) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
            str2 = str;
        } else {
            String str3 = i16 != 0 ? "" : str;
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, z4 ? R.string.selected : R.string.not_selected);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1147868861, c28655q, new C15330c0(z4, z13));
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-893479454, c28655q, new C2483b0(label, 1));
            c28655q.m87150e0(-1271028331);
            boolean zM87153g = ((i15 & 112) == 32) | c28655q.m87153g(strM92103Y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0175b(str3, strM92103Y, 2);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC36259c.m115687e(54, c28655q, AbstractC1102d.m3409f(1.0f, AbstractC37056f.m118997u(AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R), new C2649w4(z4, z13, new C18027i(1), onValueChange, 1))), c37816bM121344e, c37816bM121344e2);
            str2 = str3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2193n(modifier, str2, z4, label, z13, onValueChange, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m121464b(String str, DebugStatus debugStatus, C37816b c37816b, Composer composer, int i13) {
        C37816b c37816b2;
        boolean z4;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2084025431);
        int i14 = i13 | (c28655q.m87153g(debugStatus) ? 32 : 16);
        if ((i14 & 731) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            c37816b2 = c37816b;
        } else {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(((Boolean) interfaceC28601c1.getValue()).booleanValue() ? 180.0f : 0.0f, null, "chevron_rotation", null, c28655q, 3072, 22);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            long j7 = AbstractC35029g.f148257f;
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, j7, c17916v0);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C25598e(3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3361f = AbstractC1092a.m3361f(modifierM3358c, false, null, (InterfaceC4339a) objM87133R2, 7);
            float f13 = AbstractC35029g.f148253b;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, modifierM3361f);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i15 = (i14 >> 3) & 14;
            float f14 = 20;
            AbstractC23164r1.m67133b(debugStatus.getIcon(c28655q, i15), debugStatus.name(), AbstractC1102d.m3419p(f14, c2314t), debugStatus.getColor(c28655q, i15), c28655q, 384, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(AbstractC35029g.f148252a, c2314t));
            long color = debugStatus.getColor(c28655q, i15);
            long j13 = AbstractC35029g.f148255d;
            C28780r c28780r = C28780r.f116540G;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC23149o4.m67127b(str, new LayoutWeightElement(1.0f, true), color, j13, c28780r, 0L, null, 0L, 0, false, 0, 0, null, c28655q, 199686, 0, 131024);
            c28655q = c28655q;
            C27430e c27430eM82859b = AbstractC11894a.f38883a;
            if (c27430eM82859b == null) {
                C27428d c27428d = new C27428d("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i16 = AbstractC27433f0.f110561a;
                C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new C27442m(7.41f, 8.59f));
                arrayList.add(new C27441l(12.0f, 13.17f));
                arrayList.add(new C27449t(4.59f, -4.58f));
                arrayList.add(new C27441l(18.0f, 10.0f));
                arrayList.add(new C27449t(-6.0f, 6.0f));
                arrayList.add(new C27449t(-6.0f, -6.0f));
                arrayList.add(new C27449t(1.41f, -1.41f));
                arrayList.add(C27438i.f110602c);
                C27428d.m82858a(c27428d, arrayList, c17875c1);
                c27430eM82859b = c27428d.m82859b();
                AbstractC11894a.f38883a = c27430eM82859b;
            }
            AbstractC23164r1.m67133b(c27430eM82859b, ((Boolean) interfaceC28601c1.getValue()).booleanValue() ? "Collapse" : "Expand", AbstractC1772c1.m5375L(((Number) interfaceC28670t2M30588b.getValue()).floatValue(), AbstractC1102d.m3419p(f14, c2314t)), AbstractC35029g.f148260i, c28655q, 3072, 0);
            c28655q.m87173q(true);
            c28655q.m87152f0(2082225219);
            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), j7, c17916v0), f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7);
                z13 = false;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                c37816b2 = c37816b;
                z4 = true;
                AbstractC18489d0.m53384y(6, c37816b2, c28655q, true);
            } else {
                c37816b2 = c37816b;
                z4 = true;
                z13 = false;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15657r(str, debugStatus, c37816b2, i13, 1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m121465c(Modifier modifier, C13612g c13612g, InterfaceC4339a interfaceC4339a, C13639z c13639z, C13607d0 c13607d0, C13616i c13616i, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function3, Function1 function4, InterfaceC22973k1 interfaceC22973k1, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14, int i15) {
        Modifier modifier2;
        int i16;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC4339a interfaceC4339a5;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4351m interfaceC4351m3;
        Function1 function8;
        C13616i c13616i2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1659788394);
        if ((i13 & 14) == 0) {
            modifier2 = modifier;
            i16 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        int i17 = i16 | 68992 | (c28655q.m87153g(c13607d0) ? 1048576 : 524288) | 918552576;
        int i18 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i18 == 0) {
            c28655q.m87153g(interfaceC4339a3);
        }
        c28655q.m87153g(interfaceC22973k1);
        int i19 = 32768 & i15;
        if (i19 == 0 && (i14 & 458752) == 0) {
            interfaceC4351m2 = interfaceC4351m;
            c28655q.m87153g(interfaceC4351m2);
        } else {
            interfaceC4351m2 = interfaceC4351m;
        }
        c28655q.m87140Z();
        if ((i13 & 1) == 0 || c28655q.m87118C()) {
            C13628o c13628o = C13628o.f48303x;
            C13604c c13604c = C13604c.f48150y;
            C13604c c13604c2 = C13604c.f48151z;
            C13628o c13628o2 = C13628o.f48304y;
            InterfaceC4339a interfaceC4339a7 = i18 != 0 ? C13628o.f48305z : interfaceC4339a3;
            C13604c c13604c3 = C13604c.f48137E;
            C13604c c13604c4 = C13604c.f48138F;
            C13616i c13616i3 = C13616i.f48223a;
            if (i19 != 0) {
                function8 = c13604c;
                c13616i2 = c13616i3;
                function7 = c13604c3;
                interfaceC4339a6 = c13628o2;
                interfaceC4351m3 = null;
                interfaceC4339a4 = interfaceC4339a7;
                interfaceC4339a5 = c13628o;
                function5 = c13604c2;
                function6 = c13604c4;
            } else {
                interfaceC4339a4 = interfaceC4339a7;
                interfaceC4339a5 = c13628o;
                function5 = c13604c2;
                function6 = c13604c4;
                function7 = c13604c3;
                interfaceC4339a6 = c13628o2;
                interfaceC4351m3 = interfaceC4351m2;
                function8 = c13604c;
                c13616i2 = c13616i3;
            }
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a;
            c13616i2 = c13616i;
            function5 = function2;
            function7 = function3;
            function6 = function4;
            interfaceC4351m3 = interfaceC4351m2;
            function8 = function1;
            interfaceC4339a4 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a2;
        }
        c28655q.m87175r();
        if (((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
            C28677v1 c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C13626n(modifier2, c13612g, interfaceC4339a5, c13639z, c13607d0, c13616i2, function8, function5, interfaceC4339a6, interfaceC4339a4, function7, function6, interfaceC22973k1, interfaceC4351m3, i13, i14, i15, 1);
            return;
        }
        C13616i c13616i4 = c13616i2;
        Function1 function9 = function8;
        Function1 function10 = function5;
        InterfaceC4339a interfaceC4339a8 = interfaceC4339a6;
        InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
        Function1 function11 = function7;
        Function1 function12 = function6;
        InterfaceC4351m interfaceC4351m4 = interfaceC4351m3;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        c28655q.m87152f0(-492369756);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C35147c(context, (GoogleMapOptions) interfaceC4339a5.invoke());
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        C35147c c35147c = (C35147c) objM87133R;
        AbstractC1137a.m3601a(new C0006a1(c35147c, 19), modifier, null, c28655q, (i17 << 3) & 112, 4);
        m121467e(c35147c, c28655q, 8);
        c28655q.m87152f0(-492369756);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C13636w();
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        C13636w c13636w = (C13636w) objM87133R2;
        c13636w.getClass();
        AbstractC22676k.m65750j(c13616i4, "<set-?>");
        c13636w.f48322a.setValue(c13616i4);
        AbstractC22676k.m65750j(function9, "<set-?>");
        c13636w.f48323b.setValue(function9);
        AbstractC22676k.m65750j(function10, "<set-?>");
        c13636w.f48324c.setValue(function10);
        AbstractC22676k.m65750j(interfaceC4339a8, "<set-?>");
        c13636w.f48325d.setValue(interfaceC4339a8);
        AbstractC22676k.m65750j(interfaceC4339a9, "<set-?>");
        c13636w.f48326e.setValue(interfaceC4339a9);
        AbstractC22676k.m65750j(function11, "<set-?>");
        c13636w.f48327f.setValue(function11);
        AbstractC22676k.m65750j(function12, "<set-?>");
        c13636w.f48328g.setValue(function12);
        AbstractC28683x.m87253g(c28655q, new C13624m(c35147c, AbstractC28683x.m87237E(c28655q), c13636w, i17, AbstractC28683x.m87238F(c13612g, c28655q), AbstractC28683x.m87238F(interfaceC22973k1, c28655q), AbstractC28683x.m87238F(null, c28655q), AbstractC28683x.m87238F(c13639z, c28655q), AbstractC28683x.m87238F(c13607d0, c28655q), AbstractC28683x.m87238F(interfaceC4351m4, c28655q), null), C23454a0.f92919a);
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 == null) {
            return;
        }
        c28677v1M87180u2.f115982d = new C13626n(modifier, c13612g, interfaceC4339a5, c13639z, c13607d0, c13616i4, function9, function10, interfaceC4339a8, interfaceC4339a9, function11, function12, interfaceC22973k1, interfaceC4351m4, i13, i14, i15, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m121466d(boolean z4, EnumC29806a enumC29806a, C35338j c35338j, boolean z13, InterfaceC4339a interfaceC4339a, Modifier modifier, C35473j0 c35473j0, InterfaceC35322b cardFundingFilter, List list, Composer composer, int i13) {
        int i14;
        boolean z14;
        boolean z15;
        String string;
        EnumC2594p enumC2594p;
        Modifier modifier2;
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(631353996);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(C2574m3.f10009a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z14 = z4;
            i14 |= c28655q.m87155h(z14) ? 32 : 16;
        } else {
            z14 = z4;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(enumC29806a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c35338j) : c28655q.m87157i(c35338j) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14 | 1572864;
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(c35473j0) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87157i(cardFundingFilter) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i15 |= c28655q.m87157i(list) ? 536870912 : 268435456;
        }
        if ((306783379 & i15) == 306783378 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            c28655q.m87150e0(792253677);
            boolean zM87153g = ((i15 & 7168) == 2048 || ((i15 & 4096) != 0 && c28655q.m87153g(c35338j))) | c28655q.m87153g(context) | c28655q.m87155h(zBooleanValue) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                if (zBooleanValue) {
                    string = "";
                    z15 = false;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    AbstractC22676k.m65750j(context, "context");
                    z15 = false;
                    string = jSONArray.put(new C35352q(new C4421a(context), (List) null, c35473j0, cardFundingFilter, 4).m112195a(c35338j, Boolean.valueOf(z14), false)).toString();
                    AbstractC22676k.m65747g(string);
                }
                objM87133R = string;
                c28655q.m87172p0(objM87133R);
            } else {
                z15 = false;
            }
            String str = (String) objM87133R;
            c28655q.m87173q(z15);
            EnumC2586o enumC2586o = AbstractC11894a.m31939G(c28655q) ? EnumC2586o.Light : EnumC2586o.Dark;
            c28655q.m87150e0(-1209044507);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            c28655q.m87150e0(792285330);
            boolean z16 = (458752 & i15) != 131072 ? z15 : true;
            Object objM87133R2 = c28655q.m87133R();
            if (z16 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2161b(interfaceC4339a, 3);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(z15);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifierM3409f, z15, (Function1) objM87133R2), "google-pay-button");
            switch (enumC29806a.ordinal()) {
                case 0:
                    enumC2594p = EnumC2594p.Buy;
                    break;
                case 1:
                    enumC2594p = EnumC2594p.Book;
                    break;
                case 2:
                    enumC2594p = EnumC2594p.Checkout;
                    break;
                case 3:
                    enumC2594p = EnumC2594p.Donate;
                    break;
                case 4:
                    enumC2594p = EnumC2594p.Order;
                    break;
                case 5:
                    enumC2594p = EnumC2594p.Pay;
                    break;
                case 6:
                    enumC2594p = EnumC2594p.Subscribe;
                    break;
                case 7:
                    enumC2594p = EnumC2594p.Plain;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            m121468f(interfaceC4339a, str, modifierM3599a, enumC2586o, enumC2594p, new C39174f(AbstractC12667a.m35432C(c28655q).f9845c), AbstractC12667a.m35432C(c28655q).f9843a, z13, c28655q, ((i15 << 9) & 29360128) | ((i15 >> 15) & 14));
            c28655q.m87173q(z15);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2580n1(z14, enumC29806a, c35338j, z13, interfaceC4339a, modifier2, c35473j0, cardFundingFilter, list, i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m121467e(C35147c c35147c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1013003870);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        AbstractC1638x lifecycle = ((InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        AbstractC22676k.m65749i(lifecycle, "LocalLifecycleOwner.current.lifecycle");
        c28655q.m87152f0(-492369756);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC28683x.m87272z(EnumC1632v.ON_CREATE);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        AbstractC28683x.m87249c(context, lifecycle, c35147c, new C13630q(c35147c, (InterfaceC28601c1) objM87133R, lifecycle, context, 0), c28655q);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3955e(c35147c, i13, 4);
    }

    /* JADX INFO: renamed from: f */
    public static final void m121468f(InterfaceC4339a interfaceC4339a, String str, Modifier modifier, EnumC2586o enumC2586o, EnumC2594p enumC2594p, C39174f c39174f, float f13, boolean z4, Composer composer, int i13) {
        int i14;
        String str2;
        EnumC2594p enumC2594p2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(293499576);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(enumC2586o) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            enumC2594p2 = enumC2594p;
            i14 |= c28655q.m87153g(enumC2594p2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            enumC2594p2 = enumC2594p;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(c39174f) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87147d(f13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? 8388608 : 4194304;
        }
        if ((4793491 & i14) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            int iMo743q0 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f13);
            Integer numValueOf = c39174f != null ? Integer.valueOf((int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c39174f.f168413w)) : null;
            c28655q.m87150e0(1259053121);
            boolean zM87149e = ((i14 & 7168) == 2048) | ((57344 & i14) == 16384) | c28655q.m87149e(iMo743q0) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87149e || objM87133R == c28676v0) {
                C2588o1 c2588o1 = new C2588o1(enumC2586o, enumC2594p2, iMo743q0, str2, 0);
                c28655q.m87172p0(c2588o1);
                objM87133R = c2588o1;
            }
            Function1 function1 = (Function1) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1259069243);
            boolean zM87153g = c28655q.m87153g(numValueOf) | ((29360128 & i14) == 8388608) | ((i14 & 14) == 4);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C1023i0(z4, numValueOf, interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC1137a.m3601a(function1, modifier, (Function1) objM87133R2, c28655q, (i14 >> 3) & 112, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2596p1(interfaceC4339a, str, modifier, enumC2586o, enumC2594p, c39174f, f13, z4, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m121469g(Nudge nudge, NudgeStep step, int i13, C25607n c25607n, Composer composer, int i14) {
        int i15;
        C25607n c25607n2;
        boolean z4;
        float fMo43112d;
        C2307m c2307m;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1251751887);
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3394p(8, c2314t));
        C2307m c2307m2 = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
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
        c28655q.m87152f0(1875455223);
        if (step.getFormFactor() instanceof PopoverFormFactor) {
            c28655q.m87152f0(645576305);
            if (((PopoverFormFactor) step.getFormFactor()).getPosition() == PopoverPosition.TOP_LEFT || ((PopoverFormFactor) step.getFormFactor()).getPosition() == PopoverPosition.TOP_RIGHT || ((PopoverFormFactor) step.getFormFactor()).getPosition() == PopoverPosition.TOP_CENTER) {
                WeakHashMap weakHashMap = C22944c2.f90553v;
                fMo43112d = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90564k, c28655q).mo43112d() + 16;
            } else {
                fMo43112d = 0;
            }
            float f13 = fMo43112d;
            c28655q.m87173q(false);
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), null, 3);
            switch (AbstractC29258a0.f118395a[((PopoverFormFactor) step.getFormFactor()).getPosition().ordinal()]) {
                case 1:
                    c2307m = c2307m2;
                    break;
                case 2:
                    c2307m = C2299e.f9116y;
                    break;
                case 3:
                    c2307m = C2299e.f9115x;
                    break;
                case 4:
                    c2307m = C2299e.f9104G;
                    break;
                case 5:
                    c2307m = C2299e.f9106I;
                    break;
                case 6:
                    c2307m = C2299e.f9105H;
                    break;
                case 7:
                    c2307m = C2299e.f9117z;
                    break;
                case 8:
                    c2307m = C2299e.f9103F;
                    break;
                case 9:
                    c2307m = C2299e.f9102E;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(modifierM3427x, c2307m);
            c28655q.m87152f0(-412521741);
            C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            Modifier modifierM3424u = AbstractC1102d.m3424u(c35035m.f148322S, modifierMo3400a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            i15 = i13;
            c25607n2 = c25607n;
            z4 = true;
            AbstractC32100b.m99856a(step, new C32561l(nudge, step, i15, c25607n2), null, c28655q, 72, 4);
            c28655q.m87173q(true);
        } else {
            i15 = i13;
            c25607n2 = c25607n;
            z4 = true;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(z4);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C29280n(nudge, step, i15, c25607n2, i14, 1);
    }

    /* JADX INFO: renamed from: h */
    public static String m121470h(int i13, int i14) {
        String str;
        if (i13 == 64) {
            str = "[APPLICATION ";
        } else if (i13 != 128) {
            str = i13 != 192 ? "[UNIVERSAL " : "[PRIVATE ";
        } else {
            str = "[CONTEXT ";
        }
        return AbstractC2875y.m8296i(i14, str, "]");
    }

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap m121471i(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getValue();
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add((ComponentName) entry.getKey());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    public static final C34826l0 m121472j(C34826l0 c34826l0, C30318b c30318b, C31347r c31347r) {
        C34824k0 c34824k0M109897a = c34826l0.m109897a();
        c34824k0M109897a.f146616e = new C2953i(c34826l0, c31347r, c30318b, 15);
        c34824k0M109897a.m109891a(C31340k.f128960w);
        return new C34826l0(c34824k0M109897a);
    }

    /* JADX INFO: renamed from: k */
    public static final C34826l0 m121473k(final C31347r c31347r, final C30318b metrics, final AbstractC34798a0... abstractC34798a0Arr) {
        EnumC34805c1 enumC34805c1;
        AbstractC22676k.m65750j(c31347r, "<this>");
        AbstractC22676k.m65750j(metrics, "metrics");
        C34824k0 c34824k0 = new C34824k0();
        c34824k0.f146620i = false;
        c34824k0.f146621j = false;
        EnumC3218m enumC3218m = c31347r.f117918i.f117937a;
        if (enumC3218m == null) {
            enumC3218m = EnumC3218m.f12588w;
        }
        EnumC3218m[] enumC3218mArrValues = EnumC3218m.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC3218m enumC3218m2 : enumC3218mArrValues) {
            if (enumC3218m2.compareTo(enumC3218m) >= 0) {
                arrayList.add(enumC3218m2);
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, C28976b.f117212w);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((EnumC3218m) it.next()).ordinal();
            if (iOrdinal == 0) {
                enumC34805c1 = EnumC34805c1.TLS_1_0;
            } else if (iOrdinal == 1) {
                enumC34805c1 = EnumC34805c1.TLS_1_1;
            } else if (iOrdinal == 2) {
                enumC34805c1 = EnumC34805c1.TLS_1_2;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC34805c1 = EnumC34805c1.TLS_1_3;
            }
            arrayList2.add(enumC34805c1);
        }
        EnumC34805c1[] enumC34805c1Arr = (EnumC34805c1[]) arrayList2.toArray(new EnumC34805c1[0]);
        C12968k c12968k = new C12968k(C34837r.f146724e);
        c12968k.m36458g((EnumC34805c1[]) Arrays.copyOf(enumC34805c1Arr, enumC34805c1Arr.length));
        List listM118959K = AbstractC37056f.m118959K(c12968k.m36453b(), C34837r.f146725f);
        if (!listM118959K.equals(c34824k0.f146630s)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146630s = AbstractC37174h.m119143j(listM118959K);
        c34824k0.f146617f = c31347r.f128986l;
        long j7 = c31347r.f117912c;
        Duration durationOfSeconds = Duration.ofSeconds(p715kotlin.time.Duration.m134276getInWholeSecondsimpl(j7), p715kotlin.time.Duration.m134278getNanosecondsComponentimpl(j7));
        AbstractC22676k.m65749i(durationOfSeconds, "toComponents-impl(...)");
        long millis = durationOfSeconds.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34824k0.m109892b(millis, timeUnit);
        long j13 = c31347r.f117910a;
        Duration durationOfSeconds2 = Duration.ofSeconds(p715kotlin.time.Duration.m134276getInWholeSecondsimpl(j13), p715kotlin.time.Duration.m134278getNanosecondsComponentimpl(j13));
        AbstractC22676k.m65749i(durationOfSeconds2, "toComponents-impl(...)");
        c34824k0.m109895e(durationOfSeconds2.toMillis(), timeUnit);
        long j14 = c31347r.f117911b;
        Duration durationOfSeconds3 = Duration.ofSeconds(p715kotlin.time.Duration.m134276getInWholeSecondsimpl(j14), p715kotlin.time.Duration.m134278getNanosecondsComponentimpl(j14));
        AbstractC22676k.m65749i(durationOfSeconds3, "toComponents-impl(...)");
        c34824k0.m109896f(durationOfSeconds3.toMillis(), timeUnit);
        final C34835q c34835q = new C34835q(p715kotlin.time.Duration.m134273getInWholeMillisecondsimpl(c31347r.f117914e), timeUnit);
        c34824k0.f146613b = c34835q;
        final C34843u c34843u = new C34843u();
        int i13 = c31347r.f117915f;
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "max < 1: ").toString());
        }
        synchronized (c34843u) {
            c34843u.f146753a = i13;
        }
        C34843u.m109919c(c34843u, null, null, null, 7);
        c34843u.m109923e(c31347r.f128985k);
        c34824k0.f146612a = c34843u;
        c34824k0.f146616e = new InterfaceC34853z() { // from class: rf.s
            @Override // ud3.InterfaceC34853z
            /* JADX INFO: renamed from: b */
            public final AbstractC34798a0 mo8619b(C40571o c40571o) {
                C22677k0 c22677k0 = new C22677k0(2);
                c22677k0.m65760a(new C31335f(c34835q, c31347r.f117917h, c34843u, metrics, c40571o));
                c22677k0.m65764e(abstractC34798a0Arr);
                ArrayList arrayList3 = c22677k0.f89339a;
                Object[] elements = arrayList3.toArray(new AbstractC34798a0[arrayList3.size()]);
                AbstractC22676k.m65750j(elements, "elements");
                return new C31330a(AbstractC25260n.m74077r0(elements));
            }
        };
        c31347r.f117918i.getClass();
        C31351v c31351v = new C31351v(c31347r.f117916g);
        if (!c31351v.equals(c34824k0.f146625n)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146625n = c31351v;
        C31350u c31350u = new C31350u(c31347r.f117916g);
        if (!c31350u.equals(c34824k0.f146626o)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146626o = c31350u;
        C29934u0 c29934u0 = new C29934u0(c31347r.f117917h);
        if (!c29934u0.equals(c34824k0.f146624m)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146624m = c29934u0;
        c34824k0.m109891a(C31340k.f128960w);
        return new C34826l0(c34824k0);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC26398o m121474l(InterfaceC26398o interfaceC26398o, InterfaceC27593a interfaceC27593a) {
        return interfaceC26398o.mo78107d(new C27594b(interfaceC27593a));
    }

    /* JADX INFO: renamed from: m */
    public static final void m121475m(C13045h2 c13045h2, C13045h2 c13045h3, InterfaceC4351m interfaceC4351m) {
        new C2555k0(interfaceC4351m, null);
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC39492e m121476n(InterfaceC39492e handler, InterfaceC0852b... middleware) {
        AbstractC22676k.m65750j(handler, "handler");
        AbstractC22676k.m65750j(middleware, "middleware");
        if (middleware.length == 0) {
            return handler;
        }
        int length = middleware.length - 1;
        if (length < 0) {
            length = 0;
        }
        List listM74042R0 = AbstractC25260n.m74042R0(length, middleware);
        C0851a c0851a = new C0851a(handler, (InterfaceC0852b) AbstractC25260n.m74029E0(middleware));
        if (!listM74042R0.isEmpty()) {
            ListIterator listIterator = listM74042R0.listIterator(listM74042R0.size());
            while (listIterator.hasPrevious()) {
                c0851a = new C0851a(c0851a, (InterfaceC0852b) listIterator.previous());
            }
        }
        return c0851a;
    }

    /* JADX INFO: renamed from: p */
    public static final C25264r m121477p(View view) {
        return new C25264r(new C2525g2(view, null, 2));
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC38174i m121478q(View view) {
        return AbstractC38176k.m122288x(view.getParent(), C16910s0.f64869w);
    }

    /* JADX INFO: renamed from: r */
    public static C2356c m121479r(Locale locale) {
        if (C2356c.f9308f == null) {
            C2356c c2356c = new C2356c(0);
            c2356c.f9311e = BreakIterator.getCharacterInstance(locale);
            C2356c.f9308f = c2356c;
        }
        C2356c c2356c2 = C2356c.f9308f;
        AbstractC22676k.m65748h(c2356c2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
        return c2356c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final boolean m121480t(DescriptorKProperty descriptorKProperty) {
        if (descriptorKProperty instanceof InterfaceC21482o) {
            Field fieldM83556G = C27648a.m83556G(descriptorKProperty);
            if (!(fieldM83556G != null ? fieldM83556G.isAccessible() : true)) {
                return false;
            }
            Method methodM83557H = C27648a.m83557H(descriptorKProperty.getGetter());
            if (!(methodM83557H != null ? methodM83557H.isAccessible() : true)) {
                return false;
            }
            Method methodM83557H2 = C27648a.m83557H(((InterfaceC21482o) descriptorKProperty).getSetter());
            if (!(methodM83557H2 != null ? methodM83557H2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldM83556G2 = C27648a.m83556G(descriptorKProperty);
            if (!(fieldM83556G2 != null ? fieldM83556G2.isAccessible() : true)) {
                return false;
            }
            Method methodM83557H3 = C27648a.m83557H(descriptorKProperty.getGetter());
            if (!(methodM83557H3 != null ? methodM83557H3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m121481u(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0025, B:47:0x00c2, B:49:0x00c6, B:51:0x00d6, B:50:0x00ce), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0025, B:47:0x00c2, B:49:0x00c6, B:51:0x00d6, B:50:0x00ce), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public static final Object m121482v(InterfaceC35967n interfaceC35967n, AbstractC32269c abstractC32269c) throws Throwable {
        C4458a c4458a;
        Throwable th3;
        C31371f c31371f;
        Exception e5;
        InterfaceC30063j c26678h;
        InterfaceC25526h interfaceC25526h;
        if (abstractC32269c instanceof C4458a) {
            c4458a = (C4458a) abstractC32269c;
            int i13 = c4458a.f17968y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c4458a.f17968y = i13 - Integer.MIN_VALUE;
            } else {
                c4458a = new C4458a(abstractC32269c);
            }
        } else {
            c4458a = new C4458a(abstractC32269c);
        }
        Object obj = c4458a.f17967x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c4458a.f17968y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31371f = c4458a.f17966w;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                    c31371f.getClass();
                    return obj;
                } catch (Exception e13) {
                    e5 = e13;
                    if (e5 instanceof CancellationException) {
                        AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
                    } else {
                        EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                        c31371f.getClass();
                        AbstractC31375j.m96497m(c31371f, e5);
                    }
                    throw e5;
                }
            } catch (Throwable th4) {
                th3 = th4;
                c31371f.getClass();
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        EnumC31369d enumC31369d = EnumC31369d.f129029w;
        ((C31377l) AbstractC3511b.m10394w(c4458a.getContext()).mo75077d()).getClass();
        AbstractC12314q.m34346z(c4458a.getContext());
        InterfaceC31373h.f129036s.getClass();
        C31371f c31371f2 = C31372g.f129035b;
        try {
            C25527i c25527i = (C25527i) c4458a.getContext().get(C25527i.f99938x);
            C26676f c26676f = (c25527i == null || (interfaceC25526h = c25527i.f99939w) == null || interfaceC25526h.mo75076b() == null) ? null : C26671a.f106051a;
            C30064k c30064k = C30064k.f122676w;
            if (c26676f != null) {
                c26678h = new C26678h(c26676f);
            } else {
                c26678h = (C26678h) c4458a.getContext().get(C26678h.f106054x);
                if (c26678h == null) {
                    c26678h = c30064k;
                }
            }
            InterfaceC30063j interfaceC30063jPlus = new C31374i(c31371f2).plus(c26678h).plus(c30064k);
            C0109h c0109h = new C0109h(c31371f2, (InterfaceC30057d) null, interfaceC35967n);
            c4458a.f17966w = c31371f2;
            c4458a.f17968y = 1;
            Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jPlus, c0109h, c4458a);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            obj = objM8705K;
            c31371f = c31371f2;
            c31371f.getClass();
            return obj;
        } catch (Exception e14) {
            e5 = e14;
            c31371f = c31371f2;
            if (e5 instanceof CancellationException) {
                AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
            } else {
                EnumC31370e[] enumC31370eArr2 = EnumC31370e.f129032w;
                c31371f.getClass();
                AbstractC31375j.m96497m(c31371f, e5);
            }
            throw e5;
        } catch (Throwable th5) {
            th3 = th5;
            c31371f = c31371f2;
            c31371f.getClass();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final C26318e m121484x(InterfaceC13037f2 interfaceC13037f2, Function1 transform) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        AbstractC22676k.m65750j(transform, "transform");
        return new C26318e(new C0271z0(19, transform, interfaceC13037f2), new C26307a2(0, interfaceC13037f2, transform));
    }

    /* JADX INFO: renamed from: y */
    public static final View m121485y(ViewGroup viewGroup, int i13) {
        View view = (View) AbstractC38176k.m122283s(new C2365d3(viewGroup, 1));
        if (i13 == 0) {
            return view;
        }
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup2 != null) {
            return m121485y(viewGroup2, i13 - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final String m121486z(String path, InterfaceC35967n platform) {
        String strConcat;
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(platform, "platform");
        if (!AbstractC39414r.m125907z0(AbstractC39414r.m125869O0(path).toString(), '~')) {
            return path;
        }
        C35971r c35971r = (C35971r) platform;
        int iOrdinal = c35971r.m114208c().f153133a.ordinal();
        if (iOrdinal == 2 || iOrdinal == 8) {
            String strM114207b = c35971r.m114207b("HOME");
            if (strM114207b == null && (strM114207b = c35971r.m114207b("USERPROFILE")) == null) {
                String strM114207b2 = c35971r.m114207b("HOMEDRIVE");
                String strM114207b3 = c35971r.m114207b("HOMEPATH");
                strConcat = (strM114207b2 == null || strM114207b3 == null) ? null : strM114207b2.concat(strM114207b3);
                if (strConcat == null) {
                    strConcat = System.getProperty("user.home");
                }
            } else {
                strConcat = strM114207b;
            }
        } else {
            strConcat = c35971r.m114207b("HOME");
            if (strConcat == null) {
                strConcat = System.getProperty("user.home");
            }
        }
        if (strConcat == null) {
            throw new IllegalStateException("Unable to determine user home directory");
        }
        String strSubstring = path.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strConcat.concat(strSubstring);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo91520o(String str, Throwable th3);

    /* JADX INFO: renamed from: s */
    public abstract void mo91521s();
}
