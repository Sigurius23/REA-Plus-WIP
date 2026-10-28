.class public final enum Lzj0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzj0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\u000b\u0008\u0080\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lzj0/a;",
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
        "SET",
        "NOT_SET",
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

.field private static final synthetic $VALUES:[Lzj0/a;

.field public static final Companion:Lzj0/a$a;

.field public static final enum NOT_SET:Lzj0/a;

.field public static final enum SET:Lzj0/a;


# instance fields
.field private final byteValue:B


# direct methods
.method private static final synthetic $values()[Lzj0/a;
    .locals 2

    sget-object v0, Lzj0/a;->SET:Lzj0/a;

    sget-object v1, Lzj0/a;->NOT_SET:Lzj0/a;

    filled-new-array {v0, v1}, [Lzj0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzj0/a;

    const-string v1, "SET"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lzj0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lzj0/a;->SET:Lzj0/a;

    new-instance v0, Lzj0/a;

    const-string v1, "NOT_SET"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lzj0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lzj0/a;->NOT_SET:Lzj0/a;

    invoke-static {}, Lzj0/a;->$values()[Lzj0/a;

    move-result-object v0

    sput-object v0, Lzj0/a;->$VALUES:[Lzj0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lzj0/a;->$ENTRIES:Lt83/a;

    new-instance v0, Lzj0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/a;->Companion:Lzj0/a$a;

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

    iput-byte p3, p0, Lzj0/a;->byteValue:B

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

    sget-object v0, Lzj0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzj0/a;
    .locals 1

    const-class v0, Lzj0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzj0/a;

    return-object p0
.end method

.method public static values()[Lzj0/a;
    .locals 1

    sget-object v0, Lzj0/a;->$VALUES:[Lzj0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzj0/a;

    return-object v0
.end method


# virtual methods
.method public final getByteValue()B
    .locals 1

    iget-byte v0, p0, Lzj0/a;->byteValue:B

    return v0
.end method
