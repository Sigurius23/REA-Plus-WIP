package p211i5;

import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i5.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18092e {
    /* JADX INFO: renamed from: a */
    public static JobScheduler m51940a(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        AbstractC22676k.m65749i(jobSchedulerForNamespace, "forNamespace(...)");
        return jobSchedulerForNamespace;
    }

    /* JADX INFO: renamed from: b */
    public static AccessibilityNodeInfo.AccessibilityAction m51941b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: c */
    public static void m51942c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m51943d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m51944e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: f */
    public static void m51945f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z4);
    }
}
