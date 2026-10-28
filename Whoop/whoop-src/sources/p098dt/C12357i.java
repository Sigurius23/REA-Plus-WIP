package p098dt;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p687zo.AbstractC40910c;
import pg3.C29203o;
import pg3.C29205p;

/* JADX INFO: renamed from: dt.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12357i {

    /* JADX INFO: renamed from: a */
    public final String f41533a;

    /* JADX INFO: renamed from: b */
    public final String f41534b;

    /* JADX INFO: renamed from: c */
    public final String f41535c;

    /* JADX INFO: renamed from: d */
    public final String f41536d;

    /* JADX INFO: renamed from: e */
    public final String f41537e;

    /* JADX INFO: renamed from: f */
    public final String f41538f;

    /* JADX INFO: renamed from: g */
    public final String f41539g;

    public C12357i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i13 = AbstractC40910c.f176325a;
        AbstractC35135w.m111096h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f41534b = str;
        this.f41533a = str2;
        this.f41535c = str3;
        this.f41536d = str4;
        this.f41537e = str5;
        this.f41538f = str6;
        this.f41539g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C12357i m34613a(Context context) {
        C29203o c29203o = new C29203o(context, 6);
        String strM88700p0 = c29203o.m88700p0("google_app_id");
        if (TextUtils.isEmpty(strM88700p0)) {
            return null;
        }
        return new C12357i(strM88700p0, c29203o.m88700p0("google_api_key"), c29203o.m88700p0("firebase_database_url"), c29203o.m88700p0("ga_trackingId"), c29203o.m88700p0("gcm_defaultSenderId"), c29203o.m88700p0("google_storage_bucket"), c29203o.m88700p0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12357i)) {
            return false;
        }
        C12357i c12357i = (C12357i) obj;
        return AbstractC35135w.m111097i(this.f41534b, c12357i.f41534b) && AbstractC35135w.m111097i(this.f41533a, c12357i.f41533a) && AbstractC35135w.m111097i(this.f41535c, c12357i.f41535c) && AbstractC35135w.m111097i(this.f41536d, c12357i.f41536d) && AbstractC35135w.m111097i(this.f41537e, c12357i.f41537e) && AbstractC35135w.m111097i(this.f41538f, c12357i.f41538f) && AbstractC35135w.m111097i(this.f41539g, c12357i.f41539g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41534b, this.f41533a, this.f41535c, this.f41536d, this.f41537e, this.f41538f, this.f41539g});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f41534b, "applicationId");
        c29205p.m88707c(this.f41533a, "apiKey");
        c29205p.m88707c(this.f41535c, "databaseUrl");
        c29205p.m88707c(this.f41537e, "gcmSenderId");
        c29205p.m88707c(this.f41538f, "storageBucket");
        c29205p.m88707c(this.f41539g, "projectId");
        return c29205p.toString();
    }
}
