.class public final Lm5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/i;


# instance fields
.field public final a:Landroid/credentials/CredentialManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "credential"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/credentials/CredentialManager;

    iput-object p1, p0, Lm5/l;->a:Landroid/credentials/CredentialManager;

    return-void
.end method


# virtual methods
.method public final isAvailableOnDevice()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lm5/l;->a:Landroid/credentials/CredentialManager;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onCreateCredential(Landroid/content/Context;Lm5/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lav/b;

    check-cast p5, Leu/f;

    const/16 v1, 0x1d

    invoke-direct {v0, p5, v1}, Lav/b;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lm5/l;->a:Landroid/credentials/CredentialManager;

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lav/b;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v7, Lm5/j;

    move-object v0, p2

    check-cast v0, Lm5/d;

    invoke-direct {v7, p5, v0, p0}, Lm5/j;-><init>(Leu/f;Lm5/d;Lm5/l;)V

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance p5, Landroid/credentials/CreateCredentialRequest$Builder;

    iget-object p5, p2, Lm5/b;->a:Landroid/os/Bundle;

    iget-object v0, p2, Lm5/b;->c:Ldb/j0;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v3, "androidx.credentials.BUNDLE_KEY_USER_ID"

    iget-object v0, v0, Ldb/j0;->x:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME"

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER"

    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const v0, 0x7f080557

    invoke-static {p1, v0}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v3, "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON"

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO"

    invoke-virtual {p5, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p2, p2, Lm5/b;->b:Landroid/os/Bundle;

    new-instance v0, Landroid/credentials/CreateCredentialRequest$Builder;

    const-string v1, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    invoke-direct {v0, v1, p5, p2}, Landroid/credentials/CreateCredentialRequest$Builder;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Landroid/credentials/CreateCredentialRequest$Builder;->setIsSystemProviderRequired(Z)Landroid/credentials/CreateCredentialRequest$Builder;

    move-result-object p2

    const/4 p5, 0x1

    invoke-virtual {p2, p5}, Landroid/credentials/CreateCredentialRequest$Builder;->setAlwaysSendAppInfoToProvider(Z)Landroid/credentials/CreateCredentialRequest$Builder;

    move-result-object p2

    const-string p5, "Builder(\n               \u2026ndAppInfoToProvider(true)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/credentials/CreateCredentialRequest$Builder;->build()Landroid/credentials/CreateCredentialRequest;

    move-result-object v4

    const-string p2, "createCredentialRequestBuilder.build()"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Landroid/credentials/CredentialManager;->createCredential(Landroid/content/Context;Landroid/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    return-void
.end method

.method public final onGetCredential(Landroid/content/Context;Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm5/k;

    check-cast p5, Leu/f;

    const/4 v1, 0x0

    invoke-direct {v0, p5, v1}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lm5/l;->a:Landroid/credentials/CredentialManager;

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lm5/k;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v7, Lm5/j;

    invoke-direct {v7, p5, p0}, Lm5/j;-><init>(Leu/f;Lm5/l;)V

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance p5, Landroid/credentials/GetCredentialRequest$Builder;

    new-instance p5, Landroid/os/Bundle;

    invoke-direct {p5}, Landroid/os/Bundle;-><init>()V

    const-string v0, "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI"

    const/4 v1, 0x0

    invoke-virtual {p5, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"

    invoke-virtual {p5, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME"

    const/4 v3, 0x0

    invoke-virtual {p5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v0, Landroid/credentials/GetCredentialRequest$Builder;

    invoke-direct {v0, p5}, Landroid/credentials/GetCredentialRequest$Builder;-><init>(Landroid/os/Bundle;)V

    iget-object p2, p2, Lm5/n;->a:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lm5/p;

    new-instance v3, Landroid/credentials/CredentialOption$Builder;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p5, Lm5/p;->a:Landroid/os/Bundle;

    iget-object v4, p5, Lm5/p;->b:Landroid/os/Bundle;

    new-instance v5, Landroid/credentials/CredentialOption$Builder;

    const-string v6, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    invoke-direct {v5, v6, v3, v4}, Landroid/credentials/CredentialOption$Builder;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {v5, v1}, Landroid/credentials/CredentialOption$Builder;->setIsSystemProviderRequired(Z)Landroid/credentials/CredentialOption$Builder;

    move-result-object v3

    iget-object p5, p5, Lm5/p;->c:Ljava/util/Set;

    invoke-virtual {v3, p5}, Landroid/credentials/CredentialOption$Builder;->setAllowedProviders(Ljava/util/Set;)Landroid/credentials/CredentialOption$Builder;

    move-result-object p5

    invoke-virtual {p5}, Landroid/credentials/CredentialOption$Builder;->build()Landroid/credentials/CredentialOption;

    move-result-object p5

    invoke-virtual {v0, p5}, Landroid/credentials/GetCredentialRequest$Builder;->addCredentialOption(Landroid/credentials/CredentialOption;)Landroid/credentials/GetCredentialRequest$Builder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/credentials/GetCredentialRequest$Builder;->build()Landroid/credentials/GetCredentialRequest;

    move-result-object v4

    const-string p2, "builder.build()"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Landroid/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroid/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    return-void
.end method
