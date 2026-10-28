.class public final Lcom/whoop/profile/domain/ProfileDomainState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bm\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003Jo\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010.\u001a\u00020\u00072\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00100\u001a\u000201H\u00d6\u0081\u0004J\n\u00102\u001a\u00020\u000eH\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0019\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "",
        "currentDialogType",
        "Lcom/whoop/profile/domain/ProfileDialogType;",
        "response",
        "Lcom/whoop/profile/domain/models/ProfileResponse;",
        "manualRefresh",
        "",
        "displayRefreshingSpinner",
        "designModal",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "pendingNavigation",
        "Lcom/whoop/profile/domain/ProfileNavigationEffect;",
        "inFlightCardButtonId",
        "",
        "reportResult",
        "Lcom/whoop/profile/domain/ProfileReportResult;",
        "showSettingsButton",
        "<init>",
        "(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)V",
        "getCurrentDialogType",
        "()Lcom/whoop/profile/domain/ProfileDialogType;",
        "getResponse",
        "()Lcom/whoop/profile/domain/models/ProfileResponse;",
        "getManualRefresh",
        "()Z",
        "getDisplayRefreshingSpinner",
        "getDesignModal",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "getPendingNavigation",
        "()Lcom/whoop/profile/domain/ProfileNavigationEffect;",
        "getInFlightCardButtonId",
        "()Ljava/lang/String;",
        "getReportResult",
        "()Lcom/whoop/profile/domain/ProfileReportResult;",
        "getShowSettingsButton",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

.field private final designModal:Lcom/whoop/design/models/modal/AnyModal;

.field private final displayRefreshingSpinner:Z

.field private final inFlightCardButtonId:Ljava/lang/String;

.field private final manualRefresh:Z

.field private final pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

.field private final reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

.field private final response:Lcom/whoop/profile/domain/models/ProfileResponse;

.field private final showSettingsButton:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    .line 9
    iput-object p7, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v1, 0x0

    if-eqz p11, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v1

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v1

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    :cond_8
    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/profile/domain/ProfileDomainState;->copy(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/domain/ProfileDialogType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/domain/models/ProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    return v0
.end method

.method public final component5()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component6()Lcom/whoop/profile/domain/ProfileNavigationEffect;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/profile/domain/ProfileReportResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    return v0
.end method

.method public final copy(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)Lcom/whoop/profile/domain/ProfileDomainState;
    .locals 10

    new-instance v0, Lcom/whoop/profile/domain/ProfileDomainState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/ProfileDomainState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/ProfileDomainState;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    iget-boolean p1, p1, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCurrentDialogType()Lcom/whoop/profile/domain/ProfileDialogType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    return-object v0
.end method

.method public final getDesignModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getDisplayRefreshingSpinner()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    return v0
.end method

.method public final getInFlightCardButtonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final getManualRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    return v0
.end method

.method public final getPendingNavigation()Lcom/whoop/profile/domain/ProfileNavigationEffect;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    return-object v0
.end method

.method public final getReportResult()Lcom/whoop/profile/domain/ProfileReportResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    return-object v0
.end method

.method public final getResponse()Lcom/whoop/profile/domain/models/ProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    return-object v0
.end method

.method public final getShowSettingsButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/profile/domain/models/ProfileResponse;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/ProfileDialogType;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainState;->response:Lcom/whoop/profile/domain/models/ProfileResponse;

    iget-boolean v2, p0, Lcom/whoop/profile/domain/ProfileDomainState;->manualRefresh:Z

    iget-boolean v3, p0, Lcom/whoop/profile/domain/ProfileDomainState;->displayRefreshingSpinner:Z

    iget-object v4, p0, Lcom/whoop/profile/domain/ProfileDomainState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v5, p0, Lcom/whoop/profile/domain/ProfileDomainState;->pendingNavigation:Lcom/whoop/profile/domain/ProfileNavigationEffect;

    iget-object v6, p0, Lcom/whoop/profile/domain/ProfileDomainState;->inFlightCardButtonId:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/profile/domain/ProfileDomainState;->reportResult:Lcom/whoop/profile/domain/ProfileReportResult;

    iget-boolean v8, p0, Lcom/whoop/profile/domain/ProfileDomainState;->showSettingsButton:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ProfileDomainState(currentDialogType="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    const-string v1, ", designModal="

    invoke-static {v9, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pendingNavigation="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", inFlightCardButtonId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", reportResult="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showSettingsButton="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
