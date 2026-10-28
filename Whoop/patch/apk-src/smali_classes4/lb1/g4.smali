.class public abstract Llb1/g4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/g4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a3\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n*\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SelectableCellListModel;",
        "Ln01/e;",
        "e",
        "(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;",
        "",
        "Lcom/whoop/design/models/items/SelectableCellModel;",
        "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
        "searchBehavior",
        "",
        "keyword",
        "",
        "c",
        "(Ljava/util/List;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;Ljava/lang/String;)Ljava/util/Set;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "selectableCellListItemMapper",
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

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/g4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;
    .locals 0

    invoke-static {p0}, Llb1/g4;->g(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/g4;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/util/List;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;",
            "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p2, :cond_b

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v0, -0x1

    if-nez p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    sget-object v1, Llb1/g4$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_6

    const/4 v0, 0x1

    if-eq p1, v0, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-static {v1, p2}, Lcom/whoop/design/models/items/SelectableCellListModelKt;->matchesSearch(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    move-object p0, p1

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-static {v1, p2}, Lcom/whoop/design/models/items/SelectableCellListModelKt;->matchesSearch(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    :goto_4
    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {p2}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_6
    sget-object p0, Lm83/a0;->w:Lm83/a0;

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/g4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;
    .locals 24

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getMaxSelection()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getMinSelection()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getCells()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-static {v5}, Llb1/h4;->d(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;

    move-result-object v6

    invoke-virtual {v6}, Lry0/d;->q()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    const/4 v5, 0x0

    :goto_1
    move/from16 v19, v5

    goto :goto_3

    :cond_1
    :goto_2
    const/4 v5, 0x1

    goto :goto_1

    :goto_3
    const/16 v22, 0x6fff

    const/16 v23, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v6 .. v23}, Lry0/d;->b(Lry0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILjava/lang/Object;)Lry0/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getCells()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getSearchBehavior()Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getSearchQuery()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v5, v6}, Llb1/g4;->c(Ljava/util/List;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled()Z

    move-result v7

    new-instance v0, Ln01/e;

    invoke-direct/range {v0 .. v7}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SelectableCellListModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/g4$b;

    invoke-direct {v2, v0}, Llb1/g4$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/g4;->e(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;

    move-result-object p0

    return-object p0
.end method
