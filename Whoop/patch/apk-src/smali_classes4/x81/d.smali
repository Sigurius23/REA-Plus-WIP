.class public final Lx81/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00088G\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\u000c8G\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lx81/d;",
        "",
        "<init>",
        "()V",
        "Ly81/i;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Ly81/i;",
        "colors",
        "Lb91/d;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)Lb91/d;",
        "typography",
        "Lz81/b;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Lz81/b;",
        "borders",
        "Lgz0/o0;",
        "d",
        "()Lgz0/o0;",
        "icons",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlag",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lx81/d;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx81/d;

    invoke-direct {v0}, Lx81/d;-><init>()V

    sput-object v0, Lx81/d;->a:Lx81/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)Lz81/b;
    .locals 0

    invoke-static {}, Lx81/e;->r()Lp1/t1;

    move-result-object p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz81/b;

    return-object p1
.end method

.method public final b(Landroidx/compose/runtime/Composer;I)Ly81/i;
    .locals 0

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly81/i;

    return-object p1
.end method

.method public final c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p1
.end method

.method public final d()Lgz0/o0;
    .locals 1

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroidx/compose/runtime/Composer;I)Lb91/d;
    .locals 0

    invoke-static {}, Lx81/e;->t()Lp1/t1;

    move-result-object p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb91/d;

    return-object p1
.end method
