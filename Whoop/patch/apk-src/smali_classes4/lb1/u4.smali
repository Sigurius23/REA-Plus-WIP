.class public abstract Llb1/u4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/u4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/TitleSubTitleModel;",
        "Lsz0/k1;",
        "g",
        "(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "Lsz0/c0;",
        "f",
        "(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;",
        "",
        "name",
        "Lw3/k;",
        "defaultValue",
        "h",
        "(Ljava/lang/String;I)I",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "textMapper",
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

    new-instance v0, Llb1/m4;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/u4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;
    .locals 0

    invoke-static {p0}, Llb1/u4;->l(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/u4;->i(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;
    .locals 0

    invoke-static {p0}, Llb1/u4;->k(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 0

    invoke-static {p0}, Llb1/u4;->j(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/u4;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/TextColorGradient;->values()[Lcom/whoop/design/models/TextColorGradient;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v7, v2, v5

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    const/4 v0, -0x1

    if-nez v7, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    sget-object v2, Llb1/u4$a;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    :goto_2
    if-eq v2, v0, :cond_4

    const/4 v0, 0x1

    if-ne v2, v0, :cond_3

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v0

    move-object v9, v0

    goto :goto_3

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    const/4 v9, 0x0

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lb91/c;->B1:Lb91/c;

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v5

    array-length v7, v5

    move v8, v4

    :goto_4
    if-ge v8, v7, :cond_6

    aget-object v10, v5, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v10, 0x0

    :goto_5
    if-nez v10, :cond_7

    goto :goto_6

    :cond_7
    move-object v3, v10

    :goto_6
    if-eqz v9, :cond_8

    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_9

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getColor()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v7

    array-length v8, v7

    move v10, v4

    :goto_7
    if-ge v10, v8, :cond_a

    aget-object v11, v7, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_a
    const/4 v11, 0x0

    :goto_8
    if-nez v11, :cond_b

    move-object v0, v5

    goto :goto_9

    :cond_b
    move-object v0, v11

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getAlignment()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x5

    invoke-static {v5, v7}, Llb1/u4;->h(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getMaxLines()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_c

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-lez v10, :cond_c

    goto :goto_a

    :cond_c
    const/4 v8, 0x0

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getMinLines()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v11

    if-lez v11, :cond_d

    goto :goto_b

    :cond_d
    const/4 v10, 0x0

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getFillWidth()Z

    move-result v11

    invoke-virtual {v1}, Lcom/whoop/design/models/MarkdownTextModel;->getIconPosition()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    const-string v1, ""

    :cond_e
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v12, "toUpperCase(...)"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lsz0/y;->TRAILING:Lsz0/y;

    invoke-static {}, Lsz0/y;->values()[Lsz0/y;

    move-result-object v13

    array-length v14, v13

    :goto_c
    if-ge v4, v14, :cond_10

    aget-object v15, v13, v4

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object v6, v15

    goto :goto_d

    :cond_f
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_10
    const/4 v6, 0x0

    :goto_d
    if-nez v6, :cond_11

    goto :goto_e

    :cond_11
    move-object v12, v6

    :goto_e
    new-instance v1, Lsz0/c0;

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move v10, v11

    move-object v11, v12

    const/4 v12, 0x0

    move-object v4, v0

    invoke-direct/range {v1 .. v12}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final g(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getTitleColor()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_3

    sget-object v6, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v7

    array-length v8, v7

    move v9, v1

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

    :goto_2
    if-nez v6, :cond_4

    :cond_3
    sget-object v6, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getSubtitleColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v7, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v8

    array-length v9, v8

    move v10, v1

    :goto_3
    if-ge v10, v9, :cond_6

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move-object v11, v5

    :goto_4
    if-nez v11, :cond_7

    goto :goto_5

    :cond_7
    move-object v7, v11

    :goto_5
    if-nez v7, :cond_9

    :cond_8
    sget-object v7, Ly81/f;->WHITE_70:Ly81/f;

    :cond_9
    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getTitleStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v8

    array-length v9, v8

    move v10, v1

    :goto_6
    if-ge v10, v9, :cond_b

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_b
    move-object v11, v5

    :goto_7
    if-nez v11, :cond_d

    :cond_c
    sget-object v11, Lb91/c;->T2:Lb91/c;

    :cond_d
    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getSubtitleStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v8

    array-length v9, v8

    :goto_8
    if-ge v1, v9, :cond_f

    aget-object v10, v8, v1

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    goto :goto_9

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_f
    move-object v10, v5

    :goto_9
    if-nez v10, :cond_10

    goto :goto_b

    :cond_10
    :goto_a
    move-object v8, v10

    goto :goto_c

    :cond_11
    :goto_b
    sget-object v10, Lb91/c;->B1:Lb91/c;

    goto :goto_a

    :goto_c
    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getAlignment()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Llb1/u4;->h(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {p0}, Lcom/whoop/design/models/TitleSubTitleModel;->getTrailingButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object p0

    if-eqz p0, :cond_12

    invoke-static {p0}, Llb1/d4;->p(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object v5

    :cond_12
    move-object v12, v5

    new-instance v1, Lsz0/k1;

    const/4 v10, 0x0

    move-object v5, v6

    move-object v6, v7

    move-object v7, v11

    const/4 v11, 0x0

    const/16 v13, 0x300

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v14}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final h(Ljava/lang/String;I)I
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x2dcbf6e6

    if-eq v0, v1, :cond_5

    const v1, 0x7645c055

    if-eq v0, v1, :cond_3

    const v1, 0x7ab5101c

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "TRAILING"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p0, 0x6

    return p0

    :cond_3
    const-string v0, "CENTER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    const/4 p0, 0x3

    return p0

    :cond_5
    const-string v0, "LEADING"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_1

    :cond_6
    const/4 p0, 0x5

    return p0

    :cond_7
    :goto_1
    return p1
.end method

.method private static final i(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m4;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/AnnotatedTextModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u4$b;

    invoke-direct {v3, v0}, Llb1/u4$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/m4;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Llb1/m4;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/u4$c;

    invoke-direct {v3, v0}, Llb1/u4$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/m4;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Llb1/m4;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/MarkdownTextModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/u4$d;

    invoke-direct {v2, v0}, Llb1/u4$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnnotatedTextModel;->getText()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final k(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u4;->g(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object p0

    return-object p0
.end method
