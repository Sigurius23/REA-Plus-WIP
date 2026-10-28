.class public abstract Lmc1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmc1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graphResponse",
        "",
        "requestedPlotId",
        "Lj71/c;",
        "b",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;)Lj71/c;",
        "",
        "Lj71/b;",
        "plots",
        "graphId",
        "f",
        "(Ljava/util/List;Ljava/lang/String;)Lj71/b;",
        "Lmc1/b;",
        "heartRateZoneType",
        "Lmc1/e$a;",
        "activityType",
        "c",
        "(Lmc1/b;Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;",
        "e",
        "(Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "reducer",
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm01/c;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lm01/c;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lmc1/f;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmc1/f;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;)Lj71/c;
    .locals 8

    const-string v0, "graphResponse"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestedPlotId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/f;->a:Ljb1/a;

    invoke-virtual {v0, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lj71/c;

    invoke-virtual {v1}, Lj71/c;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj71/b;

    invoke-virtual {p0}, Lj71/b;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Lj71/c;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p0}, Lmc1/f;->f(Ljava/util/List;Ljava/lang/String;)Lj71/b;

    move-result-object v0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphPlotState.Line"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj71/b$g;

    invoke-static {v0}, Lmc1/a;->b(Lj71/b$g;)Lj71/b;

    move-result-object p0

    invoke-virtual {v1}, Lj71/c;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lmc1/f;->f(Ljava/util/List;Ljava/lang/String;)Lj71/b;

    move-result-object p1

    filled-new-array {p0, p1}, [Lj71/b;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_0
    move-object v3, p0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :goto_1
    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmc1/b;Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "heartRateZoneType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "MEDIUM_STRESS"

    return-object p0

    :pswitch_1
    const-string p0, "LOW_STRESS"

    return-object p0

    :pswitch_2
    const-string p0, "HIGH_STRESS"

    return-object p0

    :pswitch_3
    const-string p0, "AWAKE"

    return-object p0

    :pswitch_4
    const-string p0, "VERY_LIGHT"

    return-object p0

    :pswitch_5
    const-string p0, "SWS_SLEEP"

    return-object p0

    :pswitch_6
    const-string p0, "RESTORATIVE"

    return-object p0

    :pswitch_7
    const-string p0, "REM_SLEEP"

    return-object p0

    :pswitch_8
    const-string p0, "NO_DATA"

    return-object p0

    :pswitch_9
    const-string p0, "MODERATE"

    return-object p0

    :pswitch_a
    const-string p0, "MAX"

    return-object p0

    :pswitch_b
    const-string p0, "LIGHT_SLEEP"

    return-object p0

    :pswitch_c
    const-string p0, "LIGHT"

    return-object p0

    :pswitch_d
    const-string p0, "INHALE"

    return-object p0

    :pswitch_e
    const-string p0, "HOLD"

    return-object p0

    :pswitch_f
    const-string p0, "HARD"

    return-object p0

    :pswitch_10
    const-string p0, "EXHALE"

    return-object p0

    :pswitch_11
    invoke-static {p1, p2}, Lmc1/f;->e(Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic d(Lmc1/b;Lmc1/e$a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const-string p2, "HEART_RATE"

    :cond_0
    invoke-static {p0, p1, p2}, Lmc1/f;->c(Lmc1/b;Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lmc1/f$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    const-string p0, "SLEEP_HEART_RATE"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "STRAIN_HEART_RATE"

    return-object p0

    :cond_2
    const-string p0, "STRESS"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-object p0

    :cond_3
    const-string p0, "RECOVERY_HEART_RATE"

    return-object p0
.end method

.method private static final f(Ljava/util/List;Ljava/lang/String;)Lj71/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lj71/b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lj71/b;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lj71/b$g;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lj71/b$g;

    invoke-virtual {v1}, Lj71/b$g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lj71/b$g;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "GraphId "

    const-string v1, " is not in list of line plots"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lj71/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lmc1/f$b;

    invoke-direct {v1}, Lmc1/f$b;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
