.class public abstract Lh41/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lj91/b;",
        "a",
        "Lj91/b;",
        "cyberBadgesBrush",
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
.field private static final a:Lj91/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh00/l0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lh00/l0;-><init>(I)V

    invoke-static {v0}, Lj91/c;->b(Lkotlin/jvm/functions/Function1;)Lj91/b;

    move-result-object v0

    sput-object v0, Lh41/d;->a:Lj91/b;

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lh41/d;->c(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lj91/b;
    .locals 1

    sget-object v0, Lh41/d;->a:Lj91/b;

    return-object v0
.end method

.method private static final c(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$whoopBrush"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->L()Li2/t;

    move-result-object p0

    return-object p0
.end method
