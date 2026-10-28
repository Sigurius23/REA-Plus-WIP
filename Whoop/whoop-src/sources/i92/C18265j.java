package i92;

import com.whoop.service.network.NotificationApi;
import pg3.C29218v0;
import xg3.C38280g;

/* JADX INFO: renamed from: i92.j */
/* JADX INFO: loaded from: classes4.dex */
public class C18265j {

    /* JADX INFO: renamed from: a */
    private final String f71097a = "GCM";

    /* JADX INFO: renamed from: b */
    private final NotificationApi f71098b;

    public C18265j(NotificationApi notificationApi) {
        this.f71098b = notificationApi;
    }

    /* JADX INFO: renamed from: a */
    public C38280g<C29218v0<Void>> m52617a(String str) {
        return AbstractC18274s.m52648m(this.f71098b.registerPush(str, "GCM", "com.whoop.android"));
    }
}
