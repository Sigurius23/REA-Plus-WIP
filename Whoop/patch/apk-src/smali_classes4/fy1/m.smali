.class public abstract Lfy1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lp1/t1;",
        "Lfy1/l;",
        "a",
        "Lp1/t1;",
        "c",
        "()Lp1/t1;",
        "LocalScreenStateTracker",
        "metrics-common_release"
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

    new-instance v0, Lep0/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lfy1/m;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Lfy1/l;
    .locals 1

    invoke-static {}, Lfy1/m;->b()Lfy1/l;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lfy1/l;
    .locals 1

    sget-object v0, Lfy1/i;->a:Lfy1/i;

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

    sget-object v0, Lfy1/m;->a:Lp1/t1;

    return-object v0
.end method
