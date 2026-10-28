.class public final Lid1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lid1/f;",
        "",
        "Lgd1/a;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "menuItemFactory",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
        "galleryItemFactory",
        "<init>",
        "(Lgd1/a;Lgd1/a;)V",
        "",
        "Led1/b;",
        "a",
        "()Ljava/util/List;",
        "Lg91/c;",
        "state",
        "Lid1/e;",
        "b",
        "(Lg91/c;)Lid1/e;",
        "Lgd1/a;",
        "design-showcase_release"
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
.field private final a:Lgd1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgd1/a<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lgd1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgd1/a<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgd1/a;Lgd1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd1/a<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
            ">;",
            "Lgd1/a<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "menuItemFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "galleryItemFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lid1/f;->a:Lgd1/a;

    iput-object p2, p0, Lid1/f;->b:Lgd1/a;

    return-void
.end method

.method private final a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Led1/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->values()[Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->COMPOSE_STRESS_TEST:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    if-eq v4, v5, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    iget-object v3, p0, Lid1/f;->a:Lgd1/a;

    invoke-interface {v3, v2}, Lgd1/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Led1/b;

    if-eqz v5, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method


# virtual methods
.method public final b(Lg91/c;)Lid1/e;
    .locals 12

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lg91/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lid1/f;->a:Lgd1/a;

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lgd1/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ROOT:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lid1/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Led1/b;

    const/16 v10, 0x2f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Led1/b;->g(Led1/b;Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Ljava/lang/String;Ljava/lang/String;ZLc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lid1/f;->a:Lgd1/a;

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lgd1/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Led1/b;

    if-eqz v3, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lg91/c;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lwr2/c;->o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_2
    new-instance v1, Lid1/e;

    invoke-virtual {p1}, Lg91/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    iget-object v3, p0, Lid1/f;->a:Lgd1/a;

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v3, p1}, Lgd1/a;->a(Ljava/lang/Object;)Lid1/a;

    move-result-object p1

    invoke-direct {v1, v2, v0, p1}, Lid1/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lid1/a;)V

    return-object v1

    :cond_4
    instance-of v0, v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    if-eqz v0, :cond_5

    new-instance v0, Lid1/e;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    iget-object v2, p0, Lid1/f;->b:Lgd1/a;

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lgd1/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lid1/f;->b:Lgd1/a;

    invoke-virtual {p1}, Lg91/c;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v3, p1}, Lgd1/a;->a(Ljava/lang/Object;)Lid1/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lid1/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lid1/a;)V

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DesignShowcaseDomainState.itemType must be one of [DesignShowcaseMenuType, DesignShowcaseGalleryType]"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
