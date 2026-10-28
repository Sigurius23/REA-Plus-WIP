package io.getstream.chat.android.client.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.C27485o;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p024b0.C2178b;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18386u;
import p218ic.C18347a0;
import p218ic.C18370m;
import p218ic.C18380r;
import p218ic.C18392z;
import p218ic.EnumC18368l;
import p249jc.C21596v;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/m;", "createForegroundInfo", "()Lic/m;", "", "notificationChannelId", "notificationChannelName", "Landroid/app/Notification;", "createForegroundNotification", "(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;", "Ll83/a0;", "createSyncNotificationChannel", "(Ljava/lang/String;Ljava/lang/String;)V", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LoadNotificationDataWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String DATA_CHANNEL_ID = "DATA_CHANNEL_ID";
    private static final String DATA_CHANNEL_TYPE = "DATA_CHANNEL_TYPE";
    private static final String DATA_MESSAGE_ID = "DATA_MESSAGE_ID";
    private static final String DATA_TYPE = "DATA_TYPE";
    private static final String LOAD_NOTIFICATION_DATA_WORK_NAME = "LOAD_NOTIFICATION_DATA_WORK_NAME";
    private static final int NOTIFICATION_ID = 1;
    private static final String TAG = "Chat:Notifications-Loader";
    private final Context context;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "type", "channelId", "channelType", "messageId", "", "payload", "Ll83/a0;", "start", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "cancel", "(Landroid/content/Context;)V", "TAG", "Ljava/lang/String;", LoadNotificationDataWorker.DATA_TYPE, LoadNotificationDataWorker.DATA_CHANNEL_TYPE, LoadNotificationDataWorker.DATA_CHANNEL_ID, LoadNotificationDataWorker.DATA_MESSAGE_ID, "", "NOTIFICATION_ID", "I", LoadNotificationDataWorker.LOAD_NOTIFICATION_DATA_WORK_NAME, "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void cancel(Context context) {
            AbstractC22676k.m65750j(context, "context");
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, LoadNotificationDataWorker.TAG)) {
                C2343i.f9271c.log(enumC2341g, LoadNotificationDataWorker.TAG, "/cancel/ no args", null);
            }
            C21596v.m60637g(context).mo52873b(LoadNotificationDataWorker.LOAD_NOTIFICATION_DATA_WORK_NAME);
        }

        public final void start(Context context, String type, String channelId, String channelType, String messageId, Map<String, ? extends Object> payload) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(channelId, "channelId");
            AbstractC22676k.m65750j(channelType, "channelType");
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(payload, "payload");
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, LoadNotificationDataWorker.TAG)) {
                InterfaceC2344j interfaceC2344j = C2343i.f9271c;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("/start/ cid: ", channelType, ":", channelId, ", messageId: ");
                sbM32001t.append(messageId);
                interfaceC2344j.log(enumC2341g, LoadNotificationDataWorker.TAG, sbM32001t.toString(), null);
            }
            List listM118959K = AbstractC37056f.m118959K(new C23465k(LoadNotificationDataWorker.DATA_TYPE, type), new C23465k(LoadNotificationDataWorker.DATA_CHANNEL_ID, channelId), new C23465k(LoadNotificationDataWorker.DATA_CHANNEL_TYPE, channelType), new C23465k(LoadNotificationDataWorker.DATA_MESSAGE_ID, messageId));
            ArrayList arrayList = new ArrayList(payload.size());
            for (Map.Entry<String, ? extends Object> entry : payload.entrySet()) {
                arrayList.add(new C23465k(entry.getKey(), entry.getValue()));
            }
            ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(listM118959K, arrayList);
            C18392z c18392z = new C18392z(LoadNotificationDataWorker.class);
            C23465k[] c23465kArr = (C23465k[]) arrayListM74129g1.toArray(new C23465k[0]);
            C23465k[] c23465kArr2 = (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length);
            C2178b c2178b = new C2178b(1);
            for (C23465k c23465k : c23465kArr2) {
                c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
            }
            C21596v.m60637g(context).m52876e(LoadNotificationDataWorker.LOAD_NOTIFICATION_DATA_WORK_NAME, EnumC18368l.f71506z, (C18347a0) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52878b());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.LoadNotificationDataWorker$doWork$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.LoadNotificationDataWorker", m100430f = "LoadNotificationDataWorker.kt", m100431l = {54, 69, 77}, m100432m = "doWork")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193871 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C193871(InterfaceC30057d<? super C193871> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoadNotificationDataWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadNotificationDataWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workerParams, "workerParams");
        this.context = context;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
    }

    private final C18370m createForegroundInfo() {
        String string = this.context.getString(C18999R.string.stream_chat_other_notifications_channel_id);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = this.context.getString(C18999R.string.stream_chat_other_notifications_channel_name);
        AbstractC22676k.m65749i(string2, "getString(...)");
        Notification notificationCreateForegroundNotification = createForegroundNotification(string, string2);
        return Build.VERSION.SDK_INT >= 34 ? new C18370m(1, notificationCreateForegroundNotification, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) : new C18370m(1, notificationCreateForegroundNotification, 0);
    }

    private final Notification createForegroundNotification(String notificationChannelId, String notificationChannelName) {
        createSyncNotificationChannel(notificationChannelId, notificationChannelName);
        Notification notificationBuild = new NotificationCompat.Builder(this.context, notificationChannelId).setAutoCancel(true).setSmallIcon(C18999R.drawable.stream_ic_notification).setContentTitle(this.context.getString(C18999R.string.stream_chat_load_notification_data_title)).setPriority(-1).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    private final void createSyncNotificationChannel(String notificationChannelId, String notificationChannelName) {
        ((NotificationManager) this.context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(notificationChannelId, notificationChannelName, 2));
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0158 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x016c A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x017c A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c4 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d9 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e5 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f9 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0214 A[Catch: IllegalStateException -> 0x0061, TryCatch #0 {IllegalStateException -> 0x0061, blocks: (B:14:0x005c, B:47:0x01ad, B:49:0x01c4, B:50:0x01c9, B:52:0x01d9, B:53:0x01e0, B:21:0x0088, B:35:0x0152, B:37:0x0158, B:39:0x016c, B:41:0x017c, B:42:0x0183, B:55:0x01e5, B:57:0x01e9, B:59:0x01f9, B:60:0x020e, B:62:0x0214, B:63:0x0219, B:31:0x0117), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x01f9, please report this as an issue */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C193871 c193871;
        String strM52860c;
        String strM52860c2;
        String strM52860c3;
        String strM52860c4;
        String str;
        ChatClient chatClient;
        AbstractC26205h abstractC26205h;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str2;
        EnumC2341g enumC2341g;
        Channel channel;
        Message message;
        String parentId;
        C2345k logger2;
        InterfaceC2339e interfaceC2339e2;
        String str3;
        EnumC2341g enumC2341g2;
        InterfaceC27474d message2;
        Channel channel2;
        String str4;
        Message message3;
        ChatNotification chatNotificationCreate$stream_chat_android_client_release;
        C2345k logger3;
        InterfaceC2339e interfaceC2339e3;
        String str5;
        EnumC2341g enumC2341g3;
        if (interfaceC30057d instanceof C193871) {
            c193871 = (C193871) interfaceC30057d;
            int i13 = c193871.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193871.label = i13 - Integer.MIN_VALUE;
            } else {
                c193871 = new C193871(interfaceC30057d);
            }
        } else {
            c193871 = new C193871(interfaceC30057d);
        }
        Object obj = c193871.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c193871.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                strM52860c = getInputData().m52860c(DATA_TYPE);
                AbstractC22676k.m65747g(strM52860c);
                strM52860c2 = getInputData().m52860c(DATA_CHANNEL_ID);
                AbstractC22676k.m65747g(strM52860c2);
                strM52860c3 = getInputData().m52860c(DATA_CHANNEL_TYPE);
                AbstractC22676k.m65747g(strM52860c3);
                strM52860c4 = getInputData().m52860c(DATA_MESSAGE_ID);
                AbstractC22676k.m65747g(strM52860c4);
                C18370m c18370mCreateForegroundInfo = createForegroundInfo();
                c193871.L$0 = strM52860c;
                c193871.L$1 = strM52860c2;
                c193871.L$2 = strM52860c3;
                c193871.L$3 = strM52860c4;
                c193871.label = 1;
                if (setForeground(c18370mCreateForegroundInfo, c193871) != obj2) {
                }
                return obj2;
            }
            if (i14 == 1) {
                strM52860c4 = (String) c193871.L$3;
                strM52860c3 = (String) c193871.L$2;
                strM52860c2 = (String) c193871.L$1;
                strM52860c = (String) c193871.L$0;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 == 2) {
                    chatClient = (ChatClient) c193871.L$4;
                    str = (String) c193871.L$0;
                    AbstractC34132o.m107864I(obj);
                    abstractC26205h = (AbstractC26205h) obj;
                    if (abstractC26205h instanceof C26204g) {
                        if (abstractC26205h instanceof C26203f) {
                            throw new NoWhenBranchMatchedException();
                        }
                        logger = getLogger();
                        interfaceC2339e = logger.f9275c;
                        str2 = logger.f9273a;
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                            logger.f9274b.log(enumC2341g, str2, "[doWork] failed: " + ((C26203f) abstractC26205h).f103918a, null);
                        }
                        return new C18380r();
                    }
                    C23465k c23465k = (C23465k) ((C26204g) abstractC26205h).f103919a;
                    channel = (Channel) c23465k.f92937w;
                    message = (Message) c23465k.f92938x;
                    parentId = message.getParentId();
                    if (parentId != null) {
                        logger2 = getLogger();
                        interfaceC2339e2 = logger2.f9275c;
                        str3 = logger2.f9273a;
                        enumC2341g2 = EnumC2341g.VERBOSE;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                            logger2.f9274b.log(enumC2341g2, str3, "[doWork] fetching thread parent message.", null);
                        }
                        message2 = chatClient.getMessage(parentId);
                        c193871.L$0 = str;
                        c193871.L$1 = null;
                        c193871.L$2 = null;
                        c193871.L$3 = null;
                        c193871.L$4 = null;
                        c193871.L$5 = null;
                        c193871.L$6 = null;
                        c193871.L$7 = null;
                        c193871.L$8 = channel;
                        c193871.L$9 = message;
                        c193871.L$10 = null;
                        c193871.label = 3;
                        if (message2.await(c193871) != obj2) {
                            channel2 = channel;
                            str4 = str;
                            message3 = message;
                        }
                        return obj2;
                    }
                    ChatNotification.Companion companion = ChatNotification.INSTANCE;
                    Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(getInputData().f71480a);
                    AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(...)");
                    chatNotificationCreate$stream_chat_android_client_release = companion.create$stream_chat_android_client_release(str, mapUnmodifiableMap, channel, message);
                    if (chatNotificationCreate$stream_chat_android_client_release != null) {
                        ChatClient.INSTANCE.displayNotification$stream_chat_android_client_release(chatNotificationCreate$stream_chat_android_client_release);
                    }
                    logger3 = getLogger();
                    interfaceC2339e3 = logger3.f9275c;
                    str5 = logger3.f9273a;
                    enumC2341g3 = EnumC2341g.VERBOSE;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, str5)) {
                        logger3.f9274b.log(enumC2341g3, str5, "[doWork] completed", null);
                    }
                    return AbstractC18386u.m52885b();
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                message3 = (Message) c193871.L$9;
                channel2 = (Channel) c193871.L$8;
                str4 = (String) c193871.L$0;
                AbstractC34132o.m107864I(obj);
            }
            message = message3;
            str = str4;
            channel = channel2;
            ChatNotification.Companion companion2 = ChatNotification.INSTANCE;
            Map<String, ? extends Object> mapUnmodifiableMap2 = Collections.unmodifiableMap(getInputData().f71480a);
            AbstractC22676k.m65749i(mapUnmodifiableMap2, "unmodifiableMap(...)");
            chatNotificationCreate$stream_chat_android_client_release = companion2.create$stream_chat_android_client_release(str, mapUnmodifiableMap2, channel, message);
            if (chatNotificationCreate$stream_chat_android_client_release != null) {
                ChatClient.INSTANCE.displayNotification$stream_chat_android_client_release(chatNotificationCreate$stream_chat_android_client_release);
            }
            logger3 = getLogger();
            interfaceC2339e3 = logger3.f9275c;
            str5 = logger3.f9273a;
            enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str5)) {
                logger3.f9274b.log(enumC2341g3, str5, "[doWork] completed", null);
            }
            return AbstractC18386u.m52885b();
            String str6 = strM52860c;
            String str7 = strM52860c2;
            String str8 = strM52860c3;
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
            String str9 = logger4.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str9)) {
                InterfaceC2344j interfaceC2344j = logger4.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[doWork] cid: ", str8, ":", str7, ", messageId: ");
                sbM32001t.append(strM52860c4);
                interfaceC2344j.log(enumC2341g4, str9, sbM32001t.toString(), null);
            }
            ChatClient chatClientInstance = ChatClient.INSTANCE.instance();
            InterfaceC27474d message4 = chatClientInstance.getMessage(strM52860c4);
            QueryChannelRequest queryChannelRequest = new QueryChannelRequest();
            queryChannelRequest.setNotificationUpdate(true);
            C27485o c27485o = new C27485o(ChatClient.queryChannel$default(chatClientInstance, str8, str7, queryChannelRequest, false, 8, null), message4);
            c193871.L$0 = str6;
            c193871.L$1 = null;
            c193871.L$2 = null;
            c193871.L$3 = null;
            c193871.L$4 = chatClientInstance;
            c193871.L$5 = null;
            c193871.L$6 = null;
            c193871.label = 2;
            Object objAwait = c27485o.await(c193871);
            if (objAwait != obj2) {
                str = str6;
                obj = objAwait;
                chatClient = chatClientInstance;
                abstractC26205h = (AbstractC26205h) obj;
                if (abstractC26205h instanceof C26204g) {
                    if (abstractC26205h instanceof C26203f) {
                        throw new NoWhenBranchMatchedException();
                    }
                    logger = getLogger();
                    interfaceC2339e = logger.f9275c;
                    str2 = logger.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                        logger.f9274b.log(enumC2341g, str2, "[doWork] failed: " + ((C26203f) abstractC26205h).f103918a, null);
                    }
                    return new C18380r();
                }
                C23465k c23465k2 = (C23465k) ((C26204g) abstractC26205h).f103919a;
                channel = (Channel) c23465k2.f92937w;
                message = (Message) c23465k2.f92938x;
                parentId = message.getParentId();
                if (parentId != null) {
                    logger2 = getLogger();
                    interfaceC2339e2 = logger2.f9275c;
                    str3 = logger2.f9273a;
                    enumC2341g2 = EnumC2341g.VERBOSE;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                        logger2.f9274b.log(enumC2341g2, str3, "[doWork] fetching thread parent message.", null);
                    }
                    message2 = chatClient.getMessage(parentId);
                    c193871.L$0 = str;
                    c193871.L$1 = null;
                    c193871.L$2 = null;
                    c193871.L$3 = null;
                    c193871.L$4 = null;
                    c193871.L$5 = null;
                    c193871.L$6 = null;
                    c193871.L$7 = null;
                    c193871.L$8 = channel;
                    c193871.L$9 = message;
                    c193871.L$10 = null;
                    c193871.label = 3;
                    if (message2.await(c193871) != obj2) {
                        channel2 = channel;
                        str4 = str;
                        message3 = message;
                        message = message3;
                        str = str4;
                        channel = channel2;
                    }
                }
                ChatNotification.Companion companion3 = ChatNotification.INSTANCE;
                Map<String, ? extends Object> mapUnmodifiableMap3 = Collections.unmodifiableMap(getInputData().f71480a);
                AbstractC22676k.m65749i(mapUnmodifiableMap3, "unmodifiableMap(...)");
                chatNotificationCreate$stream_chat_android_client_release = companion3.create$stream_chat_android_client_release(str, mapUnmodifiableMap3, channel, message);
                if (chatNotificationCreate$stream_chat_android_client_release != null) {
                    ChatClient.INSTANCE.displayNotification$stream_chat_android_client_release(chatNotificationCreate$stream_chat_android_client_release);
                }
                logger3 = getLogger();
                interfaceC2339e3 = logger3.f9275c;
                str5 = logger3.f9273a;
                enumC2341g3 = EnumC2341g.VERBOSE;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str5)) {
                    logger3.f9274b.log(enumC2341g3, str5, "[doWork] completed", null);
                }
                return AbstractC18386u.m52885b();
            }
            return obj2;
        } catch (IllegalStateException e5) {
            C2345k logger5 = getLogger();
            InterfaceC2339e interfaceC2339e5 = logger5.f9275c;
            String str10 = logger5.f9273a;
            EnumC2341g enumC2341g5 = EnumC2341g.ERROR;
            if (interfaceC2339e5.isLoggable(enumC2341g5, str10)) {
                logger5.f9274b.log(enumC2341g5, str10, AbstractC11266d.m30461o("[doWork] failed unexpectedly: ", e5.getMessage()), null);
            }
            return new C18380r();
        }
    }
}
