.class public abstract Llb1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/s$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MiniCalloutModel;",
        "Lv21/c;",
        "g",
        "(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;",
        "Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;",
        "La01/a;",
        "f",
        "(Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;)La01/a;",
        "Lcom/whoop/design/models/items/RangeMeterModel;",
        "La01/n;",
        "h",
        "(Lcom/whoop/design/models/items/RangeMeterModel;)La01/n;",
        "Lcom/whoop/design/models/items/RangeSectionStyle;",
        "Ly81/f;",
        "i",
        "(Lcom/whoop/design/models/items/RangeSectionStyle;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "biomarkerCardMapper",
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

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/s;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/s;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/BiomarkerCardModel;)La01/h;
    .locals 0

    invoke-static {p0}, Llb1/s;->d(Lcom/whoop/design/models/items/BiomarkerCardModel;)La01/h;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/BiomarkerCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/s$b;

    invoke-direct {v2, v0}, Llb1/s$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/BiomarkerCardModel;)La01/h;
    .locals 18

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_3

    sget-object v6, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    move v9, v4

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move-object v10, v5

    :goto_1
    if-nez v10, :cond_2

    goto :goto_2

    :cond_2
    move-object v6, v10

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getValueText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getValue()Ljava/lang/String;

    move-result-object v0

    :cond_4
    move v7, v4

    move-object v4, v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getUnit()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-static {v8}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v8

    goto :goto_3

    :cond_5
    move-object v8, v5

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getStatusType()Ljava/lang/String;

    move-result-object v9

    sget-object v10, La01/m;->UNAVAILABLE:La01/m;

    invoke-static {}, La01/m;->values()[La01/m;

    move-result-object v11

    array-length v12, v11

    :goto_4
    if-ge v7, v12, :cond_7

    aget-object v13, v11, v7

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_7
    move-object v13, v5

    :goto_5
    if-nez v13, :cond_8

    move-object v7, v10

    goto :goto_6

    :cond_8
    move-object v7, v13

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getDisclaimer()Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-static {v9}, Llb1/s;->f(Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;)La01/a;

    move-result-object v9

    goto :goto_7

    :cond_9
    move-object v9, v5

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getCategoryIds()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getRangeMeter()Lcom/whoop/design/models/items/RangeMeterModel;

    move-result-object v13

    if-eqz v13, :cond_a

    invoke-static {v13}, Llb1/s;->h(Lcom/whoop/design/models/items/RangeMeterModel;)La01/n;

    move-result-object v13

    goto :goto_8

    :cond_a
    move-object v13, v5

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getLastRecording()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getMiniCallout()Lcom/whoop/design/models/items/MiniCalloutModel;

    move-result-object v15

    if-eqz v15, :cond_b

    invoke-static {v15}, Llb1/s;->g(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;

    move-result-object v15

    goto :goto_9

    :cond_b
    move-object v15, v5

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v16

    if-eqz v16, :cond_c

    invoke-static/range {v16 .. v16}, Lvb1/b;->t(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object v5

    :cond_c
    move-object/from16 v16, v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerCardModel;->getUseTileBackground()Z

    move-result v17

    new-instance v1, La01/h;

    move-object v5, v0

    invoke-direct/range {v1 .. v17}, La01/h;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;La01/m;Lhy0/c2;La01/a;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;La01/n;Ljava/lang/Integer;Lv21/c;Lj71/c;Z)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/s;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;)La01/a;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    sget-object v2, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move-object v1, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    move-object v1, v2

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;->getText()Ljava/lang/String;

    move-result-object p0

    new-instance v0, La01/a;

    invoke-direct {v0, v1, p0}, La01/a;-><init>(Lgz0/m0;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getStyle()Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/e3;->f(Lcom/whoop/design/models/items/InfoCalloutStyle;)Llb1/f3;

    move-result-object v0

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getCta()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {v0}, Llb1/f3;->b()Ly81/f;

    move-result-object v5

    invoke-virtual {v0}, Llb1/f3;->a()Ly81/f;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    new-instance v1, Lv21/c;

    invoke-direct/range {v1 .. v7}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;)V

    return-object v1
.end method

.method private static final h(Lcom/whoop/design/models/items/RangeMeterModel;)La01/n;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RangeMeterModel;->getSections()Ljava/util/List;

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

    check-cast v2, Lcom/whoop/design/models/items/RangeSectionModel;

    new-instance v3, La01/o;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/RangeSectionModel;->getStyle()Lcom/whoop/design/models/items/RangeSectionStyle;

    move-result-object v4

    invoke-static {v4}, Llb1/s;->i(Lcom/whoop/design/models/items/RangeSectionStyle;)Ly81/f;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/RangeSectionModel;->getStart()F

    move-result v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/RangeSectionModel;->getEnd()F

    move-result v2

    invoke-direct {v3, v4, v5, v2}, La01/o;-><init>(Ly81/e;FF)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/RangeMeterModel;->getIndicatorPercent()F

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RangeMeterModel;->getIndicatorImageUrl()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    new-instance v2, La01/n;

    invoke-direct {v2, v1, v0, p0}, La01/n;-><init>(Ljava/util/List;FLkd1/o;)V

    return-object v2
.end method

.method private static final i(Lcom/whoop/design/models/items/RangeSectionStyle;)Ly81/f;
    .locals 1

    sget-object v0, Llb1/s$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0
.end method
