package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p394p5.BinderC28844a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "p5/a", "credentials-play-services-auth_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: w */
    public final BinderC28844a f5312w = new BinderC28844a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        return this.f5312w;
    }
}
