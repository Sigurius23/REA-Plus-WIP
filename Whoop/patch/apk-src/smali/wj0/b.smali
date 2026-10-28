.class public final enum Lwj0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwj0/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwj0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lwj0/b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "",
        "byteValue",
        "B",
        "getByteValue",
        "()B",
        "Companion",
        "a",
        "FAILURE",
        "SUCCESS",
        "PENDING",
        "UNSUPPORTED",
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

.field private static final synthetic $VALUES:[Lwj0/b;

.field public static final Companion:Lwj0/b$a;

.field public static final enum FAILURE:Lwj0/b;

.field public static final enum PENDING:Lwj0/b;

.field public static final enum SUCCESS:Lwj0/b;

.field public static final enum UNSUPPORTED:Lwj0/b;


# instance fields
.field private final byteValue:B


# direct methods
.method private static final synthetic $values()[Lwj0/b;
    .locals 4

    sget-object v0, Lwj0/b;->FAILURE:Lwj0/b;

    sget-object v1, Lwj0/b;->SUCCESS:Lwj0/b;

    sget-object v2, Lwj0/b;->PENDING:Lwj0/b;

    sget-object v3, Lwj0/b;->UNSUPPORTED:Lwj0/b;

    filled-new-array {v0, v1, v2, v3}, [Lwj0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwj0/b;

    const-string v1, "FAILURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lwj0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwj0/b;->FAILURE:Lwj0/b;

    new-instance v0, Lwj0/b;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lwj0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwj0/b;->SUCCESS:Lwj0/b;

    new-instance v0, Lwj0/b;

    const-string v1, "PENDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lwj0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwj0/b;->PENDING:Lwj0/b;

    new-instance v0, Lwj0/b;

    const-string v1, "UNSUPPORTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lwj0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwj0/b;->UNSUPPORTED:Lwj0/b;

    invoke-static {}, Lwj0/b;->$values()[Lwj0/b;

    move-result-object v0

    sput-object v0, Lwj0/b;->$VALUES:[Lwj0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lwj0/b;->$ENTRIES:Lt83/a;

    new-instance v0, Lwj0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwj0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwj0/b;->Companion:Lwj0/b$a;

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

    int-to-byte p1, p3

    iput-byte p1, p0, Lwj0/b;->byteValue:B

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

    sget-object v0, Lwj0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwj0/b;
    .locals 1

    const-class v0, Lwj0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwj0/b;

    return-object p0
.end method

.method public static values()[Lwj0/b;
    .locals 1

    sget-object v0, Lwj0/b;->$VALUES:[Lwj0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwj0/b;

    return-object v0
.end method


# virtual methods
.method public final getByteValue()B
    .locals 1

    iget-byte v0, p0, Lwj0/b;->byteValue:B

    return v0
.end method
