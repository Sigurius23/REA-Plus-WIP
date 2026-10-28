.class public abstract Llb1/l3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lh01/a;",
        "cardType",
        "",
        "backgroundStyle",
        "k",
        "(Lh01/a;Ljava/lang/String;)Lh01/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "j",
        "()Llb1/y0;",
        "notificationCardMapper",
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

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/l3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;)Lh01/q;
    .locals 0

    invoke-static {p0}, Llb1/l3;->m(Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;)Lh01/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;)Lh01/q;
    .locals 0

    invoke-static {p0}, Llb1/l3;->n(Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;)Lh01/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/cards/ActionCardModel;)Lf01/d;
    .locals 0

    invoke-static {p0}, Llb1/l3;->r(Lcom/whoop/design/models/cards/ActionCardModel;)Lf01/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l3;->t(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/cards/TextOnlyCardModel;)Lh01/a0;
    .locals 0

    invoke-static {p0}, Llb1/l3;->p(Lcom/whoop/design/models/cards/TextOnlyCardModel;)Lh01/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l3;->l(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l3;->o(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/design/models/cards/TextAndImageCardModel;)Lh01/t;
    .locals 0

    invoke-static {p0}, Llb1/l3;->q(Lcom/whoop/design/models/cards/TextAndImageCardModel;)Lh01/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/design/models/items/EntryPointModel;)Lc41/w1;
    .locals 0

    invoke-static {p0}, Llb1/l3;->s(Lcom/whoop/design/models/items/EntryPointModel;)Lc41/w1;

    move-result-object p0

    return-object p0
.end method

.method public static final j()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/l3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final k(Lh01/a;Ljava/lang/String;)Lh01/a;
    .locals 6

    if-eqz p1, :cond_3

    sget-object v0, Lf01/q1;->NONE:Lf01/q1;

    invoke-static {}, Lf01/q1;->values()[Lf01/q1;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v4

    :goto_2
    sget-object p1, Lf01/q1;->ONBOARDING:Lf01/q1;

    if-ne v0, p1, :cond_3

    sget-object p1, Lh01/a;->ONBOARDING:Lh01/a;

    if-ne p0, p1, :cond_3

    sget-object p0, Lh01/a;->ONBOARDING_BG_GRADIENT:Lh01/a;

    :cond_3
    return-object p0
.end method

.method private static final l(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/l3$a;

    invoke-direct {v3, v0}, Llb1/l3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/l3$b;

    invoke-direct {v3, v0}, Llb1/l3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/l3$c;

    invoke-direct {v3, v0}, Llb1/l3$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/l3$d;

    invoke-direct {v3, v0}, Llb1/l3$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/ActionCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/l3$e;

    invoke-direct {v3, v0}, Llb1/l3$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/j3;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Llb1/j3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/EntryPointModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/l3$f;

    invoke-direct {v2, v0}, Llb1/l3$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;)Lh01/q;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCta()Lkd1/l;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lkd1/l;->NONE:Lkd1/l;

    :cond_0
    move-object v9, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v6, "toUpperCase(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCardType()Lh01/a;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Llb1/l3;->k(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getShowHighlight()Z

    move-result v14

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v7

    :goto_1
    const/16 v13, 0x14

    if-le v6, v13, :cond_3

    const/4 v7, 0x1

    :cond_3
    move/from16 v18, v7

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTitleIconUrl()Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_4

    new-instance v19, Lkd1/o$c;

    const/16 v24, 0xe

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v19

    goto :goto_2

    :cond_4
    move-object/from16 v20, v3

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v19

    new-instance v1, Lh01/q;

    const v23, 0x186830

    const/16 v24, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v3, v0

    invoke-direct/range {v1 .. v24}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;)Lh01/q;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCta()Lkd1/l;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v3, Lkd1/l;->NONE:Lkd1/l;

    :cond_0
    move-object v9, v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "toUpperCase(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, v6

    :goto_0
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    move-object v11, v6

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getBody()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCardType()Lh01/a;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Llb1/l3;->k(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getShowHighlight()Z

    move-result v14

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v7

    const/4 v13, 0x0

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    goto :goto_2

    :cond_3
    move v7, v13

    :goto_2
    const/16 v15, 0x14

    if-le v7, v15, :cond_4

    const/4 v13, 0x1

    :cond_4
    move/from16 v18, v13

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTitleIconUrl()Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_5

    new-instance v19, Lkd1/o$c;

    const/16 v24, 0xe

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v19

    goto :goto_3

    :cond_5
    move-object/from16 v20, v6

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getRightItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    :cond_6
    move-object/from16 v22, v6

    new-instance v1, Lh01/q;

    const v23, 0x86830

    const/16 v24, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v1 .. v24}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final o(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/design/models/cards/TextOnlyCardModel;)Lh01/a0;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getCardType()Lh01/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Llb1/l3;->k(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getShowHighlight()Z

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTitleIconUrl()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_0

    new-instance v12, Lkd1/o$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    new-instance v1, Lh01/a0;

    const/16 v13, 0x30

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v14}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final q(Lcom/whoop/design/models/cards/TextAndImageCardModel;)Lh01/t;
    .locals 21

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getCardType()Lh01/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Llb1/l3;->k(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getShowHighlight()Z

    move-result v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTitleIconUrl()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_0

    new-instance v14, Lkd1/o$c;

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    :goto_0
    new-instance v1, Lh01/t;

    const/16 v15, 0x230

    const/16 v16, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v16}, Lh01/t;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final r(Lcom/whoop/design/models/cards/ActionCardModel;)Lf01/d;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getCtaIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v7, "SLEEP_PROCESS_NOW"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lf01/r;->SLEEP_PROCESS_NOW:Lf01/r;

    :cond_1
    move-object v7, v1

    new-instance v8, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ActionCardModel;->getShowHighlight()Z

    move-result v10

    sget-object v9, Lh01/a;->DEFAULT:Lh01/a;

    new-instance v1, Lf01/d;

    invoke-direct/range {v1 .. v10}, Lf01/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lf01/r;Lkd1/o;Lh01/a;Z)V

    return-object v1
.end method

.method private static final s(Lcom/whoop/design/models/items/EntryPointModel;)Lc41/w1;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getCallToAction()Lcom/whoop/design/models/items/EntryPointModelCta;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/EntryPointModelCta;->getStyle()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lh01/a;->DEFAULT:Lh01/a;

    invoke-static {}, Lh01/a;->values()[Lh01/a;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v9

    :goto_2
    sget-object v2, Lh01/a;->PROMO_LINEAR:Lh01/a;

    if-ne v3, v2, :cond_3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v2

    const-string v4, "PROMO_LINEAR"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v3, Lh01/a;->PROMO_LINEAR_TRANSPARENCY:Lh01/a;

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getBody()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getEndIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getCallToAction()Lcom/whoop/design/models/items/EntryPointModelCta;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/EntryPointModelCta;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getCallToAction()Lcom/whoop/design/models/items/EntryPointModelCta;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/EntryPointModelCta;->getButtonIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lf01/q1;->NONE:Lf01/q1;

    invoke-static {}, Lf01/q1;->values()[Lf01/q1;

    move-result-object v5

    array-length v7, v5

    :goto_3
    if-ge v6, v7, :cond_5

    aget-object v9, v5, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    move-object v9, v8

    :goto_4
    if-nez v9, :cond_6

    move-object v15, v4

    goto :goto_5

    :cond_6
    move-object v15, v9

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_7

    :sswitch_0
    const-string v4, "ELEVATED"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    sget-object v3, Lh01/a;->ELEVATED:Lh01/a;

    :goto_6
    move-object/from16 v18, v3

    goto :goto_8

    :sswitch_1
    const-string v4, "HAL"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_7

    :cond_8
    sget-object v3, Lh01/a;->HAL:Lh01/a;

    goto :goto_6

    :sswitch_2
    const-string v4, "ONBOARDING_WITH_BORDER"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_7

    :cond_9
    sget-object v3, Lh01/a;->ONBOARDING_BG_GRADIENT:Lh01/a;

    goto :goto_6

    :sswitch_3
    const-string v4, "ADVANCED_LABS"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :goto_7
    goto :goto_6

    :cond_a
    sget-object v3, Lh01/a;->ADVANCED_LABS:Lh01/a;

    goto :goto_6

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    new-instance v19, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getImageUrl()Ljava/lang/String;

    move-result-object v20

    const/16 v24, 0xe

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v14, v19

    goto :goto_9

    :cond_b
    move-object v14, v8

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getNavigationTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object/from16 v20, v0

    goto :goto_a

    :cond_c
    move-object/from16 v20, v8

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EntryPointModel;->getAnalyticEvents()Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v8, Lc41/o1;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;->getView()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;->getCta()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;->getDismiss()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    invoke-direct {v8, v1, v2, v0}, Lc41/o1;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V

    :cond_d
    move-object/from16 v23, v8

    new-instance v9, Lc41/w1;

    invoke-direct/range {v9 .. v23}, Lc41/w1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lkd1/o;Lf01/q1;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lh01/a;Lcom/whoop/navigation/e;Lm91/u;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lc41/o1;)V

    return-object v9

    :sswitch_data_0
    .sparse-switch
        -0x41d3517d -> :sswitch_3
        -0x23365e5f -> :sswitch_2
        0x11673 -> :sswitch_1
        0x2ea3c7aa -> :sswitch_0
    .end sparse-switch
.end method

.method private static final t(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
