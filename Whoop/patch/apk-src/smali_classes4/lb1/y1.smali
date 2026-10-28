.class public abstract Llb1/y1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "e",
        "()Ljb1/a;",
        "groupedItemsPanelNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "groupedItemsPanelMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/y1;->a:Ll83/h;

    new-instance v0, Llb1/t1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/y1;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/y1;->h()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/GroupedItemsPanelModel;)Ll71/d;
    .locals 0

    invoke-static {p0}, Llb1/y1;->g(Lcom/whoop/design/models/items/GroupedItemsPanelModel;)Ll71/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/y1;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/y1;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/y1;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/GroupedItemsPanelModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/y1$a;

    invoke-direct {v2, v0}, Llb1/y1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/GroupedItemsPanelModel;)Ll71/d;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll71/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GroupedItemsPanelModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Llb1/y1;->e()Ljb1/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GroupedItemsPanelModel;->getItems()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GroupedItemsPanelModel;->getBottomContentInsetDp()F

    move-result p0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p0, v3}, Ll71/d;-><init>(Ljava/lang/String;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final h()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method
