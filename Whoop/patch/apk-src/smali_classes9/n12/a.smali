.class public abstract Ln12/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\'\u0018\u00002\u00020\u0001B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0011\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0007\u0010\u000bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Ln12/a;",
        "",
        "Lkotlin/Function0;",
        "Leb/a0;",
        "navControllerProvider",
        "Lor2/s;",
        "safeNavControllerProvider",
        "<init>",
        "(Lc93/a;Lc93/a;)V",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "(Landroidx/fragment/app/m0;)V",
        "a",
        "Lc93/a;",
        "b",
        "e",
        "()Leb/a0;",
        "navController",
        "f",
        "()Lor2/s;",
        "safeNavController",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final a:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final b:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Llh2/f;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Llh2/f;-><init>(Landroidx/fragment/app/m0;I)V

    new-instance v1, Llh2/f;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Llh2/f;-><init>(Landroidx/fragment/app/m0;I)V

    invoke-direct {p0, v0, v1}, Ln12/a;-><init>(Lc93/a;Lc93/a;)V

    return-void
.end method

.method public constructor <init>(Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "navControllerProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeNavControllerProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln12/a;->a:Lc93/a;

    .line 3
    iput-object p2, p0, Ln12/a;->b:Lc93/a;

    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/m0;)Leb/a0;
    .locals 0

    invoke-static {p0}, Ln12/a;->c(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/fragment/app/m0;)Lor2/s;
    .locals 0

    invoke-static {p0}, Ln12/a;->d(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/fragment/app/m0;)Leb/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/fragment/app/m0;)Lor2/s;
    .locals 0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()Leb/a0;
    .locals 1

    iget-object v0, p0, Ln12/a;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    return-object v0
.end method

.method public final f()Lor2/s;
    .locals 1

    iget-object v0, p0, Ln12/a;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/s;

    return-object v0
.end method
