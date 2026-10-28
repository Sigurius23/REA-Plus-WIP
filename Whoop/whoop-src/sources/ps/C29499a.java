package ps;

import android.content.Context;
import android.preference.PreferenceManager;
import io.sentry.android.replay.video.C20245d;
import p154fs.C14728f;
import p154fs.C14730h;

/* JADX INFO: renamed from: ps.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29499a {

    /* JADX INFO: renamed from: b */
    public static final Object f119956b = new Object();

    /* JADX INFO: renamed from: a */
    public final C14728f f119957a;

    public C29499a(C20245d c20245d) {
        Context context = (Context) c20245d.f76045a;
        String str = (String) c20245d.f76046b;
        String str2 = (String) c20245d.f76047c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f119957a = (C14728f) c20245d.f76052h;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C14730h m90130a() {
        return this.f119957a.m42229c();
    }
}
