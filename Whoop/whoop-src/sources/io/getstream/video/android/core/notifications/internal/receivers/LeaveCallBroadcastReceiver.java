package io.getstream.video.android.core.notifications.internal.receivers;

import a30.C0323s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import hc3.C17171d;
import io.getstream.video.android.model.C19971b;
import io.getstream.video.android.model.StreamCallId;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23470p;
import p005a3.C0271z0;
import p479s4.AbstractC32126g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import t23.C33368c0;
import t23.C33395h0;
import t23.EnumC33378d4;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;", "<init>", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class LeaveCallBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f74907e = 0;

    /* JADX INFO: renamed from: a */
    public final C23470p f74908a = AbstractC1772c1.m5382S(this, "Call:ActionableReceiver");

    /* JADX INFO: renamed from: b */
    public final C17171d f74909b;

    /* JADX INFO: renamed from: c */
    public final C23470p f74910c;

    /* JADX INFO: renamed from: d */
    public final String f74911d;

    public LeaveCallBroadcastReceiver() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f74909b = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w);
        this.f74910c = AbstractC1772c1.m5382S(this, "Call:LeaveReceiver");
        this.f74911d = "io.getstream.video.android.action.LEAVE_CALL";
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m55779a() {
        return (C2345k) this.f74908a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m55780b(C33368c0 c33368c0, Context context, Intent intent) {
        C23470p c23470p = this.f74910c;
        C2345k c2345k = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[onReceive] #ringing; callId: ", c33368c0.f139289c, ", action: ", intent.getAction()), null);
        }
        Integer num = (Integer) c33368c0.f139302p.f139687y0.getValue();
        C19971b c19971b = StreamCallId.Companion;
        String str2 = c33368c0.f139308v;
        c19971b.getClass();
        int iHashCode = C19971b.m55786a(str2).hashCode();
        c33368c0.m105823p(new C33395h0(EnumC33378d4.LEAVE_FROM_NOTIFICATION, "User left from notification action"));
        C2345k c2345k2 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str3 = c2345k2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
            c2345k2.f9274b.log(enumC2341g, str3, "[onReceive], notificationId: " + num + ", legacyNotificationId: " + iHashCode, null);
        }
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        AbstractC22676k.m65749i(notificationManagerCompatFrom, "from(...)");
        if (num != null) {
            notificationManagerCompatFrom.cancel(num.intValue());
        }
        notificationManagerCompatFrom.cancel(iHashCode);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C2345k c2345kM55779a = m55779a();
        InterfaceC2339e interfaceC2339e = c2345kM55779a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345kM55779a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM55779a.f9274b.log(enumC2341g, str, "[onReceive] #ringing; context: " + context + ", intent: " + intent, null);
        }
        if (context == null || intent == null || intent.getAction() == null) {
            C2345k c2345kM55779a2 = m55779a();
            InterfaceC2339e interfaceC2339e2 = c2345kM55779a2.f9275c;
            String str2 = c2345kM55779a2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM55779a2.f9274b.log(enumC2341g2, str2, "[onReceive] #ringing; Context or Intent or Action is null.", null);
                return;
            }
            return;
        }
        String action = intent.getAction();
        AbstractC22676k.m65747g(action);
        if (AbstractC22676k.m65745e(this.f74911d, action)) {
            StreamCallId streamCallId = (StreamCallId) AbstractC32126g.m100043h(intent, "io.getstream.video.android.intent-extra.call_cid", StreamCallId.class);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            if (streamCallId != null) {
                AbstractC3006f0.m8732z(this.f74909b, null, null, new C0323s(this, action, streamCallId, context, intent, pendingResultGoAsync, null, 4), 3);
                return;
            }
            C2345k c2345kM55779a3 = m55779a();
            C0271z0 c0271z0 = new C0271z0(13, action, "Stream call ID is not provided.");
            InterfaceC2339e interfaceC2339e3 = c2345kM55779a3.f9275c;
            String str3 = c2345kM55779a3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                c2345kM55779a3.f9274b.log(enumC2341g3, str3, (String) c0271z0.invoke(), null);
            }
        }
    }
}
