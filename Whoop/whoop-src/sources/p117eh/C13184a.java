package p117eh;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import gt.C16172k;
import io.sentry.EnumC20311d4;
import java.io.Serializable;
import java.util.ArrayList;
import ne3.C26611e0;
import p098dt.C12355g;
import p425qh.AbstractC30358d;
import p625xt.C38641a;
import p691zs.C41073a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt.InterfaceC29509b;

/* JADX INFO: renamed from: eh.a */
/* JADX INFO: loaded from: classes.dex */
public class C13184a {

    /* JADX INFO: renamed from: a */
    public boolean f45696a;

    /* JADX INFO: renamed from: b */
    public Object f45697b;

    /* JADX INFO: renamed from: c */
    public Serializable f45698c;

    /* JADX INFO: renamed from: d */
    public Object f45699d;

    public C13184a(int i13) {
        switch (i13) {
            case 2:
                this.f45697b = new Object();
                this.f45698c = new ArrayList();
                this.f45699d = new ArrayList();
                this.f45696a = true;
                break;
            default:
                this.f45697b = null;
                this.f45698c = EnumC20311d4.AUTO;
                this.f45696a = false;
                this.f45699d = "manual";
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37075a(boolean z4) {
        C13188e c13188e = (C13188e) this.f45699d;
        synchronized (c13188e) {
            try {
                if (this.f45696a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC22676k.m65745e(((C13185b) this.f45697b).f45706g, this)) {
                    C13188e.m37081b(c13188e, this, z4);
                }
                this.f45696a = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C26611e0 m37076b(int i13) {
        C26611e0 c26611e0;
        C13188e c13188e = (C13188e) this.f45699d;
        synchronized (c13188e) {
            if (this.f45696a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f45698c)[i13] = true;
            Object obj = ((C13185b) this.f45697b).f45703d.get(i13);
            C13187d c13187d = c13188e.f45724P;
            C26611e0 c26611e1 = (C26611e0) obj;
            if (!c13187d.m79274x(c26611e1)) {
                AbstractC30358d.m92827a(c13187d.mo37080p0(c26611e1, false));
            }
            c26611e0 = (C26611e0) obj;
        }
        return c26611e0;
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m37077c() {
        boolean z4;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.f45696a) {
                        Boolean boolM37078d = m37078d();
                        this.f45698c = boolM37078d;
                        if (boolM37078d == null) {
                            ((C16172k) ((InterfaceC29509b) this.f45697b)).m45714a(new C41073a(6));
                        }
                        this.f45696a = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return zBooleanValue;
        } catch (Throwable th4) {
            throw th4;
        }
        Boolean bool = (Boolean) this.f45698c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            C12355g c12355g = ((FirebaseMessaging) this.f45699d).f21615a;
            c12355g.m34610a();
            C38641a c38641a = (C38641a) c12355g.f41525g.get();
            synchronized (c38641a) {
                z4 = c38641a.f166180a;
            }
            zBooleanValue = z4;
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    public Boolean m37078d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C12355g c12355g = ((FirebaseMessaging) this.f45699d).f21615a;
        c12355g.m34610a();
        Context context = c12355g.f41519a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean[], java.io.Serializable] */
    public C13184a(C13188e c13188e, C13185b c13185b) {
        this.f45699d = c13188e;
        this.f45697b = c13185b;
        this.f45698c = new boolean[2];
    }
}
