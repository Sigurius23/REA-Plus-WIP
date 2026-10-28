.class public abstract Li60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u001b\u0010\u000f\u001a\u00020\n8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/access/labsummary/models/LabSummaryRow;",
        "Lp50/c;",
        "C",
        "(Lcom/whoop/access/labsummary/models/LabSummaryRow;)Lp50/c;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getAccessDesignItemReducer",
        "()Ljb1/a;",
        "accessDesignItemReducer",
        "Llb1/y0;",
        "b",
        "Ll83/h;",
        "A",
        "()Llb1/y0;",
        "accessDesignModelMapper",
        "Lm91/p;",
        "c",
        "Lm91/p;",
        "B",
        "()Lm91/p;",
        "accessItemViewFactory",
        "access_release"
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

.field private static final b:Ll83/h;

.field private static final c:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh01/u;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Li60/a;->a:Ljb1/a;

    new-instance v0, Lga1/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lga1/b;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Li60/a;->b:Ll83/h;

    new-instance v0, Lh01/u;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Li60/a;->c:Lm91/p;

    return-void
.end method

.method public static final A()Llb1/y0;
    .locals 1

    sget-object v0, Li60/a;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb1/y0;

    return-object v0
.end method

.method public static final B()Lm91/p;
    .locals 1

    sget-object v0, Li60/a;->c:Lm91/p;

    return-object v0
.end method

.method private static final C(Lcom/whoop/access/labsummary/models/LabSummaryRow;)Lp50/c;
    .locals 3

    new-instance v0, Lp50/c;

    invoke-virtual {p0}, Lcom/whoop/access/labsummary/models/LabSummaryRow;->getLabel()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v1

    invoke-static {v1}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/access/labsummary/models/LabSummaryRow;->getValue()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v2

    invoke-static {v2}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/access/labsummary/models/LabSummaryRow;->getUnit()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object p0

    invoke-static {p0}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lp50/c;-><init>(Lsz0/c0;Lsz0/c0;Lsz0/c0;)V

    return-object v0
.end method

.method public static synthetic a(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;
    .locals 0

    invoke-static {p0}, Li60/a;->x(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Llb1/y0;
    .locals 1

    invoke-static {}, Li60/a;->y()Llb1/y0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->w(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->q(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->z(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;
    .locals 0

    invoke-static {p0}, Li60/a;->t(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->s(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/access/labsummary/models/LabSummaryModel;)Lp50/d;
    .locals 0

    invoke-static {p0}, Li60/a;->r(Lcom/whoop/access/labsummary/models/LabSummaryModel;)Lp50/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->n(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->o(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;
    .locals 0

    invoke-static {p0}, Li60/a;->v(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;
    .locals 0

    invoke-static {p0}, Li60/a;->p(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li60/a;->u(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    const-class v1, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li60/a$a;

    invoke-direct {v2, v0}, Li60/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li50/a;->a(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    const-class v1, Lcom/whoop/access/labsummary/models/LabSummaryModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li60/a$b;

    invoke-direct {v2, v0}, Li60/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcom/whoop/access/labsummary/models/LabSummaryModel;)Lp50/d;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/access/labsummary/models/LabSummaryModel;->getRows()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/access/labsummary/models/LabSummaryRow;

    invoke-static {v2}, Li60/a;->C(Lcom/whoop/access/labsummary/models/LabSummaryRow;)Lp50/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Li60/a;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/access/labsummary/models/LabSummaryModel;->getItems()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Lp50/d;

    invoke-direct {v0, v1, p0}, Lp50/d;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method private static final s(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    const-class v1, Lcom/whoop/access/circumference/models/CircumferenceModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li60/a$c;

    invoke-direct {v2, v0}, Li60/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ll50/a;->c(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh01/u;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    const-class v1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li60/a$d;

    invoke-direct {v2, v0}, Li60/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr50/a;->a(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhu1/g;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lhu1/g;-><init>(I)V

    const-class v1, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li60/a$e;

    invoke-direct {v2, v0}, Li60/a$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lb60/a;->a(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;

    move-result-object p0

    return-object p0
.end method

.method private static final y()Llb1/y0;
    .locals 1

    sget-object v0, Li60/a;->a:Ljb1/a;

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    return-object v0
.end method

.method private static final z(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lj50/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lj50/a;

    invoke-direct {v3}, Lj50/a;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lp50/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lp50/a;

    invoke-direct {v3}, Lp50/a;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lm50/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lm50/a;

    invoke-direct {v3}, Lm50/a;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Ls50/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ls50/a;

    invoke-direct {v3}, Ls50/a;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lc60/d;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lc60/b;

    invoke-direct {v1}, Lc60/b;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
