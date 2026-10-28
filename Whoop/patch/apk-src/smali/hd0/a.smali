.class public final Lhd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lhd0/a;",
        "",
        "<init>",
        "()V",
        "Ldd0/b$f;",
        "domainResult",
        "Lgd0/c$e;",
        "c",
        "(Ldd0/b$f;)Lgd0/c$e;",
        "currentState",
        "Ldd0/b$a;",
        "f",
        "(Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;",
        "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;",
        "consentResponse",
        "Lpb0/d$a;",
        "d",
        "(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;)Lpb0/d$a;",
        "Lec3/l;",
        "Ldd0/b;",
        "upstream",
        "Lgd0/c;",
        "e",
        "(Lec3/l;)Lec3/l;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lhd0/a;Ldd0/b$f;)Lgd0/c$e;
    .locals 0

    invoke-direct {p0, p1}, Lhd0/a;->c(Ldd0/b$f;)Lgd0/c$e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lhd0/a;Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhd0/a;->f(Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ldd0/b$f;)Lgd0/c$e;
    .locals 7

    invoke-virtual {p1}, Ldd0/b$f;->a()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;->getConsentModels()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    invoke-direct {p0, v1}, Lhd0/a;->d(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;)Lpb0/d$a;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;

    invoke-virtual {p1}, Ldd0/b$f;->a()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;->getConsentVersions()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Ldd0/b$f;->a()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;->getConsentModels()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    :goto_1
    move-object v4, p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, Lgd0/c$e;

    const/4 v5, 0x0

    sget-object v6, Lm83/z;->w:Lm83/z;

    invoke-direct/range {v1 .. v6}, Lgd0/c$e;-><init>(Ljava/util/List;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;ILjava/util/Map;)V

    return-object v1
.end method

.method private final d(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;)Lpb0/d$a;
    .locals 11

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v3, Lkd0/c$f;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Lkd0/c$f;-><init>(Lgz0/m0;Lcom/whoop/navigation/e;)V

    move-object v2, v3

    :cond_0
    new-instance v4, Lkd0/c$e;

    invoke-direct {v4, v0, v2}, Lkd0/c$e;-><init>(Ljava/lang/String;Lkd0/c$f;)V

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getCheckboxes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lpb0/b;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lpb0/b;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getButtonLabel()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lpb0/a;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/ButtonModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v9, v0, p1}, Lpb0/a;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    new-instance v3, Lpb0/d$a;

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v10}, Lpb0/d$a;-><init>(Lkd0/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpb0/a;Z)V

    return-object v3
.end method

.method private final f(Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lgd0/c$e;->d()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Ldd0/b$a;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_0
    invoke-virtual/range {p2 .. p2}, Ldd0/b$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ldd0/b$a;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Ldd0/b$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lgd0/c$e;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v7, v4, 0x1

    const/4 v8, 0x0

    if-ltz v4, :cond_9

    move-object v9, v5

    check-cast v9, Lpb0/d$a;

    invoke-virtual/range {p2 .. p2}, Ldd0/b$a;->b()I

    move-result v5

    if-ne v4, v5, :cond_8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_1

    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-virtual {v9}, Lpb0/d$a;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v10, v3

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x1

    if-eqz v11, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v14, v10, 0x1

    if-ltz v10, :cond_3

    check-cast v11, Lpb0/b;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    goto :goto_3

    :cond_2
    move v10, v3

    :goto_3
    invoke-static {v11, v8, v10, v12, v8}, Lpb0/b;->b(Lpb0/b;Ljava/lang/String;ZILjava/lang/Object;)Lpb0/b;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v10, v14

    goto :goto_2

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_4
    invoke-virtual {v9}, Lpb0/d$a;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v5

    instance-of v8, v5, Ljava/util/Collection;

    if-eqz v8, :cond_6

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_6

    :cond_5
    move/from16 v16, v12

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    move-object v8, v5

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_5

    move-object v8, v5

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    move/from16 v16, v3

    :goto_4
    const/16 v17, 0x37

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v18}, Lpb0/d$a;->c(Lpb0/d$a;Lkd0/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpb0/a;ZILjava/lang/Object;)Lpb0/d$a;

    move-result-object v9

    :cond_8
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v7

    goto/16 :goto_1

    :cond_9
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_a
    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v8}, Lgd0/c$e;->c(Lgd0/c$e;Ljava/util/List;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;ILjava/util/Map;ILjava/lang/Object;)Lgd0/c$e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgd0/c$c;->b:Lgd0/c$c;

    const-string v1, "null cannot be cast to non-null type com.whoop.advancedlabs.multiconsentscreen.presentation.MultiConsentViewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhd0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lhd0/a$a;-><init>(Lhd0/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
