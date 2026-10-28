.class public abstract Llb1/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000f\u0010\u0008\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;",
        "Lj51/g;",
        "i",
        "(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "Lsz0/c0;",
        "h",
        "(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;",
        "c",
        "()Lsz0/c0;",
        "",
        "color",
        "Ly81/f;",
        "f",
        "(Ljava/lang/String;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "challengeProgressGaugeMapper",
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

    new-instance v0, Llb1/v;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;
    .locals 0

    invoke-static {p0}, Llb1/b0;->e(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b0;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c()Lsz0/c0;
    .locals 13

    new-instance v0, Lsz0/c0;

    sget-object v2, Lb91/c;->B1:Lb91/c;

    sget-object v3, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v11, 0x3f0

    const/4 v12, 0x0

    const-string v1, ""

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b0$a;

    invoke-direct {v2, v0}, Llb1/b0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/b0;->i(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Ly81/f;
    .locals 6

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x218263

    if-eq v1, v2, :cond_3

    const v2, 0x2182df

    if-eq v1, v2, :cond_2

    const v2, 0x4ebd409

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "WHITE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_2
    const-string v1, "GREY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_3
    const-string v1, "GRAY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_4
    :goto_0
    sget-object v0, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_7

    return-object v0

    :cond_7
    return-object v4

    :cond_8
    :goto_3
    sget-object p0, Ly81/f;->WHITE_70:Ly81/f;

    return-object p0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;
    .locals 13

    invoke-virtual {p0}, Lcom/whoop/design/models/MarkdownTextModel;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/MarkdownTextModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lb91/c;->B1:Lb91/c;

    invoke-static {}, Lb91/c;->values()[Lb91/c;

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

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v6

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/MarkdownTextModel;->getColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/b0;->f(Ljava/lang/String;)Ly81/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/MarkdownTextModel;->getAlignment()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "toUpperCase(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v5, 0x10cbb

    if-eq v4, v5, :cond_6

    const v5, 0x7645c055

    if-eq v4, v5, :cond_4

    const v5, 0x7ab5101c

    if-eq v4, v5, :cond_3

    goto :goto_4

    :cond_3
    const-string v4, "TRAILING"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_4
    const-string v4, "CENTER"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    const/4 v0, 0x3

    :goto_3
    move v4, v0

    goto :goto_5

    :cond_6
    const-string v4, "END"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_4
    const/4 v0, 0x5

    goto :goto_3

    :cond_7
    const/4 v0, 0x6

    goto :goto_3

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/MarkdownTextModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v5

    new-instance v0, Lsz0/c0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v12}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final i(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;
    .locals 36

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->getPercentValue()F

    move-result v0

    const/4 v2, 0x0

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {v0, v2, v3}, Le93/b;->m(FFF)F

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->getCenterSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview()Z

    move-result v33

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->getCenter()Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v3, Lj51/a;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;->getPrimaryText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;->getSecondaryText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lj51/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object v7, v2

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->getCenterImageUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_1

    new-instance v8, Lkd1/o$c;

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v8, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->getFooter()Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v3, Lgz0/m0;->TIME:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v9, v4

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v11, v4, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object v2, v11

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v2, :cond_4

    move-object v2, v3

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;->getPrimaryText()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v1

    invoke-static {v1}, Llb1/b0;->h(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;->getSecondaryText()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Llb1/b0;->h(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {}, Llb1/b0;->c()Lsz0/c0;

    move-result-object v0

    :goto_4
    new-instance v3, Lj51/b;

    invoke-direct {v3, v2, v1, v0}, Lj51/b;-><init>(Lgz0/m0;Lsz0/c0;Lsz0/c0;)V

    move-object v9, v3

    goto :goto_5

    :cond_6
    move-object v9, v2

    :goto_5
    new-instance v4, Lj51/g;

    const v34, 0x7fffe0

    const/16 v35, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v4 .. v35}, Lj51/g;-><init>(FLjava/lang/String;Lj51/a;Lkd1/o;Lj51/b;IFFJJJJFFFFIFIIJFFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
