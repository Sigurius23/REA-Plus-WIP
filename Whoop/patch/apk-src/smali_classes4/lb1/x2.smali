.class public abstract Llb1/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MapModel;",
        "model",
        "Lw41/z;",
        "d",
        "(Lcom/whoop/design/models/items/MapModel;)Lw41/z;",
        "Lcom/whoop/design/models/items/Coordinates;",
        "Lw41/w;",
        "h",
        "(Lcom/whoop/design/models/items/Coordinates;)Lw41/w;",
        "Lcom/whoop/design/models/items/GpsMetrics;",
        "Lw41/r;",
        "g",
        "(Lcom/whoop/design/models/items/GpsMetrics;)Lw41/r;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "mapModelMapper",
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

    new-instance v0, Llb1/t2;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/x2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/x2;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/MapModel;)Lw41/o;
    .locals 0

    invoke-static {p0}, Llb1/x2;->f(Lcom/whoop/design/models/items/MapModel;)Lw41/o;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/x2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Lcom/whoop/design/models/items/MapModel;)Lw41/z;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MapModel;->getGpsCoordinates()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/Coordinates;

    invoke-static {v0}, Llb1/x2;->h(Lcom/whoop/design/models/items/Coordinates;)Lw41/w;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance v0, Lw41/z$b;

    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lw41/w;

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lw41/w;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lw41/z$b;-><init>(Lw41/w;Lw41/w;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/MapModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/x2$a;

    invoke-direct {v2, v0}, Llb1/x2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/MapModel;)Lw41/o;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MapModel;->getMapTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Llb1/x2;->d(Lcom/whoop/design/models/items/MapModel;)Lw41/z;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MapModel;->getGpsMetrics()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/GpsMetrics;

    invoke-static {v4}, Llb1/x2;->g(Lcom/whoop/design/models/items/GpsMetrics;)Lw41/r;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MapModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    new-instance v2, Lw41/o;

    invoke-direct {v2, v0, v1, v3, p0}, Lw41/o;-><init>(Ljava/lang/String;Lw41/z;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-object v2
.end method

.method private static final g(Lcom/whoop/design/models/items/GpsMetrics;)Lw41/r;
    .locals 3

    new-instance v0, Lw41/r;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GpsMetrics;->getValueDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GpsMetrics;->getUnitDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GpsMetrics;->getValueTitleDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lw41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/models/items/Coordinates;)Lw41/w;
    .locals 5

    new-instance v0, Lw41/w;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Coordinates;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Coordinates;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lw41/w;-><init>(DD)V

    return-object v0
.end method
