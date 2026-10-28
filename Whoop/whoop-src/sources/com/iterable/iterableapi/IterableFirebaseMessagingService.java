package com.iterable.iterableapi;

import android.os.Bundle;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p002a0.C0021f1;
import p073cq.C11040i;
import p098dt.AbstractC12350b;
import p530up.AbstractC35148d;
import p692zt.C41112p;
import p692zt.RunnableC41108l;

/* JADX INFO: loaded from: classes.dex */
public class IterableFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX INFO: renamed from: l */
    public static String m16401l() {
        try {
            FirebaseMessaging firebaseMessagingM16384c = FirebaseMessaging.m16384c();
            firebaseMessagingM16384c.getClass();
            C11040i c11040i = new C11040i();
            firebaseMessagingM16384c.f21620f.execute(new RunnableC41108l(firebaseMessagingM16384c, c11040i, 0));
            return (String) Tasks.await(c11040i.f34644a);
        } catch (InterruptedException e5) {
            AbstractC12350b.m34595p("itblFCMMessagingService", e5.getLocalizedMessage());
            return null;
        } catch (ExecutionException e13) {
            AbstractC12350b.m34595p("itblFCMMessagingService", e13.getLocalizedMessage());
            return null;
        } catch (Exception unused) {
            AbstractC12350b.m34595p("itblFCMMessagingService", "Failed to fetch firebase token");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static void m16402m(FirebaseMessagingService firebaseMessagingService, C41112p c41112p) {
        Map mapM133446f = c41112p.m133446f();
        if (mapM133446f == 0 || ((C0021f1) mapM133446f).f50y == 0) {
            return;
        }
        AbstractC12350b.m34593n("itblFCMMessagingService", "Message data payload: " + c41112p.m133446f());
        if (c41112p.m133447h() != null) {
            AbstractC12350b.m34593n("itblFCMMessagingService", "Message Notification Body: " + c41112p.m133447h().m31826j());
        }
        Bundle bundleM111157H = AbstractC35148d.m111157H(mapM133446f);
        if (!AbstractC35148d.m111155F(bundleM111157H)) {
            AbstractC12350b.m34593n("itblFCMMessagingService", "Not an Iterable push message");
            return;
        }
        if (!AbstractC35148d.m111154E(bundleM111157H)) {
            if (AbstractC35148d.m111153D(bundleM111157H)) {
                AbstractC12350b.m34593n("itblFCMMessagingService", "Iterable OS notification push received");
                return;
            }
            AbstractC12350b.m34593n("itblFCMMessagingService", "Iterable push received " + mapM133446f);
            new AsyncTaskC5383w1().execute(AbstractC35148d.m111189t(firebaseMessagingService.getApplicationContext(), bundleM111157H));
            return;
        }
        AbstractC12350b.m34593n("itblFCMMessagingService", "Iterable ghost silent push received");
        String string = bundleM111157H.getString("notificationType");
        if (string == null || C5341k.f21742r.f21743a == null) {
            return;
        }
        switch (string) {
            case "UpdateEmbedded":
                C5310c0 c5310c0 = C5341k.f21742r.f21755m;
                if (c5310c0 == null) {
                    throw new RuntimeException("IterableApi must be initialized before calling getEmbeddedManager(). Make sure you call IterableApi#initialize() in Application#onCreate");
                }
                c5310c0.f21651w.f21744b.getClass();
                return;
            case "InAppRemove":
                String string2 = bundleM111157H.getString("messageId");
                if (string2 != null) {
                    C5315d1 c5315d1M16486e = C5341k.f21742r.m16486e();
                    synchronized (c5315d1M16486e) {
                        try {
                            C5339j1 c5339j1M718y = c5315d1M16486e.f21667y.m718y(string2);
                            if (c5339j1M718y != null) {
                                c5315d1M16486e.f21667y.m680K(c5339j1M718y);
                            }
                            c5315d1M16486e.m16422e();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            case "InAppUpdate":
                C5341k.f21742r.m16486e().m16426i();
                return;
            default:
                return;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: h */
    public final void mo16397h(C41112p c41112p) {
        m16402m(this, c41112p);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: j */
    public final void mo16399j(String str) {
        AbstractC12350b.m34593n("itblFCMMessagingService", "New Firebase Token generated: " + m16401l());
        C5341k.f21742r.m16490k();
    }
}
