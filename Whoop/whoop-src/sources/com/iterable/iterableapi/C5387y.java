package com.iterable.iterableapi;

import c93.InterfaceC4339a;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: com.iterable.iterableapi.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5387y extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C5387y f21890w = new C5387y(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableDataEncryptor", "Failed to initialize AndroidKeyStore", e5);
            KeyStore keyStore2 = KeyStore.getInstance("PKCS12");
            keyStore2.load(null, C5390z.f21892a);
            return keyStore2;
        }
    }
}
