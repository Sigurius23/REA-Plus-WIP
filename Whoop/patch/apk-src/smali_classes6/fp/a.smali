.class public final Lfp/a;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lcom/google/android/gms/common/api/f;

    new-instance v2, Ldq/y;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ldq/y;-><init>(I)V

    const-string v3, "Fido.FIDO2_API"

    invoke-direct {v1, v3, v2, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v1, Lfp/a;->a:Lcom/google/android/gms/common/api/f;

    return-void
.end method
