package d92;

import android.app.PendingIntent;
import android.os.Bundle;
import hi0.AbstractC17307e;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yp0.AbstractC39701b;

/* JADX INFO: renamed from: d92.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m65681d2 = {"Ld92/b;", "", "<init>", "()V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "Leb/j0;", "builder", "Landroid/app/PendingIntent;", "b", "(Leb/j0;)Landroid/app/PendingIntent;", "", "I", "destinationId", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11819b {

    /* JADX INFO: renamed from: a */
    public static final C11819b f38415a = new C11819b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int destinationId = AbstractC17307e.f66745g5;

    private C11819b() {
    }

    /* JADX INFO: renamed from: a */
    private final Bundle m31688a() {
        Bundle bundle = new Bundle();
        bundle.putString("request", AbstractC39701b.m127036c());
        bundle.putString("selectedTab", "COMMUNITY");
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m31689b(C12966j0 builder) {
        AbstractC22676k.m65750j(builder, "builder");
        C12966j0.m36442f(builder, destinationId);
        builder.m36447e(m31688a());
        return builder.m36444b();
    }
}
