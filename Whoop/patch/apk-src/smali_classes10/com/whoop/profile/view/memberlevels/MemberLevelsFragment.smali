.class public final Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u001b\u001a\u0004\u0008,\u0010-R+\u00107\u001a\u00020/2\u0006\u00100\u001a\u00020/8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R\u001a\u00109\u001a\u0002088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "initViews",
        "Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;",
        "currentLevelViewContainer",
        "displayProgressView",
        "(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V",
        "displayOnboardingView",
        "displayProgressText",
        "loadMiniBadges",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;",
        "memberLevelsViewModel$delegate",
        "Ll83/h;",
        "getMemberLevelsViewModel",
        "()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;",
        "memberLevelsViewModel",
        "Lor2/y;",
        "externalLinkNavigator$delegate",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;",
        "args$delegate",
        "Leb/i;",
        "getArgs",
        "()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;",
        "args",
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;",
        "adapter$delegate",
        "getAdapter",
        "()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;",
        "adapter",
        "Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;",
        "<set-?>",
        "dataBinding$delegate",
        "Lcom/whoop/ui/b;",
        "getDataBinding",
        "()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;",
        "setDataBinding",
        "(Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;)V",
        "dataBinding",
        "",
        "logTag",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "Companion",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$Companion;

.field public static final DAY_1_RECOVERY:I = 0x1

.field public static final DAY_2_RECOVERY:I = 0x2

.field public static final DAY_3_RECOVERY:I = 0x3

.field public static final MAX_LEVEL:I = 0x1e


# instance fields
.field private final adapter$delegate:Ll83/h;

.field private final args$delegate:Leb/i;

.field private final dataBinding$delegate:Lcom/whoop/ui/b;

.field private final externalLinkNavigator$delegate:Ll83/h;

.field private final logTag:Ljava/lang/String;

.field private final memberLevelsViewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;

    const-string v2, "dataBinding"

    const-string v3, "getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->$$delegatedProperties:[Lj93/z;

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->Companion:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v0, p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$viewModel$default$1;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$viewModel$default$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$viewModel$default$2;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->memberLevelsViewModel$delegate:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$inject$default$1;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$inject$default$1;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->externalLinkNavigator$delegate:Ll83/h;

    new-instance v0, Leb/i;

    const-class v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$navArgs$1;

    invoke-direct {v2, p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$special$$inlined$navArgs$1;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->args$delegate:Leb/i;

    new-instance v0, Lcom/whoop/design/models/modal/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->adapter$delegate:Ll83/h;

    const/4 v0, 0x1

    invoke-static {p0, v3, v0, v3}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->dataBinding$delegate:Lcom/whoop/ui/b;

    const-string v0, "MemberLevelsFragment"

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->logTag:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->onViewCreated$lambda$1(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->adapter_delegate$lambda$0()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic G(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->onViewCreated$lambda$0(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->initViews$lambda$0$0(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final adapter_delegate$lambda$0()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    invoke-direct {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;-><init>()V

    return-object v0
.end method

.method private final displayOnboardingView(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V
    .locals 4

    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelOnboardingSegmentBar:Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lcom/whoop/profile/R$color;->whoop_green:I

    invoke-static {p0, v0}, Lhj0/p;->b(Landroidx/fragment/app/m0;I)I

    move-result v0

    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelOnboardingSegmentBar:Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;

    const-string v1, "levelOnboardingSegmentBar"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getMemberExperience()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->first:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->second:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object p1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->third:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v1, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_1
    iget-object v1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->first:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object p1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->second:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v1, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_2
    iget-object p1, p1, Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;->first:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v0, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method private final displayProgressText(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V
    .locals 7

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getNextLevelExperience()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getNextLevelExperience()I

    move-result v0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getMemberExperience()I

    move-result v2

    sub-int/2addr v0, v2

    new-instance v2, Landroid/text/SpannableString;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/whoop/profile/R$plurals;->member_level_out_of_total:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getNextLevelId()Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v0, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const-string v0, " "

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x6

    invoke-static {v2, v0, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    sget v4, Lvu1/a;->c0:I

    invoke-static {p0, v4}, Lhj0/p;->b(Landroidx/fragment/app/m0;I)I

    move-result v4

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v4, 0x21

    invoke-virtual {v2, v3, v1, v0, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v0

    const/16 v2, 0x1e

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    sget v0, Lcom/whoop/profile/R$string;->member_levels_congrats:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final displayProgressView(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V
    .locals 3

    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelOnboardingSegmentBar:Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v0

    const/16 v2, 0x1e

    if-ne v0, v2, :cond_0

    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v0, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelMaxExperience()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelMinExperience()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_1
    iget-object p1, p1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getMemberExperience()I

    move-result v0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelMinExperience()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->loadMiniBadges()V

    return-void
.end method

.method private final getAdapter()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->adapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    return-object v0
.end method

.method private final getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->args$delegate:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    return-object v0
.end method

.method private final getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->dataBinding$delegate:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    return-object v0
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->externalLinkNavigator$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method private final getMemberLevelsViewModel()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->memberLevelsViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    return-object v0
.end method

.method private final initViews()V
    .locals 5

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentBadgeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v1

    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v1, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v1, v2}, Lpl/a;->f(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    sget-object v2, Lzk/k;->b:Lzk/k;

    invoke-virtual {v1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    iget-object v2, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v2, v2, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelBadge:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v1

    const/16 v2, 0x1e

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelMiniBadge:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->nextLevelMiniBadge:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelMiniBadge:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->nextLevelMiniBadge:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->loadMiniBadges()V

    :goto_0
    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v1

    const/4 v2, 0x1

    const-string v3, "currentLevelViewContainer"

    if-ne v1, v2, :cond_1

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->displayOnboardingView(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->displayProgressView(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V

    :goto_1
    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentTier:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevel:Landroid/widget/TextView;

    sget v2, Lcom/whoop/profile/R$string;->profile_level_title:I

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2, v4}, Landroidx/fragment/app/m0;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->pinnedLevelTitle:Landroid/widget/TextView;

    sget v2, Lcom/whoop/profile/R$string;->profile_level_title:I

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2, v4}, Landroidx/fragment/app/m0;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->displayProgressText(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getMemberLevelsViewModel()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->getMemberLevelsLiveData()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lcom/whoop/profile/view/memberlevels/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/whoop/profile/view/memberlevels/a;-><init>(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;I)V

    new-instance v3, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getMemberLevelsViewModel()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->getMemberLevels(I)V

    return-void
.end method

.method private static final initViews$lambda$0$0(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Ljava/util/List;)Ll83/a0;
    .locals 5

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    invoke-virtual {v3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getLevelId()I

    move-result v3

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentLevelId()I

    move-result v4

    if-gt v3, v4, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->setLocked(Z)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getAdapter()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->setDataList(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getAdapter()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-object v3
.end method

.method private final loadMiniBadges()V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getCurrentMiniBadgeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    sget v1, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v0, v1}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v1, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v0, v1}, Lpl/a;->f(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget-object v1, Lzk/k;->b:Lzk/k;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v2, v2, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelMiniBadge:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getArgs()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->getNextMiniBadgeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v0, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v0, v2}, Lpl/a;->f(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iget-object v1, v1, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->nextLevelMiniBadge:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    return-void
.end method

.method private static final onViewCreated$lambda$0(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewCreated$lambda$1(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;)Ll83/a0;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getMemberLevelsViewModel()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->getProfileHelpUrl()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lor2/y;->x(Landroid/app/Activity;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setDataBinding(Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->dataBinding$delegate:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->logTag:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->setDataBinding(Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->progressLevelRecyclerview:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getAdapter()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->memberLevelsToolbar:Lcom/whoop/ui/WhoopNewToolbar;

    new-instance p2, Lcom/whoop/profile/view/memberlevels/a;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lcom/whoop/profile/view/memberlevels/a;-><init>(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;I)V

    invoke-virtual {p1, p2}, Lcom/whoop/ui/WhoopNewToolbar;->n(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->memberLevelsToolbar:Lcom/whoop/ui/WhoopNewToolbar;

    new-instance p2, La1/j;

    const/16 v0, 0x15

    invoke-direct {p2, p0, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lcom/whoop/ui/WhoopNewToolbar;->p(Lc93/a;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->initViews()V

    return-void
.end method
