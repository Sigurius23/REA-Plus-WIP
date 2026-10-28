package m92;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c12.C3854e;
import c12.EnumC3851b;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.service.push.InvalidPushDataException;
import hi0.AbstractC17309g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.InterfaceC23462h;
import m83.C25262p;
import o92.C27721s;
import or2.AbstractC28155d1;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: m92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000 N2\u00020\u0001:\u0001OB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0004¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\b2\u0006\u0010'\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u0007¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u001a\u00102\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, m65681d2 = {"Lm92/b;", "Lm92/e;", "Lo92/s;", "pushContext", "<init>", "(Lo92/s;)V", "Landroid/content/Context;", "context", "", "requestCode", "Landroid/app/PendingIntent;", "o", "(Landroid/content/Context;I)Landroid/app/PendingIntent;", "Lcom/whoop/service/push/InvalidPushDataException;", "e", "Ll83/a0;", "u", "(Lcom/whoop/service/push/InvalidPushDataException;)V", "Landroidx/core/app/NotificationCompat$Builder;", "d", "(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;", "Leb/j0;", "c", "(Landroid/content/Context;)Leb/j0;", "id", "Landroid/app/Notification;", "notification", "", "title", "content", "uniqueTag", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lm92/f;", "map", "key", "", "v", "(Lm92/f;Ljava/lang/String;)Ljava/util/List;", "pushDataMap", "r", "(Lm92/f;Ljava/lang/String;)Ljava/lang/String;", "j", "(Lm92/f;Ljava/lang/String;)I", "Lo92/s;", "Lrr2/c;", "x", "Lrr2/c;", "f", "()Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "g", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "z", "Lbc3/c0;", "q", "()Lbc3/c0;", "scope", "Lcom/whoop/data/repositories/NotificationRepository;", "E", "Lcom/whoop/data/repositories/NotificationRepository;", "p", "()Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Ltr2/n;", "F", "Ll83/h;", "l", "()Ltr2/n;", "log", "n", "()Ljava/lang/String;", "logTag", "G", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25319b implements InterfaceC25322e {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: H */
    public static final int f99311H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final NotificationRepository notificationRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27721s pushContext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: m92.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lm92/b$a;", "", "<init>", "()V", "", "channelId", "", "channelNameResId", "Lc12/d;", "a", "(Ljava/lang/String;I)Lc12/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3853d m74357a(String channelId, int channelNameResId) {
            C3853d c3853dM11811j = new C3853d(EnumC3851b.URGENT, channelId, channelNameResId).m11813l(true).m11811j(true);
            AbstractC22676k.m65749i(c3853dM11811j, "setLightsEnabled(...)");
            return c3853dM11811j;
        }

        private Companion() {
        }
    }

    public AbstractC25319b(C27721s pushContext) {
        AbstractC22676k.m65750j(pushContext, "pushContext");
        this.pushContext = pushContext;
        this.crashReporter = pushContext.getCrashReporter();
        this.featureFlagChecker = pushContext.getFeatureFlagChecker();
        this.scope = pushContext.getScope();
        this.notificationRepository = pushContext.getNotificationRepository();
        this.log = AbstractC30060g.m92088H(new C25262p(this, 2));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ NotificationCompat.Builder m74341e(AbstractC25319b abstractC25319b, Context context, Integer num, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNotification");
        }
        if ((i13 & 2) != 0) {
            num = null;
        }
        return abstractC25319b.m74346d(context, num);
    }

    /* JADX INFO: renamed from: o */
    private final PendingIntent m74342o(Context context, int requestCode) {
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, AbstractC28155d1.m85196a(context), 67108864);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC34116n m74343t(AbstractC25319b abstractC25319b) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractC25319b.getLogTag());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m74344y(AbstractC25319b abstractC25319b, int i13, Notification notification, Context context, String str, String str2, String str3, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNotification");
        }
        if ((i14 & 32) != 0) {
            str3 = null;
        }
        abstractC25319b.m74356w(i13, notification, context, str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final C12966j0 m74345c(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C12966j0 c12966j0 = new C12966j0(context);
        c12966j0.m36448g(AbstractC17309g.f66902a);
        return c12966j0;
    }

    /* JADX INFO: renamed from: d */
    public final NotificationCompat.Builder m74346d(Context context, Integer requestCode) {
        AbstractC22676k.m65750j(context, "context");
        NotificationCompat.Builder builderMo11800a = C3854e.f15775a.mo11800a(context);
        builderMo11800a.setPriority(3);
        if (requestCode != null) {
            builderMo11800a.setContentIntent(m74342o(context, requestCode.intValue()));
        }
        return builderMo11800a;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC31766c getCrashReporter() {
        return this.crashReporter;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FeatureFlagChecker getFeatureFlagChecker() {
        return this.featureFlagChecker;
    }

    /* JADX INFO: renamed from: j */
    public final int m74349j(C25323f pushDataMap, String key) throws InvalidPushDataException {
        AbstractC22676k.m65750j(pushDataMap, "pushDataMap");
        AbstractC22676k.m65750j(key, "key");
        try {
            return AbstractC25320c.m74362e(pushDataMap, key);
        } catch (InvalidPushDataException e5) {
            m74354u(e5);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC34116n m74350l() {
        return (InterfaceC34116n) this.log.getValue();
    }

    /* JADX INFO: renamed from: n */
    public abstract String getLogTag();

    /* JADX INFO: renamed from: p, reason: from getter */
    public final NotificationRepository getNotificationRepository() {
        return this.notificationRepository;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC2994c0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: r */
    public final String m74353r(C25323f pushDataMap, String key) throws InvalidPushDataException {
        AbstractC22676k.m65750j(pushDataMap, "pushDataMap");
        AbstractC22676k.m65750j(key, "key");
        try {
            return AbstractC25320c.m74365h(pushDataMap, key);
        } catch (InvalidPushDataException e5) {
            m74354u(e5);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m74354u(InvalidPushDataException e5) {
        AbstractC22676k.m65750j(e5, "e");
        InterfaceC31766c.m98634e(this.pushContext.getCrashReporter(), e5, null, 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m74355v(C25323f map, String key) {
        AbstractC22676k.m65750j(map, "map");
        AbstractC22676k.m65750j(key, "key");
        try {
            return AbstractC25320c.m74363f(map, key);
        } catch (InvalidPushDataException unused) {
            m74350l().mo85219j("push data map did not contain optional string array ".concat(key), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m74356w(int id4, Notification notification, Context context, String title, String content, String uniqueTag) {
        AbstractC22676k.m65750j(notification, "notification");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        m74350l().mo85228t(AbstractC39414r.m125869O0("Showing notification " + (uniqueTag != null ? "with uniqueTag ".concat(uniqueTag) : "")).toString(), new AbstractC30556a.a[0]);
        m74350l().mo85228t("Notification title: ".concat(title), new AbstractC30556a.a[0]);
        m74350l().mo85228t("Notification body: ".concat(content), new AbstractC30556a.a[0]);
        Object systemService = context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(uniqueTag, id4, notification);
    }
}
