.class public final enum Lu33/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lu33/e;

.field public static final enum F:Lu33/e;

.field public static final enum G:Lu33/e;

.field public static final enum H:Lu33/e;

.field public static final enum I:Lu33/e;

.field public static final synthetic J:[Lu33/e;

.field public static final y:Lt9/p;

.field public static final z:Ljava/util/Set;


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v1, Lu33/e;

    const/16 v0, 0x3e8

    const-string v2, "Response is failed. See cause"

    const-string v3, "NETWORK_FAILED"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v0, v2}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v2, Lu33/e;

    const/16 v0, 0x3e9

    const-string v3, "Unable to parse error"

    const-string v4, "PARSER_ERROR"

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5, v0, v3}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v3, Lu33/e;

    const/16 v0, 0x3ea

    const-string v4, "Server closed connection"

    const-string v5, "SOCKET_CLOSED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v0, v4}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lu33/e;->E:Lu33/e;

    new-instance v4, Lu33/e;

    const/16 v0, 0x3eb

    const-string v5, "See stack trace in logs. Intercept error in error handler of setUser"

    const-string v7, "SOCKET_FAILURE"

    const/4 v8, 0x3

    invoke-direct {v4, v7, v8, v0, v5}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lu33/e;->F:Lu33/e;

    new-instance v5, Lu33/e;

    const/16 v0, 0x3ec

    const-string v7, "Unable to parse connection event"

    const-string v8, "CANT_PARSE_CONNECTION_EVENT"

    const/4 v9, 0x4

    invoke-direct {v5, v8, v9, v0, v7}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lu33/e;

    const/16 v7, 0x3ed

    const-string v8, "Unable to parse event"

    const-string v10, "CANT_PARSE_EVENT"

    const/4 v11, 0x5

    invoke-direct {v0, v10, v11, v7, v8}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lu33/e;->G:Lu33/e;

    new-instance v7, Lu33/e;

    const/16 v8, 0x3ee

    const-string v10, "Invalid token"

    const-string v12, "INVALID_TOKEN"

    const/4 v13, 0x6

    invoke-direct {v7, v12, v13, v8, v10}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v8, Lu33/e;

    const/16 v10, 0x3ef

    const-string v12, "No defined token. Check if client.setUser was called and finished"

    const-string v13, "UNDEFINED_TOKEN"

    const/4 v14, 0x7

    invoke-direct {v8, v13, v14, v10, v12}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v10, Lu33/e;

    const/16 v12, 0x3f0

    const-string v13, "Socket event payload either invalid or null"

    const-string v14, "UNABLE_TO_PARSE_SOCKET_EVENT"

    const/16 v15, 0x8

    invoke-direct {v10, v14, v15, v12, v13}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v10, Lu33/e;->H:Lu33/e;

    move-object v12, v10

    new-instance v10, Lu33/e;

    const/16 v13, 0x3f1

    const-string v14, "No error body. See http status code"

    const-string v15, "NO_ERROR_BODY"

    const/16 v6, 0x9

    invoke-direct {v10, v15, v6, v13, v14}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v10, Lu33/e;->I:Lu33/e;

    new-instance v6, Lu33/e;

    const/16 v13, 0xa

    const-string v14, "Validation error, check your credentials"

    const-string v15, "VALIDATION_ERROR"

    invoke-direct {v6, v15, v13, v9, v14}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    move-object v9, v12

    new-instance v12, Lu33/e;

    const/16 v13, 0xb

    const-string v14, "Unauthenticated, problem with authentication"

    const-string v15, "AUTHENTICATION_ERROR"

    invoke-direct {v12, v15, v13, v11, v14}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v13, Lu33/e;

    const-string v14, "Token expired, new one must be requested."

    const-string v15, "TOKEN_EXPIRED"

    const/16 v11, 0xc

    move-object/from16 v18, v0

    const/16 v0, 0x28

    invoke-direct {v13, v15, v11, v0, v14}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v14, Lu33/e;

    const-string v11, "Unauthenticated, token not valid yet"

    const-string v15, "TOKEN_NOT_VALID"

    move/from16 v19, v0

    const/16 v0, 0xd

    move-object/from16 v20, v1

    const/16 v1, 0x29

    invoke-direct {v14, v15, v0, v1, v11}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v15, Lu33/e;

    const-string v0, "Unauthenticated, token date incorrect"

    const-string v11, "TOKEN_DATE_INCORRECT"

    const/16 v1, 0xe

    move-object/from16 v22, v2

    const/16 v2, 0x2a

    invoke-direct {v15, v11, v1, v2, v0}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lu33/e;

    const-string v1, "Unauthenticated, token signature invalid"

    const-string v11, "TOKEN_SIGNATURE_INCORRECT"

    const/16 v2, 0xf

    move-object/from16 v24, v3

    const/16 v3, 0x2b

    invoke-direct {v0, v11, v2, v3, v1}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v1, Lu33/e;

    const/16 v2, 0x10

    const-string v11, "Api key is not found, verify it if it\'s correct or was created."

    const-string v3, "API_KEY_NOT_FOUND"

    move-object/from16 v26, v0

    const/4 v0, 0x2

    invoke-direct {v1, v3, v2, v0, v11}, Lu33/e;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    move-object/from16 v17, v1

    move-object v11, v6

    move-object/from16 v6, v18

    move-object/from16 v1, v20

    move-object/from16 v2, v22

    move-object/from16 v3, v24

    move-object/from16 v16, v26

    const/4 v0, 0x5

    const/16 v21, 0x29

    const/16 v23, 0x2a

    const/16 v25, 0x2b

    filled-new-array/range {v1 .. v17}, [Lu33/e;

    move-result-object v1

    sput-object v1, Lu33/e;->J:[Lu33/e;

    invoke-static {v1}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v1, Lt9/p;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lt9/p;-><init>(I)V

    sput-object v1, Lu33/e;->y:Lt9/p;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lu33/e;->z:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lu33/e;->w:I

    iput-object p4, p0, Lu33/e;->x:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu33/e;
    .locals 1

    const-class v0, Lu33/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu33/e;

    return-object p0
.end method

.method public static values()[Lu33/e;
    .locals 1

    sget-object v0, Lu33/e;->J:[Lu33/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu33/e;

    return-object v0
.end method
