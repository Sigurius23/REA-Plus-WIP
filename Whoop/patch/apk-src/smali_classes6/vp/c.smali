.class public abstract Lvp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laf3/c0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Lfv/a;Lfv/i;Lkotlin/jvm/functions/Function1;)Lgv/e;
    .locals 0

    check-cast p0, Lfv/h;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lgv/e;

    invoke-direct {p0, p1, p2}, Lgv/e;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    return-object p0
.end method

.method public static C(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;
    .locals 3

    :try_start_0
    new-instance v0, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    new-instance v1, Ln5/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ln5/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ln5/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ln5/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ln5/a;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ln5/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Ln5/a;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ln5/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_6
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Ln5/a;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Ln5/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, Ln5/a;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ln5/a;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Ln5/a;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Ln5/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Ln5/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v1, Ln5/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_e
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Ln5/a;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_f
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance v1, Ln5/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v1, Ln5/a;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_11
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Ln5/a;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_12
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v1, Ln5/a;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_13
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    new-instance v1, Ln5/a;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_14
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    new-instance v1, Ln5/a;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_15
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    new-instance v1, Ln5/a;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_16
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    new-instance v1, Ln5/a;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_17
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    new-instance v1, Ln5/a;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_18
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    new-instance v1, Ln5/a;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_19
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    new-instance v1, Ln5/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1a
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    new-instance v1, Ln5/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1b
    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    new-instance v1, Ln5/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    :goto_0
    check-cast v0, Landroidx/credentials/exceptions/GetCredentialException;

    return-object v0

    :cond_1c
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v0
    :try_end_0
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialCustomException;

    invoke-direct {v0, p0, p1}, Landroidx/credentials/exceptions/GetCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final D(D)Landroidx/health/platform/client/proto/g0;
    .locals 2

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    invoke-static {v1, p0, p1}, Landroidx/health/platform/client/proto/g0;->t(Landroidx/health/platform/client/proto/g0;D)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    return-object p0
.end method

.method public static final E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;
    .locals 1

    const-string v0, "intToStringMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v0, p1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v0, Landroidx/health/platform/client/proto/g0;

    invoke-static {v0, p0}, Landroidx/health/platform/client/proto/g0;->q(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final G(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static H(Ljava/lang/String;)Lcd/n;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "INSUFFICIENT_PERMISSIONS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcd/h;->b:Lcd/h;

    return-object p0

    :sswitch_1
    const-string v0, "USER_CREDENTIALS_CHANGED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lcd/m;->b:Lcd/m;

    return-object p0

    :sswitch_2
    const-string v0, "INVALID_REQUEST"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Lcd/i;->b:Lcd/i;

    return-object p0

    :sswitch_3
    const-string v0, "TOKEN_EXPIRED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Lcd/l;->b:Lcd/l;

    return-object p0

    :sswitch_4
    const-string v0, "AUTHCODE_EXPIRED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Lcd/g;->b:Lcd/g;

    return-object p0

    :sswitch_5
    const-string v0, "server_error"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    new-instance v0, Lcd/j;

    invoke-direct {v0, p0}, Lcd/j;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    sget-object p0, Lcd/k;->b:Lcd/k;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7a7a59f4 -> :sswitch_5
        -0x792523a5 -> :sswitch_4
        -0x50384d61 -> :sswitch_3
        -0x430e23f9 -> :sswitch_2
        0x355e4dbd -> :sswitch_1
        0x3eb9c228 -> :sswitch_0
    .end sparse-switch
.end method

.method public static K(Ljava/lang/String;)Lre/g0;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EMAIL"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lre/d0;->b:Lre/d0;

    return-object p0

    :cond_0
    const-string v0, "SMS"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lre/f0;->b:Lre/f0;

    return-object p0

    :cond_1
    new-instance v0, Lre/e0;

    invoke-direct {v0, p0}, Lre/e0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static L(I[Ljava/lang/String;)F
    .locals 2

    aget-object p0, p1, p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/4 p1, 0x0

    cmpg-float p1, p0, p1

    if-ltz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, p0, p1

    if-gtz p1, :cond_0

    return p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Motion easing control point value must be between 0 and 1; instead got: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static M(Landroid/view/ViewConfiguration;)F
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    move-result p0

    return p0
.end method

.method public static T(Landroid/view/ViewConfiguration;)F
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    move-result p0

    return p0
.end method

.method public static final V(Lq3/y;)Ll3/g;
    .locals 3

    iget-object v0, p0, Lq3/y;->a:Ll3/g;

    iget-wide v1, p0, Lq3/y;->b:J

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result p0

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v1

    invoke-virtual {v0, p0, v1}, Ll3/g;->e(II)Ll3/g;

    move-result-object p0

    return-object p0
.end method

.method public static final X(La30/t0;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, La30/q0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, La30/q0;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    iget-object p0, p0, La30/q0;->w:Lh20/u2;

    iget-object p0, p0, Lh20/u2;->F:Lh20/n2;

    instance-of v0, p0, Lh20/m2;

    if-eqz v0, :cond_2

    check-cast p0, Lh20/m2;

    goto :goto_1

    :cond_2
    move-object p0, v1

    :goto_1
    if-nez p0, :cond_3

    return-object v1

    :cond_3
    iget-object p0, p0, Lh20/m2;->w:Lh20/s2;

    if-eqz p0, :cond_4

    iget-object p0, p0, Lh20/s2;->w:Ljava/lang/String;

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static final Y(Lq3/y;I)Ll3/g;
    .locals 4

    iget-object v0, p0, Lq3/y;->a:Ll3/g;

    iget-wide v1, p0, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v3

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v1

    add-int/2addr v1, p1

    iget-object p0, p0, Lq3/y;->a:Ll3/g;

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-virtual {v0, v3, p0}, Ll3/g;->e(II)Ll3/g;

    move-result-object p0

    return-object p0
.end method

.method public static final Z(Lq3/y;I)Ll3/g;
    .locals 3

    iget-object v0, p0, Lq3/y;->a:Ll3/g;

    iget-wide v1, p0, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result p0

    sub-int/2addr p0, p1

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result p1

    invoke-virtual {v0, p0, p1}, Ll3/g;->e(II)Ll3/g;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V
    .locals 2

    sget-object v0, Lp6/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object p0

    new-instance v0, Ln43/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Ln43/a;-><init>(Lhc3/d;Landroid/content/BroadcastReceiver$PendingResult;Lc93/m;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {p1, v1, v1, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "goAsync must never be called when the AsyncRequestWorker is meant to be used"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "action"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x754cf343

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0xe

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x70

    const/16 v4, 0x10

    move-object/from16 v6, p1

    if-nez v3, :cond_3

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v5, 0x380

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v7, v0, 0x16db

    const/16 v8, 0x492

    if-ne v7, v8, :cond_7

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v4, p3

    goto/16 :goto_7

    :cond_7
    :goto_5
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-wide v8, Li2/x;->f:J

    sget v15, Luj/g;->a:F

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x1

    int-to-float v9, v8

    sget-wide v12, Luj/g;->j:J

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v7, v9, v12, v13, v10}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_9

    :cond_8
    new-instance v10, Lch/c;

    const/4 v9, 0x6

    invoke-direct {v10, v1, v9}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lc93/a;

    const/4 v9, 0x7

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static {v7, v12, v13, v10, v9}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v9, Luj/g;->b:F

    add-float/2addr v9, v15

    int-to-float v2, v2

    div-float/2addr v9, v2

    invoke-static {v7, v9, v15}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v7, v11, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v9, v11, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-wide v9, Luj/g;->i:J

    int-to-float v2, v4

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shr-int/lit8 v4, v0, 0x3

    and-int/lit8 v7, v4, 0xe

    or-int/lit16 v7, v7, 0xd80

    and-int/lit8 v4, v4, 0x70

    or-int v12, v7, v4

    const/4 v13, 0x0

    move v7, v8

    move-object v8, v2

    move v2, v7

    move-object v7, v3

    invoke-static/range {v6 .. v13}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide v8, v9

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v23, v11

    sget-wide v10, Luj/g;->d:J

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    const/16 v25, 0x0

    const v26, 0x1fff2

    const/4 v7, 0x0

    const/4 v12, 0x0

    move-object v3, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v6, p2

    move/from16 v24, v0

    invoke-static/range {v6 .. v26}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v23

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object v4, v3

    :goto_7
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_d

    return-void

    :cond_d
    new-instance v0, Lgb/z;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lgb/z;-><init>(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static b0(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static final c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v2, p1

    move-object/from16 v14, p5

    const-string v0, "step"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v1, 0x47c74b68

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p8, 0x8

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_0

    move-object v1, v15

    goto :goto_0

    :cond_0
    move-object/from16 v1, p3

    :goto_0
    sget-object v3, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/amplitude/android/engagement/a;

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/content/Context;

    const v3, -0x1896950d

    invoke-virtual {v0, v3}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Luj/m;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v6

    instance-of v7, v6, Lcom/amplitude/android/engagement/types/PinFormFactor;

    if-eqz v7, :cond_1

    new-instance v7, Ll83/k;

    check-cast v6, Lcom/amplitude/android/engagement/types/PinFormFactor;

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/PinFormFactor;->isOpenByDefault()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/PinFormFactor;->isShowingMask()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v6, v6, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    if-eqz v6, :cond_1f

    new-instance v7, Ll83/k;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v7, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v6, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    const-wide/16 v11, 0x0

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_2

    new-instance v7, Ly3/l;

    invoke-direct {v7, v11, v12}, Ly3/l;-><init>(J)V

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v7, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_3

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v13, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    const/16 v17, 0x0

    if-ne v6, v8, :cond_4

    invoke-static/range {v17 .. v17}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_5

    invoke-static/range {v17 .. v17}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    move-wide/from16 v18, v11

    move-object v11, v7

    move-object v7, v3

    new-instance v3, Lpj/r;

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    const/4 v2, 0x0

    move-object/from16 v21, v4

    move-object/from16 v22, v8

    move-object/from16 v8, p0

    move-object/from16 v4, p4

    invoke-direct/range {v3 .. v13}, Lpj/r;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;I)V

    move-object/from16 v23, v4

    move-object v4, v3

    move-object v3, v5

    move-object/from16 v5, v23

    invoke-static {v0, v4, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11}, Lvp/c;->d(Lp1/c1;)J

    move-result-wide v12

    const/16 v4, 0x20

    shr-long/2addr v12, v4

    long-to-int v4, v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/l;

    iget-wide v12, v8, Ly3/l;->a:J

    const-wide v18, 0xffffffffL

    and-long v12, v12, v18

    long-to-int v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object v5, v3

    new-instance v3, Lpj/r;

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v2, v4

    move-object v14, v8

    move-object/from16 v8, p0

    move-object/from16 v4, p4

    invoke-direct/range {v3 .. v13}, Lpj/r;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;I)V

    move-object v8, v4

    invoke-static {v2, v14, v3, v0}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpj/p;

    if-eqz v2, :cond_6

    iget-object v2, v2, Lpj/p;->a:Lpj/f;

    iget-object v2, v2, Lpj/f;->a:Ljava/lang/Number;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    double-to-float v2, v2

    new-instance v3, Ly3/f;

    invoke-direct {v3, v2}, Ly3/f;-><init>(F)V

    goto :goto_2

    :cond_6
    move-object/from16 v3, v17

    :goto_2
    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpj/p;

    if-eqz v2, :cond_7

    iget-object v2, v2, Lpj/p;->a:Lpj/f;

    iget-object v2, v2, Lpj/f;->b:Ljava/lang/Number;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    double-to-float v2, v4

    new-instance v4, Ly3/f;

    invoke-direct {v4, v2}, Ly3/f;-><init>(F)V

    goto :goto_3

    :cond_7
    move-object/from16 v4, v17

    :goto_3
    if-eqz v3, :cond_8

    iget v7, v3, Ly3/f;->w:F

    if-nez v4, :cond_9

    :cond_8
    move-object v3, v0

    move-object v4, v1

    goto/16 :goto_c

    :cond_9
    iget v9, v4, Ly3/f;->w:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface/range {v20 .. v20}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v12, 0x1

    if-eqz v4, :cond_a

    if-eqz v16, :cond_a

    move v4, v12

    goto :goto_4

    :cond_a
    const/4 v4, 0x0

    :goto_4
    sget-object v5, Lpj/s;->w:Lpj/s;

    const/4 v13, 0x6

    invoke-static {v3, v4, v5, v0, v13}, Lds/p;->y(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    int-to-float v5, v4

    const/4 v13, 0x0

    invoke-static {v3, v13, v5, v12}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object v4, v13

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-eqz v2, :cond_b

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 v18, v6

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v19, v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_6

    :cond_c
    move-object/from16 v19, v11

    :goto_6
    invoke-static {v12, v0, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x28c7e771

    invoke-virtual {v0, v3}, Lp1/q;->f0(I)V

    if-eqz v16, :cond_e

    invoke-interface/range {v20 .. v20}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_e

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v11, 0x38

    invoke-static {v8, v3, v0, v11}, Lvp/c;->o(Landroid/graphics/Rect;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_e
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    iget v3, v10, Luj/m;->S:F

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v7, v9}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v10, v20

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_10

    move-object/from16 v11, v22

    if-ne v12, v11, :cond_f

    goto :goto_7

    :cond_f
    move-object/from16 v16, v1

    goto :goto_8

    :cond_10
    move-object/from16 v11, v22

    :goto_7
    new-instance v12, Lpj/a;

    move-object/from16 v16, v1

    const/4 v1, 0x1

    invoke-direct {v12, v1, v10}, Lpj/a;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v12}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move v12, v7

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_11

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v3, v0, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v0, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lsj/l;

    move-object/from16 v8, p0

    move-object/from16 v2, p1

    move-object/from16 v14, p5

    const/4 v3, 0x0

    invoke-direct {v1, v8, v2, v3, v14}, Lsj/l;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V

    move-object/from16 v4, v21

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v7, v19

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_14

    if-ne v6, v11, :cond_15

    :cond_14
    new-instance v6, Lb2/z;

    const/16 v5, 0x13

    invoke-direct {v6, v5, v4, v7}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v6}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v2, v4

    const/16 v4, 0x48

    const/4 v5, 0x0

    move v13, v3

    move-object v3, v0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v5}, Ls30/b;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    const v0, 0x65ea75cc

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v0, v0, Ly3/l;->a:J

    const-wide/16 v4, 0x0

    invoke-static {v0, v1, v4, v5}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_1c

    const/4 v0, -0x1

    if-nez p2, :cond_16

    move v1, v0

    goto :goto_a

    :cond_16
    sget-object v1, Lpj/z;->a:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_a
    if-eq v1, v0, :cond_1b

    const/4 v0, 0x1

    if-eq v1, v0, :cond_1a

    const/4 v0, 0x2

    if-eq v1, v0, :cond_17

    const v0, -0x28c7de4f

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_17
    const v0, -0x28c7e07e

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpj/p;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v4, v0, Ly3/l;->a:J

    move-wide v5, v4

    invoke-static {v15, v12, v9}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_18

    if-ne v2, v11, :cond_19

    :cond_18
    new-instance v2, Lmj/e;

    const/4 v0, 0x6

    invoke-direct {v2, v0, v10}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v2, Lc93/a;

    const/16 v7, 0x8

    move-wide/from16 v23, v5

    move-object v5, v2

    move-object v6, v3

    move-wide/from16 v2, v23

    invoke-static/range {v1 .. v7}, Le4/a;->d(Lpj/p;JLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v6

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_1a
    const v0, -0x28c7e229

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpj/p;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v4, v0, Ly3/l;->a:J

    invoke-static {v15, v12, v9}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v6, 0x8

    move-wide/from16 v23, v4

    move-object v5, v3

    move-wide/from16 v2, v23

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Le4/a;->b(Lpj/p;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v5

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_1b
    const v0, -0x28c7de8d

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    :cond_1c
    :goto_b
    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-nez v10, :cond_1d

    goto :goto_d

    :cond_1d
    new-instance v0, Lpj/q;

    const/4 v9, 0x2

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v7, p7

    move-object v1, v8

    move-object v6, v14

    move-object/from16 v4, v16

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lpj/q;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void

    :goto_c
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-nez v10, :cond_1e

    goto :goto_d

    :cond_1e
    new-instance v0, Lpj/q;

    const/4 v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lpj/q;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_1f
    move-object v3, v0

    move-object v4, v1

    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-nez v10, :cond_20

    :goto_d
    return-void

    :cond_20
    new-instance v0, Lpj/q;

    const/4 v9, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lpj/q;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final c0(Lcom/google/gson/Gson;Lj93/d;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/gson/Gson;->excluder()Lcom/google/gson/internal/Excluder;

    move-result-object p0

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/Excluder;->excludeClass(Ljava/lang/Class;Z)Z

    move-result p0

    return p0
.end method

.method public static final d(Lp1/c1;)J
    .locals 2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0
.end method

.method public static d0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "("

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(ILandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;)V
    .locals 9

    check-cast p1, Lp1/q;

    const v0, -0x57560980

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x100

    goto :goto_0

    :cond_0
    const/16 v0, 0x80

    :goto_0
    or-int/2addr v0, p0

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_2
    :goto_1
    const/4 v0, 0x2

    new-array v0, v0, [Lc93/m;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const/4 v2, 0x1

    aput-object p4, v0, v2

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const v3, 0x54045800

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_3

    sget-object v3, Lg40/b0;->a:Lg40/b0;

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Ly2/z0;

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    new-instance v5, Lc4/e;

    const/16 v6, 0xd

    invoke-direct {v5, v0, v6}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const v6, 0x4bcece3c    # 2.7106424E7f

    invoke-direct {v0, v5, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_4

    new-instance v5, Ly2/a1;

    invoke-direct {v5, v3}, Ly2/a1;-><init>(Ly2/z0;)V

    invoke-virtual {p1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Ly2/r0;

    iget-wide v3, p1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v8, p1, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {p1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_2
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p1, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {p1, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v3, p1, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p1, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v0, p1, v2}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lg1/o0;

    invoke-direct {v0, p3, p4, p2, p0}, Lg1/o0;-><init>(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final f(Ljava/lang/String;Lx1/b;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/l1;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v0, p15

    move/from16 v2, p16

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const-string v5, "value"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "visualTransformation"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "interactionSource"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "shape"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p14

    check-cast v15, Lp1/q;

    const v5, -0x41b94401

    invoke-virtual {v15, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v5, v5, v16

    goto :goto_3

    :cond_3
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v6, v0, 0x180

    const/16 v16, 0x80

    if-nez v6, :cond_5

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    move/from16 v6, v16

    :goto_4
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v0, 0xc00

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-nez v6, :cond_7

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move/from16 v6, v19

    goto :goto_5

    :cond_6
    move/from16 v6, v18

    :goto_5
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_9

    move-object/from16 v6, p4

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_8

    const/16 v20, 0x4000

    goto :goto_6

    :cond_8
    const/16 v20, 0x2000

    :goto_6
    or-int v5, v5, v20

    goto :goto_7

    :cond_9
    move-object/from16 v6, p4

    :goto_7
    const/high16 v20, 0x30000

    and-int v20, v0, v20

    move-object/from16 v10, p5

    if-nez v20, :cond_b

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_a

    const/high16 v21, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v21, 0x10000

    :goto_8
    or-int v5, v5, v21

    :cond_b
    const/high16 v21, 0x180000

    and-int v21, v0, v21

    move-object/from16 v10, p6

    if-nez v21, :cond_d

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v21, 0x80000

    :goto_9
    or-int v5, v5, v21

    :cond_d
    const/high16 v21, 0xc00000

    and-int v21, v0, v21

    move/from16 v10, p7

    if-nez v21, :cond_f

    invoke-virtual {v15, v10}, Lp1/q;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_e

    const/high16 v21, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v21, 0x400000

    :goto_a
    or-int v5, v5, v21

    :cond_f
    const/high16 v21, 0x6000000

    and-int v21, v0, v21

    move/from16 v12, p8

    if-nez v21, :cond_11

    invoke-virtual {v15, v12}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_10

    const/high16 v22, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v22, 0x2000000

    :goto_b
    or-int v5, v5, v22

    :cond_11
    const/high16 v22, 0x30000000

    and-int v22, v0, v22

    move/from16 v9, p9

    if-nez v22, :cond_13

    invoke-virtual {v15, v9}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_12

    const/high16 v23, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v23, 0x10000000

    :goto_c
    or-int v5, v5, v23

    :cond_13
    and-int/lit8 v23, v2, 0x6

    if-nez v23, :cond_15

    invoke-virtual {v15, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_14

    const/16 v23, 0x4

    goto :goto_d

    :cond_14
    const/16 v23, 0x2

    :goto_d
    or-int v23, v2, v23

    goto :goto_e

    :cond_15
    move/from16 v23, v2

    :goto_e
    and-int/lit8 v24, v2, 0x30

    move-object/from16 v10, p11

    if-nez v24, :cond_17

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_16

    const/16 v17, 0x20

    goto :goto_f

    :cond_16
    const/16 v17, 0x10

    :goto_f
    or-int v23, v23, v17

    :cond_17
    and-int/lit16 v7, v2, 0x180

    if-nez v7, :cond_19

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    const/16 v16, 0x100

    :cond_18
    or-int v23, v23, v16

    :cond_19
    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_1b

    move-object/from16 v7, p13

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    move/from16 v18, v19

    :cond_1a
    or-int v23, v23, v18

    :goto_10
    move/from16 v0, v23

    goto :goto_11

    :cond_1b
    move-object/from16 v7, p13

    goto :goto_10

    :goto_11
    const v16, 0x12492493

    and-int v2, v5, v16

    const v4, 0x12492492

    if-ne v2, v4, :cond_1d

    and-int/lit16 v2, v0, 0x493

    const/16 v4, 0x492

    if-ne v2, v4, :cond_1d

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_12

    :cond_1c
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v2, v15

    goto/16 :goto_1b

    :cond_1d
    :goto_12
    const v2, 0x52effc5c

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v5, 0xe

    const/4 v4, 0x4

    if-ne v2, v4, :cond_1e

    const/4 v2, 0x1

    goto :goto_13

    :cond_1e
    const/4 v2, 0x0

    :goto_13
    and-int/lit16 v4, v5, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_1f

    const/4 v4, 0x1

    goto :goto_14

    :cond_1f
    const/4 v4, 0x0

    :goto_14
    or-int/2addr v2, v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_20

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_21

    :cond_20
    new-instance v2, Ll3/g;

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-direct {v2, v5, v1, v4}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-interface {v3, v2}, Lq3/g0;->a(Ll3/g;)Lq3/e0;

    move-result-object v4

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v4, Lq3/e0;

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    iget-object v2, v4, Lq3/e0;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v11, v15, v0}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_22

    sget-object v0, Li40/i;->w:Li40/i;

    goto :goto_15

    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_23

    sget-object v0, Li40/i;->x:Li40/i;

    goto :goto_15

    :cond_23
    sget-object v0, Li40/i;->y:Li40/i;

    :goto_15
    new-instance v5, Lg1/h8;

    const/4 v10, 0x2

    move-object v6, v7

    move v8, v9

    move-object v9, v11

    move v7, v12

    invoke-direct/range {v5 .. v10}, Lg1/h8;-><init>(Lg1/e8;ZZLj0/i;I)V

    move-object v4, v5

    sget-object v5, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/h9;

    iget-object v7, v6, Lg1/h9;->g:Ll3/v0;

    iget-object v6, v6, Lg1/h9;->l:Ll3/v0;

    invoke-virtual {v7}, Ll3/v0;->c()J

    move-result-wide v8

    sget-wide v10, Li2/x;->n:J

    invoke-static {v8, v9, v10, v11}, Li2/x;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_24

    invoke-virtual {v6}, Ll3/v0;->c()J

    move-result-wide v8

    invoke-static {v8, v9, v10, v11}, Li2/x;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_25

    :cond_24
    invoke-virtual {v7}, Ll3/v0;->c()J

    move-result-wide v7

    invoke-static {v7, v8, v10, v11}, Li2/x;->d(JJ)Z

    move-result v7

    if-nez v7, :cond_26

    invoke-virtual {v6}, Ll3/v0;->c()J

    move-result-wide v6

    invoke-static {v6, v7, v10, v11}, Li2/x;->d(JJ)Z

    move-result v6

    if-eqz v6, :cond_26

    :cond_25
    const/16 v18, 0x1

    goto :goto_16

    :cond_26
    const/16 v18, 0x0

    :goto_16
    const v6, 0x52f08fae

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/h9;

    iget-object v6, v6, Lg1/h9;->l:Ll3/v0;

    invoke-virtual {v6}, Ll3/v0;->c()J

    move-result-wide v6

    const v8, 0x52f096c9

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    const-wide/16 v8, 0x10

    if-eqz v18, :cond_28

    cmp-long v10, v6, v8

    if-eqz v10, :cond_27

    goto :goto_17

    :cond_27
    invoke-virtual {v4, v0, v15, v14}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li2/x;

    iget-wide v6, v6, Li2/x;->a:J

    :cond_28
    :goto_17
    move-wide/from16 v19, v6

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    const v6, 0x52f0a790

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/h9;

    iget-object v5, v5, Lg1/h9;->g:Ll3/v0;

    invoke-virtual {v5}, Ll3/v0;->c()J

    move-result-wide v5

    const v7, 0x52f0aee9

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    if-eqz v18, :cond_2a

    cmp-long v7, v5, v8

    if-eqz v7, :cond_29

    goto :goto_18

    :cond_29
    invoke-virtual {v4, v0, v15, v14}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v5, v5, Li2/x;->a:J

    :cond_2a
    :goto_18
    move-wide/from16 v21, v5

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    if-eqz p3, :cond_2b

    const/16 v23, 0x1

    :goto_19
    move-object v5, v4

    goto :goto_1a

    :cond_2b
    move/from16 v23, v6

    goto :goto_19

    :goto_1a
    new-instance v4, Li40/f;

    move-object/from16 v6, p4

    move-object/from16 v12, p5

    move/from16 v16, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v17, p11

    move-object/from16 v8, p13

    move-object v7, v2

    move-object v14, v13

    move-object v2, v15

    move-wide/from16 v24, v19

    move-wide/from16 v19, v21

    move-object/from16 v15, p1

    move-object/from16 v13, p6

    move-object/from16 v21, v5

    move-object/from16 v5, p3

    invoke-direct/range {v4 .. v18}, Li40/f;-><init>(Lc93/m;Lc93/m;Ljava/lang/String;Lg1/e8;ZZLj0/i;Lc93/m;Lc93/m;Li2/a1;Lx1/b;ZLl0/l1;Z)V

    const v5, 0x2f20cb9c

    invoke-static {v5, v2, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    move-wide/from16 v17, v24

    const/high16 v25, 0x1b0000

    sget-object v15, Li40/n;->a:Li40/n;

    move-object/from16 v16, v0

    move-object/from16 v24, v2

    move/from16 v22, v23

    move-object/from16 v23, v4

    invoke-virtual/range {v15 .. v25}, Li40/n;->a(Li40/i;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1b
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2c

    move-object v2, v0

    new-instance v0, Li40/b;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v26, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v16}, Li40/b;-><init>(Ljava/lang/String;Lx1/b;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/l1;Li2/a1;Lg1/e8;II)V

    move-object/from16 v2, v26

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method public static f0(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Z
    .locals 3

    invoke-virtual {p2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p2

    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getB()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object p2

    check-cast p2, Ljava/security/spec/ECFieldFp;

    invoke-virtual {p2}, Ljava/security/spec/ECFieldFp;->getP()Ljava/math/BigInteger;

    move-result-object p2

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/e8;Ll0/l1;Landroidx/compose/runtime/Composer;IIII)V
    .locals 49

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move/from16 v2, p3

    move-object/from16 v0, p18

    move/from16 v3, p21

    move/from16 v4, p22

    move/from16 v5, p24

    const-string v6, "value"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onValueChange"

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p20

    check-cast v6, Lp1/q;

    const v7, -0x13824e13

    invoke-virtual {v6, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v3, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v3

    goto :goto_1

    :cond_1
    move v7, v3

    :goto_1
    and-int/lit8 v10, v3, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v6, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :cond_3
    and-int/lit16 v10, v3, 0x180

    const/16 v16, 0x100

    if-nez v10, :cond_5

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move/from16 v10, v16

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v7, v10

    :cond_5
    and-int/lit16 v10, v3, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v10, :cond_7

    invoke-virtual {v6, v2}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_6

    move/from16 v10, v18

    goto :goto_4

    :cond_6
    move/from16 v10, v17

    :goto_4
    or-int/2addr v7, v10

    :cond_7
    or-int/lit16 v10, v7, 0x6000

    const/high16 v19, 0x30000

    and-int v20, v3, v19

    if-nez v20, :cond_8

    const v10, 0x16000

    or-int/2addr v10, v7

    :cond_8
    const/high16 v7, 0x180000

    and-int v20, v3, v7

    const/high16 v21, 0x80000

    move/from16 p20, v7

    move-object/from16 v7, p5

    if-nez v20, :cond_a

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_9

    const/high16 v20, 0x100000

    goto :goto_5

    :cond_9
    move/from16 v20, v21

    :goto_5
    or-int v10, v10, v20

    :cond_a
    and-int/lit16 v8, v5, 0x80

    const/high16 v22, 0xc00000

    if-eqz v8, :cond_b

    or-int v10, v10, v22

    move-object/from16 v9, p6

    goto :goto_7

    :cond_b
    and-int v22, v3, v22

    move-object/from16 v9, p6

    if-nez v22, :cond_d

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_c

    const/high16 v23, 0x800000

    goto :goto_6

    :cond_c
    const/high16 v23, 0x400000

    :goto_6
    or-int v10, v10, v23

    :cond_d
    :goto_7
    and-int/lit16 v11, v5, 0x100

    const/high16 v24, 0x6000000

    if-eqz v11, :cond_e

    or-int v10, v10, v24

    move-object/from16 v12, p7

    goto :goto_9

    :cond_e
    and-int v24, v3, v24

    move-object/from16 v12, p7

    if-nez v24, :cond_10

    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_f

    const/high16 v25, 0x4000000

    goto :goto_8

    :cond_f
    const/high16 v25, 0x2000000

    :goto_8
    or-int v10, v10, v25

    :cond_10
    :goto_9
    const/high16 v25, 0x30000000

    and-int v26, v3, v25

    const/high16 v27, 0x10000000

    const/high16 v28, 0x20000000

    move-object/from16 v13, p8

    if-nez v26, :cond_12

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_11

    move/from16 v29, v28

    goto :goto_a

    :cond_11
    move/from16 v29, v27

    :goto_a
    or-int v10, v10, v29

    :cond_12
    and-int/lit16 v1, v5, 0x400

    if-eqz v1, :cond_13

    or-int/lit8 v29, v4, 0x6

    move/from16 v30, v29

    move/from16 v29, v1

    move/from16 v1, p9

    goto :goto_c

    :cond_13
    and-int/lit8 v29, v4, 0x6

    if-nez v29, :cond_15

    move/from16 v29, v1

    move/from16 v1, p9

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_14

    const/16 v30, 0x4

    goto :goto_b

    :cond_14
    const/16 v30, 0x2

    :goto_b
    or-int v30, v4, v30

    goto :goto_c

    :cond_15
    move/from16 v29, v1

    move/from16 v1, p9

    move/from16 v30, v4

    :goto_c
    and-int/lit8 v31, v4, 0x30

    const/4 v1, 0x0

    if-nez v31, :cond_17

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_16

    const/16 v31, 0x20

    goto :goto_d

    :cond_16
    const/16 v31, 0x10

    :goto_d
    or-int v30, v30, v31

    :cond_17
    move/from16 v1, v30

    and-int/lit16 v3, v5, 0x1000

    if-eqz v3, :cond_18

    or-int/lit16 v1, v1, 0x180

    goto :goto_f

    :cond_18
    move/from16 v30, v1

    and-int/lit16 v1, v4, 0x180

    if-nez v1, :cond_1a

    move-object/from16 v1, p10

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    move/from16 v26, v16

    goto :goto_e

    :cond_19
    const/16 v26, 0x80

    :goto_e
    or-int v16, v30, v26

    move/from16 v1, v16

    goto :goto_f

    :cond_1a
    move-object/from16 v1, p10

    move/from16 v1, v30

    :goto_f
    move/from16 v16, v3

    and-int/lit16 v3, v5, 0x2000

    if-eqz v3, :cond_1c

    or-int/lit16 v1, v1, 0xc00

    move/from16 v26, v1

    :cond_1b
    move-object/from16 v1, p11

    goto :goto_10

    :cond_1c
    move/from16 v26, v1

    and-int/lit16 v1, v4, 0xc00

    if-nez v1, :cond_1b

    move-object/from16 v1, p11

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1d

    move/from16 v17, v18

    :cond_1d
    or-int v17, v26, v17

    move/from16 v26, v17

    :goto_10
    and-int/lit16 v1, v4, 0x6000

    if-nez v1, :cond_20

    and-int/lit16 v1, v5, 0x4000

    if-nez v1, :cond_1e

    move-object/from16 v1, p12

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1f

    const/16 v17, 0x4000

    goto :goto_11

    :cond_1e
    move-object/from16 v1, p12

    :cond_1f
    const/16 v17, 0x2000

    :goto_11
    or-int v26, v26, v17

    goto :goto_12

    :cond_20
    move-object/from16 v1, p12

    :goto_12
    const v17, 0x8000

    and-int v17, v5, v17

    if-eqz v17, :cond_21

    or-int v26, v26, v19

    move/from16 v1, p13

    goto :goto_14

    :cond_21
    and-int v18, v4, v19

    move/from16 v1, p13

    if-nez v18, :cond_23

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_22

    const/high16 v18, 0x20000

    goto :goto_13

    :cond_22
    const/high16 v18, 0x10000

    :goto_13
    or-int v26, v26, v18

    :cond_23
    :goto_14
    and-int v18, v4, p20

    if-nez v18, :cond_24

    or-int v26, v26, v21

    :cond_24
    const/high16 v18, 0x6c00000

    or-int v18, v26, v18

    and-int v25, v4, v25

    if-nez v25, :cond_26

    and-int v25, v5, v21

    move-object/from16 v1, p17

    if-nez v25, :cond_25

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_25

    move/from16 v27, v28

    :cond_25
    or-int v18, v18, v27

    goto :goto_15

    :cond_26
    move-object/from16 v1, p17

    :goto_15
    and-int/lit8 v25, p23, 0x6

    if-nez v25, :cond_28

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_27

    const/16 v20, 0x4

    goto :goto_16

    :cond_27
    const/16 v20, 0x2

    :goto_16
    or-int v20, p23, v20

    goto :goto_17

    :cond_28
    move/from16 v20, p23

    :goto_17
    and-int/lit8 v22, p23, 0x30

    move-object/from16 v1, p19

    if-nez v22, :cond_2a

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_29

    const/16 v23, 0x20

    goto :goto_18

    :cond_29
    const/16 v23, 0x10

    :goto_18
    or-int v20, v20, v23

    :cond_2a
    const v22, 0x12492493

    and-int v1, v10, v22

    move/from16 v23, v3

    const v3, 0x12492492

    if-ne v1, v3, :cond_2c

    and-int v1, v18, v22

    if-ne v1, v3, :cond_2c

    and-int/lit8 v1, v20, 0x13

    const/16 v3, 0x12

    if-ne v1, v3, :cond_2c

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2b

    goto :goto_19

    :cond_2b
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, v0

    move-object v0, v6

    move-object v7, v9

    move-object v8, v12

    move-object/from16 v12, p11

    goto/16 :goto_26

    :cond_2c
    :goto_19
    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v1, p21, 0x1

    const v20, -0x380001

    const v22, -0xe001

    const v24, -0x70001

    const p20, -0x70380001

    if-eqz v1, :cond_30

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_2d

    goto :goto_1b

    :cond_2d
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int v1, v10, v24

    and-int/lit16 v8, v5, 0x4000

    if-eqz v8, :cond_2e

    and-int v18, v18, v22

    :cond_2e
    and-int v8, v18, v20

    and-int v10, v5, v21

    if-eqz v10, :cond_2f

    and-int v8, v18, p20

    :cond_2f
    move/from16 v7, p9

    move-object/from16 v16, p11

    move-object/from16 v24, p12

    move/from16 v22, p14

    move/from16 v17, p15

    move-object/from16 v10, p16

    move-object/from16 v11, p17

    move/from16 v18, v1

    move/from16 v20, v8

    move-object v4, v9

    move-object/from16 v8, p10

    move/from16 v9, p13

    :goto_1a
    move-object v5, v12

    move-object/from16 v1, p4

    goto/16 :goto_23

    :cond_30
    :goto_1b
    sget-object v1, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v6, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/v0;

    and-int v10, v10, v24

    if-eqz v8, :cond_31

    const/4 v9, 0x0

    :cond_31
    if-eqz v11, :cond_32

    const/4 v12, 0x0

    :cond_32
    if-eqz v29, :cond_33

    const/4 v8, 0x0

    goto :goto_1c

    :cond_33
    move/from16 v8, p9

    :goto_1c
    if-eqz v16, :cond_34

    sget-object v11, Lq3/f0;->w:Lg40/h2;

    goto :goto_1d

    :cond_34
    move-object/from16 v11, p10

    :goto_1d
    if-eqz v23, :cond_35

    sget-object v16, Lu0/r0;->e:Lu0/r0;

    goto :goto_1e

    :cond_35
    move-object/from16 v16, p11

    :goto_1e
    and-int/lit16 v3, v5, 0x4000

    if-eqz v3, :cond_36

    new-instance v24, Lu0/q0;

    const/16 v28, 0x0

    const/16 v29, 0x3f

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v24 .. v29}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    and-int v18, v18, v22

    goto :goto_1f

    :cond_36
    move-object/from16 v24, p12

    :goto_1f
    if-eqz v17, :cond_37

    const/4 v3, 0x0

    goto :goto_20

    :cond_37
    move/from16 v3, p13

    :goto_20
    const/16 v17, 0x1

    if-eqz v3, :cond_38

    move/from16 v22, v17

    goto :goto_21

    :cond_38
    const v22, 0x7fffffff

    :goto_21
    and-int v20, v18, v20

    move-object/from16 p4, v1

    const v1, 0x535d2755

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move/from16 p6, v3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_39

    invoke-static {v6}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_39
    check-cast v1, Lj0/i;

    const/4 v3, 0x0

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    and-int v3, v5, v21

    if-eqz v3, :cond_3a

    sget-object v3, Lg1/i8;->a:Lg1/i8;

    invoke-static {v6}, Lg1/i8;->e(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v3

    and-int v18, v18, p20

    goto :goto_22

    :cond_3a
    move-object/from16 v3, p17

    move/from16 v18, v20

    :goto_22
    move v7, v8

    move-object v4, v9

    move-object v8, v11

    move/from16 v20, v18

    move/from16 v9, p6

    move-object v11, v3

    move/from16 v18, v10

    move-object v10, v1

    goto/16 :goto_1a

    :goto_23
    invoke-virtual {v6}, Lp1/q;->r()V

    const v3, 0x535d6268

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ll3/v0;->c()J

    move-result-wide v25

    const-wide/16 v27, 0x10

    cmp-long v3, v25, v27

    if-eqz v3, :cond_3b

    move-object/from16 p4, v4

    move-wide/from16 v33, v25

    :goto_24
    const/4 v3, 0x0

    goto :goto_25

    :cond_3b
    move-object v3, v0

    check-cast v3, Lg1/y1;

    invoke-virtual {v3, v2, v6}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    move-object/from16 p4, v4

    iget-wide v3, v3, Li2/x;->a:J

    move-wide/from16 v33, v3

    goto :goto_24

    :goto_25
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    new-instance v32, Ll3/v0;

    const-wide/16 v45, 0x0

    const v47, 0xfffffe

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v32 .. v47}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v3, v32

    invoke-virtual {v1, v3}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v21

    invoke-static {v15, v2, v7, v10, v0}, Lg1/i8;->f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lh00/q0;

    const/4 v12, 0x0

    invoke-direct {v4, v7, v12}, Lh00/q0;-><init>(ZLjava/lang/String;)V

    invoke-static {v3, v4}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    new-instance v14, Li2/c1;

    move-object v12, v0

    check-cast v12, Lg1/y1;

    invoke-virtual {v12, v7, v6}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v3, v0, Li2/x;->a:J

    invoke-direct {v14, v3, v4}, Li2/c1;-><init>(J)V

    new-instance v0, Li40/g;

    move-object/from16 v4, p4

    move-object/from16 v3, p5

    move-object/from16 v25, v1

    move-object/from16 p4, v14

    move-object/from16 v1, p0

    move-object v14, v6

    move-object v6, v13

    move-object/from16 v13, p19

    invoke-direct/range {v0 .. v13}, Li40/g;-><init>(Ljava/lang/String;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/y1;Ll0/l1;)V

    move-object/from16 v27, v4

    move-object/from16 v28, v5

    move/from16 v26, v7

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object v11, v8

    move v8, v9

    const v1, -0x17e68ed6

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v1, 0xfc7e

    and-int v1, v18, v1

    shl-int/lit8 v2, v20, 0x9

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v1, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v1, v3

    const/high16 v3, 0xe000000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    shr-int/lit8 v2, v20, 0x15

    and-int/lit8 v2, v2, 0xe

    or-int v2, v2, v19

    shr-int/lit8 v3, v20, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v3, v20, 0xf

    and-int/lit16 v3, v3, 0x1c00

    or-int v18, v2, v3

    const/16 v19, 0x1000

    const/4 v4, 0x0

    const/4 v12, 0x0

    move/from16 v3, p3

    move-object v15, v0

    move-object v13, v10

    move-object/from16 v6, v16

    move/from16 v10, v17

    move-object/from16 v5, v21

    move/from16 v9, v22

    move-object/from16 v2, v23

    move-object/from16 v7, v24

    move-object/from16 v0, p0

    move/from16 v17, v1

    move-object/from16 v16, v14

    move-object/from16 v1, p1

    move-object/from16 v14, p4

    invoke-static/range {v0 .. v19}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move/from16 v17, v10

    move-object v10, v13

    move-object v12, v6

    move-object v13, v7

    move v14, v8

    move v15, v9

    move-object/from16 v0, v16

    move/from16 v16, v17

    move-object/from16 v5, v25

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v18, v29

    move-object/from16 v19, v30

    move-object/from16 v17, v10

    move/from16 v10, v26

    :goto_26
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3c

    move-object v1, v0

    new-instance v0, Li40/c;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v20, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v48, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, Li40/c;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/e8;Ll0/l1;IIII)V

    move-object/from16 v1, v48

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_3c
    return-void
.end method

.method public static synthetic g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, p3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final h(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLjava/lang/String;Lq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/y1;Ll0/l1;Landroidx/compose/runtime/Composer;III)V
    .locals 41

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move/from16 v4, p3

    move/from16 v8, p8

    move-object/from16 v15, p9

    move-object/from16 v13, p18

    move/from16 v2, p21

    move/from16 v3, p22

    move/from16 v5, p23

    const-string v6, "onValueChange"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p20

    check-cast v6, Lp1/q;

    const v7, -0x343df946    # -2.5431412E7f

    invoke-virtual {v6, v7}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v7, p0

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v2

    and-int/lit8 v12, v2, 0x30

    const/16 v16, 0x20

    if-nez v12, :cond_2

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    move/from16 v12, v16

    goto :goto_1

    :cond_1
    const/16 v12, 0x10

    :goto_1
    or-int/2addr v9, v12

    :cond_2
    and-int/lit16 v12, v2, 0x180

    const/16 v17, 0x80

    const/16 v18, 0x100

    if-nez v12, :cond_4

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    move/from16 v12, v18

    goto :goto_2

    :cond_3
    move/from16 v12, v17

    :goto_2
    or-int/2addr v9, v12

    :cond_4
    and-int/lit16 v12, v2, 0xc00

    const/16 v19, 0x400

    const/16 v20, 0x800

    if-nez v12, :cond_6

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_5

    move/from16 v12, v20

    goto :goto_3

    :cond_5
    move/from16 v12, v19

    :goto_3
    or-int/2addr v9, v12

    :cond_6
    const v12, 0x16000

    or-int/2addr v12, v9

    and-int/lit16 v10, v5, 0x80

    if-eqz v10, :cond_7

    const v12, 0xc16000

    or-int/2addr v9, v12

    move v12, v9

    move-object/from16 v9, p6

    goto :goto_5

    :cond_7
    move-object/from16 v9, p6

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_8

    const/high16 v21, 0x800000

    goto :goto_4

    :cond_8
    const/high16 v21, 0x400000

    :goto_4
    or-int v12, v12, v21

    :goto_5
    const/high16 v21, 0x6000000

    or-int v12, v12, v21

    move-object/from16 v11, p7

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_9

    const/high16 v22, 0x20000000

    goto :goto_6

    :cond_9
    const/high16 v22, 0x10000000

    :goto_6
    or-int v12, v12, v22

    and-int/lit8 v22, v3, 0x6

    if-nez v22, :cond_b

    invoke-virtual {v6, v8}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_a

    const/16 v22, 0x4

    goto :goto_7

    :cond_a
    const/16 v22, 0x2

    :goto_7
    or-int v22, v3, v22

    goto :goto_8

    :cond_b
    move/from16 v22, v3

    :goto_8
    and-int/lit8 v23, v3, 0x30

    if-nez v23, :cond_d

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_c

    move/from16 v23, v16

    goto :goto_9

    :cond_c
    const/16 v23, 0x10

    :goto_9
    or-int v22, v22, v23

    :cond_d
    move/from16 v14, v22

    and-int/lit16 v1, v5, 0x1000

    if-eqz v1, :cond_f

    or-int/lit16 v14, v14, 0x180

    move/from16 v22, v1

    :cond_e
    move-object/from16 v1, p10

    goto :goto_a

    :cond_f
    move/from16 v22, v1

    and-int/lit16 v1, v3, 0x180

    if-nez v1, :cond_e

    move-object/from16 v1, p10

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_10

    move/from16 v17, v18

    :cond_10
    or-int v14, v14, v17

    :goto_a
    and-int/lit16 v1, v5, 0x2000

    if-eqz v1, :cond_12

    or-int/lit16 v14, v14, 0xc00

    move/from16 v17, v1

    :cond_11
    move-object/from16 v1, p11

    goto :goto_b

    :cond_12
    move/from16 v17, v1

    and-int/lit16 v1, v3, 0xc00

    if-nez v1, :cond_11

    move-object/from16 v1, p11

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    move/from16 v19, v20

    :cond_13
    or-int v14, v14, v19

    :goto_b
    and-int/lit16 v1, v3, 0x6000

    if-nez v1, :cond_16

    and-int/lit16 v1, v5, 0x4000

    if-nez v1, :cond_14

    move-object/from16 v1, p12

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_15

    const/16 v18, 0x4000

    goto :goto_c

    :cond_14
    move-object/from16 v1, p12

    :cond_15
    const/16 v18, 0x2000

    :goto_c
    or-int v14, v14, v18

    goto :goto_d

    :cond_16
    move-object/from16 v1, p12

    :goto_d
    const v18, 0x8000

    and-int v18, v5, v18

    const/high16 v19, 0x30000

    if-eqz v18, :cond_17

    or-int v14, v14, v19

    move/from16 v1, p13

    goto :goto_f

    :cond_17
    and-int v20, v3, v19

    move/from16 v1, p13

    if-nez v20, :cond_19

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_18

    const/high16 v20, 0x20000

    goto :goto_e

    :cond_18
    const/high16 v20, 0x10000

    :goto_e
    or-int v14, v14, v20

    :cond_19
    :goto_f
    const/high16 v20, 0x180000

    and-int v20, v3, v20

    if-nez v20, :cond_1a

    const/high16 v20, 0x80000

    or-int v14, v14, v20

    :cond_1a
    const/high16 v20, 0x6c00000

    or-int v20, v14, v20

    const/high16 v24, 0x30000000

    and-int v24, v3, v24

    if-nez v24, :cond_1b

    const/high16 v20, 0x16c00000

    or-int v20, v14, v20

    :cond_1b
    invoke-virtual {v6, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1c

    const/16 v21, 0x4

    :goto_10
    move-object/from16 v14, p19

    goto :goto_11

    :cond_1c
    const/16 v21, 0x2

    goto :goto_10

    :goto_11
    invoke-virtual {v6, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1d

    goto :goto_12

    :cond_1d
    const/16 v16, 0x10

    :goto_12
    or-int v16, v21, v16

    const v21, 0x12492493

    and-int v1, v12, v21

    const v2, 0x12492492

    if-ne v1, v2, :cond_1f

    and-int v1, v20, v21

    if-ne v1, v2, :cond_1f

    and-int/lit8 v1, v16, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_1f

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_1e

    goto :goto_13

    :cond_1e
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object v0, v6

    move-object v7, v9

    goto/16 :goto_1f

    :cond_1f
    :goto_13
    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v1, p21, 0x1

    const v16, -0xe001

    const v21, -0x70001

    const p20, -0x70380001

    if-eqz v1, :cond_22

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_15

    :cond_20
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int v1, v12, v21

    and-int/lit16 v10, v5, 0x4000

    if-eqz v10, :cond_21

    and-int v20, v20, v16

    :cond_21
    and-int v10, v20, p20

    move-object/from16 v17, p11

    move-object/from16 v22, p12

    move/from16 v2, p13

    move/from16 v18, p14

    move/from16 v16, p15

    move-object/from16 v11, p16

    move-object/from16 v12, p17

    move/from16 v20, v1

    move/from16 v23, v10

    move-object/from16 v10, p10

    :goto_14
    move-object/from16 v1, p4

    goto/16 :goto_1c

    :cond_22
    :goto_15
    sget-object v1, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v6, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/v0;

    and-int v12, v12, v21

    if-eqz v10, :cond_23

    const/4 v9, 0x0

    :cond_23
    if-eqz v22, :cond_24

    sget-object v10, Lq3/f0;->w:Lg40/h2;

    goto :goto_16

    :cond_24
    move-object/from16 v10, p10

    :goto_16
    if-eqz v17, :cond_25

    sget-object v17, Lu0/r0;->e:Lu0/r0;

    goto :goto_17

    :cond_25
    move-object/from16 v17, p11

    :goto_17
    and-int/lit16 v2, v5, 0x4000

    if-eqz v2, :cond_26

    new-instance v22, Lu0/q0;

    const/16 v26, 0x0

    const/16 v27, 0x3f

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    and-int v20, v20, v16

    goto :goto_18

    :cond_26
    move-object/from16 v22, p12

    :goto_18
    if-eqz v18, :cond_27

    const/4 v2, 0x0

    goto :goto_19

    :cond_27
    move/from16 v2, p13

    :goto_19
    const/16 v16, 0x1

    if-eqz v2, :cond_28

    move/from16 v18, v16

    :goto_1a
    move-object/from16 p4, v1

    goto :goto_1b

    :cond_28
    const v18, 0x7fffffff

    goto :goto_1a

    :goto_1b
    const v1, 0x53609695

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move/from16 p6, v2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_29

    invoke-static {v6}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_29
    check-cast v1, Lj0/i;

    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    sget-object v2, Lg1/i8;->a:Lg1/i8;

    invoke-static {v6}, Lg1/i8;->e(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v2

    and-int v20, v20, p20

    move-object v11, v1

    move/from16 v23, v20

    move/from16 v20, v12

    move-object v12, v2

    move/from16 v2, p6

    goto :goto_14

    :goto_1c
    invoke-virtual {v6}, Lp1/q;->r()V

    move/from16 p4, v2

    const v2, 0x5360d1a8

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ll3/v0;->c()J

    move-result-wide v24

    const-wide/16 v26, 0x10

    cmp-long v2, v24, v26

    if-eqz v2, :cond_2a

    move-wide/from16 v25, v24

    :goto_1d
    const/4 v2, 0x0

    goto :goto_1e

    :cond_2a
    invoke-virtual {v13, v4, v6}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    move-wide/from16 v25, v2

    goto :goto_1d

    :goto_1e
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    new-instance v24, Ll3/v0;

    const-wide/16 v37, 0x0

    const v39, 0xfffffe

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v24 .. v39}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v21

    invoke-static {v0, v4, v8, v11, v13}, Lg1/i8;->f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh00/q0;

    invoke-direct {v3, v8, v15}, Lh00/q0;-><init>(ZLjava/lang/String;)V

    invoke-static {v2, v3}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    new-instance v2, Li2/c1;

    invoke-virtual {v13, v8, v6}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    move-object/from16 p6, v1

    iget-wide v0, v3, Li2/x;->a:J

    invoke-direct {v2, v0, v1}, Li2/c1;-><init>(J)V

    move-object v0, v2

    new-instance v2, Li40/h;

    move-object/from16 v5, p5

    move-object v1, v0

    move-object v0, v6

    move-object v3, v7

    move-object v6, v9

    move-object v9, v10

    move/from16 v10, p4

    move-object/from16 v7, p7

    invoke-direct/range {v2 .. v14}, Li40/h;-><init>(Lq3/y;ZLc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/y1;Ll0/l1;)V

    move-object/from16 v25, v6

    move v8, v10

    move-object/from16 v26, v12

    const v3, 0x5f7d38f7

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const v3, 0xfc7e

    and-int v3, v20, v3

    shl-int/lit8 v4, v23, 0x9

    const/high16 v5, 0x380000

    and-int/2addr v5, v4

    or-int/2addr v3, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v5, v4

    or-int/2addr v3, v5

    const/high16 v5, 0xe000000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    shr-int/lit8 v4, v23, 0x15

    and-int/lit8 v4, v4, 0xe

    or-int v4, v4, v19

    shr-int/lit8 v5, v23, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v4, v5

    shr-int/lit8 v5, v23, 0xf

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v4, v5

    const/16 v19, 0x1000

    move-object v13, v11

    move-object v11, v9

    move/from16 v9, v18

    move/from16 v18, v4

    const/4 v4, 0x0

    const/4 v12, 0x0

    move-object/from16 v20, p6

    move-object v14, v1

    move-object v15, v2

    move/from16 v10, v16

    move-object/from16 v6, v17

    move-object/from16 v5, v21

    move-object/from16 v7, v22

    move-object/from16 v2, v24

    move-object/from16 v1, p1

    move-object/from16 v16, v0

    move/from16 v17, v3

    move-object/from16 v0, p0

    move/from16 v3, p3

    invoke-static/range {v0 .. v19}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v11

    move-object v11, v13

    move-object/from16 v0, v16

    move-object v12, v6

    move-object v13, v7

    move v14, v8

    move v15, v9

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v5, v20

    move-object/from16 v7, v25

    move-object/from16 v18, v26

    move-object v11, v1

    :goto_1f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2b

    move-object v1, v0

    new-instance v0, Li40/d;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    move-object/from16 v40, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v23}, Li40/d;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLjava/lang/String;Lq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/y1;Ll0/l1;III)V

    move-object/from16 v1, v40

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method public static final h0(J)Landroidx/health/platform/client/proto/g0;
    .locals 2

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    invoke-static {v1, p0, p1}, Landroidx/health/platform/client/proto/g0;->s(Landroidx/health/platform/client/proto/g0;J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    return-object p0
.end method

.method public static varargs i0([J)J
    .locals 6

    array-length v0, p0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    aget-wide v0, p0, v0

    const/4 v2, 0x1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    aget-wide v3, p0, v2

    cmp-long v5, v3, v0

    if-lez v5, :cond_0

    move-wide v0, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static synthetic j0(Lz40/k;Ljava/lang/String;I)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lz40/k;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static final k(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move/from16 v6, p5

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p4

    check-cast v7, Lp1/q;

    const v0, -0x3ccf2264

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0, p1}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_1

    or-int/lit8 v0, v0, 0x30

    goto :goto_2

    :cond_1
    invoke-virtual {v7, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_1

    :cond_2
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v0, v8

    :goto_2
    and-int/lit8 v8, p6, 0x4

    move v9, v3

    const/4 v3, 0x0

    if-eqz v8, :cond_3

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :cond_5
    :goto_4
    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v8, v0

    and-int/lit16 v0, v8, 0x493

    const/16 v10, 0x492

    if-ne v0, v10, :cond_8

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_a

    :cond_8
    :goto_6
    if-eqz v9, :cond_9

    move-object v9, v3

    goto :goto_7

    :cond_9
    move-object v9, p2

    :goto_7
    new-instance v0, Lg1/o8;

    const/4 v5, 0x3

    move-wide v1, p0

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lg1/o8;-><init>(JLjava/lang/Float;Lc93/m;I)V

    const v1, 0x319f1d26

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v9, :cond_a

    const v2, 0x111efbdb

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    shr-int/lit8 v2, v8, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x30

    invoke-static {v9, v0, v7, v2}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_a
    const v2, 0x111f023f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v7, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :goto_9
    move-object v3, v9

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_b

    new-instance v0, Lg1/j8;

    const/4 v7, 0x1

    move-wide v1, p0

    move-object v4, p3

    move v5, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/j8;-><init>(JLl3/v0;Lc93/m;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static k0(Landroid/content/Context;II)I
    .locals 1

    invoke-static {p0, p1}, Lio/sentry/config/a;->V(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p1, p0, Landroid/util/TypedValue;->type:I

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    iget p0, p0, Landroid/util/TypedValue;->data:I

    return p0

    :cond_0
    return p2
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lb30/k1;ZLkotlin/jvm/functions/Function1;Lj0/i;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    iget-boolean v0, v2, Lb30/k1;->c:Z

    iget-object v5, v2, Lb30/k1;->e:Lg40/s3;

    iget-boolean v6, v2, Lb30/k1;->b:Z

    const-string v7, "onValueChange"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v8, 0x72c7140b

    invoke-virtual {v7, v8}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int v8, p6, v8

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x20

    goto :goto_1

    :cond_1
    const/16 v9, 0x10

    :goto_1
    or-int/2addr v8, v9

    invoke-virtual {v7, v3}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x100

    goto :goto_2

    :cond_2
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v8, v9

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x800

    goto :goto_3

    :cond_3
    const/16 v9, 0x400

    :goto_3
    or-int/2addr v8, v9

    or-int/lit16 v8, v8, 0x6000

    and-int/lit16 v9, v8, 0x2493

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_5

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object/from16 v16, v7

    goto/16 :goto_c

    :cond_5
    :goto_4
    const v9, -0x24e07b17

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_6

    invoke-static {v7}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_6
    check-cast v9, Lj0/i;

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    sget-object v12, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v7, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg2/i;

    sget-object v13, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v7, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lb3/x2;

    const/4 v14, 0x1

    invoke-interface {v5, v14, v0}, Lg40/s3;->b(ZZ)Z

    move-result v15

    invoke-static {v15, v6, v7}, Luf/c0;->G(ZZLandroidx/compose/runtime/Composer;)Lg1/y1;

    move-result-object v11

    sget-object v16, Lg1/i8;->a:Lg1/i8;

    if-eqz v15, :cond_7

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    invoke-static {v1, v6, v14, v9, v11}, Lg1/i8;->f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-interface {v5}, Lg40/s3;->f()Lg40/h1;

    move-result-object v16

    const/16 v17, 0x0

    if-eqz v16, :cond_8

    const/4 v1, 0x1

    invoke-interface {v5, v1, v0}, Lg40/s3;->b(ZZ)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    move-object/from16 v16, v17

    :goto_6
    if-eqz v16, :cond_9

    invoke-interface/range {v16 .. v16}, Lg40/h1;->b()Lzy/b;

    move-result-object v0

    goto :goto_7

    :cond_9
    move-object/from16 v0, v17

    :goto_7
    const v1, -0x24e01e95

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    if-nez v0, :cond_a

    :goto_8
    move-object/from16 v0, v17

    const/4 v1, 0x0

    goto :goto_9

    :cond_a
    invoke-static {v0, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v17

    goto :goto_8

    :goto_9
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const-string v1, "<this>"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh00/q0;

    invoke-direct {v1, v15, v0}, Lh00/q0;-><init>(ZLjava/lang/String;)V

    invoke-static {v14, v1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v4, v2, Lb30/k1;->a:Ljava/lang/String;

    iget-boolean v0, v2, Lb30/k1;->b:Z

    const v1, 0x7f140ffb

    invoke-static {v7, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v7, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l5;

    iget-object v1, v1, Lg1/l5;->a:Lt0/a;

    const/16 v21, 0x8

    const/16 v22, 0x0

    sget-object v17, Lt0/d;->a:Lt0/c;

    const/16 v20, 0x0

    move-object/from16 v18, v17

    move-object/from16 v19, v17

    move-object/from16 v16, v1

    invoke-static/range {v16 .. v22}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object v14

    sget-object v1, Lu0/r0;->e:Lu0/r0;

    if-eqz v3, :cond_b

    const/16 v16, 0x6

    :goto_a
    move/from16 v17, v0

    move/from16 v0, v16

    goto :goto_b

    :cond_b
    const/16 v16, 0x7

    goto :goto_a

    :goto_b
    iget v2, v1, Lu0/r0;->a:I

    iget-object v1, v1, Lu0/r0;->b:Ljava/lang/Boolean;

    new-instance v3, Lu0/r0;

    move-object/from16 v16, v4

    const/16 v4, 0x8

    invoke-direct {v3, v2, v1, v4, v0}, Lu0/r0;-><init>(ILjava/lang/Boolean;II)V

    move-object v0, v9

    move v9, v15

    move-object v15, v11

    new-instance v11, Lg40/d1;

    const-string v1, "\u2022\u2022 / \u2022\u2022"

    const/4 v2, 0x0

    invoke-direct {v11, v1, v2}, Lg40/d1;-><init>(Ljava/lang/Object;I)V

    const v1, -0x24dfa6c0

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v10, :cond_d

    :cond_c
    new-instance v2, La1/b;

    const/16 v1, 0x11

    invoke-direct {v2, v13, v1}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v19, v2

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const v2, -0x24dfaf6f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_e

    if-ne v4, v10, :cond_f

    :cond_e
    new-instance v4, Lb30/l1;

    invoke-direct {v4, v12, v1}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v20, v4

    check-cast v20, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    new-instance v13, Lu0/q0;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x3a

    move-object/from16 v18, v13

    invoke-direct/range {v18 .. v23}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    and-int/lit16 v1, v8, 0x1c00

    const/16 v18, 0x10

    const/4 v8, 0x0

    move-object v12, v3

    move-object/from16 v4, v16

    move/from16 v10, v17

    move/from16 v17, v1

    move-object/from16 v16, v7

    move-object/from16 v7, p3

    invoke-static/range {v4 .. v18}, Luf/c0;->h(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/m;ZZLq3/g0;Lu0/r0;Lu0/q0;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v0

    :goto_c
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lb30/m1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/m1;-><init>(Landroidx/compose/ui/Modifier;Lb30/k1;ZLkotlin/jvm/functions/Function1;Lj0/i;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;
    .locals 5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget p1, v0, Landroid/util/TypedValue;->type:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_6

    iget-object p1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "cubic-bezier"

    invoke-static {p1, v1}, Lvp/c;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const-string v4, "path"

    if-nez v3, :cond_2

    invoke-static {p1, v4}, Lvp/c;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    invoke-static {p1, v1}, Lvp/c;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p0, v2

    const/16 v0, 0xd

    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, ","

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lvp/c;->L(I[Ljava/lang/String;)F

    move-result p1

    invoke-static {v2, p0}, Lvp/c;->L(I[Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lvp/c;->L(I[Ljava/lang/String;)F

    move-result v1

    invoke-static {p2, p0}, Lvp/c;->L(I[Ljava/lang/String;)F

    move-result p0

    new-instance p2, Landroid/view/animation/PathInterpolator;

    invoke-direct {p2, p1, v0, v1, p0}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1, v4}, Lvp/c;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p0, v2

    const/4 p2, 0x5

    invoke-virtual {p1, p2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    invoke-static {p0}, Lrj/o;->p(Ljava/lang/String;)[Lv4/d;

    move-result-object p2

    :try_start_0
    invoke-static {p2, p1}, Lrj/o;->y([Lv4/d;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p0, Landroid/view/animation/PathInterpolator;

    invoke-direct {p0, p1}, Landroid/view/animation/PathInterpolator;-><init>(Landroid/graphics/Path;)V

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Error in parsing "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid motion easing type: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;
    .locals 2

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    invoke-static {v1, p0}, Landroidx/health/platform/client/proto/g0;->p(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    return-object p0
.end method

.method public static final n(Ljava/lang/String;Lc93/m;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v0, p13

    move/from16 v1, p15

    move-object/from16 v3, p14

    check-cast v3, Lp1/q;

    const v4, 0x556fe5ed

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v9, v1

    :goto_1
    and-int/lit8 v10, v1, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_3
    and-int/lit16 v10, v1, 0x180

    const/16 v13, 0x80

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v3, v10}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x100

    goto :goto_3

    :cond_4
    move v15, v13

    :goto_3
    or-int/2addr v9, v15

    goto :goto_4

    :cond_5
    move/from16 v10, p2

    :goto_4
    and-int/lit16 v15, v1, 0xc00

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-nez v15, :cond_7

    move-object/from16 v15, p3

    invoke-virtual {v3, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_6

    move/from16 v18, v17

    goto :goto_5

    :cond_6
    move/from16 v18, v16

    :goto_5
    or-int v9, v9, v18

    goto :goto_6

    :cond_7
    move-object/from16 v15, p3

    :goto_6
    and-int/lit16 v5, v1, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    const/16 v18, 0x4000

    goto :goto_7

    :cond_8
    const/16 v18, 0x2000

    :goto_7
    or-int v9, v9, v18

    goto :goto_8

    :cond_9
    move-object/from16 v5, p4

    :goto_8
    const/high16 v18, 0x30000

    and-int v18, v1, v18

    if-nez v18, :cond_b

    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_a

    const/high16 v18, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v18, 0x10000

    :goto_9
    or-int v9, v9, v18

    :cond_b
    const/high16 v18, 0x180000

    and-int v18, v1, v18

    if-nez v18, :cond_d

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_c

    const/high16 v18, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v18, 0x80000

    :goto_a
    or-int v9, v9, v18

    :cond_d
    const/high16 v18, 0xc00000

    and-int v18, v1, v18

    move/from16 v8, p7

    if-nez v18, :cond_f

    invoke-virtual {v3, v8}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_e

    const/high16 v19, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v19, 0x400000

    :goto_b
    or-int v9, v9, v19

    :cond_f
    const/high16 v19, 0x6000000

    and-int v19, v1, v19

    move-object/from16 v11, p8

    if-nez v19, :cond_11

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v20, 0x2000000

    :goto_c
    or-int v9, v9, v20

    :cond_11
    const/high16 v20, 0x30000000

    and-int v20, v1, v20

    move/from16 v12, p9

    if-nez v20, :cond_13

    invoke-virtual {v3, v12}, Lp1/q;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_12

    const/high16 v21, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v21, 0x10000000

    :goto_d
    or-int v9, v9, v21

    :cond_13
    move/from16 v21, v13

    move-object/from16 v13, p10

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_14

    const/16 v18, 0x4

    :goto_e
    move-object/from16 v15, p11

    goto :goto_f

    :cond_14
    const/16 v18, 0x2

    goto :goto_e

    :goto_f
    invoke-virtual {v3, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_15

    const/16 v19, 0x20

    goto :goto_10

    :cond_15
    const/16 v19, 0x10

    :goto_10
    or-int v18, v18, v19

    move-object/from16 v14, p12

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/16 v21, 0x100

    :cond_16
    or-int v18, v18, v21

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    move/from16 v16, v17

    :cond_17
    or-int v1, v18, v16

    const v16, 0x12492493

    and-int v4, v9, v16

    const v5, 0x12492492

    if-ne v4, v5, :cond_19

    and-int/lit16 v4, v1, 0x493

    const/16 v5, 0x492

    if-ne v4, v5, :cond_19

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_11

    :cond_18
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v0, v3

    goto/16 :goto_19

    :cond_19
    :goto_11
    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v4, p15, 0x1

    if-eqz v4, :cond_1b

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_1b
    :goto_12
    invoke-virtual {v3}, Lp1/q;->r()V

    sget-object v4, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/m;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v5

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v4

    const/4 v0, 0x0

    if-eqz v6, :cond_1d

    sget v16, Li40/a;->c:F

    sub-float v16, v5, v16

    move/from16 p14, v1

    int-to-float v1, v0

    cmpg-float v17, v16, v1

    if-gez v17, :cond_1c

    move/from16 v16, v1

    :cond_1c
    move/from16 v17, v16

    goto :goto_13

    :cond_1d
    move/from16 p14, v1

    int-to-float v1, v0

    move/from16 v17, v1

    :goto_13
    if-eqz v7, :cond_1f

    sget v1, Li40/a;->c:F

    sub-float v1, v4, v1

    move/from16 v16, v1

    int-to-float v1, v0

    cmpg-float v18, v16, v1

    if-gez v18, :cond_1e

    goto :goto_14

    :cond_1e
    move/from16 v1, v16

    :goto_14
    move/from16 v19, v1

    goto :goto_15

    :cond_1f
    int-to-float v1, v0

    goto :goto_14

    :goto_15
    const/16 v20, 0x0

    const/16 v21, 0xa

    sget-object v16, Lb2/t;->w:Lb2/t;

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v16, v4

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move/from16 v17, v5

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_20

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_20
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_16
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_21

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    :cond_21
    invoke-static {v4, v3, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {p13 .. p13}, Ll0/k1;->d()F

    move-result v0

    invoke-interface/range {p13 .. p13}, Ll0/k1;->a()F

    move-result v1

    if-eqz p5, :cond_23

    sget v5, Li40/a;->b:F

    goto :goto_17

    :cond_23
    move/from16 v5, v17

    :goto_17
    if-eqz p6, :cond_24

    sget v4, Li40/a;->b:F

    goto :goto_18

    :cond_24
    move/from16 v4, v16

    :goto_18
    new-instance v14, Ll0/l1;

    invoke-direct {v14, v5, v0, v4, v1}, Ll0/l1;-><init>(FFFF)V

    new-instance v0, Lg1/e;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v2}, Lg1/e;-><init>(ILc93/m;)V

    const v1, -0x43f15b9d

    invoke-static {v1, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    and-int/lit8 v0, v9, 0xe

    or-int/lit8 v0, v0, 0x30

    shr-int/lit8 v1, v9, 0x12

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v9, 0x1c00

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr v1, v9

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v9

    or-int/2addr v0, v1

    const/high16 v1, 0x380000

    and-int/2addr v1, v9

    or-int/2addr v0, v1

    shr-int/lit8 v1, v9, 0x6

    const/high16 v5, 0x1c00000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0xe000000

    shl-int/lit8 v5, v9, 0x12

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000000

    shl-int/lit8 v5, v9, 0x6

    and-int/2addr v1, v5

    or-int v18, v0, v1

    and-int/lit8 v0, p14, 0xe

    shl-int/lit8 v1, p14, 0x3

    and-int/lit16 v5, v1, 0x380

    or-int/2addr v0, v5

    and-int/lit16 v1, v1, 0x1c00

    or-int v19, v0, v1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v16, p12

    move-object/from16 v17, v3

    move-object v5, v11

    move-object/from16 v3, p0

    move v11, v10

    move v10, v12

    move v12, v8

    move-object/from16 v8, p5

    invoke-static/range {v3 .. v19}, Lvp/c;->f(Ljava/lang/String;Lx1/b;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/l1;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_25

    move-object v1, v0

    new-instance v0, Li40/e;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Li40/e;-><init>(Ljava/lang/String;Lc93/m;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;I)V

    move-object/from16 v1, v23

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method public static final n0(Lio/sentry/h1;Lio/sentry/q6;Lio/sentry/c7;)V
    .locals 2

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lio/sentry/android/core/r0;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p2, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor"

    invoke-interface {p1, p2, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final o(Landroid/graphics/Rect;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x1bc33b3b

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    sget-wide v1, Li2/x;->b:J

    const v3, 0x3ecccccd    # 0.4f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v6

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ly3/c;

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v2, p1

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v14, 0x0

    const v15, 0xffff

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/graphics/a;->b(Landroidx/compose/ui/Modifier;FFFFLi2/a1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Lio/sentry/android/replay/j;

    const/4 v9, 0x2

    move-object/from16 v5, p0

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/replay/j;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {v1, v4, v0, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v4, Lc4/q;

    move-object/from16 v5, p0

    move/from16 v9, p3

    move-wide v7, v6

    move-object v6, v2

    invoke-direct/range {v4 .. v9}, Lc4/q;-><init>(Landroid/graphics/Rect;Landroidx/compose/ui/Modifier;JI)V

    iput-object v4, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final o0(Lmf/d;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    instance-of v1, v0, Lmf/e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lmf/e;

    iget v2, v1, Lmf/e;->M:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lmf/e;->M:I

    goto :goto_0

    :cond_0
    new-instance v1, Lmf/e;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lmf/e;->L:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lmf/e;->M:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v3, v1, Lmf/e;->K:I

    iget v6, v1, Lmf/e;->J:I

    iget v7, v1, Lmf/e;->I:I

    iget v8, v1, Lmf/e;->H:I

    iget-object v9, v1, Lmf/e;->G:Lmf/c;

    iget-object v10, v1, Lmf/e;->F:Ljava/lang/String;

    iget-object v11, v1, Lmf/e;->E:Ljava/util/Iterator;

    iget-object v12, v1, Lmf/e;->z:Ljava/lang/String;

    iget-object v13, v1, Lmf/e;->y:Ljava/util/Iterator;

    iget-object v14, v1, Lmf/e;->x:Lmf/c;

    iget-object v15, v1, Lmf/e;->w:Lmf/c;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v3

    move-object v3, v1

    move-object v1, v14

    move-object v14, v11

    move-object v11, v10

    move v10, v8

    move v8, v6

    move/from16 v6, v16

    move-object/from16 v16, v12

    move v12, v7

    move-object v7, v13

    move-object/from16 v13, v16

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lmf/c;

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Lmf/c;-><init>(I)V

    move-object/from16 v3, p0

    iget-object v3, v3, Lgf/u;->c:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v6, v3

    move v7, v5

    move v8, v7

    move-object v3, v1

    move-object v1, v0

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v12, v9

    move-object v11, v10

    move v9, v7

    move v10, v8

    move v8, v5

    move-object v7, v6

    move v6, v8

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lbc3/i0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, v3, Lmf/e;->w:Lmf/c;

    iput-object v1, v3, Lmf/e;->x:Lmf/c;

    iput-object v7, v3, Lmf/e;->y:Ljava/util/Iterator;

    iput-object v11, v3, Lmf/e;->z:Ljava/lang/String;

    iput-object v12, v3, Lmf/e;->E:Ljava/util/Iterator;

    iput-object v11, v3, Lmf/e;->F:Ljava/lang/String;

    iput-object v1, v3, Lmf/e;->G:Lmf/c;

    iput v9, v3, Lmf/e;->H:I

    iput v10, v3, Lmf/e;->I:I

    iput v8, v3, Lmf/e;->J:I

    iput v6, v3, Lmf/e;->K:I

    iput v4, v3, Lmf/e;->M:I

    invoke-interface {v13, v3}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v2, :cond_3

    return-object v2

    :cond_3
    move-object v15, v0

    move-object v14, v12

    move-object v0, v13

    move v12, v10

    move-object v13, v11

    move v10, v9

    move-object v9, v1

    :goto_3
    invoke-virtual {v9, v0, v11}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move v9, v10

    move v10, v12

    move-object v11, v13

    move-object v12, v14

    move-object v0, v15

    goto :goto_2

    :cond_4
    move-object v6, v7

    move v7, v9

    move v8, v10

    goto :goto_1

    :cond_5
    new-instance v1, Lmf/i;

    iget-object v0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-string v2, "values"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lgf/u;-><init>(Ljava/util/Map;)V

    return-object v1
.end method

.method public static final p0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    const-string v0, "str"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "str"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final s(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "step"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p3

    check-cast v7, Lp1/q;

    const p3, 0x36a68d05

    invoke-virtual {v7, p3}, Lp1/q;->g0(I)Lp1/q;

    sget-object p3, Lmj/r;->b:Lp1/u2;

    invoke-virtual {v7, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Lmj/p;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object p3

    instance-of v0, p3, Lcom/amplitude/android/engagement/types/PinFormFactor;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p3, Lcom/amplitude/android/engagement/types/PinFormFactor;

    goto :goto_0

    :cond_0
    move-object p3, v1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/amplitude/android/engagement/types/PinFormFactor;->getSelector()Ljava/lang/String;

    move-result-object p3

    move-object v2, p3

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object p3

    instance-of v0, p3, Lcom/amplitude/android/engagement/types/PinFormFactor;

    if-eqz v0, :cond_2

    check-cast p3, Lcom/amplitude/android/engagement/types/PinFormFactor;

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-nez p3, :cond_4

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-nez p3, :cond_3

    goto/16 :goto_3

    :cond_3
    new-instance v0, Lmj/k;

    const/4 v5, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lmj/k;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_5

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_6

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    new-instance v1, Lp1/a0;

    invoke-direct {v1, v0}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_6
    check-cast v0, Lp1/a0;

    iget-object v1, v0, Lp1/a0;->w:Lbc3/c0;

    new-instance v0, Ld0;

    const/4 v5, 0x0

    move-object v4, v6

    const/4 v6, 0x5

    invoke-direct/range {v0 .. v6}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v7, v0, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lpj/y;

    move-object v5, v3

    move-object v6, v4

    move-object v3, p1

    move-object v4, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lpj/y;-><init>(Lbc3/c0;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Ljava/lang/String;Lmj/p;Lp1/c1;)V

    move-object v1, v2

    move-object v2, v3

    move-object v4, v6

    invoke-static {v8, v0, v7}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p3}, Lcom/amplitude/android/engagement/types/PinFormFactor;->getPointer()Lcom/amplitude/android/engagement/types/PinPointer;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/PinPointer;->getType()Lcom/amplitude/android/engagement/types/PinPointerType;

    move-result-object v3

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Landroid/graphics/Rect;

    shl-int/lit8 p0, p4, 0x3

    and-int/lit16 p0, p0, 0x1c00

    const p1, 0x8048

    or-int/2addr p0, p1

    const/high16 p1, 0x70000

    shl-int/lit8 p3, p4, 0x6

    and-int/2addr p1, p3

    or-int v8, p0, p1

    const/4 v9, 0x0

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object v6, p2

    invoke-static/range {v1 .. v9}, Lvp/c;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-nez p0, :cond_7

    :goto_3
    return-void

    :cond_7
    move-object v3, v2

    move-object v2, v1

    new-instance v1, Lmj/k;

    const/4 v6, 0x1

    move-object v4, p2

    move v5, p4

    invoke-direct/range {v1 .. v6}, Lmj/k;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;II)V

    iput-object v1, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static s0(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 2

    const-class v0, Lvp/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "map_state"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v2, p1

    move-object/from16 v11, p2

    move-object/from16 v0, p3

    const-string v1, "label"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v1, 0x56882c11

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v1, p5, v1

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x100

    goto :goto_1

    :cond_1
    const/16 v3, 0x80

    :goto_1
    or-int/2addr v1, v3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x800

    goto :goto_2

    :cond_2
    const/16 v3, 0x400

    :goto_2
    or-int/2addr v1, v3

    and-int/lit16 v3, v1, 0x493

    const/16 v4, 0x492

    if-ne v3, v4, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_4

    :cond_4
    :goto_3
    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 v4, p0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v5, 0x38

    int-to-float v5, v5

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v5, -0x45773cff

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->d:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/c;

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    iget-object v5, v5, Lg00/c;->b:Lt0/i;

    sget-object v7, Lg1/v0;->a:Ll0/l1;

    sget-wide v12, Li2/x;->m:J

    const/16 v21, 0x186

    const/16 v22, 0xa

    const-wide/16 v14, 0x0

    const-wide/16 v18, 0x0

    move-wide/from16 v16, v12

    move-object/from16 v20, v8

    invoke-static/range {v12 .. v22}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    new-instance v9, Lh00/q0;

    invoke-direct {v9, v11, v2, v6}, Lh00/q0;-><init>(Ljava/lang/String;ZI)V

    const v6, 0x20bebce

    invoke-static {v6, v8, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    shr-int/lit8 v9, v1, 0x9

    and-int/lit8 v9, v9, 0xe

    const/high16 v10, 0x30000000

    or-int/2addr v9, v10

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v9, v1

    const/16 v10, 0x158

    const/4 v4, 0x0

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v0, Lay/a0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object v3, v11

    invoke-direct/range {v0 .. v5}, Lay/a0;-><init>(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static t0(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "MapOptions"

    invoke-static {p0, v0}, Lvp/c;->s0(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1, v0, v1}, Lvp/c;->u0(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    const-string v0, "StreetViewPanoramaOptions"

    invoke-static {p0, v0}, Lvp/c;->s0(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p1, v0, v1}, Lvp/c;->u0(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    const-string v0, "camera"

    invoke-static {p0, v0}, Lvp/c;->s0(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {p1, v0, v1}, Lvp/c;->u0(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_2
    const-string v0, "position"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v0, "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    return-void
.end method

.method public static u0(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V
    .locals 3

    const-class v0, Lvp/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "map_state"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic w(Ldc3/w;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final x(Lec3/l;Ljava/lang/Object;Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lq83/j;Lp1/q;I)Lp1/c1;
    .locals 9

    filled-new-array {p0, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v2, p6, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    const/16 v3, 0x800

    if-le v2, v3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {p5, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    and-int/lit16 p6, p6, 0xc00

    if-ne p6, v3, :cond_2

    :cond_1
    const/4 p6, 0x1

    goto :goto_0

    :cond_2
    const/4 p6, 0x0

    :goto_0
    or-int/2addr p6, v1

    invoke-virtual {p5, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p6, v1

    invoke-virtual {p5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p6, v1

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p6, :cond_3

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-ne v1, p6, :cond_4

    :cond_3
    new-instance v2, Lcz/d;

    const/4 v7, 0x0

    const/16 v8, 0xa

    move-object v6, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_4
    check-cast v1, Lc93/m;

    invoke-static {p1, v0, v1, p5}, Lp1/x;->C(Ljava/lang/Object;[Ljava/lang/Object;Lc93/m;Lp1/q;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Lec3/l;Ljava/lang/Object;Lp1/q;I)Lp1/c1;
    .locals 8

    sget-object v0, Lj8/c;->a:Lp1/t1;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    sget-object v4, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v3

    and-int/lit8 v0, p3, 0xe

    shr-int/lit8 v1, p3, 0x3

    and-int/lit8 v1, v1, 0x8

    shl-int/lit8 v1, v1, 0x3

    or-int/2addr v0, v1

    and-int/lit8 v1, p3, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, p3, 0x1c00

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr p3, v1

    or-int v7, v0, p3

    sget-object v5, Lq83/k;->w:Lq83/k;

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v1 .. v7}, Lvp/c;->x(Lec3/l;Ljava/lang/Object;Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lq83/j;Lp1/q;I)Lp1/c1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Laf3/s;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public F(Laf3/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public I(Laf3/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public J(Laf3/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public N(Laf3/w;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public O(Laf3/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public P(Laf3/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public Q(Laf3/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public R(Laf3/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public S(Laf3/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public U(Laf3/e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public W(Laf3/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public a(Laf3/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public e0(Laf3/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public i(Laf3/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public j(Laf3/a0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public m(Laf3/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public p(Laf3/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public q(Laf3/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public r(Laf3/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public r0(Laf3/t;)V
    .locals 1

    iget-object p1, p1, Laf3/t;->b:Laf3/t;

    :goto_0
    if-eqz p1, :cond_0

    iget-object v0, p1, Laf3/t;->e:Laf3/t;

    invoke-virtual {p1, p0}, Laf3/t;->a(Laf3/c0;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Laf3/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public v(Laf3/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method

.method public y(Laf3/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method
