package o92;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import hi0.AbstractC17312j;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.C25323f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29020i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import z82.C40191e;

/* JADX INFO: renamed from: o92.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m65681d2 = {"Lo92/p;", "Lm92/b;", "Lo92/s;", "pushContext", "Lz82/e;", "eventDispatcher", "Lp92/i;", "realTimeStreamController", "<init>", "(Lo92/s;Lz82/e;Lp92/i;)V", "Landroidx/core/app/NotificationCompat$Builder;", "builder", "Landroid/content/Context;", "context", "A", "(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;", "Lm92/f;", "dataMap", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lz82/e;", "J", "Lp92/i;", "", "K", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "L", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27718p extends AbstractC25319b {

    /* JADX INFO: renamed from: M */
    public static final int f111693M = 8;

    /* JADX INFO: renamed from: N */
    private static final C3853d f111694N = AbstractC25319b.INSTANCE.m74357a("00200_Alerts", AbstractC17312j.f67005n);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C29020i realTimeStreamController;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.p$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.OptimalStrainGoalReachedNotification$perform$optimalStrainValue$1", m100430f = "OptimalStrainGoalReachedNotification.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27718p f111698E;

        /* JADX INFO: renamed from: w */
        Object f111699w;

        /* JADX INFO: renamed from: x */
        int f111700x;

        /* JADX INFO: renamed from: y */
        int f111701y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f111702z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C27718p c27718p, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111702z = c25323f;
            this.f111698E = c27718p;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f111702z, this.f111698E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111701y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f111702z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f111698E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f111699w = null;
                    this.f111700x = 0;
                    this.f111701y = 1;
                    if (notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, strM74370d, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27718p(C27721s pushContext, C40191e eventDispatcher, C29020i realTimeStreamController) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
        this.eventDispatcher = eventDispatcher;
        this.realTimeStreamController = realTimeStreamController;
        this.logTag = "OptimalStrainGoalReachedNotification";
    }

    /* JADX INFO: renamed from: A */
    private final NotificationCompat.Builder m83776A(NotificationCompat.Builder builder, Context context) {
        NotificationCompat.Builder contentIntent = builder.setContentIntent(PendingIntent.getActivity(context, 103, RealTimeRecordActivity.INSTANCE.m23843b(context, this.realTimeStreamController).mo23852f(), 67108864));
        AbstractC22676k.m65749i(contentIntent, "setContentIntent(...)");
        return contentIntent;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74353r = m74353r(dataMap, "optimalKey");
            String string = context.getString(AbstractC17312j.f66969b);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = context.getString(AbstractC17312j.f66966a, strM74353r);
            AbstractC22676k.m65749i(string2, "getString(...)");
            NotificationCompat.Builder style = AbstractC25319b.m74341e(this, context, null, 2, null).setContentTitle(string).setContentText(string2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(string).bigText(string2));
            AbstractC22676k.m65749i(style, "setStyle(...)");
            NotificationCompat.Builder builderM83776A = m83776A(style, context);
            f111694N.m11805a(builderM83776A);
            Notification notificationBuild = builderM83776A.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 103, notificationBuild, context, string, string2, null, 32, null);
            this.eventDispatcher.m129025a0();
        } catch (Exception unused) {
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
