.class public abstract Lzp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldq/y;

.field public static final b:Lcom/google/android/gms/common/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    sput-object v1, Lzp/b;->a:Ldq/y;

    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    const/4 v3, 0x1

    const-string v4, "profile"

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    const-string v4, "email"

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "SignIn.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lzp/b;->b:Lcom/google/android/gms/common/api/f;

    return-void
.end method
