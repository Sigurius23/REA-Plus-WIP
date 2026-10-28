package com.iterable.iterableapi;

import aa3.C0627i1;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p002a0.C0006a1;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.iterable.iterableapi.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5359o1 {

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f21793d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f21794a;

    /* JADX INFO: renamed from: b */
    public final C5390z f21795b;

    /* JADX INFO: renamed from: c */
    public boolean f21796c;

    public C5359o1(Context context) {
        AbstractC22676k.m65750j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iterable.iterableapi", 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        this.f21794a = sharedPreferences;
        boolean z4 = sharedPreferences.getBoolean("iterable-encryption-enabled", true);
        this.f21796c = z4;
        if (!z4) {
            AbstractC12350b.m34577Z("IterableKeychain", "SharedPreferences being used without encryption");
            return;
        }
        try {
            C5390z c5390z = new C5390z();
            if (!C5344k2.m16496d().containsAlias("iterable_encryption_key")) {
                try {
                    if (!AbstractC22676k.m65745e(C5344k2.m16496d().getType(), "AndroidKeyStore") || C5390z.m16541a() == null) {
                        C5390z.m16542b();
                    }
                } catch (Exception e5) {
                    AbstractC12350b.m34596q("IterableDataEncryptor", "Failed to generate key", e5);
                    throw e5;
                }
            }
            this.f21795b = c5390z;
            AbstractC12350b.m34577Z("IterableKeychain", "SharedPreferences being used with encryption");
            try {
                C0627i1 c0627i1 = new C0627i1(context, sharedPreferences, this);
                if (sharedPreferences.getBoolean("iterable-encrypted-migration-completed", false)) {
                    return;
                }
                c0627i1.f2198e = new C0006a1(this, 13);
                c0627i1.m1628l();
                AbstractC12350b.m34577Z("IterableKeychain", "Migration completed");
            } catch (Exception e13) {
                AbstractC12350b.m34581b0("IterableKeychain", "Migration failed, clearing data", e13);
                m16503a();
            }
        } catch (Exception e14) {
            AbstractC12350b.m34596q("IterableKeychain", "Failed to initialize encryption, falling back to plain text", e14);
            m16503a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16503a() {
        AbstractC12350b.m34579a0("IterableKeychain", "Decryption failed, permanently disabling encryption for this device. Please login again.");
        this.f21794a.edit().remove("iterable-email").remove("iterable-user-id").remove("iterable-unknown-user-id").remove("iterable-auth-token").putBoolean("iterable-encryption-enabled", false).apply();
        this.f21796c = false;
    }

    /* JADX INFO: renamed from: b */
    public final String m16504b(String str) {
        String strConcat = str.concat("_plaintext");
        SharedPreferences sharedPreferences = this.f21794a;
        boolean z4 = sharedPreferences.getBoolean(strConcat, false);
        if (this.f21796c) {
            if (z4) {
                return sharedPreferences.getString(str, null);
            }
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    C5390z c5390z = this.f21795b;
                    if (c5390z != null) {
                        return (String) f21793d.submit(new CallableC5351m1(0, c5390z, string)).get(500L, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception unused) {
                    m16503a();
                    return null;
                }
            }
        } else if (z4) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m16505c(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f21794a.edit();
        if (str2 == null) {
            editorEdit.remove(str).remove(str.concat("_plaintext")).apply();
            return;
        }
        if (!this.f21796c) {
            editorEdit.putString(str, str2).putBoolean(str.concat("_plaintext"), true).apply();
            return;
        }
        try {
            C5390z c5390z = this.f21795b;
            if (c5390z != null) {
                editorEdit.putString(str, (String) f21793d.submit(new CallableC5355n1(0, c5390z, str2)).get(500L, TimeUnit.MILLISECONDS)).remove(str.concat("_plaintext")).apply();
            }
        } catch (Exception unused) {
            m16503a();
            editorEdit.putString(str, str2).putBoolean(str.concat("_plaintext"), true).apply();
        }
    }
}
