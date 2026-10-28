package p153fq;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import pg3.C29205p;

/* JADX INFO: renamed from: fq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14681a {

    /* JADX INFO: renamed from: a */
    public final Object f54245a;

    /* JADX INFO: renamed from: b */
    public final Status f54246b;

    public C14681a(Object obj, Status status) {
        this.f54245a = obj;
        this.f54246b = status;
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f54246b, NotificationCompat.CATEGORY_STATUS);
        c29205p.m88707c(this.f54245a, "result");
        return c29205p.toString();
    }
}
