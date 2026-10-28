package pu2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import cu2.AbstractC11123c;
import cu2.AbstractC11125e;
import cu2.AbstractC11126f;
import cu2.AbstractC11128h;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import gy0.AbstractC16272a;
import hu2.InterfaceC17654a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p479s4.AbstractC32122c;
import p479s4.AbstractC32126g;
import p483s8.C32251d;
import p547v8.AbstractC35785b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt2.C29529k;
import uv0.AbstractC35282b;

/* JADX INFO: renamed from: pu2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u00020*2\b\b\u0001\u0010,\u001a\u00020+2\b\b\u0001\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u0019\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J+\u00109\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b9\u0010\u000fJ\r\u0010:\u001a\u00020\f¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010>R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010A¨\u0006C"}, m65681d2 = {"Lpu2/b;", "", "Landroidx/core/app/NotificationManagerCompat;", "notificationManager", "Landroid/content/Context;", "context", "<init>", "(Landroidx/core/app/NotificationManagerCompat;Landroid/content/Context;)V", "Lpu2/e;", "notificationState", "Lkotlin/Function1;", "Lhu2/a$c0;", "Ll83/a0;", "onEvent", "s", "(Lpu2/e;Lkotlin/jvm/functions/Function1;)V", "", "i", "()Z", "Landroid/app/Notification;", "d", "()Landroid/app/Notification;", "Lpu2/e$a;", "c", "(Lpu2/e$a;)Landroid/app/Notification;", "state", "Landroid/widget/RemoteViews;", "e", "(Lpu2/e$a;)Landroid/widget/RemoteViews;", "f", "Lpu2/q;", "m", "(Landroid/widget/RemoteViews;Lpu2/q;)V", "Lpu2/r;", "n", "(Landroid/widget/RemoteViews;Lpu2/r;)V", "Lpu2/s;", "o", "(Landroid/widget/RemoteViews;Lpu2/s;)V", "Lpu2/o;", "k", "(Landroid/widget/RemoteViews;Lpu2/o;)V", "Lpu2/p;", "", "statViewId", "statLabelViewId", "l", "(Landroid/widget/RemoteViews;Lpu2/p;II)V", "Lpu2/n;", "j", "(Landroid/widget/RemoteViews;Lpu2/n;)V", "notificationActionEvent", "Landroid/app/PendingIntent;", "b", "(Lhu2/a$c0;)Landroid/app/PendingIntent;", "g", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "p", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "a", "Landroidx/core/app/NotificationManagerCompat;", "Landroid/content/Context;", "Lec3/p1;", "Lpu2/b$a;", "Lec3/p1;", "actionReceiver", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29554b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final NotificationManagerCompat notificationManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13075p1 actionReceiver;

    /* JADX INFO: renamed from: pu2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lpu2/b$a;", "Landroid/content/BroadcastReceiver;", "Lkotlin/Function1;", "Lhu2/a$c0;", "Ll83/a0;", "onEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1 onEvent;

        public a(Function1 onEvent) {
            AbstractC22676k.m65750j(onEvent, "onEvent");
            this.onEvent = onEvent;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            InterfaceC17654a.c0 c0Var = (InterfaceC17654a.c0) AbstractC32126g.m100043h(intent, "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutNotification.ActionReceiver.ViewEvent", InterfaceC17654a.c0.class);
            if (c0Var != null) {
                this.onEvent.invoke(c0Var);
            }
        }
    }

    public C29554b(NotificationManagerCompat notificationManager, Context context) {
        AbstractC22676k.m65750j(notificationManager, "notificationManager");
        AbstractC22676k.m65750j(context, "context");
        this.notificationManager = notificationManager;
        this.context = context;
        this.actionReceiver = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: b */
    private final PendingIntent m90520b(InterfaceC17654a.c0 notificationActionEvent) {
        if (AbstractC22676k.m65745e(notificationActionEvent, InterfaceC17654a.g.f68467w)) {
            return AbstractC29555c.m90538a(this.context, "whoop://strength.builder?endWorkout=true");
        }
        Intent intent = new Intent("com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutNotification.ActionReceiver");
        intent.setPackage(this.context.getPackageName());
        intent.putExtra("com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutNotification.ActionReceiver.ViewEvent", notificationActionEvent);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 756109573, intent, 201326592);
        AbstractC22676k.m65747g(broadcast);
        return broadcast;
    }

    /* JADX INFO: renamed from: c */
    private final Notification m90521c(InterfaceC29557e.a notificationState) {
        Notification notificationBuild = new NotificationCompat.Builder(this.context, "06000_RealTimeActivities").setVisibility(1).setTicker(this.context.getString(AbstractC11128h.f35433V)).setSmallIcon(AbstractC35282b.f150162a).setStyle(new C32251d()).setColor(this.context.getColor(AbstractC11123c.f35345b)).setColorized(true).setSilent(true).setOngoing(true).setShowWhen(false).setCustomContentView(m90523e(notificationState)).setCustomBigContentView(m90524f(notificationState)).setContentIntent(m90525g(this.context)).setCategory("workout").build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: d */
    private final Notification m90522d() {
        Notification notificationBuild = new NotificationCompat.Builder(this.context, "06000_RealTimeActivities").setVisibility(1).setContentTitle(this.context.getString(AbstractC11128h.f35436W)).setContentText(this.context.getString(AbstractC11128h.f35433V)).setTicker(this.context.getString(AbstractC11128h.f35433V)).setSmallIcon(AbstractC35282b.f150162a).setColor(this.context.getColor(AbstractC11123c.f35345b)).setColorized(true).setSilent(true).setOngoing(true).setShowWhen(false).setContentIntent(AbstractC29555c.m90539b(this.context, null, 1, null)).setCategory("workout").build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: e */
    private final RemoteViews m90523e(InterfaceC29557e.a state) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), AbstractC11126f.f35367a);
        m90530m(remoteViews, state.getHeaderState());
        m90527j(remoteViews, state.getActionButtonState());
        return remoteViews;
    }

    /* JADX INFO: renamed from: f */
    private final RemoteViews m90524f(InterfaceC29557e.a state) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), AbstractC11126f.f35368b);
        m90530m(remoteViews, state.getHeaderState());
        m90531n(remoteViews, state.getHeartRateDisplayState());
        m90532o(remoteViews, state.getTimerState());
        m90528k(remoteViews, state.getExerciseContentState());
        m90527j(remoteViews, state.getActionButtonState());
        return remoteViews;
    }

    /* JADX INFO: renamed from: g */
    private final PendingIntent m90525g(Context context) {
        Intent intent;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        Intent flags = null;
        if (launchIntentForPackage != null && (intent = launchIntentForPackage.setPackage(null)) != null) {
            flags = intent.setFlags(270532608);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 849210847, flags, 67108864);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m90526i() {
        List<StatusBarNotification> activeNotifications = this.notificationManager.getActiveNotifications();
        AbstractC22676k.m65749i(activeNotifications, "getActiveNotifications(...)");
        List<StatusBarNotification> list = activeNotifications;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StatusBarNotification) it.next()).getId()));
        }
        return arrayList.contains(105);
    }

    /* JADX INFO: renamed from: j */
    private final void m90527j(RemoteViews remoteViews, C29566n c29566n) {
        remoteViews.setOnClickPendingIntent(AbstractC11125e.f35366k, m90520b(c29566n.getClickEvent()));
        remoteViews.setImageViewResource(AbstractC11125e.f35366k, c29566n.getIcon());
        AbstractC35785b.m113397T(remoteViews, AbstractC11125e.f35366k, this.context.getColor(c29566n.getIconColor()));
        AbstractC35785b.m113398U(remoteViews, AbstractC11125e.f35366k, c29566n.getBackground());
        remoteViews.setContentDescription(AbstractC11125e.f35366k, c29566n.getContentDescription().resolve(this.context));
    }

    /* JADX INFO: renamed from: k */
    private final void m90528k(RemoteViews remoteViews, C29567o c29567o) {
        m90529l(remoteViews, c29567o.getSetNumberStatState(), AbstractC11125e.f35360e, AbstractC11125e.f35357b);
        m90529l(remoteViews, c29567o.getVolumeStatState(), AbstractC11125e.f35361f, AbstractC11125e.f35358c);
        m90529l(remoteViews, c29567o.getWeightStatState(), AbstractC11125e.f35362g, AbstractC11125e.f35359d);
    }

    /* JADX INFO: renamed from: l */
    private final void m90529l(RemoteViews remoteViews, C29568p c29568p, int i13, int i14) {
        remoteViews.setTextViewText(i13, c29568p.getStatText().resolve(this.context));
        remoteViews.setTextViewText(i14, c29568p.getLabelText().resolve(this.context));
        remoteViews.setTextColor(i13, this.context.getColor(c29568p.getStatColor()));
        remoteViews.setTextColor(i14, this.context.getColor(c29568p.getLabelColor()));
    }

    /* JADX INFO: renamed from: m */
    private final void m90530m(RemoteViews remoteViews, C29569q c29569q) {
        remoteViews.setViewVisibility(AbstractC11125e.f35365j, c29569q.getUpNextVisible() ? 0 : 8);
        remoteViews.setTextViewText(AbstractC11125e.f35364i, c29569q.getTitle().resolve(this.context));
        remoteViews.setTextColor(AbstractC11125e.f35364i, this.context.getColor(c29569q.getTitleColor()));
    }

    /* JADX INFO: renamed from: n */
    private final void m90531n(RemoteViews remoteViews, C29570r c29570r) {
        remoteViews.setTextViewText(AbstractC11125e.f35356a, c29570r.getCurrentHeartRate().resolve(this.context));
        remoteViews.setTextViewCompoundDrawablesRelative(AbstractC11125e.f35356a, AbstractC16272a.f62115l4, 0, 0, 0);
        remoteViews.setTextColor(AbstractC11125e.f35356a, this.context.getColor(c29570r.getZoneColor()));
    }

    /* JADX INFO: renamed from: o */
    private final void m90532o(RemoteViews remoteViews, C29571s c29571s) {
        remoteViews.setTextViewText(AbstractC11125e.f35363h, c29571s.getTimerText().resolve(this.context));
        remoteViews.setTextColor(AbstractC11125e.f35363h, this.context.getColor(c29571s.getColor()));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m90533q(C29554b c29554b, InterfaceC29557e interfaceC29557e, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function1 = new C29529k(12);
        }
        c29554b.m90537p(interfaceC29557e, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m90534r(InterfaceC17654a.c0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private final void m90535s(InterfaceC29557e notificationState, Function1 onEvent) {
        if (!(notificationState instanceof InterfaceC29557e.a)) {
            if (!(notificationState instanceof InterfaceC29557e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar = (a) ((C13045h2) this.actionReceiver).getValue();
            if (aVar != null) {
                this.context.unregisterReceiver(aVar);
            }
            ((C13045h2) this.actionReceiver).m36570j(null);
            return;
        }
        if (((C13045h2) this.actionReceiver).getValue() == null) {
            InterfaceC13075p1 interfaceC13075p1 = this.actionReceiver;
            a aVar2 = new a(onEvent);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, aVar2);
            AbstractC32122c.registerReceiver(this.context, (BroadcastReceiver) ((C13045h2) this.actionReceiver).getValue(), new IntentFilter("com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutNotification.ActionReceiver"), 4);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m90536h() {
        this.notificationManager.cancel(105);
        ((C13045h2) this.actionReceiver).m36570j(null);
    }

    /* JADX INFO: renamed from: p */
    public final void m90537p(InterfaceC29557e notificationState, Function1 onEvent) {
        Notification notificationM90522d;
        AbstractC22676k.m65750j(notificationState, "notificationState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (m90526i() && AbstractC32122c.checkSelfPermission(this.context, "android.permission.POST_NOTIFICATIONS") == 0) {
            if (notificationState instanceof InterfaceC29557e.a) {
                notificationM90522d = m90521c((InterfaceC29557e.a) notificationState);
            } else {
                if (!(notificationState instanceof InterfaceC29557e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                notificationM90522d = m90522d();
            }
            this.notificationManager.notify(105, notificationM90522d);
            m90535s(notificationState, onEvent);
        }
    }
}
