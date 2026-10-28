.class public final Lis2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001c\u0010\n\u00a8\u0006\u001d"
    }
    d2 = {
        "Lis2/a;",
        "",
        "<init>",
        "()V",
        "Les2/a$a;",
        "Lhs2/e;",
        "b",
        "(Les2/a$a;)Lhs2/e;",
        "Les2/c;",
        "g",
        "(Les2/c;)Lhs2/e;",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "Lhs2/e$b;",
        "c",
        "(Lcom/whoop/design/models/items/NavigationBarModel;)Lhs2/e$b;",
        "Lcom/whoop/design/models/items/NavigationButtonModel;",
        "Lhs2/e$c;",
        "d",
        "(Lcom/whoop/design/models/items/NavigationButtonModel;)Lhs2/e$c;",
        "Lcom/whoop/videocall/api/VideoCallParticipantsModel;",
        "Lhs2/c;",
        "f",
        "(Lcom/whoop/videocall/api/VideoCallParticipantsModel;)Lhs2/c;",
        "Lcom/whoop/videocall/api/VideoCallParticipantModel;",
        "Lhs2/b;",
        "e",
        "(Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lhs2/b;",
        "domainResult",
        "a",
        "video-call_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Les2/a$a;)Lhs2/e;
    .locals 9

    instance-of v0, p1, Les2/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lhs2/e;

    new-instance v2, Lhs2/e$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lhs2/e$a;-><init>(Lsz0/q0;Lhs2/a;Lhs2/a;Lhs2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lhs2/e;-><init>(Lhs2/e$a;Lfs2/l;Lhs2/e$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Les2/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lhs2/e;

    new-instance v2, Lhs2/e$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lhs2/a$i;->a:Lhs2/a$i;

    sget-object v6, Lhs2/a$b;->a:Lhs2/a$b;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lhs2/e$a;-><init>(Lsz0/q0;Lhs2/a;Lhs2/a;Lhs2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lhs2/e;-><init>(Lhs2/e$a;Lfs2/l;Lhs2/e$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Les2/a$d;

    if-eqz p1, :cond_2

    new-instance v0, Lhs2/e;

    new-instance v1, Lhs2/e$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    sget-object v3, Lhs2/a$i;->a:Lhs2/a$i;

    sget-object v5, Lhs2/a$b;->a:Lhs2/a$b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lhs2/e$a;-><init>(Lsz0/q0;Lhs2/a;Lhs2/a;Lhs2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lhs2/e;-><init>(Lhs2/e$a;Lfs2/l;Lhs2/e$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/design/models/items/NavigationBarModel;)Lhs2/e$b;
    .locals 2

    new-instance v0, Lhs2/e$b;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationBarModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationBarModel;->getRightButton()Lcom/whoop/design/models/items/NavigationButtonModel;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lis2/a;->d(Lcom/whoop/design/models/items/NavigationButtonModel;)Lhs2/e$c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, v1, p1}, Lhs2/e$b;-><init>(Ljava/lang/String;Lhs2/e$c;)V

    return-object v0
.end method

.method private final d(Lcom/whoop/design/models/items/NavigationButtonModel;)Lhs2/e$c;
    .locals 3

    new-instance v0, Lhs2/e$c;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationButtonModel;->getIcon()Lgz0/m0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationButtonModel;->getContentDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lhs2/e$c;-><init>(Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private final e(Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lhs2/b;
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantModel;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantModel;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->b0(Ljava/lang/String;)Ljava/lang/Character;

    move-result-object v2

    const-string v3, ""

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantModel;->getLastName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->b0(Ljava/lang/String;)Ljava/lang/Character;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantModel;->getProfileImage()Lcom/whoop/design/models/items/ImageUrlModel;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Llb1/e2;->h(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    new-instance v3, Lhs2/b;

    invoke-direct {v3, v0, v1, v2, p1}, Lhs2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/h0;)V

    return-object v3
.end method

.method private final f(Lcom/whoop/videocall/api/VideoCallParticipantsModel;)Lhs2/c;
    .locals 2

    new-instance v0, Lhs2/c;

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantsModel;->getLocalParticipant()Lcom/whoop/videocall/api/VideoCallParticipantModel;

    move-result-object v1

    invoke-direct {p0, v1}, Lis2/a;->e(Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lhs2/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallParticipantsModel;->getPrimaryRemoteParticipant()Lcom/whoop/videocall/api/VideoCallParticipantModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lis2/a;->e(Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lhs2/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lhs2/c;-><init>(Lhs2/b;Lhs2/b;)V

    return-object v0
.end method

.method private final g(Les2/c;)Lhs2/e;
    .locals 28

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Les2/c;->d()Lfs2/l;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Les2/c;->e()Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Les2/c;->e()Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallContentResponse;->getWaitingRoom()Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Les2/c;->c()Z

    move-result v4

    new-instance v5, Lhs2/e$e;

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;->getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;

    move-result-object v6

    invoke-direct {v0, v6}, Lis2/a;->c(Lcom/whoop/design/models/items/NavigationBarModel;)Lhs2/e$b;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;->getHeader()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;->getDescription()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;->getPrimaryButtonTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Les2/c;->e()Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallContentResponse;->getPermissions()Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallPermissionsModel;->getModal()Lcom/whoop/design/models/modal/DialogModel;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Les2/c;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Les2/c;->e()Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallContentResponse;->getPermissions()Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallPermissionsModel;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallPermissionsModel;->getButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    const/16 v26, 0x3dff

    const/16 v27, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v11 .. v27}, Lcom/whoop/design/models/InfoCalloutTileModel;->copy$default(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;ILjava/lang/Object;)Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v1

    invoke-static {v1}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object v2

    :cond_0
    move-object v11, v2

    invoke-direct/range {v5 .. v11}, Lhs2/e$e;-><init>(Lhs2/e$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/DialogModel;Lc41/p2;)V

    invoke-virtual/range {p1 .. p1}, Les2/c;->e()Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallContentResponse;->getParticipants()Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    move-result-object v1

    invoke-direct {v0, v1}, Lis2/a;->f(Lcom/whoop/videocall/api/VideoCallParticipantsModel;)Lhs2/c;

    move-result-object v1

    new-instance v2, Lhs2/e$d;

    invoke-direct {v2, v5, v1, v4}, Lhs2/e$d;-><init>(Lhs2/e$e;Lhs2/c;Z)V

    :cond_1
    move-object v4, v2

    new-instance v1, Lhs2/e;

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lhs2/e;-><init>(Lhs2/e$a;Lfs2/l;Lhs2/e$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final a(Les2/c;)Lhs2/e;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Les2/c;->f()Les2/a;

    move-result-object v0

    instance-of v0, v0, Les2/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Les2/c;->f()Les2/a;

    move-result-object p1

    check-cast p1, Les2/a$a;

    invoke-direct {p0, p1}, Lis2/a;->b(Les2/a$a;)Lhs2/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lis2/a;->g(Les2/c;)Lhs2/e;

    move-result-object p1

    return-object p1
.end method
