package a30;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.media.AudioManager;
import android.media.Ringtone;
import android.net.Uri;
import android.os.RemoteException;
import androidx.lifecycle.C1596j;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC3018i0;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import c93.InterfaceC4351m;
import cd3.C4455g;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.squareup.wire.AbstractC5583n;
import e10.C12566q0;
import e43.C12717i;
import e43.C12719k;
import e43.C12720l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import g32.C15314n;
import g40.C15393n0;
import g40.InterfaceC15398o0;
import g40.InterfaceC15403p0;
import g43.C15468e;
import gm.C15980h;
import gm.C15985m;
import h20.C16651f;
import h20.C16689l1;
import h20.C16776z4;
import hc3.C17171d;
import io.getstream.video.android.model.StreamCallId;
import io.sentry.C20351h5;
import io.sentry.C20512q5;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20541s5;
import io.sentry.EnumC20436n5;
import io.sentry.RunnableC20277c7;
import io.sentry.internal.debugmeta.C20378c;
import io.sentry.logger.InterfaceC20415a;
import io.sentry.transport.C20568r;
import io.sentry.util.C20579a;
import j43.C21323g;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jg3.C21676c;
import jg3.C21682i;
import jg3.C21689p;
import k20.C22136a;
import k53.C22213a;
import k83.InterfaceC22297a;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n43.C26288d;
import ng3.C26702o;
import np.C27004i;
import np.C27005j;
import p000.AbstractC11266d;
import p003a1.C0111j;
import p005a3.C0271z0;
import p012ab.C0682h0;
import p014aj.C0928c;
import p031b9.AbstractC2875y;
import p031b9.C2822c1;
import p031b9.C2830f0;
import p036bq.RunnableC3543b;
import p042c2.C3872q;
import p073cq.C11040i;
import p091dg.C12002a;
import p108e4.AbstractC12682p;
import p127ev.C13668i;
import p179h.C16351i;
import p249jc.AbstractC21598x;
import p299l9.C23488c0;
import p309lo.AbstractC24567y;
import p463rj.AbstractC31479j;
import p465rm.AbstractC31558o1;
import p465rm.C31552m1;
import p465rm.C31571u;
import p465rm.C31574v0;
import p465rm.InterfaceC31519b1;
import p479s4.AbstractC32128i;
import p485sf.C32433e;
import p499t9.C33623c0;
import p503tp.AbstractC34036g;
import p503tp.C34047r;
import p503tp.InterfaceC34050u;
import p505ts.AbstractC34132o;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.InterfaceC34599j0;
import p522uf.C34895v;
import p534uu.C35233b;
import p534uu.InterfaceC35232a;
import p537ux.InterfaceC35322b;
import p550vd.AbstractC35903f;
import p551vf.InterfaceC35936a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41009b1;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import q30.C29926q0;
import q83.AbstractC30060g;
import qg3.C30352d;
import r83.EnumC31071a;
import s10.C32064f;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import sn.C32763v;
import stream.video.sfu.models.Participant;
import t23.C33359a3;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33392g2;
import t23.C33425n0;
import t23.C33450s0;
import t23.C33477x2;
import t23.C33487z2;
import t23.InterfaceC33377d3;
import to.C33981k;
import to.InterfaceC33987n;
import v00.C35459c0;
import v00.C35473j0;
import v00.C35484p;
import v33.C35631p;
import v33.C35634s;
import v43.C35698a;
import v43.EnumC35699b;
import wb3.AbstractC37056f;
import x23.EnumC37870f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: a30.w0 */
/* JADX INFO: loaded from: classes6.dex */
public class C0332w0 implements InterfaceC15403p0, InterfaceC20415a, InterfaceC33987n, InterfaceC35232a {

    /* JADX INFO: renamed from: E */
    public Object f1164E;

    /* JADX INFO: renamed from: F */
    public Object f1165F;

    /* JADX INFO: renamed from: G */
    public Object f1166G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1167w;

    /* JADX INFO: renamed from: x */
    public Object f1168x;

    /* JADX INFO: renamed from: y */
    public Object f1169y;

    /* JADX INFO: renamed from: z */
    public Object f1170z;

    public /* synthetic */ C0332w0(int i13) {
        this.f1167w = i13;
    }

    /* JADX INFO: renamed from: K */
    public static void m830K(InterfaceC35936a interfaceC35936a, InterfaceC35936a interfaceC35936a2, C32433e c32433e) {
        if (AbstractC22676k.m65745e(interfaceC35936a2.getUrl(), interfaceC35936a.getUrl())) {
            return;
        }
        C12002a c12002a = c32433e.f134269c;
        EnumC3188c enumC3188c = EnumC3188c.ACCOUNT_ID_BASED_ENDPOINT;
        if (AbstractC3187b.m9169a(c12002a, enumC3188c) && !AbstractC39414r.m125876U(interfaceC35936a2.getUrl().f18375h, (CharSequence) AbstractC21598x.m60654J(c12002a.f39590y, AbstractC3187b.f12494b), false)) {
            AbstractC3187b.m9174f(c12002a, enumC3188c);
        }
        EnumC3188c enumC3188c2 = EnumC3188c.SERVICE_ENDPOINT_OVERRIDE;
        if (AbstractC3187b.m9169a(c12002a, enumC3188c2)) {
            AbstractC3187b.m9174f(c12002a, enumC3188c2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: c */
    public static final Object m831c(C0332w0 c0332w0, Context context, AbstractC32269c abstractC32269c) {
        C26288d c26288d;
        InterfaceC33377d3 interfaceC33377d3;
        Object obj;
        Context context2;
        C0332w0 c0332w1 = c0332w0;
        C33368c0 c33368c0 = (C33368c0) c0332w1.f1168x;
        if (abstractC32269c instanceof C26288d) {
            c26288d = (C26288d) abstractC32269c;
            int i13 = c26288d.f104504F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26288d.f104504F = i13 - Integer.MIN_VALUE;
            } else {
                c26288d = new C26288d(c0332w1, abstractC32269c);
            }
        } else {
            c26288d = new C26288d(c0332w1, abstractC32269c);
        }
        Object obj2 = c26288d.f104508z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26288d.f104504F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            interfaceC33377d3 = (InterfaceC33377d3) c33368c0.f139302p.f139618G.getValue();
            C33366b4 c33366b4 = (C33366b4) c0332w1.f1169y;
            c26288d.f104505w = c0332w1;
            c26288d.f104506x = context;
            c26288d.f104507y = interfaceC33377d3;
            c26288d.f104504F = 1;
            Object objMo43672e = c33366b4.mo43672e(c33368c0, c26288d);
            if (objMo43672e == enumC31071a) {
                return enumC31071a;
            }
            obj = objMo43672e;
            context2 = context;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC33377d3 interfaceC33377d4 = c26288d.f104507y;
            context2 = c26288d.f104506x;
            C0332w0 c0332w2 = c26288d.f104505w;
            AbstractC34132o.m107864I(obj2);
            interfaceC33377d3 = interfaceC33377d4;
            c0332w1 = c0332w2;
            obj = obj2;
        }
        Notification notification = (Notification) obj;
        C2345k c2345kM862r = c0332w1.m862r();
        C3872q c3872q = (C3872q) c0332w1.f1165F;
        InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
        String str = c2345kM862r.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM862r.f9274b.log(enumC2341g, str, "[updateNotification] ringingState: " + interfaceC33377d3 + ", notification: " + (notification != null), null);
        }
        if (notification != null) {
            C20378c c20378c = (C20378c) c0332w1.f1164E;
            C33368c0 c33368c1 = (C33368c0) c0332w1.f1168x;
            String str2 = c33368c1.f139288b;
            C33450s0 c33450s0 = c33368c1.f139302p;
            StreamCallId streamCallId = new StreamCallId(str2, c33368c1.f139289c, (String) null, false, 12, (DefaultConstructorMarker) null);
            if (interfaceC33377d3 instanceof C33477x2) {
                C2345k c2345kM862r2 = c0332w1.m862r();
                InterfaceC2339e interfaceC2339e2 = c2345kM862r2.f9275c;
                String str3 = c2345kM862r2.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
                    c2345kM862r2.f9274b.log(enumC2341g, str3, "[showActiveCallNotification] Showing active call notification", null);
                }
                Integer num = (Integer) c33450s0.f139687y0.getValue();
                ((C33366b4) c0332w1.f1169y).mo35558c().m30733C(num != null ? num.intValue() : streamCallId.getNotificationId(C12719k.f43514b), notification, streamCallId);
            } else if (interfaceC33377d3 instanceof C33359a3) {
                C2345k c2345kM862r3 = c0332w1.m862r();
                InterfaceC2339e interfaceC2339e3 = c2345kM862r3.f9275c;
                String str4 = c2345kM862r3.f9273a;
                if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
                    c2345kM862r3.f9274b.log(enumC2341g, str4, "[showOutgoingCallNotification] Showing outgoing call notification", null);
                }
                Integer num2 = (Integer) c33450s0.f139687y0.getValue();
                c3872q.invoke(Integer.valueOf(num2 != null ? num2.intValue() : streamCallId.getNotificationId(C12720l.f43515b)), notification, "outgoing_call", Integer.valueOf(c20378c.m56592u(context2, "outgoing_call")));
            } else if (interfaceC33377d3 instanceof C33487z2) {
                C2345k c2345kM862r4 = c0332w1.m862r();
                InterfaceC2339e interfaceC2339e4 = c2345kM862r4.f9275c;
                String str5 = c2345kM862r4.f9273a;
                if (interfaceC2339e4.isLoggable(enumC2341g, str5)) {
                    c2345kM862r4.f9274b.log(enumC2341g, str5, "[showIncomingCallNotification] Showing incoming call notification", null);
                }
                Integer num3 = (Integer) c33450s0.f139687y0.getValue();
                c3872q.invoke(Integer.valueOf(num3 != null ? num3.intValue() : streamCallId.getNotificationId(C12717i.f43512b)), notification, "incoming_call", Integer.valueOf(c20378c.m56592u(context2, "incoming_call")));
            } else {
                C2345k c2345kM862r5 = c0332w1.m862r();
                InterfaceC2339e interfaceC2339e5 = c2345kM862r5.f9275c;
                String str6 = c2345kM862r5.f9273a;
                if (interfaceC2339e5.isLoggable(enumC2341g, str6)) {
                    c2345kM862r5.f9274b.log(enumC2341g, str6, "[updateNotification] Unhandled ringing state: " + interfaceC33377d3, null);
                }
            }
        } else {
            C2345k c2345kM862r6 = c0332w1.m862r();
            InterfaceC2339e interfaceC2339e6 = c2345kM862r6.f9275c;
            String str7 = c2345kM862r6.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e6.isLoggable(enumC2341g2, str7)) {
                c2345kM862r6.f9274b.log(enumC2341g2, str7, "[updateNotification] No notification generated", null);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m832h(LinkedHashMap linkedHashMap, Participant participant, boolean z4, Map map, C33623c0 c33623c0) {
        if (!z4) {
            return false;
        }
        String session_id = participant.getSession_id();
        if (!map.containsKey(session_id) || linkedHashMap.containsKey(session_id)) {
            return false;
        }
        C35634s c35634s = new C35634s(participant.getUser_id(), session_id);
        C21689p c21689p = C21689p.f83278F;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21676c c21676c = C21676c.f83234H;
        C21676c c21676cM60990o0 = C21676c.m60990o0(AbstractC5583n.m16743B(1000, jCurrentTimeMillis) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jCurrentTimeMillis, 1000L));
        C21682i c21682iM61053q0 = C21682i.m61053q0(c21676cM60990o0, c21689p.mo61071k().mo84265a(c21676cM60990o0));
        EnumC35699b enumC35699b = EnumC35699b.f151897w;
        linkedHashMap.put(session_id, new C35698a(c35634s, c21682iM61053q0));
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m833n(String str, InterfaceC21461d interfaceC21461d, Object obj) {
        if (interfaceC21461d.isInstance(obj)) {
            return;
        }
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " invalid type conversion: found ");
        sbM35484d.append(AbstractC22671h0.f89337a.getOrCreateKotlinClass(obj.getClass()));
        sbM35484d.append("; expected ");
        sbM35484d.append(interfaceC21461d);
        throw new IllegalStateException(sbM35484d.toString().toString());
    }

    /* JADX INFO: renamed from: o */
    public static C23488c0 m834o(InterfaceC34599j0 interfaceC34599j0, AbstractC41023g0 abstractC41023g0, C23488c0 c23488c0, C34605m0 c34605m0) {
        int iMo8132b;
        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
        AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
        c2830f0.m8091L0();
        if (c2830f0.f11111I0.f11045a.m109408p()) {
            iMo8132b = 0;
        } else {
            C2822c1 c2822c1 = c2830f0.f11111I0;
            iMo8132b = c2822c1.f11045a.mo8132b(c2822c1.f11046b.f92976a);
        }
        Object objMo8138l = abstractC34609o0M8104c0.m109408p() ? null : abstractC34609o0M8104c0.mo8138l(iMo8132b);
        int iM109393b = (c2830f0.m8112l0() || abstractC34609o0M8104c0.m109408p()) ? -1 : abstractC34609o0M8104c0.mo8128f(iMo8132b, c34605m0, false).m109393b(AbstractC38065t.m121896J(c2830f0.m8102a0()) - c34605m0.f145695e);
        for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
            C23488c0 c23488c1 = (C23488c0) abstractC41023g0.get(i13);
            if (m836s(c23488c1, objMo8138l, c2830f0.m8112l0(), c2830f0.m8099X(), c2830f0.m8100Y(), iM109393b)) {
                return c23488c1;
            }
        }
        if (abstractC41023g0.isEmpty() && c23488c0 != null && m836s(c23488c0, objMo8138l, c2830f0.m8112l0(), c2830f0.m8099X(), c2830f0.m8100Y(), iM109393b)) {
            return c23488c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static C32763v m835p(InterfaceC31519b1 interfaceC31519b1, AbstractC41023g0 abstractC41023g0, C32763v c32763v, C31552m1 c31552m1) {
        int iMo97128b;
        C31571u c31571u = (C31571u) interfaceC31519b1;
        AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
        c31571u.m97198B0();
        if (c31571u.f130392K0.f130441a.m97175p()) {
            iMo97128b = 0;
        } else {
            C31574v0 c31574v0 = c31571u.f130392K0;
            iMo97128b = c31574v0.f130441a.mo97128b(c31574v0.f130442b.f136238a);
        }
        Object objMo97135l = abstractC31558o1M97209b0.m97175p() ? null : abstractC31558o1M97209b0.mo97135l(iMo97128b);
        int iM97151b = (c31571u.m97214i0() || abstractC31558o1M97209b0.m97175p()) ? -1 : abstractC31558o1M97209b0.mo97131f(iMo97128b, c31552m1, false).m97151b(AbstractC24567y.m71695z(c31571u.m97207Z()) - c31552m1.f130281E);
        for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
            C32763v c32763v2 = (C32763v) abstractC41023g0.get(i13);
            if (m837t(c32763v2, objMo97135l, c31571u.m97214i0(), c31571u.m97204W(), c31571u.m97205X(), iM97151b)) {
                return c32763v2;
            }
        }
        if (abstractC41023g0.isEmpty() && c32763v != null && m837t(c32763v, objMo97135l, c31571u.m97214i0(), c31571u.m97204W(), c31571u.m97205X(), iM97151b)) {
            return c32763v;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m836s(C23488c0 c23488c0, Object obj, boolean z4, int i13, int i14, int i15) {
        Object obj2 = c23488c0.f92976a;
        int i16 = c23488c0.f92977b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z4 && i16 == i13 && c23488c0.f92978c == i14) {
            return true;
        }
        return !z4 && i16 == -1 && c23488c0.f92980e == i15;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m837t(C32763v c32763v, Object obj, boolean z4, int i13, int i14, int i15) {
        Object obj2 = c32763v.f136238a;
        int i16 = c32763v.f136239b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z4 && i16 == i13 && c32763v.f136240c == i14) {
            return true;
        }
        return !z4 && i16 == -1 && c32763v.f136242e == i15;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:20:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: A */
    public java.lang.Object m838A(java.lang.Object r9, s83.AbstractC32269c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p485sf.C32439k
            if (r0 == 0) goto L13
            r0 = r10
            sf.k r0 = (p485sf.C32439k) r0
            int r1 = r0.f134313G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134313G = r1
            goto L18
        L13:
            sf.k r0 = new sf.k
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f134311E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134313G
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r9 = r0.f134317z
            sf.c r2 = r0.f134316y
            java.util.Iterator r4 = r0.f134315x
            sf.c r5 = r0.f134314w
            p505ts.AbstractC34132o.m107864I(r10)
            goto L75
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            p505ts.AbstractC34132o.m107864I(r10)
            sf.c r10 = new sf.c
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Any"
            p715kotlin.jvm.internal.AbstractC22676k.m65748h(r9, r2)
            java.lang.Object r2 = r8.f1168x
            dg.a r2 = (p091dg.C12002a) r2
            r10.<init>(r2, r9)
            java.lang.Object r9 = r8.f1169y
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
            r5 = r10
            r9 = r2
            r2 = r5
        L57:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L83
            java.lang.Object r10 = r4.next()
            cf.a r10 = (cf.InterfaceC4526a) r10
            r0.f134314w = r5
            r0.f134315x = r4
            r0.f134316y = r2
            r0.f134317z = r9
            r0.f134313G = r3
            r10.getClass()
            java.lang.Object r10 = r2.f134261a
            if (r10 != r1) goto L75
            return r1
        L75:
            java.lang.Object r6 = r8.f1170z
            uf.v r6 = (p522uf.C34895v) r6
            j93.d r6 = r6.f146960a
            java.lang.String r7 = "modifyBeforeSerialization"
            m833n(r7, r6, r10)
            r5.f134261a = r10
            goto L57
        L83:
            java.lang.Object r9 = r2.f134261a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m838A(java.lang.Object, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x009a, B:22:0x006b, B:24:0x0071, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:28:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: B */
    public java.lang.Object m839B(p551vf.C35942g r14, s83.AbstractC32269c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p485sf.C32440l
            if (r0 == 0) goto L13
            r0 = r15
            sf.l r0 = (p485sf.C32440l) r0
            int r1 = r0.f134325L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134325L = r1
            goto L18
        L13:
            sf.l r0 = new sf.l
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f134323J
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134325L
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            int r14 = r0.f134322I
            int r2 = r0.f134321H
            int r4 = r0.f134320G
            sf.e r5 = r0.f134319F
            sf.e r6 = r0.f134318E
            sf.e r7 = r0.f134329z
            java.util.Iterator r8 = r0.f134328y
            sf.e r9 = r0.f134327x
            vf.a r10 = r0.f134326w
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Throwable -> L40
            r12 = r5
            r5 = r14
            r14 = r10
            r10 = r8
            r8 = r7
            r7 = r6
            r6 = r12
            goto L9a
        L40:
            r14 = move-exception
            goto Lb2
        L43:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L4b:
            p505ts.AbstractC34132o.m107864I(r15)
            java.lang.Object r15 = r13.f1164E
            if (r15 == 0) goto Lbe
            sf.e r2 = new sf.e
            java.lang.Object r4 = r13.f1168x
            dg.a r4 = (p091dg.C12002a) r4
            r2.<init>(r15, r14, r4)
            java.lang.Object r15 = r13.f1169y     // Catch: java.lang.Throwable -> L40
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> L40
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r8 = r15
            r5 = r2
            r7 = r5
            r15 = r4
            r2 = r15
        L6b:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Throwable -> L40
            cf.a r6 = (cf.InterfaceC4526a) r6     // Catch: java.lang.Throwable -> L40
            r0.f134326w = r14     // Catch: java.lang.Throwable -> L40
            r0.f134327x = r5     // Catch: java.lang.Throwable -> L40
            r0.f134328y = r8     // Catch: java.lang.Throwable -> L40
            r0.f134329z = r7     // Catch: java.lang.Throwable -> L40
            r0.f134318E = r5     // Catch: java.lang.Throwable -> L40
            r0.f134319F = r5     // Catch: java.lang.Throwable -> L40
            r0.f134320G = r15     // Catch: java.lang.Throwable -> L40
            r0.f134321H = r2     // Catch: java.lang.Throwable -> L40
            r0.f134322I = r4     // Catch: java.lang.Throwable -> L40
            r0.f134325L = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r6.mo14167a(r5, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != r1) goto L92
            return r1
        L92:
            r9 = r5
            r10 = r8
            r5 = r4
            r8 = r7
            r4 = r15
            r7 = r9
            r15 = r6
            r6 = r7
        L9a:
            r11 = r15
            vf.a r11 = (p551vf.InterfaceC35936a) r11     // Catch: java.lang.Throwable -> L40
            m830K(r14, r11, r7)     // Catch: java.lang.Throwable -> L40
            vf.a r15 = (p551vf.InterfaceC35936a) r15     // Catch: java.lang.Throwable -> L40
            r6.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "<set-?>"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r15, r7)     // Catch: java.lang.Throwable -> L40
            r6.f134268b = r15     // Catch: java.lang.Throwable -> L40
            r15 = r4
            r4 = r5
            r7 = r8
            r5 = r9
            r8 = r10
            goto L6b
        Lb2:
            l83.m r7 = p505ts.AbstractC34132o.m107888l(r14)
        Lb6:
            p505ts.AbstractC34132o.m107864I(r7)
            sf.e r7 = (p485sf.C32433e) r7
            vf.a r14 = r7.f134268b
            return r14
        Lbe:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m839B(vf.g, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x009a, B:22:0x006b, B:24:0x0071, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:28:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: C */
    public java.lang.Object m840C(p551vf.C35942g r14, s83.AbstractC32269c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p485sf.C32441m
            if (r0 == 0) goto L13
            r0 = r15
            sf.m r0 = (p485sf.C32441m) r0
            int r1 = r0.f134337L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134337L = r1
            goto L18
        L13:
            sf.m r0 = new sf.m
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f134335J
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134337L
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            int r14 = r0.f134334I
            int r2 = r0.f134333H
            int r4 = r0.f134332G
            sf.e r5 = r0.f134331F
            sf.e r6 = r0.f134330E
            sf.e r7 = r0.f134341z
            java.util.Iterator r8 = r0.f134340y
            sf.e r9 = r0.f134339x
            vf.a r10 = r0.f134338w
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Throwable -> L40
            r12 = r5
            r5 = r14
            r14 = r10
            r10 = r8
            r8 = r7
            r7 = r6
            r6 = r12
            goto L9a
        L40:
            r14 = move-exception
            goto Lb2
        L43:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L4b:
            p505ts.AbstractC34132o.m107864I(r15)
            java.lang.Object r15 = r13.f1164E
            if (r15 == 0) goto Lbe
            sf.e r2 = new sf.e
            java.lang.Object r4 = r13.f1168x
            dg.a r4 = (p091dg.C12002a) r4
            r2.<init>(r15, r14, r4)
            java.lang.Object r15 = r13.f1169y     // Catch: java.lang.Throwable -> L40
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> L40
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r8 = r15
            r5 = r2
            r7 = r5
            r15 = r4
            r2 = r15
        L6b:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Throwable -> L40
            cf.a r6 = (cf.InterfaceC4526a) r6     // Catch: java.lang.Throwable -> L40
            r0.f134338w = r14     // Catch: java.lang.Throwable -> L40
            r0.f134339x = r5     // Catch: java.lang.Throwable -> L40
            r0.f134340y = r8     // Catch: java.lang.Throwable -> L40
            r0.f134341z = r7     // Catch: java.lang.Throwable -> L40
            r0.f134330E = r5     // Catch: java.lang.Throwable -> L40
            r0.f134331F = r5     // Catch: java.lang.Throwable -> L40
            r0.f134332G = r15     // Catch: java.lang.Throwable -> L40
            r0.f134333H = r2     // Catch: java.lang.Throwable -> L40
            r0.f134334I = r4     // Catch: java.lang.Throwable -> L40
            r0.f134337L = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r6.mo14169c(r5, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != r1) goto L92
            return r1
        L92:
            r9 = r5
            r10 = r8
            r5 = r4
            r8 = r7
            r4 = r15
            r7 = r9
            r15 = r6
            r6 = r7
        L9a:
            r11 = r15
            vf.a r11 = (p551vf.InterfaceC35936a) r11     // Catch: java.lang.Throwable -> L40
            m830K(r14, r11, r7)     // Catch: java.lang.Throwable -> L40
            vf.a r15 = (p551vf.InterfaceC35936a) r15     // Catch: java.lang.Throwable -> L40
            r6.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "<set-?>"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r15, r7)     // Catch: java.lang.Throwable -> L40
            r6.f134268b = r15     // Catch: java.lang.Throwable -> L40
            r15 = r4
            r4 = r5
            r7 = r8
            r5 = r9
            r8 = r10
            goto L6b
        Lb2:
            l83.m r7 = p505ts.AbstractC34132o.m107888l(r14)
        Lb6:
            p505ts.AbstractC34132o.m107864I(r7)
            sf.e r7 = (p485sf.C32433e) r7
            vf.a r14 = r7.f134268b
            return r14
        Lbe:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m840C(vf.g, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: D */
    public void m841D(C35631p event) {
        AbstractC22676k.m65750j(event, "event");
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) ((C13045h2) this.f1166G).getValue());
        if (m832h(linkedHashMapM74003l0, event.f151430a, event.f151432c, ((C33425n0) this.f1169y).f139554x.f139654i, (C33623c0) this.f1168x)) {
            C13045h2 c13045h2 = (C13045h2) this.f1165F;
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashMapM74003l0);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m842E(Uri uri) {
        try {
            synchronized (this) {
                m843F(new C0271z0(16, this, uri));
            }
        } catch (Exception e5) {
            C2345k c2345kM862r = m862r();
            InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, c2345kM862r.f9273a)) {
                c2345kM862r.f9274b.log(enumC2341g, c2345kM862r.f9273a, AbstractC11266d.m30461o("[playCallSound] Error playing call sound: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m843F(C0271z0 c0271z0) {
        C23454a0 c23454a0;
        if (((AudioManager) this.f1164E) == null) {
            Object systemService = ((Context) this.f1168x).getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                this.f1164E = audioManager;
                c23454a0 = C23454a0.f92919a;
            } else {
                c23454a0 = null;
            }
            if (c23454a0 == null) {
                C2345k c2345kM862r = m862r();
                InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
                String str = c2345kM862r.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM862r.f9274b.log(enumC2341g, str, "[requestAudioFocus] Error getting AudioManager system service", null);
                    return;
                }
                return;
            }
        }
        c0271z0.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX INFO: renamed from: G */
    public void m844G(List pins) {
        C23465k c23465k;
        Object next;
        Object next2;
        AbstractC22676k.m65750j(pins, "pins");
        C13045h2 c13045h2 = (C13045h2) this.f1165F;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List list = pins;
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            Long lValueOf = null;
            if (!it.hasNext()) {
                ConcurrentHashMap concurrentHashMap = ((C33425n0) this.f1169y).f139554x.f139654i;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    String sessionId = (String) entry.getKey();
                    C33392g2 c33392g2 = (C33392g2) entry.getValue();
                    String userId = (String) c33392g2.f139446y.getValue();
                    AbstractC22676k.m65750j(sessionId, "sessionId");
                    AbstractC22676k.m65750j(userId, "userId");
                    Long l7 = (Long) linkedHashMap.get(sessionId);
                    if (l7 == null) {
                        l7 = (Long) linkedHashMap2.get(userId);
                    }
                    if (l7 != null) {
                        long jLongValue = l7.longValue();
                        Iterator it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!AbstractC22676k.m65745e(((C35634s) next).f151437b, sessionId));
                        C35634s c35634s = (C35634s) next;
                        if (c35634s == null) {
                            Iterator it4 = list.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                            } while (!AbstractC22676k.m65745e(((C35634s) next2).f151436a, c33392g2.f139446y.getValue()));
                            c35634s = (C35634s) next2;
                            if (c35634s == null) {
                                c23465k = null;
                            }
                        }
                        C35698a c35698a = (C35698a) ((Map) ((C13045h2) this.f1166G).getValue()).get(sessionId);
                        C21682i c21682iM61053q0 = c35698a != null ? c35698a.f151896b : null;
                        if (c21682iM61053q0 == null) {
                            C21676c c21676c = C21676c.f83234H;
                            c21682iM61053q0 = C21682i.m61053q0(C21676c.m60990o0(AbstractC5583n.m16743B(1000, jLongValue) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jLongValue, 1000L)), C21689p.f83278F);
                        }
                        EnumC35699b enumC35699b = EnumC35699b.f151897w;
                        c23465k = new C23465k(sessionId, new C35698a(c35634s, c21682iM61053q0));
                    } else {
                        c23465k = null;
                    }
                    if (c23465k != null) {
                        arrayList.add(c23465k);
                    }
                }
                Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
                c13045h2.getClass();
                c13045h2.m36571k(null, mapM74000i0);
                return;
            }
            Object next3 = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C35634s c35634s2 = (C35634s) next3;
            long size = ((long) (pins.size() - i13)) + jCurrentTimeMillis;
            String str = c35634s2.f151436a;
            if (!linkedHashMap2.containsKey(str)) {
                lValueOf = Long.valueOf(size);
            }
            linkedHashMap2.put(str, lValueOf);
            linkedHashMap.putIfAbsent(c35634s2.f151437b, Long.valueOf(size));
            i13 = i14;
        }
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: H */
    public boolean mo845H() {
        return false;
    }

    /* JADX INFO: renamed from: I */
    public void m846I() {
        Ringtone ringtone;
        synchronized (this) {
            m847J();
            try {
                try {
                    C2345k c2345kM862r = m862r();
                    InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345kM862r.f9273a)) {
                        c2345kM862r.f9274b.log(enumC2341g, c2345kM862r.f9273a, "[stopCallSound] Stopping RingtoneManager sound", null);
                    }
                    Ringtone ringtone2 = (Ringtone) this.f1165F;
                    if (ringtone2 != null && ringtone2.isPlaying() && (ringtone = (Ringtone) this.f1165F) != null) {
                        ringtone.stop();
                    }
                } catch (Exception e5) {
                    C2345k c2345kM862r2 = m862r();
                    InterfaceC2339e interfaceC2339e2 = c2345kM862r2.f9275c;
                    EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM862r2.f9273a)) {
                        c2345kM862r2.f9274b.log(enumC2341g2, c2345kM862r2.f9273a, "[stopCallSound] Error stopping call sound: " + e5.getMessage(), e5);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m847J() {
        try {
            if (((AtomicBoolean) this.f1166G).get()) {
                C2345k c2345kM862r = m862r();
                InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM862r.f9273a)) {
                    c2345kM862r.f9274b.log(enumC2341g, c2345kM862r.f9273a, "[stopVibration] Stopping vibration", null);
                }
                ((AtomicBoolean) this.f1166G).set(false);
                return;
            }
            C2345k c2345kM862r2 = m862r();
            InterfaceC2339e interfaceC2339e2 = c2345kM862r2.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM862r2.f9273a)) {
                c2345kM862r2.f9274b.log(enumC2341g2, c2345kM862r2.f9273a, "[stopVibration] Vibration not started", null);
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g3, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m848L(AbstractC31558o1 abstractC31558o1) {
        C0682h0 c0682h0 = new C0682h0(4);
        if (((AbstractC41023g0) this.f1169y).isEmpty()) {
            m859l(c0682h0, (C32763v) this.f1165F, abstractC31558o1);
            if (!AbstractC31479j.m96940s((C32763v) this.f1166G, (C32763v) this.f1165F)) {
                m859l(c0682h0, (C32763v) this.f1166G, abstractC31558o1);
            }
            if (!AbstractC31479j.m96940s((C32763v) this.f1164E, (C32763v) this.f1165F) && !AbstractC31479j.m96940s((C32763v) this.f1164E, (C32763v) this.f1166G)) {
                m859l(c0682h0, (C32763v) this.f1164E, abstractC31558o1);
            }
        } else {
            for (int i13 = 0; i13 < ((AbstractC41023g0) this.f1169y).size(); i13++) {
                m859l(c0682h0, (C32763v) ((AbstractC41023g0) this.f1169y).get(i13), abstractC31558o1);
            }
            if (!((AbstractC41023g0) this.f1169y).contains((C32763v) this.f1164E)) {
                m859l(c0682h0, (C32763v) this.f1164E, abstractC31558o1);
            }
        }
        this.f1170z = c0682h0.m1694i();
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: M */
    public ArrayList mo849M() {
        return (ArrayList) this.f1166G;
    }

    /* JADX INFO: renamed from: N */
    public void m850N(AbstractC34609o0 abstractC34609o0) {
        C0682h0 c0682h0 = new C0682h0(4);
        if (((AbstractC41023g0) this.f1169y).isEmpty()) {
            m858j(c0682h0, (C23488c0) this.f1165F, abstractC34609o0);
            if (!Objects.equals((C23488c0) this.f1166G, (C23488c0) this.f1165F)) {
                m858j(c0682h0, (C23488c0) this.f1166G, abstractC34609o0);
            }
            if (!Objects.equals((C23488c0) this.f1164E, (C23488c0) this.f1165F) && !Objects.equals((C23488c0) this.f1164E, (C23488c0) this.f1166G)) {
                m858j(c0682h0, (C23488c0) this.f1164E, abstractC34609o0);
            }
        } else {
            for (int i13 = 0; i13 < ((AbstractC41023g0) this.f1169y).size(); i13++) {
                m858j(c0682h0, (C23488c0) ((AbstractC41023g0) this.f1169y).get(i13), abstractC34609o0);
            }
            if (!((AbstractC41023g0) this.f1169y).contains((C23488c0) this.f1164E)) {
                m858j(c0682h0, (C23488c0) this.f1164E, abstractC34609o0);
            }
        }
        this.f1170z = c0682h0.m1694i();
    }

    /* JADX INFO: renamed from: O */
    public void m851O(String sfuId) {
        AbstractC22676k.m65750j(sfuId, "sfuId");
        C13045h2 c13045h2 = (C13045h2) this.f1168x;
        c13045h2.getClass();
        c13045h2.m36571k(null, sfuId);
    }

    @Override // io.sentry.logger.InterfaceC20415a
    /* JADX INFO: renamed from: a */
    public void mo852a(boolean z4) {
        C20351h5 c20351h5 = (C20351h5) this.f1164E;
        if (z4) {
            m863u(true);
            c20351h5.submit(new RunnableC20277c7(this, 13));
        } else {
            c20351h5.mo56216a(((C20513q6) this.f1168x).getShutdownTimeoutMillis());
            while (!((ConcurrentLinkedQueue) this.f1170z).isEmpty()) {
                m861q();
            }
        }
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) throws RemoteException {
        ((FusedLocationProviderClient) this.f1168x).zzb((C34047r) this.f1169y, (AbstractC34036g) this.f1170z, (InterfaceC34050u) this.f1164E, (C27005j) this.f1165F, (C33981k) this.f1166G, (C27004i) obj, (C11040i) obj2);
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: b */
    public String mo853b(String rawValue) {
        ArrayList arrayList = (ArrayList) this.f1169y;
        AbstractC22676k.m65750j(rawValue, "rawValue");
        ArrayList arrayList2 = (ArrayList) this.f1168x;
        return arrayList2.contains(rawValue) ? (String) arrayList.get(arrayList2.indexOf(rawValue)) : (String) arrayList.get(0);
    }

    @Override // io.sentry.logger.InterfaceC20415a
    /* JADX INFO: renamed from: d */
    public void mo854d(long j7) {
        m863u(true);
        try {
            C0928c c0928c = (C0928c) this.f1166G;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0928c.getClass();
            ((C20568r) c0928c.f3421x).tryAcquireSharedNanos(1, timeUnit.toNanos(j7));
        } catch (InterruptedException e5) {
            ((C20513q6) this.f1168x).getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to flush log events", e5);
            Thread.currentThread().interrupt();
        }
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: e */
    public String mo855e(int i13) {
        return (String) ((ArrayList) this.f1169y).get(i13);
    }

    /* JADX INFO: renamed from: f */
    public void m856f(String str, String str2) {
        HashMap map = (HashMap) this.f1166G;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: g */
    public InterfaceC15398o0 mo857g() {
        return (C15393n0) this.f1170z;
    }

    @Override // g40.InterfaceC15403p0
    public InterfaceC41211c getLabel() {
        return (C41210b) this.f1164E;
    }

    /* JADX INFO: renamed from: j */
    public void m858j(C0682h0 c0682h0, C23488c0 c23488c0, AbstractC34609o0 abstractC34609o0) {
        if (c23488c0 == null) {
            return;
        }
        if (abstractC34609o0.mo8132b(c23488c0.f92976a) != -1) {
            c0682h0.m1704t(c23488c0, abstractC34609o0);
            return;
        }
        AbstractC34609o0 abstractC34609o1 = (AbstractC34609o0) ((C41009b1) this.f1170z).get(c23488c0);
        if (abstractC34609o1 != null) {
            c0682h0.m1704t(c23488c0, abstractC34609o1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m859l(C0682h0 c0682h0, C32763v c32763v, AbstractC31558o1 abstractC31558o1) {
        if (c32763v == null) {
            return;
        }
        if (abstractC31558o1.mo97128b(c32763v.f136238a) != -1) {
            c0682h0.m1704t(c32763v, abstractC31558o1);
            return;
        }
        AbstractC31558o1 abstractC31558o2 = (AbstractC31558o1) ((C41009b1) this.f1170z).get(c32763v);
        if (abstractC31558o2 != null) {
            c0682h0.m1704t(c32763v, abstractC31558o2);
        }
    }

    /* JADX INFO: renamed from: m */
    public C15980h m860m() {
        String strM8299l = ((String) this.f1170z) == null ? " transportName" : "";
        if (((C15985m) this.f1169y) == null) {
            strM8299l = strM8299l.concat(" encodedPayload");
        }
        if (((Long) this.f1164E) == null) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " eventMillis");
        }
        if (((Long) this.f1165F) == null) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " uptimeMillis");
        }
        if (((HashMap) this.f1166G) == null) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " autoMetadata");
        }
        if (strM8299l.isEmpty()) {
            return new C15980h((String) this.f1170z, (Integer) this.f1168x, (C15985m) this.f1169y, ((Long) this.f1164E).longValue(), ((Long) this.f1165F).longValue(), (HashMap) this.f1166G);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM8299l));
    }

    /* JADX INFO: renamed from: q */
    public void m861q() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f1170z;
        ArrayList arrayList = new ArrayList(100);
        do {
            C20512q5 c20512q5 = (C20512q5) concurrentLinkedQueue.poll();
            if (c20512q5 != null) {
                arrayList.add(c20512q5);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        C4455g c4455g = (C4455g) this.f1169y;
        C20541s5 c20541s5 = new C20541s5(arrayList);
        c4455g.getClass();
        try {
            c4455g.m13934H(c4455g.m13955u(c20541s5), null);
        } catch (IOException e5) {
            ((C20513q6) c4455g.f17962x).getLogger().mo16058i(EnumC20436n5.WARNING, e5, "Capturing logs failed.", new Object[0]);
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C20568r c20568r = (C20568r) ((C0928c) this.f1166G).f3421x;
            int i14 = C20568r.f77048w;
            c20568r.releaseShared(1);
        }
    }

    /* JADX INFO: renamed from: r */
    public C2345k m862r() {
        switch (this.f1167w) {
            case 8:
                return (C2345k) ((C23470p) this.f1169y).getValue();
            case 9:
                return (C2345k) ((C23470p) this.f1169y).getValue();
            default:
                return (C2345k) ((C23470p) this.f1166G).getValue();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m863u(boolean z4) {
        C20535s c20535sM56711a = ((C20579a) this.f1165F).m56711a();
        try {
            try {
                ((C20351h5) this.f1164E).mo56218c(new RunnableC3543b(this, 13), z4 ? 0 : ErrorCodes.WebsocketMethodErrors.cServerErrors);
            } catch (RejectedExecutionException e5) {
                ((C20513q6) this.f1168x).getLogger().mo16060j(EnumC20436n5.WARNING, "Logs batch processor flush task rejected", e5);
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x0084, B:29:0x008e, B:30:0x0091, B:22:0x0065, B:24:0x006b, B:31:0x0094, B:21:0x0056), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x0084, B:29:0x008e, B:30:0x0091, B:22:0x0065, B:24:0x006b, B:31:0x0094, B:21:0x0056), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:27:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: v */
    public java.lang.Object m864v(java.lang.Object r12, p551vf.C35942g r13, wf.C37236a r14, s83.AbstractC32269c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof p485sf.C32435g
            if (r0 == 0) goto L13
            r0 = r15
            sf.g r0 = (p485sf.C32435g) r0
            int r1 = r0.f134277H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134277H = r1
            goto L18
        L13:
            sf.g r0 = new sf.g
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f134275F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134277H
            java.lang.String r3 = "modifyBeforeAttemptCompletion"
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            int r12 = r0.f134274E
            int r13 = r0.f134281z
            sf.a r14 = r0.f134280y
            java.util.Iterator r2 = r0.f134279x
            a30.w0 r5 = r0.f134278w
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Throwable -> L37
            l83.n r15 = (l83.C23468n) r15     // Catch: java.lang.Throwable -> L37
            java.lang.Object r15 = r15.f92940w     // Catch: java.lang.Throwable -> L37
            goto L84
        L37:
            r0 = move-exception
            r12 = r0
            goto L9c
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            p505ts.AbstractC34132o.m107864I(r15)
            java.lang.Object r6 = r11.f1164E
            if (r6 == 0) goto Lbd
            sf.a r5 = new sf.a
            java.lang.Object r15 = r11.f1168x
            r10 = r15
            dg.a r10 = (p091dg.C12002a) r10
            r7 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = r11.f1169y     // Catch: java.lang.Throwable -> L37
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L37
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L37
            r13 = 0
            r2 = r12
            r12 = r13
            r14 = r5
            r5 = r11
        L65:
            boolean r15 = r2.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r15 == 0) goto L94
            java.lang.Object r15 = r2.next()     // Catch: java.lang.Throwable -> L37
            cf.a r15 = (cf.InterfaceC4526a) r15     // Catch: java.lang.Throwable -> L37
            r0.f134278w = r5     // Catch: java.lang.Throwable -> L37
            r0.f134279x = r2     // Catch: java.lang.Throwable -> L37
            r0.f134280y = r14     // Catch: java.lang.Throwable -> L37
            r0.f134281z = r13     // Catch: java.lang.Throwable -> L37
            r0.f134274E = r12     // Catch: java.lang.Throwable -> L37
            r0.f134277H = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Object r15 = r15.mo14173g(r14, r0)     // Catch: java.lang.Throwable -> L37
            if (r15 != r1) goto L84
            return r1
        L84:
            java.lang.Object r6 = r5.f1170z     // Catch: java.lang.Throwable -> L37
            uf.v r6 = (p522uf.C34895v) r6     // Catch: java.lang.Throwable -> L37
            j93.d r6 = r6.f146961b     // Catch: java.lang.Throwable -> L37
            boolean r7 = r15 instanceof l83.C23467m     // Catch: java.lang.Throwable -> L37
            if (r7 != 0) goto L91
            m833n(r3, r6, r15)     // Catch: java.lang.Throwable -> L37
        L91:
            r14.f134252b = r15     // Catch: java.lang.Throwable -> L37
            goto L65
        L94:
            java.lang.Object r12 = r14.f134252b     // Catch: java.lang.Throwable -> L37
            l83.n r13 = new l83.n     // Catch: java.lang.Throwable -> L37
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L37
            goto La0
        L9c:
            l83.m r13 = p505ts.AbstractC34132o.m107888l(r12)
        La0:
            java.lang.Throwable r12 = l83.C23468n.m68037a(r13)
            if (r12 != 0) goto Lb8
            l83.n r13 = (l83.C23468n) r13
            java.lang.Object r12 = r13.f92940w
            java.lang.Object r13 = r11.f1170z
            uf.v r13 = (p522uf.C34895v) r13
            j93.d r13 = r13.f146961b
            boolean r14 = r12 instanceof l83.C23467m
            if (r14 != 0) goto Lbc
            m833n(r3, r13, r12)
            goto Lbc
        Lb8:
            l83.m r12 = p505ts.AbstractC34132o.m107888l(r12)
        Lbc:
            return r12
        Lbd:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m864v(java.lang.Object, vf.g, wf.a, s83.c):java.lang.Object");
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: w */
    public List mo865w() {
        return (ArrayList) this.f1165F;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x008c, B:29:0x0096, B:30:0x0099, B:22:0x006d, B:24:0x0073, B:31:0x009c, B:21:0x005e), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x008c, B:29:0x0096, B:30:0x0099, B:22:0x006d, B:24:0x0073, B:31:0x009c, B:21:0x005e), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:27:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: x */
    public java.lang.Object m866x(java.lang.Object r12, s83.AbstractC32269c r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m866x(java.lang.Object, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:28:0x0084, B:22:0x0061, B:24:0x0067, B:21:0x0051), top: B:35:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0083 -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: y */
    public java.lang.Object m867y(p459rf.C31341l r10, s83.AbstractC32269c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p485sf.C32437i
            if (r0 == 0) goto L13
            r0 = r11
            sf.i r0 = (p485sf.C32437i) r0
            int r1 = r0.f134294I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134294I = r1
            goto L18
        L13:
            sf.i r0 = new sf.i
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f134292G
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134294I
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r10 = r0.f134291F
            int r2 = r0.f134290E
            sf.f r4 = r0.f134298z
            sf.f r5 = r0.f134297y
            java.util.Iterator r6 = r0.f134296x
            sf.f r7 = r0.f134295w
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Throwable -> L33
            goto L84
        L33:
            r10 = move-exception
            goto L92
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.Object r11 = r9.f1164E
            if (r11 == 0) goto L9e
            sf.f r2 = new sf.f
            vf.a r4 = r10.f128963w
            wf.a r10 = r10.f128964x
            java.lang.Object r5 = r9.f1168x
            dg.a r5 = (p091dg.C12002a) r5
            r2.<init>(r11, r4, r10, r5)
            java.lang.Object r10 = r9.f1169y     // Catch: java.lang.Throwable -> L33
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L33
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L33
            r11 = 0
            r6 = r10
            r10 = r11
            r4 = r2
            r5 = r4
            r2 = r10
        L61:
            boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto L96
            java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L33
            cf.a r11 = (cf.InterfaceC4526a) r11     // Catch: java.lang.Throwable -> L33
            r0.f134295w = r4     // Catch: java.lang.Throwable -> L33
            r0.f134296x = r6     // Catch: java.lang.Throwable -> L33
            r0.f134297y = r5     // Catch: java.lang.Throwable -> L33
            r0.f134298z = r4     // Catch: java.lang.Throwable -> L33
            r0.f134290E = r2     // Catch: java.lang.Throwable -> L33
            r0.f134291F = r10     // Catch: java.lang.Throwable -> L33
            r0.f134294I = r3     // Catch: java.lang.Throwable -> L33
            r11.getClass()     // Catch: java.lang.Throwable -> L33
            wf.a r11 = r4.f134272c     // Catch: java.lang.Throwable -> L33
            if (r11 != r1) goto L83
            return r1
        L83:
            r7 = r4
        L84:
            wf.a r11 = (wf.C37236a) r11     // Catch: java.lang.Throwable -> L33
            r4.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = "<set-?>"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r11, r8)     // Catch: java.lang.Throwable -> L33
            r4.f134272c = r11     // Catch: java.lang.Throwable -> L33
            r4 = r7
            goto L61
        L92:
            l83.m r5 = p505ts.AbstractC34132o.m107888l(r10)
        L96:
            p505ts.AbstractC34132o.m107864I(r5)
            sf.f r5 = (p485sf.C32434f) r5
            wf.a r10 = r5.f134272c
            return r10
        L9e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m867y(rf.l, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x009b, B:22:0x006b, B:24:0x0071, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0093 -> B:28:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: z */
    public java.lang.Object m868z(p551vf.C35942g r14, s83.AbstractC32269c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p485sf.C32438j
            if (r0 == 0) goto L13
            r0 = r15
            sf.j r0 = (p485sf.C32438j) r0
            int r1 = r0.f134306L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134306L = r1
            goto L18
        L13:
            sf.j r0 = new sf.j
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f134304J
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134306L
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            int r14 = r0.f134303I
            int r2 = r0.f134302H
            int r4 = r0.f134301G
            sf.e r5 = r0.f134300F
            sf.e r6 = r0.f134299E
            sf.e r7 = r0.f134310z
            java.util.Iterator r8 = r0.f134309y
            sf.e r9 = r0.f134308x
            vf.a r10 = r0.f134307w
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Throwable -> L40
            r12 = r5
            r5 = r14
            r14 = r10
            r10 = r8
            r8 = r7
            r7 = r6
            r6 = r12
            goto L9b
        L40:
            r14 = move-exception
            goto Lb3
        L43:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L4b:
            p505ts.AbstractC34132o.m107864I(r15)
            java.lang.Object r15 = r13.f1164E
            if (r15 == 0) goto Lbf
            sf.e r2 = new sf.e
            java.lang.Object r4 = r13.f1168x
            dg.a r4 = (p091dg.C12002a) r4
            r2.<init>(r15, r14, r4)
            java.lang.Object r15 = r13.f1169y     // Catch: java.lang.Throwable -> L40
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> L40
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r8 = r15
            r5 = r2
            r7 = r5
            r15 = r4
            r2 = r15
        L6b:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto Lb7
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Throwable -> L40
            cf.a r6 = (cf.InterfaceC4526a) r6     // Catch: java.lang.Throwable -> L40
            r0.f134307w = r14     // Catch: java.lang.Throwable -> L40
            r0.f134308x = r5     // Catch: java.lang.Throwable -> L40
            r0.f134309y = r8     // Catch: java.lang.Throwable -> L40
            r0.f134310z = r7     // Catch: java.lang.Throwable -> L40
            r0.f134299E = r5     // Catch: java.lang.Throwable -> L40
            r0.f134300F = r5     // Catch: java.lang.Throwable -> L40
            r0.f134301G = r15     // Catch: java.lang.Throwable -> L40
            r0.f134302H = r2     // Catch: java.lang.Throwable -> L40
            r0.f134303I = r4     // Catch: java.lang.Throwable -> L40
            r0.f134306L = r3     // Catch: java.lang.Throwable -> L40
            r6.getClass()     // Catch: java.lang.Throwable -> L40
            vf.a r6 = r5.f134268b     // Catch: java.lang.Throwable -> L40
            if (r6 != r1) goto L93
            return r1
        L93:
            r9 = r5
            r10 = r8
            r5 = r4
            r8 = r7
            r4 = r15
            r7 = r9
            r15 = r6
            r6 = r7
        L9b:
            r11 = r15
            vf.a r11 = (p551vf.InterfaceC35936a) r11     // Catch: java.lang.Throwable -> L40
            m830K(r14, r11, r7)     // Catch: java.lang.Throwable -> L40
            vf.a r15 = (p551vf.InterfaceC35936a) r15     // Catch: java.lang.Throwable -> L40
            r6.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "<set-?>"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r15, r7)     // Catch: java.lang.Throwable -> L40
            r6.f134268b = r15     // Catch: java.lang.Throwable -> L40
            r15 = r4
            r4 = r5
            r7 = r8
            r5 = r9
            r8 = r10
            goto L6b
        Lb3:
            l83.m r7 = p505ts.AbstractC34132o.m107888l(r14)
        Lb7:
            p505ts.AbstractC34132o.m107864I(r7)
            sf.e r7 = (p485sf.C32433e) r7
            vf.a r14 = r7.f134268b
            return r14
        Lbf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0332w0.m868z(vf.g, s83.c):java.lang.Object");
    }

    public /* synthetic */ C0332w0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        this.f1167w = i13;
        this.f1168x = obj;
        this.f1169y = obj2;
        this.f1170z = obj3;
        this.f1164E = obj4;
        this.f1165F = obj5;
        this.f1166G = obj6;
    }

    public C0332w0(C13668i c13668i, String directoryServerId, PublicKey directoryServerPublicKey, String str, C29926q0 sdkTransactionId, KeyPair keyPair) {
        this.f1167w = 11;
        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
        AbstractC22676k.m65750j(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        this.f1168x = c13668i;
        this.f1170z = directoryServerId;
        this.f1169y = directoryServerPublicKey;
        this.f1164E = str;
        this.f1165F = sdkTransactionId;
        this.f1166G = keyPair;
    }

    public C0332w0(AbstractC35903f abstractC35903f) {
        this.f1167w = 3;
        List listMo43597r = abstractC35903f.mo43597r();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo43597r, 10));
        Iterator it = listMo43597r.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((C23465k) it.next()).f92937w);
        }
        this.f1168x = arrayList;
        List listMo43597r2 = abstractC35903f.mo43597r();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listMo43597r2, 10));
        Iterator it3 = listMo43597r2.iterator();
        while (it3.hasNext()) {
            arrayList2.add((String) ((C23465k) it3.next()).f92938x);
        }
        this.f1169y = arrayList2;
        this.f1170z = new C15393n0(false);
        this.f1164E = AbstractC32128i.m100064s(abstractC35903f.mo43598t(), new Object[0], C25271y.f99162w);
        this.f1165F = (ArrayList) this.f1168x;
        this.f1166G = arrayList2;
    }

    public C0332w0(C35459c0 paymentMethodMetadata, C16651f customerStateHolder, C32064f selectionHolder, C16776z4 savedPaymentMethodMutator, C22136a eventReporter, InterfaceC22297a manageNavigatorProvider) {
        this.f1167w = 15;
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
        AbstractC22676k.m65750j(selectionHolder, "selectionHolder");
        AbstractC22676k.m65750j(savedPaymentMethodMutator, "savedPaymentMethodMutator");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(manageNavigatorProvider, "manageNavigatorProvider");
        this.f1168x = paymentMethodMetadata;
        this.f1169y = customerStateHolder;
        this.f1170z = selectionHolder;
        this.f1164E = savedPaymentMethodMutator;
        this.f1165F = eventReporter;
        this.f1166G = manageNavigatorProvider;
    }

    public C0332w0(C16689l1 billingDetailsCollectionConfiguration, C35484p c35484p, String str, C35473j0 cardBrandFilter, InterfaceC35322b cardFundingFilter, InterfaceC3018i0 localSavedSelection) {
        this.f1167w = 0;
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(localSavedSelection, "localSavedSelection");
        this.f1168x = billingDetailsCollectionConfiguration;
        this.f1169y = c35484p;
        this.f1170z = str;
        this.f1164E = cardBrandFilter;
        this.f1165F = cardFundingFilter;
        this.f1166G = localSavedSelection;
    }

    public C0332w0() {
        this.f1167w = 19;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this.f1168x = c13045h2M36593c;
        this.f1169y = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(EnumC37870f.f162183w);
        this.f1170z = c13045h2M36593c2;
        this.f1164E = AbstractC13091v.m36598h(c13045h2M36593c2);
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c("");
        this.f1165F = c13045h2M36593c3;
        this.f1166G = AbstractC13091v.m36598h(c13045h2M36593c3);
    }

    public C0332w0(C16351i activityResultLauncher, Activity activity, InterfaceC1585g0 lifecycleOwner, Application application, C15314n c15314n, String str) {
        this.f1167w = 5;
        AbstractC22676k.m65750j(activityResultLauncher, "activityResultLauncher");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        this.f1168x = activityResultLauncher;
        this.f1169y = activity;
        this.f1164E = lifecycleOwner;
        this.f1165F = application;
        this.f1166G = c15314n;
        this.f1170z = str;
        lifecycleOwner.getLifecycle().mo4986a(new C12566q0(this, 2));
    }

    public C0332w0(C35233b c35233b) {
        this.f1167w = 17;
        this.f1170z = c35233b.f149834a;
        this.f1168x = AbstractC25265s.m74093D1(c35233b.f149836c);
        this.f1169y = AbstractC25265s.m74093D1(c35233b.f149837d);
        this.f1164E = AbstractC25265s.m74093D1(c35233b.f149838e);
        this.f1165F = AbstractC25265s.m74093D1(c35233b.f149835b);
        this.f1166G = c35233b.f149839f;
    }

    public C0332w0(C33425n0 c33425n0) {
        this.f1167w = 18;
        this.f1168x = new C33623c0();
        this.f1169y = c33425n0;
        C25272z c25272z = C25272z.f99163w;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c25272z);
        this.f1170z = c13045h2M36593c;
        this.f1164E = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(c25272z);
        this.f1165F = c13045h2M36593c2;
        this.f1166G = c13045h2M36593c2;
    }

    public C0332w0(C33368c0 c33368c0, C33366b4 c33366b4, C17171d scope, C20378c permissionManager, C3872q c3872q) {
        this.f1167w = 10;
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(permissionManager, "permissionManager");
        this.f1168x = c33368c0;
        this.f1169y = c33366b4;
        this.f1170z = scope;
        this.f1164E = permissionManager;
        this.f1165F = c3872q;
        this.f1166G = AbstractC1772c1.m5382S(this, "NotificationUpdateObserver");
    }

    public C0332w0(C20513q6 c20513q6, C4455g c4455g) {
        this.f1167w = 7;
        C20351h5 c20351h5 = new C20351h5(c20513q6);
        this.f1165F = new C20579a();
        this.f1166G = new C0928c(17, (byte) 0);
        this.f1168x = c20513q6;
        this.f1169y = c4455g;
        this.f1170z = new ConcurrentLinkedQueue();
        this.f1164E = c20351h5;
    }

    public C0332w0(Context context, int i13) {
        this.f1167w = i13;
        switch (i13) {
            case 9:
                AbstractC22676k.m65750j(context, "context");
                this.f1168x = context;
                this.f1169y = AbstractC1772c1.m5382S(this, "CallSoundPlayer");
                this.f1170z = AbstractC30060g.m92088H(C22213a.f86567w);
                this.f1166G = new AtomicBoolean(false);
                break;
            default:
                AbstractC22676k.m65750j(context, "context");
                this.f1168x = context;
                this.f1169y = AbstractC1772c1.m5382S(this, "ServiceTriggers");
                C21323g c21323g = new C21323g(0);
                this.f1170z = c21323g;
                this.f1164E = new C30352d(c21323g);
                this.f1165F = new C26702o(16);
                this.f1166G = new C15468e();
                break;
        }
    }

    public C0332w0(C12002a execContext, ArrayList interceptors, C34895v c34895v) {
        this.f1167w = 12;
        AbstractC22676k.m65750j(execContext, "execContext");
        AbstractC22676k.m65750j(interceptors, "interceptors");
        this.f1168x = execContext;
        this.f1169y = interceptors;
        this.f1170z = c34895v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0332w0(C1596j c1596j, InterfaceC4351m interfaceC4351m, C17171d c17171d, C0111j c0111j) {
        this.f1167w = 1;
        this.f1168x = c1596j;
        this.f1169y = (AbstractC32275i) interfaceC4351m;
        this.f1170z = c17171d;
        this.f1164E = c0111j;
    }

    public C0332w0(C31552m1 c31552m1) {
        this.f1167w = 13;
        this.f1168x = c31552m1;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f1169y = C41060w0.f177067E;
        this.f1170z = C41009b1.f176959G;
    }

    public C0332w0(C34605m0 c34605m0) {
        this.f1167w = 2;
        this.f1168x = c34605m0;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f1169y = C41060w0.f177067E;
        this.f1170z = C41009b1.f176959G;
    }
}
