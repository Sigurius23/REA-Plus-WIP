package ww2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ww2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0015\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lww2/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "phoneNumber", "", "flag", "", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z", "Ltr2/n;", "b", "Ltr2/n;", "getLogger$whoop_action_release", "()Ltr2/n;", "setLogger$whoop_action_release", "(Ltr2/n;)V", "getLogger$whoop_action_release$annotations", "logger", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37671a {

    /* JADX INFO: renamed from: a */
    public static final C37671a f161420a = new C37671a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("PhoneUtils");

    /* JADX INFO: renamed from: c */
    public static final int f161422c = 8;

    private C37671a() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m121100a(Context context, String phoneNumber, Integer flag) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        if (AbstractC39414r.m125890i0(phoneNumber)) {
            logger.mo85222m("Cannot dial a blank phone number", new AbstractC30556a.a[0]);
            return false;
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", phoneNumber, null));
        if (flag != null) {
            intent.setFlags(flag.intValue());
        }
        try {
            context.startActivity(intent);
            logger.mo85216g("Successfully opened dialer with phone number", new AbstractC30556a.a[0]);
            return true;
        } catch (ActivityNotFoundException e5) {
            logger.mo85230v("No dialer app found on device", e5, new AbstractC30556a.a[0]);
            return false;
        } catch (SecurityException e13) {
            logger.mo85230v("Not allowed to open dialer app", e13, new AbstractC30556a.a[0]);
            return false;
        } catch (Exception e14) {
            logger.mo85230v("Failed to dial phone number", e14, new AbstractC30556a.a[0]);
            return false;
        }
    }
}
