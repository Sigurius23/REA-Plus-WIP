.class public abstract Lvr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\"\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;",
        "Lwr0/e0;",
        "z",
        "(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel;",
        "Lwr0/b0;",
        "y",
        "(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;",
        "Lcom/whoop/communitymoments/domain/models/MomentStackModel;",
        "Lwr0/x0;",
        "C",
        "(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;",
        "Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;",
        "Lwr0/h;",
        "D",
        "(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;",
        "Lwr0/n;",
        "v",
        "(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;",
        "Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;",
        "Lwr0/t;",
        "w",
        "(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;",
        "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;",
        "Lwr0/k0;",
        "A",
        "(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "u",
        "()Ljb1/a;",
        "communityMomentsDesignItemReducer",
        "community-moments_release"
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

    new-instance v0, Lvo1/s;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lvr0/a;->a:Ljb1/a;

    return-void
.end method

.method private static final A(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;
    .locals 12

    new-instance v0, Lvo1/s;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v3

    :goto_0
    if-eqz v6, :cond_1

    new-instance v5, Lkd1/o$c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getPhotoRevealFraction()F

    move-result v1

    const/4 v4, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, v4, v6}, Le93/b;->m(FFF)F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    move-object v6, v3

    move-object v3, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0, v7}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getHeaderLeadingButton()Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v7, Lwr0/l0;

    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;->getIcon()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    invoke-static {v8, v6, v9, v6}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v6

    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;->getAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    invoke-direct {v7, v6, v1}, Lwr0/l0;-><init>(ILcom/whoop/navigation/models/GenericInteraction;)V

    move-object v6, v7

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getHeaderTrailingItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getFooterOverlayItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getAchievementBackgroundStyle()Lcom/whoop/design/models/AchievementsBackgroundStyle;

    move-result-object v9

    new-instance v1, Lwr0/k0;

    invoke-direct/range {v1 .. v9}, Lwr0/k0;-><init>(Ljava/lang/String;Lkd1/o;FLjava/util/List;Lwr0/l0;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;)V

    return-object v1
.end method

.method private static final B(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentStackModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentStackModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentStackModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v3}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    if-eqz v3, :cond_2

    invoke-static {v3}, Lvr0/a;->y(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;

    move-result-object v5

    :cond_2
    if-eqz v5, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p0, Lwr0/x0;

    invoke-direct {p0, v0, v1, v2}, Lwr0/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final D(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;
    .locals 3

    new-instance v0, Lwr0/h;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;->getScope()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lwr0/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->m(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->l(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->s(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->p(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;
    .locals 0

    invoke-static {p0}, Lvr0/a;->r(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->q(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->x(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->t(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvr0/a;->B(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;
    .locals 0

    invoke-static {p0}, Lvr0/a;->o(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;
    .locals 0

    invoke-static {p0}, Lvr0/a;->n(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvo1/s;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvo1/s;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$a;

    invoke-direct {v3, v0}, Lvr0/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$b;

    invoke-direct {v3, v0}, Lvr0/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$c;

    invoke-direct {v3, v0}, Lvr0/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/MomentStackModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$d;

    invoke-direct {v3, v0}, Lvr0/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$e;

    invoke-direct {v3, v0}, Lvr0/a$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvr0/a$f;

    invoke-direct {v3, v0}, Lvr0/a$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvo1/s;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lvo1/s;-><init>(I)V

    const-class v2, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lvr0/a$g;

    invoke-direct {v2, v0}, Lvr0/a$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->v(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->w(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->y(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->C(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->D(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->A(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvr0/a;->z(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final u()Ljb1/a;
    .locals 1

    sget-object v0, Lvr0/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final v(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->PENCIL:Lgz0/m0;

    invoke-static {v0, v1}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getContentDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    if-eqz v6, :cond_1

    new-instance v5, Lkd1/o$c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getMenu()Lcom/whoop/design/models/items/FabMenuModel;

    move-result-object v0

    invoke-static {v0}, Llb1/p1;->f(Lcom/whoop/design/models/items/FabMenuModel;)Lvy0/d0;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getStyle()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->CONTAINED:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    :cond_2
    move-object v7, p0

    new-instance v2, Lwr0/n;

    invoke-direct/range {v2 .. v7}, Lwr0/n;-><init>(Lgz0/m0;Ljava/lang/String;Lkd1/o;Lvy0/d0;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;)V

    return-object v2
.end method

.method private static final w(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;
    .locals 20

    new-instance v0, Lvo1/s;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getLeading()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lny0/o;

    sget-object v8, Lny0/q$b;->f:Lny0/q$b;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getSaveIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {v0, v1}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result v9

    const/16 v18, 0x3dc

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v7 .. v19}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getSaveContentDescription()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v8, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getSubmitInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v9

    new-instance v1, Lwr0/t;

    const-string v5, ""

    invoke-direct/range {v1 .. v9}, Lwr0/t;-><init>(Ljava/lang/String;Lm91/u;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lny0/o;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method private static final x(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getFillMode()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;->FIT_CONTENT:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    :cond_0
    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v3

    :goto_0
    if-eqz v6, :cond_2

    new-instance v5, Lkd1/o$c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getDateBadge()Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v4, Lwr0/v;

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;->getDateDay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;->getDateMonth()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v4, v6, v0}, Lwr0/v;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto :goto_2

    :cond_3
    move-object v4, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getProfile()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_3

    :cond_4
    move-object v7, v3

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;->getAvatar()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5

    move-object v11, v8

    goto :goto_4

    :cond_5
    move-object v11, v3

    :goto_4
    if-eqz v11, :cond_6

    new-instance v10, Lkd1/o$c;

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_6
    move-object v10, v3

    :goto_5
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;->getAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    new-instance v8, Lwr0/a0;

    invoke-direct {v8, v6, v7, v10, v0}, Lwr0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;)V

    goto :goto_6

    :cond_7
    move-object v8, v3

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getBadge()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v6, Lwr0/u;

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v6, v0}, Lwr0/u;-><init>(Lcom/whoop/design/util/TextResource;)V

    goto :goto_7

    :cond_8
    move-object v6, v3

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getFooter()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->getIconUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_9

    move-object v11, v7

    goto :goto_8

    :cond_9
    move-object v11, v3

    :goto_8
    if-eqz v11, :cond_a

    new-instance v10, Lkd1/o$c;

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v10

    goto :goto_9

    :cond_a
    move-object v12, v3

    :goto_9
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->getTitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v13, v7

    goto :goto_a

    :cond_b
    move-object v13, v3

    :goto_a
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v14, v7

    goto :goto_b

    :cond_c
    move-object v14, v3

    :goto_b
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->getTitleTypography()Lb91/c;

    move-result-object v7

    if-eqz v7, :cond_d

    sget-object v9, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v9, v7}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v7

    move-object v15, v7

    goto :goto_c

    :cond_d
    move-object v15, v3

    :goto_c
    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->getSubtitleTypography()Lb91/c;

    move-result-object v0

    if-eqz v0, :cond_e

    sget-object v3, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v3, v0}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v3

    :cond_e
    move-object/from16 v16, v3

    new-instance v11, Lwr0/w;

    invoke-direct/range {v11 .. v16}, Lwr0/w;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/a;Lb91/a;)V

    move-object v7, v11

    goto :goto_d

    :cond_f
    move-object v7, v3

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    move-object v3, v5

    move-object v5, v8

    move-object v8, v0

    new-instance v0, Lwr0/b0;

    invoke-direct/range {v0 .. v8}, Lwr0/b0;-><init>(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Lkd1/o;Lwr0/v;Lwr0/a0;Lwr0/u;Lwr0/w;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0
.end method

.method private static final z(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;->getScoreGauge()Lcom/whoop/design/models/items/ScoreGaugeModel;

    move-result-object v0

    invoke-static {v0}, Llb1/u1;->r(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;->getBarStyles()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    check-cast p0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/LegendStyle;

    invoke-static {v5}, Llb1/r2;->a(Lcom/whoop/design/models/LegendStyle;)Ly81/f;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object v5, v4

    move-object v4, v0

    new-instance v0, Lwr0/e0;

    invoke-direct/range {v0 .. v5}, Lwr0/e0;-><init>(Ljava/lang/String;Lj81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v0
.end method
