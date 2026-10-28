package v30;

import android.content.Context;
import androidx.core.app.ActivityOptionsCompat;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import p179h.C16351i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35596e {

    /* JADX INFO: renamed from: a */
    public final ActivityOptionsCompat f151363a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC35593b f151364b;

    /* JADX INFO: renamed from: c */
    public final C35602k f151365c;

    /* JADX INFO: renamed from: d */
    public boolean f151366d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f151367e;

    /* JADX INFO: renamed from: f */
    public final C13081r1 f151368f;

    /* JADX INFO: renamed from: g */
    public C16351i f151369g;

    public C35596e(Context context, ActivityOptionsCompat activityOptionsCompat, InterfaceC35593b interfaceC35593b, C35602k paymentCardRecognitionClient) {
        AbstractC22676k.m65750j(paymentCardRecognitionClient, "paymentCardRecognitionClient");
        this.f151363a = activityOptionsCompat;
        this.f151364b = interfaceC35593b;
        this.f151365c = paymentCardRecognitionClient;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f151367e = c13045h2M36593c;
        this.f151368f = AbstractC13091v.m36598h(c13045h2M36593c);
        paymentCardRecognitionClient.m112796a(context, new C35595d(this, 2), new C35595d(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final void m112795a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        if (this.f151366d) {
            return;
        }
        this.f151366d = true;
        this.f151365c.m112796a(context, new C35595d(this, 0), new C35595d(this, 1));
    }
}
