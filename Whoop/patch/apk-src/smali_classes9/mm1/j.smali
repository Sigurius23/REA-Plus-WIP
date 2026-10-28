.class public abstract Lmm1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lmm1/k;",
        "a",
        "Lmm1/k;",
        "()Lmm1/k;",
        "welcomeCardPreviewState",
        "home_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lmm1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    sget-object v6, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    new-instance v0, Lmm1/k;

    const-wide v4, 0x3fceb851eb851eb8L    # 0.24

    const/4 v7, 0x0

    const-string v1, "Welcome to WHOOP, Winnie"

    const-string v2, "4.8"

    const-string v3, "STRAIN"

    invoke-direct/range {v0 .. v7}, Lmm1/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLgz0/m0;Lgz0/m0;)V

    sput-object v0, Lmm1/j;->a:Lmm1/k;

    return-void
.end method

.method public static final a()Lmm1/k;
    .locals 1

    sget-object v0, Lmm1/j;->a:Lmm1/k;

    return-object v0
.end method
