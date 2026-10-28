.class public final Lr5/e;
.super Lq5/b;
.source "SourceFile"


# instance fields
.field public final e:Landroid/content/Context;

.field public f:Lm5/g;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Landroid/os/CancellationSignal;

.field public final i:Lr5/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/e;->e:Landroid/content/Context;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lr5/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lr5/d;-><init>(Lq5/b;Landroid/os/Handler;I)V

    iput-object v0, p0, Lr5/e;->i:Lr5/d;

    return-void
.end method


# virtual methods
.method public final d(Lpo/j;)Lm5/o;
    .locals 11

    iget-object v0, p1, Lpo/j;->I:Lgp/q;

    iget-object v1, p1, Lpo/j;->G:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->w:Ljava/lang/String;

    iget-object v3, p1, Lpo/j;->F:Ljava/lang/String;

    const-string v4, "response.id"

    if-eqz v3, :cond_0

    new-instance p1, Lm5/q;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "androidx.credentials.BUNDLE_KEY_ID"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "androidx.credentials.BUNDLE_KEY_PASSWORD"

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p1, v0, v3}, Lm5/q;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    goto/16 :goto_f

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_8

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lpo/j;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v5

    :goto_0
    iget-object v4, p1, Lpo/j;->y:Ljava/lang/String;

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    iget-object v6, p1, Lpo/j;->z:Ljava/lang/String;

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    iget-object v7, p1, Lpo/j;->H:Ljava/lang/String;

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v7, v5

    :goto_3
    iget-object p1, p1, Lpo/j;->E:Landroid/net/Uri;

    if-eqz p1, :cond_5

    move-object v5, p1

    :cond_5
    new-instance p1, Liq/a;

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    const-string v9, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"

    invoke-virtual {v8, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"

    invoke-virtual {v8, v9, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"

    invoke-virtual {v8, v9, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"

    invoke-virtual {v8, v0, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"

    invoke-virtual {v8, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"

    invoke-virtual {v8, v0, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"

    invoke-virtual {v8, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    invoke-direct {p1, v0, v3, v8}, Lm5/m;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    goto/16 :goto_f

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "idToken should not be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "id should not be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-eqz v0, :cond_1b

    iget-object p1, v0, Lgp/q;->F:Lgp/i;

    iget-object v1, v0, Lgp/q;->E:Lgp/g;

    iget-object v2, v0, Lgp/q;->z:Lgp/h;

    new-instance v4, Lm5/m;

    sget-object v6, Lt5/a;->a:Ljava/util/LinkedHashMap;

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    if-eqz v2, :cond_9

    move-object v7, v2

    goto :goto_4

    :cond_9
    if-eqz v1, :cond_a

    move-object v7, v1

    goto :goto_4

    :cond_a
    if-eqz p1, :cond_1a

    move-object v7, p1

    :goto_4
    instance-of v8, v7, Lgp/i;

    const/4 v9, 0x1

    if-eqz v8, :cond_d

    check-cast v7, Lgp/i;

    iget-object p1, v7, Lgp/i;->w:Lgp/n;

    const-string v0, "authenticatorResponse.errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lgp/i;->x:Ljava/lang/String;

    sget-object v1, Lt5/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln5/a;

    if-eqz v1, :cond_c

    sget-object v2, Lgp/n;->L:Lgp/n;

    if-ne p1, v2, :cond_b

    if-eqz v0, :cond_b

    const-string p1, "Unable to get sync account"

    invoke-static {v0, p1, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-ne p1, v9, :cond_b

    new-instance p1, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    const-string v0, "Passkey retrieval was cancelled by the user."

    invoke-direct {p1, v0}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    invoke-direct {p1, v1, v0}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    goto :goto_5

    :cond_c
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    new-instance v1, Ln5/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    const-string v2, "unknown fido gms exception - "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    :goto_5
    throw p1

    :cond_d
    instance-of v8, v7, Lgp/g;

    if-eqz v8, :cond_19

    :try_start_0
    const-string v6, "clientExtensionResults"

    iget-object v7, v0, Lgp/q;->y:Lmp/t0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Lmp/t0;->m()[B

    move-result-object v10

    array-length v10, v10

    if-lez v10, :cond_e

    const-string v10, "rawId"

    invoke-virtual {v7}, Lmp/t0;->m()[B

    move-result-object v7

    invoke-static {v7}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_c

    :cond_e
    :goto_6
    iget-object v7, v0, Lgp/q;->H:Ljava/lang/String;

    if-eqz v7, :cond_f

    const-string v10, "authenticatorAttachment"

    invoke-virtual {v8, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_f
    iget-object v7, v0, Lgp/q;->x:Ljava/lang/String;

    if-eqz v7, :cond_10

    if-nez p1, :cond_10

    const-string v10, "type"

    invoke-virtual {v8, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_10
    iget-object v7, v0, Lgp/q;->w:Ljava/lang/String;

    if-eqz v7, :cond_11

    const-string v10, "id"

    invoke-virtual {v8, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_11
    const-string v7, "response"

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lgp/g;->b()Lorg/json/JSONObject;

    move-result-object v5

    :goto_7
    move v3, v9

    goto :goto_a

    :cond_12
    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lgp/h;->b()Lorg/json/JSONObject;

    move-result-object v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :cond_13
    if-eqz p1, :cond_15

    :try_start_2
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "code"

    iget-object v2, p1, Lgp/i;->w:Lgp/n;

    iget v2, v2, Lgp/n;->w:I

    invoke-virtual {v5, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object p1, p1, Lgp/i;->x:Ljava/lang/String;

    if-eqz p1, :cond_14

    const-string v1, "message"

    invoke-virtual {v5, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_8

    :catch_1
    move-exception p1

    goto :goto_9

    :cond_14
    :goto_8
    :try_start_3
    const-string v7, "error"

    goto :goto_a

    :goto_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error encoding AuthenticatorErrorResponse to JSON object"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_15
    :goto_a
    if-eqz v5, :cond_16

    invoke-virtual {v8, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_16
    iget-object p1, v0, Lgp/q;->G:Lgp/e;

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lgp/e;->b()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v8, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_b

    :cond_17
    if-eqz v3, :cond_18

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v8, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_18
    :goto_b
    :try_start_4
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "publicKeyCred.toJson()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_e

    :catchall_0
    move-exception p1

    goto :goto_d

    :goto_c
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error encoding PublicKeyCredential to JSON object"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_d
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The PublicKeyCredential response json had an unexpected exception when parsing: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AuthenticatorResponse expected assertion response but got: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PublicKeyUtility"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "json.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_e
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, p1, v9, v0}, Lm5/m;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    move-object p1, v4

    goto :goto_f

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No response set."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    const-string p1, "BeginSignIn"

    const-string v0, "Credential returned but no google Id or password or passkey found"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object p1, v5

    :goto_f
    if-eqz p1, :cond_1c

    new-instance v0, Lm5/o;

    invoke-direct {v0, p1}, Lm5/o;-><init>(Le4/a;)V

    return-object v0

    :cond_1c
    new-instance p1, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    const-string v0, "When attempting to convert get response, null credential found"

    invoke-direct {p1, v0}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Lm5/g;
    .locals 1

    iget-object v0, p0, Lr5/e;->f:Lm5/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final f()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lr5/e;->g:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "executor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
