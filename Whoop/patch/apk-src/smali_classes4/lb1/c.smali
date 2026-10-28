.class public abstract Llb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;",
        "Lc41/r;",
        "f",
        "(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "activityTileSelectionItemMapper",
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

    new-instance v0, Llb1/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/c;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;
    .locals 0

    invoke-static {p0}, Llb1/c;->d(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/c;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/c$a;

    invoke-direct {v2, v0}, Llb1/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/c;->f(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/c;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getSelectableState()Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;->getState()Lcom/whoop/design/models/ActivityTileSelectionState;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/ActivityTileSelectionState;->SELECTABLE:Lcom/whoop/design/models/ActivityTileSelectionState;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getSelectableState()Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v13, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getScoreDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getStartTimeText()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getEndTimeText()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v6, 0x0

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    move-object v0, v6

    :goto_2
    if-eqz v0, :cond_2

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    goto :goto_3

    :cond_2
    move-object v0, v6

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getActivityV2Id()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->isGpsEnabled()Z

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getDuring()Lcom/whoop/design/models/items/During;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v9, Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/During;->getLowerEndpoint()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/During;->getUpperEndpoint()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v10, v1}, Lcom/whoop/service/network/model/cycles/Period;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_3
    move-object v9, v6

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getDuring()Lcom/whoop/design/models/items/During;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/During;->getLowerEndpoint()Ljava/lang/String;

    move-result-object v1

    move-object v10, v1

    goto :goto_5

    :cond_4
    move-object v10, v6

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getDuring()Lcom/whoop/design/models/items/During;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/During;->getUpperEndpoint()Ljava/lang/String;

    move-result-object v6

    :cond_5
    move-object v11, v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getSelectableState()Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;->getState()Lcom/whoop/design/models/ActivityTileSelectionState;

    move-result-object v12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;->getActivity()Lcom/whoop/design/models/items/ActivityTileSelectionModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ActivityTileSelectionModel;->getInternalName()Ljava/lang/String;

    move-result-object v14

    new-instance v1, Lc41/r;

    move-object v6, v0

    invoke-direct/range {v1 .. v14}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V

    return-object v1
.end method
