.class public final enum Lbf/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lbf/a;


# static fields
.field public static final enum E:Lbf/c;

.field public static final enum F:Lbf/c;

.field public static final enum G:Lbf/c;

.field public static final synthetic H:[Lbf/c;

.field public static final enum x:Lbf/c;

.field public static final enum y:Lbf/c;

.field public static final enum z:Lbf/c;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v1, Lbf/c;

    const/4 v0, 0x0

    const-string v2, "B"

    const-string v3, "WAITER"

    invoke-direct {v1, v3, v0, v2}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lbf/c;

    const/4 v0, 0x1

    const-string v3, "C"

    const-string v4, "PAGINATOR"

    invoke-direct {v2, v4, v0, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lbf/c;

    const/4 v0, 0x2

    const-string v4, "E"

    const-string v5, "RETRY_MODE_STANDARD"

    invoke-direct {v3, v5, v0, v4}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lbf/c;->x:Lbf/c;

    new-instance v4, Lbf/c;

    const/4 v0, 0x3

    const-string v5, "F"

    const-string v6, "RETRY_MODE_ADAPTIVE"

    invoke-direct {v4, v6, v0, v5}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lbf/c;->y:Lbf/c;

    new-instance v5, Lbf/c;

    const/4 v0, 0x4

    const-string v6, "L"

    const-string v7, "GZIP_REQUEST_COMPRESSION"

    invoke-direct {v5, v7, v0, v6}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lbf/c;

    const/4 v0, 0x5

    const-string v7, "M"

    const-string v8, "PROTOCOL_RPC_V2_CBOR"

    invoke-direct {v6, v8, v0, v7}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lbf/c;

    const/4 v0, 0x6

    const-string v8, "N"

    const-string v9, "SERVICE_ENDPOINT_OVERRIDE"

    invoke-direct {v7, v9, v0, v8}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lbf/c;->z:Lbf/c;

    new-instance v8, Lbf/c;

    const/4 v0, 0x7

    const-string v9, "O"

    const-string v10, "ACCOUNT_ID_BASED_ENDPOINT"

    invoke-direct {v8, v10, v0, v9}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lbf/c;->E:Lbf/c;

    new-instance v9, Lbf/c;

    const/16 v0, 0x8

    const-string v10, "P"

    const-string v11, "ACCOUNT_ID_MODE_PREFERRED"

    invoke-direct {v9, v11, v0, v10}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lbf/c;

    const/16 v0, 0x9

    const-string v11, "Q"

    const-string v12, "ACCOUNT_ID_MODE_DISABLED"

    invoke-direct {v10, v12, v0, v11}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Lbf/c;

    const/16 v0, 0xa

    const-string v12, "R"

    const-string v13, "ACCOUNT_ID_MODE_REQUIRED"

    invoke-direct {v11, v13, v0, v12}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Lbf/c;

    const/16 v0, 0xb

    const-string v13, "S"

    const-string v14, "SIGV4A_SIGNING"

    invoke-direct {v12, v14, v0, v13}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lbf/c;->F:Lbf/c;

    new-instance v13, Lbf/c;

    const/16 v0, 0xc

    const-string v14, "T"

    const-string v15, "RESOLVED_ACCOUNT_ID"

    invoke-direct {v13, v15, v0, v14}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lbf/c;->G:Lbf/c;

    new-instance v14, Lbf/c;

    const/16 v0, 0xd

    const-string v15, "U"

    move-object/from16 v16, v1

    const-string v1, "FLEXIBLE_CHECKSUMS_REQ_CRC32"

    invoke-direct {v14, v1, v0, v15}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v15, Lbf/c;

    const/16 v0, 0xe

    const-string v1, "V"

    move-object/from16 v17, v2

    const-string v2, "FLEXIBLE_CHECKSUMS_REQ_CRC32C"

    invoke-direct {v15, v2, v0, v1}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lbf/c;

    const/16 v1, 0xf

    const-string v2, "X"

    move-object/from16 v18, v3

    const-string v3, "FLEXIBLE_CHECKSUMS_REQ_SHA1"

    invoke-direct {v0, v3, v1, v2}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lbf/c;

    const/16 v2, 0x10

    const-string v3, "Y"

    move-object/from16 v19, v0

    const-string v0, "FLEXIBLE_CHECKSUMS_REQ_SHA256"

    invoke-direct {v1, v0, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lbf/c;

    const/16 v2, 0x11

    const-string v3, "Z"

    move-object/from16 v20, v1

    const-string v1, "FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED"

    invoke-direct {v0, v1, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lbf/c;

    const/16 v2, 0x12

    const-string v3, "a"

    move-object/from16 v21, v0

    const-string v0, "FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED"

    invoke-direct {v1, v0, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lbf/c;

    const/16 v2, 0x13

    const-string v3, "b"

    move-object/from16 v22, v1

    const-string v1, "FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED"

    invoke-direct {v0, v1, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lbf/c;

    const/16 v2, 0x14

    const-string v3, "c"

    move-object/from16 v23, v0

    const-string v0, "FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED"

    invoke-direct {v1, v0, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lbf/c;

    const/16 v2, 0x15

    const-string v3, "3"

    move-object/from16 v24, v1

    const-string v1, "BEARER_SERVICE_ENV_VARS"

    invoke-direct {v0, v1, v2, v3}, Lbf/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v16, v19

    move-object/from16 v17, v20

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v20, v23

    move-object/from16 v21, v24

    move-object/from16 v22, v0

    filled-new-array/range {v1 .. v22}, [Lbf/c;

    move-result-object v0

    sput-object v0, Lbf/c;->H:[Lbf/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbf/c;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbf/c;
    .locals 1

    const-class v0, Lbf/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbf/c;

    return-object p0
.end method

.method public static values()[Lbf/c;
    .locals 1

    sget-object v0, Lbf/c;->H:[Lbf/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbf/c;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/c;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/c;->w:Ljava/lang/String;

    return-object v0
.end method
