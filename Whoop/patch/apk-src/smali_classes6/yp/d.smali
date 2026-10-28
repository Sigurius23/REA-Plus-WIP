.class public final Lyp/d;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "OssLicensesService.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lyp/d;->a:Lcom/google/android/gms/common/api/f;

    return-void
.end method
