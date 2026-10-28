.class public final Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;",
        "",
        "Ljb1/a;",
        "reducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljb1/a;Ltr2/n;)V",
        "Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;",
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "toFullScreenModal",
        "(Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;)Lcom/whoop/profile/presentation/ProfileViewState;",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "toViewState",
        "(Lcom/whoop/profile/domain/ProfileDomainState;)Lcom/whoop/profile/presentation/ProfileViewState;",
        "Lcom/whoop/profile/domain/ProfileReportResult;",
        "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "toDialogState",
        "(Lcom/whoop/profile/domain/ProfileReportResult;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "Lcom/whoop/profile/domain/ProfileNavigationEffect;",
        "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "toNavigationEvent",
        "(Lcom/whoop/profile/domain/ProfileNavigationEffect;)Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "sectionItemReducer",
        "()Ljb1/a;",
        "",
        "spacing",
        "Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;",
        "mapSpacingType",
        "(Ljava/lang/String;)Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;",
        "domainResult",
        "reduce",
        "Ljb1/a;",
        "getReducer$profile_release",
        "Ltr2/n;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final logger:Ltr2/n;

.field private final reducer:Ljb1/a;


# direct methods
.method public constructor <init>(Ljb1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->reducer:Ljb1/a;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->logger:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->access$getItemReducer$p()Ljb1/a;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;-><init>(Ljb1/a;Ltr2/n;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->sectionItemReducer$lambda$0(Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final mapSpacingType(Ljava/lang/String;)Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;->NORMAL:Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;->COMPACT:Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;->COMPACT:Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    return-object p1
.end method

.method private final sectionItemReducer()Ljb1/a;
    .locals 2

    new-instance v0, Lck1/c;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final sectionItemReducer$lambda$0(Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljb1/b;->c(Llb1/y0;)V

    iget-object p0, p0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->reducer:Ljb1/a;

    invoke-virtual {p0}, Ljb1/a;->f()Llb1/y0;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final toDialogState(Lcom/whoop/profile/domain/ProfileReportResult;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 13

    sget-object v0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_report_failure_title:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget p1, Lcom/whoop/profile/R$string;->profile_report_failure_description:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget p1, Lcom/whoop/profile/R$string;->profile_report_dialog_dismiss:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget-object v9, Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/16 v11, 0xac

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v10, v9

    invoke-direct/range {v0 .. v12}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p1, Lcom/whoop/profile/R$string;->profile_report_success_title:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget p1, Lcom/whoop/profile/R$string;->profile_report_success_description:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget p1, Lcom/whoop/profile/R$string;->profile_report_dialog_dismiss:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget-object v9, Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/16 v11, 0xac

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v10, v9

    invoke-direct/range {v0 .. v12}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final toFullScreenModal(Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 10

    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileDialogType$Loading;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lcom/whoop/profile/presentation/ProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Refresh;

    sget-object v6, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lcom/whoop/profile/presentation/ProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Refresh;

    sget-object v6, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of p1, p1, Lcom/whoop/profile/domain/ProfileDialogType$Success;

    if-eqz p1, :cond_3

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0x3d

    const/4 v8, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toNavigationEvent(Lcom/whoop/profile/domain/ProfileNavigationEffect;)Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;
    .locals 7

    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    check-cast p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;->getNavAction()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;->getSource()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;

    check-cast p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->getDismissEvent()Lj02/s;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;-><init>(Lj02/s;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toViewState(Lcom/whoop/profile/domain/ProfileDomainState;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 28

    move-object/from16 v1, p0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getResponse()Lcom/whoop/profile/domain/models/ProfileResponse;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-direct {v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->sectionItemReducer()Ljb1/a;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getReportResult()Lcom/whoop/profile/domain/ProfileReportResult;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-direct {v1, v4}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toDialogState(Lcom/whoop/profile/domain/ProfileReportResult;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    move-result-object v4

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getDesignModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getPendingNavigation()Lcom/whoop/profile/domain/ProfileNavigationEffect;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-direct {v1, v6}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toNavigationEvent(Lcom/whoop/profile/domain/ProfileNavigationEffect;)Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    move-result-object v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getEntitlementsImageUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    new-instance v8, Lkd1/o$c;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/u;->g()I

    move-result v10

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/u;->g()I

    move-result v12

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getEditButtonTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getEditButtonAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->isSelfProfile()Z

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getShowSettingsButton()Z

    move-result v14

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getProfileImageUrl()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_3

    new-instance v15, Lkd1/o$c;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v15

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getFirstName()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getLastName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getUsername()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getAge()Ljava/lang/Integer;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getUserData()Lcom/whoop/profile/domain/models/UserData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/UserData;->getLocation()Ljava/lang/String;

    move-result-object v21

    new-instance v15, Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    invoke-direct/range {v15 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/MembershipData;->isFoundingMember()Z

    move-result v17

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/MembershipData;->getMemberSinceTitle()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/MembershipData;->getMemberSinceDate()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/MembershipData;->getIcon()Ljava/lang/String;

    move-result-object v7

    sget-object v12, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {v7, v12}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/MembershipData;->getBottomSheet()Lcom/whoop/profile/domain/models/BottomSheet;

    move-result-object v7

    if-eqz v7, :cond_5

    new-instance v12, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/BottomSheet;->getImage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v21, Lkd1/o$c;

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/BottomSheet;->getImage()Ljava/lang/String;

    move-result-object v22

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v21

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    :goto_4
    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/BottomSheet;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/whoop/profile/domain/models/BottomSheet;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v12, v13, v2, v7}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v21, v12

    goto :goto_5

    :cond_5
    const/16 v21, 0x0

    :goto_5
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/MembershipData;->getFollowingState()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/MembershipData;->getCommunityVisible()Ljava/lang/Boolean;

    move-result-object v23

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/MembershipData;->getAgeVisible()Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getProfileMetadata()Lcom/whoop/profile/domain/models/ProfileMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/ProfileMetadata;->getMembershipData()Lcom/whoop/profile/domain/models/MembershipData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/models/MembershipData;->getLocationVisible()Ljava/lang/Boolean;

    move-result-object v25

    new-instance v16, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    invoke-direct/range {v16 .. v25}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    new-instance v7, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-object v12, v15

    move-object/from16 v13, v16

    invoke-direct/range {v7 .. v14}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;Z)V

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/ProfileResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/profile/domain/models/ProfileSectionModel;

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/ProfileSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-direct {v1, v9}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->mapSpacingType(Ljava/lang/String;)Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    move-result-object v9

    if-nez v9, :cond_7

    :cond_6
    sget-object v9, Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;->COMPACT:Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    :cond_7
    new-instance v10, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/ProfileSectionModel;->getItems()Ljava/util/List;

    move-result-object v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v3, v8, v12, v11, v12}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getInFlightCardButtonId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->access$withInFlightCardButtonDisabled(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v10, v8, v9}, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;-><init>(Ljava/util/List;Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;)V

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    new-instance v8, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    invoke-direct {v8, v2}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;-><init>(Ljava/util/List;)V

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState;

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_9
    const/4 v12, 0x0

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getReportResult()Lcom/whoop/profile/domain/ProfileReportResult;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-direct {v1, v0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toDialogState(Lcom/whoop/profile/domain/ProfileReportResult;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    move-result-object v0

    move-object v3, v0

    goto :goto_7

    :cond_a
    move-object v3, v12

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getDesignModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getPendingNavigation()Lcom/whoop/profile/domain/ProfileNavigationEffect;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-direct {v1, v0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toNavigationEvent(Lcom/whoop/profile/domain/ProfileNavigationEffect;)Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    move-result-object v0

    move-object v6, v0

    goto :goto_8

    :cond_b
    move-object v6, v12

    :goto_8
    const/16 v9, 0x32

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :goto_9
    iget-object v2, v1, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->logger:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Error reducing ProfileDomainState to ProfileViewState"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v5, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v6, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v7

    sget-object v8, Lcom/whoop/profile/presentation/ProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Refresh;

    sget-object v10, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3d

    const/4 v13, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method


# virtual methods
.method public final getReducer$profile_release()Ljb1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->reducer:Ljb1/a;

    return-object v0
.end method

.method public final reduce(Lcom/whoop/profile/domain/ProfileDomainState;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getCurrentDialogType()Lcom/whoop/profile/domain/ProfileDialogType;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileDomainState;->getCurrentDialogType()Lcom/whoop/profile/domain/ProfileDialogType;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;

    invoke-direct {p0, p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toFullScreenModal(Lcom/whoop/profile/domain/ProfileDialogType$FullScreenModal;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->toViewState(Lcom/whoop/profile/domain/ProfileDomainState;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object p1

    return-object p1
.end method
