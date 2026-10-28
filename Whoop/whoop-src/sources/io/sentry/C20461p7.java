package io.sentry;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.HashMap;
import p319m4.AbstractC25012a;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.p7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20461p7 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public HashMap f76584E;

    /* JADX INFO: renamed from: w */
    public final C20501v f76585w;

    /* JADX INFO: renamed from: x */
    public final String f76586x;

    /* JADX INFO: renamed from: y */
    public final String f76587y;

    /* JADX INFO: renamed from: z */
    public final String f76588z;

    public C20461p7(C20501v c20501v, String str, String str2, String str3) {
        this.f76585w = c20501v;
        this.f76586x = str;
        this.f76587y = str2;
        this.f76588z = str3;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K(AnalyticsRequestV2.PARAM_EVENT_ID);
        this.f76585w.serialize(c37199o, interfaceC20602v0);
        String str = this.f76586x;
        if (str != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(str);
        }
        String str2 = this.f76587y;
        if (str2 != null) {
            c37199o.m119207K(NotificationCompat.CATEGORY_EMAIL);
            c37199o.m119222b0(str2);
        }
        String str3 = this.f76588z;
        if (str3 != null) {
            c37199o.m119207K("comments");
            c37199o.m119222b0(str3);
        }
        HashMap map = this.f76584E;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76584E, str4, c37199o, str4, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("UserFeedback{eventId=");
        sb4.append(this.f76585w);
        sb4.append(", name='");
        sb4.append(this.f76586x);
        sb4.append("', email='");
        sb4.append(this.f76587y);
        sb4.append("', comments='");
        return AbstractC25012a.m73376i(this.f76588z, "'}", sb4);
    }
}
