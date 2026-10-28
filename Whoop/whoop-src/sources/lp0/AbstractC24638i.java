package lp0;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.whoop.coaching.sleepcoach.harvard.view.C6223a;
import org.joda.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lp0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lorg/joda/time/Instant;", "Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "scale", "", "c", "(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I", "Landroid/app/Activity;", "d", "(Landroid/app/Activity;)I", "totalTimeDurationOnScreen", "Llp0/l;", "timeInBedWindow", "b", "(ILlp0/l;)Lorg/joda/time/Instant;", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24638i {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Instant m71988b(int i13, C24641l c24641l) {
        return new Instant(c24641l.getMiddle().getMillis() - ((long) (i13 / 2)));
    }

    /* JADX INFO: renamed from: c */
    public static final int m71989c(Instant instant, C6223a scale) {
        AbstractC22676k.m65750j(instant, "<this>");
        AbstractC22676k.m65750j(scale, "scale");
        return (int) (scale.m18561a() * (instant.getMillis() - scale.m18562b().getMillis()));
    }

    /* JADX INFO: renamed from: d */
    public static final int m71990d(Activity activity) {
        AbstractC22676k.m65750j(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = activity.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null) {
                return windowManager.getCurrentWindowMetrics().getBounds().width();
            }
            throw new IllegalArgumentException("Cannot get screen info without WindowManager");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }
}
