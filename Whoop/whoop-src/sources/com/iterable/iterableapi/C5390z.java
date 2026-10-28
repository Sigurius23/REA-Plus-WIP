package com.iterable.iterableapi;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import l83.C23454a0;
import l83.C23470p;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: com.iterable.iterableapi.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5390z {

    /* JADX INFO: renamed from: a */
    public static final char[] f21892a;

    /* JADX INFO: renamed from: b */
    public static final C23470p f21893b;

    static {
        char[] charArray = "test_password".toCharArray();
        AbstractC22676k.m65749i(charArray, "this as java.lang.String).toCharArray()");
        f21892a = charArray;
        f21893b = AbstractC30060g.m92088H(C5387y.f21890w);
    }

    /* JADX INFO: renamed from: a */
    public static C23454a0 m16541a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("iterable_encryption_key", 3).setBlockModes("GCM", "CBC").setEncryptionPaddings("NoPadding", "PKCS7Padding").build();
            AbstractC22676k.m65749i(keyGenParameterSpecBuild, "build(...)");
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
            return C23454a0.f92919a;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableDataEncryptor", "Failed to generate key using AndroidKeyStore", e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16542b() throws NoSuchAlgorithmException, KeyStoreException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        C5344k2.m16496d().setEntry("iterable_encryption_key", new KeyStore.SecretKeyEntry(keyGenerator.generateKey()), AbstractC22676k.m65745e(C5344k2.m16496d().getType(), "PKCS12") ? new KeyStore.PasswordProtection(f21892a) : null);
    }

    /* JADX INFO: renamed from: c */
    public static SecretKey m16543c() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        KeyStore.Entry entry = C5344k2.m16496d().getEntry("iterable_encryption_key", AbstractC22676k.m65745e(C5344k2.m16496d().getType(), "PKCS12") ? new KeyStore.PasswordProtection(f21892a) : null);
        AbstractC22676k.m65748h(entry, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        AbstractC22676k.m65749i(secretKey, "getSecretKey(...)");
        return secretKey;
    }
}
