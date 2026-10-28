package m92;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import e93.AbstractC12889b;
import l83.C23465k;
import o92.C27721s;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vv0.AbstractC36528a;

/* JADX INFO: renamed from: m92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lm92/a;", "Lm92/b;", "Lo92/s;", "pushContext", "<init>", "(Lo92/s;)V", "Landroid/content/Context;", "context", "", "activityV2Id", "Landroid/app/PendingIntent;", "z", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25318a extends AbstractC25319b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC25318a(C27721s pushContext) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
    }

    /* JADX INFO: renamed from: z */
    public final PendingIntent m74339z(Context context, String activityV2Id) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("entryPoint", "Push Notification"), new C23465k("activityType", "Cardio"), new C23465k("activityIdV2", activityV2Id));
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC36528a.f156319a);
        c12966j0M74345c.m36447e(bundleM36273g);
        return c12966j0M74345c.m36444b();
    }
}
