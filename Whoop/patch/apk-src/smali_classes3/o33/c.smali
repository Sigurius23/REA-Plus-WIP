.class public final enum Lo33/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final x:Lng3/n;

.field public static final enum y:Lo33/c;

.field public static final synthetic z:[Lo33/c;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lo33/c;

    const/4 v1, 0x0

    const-string v2, "certificate"

    const-string v3, "CERTIFICATE"

    invoke-direct {v0, v3, v1, v2}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lo33/c;

    const/4 v2, 0x1

    const-string v3, "codec"

    const-string v4, "CODEC"

    invoke-direct {v1, v4, v2, v3}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lo33/c;

    const/4 v3, 0x2

    const-string v4, "candidate-pair"

    const-string v5, "CANDIDATE_PAIR"

    invoke-direct {v2, v5, v3, v4}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lo33/c;

    const/4 v4, 0x3

    const-string v5, "remote-candidate"

    const-string v6, "REMOTE_CANDIDATE"

    invoke-direct {v3, v6, v4, v5}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lo33/c;

    const/4 v5, 0x4

    const-string v6, "local-candidate"

    const-string v7, "LOCAL_CANDIDATE"

    invoke-direct {v4, v7, v5, v6}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lo33/c;

    const/4 v6, 0x5

    const-string v7, "remote-inbound-rtp"

    const-string v8, "REMOTE_INBOUND_RTP"

    invoke-direct {v5, v8, v6, v7}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lo33/c;

    const/4 v7, 0x6

    const-string v8, "remote-outbound-rtp"

    const-string v9, "REMOTE_OUTBOUND_RTP"

    invoke-direct {v6, v9, v7, v8}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lo33/c;

    const/4 v8, 0x7

    const-string v9, "inbound-rtp"

    const-string v10, "INBOUND_RTP"

    invoke-direct {v7, v10, v8, v9}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lo33/c;

    const/16 v9, 0x8

    const-string v10, "outbound-rtp"

    const-string v11, "OUTBOUND_RTP"

    invoke-direct {v8, v11, v9, v10}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v9, Lo33/c;

    const/16 v10, 0x9

    const-string v11, "track"

    const-string v12, "TRACK"

    invoke-direct {v9, v12, v10, v11}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lo33/c;

    const/16 v11, 0xa

    const-string v12, "media-source"

    const-string v13, "MEDIA_SOURCE"

    invoke-direct {v10, v13, v11, v12}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Lo33/c;

    const/16 v12, 0xb

    const-string v13, "stream"

    const-string v14, "STREAM"

    invoke-direct {v11, v14, v12, v13}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Lo33/c;

    const/16 v13, 0xc

    const-string v14, "peer-connection"

    const-string v15, "PEER_CONNECTION"

    invoke-direct {v12, v15, v13, v14}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v13, Lo33/c;

    const/16 v14, 0xd

    const-string v15, "transport"

    move-object/from16 v16, v0

    const-string v0, "TRANSPORT"

    invoke-direct {v13, v0, v14, v15}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v14, Lo33/c;

    const/16 v0, 0xe

    const-string v15, "unknown"

    move-object/from16 v17, v1

    const-string v1, "UNKNOWN"

    invoke-direct {v14, v1, v0, v15}, Lo33/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lo33/c;->y:Lo33/c;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    filled-new-array/range {v0 .. v14}, [Lo33/c;

    move-result-object v0

    sput-object v0, Lo33/c;->z:[Lo33/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lng3/n;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lo33/c;->x:Lng3/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lo33/c;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo33/c;
    .locals 1

    const-class v0, Lo33/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo33/c;

    return-object p0
.end method

.method public static values()[Lo33/c;
    .locals 1

    sget-object v0, Lo33/c;->z:[Lo33/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo33/c;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo33/c;->w:Ljava/lang/String;

    return-object v0
.end method
