package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import c12.C3853d;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.service.push.InvalidPushDataException;
import dp0.InterfaceC12251g;
import ep0.C13398d;
import hi0.AbstractC17312j;
import hj0.C17345d;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import m83.C25271y;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import m92.C25324g;
import o92.C27721s;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lcom/whoop/service/push/notifications/b;", "Lm92/b;", "Lo92/s;", "pushContext", "Ldp0/g;", "globalCoachManager", "Liy1/c;", "metricWriter", "Lhj0/d;", "appLifecycle", "<init>", "(Lo92/s;Ldp0/g;Liy1/c;Lhj0/d;)V", "", "destinationJson", "", "B", "(Ljava/lang/String;)Z", "A", "(Ljava/lang/String;)Ljava/lang/String;", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Ldp0/g;", "J", "Liy1/c;", "K", "Lhj0/d;", "L", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "M", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9990b extends AbstractC25319b {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f29525N = 8;

    /* JADX INFO: renamed from: O */
    private static final C3853d f29526O;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C17345d appLifecycle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/service/push/notifications/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_TYPE", "TITLE_KEY", "BODY_KEY", "DESTINATION_KEY", "PARAMETERS_KEY", "AI_ACTION_KEY", "FINGERPRINT_KEY", "SUPPRESSED_METRIC", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24530a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9990b.f29526O.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    static {
        C3853d c3853dM11807f = AbstractC25319b.INSTANCE.m74357a("06690_WhoopCoach", AbstractC17312j.f66925F0).m11807f(AbstractC17312j.f66925F0);
        AbstractC22676k.m65749i(c3853dM11807f, "setChannelDescriptionResId(...)");
        f29526O = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9990b(C27721s pushContext, InterfaceC12251g globalCoachManager, InterfaceC21030c metricWriter, C17345d appLifecycle) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(appLifecycle, "appLifecycle");
        this.globalCoachManager = globalCoachManager;
        this.metricWriter = metricWriter;
        this.appLifecycle = appLifecycle;
        this.logTag = "AiAgentPushNotification";
    }

    /* JADX INFO: renamed from: A */
    private final String m24527A(String destinationJson) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        try {
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(destinationJson).optJSONObject("parameters");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("ai_action")) == null || (strOptString = jSONObjectOptJSONObject.optString("fingerprint")) == null || AbstractC39414r.m125890i0(strOptString)) {
                return null;
            }
            return strOptString;
        } catch (JSONException e5) {
            m74350l().mo85213c("Failed to parse ai_action fingerprint from AI_AGENT_MESSAGE push", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    private final boolean m24528B(String destinationJson) {
        if (!getFeatureFlagChecker().isFeatureEnabled("android-suppress-foreground-chat-push-in-active-conversation")) {
            m74350l().mo85228t("Suppression skipped: feature flag off", new AbstractC30556a.a[0]);
            return false;
        }
        if (!((Boolean) this.appLifecycle.getAppForegroundFlow().getValue()).booleanValue()) {
            m74350l().mo85228t("Suppression skipped: app backgrounded", new AbstractC30556a.a[0]);
            return false;
        }
        C13398d c13398d = (C13398d) this.globalCoachManager.getState().getValue();
        if (!c13398d.getIsBottomSheetVisible()) {
            m74350l().mo85228t("Suppression skipped: coach sheet not visible", new AbstractC30556a.a[0]);
            return false;
        }
        String openConversationFingerprint = c13398d.getOpenConversationFingerprint();
        if (openConversationFingerprint == null) {
            m74350l().mo85228t("Suppression skipped: open conversation has no fingerprint yet", new AbstractC30556a.a[0]);
            return false;
        }
        String strM24527A = m24527A(destinationJson);
        if (strM24527A == null) {
            m74350l().mo85228t("Suppression skipped: push carries no ai_action.fingerprint", new AbstractC30556a.a[0]);
            return false;
        }
        boolean zEquals = strM24527A.equals(openConversationFingerprint);
        InterfaceC34116n interfaceC34116nM74350l = m74350l();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Suppression fingerprint check: push=", strM24527A, " open=", openConversationFingerprint, " match=");
        sbM32001t.append(zEquals);
        interfaceC34116nM74350l.mo85228t(sbM32001t.toString(), new AbstractC30556a.a[0]);
        return zEquals;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            if (!AbstractC22676k.m65745e(strM74364g, "AI_AGENT_MESSAGE")) {
                throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to CoachEverywherePushNotification");
            }
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            String strM74353r3 = m74353r(dataMap, "destination");
            if (m24528B(strM74353r3)) {
                m74350l().mo85228t("Suppressing AI_AGENT_MESSAGE push: coach sheet already open on the matching conversation", new AbstractC30556a.a[0]);
                this.metricWriter.mo58701b(new C22047a(0, "push.aiagentmessage.suppressed", null, C25271y.f99162w, null, 21, null));
                return;
            }
            Uri uriM74371a = C25324g.f99321a.m74371a(strM74353r3);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uriM74371a);
            PendingIntent activity = PendingIntent.getActivity(context, 114, intent, 201326592);
            NotificationCompat.Builder deleteIntent = m74346d(context, 114).setContentIntent(activity).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            f29526O.m11805a(deleteIntent);
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 114, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
        } catch (Exception e5) {
            m74350l().mo85230v("Coach Everywhere notification failed", e5, new AbstractC30556a.a[0]);
            throw new InvalidPushDataException(dataMap, "Unable to parse pushDataMap within CoachEverywherePushNotification");
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
