.class public abstract Lkd1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lp1/t1;",
        "Lkd1/m;",
        "a",
        "Lp1/t1;",
        "c",
        "()Lp1/t1;",
        "LocalImageLoadTracker",
        "design_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lkd1/n;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Lkd1/m;
    .locals 1

    invoke-static {}, Lkd1/n;->b()Lkd1/m;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lkd1/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final c()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lkd1/n;->a:Lp1/t1;

    return-object v0
.end method
