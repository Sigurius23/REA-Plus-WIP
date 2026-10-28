.class public abstract Llb1/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/HorizontalScrollContainerModel;",
        "model",
        "Lr71/c;",
        "e",
        "(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "horizontalScrollContainerMapper",
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

    new-instance v0, Llb1/t1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b2;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b2;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;
    .locals 0

    invoke-static {p0}, Llb1/b2;->g(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b2;->a:Llb1/y0;

    return-object v0
.end method

.method public static final e(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lr71/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getScrollBehavior()Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getPagingIndicatorEnabled()Z

    move-result v7

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b2$a;

    invoke-direct {v2, v0}, Llb1/b2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/b2;->e(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
