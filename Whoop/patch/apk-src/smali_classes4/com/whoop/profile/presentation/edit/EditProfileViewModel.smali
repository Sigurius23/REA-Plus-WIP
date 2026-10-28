.class public final Lcom/whoop/profile/presentation/edit/EditProfileViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000c*\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R \u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u0012\u0004\u0008(\u0010)R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\'R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\'R\u001d\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
        "interactor",
        "Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;",
        "reducer",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "analyticsHelper",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;)V",
        "Lec3/l;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;",
        "toDomainAction",
        "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
        "event",
        "Ll83/a0;",
        "sendViewEvent",
        "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
        "Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "Lbc3/c0;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/o1;",
        "Lec3/t1;",
        "domainActionFlow",
        "Lec3/t1;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;",
        "usernameValidationActionFlow",
        "Lec3/l;",
        "getUsernameValidationActionFlow$annotations",
        "()V",
        "otherActionFlow",
        "mergedDomainActionFlow",
        "Lec3/f2;",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "viewState",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
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
.field private final analyticsHelper:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

.field private final coroutineScope:Lbc3/c0;

.field private final domainActionFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final eventFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final interactor:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

.field private final logger:Ltr2/n;

.field private final mergedDomainActionFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final otherActionFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final reducer:Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

.field private final usernameValidationActionFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final viewState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "interactor"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "reducer"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "analyticsHelper"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "coroutineScope"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0, v4}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object v1, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->interactor:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    .line 3
    iput-object v2, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->reducer:Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    .line 4
    iput-object v3, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->analyticsHelper:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    .line 5
    iput-object v4, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->coroutineScope:Lbc3/c0;

    .line 6
    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "EditProfileViewModel"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->logger:Ltr2/n;

    const/4 v1, 0x0

    const/4 v2, 0x7

    const/4 v3, 0x0

    .line 7
    invoke-static {v3, v3, v1, v2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->eventFlow:Lec3/o1;

    .line 8
    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$map$1;

    invoke-direct {v2, v1, v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/profile/presentation/edit/EditProfileViewModel;)V

    .line 9
    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v2, v4, v1, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v2

    iput-object v2, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->domainActionFlow:Lec3/t1;

    .line 10
    new-instance v5, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$mapNotNull$1;

    invoke-direct {v5, v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$mapNotNull$1;-><init>(Lec3/l;)V

    const-wide/16 v6, 0x3e8

    .line 11
    invoke-static {v5, v6, v7}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object v5

    iput-object v5, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->usernameValidationActionFlow:Lec3/l;

    .line 12
    new-instance v6, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$mapNotNull$2;

    invoke-direct {v6, v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$mapNotNull$2;-><init>(Lec3/l;)V

    .line 13
    iput-object v6, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->otherActionFlow:Lec3/l;

    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [Lec3/l;

    aput-object v5, v2, v3

    const/4 v3, 0x1

    aput-object v6, v2, v3

    invoke-static {v2}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object v2

    iput-object v2, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->mergedDomainActionFlow:Lec3/l;

    .line 15
    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->interact(Lec3/l;)Lec3/l;

    move-result-object v2

    .line 16
    new-instance v3, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$map$2;

    invoke-direct {v3, v2, v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$special$$inlined$map$2;-><init>(Lec3/l;Lcom/whoop/profile/presentation/edit/EditProfileViewModel;)V

    .line 17
    new-instance v5, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v4, v1, v5}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->viewState:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 18
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getEventFlow$p(Lcom/whoop/profile/presentation/edit/EditProfileViewModel;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->eventFlow:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$getReducer$p(Lcom/whoop/profile/presentation/edit/EditProfileViewModel;)Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->reducer:Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    return-object p0
.end method

.method public static final synthetic access$toDomainAction(Lcom/whoop/profile/presentation/edit/EditProfileViewModel;Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/edit/EditProfileDomainAction;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->toDomainAction(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/edit/EditProfileDomainAction;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic getUsernameValidationActionFlow$annotations()V
    .locals 0

    return-void
.end method

.method private final interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->interactor:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final toDomainAction(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/edit/EditProfileDomainAction;
    .locals 1

    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;->getUsername()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ClearUsernameValidation;

    if-eqz v0, :cond_4

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;

    return-object p1

    :cond_4
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$HelpIconClicked;

    if-eqz v0, :cond_5

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;

    return-object p1

    :cond_5
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;

    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;->getImageData()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;-><init>([B)V

    return-object v0

    :cond_6
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$DeleteAvatar;

    if-eqz v0, :cond_7

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;

    return-object p1

    :cond_7
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$AvatarUploadRetry;

    if-eqz v0, :cond_8

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;

    return-object p1

    :cond_8
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;

    if-eqz v0, :cond_9

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;

    return-object p1

    :cond_9
    instance-of p1, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;

    if-eqz p1, :cond_a

    sget-object p1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->viewState:Lec3/f2;

    return-object v0
.end method

.method public final sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->viewState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-object v1, p1

    check-cast v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->analyticsHelper:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v1, Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->analyticsHelper:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v1, Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->analyticsHelper:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v1, Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->coroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$sendViewEvent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel$sendViewEvent$1;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewModel;Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
