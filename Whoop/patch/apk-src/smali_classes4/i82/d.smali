.class public final Li82/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li82/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0008R\u001c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001bR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Li82/d;",
        "",
        "<init>",
        "()V",
        "Li82/a;",
        "resolution",
        "Li82/d$a;",
        "a",
        "(Li82/a;)Li82/d$a;",
        "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;",
        "data",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V",
        "",
        "id",
        "Li82/b;",
        "stages",
        "c",
        "(Ljava/lang/String;Li82/b;)V",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "d",
        "(Lcom/whoop/whoopaction/domain/models/Action;)Li82/a;",
        "e",
        "",
        "Lcom/whoop/design/models/items/FollowerRequestModel;",
        "Ljava/util/List;",
        "followerItems",
        "",
        "Ljava/util/Map;",
        "followerRequestItemUiStages",
        "search-arch-mini_release"
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
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/FollowerRequestModel;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Li82/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Li82/d;->a:Ljava/util/List;

    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Li82/d;->b:Ljava/util/Map;

    return-void
.end method

.method private final a(Li82/a;)Li82/d$a;
    .locals 9

    instance-of v0, p1, Li82/a$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Li82/a$c;

    invoke-virtual {p1}, Li82/a$c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li82/d;->b:Ljava/util/Map;

    invoke-virtual {p1}, Li82/a$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li82/b;

    if-nez v0, :cond_0

    new-instance v3, Li82/b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    :cond_0
    new-instance v3, Li82/d$a;

    invoke-virtual {p1}, Li82/a$c;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v4, Li82/e;->AFTER_PRIMARY_ACTION:Li82/e;

    invoke-virtual {v0, v4, v2, v1}, Li82/b;->a(Li82/e;Li82/e;Z)Li82/b;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v3

    :cond_1
    new-instance v0, Li82/d$a;

    invoke-virtual {p1}, Li82/a$c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Li82/b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Li82/a$d;

    if-eqz v0, :cond_5

    check-cast p1, Li82/a$d;

    invoke-virtual {p1}, Li82/a$d;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Li82/d;->b:Ljava/util/Map;

    invoke-virtual {p1}, Li82/a$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li82/b;

    if-nez v0, :cond_3

    new-instance v3, Li82/b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    :cond_3
    new-instance v3, Li82/d$a;

    invoke-virtual {p1}, Li82/a$d;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v4, Li82/e;->AFTER_SECONDARY_ACTION:Li82/e;

    invoke-virtual {v0, v4, v2, v1}, Li82/b;->a(Li82/e;Li82/e;Z)Li82/b;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v3

    :cond_4
    new-instance v0, Li82/d$a;

    invoke-virtual {p1}, Li82/a$d;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Li82/b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Li82/a$a;

    if-eqz v0, :cond_8

    check-cast p1, Li82/a$a;

    invoke-virtual {p1}, Li82/a$a;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Li82/d;->b:Ljava/util/Map;

    invoke-virtual {p1}, Li82/a$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li82/b;

    if-nez v0, :cond_6

    new-instance v3, Li82/b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    :cond_6
    new-instance v3, Li82/d$a;

    invoke-virtual {p1}, Li82/a$a;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v4, Li82/e;->AFTER_PRIMARY_ACTION:Li82/e;

    invoke-virtual {v0, v2, v4, v1}, Li82/b;->a(Li82/e;Li82/e;Z)Li82/b;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v3

    :cond_7
    new-instance v0, Li82/d$a;

    invoke-virtual {p1}, Li82/a$a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Li82/b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v0

    :cond_8
    instance-of v0, p1, Li82/a$b;

    if-eqz v0, :cond_b

    check-cast p1, Li82/a$b;

    invoke-virtual {p1}, Li82/a$b;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Li82/d;->b:Ljava/util/Map;

    invoke-virtual {p1}, Li82/a$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li82/b;

    if-nez v0, :cond_9

    new-instance v3, Li82/b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    :cond_9
    new-instance v3, Li82/d$a;

    invoke-virtual {p1}, Li82/a$b;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v4, Li82/e;->AFTER_SECONDARY_ACTION:Li82/e;

    invoke-virtual {v0, v2, v4, v1}, Li82/b;->a(Li82/e;Li82/e;Z)Li82/b;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v3

    :cond_a
    new-instance v0, Li82/d$a;

    invoke-virtual {p1}, Li82/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Li82/b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Li82/b;-><init>(Li82/e;Li82/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Li82/d$a;-><init>(Ljava/lang/String;Li82/b;)V

    return-object v0

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final b(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/items/FollowerRequestModel;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/whoop/design/models/items/FollowerRequestModel;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Li82/d;->a:Ljava/util/List;

    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Li82/d;->b:Ljava/util/Map;

    return-void
.end method

.method public final c(Ljava/lang/String;Li82/b;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li82/d;->b:Ljava/util/Map;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Li82/d;->b:Ljava/util/Map;

    return-void
.end method

.method public final d(Lcom/whoop/whoopaction/domain/models/Action;)Li82/a;
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li82/d;->a:Ljava/util/List;

    iget-object v1, p0, Li82/d;->b:Ljava/util/Map;

    invoke-static {p1, v0, v1}, Li82/c;->c(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;)Li82/a;

    move-result-object p1

    return-object p1
.end method

.method public final e(Li82/a;)Li82/d$a;
    .locals 1

    const-string v0, "resolution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li82/d;->a(Li82/a;)Li82/d$a;

    move-result-object p1

    return-object p1
.end method
