.class public abstract Lep/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/c;

.field public static final b:Lcom/google/android/gms/common/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/c;

    const-string v1, "is_user_verifying_platform_authenticator_available_for_credential"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lep/a;->a:Lcom/google/android/gms/common/c;

    new-instance v0, Lcom/google/android/gms/common/c;

    const-string v1, "is_user_verifying_platform_authenticator_available"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lep/a;->b:Lcom/google/android/gms/common/c;

    return-void
.end method
