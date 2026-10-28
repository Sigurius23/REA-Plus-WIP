.class public final Ldd1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldd1/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgd1/a<",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ldd1/o;",
        "Lgd1/a;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "<init>",
        "()V",
        "",
        "Lm91/u;",
        "g",
        "()Ljava/util/List;",
        "c",
        "itemType",
        "e",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/util/List;",
        "menuType",
        "",
        "d",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/lang/String;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Li93/j;

    const/4 v1, 0x0

    const/16 v2, 0x64

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Li93/h;-><init>(III)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v4, v0

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    new-instance v5, Li93/j;

    const/16 v6, 0xa

    invoke-direct {v5, v3, v6, v3}, Li93/h;-><init>(III)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    move-object v8, v5

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_0

    move-object v8, v5

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    mul-int/lit8 v9, v4, 0xa

    add-int/2addr v9, v8

    const-string v8, "Item "

    invoke-static {v9, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static {v8, v10, v10, v9, v10}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-array v4, v1, [Led1/b;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Led1/b;

    array-length v5, v4

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lm91/u;

    invoke-static {v4}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v4

    invoke-interface {v4}, Ln91/a;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private final g()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->PARTICLES:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v0}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v0

    const-string v1, "Particles"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, v0, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ATOMS:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v1}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v1

    const-string v4, "Atoms"

    invoke-static {v4, v1, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->MOLECULES:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v4}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v4

    const-string v5, "Molecules"

    invoke-static {v5, v4, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ORGANISMS:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v5}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v5

    const-string v6, "Organisms"

    invoke-static {v6, v5, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->TEMPLATES:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v6}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v6

    const-string v7, "Templates"

    invoke-static {v7, v6, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v6

    const/4 v7, 0x5

    new-array v7, v7, [Lm91/u;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v1, 0x2

    aput-object v4, v7, v1

    const/4 v4, 0x3

    aput-object v5, v7, v4

    aput-object v6, v7, v3

    invoke-static {v7}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v4

    const-string v5, "Compose Legacy Interop Test"

    invoke-static {}, Ldd1/r;->e()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;

    move-result-object v6

    invoke-static {v5, v6, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->COMPOSE_STRESS_TEST:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v6}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v6

    const-string v7, "Compose Stress Test"

    invoke-static {v7, v6, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    new-array v3, v1, [Lm91/u;

    aput-object v5, v3, v8

    aput-object v2, v3, v0

    invoke-static {v3}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v2

    new-array v1, v1, [Ln91/a;

    aput-object v4, v1, v8

    aput-object v2, v1, v0

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ln91/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lid1/a;
    .locals 0

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-virtual {p0, p1}, Ldd1/o;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lid1/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-virtual {p0, p1}, Ldd1/o;->e(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_2

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ROOT:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->getParent()Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldd1/o;->d(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    const-string v1, " > "

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public e(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const-string v0, "itemType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ldd1/o;->d(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ROOT:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-virtual {v0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->getTitle()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v5, v0

    sget-object v0, Ldd1/o$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {}, Ldd1/w;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Ldd1/o;->g()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    invoke-static {}, Ldd1/u;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    invoke-static {}, Ldd1/t;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    invoke-static {}, Ldd1/x;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    invoke-static {}, Ldd1/p;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    invoke-static {}, Ldd1/s;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_7
    invoke-direct {p0}, Ldd1/o;->c()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_8
    invoke-static {}, Ldd1/v;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_9
    invoke-static {}, Ldd1/b;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_a
    invoke-static {}, Ldd1/q;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :pswitch_b
    invoke-static {}, Ldd1/a;->a()Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lm91/u;

    instance-of v1, v10, Led1/b;

    if-eqz v1, :cond_1

    move-object v1, v10

    check-cast v1, Led1/b;

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_2

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Led1/b;->g(Led1/b;Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Ljava/lang/String;Ljava/lang/String;ZLc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v10, v1

    :cond_2
    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lid1/a;
    .locals 0

    invoke-super {p0, p1}, Lgd1/a;->a(Ljava/lang/Object;)Lid1/a;

    move-result-object p1

    return-object p1
.end method
