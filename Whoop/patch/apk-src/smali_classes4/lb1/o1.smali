.class public abstract Llb1/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;",
        "model",
        "Lw51/h;",
        "c",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
        "header",
        "Lw51/d;",
        "h",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;)Lw51/d;",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
        "item",
        "Lw51/f;",
        "i",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;)Lw51/f;",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
        "button",
        "Lw51/b;",
        "g",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lw51/b;",
        "",
        "Lw51/a;",
        "j",
        "(Ljava/lang/String;)Lw51/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "expandableStatisticListMapper",
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

    new-instance v0, Llb1/e1;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/o1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/o1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;
    .locals 0

    invoke-static {p0}, Llb1/o1;->e(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->getCollapsedCount()I

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->getHeader()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    move-result-object v0

    invoke-static {v0}, Llb1/o1;->h(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;)Lw51/d;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->getExpandableListItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;

    invoke-static {v1}, Llb1/o1;->i(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;)Lw51/f;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->getToggleCardButton()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Llb1/o1;->g(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lw51/b;

    move-result-object p0

    :goto_1
    move-object v7, p0

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, Lw51/h;

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Lw51/h;-><init>(Ljava/lang/String;ZILw51/d;Ljava/util/List;Lw51/b;)V

    return-object v1
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/o1$a;

    invoke-direct {v2, v0}, Llb1/o1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/o1;->c(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/o1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lw51/b;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;->getCollapsedTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;->getExpandedTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;->getCollapsedIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->TINY_CARET_DOWN:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v9

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;->getExpandedIcon()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lgz0/m0;->TINY_CARET_UP:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    array-length v5, v1

    :goto_3
    if-ge v6, v5, :cond_4

    aget-object v7, v1, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object v8, v7

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v8, :cond_5

    move-object v5, v0

    goto :goto_5

    :cond_5
    move-object v5, v8

    :goto_5
    new-instance v1, Lw51/b;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lw51/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc93/a;)V

    return-object v1
.end method

.method private static final h(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;)Lw51/d;
    .locals 2

    new-instance v0, Lw51/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lw51/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;)Lw51/f;
    .locals 8

    new-instance v0, Lw51/f;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getActivityNameDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getAvgStrainDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getActivityCountDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getBarFillPercentage()D

    move-result-wide v5

    double-to-float v5, v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->getBarFillStyle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Llb1/o1;->j(Ljava/lang/String;)Lw51/a;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lw51/f;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLw51/a;)V

    return-object v0
.end method

.method private static final j(Ljava/lang/String;)Lw51/a;
    .locals 2

    const-string v0, "STRAIN"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lw51/a;->STRAIN:Lw51/a;

    return-object p0

    :cond_0
    const-string v0, "RECOVERY"

    invoke-static {p0, v0, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lw51/a;->RECOVERY:Lw51/a;

    return-object p0

    :cond_1
    const-string v0, "SLEEP"

    invoke-static {p0, v0, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lw51/a;->SLEEP:Lw51/a;

    return-object p0

    :cond_2
    sget-object p0, Lw51/a;->NO_DATA:Lw51/a;

    return-object p0
.end method
