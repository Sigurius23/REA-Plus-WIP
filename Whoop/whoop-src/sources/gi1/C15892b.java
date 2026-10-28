package gi1;

import android.content.Context;
import android.os.Build;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gi1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lgi1/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "b", "()Z", "a", "Landroid/content/Context;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15892b {

    /* JADX INFO: renamed from: b */
    public static final int f60014b = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C15892b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44825a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC32122c.checkSelfPermission(this.context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        }
        return m44826b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44826b() {
        return AbstractC32122c.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
