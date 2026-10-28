.class public abstract Llb1/u3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/u3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 \"\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/design/models/items/LabeledProgressBarModel;",
        "Lhz0/c;",
        "m",
        "(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;",
        "Lcom/whoop/design/models/items/LabeledProgressBarStyle;",
        "style",
        "Ly81/f;",
        "f",
        "(Lcom/whoop/design/models/items/LabeledProgressBarStyle;)Ly81/f;",
        "Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "Ly01/f;",
        "o",
        "(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;",
        "Lcom/whoop/design/models/items/GoalProgressCardModel;",
        "La61/e;",
        "p",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;",
        "model",
        "Ljb1/a;",
        "reducer",
        "Lk71/p;",
        "n",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;Ljb1/a;)Lk71/p;",
        "",
        "La61/f;",
        "q",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/util/List;",
        "Lx11/c;",
        "k",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Lx11/c;",
        "",
        "l",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/lang/Object;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "progressCardMapper",
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

    new-instance v0, Llb1/j3;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/u3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/u3;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;
    .locals 0

    invoke-static {p0}, Llb1/u3;->j(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;
    .locals 0

    invoke-static {p0}, Llb1/u3;->h(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;
    .locals 0

    invoke-static {p0}, Llb1/u3;->i(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/u3;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/items/LabeledProgressBarStyle;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/u3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/LabeledProgressBarModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u3$b;

    invoke-direct {v3, v0}, Llb1/u3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ProgressBreakdownModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u3$c;

    invoke-direct {v3, v0}, Llb1/u3$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/GoalProgressCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/u3$d;

    invoke-direct {v2, v0}, Llb1/u3$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u3;->m(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u3;->o(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u3;->p(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/GoalProgressCardModel;)Lx11/c;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-nez p0, :cond_3

    sget-object p0, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    invoke-static {}, Lcom/whoop/util/TrendKey;->values()[Lcom/whoop/util/TrendKey;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v0, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object p0, v0

    :cond_3
    :goto_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lx11/c;

    invoke-direct {v2, p0, v0, v1}, Lx11/c;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v2

    :cond_4
    return-object v0
.end method

.method private static final l(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/lang/Object;
    .locals 1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final m(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getLeftLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getLeftSublabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getRightLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getRightSublabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getProgress()F

    move-result v0

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v0, v6, v7}, Le93/b;->m(FFF)F

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->getStyle()Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    move-result-object p0

    invoke-static {p0}, Llb1/u3;->f(Lcom/whoop/design/models/items/LabeledProgressBarStyle;)Ly81/f;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/design/models/items/GoalProgressCardModel;Ljb1/a;)Lk71/p;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getProgressBreakdown()Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Lk71/p;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getUpperLeftDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getUpperRightDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->copy$default(Lcom/whoop/design/models/items/ProgressBreakdownModel;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    invoke-direct {p0, v10, v11, p1}, Lk71/p;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lm91/u;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final o(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getTotalProgressSteps()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getCurrentProgressSteps()I

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/s3;->b(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/s3;->a(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getUpperLeftDisplay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    new-instance v6, Ly01/g;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v7

    invoke-static {v7}, Llb1/s3;->c(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;

    move-result-object v7

    invoke-direct {v6, v0, v7}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    goto :goto_1

    :cond_1
    move-object v6, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getUpperRightDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ly01/g;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getUpperRightDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v8, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v0, v7, v8}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    move-object v7, v0

    goto :goto_3

    :cond_3
    :goto_2
    move-object v7, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getLowerLeftDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_5

    new-instance v1, Ly01/g;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object p0

    invoke-static {p0}, Llb1/s3;->c(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    :cond_5
    move-object v8, v1

    new-instance v1, Ly01/f;

    invoke-direct/range {v1 .. v8}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;)V

    return-object v1
.end method

.method public static final p(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;
    .locals 39

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v3

    invoke-static {v0}, Llb1/u3;->l(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    :cond_0
    move-object v6, v4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getProgressDisplay()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v9, v4

    goto :goto_0

    :cond_1
    move-object v9, v1

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getSevenDayVow()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v10, v4

    goto :goto_1

    :cond_2
    move-object v10, v1

    :goto_1
    invoke-static {v0, v3}, Llb1/u3;->n(Lcom/whoop/design/models/items/GoalProgressCardModel;Ljb1/a;)Lk71/p;

    move-result-object v12

    invoke-static {v0}, Llb1/u3;->q(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getCheckmarkStyle()Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {}, Lk71/c;->values()[Lk71/c;

    move-result-object v5

    array-length v7, v5

    move v11, v4

    :goto_2
    if-ge v11, v7, :cond_4

    aget-object v14, v5, v11

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    move-object v14, v1

    :goto_3
    move-object v11, v14

    goto :goto_4

    :cond_5
    move-object v11, v1

    :goto_4
    invoke-static {v0}, Llb1/u3;->k(Lcom/whoop/design/models/items/GoalProgressCardModel;)Lx11/c;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getCurrentStep()I

    move-result v17

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTotalSteps()I

    move-result v16

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTextDisplay()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v0, v1, :cond_6

    goto :goto_5

    :cond_6
    move v2, v4

    :goto_5
    sget-object v35, Lp01/h;->STEPS:Lp01/h;

    new-instance v15, Lp01/b;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v22

    const v37, 0xbffb4

    const/16 v38, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v15 .. v38}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_6
    move-object v1, v15

    goto :goto_8

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v15, Lp01/b;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getPercentage()D

    move-result-wide v16

    const/16 v1, 0x64

    int-to-double v2, v1

    div-double v1, v16, v2

    double-to-float v1, v1

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getTextDisplay()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v0

    sget-object v2, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v0, v2, :cond_8

    const/4 v2, 0x1

    goto :goto_7

    :cond_8
    move v2, v4

    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v22

    sget-object v35, Lp01/h;->PERCENTAGE:Lp01/h;

    const v37, 0xbffb3

    const/16 v38, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v36, 0x0

    move/from16 v18, v1

    invoke-direct/range {v15 .. v38}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_9
    :goto_8
    move-object v15, v1

    new-instance v5, La61/e;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v17}, La61/e;-><init>(Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method private static final q(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/GoalProgressCardModel;",
            ")",
            "Ljava/util/List<",
            "La61/f;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getProgressBreakdown()Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressMetadata()Lcom/whoop/design/models/items/ProgressMetaDataModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProgressMetaDataModel;->getProgressSubtasks()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

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

    check-cast v2, Lcom/whoop/design/models/items/ProgressSubtaskModel;

    new-instance v3, La61/f;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ProgressSubtaskModel;->getTaskValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ProgressSubtaskModel;->getTaskIcon()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ProgressSubtaskModel;->getTaskName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalProgressCardModel;->getProgressBreakdown()Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v6

    invoke-static {v6}, Llb1/s3;->d(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;

    move-result-object v6

    invoke-direct {v3, v4, v5, v2, v6}, La61/f;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
