package ro;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p012ab.C0682h0;
import p529uo.AbstractC35135w;
import to.C33991p;

/* JADX INFO: renamed from: ro.c */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC31618c implements Runnable {

    /* JADX INFO: renamed from: y */
    public static final C0682h0 f130642y = new C0682h0("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: w */
    public final String f130643w;

    /* JADX INFO: renamed from: x */
    public final C33991p f130644x;

    public RunnableC31618c(String str) {
        AbstractC35135w.m111092d(str);
        this.f130643w = str;
        this.f130644x = new C33991p(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0682h0 c0682h0 = f130642y;
        Status status = Status.f20490G;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f130643w).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f20488E;
            } else {
                Log.e((String) c0682h0.f2433y, ((String) c0682h0.f2434z).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (c0682h0.f2432x <= 3) {
                Log.d((String) c0682h0.f2433y, ((String) c0682h0.f2434z).concat(str));
            }
        } catch (IOException e5) {
            Log.e((String) c0682h0.f2433y, ((String) c0682h0.f2434z).concat("IOException when revoking access: ".concat(String.valueOf(e5.toString()))));
        } catch (Exception e13) {
            Log.e((String) c0682h0.f2433y, ((String) c0682h0.f2434z).concat("Exception when revoking access: ".concat(String.valueOf(e13.toString()))));
        }
        this.f130644x.m15605a0(status);
    }
}
