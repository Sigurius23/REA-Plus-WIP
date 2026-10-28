.class public final Lef0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lef0/c;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/a0;Lj02/o0;)V",
        "Lef0/a;",
        "navigationEvent",
        "Ll83/a0;",
        "a",
        "(Lef0/a;)V",
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

    iput-object p1, p0, Lef0/c;->a:Leb/a0;

    iput-object p2, p0, Lef0/c;->b:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lef0/a;)V
    .locals 4

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lef0/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lef0/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lef0/a$d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lef0/c;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lef0/c;->b:Lj02/o0;

    new-instance v1, Lj02/m0$t;

    check-cast p1, Lef0/a$d;

    invoke-virtual {p1}, Lef0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "OVERVIEW"

    invoke-direct {v1, v2, p1}, Lj02/m0$t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Lef0/a$b;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lef0/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Lef0/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Lef0/c;->b:Lj02/o0;

    new-instance v0, Lj02/m0$p;

    const-string v1, "typeform_do_this_later_btn"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lj02/m0$p;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lef0/a$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lef0/c;->b:Lj02/o0;

    new-instance v1, Lj02/m0$d3;

    check-cast p1, Lef0/a$c;

    invoke-virtual {p1}, Lef0/a$c;->a()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lef0/a$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lj02/m0$d3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
