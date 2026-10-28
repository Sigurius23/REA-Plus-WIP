package x82;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import of3.InterfaceC27903a;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x82.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lx82/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Leb/j0;", "a", "(Landroid/content/Context;)Leb/j0;", "", "data", "Landroid/app/PendingIntent;", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38075b {

    /* JADX INFO: renamed from: x82.b$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"Lx82/b$a;", "Landroid/content/BroadcastReceiver;", "Lof3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends BroadcastReceiver implements InterfaceC27903a {
    }

    /* JADX INFO: renamed from: a */
    public final C12966j0 m121979a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C12966j0 c12966j0 = new C12966j0(context);
        c12966j0.f44783b.setComponent(new ComponentName(context, (Class<?>) MainActivity.class));
        return c12966j0;
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m121980b(Context context, String data) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(data, "data");
        Intent intent = new Intent(context, (Class<?>) a.class);
        intent.putExtra("dismissActionType", data);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
