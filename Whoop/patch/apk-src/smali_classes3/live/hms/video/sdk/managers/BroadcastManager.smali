.class public final Llive/hms/video/sdk/managers/BroadcastManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/BroadcastManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/BroadcastManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "manage",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "params",
        "getHMSRoleFromRoleName",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "name",
        "",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/sdk/managers/BroadcastManager$Companion;

.field private static final TAG:Ljava/lang/String; = "BroadcastManager"


# instance fields
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/BroadcastManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/BroadcastManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/BroadcastManager;->Companion:Llive/hms/video/sdk/managers/BroadcastManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/BroadcastManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method

.method private final getHMSRoleFromRoleName(Ljava/lang/String;)Llive/hms/video/sdk/models/role/HMSRole;
    .locals 3

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/BroadcastManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Llive/hms/video/sdk/models/role/HMSRole;

    return-object v1
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/BroadcastManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/BroadcastManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/BroadcastManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getPeer()Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getPeerId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v2, v3}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v2

    .line 4
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getPeer()Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;

    move-result-object v3

    if-eqz v3, :cond_2

    if-nez v2, :cond_2

    .line 5
    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/BroadcastManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getRole()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Llive/hms/video/sdk/models/role/HMSRole;

    if-eqz v9, :cond_1

    .line 6
    new-instance v5, Llive/hms/video/sdk/models/HMSRemotePeer;

    .line 7
    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getPeerId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getCustomerUserId()Ljava/lang/String;

    move-result-object v7

    .line 8
    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getUserName()Ljava/lang/String;

    move-result-object v8

    .line 9
    sget-object v13, Llive/hms/video/sdk/models/HMSPeerType;->REGULAR:Llive/hms/video/sdk/models/HMSPeerType;

    const/16 v14, 0x20

    const/4 v15, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    .line 10
    invoke-direct/range {v5 .. v15}, Llive/hms/video/sdk/models/HMSRemotePeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;->getGroups()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v5, v2}, Llive/hms/video/sdk/models/HMSPeer;->setGroups$lib_release(Ljava/util/ArrayList;)V

    move-object v4, v5

    :cond_1
    move-object v2, v4

    :cond_2
    move-object v9, v2

    .line 12
    new-instance v2, Llive/hms/video/sdk/models/HMSMessageRecipient;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Llive/hms/video/sdk/models/HMSMessageRecipient;-><init>(Llive/hms/video/sdk/models/HMSPeer;Ljava/util/List;Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getPrivate()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;->PEER:Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/HMSMessageRecipient;->setRecipientType(Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;)V

    .line 15
    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/BroadcastManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/HMSMessageRecipient;->setRecipientPeer(Llive/hms/video/sdk/models/HMSPeer;)V

    .line 16
    :cond_3
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getRoleNames()Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v11, p0

    .line 19
    invoke-direct {v11, v5}, Llive/hms/video/sdk/managers/BroadcastManager;->getHMSRoleFromRoleName(Ljava/lang/String;)Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 20
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    move-object/from16 v11, p0

    .line 21
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;->ROLES:Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/HMSMessageRecipient;->setRecipientType(Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;)V

    .line 22
    invoke-virtual {v2, v4}, Llive/hms/video/sdk/models/HMSMessageRecipient;->setRecipientRoles(Ljava/util/List;)V

    goto :goto_2

    :cond_6
    move-object/from16 v11, p0

    .line 23
    :goto_2
    new-instance v12, Llive/hms/video/sdk/models/SDKUpdate$Broadcast;

    .line 24
    new-instance v3, Llive/hms/video/sdk/models/HMSMessage;

    .line 25
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;->getMessage()Ljava/lang/String;

    move-result-object v4

    .line 26
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;

    move-result-object v5

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;->getType()Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getTimestamp()J

    move-result-wide v7

    .line 28
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getMessageId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const-string v1, ""

    :cond_7
    move-object v10, v1

    move-object v6, v2

    .line 29
    invoke-direct/range {v3 .. v10}, Llive/hms/video/sdk/models/HMSMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSMessageRecipient;JLlive/hms/video/sdk/models/HMSPeer;Ljava/lang/String;)V

    .line 30
    invoke-direct {v12, v3}, Llive/hms/video/sdk/models/SDKUpdate$Broadcast;-><init>(Llive/hms/video/sdk/models/HMSMessage;)V

    .line 31
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
