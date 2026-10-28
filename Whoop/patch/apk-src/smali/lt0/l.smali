.class public final enum Llt0/l;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Llt0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt0/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llt0/l;",
        ">;",
        "Llt0/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0005\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000ej\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Llt0/l;",
        "Llt0/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "",
        "byteValue",
        "B",
        "getByteValue",
        "()B",
        "Companion",
        "a",
        "PUFFIN_GET_HELLO",
        "PUFFIN_START_FW_LOAD",
        "PUFFIN_LOAD_FW_DATA",
        "PUFFIN_PROCESS_FW",
        "HISTORICAL_PULL_ABORT",
        "SEND_HISTORICAL_DATA",
        "HISTORICAL_PULL_RESULT",
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

.field private static final synthetic $VALUES:[Llt0/l;

.field public static final Companion:Llt0/l$a;

.field public static final enum HISTORICAL_PULL_ABORT:Llt0/l;

.field public static final enum HISTORICAL_PULL_RESULT:Llt0/l;

.field public static final enum PUFFIN_GET_HELLO:Llt0/l;

.field public static final enum PUFFIN_LOAD_FW_DATA:Llt0/l;

.field public static final enum PUFFIN_PROCESS_FW:Llt0/l;

.field public static final enum PUFFIN_START_FW_LOAD:Llt0/l;

.field public static final enum SEND_HISTORICAL_DATA:Llt0/l;


# instance fields
.field private final byteValue:B

.field private final value:I


# direct methods
.method private static final synthetic $values()[Llt0/l;
    .locals 7

    sget-object v0, Llt0/l;->PUFFIN_GET_HELLO:Llt0/l;

    sget-object v1, Llt0/l;->PUFFIN_START_FW_LOAD:Llt0/l;

    sget-object v2, Llt0/l;->PUFFIN_LOAD_FW_DATA:Llt0/l;

    sget-object v3, Llt0/l;->PUFFIN_PROCESS_FW:Llt0/l;

    sget-object v4, Llt0/l;->HISTORICAL_PULL_ABORT:Llt0/l;

    sget-object v5, Llt0/l;->SEND_HISTORICAL_DATA:Llt0/l;

    sget-object v6, Llt0/l;->HISTORICAL_PULL_RESULT:Llt0/l;

    filled-new-array/range {v0 .. v6}, [Llt0/l;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Llt0/l;

    const-string v1, "PUFFIN_GET_HELLO"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->PUFFIN_GET_HELLO:Llt0/l;

    new-instance v0, Llt0/l;

    const-string v1, "PUFFIN_START_FW_LOAD"

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v4}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->PUFFIN_START_FW_LOAD:Llt0/l;

    new-instance v0, Llt0/l;

    const-string v1, "PUFFIN_LOAD_FW_DATA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->PUFFIN_LOAD_FW_DATA:Llt0/l;

    new-instance v0, Llt0/l;

    const-string v1, "PUFFIN_PROCESS_FW"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v4, v3}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->PUFFIN_PROCESS_FW:Llt0/l;

    new-instance v0, Llt0/l;

    const-string v1, "HISTORICAL_PULL_ABORT"

    const/16 v4, 0x14

    invoke-direct {v0, v1, v2, v4}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->HISTORICAL_PULL_ABORT:Llt0/l;

    new-instance v0, Llt0/l;

    const/4 v1, 0x5

    const/16 v2, 0x16

    const-string v4, "SEND_HISTORICAL_DATA"

    invoke-direct {v0, v4, v1, v2}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->SEND_HISTORICAL_DATA:Llt0/l;

    new-instance v0, Llt0/l;

    const-string v1, "HISTORICAL_PULL_RESULT"

    const/16 v2, 0x17

    invoke-direct {v0, v1, v3, v2}, Llt0/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llt0/l;->HISTORICAL_PULL_RESULT:Llt0/l;

    invoke-static {}, Llt0/l;->$values()[Llt0/l;

    move-result-object v0

    sput-object v0, Llt0/l;->$VALUES:[Llt0/l;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llt0/l;->$ENTRIES:Lt83/a;

    new-instance v0, Llt0/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llt0/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llt0/l;->Companion:Llt0/l$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Llt0/l;->value:I

    invoke-virtual {p0}, Llt0/l;->getValue()I

    move-result p1

    int-to-byte p1, p1

    iput-byte p1, p0, Llt0/l;->byteValue:B

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

    sget-object v0, Llt0/l;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llt0/l;
    .locals 1

    const-class v0, Llt0/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llt0/l;

    return-object p0
.end method

.method public static values()[Llt0/l;
    .locals 1

    sget-object v0, Llt0/l;->$VALUES:[Llt0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llt0/l;

    return-object v0
.end method


# virtual methods
.method public bridge commandName()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Llt0/a;->commandName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getByteValue()B
    .locals 1

    iget-byte v0, p0, Llt0/l;->byteValue:B

    return v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Llt0/l;->value:I

    return v0
.end method
