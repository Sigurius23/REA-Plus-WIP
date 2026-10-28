.class public final enum Llt0/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llt0/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llt0/n;",
        "",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getTag",
        "()Ljava/lang/String;",
        "SUCCESS",
        "FAIL_CRC8",
        "FAIL_CRC16",
        "FAIL_CRC32",
        "FAIL_FRAME_INVALID",
        "FAIL_TOO_SHORT",
        "FAIL_UNALIGNED",
        "FAIL_NO_PAYLOAD",
        "FAIL_OTHER",
        "connectivity-core_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Llt0/n;

.field public static final enum FAIL_CRC16:Llt0/n;

.field public static final enum FAIL_CRC32:Llt0/n;

.field public static final enum FAIL_CRC8:Llt0/n;

.field public static final enum FAIL_FRAME_INVALID:Llt0/n;

.field public static final enum FAIL_NO_PAYLOAD:Llt0/n;

.field public static final enum FAIL_OTHER:Llt0/n;

.field public static final enum FAIL_TOO_SHORT:Llt0/n;

.field public static final enum FAIL_UNALIGNED:Llt0/n;

.field public static final enum SUCCESS:Llt0/n;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Llt0/n;
    .locals 9

    sget-object v0, Llt0/n;->SUCCESS:Llt0/n;

    sget-object v1, Llt0/n;->FAIL_CRC8:Llt0/n;

    sget-object v2, Llt0/n;->FAIL_CRC16:Llt0/n;

    sget-object v3, Llt0/n;->FAIL_CRC32:Llt0/n;

    sget-object v4, Llt0/n;->FAIL_FRAME_INVALID:Llt0/n;

    sget-object v5, Llt0/n;->FAIL_TOO_SHORT:Llt0/n;

    sget-object v6, Llt0/n;->FAIL_UNALIGNED:Llt0/n;

    sget-object v7, Llt0/n;->FAIL_NO_PAYLOAD:Llt0/n;

    sget-object v8, Llt0/n;->FAIL_OTHER:Llt0/n;

    filled-new-array/range {v0 .. v8}, [Llt0/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llt0/n;

    const/4 v1, 0x0

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->SUCCESS:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x1

    const-string v2, "crc8"

    const-string v3, "FAIL_CRC8"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_CRC8:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x2

    const-string v2, "crc16"

    const-string v3, "FAIL_CRC16"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_CRC16:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x3

    const-string v2, "crc32"

    const-string v3, "FAIL_CRC32"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_CRC32:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x4

    const-string v2, "frame_invalid"

    const-string v3, "FAIL_FRAME_INVALID"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_FRAME_INVALID:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x5

    const-string v2, "too_short"

    const-string v3, "FAIL_TOO_SHORT"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_TOO_SHORT:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x6

    const-string v2, "unaligned"

    const-string v3, "FAIL_UNALIGNED"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_UNALIGNED:Llt0/n;

    new-instance v0, Llt0/n;

    const/4 v1, 0x7

    const-string v2, "no_payload"

    const-string v3, "FAIL_NO_PAYLOAD"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_NO_PAYLOAD:Llt0/n;

    new-instance v0, Llt0/n;

    const/16 v1, 0x8

    const-string v2, "other"

    const-string v3, "FAIL_OTHER"

    invoke-direct {v0, v3, v1, v2}, Llt0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llt0/n;->FAIL_OTHER:Llt0/n;

    invoke-static {}, Llt0/n;->$values()[Llt0/n;

    move-result-object v0

    sput-object v0, Llt0/n;->$VALUES:[Llt0/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llt0/n;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Llt0/n;->tag:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Llt0/n;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llt0/n;
    .locals 1

    const-class v0, Llt0/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llt0/n;

    return-object p0
.end method

.method public static values()[Llt0/n;
    .locals 1

    sget-object v0, Llt0/n;->$VALUES:[Llt0/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llt0/n;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llt0/n;->tag:Ljava/lang/String;

    return-object v0
.end method
