.class public abstract Lmr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmr0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;",
        "Lnr0/g;",
        "n",
        "(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;",
        "Lnr0/j;",
        "m",
        "(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "k",
        "()Ljb1/a;",
        "communityHighlightsDesignItemReducer",
        "Lm91/p;",
        "b",
        "Lm91/p;",
        "l",
        "()Lm91/p;",
        "communityHighlightsDesignItemViewFactory",
        "community-highlights_release"
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

.field private static final b:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmd0/b;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lmr0/a;->a:Ljb1/a;

    new-instance v0, Lmd0/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lmr0/a;->b:Lm91/p;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr0/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;
    .locals 0

    invoke-static {p0}, Lmr0/a;->i(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr0/a;->j(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr0/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;
    .locals 0

    invoke-static {p0}, Lmr0/a;->h(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd0/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd0/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmr0/a$b;

    invoke-direct {v3, v0}, Lmr0/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmd0/b;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lmd0/b;-><init>(I)V

    const-class v2, Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmr0/a$c;

    invoke-direct {v2, v0}, Lmr0/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmr0/a;->m(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmr0/a;->n(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lnr0/j;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lnr0/h;

    invoke-direct {v3}, Lnr0/h;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lnr0/g;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lnr0/d;

    invoke-direct {v1}, Lnr0/d;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k()Ljb1/a;
    .locals 1

    sget-object v0, Lmr0/a;->a:Ljb1/a;

    return-object v0
.end method

.method public static final l()Lm91/p;
    .locals 1

    sget-object v0, Lmr0/a;->b:Lm91/p;

    return-object v0
.end method

.method private static final m(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;
    .locals 23

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getLabel()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;->getStyle()Llr0/b;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Llr0/b;->DARK:Llr0/b;

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getBadge()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;->getStyle()Llr0/a;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    sget-object v1, Llr0/a;->ACCENT:Llr0/a;

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getBadge()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getLabel()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    move-result-object v4

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;->getText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_1

    :cond_5
    move-object v4, v6

    :goto_1
    sget-object v7, Lmr0/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v7, v8

    if-ne v8, v3, :cond_f

    move-object v8, v7

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v8, v0

    if-ne v0, v3, :cond_e

    sget-object v8, Ly81/f;->BRAND_BLACK:Ly81/f;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getBadge()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v9, v0

    goto :goto_2

    :cond_6
    move-object v9, v6

    :goto_2
    sget-object v0, Lmr0/a$a;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v0, v10

    if-ne v10, v3, :cond_d

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-ne v0, v3, :cond_c

    sget-object v11, Ly81/f;->RECOVERY:Ly81/f;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_7

    new-instance v12, Lkd1/o$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_7
    sget-object v12, Lkd1/o$b;->b:Lkd1/o$b;

    :goto_3
    if-eqz v2, :cond_8

    move-object v13, v11

    goto :goto_4

    :cond_8
    sget-object v0, Ly81/f;->WHITE_10:Ly81/f;

    move-object v13, v0

    :goto_4
    if-eqz v2, :cond_9

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    :goto_5
    move v14, v0

    goto :goto_6

    :cond_9
    int-to-float v0, v3

    goto :goto_5

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getFooter()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v15, v0

    goto :goto_7

    :cond_a
    move-object v15, v6

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getFooter()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;->getAvatarUrl()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_b

    new-instance v16, Lkd1/o$c;

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_b
    move-object/from16 v16, v6

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v17

    move-object v6, v4

    new-instance v4, Lnr0/j;

    const/16 v18, 0x0

    move-object v10, v8

    invoke-direct/range {v4 .. v18}, Lnr0/j;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lkd1/o;Ly81/f;FLcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final n(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;
    .locals 2

    new-instance v0, Lnr0/g;

    invoke-virtual {p0}, Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;->getScope()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lnr0/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
