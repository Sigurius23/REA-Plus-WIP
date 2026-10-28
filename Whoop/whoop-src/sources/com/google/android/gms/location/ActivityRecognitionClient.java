package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.common.api.InterfaceC4972c;
import com.google.android.gms.tasks.Task;
import e73.C12803b;
import p016an.C1053d;
import p499t9.C33652u;
import p503tp.AbstractC34037h;
import p503tp.C34030d;
import p503tp.C34043n;
import p503tp.C34045p;
import p529uo.AbstractC35135w;
import pg3.C29205p;
import to.AbstractC33993q;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecognitionClient extends AbstractC4977h {
    public static final /* synthetic */ int zza = 0;

    public ActivityRecognitionClient(@RecentlyNonNull Activity activity) {
        super(activity, activity, AbstractC34037h.f142695a, InterfaceC4972c.f20498g, C4976g.f20501c);
    }

    @RecentlyNonNull
    public Task<Void> removeActivityTransitionUpdates(@RecentlyNonNull PendingIntent pendingIntent) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C34045p(2, pendingIntent);
        c12803bM107465a.f43826d = 2406;
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> removeActivityUpdates(@RecentlyNonNull PendingIntent pendingIntent) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C34045p(1, pendingIntent);
        c12803bM107465a.f43826d = 2402;
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> removeSleepSegmentUpdates(@RecentlyNonNull PendingIntent pendingIntent) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C34045p(3, pendingIntent);
        c12803bM107465a.f43826d = 2411;
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> requestActivityTransitionUpdates(@RecentlyNonNull C34030d c34030d, @RecentlyNonNull PendingIntent pendingIntent) {
        c34030d.f142682z = getContextAttributionTag();
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C29205p(c34030d, pendingIntent, false, 7);
        c12803bM107465a.f43826d = 2405;
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> requestActivityUpdates(long j7, @RecentlyNonNull PendingIntent pendingIntent) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C1053d(j7, pendingIntent, 10);
        c12803bM107465a.f43826d = 2401;
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> requestSleepSegmentUpdates(@RecentlyNonNull PendingIntent pendingIntent, @RecentlyNonNull C34043n c34043n) {
        AbstractC35135w.m111095g(pendingIntent, "PendingIntent must be specified.");
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        C33652u c33652u = new C33652u();
        c33652u.f140441w = pendingIntent;
        c33652u.f140442x = c34043n;
        c12803bM107465a.f43827e = c33652u;
        c12803bM107465a.f43825c = new C4986c[]{AbstractC34037h.f142696b};
        c12803bM107465a.f43826d = 2410;
        return doRead(c12803bM107465a.m35864g());
    }

    public ActivityRecognitionClient(@RecentlyNonNull Context context) {
        super(context, null, AbstractC34037h.f142695a, InterfaceC4972c.f20498g, C4976g.f20501c);
    }
}
