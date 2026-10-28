.class public abstract Lip/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/c;

.field public static final b:Lcom/google/android/gms/common/c;

.field public static final c:Lcom/google/android/gms/common/c;

.field public static final d:[Lcom/google/android/gms/common/c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/android/gms/common/c;

    const-string v1, "auth_api_credentials_begin_sign_in"

    const-wide/16 v2, 0x9

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v1, Lcom/google/android/gms/common/c;

    const-string v2, "auth_api_credentials_sign_out"

    const-wide/16 v3, 0x2

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lip/f;->a:Lcom/google/android/gms/common/c;

    new-instance v2, Lcom/google/android/gms/common/c;

    const-string v3, "auth_api_credentials_authorize"

    const-wide/16 v4, 0x1

    invoke-direct {v2, v3, v4, v5}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v3, Lcom/google/android/gms/common/c;

    const-string v6, "auth_api_credentials_revoke_access"

    invoke-direct {v3, v6, v4, v5}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v4, Lcom/google/android/gms/common/c;

    const-string v5, "auth_api_credentials_save_password"

    const-wide/16 v6, 0x4

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lip/f;->b:Lcom/google/android/gms/common/c;

    new-instance v5, Lcom/google/android/gms/common/c;

    const-string v6, "auth_api_credentials_get_sign_in_intent"

    const-wide/16 v7, 0x6

    invoke-direct {v5, v6, v7, v8}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lip/f;->c:Lcom/google/android/gms/common/c;

    new-instance v6, Lcom/google/android/gms/common/c;

    const-string v7, "auth_api_credentials_save_account_linking_token"

    const-wide/16 v8, 0x3

    invoke-direct {v6, v7, v8, v9}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v7, Lcom/google/android/gms/common/c;

    const-string v10, "auth_api_credentials_get_phone_number_hint_intent"

    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    filled-new-array/range {v0 .. v7}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    sput-object v0, Lip/f;->d:[Lcom/google/android/gms/common/c;

    return-void
.end method
