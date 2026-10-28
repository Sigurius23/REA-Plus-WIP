package p320m5;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.whoop.android.R;
import eu.C13610f;
import java.util.concurrent.Executor;
import p021av.C2088b;
import p087db.C11856j0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m5.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C25068l implements InterfaceC25065i {

    /* JADX INFO: renamed from: a */
    public final CredentialManager f98201a;

    public C25068l(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f98201a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // p320m5.InterfaceC25065i
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f98201a != null;
    }

    @Override // p320m5.InterfaceC25065i
    public final void onCreateCredential(Context context, AbstractC25058b abstractC25058b, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g interfaceC25063g) {
        AbstractC22676k.m65750j(context, "context");
        C13610f c13610f = (C13610f) interfaceC25063g;
        C2088b c2088b = new C2088b(c13610f, 29);
        CredentialManager credentialManager = this.f98201a;
        if (credentialManager == null) {
            c2088b.invoke();
            return;
        }
        C25066j c25066j = new C25066j(c13610f, (C25060d) abstractC25058b, this);
        AbstractC22676k.m65747g(credentialManager);
        Bundle bundle = abstractC25058b.f98190a;
        C11856j0 c11856j0 = abstractC25058b.f98192c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", c11856j0.f38685x);
        if (!TextUtils.isEmpty(null)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.ic_password));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, abstractC25058b.f98191b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        AbstractC22676k.m65749i(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        AbstractC22676k.m65749i(createCredentialRequestBuild, "createCredentialRequestBuilder.build()");
        credentialManager.createCredential(context, createCredentialRequestBuild, cancellationSignal, executor, c25066j);
    }

    @Override // p320m5.InterfaceC25065i
    public final void onGetCredential(Context context, C25070n c25070n, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g interfaceC25063g) {
        AbstractC22676k.m65750j(context, "context");
        C13610f c13610f = (C13610f) interfaceC25063g;
        C25067k c25067k = new C25067k(c13610f, 0);
        CredentialManager credentialManager = this.f98201a;
        if (credentialManager == null) {
            c25067k.invoke();
            return;
        }
        C25066j c25066j = new C25066j(c13610f, this);
        AbstractC22676k.m65747g(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (C25072p c25072p : c25070n.f98202a) {
            c25072p.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("android.credentials.TYPE_PASSWORD_CREDENTIAL", c25072p.f98204a, c25072p.f98205b).setIsSystemProviderRequired(false).setAllowedProviders(c25072p.f98206c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        AbstractC22676k.m65749i(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, c25066j);
    }
}
