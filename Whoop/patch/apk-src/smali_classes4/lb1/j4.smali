.class public abstract Llb1/j4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/j4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "selectionWidgetMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/x3;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/j4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/SelectionWidgetModel;)Lr31/f;
    .locals 0

    invoke-static {p0}, Llb1/j4;->e(Lcom/whoop/design/models/items/SelectionWidgetModel;)Lr31/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/j4;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/j4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SelectionWidgetModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/j4$b;

    invoke-direct {v2, v0}, Llb1/j4$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/SelectionWidgetModel;)Lr31/f;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getStatus()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/models/items/ItemVisibilityStateEnum;->DISABLED:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    if-ne v4, v5, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getButton()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    if-eqz v4, :cond_1

    instance-of v6, v5, Ll11/e;

    if-eqz v6, :cond_1

    move-object v7, v5

    check-cast v7, Ll11/e;

    sget-object v15, Ll11/d$b;->a:Ll11/d$b;

    const/16 v20, 0xf7f

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v7 .. v21}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v5

    :cond_1
    move-object v11, v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getItems()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/u;

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    instance-of v7, v6, Lb81/j;

    if-eqz v7, :cond_3

    move-object v12, v6

    check-cast v12, Lb81/j;

    const/16 v19, 0x17

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    invoke-static/range {v12 .. v20}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object v6

    goto :goto_3

    :cond_3
    instance-of v7, v6, Lb81/f;

    if-eqz v7, :cond_6

    move-object v12, v6

    check-cast v12, Lb81/f;

    invoke-virtual {v12}, Lb81/f;->c()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/u;

    instance-of v8, v7, Lb81/j;

    if-eqz v8, :cond_4

    move-object v15, v7

    check-cast v15, Lb81/j;

    const/16 v22, 0x17

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-static/range {v15 .. v23}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object v7

    :cond_4
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    const/16 v16, 0x5

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lb81/f;->b(Lb81/f;Ljava/lang/String;Ljava/util/List;Lb81/e;ILjava/lang/Object;)Lb81/f;

    move-result-object v6

    :cond_6
    :goto_3
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lt31/c;

    if-eqz v7, :cond_8

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v12, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt31/c;

    invoke-virtual {v4}, Lt31/c;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_b
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lb81/f;

    if-eqz v6, :cond_b

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb81/f;

    invoke-virtual {v5}, Lb81/f;->c()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/u;

    instance-of v8, v7, Lb81/j;

    if-eqz v8, :cond_e

    check-cast v7, Lb81/j;

    goto :goto_9

    :cond_e
    move-object v7, v0

    :goto_9
    if-eqz v7, :cond_f

    invoke-virtual {v7}, Lb81/j;->g()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_a

    :cond_f
    move-object v7, v0

    :goto_a
    if-eqz v7, :cond_d

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-static {v4, v6}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_7

    :cond_11
    invoke-static {v12, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v13

    new-instance v6, Lr31/f;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectionWidgetModel;->getStatus()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    move-result-object v0

    sget-object v1, Llb1/j4$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_13

    const/4 v1, 0x2

    if-ne v0, v1, :cond_12

    sget-object v0, Lr31/e;->ENABLED:Lr31/e;

    :goto_b
    move-object v9, v0

    goto :goto_c

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    sget-object v0, Lr31/e;->DISABLED:Lr31/e;

    goto :goto_b

    :goto_c
    invoke-direct/range {v6 .. v13}, Lr31/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;)V

    return-object v6
.end method
