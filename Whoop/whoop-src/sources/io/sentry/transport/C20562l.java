package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: renamed from: io.sentry.transport.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20562l extends Authenticator {

    /* JADX INFO: renamed from: a */
    public final String f77034a;

    /* JADX INFO: renamed from: b */
    public final String f77035b;

    public C20562l(String str, String str2) {
        this.f77034a = str;
        this.f77035b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f77034a, this.f77035b.toCharArray());
    }
}
