package p097ds;

import ai.C0904j;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.RunnableC1310j2;
import androidx.health.platform.client.impl.ipc.ApiVersionException;
import androidx.health.platform.client.proto.C1533u;
import androidx.recyclerview.widget.C1665c;
import androidx.recyclerview.widget.C1686h;
import androidx.recyclerview.widget.C1734t;
import aq.C1889f;
import bc3.C2999d1;
import bc3.C3033m;
import cd3.C4455g;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.iterable.iterableapi.AsyncTaskC5304a2;
import es.AbstractC13587a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.performance.C20144g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import la.C23548b;
import mc.AbstractC25412i;
import p009a8.C0531a;
import p009a8.C0532b;
import p035bp.AbstractC3511b;
import p044c5.C4214f;
import p073cq.C11040i;
import p073cq.C11046o;
import p073cq.InterfaceC11036e;
import p080d4.AbstractC11649h;
import p080d4.C11653l;
import p217ib.AbstractC18314k;
import p217ib.AbstractC18317n;
import p217ib.C18305c;
import p217ib.C18312i;
import p217ib.C18315l;
import p217ib.C18321r;
import p218ic.C18354e;
import p249jc.C21577g;
import p249jc.C21582i0;
import p400pc.C29063b;
import p420qc.C30207q;
import p503tp.AbstractC34036g;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p513u4.AbstractC34514b;
import p529uo.AbstractBinderC35103a;
import p529uo.AbstractC35107c;
import p529uo.AbstractC35135w;
import p529uo.C35132t;
import p529uo.InterfaceC35119i;
import p546v7.C35752b;
import p673z7.C40137a;
import p673z7.C40138b;
import p673z7.InterfaceC40139c;
import p715kotlin.KotlinNullPointerException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import pg3.C29223y;
import q30.C29938w0;
import qg3.C30352d;
import rs.AbstractC31780b;
import sc.C32352b;
import td3.AbstractC33721a;
import to.AbstractDialogInterfaceOnCancelListenerC33996r0;
import to.BinderC33978i0;
import to.C33979j;
import to.C33981k;
import to.C33992p0;
import to.C33994q0;

/* JADX INFO: renamed from: ds.s */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC12316s implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41245w;

    /* JADX INFO: renamed from: x */
    public final Object f41246x;

    /* JADX INFO: renamed from: y */
    public final Object f41247y;

    public /* synthetic */ RunnableC12316s(int i13, Object obj, Object obj2) {
        this.f41245w = i13;
        this.f41246x = obj;
        this.f41247y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x047d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, to.i] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, to.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3;
        int iMax;
        C30207q c30207q;
        switch (this.f41245w) {
            case 0:
                C40137a c40137a = (C40137a) this.f41247y;
                InterfaceFutureC12319v interfaceFutureC12319v = (InterfaceFutureC12319v) this.f41246x;
                if (interfaceFutureC12319v instanceof AbstractC13587a) {
                    AbstractC12311n abstractC12311n = (AbstractC12311n) ((AbstractC13587a) interfaceFutureC12319v);
                    if (abstractC12311n instanceof InterfaceC12304g) {
                        Object obj = abstractC12311n.f41235w;
                        if (obj instanceof C12299b) {
                            th3 = ((C12299b) obj).f41210a;
                        } else {
                            th3 = null;
                        }
                    } else {
                        th3 = null;
                    }
                    if (th3 != null) {
                        c40137a.m128690j(th3);
                        return;
                    }
                }
                try {
                    if (!interfaceFutureC12319v.isDone()) {
                        throw new IllegalStateException(AbstractC31780b.m98690k("Future was expected to be done: %s", interfaceFutureC12319v));
                    }
                    Integer num = (Integer) AbstractC3511b.m10395x(interfaceFutureC12319v);
                    C12320w c12320w = (C12320w) c40137a.f173193b;
                    C35752b c35752b = (C35752b) c40137a.f173195d;
                    C30352d c30352d = c35752b.f152038a;
                    C0532b c0532b = c35752b.f152039b;
                    int iIntValue = num.intValue();
                    int i13 = c40137a.f173192a;
                    if (iIntValue >= i13) {
                        C40138b c40138b = new C40138b(c35752b, c30352d, (InterfaceC40139c) c40137a.f173194c, c12320w);
                        Handler handler = c0532b.f1843x;
                        handler.sendMessage(handler.obtainMessage(3, c40138b));
                        return;
                    } else {
                        C0531a c0531a = new C0531a(c30352d);
                        Handler handler2 = c0532b.f1843x;
                        handler2.sendMessage(handler2.obtainMessage(3, c0531a));
                        c12320w.m34248k(new ApiVersionException(num.intValue(), i13));
                        return;
                    }
                } catch (ExecutionException e5) {
                    c40137a.m128690j(e5.getCause());
                    return;
                } catch (Throwable th4) {
                    c40137a.m128690j(th4);
                    return;
                }
            case 1:
                RunnableC1310j2 runnableC1310j2 = (RunnableC1310j2) this.f41247y;
                C1686h c1686h = (C1686h) runnableC1310j2.f5656F;
                if (c1686h.f6668g == runnableC1310j2.f5658x) {
                    List list = runnableC1310j2.f5660z;
                    C1734t c1734t = (C1734t) this.f41246x;
                    Runnable runnable = (Runnable) runnableC1310j2.f5655E;
                    c1686h.f6666e = list;
                    c1686h.f6667f = Collections.unmodifiableList(list);
                    c1734t.m5327a(c1686h.f6662a);
                    c1686h.m5248a(runnable);
                    return;
                }
                return;
            case 2:
                ((C3033m) this.f41247y).m8758C((C2999d1) this.f41246x);
                return;
            case 3:
                C34249c c34249c = (C34249c) this.f41246x;
                Typeface typeface = (Typeface) this.f41247y;
                AbstractC34514b abstractC34514b = (AbstractC34514b) c34249c.f143660x;
                if (abstractC34514b != null) {
                    abstractC34514b.mo50021k(typeface);
                    return;
                }
                return;
            case 4:
                ((C4214f) this.f41246x).accept(this.f41247y);
                return;
            case 5:
                ((AsyncTaskC5304a2) this.f41246x).execute(((AsyncTaskC5304a2) this.f41247y).f21634b);
                return;
            case 6:
                C11046o c11046o = (C11046o) this.f41247y;
                synchronized (c11046o.f34659y) {
                    try {
                        InterfaceC11036e interfaceC11036e = (InterfaceC11036e) c11046o.f34660z;
                        if (interfaceC11036e != null) {
                            Exception exception = ((Task) this.f41246x).getException();
                            AbstractC35135w.m111094f(exception);
                            interfaceC11036e.mo1681n(exception);
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                return;
            case 7:
                C3033m c3033m = (C3033m) this.f41247y;
                InterfaceFutureC12319v interfaceFutureC12319v2 = (InterfaceFutureC12319v) this.f41246x;
                if (interfaceFutureC12319v2.isCancelled()) {
                    c3033m.cancel(null);
                    return;
                }
                try {
                    c3033m.resumeWith(AbstractC11649h.m31060g(interfaceFutureC12319v2));
                    return;
                } catch (ExecutionException e13) {
                    Throwable cause = e13.getCause();
                    if (cause != null) {
                        c3033m.resumeWith(AbstractC34132o.m107888l(cause));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        AbstractC22676k.m65754n(kotlinNullPointerException, AbstractC22676k.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
            case 8:
                C3033m c3033m2 = (C3033m) this.f41247y;
                C12320w c12320w2 = (C12320w) this.f41246x;
                if (c12320w2.f41235w instanceof C12298a) {
                    c3033m2.cancel(null);
                    return;
                }
                try {
                    c3033m2.resumeWith(AbstractC3511b.m10395x(c12320w2));
                    return;
                } catch (ExecutionException e14) {
                    Throwable cause2 = e14.getCause();
                    AbstractC22676k.m65747g(cause2);
                    c3033m2.resumeWith(AbstractC34132o.m107888l(cause2));
                    return;
                }
            case 9:
                RunnableC1310j2 runnableC1310j3 = (RunnableC1310j2) this.f41247y;
                C18305c c18305c = (C18305c) runnableC1310j3.f5656F;
                if (c18305c.f71270g == runnableC1310j3.f5658x) {
                    AbstractC18317n abstractC18317n = (AbstractC18317n) runnableC1310j3.f5655E;
                    AbstractC18317n abstractC18317n2 = (AbstractC18317n) runnableC1310j3.f5660z;
                    C1734t c1734t2 = (C1734t) this.f41246x;
                    int i14 = ((AbstractC18317n) runnableC1310j3.f5659y).f71304E;
                    AbstractC18317n abstractC18317n3 = c18305c.f71269f;
                    if (abstractC18317n3 != null) {
                        C18321r c18321r = abstractC18317n3.f71313z;
                        if (c18305c.f71268e == null) {
                            c18305c.f71268e = abstractC18317n;
                            c18305c.f71269f = null;
                            C1665c c1665c = c18305c.f71264a;
                            C18321r c18321r2 = abstractC18317n.f71313z;
                            int iM52737d = c18321r.m52737d();
                            int iM52737d2 = c18321r2.m52737d();
                            int iM52736c = c18321r.m52736c();
                            int iM52736c2 = c18321r2.m52736c();
                            if (iM52737d == 0 && iM52737d2 == 0 && iM52736c == 0 && iM52736c2 == 0) {
                                c1734t2.m5327a(c1665c);
                            } else {
                                if (iM52737d > iM52737d2) {
                                    int i15 = iM52737d - iM52737d2;
                                    c1665c.mo2215b(c18321r.size() - i15, i15);
                                } else if (iM52737d < iM52737d2) {
                                    c1665c.mo2214a(c18321r.size(), iM52737d2 - iM52737d);
                                }
                                if (iM52736c > iM52736c2) {
                                    c1665c.mo2215b(0, iM52736c - iM52736c2);
                                } else if (iM52736c < iM52736c2) {
                                    c1665c.mo2214a(0, iM52736c2 - iM52736c);
                                }
                                if (iM52736c2 != 0) {
                                    c1734t2.m5327a(new C0904j(iM52736c2, c1665c));
                                } else {
                                    c1734t2.m5327a(c1665c);
                                }
                            }
                            abstractC18317n.m52726c(abstractC18317n2, c18305c.f71271h);
                            if (!c18305c.f71268e.isEmpty()) {
                                C18321r c18321r3 = abstractC18317n2.f71313z;
                                int iM52736c3 = c18321r.m52736c();
                                int i16 = i14 - iM52736c3;
                                int size = (c18321r.size() - iM52736c3) - c18321r.m52737d();
                                if (i16 < 0 || i16 >= size) {
                                    iMax = Math.max(0, Math.min(i14, c18321r3.size() - 1));
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < 30) {
                                            int i18 = ((i17 / 2) * (i17 % 2 == 1 ? -1 : 1)) + i16;
                                            if (i18 >= 0 && i18 < c18321r.f71318E) {
                                                try {
                                                    int i19 = c1734t2.f6859e;
                                                    if (i18 < 0 || i18 >= i19) {
                                                        throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i18 + ", old list size = " + i19);
                                                    }
                                                    int i24 = c1734t2.f6856b[i18];
                                                    int i25 = (i24 & 15) == 0 ? -1 : i24 >> 4;
                                                    if (i25 != -1) {
                                                        iMax = i25 + c18321r3.f71322w;
                                                    }
                                                } catch (IndexOutOfBoundsException unused) {
                                                    iMax = Math.max(0, Math.min(i14, c18321r3.size() - 1));
                                                }
                                            }
                                            i17++;
                                        }
                                        iMax = Math.max(0, Math.min(i14, c18321r3.size() - 1));
                                    }
                                }
                                AbstractC18317n abstractC18317n4 = c18305c.f71268e;
                                abstractC18317n4.m52728n(Math.max(0, Math.min(abstractC18317n4.f71313z.size() - 1, iMax)));
                            }
                            c18305c.m52709a(abstractC18317n3, c18305c.f71268e);
                            return;
                        }
                    }
                    throw new IllegalStateException("must be in snapshot state to apply diff");
                }
                return;
            case 10:
                C18312i c18312i = (C18312i) this.f41247y;
                ((AbstractC18314k) c18312i.f71289d).mo52710a(c18312i.f71286a, (C18315l) this.f41246x);
                return;
            case 11:
                ((C20144g) this.f41247y).f75674y = SystemClock.uptimeMillis();
                ((Handler) this.f41246x).post(new RunnableC20277c7(this, 8));
                return;
            case 12:
                C21577g c21577g = ((C29063b) this.f41247y).f117594w.f82810f;
                String str = (String) this.f41246x;
                synchronized (c21577g.f82749k) {
                    try {
                        C21582i0 c21582i0M60621c = c21577g.m60621c(str);
                        c30207q = c21582i0M60621c != null ? c21582i0M60621c.f82758a : null;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (c30207q == null || AbstractC22676k.m65745e(C18354e.f71464j, c30207q.f123643j)) {
                    return;
                }
                synchronized (((C29063b) this.f41247y).f117596y) {
                    ((C29063b) this.f41247y).f117590F.put(AbstractC17269i.m48869P(c30207q), c30207q);
                    C29063b c29063b = (C29063b) this.f41247y;
                    ((C29063b) this.f41247y).f117591G.put(AbstractC17269i.m48869P(c30207q), AbstractC25412i.m74599a(c29063b.f117592H, c30207q, ((C32352b) c29063b.f117595x).f133916b, c29063b));
                    break;
                }
                return;
            case 13:
                AbstractC15751g.m44424D((C29223y) this.f41246x).resumeWith(AbstractC34132o.m107888l((Throwable) this.f41247y));
                return;
            case 14:
                AbstractC33721a abstractC33721a = (AbstractC33721a) this.f41247y;
                boolean z4 = abstractC33721a.f141042e;
                if (z4) {
                    return;
                }
                if (abstractC33721a.f141040c && !z4) {
                    synchronized (abstractC33721a.f141038a) {
                        abstractC33721a.f141045h.mo18123a(new ArrayList(abstractC33721a.f141047j));
                        abstractC33721a.f141047j.clear();
                        abstractC33721a.f141048k.clear();
                        break;
                    }
                }
                ((Handler) this.f41246x).postDelayed(this, ((AbstractC33721a) this.f41247y).f141044g.f141101E);
                return;
            case 15:
                C33981k c33981k = (C33981k) this.f41246x;
                C23548b c23548b = (C23548b) this.f41247y;
                C33979j c33979j = c33981k.f142452b;
                if (c33979j == null) {
                    return;
                }
                Object obj2 = c33979j.f142447a;
                switch (c23548b.f93279w) {
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        ((AbstractC34036g) obj2).onLocationResult((LocationResult) c23548b.f93280x);
                        return;
                    default:
                        ((AbstractC34036g) obj2).onLocationAvailability((LocationAvailability) c23548b.f93280x);
                        return;
                }
            case 16:
                BinderC33978i0 binderC33978i0 = (BinderC33978i0) this.f41247y;
                C1889f c1889f = (C1889f) this.f41246x;
                binderC33978i0.getClass();
                C4969a c4969a = c1889f.f7436x;
                if (c4969a.m15588b()) {
                    C35132t c35132t = c1889f.f7437y;
                    AbstractC35135w.m111094f(c35132t);
                    C4969a c4969a2 = c35132t.f149073y;
                    if (!c4969a2.m15588b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c4969a2)), new Exception());
                        binderC33978i0.f142446m.m13937K(c4969a2);
                        binderC33978i0.f142445l.mo80986e();
                        return;
                    }
                    C4455g c4455g = binderC33978i0.f142446m;
                    IBinder iBinder = c35132t.f149072x;
                    InterfaceC35119i interfaceC35119iM111054X = iBinder == null ? null : AbstractBinderC35103a.m111054X(iBinder);
                    Set set = binderC33978i0.f142443j;
                    c4455g.getClass();
                    if (interfaceC35119iM111054X == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c4455g.m13937K(new C4969a(4));
                    } else {
                        c4455g.f17964z = interfaceC35119iM111054X;
                        c4455g.f17959E = set;
                        if (c4455g.f17961w) {
                            ((AbstractC35107c) ((InterfaceC4973d) c4455g.f17962x)).m111060i(interfaceC35119iM111054X, set);
                        }
                    }
                } else {
                    binderC33978i0.f142446m.m13937K(c4969a);
                }
                binderC33978i0.f142445l.mo80986e();
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractDialogInterfaceOnCancelListenerC33996r0 abstractDialogInterfaceOnCancelListenerC33996r0 = (AbstractDialogInterfaceOnCancelListenerC33996r0) this.f41247y;
                if (abstractDialogInterfaceOnCancelListenerC33996r0.f142479x) {
                    C33992p0 c33992p0 = (C33992p0) this.f41246x;
                    C4969a c4969a3 = c33992p0.f142471b;
                    if (c4969a3.f20480x != 0 && c4969a3.f20481y != null) {
                        ?? r10 = abstractDialogInterfaceOnCancelListenerC33996r0.f142437w;
                        Activity activityM107438a = abstractDialogInterfaceOnCancelListenerC33996r0.m107438a();
                        PendingIntent pendingIntent = c4969a3.f20481y;
                        AbstractC35135w.m111094f(pendingIntent);
                        r10.startActivityForResult(GoogleApiActivity.m15590a(activityM107438a, pendingIntent, c33992p0.f142470a, false), 1);
                        return;
                    }
                    Activity activityM107438a2 = abstractDialogInterfaceOnCancelListenerC33996r0.m107438a();
                    int i26 = c4969a3.f20480x;
                    GoogleApiAvailability googleApiAvailability = abstractDialogInterfaceOnCancelListenerC33996r0.f142478E;
                    if (googleApiAvailability.getErrorResolutionIntent(activityM107438a2, i26, null) != null) {
                        googleApiAvailability.zab(abstractDialogInterfaceOnCancelListenerC33996r0.m107438a(), abstractDialogInterfaceOnCancelListenerC33996r0.f142437w, c4969a3.f20480x, 2, abstractDialogInterfaceOnCancelListenerC33996r0);
                        return;
                    } else {
                        if (c4969a3.f20480x == 18) {
                            googleApiAvailability.zaf(abstractDialogInterfaceOnCancelListenerC33996r0.m107438a().getApplicationContext(), new C33994q0(this, googleApiAvailability.zae(abstractDialogInterfaceOnCancelListenerC33996r0.m107438a(), abstractDialogInterfaceOnCancelListenerC33996r0)));
                            return;
                        }
                        int i27 = c33992p0.f142470a;
                        abstractDialogInterfaceOnCancelListenerC33996r0.f142480y.set(null);
                        abstractDialogInterfaceOnCancelListenerC33996r0.mo107417j(c4969a3, i27);
                        return;
                    }
                }
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                Context context = (Context) this.f41246x;
                C11040i c11040i = (C11040i) this.f41247y;
                try {
                    CronetProviderInstaller.zzc(context);
                    c11040i.m29687b(null);
                    return;
                } catch (Exception e15) {
                    c11040i.m29686a(e15);
                    return;
                }
            default:
                C3033m c3033m3 = (C3033m) this.f41246x;
                try {
                    c3033m3.resumeWith(((C11653l) this.f41247y).f37634x.get());
                    return;
                } catch (Throwable th7) {
                    Throwable cause3 = th7.getCause();
                    if (cause3 == null) {
                        cause3 = th7;
                    }
                    if (th7 instanceof CancellationException) {
                        c3033m3.cancel(cause3);
                        return;
                    } else {
                        c3033m3.resumeWith(AbstractC34132o.m107888l(cause3));
                        return;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f41245w) {
            case 0:
                C29938w0 c29938w0 = new C29938w0(RunnableC12316s.class.getSimpleName());
                C40137a c40137a = (C40137a) this.f41247y;
                C29205p c29205p = new C29205p(16, false);
                ((C29205p) c29938w0.f122262z).f118205y = c29205p;
                c29938w0.f122262z = c29205p;
                c29205p.f118204x = c40137a;
                return c29938w0.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC12316s(Object obj, Object obj2, boolean z4, int i13) {
        this.f41245w = i13;
        this.f41247y = obj;
        this.f41246x = obj2;
    }
}
