package vt2;

import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vt2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lvt2/c;", "", "<init>", "()V", "", "planId", "Landroid/net/Uri;", "a", "(Ljava/lang/String;)Landroid/net/Uri;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36494c {

    /* JADX INFO: renamed from: a */
    public static final C36494c f155913a = new C36494c();

    private C36494c() {
    }

    /* JADX INFO: renamed from: a */
    public final Uri m116954a(String planId) {
        AbstractC22676k.m65750j(planId, "planId");
        Uri uriBuild = new Uri.Builder().scheme("android-app").authority("com.whoop").appendPath("weeklyPlanSummary").appendQueryParameter("planId", planId).build();
        AbstractC22676k.m65749i(uriBuild, "build(...)");
        return uriBuild;
    }
}
