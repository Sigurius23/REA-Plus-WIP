.class public final Lkq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkq1/b;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lgq1/a;",
        "analytics",
        "<init>",
        "(Landroidx/fragment/app/m0;Lgq1/a;)V",
        "Lkq1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lkq1/a;)V",
        "Landroidx/fragment/app/m0;",
        "b",
        "Lgq1/a;",
        "behavior-impact_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/m0;

.field private final b:Lgq1/a;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lgq1/a;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq1/b;->a:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lkq1/b;->b:Lgq1/a;

    return-void
.end method


# virtual methods
.method public final a(Lkq1/a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkq1/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkq1/b;->b:Lgq1/a;

    check-cast p1, Lkq1/a$a;

    invoke-virtual {p1}, Lkq1/a$a;->a()Lhq1/f;

    move-result-object p1

    invoke-virtual {p1}, Lhq1/f;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lgq1/a$c;->RECOVERY:Lgq1/a$c;

    invoke-virtual {v0, p1, v1}, Lgq1/a;->a(Ljava/lang/String;Lgq1/a$c;)V

    iget-object p1, p0, Lkq1/b;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
