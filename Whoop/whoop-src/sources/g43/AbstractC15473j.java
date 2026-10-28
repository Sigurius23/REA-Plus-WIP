package g43;

import a13.InterfaceC0145c;
import a30.C0332w0;
import a33.C0352d;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.C1064c;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C1082p;
import android.support.v4.media.session.C1085s;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d13.AbstractC11478a;
import d33.C11585c;
import d33.EnumC11579a;
import e43.C12712d;
import e43.C12713e;
import e43.C12717i;
import e43.C12718j;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import gm.C15982j;
import ih0.AbstractC18489d0;
import io.getstream.android.video.generated.models.CallSettingsResponse;
import io.getstream.android.video.generated.models.LocalCallMissedEvent;
import io.getstream.android.video.generated.models.VideoSettingsResponse;
import io.getstream.video.android.model.C19971b;
import io.getstream.video.android.model.StreamCallId;
import io.getstream.video.android.model.User;
import j43.C21319c;
import j43.C21323g;
import j43.C21325i;
import j43.EnumC21324h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25272z;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n43.C26288d;
import ng3.C26702o;
import p000.AbstractC11266d;
import p002a0.C0022g;
import p031b9.AbstractC2875y;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p483s8.C32252e;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import qg3.C30352d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s43.C32197a;
import s83.AbstractC32269c;
import t23.C33359a3;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33392g2;
import t23.C33403i3;
import t23.C33450s0;
import t23.C33477x2;
import t23.C33486z1;
import t23.C33487z2;
import t23.InterfaceC33377d3;
import t23.InterfaceC33408j3;

/* JADX INFO: renamed from: g43.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15473j implements InterfaceC15478o, InterfaceC15479p, InterfaceC15481r, InterfaceC0145c {

    /* JADX INFO: renamed from: E */
    public final boolean f58113E;

    /* JADX INFO: renamed from: F */
    public final C15474k f58114F;

    /* JADX INFO: renamed from: G */
    public final C15480q f58115G;

    /* JADX INFO: renamed from: H */
    public final C15477n f58116H;

    /* JADX INFO: renamed from: I */
    public final C15468e f58117I;

    /* JADX INFO: renamed from: J */
    public final C11457j f58118J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC4351m f58119K;

    /* JADX INFO: renamed from: L */
    public final C23470p f58120L;

    /* JADX INFO: renamed from: M */
    public final C0332w0 f58121M;

    /* JADX INFO: renamed from: N */
    public final C32197a f58122N;

    /* JADX INFO: renamed from: O */
    public final C15982j f58123O;

    /* JADX INFO: renamed from: w */
    public final Application f58124w;

    /* JADX INFO: renamed from: x */
    public final NotificationManagerCompat f58125x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC0145c f58126y;

    /* JADX INFO: renamed from: z */
    public final C0352d f58127z;

    public AbstractC15473j(Application context, NotificationManagerCompat notificationManagerCompat, InterfaceC0145c interfaceC0145c, C0352d c0352d, boolean z4, C15474k c15474k, C15480q c15480q, C15477n c15477n, C15468e c15468e) {
        C11457j c11457j = new C11457j(notificationManagerCompat);
        AbstractC22676k.m65750j(context, "application");
        this.f58124w = context;
        this.f58125x = notificationManagerCompat;
        this.f58126y = interfaceC0145c;
        this.f58127z = c0352d;
        this.f58113E = z4;
        this.f58114F = c15474k;
        this.f58115G = c15480q;
        this.f58116H = c15477n;
        this.f58117I = c15468e;
        this.f58118J = c11457j;
        this.f58119K = C15469f.f58094w;
        this.f58120L = AbstractC1772c1.m5382S(this, "Video:StreamNotificationHandler");
        this.f58121M = new C0332w0(context, 8);
        this.f58122N = new C32197a(context);
        AbstractC22676k.m65750j(context, "context");
        C15982j c15982j = new C15982j();
        c15982j.f60491w = context;
        this.f58123O = c15982j;
    }

    /* JADX INFO: renamed from: k */
    public static final void m43665k(AbstractC15473j abstractC15473j, NotificationCompat.Builder builder, PendingIntent pendingIntent, String str, int i13) {
        C2345k c2345kM43680n = abstractC15473j.m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM43680n.f9274b.log(enumC2341g, str2, AbstractC11895b.m31993l(i13, "[addHangUpAction] Adding hang up action for ", str, " (remoteParticipantCount=", ")"), null);
        }
        if (Build.VERSION.SDK_INT < 31 || ((ActivityManager) abstractC15473j.f58123O.f60491w.getSystemService(ActivityManager.class)).isBackgroundRestricted()) {
            C2345k c2345kM43680n2 = abstractC15473j.m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
            String str3 = c2345kM43680n2.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
                c2345kM43680n2.f9274b.log(enumC2341g, str3, "[getLeaveAction]", null);
            }
            NotificationCompat.Action actionBuild = new NotificationCompat.Action.Builder((IconCompat) null, abstractC15473j.f58124w.getString(R.string.stream_video_call_notification_action_leave), pendingIntent).build();
            AbstractC22676k.m65749i(actionBuild, "build(...)");
            builder.addAction(actionBuild);
            return;
        }
        Application application = abstractC15473j.f58122N.f133333a;
        Person.Builder name = new Person.Builder().setName(str);
        if (i13 == 0) {
            name.setIcon(IconCompat.m3680d(application, R.drawable.stream_video_ic_user));
        } else if (i13 > 1) {
            name.setIcon(IconCompat.m3680d(application, R.drawable.stream_video_ic_user_group));
        }
        NotificationCompat.CallStyle callStyleForOngoingCall = NotificationCompat.CallStyle.forOngoingCall(name.build(), pendingIntent);
        AbstractC22676k.m65749i(callStyleForOngoingCall, "forOngoingCall(...)");
        builder.setStyle(callStyleForOngoingCall);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: o */
    public static String m43666o(C33368c0 c33368c0, List list) {
        Object obj;
        String name;
        C13045h2 c13045h2;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id4 = ((C33486z1) next).f139808a.getId();
            C33392g2 c33392g2 = (C33392g2) ((AbstractC22680m) c33368c0.f139302p.f139662m.f104635y).invoke();
            if (c33392g2 != null && (c13045h2 = c33392g2.f139446y) != null) {
                obj = (String) c13045h2.getValue();
            }
            if (!AbstractC22676k.m65745e(id4, obj)) {
                obj = next;
                break;
            }
        }
        C33486z1 c33486z1 = (C33486z1) obj;
        return (c33486z1 == null || (name = c33486z1.f139808a.getName()) == null) ? "Unknown" : name;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: q */
    public static Object m43667q(AbstractC15473j abstractC15473j, C33368c0 c33368c0, String str, AbstractC32269c abstractC32269c) {
        C15470g c15470g;
        C2345k c2345kM43680n;
        String str2;
        EnumC2341g enumC2341g;
        C0352d c0352d = abstractC15473j.f58127z;
        if (abstractC32269c instanceof C15470g) {
            c15470g = (C15470g) abstractC32269c;
            int i13 = c15470g.f58097y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15470g.f58097y = i13 - Integer.MIN_VALUE;
            } else {
                c15470g = new C15470g(abstractC15473j, abstractC32269c);
            }
        } else {
            c15470g = new C15470g(abstractC15473j, abstractC32269c);
        }
        Object obj = c15470g.f58095w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15470g.f58097y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k c2345kM43680n2 = abstractC15473j.m43680n();
            Application application = abstractC15473j.f58124w;
            C15477n c15477n = abstractC15473j.f58116H;
            boolean z4 = abstractC15473j.f58113E;
            InterfaceC2339e interfaceC2339e = c2345kM43680n2.f9275c;
            String str3 = c2345kM43680n2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g2, str3)) {
                c2345kM43680n2.f9274b.log(enumC2341g2, str3, AbstractC31061c.m95640p("[onUpdateIncomingCallNotification] callId: ", c33368c0.f139308v, ", callDisplayName: ", str), null);
            }
            C19971b c19971b = StreamCallId.Companion;
            String str4 = c33368c0.f139308v;
            c19971b.getClass();
            StreamCallId streamCallIdM55786a = C19971b.m55786a(str4);
            InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c33368c0.f139302p.f139618G.getValue();
            C2345k c2345kM43680n3 = abstractC15473j.m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n3.f9275c;
            String str5 = c2345kM43680n3.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
                InterfaceC2344j interfaceC2344j = c2345kM43680n3.f9274b;
                String id4 = streamCallIdM55786a.getId();
                StringBuilder sb4 = new StringBuilder("[getRingingCallNotificationInternal] callId: ");
                sb4.append(id4);
                sb4.append(", ringingState: ");
                sb4.append(interfaceC33377d3);
                sb4.append(", callDisplayName: ");
                interfaceC2344j.log(enumC2341g2, str5, AbstractC25012a.m73376i(str, ", shouldHaveContentIntent: true", sb4), null);
            }
            boolean z13 = interfaceC33377d3 instanceof C33487z2;
            C25272z c25272z = C25272z.f99163w;
            if (z13) {
                PendingIntent pendingIntentM910J = C0352d.m910J(c0352d, streamCallIdM55786a, c25272z);
                PendingIntent pendingIntentM909F = C0352d.m909F(c0352d, streamCallIdM55786a, c25272z);
                PendingIntent pendingIntentM924M = c0352d.m924M(streamCallIdM55786a, c25272z);
                if (pendingIntentM910J == null || pendingIntentM909F == null || pendingIntentM924M == null) {
                    c2345kM43680n = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e3 = c2345kM43680n.f9275c;
                    str2 = c2345kM43680n.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (!interfaceC2339e3.isLoggable(enumC2341g, str2)) {
                        return null;
                    }
                } else {
                    C2345k c2345kM43680n4 = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e4 = c2345kM43680n4.f9275c;
                    C15470g c15470g2 = c15470g;
                    String str6 = c2345kM43680n4.f9273a;
                    if (interfaceC2339e4.isLoggable(enumC2341g2, str6)) {
                        c2345kM43680n4.f9274b.log(enumC2341g2, str6, AbstractC11895b.m31996o("[getIncomingCallNotificationInternal] callerName: ", str, ", shouldHaveContentIntent: true"), null);
                    }
                    C15476m c15476m = (AbstractC35902e.m113939G() && z4) ? c15477n.f58137f : c15477n.f58132a;
                    String str7 = c15476m.f58128a;
                    C2345k c2345kM43680n5 = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e5 = c2345kM43680n5.f9275c;
                    String str8 = c2345kM43680n5.f9273a;
                    if (interfaceC2339e5.isLoggable(enumC2341g2, str8)) {
                        c2345kM43680n5.f9274b.log(enumC2341g2, str8, "[ensureChannelAndBuildNotification] channelId: ".concat(str7), null);
                    }
                    AbstractC15464a.m43659a(c15476m, abstractC15473j.f58125x);
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str7);
                    builder.setPriority(z4 != 0 ? -1 : 2);
                    builder.setContentTitle(str);
                    builder.setContentText(application.getString(R.string.stream_video_incoming_call_notification_description));
                    builder.setSmallIcon(R.drawable.stream_video_ic_call);
                    builder.setChannelId(str7);
                    builder.setOngoing(true);
                    builder.setCategory(NotificationCompat.CATEGORY_CALL);
                    builder.setFullScreenIntent(pendingIntentM910J, true);
                    builder.setContentIntent(pendingIntentM910J);
                    abstractC15473j.m43678l(builder, pendingIntentM909F, pendingIntentM924M, str);
                    PendingIntent pendingIntentM910J2 = C0352d.m910J(c0352d, streamCallIdM55786a, c25272z);
                    PendingIntent pendingIntentM909F2 = C0352d.m909F(c0352d, streamCallIdM55786a, c25272z);
                    PendingIntent pendingIntentM924M2 = c0352d.m924M(streamCallIdM55786a, c25272z);
                    if (pendingIntentM910J2 == null || pendingIntentM909F2 == null || pendingIntentM924M2 == null) {
                        C2345k c2345kM43680n6 = abstractC15473j.m43680n();
                        InterfaceC2339e interfaceC2339e6 = c2345kM43680n6.f9275c;
                        String str9 = c2345kM43680n6.f9273a;
                        EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                        if (interfaceC2339e6.isLoggable(enumC2341g3, str9)) {
                            c2345kM43680n6.f9274b.log(enumC2341g3, str9, "Ringing call notification not shown, one of the intents is null.", null);
                        }
                    } else {
                        abstractC15473j.f58114F.getClass();
                    }
                    C15480q c15480q = abstractC15473j.f58115G;
                    c15470g2.f58097y = 1;
                    c15480q.getClass();
                    if (builder == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = builder;
                }
            } else {
                if (!(interfaceC33377d3 instanceof C33359a3)) {
                    return null;
                }
                PendingIntent pendingIntentM923L = c0352d.m923L(streamCallIdM55786a, streamCallIdM55786a.getNotificationId(C12717i.f43512b), c25272z);
                PendingIntent pendingIntentM921I = c0352d.m921I(streamCallIdM55786a, c25272z);
                if (pendingIntentM923L != null && pendingIntentM921I != null) {
                    return abstractC15473j.mo43670a(streamCallIdM55786a, str, (8 & 4) == 0, c25272z);
                }
                c2345kM43680n = abstractC15473j.m43680n();
                InterfaceC2339e interfaceC2339e7 = c2345kM43680n.f9275c;
                str2 = c2345kM43680n.f9273a;
                enumC2341g = EnumC2341g.ERROR;
                if (!interfaceC2339e7.isLoggable(enumC2341g, str2)) {
                    return null;
                }
            }
            c2345kM43680n.f9274b.log(enumC2341g, str2, "Ringing call notification not shown, one of the intents is null.", null);
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        Notification notificationBuild = ((NotificationCompat.Builder) obj).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static Object m43668r(AbstractC15473j abstractC15473j, C33368c0 c33368c0, String str, AbstractC32269c abstractC32269c) {
        C15471h c15471h;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        C15471h c15471h2;
        EnumC31071a enumC31071a;
        PendingIntent pendingIntent;
        C1082p c1082p;
        String str6;
        StreamCallId callId;
        AbstractC15473j abstractC15473j2;
        AbstractC15473j abstractC15473j3;
        C33368c0 c33368c1;
        StreamCallId callId2;
        Map payload;
        String str7;
        C1085s c1085s;
        C1082p c1082pM43664b;
        C15468e c15468e;
        AbstractC15473j abstractC15473j4;
        Object obj;
        Object obj2;
        if (abstractC32269c instanceof C15471h) {
            c15471h = (C15471h) abstractC32269c;
            int i13 = c15471h.f58105L;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15471h.f58105L = i13 - Integer.MIN_VALUE;
            } else {
                c15471h = new C15471h(abstractC15473j, abstractC32269c);
            }
        } else {
            c15471h = new C15471h(abstractC15473j, abstractC32269c);
        }
        Object obj3 = c15471h.f58103J;
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        int i14 = c15471h.f58105L;
        if (i14 != 0) {
            if (i14 == 1) {
                c1082p = c15471h.f58102I;
                pendingIntent = c15471h.f58101H;
                abstractC15473j2 = c15471h.f58100G;
                callId = c15471h.f58099F;
                StreamCallId streamCallId = c15471h.f58098E;
                Map map = c15471h.f58109z;
                str6 = c15471h.f58108y;
                c33368c1 = c15471h.f58107x;
                abstractC15473j3 = c15471h.f58106w;
                AbstractC34132o.m107864I(obj3);
                str3 = "Ongoing intent is null click on the ongoing call notification will not work.";
                str7 = "[ensureChannelAndBuildNotification] channelId: ";
                str2 = "build(...)";
                str5 = "getApplicationContext(...)";
                callId2 = streamCallId;
                payload = map;
                c15471h2 = c15471h;
                enumC31071a = enumC31071a2;
                c1085s = new C1085s();
                C15468e c15468e2 = abstractC15473j3.f58117I;
                Application application = abstractC15473j3.f58124w;
                c1082pM43664b = c15468e2.m43664b(application, callId2, abstractC15473j3.f58116H.f58133b.f58128a);
                c15468e = abstractC15473j3.f58117I;
                AbstractC22676k.m65749i(application.getApplicationContext(), str5);
                c15471h2.f58106w = abstractC15473j3;
                c15471h2.f58107x = c33368c1;
                c15471h2.f58108y = str6;
                c15471h2.f58109z = payload;
                c15471h2.f58098E = callId2;
                c15471h2.f58099F = callId;
                c15471h2.f58100G = abstractC15473j2;
                c15471h2.f58101H = pendingIntent;
                c15471h2.f58102I = c1082p;
                c15471h2.f58105L = 2;
                c15468e.getClass();
                if (C15468e.m43662d(c15468e, c1082pM43664b, c33368c1, c1085s, c15471h2) == enumC31071a) {
                    return enumC31071a;
                }
                abstractC15473j4 = abstractC15473j3;
            } else if (i14 == 2) {
                c1082p = c15471h.f58102I;
                pendingIntent = c15471h.f58101H;
                abstractC15473j2 = c15471h.f58100G;
                callId = c15471h.f58099F;
                callId2 = c15471h.f58098E;
                payload = c15471h.f58109z;
                abstractC15473j4 = c15471h.f58106w;
                AbstractC34132o.m107864I(obj3);
                enumC31071a = enumC31071a2;
                str3 = "Ongoing intent is null click on the ongoing call notification will not work.";
                str7 = "[ensureChannelAndBuildNotification] channelId: ";
                str2 = "build(...)";
                c15471h2 = c15471h;
            } else {
                if (i14 != 3) {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                    str4 = "build(...)";
                    obj2 = obj3;
                    Notification notificationBuild = ((NotificationCompat.Builder) obj2).build();
                    AbstractC22676k.m65749i(notificationBuild, str4);
                    return notificationBuild;
                }
                AbstractC34132o.m107864I(obj3);
                str2 = "build(...)";
                obj = obj3;
            }
            Notification notificationBuild2 = ((NotificationCompat.Builder) obj).build();
            AbstractC22676k.m65749i(notificationBuild2, str2);
            return notificationBuild2;
        }
        AbstractC34132o.m107864I(obj3);
        C2345k c2345kM43680n = abstractC15473j.m43680n();
        NotificationManagerCompat notificationManagerCompat = abstractC15473j.f58125x;
        C15468e c15468e3 = abstractC15473j.f58117I;
        C0352d c0352d = abstractC15473j.f58127z;
        C15477n c15477n = abstractC15473j.f58116H;
        Application application2 = abstractC15473j.f58124w;
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        str2 = "build(...)";
        String str8 = c2345kM43680n.f9273a;
        str3 = "Ongoing intent is null click on the ongoing call notification will not work.";
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str8)) {
            c2345kM43680n.f9274b.log(enumC2341g, str8, AbstractC31061c.m95640p("[updateOngoingCallNotification] callId: ", c33368c0.f139308v, ", callDisplayName: ", str), null);
        }
        C19971b c19971b = StreamCallId.Companion;
        String str9 = c33368c0.f139308v;
        c19971b.getClass();
        StreamCallId streamCallIdM55786a = C19971b.m55786a(str9);
        StreamCallId streamCallIdM55786a2 = C19971b.m55786a(c33368c0.f139308v);
        int size = ((List) ((InterfaceC13037f2) c33368c0.f139302p.f139666o.getValue()).getValue()).size();
        C2345k c2345kM43680n2 = abstractC15473j.m43680n();
        InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
        String str10 = c2345kM43680n2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str10)) {
            InterfaceC2344j interfaceC2344j = c2345kM43680n2.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[getOngoingCallNotificationInternal] callId: ", streamCallIdM55786a2.getId(), ", callDisplayName: ", str, ", isOutgoingCall: false, remoteParticipantCount: ");
            sbM32001t.append(size);
            interfaceC2344j.log(enumC2341g, str10, sbM32001t.toString(), null);
        }
        InterfaceC33408j3.f139483t.getClass();
        boolean zContains = ((C33366b4) C33403i3.m105852a()).f139235H.f64767x.f43510h.contains(streamCallIdM55786a2.getType());
        C25272z c25272z = C25272z.f99163w;
        if (!zContains) {
            str4 = str2;
            C2345k c2345kM43680n3 = abstractC15473j.m43680n();
            InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
            String str11 = c2345kM43680n3.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g, str11)) {
                InterfaceC2344j interfaceC2344j2 = c2345kM43680n3.f9274b;
                StringBuilder sbM32001t2 = AbstractC11895b.m32001t("[getSimpleOngoingCallNotification] callId: ", streamCallIdM55786a2.getId(), ", callDisplayName: ", str, ", isOutgoingCall: false, remoteParticipantCount: ");
                sbM32001t2.append(size);
                interfaceC2344j2.log(enumC2341g, str11, sbM32001t2.toString(), null);
            }
            PendingIntent pendingIntentM922K = c0352d.m922K(streamCallIdM55786a2, streamCallIdM55786a2.hashCode(), c25272z);
            PendingIntent pendingIntentM921I = c0352d.m921I(streamCallIdM55786a2, c25272z);
            if (pendingIntentM921I == null) {
                C2345k c2345kM43680n4 = abstractC15473j.m43680n();
                InterfaceC2339e interfaceC2339e4 = c2345kM43680n4.f9275c;
                String str12 = c2345kM43680n4.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (!interfaceC2339e4.isLoggable(enumC2341g2, str12)) {
                    return null;
                }
                c2345kM43680n4.f9274b.log(enumC2341g2, str12, "End call intent is null, not showing notification!", null);
                return null;
            }
            C15476m c15476m = c15477n.f58133b;
            String str13 = c15476m.f58128a;
            C2345k c2345kM43680n5 = abstractC15473j.m43680n();
            InterfaceC2339e interfaceC2339e5 = c2345kM43680n5.f9275c;
            String str14 = c2345kM43680n5.f9273a;
            if (interfaceC2339e5.isLoggable(enumC2341g, str14)) {
                c2345kM43680n5.f9274b.log(enumC2341g, str14, "[ensureChannelAndBuildNotification] channelId: ".concat(str13), null);
            }
            AbstractC15464a.m43659a(c15476m, notificationManagerCompat);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(application2, str13);
            NotificationCompat.Builder smallIcon = builder.setSmallIcon(R.drawable.stream_video_ic_call);
            if (pendingIntentM922K != null) {
                smallIcon.setContentIntent(pendingIntentM922K);
            } else {
                C2345k c2345kM43680n6 = abstractC15473j.m43680n();
                InterfaceC2339e interfaceC2339e6 = c2345kM43680n6.f9275c;
                String str15 = c2345kM43680n6.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                if (interfaceC2339e6.isLoggable(enumC2341g3, str15)) {
                    c2345kM43680n6.f9274b.log(enumC2341g3, str15, str3, null);
                }
            }
            builder.setContentTitle(application2.getString(R.string.stream_video_ongoing_call_notification_title));
            builder.setContentText(application2.getString(R.string.stream_video_ongoing_call_notification_description));
            NotificationCompat.Builder ongoing = builder.setAutoCancel(false).setOngoing(true);
            AbstractC22676k.m65749i(ongoing, "setOngoing(...)");
            if (str == null) {
                string = application2.getString(R.string.stream_video_ongoing_call_notification_title);
                AbstractC22676k.m65749i(string, "getString(...)");
            } else {
                string = str;
            }
            m43665k(abstractC15473j, ongoing, pendingIntentM921I, string, size);
            abstractC15473j.f58114F.getClass();
            C15480q c15480q = abstractC15473j.f58115G;
            c15471h.f58105L = 4;
            c15480q.getClass();
            obj2 = builder;
            if (builder == enumC31071a2) {
                return enumC31071a2;
            }
            Notification notificationBuild3 = ((NotificationCompat.Builder) obj2).build();
            AbstractC22676k.m65749i(notificationBuild3, str4);
            return notificationBuild3;
        }
        C2345k c2345kM43680n7 = abstractC15473j.m43680n();
        InterfaceC2339e interfaceC2339e7 = c2345kM43680n7.f9275c;
        String str16 = c2345kM43680n7.f9273a;
        if (interfaceC2339e7.isLoggable(enumC2341g, str16)) {
            c2345kM43680n7.f9274b.log(enumC2341g, str16, AbstractC11266d.m30461o("[getMinimalMediaStyleNotification] callId: ", streamCallIdM55786a2.getId()), null);
        }
        PendingIntent pendingIntentM922K2 = c0352d.m922K(streamCallIdM55786a2, streamCallIdM55786a2.hashCode(), c25272z);
        C15476m c15476m2 = c15477n.f58133b;
        C15476m c15476m3 = c15477n.f58133b;
        AbstractC15464a.m43659a(c15476m2, notificationManagerCompat);
        C1082p c1082pM43664b2 = c15468e3.m43664b(application2, streamCallIdM55786a2, c15476m3.f58128a);
        C1064c c1064c = new C1064c();
        C1082p c1082pM43664b3 = c15468e3.m43664b(application2, streamCallIdM55786a, c15476m3.f58128a);
        str5 = "getApplicationContext(...)";
        AbstractC22676k.m65749i(application2.getApplicationContext(), str5);
        c15471h2 = c15471h;
        c15471h2.f58106w = abstractC15473j;
        c15471h2.f58107x = c33368c0;
        c15471h2.f58108y = str;
        c15471h2.f58109z = c25272z;
        c15471h2.f58098E = streamCallIdM55786a;
        c15471h2.f58099F = streamCallIdM55786a2;
        c15471h2.f58100G = abstractC15473j;
        c15471h2.f58101H = pendingIntentM922K2;
        c15471h2.f58102I = c1082pM43664b2;
        c15471h2.f58105L = 1;
        Object objM43661c = C15468e.m43661c(c15468e3, c1082pM43664b3, c33368c0, c1064c, c15471h2);
        enumC31071a = enumC31071a2;
        if (objM43661c == enumC31071a) {
            return enumC31071a;
        }
        pendingIntent = pendingIntentM922K2;
        c1082p = c1082pM43664b2;
        str6 = str;
        callId = streamCallIdM55786a2;
        abstractC15473j2 = abstractC15473j;
        abstractC15473j3 = abstractC15473j2;
        c33368c1 = c33368c0;
        callId2 = streamCallIdM55786a;
        payload = c25272z;
        c1085s = new C1085s();
        C15468e c15468e4 = abstractC15473j3.f58117I;
        Application application3 = abstractC15473j3.f58124w;
        c1082pM43664b = c15468e4.m43664b(application3, callId2, abstractC15473j3.f58116H.f58133b.f58128a);
        c15468e = abstractC15473j3.f58117I;
        AbstractC22676k.m65749i(application3.getApplicationContext(), str5);
        c15471h2.f58106w = abstractC15473j3;
        c15471h2.f58107x = c33368c1;
        c15471h2.f58108y = str6;
        c15471h2.f58109z = payload;
        c15471h2.f58098E = callId2;
        c15471h2.f58099F = callId;
        c15471h2.f58100G = abstractC15473j2;
        c15471h2.f58101H = pendingIntent;
        c15471h2.f58102I = c1082p;
        c15471h2.f58105L = 2;
        c15468e.getClass();
        if (C15468e.m43662d(c15468e, c1082pM43664b, c33368c1, c1085s, c15471h2) == enumC31071a) {
            return enumC31071a;
        }
        abstractC15473j4 = abstractC15473j3;
        C15474k c15474k = abstractC15473j2.f58114F;
        Application application4 = abstractC15473j2.f58124w;
        C32252e c32252e = new C32252e();
        c15474k.getClass();
        AbstractC22676k.m65750j(callId, "callId");
        c32252e.f133498a = c1082p.f4206a.f4198b;
        C15476m c15476m4 = abstractC15473j2.f58116H.f58133b;
        String str17 = c15476m4.f58128a;
        C2345k c2345kM43680n8 = abstractC15473j2.m43680n();
        InterfaceC2339e interfaceC2339e8 = c2345kM43680n8.f9275c;
        String str18 = c2345kM43680n8.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e8.isLoggable(enumC2341g4, str18)) {
            c2345kM43680n8.f9274b.log(enumC2341g4, str18, str7.concat(str17), null);
        }
        AbstractC15464a.m43659a(c15476m4, abstractC15473j2.f58125x);
        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(application4, str17);
        if (pendingIntent != null) {
            builder2.setContentIntent(pendingIntent);
        } else {
            C2345k c2345kM43680n9 = abstractC15473j2.m43680n();
            InterfaceC2339e interfaceC2339e9 = c2345kM43680n9.f9275c;
            String str19 = c2345kM43680n9.f9273a;
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339e9.isLoggable(enumC2341g5, str19)) {
                c2345kM43680n9.f9274b.log(enumC2341g5, str19, str3, null);
            }
        }
        builder2.setContentTitle(application4.getString(R.string.stream_video_livestream_notification_title));
        builder2.setContentText(application4.getString(R.string.stream_video_livestream_notification_title));
        builder2.setAutoCancel(false);
        builder2.setShowWhen(false);
        builder2.setOngoing(true);
        builder2.setSmallIcon(R.drawable.stream_video_ic_live_notification).setStyle(c32252e);
        abstractC15473j4.f58114F.getClass();
        AbstractC22676k.m65750j(callId2, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        C15480q c15480q2 = abstractC15473j4.f58115G;
        c15471h2.f58106w = null;
        c15471h2.f58107x = null;
        c15471h2.f58108y = null;
        c15471h2.f58109z = null;
        c15471h2.f58098E = null;
        c15471h2.f58099F = null;
        c15471h2.f58100G = null;
        c15471h2.f58101H = null;
        c15471h2.f58102I = null;
        c15471h2.f58105L = 3;
        c15480q2.getClass();
        EnumC31071a enumC31071a3 = enumC31071a;
        if (builder2 == enumC31071a3) {
            return enumC31071a3;
        }
        obj = builder2;
        Notification notificationBuild4 = ((NotificationCompat.Builder) obj).build();
        AbstractC22676k.m65749i(notificationBuild4, str2);
        return notificationBuild4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: s */
    public static Object m43669s(AbstractC15473j abstractC15473j, C33368c0 c33368c0, String str, AbstractC32269c abstractC32269c) {
        C15472i c15472i;
        C2345k c2345kM43680n;
        String str2;
        EnumC2341g enumC2341g;
        C0352d c0352d = abstractC15473j.f58127z;
        if (abstractC32269c instanceof C15472i) {
            c15472i = (C15472i) abstractC32269c;
            int i13 = c15472i.f58112y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15472i.f58112y = i13 - Integer.MIN_VALUE;
            } else {
                c15472i = new C15472i(abstractC15473j, abstractC32269c);
            }
        } else {
            c15472i = new C15472i(abstractC15473j, abstractC32269c);
        }
        Object obj = c15472i.f58110w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15472i.f58112y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k c2345kM43680n2 = abstractC15473j.m43680n();
            Application application = abstractC15473j.f58124w;
            C15477n c15477n = abstractC15473j.f58116H;
            boolean z4 = abstractC15473j.f58113E;
            InterfaceC2339e interfaceC2339e = c2345kM43680n2.f9275c;
            String str3 = c2345kM43680n2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g2, str3)) {
                c2345kM43680n2.f9274b.log(enumC2341g2, str3, AbstractC31061c.m95640p("[updateOutgoingCallNotification] callId: ", c33368c0.f139308v, ", callDisplayName: ", str), null);
            }
            C33450s0 c33450s0 = c33368c0.f139302p;
            String str4 = c33368c0.f139308v;
            InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c33450s0.f139618G.getValue();
            StreamCallId.Companion.getClass();
            StreamCallId streamCallIdM55786a = C19971b.m55786a(str4);
            C2345k c2345kM43680n3 = abstractC15473j.m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n3.f9275c;
            String str5 = c2345kM43680n3.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
                InterfaceC2344j interfaceC2344j = c2345kM43680n3.f9274b;
                String id4 = streamCallIdM55786a.getId();
                StringBuilder sb4 = new StringBuilder("[getRingingCallNotificationInternal] callId: ");
                sb4.append(id4);
                sb4.append(", ringingState: ");
                sb4.append(interfaceC33377d3);
                sb4.append(", callDisplayName: ");
                interfaceC2344j.log(enumC2341g2, str5, AbstractC25012a.m73376i(str, ", shouldHaveContentIntent: true", sb4), null);
            }
            boolean z13 = interfaceC33377d3 instanceof C33487z2;
            C25272z c25272z = C25272z.f99163w;
            if (z13) {
                PendingIntent pendingIntentM910J = C0352d.m910J(c0352d, streamCallIdM55786a, c25272z);
                PendingIntent pendingIntentM909F = C0352d.m909F(c0352d, streamCallIdM55786a, c25272z);
                PendingIntent pendingIntentM924M = c0352d.m924M(streamCallIdM55786a, c25272z);
                if (pendingIntentM910J == null || pendingIntentM909F == null || pendingIntentM924M == null) {
                    c2345kM43680n = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e3 = c2345kM43680n.f9275c;
                    str2 = c2345kM43680n.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (!interfaceC2339e3.isLoggable(enumC2341g, str2)) {
                        return null;
                    }
                } else {
                    C2345k c2345kM43680n4 = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e4 = c2345kM43680n4.f9275c;
                    String str6 = c2345kM43680n4.f9273a;
                    if (interfaceC2339e4.isLoggable(enumC2341g2, str6)) {
                        c2345kM43680n4.f9274b.log(enumC2341g2, str6, AbstractC11895b.m31996o("[getIncomingCallNotificationInternal] callerName: ", str, ", shouldHaveContentIntent: true"), null);
                    }
                    C15476m c15476m = (AbstractC35902e.m113939G() && z4) ? c15477n.f58137f : c15477n.f58132a;
                    String str7 = c15476m.f58128a;
                    C2345k c2345kM43680n5 = abstractC15473j.m43680n();
                    InterfaceC2339e interfaceC2339e5 = c2345kM43680n5.f9275c;
                    String str8 = c2345kM43680n5.f9273a;
                    if (interfaceC2339e5.isLoggable(enumC2341g2, str8)) {
                        c2345kM43680n5.f9274b.log(enumC2341g2, str8, "[ensureChannelAndBuildNotification] channelId: ".concat(str7), null);
                    }
                    AbstractC15464a.m43659a(c15476m, abstractC15473j.f58125x);
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str7);
                    builder.setPriority(z4 ? -1 : 2);
                    builder.setContentTitle(str);
                    builder.setContentText(application.getString(R.string.stream_video_incoming_call_notification_description));
                    builder.setSmallIcon(R.drawable.stream_video_ic_call);
                    builder.setChannelId(str7);
                    builder.setOngoing(true);
                    builder.setCategory(NotificationCompat.CATEGORY_CALL);
                    builder.setFullScreenIntent(pendingIntentM910J, true);
                    builder.setContentIntent(pendingIntentM910J);
                    abstractC15473j.m43678l(builder, pendingIntentM909F, pendingIntentM924M, str);
                    C15474k c15474k = abstractC15473j.f58114F;
                    InterfaceC33377d3 ringingState = (InterfaceC33377d3) c33368c0.f139302p.f139618G.getValue();
                    C19971b.m55786a(str4);
                    c15474k.getClass();
                    AbstractC22676k.m65750j(ringingState, "ringingState");
                    C15480q c15480q = abstractC15473j.f58115G;
                    c15472i.f58112y = 1;
                    c15480q.getClass();
                    if (builder == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = builder;
                }
            } else {
                if (!(interfaceC33377d3 instanceof C33359a3)) {
                    return null;
                }
                PendingIntent pendingIntentM923L = c0352d.m923L(streamCallIdM55786a, streamCallIdM55786a.getNotificationId(C12717i.f43512b), c25272z);
                PendingIntent pendingIntentM921I = c0352d.m921I(streamCallIdM55786a, c25272z);
                if (pendingIntentM923L != null && pendingIntentM921I != null) {
                    return abstractC15473j.mo43670a(streamCallIdM55786a, str, (8 & 4) == 0, c25272z);
                }
                c2345kM43680n = abstractC15473j.m43680n();
                InterfaceC2339e interfaceC2339e6 = c2345kM43680n.f9275c;
                str2 = c2345kM43680n.f9273a;
                enumC2341g = EnumC2341g.ERROR;
                if (!interfaceC2339e6.isLoggable(enumC2341g, str2)) {
                    return null;
                }
            }
            c2345kM43680n.f9274b.log(enumC2341g, str2, "Ringing call notification not shown, one of the intents is null.", null);
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        Notification notificationBuild = ((NotificationCompat.Builder) obj).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: a */
    public final Notification mo43670a(StreamCallId callId, String str, boolean z4, Map payload) {
        String string;
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM43680n.f9274b.log(enumC2341g, str2, AbstractC18489d0.m53372m(AbstractC11895b.m32001t("[getOngoingCallNotification] callId: ", callId.getId(), ", callDisplayName: ", str, ", isOutgoingCall: "), z4, ", remoteParticipantCount: 0"), null);
        }
        C2345k c2345kM43680n2 = m43680n();
        InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
        String str3 = c2345kM43680n2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
            c2345kM43680n2.f9274b.log(enumC2341g, str3, AbstractC18489d0.m53372m(AbstractC11895b.m32001t("[getOngoingCallNotificationInternal] callId: ", callId.getId(), ", callDisplayName: ", str, ", isOutgoingCall: "), z4, ", remoteParticipantCount: 0"), null);
        }
        InterfaceC33408j3.f139483t.getClass();
        boolean zContains = ((C33366b4) C33403i3.m105852a()).f139235H.f64767x.f43510h.contains(callId.getType());
        C15474k c15474k = this.f58114F;
        NotificationManagerCompat notificationManagerCompat = this.f58125x;
        C0352d c0352d = this.f58127z;
        C15477n c15477n = this.f58116H;
        Application application = this.f58124w;
        if (!zContains) {
            C2345k c2345kM43680n3 = m43680n();
            InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
            String str4 = c2345kM43680n3.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
                c2345kM43680n3.f9274b.log(enumC2341g, str4, AbstractC18489d0.m53372m(AbstractC11895b.m32001t("[getSimpleOngoingCallNotification] callId: ", callId.getId(), ", callDisplayName: ", str, ", isOutgoingCall: "), z4, ", remoteParticipantCount: 0"), null);
            }
            int iHashCode = callId.hashCode();
            PendingIntent pendingIntentM923L = z4 ? c0352d.m923L(callId, iHashCode, payload) : c0352d.m922K(callId, iHashCode, payload);
            PendingIntent pendingIntentM924M = z4 ? c0352d.m924M(callId, payload) : c0352d.m921I(callId, payload);
            if (pendingIntentM924M == null) {
                C2345k c2345kM43680n4 = m43680n();
                InterfaceC2339e interfaceC2339e4 = c2345kM43680n4.f9275c;
                String str5 = c2345kM43680n4.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (!interfaceC2339e4.isLoggable(enumC2341g2, str5)) {
                    return null;
                }
                c2345kM43680n4.f9274b.log(enumC2341g2, str5, "End call intent is null, not showing notification!", null);
                return null;
            }
            C15476m c15476m = c15477n.f58133b;
            String str6 = c15476m.f58128a;
            C2345k c2345kM43680n5 = m43680n();
            InterfaceC2339e interfaceC2339e5 = c2345kM43680n5.f9275c;
            String str7 = c2345kM43680n5.f9273a;
            if (interfaceC2339e5.isLoggable(enumC2341g, str7)) {
                c2345kM43680n5.f9274b.log(enumC2341g, str7, "[ensureChannelAndBuildNotification] channelId: ".concat(str6), null);
            }
            AbstractC15464a.m43659a(c15476m, notificationManagerCompat);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str6);
            NotificationCompat.Builder smallIcon = builder.setSmallIcon(R.drawable.stream_video_ic_call);
            if (pendingIntentM923L != null) {
                smallIcon.setContentIntent(pendingIntentM923L);
            } else {
                C2345k c2345kM43680n6 = m43680n();
                InterfaceC2339e interfaceC2339e6 = c2345kM43680n6.f9275c;
                String str8 = c2345kM43680n6.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                if (interfaceC2339e6.isLoggable(enumC2341g3, str8)) {
                    c2345kM43680n6.f9274b.log(enumC2341g3, str8, "Ongoing intent is null click on the ongoing call notification will not work.", null);
                }
            }
            builder.setContentTitle(z4 ? application.getString(R.string.stream_video_outgoing_call_notification_title) : application.getString(R.string.stream_video_ongoing_call_notification_title));
            builder.setContentText(application.getString(R.string.stream_video_ongoing_call_notification_description));
            NotificationCompat.Builder ongoing = builder.setAutoCancel(false).setOngoing(true);
            AbstractC22676k.m65749i(ongoing, "setOngoing(...)");
            if (str == null) {
                string = application.getString(R.string.stream_video_ongoing_call_notification_title);
                AbstractC22676k.m65749i(string, "getString(...)");
            } else {
                string = str;
            }
            m43665k(this, ongoing, pendingIntentM924M, string, 0);
            c15474k.getClass();
            Notification notificationBuild = builder.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            return notificationBuild;
        }
        C2345k c2345kM43680n7 = m43680n();
        InterfaceC2339e interfaceC2339e7 = c2345kM43680n7.f9275c;
        String str9 = c2345kM43680n7.f9273a;
        if (interfaceC2339e7.isLoggable(enumC2341g, str9)) {
            c2345kM43680n7.f9274b.log(enumC2341g, str9, AbstractC11266d.m30461o("[getMinimalMediaStyleNotification] callId: ", callId.getId()), null);
        }
        PendingIntent pendingIntentM922K = c0352d.m922K(callId, callId.hashCode(), payload);
        C15476m c15476m2 = c15477n.f58133b;
        C15476m c15476m3 = c15477n.f58133b;
        AbstractC15464a.m43659a(c15476m2, notificationManagerCompat);
        String str10 = c15476m3.f58128a;
        C15468e c15468e = this.f58117I;
        C1082p c1082pM43664b = c15468e.m43664b(application, callId, str10);
        C23470p c23470p = c15468e.f58092a;
        Bundle bundle = new Bundle();
        C1082p c1082pM43664b2 = c15468e.m43664b(application, callId, c15476m3.f58128a);
        AbstractC22676k.m65749i(application.getApplicationContext(), "getApplicationContext(...)");
        C2345k c2345k = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e8 = c2345k.f9275c;
        String str11 = c2345k.f9273a;
        if (interfaceC2339e8.isLoggable(enumC2341g, str11)) {
            c2345k.f9274b.log(enumC2341g, str11, "[initialMetadata] Updating media metadata for session: " + c1082pM43664b2, null);
        }
        C0022g c0022g = MediaMetadataCompat.f4149y;
        if (c0022g.containsKey("android.media.metadata.DURATION") && ((Integer) c0022g.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        bundle.putLong("android.media.metadata.DURATION", -1L);
        c1082pM43664b2.m3220b(new MediaMetadataCompat(bundle));
        ArrayList arrayList = new ArrayList();
        C1082p c1082pM43664b3 = c15468e.m43664b(application, callId, c15476m3.f58128a);
        AbstractC22676k.m65749i(application.getApplicationContext(), "getApplicationContext(...)");
        C2345k c2345k2 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e9 = c2345k2.f9275c;
        String str12 = c2345k2.f9273a;
        if (interfaceC2339e9.isLoggable(enumC2341g, str12)) {
            c2345k2.f9274b.log(enumC2341g, str12, "[initialPlaybackState] Updating media metadata for session: " + c1082pM43664b3, null);
        }
        c1082pM43664b3.m3221c(new PlaybackStateCompat(0, -1L, 0L, 1.0f, 0L, 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        C32252e c32252e = new C32252e();
        c15474k.getClass();
        c32252e.f133498a = c1082pM43664b.f4206a.f4198b;
        String str13 = c15476m3.f58128a;
        C2345k c2345kM43680n8 = m43680n();
        InterfaceC2339e interfaceC2339e10 = c2345kM43680n8.f9275c;
        String str14 = c2345kM43680n8.f9273a;
        if (interfaceC2339e10.isLoggable(enumC2341g, str14)) {
            c2345kM43680n8.f9274b.log(enumC2341g, str14, "[ensureChannelAndBuildNotification] channelId: ".concat(str13), null);
        }
        AbstractC15464a.m43659a(c15476m3, notificationManagerCompat);
        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(application, str13);
        if (pendingIntentM922K != null) {
            builder2.setContentIntent(pendingIntentM922K);
        } else {
            C2345k c2345kM43680n9 = m43680n();
            InterfaceC2339e interfaceC2339e11 = c2345kM43680n9.f9275c;
            String str15 = c2345kM43680n9.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e11.isLoggable(enumC2341g4, str15)) {
                c2345kM43680n9.f9274b.log(enumC2341g4, str15, "Ongoing intent is null click on the ongoing call notification will not work.", null);
            }
        }
        builder2.setContentTitle(application.getString(R.string.stream_video_livestream_notification_title));
        builder2.setContentText(application.getString(R.string.stream_video_livestream_notification_title));
        builder2.setAutoCancel(false);
        builder2.setShowWhen(false);
        builder2.setOngoing(true);
        builder2.setSmallIcon(R.drawable.stream_video_ic_live_notification).setStyle(c32252e);
        Notification notificationBuild2 = builder2.build();
        AbstractC22676k.m65749i(notificationBuild2, "build(...)");
        return notificationBuild2;
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: b */
    public final void mo43671b(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM43680n.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[onLiveCall] callId: ", callId.getId(), ", callDisplayName: ", callDisplayName), null);
        }
        int iHashCode = callId.hashCode();
        C0352d c0352d = this.f58127z;
        c0352d.getClass();
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.LIVE_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        PendingIntent pendingIntentM919G = c0352d.m919G(intentPutExtras, callId, iHashCode);
        if (pendingIntentM919G == null) {
            C2345k c2345kM43680n2 = m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
            String str2 = c2345kM43680n2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM43680n2.f9274b.log(enumC2341g2, str2, "Couldn't find any activity for io.getstream.video.android.action.LIVE_CALL", null);
            }
            pendingIntentM919G = c0352d.m943p(payload);
        }
        C15477n c15477n = this.f58116H;
        C15476m c15476m = c15477n.f58132a;
        String str3 = c15476m.f58128a;
        C2345k c2345kM43680n3 = m43680n();
        InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
        String str4 = c2345kM43680n3.f9273a;
        if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
            c2345kM43680n3.f9274b.log(enumC2341g, str4, "[ensureChannelAndBuildNotification] channelId: ".concat(str3), null);
        }
        AbstractC15464a.m43659a(c15476m, this.f58125x);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f58124w, str3);
        builder.setContentTitle(callDisplayName);
        builder.setChannelId(c15477n.f58132a.f58128a);
        builder.setCategory(NotificationCompat.CATEGORY_STATUS);
        builder.setContentIntent(pendingIntentM919G);
        NotificationCompat.Builder ongoing = builder.setOngoing(false);
        AbstractC22676k.m65749i(ongoing, "setOngoing(...)");
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        m43681p(iHashCode, notificationBuild, callId);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // g43.InterfaceC15481r
    /* JADX INFO: renamed from: e */
    public final Object mo43672e(C33368c0 c33368c0, C26288d c26288d) {
        String string;
        C13045h2 c13045h2;
        String strM43666o;
        C33450s0 c33450s0 = c33368c0.f139302p;
        String str = c33368c0.f139308v;
        InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c33450s0.f139618G.getValue();
        List list = (List) ((AbstractC22680m) c33450s0.f139684x.f104635y).invoke();
        List list2 = (List) ((InterfaceC13037f2) c33450s0.f139666o.getValue()).getValue();
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM43680n.f9274b.log(enumC2341g, str2, "[onCallNotificationUpdate] #ringingState: " + interfaceC33377d3 + "; callId: " + str, null);
        }
        C2345k c2345kM43680n2 = m43680n();
        InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
        String str3 = c2345kM43680n2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
            c2345kM43680n2.f9274b.log(enumC2341g, str3, "[onCallNotificationUpdate] #members: " + list + "; callId: " + str, null);
        }
        C2345k c2345kM43680n3 = m43680n();
        InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
        String str4 = c2345kM43680n3.f9273a;
        if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
            c2345kM43680n3.f9274b.log(enumC2341g, str4, "[onCallNotificationUpdate] #remoteParticipants: " + list2 + "; callId: " + str, null);
        }
        boolean z4 = interfaceC33377d3 instanceof C33359a3;
        Application application = this.f58124w;
        if (z4) {
            C2345k c2345kM43680n4 = m43680n();
            InterfaceC2339e interfaceC2339e4 = c2345kM43680n4.f9275c;
            String str5 = c2345kM43680n4.f9273a;
            if (interfaceC2339e4.isLoggable(enumC2341g, str5)) {
                c2345kM43680n4.f9274b.log(enumC2341g, str5, "[onCallNotificationUpdate] Handling outgoing call", null);
            }
            String string2 = list.size() - 1 != 1 ? application.getString(R.string.stream_video_outgoing_call_notification_title) : m43666o(c33368c0, list);
            AbstractC22676k.m65747g(string2);
            return m43669s(this, c33368c0, m43679m(c33368c0, string2), c26288d);
        }
        if (interfaceC33377d3 instanceof C33487z2) {
            C2345k c2345kM43680n5 = m43680n();
            InterfaceC2339e interfaceC2339e5 = c2345kM43680n5.f9275c;
            String str6 = c2345kM43680n5.f9273a;
            if (interfaceC2339e5.isLoggable(enumC2341g, str6)) {
                c2345kM43680n5.f9274b.log(enumC2341g, str6, "[onCallNotificationUpdate] Handling incoming call", null);
            }
            User user = (User) c33450s0.f139651g0.getValue();
            if (user == null || (strM43666o = user.getName()) == null) {
                strM43666o = m43666o(c33368c0, list);
            }
            C2345k c2345kM43680n6 = m43680n();
            InterfaceC2339e interfaceC2339e6 = c2345kM43680n6.f9275c;
            String str7 = c2345kM43680n6.f9273a;
            if (interfaceC2339e6.isLoggable(enumC2341g, str7)) {
                c2345kM43680n6.f9274b.log(enumC2341g, str7, AbstractC31061c.m95640p("[getIncomingCallDisplayName] baseName = ", strM43666o, ", getCustomDisplayNameOrDefault(..) = ", m43679m(c33368c0, strM43666o)), null);
            }
            String strM43679m = m43679m(c33368c0, strM43666o);
            C2345k c2345kM43680n7 = m43680n();
            InterfaceC2339e interfaceC2339e7 = c2345kM43680n7.f9275c;
            String str8 = c2345kM43680n7.f9273a;
            if (interfaceC2339e7.isLoggable(enumC2341g, str8)) {
                c2345kM43680n7.f9274b.log(enumC2341g, str8, "[onCallNotificationUpdate] Incoming call from: ".concat(strM43679m), null);
            }
            return m43667q(this, c33368c0, strM43679m, c26288d);
        }
        if (!(interfaceC33377d3 instanceof C33477x2)) {
            C2345k c2345kM43680n8 = m43680n();
            InterfaceC2339e interfaceC2339e8 = c2345kM43680n8.f9275c;
            String str9 = c2345kM43680n8.f9273a;
            if (interfaceC2339e8.isLoggable(enumC2341g, str9)) {
                c2345kM43680n8.f9274b.log(enumC2341g, str9, "[onCallNotificationUpdate] Unhandled ringing state: " + interfaceC33377d3, null);
            }
            return null;
        }
        C2345k c2345kM43680n9 = m43680n();
        InterfaceC2339e interfaceC2339e9 = c2345kM43680n9.f9275c;
        String str10 = c2345kM43680n9.f9273a;
        if (interfaceC2339e9.isLoggable(enumC2341g, str10)) {
            c2345kM43680n9.f9274b.log(enumC2341g, str10, "[onCallNotificationUpdate] Handling active call", null);
        }
        if (list2.isEmpty()) {
            string = application.getString(R.string.stream_video_ongoing_call_notification_title);
            AbstractC22676k.m65749i(string, "getString(...)");
        } else if (list2.size() > 1) {
            string = application.getString(R.string.stream_video_ongoing_group_call_notification_title);
            AbstractC22676k.m65749i(string, "getString(...)");
        } else {
            C33392g2 c33392g2 = (C33392g2) AbstractC25265s.m74100H0(list2);
            if (c33392g2 == null || (c13045h2 = c33392g2.f139443v) == null || (string = (String) c13045h2.getValue()) == null) {
                string = "Unknown";
            }
        }
        return m43668r(this, c33368c0, string, c26288d);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: f */
    public final void mo43673f(StreamCallId callId, String callDisplayName, Map payload) {
        String str;
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM43680n.f9273a)) {
            c2345kM43680n.f9274b.log(enumC2341g, c2345kM43680n.f9273a, AbstractC11266d.m30461o("[onMissedCall] #ringing; callId: ", callId.getId()), null);
        }
        C12718j c12718j = C12718j.f43513b;
        int notificationId = callId.getNotificationId(c12718j);
        C15477n c15477n = this.f58116H;
        C0352d c0352d = this.f58127z;
        Application application = this.f58124w;
        C2345k c2345kM43680n2 = m43680n();
        if (c2345kM43680n2.f9275c.isLoggable(enumC2341g, c2345kM43680n2.f9273a)) {
            c2345kM43680n2.f9274b.log(enumC2341g, c2345kM43680n2.f9273a, AbstractC31061c.m95640p("[getMissedCallNotification] callId: ", callId.getId(), ", callDisplayName: ", callDisplayName), null);
        }
        int notificationId2 = callId.getNotificationId(c12718j);
        c0352d.getClass();
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.MISSED_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        PendingIntent pendingIntentM919G = c0352d.m919G(intentPutExtras, callId, notificationId2);
        if (pendingIntentM919G == null) {
            pendingIntentM919G = c0352d.m943p(payload);
        }
        C15476m c15476m = (AbstractC35902e.m113939G() && this.f58113E) ? c15477n.f58136e : c15477n.f58135d;
        String string = application.getString(R.string.stream_video_missed_call_notification_description, callDisplayName);
        C2345k c2345kM43680n3 = m43680n();
        if (c2345kM43680n3.f9275c.isLoggable(enumC2341g, c2345kM43680n3.f9273a)) {
            c2345kM43680n3.f9274b.log(enumC2341g, c2345kM43680n3.f9273a, "[ensureChannelAndBuildNotification] channelId: ".concat(c15476m.f58128a), null);
        }
        AbstractC15464a.m43659a(c15476m, this.f58125x);
        String str2 = c15476m.f58128a;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str2);
        builder.setSmallIcon(R.drawable.stream_video_ic_call);
        builder.setChannelId(str2);
        builder.setContentTitle(application.getString(R.string.stream_video_missed_call_notification_title));
        builder.setContentText(string);
        builder.setContentIntent(pendingIntentM919G).setAutoCancel(true);
        this.f58114F.getClass();
        Notification notificationBuild = builder.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        m43681p(notificationId, notificationBuild, callId);
        try {
            Object obj = payload.get("created_by_id");
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj;
        } catch (Exception unused) {
            str = r4;
        }
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        if (interfaceC33408j3 != null) {
            ((C33366b4) interfaceC33408j3).m105797o(new LocalCallMissedEvent(callId.getCid(), str), "");
        }
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: g */
    public final Notification mo43674g(InterfaceC33377d3 interfaceC33377d3, StreamCallId callId, String str, boolean z4, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM43680n.f9273a)) {
            c2345kM43680n.f9274b.log(enumC2341g, c2345kM43680n.f9273a, "[getRingingCallNotification] callId: " + callId.getId() + ", ringingState: " + interfaceC33377d3 + ", callDisplayName: " + str + ", shouldHaveContentIntent: " + z4, null);
        }
        if (interfaceC33377d3 instanceof C33487z2) {
            PendingIntent pendingIntentM910J = C0352d.m910J(this.f58127z, callId, payload);
            PendingIntent pendingIntentM909F = C0352d.m909F(this.f58127z, callId, payload);
            PendingIntent pendingIntentM924M = this.f58127z.m924M(callId, payload);
            InterfaceC33408j3.f139483t.getClass();
            InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
            if (interfaceC33408j3 != null) {
                C33368c0 c33368c0M105796n = ((C33366b4) interfaceC33408j3).m105796n(callId.getType(), callId.getId());
                HashMap map = new HashMap();
                if (pendingIntentM909F != null) {
                    map.put(C12712d.f43500a, pendingIntentM909F);
                }
                if (pendingIntentM924M != null) {
                    map.put(C12713e.f43501a, pendingIntentM924M);
                }
                c33368c0M105796n.f139302p.getClass();
            }
            if (pendingIntentM910J != null && pendingIntentM909F != null && pendingIntentM924M != null) {
                C15477n c15477n = this.f58116H;
                boolean z13 = this.f58113E;
                Application application = this.f58124w;
                C2345k c2345kM43680n2 = m43680n();
                if (c2345kM43680n2.f9275c.isLoggable(enumC2341g, c2345kM43680n2.f9273a)) {
                    c2345kM43680n2.f9274b.log(enumC2341g, c2345kM43680n2.f9273a, AbstractC11478a.m30857i("[getIncomingCallNotification] callerName: ", str, ", shouldHaveContentIntent: ", z4), null);
                }
                C2345k c2345kM43680n3 = m43680n();
                if (c2345kM43680n3.f9275c.isLoggable(enumC2341g, c2345kM43680n3.f9273a)) {
                    c2345kM43680n3.f9274b.log(enumC2341g, c2345kM43680n3.f9273a, AbstractC11478a.m30857i("[getIncomingCallNotificationInternal] callerName: ", str, ", shouldHaveContentIntent: ", z4), null);
                }
                C15476m c15476m = (AbstractC35902e.m113939G() && z13) ? c15477n.f58137f : c15477n.f58132a;
                C2345k c2345kM43680n4 = m43680n();
                if (c2345kM43680n4.f9275c.isLoggable(enumC2341g, c2345kM43680n4.f9273a)) {
                    c2345kM43680n4.f9274b.log(enumC2341g, c2345kM43680n4.f9273a, "[ensureChannelAndBuildNotification] channelId: ".concat(c15476m.f58128a), null);
                }
                AbstractC15464a.m43659a(c15476m, this.f58125x);
                String str2 = c15476m.f58128a;
                NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str2);
                builder.setPriority(z13 ? -1 : 2);
                builder.setContentTitle(str);
                builder.setContentText(application.getString(R.string.stream_video_incoming_call_notification_description));
                builder.setSmallIcon(R.drawable.stream_video_ic_call);
                builder.setChannelId(str2);
                builder.setOngoing(true);
                builder.setCategory(NotificationCompat.CATEGORY_CALL);
                builder.setFullScreenIntent(pendingIntentM910J, true);
                if (z4) {
                    builder.setContentIntent(pendingIntentM910J);
                } else {
                    builder.setContentIntent(PendingIntent.getActivity(application, 0, new Intent(), 67108864));
                    builder.setAutoCancel(false);
                }
                m43678l(builder, pendingIntentM909F, pendingIntentM924M, str);
                this.f58114F.getClass();
                Notification notificationBuild = builder.build();
                AbstractC22676k.m65749i(notificationBuild, "build(...)");
                return notificationBuild;
            }
            C2345k c2345kM43680n5 = m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n5.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM43680n5.f9273a)) {
                c2345kM43680n5.f9274b.log(enumC2341g2, c2345kM43680n5.f9273a, "Ringing call notification not shown, one of the intents is null.", null);
                return null;
            }
        } else if (interfaceC33377d3 instanceof C33359a3) {
            PendingIntent pendingIntentM923L = this.f58127z.m923L(callId, callId.getNotificationId(C12717i.f43512b), payload);
            PendingIntent pendingIntentM921I = this.f58127z.m921I(callId, payload);
            if (pendingIntentM923L != null && pendingIntentM921I != null) {
                return mo43670a(callId, str, (8 & 4) == 0, payload);
            }
            C2345k c2345kM43680n6 = m43680n();
            InterfaceC2339e interfaceC2339e3 = c2345kM43680n6.f9275c;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM43680n6.f9273a)) {
                c2345kM43680n6.f9274b.log(enumC2341g3, c2345kM43680n6.f9273a, "Ringing call notification not shown, one of the intents is null.", null);
            }
        }
        return null;
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: h */
    public final void mo43675h(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM43680n.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[onNotification] callId: ", callId.getId(), ", callDisplayName: ", callDisplayName), null);
        }
        int iHashCode = callId.hashCode();
        C0352d c0352d = this.f58127z;
        c0352d.getClass();
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.NOTIFICATION").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        if (c0352d.m919G(intentPutExtras, callId, iHashCode) == null) {
            C2345k c2345kM43680n2 = m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
            String str2 = c2345kM43680n2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM43680n2.f9274b.log(enumC2341g2, str2, "Couldn't find any activity for io.getstream.video.android.action.NOTIFICATION", null);
            }
        }
        C15477n c15477n = this.f58116H;
        C15476m c15476m = c15477n.f58133b;
        String str3 = c15476m.f58128a;
        C2345k c2345kM43680n3 = m43680n();
        InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
        String str4 = c2345kM43680n3.f9273a;
        if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
            c2345kM43680n3.f9274b.log(enumC2341g, str4, "[ensureChannelAndBuildNotification] channelId: ".concat(str3), null);
        }
        AbstractC15464a.m43659a(c15476m, this.f58125x);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f58124w, str3);
        builder.setContentTitle(callDisplayName);
        builder.setChannelId(c15477n.f58133b.f58128a);
        builder.setCategory(NotificationCompat.CATEGORY_STATUS);
        NotificationCompat.Builder ongoing = builder.setOngoing(false);
        AbstractC22676k.m65749i(ongoing, "setOngoing(...)");
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        m43681p(iHashCode, notificationBuild, callId);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: i */
    public final void mo43676i(StreamCallId callId, String callDisplayName, Map payload) {
        CallSettingsResponse callSettingsResponse;
        VideoSettingsResponse video;
        Object c26203f;
        EnumC21324h enumC21324hM92820u;
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM43680n.f9273a)) {
            c2345kM43680n.f9274b.log(enumC2341g, c2345kM43680n.f9273a, AbstractC11266d.m30461o("[onRingingCall] #ringing; callId: ", callId.getId()), null);
        }
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3M105852a = C33403i3.m105852a();
        C33366b4 c33366b4 = (C33366b4) interfaceC33408j3M105852a;
        C11585c callBusyHandler = c33366b4.f139249V;
        String callCid = callId.getCid();
        AbstractC22676k.m65750j(callBusyHandler, "callBusyHandler");
        AbstractC22676k.m65750j(callCid, "callCid");
        EnumC11579a enumC11579a = EnumC11579a.f37356w;
        if (c33366b4.f139238K.m9548b(callId.getType()).f81521a) {
            C0332w0 c0332w0 = this.f58121M;
            Application context = this.f58124w;
            C21319c c21319cM9548b = ((C33366b4) interfaceC33408j3M105852a).f139248U.f139406i.m9548b(callId.getType());
            if (payload.containsKey("video")) {
                AbstractC22676k.m65745e(payload.get("video"), Boolean.TRUE);
            } else {
                InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
                C33368c0 c33368c0M105796n = interfaceC33408j3 != null ? ((C33366b4) interfaceC33408j3).m105796n(callId.getType(), callId.getId()) : null;
                if (c33368c0M105796n != null && (callSettingsResponse = (CallSettingsResponse) c33368c0M105796n.f139302p.f139621J.getValue()) != null && (video = callSettingsResponse.getVideo()) != null) {
                    video.getEnabled();
                }
            }
            Notification notificationMo43674g = mo43674g(new C33487z2(false), callId, callDisplayName, true, payload);
            c0332w0.getClass();
            AbstractC22676k.m65750j(context, "context");
            C30352d c30352d = (C30352d) c0332w0.f1164E;
            c30352d.getClass();
            C2345k c2345kM92818r = c30352d.m92818r();
            if (c2345kM92818r.f9275c.isLoggable(enumC2341g, c2345kM92818r.f9273a)) {
                InterfaceC2344j interfaceC2344j = c2345kM92818r.f9274b;
                String str = c2345kM92818r.f9273a;
                String id4 = callId.getId();
                boolean z4 = notificationMo43674g != null;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[showIncomingCall] callId=", id4, ", callDisplayName=", callDisplayName, ", notification=");
                sbM32001t.append(z4);
                interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
            }
            C21325i c21325i = new C21325i(callId, "incoming_call", callDisplayName, c21319cM9548b);
            EnumC21324h enumC21324hM92811C = EnumC21324h.f81539z;
            try {
                if (c30352d.m92821v()) {
                    C2345k c2345kM92818r2 = c30352d.m92818r();
                    if (c2345kM92818r2.f9275c.isLoggable(enumC2341g, c2345kM92818r2.f9273a)) {
                        c2345kM92818r2.f9274b.log(enumC2341g, c2345kM92818r2.f9273a, "[showIncomingCall] Starting foreground service", null);
                    }
                    AbstractC32122c.startForegroundService(context, ((C21323g) c30352d.f124535x).m59851a(context, c21325i));
                    enumC21324hM92820u = EnumC21324h.f81536w;
                } else {
                    enumC21324hM92820u = c30352d.m92820u(context, c21325i, notificationMo43674g);
                }
                enumC21324hM92811C = enumC21324hM92820u;
                c26203f = new C26204g(C23454a0.f92919a);
            } catch (Exception e5) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                    C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                }
                c26203f = new C26203f(new C26201d(AbstractC11266d.m30461o("Safe call failed with ", e5.getMessage()), e5));
            }
            if (!(c26203f instanceof C26204g)) {
                if (!(c26203f instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2345k c2345kM92818r3 = c30352d.m92818r();
                InterfaceC2339e interfaceC2339e3 = c2345kM92818r3.f9275c;
                EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM92818r3.f9273a)) {
                    c2345kM92818r3.f9274b.log(enumC2341g3, c2345kM92818r3.f9273a, "[showIncomingCall] onError", null);
                }
                enumC21324hM92811C = c30352d.m92811C(context, notificationMo43674g, callId);
            }
            C2345k c2345kM862r = c0332w0.m862r();
            InterfaceC2339e interfaceC2339e4 = c2345kM862r.f9275c;
            EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
            if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM862r.f9273a)) {
                c2345kM862r.f9274b.log(enumC2341g4, c2345kM862r.f9273a, "[showIncomingCall] service start result: " + enumC21324hM92811C, null);
            }
            ((C26702o) c0332w0.f1165F).getClass();
            C26702o.m79409m(c21319cM9548b, context);
        }
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: j */
    public final Notification mo43677j(String str, StreamCallId streamCallId) {
        boolean zEquals = str.equals("incoming_call");
        NotificationManagerCompat notificationManagerCompat = this.f58125x;
        C15477n c15477n = this.f58116H;
        Application application = this.f58124w;
        if (!zEquals) {
            String str2 = c15477n.f58134c.f58128a;
            String string = application.getString(R.string.stream_video_call_setup_notification_title);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = application.getString(R.string.stream_video_call_setup_notification_description);
            AbstractC22676k.m65749i(string2, "getString(...)");
            C15476m c15476m = c15477n.f58134c;
            String str3 = c15476m.f58128a;
            C2345k c2345kM43680n = m43680n();
            InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
            String str4 = c2345kM43680n.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                c2345kM43680n.f9274b.log(enumC2341g, str4, "[ensureChannelAndBuildNotification] channelId: ".concat(str3), null);
            }
            AbstractC15464a.m43659a(c15476m, notificationManagerCompat);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(application, str3);
            builder.setContentTitle(string);
            builder.setContentText(string2);
            builder.setSmallIcon(R.drawable.stream_video_ic_call);
            builder.setChannelId(str2);
            builder.setCategory(NotificationCompat.CATEGORY_CALL);
            NotificationCompat.Builder ongoing = builder.setOngoing(true);
            AbstractC22676k.m65749i(ongoing, "setOngoing(...)");
            Notification notificationBuild = ongoing.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            return notificationBuild;
        }
        String string3 = application.getString(R.string.stream_video_call_setup_notification_title);
        AbstractC22676k.m65749i(string3, "getString(...)");
        String string4 = application.getString(R.string.stream_video_call_setup_notification_description);
        AbstractC22676k.m65749i(string4, "getString(...)");
        boolean zM113939G = AbstractC35902e.m113939G();
        boolean z4 = this.f58113E;
        C15476m c15476m2 = (zM113939G && z4) ? c15477n.f58137f : c15477n.f58132a;
        String str5 = c15476m2.f58128a;
        PendingIntent pendingIntentM910J = C0352d.m910J(this.f58127z, streamCallId, C25272z.f99163w);
        if (pendingIntentM910J == null) {
            C2345k c2345kM43680n2 = m43680n();
            InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
            String str6 = c2345kM43680n2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
                c2345kM43680n2.f9274b.log(enumC2341g2, str6, "[getSettingUpCallNotification] fullScreenPendingIntent is null; lock-screen wake-up may not work.", null);
            }
        }
        C2345k c2345kM43680n3 = m43680n();
        InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
        String str7 = c2345kM43680n3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str7)) {
            c2345kM43680n3.f9274b.log(enumC2341g3, str7, "[ensureChannelAndBuildNotification] channelId: ".concat(str5), null);
        }
        AbstractC15464a.m43659a(c15476m2, notificationManagerCompat);
        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(application, str5);
        builder2.setPriority(z4 ? -1 : 2);
        builder2.setContentTitle(string3);
        builder2.setContentText(string4);
        builder2.setSmallIcon(R.drawable.stream_video_ic_call);
        builder2.setChannelId(str5);
        builder2.setOngoing(true);
        builder2.setCategory(NotificationCompat.CATEGORY_CALL);
        builder2.setFullScreenIntent(pendingIntentM910J, true);
        NotificationCompat.Builder contentIntent = builder2.setContentIntent(pendingIntentM910J);
        AbstractC22676k.m65749i(contentIntent, "setContentIntent(...)");
        Notification notificationBuild2 = contentIntent.build();
        AbstractC22676k.m65749i(notificationBuild2, "build(...)");
        return notificationBuild2;
    }

    /* JADX INFO: renamed from: l */
    public final void m43678l(NotificationCompat.Builder builder, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str) {
        C2345k c2345kM43680n = m43680n();
        InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM43680n.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM43680n.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[addCallActions] callDisplayName: ", str), null);
        }
        if (Build.VERSION.SDK_INT >= 31 && !((ActivityManager) this.f58123O.f60491w.getSystemService(ActivityManager.class)).isBackgroundRestricted()) {
            C32197a c32197a = this.f58122N;
            c32197a.getClass();
            Person.Builder name = new Person.Builder().setName(str == null ? "Unknown" : str);
            if (str == null) {
                name.setIcon(IconCompat.m3680d(c32197a.f133333a, R.drawable.stream_video_ic_user));
            }
            NotificationCompat.CallStyle callStyleForIncomingCall = NotificationCompat.CallStyle.forIncomingCall(name.build(), pendingIntent2, pendingIntent);
            AbstractC22676k.m65749i(callStyleForIncomingCall, "forIncomingCall(...)");
            builder.setStyle(callStyleForIncomingCall);
            return;
        }
        C2345k c2345kM43680n2 = m43680n();
        InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
        String str3 = c2345kM43680n2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
            c2345kM43680n2.f9274b.log(enumC2341g, str3, "[getAcceptAction]", null);
        }
        Application application = this.f58124w;
        NotificationCompat.Action actionBuild = new NotificationCompat.Action.Builder((IconCompat) null, application.getString(R.string.stream_video_call_notification_action_accept), pendingIntent).build();
        AbstractC22676k.m65749i(actionBuild, "build(...)");
        builder.addAction(actionBuild);
        C2345k c2345kM43680n3 = m43680n();
        InterfaceC2339e interfaceC2339e3 = c2345kM43680n3.f9275c;
        String str4 = c2345kM43680n3.f9273a;
        if (interfaceC2339e3.isLoggable(enumC2341g, str4)) {
            c2345kM43680n3.f9274b.log(enumC2341g, str4, "[getRejectAction]", null);
        }
        NotificationCompat.Action actionBuild2 = new NotificationCompat.Action.Builder((IconCompat) null, application.getString(R.string.stream_video_call_notification_action_reject), pendingIntent2).build();
        AbstractC22676k.m65749i(actionBuild2, "build(...)");
        builder.addAction(actionBuild2);
    }

    /* JADX INFO: renamed from: m */
    public final String m43679m(C33368c0 c33368c0, String str) {
        Object obj = c33368c0.f139302p.f139683w0.get();
        Notification notification = obj instanceof Notification ? (Notification) obj : null;
        if (notification != null) {
            CharSequence charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE);
            String string = charSequence != null ? charSequence.toString() : null;
            C2345k c2345kM43680n = m43680n();
            InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
            String str2 = c2345kM43680n.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                InterfaceC2344j interfaceC2344j = c2345kM43680n.f9274b;
                String str3 = c33368c0.f139308v;
                StringBuilder sb4 = new StringBuilder("[getCustomDisplayNameOrDefault] callId: ");
                sb4.append(str3);
                sb4.append(", lastNotification: ");
                sb4.append(notification);
                sb4.append(", title from notification = ");
                interfaceC2344j.log(enumC2341g, str2, AbstractC2875y.m8304q(sb4, string, ", defaultName: ", str), null);
            }
            if (string != null) {
                return string;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: n */
    public final C2345k m43680n() {
        return (C2345k) this.f58120L.getValue();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionDenied() {
        this.f58126y.onPermissionDenied();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionGranted() {
        this.f58126y.onPermissionGranted();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRationale() {
        this.f58126y.onPermissionRationale();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRequested() {
        this.f58126y.onPermissionRequested();
    }

    /* JADX INFO: renamed from: p */
    public final void m43681p(int i13, Notification notification, StreamCallId streamCallId) {
        if (((Number) this.f58119K.invoke(this.f58124w, "android.permission.POST_NOTIFICATIONS")).intValue() != 0) {
            C2345k c2345kM43680n = m43680n();
            InterfaceC2339e interfaceC2339e = c2345kM43680n.f9275c;
            String str = c2345kM43680n.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM43680n.f9274b.log(enumC2341g, str, "[showNotification] Permission not granted, not showing notification.", null);
                return;
            }
            return;
        }
        this.f58118J.m30733C(i13, notification, streamCallId);
        C2345k c2345kM43680n2 = m43680n();
        InterfaceC2339e interfaceC2339e2 = c2345kM43680n2.f9275c;
        String str2 = c2345kM43680n2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM43680n2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(i13, "[showNotification] with notificationId: "), null);
        }
    }
}
