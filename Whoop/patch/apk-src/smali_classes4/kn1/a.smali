.class public final Lkn1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000c\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkn1/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
        "",
        "index",
        "",
        "isDraggable",
        "isOrderable",
        "minimumSelectedIndex",
        "Le41/i;",
        "a",
        "(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZI)Le41/i;",
        "Len1/c;",
        "domainState",
        "Ljn1/d;",
        "b",
        "(Len1/c;)Ljn1/d;",
        "home-customization_release"
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

.method private final a(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZI)Le41/i;
    .locals 15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getSupportedTrendKey()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move/from16 v2, p2

    move/from16 v3, p5

    if-lt v2, v3, :cond_1

    :cond_0
    if-nez p4, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const/4 v2, 0x1

    move v3, v2

    goto :goto_0

    :cond_2
    move v3, v0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    :goto_1
    if-ge v0, v6, :cond_4

    aget-object v7, v5, v0

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-nez v7, :cond_5

    move-object v9, v4

    goto :goto_3

    :cond_5
    move-object v9, v7

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v12, Le41/k;->NOT_EXPANDED:Le41/k;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v8

    new-instance v0, Le41/i;

    const/16 v13, 0x24a

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move/from16 v5, p3

    move/from16 v6, p4

    invoke-direct/range {v0 .. v14}, Le41/i;-><init>(Ljava/lang/String;Ljava/lang/Object;ZZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Le41/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic c(Lkn1/a;Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZIILjava/lang/Object;)Le41/i;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p4, 0x1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lkn1/a;->a(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZI)Le41/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Len1/c;)Ljn1/d;
    .locals 28

    move-object/from16 v0, p1

    const-string v1, "domainState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Len1/c$b;->a:Len1/c$b;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Ljn1/d$b;->a:Ljn1/d$b;

    return-object v0

    :cond_0
    sget-object v1, Len1/c$a;->a:Len1/c$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Ljn1/d$a;

    sget v1, Lan1/a;->n:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget v2, Lan1/a;->p:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v3, Lan1/a;->d:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ljn1/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_1
    instance-of v1, v0, Len1/c$c;

    if-eqz v1, :cond_f

    check-cast v0, Len1/c$c;

    invoke-virtual {v0}, Len1/c$c;->i()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v4}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    check-cast v2, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    const/4 v1, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    if-nez v4, :cond_5

    :cond_4
    invoke-virtual {v0}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    :cond_5
    invoke-virtual {v0}, Len1/c$c;->f()Len1/a;

    move-result-object v5

    invoke-virtual {v5}, Len1/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Len1/c$c;->f()Len1/a;

    move-result-object v6

    invoke-virtual {v6}, Len1/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getShortName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_7

    :cond_6
    invoke-virtual {v0}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v2}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getShortName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :cond_7
    invoke-virtual {v4}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getShortName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v8, Ljn1/a;

    invoke-direct {v8, v5, v6, v2, v4}, Ljn1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v0}, Len1/c$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Len1/c$c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Len1/c$c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Len1/c$c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Len1/c$c;->i()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x2

    move/from16 v24, v1

    move/from16 v21, v5

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v24, 0x1

    if-ltz v24, :cond_9

    move-object/from16 v23, v5

    check-cast v23, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual/range {v23 .. v23}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v5

    if-eqz v5, :cond_8

    add-int/lit8 v21, v21, -0x1

    :cond_8
    move/from16 v27, v21

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v22, p0

    invoke-direct/range {v22 .. v27}, Lkn1/a;->a(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZI)Le41/i;

    move-result-object v5

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v24, v6

    move/from16 v21, v27

    goto :goto_1

    :cond_9
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_a
    invoke-virtual {v0}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move/from16 v18, v1

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v18, 0x1

    if-ltz v18, :cond_b

    move-object/from16 v17, v5

    check-cast v17, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v16, p0

    invoke-static/range {v16 .. v23}, Lkn1/a;->c(Lkn1/a;Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZIILjava/lang/Object;)Le41/i;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v18, v6

    goto :goto_2

    :cond_b
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_c
    invoke-virtual {v0}, Len1/c$c;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move/from16 v18, v1

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v4, v18, 0x1

    if-ltz v18, :cond_d

    move-object/from16 v17, v1

    check-cast v17, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, p0

    invoke-static/range {v16 .. v23}, Lkn1/a;->c(Lkn1/a;Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZIILjava/lang/Object;)Le41/i;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v18, v4

    goto :goto_3

    :cond_d
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_e
    invoke-virtual {v0}, Len1/c$c;->h()Z

    move-result v16

    invoke-virtual {v0}, Len1/c$c;->l()Z

    move-result v17

    new-instance v7, Ljn1/d$c;

    invoke-direct/range {v7 .. v17}, Ljn1/d$c;-><init>(Ljn1/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V

    return-object v7

    :cond_f
    sget-object v1, Len1/c$d;->a:Len1/c$d;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Ljn1/d$d;->a:Ljn1/d$d;

    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
