.class public abstract Llb1/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/u1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/OverviewGaugeModel;",
        "model",
        "Lz51/l;",
        "s",
        "(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;",
        "Lcom/whoop/design/models/items/CustomGaugeEntryModel;",
        "Lz51/a;",
        "q",
        "(Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lz51/a;",
        "Lcom/whoop/design/models/items/ExplainerGaugeModel;",
        "Lr11/d;",
        "h",
        "(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;",
        "Lcom/whoop/design/models/items/ScoreGaugeModel;",
        "Lj81/i;",
        "r",
        "(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;",
        "",
        "Li91/a;",
        "t",
        "(Ljava/lang/String;)Li91/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "p",
        "()Llb1/y0;",
        "gaugeMapper",
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

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/u1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;
    .locals 0

    invoke-static {p0}, Llb1/u1;->j(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;
    .locals 0

    invoke-static {p0}, Llb1/u1;->o(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/u1;->i(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/StrainGaugeModel;)Lz51/r;
    .locals 0

    invoke-static {p0}, Llb1/u1;->l(Lcom/whoop/design/models/items/StrainGaugeModel;)Lz51/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;
    .locals 0

    invoke-static {p0}, Llb1/u1;->n(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/design/models/items/RecoveryGaugeModel;)Lz51/r;
    .locals 0

    invoke-static {p0}, Llb1/u1;->k(Lcom/whoop/design/models/items/RecoveryGaugeModel;)Lz51/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;
    .locals 0

    invoke-static {p0}, Llb1/u1;->m(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getOptimalStrainPercent()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/lit8 v3, v0, 0x1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getOptimalStrainPercent()F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getLowerOptimalStrainFillValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getHigherOptimalStrainFillValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getRecoveryPercentage()F

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getRecoveryLevel()Lz51/k;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getStrainScorePercentage()F

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getDescriptionText()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getDescriptionSubText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->getHasDivider()Z

    move-result v11

    new-instance v2, Lr11/d;

    invoke-direct/range {v2 .. v11}, Lr11/d;-><init>(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    return-object v2
.end method

.method private static final i(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/OverviewGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u1$b;

    invoke-direct {v3, v0}, Llb1/u1$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/e1;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Llb1/e1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/RecoveryGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u1$c;

    invoke-direct {v3, v0}, Llb1/u1$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/e1;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Llb1/e1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/StrainGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u1$d;

    invoke-direct {v3, v0}, Llb1/u1$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/e1;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Llb1/e1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ExplainerGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u1$e;

    invoke-direct {v3, v0}, Llb1/u1$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/e1;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Llb1/e1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ScoreGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u1$f;

    invoke-direct {v3, v0}, Llb1/u1$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/u1$g;

    invoke-direct {v2, v0}, Llb1/u1$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u1;->s(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/RecoveryGaugeModel;)Lz51/r;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz51/r;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RecoveryGaugeModel;->getRecoveryLevel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x78ae7c8b

    if-eq v2, v3, :cond_3

    const v3, -0x2af4d25c

    if-eq v2, v3, :cond_2

    const v3, 0x12734

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "LOW"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lz51/s;->RECOVERY_LOW:Lz51/s;

    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_2
    const-string v2, "CALIBRATING"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lz51/s;->CALIBRATING:Lz51/s;

    goto :goto_0

    :cond_3
    const-string v2, "MEDIUM"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    :goto_1
    sget-object v0, Lz51/s;->RECOVERY_HIGH:Lz51/s;

    goto :goto_0

    :cond_5
    sget-object v0, Lz51/s;->RECOVERY_MEDIUM:Lz51/s;

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/RecoveryGaugeModel;->getGaugeFillPercentage()F

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RecoveryGaugeModel;->getScoreDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lz51/r;-><init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final l(Lcom/whoop/design/models/items/StrainGaugeModel;)Lz51/r;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz51/r;

    sget-object v2, Lz51/s;->STRAIN:Lz51/s;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainGaugeModel;->getGaugeFillPercentage()F

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainGaugeModel;->getScoreDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lz51/r;-><init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final m(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u1;->h(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u1;->r(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeRowModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeRowModel;->getGauges()Ljava/util/List;

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

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ScoreGaugeDialModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreDisplaySuffix()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v7

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getTitleEndIcon()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {v8}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v7

    :cond_1
    move-object v8, v7

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getProgressFillStyle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Llb1/u1;->t(Ljava/lang/String;)Li91/a;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getGaugeFillPercentage()F

    move-result v10

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreTarget()Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getLowerOptimalPercentage()Ljava/lang/Float;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getHigherOptimalPercentage()Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v14

    move-object v7, v3

    new-instance v3, Ls51/i;

    invoke-direct/range {v3 .. v14}, Ls51/i;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Ls51/m;

    invoke-direct {p0, v0, v1}, Ls51/m;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final p()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/u1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final q(Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lz51/a;
    .locals 2

    new-instance v0, Lz51/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CustomGaugeEntryModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CustomGaugeEntryModel;->getDisplayValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lz51/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public static final r(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;
    .locals 23

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getScoreDisplayTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getScoreDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getScoreDisplaySuffix()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getGaugeFillPercentage()F

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getScoreTarget()Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getLowerOptimalPercentage()Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getHigherOptimalPercentage()Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getProgressFillStyle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Llb1/u1;->t(Ljava/lang/String;)Li91/a;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getBarStyles()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_2

    check-cast v12, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v12, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/models/LegendStyle;

    invoke-static {v13}, Llb1/r2;->a(Lcom/whoop/design/models/LegendStyle;)Ly81/f;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-object v12, v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ScoreGaugeModel;->getScoreDisplayStyle()Lcom/whoop/design/models/items/DisplayStyle;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v3, Llb1/u1$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_4

    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    sget-object v1, Ly81/f;->WHITE_20:Ly81/f;

    goto :goto_3

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_3
    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move-object/from16 v18, v1

    goto :goto_6

    :cond_6
    :goto_5
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_4

    :goto_6
    new-instance v1, Lj81/i;

    const v21, 0x67800

    const/16 v22, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v3, v0

    invoke-direct/range {v1 .. v22}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final s(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;
    .locals 23

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getHasSleepPerformance()Z

    move-result v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getRecoveryLevel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "NONE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lz51/k;->NONE:Lz51/k;

    :goto_0
    move-object v9, v0

    goto :goto_2

    :sswitch_1
    const-string v2, "HIGH"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lz51/k;->HIGH:Lz51/k;

    goto :goto_0

    :sswitch_2
    const-string v2, "LOW"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lz51/k;->LOW:Lz51/k;

    goto :goto_0

    :sswitch_3
    const-string v2, "CALIBRATING"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lz51/k;->CALIBRATING:Lz51/k;

    goto :goto_0

    :sswitch_4
    const-string v2, "MEDIUM"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_1
    sget-object v0, Lz51/k;->CALIBRATING:Lz51/k;

    goto :goto_0

    :cond_4
    sget-object v0, Lz51/k;->MEDIUM:Lz51/k;

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getRecoveryScoreGaugeFillPercentage()F

    move-result v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getRecoveryScoreDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getSleepPerformanceDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getDayStrainDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getDayStrainGaugeFillPercentage()F

    move-result v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getOptimalStrainGaugeFillPercentage()F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v0, v0, v2

    const/4 v5, 0x1

    if-nez v0, :cond_5

    move v0, v5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    xor-int/2addr v0, v5

    move v6, v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getOptimalStrainGaugeFillPercentage()F

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getLowerOptimalStrainFillValue()F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getHigherOptimalStrainFillValue()F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    move v15, v6

    new-instance v6, Ll83/k;

    invoke-direct {v6, v13, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getHrvDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getWeeklyPlanGoalStrainGaugeFillPercentage()Ljava/lang/Float;

    move-result-object v14

    if-eqz v14, :cond_6

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v14

    goto :goto_4

    :cond_6
    move v14, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getWeeklyPlanDisplay()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getWeeklyPlanGoalStrainGaugeFillPercentage()Ljava/lang/Float;

    move-result-object v17

    if-eqz v17, :cond_7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getWeeklyPlanGoalStrainGaugeFillPercentage()Ljava/lang/Float;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v2

    if-nez v2, :cond_7

    move v3, v15

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getFirstCustomGaugeEntry()Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    move-result-object v2

    const/4 v15, 0x0

    if-eqz v2, :cond_8

    invoke-static {v2}, Llb1/u1;->q(Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lz51/a;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_6

    :cond_8
    move-object/from16 v19, v15

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/OverviewGaugeModel;->getSecondCustomGaugeEntry()Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v1}, Llb1/u1;->q(Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lz51/a;

    move-result-object v15

    :cond_9
    move-object/from16 v20, v15

    new-instance v1, Lz51/l;

    const v21, 0x1c000

    const/16 v22, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move v2, v0

    invoke-direct/range {v1 .. v22}, Lz51/l;-><init>(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x78ae7c8b -> :sswitch_4
        -0x2af4d25c -> :sswitch_3
        0x12734 -> :sswitch_2
        0x21d5a2 -> :sswitch_1
        0x24a738 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final t(Ljava/lang/String;)Li91/a;
    .locals 1

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "RECOVERY_HIGH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p0, Llb1/u1$h;->w:Llb1/u1$h;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_1
    const-string v0, "RECOVERY_MEDIUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Llb1/u1$i;->w:Llb1/u1$i;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_2
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Llb1/u1$m;->w:Llb1/u1$m;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_3
    const-string v0, "RECOVERY_LOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Llb1/u1$j;->w:Llb1/u1$j;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_4
    const-string v0, "CALIBRATING"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Llb1/u1$k;->w:Llb1/u1$k;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_5
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    sget-object p0, Llb1/u1$l;->w:Llb1/u1$l;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_0
    sget-object p0, Llb1/u1$n;->w:Llb1/u1$n;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d97ca8b -> :sswitch_5
        -0x2af4d25c -> :sswitch_4
        0x194f38a -> :sswitch_3
        0x4b536b7 -> :sswitch_2
        0x15c14f5f -> :sswitch_1
        0x3107940c -> :sswitch_0
    .end sparse-switch
.end method
