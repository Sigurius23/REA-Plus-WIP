package p320m5;

import android.os.Bundle;
import p087db.C11856j0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C25060d extends AbstractC25058b {

    /* JADX INFO: renamed from: d */
    public final String f98193d;

    /* JADX INFO: renamed from: e */
    public final String f98194e;

    public C25060d(String str, String password) {
        AbstractC22676k.m65750j(password, "password");
        C11856j0 c11856j0 = new C11856j0(str, 6);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
        bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
        super(bundle, new Bundle(), c11856j0);
        this.f98193d = str;
        this.f98194e = password;
        if (password.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }
}
