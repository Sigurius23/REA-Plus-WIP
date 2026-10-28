package o03;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import d03.AbstractC11446a;
import d03.AbstractC11447b;
import e93.AbstractC12889b;
import gy0.AbstractC16272a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p358o6.AbstractC27596d;
import p358o6.InterfaceC27593a;
import p415q6.C29993c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: o03.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"", "level", "Li2/x;", "c", "(Ljava/lang/Integer;)J", "d", "(Ljava/lang/Integer;)I", "", "stateName", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)I", "g", "(Ljava/lang/String;)J", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "f", "(Landroid/content/Context;)Landroid/content/Intent;", "Lo6/a;", "a", "(Landroid/content/Context;)Lo6/a;", "deepLink", "e", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "b", "(Landroid/content/Context;Ljava/lang/String;)Lo6/a;", "", "percent", "", "isCalibrating", "j", "(FZ)J", "i", "(Landroid/content/Context;F)Ljava/lang/String;", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27356a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC27593a m82534a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new C29993c(m82539f(context), AbstractC37978j.m121632P((AbstractC27596d[]) Arrays.copyOf(new AbstractC27596d[0], 0)));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC27593a m82535b(Context context, String deepLink) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(deepLink, "deepLink");
        return new C29993c(m82538e(context, deepLink), AbstractC37978j.m121632P((AbstractC27596d[]) Arrays.copyOf(new AbstractC27596d[0], 0)));
    }

    /* JADX INFO: renamed from: c */
    public static final long m82536c(Integer num) {
        if (num == null) {
            int i13 = C17919x.f69638o;
            return C17919x.f69627d;
        }
        if (num.intValue() <= 20) {
            return AbstractC17918w0.m51517e(4294901798L);
        }
        int i14 = C17919x.f69638o;
        return C17919x.f69629f;
    }

    /* JADX INFO: renamed from: d */
    public static final int m82537d(Integer num) {
        if (num == null) {
            return AbstractC11446a.f36707f;
        }
        if (num.intValue() <= 20) {
            return AbstractC11446a.f36703b;
        }
        if (num.intValue() <= 40) {
            return AbstractC11446a.f36704c;
        }
        if (num.intValue() <= 60) {
            return AbstractC11446a.f36705d;
        }
        return num.intValue() <= 80 ? AbstractC11446a.f36706e : AbstractC11446a.f36702a;
    }

    /* JADX INFO: renamed from: e */
    public static final Intent m82538e(Context context, String deepLink) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(deepLink, "deepLink");
        Intent intentM82539f = m82539f(context);
        intentM82539f.setAction("android.intent.action.VIEW");
        intentM82539f.setData(Uri.parse(deepLink));
        return intentM82539f;
    }

    /* JADX INFO: renamed from: f */
    private static final Intent m82539f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        AbstractC22676k.m65749i(packageManager, "getPackageManager(...)");
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        AbstractC22676k.m65747g(launchIntentForPackage);
        return launchIntentForPackage;
    }

    /* JADX INFO: renamed from: g */
    public static final long m82540g(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1720864429) {
                if (iHashCode != -1142203128) {
                    if (iHashCode == 1808480015 && str.equals("RELAXED")) {
                        return AbstractC17918w0.m51517e(4284985062L);
                    }
                } else if (str.equals("BALANCED")) {
                    return AbstractC17918w0.m51517e(4278251935L);
                }
            } else if (str.equals("STRESSED")) {
                return AbstractC17918w0.m51517e(4294944546L);
            }
        }
        int i13 = C17919x.f69638o;
        return C17919x.f69629f;
    }

    /* JADX INFO: renamed from: h */
    public static final int m82541h(String str) {
        return AbstractC22676k.m65745e(str, "RELAXED") ? AbstractC16272a.f61939I3 : AbstractC16272a.f61933H3;
    }

    /* JADX INFO: renamed from: i */
    public static final String m82542i(Context context, float f13) {
        AbstractC22676k.m65750j(context, "context");
        if (f13 > 0.0f) {
            return AbstractC31061c.m95635k(AbstractC12889b.m36258X(f13 * 100), "%");
        }
        String string = context.getString(AbstractC11447b.f36719b);
        AbstractC22676k.m65747g(string);
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static final long m82543j(float f13, boolean z4) {
        if (z4) {
            return AbstractC17918w0.m51517e(4292664540L);
        }
        if (f13 != -1.0f && f13 != 0.0f) {
            if (f13 <= 0.33f) {
                return AbstractC17918w0.m51517e(4294901798L);
            }
            return f13 <= 0.66f ? AbstractC17918w0.m51517e(4294958592L) : AbstractC17918w0.m51517e(4279888902L);
        }
        return AbstractC17918w0.m51515c(1308622847);
    }
}
