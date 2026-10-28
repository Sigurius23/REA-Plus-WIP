package la0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: la0.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lla0/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "title", "", "startTimeMillis", "endTimeMillis", "location", "description", "", "flag", "", "a", "(Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z", "Ltr2/n;", "b", "Ltr2/n;", "logger", "add-to-calendar-util_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23552a {

    /* JADX INFO: renamed from: a */
    public static final C23552a f93401a = new C23552a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("CalendarUtils");

    private C23552a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m68200b(C23552a c23552a, Context context, String str, long j7, long j13, String str2, String str3, Integer num, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            str2 = null;
        }
        if ((i13 & 32) != 0) {
            str3 = null;
        }
        if ((i13 & 64) != 0) {
            num = null;
        }
        return c23552a.m68201a(context, str, j7, j13, str2, str3, num);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68201a(Context context, String title, long startTimeMillis, long endTimeMillis, String location, String description, Integer flag) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(title, "title");
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", title);
        intent.putExtra("beginTime", startTimeMillis);
        intent.putExtra("endTime", endTimeMillis);
        if (location != null) {
            intent.putExtra("eventLocation", location);
        }
        if (description != null) {
            intent.putExtra("description", description);
        }
        if (flag != null) {
            intent.setFlags(flag.intValue());
        }
        try {
            context.startActivity(intent);
            logger.mo85216g("Successfully opened calendar app with event details", new AbstractC30556a.a[0]);
            return true;
        } catch (ActivityNotFoundException e5) {
            logger.mo85230v("No calendar app found on device", e5, new AbstractC30556a.a[0]);
            return false;
        } catch (Exception e13) {
            logger.mo85230v("Failed to open calendar app", e13, new AbstractC30556a.a[0]);
            return false;
        }
    }
}
