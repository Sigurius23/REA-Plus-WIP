.class public final enum Ll53/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic x:[Ll53/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v1, Ll53/a;

    const/4 v0, 0x0

    const-string v2, "create"

    const-string v3, "CREATE"

    invoke-direct {v1, v3, v0, v2}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Ll53/a;

    const/4 v0, 0x1

    const-string v3, "joinRequest"

    const-string v4, "JOIN_REQUEST"

    invoke-direct {v2, v4, v0, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Ll53/a;

    const/4 v0, 0x2

    const-string v4, "onicecandidate"

    const-string v5, "ON_ICE_CANDIDATE"

    invoke-direct {v3, v5, v0, v4}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Ll53/a;

    const/4 v0, 0x3

    const-string v5, "ontrack"

    const-string v6, "ON_TRACK"

    invoke-direct {v4, v6, v0, v5}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Ll53/a;

    const/4 v0, 0x4

    const-string v6, "onsignalingstatechange"

    const-string v7, "ON_SIGNALING_STATE_CHANGE"

    invoke-direct {v5, v7, v0, v6}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Ll53/a;

    const/4 v0, 0x5

    const-string v7, "oniceconnectionstatechange"

    const-string v8, "ON_ICE_CONNECTION_STATE_CHANGE"

    invoke-direct {v6, v8, v0, v7}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Ll53/a;

    const/4 v0, 0x6

    const-string v8, "onicegatheringstatechange"

    const-string v9, "ON_ICE_GATHERING_STATE_CHANGE"

    invoke-direct {v7, v9, v0, v8}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Ll53/a;

    const/4 v0, 0x7

    const-string v9, "onconnectionstatechange"

    const-string v10, "ON_CONNECTION_STATE_CHANGE"

    invoke-direct {v8, v10, v0, v9}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v9, Ll53/a;

    const/16 v0, 0x8

    const-string v10, "onnegotiationneeded"

    const-string v11, "ON_NEGOTIATION_NEEDED"

    invoke-direct {v9, v11, v0, v10}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Ll53/a;

    const/16 v0, 0x9

    const-string v11, "ondatachannel"

    const-string v12, "ON_DATA_CHANNEL"

    invoke-direct {v10, v12, v0, v11}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Ll53/a;

    const/16 v0, 0xa

    const-string v12, "close"

    const-string v13, "CLOSE"

    invoke-direct {v11, v13, v0, v12}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Ll53/a;

    const/16 v0, 0xb

    const-string v13, "createOffer"

    const-string v14, "CREATE_OFFER"

    invoke-direct {v12, v14, v0, v13}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v13, Ll53/a;

    const/16 v0, 0xc

    const-string v14, "createAnswer"

    const-string v15, "CREATE_ANSWER"

    invoke-direct {v13, v15, v0, v14}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v14, Ll53/a;

    const/16 v0, 0xd

    const-string v15, "setLocalDescription"

    move-object/from16 v16, v1

    const-string v1, "SET_LOCAL_DESCRIPTION"

    invoke-direct {v14, v1, v0, v15}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v15, Ll53/a;

    const/16 v0, 0xe

    const-string v1, "setRemoteDescription"

    move-object/from16 v17, v2

    const-string v2, "SET_REMOTE_DESCRIPTION"

    invoke-direct {v15, v2, v0, v1}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Ll53/a;

    const/16 v1, 0xf

    const-string v2, "addIceCandidate"

    move-object/from16 v18, v3

    const-string v3, "ADD_ICE_CANDIDATE"

    invoke-direct {v0, v3, v1, v2}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ll53/a;

    const/16 v2, 0x10

    const-string v3, "changePublishQuality"

    move-object/from16 v19, v0

    const-string v0, "CHANGE_PUBLISH_QUALITY"

    invoke-direct {v1, v0, v2, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Ll53/a;

    const/16 v2, 0x11

    const-string v3, "changePublishOptions"

    move-object/from16 v20, v1

    const-string v1, "CHANGE_PUBLISH_OPTIONS"

    invoke-direct {v0, v1, v2, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ll53/a;

    const/16 v2, 0x12

    const-string v3, "goAway"

    move-object/from16 v21, v0

    const-string v0, "GO_AWAY"

    invoke-direct {v1, v0, v2, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Ll53/a;

    const/16 v2, 0x13

    const-string v3, "error"

    move-object/from16 v22, v1

    const-string v1, "SFU_ERROR"

    invoke-direct {v0, v1, v2, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ll53/a;

    const/16 v2, 0x14

    const-string v3, "callEnded"

    move-object/from16 v23, v0

    const-string v0, "CALL_ENDED"

    invoke-direct {v1, v0, v2, v3}, Ll53/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v17, v20

    move-object/from16 v18, v21

    move-object/from16 v20, v23

    move-object/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v22

    filled-new-array/range {v1 .. v21}, [Ll53/a;

    move-result-object v0

    sput-object v0, Ll53/a;->x:[Ll53/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ll53/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll53/a;
    .locals 1

    const-class v0, Ll53/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll53/a;

    return-object p0
.end method

.method public static values()[Ll53/a;
    .locals 1

    sget-object v0, Ll53/a;->x:[Ll53/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll53/a;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll53/a;->w:Ljava/lang/String;

    return-object v0
.end method
