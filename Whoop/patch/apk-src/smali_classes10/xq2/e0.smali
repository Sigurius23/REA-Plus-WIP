.class public abstract Lxq2/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\u0005\u00a8\u0006\u000b"
    }
    d2 = {
        "Lp1/t1;",
        "Lxq2/d0;",
        "a",
        "Lp1/t1;",
        "e",
        "()Lp1/t1;",
        "LocalTimeCapsuleState",
        "",
        "b",
        "f",
        "LocalUserJourneyYear",
        "user-journey_release"
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxo1/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lxo1/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lxq2/e0;->a:Lp1/t1;

    new-instance v0, Lxo1/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lxo1/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lxq2/e0;->b:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Lxq2/d0;
    .locals 1

    invoke-static {}, Lxq2/e0;->c()Lxq2/d0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/lang/Integer;
    .locals 1

    invoke-static {}, Lxq2/e0;->d()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Lxq2/d0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static final d()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final e()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lxq2/e0;->a:Lp1/t1;

    return-object v0
.end method

.method public static final f()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lxq2/e0;->b:Lp1/t1;

    return-object v0
.end method
