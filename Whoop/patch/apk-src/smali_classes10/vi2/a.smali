.class public abstract Lvi2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "streaksReducer",
        "streaks_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lve0/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lve0/d;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lvi2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;)Lti2/a;
    .locals 0

    invoke-static {p0}, Lvi2/a;->h(Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;)Lti2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/streaks/domain/models/MilestoneHeader;)Lu21/a;
    .locals 0

    invoke-static {p0}, Lvi2/a;->i(Lcom/whoop/streaks/domain/models/MilestoneHeader;)Lu21/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvi2/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvi2/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lvi2/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lve0/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lve0/d;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lve0/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lve0/d;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvi2/a$a;

    invoke-direct {v3, v0}, Lvi2/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lve0/d;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Lve0/d;-><init>(I)V

    const-class v2, Lcom/whoop/streaks/domain/models/MilestoneHeader;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lvi2/a$b;

    invoke-direct {v2, v0}, Lvi2/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;)Lti2/a;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/streaks/domain/models/HorizontalTrackerModel;->getTrackedItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/streaks/domain/models/TrackedItem;

    new-instance v3, Lti2/h;

    invoke-virtual {v2}, Lcom/whoop/streaks/domain/models/TrackedItem;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/streaks/domain/models/TrackedItem;->getStyle()Ljava/lang/String;

    move-result-object v5

    const-string v6, "HIGHLIGHT"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_1

    :cond_0
    sget-object v5, Ly81/f;->WHITE_50:Ly81/f;

    :goto_1
    new-instance v6, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/streaks/domain/models/TrackedItem;->getIconUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v4, v5, v6}, Lti2/h;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lkd1/o;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Lti2/a;

    invoke-direct {p0, v0, v1}, Lti2/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object p0
.end method

.method private static final i(Lcom/whoop/streaks/domain/models/MilestoneHeader;)Lu21/a;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu21/a;

    invoke-virtual {p0}, Lcom/whoop/streaks/domain/models/MilestoneHeader;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, p0}, Lu21/a;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
