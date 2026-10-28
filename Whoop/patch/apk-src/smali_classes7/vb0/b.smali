.class public final Lvb0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvb0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/a0;Lj02/o0;)V",
        "Lvb0/a;",
        "navigationEvent",
        "Ll83/a0;",
        "a",
        "(Lvb0/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "advanced-labs_release"
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb0/b;->a:Leb/a0;

    iput-object p2, p0, Lvb0/b;->b:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lvb0/a;)V
    .locals 10

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvb0/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvb0/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lvb0/a$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lvb0/b;->a:Leb/a0;

    sget v3, Lma0/b;->a:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    move v7, v6

    move v8, v6

    move v9, v6

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    const/4 v1, 0x0

    invoke-virtual {p1, v3, v1, v0}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_1
    instance-of v0, p1, Lvb0/a$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lvb0/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lvb0/b;->b:Lj02/o0;

    check-cast p1, Lvb0/a$c;

    invoke-virtual {p1}, Lvb0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
