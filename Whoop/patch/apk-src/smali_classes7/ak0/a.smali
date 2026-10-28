.class public final enum Lak0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lak0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lak0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lak0/a;",
        "",
        "",
        "byteValue",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getByteValue",
        "()B",
        "Companion",
        "a",
        "NOT_SET",
        "SET",
        "ERROR",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Lak0/a;

.field public static final Companion:Lak0/a$a;

.field public static final enum ERROR:Lak0/a;

.field public static final enum NOT_SET:Lak0/a;

.field public static final enum SET:Lak0/a;


# instance fields
.field private final byteValue:B


# direct methods
.method private static final synthetic $values()[Lak0/a;
    .locals 3

    sget-object v0, Lak0/a;->NOT_SET:Lak0/a;

    sget-object v1, Lak0/a;->SET:Lak0/a;

    sget-object v2, Lak0/a;->ERROR:Lak0/a;

    filled-new-array {v0, v1, v2}, [Lak0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lak0/a;

    const-string v1, "NOT_SET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lak0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lak0/a;->NOT_SET:Lak0/a;

    new-instance v0, Lak0/a;

    const-string v1, "SET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lak0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lak0/a;->SET:Lak0/a;

    new-instance v0, Lak0/a;

    const-string v1, "ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lak0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lak0/a;->ERROR:Lak0/a;

    invoke-static {}, Lak0/a;->$values()[Lak0/a;

    move-result-object v0

    sput-object v0, Lak0/a;->$VALUES:[Lak0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lak0/a;->$ENTRIES:Lt83/a;

    new-instance v0, Lak0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lak0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lak0/a;->Companion:Lak0/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lak0/a;->byteValue:B

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

    sget-object v0, Lak0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lak0/a;
    .locals 1

    const-class v0, Lak0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lak0/a;

    return-object p0
.end method

.method public static values()[Lak0/a;
    .locals 1

    sget-object v0, Lak0/a;->$VALUES:[Lak0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lak0/a;

    return-object v0
.end method


# virtual methods
.method public final getByteValue()B
    .locals 1

    iget-byte v0, p0, Lak0/a;->byteValue:B

    return v0
.end method
