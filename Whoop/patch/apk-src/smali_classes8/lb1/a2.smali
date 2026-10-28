.class public abstract Llb1/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/HistoryListItemModel;",
        "Lp71/c;",
        "f",
        "(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "historyListItemMapper",
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

    new-instance v0, Llb1/m;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/a2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;
    .locals 0

    invoke-static {p0}, Llb1/a2;->e(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/a2;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/a2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/HistoryListItemModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/a2$a;

    invoke-direct {v2, v0}, Llb1/a2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/a2;->f(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getTrailingText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    move v9, v5

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move-object v10, v6

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v6

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v9, v8

    :goto_3
    if-ge v5, v9, :cond_4

    aget-object v11, v8, v5

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    move-object v6, v11

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    move-object v7, v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getStyle()Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getWarning()Ljava/lang/String;

    move-result-object v9

    move-object v5, v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getCaption()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/HistoryListItemModel;->getExpandedContent()Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;->getChildren()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v6, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/models/items/HistoryListItemModel;

    invoke-static {v13}, Llb1/a2;->f(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    :goto_6
    move-object v6, v0

    goto :goto_7

    :cond_6
    sget-object v12, Lm83/y;->w:Lm83/y;

    goto :goto_6

    :goto_7
    new-instance v0, Lp71/c;

    const/4 v13, 0x0

    const/16 v14, 0x1000

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v15}, Lp71/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;Lgz0/m0;Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
