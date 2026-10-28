.class public abstract Lkx1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "i",
        "()Ljb1/a;",
        "membershipManagementDesignItemReducer",
        "membership_release"
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

    new-instance v0, Lkm2/e;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lkm2/e;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lkx1/c;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;)Ljx1/q;
    .locals 0

    invoke-static {p0}, Lkx1/c;->l(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;)Ljx1/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;)Ljx1/m;
    .locals 0

    invoke-static {p0}, Lkx1/c;->m(Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;)Ljx1/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;)Ljx1/s;
    .locals 0

    invoke-static {p0}, Lkx1/c;->n(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;)Ljx1/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;)Ljx1/i;
    .locals 0

    invoke-static {p0}, Lkx1/c;->o(Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;)Ljx1/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkx1/c;->k(Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;)Ljx1/y;
    .locals 0

    invoke-static {p0}, Lkx1/c;->p(Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;)Ljx1/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkx1/c;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;)Ljx1/v;
    .locals 0

    invoke-static {p0}, Lkx1/c;->q(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;)Ljx1/v;

    move-result-object p0

    return-object p0
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Lkx1/c;->a:Ljb1/a;

    return-object v0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkx1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkx1/a;-><init>(Ljb1/b;I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkm2/e;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lkm2/e;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$c;

    invoke-direct {v3, v0}, Lkx1/c$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkm2/e;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lkm2/e;-><init>(I)V

    const-class v2, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$d;

    invoke-direct {v3, v0}, Lkx1/c$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkm2/e;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lkm2/e;-><init>(I)V

    const-class v2, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$e;

    invoke-direct {v3, v0}, Lkx1/c$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkx1/b;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lkx1/b;-><init>(I)V

    const-class v2, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$f;

    invoke-direct {v3, v0}, Lkx1/c$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkx1/b;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lkx1/b;-><init>(I)V

    const-class v2, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$g;

    invoke-direct {v3, v0}, Lkx1/c$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkx1/b;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lkx1/b;-><init>(I)V

    const-class v2, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkx1/c$h;

    invoke-direct {v3, v0}, Lkx1/c$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class p1, Ly71/o;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Lkx1/c$b;

    invoke-direct {v0}, Lkx1/c$b;-><init>()V

    invoke-virtual {p0, p1, v0}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;)Ljx1/q;
    .locals 17

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getTierImage()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getProfilePhoto()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance v4, Lkd1/o$a;

    sget v0, Lgy0/a;->J1:I

    invoke-direct {v4, v0}, Lkd1/o$a;-><init>(I)V

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getMembershipInfo()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;

    new-instance v7, Ljx1/z;

    invoke-virtual {v6}, Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;->getSubtitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v8, v9, v6}, Ljx1/z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v5, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getDowngradeInfo()Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lkd1/o$c;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getFromMembership()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lkd1/o$c;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getToMembership()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getDaysLeft()Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;

    move-result-object v7

    if-eqz v7, :cond_3

    new-instance v11, Ljx1/h;

    invoke-virtual {v7}, Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;->getDays()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v11, v12, v7}, Ljx1/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const/4 v11, 0x0

    :goto_2
    new-instance v12, Ljx1/g;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-direct {v12, v7, v13}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v7

    if-eqz v7, :cond_4

    new-instance v13, Ljx1/g;

    invoke-virtual {v7}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct {v13, v14, v7}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    goto :goto_3

    :cond_4
    const/4 v13, 0x0

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->getTrackingTier()Ljava/lang/String;

    move-result-object v14

    new-instance v7, Ljx1/j;

    invoke-direct/range {v7 .. v14}, Ljx1/j;-><init>(Ljava/lang/String;Lkd1/o;Lkd1/o;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getSwitchBillingInfo()Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v8, Ljx1/g0;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getSubtitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getPrice()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljx1/g;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    new-instance v14, Ljx1/g;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-direct {v14, v15, v0}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-direct/range {v8 .. v14}, Ljx1/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljx1/g;Ljx1/g;)V

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getAdditionalInfo()Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v9, Ljx1/a;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v10, v0}, Ljx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getInactive()Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getSubtitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getDaysLeft()Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;

    move-result-object v10

    if-eqz v10, :cond_8

    new-instance v13, Ljx1/h;

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;->getDays()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v13, v14, v10}, Ljx1/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    const/4 v13, 0x0

    :goto_7
    new-instance v14, Ljx1/g;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v15

    invoke-direct {v14, v10, v15}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v10

    if-eqz v10, :cond_9

    new-instance v15, Ljx1/g;

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-direct {v15, v6, v10}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    :goto_8
    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->getTrackingTier()Ljava/lang/String;

    move-result-object v16

    new-instance v10, Ljx1/k;

    invoke-direct/range {v10 .. v16}, Ljx1/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V

    goto :goto_9

    :cond_a
    const/4 v10, 0x0

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->PLAIN:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    invoke-static {}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->values()[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    move-result-object v6

    array-length v11, v6

    const/4 v12, 0x0

    :goto_a
    if-ge v12, v11, :cond_c

    aget-object v13, v6, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    move-object v6, v13

    goto :goto_b

    :cond_b
    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    :cond_c
    const/4 v6, 0x0

    :goto_b
    if-nez v6, :cond_d

    goto :goto_c

    :cond_d
    move-object v1, v6

    :goto_c
    sget-object v0, Lkx1/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    const/4 v1, 0x2

    if-eq v0, v1, :cond_10

    const/4 v1, 0x3

    if-eq v0, v1, :cond_f

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    sget-object v0, Ljx1/r;->PLAIN:Ljx1/r;

    goto :goto_d

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    sget-object v0, Ljx1/r;->LIFE:Ljx1/r;

    goto :goto_d

    :cond_10
    sget-object v0, Ljx1/r;->PEAK:Ljx1/r;

    goto :goto_d

    :cond_11
    sget-object v0, Ljx1/r;->ONE:Ljx1/r;

    :goto_d
    new-instance v1, Ljx1/q;

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v0

    invoke-direct/range {v1 .. v10}, Ljx1/q;-><init>(Ljava/lang/String;Lkd1/o;Lkd1/o;Ljava/util/List;Ljx1/j;Ljx1/g0;Ljx1/a;Ljx1/k;Ljx1/r;)V

    return-object v1
.end method

.method private static final m(Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;)Ljx1/m;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljx1/m;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;->getTierImage()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ljx1/m;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final n(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;)Ljx1/s;
    .locals 29

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getExpandedSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPrice()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getExpandedPrice()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getSummaryItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/membership/management/domain/models/items/CheckoutCardSummaryItemModel;

    new-instance v9, Ljx1/c;

    invoke-virtual {v8}, Lcom/whoop/membership/management/domain/models/items/CheckoutCardSummaryItemModel;->getLabel()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/membership/management/domain/models/items/CheckoutCardSummaryItemModel;->getAmount()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v10, v8}, Ljx1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPaymentOptions()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object v0

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Ljx1/d;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPaymentOptions()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPaymentOptions()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->getExistingLabel()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPaymentOptions()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->getAlternateLabel()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPaymentOptions()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->getZipCodeRequired()Z

    move-result v12

    invoke-direct {v0, v9, v10, v11, v12}, Ljx1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v10, v0

    move-object v0, v8

    goto :goto_1

    :cond_1
    move-object v0, v8

    move-object v10, v0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getExpandTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getExpandText()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljx1/g;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-direct {v12, v11, v13}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;

    move-result-object v11

    if-eqz v11, :cond_3

    new-instance v11, Ljx1/g;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;->getText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getSecondaryCta()Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v14

    if-nez v14, :cond_2

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v15

    :cond_2
    invoke-direct {v11, v13, v14}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    move-object v13, v11

    goto :goto_2

    :cond_3
    move-object v13, v0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getFooterText()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v11

    if-eqz v11, :cond_4

    new-instance v15, Ljx1/f;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;->getTitle()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;->getSubtitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;->getFeatures()Ljava/util/List;

    move-result-object v18

    new-instance v11, Ljx1/g;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;->getKeepCurrentMembershipText()Ljava/lang/String;

    move-result-object v0

    new-instance v22, Lcom/whoop/navigation/e;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v22

    invoke-direct {v11, v0, v1}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    new-instance v0, Ljx1/g;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getConfirmModal()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;->getConfirmText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getPrimaryCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v19

    move-object/from16 v22, v2

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    move-object/from16 v20, v0

    move-object/from16 v19, v11

    invoke-direct/range {v15 .. v20}, Ljx1/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljx1/g;Ljx1/g;)V

    move-object/from16 v19, v15

    goto :goto_3

    :cond_4
    move-object/from16 v22, v2

    const/16 v19, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljx1/t;->ONE:Ljx1/t;

    invoke-static {}, Ljx1/t;->values()[Ljx1/t;

    move-result-object v2

    array-length v11, v2

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v11, :cond_6

    aget-object v17, v2, v15

    move-object/from16 v18, v1

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, v18

    goto :goto_4

    :cond_6
    move-object/from16 v18, v1

    const/16 v17, 0x0

    :goto_5
    if-nez v17, :cond_7

    move-object/from16 v1, v18

    goto :goto_6

    :cond_7
    move-object/from16 v1, v17

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;->getCheckoutType()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljx1/u;->UPGRADE:Ljx1/u;

    invoke-static {}, Ljx1/u;->values()[Ljx1/u;

    move-result-object v11

    array-length v15, v11

    move-object/from16 v17, v1

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v15, :cond_9

    aget-object v16, v11, v1

    move/from16 v18, v1

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v1, v18, 0x1

    goto :goto_7

    :cond_9
    const/16 v16, 0x0

    :goto_8
    if-nez v16, :cond_a

    goto :goto_9

    :cond_a
    move-object/from16 v2, v16

    :goto_9
    new-instance v1, Ljx1/s;

    const/16 v20, 0x0

    const-string v23, ""

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v28, v22

    move-object/from16 v22, v2

    move-object/from16 v2, v28

    invoke-direct/range {v1 .. v23}, Ljx1/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final o(Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;)Ljx1/i;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljx1/i;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;->getTierImage()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;->getText()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljx1/g;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;->getCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;->getCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;->getTrackingTier()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Ljx1/i;-><init>(Lkd1/o;Ljava/lang/String;Ljx1/g;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final p(Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;)Ljx1/y;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;->getTierImage()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;->getFeatures()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/membership/management/domain/models/items/MembershipFeatureModel;

    new-instance v4, Ljx1/w;

    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/MembershipFeatureModel;->getIcon()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/MembershipFeatureModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Ljx1/w;-><init>(Lgz0/m0;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;->getCta()Lcom/whoop/membership/management/domain/models/items/CtaModel;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    new-instance v4, Ljx1/g;

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/items/CtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-direct {v4, v5, v0}, Ljx1/g;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljx1/x;->ONE:Ljx1/x;

    invoke-static {}, Ljx1/x;->values()[Ljx1/x;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v3, v8

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, v3

    :goto_4
    new-instance p0, Ljx1/y;

    invoke-direct {p0, v1, v2, v4, v0}, Ljx1/y;-><init>(Lkd1/o;Ljava/util/List;Ljx1/g;Ljx1/x;)V

    return-object p0
.end method

.method private static final q(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;)Ljx1/v;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljx1/v;

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getPrice()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getPriceSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getSelected()Z

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getTrackingLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {p0}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v10

    invoke-direct/range {v1 .. v10}, Ljx1/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v1
.end method
