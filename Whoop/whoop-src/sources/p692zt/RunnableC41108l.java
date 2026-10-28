package p692zt;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.internal.C5099k0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.whoop.service.network.model.UserSessionDto;
import io.sentry.android.core.C20119j1;
import p073cq.C11040i;
import p098dt.C12355g;
import u93.C34671d0;

/* JADX INFO: renamed from: zt.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC41108l implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177209w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FirebaseMessaging f177210x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11040i f177211y;

    public /* synthetic */ RunnableC41108l(FirebaseMessaging firebaseMessaging, C11040i c11040i, int i13) {
        this.f177209w = i13;
        this.f177210x = firebaseMessaging;
        this.f177211y = c11040i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f177209w) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f177210x;
                C11040i c11040i = this.f177211y;
                C34671d0 c34671d0 = FirebaseMessaging.f21612k;
                try {
                    c11040i.m29687b(firebaseMessaging.m16386a());
                    return;
                } catch (Exception e5) {
                    c11040i.m29686a(e5);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.f177210x;
                C11040i c11040i2 = this.f177211y;
                C34671d0 c34671d1 = FirebaseMessaging.f21612k;
                try {
                    C5099k0 c5099k0 = firebaseMessaging2.f21617c;
                    c5099k0.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                    Tasks.await(c5099k0.m16011o(c5099k0.m16001T(C20119j1.m56014c((C12355g) c5099k0.f21439x), "*", bundle)));
                    C34671d0 c34671d0M16385d = FirebaseMessaging.m16385d(firebaseMessaging2.f21616b);
                    String strM16387e = firebaseMessaging2.m16387e();
                    String strM56014c = C20119j1.m56014c(firebaseMessaging2.f21615a);
                    synchronized (c34671d0M16385d) {
                        String strM109559a = C34671d0.m109559a(strM16387e, strM56014c);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) c34671d0M16385d.f146043w).edit();
                        editorEdit.remove(strM109559a);
                        editorEdit.commit();
                    }
                    c11040i2.m29687b(null);
                    return;
                } catch (Exception e13) {
                    c11040i2.m29686a(e13);
                    return;
                }
        }
    }
}
