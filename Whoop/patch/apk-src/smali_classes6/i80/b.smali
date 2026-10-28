.class public abstract Li80/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a3\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00002\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00002\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0000*\u0008\u0012\u0004\u0012\u00020\n0\u0000H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\u0008\u0012\u0004\u0012\u00020\u00120\u0000H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "",
        "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;",
        "",
        "q0",
        "(Ljava/util/List;)Z",
        "",
        "maxCodes",
        "",
        "o0",
        "(I)Ljava/util/List;",
        "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
        "consents",
        "additionalConsents",
        "Lr90/j;",
        "m0",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "r0",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
        "Ld70/c;",
        "p0",
        "(Ljava/util/List;)Ld70/c;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "internalItemReducer",
        "b",
        "n0",
        "()Ljb1/a;",
        "activationFlowDesignItemReducer",
        "activation_release"
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

.field private static final b:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    sput-object v0, Li80/b;->a:Ljb1/a;

    new-instance v0, Li80/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Li80/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Li80/b;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;)Ld90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->b0(Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;)Ld90/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;)Ls90/h;
    .locals 0

    invoke-static {p0}, Li80/b;->j0(Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;)Ls90/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;)Lr80/f;
    .locals 0

    invoke-static {p0}, Li80/b;->Q(Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;)Lr80/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;)Lv90/r;
    .locals 0

    invoke-static {p0}, Li80/b;->K(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;)Lv90/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;)Ly80/d;
    .locals 0

    invoke-static {p0}, Li80/b;->J(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;)Ly80/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;)Lg90/g;
    .locals 0

    invoke-static {p0}, Li80/b;->U(Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;)Lg90/g;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li80/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Li80/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li80/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Li80/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$k;

    invoke-direct {v3, v0}, Li80/b$k;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$v;

    invoke-direct {v3, v0}, Li80/b$v;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$w;

    invoke-direct {v3, v0}, Li80/b$w;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$x;

    invoke-direct {v3, v0}, Li80/b$x;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$y;

    invoke-direct {v3, v0}, Li80/b$y;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$z;

    invoke-direct {v3, v0}, Li80/b$z;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$a0;

    invoke-direct {v3, v0}, Li80/b$a0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$b0;

    invoke-direct {v3, v0}, Li80/b$b0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$c0;

    invoke-direct {v3, v0}, Li80/b$c0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$a;

    invoke-direct {v3, v0}, Li80/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$b;

    invoke-direct {v3, v0}, Li80/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$c;

    invoke-direct {v3, v0}, Li80/b$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/GiftStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$d;

    invoke-direct {v3, v0}, Li80/b$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$e;

    invoke-direct {v3, v0}, Li80/b$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$f;

    invoke-direct {v3, v0}, Li80/b$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$g;

    invoke-direct {v3, v0}, Li80/b$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$h;

    invoke-direct {v3, v0}, Li80/b$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/GenderStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$i;

    invoke-direct {v3, v0}, Li80/b$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$j;

    invoke-direct {v3, v0}, Li80/b$j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$l;

    invoke-direct {v3, v0}, Li80/b$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhu1/g;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lhu1/g;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$m;

    invoke-direct {v3, v0}, Li80/b$m;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$n;

    invoke-direct {v3, v0}, Li80/b$n;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$o;

    invoke-direct {v3, v0}, Li80/b$o;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$p;

    invoke-direct {v3, v0}, Li80/b$p;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$q;

    invoke-direct {v3, v0}, Li80/b$q;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$r;

    invoke-direct {v3, v0}, Li80/b$r;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$s;

    invoke-direct {v3, v0}, Li80/b$s;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li80/b$t;

    invoke-direct {v3, v0}, Li80/b$t;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Li80/a;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Li80/a;-><init>(I)V

    const-class v2, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Li80/b$u;

    invoke-direct {v2, v0}, Li80/b$u;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;)Lw80/c;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v5, "toUpperCase(...)"

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "EMAIL"

    invoke-static {v7, v8, v5, v9}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v6

    :goto_0
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v6

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v10, "PASSWORD"

    invoke-static {v8, v9, v5, v10}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    :cond_4
    move-object v7, v6

    :goto_2
    check-cast v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v6

    :cond_5
    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getDisclaimerText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v8

    move-object v2, v1

    new-instance v1, Lw80/c;

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    invoke-direct/range {v1 .. v12}, Lw80/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lf70/q0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final J(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;)Ly80/d;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getLottieJson()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lv41/r0$c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv41/r0$c;->a(Ljava/lang/String;)Lv41/r0$c;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getLottieUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    new-instance v5, Lkd1/o$c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v5

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v8

    new-instance v2, Ly80/d;

    invoke-direct/range {v2 .. v8}, Ly80/d;-><init>(Lkd1/o;Lv41/r0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    return-object v2
.end method

.method private static final K(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;)Lv90/r;
    .locals 33

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getLineItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/activation/domain/models/steps/LineItem;

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getAmount()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v10, v7

    goto :goto_1

    :cond_0
    move-object v10, v6

    :goto_1
    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getStrikethroughAmount()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_1
    move-object v12, v6

    new-instance v7, Lv90/a;

    const/4 v9, 0x1

    invoke-direct/range {v7 .. v12}, Lv90/a;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getDiscount()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTax()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTotal()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v7

    filled-new-array {v2, v5, v7}, [Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/OrderItem;

    new-instance v8, Lv90/a;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getHighlight()Z

    move-result v10

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getAmount()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getStrikethroughAmount()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v13, v7

    goto :goto_3

    :cond_3
    move-object v13, v6

    :goto_3
    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v15}, Lv90/a;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v11, Lv90/b;

    invoke-direct {v11, v0, v3, v5}, Lv90/b;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    new-instance v10, Lv90/c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getExistingLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v6

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getAlternateLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    filled-new-array {v0, v2}, [Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v18}, Lv90/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPayload()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPromoCode()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getAcceptedPaymentTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;

    new-instance v3, Lp90/m;

    new-instance v16, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getImageUrl()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getAccessibilityName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lp90/m;-><init>(Lkd1/o;Ljava/lang/String;)V

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "toUpperCase(...)"

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "CARD_NUMBER"

    invoke-static {v4, v5, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_8
    move-object v2, v6

    :goto_6
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_9
    move-object v0, v6

    :goto_7
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v2, Lp90/k;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v7, "CARD_EXPIRATION_DATE"

    if-eqz v5, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v8, v9, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_c
    move-object v0, v6

    :goto_9
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v9

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v9, v12, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_a

    :cond_e
    move-object v8, v6

    :goto_a
    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_f
    move-object v5, v6

    :goto_b
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Lp90/k;

    invoke-direct {v7, v0, v5}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v12, "CARD_CVV"

    invoke-static {v8, v9, v3, v12}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_11
    move-object v5, v6

    :goto_c
    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_12
    move-object v0, v6

    :goto_d
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v5, Lp90/k;

    invoke-direct {v5, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v9

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "CARD_ZIP_CODE"

    invoke-static {v9, v12, v3, v4}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_f

    :cond_13
    const/4 v4, 0x2

    goto :goto_e

    :cond_14
    move-object v8, v6

    :goto_f
    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v8, :cond_15

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_15
    move-object v0, v6

    :goto_10
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v3, Lp90/k;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lp90/l;

    invoke-direct {v0, v2, v7, v5, v3}, Lp90/l;-><init>(Lp90/k;Lp90/k;Lp90/k;Lp90/k;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getErrorMessages()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getSecurityFooter()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getDisclaimerFooterMarkdown()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_11
    move/from16 v27, v2

    goto :goto_12

    :cond_16
    const/4 v2, 0x0

    goto :goto_11

    :goto_12
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getUpcycleCreditCardVariant()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_17

    sget-object v3, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->Companion:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;

    invoke-virtual {v3, v2}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;->fromValue(Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v6

    :cond_17
    move-object/from16 v29, v6

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getMembershipTier()Ljava/lang/String;

    move-result-object v28

    new-instance v9, Lv90/r;

    const v31, 0x106004

    const/16 v32, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v9 .. v32}, Lv90/r;-><init>(Lv90/c;Lv90/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lp90/l;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZZZLjava/lang/String;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private static final L(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)Lv90/g;
    .locals 32

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getLineItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/activation/domain/models/steps/LineItem;

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getAmount()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v10, v7

    goto :goto_1

    :cond_0
    move-object v10, v6

    :goto_1
    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/LineItem;->getStrikethroughAmount()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_1
    move-object v12, v6

    new-instance v7, Lv90/h;

    const/4 v9, 0x1

    invoke-direct/range {v7 .. v12}, Lv90/h;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getDiscount()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTax()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->getTotal()Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v7

    filled-new-array {v2, v5, v7}, [Lcom/whoop/activation/domain/models/steps/OrderItem;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/OrderItem;

    new-instance v8, Lv90/h;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getHighlight()Z

    move-result v10

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getAmount()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/OrderItem;->getStrikethroughAmount()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v13, v7

    goto :goto_3

    :cond_3
    move-object v13, v6

    :goto_3
    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v15}, Lv90/h;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v11, Lv90/i;

    invoke-direct {v11, v0, v3, v5}, Lv90/i;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    new-instance v10, Lv90/j;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getExistingLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v6

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getAlternateLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    filled-new-array {v0, v2}, [Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v18}, Lv90/j;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPayload()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPromoCode()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getAcceptedPaymentTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;

    new-instance v3, Lp90/m;

    new-instance v16, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getImageUrl()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getAccessibilityName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lp90/m;-><init>(Lkd1/o;Ljava/lang/String;)V

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "toUpperCase(...)"

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "CARD_NUMBER"

    invoke-static {v4, v5, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_8
    move-object v2, v6

    :goto_6
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_9
    move-object v0, v6

    :goto_7
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v2, Lp90/k;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v7, "CARD_EXPIRATION_DATE"

    if-eqz v5, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v8, v9, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_c
    move-object v0, v6

    :goto_9
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v9

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v9, v12, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_a

    :cond_e
    move-object v8, v6

    :goto_a
    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_f
    move-object v5, v6

    :goto_b
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Lp90/k;

    invoke-direct {v7, v0, v5}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v12, "CARD_CVV"

    invoke-static {v8, v9, v3, v12}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_11
    move-object v5, v6

    :goto_c
    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_12
    move-object v0, v6

    :goto_d
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v5, Lp90/k;

    invoke-direct {v5, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v9

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "CARD_ZIP_CODE"

    invoke-static {v9, v12, v3, v4}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_f

    :cond_13
    const/4 v4, 0x2

    goto :goto_e

    :cond_14
    move-object v8, v6

    :goto_f
    check-cast v8, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v8, :cond_15

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_15
    move-object v0, v6

    :goto_10
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v3, Lp90/k;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v6, v4, v6}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lp90/l;

    invoke-direct {v0, v2, v7, v5, v3}, Lp90/l;-><init>(Lp90/k;Lp90/k;Lp90/k;Lp90/k;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->getErrorMessages()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getSecurityFooter()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getDisclaimerFooterMarkdown()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->isTrialMember()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_11
    move/from16 v27, v2

    goto :goto_12

    :cond_16
    const/4 v2, 0x0

    goto :goto_11

    :goto_12
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->getMembershipTier()Ljava/lang/String;

    move-result-object v28

    new-instance v9, Lv90/g;

    const v30, 0x86004

    const/16 v31, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v9 .. v31}, Lv90/g;-><init>(Lv90/j;Lv90/i;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lp90/l;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private static final M(Lcom/whoop/activation/domain/models/steps/GiftStepModel;)Lf90/c;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf90/c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getPickerText()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getMaximumCodesAllowed()I

    move-result v0

    invoke-static {v0}, Li80/b;->o0(I)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/GiftStepModel;->getDisclaimerText()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v9, 0x40

    invoke-direct/range {v1 .. v10}, Lf90/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final N(Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;)Lu80/d;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lu80/d;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getSearchText()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v8

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v1 .. v8}, Lu80/d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final O(Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;)Lu80/d;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lu80/d;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getSearchText()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v8

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v1 .. v8}, Lu80/d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final P(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)Lh90/c;
    .locals 29

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li93/j;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightPoundsMinValue()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightPoundsMaxValue()I

    move-result v3

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Li93/h;-><init>(III)V

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    new-instance v5, Lh90/c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getImperialTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getMetricTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightFeetMinValue()I

    move-result v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightFeetMaxValue()I

    move-result v14

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightCentimetersMinValue()I

    move-result v15

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightCentimetersMaxValue()I

    move-result v16

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getFeetText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getInchesText()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getCentimetersText()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightPoundsMinValue()I

    move-result v20

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightPoundsMaxValue()I

    move-result v21

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightKilogramsMinValue()I

    move-result v22

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightKilogramsMaxValue()I

    move-result v23

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getPoundsText()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getKilogramsText()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getHeightCentimetersPreselectedValue()I

    move-result v26

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getWeightPoundsPreselectedValue()I

    move-result v27

    sget-object v28, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    invoke-direct/range {v5 .. v28}, Lh90/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V

    return-object v5
.end method

.method private static final Q(Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;)Lr80/f;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getTiles()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;->getSubtext()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;->getUpsellText()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;->getBillingFrequency()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr80/a;->values()[Lr80/a;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_2
    new-instance v1, Lr80/e;

    invoke-direct {v1, v5, v6, v7, v11}, Lr80/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr80/a;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getDisclaimerText()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->getTiles()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Li80/b;->q0(Ljava/util/List;)Z

    move-result v8

    new-instance v1, Lr80/f;

    const/4 v5, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lr80/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lr80/a;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final R(Lcom/whoop/activation/domain/models/steps/GenderStepModel;)Le90/h;
    .locals 22

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getGenderOptions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/GenderOptionsModel;

    new-instance v8, Le90/c;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/GenderOptionsModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/GenderOptionsModel;->getType()Ljava/lang/String;

    move-result-object v10

    const/16 v13, 0xc

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Le90/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;->getCta()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;->getCancelCta()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/GenderDialogInformation;->getBaselineOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/activation/domain/models/steps/GenderBaselineOptions;

    new-instance v16, Le90/a;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderBaselineOptions;->getText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/GenderBaselineOptions;->getType()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Le90/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v8, Le90/b;

    move-object v10, v8

    invoke-direct/range {v10 .. v15}, Le90/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    new-instance v1, Le90/h;

    const/16 v11, 0x130

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v4, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Le90/h;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Le90/b;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final S(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;)Lr90/g;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getSelectAllCtaTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getJumpCtaTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getAcceptCtaTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getConsents()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getAdditionalConsents()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Li80/b;->m0(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    new-instance v1, Lr90/g;

    const/16 v17, 0x7f00

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v18}, Lr90/g;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLc31/k;Ld70/g;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final T(Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;)Lx80/c;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx80/c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;->getBody()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lx80/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final U(Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;)Lg90/g;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;->getLearnMore()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    new-instance v7, Lkd1/o$c;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v2, v7

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    goto :goto_0

    :goto_1
    new-instance v1, Lg90/g;

    invoke-direct/range {v1 .. v6}, Lg90/g;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method private static final V(Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;)Lk90/c;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;->getTitleSize()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lk90/d;->SMALL:Lk90/d;

    invoke-static {}, Lk90/d;->values()[Lk90/d;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v3, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v7

    :goto_1
    if-nez v8, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, v8

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;->getSubtitleSize()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lk90/d;->SMALL:Lk90/d;

    invoke-static {}, Lk90/d;->values()[Lk90/d;

    move-result-object v6

    array-length v8, v6

    :goto_3
    if-ge v5, v8, :cond_4

    aget-object v9, v6, v5

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    move-object v9, v7

    :goto_4
    if-nez v9, :cond_5

    move-object v5, v1

    goto :goto_5

    :cond_5
    move-object v5, v9

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;->getAvatarUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v8, Lkd1/o$c;

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v8

    goto :goto_6

    :cond_6
    move-object v6, v7

    :goto_6
    new-instance v1, Lk90/c;

    invoke-direct/range {v1 .. v6}, Lk90/c;-><init>(Lcom/whoop/design/util/TextResource;Lk90/d;Lcom/whoop/design/util/TextResource;Lk90/d;Lkd1/o;)V

    return-object v1
.end method

.method private static final W(Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;)Lw90/c;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lw90/c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;->getAnimatedImageUrl()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lw90/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lc31/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final X(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;)Lm80/e;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "toUpperCase(...)"

    const-string v9, "EMAIL"

    invoke-static {v6, v7, v8, v9}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v5

    :goto_0
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v5

    :cond_2
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Li80/b;->p0(Ljava/util/List;)Ld70/c;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getDialogInfo()Lcom/whoop/activation/domain/models/EmailDialogInfo;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getMarketingOptInText()Ljava/lang/String;

    move-result-object v9

    move-object v2, v1

    new-instance v1, Lm80/e;

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lm80/e;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/c;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Z)V

    return-object v1
.end method

.method private static final Y(Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;)Lb90/g;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "toUpperCase(...)"

    const-string v9, "PASSWORD"

    invoke-static {v6, v7, v8, v9}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v5

    :goto_0
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v5

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getForgotPasswordText()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ld70/c;

    const/4 p0, 0x1

    invoke-direct {v10, v5, p0, v5}, Ld70/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Ld70/e;

    invoke-direct {v6, v5, p0, v5}, Ld70/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    new-instance v1, Lb90/g;

    const/16 v13, 0x620

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v1 .. v14}, Lb90/g;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/e;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Ld70/c;Lcom/whoop/design/util/TextResource;Lg80/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final Z(Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;)Lv80/c;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "toUpperCase(...)"

    const-string v9, "PASSWORD"

    invoke-static {v6, v7, v8, v9}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v5

    :goto_0
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v5

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getDisclaimerText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ld70/e;

    const/4 v2, 0x1

    invoke-direct {v8, v5, v2, v5}, Ld70/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getCtaText()Ljava/lang/String;

    move-result-object v9

    sget-object v2, Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;->Companion:Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations$Companion;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->getCtaDestination()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations$Companion;->toActivationFlowDestination(Ljava/lang/String;)Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;

    move-result-object v10

    move-object v2, v1

    new-instance v1, Lv80/c;

    sget-object v11, Lm83/y;->w:Lm83/y;

    const/4 v12, 0x1

    const/4 v13, 0x0

    move-object v5, v0

    invoke-direct/range {v1 .. v13}, Lv80/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ld70/e;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;Ljava/util/List;ZZ)V

    return-object v1
.end method

.method public static synthetic a(Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;)Lu80/d;
    .locals 0

    invoke-static {p0}, Li80/b;->N(Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;)Lu80/d;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;)Lt80/d;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt80/d;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->getBody()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lt80/d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public static synthetic b(Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;)Lu80/d;
    .locals 0

    invoke-static {p0}, Li80/b;->O(Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;)Lu80/d;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;)Ld90/c;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld90/c;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Ld90/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)Lv90/g;
    .locals 0

    invoke-static {p0}, Li80/b;->L(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)Lv90/g;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;)Lc90/b;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc90/b;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lc90/b;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public static synthetic d(Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;)Lt80/d;
    .locals 0

    invoke-static {p0}, Li80/b;->a0(Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;)Lt80/d;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;)Lu90/c;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v3, v2, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;

    if-eqz v3, :cond_1

    new-instance v3, Ll32/b;

    check-cast v2, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;

    invoke-virtual {v2}, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;->getUpdatePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v2, v5}, Ll32/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v3, Li80/b;->a:Ljb1/a;

    invoke-virtual {v3, v2}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lu90/c;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, v1, v3, p0}, Lu90/c;-><init>(Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic e(Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;)Lv90/v;
    .locals 0

    invoke-static {p0}, Li80/b;->k0(Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;)Lv90/v;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;)Lm90/c;
    .locals 25

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "toUpperCase(...)"

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "FIRST_NAME"

    invoke-static {v5, v6, v3, v7}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "LAST_NAME"

    invoke-static {v6, v7, v3, v8}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_3
    move-object v5, v4

    :goto_1
    check-cast v5, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "USERNAME"

    invoke-static {v7, v8, v3, v9}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_5
    move-object v6, v4

    :goto_2
    check-cast v6, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    new-instance v7, Lm90/c;

    new-instance v8, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v10

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    move-object v0, v4

    :goto_3
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_4

    :cond_7
    move-object v12, v4

    :goto_4
    const/4 v0, 0x0

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->isReadOnly()Z

    move-result v2

    move v13, v2

    goto :goto_5

    :cond_8
    move v13, v0

    :goto_5
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_9
    move-object v2, v4

    :goto_6
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    goto :goto_7

    :cond_a
    move-object v15, v4

    :goto_7
    if-eqz v5, :cond_b

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->isReadOnly()Z

    move-result v2

    move/from16 v16, v2

    goto :goto_8

    :cond_b
    move/from16 v16, v0

    :goto_8
    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_c
    move-object v2, v4

    :goto_9
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v4

    :cond_d
    move-object/from16 v18, v4

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->isReadOnly()Z

    move-result v0

    :cond_e
    move/from16 v19, v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v20

    const/16 v23, 0x6000

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v7 .. v24}, Lm90/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static synthetic f(Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;)Lp90/j;
    .locals 0

    invoke-static {p0}, Li80/b;->h0(Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;)Lp90/j;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;)Ls80/d;
    .locals 17

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getAgeLimit()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whoop/ui/f;->k()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-static {v0, v2}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getMaxAgeLimit()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/whoop/ui/f;->k()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDate;)J

    move-result-wide v7

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDate;)J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v13

    new-instance v11, Li93/j;

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v0

    const/4 v2, 0x1

    invoke-direct {v11, v1, v0, v2}, Li93/h;-><init>(III)V

    new-instance v3, Ls80/d;

    const/16 v15, 0x140

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v16}, Ls80/d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;JJLi93/j;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public static synthetic g(Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;)Lu90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->d0(Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;)Lu90/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;)Ln90/e;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln90/e;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;->getIcons()Ljava/util/List;

    move-result-object v5

    new-instance v6, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Ln90/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic h(Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;)Lx80/c;
    .locals 0

    invoke-static {p0}, Li80/b;->T(Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;)Lx80/c;

    move-result-object p0

    return-object p0
.end method

.method private static final h0(Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;)Lp90/j;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getInfoCalloutTile()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    new-instance v5, Li80/a;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Li80/a;-><init>(I)V

    invoke-static {v5}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    const-string v5, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lc41/p2;

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, v4

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getAcceptedPaymentTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;

    new-instance v8, Lp90/m;

    new-instance v9, Lkd1/o$c;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getImageUrl()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;->getAccessibilityName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v9, v7}, Lp90/m;-><init>(Lkd1/o;Ljava/lang/String;)V

    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "toUpperCase(...)"

    if-eqz v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v11, "CARD_NUMBER"

    invoke-static {v9, v10, v8, v11}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    :cond_3
    move-object v7, v4

    :goto_2
    check-cast v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v4

    :goto_3
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v7, Lp90/k;

    const/4 v9, 0x2

    invoke-direct {v7, v0, v4, v9, v4}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const-string v11, "CARD_EXPIRATION_DATE"

    if-eqz v10, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v12}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v12, v13, v8, v11}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_6
    move-object v10, v4

    :goto_4
    check-cast v10, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object v0, v4

    :goto_5
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v13}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v13, v14, v8, v11}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_6

    :cond_9
    move-object v12, v4

    :goto_6
    check-cast v12, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v12, :cond_a

    invoke-virtual {v12}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_a
    move-object v10, v4

    :goto_7
    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lp90/k;

    invoke-direct {v11, v0, v10}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v12}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v14, "CARD_CVV"

    invoke-static {v12, v13, v8, v14}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    goto :goto_8

    :cond_c
    move-object v10, v4

    :goto_8
    check-cast v10, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_d
    move-object v0, v4

    :goto_9
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v10, Lp90/k;

    invoke-direct {v10, v0, v4, v9, v4}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v13}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v15, "CARD_ZIP_CODE"

    invoke-static {v13, v14, v8, v15}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_e

    goto :goto_a

    :cond_f
    move-object v12, v4

    :goto_a
    check-cast v12, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :cond_10
    move-object v0, v4

    :goto_b
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v8, Lp90/k;

    invoke-direct {v8, v0, v4, v9, v4}, Lp90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v4

    move-object v4, v5

    new-instance v5, Lp90/l;

    invoke-direct {v5, v7, v11, v10, v8}, Lp90/l;-><init>(Lp90/k;Lp90/k;Lp90/k;Lp90/k;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getUpcycleJoinTodaySubtitle()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getUpcycleCreditCardVariant()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_11

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->Companion:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;

    invoke-virtual {v0, v7}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;->fromValue(Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v0

    :cond_11
    move-object/from16 v20, v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getErrorMessages()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;->getDisclaimerText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v1, Lp90/j;

    const v24, 0x19ff00

    const/16 v25, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v1 .. v25}, Lp90/j;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lp90/l;Lc41/p2;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ld70/g;Ljava/lang/String;ZZLp90/f;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Lp90/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic i(Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;)Lk90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->V(Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;)Lk90/c;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;)Lm80/e;
    .locals 0

    invoke-static {p0}, Li80/b;->X(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;)Lm80/e;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;)Ls90/h;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v4, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getFreeTrialCodes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/activation/domain/models/steps/RafCodeModel;

    new-instance v9, Ls90/c;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/RafCodeModel;->getCode()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Lkd1/o$c;

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/RafCodeModel;->getImageUrl()Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/RafCodeModel;->getCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/RafCodeModel;->getSharedCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v8}, Lcom/whoop/activation/domain/models/steps/RafCodeModel;->getSharedText()Ljava/lang/String;

    move-result-object v15

    const/4 v10, 0x1

    invoke-direct/range {v9 .. v15}, Ls90/c;-><init>(ZLcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getReferralType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getHowItWorks()Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->getHowItWorks()Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;->getInstructions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;

    new-instance v11, Ls90/a;

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v7}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;->getIcon()Lgz0/m0;

    move-result-object v7

    invoke-direct {v11, v12, v7}, Ls90/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Ls90/b;

    invoke-direct {v1, v9, v10}, Ls90/b;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    move-object v9, v1

    new-instance v1, Ls90/h;

    move-object v7, v0

    invoke-direct/range {v1 .. v9}, Ls90/h;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ls90/b;)V

    return-object v1
.end method

.method public static synthetic k(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)Lh90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->P(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)Lh90/c;

    move-result-object p0

    return-object p0
.end method

.method private static final k0(Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;)Lv90/v;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->getPlanOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/activation/domain/models/steps/PlanOption;

    new-instance v5, Lv90/s;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getPrice()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getPriceSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getDisclaimer()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getTag()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_0

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getSelected()Z

    move-result v13

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getMembershipTier()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getTrackingLabel()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v16

    const/16 v18, 0x800

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, Lv90/s;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Lv90/v;

    invoke-direct {v1, v0, v3, v2}, Lv90/v;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public static synthetic l(Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;)Lm90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->e0(Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;)Lm90/c;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;)Lv90/o;
    .locals 23

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v2, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getPlanOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    new-instance v7, Lv90/k;

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getPrice()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getPriceSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getDisclaimer()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getTag()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_0

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    goto :goto_1

    :cond_0
    const/4 v14, 0x0

    :goto_1
    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getSelected()Z

    move-result v15

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getMembershipTier()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getTrackingLabel()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v18

    invoke-virtual {v6}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getShouldSkipNextScreen()Z

    move-result v19

    const/16 v21, 0x1000

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v7 .. v22}, Lv90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lv90/o;

    invoke-direct/range {v1 .. v6}, Lv90/o;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public static synthetic m(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li80/b;->H(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;)",
            "Ljava/util/List<",
            "Lr90/j;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p0}, Li80/b;->r0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p1}, Li80/b;->r0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Li80/b;->r0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;)Lw80/c;
    .locals 0

    invoke-static {p0}, Li80/b;->I(Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;)Lw80/c;

    move-result-object p0

    return-object p0
.end method

.method public static final n0()Ljb1/a;
    .locals 1

    sget-object v0, Li80/b;->b:Ljb1/a;

    return-object v0
.end method

.method public static synthetic o(Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;)Lb90/g;
    .locals 0

    invoke-static {p0}, Li80/b;->Y(Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;)Lb90/g;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "--"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    if-gt v1, p0, :cond_0

    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v1, p0, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;)Ln90/e;
    .locals 0

    invoke-static {p0}, Li80/b;->g0(Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;)Ln90/e;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Ljava/util/List;)Ld70/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;)",
            "Ld70/c;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EMAIL"

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getPreFill()Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    new-instance p0, Ld70/c;

    invoke-direct {p0, v1}, Ld70/c;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic q(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li80/b;->i0(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;",
            ">;)Z"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;->getBillingFrequency()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lr80/a;->values()[Lr80/a;

    move-result-object v2

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_4
    return v1
.end method

.method public static synthetic r(Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;)Lw90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->W(Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;)Lw90/c;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Ljava/util/List;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;)",
            "Ljava/util/List<",
            "Lr90/j;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

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

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/steps/ConsentsModel;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getConsentText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getConsentRequired()Z

    move-result v8

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getExpansionRequired()Z

    move-result v9

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getExpansionType()Lcom/whoop/activation/domain/models/steps/TermExpansion;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getRegion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getFullTermsUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getBottomScrollAllowed()Z

    move-result v11

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getConsent()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->getConsent()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lr90/d;->values()[Lr90/d;

    move-result-object v3

    array-length v13, v3

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_1

    aget-object v15, v3, v14

    move-object/from16 p0, v0

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_2
    move-object v13, v15

    goto :goto_3

    :cond_0
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    goto :goto_1

    :cond_1
    move-object/from16 p0, v0

    const/4 v15, 0x0

    goto :goto_2

    :goto_3
    new-instance v3, Lr90/j;

    const/16 v17, 0x1c00

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v18}, Lr90/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static synthetic s(Lcom/whoop/activation/domain/models/steps/GiftStepModel;)Lf90/c;
    .locals 0

    invoke-static {p0}, Li80/b;->M(Lcom/whoop/activation/domain/models/steps/GiftStepModel;)Lf90/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;)Lv80/c;
    .locals 0

    invoke-static {p0}, Li80/b;->Z(Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;)Lv80/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;)Lv90/o;
    .locals 0

    invoke-static {p0}, Li80/b;->l0(Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;)Lv90/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;)Lc90/b;
    .locals 0

    invoke-static {p0}, Li80/b;->c0(Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;)Lc90/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li80/b;->G(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/whoop/activation/domain/models/steps/GenderStepModel;)Le90/h;
    .locals 0

    invoke-static {p0}, Li80/b;->R(Lcom/whoop/activation/domain/models/steps/GenderStepModel;)Le90/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;)Ls80/d;
    .locals 0

    invoke-static {p0}, Li80/b;->f0(Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;)Ls80/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;)Lr90/g;
    .locals 0

    invoke-static {p0}, Li80/b;->S(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;)Lr90/g;

    move-result-object p0

    return-object p0
.end method
