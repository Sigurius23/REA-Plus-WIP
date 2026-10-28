.class public final Lv72/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lv72/e;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "<init>",
        "(Lj02/o0;Leb/a0;)V",
        "Lv72/d;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lv72/d;)V",
        "Lj02/o0;",
        "b",
        "Leb/a0;",
        "sanguine_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv72/e;->a:Lj02/o0;

    iput-object p2, p0, Lv72/e;->b:Leb/a0;

    return-void
.end method


# virtual methods
.method public final a(Lv72/d;)V
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lv72/d$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv72/e;->a:Lj02/o0;

    check-cast p1, Lv72/d$c;

    invoke-virtual {p1}, Lv72/d$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lv72/d$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lv72/e;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lv72/d$a;

    if-eqz v0, :cond_3

    check-cast p1, Lv72/d$a;

    invoke-virtual {p1}, Lv72/d$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%26"

    const/4 v2, 0x0

    const-string v3, "&"

    invoke-static {v0, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lv72/e;->a:Lj02/o0;

    new-instance v4, Lj02/m0$f3;

    invoke-virtual {p1}, Lv72/d$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    move-object v6, p1

    const/16 v10, 0x18

    const/4 v11, 0x0

    const-string v7, "SANGUINE_TILE"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
