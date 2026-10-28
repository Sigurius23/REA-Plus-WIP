.class public final Lip/c;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/common/api/f;

.field public static final c:Lcom/google/android/gms/common/api/f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lip/c;->b:Lcom/google/android/gms/common/api/f;

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "Auth.Api.Identity.SignIn.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lip/c;->c:Lcom/google/android/gms/common/api/f;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpo/m;)V
    .locals 6

    .line 7
    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v2, 0x0

    .line 8
    sget-object v3, Lip/c;->c:Lcom/google/android/gms/common/api/f;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    .line 9
    invoke-static {}, Lip/g;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lip/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/credentials/playservices/HiddenActivity;Lpo/l;)V
    .locals 6

    .line 1
    sget-object v3, Lip/c;->b:Lcom/google/android/gms/common/api/f;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    .line 3
    invoke-static {}, Lip/g;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lip/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/credentials/playservices/HiddenActivity;Lpo/m;)V
    .locals 6

    .line 4
    sget-object v3, Lip/c;->c:Lcom/google/android/gms/common/api/f;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 5
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    .line 6
    invoke-static {}, Lip/g;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lip/c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Intent;)Lpo/j;
    .locals 4

    sget-object v0, Lcom/google/android/gms/common/api/Status;->G:Lcom/google/android/gms/common/api/Status;

    if-eqz p1, :cond_5

    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "status"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    invoke-static {v2, v1}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Lpo/j;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "sign_in_credential"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, v1}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object v3

    :goto_1
    check-cast v3, Lpo/j;

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->I:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method
