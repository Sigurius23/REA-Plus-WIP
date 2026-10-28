.class public final Lm5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm5/g;


# direct methods
.method public constructor <init>(Leu/f;Lm5/d;Lm5/l;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lm5/j;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lm5/j;->x:Lm5/g;

    return-void
.end method

.method public constructor <init>(Leu/f;Lm5/l;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lm5/j;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm5/j;->x:Lm5/g;

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Throwable;)V
    .locals 6

    iget v0, p0, Lm5/j;->w:I

    const-string v1, "error.type"

    const/4 v2, 0x0

    iget-object v3, p0, Lm5/j;->x:Lm5/g;

    const-string v4, "CredManProvService"

    const-string v5, "error"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/credentials/GetCredentialException;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "GetCredentialResponse error returned from framework"

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    check-cast v3, Leu/f;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/credentials/exceptions/NoCredentialException;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/NoCredentialException;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "android.credentials.GetCredentialException.TYPE_USER_CANCELED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_2
    const-string v4, "android.credentials.GetCredentialException.TYPE_INTERRUPTED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialInterruptedException;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/GetCredentialInterruptedException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_3
    const-string v4, "android.credentials.GetCredentialException.TYPE_UNKNOWN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"

    invoke-static {v0, v4, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;->w:I

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-static {v0, v4, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    sget v1, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;->x:I

    invoke-static {v0, p1}, Lvp/c;->C(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v1, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v1}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v1
    :try_end_0
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v1, Landroidx/credentials/exceptions/GetCredentialCustomException;

    invoke-direct {v1, v0, p1}, Landroidx/credentials/exceptions/GetCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_1

    :cond_4
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialCustomException;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Landroidx/credentials/exceptions/GetCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v3, v0}, Leu/f;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Landroid/credentials/CreateCredentialException;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CreateCredentialResponse error returned from framework"

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    check-cast v3, Leu/f;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const-string v4, "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialNoCreateOptionException;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/CreateCredentialNoCreateOptionException;-><init>(Ljava/lang/String;)V

    goto/16 :goto_3

    :sswitch_5
    const-string v4, "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialInterruptedException;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/CreateCredentialInterruptedException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :sswitch_6
    const-string v4, "android.credentials.CreateCredentialException.TYPE_UNKNOWN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :sswitch_7
    const-string v4, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :goto_2
    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"

    invoke-static {v0, v4, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    sget v0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;->w:I

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    :try_start_1
    invoke-static {v0, v4, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_9

    sget v1, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;->x:I

    invoke-static {v0, p1}, Lvd/e;->k(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;

    move-result-object v0

    goto :goto_3

    :cond_9
    new-instance v1, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v1}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v1
    :try_end_1
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v1, Landroidx/credentials/exceptions/CreateCredentialCustomException;

    invoke-direct {v1, v0, p1}, Landroidx/credentials/exceptions/CreateCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_3

    :cond_a
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialCustomException;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Landroidx/credentials/exceptions/CreateCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialCancellationException;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/CreateCredentialCancellationException;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v3, v0}, Leu/f;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x2e8eeb80 -> :sswitch_3
        -0x2b57c88 -> :sswitch_2
        0x229a9a63 -> :sswitch_1
        0x256cf16b -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x7a828535 -> :sswitch_7
        0x4e7e62e8 -> :sswitch_6
        0x7cba5de0 -> :sswitch_5
        0x7f1271b7 -> :sswitch_4
    .end sparse-switch
.end method

.method public final onResult(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lm5/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/credentials/GetCredentialResponse;

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "GetCredentialResponse returned from framework"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lm5/j;->x:Lm5/g;

    check-cast v0, Leu/f;

    invoke-virtual {p1}, Landroid/credentials/GetCredentialResponse;->getCredential()Landroid/credentials/Credential;

    move-result-object p1

    const-string v1, "response.credential"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm5/o;

    invoke-virtual {p1}, Landroid/credentials/Credential;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "credential.type"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/credentials/Credential;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v3, "credential.data"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v3, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v3, :cond_0

    :try_start_1
    const-string v3, "androidx.credentials.BUNDLE_KEY_ID"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "androidx.credentials.BUNDLE_KEY_PASSWORD"

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lm5/q;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v5, p1, v4}, Lm5/q;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    new-instance v3, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v3}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v3

    :cond_0
    const-string v3, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v3, :cond_1

    :try_start_3
    const-string v3, "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lm5/m;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v4, 0x1

    invoke-direct {v5, v3, v4, p1}, Lm5/m;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    :try_start_4
    new-instance v3, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v3}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v3

    :cond_1
    new-instance v3, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v3}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v3
    :try_end_4
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    new-instance v5, Lm5/m;

    const/4 v3, 0x0

    invoke-direct {v5, v2, v3, p1}, Lm5/m;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    :goto_0
    invoke-direct {v1, v5}, Lm5/o;-><init>(Le4/a;)V

    invoke-virtual {v0, v1}, Leu/f;->onResult(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Landroid/credentials/CreateCredentialResponse;

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CredManProvService"

    const-string v1, "Create Result returned from framework: "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lm5/j;->x:Lm5/g;

    check-cast v0, Leu/f;

    invoke-virtual {p1}, Landroid/credentials/CreateCredentialResponse;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "response.data"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    new-instance p1, Lm5/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_5
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_1

    :catch_3
    new-instance p1, Lm5/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_1
    invoke-virtual {v0, p1}, Leu/f;->onResult(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
