.class public final Lcom/whoop/profile/presentation/ProfileViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;,
        Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;,
        Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;,
        Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;,
        Lcom/whoop/profile/presentation/ProfileViewState$Metadata;,
        Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;,
        Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;,
        Lcom/whoop/profile/presentation/ProfileViewState$UserData;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0008*+,-./01BK\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JM\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u00c6\u0001J\u0014\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\'H\u00d6\u0081\u0004J\n\u0010(\u001a\u00020)H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "",
        "popUpDialog",
        "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "fullScreenModal",
        "Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;",
        "designModal",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "pendingNavigation",
        "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "metadata",
        "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "screenContent",
        "Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;",
        "<init>",
        "(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)V",
        "getPopUpDialog",
        "()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "getFullScreenModal",
        "()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;",
        "getDesignModal",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "getPendingNavigation",
        "()Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "getMetadata",
        "()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "getScreenContent",
        "()Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "FullScreenModal",
        "ProfileDialogState",
        "Metadata",
        "UserData",
        "MembershipData",
        "BottomSheet",
        "ScreenContent",
        "ComponentItem",
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
.field private final designModal:Lcom/whoop/design/models/modal/AnyModal;

.field private final fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

.field private final metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

.field private final pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

.field private final popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

.field private final screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)V
    .locals 1

    const-string v0, "metadata"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenContent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_4

    .line 9
    new-instance v6, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    const/16 v14, 0x7f

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v5, p7, 0x20

    if-eqz v5, :cond_5

    .line 10
    new-instance v5, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    const/4 v7, 0x1

    invoke-direct {v5, v1, v7, v1}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p7, v5

    :goto_5
    move-object/from16 p1, p0

    move-object/from16 p2, v0

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v6

    goto :goto_6

    :cond_5
    move-object/from16 p7, p6

    goto :goto_5

    .line 11
    :goto_6
    invoke-direct/range {p1 .. p7}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileViewState;Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/presentation/ProfileViewState;->copy(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final component6()Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 8

    const-string v0, "metadata"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenContent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileViewState;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    iget-object p1, p1, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDesignModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getFullScreenModal()Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final getPendingNavigation()Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    return-object v0
.end method

.method public final getPopUpDialog()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    return-object v0
.end method

.method public final getScreenContent()Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState;->designModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p0, Lcom/whoop/profile/presentation/ProfileViewState;->pendingNavigation:Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    iget-object v4, p0, Lcom/whoop/profile/presentation/ProfileViewState;->metadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    iget-object v5, p0, Lcom/whoop/profile/presentation/ProfileViewState;->screenContent:Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ProfileViewState(popUpDialog="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fullScreenModal="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", designModal="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pendingNavigation="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screenContent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
