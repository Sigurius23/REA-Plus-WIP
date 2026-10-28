.class public final enum Lc31/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc31/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc31/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lc31/d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lc31/c;",
        "toButtonClickType",
        "()Lc31/c;",
        "ERROR",
        "LOADING",
        "FILLED",
        "PROGRESS",
        "design_release"
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

.field private static final synthetic $VALUES:[Lc31/d;

.field public static final enum ERROR:Lc31/d;

.field public static final enum FILLED:Lc31/d;

.field public static final enum LOADING:Lc31/d;

.field public static final enum PROGRESS:Lc31/d;


# direct methods
.method private static final synthetic $values()[Lc31/d;
    .locals 4

    sget-object v0, Lc31/d;->ERROR:Lc31/d;

    sget-object v1, Lc31/d;->LOADING:Lc31/d;

    sget-object v2, Lc31/d;->FILLED:Lc31/d;

    sget-object v3, Lc31/d;->PROGRESS:Lc31/d;

    filled-new-array {v0, v1, v2, v3}, [Lc31/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc31/d;

    const-string v1, "ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc31/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/d;->ERROR:Lc31/d;

    new-instance v0, Lc31/d;

    const-string v1, "LOADING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc31/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/d;->LOADING:Lc31/d;

    new-instance v0, Lc31/d;

    const-string v1, "FILLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc31/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/d;->FILLED:Lc31/d;

    new-instance v0, Lc31/d;

    const-string v1, "PROGRESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc31/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/d;->PROGRESS:Lc31/d;

    invoke-static {}, Lc31/d;->$values()[Lc31/d;

    move-result-object v0

    sput-object v0, Lc31/d;->$VALUES:[Lc31/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lc31/d;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lc31/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc31/d;
    .locals 1

    const-class v0, Lc31/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc31/d;

    return-object p0
.end method

.method public static values()[Lc31/d;
    .locals 1

    sget-object v0, Lc31/d;->$VALUES:[Lc31/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc31/d;

    return-object v0
.end method


# virtual methods
.method public final toButtonClickType()Lc31/c;
    .locals 2

    sget-object v0, Lc31/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    sget-object v0, Lc31/c;->PROGRESS_BUTTON:Lc31/c;

    return-object v0

    :cond_0
    sget-object v0, Lc31/c;->PROGRESS_BUTTON:Lc31/c;

    return-object v0

    :cond_1
    sget-object v0, Lc31/c;->FILLED_BUTTON:Lc31/c;

    return-object v0

    :cond_2
    sget-object v0, Lc31/c;->ERROR_BUTTON:Lc31/c;

    return-object v0
.end method
