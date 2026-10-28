.class public final enum Lr30/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lr30/i;

.field public static final enum y:Lr30/i;

.field public static final enum z:Lr30/i;


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lr30/i;

    const/16 v1, 0x65

    const-string v2, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"

    const-string v3, "InvalidMessageReceived"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v1, Lr30/i;

    const/16 v2, 0x66

    const-string v3, "Message Version Number received is not valid for the receiving component."

    const-string v4, "UnsupportedMessageVersion"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v2, Lr30/i;

    const/16 v3, 0xc9

    const-string v4, "A message element required as defined in Table A.1 is missing from the message."

    const-string v5, "RequiredDataElementMissing"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3, v4}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v3, Lr30/i;

    const/16 v4, 0xca

    const-string v5, "Critical message extension not recognised."

    const-string v6, "UnrecognizedCriticalMessageExtensions"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4, v5}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lr30/i;->y:Lr30/i;

    new-instance v4, Lr30/i;

    const/16 v5, 0xcb

    const-string v6, "Data element not in the required format or value is invalid as defined in Table A.1"

    const-string v7, "InvalidDataElementFormat"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v8, v5, v6}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v5, Lr30/i;

    const/16 v6, 0x12d

    const-string v7, "Transaction ID received is not valid for the receiving component."

    const-string v8, "InvalidTransactionId"

    const/4 v9, 0x5

    invoke-direct {v5, v8, v9, v6, v7}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v6, Lr30/i;

    const/16 v7, 0x12e

    const-string v8, "Data could not be decrypted by the receiving system due to technical or other reason."

    const-string v9, "DataDecryptionFailure"

    const/4 v10, 0x6

    invoke-direct {v6, v9, v10, v7, v8}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v6, Lr30/i;->z:Lr30/i;

    new-instance v7, Lr30/i;

    const/16 v8, 0x192

    const-string v9, "Transaction timed-out."

    const-string v10, "TransactionTimedout"

    const/4 v11, 0x7

    invoke-direct {v7, v10, v11, v8, v9}, Lr30/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    filled-new-array/range {v0 .. v7}, [Lr30/i;

    move-result-object v0

    sput-object v0, Lr30/i;->E:[Lr30/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr30/i;->w:I

    iput-object p4, p0, Lr30/i;->x:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr30/i;
    .locals 1

    const-class v0, Lr30/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr30/i;

    return-object p0
.end method

.method public static values()[Lr30/i;
    .locals 1

    sget-object v0, Lr30/i;->E:[Lr30/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr30/i;

    return-object v0
.end method
