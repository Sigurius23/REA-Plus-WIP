.class public final enum Lek0/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek0/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lek0/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lek0/r;",
        "",
        "",
        "code",
        "",
        "description",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "I",
        "getCode",
        "()I",
        "Ljava/lang/String;",
        "getDescription",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "UNDEFINED",
        "EXPIRED",
        "ERROR",
        "USER_TERMINATED",
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

.field private static final synthetic $VALUES:[Lek0/r;

.field public static final Companion:Lek0/r$a;

.field public static final enum ERROR:Lek0/r;

.field public static final enum EXPIRED:Lek0/r;

.field public static final enum UNDEFINED:Lek0/r;

.field public static final enum USER_TERMINATED:Lek0/r;


# instance fields
.field private final code:I

.field private final description:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lek0/r;
    .locals 4

    sget-object v0, Lek0/r;->UNDEFINED:Lek0/r;

    sget-object v1, Lek0/r;->EXPIRED:Lek0/r;

    sget-object v2, Lek0/r;->ERROR:Lek0/r;

    sget-object v3, Lek0/r;->USER_TERMINATED:Lek0/r;

    filled-new-array {v0, v1, v2, v3}, [Lek0/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lek0/r;

    const/4 v1, -0x1

    const-string v2, "Undefined termination code"

    const-string v3, "UNDEFINED"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lek0/r;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lek0/r;->UNDEFINED:Lek0/r;

    new-instance v0, Lek0/r;

    const-string v1, "Haptics ran full sequence length"

    const-string v2, "EXPIRED"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v4, v1}, Lek0/r;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lek0/r;->EXPIRED:Lek0/r;

    new-instance v0, Lek0/r;

    const-string v1, "Haptics run failed with error"

    const-string v2, "ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v2, v4, v3, v1}, Lek0/r;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lek0/r;->ERROR:Lek0/r;

    new-instance v0, Lek0/r;

    const/4 v1, 0x3

    const-string v2, "Haptics run stopped by user double tap"

    const-string v3, "USER_TERMINATED"

    invoke-direct {v0, v3, v1, v4, v2}, Lek0/r;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lek0/r;->USER_TERMINATED:Lek0/r;

    invoke-static {}, Lek0/r;->$values()[Lek0/r;

    move-result-object v0

    sput-object v0, Lek0/r;->$VALUES:[Lek0/r;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lek0/r;->$ENTRIES:Lt83/a;

    new-instance v0, Lek0/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek0/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lek0/r;->Companion:Lek0/r$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lek0/r;->code:I

    iput-object p4, p0, Lek0/r;->description:Ljava/lang/String;

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

    sget-object v0, Lek0/r;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lek0/r;
    .locals 1

    const-class v0, Lek0/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lek0/r;

    return-object p0
.end method

.method public static values()[Lek0/r;
    .locals 1

    sget-object v0, Lek0/r;->$VALUES:[Lek0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lek0/r;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lek0/r;->code:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lek0/r;->description:Ljava/lang/String;

    return-object v0
.end method
